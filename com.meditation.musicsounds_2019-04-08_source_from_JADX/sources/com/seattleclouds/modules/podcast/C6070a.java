package com.seattleclouds.modules.podcast;

import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bumptech.glide.C1186c;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6352p;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.ads.AdNativeManager;
import com.seattleclouds.util.C6619m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.podcast.a */
public final class C6070a extends C0926a<C6071a> {

    /* renamed from: b */
    private static int f21545b = 0;

    /* renamed from: c */
    private static int f21546c = 10000;

    /* renamed from: a */
    protected WeakReference<C2422c> f21547a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WeakReference<Fragment> f21548d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArrayList<PodcastListItem> f21549e;

    /* renamed from: f */
    private int f21550f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Object f21551g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f21552h = null;

    /* renamed from: com.seattleclouds.modules.podcast.a$a */
    class C6071a extends C0958w {

        /* renamed from: n */
        TextView f21553n;

        /* renamed from: o */
        TextView f21554o;

        /* renamed from: p */
        TextView f21555p;

        /* renamed from: q */
        TextView f21556q;

        /* renamed from: r */
        ImageView f21557r;

        /* renamed from: s */
        ImageView f21558s;

        /* renamed from: t */
        ImageView f21559t;

        /* renamed from: u */
        LinearLayout f21560u;

        /* renamed from: v */
        ImageView f21561v;

        C6071a(View view) {
            super(view);
            this.f21553n = (TextView) view.findViewById(C5458g.textView);
            this.f21554o = (TextView) view.findViewById(C5458g.detailTextView);
            this.f21555p = (TextView) view.findViewById(C5458g.dateTextView);
            this.f21556q = (TextView) view.findViewById(C5458g.authorTextView);
            this.f21557r = (ImageView) view.findViewById(C5458g.imageView);
            this.f21558s = (ImageView) view.findViewById(C5458g.downloadedImageView);
            this.f21559t = (ImageView) view.findViewById(C5458g.warningImageView);
            this.f21560u = (LinearLayout) view.findViewById(C5458g.linear_layout_ads);
            this.f21561v = (ImageView) view.findViewById(C5458g.imageView);
            if (this.f21560u != null) {
                this.f21560u.setLayoutParams(new LayoutParams(-1, C6619m.m32014a(((Fragment) C6070a.this.f21548d.get()).mo1318s(), (float) App.f18501c.mo16931aa())));
            } else {
                this.f3157a.setOnClickListener(new OnClickListener(C6070a.this) {
                    public void onClick(View view) {
                        FragmentInfo fragmentInfo;
                        int e = C6071a.this.mo4585e();
                        if (e != -1) {
                            if (C6070a.this.f21552h == null || e != 0) {
                                if (C6070a.this.f21552h != null) {
                                    e--;
                                }
                                PodcastListItem podcastListItem = (PodcastListItem) C6070a.this.f21549e.get(AdNativeManager.m26106a(C6070a.this.f21551g, e));
                                if (podcastListItem.f21537b != null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putSerializable("ARG_CATEGORY_ITEM", podcastListItem.f21537b);
                                    fragmentInfo = new FragmentInfo(C6083b.class.getName(), bundle);
                                } else {
                                    if (podcastListItem.f21536a != null) {
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putSerializable("ARG_PODCAST_ITEM", podcastListItem.f21536a);
                                        fragmentInfo = new FragmentInfo(C6132e.class.getName(), bundle2);
                                    }
                                }
                                App.m25620a(fragmentInfo, (Fragment) C6070a.this.f21548d.get());
                            }
                        }
                    }
                });
            }
        }
    }

    public C6070a(Fragment fragment, C2422c cVar, int i, boolean z, ArrayList<PodcastListItem> arrayList, String str) {
        this.f21549e = arrayList;
        this.f21548d = new WeakReference<>(fragment);
        this.f21547a = new WeakReference<>(cVar);
        this.f21550f = i;
        this.f21552h = str;
        if (z) {
            this.f21551g = AdNativeManager.m26110a(((Fragment) this.f21548d.get()).mo1318s(), this, App.f18501c.mo16931aa(), this.f21550f);
        }
    }

    /* renamed from: a */
    public int mo342a() {
        int b = AdNativeManager.m26113b(this.f21551g, this.f21549e.size());
        return this.f21552h != null ? b + 1 : b;
    }

    /* renamed from: a */
    public C6071a mo353b(ViewGroup viewGroup, int i) {
        LayoutInflater from;
        int i2;
        if (i == f21545b) {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = C5460i.podcast_list_item;
        } else if (i == f21546c) {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = C5460i.podcast_header_view;
        } else {
            from = LayoutInflater.from(viewGroup.getContext());
            i2 = C5460i.list_item_ads;
        }
        return new C6071a(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void mo350a(C6071a aVar, int i) {
        if (aVar.mo4588h() == f21545b) {
            if (this.f21552h != null) {
                i--;
            }
            PodcastListItem podcastListItem = (PodcastListItem) this.f21549e.get(AdNativeManager.m26106a(this.f21551g, i));
            aVar.f21553n.setText(podcastListItem.f21540e);
            int i2 = 8;
            if (podcastListItem.f21542g == null || podcastListItem.f21542g.length() == 0) {
                aVar.f21554o.setVisibility(8);
            } else {
                aVar.f21554o.setText(podcastListItem.f21542g);
                aVar.f21554o.setVisibility(0);
            }
            aVar.f21555p.setText(podcastListItem.f21543h);
            aVar.f21556q.setText(podcastListItem.f21541f);
            if (podcastListItem.f21544i != null) {
                ((C2422c) this.f21547a.get()).mo8578a((Object) podcastListItem.f21544i, aVar.f21557r);
            } else {
                aVar.f21557r.setImageBitmap(null);
            }
            aVar.f21558s.setVisibility(podcastListItem.f21538c ? 0 : 4);
            ImageView imageView = aVar.f21559t;
            if (podcastListItem.f21539d) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        } else if (aVar.mo4588h() == f21546c) {
            C1186c.m6452a((View) aVar.f21561v).mo5850a(Uri.parse(C6352p.m30857a().mo19794b(this.f21552h)).getPath()).mo5837a(aVar.f21561v);
        } else {
            aVar.f21560u.removeAllViews();
            aVar.f21560u.addView(AdNativeManager.m26107a(this.f21551g, i, mo352b(i)));
        }
    }

    /* renamed from: b */
    public int mo352b(int i) {
        if (this.f21552h != null && i == 0) {
            return f21546c;
        }
        if (this.f21552h == null) {
            int i2 = i + 1;
            if (i2 < this.f21550f) {
                return f21545b;
            }
            if (AdNativeManager.m26112a(this.f21551g)) {
                return i2 % this.f21550f == 0 ? AdNativeManager.f18772a : f21545b;
            }
        } else if (i < this.f21550f) {
            return f21545b;
        } else {
            if (AdNativeManager.m26112a(this.f21551g)) {
                return i % this.f21550f == 0 ? AdNativeManager.f18772a : f21545b;
            }
        }
        return f21545b;
    }
}
