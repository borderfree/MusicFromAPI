package com.bumptech.glide.p036c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.C1231g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.c.o */
public class C1206o extends Fragment {

    /* renamed from: a */
    private final C1187a f4360a;

    /* renamed from: b */
    private final C1204m f4361b;

    /* renamed from: c */
    private final Set<C1206o> f4362c;

    /* renamed from: d */
    private C1206o f4363d;

    /* renamed from: e */
    private C1231g f4364e;

    /* renamed from: f */
    private Fragment f4365f;

    /* renamed from: com.bumptech.glide.c.o$a */
    private class C1207a implements C1204m {
        C1207a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C1206o.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C1206o() {
        this(new C1187a());
    }

    @SuppressLint({"ValidFragment"})
    public C1206o(C1187a aVar) {
        this.f4361b = new C1207a();
        this.f4362c = new HashSet();
        this.f4360a = aVar;
    }

    /* renamed from: a */
    private void m6536a(C0367h hVar) {
        m6538as();
        this.f4363d = C1186c.m6450a((Context) hVar).mo5745g().mo5781b(hVar);
        if (!equals(this.f4363d)) {
            this.f4363d.m6537a(this);
        }
    }

    /* renamed from: a */
    private void m6537a(C1206o oVar) {
        this.f4362c.add(oVar);
    }

    /* renamed from: as */
    private void m6538as() {
        if (this.f4363d != null) {
            this.f4363d.m6539b(this);
            this.f4363d = null;
        }
    }

    /* renamed from: b */
    private void m6539b(C1206o oVar) {
        this.f4362c.remove(oVar);
    }

    /* renamed from: e */
    private Fragment m6540e() {
        Fragment x = mo1325x();
        return x != null ? x : this.f4365f;
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        this.f4360a.mo5754c();
        m6538as();
    }

    /* renamed from: a */
    public void mo1228a(Context context) {
        super.mo1228a(context);
        try {
            m6536a(mo1318s());
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    /* renamed from: a */
    public void mo5791a(C1231g gVar) {
        this.f4364e = gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1187a mo1450b() {
        return this.f4360a;
    }

    /* renamed from: c */
    public C1231g mo1453c() {
        return this.f4364e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5792c(Fragment fragment) {
        this.f4365f = fragment;
        if (fragment != null && fragment.mo1318s() != null) {
            m6536a(fragment.mo1318s());
        }
    }

    /* renamed from: d */
    public C1204m mo5793d() {
        return this.f4361b;
    }

    /* renamed from: f */
    public void mo1285f() {
        super.mo1285f();
        this.f4365f = null;
        m6538as();
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        this.f4360a.mo5750a();
    }

    /* renamed from: h */
    public void mo1292h() {
        super.mo1292h();
        this.f4360a.mo5752b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m6540e());
        sb.append("}");
        return sb.toString();
    }
}
