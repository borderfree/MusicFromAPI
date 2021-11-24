package com.seattleclouds.modules.esignature;

import android.util.Log;
import com.google.android.bitmapfun.AsyncTask;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.modules.esignature.utility.C5613a;
import com.seattleclouds.modules.esignature.utility.Transaction;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.seattleclouds.modules.esignature.b */
public class C5600b extends AsyncTask<String, Integer, String> {

    /* renamed from: d */
    public static final String f19903d = C5601c.class.getSimpleName();

    /* renamed from: e */
    private String f19904e;

    /* renamed from: f */
    private ArrayList<Transaction> f19905f;

    /* renamed from: g */
    private WeakReference<C5596a> f19906g;

    public C5600b(C5596a aVar, String str) {
        this.f19906g = new WeakReference<>(aVar);
        this.f19904e = str;
    }

    /* renamed from: a */
    private String m27798a(SCApiException sCApiException) {
        try {
            int i = 0;
            String str = null;
            switch (sCApiException.getErrorCode()) {
                case 403:
                    JSONArray jSONArray = sCApiException.getDetails().getJSONArray("errors");
                    int length = jSONArray.length();
                    while (i < length) {
                        if ("notValidEmail".equals(jSONArray.getJSONObject(i).getString("reason"))) {
                            str = App.m25651f().getString(C5462k.esignature_not_authorized);
                        }
                        i++;
                    }
                    break;
                case 404:
                    JSONArray jSONArray2 = sCApiException.getDetails().getJSONArray("errors");
                    int length2 = jSONArray2.length();
                    while (i < length2) {
                        if ("notFoundSender".equals(jSONArray2.getJSONObject(i).getString("reason"))) {
                            str = App.m25651f().getString(C5462k.esignature_invalid_key);
                        }
                        i++;
                    }
                    break;
            }
            return str;
        } catch (JSONException unused) {
            return App.m25651f().getString(C5462k.common_internal_server_error_with_message);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo8517a(String... strArr) {
        try {
            JSONArray jSONArray = C5268b.m26272a().mo17326h(this.f19904e).getJSONArray("transactions");
            this.f19905f = new ArrayList<>();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f19905f.add(C5613a.m27859a(jSONArray.getJSONObject(i)));
            }
            return this.f19905f.isEmpty() ? null : "OK";
        } catch (IOException unused) {
            return !C6619m.m32026h(App.m25647e()) ? App.m25651f().getString(C5462k.common_no_network) : App.m25651f().getString(C5462k.common_network_error);
        } catch (JSONException unused2) {
            return App.m25651f().getString(C5462k.common_internal_server_error);
        } catch (HttpResponseException unused3) {
            return App.m25651f().getString(C5462k.common_internal_server_error);
        } catch (SCApiException e) {
            String str = f19903d;
            StringBuilder sb = new StringBuilder();
            sb.append("IO Error: ");
            sb.append(e.toString());
            Log.w(str, sb.toString());
            return m27798a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8519a(String str) {
        super.mo8519a(str);
        C5596a aVar = (C5596a) this.f19906g.get();
        if (aVar != null) {
            if (str == null) {
                str = null;
            } else if (str.equals("OK")) {
                aVar.mo18096a(this.f19905f);
                return;
            }
            aVar.mo18095a(str);
        }
    }
}
