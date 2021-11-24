package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzaef extends AbstractSafeParcelable {
    public static final Creator<zzaef> CREATOR = new C3489dg();

    /* renamed from: A */
    public final long f15228A;

    /* renamed from: B */
    public final String f15229B;

    /* renamed from: C */
    public final float f15230C;

    /* renamed from: D */
    public final int f15231D;

    /* renamed from: E */
    public final int f15232E;

    /* renamed from: F */
    public final boolean f15233F;

    /* renamed from: G */
    public final boolean f15234G;

    /* renamed from: H */
    public final String f15235H;

    /* renamed from: I */
    public final boolean f15236I;

    /* renamed from: J */
    public final String f15237J;

    /* renamed from: K */
    public final boolean f15238K;

    /* renamed from: L */
    public final int f15239L;

    /* renamed from: M */
    public final Bundle f15240M;

    /* renamed from: N */
    public final String f15241N;

    /* renamed from: O */
    public final zzlu f15242O;

    /* renamed from: P */
    public final boolean f15243P;

    /* renamed from: Q */
    public final Bundle f15244Q;

    /* renamed from: R */
    public final String f15245R;

    /* renamed from: S */
    public final String f15246S;

    /* renamed from: T */
    public final String f15247T;

    /* renamed from: U */
    public final boolean f15248U;

    /* renamed from: V */
    public final List<Integer> f15249V;

    /* renamed from: W */
    public final String f15250W;

    /* renamed from: X */
    public final List<String> f15251X;

    /* renamed from: Y */
    public final int f15252Y;

    /* renamed from: Z */
    public final boolean f15253Z;

    /* renamed from: a */
    public final int f15254a;

    /* renamed from: aa */
    public final boolean f15255aa;

    /* renamed from: ab */
    public final boolean f15256ab;

    /* renamed from: ac */
    public final ArrayList<String> f15257ac;

    /* renamed from: b */
    public final Bundle f15258b;

    /* renamed from: c */
    public final zzjj f15259c;

    /* renamed from: d */
    public final zzjn f15260d;

    /* renamed from: e */
    public final String f15261e;

    /* renamed from: f */
    public final ApplicationInfo f15262f;

    /* renamed from: g */
    public final PackageInfo f15263g;

    /* renamed from: h */
    public final String f15264h;

    /* renamed from: i */
    public final String f15265i;

    /* renamed from: j */
    public final String f15266j;

    /* renamed from: k */
    public final zzang f15267k;

    /* renamed from: l */
    public final Bundle f15268l;

    /* renamed from: m */
    public final int f15269m;

    /* renamed from: n */
    public final List<String> f15270n;

    /* renamed from: o */
    public final Bundle f15271o;

    /* renamed from: p */
    public final boolean f15272p;

    /* renamed from: q */
    public final int f15273q;

    /* renamed from: r */
    public final int f15274r;

    /* renamed from: s */
    public final float f15275s;

    /* renamed from: t */
    public final String f15276t;

    /* renamed from: u */
    public final long f15277u;

    /* renamed from: v */
    public final String f15278v;

    /* renamed from: w */
    public final List<String> f15279w;

    /* renamed from: x */
    public final String f15280x;

    /* renamed from: y */
    public final zzpl f15281y;

    /* renamed from: z */
    public final List<String> f15282z;

    zzaef(int i, Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzpl zzpl, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this.f15254a = i;
        this.f15258b = bundle;
        this.f15259c = zzjj;
        this.f15260d = zzjn;
        this.f15261e = str;
        this.f15262f = applicationInfo;
        this.f15263g = packageInfo;
        this.f15264h = str2;
        this.f15265i = str3;
        this.f15266j = str4;
        this.f15267k = zzang;
        this.f15268l = bundle2;
        this.f15269m = i2;
        this.f15270n = list;
        this.f15282z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f15271o = bundle3;
        this.f15272p = z;
        this.f15273q = i3;
        this.f15274r = i4;
        this.f15275s = f;
        this.f15276t = str5;
        this.f15277u = j;
        this.f15278v = str6;
        this.f15279w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f15280x = str7;
        this.f15281y = zzpl;
        this.f15228A = j2;
        this.f15229B = str8;
        this.f15230C = f2;
        this.f15236I = z2;
        this.f15231D = i5;
        this.f15232E = i6;
        this.f15233F = z3;
        this.f15234G = z4;
        this.f15235H = str9;
        this.f15237J = str10;
        this.f15238K = z5;
        this.f15239L = i7;
        this.f15240M = bundle4;
        this.f15241N = str11;
        this.f15242O = zzlu;
        this.f15243P = z6;
        this.f15244Q = bundle5;
        this.f15245R = str12;
        this.f15246S = str13;
        this.f15247T = str14;
        this.f15248U = z7;
        this.f15249V = list4;
        this.f15250W = str15;
        this.f15251X = list5;
        this.f15252Y = i8;
        this.f15253Z = z8;
        this.f15255aa = z9;
        this.f15256ab = z10;
        this.f15257ac = arrayList;
    }

    private zzaef(Bundle bundle, zzjj zzjj, zzjn zzjn, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzang zzang, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzpl zzpl, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzlu zzlu, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList) {
        this(24, bundle, zzjj, zzjn, str, applicationInfo, packageInfo, str2, str3, str4, zzang, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzpl, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzlu, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList);
    }

    public zzaef(C3488df dfVar, long j, String str, String str2, String str3) {
        C3488df dfVar2 = dfVar;
        long j2 = j;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Bundle bundle = dfVar2.f13750a;
        zzjj zzjj = dfVar2.f13751b;
        zzjn zzjn = dfVar2.f13752c;
        this(bundle, zzjj, zzjn, dfVar2.f13753d, dfVar2.f13754e, dfVar2.f13755f, (String) C3740mn.m19196a(dfVar2.f13742Q, ""), dfVar2.f13756g, dfVar2.f13757h, dfVar2.f13759j, dfVar2.f13758i, dfVar2.f13760k, dfVar2.f13761l, dfVar2.f13762m, dfVar2.f13764o, dfVar2.f13765p, dfVar2.f13766q, dfVar2.f13767r, dfVar2.f13768s, dfVar2.f13769t, dfVar2.f13770u, dfVar2.f13771v, dfVar2.f13772w, dfVar2.f13773x, dfVar2.f13774y, j2, dfVar2.f13775z, dfVar2.f13726A, dfVar2.f13727B, dfVar2.f13728C, dfVar2.f13729D, dfVar2.f13730E, dfVar2.f13731F, (String) C3740mn.m19197a(dfVar2.f13732G, "", 1, TimeUnit.SECONDS), dfVar2.f13733H, dfVar2.f13734I, dfVar2.f13735J, dfVar2.f13736K, dfVar2.f13737L, dfVar2.f13738M, dfVar2.f13739N, dfVar2.f13740O, str4, str5, str6, dfVar2.f13741P, dfVar2.f13743R, dfVar2.f13744S, dfVar2.f13763n, dfVar2.f13745T, dfVar2.f13746U, dfVar2.f13747V, dfVar2.f13748W, dfVar2.f13749X);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f15254a);
        C3267a.m14962a(parcel, 2, this.f15258b, false);
        C3267a.m14964a(parcel, 3, (Parcelable) this.f15259c, i, false);
        C3267a.m14964a(parcel, 4, (Parcelable) this.f15260d, i, false);
        C3267a.m14968a(parcel, 5, this.f15261e, false);
        C3267a.m14964a(parcel, 6, (Parcelable) this.f15262f, i, false);
        C3267a.m14964a(parcel, 7, (Parcelable) this.f15263g, i, false);
        C3267a.m14968a(parcel, 8, this.f15264h, false);
        C3267a.m14968a(parcel, 9, this.f15265i, false);
        C3267a.m14968a(parcel, 10, this.f15266j, false);
        C3267a.m14964a(parcel, 11, (Parcelable) this.f15267k, i, false);
        C3267a.m14962a(parcel, 12, this.f15268l, false);
        C3267a.m14960a(parcel, 13, this.f15269m);
        C3267a.m14978b(parcel, 14, this.f15270n, false);
        C3267a.m14962a(parcel, 15, this.f15271o, false);
        C3267a.m14971a(parcel, 16, this.f15272p);
        C3267a.m14960a(parcel, 18, this.f15273q);
        C3267a.m14960a(parcel, 19, this.f15274r);
        C3267a.m14959a(parcel, 20, this.f15275s);
        C3267a.m14968a(parcel, 21, this.f15276t, false);
        C3267a.m14961a(parcel, 25, this.f15277u);
        C3267a.m14968a(parcel, 26, this.f15278v, false);
        C3267a.m14978b(parcel, 27, this.f15279w, false);
        C3267a.m14968a(parcel, 28, this.f15280x, false);
        C3267a.m14964a(parcel, 29, (Parcelable) this.f15281y, i, false);
        C3267a.m14978b(parcel, 30, this.f15282z, false);
        C3267a.m14961a(parcel, 31, this.f15228A);
        C3267a.m14968a(parcel, 33, this.f15229B, false);
        C3267a.m14959a(parcel, 34, this.f15230C);
        C3267a.m14960a(parcel, 35, this.f15231D);
        C3267a.m14960a(parcel, 36, this.f15232E);
        C3267a.m14971a(parcel, 37, this.f15233F);
        C3267a.m14971a(parcel, 38, this.f15234G);
        C3267a.m14968a(parcel, 39, this.f15235H, false);
        C3267a.m14971a(parcel, 40, this.f15236I);
        C3267a.m14968a(parcel, 41, this.f15237J, false);
        C3267a.m14971a(parcel, 42, this.f15238K);
        C3267a.m14960a(parcel, 43, this.f15239L);
        C3267a.m14962a(parcel, 44, this.f15240M, false);
        C3267a.m14968a(parcel, 45, this.f15241N, false);
        C3267a.m14964a(parcel, 46, (Parcelable) this.f15242O, i, false);
        C3267a.m14971a(parcel, 47, this.f15243P);
        C3267a.m14962a(parcel, 48, this.f15244Q, false);
        C3267a.m14968a(parcel, 49, this.f15245R, false);
        C3267a.m14968a(parcel, 50, this.f15246S, false);
        C3267a.m14968a(parcel, 51, this.f15247T, false);
        C3267a.m14971a(parcel, 52, this.f15248U);
        C3267a.m14969a(parcel, 53, this.f15249V, false);
        C3267a.m14968a(parcel, 54, this.f15250W, false);
        C3267a.m14978b(parcel, 55, this.f15251X, false);
        C3267a.m14960a(parcel, 56, this.f15252Y);
        C3267a.m14971a(parcel, 57, this.f15253Z);
        C3267a.m14971a(parcel, 58, this.f15255aa);
        C3267a.m14971a(parcel, 59, this.f15256ab);
        C3267a.m14978b(parcel, 60, this.f15257ac, false);
        C3267a.m14956a(parcel, a);
    }
}
