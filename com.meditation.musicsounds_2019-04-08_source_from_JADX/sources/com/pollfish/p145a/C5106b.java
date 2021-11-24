package com.pollfish.p145a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.interfaces.C5174a.C5178d;
import com.pollfish.p149e.C5147a;
import com.pollfish.p150f.C5162b;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.a.b */
public class C5106b {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static int f18185t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static String f18186u = "";

    /* renamed from: a */
    private String f18187a;

    /* renamed from: b */
    private String f18188b;

    /* renamed from: c */
    private String f18189c;

    /* renamed from: d */
    private int f18190d;

    /* renamed from: e */
    private int f18191e;

    /* renamed from: f */
    private boolean f18192f;

    /* renamed from: g */
    private int f18193g;

    /* renamed from: h */
    private int f18194h;

    /* renamed from: i */
    private boolean f18195i;

    /* renamed from: j */
    private Bitmap f18196j = null;

    /* renamed from: k */
    private Bitmap f18197k = null;

    /* renamed from: l */
    private String f18198l = "";

    /* renamed from: m */
    private String f18199m = "";

    /* renamed from: n */
    private String f18200n = "";

    /* renamed from: o */
    private String f18201o = "";

    /* renamed from: p */
    private String f18202p;

    /* renamed from: q */
    private boolean f18203q;

    /* renamed from: r */
    private boolean f18204r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Position f18205s;

    /* renamed from: v */
    private C5178d f18206v = null;

    /* renamed from: w */
    private C5176b f18207w = null;

    /* renamed from: x */
    private Activity f18208x;

    /* renamed from: com.pollfish.a.b$a */
    public class C5107a extends AsyncTask {

        /* renamed from: b */
        private String f18210b;

        /* renamed from: c */
        private C5106b f18211c = null;

        /* renamed from: d */
        private C5178d f18212d;

