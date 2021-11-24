package com.seattleclouds.modules.podcast.download;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p009v4.content.C0456d;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5456e;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.podcast.C6102d;
import com.seattleclouds.modules.podcast.C6138f;
import com.seattleclouds.modules.podcast.C6139g;
import com.seattleclouds.modules.podcast.PodcastItem;
import com.seattleclouds.modules.podcast.download.PodcastDownloadService.C6105b;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.seattleclouds.modules.podcast.download.b */
public class C6119b extends C6557s implements OnItemClickListener {

    /* renamed from: a */
    private View f21705a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C2422c f21706ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C0827b f21707af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public ArrayList<PodcastItem> f21708ag = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public final C0828a f21709ah = new C0828a() {
        /* renamed from: a */
        public void mo3178a(C0827b bVar) {
            C6119b.this.f21707af = null;
            for (int i = 0; i < C6119b.this.f21711aj.getCount(); i++) {
                C6119b.this.f21713b.setItemChecked(i, false);
            }
            C6119b.this.f21708ag.clear();
            C6119b.this.f21713b.post(new Runnable() {
                public void run() {
                    C6119b.this.f21713b.setChoiceMode(0);
                }
            });
        }

        /* renamed from: a */
        public boolean mo3179a(C0827b bVar, Menu menu) {
            bVar.mo3218a().inflate(C5461j.podcast_downloading_action_menu, menu);
            C6119b.this.f21713b.setChoiceMode(2);
            C5334b.m26768a(((C6348n) C6119b.this.mo1318s()).mo19778o(), (C0767e) C6119b.this.mo1318s(), menu);
            return true;
        }

        /* renamed from: a */
        public boolean mo3180a(C0827b bVar, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId != C5458g.cancel) {
                if (itemId == C5458g.retry) {
                    if (C6119b.this.f21718g == null) {
                        return false;
                    }
                    C6119b.this.f21718g.mo19234b((List<PodcastItem>) C6119b.this.f21708ag);
                    C6119b.this.f21718g.mo19230a(C6119b.this.f21708ag);
                } else if (itemId != C5458g.share) {
                    return false;
                } else {
                    C6139g.m29959b(C6119b.this.mo1318s(), (PodcastItem) C6119b.this.f21708ag.get(0));
                }
                bVar.mo3226c();
                return true;
            } else if (C6119b.this.f21718g == null) {
                return false;
            } else {
                C6119b.this.f21718g.mo19231a((List<PodcastItem>) C6119b.this.f21708ag);
                Iterator it = C6119b.this.f21708ag.iterator();
                while (it.hasNext()) {
                    PodcastItem podcastItem = (PodcastItem) it.next();
                    C6138f.m29936a(podcastItem.podcastUrl).mo19303b(podcastItem);
                }
                bVar.mo3226c();
                return true;
            }
        }

