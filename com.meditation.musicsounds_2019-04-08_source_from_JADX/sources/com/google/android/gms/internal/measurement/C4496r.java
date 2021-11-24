package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C2935b;
import com.google.android.gms.analytics.C2952p;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.internal.measurement.r */
public class C4496r {

    /* renamed from: a */
    private final C4499u f16364a;

    protected C4496r(C4499u uVar) {
        C3266s.m14913a(uVar);
        this.f16364a = uVar;
    }

    /* renamed from: a */
    private static String m22306a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    /* renamed from: a */
    private final void mo14178a(int i, String str, Object obj, Object obj2, Object obj3) {
        C4272bk f = this.f16364a != null ? this.f16364a.mo14847f() : null;
        if (f != null) {
            String str2 = (String) C4262ba.f15760b.mo14166a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, C4272bk.m22308c(str, obj, obj2, obj3));
            }
            if (i >= 5) {
                f.mo14178a(i, str, obj, obj2, obj3);
            }
            return;
        }
        String str3 = (String) C4262ba.f15760b.mo14166a();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, m22308c(str, obj, obj2, obj3));
        }
    }

    /* renamed from: c */
    protected static String m22308c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m22306a(obj);
        String a2 = m22306a(obj2);
        String a3 = m22306a(obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static boolean m22309v() {
        return Log.isLoggable((String) C4262ba.f15760b.mo14166a(), 2);
    }

    /* renamed from: a */
    public final void mo14808a(String str, Object obj) {
        mo14178a(2, str, obj, null, null);
    }

    /* renamed from: a */
    public final void mo14809a(String str, Object obj, Object obj2) {
        mo14178a(2, str, obj, obj2, null);
    }

    /* renamed from: a */
    public final void mo14810a(String str, Object obj, Object obj2, Object obj3) {
        mo14178a(3, str, obj, obj2, obj3);
    }

    /* renamed from: b */
    public final void mo14811b(String str) {
        mo14178a(2, str, null, null, null);
    }

    /* renamed from: b */
    public final void mo14812b(String str, Object obj) {
        mo14178a(3, str, obj, null, null);
    }

    /* renamed from: b */
    public final void mo14813b(String str, Object obj, Object obj2) {
        mo14178a(3, str, obj, obj2, null);
    }

    /* renamed from: b */
    public final void mo14814b(String str, Object obj, Object obj2, Object obj3) {
        mo14178a(5, str, obj, obj2, obj3);
    }

    /* renamed from: c */
    public final void mo14815c(String str) {
        mo14178a(3, str, null, null, null);
    }

    /* renamed from: c */
    public final void mo14816c(String str, Object obj) {
        mo14178a(4, str, obj, null, null);
    }

    /* renamed from: c */
    public final void mo14817c(String str, Object obj, Object obj2) {
        mo14178a(5, str, obj, obj2, null);
    }

    /* renamed from: d */
    public final void mo14818d(String str) {
        mo14178a(4, str, null, null, null);
    }

    /* renamed from: d */
    public final void mo14819d(String str, Object obj) {
        mo14178a(5, str, obj, null, null);
    }

    /* renamed from: d */
    public final void mo14820d(String str, Object obj, Object obj2) {
        mo14178a(6, str, obj, obj2, null);
    }

    /* renamed from: e */
    public final void mo14821e(String str) {
        mo14178a(5, str, null, null, null);
    }

    /* renamed from: e */
    public final void mo14822e(String str, Object obj) {
        mo14178a(6, str, obj, null, null);
    }

    /* renamed from: f */
    public final void mo14823f(String str) {
        mo14178a(6, str, null, null, null);
    }

    /* renamed from: g */
    public final C4499u mo14824g() {
        return this.f16364a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C3300e mo14825h() {
        return this.f16364a.mo14844c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Context mo14826i() {
        return this.f16364a.mo14842a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C4272bk mo14827j() {
        return this.f16364a.mo14846e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C4253as mo14828k() {
        return this.f16364a.mo14845d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C2952p mo14829l() {
        return this.f16364a.mo14848g();
    }

    /* renamed from: m */
    public final C2935b mo14830m() {
        return this.f16364a.mo14851j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C4490l mo14831n() {
        return this.f16364a.mo14849h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C4258ax mo14832o() {
        return this.f16364a.mo14850i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C4287bz mo14833p() {
        return this.f16364a.mo14852k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C4276bo mo14834q() {
        return this.f16364a.mo14853l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C4246al mo14835r() {
        return this.f16364a.mo14856o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final C4489k mo14836s() {
        return this.f16364a.mo14855n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C4240af mo14837t() {
        return this.f16364a.mo14857p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C4257aw mo14838u() {
        return this.f16364a.mo14858q();
    }
}
