package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

@C3464ci
public class zzjn extends AbstractSafeParcelable {
    public static final Creator<zzjn> CREATOR = new amq();

    /* renamed from: a */
    public final String f15499a;

    /* renamed from: b */
    public final int f15500b;

    /* renamed from: c */
    public final int f15501c;

    /* renamed from: d */
    public final boolean f15502d;

    /* renamed from: e */
    public final int f15503e;

    /* renamed from: f */
    public final int f15504f;

    /* renamed from: g */
    public final zzjn[] f15505g;

    /* renamed from: h */
    public final boolean f15506h;

    /* renamed from: i */
    public final boolean f15507i;

    /* renamed from: j */
    public boolean f15508j;

    public zzjn() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzjn(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzjn(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f15502d = r0
            boolean r2 = r1.isFluid()
            r12.f15507i = r2
            boolean r2 = r12.f15507i
            if (r2 == 0) goto L_0x0023
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getWidth()
            r12.f15503e = r2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.BANNER
            int r2 = r2.getHeight()
        L_0x0020:
            r12.f15500b = r2
            goto L_0x002e
        L_0x0023:
            int r2 = r1.getWidth()
            r12.f15503e = r2
            int r2 = r1.getHeight()
            goto L_0x0020
        L_0x002e:
            int r2 = r12.f15503e
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0036
            r2 = 1
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            int r3 = r12.f15500b
            r5 = -2
            if (r3 != r5) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.ane.m16645a()
            boolean r6 = com.google.android.gms.internal.ads.C3719lt.m19127g(r13)
            if (r6 == 0) goto L_0x0066
            com.google.android.gms.internal.ads.ane.m16645a()
            boolean r6 = com.google.android.gms.internal.ads.C3719lt.m19128h(r13)
            if (r6 == 0) goto L_0x0066
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.ane.m16645a()
            int r7 = com.google.android.gms.internal.ads.C3719lt.m19129i(r13)
            int r6 = r6 - r7
            goto L_0x0068
        L_0x0066:
            int r6 = r5.widthPixels
        L_0x0068:
            r12.f15504f = r6
            int r6 = r12.f15504f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0093
            int r8 = r8 + 1
            goto L_0x0093
        L_0x0086:
            int r8 = r12.f15503e
            com.google.android.gms.internal.ads.ane.m16645a()
            int r6 = r12.f15503e
            int r6 = com.google.android.gms.internal.ads.C3719lt.m19108a(r5, r6)
            r12.f15504f = r6
        L_0x0093:
            if (r3 == 0) goto L_0x009a
            int r6 = m20762c(r5)
            goto L_0x009c
        L_0x009a:
            int r6 = r12.f15500b
        L_0x009c:
            com.google.android.gms.internal.ads.ane.m16645a()
            int r5 = com.google.android.gms.internal.ads.C3719lt.m19108a(r5, r6)
            r12.f15501c = r5
            if (r2 != 0) goto L_0x00b6
            if (r3 == 0) goto L_0x00aa
            goto L_0x00b6
        L_0x00aa:
            boolean r2 = r12.f15507i
            if (r2 == 0) goto L_0x00b1
            java.lang.String r1 = "320x50_mb"
            goto L_0x00d1
        L_0x00b1:
            java.lang.String r1 = r1.toString()
            goto L_0x00d1
        L_0x00b6:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00d1:
            r12.f15499a = r1
            int r1 = r14.length
            if (r1 <= r4) goto L_0x00ed
            int r1 = r14.length
            com.google.android.gms.internal.ads.zzjn[] r1 = new com.google.android.gms.internal.ads.zzjn[r1]
            r12.f15505g = r1
            r1 = 0
        L_0x00dc:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00f0
            com.google.android.gms.internal.ads.zzjn[] r2 = r12.f15505g
            com.google.android.gms.internal.ads.zzjn r3 = new com.google.android.gms.internal.ads.zzjn
            r4 = r14[r1]
            r3.<init>(r13, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00dc
        L_0x00ed:
            r13 = 0
            r12.f15505g = r13
        L_0x00f0:
            r12.f15506h = r0
            r12.f15508j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjn.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public zzjn(zzjn zzjn, zzjn[] zzjnArr) {
        this(zzjn.f15499a, zzjn.f15500b, zzjn.f15501c, zzjn.f15502d, zzjn.f15503e, zzjn.f15504f, zzjnArr, zzjn.f15506h, zzjn.f15507i, zzjn.f15508j);
    }

    zzjn(String str, int i, int i2, boolean z, int i3, int i4, zzjn[] zzjnArr, boolean z2, boolean z3, boolean z4) {
        this.f15499a = str;
        this.f15500b = i;
        this.f15501c = i2;
        this.f15502d = z;
        this.f15503e = i3;
        this.f15504f = i4;
        this.f15505g = zzjnArr;
        this.f15506h = z2;
        this.f15507i = z3;
        this.f15508j = z4;
    }

    /* renamed from: a */
    public static int m20758a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: a */
    public static zzjn m20759a() {
        zzjn zzjn = new zzjn("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
        return zzjn;
    }

    /* renamed from: a */
    public static zzjn m20760a(Context context) {
        zzjn zzjn = new zzjn("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
        return zzjn;
    }

    /* renamed from: b */
    public static int m20761b(DisplayMetrics displayMetrics) {
        return (int) (((float) m20762c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m20762c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: b */
    public final AdSize mo13982b() {
        return zzb.zza(this.f15503e, this.f15500b, this.f15499a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15499a, false);
        C3267a.m14960a(parcel, 3, this.f15500b);
        C3267a.m14960a(parcel, 4, this.f15501c);
        C3267a.m14971a(parcel, 5, this.f15502d);
        C3267a.m14960a(parcel, 6, this.f15503e);
        C3267a.m14960a(parcel, 7, this.f15504f);
        C3267a.m14973a(parcel, 8, (T[]) this.f15505g, i, false);
        C3267a.m14971a(parcel, 9, this.f15506h);
        C3267a.m14971a(parcel, 10, this.f15507i);
        C3267a.m14971a(parcel, 11, this.f15508j);
        C3267a.m14956a(parcel, a);
    }
}
