package com.seattleclouds.modules.order.indiapay.p178a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.util.Base64;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.modules.order.indiapay.p180c.C5999b;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.order.indiapay.a.b */
public class C5975b extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private static final String f21182a = "b";

    /* renamed from: b */
    private String f21183b;

    /* renamed from: c */
    private String f21184c = "";

    /* renamed from: d */
    private C6000c f21185d = C6001d.m29442a().mo18963b();

    /* renamed from: e */
    private Context f21186e;

    public C5975b(Context context) {
        this.f21186e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Void... voidArr) {
        Context context;
        int i;
        try {
            JSONObject b = C5268b.m26272a().mo17311b(App.f18523y, App.f18524z, this.f21185d.mo18955u());
            if (isCancelled()) {
                return null;
            }
            String string = b.getString(C5999b.f21263a);
            String string2 = b.getString(C5999b.f21264b);
            if (!string.isEmpty() && !string2.isEmpty()) {
                String str = new String(Base64.decode(string, 0));
                String str2 = new String(Base64.decode(string2, 0));
                if (!C6592al.m31909b(str) && !C6592al.m31909b(str2)) {
                    this.f21185d.mo18940m(str);
                    this.f21185d.mo18942n(str2);
                    return "success";
                }
            }
            return null;
        } catch (IOException unused) {
            if (!C6619m.m32026h(this.f21186e)) {
                context = this.f21186e;
                i = C5462k.common_no_network;
            } else {
                context = this.f21186e;
                i = C5462k.common_network_error;
            }
            this.f21183b = context.getString(i);
        } catch (HttpResponseException | JSONException unused2) {
            context = this.f21186e;
            i = C5462k.common_internal_server_error;
            this.f21183b = context.getString(i);
        } catch (SCApiException unused3) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        String str2;
        super.onPostExecute(str);
        Editor edit = this.f21186e.getSharedPreferences("OrderInfo", 0).edit();
        if (str == null) {
            if (this.f21183b == null) {
                this.f21183b = this.f21186e.getString(C5462k.indiapay_try_again);
            }
            this.f21185d.mo18957v(this.f21183b);
        } else if ("success".equals(str)) {
            str2 = "SUCCESS_GET_KEY";
            edit.putString("STATUS_TXN", str2);
            edit.commit();
        }
        str2 = "FAILED_TXN";
        edit.putString("STATUS_TXN", str2);
        edit.commit();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
    }
}
