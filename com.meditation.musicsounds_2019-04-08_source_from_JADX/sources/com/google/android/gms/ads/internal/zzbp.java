package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3402ae;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3566gb;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3651jf;
import com.google.android.gms.internal.ads.C3719lt;
import com.google.android.gms.internal.ads.C4054x;
import com.google.android.gms.internal.ads.afm;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.anh;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.anw;
import com.google.android.gms.internal.ads.aoa;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aos;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzcj;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmu;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzbp extends anw {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzang f10204a;

    /* renamed from: b */
    private final zzjn f10205b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Future<afm> f10206c = C3651jf.m18856a((Callable<T>) new C2854ac<T>(this));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f10207d;

    /* renamed from: e */
    private final C2856ae f10208e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f10209f = new WebView(this.f10207d);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ank f10210g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public afm f10211h;

    /* renamed from: i */
    private AsyncTask<Void, Void, String> f10212i;

    public zzbp(Context context, zzjn zzjn, String str, zzang zzang) {
        this.f10207d = context;
        this.f10204a = zzang;
        this.f10205b = zzjn;
        this.f10208e = new C2856ae(str);
        mo10250a(0);
        this.f10209f.setVerticalScrollBarEnabled(false);
        this.f10209f.getSettings().setJavaScriptEnabled(true);
        this.f10209f.setWebViewClient(new C2852aa(this));
        this.f10209f.setOnTouchListener(new C2853ab(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String m13675b(String str) {
        if (this.f10211h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f10211h.mo11850a(parse, this.f10207d, null, null);
        } catch (zzcj e) {
            C3643iy.m19175c("Unable to process ad data", e);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m13678c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f10207d.startActivity(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo10248a(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            ane.m16645a();
            return C3719lt.m19107a(this.f10207d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo10249a() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) ane.m16650f().mo12297a(aqm.f12790cx));
        builder.appendQueryParameter("query", this.f10208e.mo9991b());
        builder.appendQueryParameter("pubId", this.f10208e.mo9992c());
        Map d = this.f10208e.mo9993d();
        for (String str : d.keySet()) {
            builder.appendQueryParameter(str, (String) d.get(str));
        }
        Uri build = builder.build();
        if (this.f10211h != null) {
            try {
                build = this.f10211h.mo11849a(build, this.f10207d);
            } catch (zzcj e) {
                C3643iy.m19175c("Unable to process ad data", e);
            }
        }
        String b = mo10251b();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(b);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10250a(int i) {
        if (this.f10209f != null) {
            this.f10209f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo10251b() {
        String a = this.f10208e.mo9989a();
        if (TextUtils.isEmpty(a)) {
            a = "www.google.com";
        }
        String str = (String) ane.m16650f().mo12297a(aqm.f12790cx);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(a);
        sb.append(str);
        return sb.toString();
    }

    public final void destroy() {
        C3266s.m14922b("destroy must be called on the main UI thread.");
        this.f10212i.cancel(true);
        this.f10206c.cancel(true);
        this.f10209f.destroy();
        this.f10209f = null;
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final aos getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isReady() {
        return false;
    }

    public final void pause() {
        C3266s.m14922b("pause must be called on the main UI thread.");
    }

    public final void resume() {
        C3266s.m14922b("resume must be called on the main UI thread.");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    public final void setManualImpressionsEnabled(boolean z) {
    }

    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void stopLoading() {
    }

    public final void zza(C3402ae aeVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(anh anh) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(ank ank) {
        this.f10210g = ank;
    }

    public final void zza(aoa aoa) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aoe aoe) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(aok aok) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(arf arf) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(C3566gb gbVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(C4054x xVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzjn zzjn) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzlu zzlu) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzmu zzmu) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean zzb(zzjj zzjj) {
        C3266s.m14914a(this.f10209f, (Object) "This Search Ad has already been torn down");
        this.f10208e.mo9990a(zzjj, this.f10204a);
        this.f10212i = new C2855ad(this, null).execute(new Void[0]);
        return true;
    }

    public final Bundle zzba() {
        throw new IllegalStateException("Unused method");
    }

    public final C3323b zzbj() {
        C3266s.m14922b("getAdFrame must be called on the main UI thread.");
        return C3327d.m15136a(this.f10209f);
    }

    public final zzjn zzbk() {
        return this.f10205b;
    }

    public final void zzbm() {
        throw new IllegalStateException("Unused method");
    }

    public final aoe zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final ank zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final String zzck() {
        return null;
    }
}
