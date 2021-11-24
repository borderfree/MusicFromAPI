package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3309n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.he */
public final class C3596he implements C3606ho {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<Future<Void>> f14063a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f14064b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public final adw f14065c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final LinkedHashMap<String, aee> f14066d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private final List<String> f14067e = new ArrayList();
    @GuardedBy("mLock")

    /* renamed from: f */
    private final List<String> f14068f = new ArrayList();

    /* renamed from: g */
    private final Context f14069g;

    /* renamed from: h */
    private final C3608hq f14070h;

    /* renamed from: i */
    private boolean f14071i;

    /* renamed from: j */
    private final zzaiq f14072j;

    /* renamed from: k */
    private final C3609hr f14073k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f14074l = new Object();

    /* renamed from: m */
    private HashSet<String> f14075m = new HashSet<>();

    /* renamed from: n */
    private boolean f14076n = false;

    /* renamed from: o */
    private boolean f14077o = false;

    /* renamed from: p */
    private boolean f14078p = false;

    public C3596he(Context context, zzang zzang, zzaiq zzaiq, String str, C3608hq hqVar) {
        C3266s.m14914a(zzaiq, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f14069g = context;
        this.f14066d = new LinkedHashMap<>();
        this.f14070h = hqVar;
        this.f14072j = zzaiq;
        for (String lowerCase : this.f14072j.f15356e) {
            this.f14075m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f14075m.remove("cookie".toLowerCase(Locale.ENGLISH));
        adw adw = new adw();
        adw.f11581a = Integer.valueOf(8);
        adw.f11582b = str;
        adw.f11583c = str;
        adw.f11584d = new adx();
        adw.f11584d.f11599a = this.f14072j.f15352a;
        aef aef = new aef();
        aef.f11633a = zzang.f15360a;
        aef.f11635c = Boolean.valueOf(C3181c.m14658a(this.f14069g).mo11126a());
        long d = (long) C3182e.m14660b().mo11136d(this.f14069g);
        if (d > 0) {
            aef.f11634b = Long.valueOf(d);
        }
        adw.f11588h = aef;
        this.f14065c = adw;
        this.f14073k = new C3609hr(this.f14069g, this.f14072j.f15359h, this);
    }

    /* renamed from: d */
    static final /* synthetic */ Void m18611d(String str) {
        return null;
    }

    /* renamed from: e */
    private final aee m18612e(String str) {
        aee aee;
        synchronized (this.f14074l) {
            aee = (aee) this.f14066d.get(str);
        }
        return aee;
    }

    /* renamed from: f */
    private final C3751my<Void> m18614f() {
        C3751my<Void> a;
        aee[] aeeArr;
        if (!((this.f14071i && this.f14072j.f15358g) || (this.f14078p && this.f14072j.f15357f) || (!this.f14071i && this.f14072j.f15355d))) {
            return C3740mn.m19191a(null);
        }
        synchronized (this.f14074l) {
            this.f14065c.f11585e = new aee[this.f14066d.size()];
            this.f14066d.values().toArray(this.f14065c.f11585e);
            this.f14065c.f11589i = (String[]) this.f14067e.toArray(new String[0]);
            this.f14065c.f11590j = (String[]) this.f14068f.toArray(new String[0]);
            if (C3605hn.m18633a()) {
                String str = this.f14065c.f11582b;
                String str2 = this.f14065c.f11586f;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (aee aee : this.f14065c.f11585e) {
                    sb2.append("    [");
                    sb2.append(aee.f11628e.length);
                    sb2.append("] ");
                    sb2.append(aee.f11625b);
                }
                C3605hn.m18632a(sb2.toString());
            }
            C3751my a2 = new C3690kr(this.f14069g).mo13206a(1, this.f14072j.f15353b, null, C3401ads.m16013a((C3401ads) this.f14065c));
            if (C3605hn.m18633a()) {
                a2.mo13268a(new C3601hj(this), C3651jf.f14271a);
            }
            a = C3740mn.m19194a(a2, C3598hg.f14080a, C3758ne.f14482b);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C3751my mo12976a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f14074l) {
                            int length = optJSONArray.length();
                            aee e = m18612e(str);
                            if (e == null) {
                                String str2 = "Cannot find the corresponding resource object for ";
                                String valueOf = String.valueOf(str);
                                C3605hn.m18632a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                e.f11628e = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    e.f11628e[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f14071i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f14071i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                String str3 = "Failed to get SafeBrowsing metadata";
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12742cB)).booleanValue()) {
                    C3643iy.m19170a(str3, e2);
                }
                return C3740mn.m19190a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f14071i) {
            synchronized (this.f14074l) {
                this.f14065c.f11581a = Integer.valueOf(9);
            }
        }
        return m18614f();
    }

    /* renamed from: a */
    public final zzaiq mo12977a() {
        return this.f14072j;
    }

    /* renamed from: a */
    public final void mo12978a(View view) {
        if (this.f14072j.f15354c && !this.f14077o) {
            zzbv.zzek();
            Bitmap b = C3653jh.m18889b(view);
            if (b == null) {
                C3605hn.m18632a("Failed to capture the webview bitmap.");
                return;
            }
            this.f14077o = true;
            C3653jh.m18878a((Runnable) new C3599hh(this, b));
        }
    }

    /* renamed from: a */
    public final void mo12979a(String str) {
        synchronized (this.f14074l) {
            this.f14065c.f11586f = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12980a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f14074l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x000d
            r2 = 1
            r6.f14078p = r2     // Catch:{ all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r7 = move-exception
            goto L_0x00ca
        L_0x000d:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.aee> r2 = r6.f14066d     // Catch:{ all -> 0x000a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0027
            if (r9 != r1) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.aee> r8 = r6.f14066d     // Catch:{ all -> 0x000a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.aee r7 = (com.google.android.gms.internal.ads.aee) r7     // Catch:{ all -> 0x000a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r7.f11627d = r8     // Catch:{ all -> 0x000a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.aee r1 = new com.google.android.gms.internal.ads.aee     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f11627d = r9     // Catch:{ all -> 0x000a }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.aee> r9 = r6.f14066d     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f11624a = r9     // Catch:{ all -> 0x000a }
            r1.f11625b = r7     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.adz r9 = new com.google.android.gms.internal.ads.adz     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            r1.f11626c = r9     // Catch:{ all -> 0x000a }
            java.util.HashSet<java.lang.String> r9 = r6.f14075m     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            if (r9 <= 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000a }
        L_0x005e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x000a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x000a }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r3 = ""
        L_0x0079:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.util.HashSet<java.lang.String> r5 = r6.f14075m     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 != 0) goto L_0x0097
            goto L_0x005e
        L_0x0097:
            com.google.android.gms.internal.ads.ady r4 = new com.google.android.gms.internal.ads.ady     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f11601a = r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f11602b = r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x005e
        L_0x00b0:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.C3605hn.m18632a(r2)     // Catch:{ all -> 0x000a }
            goto L_0x005e
        L_0x00b6:
            int r8 = r9.size()     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.ady[] r8 = new com.google.android.gms.internal.ads.ady[r8]     // Catch:{ all -> 0x000a }
            r9.toArray(r8)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.adz r9 = r1.f11626c     // Catch:{ all -> 0x000a }
            r9.f11603a = r8     // Catch:{ all -> 0x000a }
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.aee> r8 = r6.f14066d     // Catch:{ all -> 0x000a }
            r8.put(r7, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3596he.mo12980a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: a */
    public final String[] mo12981a(String[] strArr) {
        return (String[]) this.f14073k.mo12993a(strArr).toArray(new String[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12982b(String str) {
        synchronized (this.f14074l) {
            this.f14067e.add(str);
        }
    }

    /* renamed from: b */
    public final boolean mo12983b() {
        return C3309n.m15075g() && this.f14072j.f15354c && !this.f14077o;
    }

    /* renamed from: c */
    public final void mo12984c() {
        this.f14076n = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo12985c(String str) {
        synchronized (this.f14074l) {
            this.f14068f.add(str);
        }
    }

    /* renamed from: d */
    public final void mo12986d() {
        synchronized (this.f14074l) {
            C3751my a = C3740mn.m19193a(this.f14070h.mo12990a(this.f14069g, this.f14066d.keySet()), (C3735mi<? super A, ? extends B>) new C3597hf<Object,Object>(this), C3758ne.f14482b);
            C3751my a2 = C3740mn.m19192a(a, 10, TimeUnit.SECONDS, f14064b);
            C3740mn.m19198a(a, (C3737mk<V>) new C3600hi<V>(this, a2), C3758ne.f14482b);
            f14063a.add(a2);
        }
    }
}
