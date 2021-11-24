package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.dx */
public final class C4339dx {

    /* renamed from: a */
    private final String f16037a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Uri f16038b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f16039c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f16040d;

    /* renamed from: e */
    private final boolean f16041e;

    /* renamed from: f */
    private final boolean f16042f;

    /* renamed from: g */
    private final boolean f16043g;

    public C4339dx(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    private C4339dx(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f16037a = null;
        this.f16038b = uri;
        this.f16039c = str2;
        this.f16040d = str3;
        this.f16041e = false;
        this.f16042f = false;
        this.f16043g = false;
    }

    /* renamed from: a */
    public final C4333dr<Double> mo14288a(String str, double d) {
        return C4333dr.m21275b(this, str, d);
    }

    /* renamed from: a */
    public final C4333dr<Integer> mo14289a(String str, int i) {
        return C4333dr.m21276b(this, str, i);
    }

    /* renamed from: a */
    public final C4333dr<Long> mo14290a(String str, long j) {
        return C4333dr.m21277b(this, str, j);
    }

    /* renamed from: a */
    public final C4333dr<String> mo14291a(String str, String str2) {
        return C4333dr.m21278b(this, str, str2);
    }

    /* renamed from: a */
    public final C4333dr<Boolean> mo14292a(String str, boolean z) {
        return C4333dr.m21279b(this, str, z);
    }
}
