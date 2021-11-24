package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.gt */
public final class C3584gt extends C3638it implements C3583gs {

    /* renamed from: a */
    private final C3623ie f14047a;

    /* renamed from: b */
    private final Context f14048b;

    /* renamed from: c */
    private final ArrayList<C3574gj> f14049c;

    /* renamed from: d */
    private final List<C3577gm> f14050d;

    /* renamed from: e */
    private final HashSet<String> f14051e;

    /* renamed from: f */
    private final Object f14052f;

    /* renamed from: g */
    private final C3548fk f14053g;

    /* renamed from: h */
    private final long f14054h;

    public C3584gt(Context context, C3623ie ieVar, C3548fk fkVar) {
        Context context2 = context;
        C3623ie ieVar2 = ieVar;
        C3548fk fkVar2 = fkVar;
        this(context2, ieVar2, fkVar2, ((Long) ane.m16650f().mo12297a(aqm.f12639aE)).longValue());
    }

    private C3584gt(Context context, C3623ie ieVar, C3548fk fkVar, long j) {
        this.f14049c = new ArrayList<>();
        this.f14050d = new ArrayList();
        this.f14051e = new HashSet<>();
        this.f14052f = new Object();
        this.f14048b = context;
        this.f14047a = ieVar;
        this.f14053g = fkVar;
        this.f14054h = j;
    }

