package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.as */
public final class C3420as extends C3408aj {

    /* renamed from: g */
    protected baj f13043g;

    /* renamed from: h */
    private bas f13044h;

    /* renamed from: i */
    private baa f13045i;

    /* renamed from: j */
    private bac f13046j;

    /* renamed from: k */
    private final aqz f13047k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C3832py f13048l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f13049m;

    C3420as(Context context, C3623ie ieVar, bas bas, C3413an anVar, aqz aqz, C3832py pyVar) {
        super(context, ieVar, anVar);
        this.f13044h = bas;
        this.f13046j = ieVar.f14162c;
        this.f13047k = aqz;
        this.f13048l = pyVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3622id mo12003a(int i) {
        String str;
        boolean z;
        bac bac;
        long j;
        zzael zzael;
        String str2;
        String str3;
        boolean z2;
        bac bac2;
        long j2;
        Iterator it;
        bac bac3;
        int i2;
        zzaef zzaef = this.f12164e.f14160a;
        zzjj zzjj = zzaef.f15259c;
        C3832py pyVar = this.f13048l;
        List<String> list = this.f12165f.f15309c;
        List<String> list2 = this.f12165f.f15311e;
        List<String> list3 = this.f12165f.f15315i;
        int i3 = this.f12165f.f15317k;
        long j3 = this.f12165f.f15316j;
        String str4 = zzaef.f15265i;
        boolean z3 = this.f12165f.f15313g;
        bab bab = this.f13043g != null ? this.f13043g.f13474b : null;
        bav bav = this.f13043g != null ? this.f13043g.f13475c : null;
        String name = this.f13043g != null ? this.f13043g.f13476d : AdMobAdapter.class.getName();
        bac bac4 = this.f13046j;
        baf baf = this.f13043g != null ? this.f13043g.f13477e : null;
        bab bab2 = bab;
        bav bav2 = bav;
        long j4 = this.f12165f.f15314h;
        zzjn zzjn = this.f12164e.f14163d;
        long j5 = j4;
        long j6 = this.f12165f.f15312f;
        long j7 = this.f12164e.f14165f;
        long j8 = this.f12165f.f15319m;
        String str5 = this.f12165f.f15320n;
        JSONObject jSONObject = this.f12164e.f14167h;
        zzaig zzaig = this.f12165f.f15283A;
        List<String> list4 = this.f12165f.f15284B;
        List<String> list5 = this.f12165f.f15285C;
        zzjn zzjn2 = zzjn;
        boolean z4 = this.f13046j != null ? this.f13046j.f13437o : false;
        zzael zzael2 = this.f12165f.f15287E;
        if (this.f13045i != null) {
            List b = this.f13045i.mo12655b();
            String str6 = "";
            if (b == null) {
                bac = bac4;
                zzael = zzael2;
                str2 = str6.toString();
                str = str4;
                z = z3;
                j = j8;
            } else {
                Iterator it2 = b.iterator();
                String str7 = str6;
                while (it2.hasNext()) {
                    zzael zzael3 = zzael2;
                    baj baj = (baj) it2.next();
                    if (baj != null) {
                        it = it2;
                        if (baj.f13474b == null || TextUtils.isEmpty(baj.f13474b.f13405d)) {
                            bac3 = bac4;
                        } else {
                            String valueOf = String.valueOf(str7);
                            j2 = j8;
                            String str8 = baj.f13474b.f13405d;
                            switch (baj.f13473a) {
                                case -1:
                                    i2 = 4;
                                    break;
                                case 0:
                                    bac2 = bac4;
                                    i2 = 0;
                                    break;
                                case 1:
                                    bac2 = bac4;
                                    i2 = 1;
                                    break;
                                case 3:
                                    i2 = 2;
                                    break;
                                case 4:
                                    i2 = 3;
                                    break;
                                case 5:
                                    i2 = 5;
                                    break;
                                default:
                                    i2 = 6;
                                    break;
                            }
                            bac2 = bac4;
                            long j9 = baj.f13479g;
                            z2 = z3;
                            str3 = str4;
                            StringBuilder sb = new StringBuilder(String.valueOf(str8).length() + 33);
                            sb.append(str8);
                            sb.append(".");
                            sb.append(i2);
                            sb.append(".");
                            sb.append(j9);
                            String sb2 = sb.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(sb2).length());
                            sb3.append(valueOf);
                            sb3.append(sb2);
                            sb3.append("_");
                            str7 = sb3.toString();
                            zzael2 = zzael3;
                            it2 = it;
                            j8 = j2;
                            bac4 = bac2;
                            z3 = z2;
                            str4 = str3;
                        }
                    } else {
                        bac3 = bac4;
                        it = it2;
                    }
                    str3 = str4;
                    z2 = z3;
                    j2 = j8;
                    zzael2 = zzael3;
                    it2 = it;
                    j8 = j2;
                    bac4 = bac2;
                    z3 = z2;
                    str4 = str3;
                }
                bac = bac4;
                zzael = zzael2;
                str = str4;
                z = z3;
                j = j8;
                str2 = str7.substring(0, Math.max(0, str7.length() - 1));
            }
        } else {
            bac = bac4;
            zzael = zzael2;
            str = str4;
            z = z3;
            j = j8;
            str2 = null;
        }
        C3622id idVar = new C3622id(zzjj, pyVar, list, i, list2, list3, i3, j3, str, z, bab2, bav2, name, bac, baf, j5, zzjn2, j6, j7, j, str5, jSONObject, null, zzaig, list4, list5, z4, zzael, str2, this.f12165f.f15290H, this.f12165f.f15294L, this.f12164e.f14168i, this.f12165f.f15297O, this.f12164e.f14169j, this.f12165f.f15299Q, this.f12165f.f15300R, this.f12165f.f15301S, this.f12165f.f15302T);
        return idVar;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.baa] */
    /* JADX WARNING: type inference failed for: r17v0, types: [com.google.android.gms.internal.ads.bap] */
    /* JADX WARNING: type inference failed for: r4v4, types: [com.google.android.gms.internal.ads.bam] */
    /* JADX WARNING: type inference failed for: r17v2, types: [com.google.android.gms.internal.ads.bap] */
    /* JADX WARNING: type inference failed for: r4v5, types: [com.google.android.gms.internal.ads.bam] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r17v2, types: [com.google.android.gms.internal.ads.bap]
      assigns: [com.google.android.gms.internal.ads.bap, com.google.android.gms.internal.ads.bam]
      uses: [com.google.android.gms.internal.ads.bap, com.google.android.gms.internal.ads.baa, com.google.android.gms.internal.ads.bam]
      mth insns count: 151
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12004a(long r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.Object r2 = r1.f12163d
            monitor-enter(r2)
            com.google.android.gms.internal.ads.bac r0 = r1.f13046j     // Catch:{ all -> 0x0174 }
            int r0 = r0.f13435m     // Catch:{ all -> 0x0174 }
            r3 = -1
            if (r0 == r3) goto L_0x0043
            com.google.android.gms.internal.ads.bam r0 = new com.google.android.gms.internal.ads.bam     // Catch:{ all -> 0x0174 }
            android.content.Context r5 = r1.f12161b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ie r3 = r1.f12164e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaef r6 = r3.f14160a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bas r7 = r1.f13044h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bac r8 = r1.f13046j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12165f     // Catch:{ all -> 0x0174 }
            boolean r9 = r3.f15325s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12165f     // Catch:{ all -> 0x0174 }
            boolean r10 = r3.f15332z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r3 = r1.f12165f     // Catch:{ all -> 0x0174 }
            java.lang.String r11 = r3.f15292J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r3 = com.google.android.gms.internal.ads.aqm.f12689bB     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.aqk r4 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0174 }
            java.lang.Object r3 = r4.mo12297a(r3)     // Catch:{ all -> 0x0174 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x0174 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x0174 }
            r16 = 2
            com.google.android.gms.internal.ads.ie r3 = r1.f12164e     // Catch:{ all -> 0x0174 }
            boolean r3 = r3.f14169j     // Catch:{ all -> 0x0174 }
            r4 = r0
            r12 = r32
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)     // Catch:{ all -> 0x0174 }
            goto L_0x008a
        L_0x0043:
            com.google.android.gms.internal.ads.bap r0 = new com.google.android.gms.internal.ads.bap     // Catch:{ all -> 0x0174 }
            android.content.Context r3 = r1.f12161b     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ie r4 = r1.f12164e     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaef r4 = r4.f14160a     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bas r5 = r1.f13044h     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.bac r6 = r1.f13046j     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r7 = r1.f12165f     // Catch:{ all -> 0x0174 }
            boolean r7 = r7.f15325s     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r8 = r1.f12165f     // Catch:{ all -> 0x0174 }
            boolean r8 = r8.f15332z     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.zzaej r9 = r1.f12165f     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = r9.f15292J     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r10 = com.google.android.gms.internal.ads.aqm.f12689bB     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.aqk r11 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0174 }
            java.lang.Object r10 = r11.mo12297a(r10)     // Catch:{ all -> 0x0174 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0174 }
            long r27 = r10.longValue()     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.aqz r10 = r1.f13047k     // Catch:{ all -> 0x0174 }
            com.google.android.gms.internal.ads.ie r11 = r1.f12164e     // Catch:{ all -> 0x0174 }
            boolean r11 = r11.f14169j     // Catch:{ all -> 0x0174 }
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r32
            r29 = r10
            r30 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r30)     // Catch:{ all -> 0x0174 }
        L_0x008a:
            r1.f13045i = r0     // Catch:{ all -> 0x0174 }
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.android.gms.internal.ads.bac r2 = r1.f13046j
            java.util.List<com.google.android.gms.internal.ads.bab> r2 = r2.f13423a
            r0.<init>(r2)
            com.google.android.gms.internal.ads.ie r2 = r1.f12164e
            com.google.android.gms.internal.ads.zzaef r2 = r2.f14160a
            com.google.android.gms.internal.ads.zzjj r2 = r2.f15259c
            android.os.Bundle r2 = r2.f15493m
            java.lang.String r3 = "com.google.ads.mediation.admob.AdMobAdapter"
            r4 = 0
            if (r2 == 0) goto L_0x00b0
            android.os.Bundle r2 = r2.getBundle(r3)
            if (r2 == 0) goto L_0x00b0
            java.lang.String r5 = "_skipMediation"
            boolean r2 = r2.getBoolean(r5)
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00cf
            java.util.ListIterator r2 = r0.listIterator()
        L_0x00b7:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.ads.bab r5 = (com.google.android.gms.internal.ads.bab) r5
            java.util.List<java.lang.String> r5 = r5.f13404c
            boolean r5 = r5.contains(r3)
            if (r5 != 0) goto L_0x00b7
            r2.remove()
            goto L_0x00b7
        L_0x00cf:
            com.google.android.gms.internal.ads.baa r2 = r1.f13045i
            com.google.android.gms.internal.ads.baj r0 = r2.mo12653a(r0)
            r1.f13043g = r0
            com.google.android.gms.internal.ads.baj r0 = r1.f13043g
            int r0 = r0.f13473a
            switch(r0) {
                case 0: goto L_0x0104;
                case 1: goto L_0x00fb;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk
            com.google.android.gms.internal.ads.baj r2 = r1.f13043g
            int r2 = r2.f13473a
            r3 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Unexpected mediation result: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2, r4)
            throw r0
        L_0x00fb:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk
            r2 = 3
            java.lang.String r3 = "No fill from any mediation ad networks."
            r0.<init>(r3, r2)
            throw r0
        L_0x0104:
            com.google.android.gms.internal.ads.baj r0 = r1.f13043g
            com.google.android.gms.internal.ads.bab r0 = r0.f13474b
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.baj r0 = r1.f13043g
            com.google.android.gms.internal.ads.bab r0 = r0.f13474b
            java.lang.String r0 = r0.f13416o
            if (r0 == 0) goto L_0x0173
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r0.<init>(r2)
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3653jh.f14275a
            com.google.android.gms.internal.ads.at r3 = new com.google.android.gms.internal.ads.at
            r3.<init>(r1, r0)
            r2.post(r3)
            r2 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x014d }
            r0.await(r2, r5)     // Catch:{ InterruptedException -> 0x014d }
            java.lang.Object r2 = r1.f12163d
            monitor-enter(r2)
            boolean r0 = r1.f13049m     // Catch:{ all -> 0x014a }
            if (r0 == 0) goto L_0x0142
            com.google.android.gms.internal.ads.py r0 = r1.f13048l     // Catch:{ all -> 0x014a }
            boolean r0 = r0.mo13532y()     // Catch:{ all -> 0x014a }
            if (r0 != 0) goto L_0x013a
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            return
        L_0x013a:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "Assets not loaded, web view is destroyed"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x0142:
            com.google.android.gms.internal.ads.zzabk r0 = new com.google.android.gms.internal.ads.zzabk     // Catch:{ all -> 0x014a }
            java.lang.String r3 = "View could not be prepared"
            r0.<init>(r3, r4)     // Catch:{ all -> 0x014a }
            throw r0     // Catch:{ all -> 0x014a }
        L_0x014a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014a }
            throw r0
        L_0x014d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzabk r2 = new com.google.android.gms.internal.ads.zzabk
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "Interrupted while waiting for latch : "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r0, r4)
            throw r2
        L_0x0173:
            return
        L_0x0174:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0174 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3420as.mo12004a(long):void");
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
        synchronized (this.f12163d) {
            super.mo10052h_();
            if (this.f13045i != null) {
                this.f13045i.mo12654a();
            }
        }
    }
}
