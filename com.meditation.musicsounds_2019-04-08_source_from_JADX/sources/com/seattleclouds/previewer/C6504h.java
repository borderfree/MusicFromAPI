package com.seattleclouds.previewer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.ColorStateList;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6574ac;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6603au;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.seattleclouds.previewer.h */
public class C6504h extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23063a = "h";

    /* renamed from: ai */
    private static final NumberFormat f23064ai = NumberFormat.getInstance();

    /* renamed from: ae */
    private TextView f23065ae;

    /* renamed from: af */
    private TextView f23066af;

    /* renamed from: ag */
    private ProgressBar f23067ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public Button f23068ah;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public List<String> f23069aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public List<String> f23070ak = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: al */
    public List<String> f23071al = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: am */
    public String f23072am;

    /* renamed from: an */
    private boolean f23073an = false;

    /* renamed from: ao */
    private MenuItem f23074ao;

    /* renamed from: ap */
    private boolean f23075ap = false;

    /* renamed from: aq */
    private ScheduledThreadPoolExecutor f23076aq = new ScheduledThreadPoolExecutor(1);

    /* renamed from: ar */
    private ScheduledFuture<?> f23077ar = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6540l f23078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f23079c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View f23080d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public EditText f23081e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f23082f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f23083g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public View f23084h;

    /* renamed from: i */
    private TextView f23085i;

    /* renamed from: com.seattleclouds.previewer.h$a */
    private class C6512a extends AsyncTask<Void, Void, Integer> {
        private C6512a() {
        }

        /* renamed from: a */
        private void m31512a(InputStream inputStream) {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setInput(new InputStreamReader(inputStream, "UTF-8"));
            boolean z = false;
            boolean z2 = false;
            for (int eventType = newPullParser.getEventType(); eventType != 1 && !z; eventType = newPullParser.next()) {
                switch (eventType) {
                    case 2:
                        String name = newPullParser.getName();
                        if (!name.equalsIgnoreCase("pntopics")) {
                            if (name.equalsIgnoreCase("topic")) {
                                if (!z2) {
                                    C6603au.m31952a(newPullParser);
                                    break;
                                } else {
                                    C6504h.this.f23069aj.add(newPullParser.getAttributeValue(null, "id"));
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    case 3:
                        if (!newPullParser.getName().equalsIgnoreCase("pntopics")) {
                            break;
                        } else {
                            z = true;
                            break;
                        }
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0056=Splitter:B:16:0x0056, B:22:0x007f=Splitter:B:22:0x007f} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.Void... r6) {
            /*
                r5 = this;
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "http://"
                r6.append(r0)
                java.lang.String r0 = com.seattleclouds.App.f18516r
                r6.append(r0)
                java.lang.String r0 = "/"
                r6.append(r0)
                java.lang.String r0 = com.seattleclouds.App.m25671p()
                r6.append(r0)
                java.lang.String r0 = "/"
                r6.append(r0)
                com.seattleclouds.previewer.h r0 = com.seattleclouds.previewer.C6504h.this
                com.seattleclouds.previewer.l r0 = r0.f23078b
                java.lang.String r0 = r0.mo20246a()
                r6.append(r0)
                java.lang.String r0 = "/app.xml"
                r6.append(r0)
                java.lang.String r6 = r6.toString()
                r0 = 0
                java.io.InputStream r6 = com.seattleclouds.util.HTTPUtil.m31756a(r6)     // Catch:{ XmlPullParserException -> 0x007e, IOException -> 0x0055 }
                r5.m31512a(r6)     // Catch:{ XmlPullParserException -> 0x004e, IOException -> 0x0049, all -> 0x0044 }
                if (r6 == 0) goto L_0x0043
                org.apache.commons.p198io.C6732d.m32485a(r6)
            L_0x0043:
                return r0
            L_0x0044:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x00a7
            L_0x0049:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x0056
            L_0x004e:
                r0 = move-exception
                r4 = r0
                r0 = r6
                r6 = r4
                goto L_0x007f
            L_0x0053:
                r6 = move-exception
                goto L_0x00a7
            L_0x0055:
                r6 = move-exception
            L_0x0056:
                java.lang.String r1 = com.seattleclouds.previewer.C6504h.f23063a     // Catch:{ all -> 0x0053 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r2.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "error fetching app info: "
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0053 }
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0053 }
                android.util.Log.e(r1, r2, r6)     // Catch:{ all -> 0x0053 }
                r6 = -1001(0xfffffffffffffc17, float:NaN)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
                if (r0 == 0) goto L_0x007d
                org.apache.commons.p198io.C6732d.m32485a(r0)
            L_0x007d:
                return r6
            L_0x007e:
                r6 = move-exception
            L_0x007f:
                java.lang.String r1 = com.seattleclouds.previewer.C6504h.f23063a     // Catch:{ all -> 0x0053 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0053 }
                r2.<init>()     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "error parsing app info: "
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0053 }
                r2.append(r3)     // Catch:{ all -> 0x0053 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0053 }
                android.util.Log.e(r1, r2, r6)     // Catch:{ all -> 0x0053 }
                r6 = -1002(0xfffffffffffffc16, float:NaN)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
                if (r0 == 0) goto L_0x00a6
                org.apache.commons.p198io.C6732d.m32485a(r0)
            L_0x00a6:
                return r6
            L_0x00a7:
                if (r0 == 0) goto L_0x00ac
                org.apache.commons.p198io.C6732d.m32485a(r0)
            L_0x00ac:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.C6504h.C6512a.doInBackground(java.lang.Void[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C6504h hVar;
            int i;
            int i2;
            super.onPostExecute(num);
            C0367h s = C6504h.this.mo1318s();
            if (s != null) {
                if (num == null) {
                    int i3 = 8;
                    C6504h.this.f23080d.setVisibility(8);
                    C6504h.this.f23079c.setVisibility(0);
                    View n = C6504h.this.f23082f;
                    if (C6504h.this.f23069aj.size() > 0) {
                        i3 = 0;
                    }
                    n.setVisibility(i3);
                    C6504h.this.m31498m(true);
                    C6504h.this.m31475at();
                    return;
                }
                C6504h.this.f23068ah.setVisibility(4);
                if (num.intValue() != -1001 || C6619m.m32026h(s)) {
                    hVar = C6504h.this;
                    i2 = C5462k.previewer_pn_error_loading_app_data;
                    i = C5462k.previewer_try_again;
                } else {
                    hVar = C6504h.this;
                    i2 = C5462k.previewer_pn_network_error;
                    i = C5462k.common_no_network;
                }
                hVar.m31483c(i2, i);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C6504h.this.f23069aj = new ArrayList();
        }
    }

    /* renamed from: com.seattleclouds.previewer.h$b */
    private class C6513b extends AsyncTask<String, Void, Integer> {

        /* renamed from: b */
        private JSONObject f23097b;

        private C6513b() {
            this.f23097b = null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.String... r7) {
            /*
                r6 = this;
                com.seattleclouds.previewer.h r7 = com.seattleclouds.previewer.C6504h.this
                android.support.v4.app.h r7 = r7.mo1318s()
                r0 = 0
                if (r7 != 0) goto L_0x000a
                return r0
            L_0x000a:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r1 = "users/"
                r7.append(r1)
                java.lang.String r1 = com.seattleclouds.App.f18523y
                r7.append(r1)
                java.lang.String r1 = "/apps/"
                r7.append(r1)
                com.seattleclouds.previewer.h r1 = com.seattleclouds.previewer.C6504h.this
                com.seattleclouds.previewer.l r1 = r1.f23078b
                java.lang.String r1 = r1.mo20246a()
                r7.append(r1)
                java.lang.String r1 = "/cloudMessages?publisherId="
                r7.append(r1)
                java.lang.String r1 = com.seattleclouds.App.f18522x
                r7.append(r1)
                java.lang.String r7 = r7.toString()
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.lang.String r2 = "type"
                java.lang.String r3 = "announcement"
                r1.put(r2, r3)
                java.lang.String r2 = "data.message"
                com.seattleclouds.previewer.h r3 = com.seattleclouds.previewer.C6504h.this
                android.widget.EditText r3 = r3.f23081e
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                r1.put(r2, r3)
                java.lang.String r2 = "topics"
                java.lang.String r3 = ","
                com.seattleclouds.previewer.h r4 = com.seattleclouds.previewer.C6504h.this
                java.util.List r4 = r4.f23070ak
                r5 = 0
                java.lang.String[] r5 = new java.lang.String[r5]
                java.lang.Object[] r4 = r4.toArray(r5)
                java.lang.String[] r4 = (java.lang.String[]) r4
                java.lang.String r3 = com.seattleclouds.util.C6592al.m31906a(r3, r4)
                r1.put(r2, r3)
                r2 = -1002(0xfffffffffffffc16, float:NaN)
                com.seattleclouds.api.b r3 = com.seattleclouds.api.C5268b.m26272a()     // Catch:{ IOException -> 0x00d8, JSONException -> 0x00d3, HttpResponseException -> 0x00ce, SCApiException -> 0x008a }
                com.seattleclouds.api.c r4 = new com.seattleclouds.api.c     // Catch:{ IOException -> 0x00d8, JSONException -> 0x00d3, HttpResponseException -> 0x00ce, SCApiException -> 0x008a }
                java.lang.String r5 = "POST"
                r4.<init>(r5, r7, r0, r1)     // Catch:{ IOException -> 0x00d8, JSONException -> 0x00d3, HttpResponseException -> 0x00ce, SCApiException -> 0x008a }
                org.json.JSONObject r7 = r3.mo17298a(r4)     // Catch:{ IOException -> 0x00d8, JSONException -> 0x00d3, HttpResponseException -> 0x00ce, SCApiException -> 0x008a }
                r6.f23097b = r7     // Catch:{ IOException -> 0x00d8, JSONException -> 0x00d3, HttpResponseException -> 0x00ce, SCApiException -> 0x008a }
                return r0
            L_0x008a:
                r7 = move-exception
                r0 = -1
                java.lang.String r1 = ""
                int r3 = r7.getErrorCode()     // Catch:{ JSONException -> 0x0099 }
                java.lang.String r7 = r7.getErrorReason()     // Catch:{ JSONException -> 0x0097 }
                goto L_0x00b8
            L_0x0097:
                r7 = move-exception
                goto L_0x009b
            L_0x0099:
                r7 = move-exception
                r3 = -1
            L_0x009b:
                java.lang.String r0 = com.seattleclouds.previewer.C6504h.f23063a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "JSON parsing exception: "
                r4.append(r5)
                java.lang.String r7 = r7.toString()
                r4.append(r7)
                java.lang.String r7 = r4.toString()
                android.util.Log.e(r0, r7)
                r7 = r1
            L_0x00b8:
                r0 = 403(0x193, float:5.65E-43)
                if (r3 != r0) goto L_0x00c9
                java.lang.String r1 = "cloudMessagingNotAllowedForApp"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x00c9
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                return r7
            L_0x00c9:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                return r7
            L_0x00ce:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                return r7
            L_0x00d3:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                return r7
            L_0x00d8:
                r7 = -1001(0xfffffffffffffc17, float:NaN)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.C6504h.C6513b.doInBackground(java.lang.String[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C6504h hVar;
            int i;
            int i2;
            super.onPostExecute(num);
            C0367h s = C6504h.this.mo1318s();
            if (s != null) {
                if (num != null) {
                    if (num.intValue() == -1001) {
                        if (!C6619m.m32026h(s)) {
                            hVar = C6504h.this;
                            i = C5462k.previewer_pn_network_error;
                            i2 = C5462k.common_no_network;
                        } else {
                            hVar = C6504h.this;
                            i = C5462k.previewer_pn_network_error;
                            i2 = C5462k.common_network_error;
                        }
                    } else if (num.intValue() == 403) {
                        hVar = C6504h.this;
                        i = C5462k.previewer_pn_cloud_messaging_not_allowed_for_app;
                        i2 = C5462k.previewer_pn_cloud_messaging_not_allowed_for_app_detail;
                    } else {
                        hVar = C6504h.this;
                        i = C5462k.previewer_pn_server_error;
                        i2 = C5462k.previewer_try_again;
                    }
                    hVar.m31483c(i, i2);
                    return;
                }
                try {
                    C6504h.this.m31466a(this.f23097b);
                    String string = this.f23097b.getString("status");
                    if (string.equals("queued") || string.equals("processing")) {
                        C6504h.this.f23072am = this.f23097b.getString("id");
                        C6504h.this.m31488e();
                        C6504h.this.m31468aB();
                    }
                } catch (JSONException unused) {
                    C6504h.this.m31483c(C5462k.previewer_pn_server_error, C5462k.previewer_try_again);
                }
            }
        }
    }

    /* renamed from: a */
    private void m31461a(int i, String str) {
        this.f23084h.setVisibility(0);
        this.f23080d.setVisibility(8);
        this.f23079c.setVisibility(8);
        m31498m(false);
        this.f23066af.setVisibility(0);
        this.f23067ag.setVisibility(4);
        this.f23068ah.setVisibility(0);
        this.f23085i.setText(i);
        this.f23065ae.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31466a(JSONObject jSONObject) {
        int i;
        int i2;
        String string = jSONObject.getString("status");
        if (string.equals("queued")) {
            this.f23067ag.setIndeterminate(true);
            m31486d(C5462k.previewer_pn_queued, C5462k.previewer_pn_queued_detail);
            this.f23066af.setVisibility(4);
        } else if (string.equals("processing")) {
            int i3 = jSONObject.getJSONObject("registrations").getInt("total");
            String format = i3 < 0 ? "?" : f23064ai.format((long) i3);
            int i4 = jSONObject.getJSONObject("registrations").getInt("processed");
            StringBuilder sb = new StringBuilder();
            sb.append(f23064ai.format((long) i4));
            sb.append(" / ");
            sb.append(format);
            String sb2 = sb.toString();
            if (i3 >= 0) {
                this.f23067ag.setIndeterminate(false);
                this.f23067ag.setMax(i3);
                this.f23067ag.setProgress(i4);
            } else {
                this.f23067ag.setIndeterminate(true);
            }
            m31479b(C5462k.previewer_pn_delivered, sb2);
        } else if (string.equals("delivered")) {
            m31461a(C5462k.previewer_pn_delivered, f23064ai.format((long) jSONObject.getJSONObject("registrations").getInt("total")));
        } else {
            if (string.equals("failed")) {
                String string2 = jSONObject.getJSONObject("deliveryError").getString("reason");
                if (string2.equals("payloadTooBig")) {
                    i = C5462k.previewer_pn_delivery_error;
                    i2 = C5462k.previewer_pn_message_too_big;
                } else if (string2.equals("overCapacity")) {
                    i = C5462k.previewer_pn_over_capacity_error;
                    i2 = C5462k.previewer_try_again;
                } else if (string2.equals("apnConfigurationError")) {
                    i = C5462k.previewer_pn_apn_config_error;
                    i2 = C5462k.previewer_pn_apn_config_error_detail;
                }
                m31483c(i, i2);
            }
            i = C5462k.previewer_pn_server_error;
            i2 = C5462k.previewer_try_again;
            m31483c(i, i2);
        }
    }

    /* renamed from: aA */
    private void m31467aA() {
        m31489e(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m31468aB() {
        m31489e(5);
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public synchronized void m31469aC() {
        if (this.f23077ar != null) {
            this.f23077ar.cancel(false);
            this.f23077ar = null;
        }
        this.f23075ap = false;
    }

    /* renamed from: aD */
    private synchronized void m31470aD() {
        m31469aC();
        this.f23075ap = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: aE */
    public void m31471aE() {
        this.f23072am = null;
        m31488e();
        if (this.f23069aj == null) {
            this.f23084h.setVisibility(8);
            this.f23080d.setVisibility(0);
            new C6512a().execute(new Void[0]);
            return;
        }
        this.f23084h.setVisibility(8);
        this.f23079c.setVisibility(0);
        m31475at();
        m31498m(true);
    }

    /* renamed from: aF */
    private void m31472aF() {
        if (this.f23081e.getText().toString().trim().length() < 4) {
            C6620n.m32034a((Context) mo1318s(), (String) null, mo1219a(C5462k.previewer_pn_message_too_short));
            return;
        }
        m31476az();
        m31498m(false);
        this.f23079c.setVisibility(8);
        this.f23080d.setVisibility(0);
        new C6513b().execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: aG */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m31473aG() {
        /*
            r11 = this;
            android.support.v4.app.h r0 = r11.mo1318s()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r1 = r11.f23072am
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = 0
            r2 = 404(0x194, float:5.66E-43)
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = -1002(0xfffffffffffffc16, float:NaN)
            r5 = 0
            com.seattleclouds.api.b r6 = com.seattleclouds.api.C5268b.m26272a()     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            com.seattleclouds.api.c r7 = new com.seattleclouds.api.c     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            java.lang.String r8 = "GET"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            r9.<init>()     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            java.lang.String r10 = "cloudMessages/"
            r9.append(r10)     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            java.lang.String r10 = r11.f23072am     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            r9.append(r10)     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            r7.<init>(r8, r9, r5, r5)     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            org.json.JSONObject r6 = r6.mo17298a(r7)     // Catch:{ IOException -> 0x0062, HttpResponseException | JSONException -> 0x0066, SCApiException -> 0x0039 }
            r5 = r6
            r4 = 0
            goto L_0x0066
        L_0x0039:
            r1 = move-exception
            r6 = -1
            java.lang.String r7 = ""
            int r8 = r1.getErrorCode()     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r1 = r1.getErrorReason()     // Catch:{ JSONException -> 0x0047 }
            goto L_0x0048
        L_0x0046:
            r8 = -1
        L_0x0047:
            r1 = r7
        L_0x0048:
            if (r8 != r3) goto L_0x0055
            java.lang.String r6 = "internalError"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0055
            r4 = 500(0x1f4, float:7.0E-43)
            goto L_0x0066
        L_0x0055:
            if (r8 != r2) goto L_0x0066
            java.lang.String r3 = "notFound"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0066
            r4 = 404(0x194, float:5.66E-43)
            goto L_0x0066
        L_0x0062:
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            r4 = -1001(0xfffffffffffffc17, float:NaN)
        L_0x0066:
            com.seattleclouds.previewer.h$7 r1 = new com.seattleclouds.previewer.h$7
            r1.<init>(r4, r5)
            r0.runOnUiThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.C6504h.m31473aG():void");
    }

    /* renamed from: as */
    private void m31474as() {
        this.f23072am = null;
        JSONObject a = C6574ac.m31816a((Context) mo1318s(), m31484d());
        if (a != null) {
            try {
                this.f23072am = a.getString("currentMessageId");
                if (this.f23072am != null && C6592al.m31910c(this.f23072am)) {
                    this.f23072am = null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m31475at() {
        if (mo1318s() != null) {
            this.f23081e.requestFocus();
            ((InputMethodManager) mo1318s().getSystemService("input_method")).showSoftInput(this.f23081e, 1);
        }
    }

    /* renamed from: az */
    private void m31476az() {
        if (mo1318s() != null) {
            ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(this.f23081e.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    private void m31478b(int i, int i2) {
        m31461a(i, mo1219a(i2));
    }

    /* renamed from: b */
    private void m31479b(int i, String str) {
        m31461a(i, str);
        this.f23068ah.setVisibility(4);
        this.f23067ag.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31482c() {
        boolean[] zArr = new boolean[this.f23069aj.size()];
        int i = 0;
        for (String contains : this.f23069aj) {
            int i2 = i + 1;
            zArr[i] = this.f23070ak.contains(contains);
            i = i2;
        }
        this.f23071al.clear();
        this.f23071al.addAll(this.f23070ak);
        new C0766a(mo1318s()).mo3059a((CharSequence[]) this.f23069aj.toArray(new String[0]), zArr, (OnMultiChoiceClickListener) new OnMultiChoiceClickListener() {
            public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                if (z) {
                    C6504h.this.f23071al.add(C6504h.this.f23069aj.get(i));
                } else {
                    C6504h.this.f23071al.remove(C6504h.this.f23069aj.get(i));
                }
            }
        }).mo3048a(C5462k.f19438OK, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView e;
                int i2;
                C6504h.this.f23070ak.clear();
                C6504h.this.f23070ak.addAll(C6504h.this.f23071al);
                if (C6504h.this.f23070ak.size() == 0) {
                    e = C6504h.this.f23083g;
                    i2 = C5462k.previewer_pn_no_topics;
                } else if (C6504h.this.f23070ak.size() == C6504h.this.f23069aj.size()) {
                    e = C6504h.this.f23083g;
                    i2 = C5462k.previewer_pn_all_topics;
                } else {
                    C6504h.this.f23083g.setText(C6504h.this.mo1220a(C5462k.previewer_pn_n_topics, Integer.valueOf(C6504h.this.f23070ak.size())));
                    return;
                }
                e.setText(i2);
            }
        }).mo3061b(C5462k.cancel, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).mo3068c();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31483c(int i, int i2) {
        m31478b(i, i2);
        this.f23066af.setVisibility(4);
    }

    /* renamed from: d */
    private String m31484d() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewerSendAnnouncementState.");
        sb.append(App.f18522x);
        sb.append(".");
        sb.append(App.f18523y);
        sb.append(".");
        sb.append(this.f23078b.mo20246a());
        return sb.toString();
    }

    /* renamed from: d */
    private void m31486d(int i, int i2) {
        m31479b(i, mo1219a(i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m31488e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentMessageId", this.f23072am);
        } catch (JSONException unused) {
        }
        C6574ac.m31818a((Context) mo1318s(), jSONObject, m31484d());
    }

    /* renamed from: e */
    private synchronized void m31489e(int i) {
        m31469aC();
        this.f23077ar = this.f23076aq.scheduleAtFixedRate(new Runnable() {
            public void run() {
                C6504h.this.m31473aG();
            }
        }, (long) i, 5, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m31498m(boolean z) {
        this.f23073an = z;
        mo20292ay();
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        this.f23076aq.shutdown();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_previewer_send_announcement, viewGroup, false);
        Bundle m = mo1307m();
        String string = m != null ? m.getString("ARG_APP_ID") : null;
        if (string == null) {
            string = "unknown";
        }
        if (C6452c.f22933a != null && C6452c.f22933a.size() > 0) {
            this.f23078b = (C6540l) C6452c.f22933a.get(string);
        }
        if (this.f23078b == null) {
            mo1318s().finish();
            return inflate;
        }
        this.f23079c = inflate.findViewById(C5458g.form_container);
        this.f23080d = inflate.findViewById(C5458g.main_progress);
        this.f23081e = (EditText) inflate.findViewById(C5458g.message);
        this.f23082f = inflate.findViewById(C5458g.topics_container);
        this.f23083g = (TextView) inflate.findViewById(C5458g.topics);
        this.f23083g.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6504h.this.m31482c();
            }
        });
        this.f23084h = inflate.findViewById(C5458g.status_view);
        this.f23085i = (TextView) inflate.findViewById(C5458g.status);
        this.f23065ae = (TextView) inflate.findViewById(C5458g.status2);
        this.f23066af = (TextView) inflate.findViewById(C5458g.status3);
        this.f23067ag = (ProgressBar) inflate.findViewById(C5458g.delivery_progress);
        this.f23068ah = (Button) inflate.findViewById(C5458g.send_another_message);
        this.f23068ah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C6504h.this.m31471aE();
            }
        });
        ColorStateList valueOf = ColorStateList.valueOf(C6594an.m31917a(mo1318s(), 16842808));
        C5334b.m26761a(valueOf, (ImageView) this.f23079c.findViewById(C5458g.message_icon));
        C5334b.m26761a(valueOf, (ImageView) this.f23079c.findViewById(C5458g.topics_icon));
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f23076aq.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        mo20294d(C5462k.previewer_pn_send_title);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        this.f23074ao.setVisible(this.f23073an);
        this.f23074ao.setEnabled(this.f23073an);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.previewer_send_announcement, menu);
        this.f23074ao = menu.findItem(C5458g.send);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f23080d.setVisibility(0);
        int i = 8;
        this.f23079c.setVisibility(8);
        this.f23084h.setVisibility(8);
        View view2 = this.f23082f;
        if (this.f23069aj != null && this.f23069aj.size() > 0) {
            i = 0;
        }
        view2.setVisibility(i);
        m31474as();
        if (this.f23072am != null) {
            m31467aA();
        } else {
            new C6512a().execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            m31470aD();
        } else if (this.f23075ap) {
            m31467aA();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.send) {
            return super.mo1245a(menuItem);
        }
        m31472aF();
        return true;
    }
}