        /* renamed from: b */
        public boolean mo3181b(C0827b bVar, Menu menu) {
            boolean z = false;
            if (C6119b.this.f21708ag.size() > 1) {
                menu.findItem(C5458g.share).setVisible(false);
            } else {
                menu.findItem(C5458g.share).setVisible(true);
            }
            if (C6119b.this.f21718g != null) {
                Iterator it = C6119b.this.f21708ag.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    if (C6119b.this.f21718g.mo19235b((PodcastItem) it.next())) {
                        break;
                    }
                }
            }
            menu.findItem(C5458g.retry).setVisible(z);
            return true;
        }
    };

    /* renamed from: ai */
    private final BroadcastReceiver f21710ai = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6119b.this.m29884b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public final BaseAdapter f21711aj = new BaseAdapter() {
        /* renamed from: a */
        public PodcastItem getItem(int i) {
            return (PodcastItem) C6119b.this.f21717f.get(i);
        }

        public int getCount() {
            return C6119b.this.f21717f.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6129a aVar;
            TextView textView;
            String str;
            int i2;
            TextView textView2;
            if (view == null) {
                view = C6119b.this.mo1318s().getLayoutInflater().inflate(C5460i.podcast_downloads_grid_item, viewGroup, false);
                if (VERSION.SDK_INT > 10) {
                    TypedValue typedValue = new TypedValue();
                    C6119b.this.mo1318s().getTheme().resolveAttribute(16843517, typedValue, true);
                    view.setBackgroundResource(typedValue.resourceId);
                }
                aVar = new C6129a();
                aVar.f21731a = (TextView) view.findViewById(C5458g.textView);
                aVar.f21732b = (TextView) view.findViewById(C5458g.detailTextView);
                aVar.f21733c = (TextView) view.findViewById(C5458g.authorTextView);
                aVar.f21734d = (ImageView) view.findViewById(C5458g.imageView);
                aVar.mo19293a((ProgressBar) view.findViewById(C5458g.progressBar));
                aVar.f21735e = (ImageButton) view.findViewById(C5458g.warningButton);
                String b = C6119b.this.mo20291ax().mo17534b();
                if (b.equals("Theme.Base.Light.DarkBars") || b.equals("Theme.Base.Light")) {
                    textView2 = aVar.f21731a;
                    i2 = -16777216;
                } else {
                    textView2 = aVar.f21731a;
                    i2 = -1;
                }
                textView2.setTextColor(i2);
                view.setTag(aVar);
            } else {
                aVar = (C6129a) view.getTag();
            }
            PodcastItem a = getItem(i);
            aVar.f21731a.setText(a.title);
            if (a.error != null) {
                aVar.f21733c.setVisibility(8);
                textView = aVar.f21732b;
                str = a.error;
            } else {
                if (a.publishedDate != null) {
                    aVar.f21732b.setText(a.getFormattedDate(C6119b.this.mo1318s()));
                } else {
                    aVar.f21732b.setVisibility(8);
                }
                aVar.f21733c.setVisibility(0);
                textView = aVar.f21733c;
                str = a.author;
            }
            textView.setText(str);
            String anyImageUrl = a.getAnyImageUrl();
            if (anyImageUrl != null) {
                C6119b.this.f21706ae.mo8578a((Object) anyImageUrl, aVar.f21734d);
            } else {
                aVar.f21734d.setImageBitmap(null);
            }
            aVar.f21736f.setVisibility(4);
            if (C6119b.this.f21718g != null && C6119b.this.f21718g.mo19235b(a)) {
                C6119b.this.f21718g.mo19229a(a, aVar.mo19292a());
                aVar.f21736f.setVisibility(0);
            }
            final String str2 = a.error;
            if (str2 != null) {
                aVar.f21735e.setVisibility(0);
                aVar.f21735e.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6620n.m32031a((Context) C6119b.this.mo1318s(), C5462k.podcast_error, str2);
                    }
                });
            } else {
                aVar.f21735e.setVisibility(4);
            }
            if (VERSION.SDK_INT < 11) {
                if (C6119b.this.f21708ag.contains(a)) {
                    view.setBackgroundColor(-12303292);
                } else {
                    view.setBackgroundColor(0);
                }
            }
            return view;
        }

        public boolean hasStableIds() {
            return true;
        }
    };

    /* renamed from: ak */
    private final ServiceConnection f21712ak = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6119b.this.f21718g = ((C6105b) iBinder).mo19256a();
            C6119b.this.m29884b();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6119b.this.f21718g = null;
            C6119b.this.m29884b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GridView f21713b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f21714c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f21715d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f21716e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<PodcastItem> f21717f = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public PodcastDownloadService f21718g;

    /* renamed from: h */
    private boolean f21719h;

    /* renamed from: i */
    private C0456d f21720i;

    /* renamed from: com.seattleclouds.modules.podcast.download.b$a */
    static class C6129a {

        /* renamed from: a */
        TextView f21731a;

        /* renamed from: b */
        TextView f21732b;

        /* renamed from: c */
        TextView f21733c;

        /* renamed from: d */
        ImageView f21734d;

        /* renamed from: e */
        ImageButton f21735e;

        /* renamed from: f */
        ProgressBar f21736f;

        C6129a() {
        }

        /* renamed from: a */
        public synchronized ProgressBar mo19292a() {
            return this.f21736f;
        }

        /* renamed from: a */
        public synchronized void mo19293a(ProgressBar progressBar) {
            this.f21736f = progressBar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29884b() {
        this.f21717f.clear();
        if (this.f21718g != null) {
            List a = this.f21718g.mo19227a();
            if (a != null) {
                this.f21717f.addAll(a);
            }
        }
        for (PodcastItem podcastItem : C6138f.m29937a()) {
            if (podcastItem.error != null) {
                this.f21717f.add(podcastItem);
            }
        }
        if (this.f21707af != null) {
            ArrayList<PodcastItem> arrayList = new ArrayList<>();
            Iterator it = this.f21717f.iterator();
            while (it.hasNext()) {
                PodcastItem podcastItem2 = (PodcastItem) it.next();
                if (this.f21708ag.contains(podcastItem2)) {
                    arrayList.add(podcastItem2);
                }
            }
            this.f21708ag = arrayList;
            if (this.f21708ag.size() > 0) {
                this.f21707af.mo3227d();
            } else {
                this.f21707af.mo3226c();
            }
        }
        this.f21711aj.notifyDataSetChanged();
    }

    /* renamed from: c */
    private void m29886c() {
        mo1318s().bindService(new Intent(mo1318s(), PodcastDownloadService.class), this.f21712ak, 1);
        this.f21719h = true;
    }

    /* renamed from: d */
    private void m29888d() {
        if (this.f21719h) {
            mo1318s().unbindService(this.f21712ak);
            this.f21719h = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m29890e(int i) {
        PodcastItem podcastItem = (PodcastItem) this.f21711aj.getItem(i);
        if (this.f21708ag.contains(podcastItem)) {
            this.f21713b.setItemChecked(i, false);
            this.f21708ag.remove(podcastItem);
        } else {
            this.f21713b.setItemChecked(i, true);
            this.f21708ag.add(podcastItem);
        }
        if (this.f21708ag.size() > 0) {
            this.f21707af.mo3227d();
        } else {
            this.f21707af.mo3226c();
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21706ae != null) {
            this.f21706ae.mo8585i();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21705a = layoutInflater.inflate(C5460i.podcast_downloads_grid, viewGroup, false);
        this.f21713b = (GridView) this.f21705a.findViewById(C5458g.grid);
        this.f21713b.setAdapter(this.f21711aj);
        this.f21713b.setOnItemClickListener(this);
        this.f21713b.setEmptyView(this.f21705a.findViewById(C5458g.emptyDownloadedView));
        this.f21713b.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                C6119b.this.f21706ae.mo8581b(i == 2);
            }
        });
        this.f21713b.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C6119b.this.f21707af != null) {
                    return false;
                }
                C6119b.this.f21707af = ((C0767e) C6119b.this.mo1318s()).mo3074b(C6119b.this.f21709ah);
                C6119b.this.m29890e(i);
                return true;
            }
        });
        this.f21713b.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (C6119b.this.f21716e != C6119b.this.f21713b.getWidth()) {
                    C6119b.this.f21716e = C6119b.this.f21713b.getWidth();
                    int floor = (int) Math.floor((double) (C6119b.this.f21713b.getWidth() / (C6119b.this.f21714c + C6119b.this.f21715d)));
                    if (floor > 0) {
                        C6119b.this.f21713b.setNumColumns(floor);
                    }
                    C6119b.this.f21713b.invalidateViews();
                }
            }
        });
        return this.f21705a;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo20294d(C5462k.podcast_downloads_page_title);
        this.f21720i = C0456d.m2097a((Context) mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21714c = mo1320t().getDimensionPixelSize(C5456e.podcast_cover_width);
        this.f21715d = mo1320t().getDimensionPixelSize(C5456e.podcast_card_spacing);
        this.f21706ae = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21706ae.mo8580b(C5457f.cover_placeholder_small);
        this.f21706ae.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        m29886c();
        this.f21713b.setAdapter(this.f21711aj);
        this.f21720i.mo1844a(this.f21710ai, new IntentFilter(PodcastDownloadService.m29810a((Context) mo1318s())));
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (this.f21713b != null) {
            this.f21713b.invalidateViews();
        }
        if (!z) {
            if (this.f21707af != null) {
                this.f21707af.mo3226c();
            }
            if (this.f21706ae != null) {
                this.f21706ae.mo8584h();
            }
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        m29888d();
        this.f21720i.mo1843a(this.f21710ai);
        super.mo1296i();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f21707af != null) {
            m29890e(i);
            return;
        }
        C6139g.m29955a((Activity) mo1318s(), (PodcastItem) this.f21711aj.getItem(i));
    }
}
