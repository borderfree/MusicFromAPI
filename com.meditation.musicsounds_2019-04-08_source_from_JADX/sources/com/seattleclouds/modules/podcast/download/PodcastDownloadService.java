package com.seattleclouds.modules.podcast.download;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.p009v4.app.C0419y.C0424d;
import android.support.p009v4.content.C0456d;
import android.widget.ProgressBar;
import android.widget.RemoteViews;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.podcast.C6138f;
import com.seattleclouds.modules.podcast.PodcastItem;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6645y;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PodcastDownloadService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f21651a;

    /* renamed from: b */
    private static String f21652b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int f21653c = C5458g.podcast_download_notification_id;

    /* renamed from: d */
    private final IBinder f21654d = new C6105b();

    /* renamed from: e */
    private C0456d f21655e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RemoteDownloadControl f21656f;

    /* renamed from: g */
    private ArrayList<PodcastItem> f21657g = new ArrayList<>();

    /* renamed from: h */
    private LinkedHashMap<Uri, C6103a> f21658h = new LinkedHashMap<>();

    /* renamed from: i */
    private boolean f21659i;

    private class RemoteDownloadControl extends RemoteViews {

        /* renamed from: b */
        private int f21661b;

        public RemoteDownloadControl(String str, int i) {
            super(str, i);
            setImageViewResource(C5458g.imageView, C5457f.icon);
            setOnClickPendingIntent(C5458g.cancelButton, PendingIntent.getService(PodcastDownloadService.this.getApplicationContext(), 100, new Intent(PodcastDownloadService.f21651a), 134217728));
        }

        /* renamed from: a */
        public int mo19243a() {
            return this.f21661b;
        }

        /* renamed from: a */
        public void mo19244a(int i, int i2) {
            this.f21661b = i2;
            setProgressBar(C5458g.progressBar, i, i2, false);
        }

        /* renamed from: a */
        public void mo19245a(String str) {
            setTextViewText(C5458g.textView, str);
        }

        /* renamed from: b */
        public void mo19246b(String str) {
            setTextViewText(C5458g.detailTextView, str);
        }
    }

    /* renamed from: com.seattleclouds.modules.podcast.download.PodcastDownloadService$a */
    private class C6103a extends AsyncTask<Void, Integer, Void> {

        /* renamed from: b */
        private String f21663b;

        /* renamed from: c */
        private PodcastItem f21664c;

        /* renamed from: d */
        private int f21665d;

        /* renamed from: e */
        private int f21666e;

        /* renamed from: f */
        private Timer f21667f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public HttpURLConnection f21668g;

        /* renamed from: h */
        private WeakReference<ProgressBar> f21669h;

        public C6103a(PodcastItem podcastItem) {
            this.f21664c = podcastItem;
        }

        /* renamed from: a */
        private void m29835a() {
            m29836b();
            this.f21667f = new Timer();
            this.f21667f.schedule(new TimerTask() {
                public void run() {
                    C6103a.this.f21668g.disconnect();
                }
            }, 10100);
        }

        /* renamed from: b */
        private void m29836b() {
            if (this.f21667f != null) {
                this.f21667f.cancel();
                this.f21667f = null;
            }
        }

        /* JADX WARNING: type inference failed for: r2v0 */
        /* JADX WARNING: type inference failed for: r6v0, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.io.BufferedOutputStream] */
        /* JADX WARNING: type inference failed for: r7v0 */
        /* JADX WARNING: type inference failed for: r6v1 */
        /* JADX WARNING: type inference failed for: r2v2 */
        /* JADX WARNING: type inference failed for: r7v1, types: [java.io.BufferedOutputStream] */
        /* JADX WARNING: type inference failed for: r6v2, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r6v3 */
        /* JADX WARNING: type inference failed for: r7v2 */
        /* JADX WARNING: type inference failed for: r6v4 */
        /* JADX WARNING: type inference failed for: r7v3, types: [java.io.BufferedOutputStream] */
        /* JADX WARNING: type inference failed for: r6v5, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r6v6 */
        /* JADX WARNING: type inference failed for: r7v4 */
        /* JADX WARNING: type inference failed for: r6v7 */
        /* JADX WARNING: type inference failed for: r6v8 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r7v5 */
        /* JADX WARNING: type inference failed for: r7v6 */
        /* JADX WARNING: type inference failed for: r7v7, types: [java.io.BufferedOutputStream] */
        /* JADX WARNING: type inference failed for: r2v3 */
        /* JADX WARNING: type inference failed for: r2v4 */
        /* JADX WARNING: type inference failed for: r2v5 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r7v8 */
        /* JADX WARNING: type inference failed for: r7v9 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: type inference failed for: r6v16 */
        /* JADX WARNING: type inference failed for: r6v17 */
        /* JADX WARNING: type inference failed for: r7v10 */
        /* JADX WARNING: type inference failed for: r6v18 */
        /* JADX WARNING: type inference failed for: r6v19 */
        /* JADX WARNING: type inference failed for: r6v20 */
        /* JADX WARNING: type inference failed for: r6v21 */
        /* JADX WARNING: type inference failed for: r6v22 */
        /* JADX WARNING: type inference failed for: r6v23 */
        /* JADX WARNING: type inference failed for: r6v24 */
        /* JADX WARNING: type inference failed for: r6v25 */
        /* JADX WARNING: type inference failed for: r6v26 */
        /* JADX WARNING: type inference failed for: r7v11 */
        /* JADX WARNING: type inference failed for: r7v12 */
        /* JADX WARNING: type inference failed for: r7v13 */
        /* JADX WARNING: type inference failed for: r7v14 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:40|41|(1:43)(1:44)|45|46|47|48|49|50|108) */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:33|34|35|36|37|38) */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f6, code lost:
            if (r5 == null) goto L_0x01fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
            r14 = th;
            r2 = r2;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
            r7 = 0;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
            r7 = 0;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d5, code lost:
            if (r5 == null) goto L_0x01fa;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:79:0x017b, B:99:0x01dc] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0121 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x017b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01dc */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1
          assigns: []
          uses: []
          mth insns count: 221
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x01ec  */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01f1 A[SYNTHETIC, Splitter:B:104:0x01f1] */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0204 A[SYNTHETIC, Splitter:B:115:0x0204] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x020b A[SYNTHETIC, Splitter:B:119:0x020b] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0126 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x0092] */
        /* JADX WARNING: Removed duplicated region for block: B:53:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:15:0x0092] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0187 A[Catch:{ all -> 0x01fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0196 A[Catch:{ all -> 0x01fb }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01d0 A[SYNTHETIC, Splitter:B:92:0x01d0] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:79:0x017b=Splitter:B:79:0x017b, B:99:0x01dc=Splitter:B:99:0x01dc} */
        /* JADX WARNING: Unknown variable types count: 15 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r14) {
            /*
                r13 = this;
                r14 = 100
                r0 = 1
                r1 = 0
                r2 = 0
                java.net.URL r3 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                com.seattleclouds.modules.podcast.PodcastItem r4 = r13.f21664c     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r4 = r4.mediaUrlString     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r3.<init>(r4)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.URLConnection r4 = r3.openConnection()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r13.f21668g = r4     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r5 = 10000(0x2710, float:1.4013E-41)
                r4.setConnectTimeout(r5)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r4.setReadTimeout(r5)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r13.m29835a()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r4.connect()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r13.m29836b()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                int r4 = r4.getResponseCode()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 == r5) goto L_0x0059
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r3.<init>()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r5 = "Server returned HTTP "
                r3.append(r5)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r4 = " "
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r4 = r4.getResponseMessage()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r3.append(r4)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r3 = r3.toString()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r13.f21663b = r3     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                return r2
            L_0x0059:
                java.net.HttpURLConnection r4 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                int r4 = r4.getContentLength()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                com.seattleclouds.modules.podcast.PodcastItem r5 = r13.f21664c     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r5 = r5.type     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r6 = "video"
                boolean r5 = r5.startsWith(r6)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                if (r5 == 0) goto L_0x007e
                r5 = 41943040(0x2800000, float:1.880791E-37)
                if (r4 <= r5) goto L_0x007e
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                int r4 = com.seattleclouds.C5451m.C5462k.podcast_item_exceeds_40Mb     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r13.f21663b = r3     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                return r2
            L_0x007e:
                java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                java.io.InputStream r3 = r3.openStream()     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                r5.<init>(r3)     // Catch:{ MalformedURLException -> 0x01d9, IOException -> 0x0178, all -> 0x0173 }
                com.seattleclouds.modules.podcast.PodcastItem r3 = r13.f21664c     // Catch:{ MalformedURLException -> 0x0170, IOException -> 0x016e, all -> 0x016a }
                java.lang.String r3 = com.seattleclouds.modules.podcast.C6139g.m29961c(r3)     // Catch:{ MalformedURLException -> 0x0170, IOException -> 0x016e, all -> 0x016a }
                java.io.File r6 = new java.io.File     // Catch:{ MalformedURLException -> 0x0170, IOException -> 0x016e, all -> 0x016a }
                r6.<init>(r3)     // Catch:{ MalformedURLException -> 0x0170, IOException -> 0x016e, all -> 0x016a }
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x012c, MalformedURLException -> 0x0129, all -> 0x0126 }
                r3.<init>(r6)     // Catch:{ IOException -> 0x012c, MalformedURLException -> 0x0129, all -> 0x0126 }
                java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                r7.<init>(r3)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                r3 = 4096(0x1000, float:5.74E-42)
                byte[] r3 = new byte[r3]     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r8 = 0
                r13.m29835a()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
            L_0x00a5:
                int r10 = r5.read(r3)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r11 = -1
                if (r10 <= r11) goto L_0x00d1
                long r11 = (long) r10     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                long r8 = r8 + r11
                r7.write(r3, r1, r10)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                if (r4 <= 0) goto L_0x00c6
                float r10 = (float) r8     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                float r11 = (float) r4     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                float r10 = r10 / r11
                r11 = 1120403456(0x42c80000, float:100.0)
                float r10 = r10 * r11
                int r10 = (int) r10     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.lang.Integer[] r11 = new java.lang.Integer[r0]     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r11[r1] = r10     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r13.publishProgress(r11)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
            L_0x00c6:
                boolean r10 = r13.isCancelled()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                if (r10 == 0) goto L_0x00cd
                goto L_0x00d1
            L_0x00cd:
                r13.m29835a()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                goto L_0x00a5
            L_0x00d1:
                r13.m29836b()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.net.HttpURLConnection r3 = r13.f21668g     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r3.disconnect()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r13.f21668g = r2     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                boolean r3 = r13.isCancelled()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                if (r3 == 0) goto L_0x00eb
                r6.delete()
                r7.close()     // Catch:{ IOException -> 0x00e7 }
            L_0x00e7:
                r5.close()     // Catch:{ IOException -> 0x00ea }
            L_0x00ea:
                return r2
            L_0x00eb:
                com.seattleclouds.modules.podcast.PodcastItem r3 = r13.f21664c     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.lang.String r3 = com.seattleclouds.modules.podcast.C6139g.m29957b(r3)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.io.File r4 = new java.io.File     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r4.<init>(r3)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                boolean r3 = r6.renameTo(r4)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                if (r3 == 0) goto L_0x0102
                com.seattleclouds.modules.podcast.PodcastItem r3 = r13.f21664c     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r3.updateMediaUri()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                goto L_0x0110
            L_0x0102:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                int r4 = com.seattleclouds.C5451m.C5462k.podcast_failed_to_create_file     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r13.f21663b = r3     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
            L_0x0110:
                java.lang.Integer[] r3 = new java.lang.Integer[r0]     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r3[r1] = r4     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r13.publishProgress(r3)     // Catch:{ MalformedURLException -> 0x01dc, IOException -> 0x017b }
                r6.delete()
                r7.close()     // Catch:{ IOException -> 0x0121 }
            L_0x0121:
                r5.close()     // Catch:{ IOException -> 0x01fa }
                goto L_0x01fa
            L_0x0126:
                r14 = move-exception
                goto L_0x01fd
            L_0x0129:
                r7 = r2
                goto L_0x01dc
            L_0x012c:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
                boolean r3 = com.seattleclouds.util.C6569aa.m31797a(r3, r4)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                if (r3 != 0) goto L_0x0149
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                int r4 = com.seattleclouds.C5451m.C5462k.podcast_write_external_storage_permission_denied_short     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
            L_0x0146:
                r13.f21663b = r3     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                goto L_0x0156
            L_0x0149:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                int r4 = com.seattleclouds.C5451m.C5462k.podcast_failed_to_create_file     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                goto L_0x0146
            L_0x0156:
                java.lang.Integer[] r3 = new java.lang.Integer[r0]     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                r3[r1] = r4     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                r13.publishProgress(r3)     // Catch:{ MalformedURLException -> 0x0129, IOException -> 0x0168, all -> 0x0126 }
                r6.delete()
                r5.close()     // Catch:{ IOException -> 0x0167 }
            L_0x0167:
                return r2
            L_0x0168:
                r7 = r2
                goto L_0x017b
            L_0x016a:
                r14 = move-exception
                r6 = r2
                goto L_0x01fd
            L_0x016e:
                r6 = r2
                goto L_0x017a
            L_0x0170:
                r6 = r2
                goto L_0x01db
            L_0x0173:
                r14 = move-exception
                r5 = r2
                r6 = r5
                goto L_0x01fd
            L_0x0178:
                r5 = r2
                r6 = r5
            L_0x017a:
                r7 = r6
            L_0x017b:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01fb }
                boolean r3 = com.seattleclouds.util.C6619m.m32026h(r3)     // Catch:{ all -> 0x01fb }
                if (r3 != 0) goto L_0x0196
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01fb }
                int r4 = com.seattleclouds.C5451m.C5462k.common_no_network     // Catch:{ all -> 0x01fb }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x01fb }
            L_0x0193:
                r13.f21663b = r3     // Catch:{ all -> 0x01fb }
                goto L_0x01be
            L_0x0196:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01fb }
                java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
                boolean r3 = com.seattleclouds.util.C6569aa.m31797a(r3, r4)     // Catch:{ all -> 0x01fb }
                if (r3 != 0) goto L_0x01b1
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01fb }
                int r4 = com.seattleclouds.C5451m.C5462k.podcast_write_external_storage_permission_denied_short     // Catch:{ all -> 0x01fb }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x01fb }
                goto L_0x0193
            L_0x01b1:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r3 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x01fb }
                int r4 = com.seattleclouds.C5451m.C5462k.common_network_error     // Catch:{ all -> 0x01fb }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x01fb }
                goto L_0x0193
            L_0x01be:
                java.lang.Integer[] r0 = new java.lang.Integer[r0]     // Catch:{ all -> 0x01fb }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01fb }
                r0[r1] = r14     // Catch:{ all -> 0x01fb }
                r13.publishProgress(r0)     // Catch:{ all -> 0x01fb }
                if (r6 == 0) goto L_0x01ce
                r6.delete()
            L_0x01ce:
                if (r7 == 0) goto L_0x01d5
                r7.close()     // Catch:{ IOException -> 0x01d4 }
                goto L_0x01d5
            L_0x01d4:
            L_0x01d5:
                if (r5 == 0) goto L_0x01fa
                goto L_0x0121
            L_0x01d9:
                r5 = r2
                r6 = r5
            L_0x01db:
                r7 = r6
            L_0x01dc:
                com.seattleclouds.modules.podcast.download.PodcastDownloadService r14 = com.seattleclouds.modules.podcast.download.PodcastDownloadService.this     // Catch:{ all -> 0x01fb }
                android.content.Context r14 = r14.getApplicationContext()     // Catch:{ all -> 0x01fb }
                int r0 = com.seattleclouds.C5451m.C5462k.podcast_malformed_url     // Catch:{ all -> 0x01fb }
                java.lang.String r14 = r14.getString(r0)     // Catch:{ all -> 0x01fb }
                r13.f21663b = r14     // Catch:{ all -> 0x01fb }
                if (r6 == 0) goto L_0x01ef
                r6.delete()
            L_0x01ef:
                if (r7 == 0) goto L_0x01f6
                r7.close()     // Catch:{ IOException -> 0x01f5 }
                goto L_0x01f6
            L_0x01f5:
            L_0x01f6:
                if (r5 == 0) goto L_0x01fa
                goto L_0x0121
            L_0x01fa:
                return r2
            L_0x01fb:
                r14 = move-exception
                r2 = r7
            L_0x01fd:
                if (r6 == 0) goto L_0x0202
                r6.delete()
            L_0x0202:
                if (r2 == 0) goto L_0x0209
                r2.close()     // Catch:{ IOException -> 0x0208 }
                goto L_0x0209
            L_0x0208:
            L_0x0209:
                if (r5 == 0) goto L_0x020e
                r5.close()     // Catch:{ IOException -> 0x020e }
            L_0x020e:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.download.PodcastDownloadService.C6103a.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        /* renamed from: a */
        public void mo19248a(ProgressBar progressBar) {
            if (progressBar == null) {
                this.f21669h.clear();
                this.f21669h = null;
                return;
            }
            progressBar.setProgress(this.f21665d);
            this.f21669h = new WeakReference<>(progressBar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            this.f21664c.error = this.f21663b;
            PodcastDownloadService.this.m29811a(this.f21664c, isCancelled());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Integer... numArr) {
            if (!isCancelled()) {
                this.f21665d = numArr[0].intValue();
                if (this.f21665d > this.f21666e) {
                    this.f21666e = this.f21665d;
                    if (this.f21665d % 2 == 0) {
                        PodcastDownloadService.this.startForeground(PodcastDownloadService.f21653c, PodcastDownloadService.this.mo19238d(this.f21664c));
                        if (PodcastDownloadService.this.f21656f != null) {
                            PodcastDownloadService.this.f21656f.mo19244a(100, this.f21665d);
                        }
                    }
                    if (this.f21669h != null) {
                        ProgressBar progressBar = (ProgressBar) this.f21669h.get();
                        if (progressBar != null) {
                            progressBar.setProgress(this.f21665d);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            PodcastDownloadService.this.startForeground(PodcastDownloadService.f21653c, PodcastDownloadService.this.mo19238d(this.f21664c));
        }
    }

    /* renamed from: com.seattleclouds.modules.podcast.download.PodcastDownloadService$b */
    public class C6105b extends Binder {
        public C6105b() {
        }

        /* renamed from: a */
        public PodcastDownloadService mo19256a() {
            return PodcastDownloadService.this;
        }
    }

    /* renamed from: a */
    public static String m29810a(Context context) {
        if (f21652b != null) {
            return f21652b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.download.ACTION_DOWNLOADS_DID_CHANGE");
        f21652b = sb.toString();
        return f21652b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29811a(PodcastItem podcastItem, boolean z) {
        this.f21657g.remove(podcastItem);
        this.f21658h.remove(podcastItem.getMediaUri());
        if (!z) {
            C6138f.m29936a(podcastItem.podcastUrl).mo19300a(podcastItem);
        }
        if (!m29817f()) {
            mo19232a(false);
            this.f21655e.mo1845a(new Intent(f21652b));
        }
    }

    /* renamed from: a */
    private void m29813a(List<PodcastItem> list, boolean z) {
        for (PodcastItem podcastItem : list) {
            podcastItem.downloadDate = null;
            podcastItem.error = null;
            this.f21657g.remove(podcastItem);
            C6103a aVar = (C6103a) this.f21658h.remove(podcastItem.getMediaUri());
            if (aVar != null) {
                aVar.cancel(true);
            }
        }
        m29814b(true);
        if (!z) {
            this.f21655e.mo1845a(new Intent(f21652b));
        }
    }

    /* renamed from: b */
    private void m29814b(boolean z) {
        if (this.f21658h.size() == 0) {
            mo19232a(z);
            stopSelf();
            this.f21659i = false;
        }
    }

    /* renamed from: f */
    private boolean m29817f() {
        if (this.f21658h.size() > 0) {
            Iterator it = this.f21658h.values().iterator();
            if (it.hasNext()) {
                C6103a aVar = (C6103a) it.next();
                if (VERSION.SDK_INT >= 11) {
                    aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                } else {
                    aVar.execute(new Void[0]);
                }
            }
            this.f21655e.mo1845a(new Intent(f21652b));
            return true;
        }
        this.f21659i = false;
        stopSelf();
        return false;
    }

    /* renamed from: a */
    public List<PodcastItem> mo19227a() {
        return this.f21657g;
    }

    /* renamed from: a */
    public void mo19228a(PodcastItem podcastItem) {
        if (!App.m25663l()) {
            C6595ao.m31926a(getApplicationContext(), C5462k.podcast_no_external_storage);
        } else if (mo19237c(podcastItem)) {
            this.f21657g.add(podcastItem);
            this.f21658h.put(podcastItem.getMediaUri(), new C6103a(podcastItem));
            podcastItem.downloadDate = new Date();
            podcastItem.error = null;
            mo19236c();
            this.f21655e.mo1845a(new Intent(f21652b));
        }
    }

    /* renamed from: a */
    public void mo19229a(PodcastItem podcastItem, ProgressBar progressBar) {
        C6103a aVar = (C6103a) this.f21658h.get(podcastItem.getMediaUri());
        if (aVar != null) {
            aVar.mo19248a(progressBar);
        }
    }

    /* renamed from: a */
    public void mo19230a(ArrayList<PodcastItem> arrayList) {
        if (!App.m25663l()) {
            C6595ao.m31926a(getApplicationContext(), C5462k.podcast_no_external_storage);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PodcastItem podcastItem = (PodcastItem) it.next();
            if (mo19237c(podcastItem)) {
                this.f21657g.add(podcastItem);
                this.f21658h.put(podcastItem.getMediaUri(), new C6103a(podcastItem));
                podcastItem.downloadDate = new Date();
                podcastItem.error = null;
            } else {
                return;
            }
        }
        mo19236c();
        this.f21655e.mo1845a(new Intent(f21652b));
    }

    /* renamed from: a */
    public void mo19231a(List<PodcastItem> list) {
        m29813a(list, false);
    }

    /* renamed from: a */
    public void mo19232a(boolean z) {
        stopForeground(true);
        if (!z) {
            FragmentInfo fragmentInfo = new FragmentInfo(C6130c.class.getName());
            Intent intent = new Intent(getApplicationContext(), PodcastDownloadsActivity.class);
            intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
            intent.addFlags(805306368);
            PendingIntent activity = PendingIntent.getActivity(this, 1, intent, 134217728);
            C0424d dVar = new C0424d(getApplicationContext(), "pod_cast");
            dVar.mo1723a((CharSequence) getString(C5462k.podcast_title)).mo1729b((CharSequence) getString(C5462k.podcast_download_finished)).mo1713a(C5457f.ic_notif_podcast_downloaded_alpha).mo1717a(activity).mo1730b(true).mo1735d((CharSequence) getString(C5462k.podcast_download_finished));
            C6645y.m32098a(f21653c, dVar.mo1712a(), "pod_cast");
        }
    }

    /* renamed from: b */
    public void mo19233b() {
        for (C6103a cancel : this.f21658h.values()) {
            cancel.cancel(true);
        }
        this.f21658h.clear();
        Iterator it = this.f21657g.iterator();
        while (it.hasNext()) {
            PodcastItem podcastItem = (PodcastItem) it.next();
            podcastItem.downloadDate = null;
            podcastItem.error = null;
        }
        this.f21657g.clear();
        m29814b(true);
        this.f21655e.mo1845a(new Intent(f21652b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0008 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19234b(java.util.List<com.seattleclouds.modules.podcast.PodcastItem> r5) {
        /*
            r4 = this;
            r0 = 1
            r4.m29813a(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r5.next()
            com.seattleclouds.modules.podcast.PodcastItem r1 = (com.seattleclouds.modules.podcast.PodcastItem) r1
            android.net.Uri r2 = r1.getLocalUri()
            if (r2 == 0) goto L_0x002e
            java.lang.String r2 = r2.getPath()
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x002e
            boolean r2 = r3.delete()
            goto L_0x002f
        L_0x002e:
            r2 = 1
        L_0x002f:
            if (r2 == 0) goto L_0x0008
            java.lang.String r2 = r1.podcastUrl
            com.seattleclouds.modules.podcast.f r2 = com.seattleclouds.modules.podcast.C6138f.m29936a(r2)
            r2.mo19303b(r1)
            r2 = 0
            r1.downloadDate = r2
            r1.error = r2
            r1.updateMediaUri()
            goto L_0x0008
        L_0x0043:
            android.support.v4.content.d r5 = r4.f21655e
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = f21652b
            r0.<init>(r1)
            r5.mo1845a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.download.PodcastDownloadService.mo19234b(java.util.List):void");
    }

    /* renamed from: b */
    public boolean mo19235b(PodcastItem podcastItem) {
        return this.f21657g.contains(podcastItem);
    }

    /* renamed from: c */
    public void mo19236c() {
        if (this.f21658h.size() != 0 && !this.f21659i) {
            this.f21659i = true;
            startService(new Intent(this, PodcastDownloadService.class));
            m29817f();
        }
    }

    /* renamed from: c */
    public boolean mo19237c(PodcastItem podcastItem) {
        return !C6138f.m29936a(podcastItem.podcastUrl).mo19302b().contains(podcastItem) && !this.f21657g.contains(podcastItem) && podcastItem.getLocalUri() == null && !this.f21658h.containsKey(podcastItem.getMediaUri());
    }

    /* renamed from: d */
    public Notification mo19238d(PodcastItem podcastItem) {
        if (this.f21656f == null) {
            this.f21656f = new RemoteDownloadControl(getPackageName(), C5460i.podcast_downloads_remote_control);
            this.f21656f.mo19245a("Downloading");
        }
        this.f21656f.mo19246b(podcastItem.title);
        FragmentInfo fragmentInfo = new FragmentInfo(C6130c.class.getName());
        Intent intent = new Intent(getApplicationContext(), PodcastDownloadsActivity.class);
        intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
        intent.addFlags(805306368);
        PendingIntent activity = PendingIntent.getActivity(this, 1, intent, 134217728);
        C0424d dVar = new C0424d(getApplicationContext(), "pod_cast");
        dVar.mo1723a((CharSequence) getApplicationContext().getString(C5462k.podcast_downloading)).mo1729b((CharSequence) podcastItem.title).mo1714a(100, this.f21656f.mo19243a(), false).mo1713a(C5457f.ic_notif_podcast_downloaded_alpha).mo1717a(activity).mo1722a((RemoteViews) this.f21656f).mo1735d((CharSequence) getString(C5462k.podcast_download_started, new Object[]{podcastItem.title}));
        C6645y.m32105a("pod_cast");
        return dVar.mo1712a();
    }

    public IBinder onBind(Intent intent) {
        return this.f21654d;
    }

    public void onCreate() {
        super.onCreate();
        StringBuilder sb = new StringBuilder();
        sb.append(getPackageName());
        sb.append(".modules.podcast.download.ACTION_DOWNLOADS_DID_CHANGE");
        f21652b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPackageName());
        sb2.append(".modules.podcast.download.ACTION_STOP_DOWNLOADS");
        f21651a = sb2.toString();
        this.f21655e = C0456d.m2097a((Context) this);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String action = intent.getAction();
        if (action != null && action.equals(f21651a)) {
            mo19233b();
        }
        return 2;
    }
}
