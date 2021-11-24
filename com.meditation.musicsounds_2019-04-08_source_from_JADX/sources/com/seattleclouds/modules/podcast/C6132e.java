package com.seattleclouds.modules.podcast;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.podcast.download.C6130c;
import com.seattleclouds.modules.podcast.download.PodcastDownloadService;
import com.seattleclouds.modules.podcast.download.PodcastDownloadService.C6105b;
import com.seattleclouds.modules.podcast.download.PodcastDownloadsActivity;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.p160e.C5339e;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6619m;

/* renamed from: com.seattleclouds.modules.podcast.e */
public class C6132e extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PodcastItem f21739a;

    /* renamed from: b */
    private ImageButton f21740b;

    /* renamed from: c */
    private ImageButton f21741c;

    /* renamed from: d */
    private C2422c f21742d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public PodcastDownloadService f21743e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f21744f;

    /* renamed from: g */
    private final ServiceConnection f21745g = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6132e.this.f21743e = ((C6105b) iBinder).mo19256a();
            C6132e.this.m29919b();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6132e.this.f21743e = null;
            C6132e.this.f21744f = false;
            C6132e.this.m29919b();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29919b() {
        ImageButton imageButton;
        int i = 8;
        if (this.f21743e == null || this.f21739a.isDownloaded() || !this.f21743e.mo19237c(this.f21739a)) {
            imageButton = this.f21740b;
        } else {
            imageButton = this.f21740b;
            i = 0;
        }
        imageButton.setVisibility(i);
        mo20292ay();
    }

    /* renamed from: c */
    private void m29922c() {
        mo1318s().bindService(new Intent(mo1318s(), PodcastDownloadService.class), this.f21745g, 1);
        this.f21744f = true;
    }

    /* renamed from: d */
    private void m29923d() {
        if (this.f21744f) {
            mo1318s().unbindService(this.f21745g);
            this.f21744f = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m29925e() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z) {
            C6569aa.m31791a((Fragment) this, 1001, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.podcast_permission_rationale_write_external_storage, C5462k.podcast_write_external_storage_permission_required_toast});
        }
        return !z;
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21742d != null) {
            this.f21742d.mo8585i();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C2422c cVar;
        String anyImageUrl;
        ScrollView scrollView = (ScrollView) layoutInflater.inflate(C5460i.fragment_podcast_item_info, viewGroup, false);
        TextView textView = (TextView) scrollView.findViewById(C5458g.titleTextView);
        TextView textView2 = (TextView) scrollView.findViewById(C5458g.dateTextView);
        TextView textView3 = (TextView) scrollView.findViewById(C5458g.authorTextView);
        TextView textView4 = (TextView) scrollView.findViewById(C5458g.summaryTextView);
        TextView textView5 = (TextView) scrollView.findViewById(C5458g.detailTextView);
        ImageView imageView = (ImageView) scrollView.findViewById(C5458g.imageView);
        FrameLayout frameLayout = (FrameLayout) scrollView.findViewById(C5458g.listenView);
        this.f21740b = (ImageButton) scrollView.findViewById(C5458g.downloadButton);
        this.f21741c = (ImageButton) scrollView.findViewById(C5458g.shareButton);
        C5334b.m26756a(mo20291ax().mo17546c(mo1318s()), (ImageView) this.f21740b);
        C5334b.m26756a(mo20291ax().mo17546c(mo1318s()), (ImageView) this.f21741c);
        ImageView imageView2 = (ImageView) frameLayout.findViewById(C5458g.listenImageView);
        TextView textView6 = (TextView) frameLayout.findViewById(C5458g.listenTextView);
        if (this.f21739a.type.startsWith("video")) {
            textView6.setText(C5462k.podcast_watch_button);
            i = C5457f.ic_podcast_watch_alpha;
        } else {
            i = C5457f.ic_podcast_listen_alpha;
        }
        imageView2.setImageResource(i);
        C5334b.m26756a(mo20291ax().mo17546c(mo1318s()), imageView2);
        textView6.setTextColor(C5339e.m26797b(mo1318s(), mo20291ax().mo17546c(mo1318s())));
        if (this.f21739a == null) {
            scrollView.setVisibility(4);
        } else {
            textView.setText(this.f21739a.title);
            textView5.setText(this.f21739a.category);
            if (this.f21739a.publishedDate != null) {
                textView2.setText(this.f21739a.getFormattedDate(mo1318s()));
            } else {
                textView2.setVisibility(8);
            }
            textView3.setText(this.f21739a.author);
            if (this.f21739a.summary != null && this.f21739a.summary.length() > 0) {
                textView4.setText(VERSION.SDK_INT >= 24 ? Html.fromHtml(this.f21739a.summary, 0) : Html.fromHtml(this.f21739a.summary));
            }
            if (this.f21739a.getPosterUrl() == null || this.f21739a.getPosterUrl().length() <= 0) {
                if (this.f21739a.getAnyImageUrl() != null) {
                    cVar = this.f21742d;
                    anyImageUrl = this.f21739a.getAnyImageUrl();
                }
                frameLayout.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6139g.m29955a((Activity) C6132e.this.mo1318s(), C6132e.this.f21739a);
                    }
                });
                this.f21740b.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (!C6132e.this.m29925e()) {
                            C6132e.this.f21743e.mo19228a(C6132e.this.f21739a);
                            C6132e.this.m29919b();
                            if (VERSION.SDK_INT >= 21) {
                                C6595ao.m31926a((Context) C6132e.this.mo1318s(), C5462k.podcast_item_download_started);
                            }
                        }
                    }
                });
                this.f21741c.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6139g.m29959b(C6132e.this.mo1318s(), C6132e.this.f21739a);
                    }
                });
                m29919b();
            } else {
                cVar = this.f21742d;
                anyImageUrl = this.f21739a.getPosterUrl();
            }
            cVar.mo8578a((Object) anyImageUrl, imageView);
            frameLayout.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C6139g.m29955a((Activity) C6132e.this.mo1318s(), C6132e.this.f21739a);
                }
            });
            this.f21740b.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (!C6132e.this.m29925e()) {
                        C6132e.this.f21743e.mo19228a(C6132e.this.f21739a);
                        C6132e.this.m29919b();
                        if (VERSION.SDK_INT >= 21) {
                            C6595ao.m31926a((Context) C6132e.this.mo1318s(), C5462k.podcast_item_download_started);
                        }
                    }
                }
            });
            this.f21741c.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C6139g.m29959b(C6132e.this.mo1318s(), C6132e.this.f21739a);
                }
            });
            m29919b();
        }
        return scrollView;
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i == 1001) {
            if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                    public void run() {
                        C6570a.m31804a(false, C5462k.podcast_write_external_storage_permission_denied).mo1448a(C6132e.this.mo1318s().mo1469g(), "permissionDialog");
                    }
                }, 400);
            } else {
                Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
            }
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21739a = (PodcastItem) m.getSerializable("ARG_PODCAST_ITEM");
        }
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21742d = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21742d.mo8580b(C5457f.cover_placeholder);
        this.f21742d.mo8576a(mo1318s().mo1469g(), aVar);
        if (this.f21739a != null) {
            mo20287a((CharSequence) this.f21739a.title);
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        menu.findItem(C5458g.downloads).setVisible(this.f21739a != null);
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.podcast_item_info_menu, menu);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        m29922c();
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            mo20292ay();
        } else if (this.f21742d != null) {
            this.f21742d.mo8584h();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.downloads) {
            return super.mo1245a(menuItem);
        }
        FragmentInfo fragmentInfo = new FragmentInfo(C6130c.class.getName());
        Intent intent = new Intent(mo1318s(), PodcastDownloadsActivity.class);
        intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
        intent.addFlags(805306368);
        mo1318s().startActivity(intent);
        return true;
    }

    /* renamed from: i */
    public void mo1296i() {
        m29923d();
        super.mo1296i();
    }
}
