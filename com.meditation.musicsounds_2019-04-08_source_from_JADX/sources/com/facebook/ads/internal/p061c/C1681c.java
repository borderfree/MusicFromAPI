package com.facebook.ads.internal.p061c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.c.c */
public class C1681c implements Serializable {
    private static final long serialVersionUID = -3209129042070173126L;

    /* renamed from: a */
    private final int f5518a;

    /* renamed from: b */
    private final String f5519b;

    /* renamed from: c */
    private final String f5520c;

    /* renamed from: d */
    private final List<C1681c> f5521d;

    /* renamed from: e */
    private C1681c f5522e;

    C1681c(int i, String str, String str2) {
        this.f5521d = new ArrayList();
        this.f5518a = i;
        this.f5519b = str;
        this.f5520c = str2;
    }

    C1681c(String str) {
        this(0, null, str);
    }

    /* renamed from: b */
    private void m8434b(C1681c cVar) {
        this.f5522e = cVar;
    }

    /* renamed from: a */
    public int mo6822a() {
        return this.f5518a;
    }

    /* renamed from: a */
    public void mo6823a(C1681c cVar) {
        cVar.m8434b(this);
        this.f5521d.add(cVar);
    }

    /* renamed from: b */
    public String mo6824b() {
        return this.f5519b;
    }

    /* renamed from: c */
    public String mo6825c() {
        return this.f5520c;
    }

    /* renamed from: d */
    public List<C1681c> mo6826d() {
        return this.f5521d;
    }

    /* renamed from: e */
    public C1681c mo6827e() {
        return this.f5522e;
    }
}
