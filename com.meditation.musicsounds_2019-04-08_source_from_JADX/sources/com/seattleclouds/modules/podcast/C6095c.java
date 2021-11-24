package com.seattleclouds.modules.podcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.content.C0456d;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.seattleclouds.modules.podcast.download.PodcastDownloadsActivity;
import com.seattleclouds.modules.podcast.p183b.C6088a;
import com.seattleclouds.modules.podcast.p183b.C6088a.C6090a;
import com.seattleclouds.modules.podcast.p183b.C6091b;
import com.seattleclouds.modules.podcast.p183b.C6091b.C6092a;
import com.seattleclouds.modules.podcast.p183b.C6093c;
import com.seattleclouds.modules.podcast.p183b.C6093c.C6094a;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6599ar;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.podcast.c */
public class C6095c extends C6557s implements C6092a, C6094a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public SwipeRefreshLayout f21623a;

    /* renamed from: ae */
    private C0456d f21624ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f21625af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public ArrayList<PodcastListItem> f21626ag = new ArrayList<>();

    /* renamed from: ah */
    private RecyclerView f21627ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public C6070a f21628ai;

    /* renamed from: aj */
    private C0937i f21629aj;

    /* renamed from: ak */
    private int f21630ak;

    /* renamed from: al */
    private boolean f21631al = false;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public C6088a f21632am;

    /* renamed from: an */
    private BroadcastReceiver f21633an = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6095c.this.m29786m(false);
        }
    };

    /* renamed from: b */
    private FrameLayout f21634b;

    /* renamed from: c */
    private boolean f21635c = true;

    /* renamed from: d */
    private boolean f21636d = true;

    /* renamed from: e */
    private String f21637e;

    /* renamed from: f */
    private String f21638f;

    /* renamed from: g */
    private PodcastInfo f21639g;

    /* renamed from: h */
    private C2422c f21640h;

    /* renamed from: i */
    private C6091b f21641i;

    /* renamed from: a */
    private void m29778a(PodcastInfo podcastInfo) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                C6095c.this.f21623a.setRefreshing(C6095c.this.f21625af);
            }
        }, 100);
        this.f21639g = podcastInfo;
        m29786m(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m29785d() {
        if (this.f21639g != null) {
            C6070a aVar = new C6070a(this, this.f21640h, this.f21630ak, this.f21631al, this.f21626ag, this.f21638f);
            this.f21628ai = aVar;
            this.f21627ah.setAdapter(this.f21628ai);
            mo20292ay();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m29786m(final boolean z) {
        if (this.f21632am != null) {
            this.f21632am.cancel(true);
            this.f21632am = null;
        }
        if (this.f21639g != null && mo1318s() != null) {
            this.f21632am = new C6088a(mo1318s());
            this.f21632am.mo19199a((C6090a) new C6090a() {
                /* renamed from: a */
                public void mo19186a(ArrayList<PodcastListItem> arrayList) {
                    C6095c.this.f21632am = null;
                    C6095c.this.f21626ag = arrayList;
                    C6095c.this.f21623a.setRefreshing(false);
                    if (z) {
                        C6095c.this.m29785d();
                    } else {
                        C6095c.this.f21628ai.mo4336e();
                    }
                }
            });
            this.f21632am.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new PodcastInfo[]{this.f21639g});
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m29787n(boolean z) {
        this.f21635c = false;
        if (this.f21637e != null) {
            new C6093c(mo1318s(), this, z).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{this.f21637e});
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f21635c) {
            m29787n(true);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21640h != null) {
            this.f21640h.mo8585i();
        }
        if (this.f21632am != null) {
            this.f21632am.cancel(true);
            this.f21632am = null;
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_podcast, viewGroup, false);
        this.f21623a = (SwipeRefreshLayout) frameLayout.findViewById(C5458g.ptr_layout);
        this.f21623a.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C6095c.this.m29787n(false);
            }
        });
        C5338d ax = mo20291ax();
        this.f21623a.setColorSchemeColors(ax.mo17546c(mo1318s()));
        if (this.f21636d) {
            m29787n(false);
        }
        this.f21627ah = (RecyclerView) frameLayout.findViewById(C5458g.podcast_recycle_view);
        this.f21627ah.setHasFixedSize(true);
        this.f21629aj = new LinearLayoutManager(mo1318s());
        this.f21627ah.setLayoutManager(this.f21629aj);
        return frameLayout;
    }

    /* renamed from: a */
    public void mo19211a(Bitmap bitmap, Bitmap bitmap2) {
        this.f21641i = null;
        ProgressBar progressBar = (ProgressBar) this.f21634b.findViewById(C5458g.progressBar);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(4);
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f21634b.findViewById(C5458g.imageView);
            imageView.setImageBitmap(bitmap);
            ImageView imageView2 = (ImageView) this.f21634b.findViewById(C5458g.backgroundImageView);
            imageView2.setImageBitmap(bitmap2);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setStartOffset(500);
            alphaAnimation.setFillAfter(true);
            imageView.startAnimation(alphaAnimation);
            imageView2.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21637e = m.getString("ARG_PODCAST_FEED_URL");
            this.f21638f = m.getString("ARG_PODCAST_HEADER_IMG");
            this.f21636d = m.getBoolean("ARG_PODCAST_AUTO_REFRESH", true);
            this.f21631al = m.getBoolean("PAGE_SUPPORT_NATIVE_ADS");
            this.f21630ak = m.getInt("PAGE_NATIVE_ADS_ROW_NUMBER");
        }
        if (bundle != null) {
            if (bundle.containsKey("STATE_NEEDS_REFRESH")) {
                this.f21635c = bundle.getBoolean("STATE_NEEDS_REFRESH");
            }
            if (bundle.containsKey("STATE_PODCAST_INFO")) {
                this.f21639g = (PodcastInfo) bundle.getSerializable("STATE_PODCAST_INFO");
            }
            if (this.f21639g == null) {
                this.f21635c = true;
            } else {
                m29786m(true);
            }
        }
        this.f21624ae = C0456d.m2097a((Context) mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21640h = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21640h.mo8580b(C5457f.cover_placeholder_small);
        this.f21640h.mo8576a(mo1318s().mo1469g(), aVar);
        mo20294d(C5462k.podcast_title);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        if (this.f21637e != null) {
            boolean z = false;
            menu.findItem(C5458g.downloads).setVisible(this.f21639g != null);
            MenuItem findItem = menu.findItem(C5458g.share);
            if (this.f21639g != null) {
                z = true;
            }
            findItem.setVisible(z);
        }
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (this.f21637e != null) {
            menuInflater.inflate(C5461j.podcast_menu, menu);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (!(this.f21639g == null || this.f21626ag == null || this.f21635c)) {
            m29785d();
        }
        this.f21624ae.mo1844a(this.f21633an, new IntentFilter(PodcastDownloadService.m29810a((Context) mo1318s())));
    }

    /* renamed from: a */
    public void mo19218a(PodcastInfo podcastInfo, boolean z) {
        this.f21625af = false;
        if (!z) {
            this.f21640h.mo8583g();
        }
        this.f21623a.setRefreshing(false);
        m29778a(podcastInfo);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z && this.f21640h != null) {
            this.f21640h.mo8584h();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() == C5458g.downloads) {
            FragmentInfo fragmentInfo = new FragmentInfo(C6130c.class.getName());
            Intent intent = new Intent(mo1318s(), PodcastDownloadsActivity.class);
            intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
            intent.addFlags(805306368);
            mo1318s().startActivity(intent);
            return true;
        } else if (menuItem.getItemId() == C5458g.share) {
            C6139g.m29954a((Activity) mo1318s(), this.f21639g);
            return true;
        } else if (menuItem.getItemId() != C5458g.podcast_refresh) {
            return super.mo1245a(menuItem);
        } else {
            m29787n(false);
            return true;
        }
    }

    /* renamed from: b */
    public void mo1450b() {
        this.f21625af = true;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                C6095c.this.f21623a.setRefreshing(C6095c.this.f21625af);
            }
        }, 100);
    }

    /* renamed from: c */
    public void mo1453c() {
        ProgressBar progressBar = (ProgressBar) this.f21634b.findViewById(C5458g.progressBar);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19221c(final String str) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C6095c.this.mo1318s() != null) {
                        C6095c.this.mo19222d(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19222d(String str) {
        Toast.makeText(mo1318s(), str, 1).show();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (!this.f21636d && !C6599ar.f23316a) {
            bundle.putBoolean("STATE_NEEDS_REFRESH", this.f21635c);
            bundle.putSerializable("STATE_PODCAST_INFO", this.f21639g);
        }
    }

    /* renamed from: e */
    public void mo19220e(String str) {
        this.f21625af = false;
        mo19221c(str);
        this.f21623a.setRefreshing(false);
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f21624ae.mo1843a(this.f21633an);
        if (this.f21641i != null) {
            this.f21641i.cancel(true);
            this.f21641i = null;
        }
        super.mo1296i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21639g != null) {
            m29785d();
        }
    }
}
