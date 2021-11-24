package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3606ho;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.zzael;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzx {

    /* renamed from: a */
    private final Context f10289a;

    /* renamed from: b */
    private boolean f10290b;

    /* renamed from: c */
    private C3606ho f10291c;

    /* renamed from: d */
    private zzael f10292d;

    public zzx(Context context, C3606ho hoVar, zzael zzael) {
        this.f10289a = context;
        this.f10291c = hoVar;
        this.f10292d = zzael;
        if (this.f10292d == null) {
            this.f10292d = new zzael();
        }
    }

    /* renamed from: a */
    private final boolean m13712a() {
        return (this.f10291c != null && this.f10291c.mo12977a().f15357f) || this.f10292d.f15333a;
    }

    public final void recordClick() {
        this.f10290b = true;
    }

    public final boolean zzcy() {
        return !m13712a() || this.f10290b;
    }

    public final void zzs(String str) {
        if (m13712a()) {
            if (str == null) {
                str = "";
            }
            if (this.f10291c != null) {
                this.f10291c.mo12980a(str, null, 3);
                return;
            }
            if (this.f10292d.f15333a && this.f10292d.f15334b != null) {
                for (String str2 : this.f10292d.f15334b) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzek();
                        C3653jh.m18875a(this.f10289a, "", replace);
                    }
                }
            }
        }
    }
}
