package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class abs<T> implements ace<T> {

    /* renamed from: a */
    private final abl f11421a;

    /* renamed from: b */
    private final acw<?, ?> f11422b;

    /* renamed from: c */
    private final boolean f11423c;

    /* renamed from: d */
    private final C4137zz<?> f11424d;

    private abs(acw<?, ?> acw, C4137zz<?> zzVar, abl abl) {
        this.f11422b = acw;
        this.f11423c = zzVar.mo11438a(abl);
        this.f11424d = zzVar;
        this.f11421a = abl;
    }

    /* renamed from: a */
    static <T> abs<T> m15537a(acw<?, ?> acw, C4137zz<?> zzVar, abl abl) {
        return new abs<>(acw, zzVar, abl);
    }

    /* renamed from: a */
    public final int mo11555a(T t) {
        int hashCode = this.f11422b.mo11690b(t).hashCode();
        return this.f11423c ? (hashCode * 53) + this.f11424d.mo11431a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final T mo11556a() {
        return this.f11421a.mo11483o().mo11492d();
    }

    /* renamed from: a */
    public final void mo11557a(T t, acd acd, C4135zx zxVar) {
        boolean z;
        acw<?, ?> acw = this.f11422b;
        C4137zz<?> zzVar = this.f11424d;
        Object c = acw.mo11694c(t);
        aac b = zzVar.mo11439b(t);
        do {
            try {
                if (acd.mo11597a() == Integer.MAX_VALUE) {
                    acw.mo11693b((Object) t, c);
                    return;
                }
                int b2 = acd.mo11602b();
                if (b2 == 11) {
                    Object obj = null;
                    zzbah zzbah = null;
                    int i = 0;
                    while (acd.mo11597a() != Integer.MAX_VALUE) {
                        int b3 = acd.mo11602b();
                        if (b3 == 16) {
                            i = acd.mo11630o();
                            obj = zzVar.mo11433a(zxVar, this.f11421a, i);
                        } else if (b3 == 26) {
                            if (obj != null) {
                                zzVar.mo11434a(acd, obj, zxVar, b);
                            } else {
                                zzbah = acd.mo11628n();
                            }
                        } else if (!acd.mo11607c()) {
                            break;
                        }
                    }
                    if (acd.mo11602b() != 12) {
                        throw zzbbu.zzadp();
                    } else if (zzbah != null) {
                        if (obj != null) {
                            zzVar.mo11436a(zzbah, obj, zxVar, b);
                        } else {
                            acw.mo11684a(c, i, zzbah);
                        }
                    }
                } else if ((b2 & 7) == 2) {
                    Object a = zzVar.mo11433a(zxVar, this.f11421a, b2 >>> 3);
                    if (a != null) {
                        zzVar.mo11434a(acd, a, zxVar, b);
                    } else {
                        z = acw.mo11689a(c, acd);
                        continue;
                    }
                } else {
                    z = acd.mo11607c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                acw.mo11693b((Object) t, c);
            }
        } while (z);
    }

    /* renamed from: a */
    public final void mo11558a(T t, adj adj) {
        int a;
        Object value;
        Iterator e = this.f11424d.mo11431a((Object) t).mo11446e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            aae aae = (aae) entry.getKey();
            if (aae.mo11457c() != zzbex.MESSAGE || aae.mo11458d() || aae.mo11459e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof aaq) {
                a = aae.mo11453a();
                value = ((aaq) entry).mo11506a().mo11518c();
            } else {
                a = aae.mo11453a();
                value = entry.getValue();
            }
            adj.mo11749a(a, value);
        }
        acw<?, ?> acw = this.f11422b;
        acw.mo11692b(acw.mo11690b(t), adj);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11559a(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.C4116ze r11) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.aai r7 = (com.google.android.gms.internal.ads.aai) r7
            com.google.android.gms.internal.ads.acx r0 = r7.zzdtt
            com.google.android.gms.internal.ads.acx r1 = com.google.android.gms.internal.ads.acx.m15765a()
            if (r0 != r1) goto L_0x0010
            com.google.android.gms.internal.ads.acx r0 = com.google.android.gms.internal.ads.acx.m15768b()
            r7.zzdtt = r0
        L_0x0010:
            r7 = r0
        L_0x0011:
            if (r9 >= r10) goto L_0x0069
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r8, r9, r11)
            int r0 = r11.f15165a
            r9 = 11
            r1 = 2
            if (r0 == r9) goto L_0x0030
            r9 = r0 & 7
            if (r9 != r1) goto L_0x002b
            r1 = r8
            r3 = r10
            r4 = r7
            r5 = r11
            int r9 = com.google.android.gms.internal.ads.C4115zd.m20407a(r0, r1, r2, r3, r4, r5)
            goto L_0x0011
        L_0x002b:
            int r9 = com.google.android.gms.internal.ads.C4115zd.m20408a(r0, r8, r2, r10, r11)
            goto L_0x0011
        L_0x0030:
            r9 = 0
            r0 = 0
        L_0x0032:
            if (r2 >= r10) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r8, r2, r11)
            int r3 = r11.f15165a
            int r4 = r3 >>> 3
            r5 = r3 & 7
            switch(r4) {
                case 2: goto L_0x004d;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0056
        L_0x0042:
            if (r5 != r1) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20419e(r8, r2, r11)
            java.lang.Object r0 = r11.f15167c
            com.google.android.gms.internal.ads.zzbah r0 = (com.google.android.gms.internal.ads.zzbah) r0
            goto L_0x0032
        L_0x004d:
            if (r5 != 0) goto L_0x0056
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20412a(r8, r2, r11)
            int r9 = r11.f15165a
            goto L_0x0032
        L_0x0056:
            r4 = 12
            if (r3 == r4) goto L_0x005f
            int r2 = com.google.android.gms.internal.ads.C4115zd.m20408a(r3, r8, r2, r10, r11)
            goto L_0x0032
        L_0x005f:
            if (r0 == 0) goto L_0x0067
            int r9 = r9 << 3
            r9 = r9 | r1
            r7.mo11699a(r9, r0)
        L_0x0067:
            r9 = r2
            goto L_0x0011
        L_0x0069:
            if (r9 != r10) goto L_0x006c
            return
        L_0x006c:
            com.google.android.gms.internal.ads.zzbbu r7 = com.google.android.gms.internal.ads.zzbbu.zzadr()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abs.mo11559a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.ze):void");
    }

    /* renamed from: a */
    public final boolean mo11560a(T t, T t2) {
        if (!this.f11422b.mo11690b(t).equals(this.f11422b.mo11690b(t2))) {
            return false;
        }
        if (this.f11423c) {
            return this.f11424d.mo11431a((Object) t).equals(this.f11424d.mo11431a((Object) t2));
        }
        return true;
    }

    /* renamed from: b */
    public final int mo11561b(T t) {
        acw<?, ?> acw = this.f11422b;
        int e = acw.mo11697e(acw.mo11690b(t)) + 0;
        return this.f11423c ? e + this.f11424d.mo11431a((Object) t).mo11452i() : e;
    }

    /* renamed from: b */
    public final void mo11562b(T t, T t2) {
        acg.m15668a(this.f11422b, t, t2);
        if (this.f11423c) {
            acg.m15669a(this.f11424d, t, t2);
        }
    }

    /* renamed from: c */
    public final void mo11563c(T t) {
        this.f11422b.mo11696d(t);
        this.f11424d.mo11440c(t);
    }

    /* renamed from: d */
    public final boolean mo11564d(T t) {
        return this.f11424d.mo11431a((Object) t).mo11449g();
    }
}
