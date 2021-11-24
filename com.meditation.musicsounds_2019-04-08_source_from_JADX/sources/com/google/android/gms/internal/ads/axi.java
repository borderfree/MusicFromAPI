package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class axi extends axv<azg> implements axr, axx {

    /* renamed from: a */
    private final C3886ry f13281a;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.axi, com.google.android.gms.internal.ads.axu] */
    public axi(Context context, zzang zzang) {
        try {
            this.f13281a = new C3886ry(new C3872rk(context));
            this.f13281a.setWillNotDraw(true);
            this.f13281a.mo13637a((C3889sa) new axj(this));
            this.f13281a.mo13638a((C3891sc) new axk(this));
            this.f13281a.addJavascriptInterface(new axq(this), "GoogleJsInterface");
            zzbv.zzek().mo13125a(context, zzang.f15360a, this.f13281a.getSettings());
        } catch (Throwable th) {
            throw new zzarg("Init failed.", th);
        }
    }

    /* renamed from: a */
    public final void mo12590a() {
        this.f13281a.destroy();
    }

    /* renamed from: a */
    public final void mo12591a(axy axy) {
        this.f13281a.mo13639a((C3893se) new axn(axy));
    }

    /* renamed from: a */
    public final void mo12592a(String str) {
        mo12597c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
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
    public final azh mo12594b() {
        return new azi(this);
    }

    /* renamed from: b */
    public final void mo12595b(String str) {
        C3758ne.f14481a.execute(new axo(this, str));
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        axs.m17627a((axr) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo12597c(String str) {
        C3758ne.f14481a.execute(new axl(this, str));
    }

    /* renamed from: d */
    public final void mo12598d(String str) {
        C3758ne.f14481a.execute(new axm(this, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12599e(String str) {
        this.f13281a.mo12595b(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12600f(String str) {
        this.f13281a.loadUrl(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo12601g(String str) {
        this.f13281a.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo12602o() {
        return this;
    }
}