        public C5107a(String str, C5106b bVar, C5178d dVar) {
            this.f18210b = str;
            this.f18211c = bVar;
            this.f18212d = dVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
            r0 = "DownloadImageTask";
            r1 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
            r0 = "DownloadImageTask";
            r1 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0071 A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9 A[Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:1:0x0019] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r7) {
            /*
                r6 = this;
                java.lang.String r7 = "DownloadImageTask"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "download_Image with image Url: "
                r0.append(r1)
                java.lang.String r1 = r6.f18210b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.pollfish.p150f.C5162b.m25518a(r7, r0)
                r7 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r1 = r6.f18210b     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r0.<init>(r1)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r1 = 5000(0x1388, float:7.006E-42)
                r0.setConnectTimeout(r1)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r0.setReadTimeout(r1)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r0.connect()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r2 = 8192(0x2000, float:1.14794E-41)
                r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ OutOfMemoryError -> 0x0057, Exception -> 0x003f, IOException -> 0x00f8 }
                goto L_0x0069
            L_0x003f:
                r2 = move-exception
                java.lang.String r3 = "DownloadImageTask"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r4.<init>()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r5 = "DownloadImageTask decodeStream  error: "
                r4.append(r5)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r4.append(r2)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
            L_0x004f:
                java.lang.String r2 = r4.toString()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                com.pollfish.p150f.C5162b.m25519b(r3, r2)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                goto L_0x0068
            L_0x0057:
                r2 = move-exception
                java.lang.String r3 = "DownloadImageTask"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r4.<init>()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r5 = "DownloadImageTask decodeStream error: "
                r4.append(r5)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r4.append(r2)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                goto L_0x004f
            L_0x0068:
                r2 = r7
            L_0x0069:
                r1.close()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r0.close()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                if (r2 == 0) goto L_0x0110
                java.lang.String r0 = "DownloadImageTask"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r1.<init>()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r3 = "Image downloaded sucessfully - removing url: "
                r1.append(r3)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r3 = r6.f18210b     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                r1.append(r3)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                java.lang.String r0 = com.pollfish.p145a.C5106b.f18186u     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
                com.pollfish.p145a.C5106b.m25269p()     // Catch:{ all -> 0x00ed }
                java.lang.String r1 = "DownloadImageTask"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
                r3.<init>()     // Catch:{ all -> 0x00ed }
                java.lang.String r4 = "remove image with imageUrl: "
                r3.append(r4)     // Catch:{ all -> 0x00ed }
                java.lang.String r4 = r6.f18210b     // Catch:{ all -> 0x00ed }
                r3.append(r4)     // Catch:{ all -> 0x00ed }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ed }
                com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ all -> 0x00ed }
                com.pollfish.a.b r1 = com.pollfish.p145a.C5106b.this     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r1 = r1.f18205s     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r3 = com.pollfish.constants.Position.BOTTOM_LEFT     // Catch:{ all -> 0x00ed }
                if (r1 == r3) goto L_0x00ce
                com.pollfish.a.b r1 = com.pollfish.p145a.C5106b.this     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r1 = r1.f18205s     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r3 = com.pollfish.constants.Position.TOP_LEFT     // Catch:{ all -> 0x00ed }
                if (r1 == r3) goto L_0x00ce
                com.pollfish.a.b r1 = com.pollfish.p145a.C5106b.this     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r1 = r1.f18205s     // Catch:{ all -> 0x00ed }
                com.pollfish.constants.Position r3 = com.pollfish.constants.Position.MIDDLE_LEFT     // Catch:{ all -> 0x00ed }
                if (r1 != r3) goto L_0x00c8
                goto L_0x00ce
            L_0x00c8:
                com.pollfish.a.b r1 = com.pollfish.p145a.C5106b.this     // Catch:{ all -> 0x00ed }
                r1.mo16596b(r2)     // Catch:{ all -> 0x00ed }
                goto L_0x00d3
            L_0x00ce:
                com.pollfish.a.b r1 = com.pollfish.p145a.C5106b.this     // Catch:{ all -> 0x00ed }
                r1.mo16593a(r2)     // Catch:{ all -> 0x00ed }
            L_0x00d3:
                int r1 = com.pollfish.p145a.C5106b.f18185t     // Catch:{ all -> 0x00ed }
                if (r1 != 0) goto L_0x00eb
                java.lang.String r1 = "DownloadImageTask"
                java.lang.String r2 = "All indicator images downloaded sucessfully"
                com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ all -> 0x00ed }
                com.pollfish.interfaces.a$d r1 = r6.f18212d     // Catch:{ all -> 0x00ed }
                if (r1 == 0) goto L_0x00eb
                com.pollfish.interfaces.a$d r1 = r6.f18212d     // Catch:{ all -> 0x00ed }
                com.pollfish.a.b r2 = r6.f18211c     // Catch:{ all -> 0x00ed }
                r1.mo16791a(r2)     // Catch:{ all -> 0x00ed }
            L_0x00eb:
                monitor-exit(r0)     // Catch:{ all -> 0x00ed }
                goto L_0x0110
            L_0x00ed:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00ed }
                throw r1     // Catch:{ IOException -> 0x00f8, Exception -> 0x00f0 }
            L_0x00f0:
                java.lang.String r0 = "DownloadImageTask"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                goto L_0x00ff
            L_0x00f8:
                java.lang.String r0 = "DownloadImageTask"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
            L_0x00ff:
                java.lang.String r2 = "Error getting the image from server: "
                r1.append(r2)
                java.lang.String r2 = r6.f18210b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.pollfish.p150f.C5162b.m25519b(r0, r1)
            L_0x0110:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p145a.C5106b.C5107a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    public C5106b(String str, String str2, int i, String str3, boolean z, String str4, String str5, int i2, int i3, Position position, C5178d dVar, String str6, String str7, C5176b bVar, Activity activity, String str8, boolean z2, boolean z3, int i4) {
        String str9 = str;
        String str10 = str2;
        boolean z4 = z;
        int i5 = i2;
        int i6 = i3;
        C5178d dVar2 = dVar;
        this.f18189c = str9;
        this.f18190d = i;
        this.f18187a = str10;
        this.f18188b = str3;
        this.f18195i = z4;
        this.f18198l = str4;
        this.f18199m = str5;
        this.f18193g = i5;
        this.f18194h = i6;
        this.f18200n = str6;
        this.f18201o = str7;
        this.f18208x = activity;
        this.f18192f = z2;
        this.f18204r = z3;
        this.f18191e = i4;
        StringBuilder sb = new StringBuilder();
        sb.append("PanelObj width_percentage: ");
        sb.append(i5);
        sb.append("height_percentage: ");
        sb.append(i6);
        C5162b.m25518a("PanelObj", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PanelObj hasAcceptedTerms: ");
        sb2.append(this.f18192f);
        C5162b.m25518a("PanelObj", sb2.toString());
        f18185t = 0;
        this.f18205s = position;
        this.f18206v = dVar2;
        this.f18207w = bVar;
        this.f18203q = false;
        this.f18202p = str8;
        if (z4) {
            mo16601g();
        } else {
            C5162b.m25518a("PanelObj", "no images to download move to survey on overlay");
            if (dVar2 != null) {
                this.f18206v.mo16791a(this);
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("PanelObj with s_id:");
        sb3.append(str);
        sb3.append(" and response_type:");
        sb3.append(str2);
        C5162b.m25518a("PanelObj", sb3.toString());
        mo16592a();
    }

    /* renamed from: p */
    static /* synthetic */ int m25269p() {
        int i = f18185t;
        f18185t = i - 1;
        return i;
    }

    /* renamed from: a */
    public Drawable mo16591a(Context context, Position position, int[] iArr) {
        Bitmap bitmap;
        StringBuilder sb = new StringBuilder();
        sb.append("getIndicatorImage pos: ");
        sb.append(position);
        C5162b.m25518a("PanelObj", sb.toString());
        if (!this.f18195i) {
            Bitmap bitmap2 = null;
            if (position == Position.BOTTOM_LEFT || position == Position.TOP_LEFT || position == Position.MIDDLE_LEFT) {
                C5162b.m25518a("PanelObj", "(pos == Position.BOTTOM_LEFT || pos == Position.TOP_LEFT|| pos == Position.MIDDLE_LEFT) ");
                if (this.f18187a != null) {
                    bitmap2 = !this.f18187a.equalsIgnoreCase("award") ? C5147a.m25456a(context) : C5147a.m25460c(context);
                }
                if (bitmap2 != null) {
                    iArr[0] = bitmap2.getWidth() / 2;
                    iArr[1] = bitmap2.getHeight() / 2;
                }
                return C5147a.m25458a(context, bitmap2);
            }
            if (this.f18187a != null) {
                bitmap2 = !this.f18187a.equalsIgnoreCase("award") ? C5147a.m25459b(context) : C5147a.m25461d(context);
            }
            if (bitmap2 != null) {
                iArr[0] = bitmap2.getWidth() / 2;
                iArr[1] = bitmap2.getHeight() / 2;
            }
            return C5147a.m25458a(context, bitmap2);
        }
        if (position == Position.BOTTOM_LEFT || position == Position.TOP_LEFT || position == Position.MIDDLE_LEFT) {
            Bitmap bitmap3 = this.f18196j;
            iArr[0] = bitmap3.getWidth() / 2;
            iArr[1] = bitmap3.getHeight() / 2;
            bitmap = this.f18196j;
        } else {
            Bitmap bitmap4 = this.f18197k;
            iArr[0] = bitmap4.getWidth() / 2;
            iArr[1] = bitmap4.getHeight() / 2;
            bitmap = this.f18197k;
        }
        return C5147a.m25458a(context, bitmap);
    }

    /* renamed from: a */
    public void mo16592a() {
        C5162b.m25518a("PanelObj", "downloadAssets()");
        if (this.f18201o == null || this.f18201o.trim().equalsIgnoreCase("")) {
            if (!(this.f18207w == null || this.f18207w == null)) {
                this.f18207w.mo16787c();
            }
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(this.f18201o);
            StringBuilder sb = new StringBuilder();
            sb.append("downloadAssets: num:");
            sb.append(jSONArray.length());
            C5162b.m25518a("PanelObj", sb.toString());
            if (this.f18207w != null) {
                this.f18207w.mo16786b(jSONArray.length());
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("cache_path");
                String string2 = jSONObject.getString("url_path");
                int i2 = jSONObject.getInt("file_type");
                if (string.startsWith("./")) {
                    string.replaceFirst("./", TableOfContents.DEFAULT_PATH_SEPARATOR);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("downloadAssets: attributeCachePath:");
                sb2.append(string);
                C5162b.m25518a("PanelObj", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("downloadAssets: attributeType:");
                sb3.append(i2);
                C5162b.m25518a("PanelObj", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("downloadAssets: attributeUrlPath:");
                sb4.append(string2);
                C5162b.m25518a("PanelObj", sb4.toString());
                C5109d dVar = new C5109d(string, "", "", string2, i2);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f18208x.getApplicationContext().getCacheDir().getAbsolutePath());
                sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                sb5.append("pollfish_cache");
                sb5.append(dVar.mo16654a());
                File file = new File(sb5.toString());
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                        if (parentFile.isDirectory()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Creating directory: ");
                            sb6.append(parentFile.getAbsolutePath());
                            C5162b.m25518a("PanelObj", sb6.toString());
                        }
                    }
                    this.f18207w.mo16782a(dVar);
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("file: ");
                    sb7.append(file.getAbsolutePath());
                    sb7.append(" already exists in cache!");
                    C5162b.m25518a("PanelObj", sb7.toString());
                    this.f18207w.mo16780a();
                }
            }
        } catch (Exception e) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("downloadAssets error: ");
            sb8.append(e);
            C5162b.m25519b("PanelObj", sb8.toString());
            if (this.f18207w != null) {
                this.f18207w.mo16786b(0);
            }
        }
        if (this.f18207w != null) {
            this.f18207w.mo16787c();
        }
    }

