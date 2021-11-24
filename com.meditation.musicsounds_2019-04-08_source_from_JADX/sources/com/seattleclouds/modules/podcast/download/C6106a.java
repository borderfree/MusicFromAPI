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
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.content.C0456d;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
import android.widget.Toast;
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
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/* renamed from: com.seattleclouds.modules.podcast.download.a */
public class C6106a extends C6557s implements OnItemClickListener {

    /* renamed from: a */
    private View f21672a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public ArrayList<PodcastItem> f21673ae = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: af */
    public PodcastDownloadService f21674af;

    /* renamed from: ag */
    private boolean f21675ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public final C0828a f21676ah = new C0828a() {
        /* renamed from: a */
        public void mo3178a(C0827b bVar) {
            C6106a.this.f21687i = null;
            for (int i = 0; i < C6106a.this.f21678aj.getCount(); i++) {
                C6106a.this.f21680b.setItemChecked(i, false);
            }
            C6106a.this.f21673ae.clear();
            C6106a.this.f21680b.post(new Runnable() {
                public void run() {
                    C6106a.this.f21680b.setChoiceMode(0);
                }
            });
        }

        /* renamed from: a */
        public boolean mo3179a(C0827b bVar, Menu menu) {
            bVar.mo3218a().inflate(C5461j.podcast_downloaded_action_menu, menu);
            C6106a.this.f21680b.setChoiceMode(2);
            C5334b.m26768a(((C6348n) C6106a.this.mo1318s()).mo19778o(), (C0767e) C6106a.this.mo1318s(), menu);
            return true;
        }

        /* renamed from: a */
        public boolean mo3180a(C0827b bVar, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            if (itemId == C5458g.delete) {
                if (C6106a.this.m29856e() || C6106a.this.f21674af == null) {
                    return false;
                }
                C6106a.this.f21674af.mo19234b((List<PodcastItem>) C6106a.this.f21673ae);
            } else if (itemId != C5458g.share) {
                return false;
            } else {
                C6139g.m29959b(C6106a.this.mo1318s(), (PodcastItem) C6106a.this.f21673ae.get(0));
            }
            bVar.mo3226c();
            return true;
        }

        /* renamed from: b */
        public boolean mo3181b(C0827b bVar, Menu menu) {
            if (C6106a.this.f21673ae.size() > 1) {
                menu.findItem(C5458g.share).setVisible(false);
            } else {
                menu.findItem(C5458g.share).setVisible(true);
            }
            return true;
        }
    };

