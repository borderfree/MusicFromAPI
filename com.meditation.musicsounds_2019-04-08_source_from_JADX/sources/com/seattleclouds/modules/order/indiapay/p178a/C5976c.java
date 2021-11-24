package com.seattleclouds.modules.order.indiapay.p178a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.modules.order.indiapay.api.C5977a;
import com.seattleclouds.modules.order.indiapay.api.IndiaPayApiException;
import com.seattleclouds.modules.order.indiapay.p180c.C5999b;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.order.indiapay.a.c */
public class C5976c extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private static final String f21187a = "c";

    /* renamed from: b */
    private String f21188b;

    /* renamed from: c */
    private String f21189c = "";

    /* renamed from: d */
    private C6000c f21190d = C6001d.m29442a().mo18963b();

    /* renamed from: e */
    private Context f21191e;

    public C5976c(Context context) {
        this.f21191e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        Context context;
        int i;
        String string;
        try {
            JSONObject b = this.f21190d.mo18958v() ? C5977a.m29304a().mo18884b(this.f21190d) : C5977a.m29304a().mo18883a(this.f21190d);
            if (b == null) {
                return null;
            }
            JSONObject jSONObject = b.getJSONObject("data");
            if (jSONObject != null && jSONObject.has("success")) {
                int i2 = jSONObject.getInt("success");
                if (i2 == 1) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        if (optJSONObject.has("unqtxnid")) {
                            String trim = optJSONObject.getString("unqtxnid").trim();
                            if (!trim.isEmpty() && !trim.equals("null")) {
                                this.f21190d.mo18932i(trim);
                                if (optJSONObject.has("wcollecttxnid")) {
                                    String trim2 = optJSONObject.getString("wcollecttxnid").trim();
                                    if (!trim2.isEmpty() && !trim2.equals("null")) {
                                        this.f21190d.mo18934j(trim2);
                                        if (optJSONObject.has("status")) {
                                            String trim3 = optJSONObject.getString("status").trim();
                                            if (!trim3.isEmpty()) {
                                                this.f21190d.mo18954t(trim3);
                                            }
                                        }
                                        return "success";
                                    }
                                } else if (optJSONObject.has("status")) {
                                    String trim4 = optJSONObject.getString("status").trim();
                                    if (!trim4.isEmpty() && trim4.equals("Scheduled")) {
                                        return "success";
                                    }
                                }
                            }
                        }
                    } else if (this.f21190d.mo18958v()) {
                        String string2 = jSONObject.getString("data");
                        if (!string2.isEmpty()) {
                            this.f21190d.mo18956u(string2);
                            return "success";
                        }
                    }
                } else if (i2 == 0) {
                    if (jSONObject.has("message")) {
                        jSONObject.optInt("status_code");
                        string = jSONObject.getString("message");
                    } else {
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                        if (optJSONObject2 != null && optJSONObject2.has("result") && optJSONObject2.has("status")) {
                            String trim5 = optJSONObject2.getString("result").trim();
                            String trim6 = optJSONObject2.getString("status").trim();
                            if ("INVALID VIRTUAL ADDRESS.".equals(trim5) && C5999b.f21286x.equals(trim6)) {
                                string = this.f21191e.getString(C5462k.indiapay_invalid_vpa);
                            }
                        }
                        return null;
                    }
                    this.f21188b = string;
                    return null;
                }
            }
            return null;
        } catch (IOException unused) {
            if (!C6619m.m32026h(this.f21191e)) {
                context = this.f21191e;
                i = C5462k.common_no_network;
            } else {
                context = this.f21191e;
                i = C5462k.common_network_error;
            }
            this.f21188b = context.getString(i);
        } catch (HttpResponseException | JSONException unused2) {
            context = this.f21191e;
            i = C5462k.common_internal_server_error;
            this.f21188b = context.getString(i);
        } catch (IndiaPayApiException unused3) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        String str2;
        Editor edit = this.f21191e.getSharedPreferences("OrderInfo", 0).edit();
        if (str == null) {
            if (this.f21188b == null) {
                this.f21188b = this.f21191e.getString(C5462k.indiapay_connection_try_again);
            }
            this.f21190d.mo18957v(this.f21188b);
        } else if ("success".equals(str)) {
            str2 = "SUCCESS_TXN";
            edit.putString("STATUS_TXN", str2);
            edit.commit();
        }
        str2 = "FAILED_TXN";
        edit.putString("STATUS_TXN", str2);
        edit.commit();
    }
}
