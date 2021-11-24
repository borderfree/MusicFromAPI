package com.seattleclouds.modules.p185r;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.modules.r.f */
public class C6217f extends AsyncTask<Void, Void, Integer> {

    /* renamed from: a */
    private final ProgressDialog f22051a;

    public C6217f(Context context) {
        this.f22051a = new ProgressDialog(context);
        this.f22051a.setTitle(context.getResources().getString(C5462k.scan_document_in_progress));
        this.f22051a.setMessage(context.getResources().getString(C5462k.scan_document_please_wait));
        this.f22051a.setIndeterminate(false);
        this.f22051a.setCancelable(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(Void... voidArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        this.f22051a.dismiss();
        super.onPostExecute(num);
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        this.f22051a.hide();
        super.onCancelled();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        this.f22051a.show();
        super.onPreExecute();
    }
}