    /* renamed from: a */
    private final C3622id m18572a(int i, String str, bab bab) {
        boolean z;
        long j;
        String str2;
        zzjn zzjn;
        String str3;
        long j2;
        int i2;
        zzjj zzjj = this.f14047a.f14160a.f15259c;
        List<String> list = this.f14047a.f14161b.f15309c;
        List<String> list2 = this.f14047a.f14161b.f15311e;
        List<String> list3 = this.f14047a.f14161b.f15315i;
        int i3 = this.f14047a.f14161b.f15317k;
        long j3 = this.f14047a.f14161b.f15316j;
        String str4 = this.f14047a.f14160a.f15265i;
        boolean z2 = this.f14047a.f14161b.f15313g;
        bac bac = this.f14047a.f14162c;
        long j4 = this.f14047a.f14161b.f15314h;
        zzjn zzjn2 = this.f14047a.f14163d;
        long j5 = j4;
        bac bac2 = bac;
        long j6 = this.f14047a.f14161b.f15312f;
        long j7 = this.f14047a.f14165f;
        long j8 = this.f14047a.f14161b.f15319m;
        String str5 = this.f14047a.f14161b.f15320n;
        JSONObject jSONObject = this.f14047a.f14167h;
        zzaig zzaig = this.f14047a.f14161b.f15283A;
        JSONObject jSONObject2 = jSONObject;
        List<String> list4 = this.f14047a.f14161b.f15284B;
        List<String> list5 = this.f14047a.f14161b.f15285C;
        boolean z3 = this.f14047a.f14161b.f15286D;
        zzael zzael = this.f14047a.f14161b.f15287E;
        zzaig zzaig2 = zzaig;
        StringBuilder sb = new StringBuilder("");
        if (this.f14050d == null) {
            str3 = sb.toString();
            zzjn = zzjn2;
            z = z2;
            str2 = str5;
            j = j8;
        } else {
            Iterator it = this.f14050d.iterator();
            while (true) {
                zzjn = zzjn2;
                if (it.hasNext()) {
                    C3577gm gmVar = (C3577gm) it.next();
                    if (gmVar != null) {
                        Iterator it2 = it;
                        if (!TextUtils.isEmpty(gmVar.f14035a)) {
                            String str6 = gmVar.f14035a;
                            String str7 = str5;
                            switch (gmVar.f14036b) {
                                case 3:
                                    j2 = j8;
                                    i2 = 1;
                                    break;
                                case 4:
                                    j2 = j8;
                                    i2 = 2;
                                    break;
                                case 5:
                                    j2 = j8;
                                    i2 = 4;
                                    break;
                                case 6:
                                    j2 = j8;
                                    i2 = 0;
                                    break;
                                case 7:
                                    j2 = j8;
                                    i2 = 3;
                                    break;
                                default:
                                    j2 = j8;
                                    i2 = 6;
                                    break;
                            }
                            long j9 = gmVar.f14037c;
                            boolean z4 = z2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str6).length() + 33);
                            sb2.append(str6);
                            sb2.append(".");
                            sb2.append(i2);
                            sb2.append(".");
                            sb2.append(j9);
                            sb.append(String.valueOf(sb2.toString()).concat("_"));
                            zzjn2 = zzjn;
                            it = it2;
                            str5 = str7;
                            j8 = j2;
                            z2 = z4;
                        } else {
                            zzjn2 = zzjn;
                            it = it2;
                        }
                    } else {
                        zzjn2 = zzjn;
                    }
                } else {
                    z = z2;
                    str2 = str5;
                    j = j8;
                    str3 = sb.substring(0, Math.max(0, sb.length() - 1));
                }
            }
        }
        long j10 = j5;
        long j11 = j6;
        long j12 = j7;
        long j13 = j;
        JSONObject jSONObject3 = jSONObject2;
        zzjn zzjn3 = zzjn;
        int i4 = i;
        boolean z5 = z;
        String str8 = str2;
        bab bab2 = bab;
        bac bac3 = bac2;
        String str9 = str;
        C3622id idVar = new C3622id(zzjj, null, list, i4, list2, list3, i3, j3, str4, z5, bab2, null, str9, bac3, null, j10, zzjn3, j11, j12, j13, str8, jSONObject3, null, zzaig2, list4, list5, z3, zzael, str3, this.f14047a.f14161b.f15290H, this.f14047a.f14161b.f15294L, this.f14047a.f14168i, this.f14047a.f14161b.f15297O, this.f14047a.f14169j, this.f14047a.f14161b.f15299Q, this.f14047a.f14161b.f15300R, this.f14047a.f14161b.f15301S, this.f14047a.f14161b.f15302T);
        return idVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0161 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10051a() {
        /*
            r19 = this;
            r11 = r19
            com.google.android.gms.internal.ads.ie r0 = r11.f14047a
            com.google.android.gms.internal.ads.bac r0 = r0.f14162c
            java.util.List<com.google.android.gms.internal.ads.bab> r0 = r0.f13423a
            java.util.Iterator r12 = r0.iterator()
        L_0x000c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r12.next()
            r13 = r0
            com.google.android.gms.internal.ads.bab r13 = (com.google.android.gms.internal.ads.bab) r13
            java.lang.String r14 = r13.f13412k
            java.util.List<java.lang.String> r0 = r13.f13404c
            java.util.Iterator r15 = r0.iterator()
        L_0x0021:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.ads.mediation.customevent.CustomEventAdapter"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r3 = r0
            goto L_0x004c
        L_0x0040:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b7 }
            r0.<init>(r14)     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r1 = "class_name"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x003e
        L_0x004c:
            java.lang.Object r9 = r11.f14052f
            monitor-enter(r9)
            com.google.android.gms.internal.ads.fk r0 = r11.f14053g     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.gy r7 = r0.mo12905a(r3)     // Catch:{ all -> 0x00b0 }
            if (r7 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.gr r0 = r7.mo12972b()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.bav r0 = r7.mo12971a()     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0064
            goto L_0x008a
        L_0x0064:
            com.google.android.gms.internal.ads.gj r0 = new com.google.android.gms.internal.ads.gj     // Catch:{ all -> 0x00b0 }
            android.content.Context r2 = r11.f14048b     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.internal.ads.ie r6 = r11.f14047a     // Catch:{ all -> 0x00b0 }
            long r4 = r11.f14054h     // Catch:{ all -> 0x00b0 }
            r1 = r0
            r16 = r4
            r4 = r14
            r5 = r13
            r8 = r19
            r18 = r9
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.fk r1 = r11.f14053g     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.ads.internal.gmsg.zzb r1 = r1.mo12904a()     // Catch:{ all -> 0x00b5 }
            r0.mo12937a(r1)     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList<com.google.android.gms.internal.ads.gj> r1 = r11.f14049c     // Catch:{ all -> 0x00b5 }
            r1.add(r0)     // Catch:{ all -> 0x00b5 }
        L_0x0088:
            monitor-exit(r18)     // Catch:{ all -> 0x00b5 }
            goto L_0x0021
        L_0x008a:
            r18 = r9
            java.util.List<com.google.android.gms.internal.ads.gm> r0 = r11.f14050d     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.go r1 = new com.google.android.gms.internal.ads.go     // Catch:{ all -> 0x00b5 }
            r1.<init>()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = r13.f13405d     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.go r1 = r1.mo12950b(r2)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.go r1 = r1.mo12949a(r3)     // Catch:{ all -> 0x00b5 }
            r2 = 0
            com.google.android.gms.internal.ads.go r1 = r1.mo12948a(r2)     // Catch:{ all -> 0x00b5 }
            r2 = 7
            com.google.android.gms.internal.ads.go r1 = r1.mo12947a(r2)     // Catch:{ all -> 0x00b5 }
            com.google.android.gms.internal.ads.gm r1 = r1.mo12946a()     // Catch:{ all -> 0x00b5 }
            r0.add(r1)     // Catch:{ all -> 0x00b5 }
            goto L_0x0088
        L_0x00b0:
            r0 = move-exception
            r18 = r9
        L_0x00b3:
            monitor-exit(r18)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b5:
            r0 = move-exception
            goto L_0x00b3
        L_0x00b7:
            r0 = move-exception
            java.lang.String r1 = "Unable to determine custom event class name, skipping..."
            com.google.android.gms.internal.ads.C3643iy.m19173b(r1, r0)
            goto L_0x0021
        L_0x00bf:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList<com.google.android.gms.internal.ads.gj> r1 = r11.f14049c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x00ce:
            if (r4 >= r2) goto L_0x00e4
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            com.google.android.gms.internal.ads.gj r5 = (com.google.android.gms.internal.ads.C3574gj) r5
            java.lang.String r6 = r5.f14014a
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L_0x00ce
            r5.mo12940d()
            goto L_0x00ce
        L_0x00e4:
            java.util.ArrayList<com.google.android.gms.internal.ads.gj> r0 = r11.f14049c
            r1 = r0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
        L_0x00ed:
            if (r3 >= r2) goto L_0x019a
            java.lang.Object r0 = r1.get(r3)
            int r3 = r3 + 1
            r4 = r0
            com.google.android.gms.internal.ads.gj r4 = (com.google.android.gms.internal.ads.C3574gj) r4
            java.util.concurrent.Future r0 = r4.mo12940d()     // Catch:{ InterruptedException -> 0x0161, Exception -> 0x0142 }
            r0.get()     // Catch:{ InterruptedException -> 0x0161, Exception -> 0x0142 }
            java.lang.Object r5 = r11.f14052f
            monitor-enter(r5)
            java.lang.String r0 = r4.f14014a     // Catch:{ all -> 0x013d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x013d }
            if (r0 != 0) goto L_0x0113
            java.util.List<com.google.android.gms.internal.ads.gm> r0 = r11.f14050d     // Catch:{ all -> 0x013d }
            com.google.android.gms.internal.ads.gm r6 = r4.mo12941e()     // Catch:{ all -> 0x013d }
            r0.add(r6)     // Catch:{ all -> 0x013d }
        L_0x0113:
            monitor-exit(r5)     // Catch:{ all -> 0x013d }
            java.lang.Object r6 = r11.f14052f
            monitor-enter(r6)
            java.util.HashSet<java.lang.String> r0 = r11.f14051e     // Catch:{ all -> 0x013a }
            java.lang.String r5 = r4.f14014a     // Catch:{ all -> 0x013a }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r4.f14014a     // Catch:{ all -> 0x013a }
            com.google.android.gms.internal.ads.bab r1 = r4.mo12942f()     // Catch:{ all -> 0x013a }
            r2 = -2
            com.google.android.gms.internal.ads.id r0 = r11.m18572a(r2, r0, r1)     // Catch:{ all -> 0x013a }
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3719lt.f14416a     // Catch:{ all -> 0x013a }
            com.google.android.gms.internal.ads.gu r2 = new com.google.android.gms.internal.ads.gu     // Catch:{ all -> 0x013a }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x013a }
            r1.post(r2)     // Catch:{ all -> 0x013a }
            monitor-exit(r6)     // Catch:{ all -> 0x013a }
            return
        L_0x0138:
            monitor-exit(r6)     // Catch:{ all -> 0x013a }
            goto L_0x00ed
        L_0x013a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x013a }
            throw r0
        L_0x013d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x013d }
            throw r0
        L_0x0140:
            r0 = move-exception
            goto L_0x0181
        L_0x0142:
            r0 = move-exception
            java.lang.String r5 = "Unable to resolve rewarded adapter."
            com.google.android.gms.internal.ads.C3643iy.m19175c(r5, r0)     // Catch:{ all -> 0x0140 }
            java.lang.Object r5 = r11.f14052f
            monitor-enter(r5)
            java.lang.String r0 = r4.f14014a     // Catch:{ all -> 0x015e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x015c
            java.util.List<com.google.android.gms.internal.ads.gm> r0 = r11.f14050d     // Catch:{ all -> 0x015e }
            com.google.android.gms.internal.ads.gm r4 = r4.mo12941e()     // Catch:{ all -> 0x015e }
            r0.add(r4)     // Catch:{ all -> 0x015e }
        L_0x015c:
            monitor-exit(r5)     // Catch:{ all -> 0x015e }
            goto L_0x00ed
        L_0x015e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x015e }
            throw r0
        L_0x0161:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0140 }
            r0.interrupt()     // Catch:{ all -> 0x0140 }
            java.lang.Object r1 = r11.f14052f
            monitor-enter(r1)
            java.lang.String r0 = r4.f14014a     // Catch:{ all -> 0x017e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x017e }
            if (r0 != 0) goto L_0x017c
            java.util.List<com.google.android.gms.internal.ads.gm> r0 = r11.f14050d     // Catch:{ all -> 0x017e }
            com.google.android.gms.internal.ads.gm r2 = r4.mo12941e()     // Catch:{ all -> 0x017e }
            r0.add(r2)     // Catch:{ all -> 0x017e }
        L_0x017c:
            monitor-exit(r1)     // Catch:{ all -> 0x017e }
            goto L_0x019a
        L_0x017e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x017e }
            throw r0
        L_0x0181:
            java.lang.Object r1 = r11.f14052f
            monitor-enter(r1)
            java.lang.String r2 = r4.f14014a     // Catch:{ all -> 0x0197 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0197 }
            if (r2 != 0) goto L_0x0195
            java.util.List<com.google.android.gms.internal.ads.gm> r2 = r11.f14050d     // Catch:{ all -> 0x0197 }
            com.google.android.gms.internal.ads.gm r3 = r4.mo12941e()     // Catch:{ all -> 0x0197 }
            r2.add(r3)     // Catch:{ all -> 0x0197 }
        L_0x0195:
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            throw r0
        L_0x0197:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0197 }
            throw r0
        L_0x019a:
            r0 = 3
            r1 = 0
            com.google.android.gms.internal.ads.id r0 = r11.m18572a(r0, r1, r1)
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3719lt.f14416a
            com.google.android.gms.internal.ads.gv r2 = new com.google.android.gms.internal.ads.gv
            r2.<init>(r11, r0)
            r1.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3584gt.mo10051a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12966a(C3622id idVar) {
        this.f14053g.mo12909b().zzb(idVar);
    }

    /* renamed from: a */
    public final void mo12938a(String str) {
        synchronized (this.f14052f) {
            this.f14051e.add(str);
        }
    }

    /* renamed from: a */
    public final void mo12939a(String str, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12967b(C3622id idVar) {
        this.f14053g.mo12909b().zzb(idVar);
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}
