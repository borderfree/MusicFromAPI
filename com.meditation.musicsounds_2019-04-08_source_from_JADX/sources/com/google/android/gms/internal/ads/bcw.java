package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class bcw extends bcr {

    /* renamed from: a */
    private final C3899sk f13576a;

    public bcw(C3899sk skVar) {
        this.f13576a = skVar;
    }

    /* renamed from: a */
    private static Bundle m18178a(String str) {
        String str2 = "Server parameters: ";
        String valueOf = String.valueOf(str);
        C3731me.m19178e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                bundle2.putString(str3, jSONObject.getString(str3));
            }
            return bundle2;
        } catch (JSONException e) {
            C3731me.m19173b("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final zzzt mo12794a() {
        return zzzt.m20765a(this.f13576a.mo13668b());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.bcz, com.google.android.gms.internal.ads.sn] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v0, types: [com.google.android.gms.internal.ads.bcz, com.google.android.gms.internal.ads.sn]
      assigns: [com.google.android.gms.internal.ads.bcz]
      uses: [com.google.android.gms.internal.ads.sn]
      mth insns count: 52
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12795a(com.google.android.gms.dynamic.C3323b r6, java.lang.String r7, android.os.Bundle r8, com.google.android.gms.internal.ads.bct r9) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.bcz r0 = new com.google.android.gms.internal.ads.bcz     // Catch:{ Throwable -> 0x006e }
            r0.<init>(r5, r9)     // Catch:{ Throwable -> 0x006e }
            com.google.android.gms.internal.ads.sk r9 = r5.f13576a     // Catch:{ Throwable -> 0x006e }
            com.google.android.gms.internal.ads.sm r1 = new com.google.android.gms.internal.ads.sm     // Catch:{ Throwable -> 0x006e }
            java.lang.Object r6 = com.google.android.gms.dynamic.C3327d.m15137a(r6)     // Catch:{ Throwable -> 0x006e }
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ Throwable -> 0x006e }
            r2 = -1
            int r3 = r7.hashCode()     // Catch:{ Throwable -> 0x006e }
            r4 = -1396342996(0xffffffffacc57f2c, float:-5.6131957E-12)
            if (r3 == r4) goto L_0x0047
            r4 = -1052618729(0xffffffffc1425017, float:-12.144553)
            if (r3 == r4) goto L_0x003d
            r4 = -239580146(0xfffffffff1b84c0e, float:-1.82519E30)
            if (r3 == r4) goto L_0x0033
            r4 = 604727084(0x240b672c, float:3.022821E-17)
            if (r3 == r4) goto L_0x0029
            goto L_0x0050
        L_0x0029:
            java.lang.String r3 = "interstitial"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0050
        L_0x0033:
            java.lang.String r3 = "rewarded"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 2
            goto L_0x0050
        L_0x003d:
            java.lang.String r3 = "native"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 3
            goto L_0x0050
        L_0x0047:
            java.lang.String r3 = "banner"
            boolean r7 = r7.equals(r3)     // Catch:{ Throwable -> 0x006e }
            if (r7 == 0) goto L_0x0050
            r2 = 0
        L_0x0050:
            switch(r2) {
                case 0: goto L_0x005f;
                case 1: goto L_0x005c;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                default: goto L_0x0053;
            }     // Catch:{ Throwable -> 0x006e }
        L_0x0053:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x006e }
            goto L_0x0068
        L_0x0056:
            int r7 = com.google.android.gms.internal.ads.C3900sl.f14927d     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x0059:
            int r7 = com.google.android.gms.internal.ads.C3900sl.f14926c     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x005c:
            int r7 = com.google.android.gms.internal.ads.C3900sl.f14925b     // Catch:{ Throwable -> 0x006e }
            goto L_0x0061
        L_0x005f:
            int r7 = com.google.android.gms.internal.ads.C3900sl.f14924a     // Catch:{ Throwable -> 0x006e }
        L_0x0061:
            r1.<init>(r6, r7, r8)     // Catch:{ Throwable -> 0x006e }
            r9.mo13667a(r1, r0)     // Catch:{ Throwable -> 0x006e }
            return
        L_0x0068:
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch:{ Throwable -> 0x006e }
            throw r6     // Catch:{ Throwable -> 0x006e }
        L_0x006e:
            r6 = move-exception
            java.lang.String r7 = "Error generating signals for RTB"
            com.google.android.gms.internal.ads.C3731me.m19173b(r7, r6)
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bcw.mo12795a(com.google.android.gms.dynamic.b, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.bct):void");
    }

    /* renamed from: a */
    public final void mo12796a(byte[] bArr, String str, Bundle bundle, C3323b bVar, bcm bcm, bay bay, zzjn zzjn) {
        try {
            bcx bcx = new bcx(this, bcm, bay);
            C3899sk skVar = this.f13576a;
            new C3898sj((Context) C3327d.m15137a(bVar), bArr, m18178a(str), bundle);
            zzb.zza(zzjn.f15503e, zzjn.f15500b, zzjn.f15499a);
            bcx.mo12801a(String.valueOf(skVar.getClass().getSimpleName()).concat(" does not support banner."));
        } catch (Throwable th) {
            C3731me.m19173b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo12797a(byte[] bArr, String str, Bundle bundle, C3323b bVar, bco bco, bay bay) {
        try {
            bcy bcy = new bcy(this, bco, bay);
            C3899sk skVar = this.f13576a;
            new C3898sj((Context) C3327d.m15137a(bVar), bArr, m18178a(str), bundle);
            bcy.mo12801a(String.valueOf(skVar.getClass().getSimpleName()).concat(" does not support interstitial."));
        } catch (Throwable th) {
            C3731me.m19173b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: b */
    public final zzzt mo12798b() {
        return zzzt.m20765a(this.f13576a.mo13666a());
    }

    /* renamed from: c */
    public final aos mo12799c() {
        if (!(this.f13576a instanceof zza)) {
            return null;
        }
        try {
            return ((zza) this.f13576a).getVideoController();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            return null;
        }
    }

    /* renamed from: d */
    public final void mo12800d() {
        C3897si siVar = null;
        try {
            siVar.mo13665a();
        } catch (Throwable th) {
            C3731me.m19173b("", th);
            throw new RemoteException();
        }
    }
}
