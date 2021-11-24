package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class asj implements zzv<Object> {

    /* renamed from: a */
    final /* synthetic */ asi f13081a;

    /* renamed from: b */
    private final /* synthetic */ C3442bn f13082b;

    asj(asi asi, C3442bn bnVar) {
        this.f13081a = asi;
        this.f13082b = bnVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        C3832py pyVar = (C3832py) this.f13081a.f13079a.get();
        if (pyVar == null) {
            this.f13082b.mo12820b("/loadHtml", this);
            return;
        }
        pyVar.mo13527t().mo13541a((C3868rg) new ask(this, map, this.f13082b));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            pyVar.loadData(str, "text/html", "UTF-8");
        } else {
            pyVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
        }
    }
}