    /* renamed from: a */
    public void mo16593a(Bitmap bitmap) {
        this.f18196j = bitmap;
    }

    /* renamed from: a */
    public void mo16594a(boolean z) {
        this.f18203q = z;
    }

    /* renamed from: b */
    public String mo16595b() {
        return this.f18189c;
    }

    /* renamed from: b */
    public void mo16596b(Bitmap bitmap) {
        this.f18197k = bitmap;
    }

    /* renamed from: c */
    public String mo16597c() {
        return this.f18187a;
    }

    /* renamed from: d */
    public String mo16598d() {
        return this.f18188b;
    }

    /* renamed from: e */
    public int mo16599e() {
        return this.f18190d;
    }

    /* renamed from: f */
    public boolean mo16600f() {
        return this.f18203q;
    }

    /* renamed from: g */
    public void mo16601g() {
        C5107a aVar;
        if (this.f18205s == Position.BOTTOM_LEFT || this.f18205s == Position.TOP_LEFT || this.f18205s == Position.MIDDLE_LEFT) {
            if (!this.f18198l.equalsIgnoreCase("")) {
                f18185t++;
                aVar = new C5107a(this.f18198l, this, this.f18206v);
            } else {
                return;
            }
        } else if (!this.f18199m.equalsIgnoreCase("")) {
            f18185t++;
            aVar = new C5107a(this.f18199m, this, this.f18206v);
        } else {
            return;
        }
        aVar.execute(new Void[0]);
    }

    /* renamed from: h */
    public int mo16602h() {
        return this.f18193g;
    }

    /* renamed from: i */
    public int mo16603i() {
        return this.f18194h;
    }

    /* renamed from: j */
    public String mo16604j() {
        return this.f18200n;
    }

    /* renamed from: k */
    public String mo16605k() {
        return this.f18202p;
    }

    /* renamed from: l */
    public boolean mo16606l() {
        return this.f18192f;
    }

    /* renamed from: m */
    public boolean mo16607m() {
        return this.f18204r;
    }

    /* renamed from: n */
    public int mo16608n() {
        return this.f18191e;
    }
}
