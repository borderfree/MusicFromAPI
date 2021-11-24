package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzag;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class azu<I, O> implements azj<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final azl<O> f13386a;

    /* renamed from: b */
    private final azm<I> f13387b;

    /* renamed from: c */
    private final ayj f13388c;

    /* renamed from: d */
    private final String f13389d;

    azu(ayj ayj, String str, azm<I> azm, azl<O> azl) {
        this.f13388c = ayj;
        this.f13389d = str;
        this.f13387b = azm;
        this.f13386a = azl;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17723a(ayw ayw, azg azg, I i, C3763nj<O> njVar) {
        try {
            zzbv.zzek();
            String a = C3653jh.m18865a();
            zzf.zzbmc.zza(a, (zzag) new azx(this, ayw, njVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a);
            jSONObject.put("args", this.f13387b.mo12649a(i));
            azg.mo12596b(this.f13389d, jSONObject);
        } catch (Exception e) {
            njVar.mo13295a(e);
            C3643iy.m19173b("Unable to invokeJavaScript", e);
            ayw.mo12638c();
        } catch (Throwable th) {
            ayw.mo12638c();
            throw th;
        }
    }

    /* renamed from: a */
    public final C3751my<O> mo10012a(@Nullable I i) {
        return mo12646b(i);
    }

    /* renamed from: b */
    public final C3751my<O> mo12646b(I i) {
        C3763nj njVar = new C3763nj();
        ayw b = this.f13388c.mo12631b((afm) null);
        b.mo13301a(new azv(this, b, i, njVar), new azw(this, njVar, b));
        return njVar;
    }
}
