package com.google.android.gms.internal.measurement;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3311p;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.as */
public final class C4253as {

    /* renamed from: a */
    private final C4499u f15726a;

    /* renamed from: b */
    private volatile Boolean f15727b;

    /* renamed from: c */
    private String f15728c;

    /* renamed from: d */
    private Set<Integer> f15729d;

    protected C4253as(C4499u uVar) {
        C3266s.m14913a(uVar);
        this.f15726a = uVar;
    }

    /* renamed from: b */
    public static boolean m20997b() {
        return ((Boolean) C4262ba.f15759a.mo14166a()).booleanValue();
    }

    /* renamed from: c */
    public static int m20998c() {
        return ((Integer) C4262ba.f15776r.mo14166a()).intValue();
    }

    /* renamed from: d */
    public static long m20999d() {
        return ((Long) C4262ba.f15764f.mo14166a()).longValue();
    }

    /* renamed from: e */
    public static long m21000e() {
        return ((Long) C4262ba.f15765g.mo14166a()).longValue();
    }

    /* renamed from: f */
    public static int m21001f() {
        return ((Integer) C4262ba.f15767i.mo14166a()).intValue();
    }

    /* renamed from: g */
    public static int m21002g() {
        return ((Integer) C4262ba.f15768j.mo14166a()).intValue();
    }

    /* renamed from: h */
    public static String m21003h() {
        return (String) C4262ba.f15770l.mo14166a();
    }

    /* renamed from: i */
    public static String m21004i() {
        return (String) C4262ba.f15769k.mo14166a();
    }

    /* renamed from: j */
    public static String m21005j() {
        return (String) C4262ba.f15771m.mo14166a();
    }

    /* renamed from: l */
    public static long m21006l() {
        return ((Long) C4262ba.f15783y.mo14166a()).longValue();
    }

    /* renamed from: a */
    public final boolean mo14149a() {
        if (this.f15727b == null) {
            synchronized (this) {
                if (this.f15727b == null) {
                    ApplicationInfo applicationInfo = this.f15726a.mo14842a().getApplicationInfo();
                    String a = C3311p.m15084a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f15727b = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if ((this.f15727b == null || !this.f15727b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f15727b = Boolean.TRUE;
                    }
                    if (this.f15727b == null) {
                        this.f15727b = Boolean.TRUE;
                        this.f15726a.mo14846e().mo14823f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f15727b.booleanValue();
    }

    /* renamed from: k */
    public final Set<Integer> mo14150k() {
        String str = (String) C4262ba.f15779u.mo14166a();
        if (this.f15729d == null || this.f15728c == null || !this.f15728c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f15728c = str;
            this.f15729d = hashSet;
        }
        return this.f15729d;
    }
}
