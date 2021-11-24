package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.lang.reflect.Field;
import java.util.Arrays;

final class acb {

    /* renamed from: A */
    private int f11435A;

    /* renamed from: B */
    private int f11436B;

    /* renamed from: C */
    private Field f11437C;

    /* renamed from: D */
    private Object f11438D;

    /* renamed from: E */
    private Object f11439E;

    /* renamed from: F */
    private Object f11440F;

    /* renamed from: a */
    private final acc f11441a;

    /* renamed from: b */
    private final Object[] f11442b;

    /* renamed from: c */
    private Class<?> f11443c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f11444d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f11445e;

    /* renamed from: f */
    private final int f11446f;

    /* renamed from: g */
    private final int f11447g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f11448h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f11449i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f11450j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f11451k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f11452l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f11453m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int[] f11454n;

    /* renamed from: o */
    private int f11455o;

    /* renamed from: p */
    private int f11456p;

    /* renamed from: q */
    private int f11457q = Integer.MAX_VALUE;

    /* renamed from: r */
    private int f11458r = Integer.MIN_VALUE;

    /* renamed from: s */
    private int f11459s = 0;

    /* renamed from: t */
    private int f11460t = 0;

    /* renamed from: u */
    private int f11461u = 0;

    /* renamed from: v */
    private int f11462v = 0;

    /* renamed from: w */
    private int f11463w = 0;

    /* renamed from: x */
    private int f11464x;

    /* renamed from: y */
    private int f11465y;

    /* renamed from: z */
    private int f11466z;

    acb(Class<?> cls, String str, Object[] objArr) {
        this.f11443c = cls;
        this.f11441a = new acc(str);
        this.f11442b = objArr;
        this.f11444d = this.f11441a.mo11596b();
        this.f11445e = this.f11441a.mo11596b();
        int[] iArr = null;
        if (this.f11445e == 0) {
            this.f11446f = 0;
            this.f11447g = 0;
            this.f11448h = 0;
            this.f11449i = 0;
            this.f11450j = 0;
            this.f11452l = 0;
            this.f11451k = 0;
            this.f11453m = 0;
            this.f11454n = null;
            return;
        }
        this.f11446f = this.f11441a.mo11596b();
        this.f11447g = this.f11441a.mo11596b();
        this.f11448h = this.f11441a.mo11596b();
        this.f11449i = this.f11441a.mo11596b();
        this.f11452l = this.f11441a.mo11596b();
        this.f11451k = this.f11441a.mo11596b();
        this.f11450j = this.f11441a.mo11596b();
        this.f11453m = this.f11441a.mo11596b();
        int b = this.f11441a.mo11596b();
        if (b != 0) {
            iArr = new int[b];
        }
        this.f11454n = iArr;
        this.f11455o = (this.f11446f << 1) + this.f11447g;
    }

    /* renamed from: a */
    private static Field m15574a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: p */
    private final Object m15583p() {
        Object[] objArr = this.f11442b;
        int i = this.f11455o;
        this.f11455o = i + 1;
        return objArr[i];
    }

