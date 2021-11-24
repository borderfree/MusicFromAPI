package com.seattleclouds.modules.esignature;

import android.content.res.Resources;
import com.google.android.bitmapfun.AsyncTask;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.modules.esignature.utility.Transaction;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.esignature.c */
public class C5601c extends AsyncTask<String, Integer, String> {

    /* renamed from: d */
    public static final String f19907d = "c";

    /* renamed from: e */
    private Transaction f19908e;

    /* renamed from: f */
    private String f19909f;

    /* renamed from: g */
    private String f19910g;

    /* renamed from: h */
    private WeakReference<C5596a> f19911h;

    public C5601c(C5596a aVar, Transaction transaction, String str) {
        this.f19911h = new WeakReference<>(aVar);
        this.f19908e = transaction;
        this.f19910g = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8517a(String... strArr) {
        Resources f;
        int i;
        try {
            JSONObject a = C5268b.m26272a().mo17300a(this.f19908e.mo18116b(), this.f19908e.mo18119c(), this.f19910g);
            this.f19909f = a.getString("url");
            a.getString("roleId");
            a.getString("packageId");
            return (this.f19909f == null || this.f19909f.isEmpty()) ? null : "OK";
        } catch (IOException unused) {
            if (!C6619m.m32026h(App.m25647e())) {
                f = App.m25651f();
                i = C5462k.common_no_network;
            } else {
                f = App.m25651f();
                i = C5462k.common_network_error;
            }
            return f.getString(i);
        } catch (HttpResponseException | SCApiException | JSONException unused2) {
            f = App.m25651f();
            i = C5462k.common_internal_server_error;
            return f.getString(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8519a(String str) {
        super.mo8519a(str);
        C5596a aVar = (C5596a) this.f19911h.get();
        if (aVar != null) {
            if (str == null) {
                str = null;
            } else if (str.equals("OK")) {
                aVar.mo18097b(this.f19909f);
                return;
            }
            aVar.mo18095a(str);
        }
    }
}
