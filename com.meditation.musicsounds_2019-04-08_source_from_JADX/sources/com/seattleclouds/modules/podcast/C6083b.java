package com.seattleclouds.modules.podcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0456d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.podcast.download.PodcastDownloadService;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.p160e.C5339e;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.podcast.b */
public class C6083b extends C6671x {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public ArrayList<PodcastItem> f21595ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C2422c f21596af;

    /* renamed from: ag */
    private C0456d f21597ag;

    /* renamed from: ah */
    private BroadcastReceiver f21598ah = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6083b.this.m29749e();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public final BaseAdapter f21599ai = new BaseAdapter() {
        /* renamed from: a */
        public PodcastItem getItem(int i) {
            return (PodcastItem) C6083b.this.f21595ae.get(i);
        }

        public int getCount() {
            return C6083b.this.f21595ae.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6087a aVar;
            int i2 = 0;
            if (view == null) {
                view = C6083b.this.mo1295i((Bundle) null).inflate(C5460i.podcast_list_item, viewGroup, false);
                aVar = new C6087a();
                aVar.f21604a = (TextView) view.findViewById(C5458g.textView);
                aVar.f21605b = (TextView) view.findViewById(C5458g.authorTextView);
                aVar.f21606c = (TextView) view.findViewById(C5458g.detailTextView);
                aVar.f21607d = (TextView) view.findViewById(C5458g.dateTextView);
                aVar.f21608e = (ImageView) view.findViewById(C5458g.imageView);
                aVar.f21609f = (ImageView) view.findViewById(C5458g.downloadedImageView);
                aVar.f21610g = (ImageView) view.findViewById(C5458g.warningImageView);
                aVar.f21611h = (ImageView) view.findViewById(C5458g.rightArrowImageView);
                ColorStateList a = C5339e.m26796a(C6083b.this.mo1318s(), C6594an.m31917a(C6083b.this.mo1318s(), C5453b.primaryTextColor));
                C5334b.m26761a(a, aVar.f21609f);
                C5334b.m26761a(a, aVar.f21610g);
                C5334b.m26761a(a, aVar.f21611h);
                view.setTag(aVar);
            } else {
                aVar = (C6087a) view.getTag();
            }
            PodcastItem a2 = getItem(i);
            aVar.f21604a.setText(a2.title);
            aVar.f21606c.setVisibility(8);
            if (a2.publishedDate != null) {
                aVar.f21607d.setText(a2.getFormattedDate(C6083b.this.mo1318s()));
                aVar.f21607d.setVisibility(0);
            } else {
                aVar.f21607d.setVisibility(8);
            }
            aVar.f21605b.setText(a2.author);
            if (a2.getAnyImageUrl() != null) {
                C6083b.this.f21596af.mo8578a((Object) a2.getAnyImageUrl(), aVar.f21608e);
            } else {
                aVar.f21608e.setImageBitmap(null);
            }
            aVar.f21609f.setVisibility(a2.isDownloaded() ? 0 : 4);
            ImageView imageView = aVar.f21610g;
            if (a2.error == null) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            return view;
        }
    };

    /* renamed from: i */
    private PodcastCategory f21600i;

    /* renamed from: com.seattleclouds.modules.podcast.b$a */
    static class C6087a {

        /* renamed from: a */
        TextView f21604a;

        /* renamed from: b */
        TextView f21605b;

        /* renamed from: c */
        TextView f21606c;

        /* renamed from: d */
        TextView f21607d;

        /* renamed from: e */
        ImageView f21608e;

        /* renamed from: f */
        ImageView f21609f;

        /* renamed from: g */
        ImageView f21610g;

        /* renamed from: h */
        ImageView f21611h;

        C6087a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m29749e() {
        Iterator it = this.f21595ae.iterator();
        while (it.hasNext()) {
            ((PodcastItem) it.next()).updateMediaUri();
        }
        this.f21599ai.notifyDataSetChanged();
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21596af != null) {
            this.f21596af.mo8585i();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21600i = (PodcastCategory) m.getSerializable("ARG_CATEGORY_ITEM");
            if (this.f21600i != null) {
                this.f21595ae = this.f21600i.items;
            }
        }
        if (this.f21595ae == null) {
            this.f21595ae = new ArrayList<>();
        }
        if (this.f21600i != null) {
            mo20720b(this.f21600i.title);
        }
        this.f21597ag = C0456d.m2097a((Context) mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21596af = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21596af.mo8580b(C5457f.cover_placeholder_small);
        this.f21596af.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        int[] iArr = {0, -65536, 0};
        ListView b = mo1450b();
        b.setDivider(new GradientDrawable(Orientation.RIGHT_LEFT, iArr));
        b.setSelector(17170445);
        b.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                PodcastItem podcastItem = (PodcastItem) C6083b.this.f21599ai.getItem(i);
                Bundle bundle = new Bundle();
                bundle.putSerializable("ARG_PODCAST_ITEM", podcastItem);
                App.m25620a(new FragmentInfo(C6132e.class.getName(), bundle), (Fragment) C6083b.this);
            }
        });
        mo1691a((ListAdapter) this.f21599ai);
        this.f21597ag.mo1844a(this.f21598ah, new IntentFilter(PodcastDownloadService.m29810a((Context) mo1318s())));
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z && this.f21596af != null) {
            this.f21596af.mo8584h();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f21597ag.mo1843a(this.f21598ah);
        super.mo1296i();
    }
}
