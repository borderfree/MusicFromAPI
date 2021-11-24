package com.seattleclouds.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.ads.e */
public class C5261e extends RelativeLayout {

    /* renamed from: a */
    private static final String f18849a = App.f18519u;

    /* renamed from: b */
    private static final String f18850b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f18851c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f18852d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f18853e = -1;

    /* renamed from: f */
    private C5265a f18854f;

    /* renamed from: g */
    private Timer f18855g;

    /* renamed from: h */
    private ImageView f18856h;

    /* renamed from: i */
    private int f18857i = 30000;

    /* renamed from: com.seattleclouds.ads.e$a */
    private class C5265a extends AsyncTask<String, Void, Drawable> {

        /* renamed from: b */
        private String f18864b;

        private C5265a() {
            this.f18864b = null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0117, code lost:
            if (r2 != null) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0128, code lost:
            if (r2 != null) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x00de, code lost:
            if (r2 != null) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0106, code lost:
            if (r2 != null) goto L_0x00e0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x0125  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0130  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0135 A[SYNTHETIC, Splitter:B:120:0x0135] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0103  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.drawable.Drawable doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                boolean r0 = r6.isCancelled()
                r1 = 0
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011a, SocketTimeoutException -> 0x0109, IOException -> 0x00e4, JSONException -> 0x00d0, all -> 0x00cb }
                r2 = 0
                r7 = r7[r2]     // Catch:{ MalformedURLException -> 0x011a, SocketTimeoutException -> 0x0109, IOException -> 0x00e4, JSONException -> 0x00d0, all -> 0x00cb }
                r0.<init>(r7)     // Catch:{ MalformedURLException -> 0x011a, SocketTimeoutException -> 0x0109, IOException -> 0x00e4, JSONException -> 0x00d0, all -> 0x00cb }
                java.net.URLConnection r7 = r0.openConnection()     // Catch:{ MalformedURLException -> 0x011a, SocketTimeoutException -> 0x0109, IOException -> 0x00e4, JSONException -> 0x00d0, all -> 0x00cb }
                java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ MalformedURLException -> 0x011a, SocketTimeoutException -> 0x0109, IOException -> 0x00e4, JSONException -> 0x00d0, all -> 0x00cb }
                r0 = 25000(0x61a8, float:3.5032E-41)
                r7.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, JSONException -> 0x00c2, all -> 0x00be }
                r7.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, JSONException -> 0x00c2, all -> 0x00be }
                java.io.InputStream r2 = r7.getInputStream()     // Catch:{ MalformedURLException -> 0x00c9, SocketTimeoutException -> 0x00c7, IOException -> 0x00c4, JSONException -> 0x00c2, all -> 0x00be }
                r3 = 1024(0x400, float:1.435E-42)
                java.lang.String r3 = com.seattleclouds.util.C6613i.m31986a(r2, r3)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r4.<init>(r3)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                com.seattleclouds.ads.e r3 = com.seattleclouds.ads.C5261e.this     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                org.json.JSONArray r3 = r3.m26246a(r4)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                int r3 = r3.length()     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                if (r3 == 0) goto L_0x0044
                if (r7 == 0) goto L_0x003e
                r7.disconnect()
            L_0x003e:
                if (r2 == 0) goto L_0x0043
                r2.close()     // Catch:{ IOException -> 0x0043 }
            L_0x0043:
                return r1
            L_0x0044:
                java.lang.String r3 = "ad"
                org.json.JSONObject r3 = r4.getJSONObject(r3)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                com.seattleclouds.ads.e r4 = com.seattleclouds.ads.C5261e.this     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                java.lang.String r5 = "id"
                int r5 = r3.getInt(r5)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r4.f18853e = r5     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                java.lang.String r4 = "url"
                java.lang.String r4 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r6.f18864b = r4     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                java.lang.String r4 = "banner_image"
                java.lang.String r3 = r3.getString(r4)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r7.disconnect()     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r2.close()     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                boolean r4 = r6.isCancelled()     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                if (r4 == 0) goto L_0x007a
                if (r7 == 0) goto L_0x0074
                r7.disconnect()
            L_0x0074:
                if (r2 == 0) goto L_0x0079
                r2.close()     // Catch:{ IOException -> 0x0079 }
            L_0x0079:
                return r1
            L_0x007a:
                java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r4.<init>(r3)     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                java.net.URLConnection r3 = r4.openConnection()     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ MalformedURLException -> 0x011c, SocketTimeoutException -> 0x010b, IOException -> 0x00bc, JSONException -> 0x00d2 }
                r3.setConnectTimeout(r0)     // Catch:{ MalformedURLException -> 0x00b9, SocketTimeoutException -> 0x00b6, IOException -> 0x00b3, JSONException -> 0x00b1, all -> 0x00ad }
                r3.setReadTimeout(r0)     // Catch:{ MalformedURLException -> 0x00b9, SocketTimeoutException -> 0x00b6, IOException -> 0x00b3, JSONException -> 0x00b1, all -> 0x00ad }
                java.io.InputStream r7 = r3.getInputStream()     // Catch:{ MalformedURLException -> 0x00b9, SocketTimeoutException -> 0x00b6, IOException -> 0x00b3, JSONException -> 0x00b1, all -> 0x00ad }
                java.lang.String r0 = "sc_ad_banner_image"
                android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r7, r0)     // Catch:{ MalformedURLException -> 0x00ab, SocketTimeoutException -> 0x00a9, IOException -> 0x00a6, JSONException -> 0x00a4, all -> 0x00a1 }
                if (r3 == 0) goto L_0x009a
                r3.disconnect()
            L_0x009a:
                if (r7 == 0) goto L_0x012c
                r7.close()     // Catch:{ IOException -> 0x012c }
                goto L_0x012c
            L_0x00a1:
                r0 = move-exception
                r2 = r7
                goto L_0x00ae
            L_0x00a4:
                r2 = r7
                goto L_0x00b1
            L_0x00a6:
                r0 = move-exception
                r2 = r7
                goto L_0x00b4
            L_0x00a9:
                r2 = r7
                goto L_0x00b6
            L_0x00ab:
                r2 = r7
                goto L_0x00b9
            L_0x00ad:
                r0 = move-exception
            L_0x00ae:
                r7 = r3
                goto L_0x012e
            L_0x00b1:
                r7 = r3
                goto L_0x00d2
            L_0x00b3:
                r0 = move-exception
            L_0x00b4:
                r7 = r3
                goto L_0x00e7
            L_0x00b6:
                r7 = r3
                goto L_0x010b
            L_0x00b9:
                r7 = r3
                goto L_0x011c
            L_0x00bc:
                r0 = move-exception
                goto L_0x00e7
            L_0x00be:
                r0 = move-exception
                r2 = r1
                goto L_0x012e
            L_0x00c2:
                r2 = r1
                goto L_0x00d2
            L_0x00c4:
                r0 = move-exception
                r2 = r1
                goto L_0x00e7
            L_0x00c7:
                r2 = r1
                goto L_0x010b
            L_0x00c9:
                r2 = r1
                goto L_0x011c
            L_0x00cb:
                r0 = move-exception
                r7 = r1
                r2 = r7
                goto L_0x012e
            L_0x00d0:
                r7 = r1
                r2 = r7
            L_0x00d2:
                java.lang.String r0 = "SCAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r0, r3)     // Catch:{ all -> 0x012d }
                if (r7 == 0) goto L_0x00de
                r7.disconnect()
            L_0x00de:
                if (r2 == 0) goto L_0x012b
            L_0x00e0:
                r2.close()     // Catch:{ IOException -> 0x012b }
                goto L_0x012b
            L_0x00e4:
                r0 = move-exception
                r7 = r1
                r2 = r7
            L_0x00e7:
                java.lang.String r3 = "SCAdView"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012d }
                r4.<init>()     // Catch:{ all -> 0x012d }
                java.lang.String r5 = "Server response error: "
                r4.append(r5)     // Catch:{ all -> 0x012d }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x012d }
                r4.append(r0)     // Catch:{ all -> 0x012d }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x012d }
                android.util.Log.w(r3, r0)     // Catch:{ all -> 0x012d }
                if (r7 == 0) goto L_0x0106
                r7.disconnect()
            L_0x0106:
                if (r2 == 0) goto L_0x012b
                goto L_0x00e0
            L_0x0109:
                r7 = r1
                r2 = r7
            L_0x010b:
                java.lang.String r0 = "SCAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r0, r3)     // Catch:{ all -> 0x012d }
                if (r7 == 0) goto L_0x0117
                r7.disconnect()
            L_0x0117:
                if (r2 == 0) goto L_0x012b
                goto L_0x00e0
            L_0x011a:
                r7 = r1
                r2 = r7
            L_0x011c:
                java.lang.String r0 = "SCAdView"
                java.lang.String r3 = "Server response error"
                android.util.Log.w(r0, r3)     // Catch:{ all -> 0x012d }
                if (r7 == 0) goto L_0x0128
                r7.disconnect()
            L_0x0128:
                if (r2 == 0) goto L_0x012b
                goto L_0x00e0
            L_0x012b:
                r0 = r1
            L_0x012c:
                return r0
            L_0x012d:
                r0 = move-exception
            L_0x012e:
                if (r7 == 0) goto L_0x0133
                r7.disconnect()
            L_0x0133:
                if (r2 == 0) goto L_0x0138
                r2.close()     // Catch:{ IOException -> 0x0138 }
            L_0x0138:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.ads.C5261e.C5265a.doInBackground(java.lang.String[]):android.graphics.drawable.Drawable");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                C5261e.this.m26248a(drawable, this.f18864b);
            }
            super.onPostExecute(drawable);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(f18849a);
        sb.append("/getOwnBanner");
        f18850b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(f18849a);
        sb2.append("/processOwnBanner");
        f18851c = sb2.toString();
    }

    public C5261e(Context context) {
        super(context);
        m26247a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONArray m26246a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("errors");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            StringBuilder sb = new StringBuilder();
            sb.append("SCAd error: ");
            sb.append(jSONObject2.getString("code"));
            sb.append(" - ");
            sb.append(jSONObject2.getString("message"));
            Log.w("SCAdView", sb.toString());
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("warnings");
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SCAd warning: ");
            sb2.append(jSONObject3.getString("code"));
            sb2.append(" - ");
            sb2.append(jSONObject3.getString("message"));
            Log.i("SCAdView", sb2.toString());
        }
        return jSONArray;
    }

    /* renamed from: a */
    private void m26247a(Context context) {
        this.f18852d = context;
        setBackgroundColor(Color.argb(0, 0, 0, 0));
        int j = App.f18501c.mo16965j();
        if (j > 0) {
            this.f18857i = j * 1000;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26248a(Drawable drawable, final String str) {
        if (drawable == null) {
            Log.w("SCAdView", "SC ad image invalid");
        }
        if (str == null) {
            Log.w("SCAdView", "SC ad action url invalid");
        }
        if (drawable != null && str != null) {
            if (this.f18856h == null) {
                LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = C6619m.m32014a(this.f18852d, 320.0f);
                layoutParams.height = C6619m.m32014a(this.f18852d, 50.0f);
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
                }
                setLayoutParams(layoutParams);
                this.f18856h = new ImageView(this.f18852d);
                this.f18856h.setScaleType(ScaleType.FIT_XY);
                addView(this.f18856h, new RelativeLayout.LayoutParams(-1, -1));
            }
            this.f18856h.setImageDrawable(drawable);
            this.f18856h.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (str.contains("://")) {
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setFlags(268435456);
                            intent.setData(Uri.parse(str));
                            C5261e.this.f18852d.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cannot open banner action URL: ");
                            sb.append(str);
                            sb.append(", ex: ");
                            sb.append(e.toString());
                            Log.w("SCAdView", sb.toString(), e);
                        }
                    } else if (!App.m25667n(str)) {
                        C6620n.m32031a(C5261e.this.f18852d, C5462k.warning, String.format(C5261e.this.f18852d.getString(C5462k.common_page_not_found), new Object[]{str}));
                    } else if (C5261e.this.f18852d instanceof Activity) {
                        App.m25621a(str, (Activity) C5261e.this.f18852d);
                    }
                    C5261e.this.m26255e();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m26254d() {
        String str = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f18850b);
            sb.append("?username=");
            sb.append(URLEncoder.encode(App.f18523y, "UTF-8"));
            sb.append("&appid=");
            sb.append(URLEncoder.encode(App.f18524z, "UTF-8"));
            sb.append("&publisherid=");
            sb.append(URLEncoder.encode(App.f18522x, "UTF-8"));
            str = sb.toString();
        } catch (UnsupportedEncodingException unused) {
        }
        if (this.f18854f != null) {
            this.f18854f.cancel(true);
        }
        this.f18854f = new C5265a();
        this.f18854f.execute(new String[]{str});
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m26255e() {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18853e);
        sb.append("");
        hashMap.put("adid", sb.toString());
        new AsyncTask<Void, Void, Void>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                String str;
                StringBuilder sb;
                String str2;
                try {
                    HTTPUtil.m31768b(C5261e.f18851c, hashMap);
                    return null;
                } catch (MalformedURLException e) {
                    str2 = "SCAdView";
                    sb = new StringBuilder();
                    sb.append("Malformed error: ");
                    str = e.toString();
                    r0 = e;
                    sb.append(str);
                    Log.w(str2, sb.toString(), r0);
                    return null;
                } catch (IOException e2) {
                    str2 = "SCAdView";
                    sb = new StringBuilder();
                    sb.append("IO error: ");
                    str = e2.toString();
                    r0 = e2;
                    sb.append(str);
                    Log.w(str2, sb.toString(), r0);
                    return null;
                } catch (JSONException e3) {
                    str2 = "SCAdView";
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

    /* renamed from: a */
    public void mo17274a() {
        if (this.f18855g != null) {
            this.f18855g.cancel();
        }
        this.f18855g = new Timer();
        this.f18855g.schedule(new TimerTask() {
            public void run() {
                C5261e.this.m26254d();
            }
        }, 0, (long) this.f18857i);
    }

    /* renamed from: b */
    public void mo17275b() {
        if (this.f18855g != null) {
            this.f18855g.cancel();
        }
    }
}
