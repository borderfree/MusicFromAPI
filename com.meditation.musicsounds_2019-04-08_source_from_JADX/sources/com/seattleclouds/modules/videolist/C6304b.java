package com.seattleclouds.modules.videolist;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0928c;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.text.TextUtils.SimpleStringSplitter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.C1231g;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.ads.AdNativeManager;
import com.seattleclouds.modules.videolist.VideoFile.Status;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6647z;
import java.io.File;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.p198io.C6731c;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.videolist.b */
public class C6304b extends C6557s {

    /* renamed from: a */
    static final String f22390a = "b";

    /* renamed from: b */
    static HashMap<Long, String> f22391b = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public int f22392ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public Bundle f22393af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public ArrayList<Integer> f22394ag = null;

    /* renamed from: ah */
    private OpenPdfOptions f22395ah = new OpenPdfOptions();
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public int f22396ai;

    /* renamed from: aj */
    private boolean f22397aj = false;

    /* renamed from: ak */
    private ProgressBar f22398ak;

    /* renamed from: al */
    private RecyclerView f22399al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public C0926a f22400am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public C0937i f22401an;

    /* renamed from: ao */
    private C6303a f22402ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public ColorStateList f22403ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public C1231g f22404aq;

    /* renamed from: ar */
    private BroadcastReceiver f22405ar = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (C6304b.this.mo1318s() != null) {
                long longExtra = intent.getLongExtra("extra_download_id", -1);
                String action = intent.getAction();
                if (longExtra != -1 && action.equalsIgnoreCase("android.intent.action.DOWNLOAD_COMPLETE") && C6304b.f22391b.containsKey(Long.valueOf(longExtra))) {
                    Query query = new Query();
                    query.setFilterById(new long[]{longExtra});
                    DownloadManager downloadManager = (DownloadManager) C6304b.this.mo1318s().getSystemService("download");
                    Cursor query2 = downloadManager.query(query);
                    Long valueOf = Long.valueOf(-1);
                    boolean z = false;
                    while (query2.moveToNext()) {
                        int i = query2.getInt(query2.getColumnIndex("status"));
                        if (i == 16) {
                            if (C6304b.this.m30684b(longExtra)) {
                                downloadManager.remove(new long[]{longExtra});
                            }
                        } else if (i == 8) {
                            if (!C6304b.this.m30676a(longExtra)) {
                            }
                        }
                        valueOf = Long.valueOf(longExtra);
                        z = true;
                    }
                    query2.close();
                    C6304b.this.m30672a(valueOf);
                    if (z) {
                        C6304b.f22391b.remove(valueOf);
                    }
                }
            }
        }
    };

    /* renamed from: c */
    Object f22406c;

    /* renamed from: d */
    private String f22407d;

    /* renamed from: e */
    private String f22408e;

    /* renamed from: f */
    private String f22409f;

    /* renamed from: g */
    private String f22410g;

    /* renamed from: h */
    private String f22411h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<VideoFile> f22412i;

    /* renamed from: com.seattleclouds.modules.videolist.b$a */
    public final class C6316a extends C0926a<C6317a> {

        /* renamed from: com.seattleclouds.modules.videolist.b$a$a */
        class C6317a extends C0958w {

            /* renamed from: n */
            LinearLayout f22429n;

            /* renamed from: o */
            TextView f22430o;

            /* renamed from: p */
            TextView f22431p;

            /* renamed from: q */
            ImageView f22432q;

            /* renamed from: r */
            ImageView f22433r;

            /* renamed from: s */
            ProgressBar f22434s;

            /* renamed from: t */
            TextView f22435t;

            C6317a(View view) {
                super(view);
                this.f22430o = (TextView) view.findViewById(C5458g.file_name);
                this.f22431p = (TextView) view.findViewById(C5458g.dropbox_file_info);
                this.f22432q = (ImageView) view.findViewById(C5458g.file_image);
                this.f22433r = (ImageView) view.findViewById(C5458g.dropbox_file_status_badge);
                this.f22434s = (ProgressBar) view.findViewById(C5458g.video_file_progressBar);
                this.f22435t = (TextView) view.findViewById(C5458g.file_download_progress_info);
                this.f22429n = (LinearLayout) view.findViewById(C5458g.linear_layout_ads);
                if (this.f22429n != null) {
                    this.f22429n.setLayoutParams(new LayoutParams(-1, C6619m.m32014a(C6304b.this.mo1318s(), (float) App.f18501c.mo16931aa())));
                    return;
                }
                this.f3157a.setOnClickListener(new OnClickListener(C6316a.this) {
                    public void onClick(View view) {
                        int e = C6317a.this.mo4585e();
                        VideoFile videoFile = (VideoFile) C6304b.this.f22412i.get(AdNativeManager.m26106a(C6304b.this.f22406c, e));
                        switch (videoFile.mo19700c()) {
                            case ONLINE:
                                C6304b.this.m30700e(e);
                                return;
                            case DOWNLOADING:
                                C6304b.this.m30694d(Integer.valueOf(e));
                                return;
                            case LOCAL:
                                C6304b.this.m30682b(Integer.valueOf(e));
                                return;
                            default:
                                return;
                        }
                    }
                });
                this.f3157a.setOnLongClickListener(new OnLongClickListener(C6316a.this) {
                    public boolean onLongClick(View view) {
                        int e = C6317a.this.mo4585e();
                        if (C63093.f22417a[((VideoFile) C6304b.this.f22412i.get(AdNativeManager.m26106a(C6304b.this.f22406c, e))).mo19700c().ordinal()] != 3) {
                            return false;
                        }
                        C6304b.this.m30691c(Integer.valueOf(e));
                        return true;
                    }
                });
            }
        }

        C6316a() {
        }

        /* renamed from: a */
        private void m30719a(ImageView imageView, VideoFile videoFile) {
            if (imageView != null) {
                imageView.setImageResource(videoFile.mo19700c() == Status.ONLINE ? C5457f.ic_cloud_file_download_alpha : C5457f.ic_cloud_done_alpha);
                C5334b.m26761a(C6304b.this.f22403ap, imageView);
            }
        }

        /* renamed from: a */
        public int mo342a() {
            if (C6304b.this.f22412i == null) {
                return 0;
            }
            return AdNativeManager.m26113b(C6304b.this.f22406c, C6304b.this.f22412i.size());
        }

        /* renamed from: a */
        public C6317a mo353b(ViewGroup viewGroup, int i) {
            LayoutInflater from;
            int i2;
            if (i == AdNativeManager.f18772a) {
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = C5460i.list_item_ads;
            } else if (i == Status.DOWNLOADING.ordinal()) {
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = C5460i.videolist_downloading_file_view;
            } else {
                from = LayoutInflater.from(viewGroup.getContext());
                i2 = C5460i.videolist_online_local_file_view;
            }
            return new C6317a(from.inflate(i2, viewGroup, false));
        }

        /* renamed from: a */
        public void mo350a(C6317a aVar, int i) {
            if (aVar.mo4588h() == AdNativeManager.f18772a) {
                aVar.f22429n.removeAllViews();
                aVar.f22429n.addView(AdNativeManager.m26107a(C6304b.this.f22406c, i, mo352b(i)));
                return;
            }
            VideoFile videoFile = (VideoFile) C6304b.this.f22412i.get(AdNativeManager.m26106a(C6304b.this.f22406c, i));
            videoFile.mo19698b(i);
            if (videoFile.mo19700c() == Status.DOWNLOADING) {
                aVar.f22430o.setText(videoFile.mo19692a());
                aVar.f22434s.setTag(Integer.valueOf(i));
                aVar.f22434s.setIndeterminate(true);
                aVar.f22435t.setText(C5462k.videolist_downloading_message);
            } else {
                aVar.f22430o.setText(videoFile.mo19692a());
                aVar.f22431p.setText(videoFile.mo19713j());
            }
            m30719a(aVar.f22433r, videoFile);
            C1231g h = C6304b.this.f22404aq;
            StringBuilder sb = new StringBuilder();
            sb.append(App.m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(videoFile.mo19706f());
            h.mo5850a(sb.toString()).mo5837a(aVar.f22432q);
            C6593am.m31915a(aVar.f22430o, C6304b.this.f22393af);
            C6593am.m31914a(aVar.f3157a, C6304b.this.f22393af);
        }

        /* renamed from: b */
        public int mo352b(int i) {
            int i2 = i + 1;
            if (i2 >= C6304b.this.f22396ai && AdNativeManager.m26112a(C6304b.this.f22406c)) {
                if (i2 % C6304b.this.f22396ai == 0) {
                    return AdNativeManager.f18772a;
                }
                i = AdNativeManager.m26106a(C6304b.this.f22406c, i);
                ((VideoFile) C6304b.this.f22412i.get(i)).mo19700c().ordinal();
            }
            return ((VideoFile) C6304b.this.f22412i.get(i)).mo19700c().ordinal();
        }
    }

    /* renamed from: a */
    private void m30671a(Integer num) {
        VideoFile videoFile = (VideoFile) this.f22412i.get(Integer.valueOf(AdNativeManager.m26106a(this.f22406c, num.intValue())).intValue());
        videoFile.mo19695a(Status.DOWNLOADING);
        videoFile.mo19693a(0);
        this.f22400am.mo4332c(num.intValue());
        mo19718a(videoFile, num);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30672a(final Long l) {
        if (mo1318s() != null && l.intValue() != -1) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C6304b.this.f22400am != null) {
                        String str = (String) C6304b.f22391b.get(l);
                        int m = ((LinearLayoutManager) C6304b.this.f22401an).mo4108m();
                        int o = ((LinearLayoutManager) C6304b.this.f22401an).mo4110o();
                        while (true) {
                            Integer valueOf = Integer.valueOf(m);
                            if (valueOf.intValue() <= o) {
                                if (valueOf.intValue() >= 0 && C6304b.this.f22400am.mo352b(valueOf.intValue()) != AdNativeManager.f18772a) {
                                    int a = AdNativeManager.m26106a(C6304b.this.f22406c, valueOf.intValue());
                                    if (a < C6304b.this.f22412i.size() && ((VideoFile) C6304b.this.f22412i.get(a)).mo19697b().equalsIgnoreCase(str)) {
                                        C6304b.this.f22400am.mo4332c(valueOf.intValue());
                                        return;
                                    }
                                }
                                m = valueOf.intValue() + 1;
                            } else {
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30673a(ArrayList<Integer> arrayList) {
        m30695d();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m30671a((Integer) it.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30674a(List<VideoFile> list) {
        if (list != null) {
            m30675a(m30686b());
            for (VideoFile videoFile : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22407d);
                sb.append(videoFile.mo19697b());
                sb.append('_');
                sb.append(videoFile.mo19708g());
                videoFile.mo19701c(sb.toString());
                if (m30696d(videoFile.mo19702d())) {
                    videoFile.mo19695a(Status.LOCAL);
                }
            }
            for (VideoFile videoFile2 : list) {
                if (f22391b.containsValue(videoFile2.mo19697b())) {
                    videoFile2.mo19695a(Status.DOWNLOADING);
                }
            }
        }
    }

    /* renamed from: a */
    private void m30675a(long[] jArr) {
        if (jArr.length > 0) {
            DownloadManager downloadManager = (DownloadManager) mo1318s().getSystemService("download");
            Query query = new Query();
            query.setFilterById(jArr);
            Cursor query2 = downloadManager.query(query);
            while (query2.moveToNext()) {
                long j = query2.getLong(query2.getColumnIndex("status"));
                long j2 = query2.getLong(query2.getColumnIndex("_id"));
                if (j == 16) {
                    downloadManager.remove(new long[]{j2});
                    f22391b.remove(Integer.valueOf(new Long(j2).intValue()));
                }
                if (j == 8) {
                    f22391b.remove(Integer.valueOf(new Long(j2).intValue()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m30676a(long j) {
        String str = (String) f22391b.get(new Long(j));
        for (VideoFile videoFile : this.f22412i) {
            if (videoFile.mo19697b().equalsIgnoreCase(str)) {
                videoFile.mo19695a(Status.LOCAL);
                return true;
            }
        }
        return false;
    }

    /* renamed from: as */
    private void m30678as() {
        if (this.f22412i != null) {
            int size = this.f22412i.size();
            ArrayList arrayList = new ArrayList(0);
            for (int i = 0; i < size; i++) {
                if (((VideoFile) this.f22412i.get(i)).mo19700c() == Status.ONLINE) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            ArrayList arrayList2 = new ArrayList(0);
            int a = this.f22400am.mo342a();
            for (int i2 = 0; i2 < a; i2++) {
                if (this.f22400am.mo352b(i2) != AdNativeManager.f18772a) {
                    Integer valueOf = Integer.valueOf(AdNativeManager.m26106a(this.f22406c, i2));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (valueOf == ((Integer) it.next())) {
                                arrayList2.add(Integer.valueOf(i2));
                                ((VideoFile) this.f22412i.get(valueOf.intValue())).mo19698b(i2);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            m30683b(arrayList2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30682b(Integer num) {
        String d = ((VideoFile) this.f22412i.get(AdNativeManager.m26106a(this.f22406c, num.intValue()))).mo19702d();
        try {
            if (C6731c.m32477e(d).equalsIgnoreCase("pdf")) {
                C6647z.m32113a(d, mo1318s(), this.f22395ah);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri a = C6598aq.m31937a(new File(d));
            intent.setDataAndType(a, m30701f(a.toString()));
            intent.setFlags(1);
            if (mo1318s() != null) {
                mo1318s().startActivity(intent);
            }
        } catch (Exception e) {
            String str = f22390a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error opening file: ");
            sb.append(d);
            Log.e(str, sb.toString(), e);
            C0367h s = mo1318s();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo1320t().getString(C5462k.videolist_error_title));
            sb2.append(e.getMessage());
            Toast.makeText(s, sb2.toString(), 1).show();
        }
    }

    /* renamed from: b */
    private void m30683b(ArrayList<Integer> arrayList) {
        long c = m30687c(arrayList);
        this.f22394ag = arrayList;
        if (!C6612h.m31985a(mo1318s(), 0) || c < 52428800) {
            m30673a(this.f22394ag);
            return;
        }
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.warning), String.format(mo1219a(C5462k.videolist_download_warning_message), new Object[]{String.format("%.1f", new Object[]{Float.valueOf((((float) c) / 1024.0f) / 1024.0f)})}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C6304b.this.m30673a(C6304b.this.f22394ag);
            }
        }, mo1219a(C5462k.f19438OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.cancel));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m30684b(long j) {
        String str = (String) f22391b.get(new Long(j));
        for (VideoFile videoFile : this.f22412i) {
            if (videoFile.mo19697b().equalsIgnoreCase(str)) {
                videoFile.mo19695a(Status.ONLINE);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private long[] m30686b() {
        int length = f22391b.keySet().toArray().length;
        Long[] lArr = (Long[]) f22391b.keySet().toArray(new Long[length]);
        long[] jArr = new long[length];
        int length2 = lArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = i2 + 1;
            jArr[i2] = lArr[i].longValue();
            i++;
            i2 = i3;
        }
        return jArr;
    }

    /* renamed from: c */
    private long m30687c(ArrayList<Integer> arrayList) {
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            Integer valueOf = Integer.valueOf(AdNativeManager.m26106a(this.f22406c, ((Integer) it.next()).intValue()));
            if (valueOf.intValue() < arrayList.size()) {
                j += ((VideoFile) this.f22412i.get(valueOf.intValue())).mo19710h();
            }
        }
        return j;
    }

    /* renamed from: c */
    private void m30689c() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f22395ah = (OpenPdfOptions) m.getParcelable("OPEN_PDF_OPTIONS_KEY");
            this.f22393af = m.getBundle("PAGE_STYLE");
            C6593am.m31914a((View) this.f22399al, this.f22393af);
            SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter('.');
            this.f22409f = m.getString("PAGE_ID_KEY");
            simpleStringSplitter.setString(this.f22409f);
            Iterator it = simpleStringSplitter.iterator();
            if (it.hasNext()) {
                this.f22410g = (String) it.next();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22409f);
            sb.append(".xml");
            this.f22411h = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(App.m25659j());
            sb2.append('/');
            sb2.append(this.f22410g);
            sb2.append('/');
            this.f22407d = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getDataDirectory().getAbsolutePath());
            sb3.append('/');
            sb3.append(this.f22410g);
            sb3.append('/');
            this.f22408e = sb3.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30691c(final Integer num) {
        this.f22392ae = num.intValue();
        final int a = AdNativeManager.m26106a(this.f22406c, num.intValue());
        VideoFile videoFile = (VideoFile) this.f22412i.get(a);
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.info), String.format(mo1219a(C5462k.videolist_delete_file_message), new Object[]{videoFile.mo19692a()}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VideoFile videoFile = (VideoFile) C6304b.this.f22412i.get(a);
                if (new File(videoFile.mo19702d()).delete()) {
                    videoFile.mo19695a(Status.ONLINE);
                    C6304b.this.f22400am.mo4332c(num.intValue());
                    return;
                }
                String str = C6304b.f22390a;
                StringBuilder sb = new StringBuilder();
                sb.append(C6304b.this.mo1320t().getString(C5462k.videolist_cannot_delete_file_error_message));
                sb.append(videoFile.mo19702d());
                Log.e(str, sb.toString());
            }
        }, mo1219a(C5462k.f19438OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.cancel));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30692c(String str) {
        if (f22391b.containsValue(str)) {
            for (Long l : f22391b.keySet()) {
                if (((String) f22391b.get(l)).equalsIgnoreCase(str)) {
                    ((DownloadManager) mo1318s().getSystemService("download")).remove(new long[]{l.longValue()});
                    f22391b.remove(l);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30694d(final Integer num) {
        int a = AdNativeManager.m26106a(this.f22406c, num.intValue());
        this.f22392ae = a;
        VideoFile videoFile = (VideoFile) this.f22412i.get(a);
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.warning), String.format(mo1219a(C5462k.videolist_cancel_downloading_message), new Object[]{videoFile.mo19692a()}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                VideoFile videoFile = (VideoFile) C6304b.this.f22412i.get(C6304b.this.f22392ae);
                if (videoFile.mo19700c() != Status.LOCAL) {
                    videoFile.mo19695a(Status.ONLINE);
                    videoFile.mo19693a(0);
                    C6304b.this.m30692c(videoFile.mo19697b());
                    C6304b.this.f22400am.mo4332c(num.intValue());
                }
            }
        }, mo1219a(C5462k.yes), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.f19440no));
    }

    /* renamed from: d */
    private boolean m30695d() {
        if (mo1318s() == null) {
            return false;
        }
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.compareTo("shared") == 0) {
            Toast.makeText(mo1318s(), mo1320t().getString(C5462k.videolist_mass_storage_is_shared_message), 1).show();
            return false;
        } else if (externalStorageState.compareTo("removed") != 0) {
            return App.m25663l() && m30698e(this.f22407d).exists();
        } else {
            if (!m30698e(this.f22408e).exists()) {
                return false;
            }
            this.f22407d = this.f22408e;
            return true;
        }
    }

    /* renamed from: d */
    private boolean m30696d(String str) {
        return new File(str).isFile();
    }

    /* renamed from: e */
    private File m30698e(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30699e() {
        if (this.f22400am != null) {
            this.f22400am = null;
        }
        if (this.f22399al != null) {
            this.f22399al.setAdapter(null);
        }
        this.f22400am = new C6316a();
        this.f22399al.setAdapter(this.f22400am);
        this.f22398ak.setVisibility(4);
        this.f22399al.setVisibility(0);
        if (this.f22397aj) {
            this.f22406c = AdNativeManager.m26110a(mo1318s(), this.f22400am, App.f18501c.mo16931aa(), this.f22396ai);
        }
        if (this.f22400am != null) {
            this.f22400am.mo4324a((C0928c) new C0928c() {
                /* renamed from: a */
                public void mo4340a() {
                    C6304b.this.mo20292ay();
                    super.mo4340a();
                }

                /* renamed from: a */
                public void mo4342a(int i, int i2, Object obj) {
                    C6304b.this.mo20292ay();
                    super.mo4341a(i, i2);
                }
            });
        }
        mo20292ay();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30700e(int i) {
        m30695d();
        ArrayList arrayList = new ArrayList(0);
        arrayList.add(Integer.valueOf(i));
        m30683b(arrayList);
    }

    /* renamed from: f */
    private String m30701f(String str) {
        return URLConnection.guessContentTypeFromName(str);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        mo1318s().registerReceiver(this.f22405ar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (mo1318s() != null && this.f22405ar != null) {
            mo1318s().unregisterReceiver(this.f22405ar);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f22402ao != null) {
            this.f22402ao.cancel(true);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_videofilelist, viewGroup, false);
        this.f22398ak = (ProgressBar) frameLayout.findViewById(C5458g.progressBar_videolist);
        this.f22399al = (RecyclerView) frameLayout.findViewById(C5458g.videolist_recycle_view);
        this.f22399al.setHasFixedSize(true);
        this.f22401an = new LinearLayoutManager(mo1318s());
        this.f22399al.setLayoutManager(this.f22401an);
        m30689c();
        C63051 r7 = new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                C6304b.this.f22412i = (List) obj;
                C6304b.this.m30674a(C6304b.this.f22412i);
                C6304b.this.m30699e();
            }
        };
        this.f22402ao = new C6303a();
        this.f22402ao.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{this.f22411h, r7});
        return frameLayout;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f22404aq = C1186c.m6451a((Fragment) this);
        this.f22403ap = ColorStateList.valueOf(mo20291ax().mo17546c(mo1318s()));
        this.f22412i = new ArrayList(0);
        mo20292ay();
        Bundle m = mo1307m();
        if (m != null) {
            this.f22397aj = m.getBoolean("PAGE_SUPPORT_NATIVE_ADS");
            this.f22396ai = m.getInt("PAGE_NATIVE_ADS_ROW_NUMBER");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0 != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r6.findItem(com.seattleclouds.C5451m.C5458g.videolist_download_all_files).setVisible(false);
        super.mo1239a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r1 != false) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1239a(android.view.Menu r6) {
        /*
            r5 = this;
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r0 = r5.f22412i
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0034
            r0 = 0
        L_0x0007:
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r3 = r5.f22412i
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r3 = r5.f22412i
            java.lang.Object r3 = r3.get(r0)
            com.seattleclouds.modules.videolist.VideoFile r3 = (com.seattleclouds.modules.videolist.VideoFile) r3
            com.seattleclouds.modules.videolist.VideoFile$Status r3 = r3.mo19700c()
            com.seattleclouds.modules.videolist.VideoFile$Status r4 = com.seattleclouds.modules.videolist.VideoFile.Status.DOWNLOADING
            if (r3 != r4) goto L_0x0021
            r0 = 1
            goto L_0x0025
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x0007
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0034
        L_0x0027:
            int r0 = com.seattleclouds.C5451m.C5458g.videolist_download_all_files
            android.view.MenuItem r0 = r6.findItem(r0)
            r0.setVisible(r2)
            super.mo1239a(r6)
            return
        L_0x0034:
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r0 = r5.f22412i
            if (r0 == 0) goto L_0x0059
            r0 = 0
        L_0x0039:
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r3 = r5.f22412i
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0056
            java.util.List<com.seattleclouds.modules.videolist.VideoFile> r3 = r5.f22412i
            java.lang.Object r3 = r3.get(r0)
            com.seattleclouds.modules.videolist.VideoFile r3 = (com.seattleclouds.modules.videolist.VideoFile) r3
            com.seattleclouds.modules.videolist.VideoFile$Status r3 = r3.mo19700c()
            com.seattleclouds.modules.videolist.VideoFile$Status r4 = com.seattleclouds.modules.videolist.VideoFile.Status.LOCAL
            if (r3 == r4) goto L_0x0053
            r1 = 0
            goto L_0x0056
        L_0x0053:
            int r0 = r0 + 1
            goto L_0x0039
        L_0x0056:
            if (r1 == 0) goto L_0x0059
            goto L_0x0027
        L_0x0059:
            super.mo1239a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.videolist.C6304b.mo1239a(android.view.Menu):void");
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.videolist_menu, menu);
    }

    /* renamed from: a */
    public void mo19718a(VideoFile videoFile, Integer num) {
        if (mo1318s() != null) {
            Request request = new Request(Uri.parse(videoFile.mo19704e()));
            request.setAllowedNetworkTypes(3);
            request.setNotificationVisibility(1);
            request.setTitle(videoFile.mo19708g());
            request.setVisibleInDownloadsUi(true);
            request.setDestinationUri(Uri.fromFile(new File(videoFile.mo19702d())));
            f22391b.put(new Long(((DownloadManager) mo1318s().getSystemService("download")).enqueue(request)), videoFile.mo19697b());
            this.f22400am.mo4332c(num.intValue());
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.videolist_download_all_files) {
            return super.mo1245a(menuItem);
        }
        m30678as();
        return true;
    }
}
