package com.seattleclouds.api;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.api.d */
public abstract class C5270d<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    private Fragment f18888a;

    /* renamed from: b */
    private Activity f18889b;

    public C5270d(Fragment fragment) {
        this.f18888a = fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo17335a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17336a(int i) {
        Activity s = this.f18889b == null ? this.f18888a.mo1318s() : this.f18889b;
        if (s != null) {
            mo17337a(s.getString(i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17337a(final String str) {
        final Activity s = this.f18889b == null ? this.f18888a.mo1318s() : this.f18889b;
        if (s != null) {
            s.runOnUiThread(new Runnable() {
                public void run() {
                    if (s != null) {
                        C5270d.this.mo17338b(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17338b(String str) {
        Toast.makeText(this.f18889b == null ? this.f18888a.mo1318s() : this.f18889b, str, 1).show();
    }

    /* access modifiers changed from: protected */
    public Result doInBackground(Params... paramsArr) {
        int i;
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        Context s = this.f18889b == null ? this.f18888a.mo1318s() : this.f18889b;
        if (s == null) {
            return null;
        }
        try {
            return mo17335a(paramsArr);
        } catch (IOException e) {
            if (!C6619m.m32026h(s)) {
                i = C5462k.common_no_network;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IOException: ");
                sb2.append(e);
                Log.e("SCApiRequestAsyncTask", sb2.toString());
                i = C5462k.common_network_error;
            }
            mo17336a(i);
            return null;
        } catch (JSONException e2) {
            str2 = "SCApiRequestAsyncTask";
            sb = new StringBuilder();
            sb.append("JSON parsing exception: ");
            str = e2.toString();
            sb.append(str);
            Log.e(str2, sb.toString());
            i = C5462k.common_internal_server_error;
            mo17336a(i);
            return null;
        } catch (HttpResponseException e3) {
            str2 = "SCApiRequestAsyncTask";
            sb = new StringBuilder();
            sb.append("HTTP Response exception: ");
            sb.append(e3.getStatusCode());
            sb.append(" - ");
            str = e3.getMessage();
            sb.append(str);
            Log.e(str2, sb.toString());
            i = C5462k.common_internal_server_error;
            mo17336a(i);
            return null;
        } catch (SCApiException e4) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SCApi exception: ");
            sb3.append(e4.toString());
            Log.e("SCApiRequestAsyncTask", sb3.toString());
            e4.getMessage();
            try {
                JSONObject details = e4.getDetails();
                int i2 = details.getInt("code");
                String string = details.getString("message");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(i2);
                sb4.append(" - ");
                sb4.append(string);
                str3 = sb4.toString();
            } catch (JSONException e5) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("JSON parsing exception: ");
                sb5.append(e5.toString());
                Log.e("SCApiRequestAsyncTask", sb5.toString());
                str3 = this.f18888a.mo1219a(C5462k.common_internal_server_error);
            }
            mo17337a(str3);
            return null;
        }
    }
}
