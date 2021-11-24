package com.seattleclouds.modules.order.indiapay.p178a;

import android.content.Context;
import android.os.AsyncTask;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.order.indiapay.p179b.C5981b;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;

/* renamed from: com.seattleclouds.modules.order.indiapay.a.a */
public class C5974a extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private static final String f21176a = "a";

    /* renamed from: b */
    private String f21177b = null;

    /* renamed from: c */
    private String f21178c = "";

    /* renamed from: d */
    private C6000c f21179d = C6001d.m29442a().mo18963b();

    /* renamed from: e */
    private Context f21180e;

    /* renamed from: f */
    private C5981b f21181f;

    public C5974a(Context context, C5981b bVar) {
        this.f21180e = context;
        this.f21181f = bVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        switch(r2) {
            case 0: goto L_0x00ac;
            case 1: goto L_0x00a2;
            case 2: goto L_0x0098;
            case 3: goto L_0x008e;
            case 4: goto L_0x0084;
            default: goto L_0x0083;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        r4.f21179d.mo18954t("Failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return "Failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008e, code lost:
        r4.f21179d.mo18954t("Rejected");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        return "Rejected";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r4.f21179d.mo18954t("Expired");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        return "Expired";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        r4.f21179d.mo18954t("Pending");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        return "Pending";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ac, code lost:
        r4.f21179d.mo18954t("Success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        return "Success";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(java.lang.Void... r5) {
        /*
            r4 = this;
            r5 = 0
            com.seattleclouds.modules.order.indiapay.api.a r0 = com.seattleclouds.modules.order.indiapay.api.C5977a.m29304a()     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            com.seattleclouds.modules.order.indiapay.c.c r1 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            org.json.JSONObject r0 = r0.mo18886c(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            boolean r1 = r4.isCancelled()     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r1 == 0) goto L_0x0012
            return r5
        L_0x0012:
            java.lang.String r1 = "data"
            org.json.JSONObject r0 = r0.getJSONObject(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = "success"
            boolean r1 = r0.has(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = "success"
            int r1 = r0.getInt(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            r2 = 1
            if (r1 != r2) goto L_0x00b6
            java.lang.String r1 = "data"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = "code"
            boolean r1 = r0.has(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r1 == 0) goto L_0x00f4
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            r1 = -1
            int r3 = r0.hashCode()     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            switch(r3) {
                case -543852386: goto L_0x0075;
                case -202516509: goto L_0x006b;
                case 355417861: goto L_0x0061;
                case 982065527: goto L_0x0058;
                case 2096857181: goto L_0x004e;
                default: goto L_0x004d;
            }     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
        L_0x004d:
            goto L_0x007f
        L_0x004e:
            java.lang.String r2 = "Failed"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x007f
            r2 = 4
            goto L_0x0080
        L_0x0058:
            java.lang.String r3 = "Pending"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0061:
            java.lang.String r2 = "Expired"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x007f
            r2 = 2
            goto L_0x0080
        L_0x006b:
            java.lang.String r2 = "Success"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x007f
            r2 = 0
            goto L_0x0080
        L_0x0075:
            java.lang.String r2 = "Rejected"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r0 == 0) goto L_0x007f
            r2 = 3
            goto L_0x0080
        L_0x007f:
            r2 = -1
        L_0x0080:
            switch(r2) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0098;
                case 3: goto L_0x008e;
                case 4: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
        L_0x0083:
            goto L_0x00f4
        L_0x0084:
            com.seattleclouds.modules.order.indiapay.c.c r0 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "Failed"
            r0.mo18954t(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = "Failed"
            return r0
        L_0x008e:
            com.seattleclouds.modules.order.indiapay.c.c r0 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "Rejected"
            r0.mo18954t(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = "Rejected"
            return r0
        L_0x0098:
            com.seattleclouds.modules.order.indiapay.c.c r0 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "Expired"
            r0.mo18954t(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = "Expired"
            return r0
        L_0x00a2:
            com.seattleclouds.modules.order.indiapay.c.c r0 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "Pending"
            r0.mo18954t(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = "Pending"
            return r0
        L_0x00ac:
            com.seattleclouds.modules.order.indiapay.c.c r0 = r4.f21179d     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "Success"
            r0.mo18954t(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r0 = "Success"
            return r0
        L_0x00b6:
            if (r1 != 0) goto L_0x00f4
            java.lang.String r1 = "message"
            boolean r1 = r0.has(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = "status_code"
            boolean r1 = r0.has(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = "status_code"
            r0.getInt(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            java.lang.String r1 = "message"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
            r4.f21177b = r0     // Catch:{ IOException -> 0x00e1, HttpResponseException | JSONException -> 0x00d6, IndiaPayApiException -> 0x00f4 }
        L_0x00d5:
            return r5
        L_0x00d6:
            android.content.Context r0 = r4.f21180e
            int r1 = com.seattleclouds.C5451m.C5462k.common_internal_server_error
        L_0x00da:
            java.lang.String r0 = r0.getString(r1)
            r4.f21177b = r0
            goto L_0x00f4
        L_0x00e1:
            android.content.Context r0 = r4.f21180e
            boolean r0 = com.seattleclouds.util.C6619m.m32026h(r0)
            if (r0 != 0) goto L_0x00ef
            android.content.Context r0 = r4.f21180e
            int r1 = com.seattleclouds.C5451m.C5462k.common_no_network
            goto L_0x00da
        L_0x00ef:
            android.content.Context r0 = r4.f21180e
            int r1 = com.seattleclouds.C5451m.C5462k.common_network_error
            goto L_0x00da
        L_0x00f4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.order.indiapay.p178a.C5974a.doInBackground(java.lang.Void[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C5981b bVar;
        String string;
        if (str == null) {
            if (this.f21177b == null) {
                this.f21177b = this.f21180e.getString(C5462k.indiapay_connection_try_again);
            }
            if (this.f21181f != null) {
                bVar = this.f21181f;
                string = this.f21177b;
            } else {
                return;
            }
        } else if ("Success".equals(str) || "Expired".equals(str) || "Rejected".equals(str) || "Failed".equals(str) || "Pending".equals(str)) {
            if (this.f21181f != null) {
                this.f21181f.mo18889a();
                return;
            }
            return;
        } else if (this.f21181f != null) {
            bVar = this.f21181f;
            string = this.f21180e.getString(C5462k.indiapay_connection_try_again);
            this.f21177b = string;
        } else {
            return;
        }
        bVar.mo18890a(string);
    }
}
