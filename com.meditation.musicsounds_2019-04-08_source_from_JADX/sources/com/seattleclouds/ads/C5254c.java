package com.seattleclouds.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.seattleclouds.App;
import com.seattleclouds.C5323c;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.ads.c */
public class C5254c extends RelativeLayout {

    /* renamed from: b */
    private static final String f18830b = App.f18519u;

    /* renamed from: c */
    private static final String f18831c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f18832d;

    /* renamed from: a */
    public C5259b f18833a = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f18834e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f18835f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f18836g = "";

    /* renamed from: h */
    private C5258a f18837h;

    /* renamed from: i */
    private Timer f18838i;

    /* renamed from: j */
    private ImageView f18839j;

    /* renamed from: k */
    private int f18840k = 30000;

    /* renamed from: com.seattleclouds.ads.c$a */
    private class C5258a extends AsyncTask<String, Void, Drawable> {

        /* renamed from: b */
        private String f18847b;

        private C5258a() {
            this.f18847b = null;
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r8v2 */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: type inference failed for: r1v4, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r8v5 */
        /* JADX WARNING: type inference failed for: r8v6, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r8v7 */
        /* JADX WARNING: type inference failed for: r8v8, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r8v9 */
        /* JADX WARNING: type inference failed for: r8v10, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r8v11 */
        /* JADX WARNING: type inference failed for: r8v25, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: type inference failed for: r2v15, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: type inference failed for: r8v27 */
        /* JADX WARNING: type inference failed for: r8v28 */
        /* JADX WARNING: type inference failed for: r8v29 */
        /* JADX WARNING: type inference failed for: r8v30 */
        /* JADX WARNING: type inference failed for: r8v31 */
        /* JADX WARNING: type inference failed for: r8v32 */
        /* JADX WARNING: type inference failed for: r8v33 */
        /* JADX WARNING: type inference failed for: r8v34 */
        /* JADX WARNING: type inference failed for: r8v35 */
        /* JADX WARNING: type inference failed for: r8v36 */
        /* JADX WARNING: type inference failed for: r8v37 */
        /* JADX WARNING: type inference failed for: r8v38 */
        /* JADX WARNING: type inference failed for: r8v39 */
        /* JADX WARNING: type inference failed for: r8v40 */
        /* JADX WARNING: type inference failed for: r8v41 */
        /* JADX WARNING: type inference failed for: r8v42 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
            if (r0 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
            if (r0 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
            if (r0 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0118, code lost:
            if (r0 != null) goto L_0x00d0;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
          uses: [android.graphics.drawable.Drawable, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.net.HttpURLConnection]
          mth insns count: 139
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
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0127 A[SYNTHETIC, Splitter:B:85:0x0127] */
        /* JADX WARNING: Unknown variable types count: 8 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.drawable.Drawable doInBackground(java.lang.String... r8) {
            /*
                r7 = this;
                boolean r0 = r7.isCancelled()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                r0 = 0
                r0 = r8[r0]
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r2.<init>()     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r3 = "username"
                r4 = 1
                r4 = r8[r4]     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r2.put(r3, r4)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r3 = "appId"
                r4 = 2
                r4 = r8[r4]     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r2.put(r3, r4)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r3 = "publisherid"
                r4 = 3
                r4 = r8[r4]     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r2.put(r3, r4)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r3 = "deviceId"
                r4 = 4
                r8 = r8[r4]     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r2.put(r3, r8)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r8 = com.seattleclouds.util.HTTPUtil.m31768b(r0, r2)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r0.<init>(r8)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                com.seattleclouds.ads.c r8 = com.seattleclouds.ads.C5254c.this     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                org.json.JSONArray r8 = r8.m26223a(r0)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                int r8 = r8.length()     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                if (r8 == 0) goto L_0x0046
                return r1
            L_0x0046:
                java.lang.String r8 = "isAvailableAdBanner"
                boolean r8 = r0.getBoolean(r8)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                if (r8 != 0) goto L_0x004f
                return r1
            L_0x004f:
                com.seattleclouds.ads.c r8 = com.seattleclouds.ads.C5254c.this     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r2 = "token"
                java.lang.String r2 = r0.getString(r2)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r8.f18836g = r2     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r8 = "adBanner"
                org.json.JSONObject r8 = r0.getJSONObject(r8)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                com.seattleclouds.ads.c r0 = com.seattleclouds.ads.C5254c.this     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r2 = "id"
                int r2 = r8.getInt(r2)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r0.f18835f = r2     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r0 = "targetUrl"
                java.lang.String r0 = r8.getString(r0)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r7.f18847b = r0     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.lang.String r0 = "imageUrl"
                java.lang.String r8 = r8.getString(r0)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                boolean r0 = r7.isCancelled()     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                if (r0 == 0) goto L_0x0080
                return r1
            L_0x0080:
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r0.<init>(r8)     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.net.URLConnection r8 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ MalformedURLException -> 0x010a, SocketTimeoutException -> 0x00f9, IOException -> 0x00d4, JSONException -> 0x00c0, all -> 0x00bc }
                r0 = 25000(0x61a8, float:3.5032E-41)
                r8.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x00ba, SocketTimeoutException -> 0x00b8, IOException -> 0x00b5, JSONException -> 0x00b3, all -> 0x00ac }
                r8.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x00ba, SocketTimeoutException -> 0x00b8, IOException -> 0x00b5, JSONException -> 0x00b3, all -> 0x00ac }
                java.io.InputStream r0 = r8.getInputStream()     // Catch:{ MalformedURLException -> 0x00ba, SocketTimeoutException -> 0x00b8, IOException -> 0x00b5, JSONException -> 0x00b3, all -> 0x00ac }
                java.lang.String r2 = "sc_ad_banner_image"
                android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r0, r2)     // Catch:{ MalformedURLException -> 0x010c, SocketTimeoutException -> 0x00fb, IOException -> 0x00aa, JSONException -> 0x00c2 }
                if (r8 == 0) goto L_0x00a2
                r8.disconnect()
            L_0x00a2:
                if (r0 == 0) goto L_0x00a7
                r0.close()     // Catch:{ IOException -> 0x00a7 }
            L_0x00a7:
                r1 = r2
                goto L_0x011b
            L_0x00aa:
                r2 = move-exception
                goto L_0x00d7
            L_0x00ac:
                r0 = move-exception
                r6 = r1
                r1 = r8
                r8 = r0
                r0 = r6
                goto L_0x0120
            L_0x00b3:
                r0 = r1
                goto L_0x00c2
            L_0x00b5:
                r2 = move-exception
                r0 = r1
                goto L_0x00d7
            L_0x00b8:
                r0 = r1
                goto L_0x00fb
            L_0x00ba:
                r0 = r1
                goto L_0x010c
            L_0x00bc:
                r8 = move-exception
                r0 = r1
                goto L_0x0120
            L_0x00c0:
                r8 = r1
                r0 = r8
            L_0x00c2:
                java.lang.String r2 = "MPAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r2, r3)     // Catch:{ all -> 0x011c }
                if (r8 == 0) goto L_0x00ce
                r8.disconnect()
            L_0x00ce:
                if (r0 == 0) goto L_0x011b
            L_0x00d0:
                r0.close()     // Catch:{ IOException -> 0x011b }
                goto L_0x011b
            L_0x00d4:
                r2 = move-exception
                r8 = r1
                r0 = r8
            L_0x00d7:
                java.lang.String r3 = "MPAdView"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x011c }
                r4.<init>()     // Catch:{ all -> 0x011c }
                java.lang.String r5 = "Server response error: "
                r4.append(r5)     // Catch:{ all -> 0x011c }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x011c }
                r4.append(r2)     // Catch:{ all -> 0x011c }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x011c }
                android.util.Log.w(r3, r2)     // Catch:{ all -> 0x011c }
                if (r8 == 0) goto L_0x00f6
                r8.disconnect()
            L_0x00f6:
                if (r0 == 0) goto L_0x011b
                goto L_0x00d0
            L_0x00f9:
                r8 = r1
                r0 = r8
            L_0x00fb:
                java.lang.String r2 = "MPAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r2, r3)     // Catch:{ all -> 0x011c }
                if (r8 == 0) goto L_0x0107
                r8.disconnect()
            L_0x0107:
                if (r0 == 0) goto L_0x011b
                goto L_0x00d0
            L_0x010a:
                r8 = r1
                r0 = r8
            L_0x010c:
                java.lang.String r2 = "MPAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r2, r3)     // Catch:{ all -> 0x011c }
                if (r8 == 0) goto L_0x0118
                r8.disconnect()
            L_0x0118:
                if (r0 == 0) goto L_0x011b
                goto L_0x00d0
            L_0x011b:
                return r1
            L_0x011c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L_0x0120:
                if (r1 == 0) goto L_0x0125
                r1.disconnect()
            L_0x0125:
                if (r0 == 0) goto L_0x012a
                r0.close()     // Catch:{ IOException -> 0x012a }
            L_0x012a:
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.ads.C5254c.C5258a.doInBackground(java.lang.String[]):android.graphics.drawable.Drawable");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                C5254c.this.m26225a(drawable, this.f18847b);
            } else {
                C5254c.this.m26233f();
            }
            super.onPostExecute(drawable);
        }
    }

    /* renamed from: com.seattleclouds.ads.c$b */
    public interface C5259b {
        /* renamed from: a */
        void mo17217a();

        /* renamed from: b */
        void mo17218b();

        void onClick();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(f18830b);
        sb.append("/getMarketplaceBanner");
        f18831c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(f18830b);
        sb2.append("/processMarketplaceBanner");
        f18832d = sb2.toString();
    }

    public C5254c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26224a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONArray m26223a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("errors");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            StringBuilder sb = new StringBuilder();
            sb.append("SCAd error: ");
            sb.append(jSONObject2.getString("code"));
            sb.append(" - ");
            sb.append(jSONObject2.getString("message"));
            Log.w("MPAdView", sb.toString());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private void m26224a(Context context) {
        this.f18834e = context;
        setBackgroundColor(Color.argb(0, 0, 0, 0));
        int j = App.f18501c.mo16965j();
        if (j > 0) {
            this.f18840k = j * 1000;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26225a(Drawable drawable, final String str) {
        if (drawable == null) {
            Log.w("MPAdView", "SC ad image invalid");
        }
        if (str == null) {
            Log.w("MPAdView", "SC ad action url invalid");
        }
        if (drawable != null && str != null) {
            if (this.f18839j == null) {
                LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = C6619m.m32014a(this.f18834e, 320.0f);
                layoutParams.height = C6619m.m32014a(this.f18834e, 50.0f);
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                }
                setLayoutParams(layoutParams);
                this.f18839j = new ImageView(this.f18834e);
                this.f18839j.setScaleType(ScaleType.FIT_XY);
                addView(this.f18839j, new RelativeLayout.LayoutParams(-1, -1));
            }
            this.f18839j.setImageDrawable(drawable);
            this.f18839j.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (str.contains("://")) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(str));
                            C5254c.this.f18834e.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot open banner action URL: ");
                            sb.append(str);
                            sb.append(", ex: ");
                            sb.append(e.toString());
                            Log.w("MPAdView", sb.toString(), e);
                        }
                    } else if (!App.m25667n(str)) {
                        C6620n.m32031a(C5254c.this.f18834e, C5462k.warning, String.format(C5254c.this.f18834e.getString(C5462k.common_page_not_found), new Object[]{str}));
                    } else if (C5254c.this.f18834e instanceof Activity) {
                        App.m25621a(str, (Activity) C5254c.this.f18834e);
                    }
                    C5254c.this.m26230d();
                }
            });
            this.f18833a.mo17217a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26230d() {
        final HashMap hashMap = new HashMap();
        hashMap.put("publisherId", App.f18522x);
        hashMap.put("username", App.f18523y);
        hashMap.put("appId", App.f18524z);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18835f);
        sb.append("");
        hashMap.put("adId", sb.toString());
        hashMap.put("deviceId", C5323c.m26636a(getContext()));
        hashMap.put("token", this.f18836g);
        this.f18833a.onClick();
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                String str;
                StringBuilder sb;
                String str2;
                try {
                    HTTPUtil.m31768b(C5254c.f18832d, hashMap);
                    return null;
                } catch (MalformedURLException e) {
                    str2 = "MPAdView";
                    sb = new StringBuilder();
                    sb.append("Malformed error: ");
                    str = e.toString();
                    r0 = e;
                    sb.append(str);
                    Log.w(str2, sb.toString(), r0);
                    return null;
                } catch (IOException e2) {
                    str2 = "MPAdView";
                    sb = new StringBuilder();
                    sb.append("IO error: ");
                    str = e2.toString();
                    r0 = e2;
                    sb.append(str);
                    Log.w(str2, sb.toString(), r0);
                    return null;
                } catch (JSONException e3) {
                    str2 = "MPAdView";
                    sb = new StringBuilder();
                    sb.append("Server response error: ");
                    str = e3.toString();
                    r0 = e3;
                    sb.append(str);
                    Log.w(str2, sb.toString(), r0);
                    return null;
                }
            }
        }.execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m26232e() {
        if (this.f18837h != null) {
            this.f18837h.cancel(true);
        }
        this.f18837h = new C5258a();
        this.f18837h.execute(new String[]{f18831c, App.f18523y, App.f18524z, App.f18522x, C5323c.m26636a(this.f18834e)});
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m26233f() {
        if (this.f18838i != null) {
            this.f18838i.cancel();
        }
        if (this.f18837h != null) {
            this.f18837h.cancel(true);
        }
        if (this.f18833a != null) {
            this.f18833a.mo17218b();
        }
    }

    /* renamed from: a */
    public void mo17261a() {
        if (this.f18838i != null) {
            this.f18838i.cancel();
        }
    }

    /* renamed from: b */
    public void mo17262b() {
        if (this.f18838i != null) {
            this.f18838i.cancel();
        }
        this.f18838i = new Timer();
        this.f18838i.schedule(new TimerTask() {
            public void run() {
                C5254c.this.m26232e();
            }
        }, 0, (long) this.f18840k);
    }

    public void setAdListener(C5259b bVar) {
        this.f18833a = bVar;
    }
}
