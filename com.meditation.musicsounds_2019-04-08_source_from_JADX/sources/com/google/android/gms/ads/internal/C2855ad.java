package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C3731me;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.ad */
final class C2855ad extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private final /* synthetic */ zzbp f9936a;

    private C2855ad(zzbp zzbp) {
        this.f9936a = zzbp;
    }

    /* synthetic */ C2855ad(zzbp zzbp, C2852aa aaVar) {
        this(zzbp);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f9936a.f10211h = (afm) this.f9936a.f10206c.get(((Long) ane.m16650f().mo12297a(aqm.f12792cz)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C3731me.m19175c("", e);
        }
        return this.f9936a.mo10249a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f9936a.f10209f != null && str != null) {
            this.f9936a.f10209f.loadUrl(str);
        }
    }
}
