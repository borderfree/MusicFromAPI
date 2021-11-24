package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

public abstract class auc<T> implements Comparable<auc<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3505a f13151a;

    /* renamed from: b */
    private final int f13152b;

    /* renamed from: c */
    private final String f13153c;

    /* renamed from: d */
    private final int f13154d;

    /* renamed from: e */
    private final Object f13155e;

    /* renamed from: f */
    private bbf f13156f;

    /* renamed from: g */
    private Integer f13157g;

    /* renamed from: h */
    private ayd f13158h;

    /* renamed from: i */
    private boolean f13159i;

    /* renamed from: j */
    private boolean f13160j;

    /* renamed from: k */
    private boolean f13161k;

    /* renamed from: l */
    private boolean f13162l;

    /* renamed from: m */
    private C3394ab f13163m;

    /* renamed from: n */
    private afd f13164n;

    /* renamed from: o */
    private awc f13165o;

    public auc(int i, String str, bbf bbf) {
        this.f13151a = C3505a.f13781a ? new C3505a() : null;
        this.f13155e = new Object();
        this.f13159i = true;
        int i2 = 0;
        this.f13160j = false;
        this.f13161k = false;
        this.f13162l = false;
        this.f13164n = null;
        this.f13152b = i;
        this.f13153c = str;
        this.f13156f = bbf;
        this.f13163m = new ake();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i2 = host.hashCode();
                }
            }
        }
        this.f13154d = i2;
    }

    /* renamed from: a */
    public final auc<?> mo12488a(int i) {
        this.f13157g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final auc<?> mo12489a(afd afd) {
        this.f13164n = afd;
        return this;
    }

    /* renamed from: a */
    public final auc<?> mo12490a(ayd ayd) {
        this.f13158h = ayd;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bae<T> mo12491a(asc asc);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12492a(awc awc) {
        synchronized (this.f13155e) {
            this.f13165o = awc;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12493a(bae<?> bae) {
        awc awc;
        synchronized (this.f13155e) {
            awc = this.f13165o;
        }
        if (awc != null) {
            awc.mo11970a(this, bae);
        }
    }

    /* renamed from: a */
    public final void mo12494a(zzae zzae) {
        bbf bbf;
        synchronized (this.f13155e) {
            bbf = this.f13156f;
        }
        if (bbf != null) {
            bbf.mo12734a(zzae);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12495a(T t);

    /* renamed from: a */
    public byte[] mo12496a() {
        return null;
    }

    /* renamed from: b */
    public Map<String, String> mo12497b() {
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo12498b(String str) {
        if (C3505a.f13781a) {
            this.f13151a.mo12869a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    public final int mo12499c() {
        return this.f13152b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo12500c(String str) {
        if (this.f13158h != null) {
            this.f13158h.mo12624b(this);
        }
        if (C3505a.f13781a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new avd(this, str, id));
            } else {
                this.f13151a.mo12869a(str, id);
                this.f13151a.mo12868a(toString());
            }
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        auc auc = (auc) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.f13157g.intValue() - auc.f13157g.intValue() : zzu2.ordinal() - zzu.ordinal();
    }

    /* renamed from: d */
    public final int mo12502d() {
        return this.f13154d;
    }

    /* renamed from: e */
    public final String mo12503e() {
        return this.f13153c;
    }

    /* renamed from: f */
    public final afd mo12504f() {
        return this.f13164n;
    }

    /* renamed from: g */
    public final boolean mo12505g() {
        synchronized (this.f13155e) {
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo12506h() {
        return this.f13159i;
    }

    /* renamed from: i */
    public final int mo12507i() {
        return this.f13163m.mo11532a();
    }

    /* renamed from: j */
    public final C3394ab mo12508j() {
        return this.f13163m;
    }

    /* renamed from: k */
    public final void mo12509k() {
        synchronized (this.f13155e) {
            this.f13161k = true;
        }
    }

    /* renamed from: l */
    public final boolean mo12510l() {
        boolean z;
        synchronized (this.f13155e) {
            z = this.f13161k;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final void mo12511m() {
        awc awc;
        synchronized (this.f13155e) {
            awc = this.f13165o;
        }
        if (awc != null) {
            awc.mo11969a(this);
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f13154d));
        String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        String str2 = "[ ] ";
        String str3 = this.f13153c;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f13157g);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str3).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(str2);
        sb.append(str3);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
