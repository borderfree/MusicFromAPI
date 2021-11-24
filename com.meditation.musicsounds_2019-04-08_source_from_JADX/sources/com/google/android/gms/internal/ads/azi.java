package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@C3464ci
public final class azi implements axr, azh {

    /* renamed from: a */
    private final azg f13375a;

    /* renamed from: b */
    private final HashSet<SimpleEntry<String, zzv<? super azg>>> f13376b = new HashSet<>();

    public azi(azg azg) {
        this.f13375a = azg;
    }

    /* renamed from: a */
    public final void mo12645a() {
        Iterator it = this.f13376b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            String str = "Unregistering eventhandler: ";
            String valueOf = String.valueOf(((zzv) simpleEntry.getValue()).toString());
            C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.f13375a.mo12618b((String) simpleEntry.getKey(), (zzv) simpleEntry.getValue());
        }
        this.f13376b.clear();
    }

    /* renamed from: a */
    public final void mo12617a(String str, zzv<? super azg> zzv) {
        this.f13375a.mo12617a(str, zzv);
        this.f13376b.add(new SimpleEntry(str, zzv));
    }

    /* renamed from: a */
    public final void mo12593a(String str, String str2) {
        axs.m17625a((axr) this, str, str2);
    }

    /* renamed from: a */
    public final void mo12588a(String str, Map map) {
        axs.m17626a((axr) this, str, map);
    }

    /* renamed from: a */
    public final void mo12589a(String str, JSONObject jSONObject) {
        axs.m17628b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo12595b(String str) {
        this.f13375a.mo12595b(str);
    }

    /* renamed from: b */
    public final void mo12618b(String str, zzv<? super azg> zzv) {
        this.f13375a.mo12618b(str, zzv);
        this.f13376b.remove(new SimpleEntry(str, zzv));
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        axs.m17627a((axr) this, str, jSONObject);
    }
}
