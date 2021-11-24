package com.seattleclouds.modules.podcast.p182a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import android.widget.FrameLayout;
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
import com.seattleclouds.modules.podcast.C6070a;
import com.seattleclouds.modules.podcast.C6102d;
import com.seattleclouds.modules.podcast.PodcastInfo;
import com.seattleclouds.modules.podcast.PodcastListItem;
import com.seattleclouds.modules.podcast.download.C6130c;
import com.seattleclouds.modules.podcast.download.PodcastDownloadService;
import com.seattleclouds.modules.podcast.download.PodcastDownloadsActivity;
import com.seattleclouds.modules.podcast.p182a.C6073a.C6075a;
import com.seattleclouds.modules.podcast.p183b.C6088a;
import com.seattleclouds.modules.podcast.p183b.C6088a.C6090a;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6599ar;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.podcast.a.b */
public class C6076b extends C6557s implements C6075a {

    /* renamed from: a */
    protected C2422c f21571a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C6088a f21572ae;

    /* renamed from: af */
    private int f21573af;

    /* renamed from: ag */
    private boolean f21574ag = false;

    /* renamed from: ah */
    private RecyclerView f21575ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public C6070a f21576ai;

    /* renamed from: aj */
    private C0937i f21577aj;

    /* renamed from: ak */
    private BroadcastReceiver f21578ak = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6076b.this.m29725m(false);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SwipeRefreshLayout f21579b;

    /* renamed from: c */
    private boolean f21580c = true;

    /* renamed from: d */
    private boolean f21581d = true;

    /* renamed from: e */
    private ArrayList<String> f21582e;

    /* renamed from: f */
    private String f21583f;

    /* renamed from: g */
    private ArrayList<PodcastInfo> f21584g;

    /* renamed from: h */
    private C0456d f21585h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<PodcastListItem> f21586i = new ArrayList<>();

    /* renamed from: a */
    private void m29720a(ArrayList<PodcastInfo> arrayList) {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                C6076b.this.f21579b.setRefreshing(true);
            }
        }, 100);
        this.f21584g = arrayList;
        m29725m(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29721b() {
        if (this.f21584g == null) {
            mo20292ay();
            return;
        }
        C6070a aVar = new C6070a(this, this.f21571a, this.f21573af, this.f21574ag, this.f21586i, this.f21583f);
        this.f21576ai = aVar;
        this.f21575ah.setAdapter(this.f21576ai);
        mo20292ay();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m29725m(final boolean z) {
        if (this.f21572ae != null) {
            this.f21572ae.cancel(true);
            this.f21572ae = null;
        }
        if (this.f21584g != null && mo1318s() != null) {
            this.f21572ae = new C6088a(mo1318s());
            this.f21572ae.mo19199a((C6090a) new C6090a() {
                /* renamed from: a */
                public void mo19186a(ArrayList<PodcastListItem> arrayList) {
                    C6076b.this.f21572ae = null;
                    C6076b.this.f21586i = arrayList;
                    C6076b.this.f21579b.setRefreshing(false);
                    if (z) {
                        C6076b.this.m29721b();
                    } else {
                        C6076b.this.f21576ai.mo4336e();
                    }
                }
            });
            this.f21572ae.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f21584g.toArray(new PodcastInfo[this.f21584g.size()]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m29726n(boolean z) {
        this.f21580c = false;
        if (this.f21582e != null) {
            new C6073a(mo1318s(), this, z).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f21582e.toArray(new String[this.f21582e.size()]));
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f21580c) {
            m29726n(true);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21571a != null) {
            this.f21571a.mo8585i();
        }
        if (this.f21572ae != null) {
            this.f21572ae.cancel(true);
            this.f21572ae = null;
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_podcast, viewGroup, false);
        this.f21579b = (SwipeRefreshLayout) frameLayout.findViewById(C5458g.ptr_layout);
        this.f21579b.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C6076b.this.m29726n(false);
            }
        });
        C5338d ax = mo20291ax();
        this.f21579b.setColorSchemeColors(ax.mo17546c(mo1318s()));
        if (this.f21581d) {
            m29726n(false);
        }
        this.f21575ah = (RecyclerView) frameLayout.findViewById(C5458g.podcast_recycle_view);
        this.f21575ah.setHasFixedSize(true);
        this.f21577aj = new LinearLayoutManager(mo1318s());
        this.f21575ah.setLayoutManager(this.f21577aj);
        this.f21575ah.setNestedScrollingEnabled(false);
        return frameLayout;
    }

    /* renamed from: a */
    public void mo19180a() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                C6076b.this.f21579b.setRefreshing(true);
            }
        }, 100);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21582e = m.getStringArrayList("ARG_PODCAST_FEED_URL_LIST");
            this.f21583f = m.getString("ARG_PODCAST_HEADER_IMG");
            this.f21581d = m.getBoolean("ARG_PODCAST_AUTO_REFRESH", true);
            this.f21574ag = m.getBoolean("PAGE_SUPPORT_NATIVE_ADS");
            this.f21573af = m.getInt("PAGE_NATIVE_ADS_ROW_NUMBER");
        }
        if (bundle != null) {
            if (bundle.containsKey("STATE_NEEDS_REFRESH")) {
                this.f21580c = bundle.getBoolean("STATE_NEEDS_REFRESH");
            }
            if (bundle.containsKey("STATE_PODCAST_INFO_LIST")) {
                this.f21584g = (ArrayList) bundle.getSerializable("STATE_PODCAST_INFO_LIST");
            }
            if (this.f21584g == null) {
                this.f21580c = true;
            } else {
                m29725m(true);
            }
        }
        this.f21585h = C0456d.m2097a((Context) mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21571a = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21571a.mo8580b(C5457f.cover_placeholder_small);
        this.f21571a.mo8576a(mo1318s().mo1469g(), aVar);
        mo20294d(C5462k.podcast_title);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        if (this.f21582e != null) {
            menu.findItem(C5458g.downloads).setVisible(this.f21584g != null);
            menu.findItem(C5458g.share).setVisible(false);
        }
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (this.f21582e != null) {
            menuInflater.inflate(C5461j.podcast_menu, menu);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (!(this.f21584g == null || this.f21586i == null || this.f21580c)) {
            m29721b();
        }
        this.f21585h.mo1844a(this.f21578ak, new IntentFilter(PodcastDownloadService.m29810a((Context) mo1318s())));
    }

    /* renamed from: a */
    public void mo19181a(String str) {
        mo19183c(str);
    }

    /* renamed from: a */
    public void mo19182a(ArrayList<PodcastInfo> arrayList, boolean z) {
        if (!z) {
            this.f21571a.mo8583g();
        }
        m29720a(arrayList);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z && this.f21571a != null) {
            this.f21571a.mo8584h();
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
        } else if (menuItem.getItemId() != C5458g.podcast_refresh) {
            return super.mo1245a(menuItem);
        } else {
            m29726n(false);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19183c(final String str) {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C6076b.this.mo1318s() != null) {
                        C6076b.this.mo19184d(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo19184d(String str) {
        Toast.makeText(mo1318s(), str, 1).show();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (!this.f21581d && !C6599ar.f23316a) {
            bundle.putBoolean("STATE_NEEDS_REFRESH", this.f21580c);
            bundle.putSerializable("STATE_PODCAST_INFO_LIST", this.f21584g);
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f21585h.mo1843a(this.f21578ak);
        super.mo1296i();
    }
}
