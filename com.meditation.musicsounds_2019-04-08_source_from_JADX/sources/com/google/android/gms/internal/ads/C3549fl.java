package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3261q;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fl */
public final class C3549fl extends C3555fr {

    /* renamed from: a */
    private final String f13989a;

    /* renamed from: b */
    private final int f13990b;

    public C3549fl(String str, int i) {
        this.f13989a = str;
        this.f13990b = i;
    }

    /* renamed from: a */
    public final String mo12916a() {
        return this.f13989a;
    }

    /* renamed from: b */
    public final int mo12917b() {
        return this.f13990b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3549fl)) {
            C3549fl flVar = (C3549fl) obj;
            if (C3261q.m14906a(this.f13989a, flVar.f13989a) && C3261q.m14906a(Integer.valueOf(this.f13990b), Integer.valueOf(flVar.f13990b))) {
                return true;
            }
        }
        return false;
    }
}
