package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aqz {

    /* renamed from: a */
    private boolean f12940a;

    /* renamed from: b */
    private final List<aqx> f12941b = new LinkedList();

    /* renamed from: c */
    private final Map<String, String> f12942c = new LinkedHashMap();

    /* renamed from: d */
    private final Object f12943d = new Object();

    /* renamed from: e */
    private String f12944e;

    /* renamed from: f */
    private aqz f12945f;

    public aqz(boolean z, String str, String str2) {
        this.f12940a = z;
        this.f12942c.put("action", str);
        this.f12942c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final aqx mo12318a() {
        return mo12319a(zzbv.zzer().mo11327b());
    }

    /* renamed from: a */
    public final aqx mo12319a(long j) {
        if (!this.f12940a) {
            return null;
        }
        return new aqx(j, null, null);
    }

    /* renamed from: a */
    public final void mo12320a(aqz aqz) {
        synchronized (this.f12943d) {
            this.f12945f = aqz;
        }
    }

    /* renamed from: a */
    public final void mo12321a(String str) {
        if (this.f12940a) {
            synchronized (this.f12943d) {
                this.f12944e = str;
            }
        }
    }

    /* renamed from: a */
    public final void mo12322a(String str, String str2) {
        if (this.f12940a && !TextUtils.isEmpty(str2)) {
            aqp b = zzbv.zzeo().mo13049b();
            if (b != null) {
                synchronized (this.f12943d) {
                    aqt a = b.mo12305a(str);
                    Map<String, String> map = this.f12942c;
                    map.put(str, a.mo12311a((String) map.get(str), str2));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo12323a(aqx aqx, long j, String... strArr) {
        synchronized (this.f12943d) {
            for (String aqx2 : strArr) {
                this.f12941b.add(new aqx(j, aqx2, aqx));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo12324a(aqx aqx, String... strArr) {
        if (!this.f12940a || aqx == null) {
            return false;
        }
        return mo12323a(aqx, zzbv.zzer().mo11327b(), strArr);
    }

    /* renamed from: b */
    public final String mo12325b() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.f12943d) {
            for (aqx aqx : this.f12941b) {
                long a = aqx.mo12312a();
                String b = aqx.mo12313b();
                aqx c = aqx.mo12314c();
                if (c != null && a > 0) {
                    long a2 = a - c.mo12312a();
                    sb2.append(b);
                    sb2.append('.');
                    sb2.append(a2);
                    sb2.append(',');
                }
            }
            this.f12941b.clear();
            if (!TextUtils.isEmpty(this.f12944e)) {
                sb2.append(this.f12944e);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Map<String, String> mo12326c() {
        synchronized (this.f12943d) {
            aqp b = zzbv.zzeo().mo13049b();
            if (b != null) {
                if (this.f12945f != null) {
                    Map<String, String> a = b.mo12306a(this.f12942c, this.f12945f.mo12326c());
                    return a;
                }
            }
            Map<String, String> map = this.f12942c;
            return map;
        }
    }

    /* renamed from: d */
    public final aqx mo12327d() {
        synchronized (this.f12943d) {
        }
        return null;
    }
}
