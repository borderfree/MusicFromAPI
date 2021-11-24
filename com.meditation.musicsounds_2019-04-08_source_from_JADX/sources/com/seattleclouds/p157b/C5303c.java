package com.seattleclouds.p157b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5298b;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6608d;

/* renamed from: com.seattleclouds.b.c */
public class C5303c extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    private final Activity f18988a;

    /* renamed from: b */
    private ProgressDialog f18989b;

    /* renamed from: c */
    private C6608d f18990c = null;

    public C5303c(Activity activity) {
        this.f18988a = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        if (!App.f18474G) {
            Log.v("ParseAppConfigAsyncTask", "Cleaning old resources...");
            C5302b.m26515a();
        }
        C5298b.m26494a((Context) this.f18988a);
        return "ok";
    }

    /* renamed from: a */
    public void mo17411a(C6608d dVar) {
        this.f18990c = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        try {
            if (this.f18989b != null && this.f18989b.isShowing()) {
                this.f18989b.dismiss();
            }
        } catch (IllegalArgumentException e) {
            Log.e("ParseAppConfigAsyncTask", "Exception while dismissing dialog", e);
        }
        if (this.f18990c != null) {
            this.f18990c.mo16855a(null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        if (this.f18989b != null) {
            this.f18989b.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (!this.f18988a.isFinishing()) {
            this.f18989b = new ProgressDialog(this.f18988a);
            this.f18989b.setMessage(this.f18988a.getString(C5462k.app_state_configuring));
            this.f18989b.setCancelable(false);
            this.f18989b.getWindow().clearFlags(2);
            this.f18989b.show();
        }
        super.onPreExecute();
    }
}
