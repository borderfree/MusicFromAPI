package com.seattleclouds.modules.dropbox.medialist;

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
import com.seattleclouds.modules.dropbox.medialist.MediaFile.MediaFileStatus;
import com.seattleclouds.modules.videolist.OpenPdfOptions;
import com.seattleclouds.modules.videolist.VideoFile.Status;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.C6617k;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6647z;
import java.io.File;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.commons.p198io.C6731c;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.dropbox.medialist.c */
public class C5537c extends C6557s {

    /* renamed from: a */
    static HashMap<Long, String> f19710a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f19711c = "c";
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public List<MediaFile> f19712ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public JSONObject f19713af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public int f19714ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public ArrayList<Integer> f19715ah = null;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public Bundle f19716ai;

    /* renamed from: aj */
    private OpenPdfOptions f19717aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public int f19718ak;

    /* renamed from: al */
    private boolean f19719al = false;

    /* renamed from: am */
    private ProgressBar f19720am;

    /* renamed from: an */
    private RecyclerView f19721an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public C0926a f19722ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public C0937i f19723ap;

    /* renamed from: aq */
    private C5535a f19724aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public C1231g f19725ar;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public ColorStateList f19726as;

    /* renamed from: at */
    private BroadcastReceiver f19727at = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (C5537c.this.mo1318s() != null) {
                long longExtra = intent.getLongExtra("extra_download_id", -1);
                String action = intent.getAction();
                if (longExtra != -1 && action.equalsIgnoreCase("android.intent.action.DOWNLOAD_COMPLETE") && C5537c.f19710a.containsKey(Long.valueOf(longExtra))) {
                    Query query = new Query();
                    query.setFilterById(new long[]{longExtra});
                    DownloadManager downloadManager = (DownloadManager) C5537c.this.mo1318s().getSystemService("download");
                    Cursor query2 = downloadManager.query(query);
                    Long valueOf = Long.valueOf(-1);
                    boolean z = false;
                    while (query2.moveToNext()) {
                        int i = query2.getInt(query2.getColumnIndex("status"));
                        if (i == 16) {
                            if (C5537c.this.m27560b(longExtra)) {
                                downloadManager.remove(new long[]{longExtra});
                            }
                        } else if (i == 8) {
                            if (!C5537c.this.m27547a(longExtra)) {
                            }
                        }
                        valueOf = Long.valueOf(longExtra);
                        z = true;
                    }
                    query2.close();
                    C5537c.this.m27543a(valueOf);
                    if (z) {
                        C5537c.f19710a.remove(valueOf);
                    }
                }
            }
        }
    };

    /* renamed from: b */
    Object f19728b;

    /* renamed from: d */
    private String f19729d;

    /* renamed from: e */
    private String f19730e;

    /* renamed from: f */
    private String f19731f;

    /* renamed from: g */
    private String f19732g;

    /* renamed from: h */
    private String f19733h;

    /* renamed from: i */
    private String f19734i;

    /* renamed from: com.seattleclouds.modules.dropbox.medialist.c$a */
    public final class C5551a extends C0926a<C5552a> {

        /* renamed from: com.seattleclouds.modules.dropbox.medialist.c$a$a */
        class C5552a extends C0958w {

            /* renamed from: n */
            LinearLayout f19752n;

            /* renamed from: o */
            TextView f19753o;

            /* renamed from: p */
            TextView f19754p;

            /* renamed from: q */
            ImageView f19755q;

            /* renamed from: r */
            ImageView f19756r;

            /* renamed from: s */
            ProgressBar f19757s;

            /* renamed from: t */
            TextView f19758t;

            C5552a(View view) {
                super(view);
                this.f19753o = (TextView) view.findViewById(C5458g.file_name);
                this.f19754p = (TextView) view.findViewById(C5458g.dropbox_file_info);
                this.f19755q = (ImageView) view.findViewById(C5458g.file_image);
                this.f19756r = (ImageView) view.findViewById(C5458g.dropbox_file_status_badge);
                this.f19757s = (ProgressBar) view.findViewById(C5458g.video_file_progressBar);
                this.f19758t = (TextView) view.findViewById(C5458g.file_download_progress_info);
                this.f19752n = (LinearLayout) view.findViewById(C5458g.linear_layout_ads);
                if (this.f19752n != null) {
                    this.f19752n.setLayoutParams(new LayoutParams(-1, C6619m.m32014a(C5537c.this.mo1318s(), (float) App.f18501c.mo16931aa())));
                    return;
                }
                this.f3157a.setOnClickListener(new OnClickListener(C5551a.this) {
                    public void onClick(View view) {
                        int e = C5552a.this.mo4585e();
                        MediaFile mediaFile = (MediaFile) C5537c.this.f19712ae.get(AdNativeManager.m26106a(C5537c.this.f19728b, e));
                        switch (mediaFile.mo17919a()) {
                            case ONLINE:
                                C5537c.this.m27574e(e);
                                return;
                            case DOWNLOADING:
                                C5537c.this.m27570d(Integer.valueOf(e));
                                return;
                            case LOCAL:
                                C5537c.this.m27559b(Integer.valueOf(e));
                                return;
                            default:
                                return;
                        }
                    }
                });
                this.f3157a.setOnLongClickListener(new OnLongClickListener(C5551a.this) {
                    public boolean onLongClick(View view) {
                        int e = C5552a.this.mo4585e();
                        if (C55465.f19745a[((MediaFile) C5537c.this.f19712ae.get(AdNativeManager.m26106a(C5537c.this.f19728b, e))).mo17919a().ordinal()] != 3) {
                            return false;
                        }
                        C5537c.this.m27565c(Integer.valueOf(e));
                        return true;
                    }
                });
            }
        }

        public C5551a() {
        }

        /* renamed from: a */
        private void m27593a(ImageView imageView, MediaFile mediaFile) {
            imageView.setImageResource(mediaFile.mo17919a() == MediaFileStatus.ONLINE ? C5457f.ic_cloud_file_download_alpha : C5457f.ic_cloud_done_alpha);
            C5334b.m26761a(C5537c.this.f19726as, imageView);
        }

        /* renamed from: a */
        public int mo342a() {
            if (C5537c.this.f19712ae == null) {
                return 0;
            }
            return AdNativeManager.m26113b(C5537c.this.f19728b, C5537c.this.f19712ae.size());
        }

        /* renamed from: a */
        public C5552a mo353b(ViewGroup viewGroup, int i) {
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
            return new C5552a(from.inflate(i2, viewGroup, false));
        }

        /* renamed from: a */
        public void mo350a(C5552a aVar, int i) {
            if (aVar.mo4588h() == AdNativeManager.f18772a) {
                aVar.f19752n.removeAllViews();
                aVar.f19752n.addView(AdNativeManager.m26107a(C5537c.this.f19728b, i, mo352b(i)));
                return;
            }
            MediaFile mediaFile = (MediaFile) C5537c.this.f19712ae.get(AdNativeManager.m26106a(C5537c.this.f19728b, i));
            mediaFile.mo17926b(i);
            if (mediaFile.mo17919a() == MediaFileStatus.DOWNLOADING) {
                aVar.f19753o.setText(mediaFile.mo17940j());
                aVar.f19757s.setProgress(mediaFile.mo17928c());
                aVar.f19757s.setProgress(mediaFile.mo17928c());
                aVar.f19757s.setIndeterminate(true);
                aVar.f19758t.setText(C5462k.dropbox_medialist_downloading_message);
            } else {
                aVar.f19753o.setText(mediaFile.mo17940j());
                aVar.f19754p.setText(String.format("%1$s, %2$s", new Object[]{mediaFile.mo17937g(), mediaFile.mo17942l()}));
                m27593a(aVar.f19756r, mediaFile);
            }
            C1231g h = C5537c.this.f19725ar;
            StringBuilder sb = new StringBuilder();
            sb.append(App.m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(mediaFile.mo17933e());
            h.mo5850a(sb.toString()).mo5837a(aVar.f19755q);
            C6593am.m31915a(aVar.f19753o, C5537c.this.f19716ai);
            C6593am.m31914a(aVar.f3157a, C5537c.this.f19716ai);
        }

        /* renamed from: b */
        public int mo352b(int i) {
            int i2 = i + 1;
            if (i2 >= C5537c.this.f19718ak && AdNativeManager.m26112a(C5537c.this.f19728b)) {
                if (i2 % C5537c.this.f19718ak == 0) {
                    return AdNativeManager.f18772a;
                }
                i = AdNativeManager.m26106a(C5537c.this.f19728b, i);
                ((MediaFile) C5537c.this.f19712ae.get(i)).mo17919a().ordinal();
            }
            return ((MediaFile) C5537c.this.f19712ae.get(i)).mo17919a().ordinal();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27535a(MediaFile mediaFile, Integer num) {
        if (mo1318s() != null) {
            Request request = new Request(Uri.parse(mediaFile.mo17931d()));
            request.setAllowedNetworkTypes(3);
            request.setNotificationVisibility(1);
            request.setTitle(mediaFile.mo17935f());
            request.setVisibleInDownloadsUi(true);
            request.setDestinationUri(Uri.fromFile(new File(mediaFile.mo17925b())));
            f19710a.put(new Long(((DownloadManager) mo1318s().getSystemService("download")).enqueue(request)), mediaFile.mo17941k());
            this.f19722ao.mo4332c(num.intValue());
        }
    }

    /* renamed from: a */
    private void m27542a(final Integer num) {
        MediaFile mediaFile = (MediaFile) this.f19712ae.get(Integer.valueOf(AdNativeManager.m26106a(this.f19728b, num.intValue())).intValue());
        mediaFile.mo17922a(MediaFileStatus.DOWNLOADING);
        mediaFile.mo17921a(0);
        this.f19722ao.mo4332c(num.intValue());
        try {
            C55381 r2 = new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    MediaFile mediaFile = (MediaFile) MediaFile.class.cast(obj);
                    if (mediaFile.mo17931d() == null) {
                        Toast.makeText(C5537c.this.mo1318s(), C5537c.this.mo1320t().getString(C5462k.dropbox_medialist_wrong_url_error_message), 0).show();
                        mediaFile.mo17922a(MediaFileStatus.LOCAL);
                        C5537c.this.f19722ao.mo4332c(num.intValue());
                        return;
                    }
                    C5537c.this.m27535a(mediaFile, num);
                }
            };
            new C5555d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{mediaFile, this.f19713af.getString("tokenid"), r2});
        } catch (Exception e) {
            String str = f19711c;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27543a(final Long l) {
        if (mo1318s() != null && l.intValue() != -1) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    if (C5537c.this.f19722ao != null) {
                        String str = (String) C5537c.f19710a.get(l);
                        int m = ((LinearLayoutManager) C5537c.this.f19723ap).mo4108m();
                        int o = ((LinearLayoutManager) C5537c.this.f19723ap).mo4110o();
                        while (true) {
                            Integer valueOf = Integer.valueOf(m);
                            if (valueOf.intValue() <= o) {
                                if (valueOf.intValue() >= 0 && C5537c.this.f19722ao.mo352b(valueOf.intValue()) != AdNativeManager.f18772a) {
                                    int a = AdNativeManager.m26106a(C5537c.this.f19728b, valueOf.intValue());
                                    if (a < C5537c.this.f19712ae.size() && ((MediaFile) C5537c.this.f19712ae.get(a)).mo17941k().equalsIgnoreCase(str)) {
                                        C5537c.this.f19722ao.mo4332c(valueOf.intValue());
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
    public void m27544a(ArrayList<Integer> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m27542a((Integer) it.next());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27545a(List<MediaFile> list) {
        if (list != null) {
            m27546a(m27551as());
            for (MediaFile mediaFile : list) {
                if (m27548a(mediaFile)) {
                    mediaFile.mo17922a(MediaFileStatus.LOCAL);
                }
                mediaFile.mo17923a(String.format("%1$s%2$s", new Object[]{this.f19729d, mediaFile.mo17940j()}));
            }
            for (MediaFile mediaFile2 : list) {
                if (f19710a.containsValue(mediaFile2.mo17941k())) {
                    mediaFile2.mo17922a(MediaFileStatus.DOWNLOADING);
                }
            }
        }
    }

    /* renamed from: a */
    private void m27546a(long[] jArr) {
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
                    f19710a.remove(Integer.valueOf(new Long(j2).intValue()));
                }
                if (j == 8) {
                    f19710a.remove(Integer.valueOf(new Long(j2).intValue()));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m27547a(long j) {
        String str = (String) f19710a.get(new Long(j));
        for (MediaFile mediaFile : this.f19712ae) {
            if (mediaFile.mo17941k().equalsIgnoreCase(str)) {
                mediaFile.mo17922a(MediaFileStatus.LOCAL);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m27548a(MediaFile mediaFile) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19729d);
        sb.append(mediaFile.mo17935f());
        return new File(sb.toString()).exists();
    }

    /* renamed from: aA */
    private void m27550aA() {
        C55454 r0 = new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                HashMap hashMap = (HashMap) obj;
                if (hashMap.containsKey("KEY_FILES")) {
                    C5537c.this.f19712ae = (List) hashMap.get("KEY_FILES");
                }
                if (hashMap.containsKey("KEY_JSON_CONFIG")) {
                    C5537c.this.f19713af = (JSONObject) hashMap.get("KEY_JSON_CONFIG");
                }
                C5537c.this.m27545a(C5537c.this.f19712ae);
                C5537c.this.m27573e();
            }
        };
        this.f19724aq = new C5535a();
        C5535a aVar = this.f19724aq;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19729d);
        sb.append(this.f19734i);
        aVar.executeOnExecutor(executor, new Object[]{sb.toString(), this.f19733h, Integer.valueOf(101), r0, this.f19731f});
    }

    /* renamed from: as */
    private long[] m27551as() {
        int length = f19710a.keySet().toArray().length;
        Long[] lArr = (Long[]) f19710a.keySet().toArray(new Long[length]);
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

    /* renamed from: at */
    private void m27552at() {
        if (this.f19712ae != null) {
            int size = this.f19712ae.size();
            ArrayList arrayList = new ArrayList(0);
            for (int i = 0; i < size; i++) {
                if (((MediaFile) this.f19712ae.get(i)).mo17919a() == MediaFileStatus.ONLINE) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            ArrayList arrayList2 = new ArrayList(0);
            int a = this.f19722ao.mo342a();
            for (int i2 = 0; i2 < a; i2++) {
                if (this.f19722ao.mo352b(i2) != AdNativeManager.f18772a) {
                    Integer valueOf = Integer.valueOf(AdNativeManager.m26106a(this.f19728b, i2));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Integer num = (Integer) it.next();
                        if (valueOf == num) {
                            arrayList2.add(Integer.valueOf(i2));
                            ((MediaFile) this.f19712ae.get(num.intValue())).mo17926b(AdNativeManager.m26106a(this.f19728b, i2));
                            break;
                        }
                    }
                }
            }
            m27567c(arrayList2);
        }
    }

    /* renamed from: az */
    private void m27553az() {
        C55443 r0 = new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                HashMap hashMap = (HashMap) obj;
                if (hashMap != null) {
                    if (hashMap.containsKey("KEY_FILES")) {
                        C5537c.this.f19712ae = (List) hashMap.get("KEY_FILES");
                    }
                    if (hashMap.containsKey("KEY_JSON_CONFIG")) {
                        C5537c.this.f19713af = (JSONObject) hashMap.get("KEY_JSON_CONFIG");
                    }
                    C5537c.this.m27545a(C5537c.this.f19712ae);
                    C5537c.this.m27573e();
                }
            }
        };
        this.f19724aq = new C5535a();
        C5535a aVar = this.f19724aq;
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19729d);
        sb.append(this.f19734i);
        aVar.executeOnExecutor(executor, new Object[]{sb.toString(), this.f19733h, Integer.valueOf(100), r0, this.f19731f});
    }

    /* renamed from: b */
    private long m27554b(ArrayList<Integer> arrayList) {
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            Integer valueOf = Integer.valueOf(AdNativeManager.m26106a(this.f19728b, ((Integer) it.next()).intValue()));
            if (valueOf.intValue() < arrayList.size()) {
                j += ((MediaFile) this.f19712ae.get(valueOf.intValue())).mo17939i();
            }
        }
        return j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27559b(Integer num) {
        String b = ((MediaFile) this.f19712ae.get(AdNativeManager.m26106a(this.f19728b, num.intValue()))).mo17925b();
        if (C6731c.m32477e(b).equalsIgnoreCase("pdf")) {
            C6647z.m32113a(b, mo1318s(), this.f19717aj);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            Uri a = C6598aq.m31937a(new File(b));
            intent.setDataAndType(a, URLConnection.guessContentTypeFromName(a.toString()));
            intent.setFlags(1);
            if (mo1318s() != null) {
                mo1318s().startActivity(intent);
            }
        } catch (Exception e) {
            String str = f19711c;
            StringBuilder sb = new StringBuilder();
            sb.append("Error opening file: ");
            sb.append(b);
            Log.e(str, sb.toString(), e);
            Context q = mo1316q();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo1320t().getString(C5462k.dropbox_medialist_error_title));
            sb2.append(e.getMessage());
            Toast.makeText(q, sb2.toString(), 1).show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m27560b(long j) {
        String str = (String) f19710a.get(new Long(j));
        for (MediaFile mediaFile : this.f19712ae) {
            if (mediaFile.mo17941k().equalsIgnoreCase(str)) {
                mediaFile.mo17922a(MediaFileStatus.ONLINE);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m27563c() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19717aj = (OpenPdfOptions) m.getParcelable("OPEN_PDF_OPTIONS_KEY");
            this.f19716ai = m.getBundle("PAGE_STYLE");
            C6593am.m31914a((View) this.f19721an, this.f19716ai);
            SimpleStringSplitter simpleStringSplitter = new SimpleStringSplitter('.');
            this.f19731f = m.getString("PAGE_ID_KEY");
            simpleStringSplitter.setString(this.f19731f);
            Iterator it = simpleStringSplitter.iterator();
            if (it.hasNext()) {
                this.f19732g = (String) it.next();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f19731f);
            sb.append("conf.json");
            this.f19733h = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f19731f);
            sb2.append("dropboxfiles.json");
            this.f19734i = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(App.m25659j());
            sb3.append('/');
            sb3.append(this.f19732g);
            sb3.append('/');
            this.f19729d = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Environment.getDataDirectory().getAbsolutePath());
            sb4.append('/');
            sb4.append(this.f19732g);
            sb4.append('/');
            this.f19730e = sb4.toString();
            m27571d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27565c(Integer num) {
        this.f19714ag = num.intValue();
        final int a = AdNativeManager.m26106a(this.f19728b, num.intValue());
        MediaFile mediaFile = (MediaFile) this.f19712ae.get(a);
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.info), String.format(mo1219a(C5462k.dropbox_medialist_delete_file_message), new Object[]{mediaFile.mo17940j()}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MediaFile mediaFile = (MediaFile) C5537c.this.f19712ae.get(a);
                if (!new File(mediaFile.mo17925b()).delete()) {
                    String b = C5537c.f19711c;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" ERROR deleting file:");
                    sb.append(mediaFile.mo17925b());
                    Log.e(b, sb.toString());
                }
                mediaFile.mo17922a(MediaFileStatus.ONLINE);
                C5537c.this.f19722ao.mo4332c(C5537c.this.f19714ag);
            }
        }, mo1219a(C5462k.f19438OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.cancel));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27566c(String str) {
        if (f19710a.containsValue(str)) {
            for (Long l : f19710a.keySet()) {
                if (((String) f19710a.get(l)).equalsIgnoreCase(str)) {
                    ((DownloadManager) mo1318s().getSystemService("download")).remove(new long[]{l.longValue()});
                    f19710a.remove(l);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m27567c(ArrayList<Integer> arrayList) {
        long b = m27554b(arrayList);
        this.f19715ah = arrayList;
        if (!C6612h.m31985a(mo1318s(), 0) || b < 52428800) {
            m27544a(this.f19715ah);
            return;
        }
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.warning), String.format(mo1219a(C5462k.dropbox_medialist_download_warning_message), new Object[]{String.format("%.1f", new Object[]{Float.valueOf((((float) b) / 1024.0f) / 1024.0f)})}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5537c.this.m27544a(C5537c.this.f19715ah);
            }
        }, mo1219a(C5462k.f19438OK), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.cancel));
    }

    /* renamed from: d */
    private File m27568d(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m27570d(Integer num) {
        int a = AdNativeManager.m26106a(this.f19728b, num.intValue());
        this.f19714ag = a;
        MediaFile mediaFile = (MediaFile) this.f19712ae.get(a);
        C6620n.m32037a((Context) mo1318s(), mo1219a(C5462k.warning), String.format(mo1219a(C5462k.dropbox_medialist_cancel_downloading_message), new Object[]{mediaFile.mo17940j()}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                MediaFile mediaFile = (MediaFile) C5537c.this.f19712ae.get(C5537c.this.f19714ag);
                if (mediaFile.mo17919a() != MediaFileStatus.LOCAL) {
                    mediaFile.mo17922a(MediaFileStatus.ONLINE);
                    C5537c.this.f19722ao.mo4332c(C5537c.this.f19714ag);
                    C5537c.this.m27566c(mediaFile.mo17941k());
                }
            }
        }, mo1219a(C5462k.yes), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1219a(C5462k.f19440no));
    }

    /* renamed from: d */
    private boolean m27571d() {
        if (mo1318s() == null) {
            return false;
        }
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.compareTo("shared") == 0) {
            Toast.makeText(mo1318s(), mo1320t().getString(C5462k.dropbox_medialist_mass_storage_is_shared_message), 1).show();
            return false;
        } else if (externalStorageState.compareTo("removed") != 0) {
            return App.m25663l() && m27568d(this.f19729d).exists();
        } else {
            if (!m27568d(this.f19730e).exists()) {
                return false;
            }
            this.f19729d = this.f19730e;
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27573e() {
        if (this.f19722ao != null) {
            this.f19722ao = null;
        }
        if (this.f19721an != null) {
            this.f19721an.setAdapter(null);
        }
        this.f19722ao = new C5551a();
        this.f19721an.setAdapter(this.f19722ao);
        this.f19720am.setVisibility(4);
        this.f19721an.setVisibility(0);
        if (this.f19719al) {
            this.f19728b = AdNativeManager.m26110a(mo1318s(), this.f19722ao, App.f18501c.mo16931aa(), this.f19718ak);
        }
        if (this.f19722ao != null) {
            this.f19722ao.mo4324a((C0928c) new C0928c() {
                /* renamed from: a */
                public void mo4340a() {
                    C5537c.this.mo20292ay();
                    super.mo4340a();
                }

                /* renamed from: a */
                public void mo4342a(int i, int i2, Object obj) {
                    C5537c.this.mo20292ay();
                    super.mo4341a(i, i2);
                }
            });
        }
        mo20292ay();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27574e(int i) {
        ArrayList arrayList = new ArrayList(0);
        arrayList.add(Integer.valueOf(i));
        m27567c(arrayList);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        mo1318s().registerReceiver(this.f19727at, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (mo1318s() != null && this.f19727at != null) {
            mo1318s().unregisterReceiver(this.f19727at);
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f19724aq != null) {
            this.f19724aq.cancel(true);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_dropboxfilelist, viewGroup, false);
        this.f19720am = (ProgressBar) frameLayout.findViewById(C5458g.progressBar_dropboxlist);
        this.f19721an = (RecyclerView) frameLayout.findViewById(C5458g.dropbox_recycle_view);
        this.f19721an.setHasFixedSize(true);
        this.f19723ap = new LinearLayoutManager(mo1318s());
        this.f19721an.setLayoutManager(this.f19723ap);
        m27563c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19729d);
        sb.append(this.f19734i);
        if (new File(sb.toString()).exists()) {
            m27550aA();
        } else {
            m27553az();
        }
        String str = f19711c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Media list pageID:");
        sb2.append(this.f19731f);
        sb2.append(" ");
        sb2.append(this.f19732g);
        sb2.append(" directory:");
        sb2.append(this.f19729d);
        C6617k.m32011a(str, false, sb2.toString());
        return frameLayout;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f19726as = ColorStateList.valueOf(mo20291ax().mo17546c(mo1318s()));
        this.f19725ar = C1186c.m6451a((Fragment) this);
        this.f19712ae = new ArrayList(0);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19719al = m.getBoolean("PAGE_SUPPORT_NATIVE_ADS");
            this.f19718ak = m.getInt("PAGE_NATIVE_ADS_ROW_NUMBER");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        if (r0 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        r6.findItem(com.seattleclouds.C5451m.C5458g.dropbox_medialist_download_all_files).setVisible(false);
        super.mo1239a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 != false) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1239a(android.view.Menu r6) {
        /*
            r5 = this;
            super.mo1239a(r6)
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r0 = r5.f19712ae
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r0 = 0
        L_0x000a:
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0027
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            java.lang.Object r3 = r3.get(r0)
            com.seattleclouds.modules.dropbox.medialist.MediaFile r3 = (com.seattleclouds.modules.dropbox.medialist.MediaFile) r3
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r3 = r3.mo17919a()
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r4 = com.seattleclouds.modules.dropbox.medialist.MediaFile.MediaFileStatus.DOWNLOADING
            if (r3 != r4) goto L_0x0024
            r0 = 0
            goto L_0x0028
        L_0x0024:
            int r0 = r0 + 1
            goto L_0x000a
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 != 0) goto L_0x0033
            int r0 = com.seattleclouds.C5451m.C5458g.dropbox_medialist_refresh_files_list
            android.view.MenuItem r0 = r6.findItem(r0)
            r0.setVisible(r2)
        L_0x0033:
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r0 = r5.f19712ae
            if (r0 == 0) goto L_0x0065
            r0 = 0
        L_0x0038:
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0055
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            java.lang.Object r3 = r3.get(r0)
            com.seattleclouds.modules.dropbox.medialist.MediaFile r3 = (com.seattleclouds.modules.dropbox.medialist.MediaFile) r3
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r3 = r3.mo17919a()
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r4 = com.seattleclouds.modules.dropbox.medialist.MediaFile.MediaFileStatus.DOWNLOADING
            if (r3 != r4) goto L_0x0052
            r0 = 1
            goto L_0x0056
        L_0x0052:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0065
        L_0x0058:
            int r0 = com.seattleclouds.C5451m.C5458g.dropbox_medialist_download_all_files
            android.view.MenuItem r0 = r6.findItem(r0)
            r0.setVisible(r2)
            super.mo1239a(r6)
            return
        L_0x0065:
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r0 = r5.f19712ae
            if (r0 == 0) goto L_0x008a
            r0 = 0
        L_0x006a:
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0087
            java.util.List<com.seattleclouds.modules.dropbox.medialist.MediaFile> r3 = r5.f19712ae
            java.lang.Object r3 = r3.get(r0)
            com.seattleclouds.modules.dropbox.medialist.MediaFile r3 = (com.seattleclouds.modules.dropbox.medialist.MediaFile) r3
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r3 = r3.mo17919a()
            com.seattleclouds.modules.dropbox.medialist.MediaFile$MediaFileStatus r4 = com.seattleclouds.modules.dropbox.medialist.MediaFile.MediaFileStatus.LOCAL
            if (r3 == r4) goto L_0x0084
            r1 = 0
            goto L_0x0087
        L_0x0084:
            int r0 = r0 + 1
            goto L_0x006a
        L_0x0087:
            if (r1 == 0) goto L_0x008a
            goto L_0x0058
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dropbox.medialist.C5537c.mo1239a(android.view.Menu):void");
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.dropbox_menu, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.dropbox_medialist_refresh_files_list) {
            m27553az();
            return true;
        } else if (itemId != C5458g.dropbox_medialist_download_all_files) {
            return super.mo1245a(menuItem);
        } else {
            m27552at();
            return true;
        }
    }
}
