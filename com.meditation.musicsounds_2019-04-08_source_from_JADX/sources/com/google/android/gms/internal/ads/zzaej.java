package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzaej extends AbstractSafeParcelable {
    public static final Creator<zzaej> CREATOR = new C3491di();

    /* renamed from: A */
    public final zzaig f15283A;

    /* renamed from: B */
    public final List<String> f15284B;

    /* renamed from: C */
    public final List<String> f15285C;

    /* renamed from: D */
    public final boolean f15286D;

    /* renamed from: E */
    public final zzael f15287E;

    /* renamed from: F */
    public final boolean f15288F;

    /* renamed from: G */
    public String f15289G;

    /* renamed from: H */
    public final List<String> f15290H;

    /* renamed from: I */
    public final boolean f15291I;

    /* renamed from: J */
    public final String f15292J;

    /* renamed from: K */
    public final zzaiq f15293K;

    /* renamed from: L */
    public final String f15294L;

    /* renamed from: M */
    public final boolean f15295M;

    /* renamed from: N */
    public final boolean f15296N;

    /* renamed from: O */
    public final boolean f15297O;

    /* renamed from: P */
    public final int f15298P;

    /* renamed from: Q */
    public final boolean f15299Q;

    /* renamed from: R */
    public final List<String> f15300R;

    /* renamed from: S */
    public final boolean f15301S;

    /* renamed from: T */
    public final String f15302T;

    /* renamed from: U */
    private zzaef f15303U;

    /* renamed from: V */
    private final int f15304V;

    /* renamed from: W */
    private zzaev f15305W;

    /* renamed from: X */
    private Bundle f15306X;

    /* renamed from: a */
    public final String f15307a;

    /* renamed from: b */
    public String f15308b;

    /* renamed from: c */
    public final List<String> f15309c;

    /* renamed from: d */
    public final int f15310d;

    /* renamed from: e */
    public final List<String> f15311e;

    /* renamed from: f */
    public final long f15312f;

    /* renamed from: g */
    public final boolean f15313g;

    /* renamed from: h */
    public final long f15314h;

    /* renamed from: i */
    public final List<String> f15315i;

    /* renamed from: j */
    public final long f15316j;

    /* renamed from: k */
    public final int f15317k;

    /* renamed from: l */
    public final String f15318l;

    /* renamed from: m */
    public final long f15319m;

    /* renamed from: n */
    public final String f15320n;

    /* renamed from: o */
    public final boolean f15321o;

    /* renamed from: p */
    public final String f15322p;

    /* renamed from: q */
    public final String f15323q;

    /* renamed from: r */
    public final boolean f15324r;

    /* renamed from: s */
    public final boolean f15325s;

    /* renamed from: t */
    public final boolean f15326t;

    /* renamed from: u */
    public final boolean f15327u;

    /* renamed from: v */
    public final boolean f15328v;

    /* renamed from: w */
    public String f15329w;

    /* renamed from: x */
    public final String f15330x;

    /* renamed from: y */
    public final boolean f15331y;

    /* renamed from: z */
    public final boolean f15332z;

    public zzaej(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public zzaej(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    zzaej(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaev zzaev, String str7, String str8, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzaiq zzaiq, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12) {
        this.f15304V = i;
        this.f15307a = str;
        this.f15308b = str2;
        List<String> list8 = null;
        this.f15309c = list != null ? Collections.unmodifiableList(list) : null;
        this.f15310d = i2;
        this.f15311e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f15312f = j;
        this.f15313g = z;
        this.f15314h = j2;
        this.f15315i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f15316j = j3;
        this.f15317k = i3;
        this.f15318l = str3;
        this.f15319m = j4;
        this.f15320n = str4;
        this.f15321o = z2;
        this.f15322p = str5;
        this.f15323q = str6;
        this.f15324r = z3;
        this.f15325s = z4;
        this.f15326t = z5;
        this.f15327u = z6;
        this.f15295M = z13;
        this.f15328v = z7;
        this.f15305W = zzaev;
        this.f15329w = str7;
        this.f15330x = str8;
        if (this.f15308b == null && this.f15305W != null) {
            zzafj zzafj = (zzafj) this.f15305W.mo13884a(zzafj.CREATOR);
            if (zzafj != null && !TextUtils.isEmpty(zzafj.f15347a)) {
                this.f15308b = zzafj.f15347a;
            }
        }
        this.f15331y = z8;
        this.f15332z = z9;
        this.f15283A = zzaig;
        this.f15284B = list4;
        this.f15285C = list5;
        this.f15286D = z10;
        this.f15287E = zzael;
        this.f15288F = z11;
        this.f15289G = str9;
        this.f15290H = list6;
        this.f15291I = z12;
        this.f15292J = str10;
        this.f15293K = zzaiq;
        this.f15294L = str11;
        this.f15296N = z14;
        this.f15306X = bundle;
        this.f15297O = z15;
        this.f15298P = i4;
        this.f15299Q = z16;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        this.f15300R = list8;
        this.f15301S = z17;
        this.f15302T = str12;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzaig zzaig, List<String> list4, List<String> list5, boolean z9, zzael zzael, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzaiq zzaiq, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzaig, list4, list5, z9, zzael, z10, str7, list6, z11, str8, zzaiq, str9, z12, z13, null, z14, i2, z15, list7, z16, str10);
        this.f15303U = zzaef;
    }

    public zzaej(zzaef zzaef, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzaig zzaig, List<String> list4, List<String> list5, boolean z10, zzael zzael, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzaiq zzaiq, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzaig, list4, list5, z10, zzael, z11, str8, list6, z12, str9, zzaiq, str10, z13, z14, null, z15, 0, z16, list7, z17, str11);
        this.f15303U = zzaef;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f15303U != null && this.f15303U.f15254a >= 9 && !TextUtils.isEmpty(this.f15308b)) {
            this.f15305W = new zzaev((SafeParcelable) new zzafj(this.f15308b));
            this.f15308b = null;
        }
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15304V);
        C3267a.m14968a(parcel, 2, this.f15307a, false);
        C3267a.m14968a(parcel, 3, this.f15308b, false);
        C3267a.m14978b(parcel, 4, this.f15309c, false);
        C3267a.m14960a(parcel, 5, this.f15310d);
        C3267a.m14978b(parcel, 6, this.f15311e, false);
        C3267a.m14961a(parcel, 7, this.f15312f);
        C3267a.m14971a(parcel, 8, this.f15313g);
        C3267a.m14961a(parcel, 9, this.f15314h);
        C3267a.m14978b(parcel, 10, this.f15315i, false);
        C3267a.m14961a(parcel, 11, this.f15316j);
        C3267a.m14960a(parcel, 12, this.f15317k);
        C3267a.m14968a(parcel, 13, this.f15318l, false);
        C3267a.m14961a(parcel, 14, this.f15319m);
        C3267a.m14968a(parcel, 15, this.f15320n, false);
        C3267a.m14971a(parcel, 18, this.f15321o);
        C3267a.m14968a(parcel, 19, this.f15322p, false);
        C3267a.m14968a(parcel, 21, this.f15323q, false);
        C3267a.m14971a(parcel, 22, this.f15324r);
        C3267a.m14971a(parcel, 23, this.f15325s);
        C3267a.m14971a(parcel, 24, this.f15326t);
        C3267a.m14971a(parcel, 25, this.f15327u);
        C3267a.m14971a(parcel, 26, this.f15328v);
        C3267a.m14964a(parcel, 28, (Parcelable) this.f15305W, i, false);
        C3267a.m14968a(parcel, 29, this.f15329w, false);
        C3267a.m14968a(parcel, 30, this.f15330x, false);
        C3267a.m14971a(parcel, 31, this.f15331y);
        C3267a.m14971a(parcel, 32, this.f15332z);
        C3267a.m14964a(parcel, 33, (Parcelable) this.f15283A, i, false);
        C3267a.m14978b(parcel, 34, this.f15284B, false);
        C3267a.m14978b(parcel, 35, this.f15285C, false);
        C3267a.m14971a(parcel, 36, this.f15286D);
        C3267a.m14964a(parcel, 37, (Parcelable) this.f15287E, i, false);
        C3267a.m14971a(parcel, 38, this.f15288F);
        C3267a.m14968a(parcel, 39, this.f15289G, false);
        C3267a.m14978b(parcel, 40, this.f15290H, false);
        C3267a.m14971a(parcel, 42, this.f15291I);
        C3267a.m14968a(parcel, 43, this.f15292J, false);
        C3267a.m14964a(parcel, 44, (Parcelable) this.f15293K, i, false);
        C3267a.m14968a(parcel, 45, this.f15294L, false);
        C3267a.m14971a(parcel, 46, this.f15295M);
        C3267a.m14971a(parcel, 47, this.f15296N);
        C3267a.m14962a(parcel, 48, this.f15306X, false);
        C3267a.m14971a(parcel, 49, this.f15297O);
        C3267a.m14960a(parcel, 50, this.f15298P);
        C3267a.m14971a(parcel, 51, this.f15299Q);
        C3267a.m14978b(parcel, 52, this.f15300R, false);
        C3267a.m14971a(parcel, 53, this.f15301S);
        C3267a.m14968a(parcel, 54, this.f15302T, false);
        C3267a.m14956a(parcel, a);
    }
}
