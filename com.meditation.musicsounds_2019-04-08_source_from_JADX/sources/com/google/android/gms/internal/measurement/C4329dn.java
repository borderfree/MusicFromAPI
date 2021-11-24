package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.support.p009v4.content.C0460e;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.dn */
final class C4329dn implements C4326dk {

    /* renamed from: a */
    static C4329dn f16024a;

    /* renamed from: b */
    private final Context f16025b;

    private C4329dn() {
        this.f16025b = null;
    }

    private C4329dn(Context context) {
        this.f16025b = context;
        this.f16025b.getContentResolver().registerContentObserver(C4318dc.f15999a, true, new C4331dp(this, null));
    }

    /* renamed from: a */
    static C4329dn m21261a(Context context) {
        C4329dn dnVar;
        synchronized (C4329dn.class) {
            if (f16024a == null) {
                f16024a = C0460e.m2103a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4329dn(context) : new C4329dn();
            }
            dnVar = f16024a;
        }
        return dnVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo14275a(String str) {
        if (this.f16025b == null) {
            return null;
        }
        try {
            return (String) C4327dl.m21259a(new C4330do(this, str));
        } catch (SecurityException e) {
            String str2 = "GservicesLoader";
            String str3 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo14282b(String str) {
        return C4318dc.m21237a(this.f16025b.getContentResolver(), str, (String) null);
    }
}