    /* renamed from: q */
    private final boolean m15584q() {
        return (this.f11444d & 1) == 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (m15584q() != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        if (r1 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        if (m15584q() != false) goto L_0x00d7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11580a() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.acc r0 = r5.f11441a
            boolean r0 = r0.mo11595a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.gms.internal.ads.acc r0 = r5.f11441a
            int r0 = r0.mo11596b()
            r5.f11464x = r0
            com.google.android.gms.internal.ads.acc r0 = r5.f11441a
            int r0 = r0.mo11596b()
            r5.f11465y = r0
            int r0 = r5.f11465y
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f11466z = r0
            int r0 = r5.f11464x
            int r2 = r5.f11457q
            if (r0 >= r2) goto L_0x002a
            int r0 = r5.f11464x
            r5.f11457q = r0
        L_0x002a:
            int r0 = r5.f11464x
            int r2 = r5.f11458r
            if (r0 <= r2) goto L_0x0034
            int r0 = r5.f11464x
            r5.f11458r = r0
        L_0x0034:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.MAP
            int r2 = r2.mo13957id()
            r3 = 1
            if (r0 != r2) goto L_0x0045
            int r0 = r5.f11459s
            int r0 = r0 + r3
            r5.f11459s = r0
            goto L_0x005e
        L_0x0045:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.DOUBLE_LIST
            int r2 = r2.mo13957id()
            if (r0 < r2) goto L_0x005e
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.GROUP_LIST
            int r2 = r2.mo13957id()
            if (r0 > r2) goto L_0x005e
            int r0 = r5.f11460t
            int r0 = r0 + r3
            r5.f11460t = r0
        L_0x005e:
            int r0 = r5.f11463w
            int r0 = r0 + r3
            r5.f11463w = r0
            int r0 = r5.f11457q
            int r2 = r5.f11464x
            int r4 = r5.f11463w
            boolean r0 = com.google.android.gms.internal.ads.acg.m15671a(r0, r2, r4)
            if (r0 == 0) goto L_0x007c
            int r0 = r5.f11464x
            int r0 = r0 + r3
            r5.f11462v = r0
            int r0 = r5.f11462v
            int r2 = r5.f11457q
            int r0 = r0 - r2
        L_0x0079:
            r5.f11461u = r0
            goto L_0x0080
        L_0x007c:
            int r0 = r5.f11461u
            int r0 = r0 + r3
            goto L_0x0079
        L_0x0080:
            int r0 = r5.f11465y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0088
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r0 == 0) goto L_0x0097
            int[] r0 = r5.f11454n
            int r2 = r5.f11456p
            int r4 = r2 + 1
            r5.f11456p = r4
            int r4 = r5.f11464x
            r0[r2] = r4
        L_0x0097:
            r0 = 0
            r5.f11438D = r0
            r5.f11439E = r0
            r5.f11440F = r0
            boolean r0 = r5.mo11583d()
            if (r0 == 0) goto L_0x00e7
            com.google.android.gms.internal.ads.acc r0 = r5.f11441a
            int r0 = r0.mo11596b()
            r5.f11435A = r0
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r1 = com.google.android.gms.internal.ads.zzbbj.MESSAGE
            int r1 = r1.mo13957id()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00df
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r1 = com.google.android.gms.internal.ads.zzbbj.GROUP
            int r1 = r1.mo13957id()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00c5
            goto L_0x00df
        L_0x00c5:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r1 = com.google.android.gms.internal.ads.zzbbj.ENUM
            int r1 = r1.mo13957id()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0177
            boolean r0 = r5.m15584q()
            if (r0 == 0) goto L_0x0177
        L_0x00d7:
            java.lang.Object r0 = r5.m15583p()
            r5.f11439E = r0
            goto L_0x0177
        L_0x00df:
            java.lang.Object r0 = r5.m15583p()
        L_0x00e3:
            r5.f11438D = r0
            goto L_0x0177
        L_0x00e7:
            java.lang.Class<?> r0 = r5.f11443c
            java.lang.Object r2 = r5.m15583p()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = m15574a(r0, r2)
            r5.f11437C = r0
            boolean r0 = r5.mo11587h()
            if (r0 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.acc r0 = r5.f11441a
            int r0 = r0.mo11596b()
            r5.f11436B = r0
        L_0x0103:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.MESSAGE
            int r2 = r2.mo13957id()
            if (r0 == r2) goto L_0x016f
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.GROUP
            int r2 = r2.mo13957id()
            if (r0 != r2) goto L_0x0118
            goto L_0x016f
        L_0x0118:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.MESSAGE_LIST
            int r2 = r2.mo13957id()
            if (r0 == r2) goto L_0x00df
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.GROUP_LIST
            int r2 = r2.mo13957id()
            if (r0 != r2) goto L_0x012d
            goto L_0x00df
        L_0x012d:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.ENUM
            int r2 = r2.mo13957id()
            if (r0 == r2) goto L_0x0167
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.ENUM_LIST
            int r2 = r2.mo13957id()
            if (r0 == r2) goto L_0x0167
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.ENUM_LIST_PACKED
            int r2 = r2.mo13957id()
            if (r0 != r2) goto L_0x014c
            goto L_0x0167
        L_0x014c:
            int r0 = r5.f11466z
            com.google.android.gms.internal.ads.zzbbj r2 = com.google.android.gms.internal.ads.zzbbj.MAP
            int r2 = r2.mo13957id()
            if (r0 != r2) goto L_0x0177
            java.lang.Object r0 = r5.m15583p()
            r5.f11440F = r0
            int r0 = r5.f11465y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0163
            r1 = 1
        L_0x0163:
            if (r1 == 0) goto L_0x0177
            goto L_0x00d7
        L_0x0167:
            boolean r0 = r5.m15584q()
            if (r0 == 0) goto L_0x0177
            goto L_0x00d7
        L_0x016f:
            java.lang.reflect.Field r0 = r5.f11437C
            java.lang.Class r0 = r0.getType()
            goto L_0x00e3
        L_0x0177:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.acb.mo11580a():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo11581b() {
        return this.f11464x;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo11582c() {
        return this.f11466z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo11583d() {
        return this.f11466z > zzbbj.MAP.mo13957id();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Field mo11584e() {
        int i = this.f11435A << 1;
        Object obj = this.f11442b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m15574a(this.f11443c, (String) obj);
        this.f11442b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final Field mo11585f() {
        int i = (this.f11435A << 1) + 1;
        Object obj = this.f11442b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m15574a(this.f11443c, (String) obj);
        this.f11442b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final Field mo11586g() {
        return this.f11437C;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo11587h() {
        return m15584q() && this.f11466z <= zzbbj.GROUP.mo13957id();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final Field mo11588i() {
        int i = (this.f11446f << 1) + (this.f11436B / 32);
        Object obj = this.f11442b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a = m15574a(this.f11443c, (String) obj);
        this.f11442b[i] = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo11589j() {
        return this.f11436B % 32;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo11590k() {
        return (this.f11465y & 256) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo11591l() {
        return (this.f11465y & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final Object mo11592m() {
        return this.f11438D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final Object mo11593n() {
        return this.f11439E;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final Object mo11594o() {
        return this.f11440F;
    }
}