    /* renamed from: ai */
    private final BroadcastReceiver f21677ai = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            C6106a.this.m29849b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public final BaseAdapter f21678aj = new BaseAdapter() {
        /* renamed from: a */
        public PodcastItem getItem(int i) {
            return (PodcastItem) C6106a.this.f21684f.get(i);
        }

        public int getCount() {
            return C6106a.this.f21684f.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6118a aVar;
            TextView textView;
            String str;
            int i2;
            TextView textView2;
            if (view == null) {
                view = C6106a.this.mo1318s().getLayoutInflater().inflate(C5460i.podcast_downloads_grid_item, viewGroup, false);
                if (VERSION.SDK_INT > 10) {
                    TypedValue typedValue = new TypedValue();
                    C6106a.this.mo1318s().getTheme().resolveAttribute(16843517, typedValue, true);
                    view.setBackgroundResource(typedValue.resourceId);
                }
                aVar = new C6118a();
                aVar.f21699a = (TextView) view.findViewById(C5458g.textView);
                aVar.f21700b = (TextView) view.findViewById(C5458g.detailTextView);
                aVar.f21701c = (TextView) view.findViewById(C5458g.authorTextView);
                aVar.f21702d = (ImageView) view.findViewById(C5458g.imageView);
                aVar.f21704f = (ProgressBar) view.findViewById(C5458g.progressBar);
                aVar.f21703e = (ImageButton) view.findViewById(C5458g.warningButton);
                String b = C6106a.this.mo20291ax().mo17534b();
                if (b.equals("Theme.Base.Light.DarkBars") || b.equals("Theme.Base.Light")) {
                    textView2 = aVar.f21699a;
                    i2 = -16777216;
                } else {
                    textView2 = aVar.f21699a;
                    i2 = -1;
                }
                textView2.setTextColor(i2);
                view.setTag(aVar);
            } else {
                aVar = (C6118a) view.getTag();
            }
            PodcastItem a = getItem(i);
            aVar.f21699a.setText(a.title);
            if (a.error != null) {
                aVar.f21701c.setVisibility(8);
                textView = aVar.f21700b;
                str = a.error;
            } else {
                if (a.publishedDate != null) {
                    aVar.f21700b.setText(a.getFormattedDate(C6106a.this.mo1318s()));
                } else {
                    aVar.f21700b.setVisibility(8);
                }
                aVar.f21701c.setVisibility(0);
                textView = aVar.f21701c;
                str = a.author;
            }
            textView.setText(str);
            String anyImageUrl = a.getAnyImageUrl();
            if (anyImageUrl != null) {
                C6106a.this.f21686h.mo8578a((Object) anyImageUrl, aVar.f21702d);
            } else {
                aVar.f21702d.setImageBitmap(null);
            }
            aVar.f21704f.setVisibility(4);
            aVar.f21703e.setVisibility(8);
            if (VERSION.SDK_INT < 11) {
                if (C6106a.this.f21673ae.contains(a)) {
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
    private final ServiceConnection f21679ak = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6106a.this.f21674af = ((C6105b) iBinder).mo19256a();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6106a.this.f21674af = null;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GridView f21680b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f21681c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f21682d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f21683e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<PodcastItem> f21684f = new ArrayList<>();

    /* renamed from: g */
    private C0456d f21685g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2422c f21686h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0827b f21687i;

    /* renamed from: com.seattleclouds.modules.podcast.download.a$a */
    static class C6118a {

        /* renamed from: a */
        TextView f21699a;

        /* renamed from: b */
        TextView f21700b;

        /* renamed from: c */
        TextView f21701c;

        /* renamed from: d */
        ImageView f21702d;

        /* renamed from: e */
        ImageButton f21703e;

        /* renamed from: f */
        ProgressBar f21704f;

        C6118a() {
        }
    }

    /* renamed from: as */
    private boolean m29846as() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.READ_EXTERNAL_STORAGE") == 0;
        if (!z) {
            C6569aa.m31791a((Fragment) this, 1002, "android.permission.READ_EXTERNAL_STORAGE", new int[]{C5462k.podcast_permission_rationale_read_external_storage, C5462k.podcast_read_external_storage_permission_required_toast});
        }
        return !z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m29849b() {
        this.f21684f.clear();
        for (PodcastItem podcastItem : C6138f.m29937a()) {
            if (podcastItem.isDownloaded()) {
                this.f21684f.add(podcastItem);
            }
        }
        Collections.sort(this.f21684f, new Comparator<PodcastItem>() {
            /* renamed from: a */
            public int compare(PodcastItem podcastItem, PodcastItem podcastItem2) {
                Date date = podcastItem.downloadDate;
                Date date2 = podcastItem2.downloadDate;
                if (date == null || date2 == null) {
                    return 0;
                }
                return date2.compareTo(date);
            }
        });
        if (this.f21687i != null) {
            this.f21687i.mo3227d();
        }
        this.f21678aj.notifyDataSetChanged();
    }

    /* renamed from: c */
    private void m29851c() {
        mo1318s().bindService(new Intent(mo1318s(), PodcastDownloadService.class), this.f21679ak, 1);
        this.f21675ag = true;
    }

    /* renamed from: d */
    private void m29853d() {
        if (this.f21675ag) {
            mo1318s().unbindService(this.f21679ak);
            this.f21675ag = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m29855e(int i) {
        PodcastItem podcastItem = (PodcastItem) this.f21678aj.getItem(i);
        if (this.f21673ae.contains(podcastItem)) {
            this.f21680b.setItemChecked(i, false);
            this.f21673ae.remove(podcastItem);
        } else {
            this.f21680b.setItemChecked(i, true);
            this.f21673ae.add(podcastItem);
        }
        if (this.f21673ae.size() > 0) {
            this.f21687i.mo3227d();
        } else {
            this.f21687i.mo3226c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m29856e() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z) {
            C6569aa.m31791a((Fragment) this, 1001, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.podcast_permission_rationale_delete_external_storage, C5462k.podcast_delete_external_storage_permission_required_toast});
        }
        return !z;
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f21686h != null) {
            this.f21686h.mo8585i();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21672a = layoutInflater.inflate(C5460i.podcast_downloads_grid, viewGroup, false);
        this.f21680b = (GridView) this.f21672a.findViewById(C5458g.grid);
        this.f21680b.setAdapter(this.f21678aj);
        this.f21680b.setOnItemClickListener(this);
        this.f21680b.setEmptyView(this.f21672a.findViewById(C5458g.emptyDownloadedView));
        this.f21680b.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                C6106a.this.f21686h.mo8581b(i == 2);
            }
        });
        this.f21680b.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C6106a.this.f21687i != null) {
                    return false;
                }
                C6106a.this.f21687i = ((C0767e) C6106a.this.mo1318s()).mo3074b(C6106a.this.f21676ah);
                C6106a.this.m29855e(i);
                return true;
            }
        });
        this.f21680b.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (C6106a.this.f21683e != C6106a.this.f21680b.getWidth()) {
                    C6106a.this.f21683e = C6106a.this.f21680b.getWidth();
                    int floor = (int) Math.floor((double) (C6106a.this.f21680b.getWidth() / (C6106a.this.f21681c + C6106a.this.f21682d)));
                    if (floor > 0) {
                        C6106a.this.f21680b.setNumColumns(floor);
                    }
                }
            }
        });
        return this.f21672a;
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        switch (i) {
            case 1001:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.podcast_delete_external_storage_permission_denied).mo1448a(C6106a.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            case 1002:
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.READ_EXTERNAL_STORAGE")) {
                    new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.podcast_read_external_storage_permission_denied).mo1448a(C6106a.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo20294d(C5462k.podcast_downloads_page_title);
        this.f21685g = C0456d.m2097a((Context) mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "podcast/thumbnails");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f21681c = mo1320t().getDimensionPixelSize(C5456e.podcast_cover_width);
        this.f21682d = mo1320t().getDimensionPixelSize(C5456e.podcast_card_spacing);
        this.f21686h = new C6102d(mo1318s(), C6619m.m32014a(mo1318s(), 140.0f), false);
        this.f21686h.mo8580b(C5457f.cover_placeholder_small);
        this.f21686h.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        mo1283e(true);
        m29851c();
        m29849b();
        this.f21685g.mo1844a(this.f21677ai, new IntentFilter(PodcastDownloadService.m29810a((Context) mo1318s())));
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            if (this.f21687i != null) {
                this.f21687i.mo3226c();
            }
            if (this.f21686h != null) {
                this.f21686h.mo8584h();
            }
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        m29853d();
        this.f21685g.mo1843a(this.f21677ai);
        super.mo1296i();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f21687i != null) {
            m29855e(i);
        } else if (!m29846as()) {
            C6139g.m29955a((Activity) mo1318s(), (PodcastItem) this.f21678aj.getItem(i));
        }
    }
}
