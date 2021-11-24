package org.jsoup.nodes;

import org.jsoup.helper.C6758a;
import org.jsoup.nodes.Document.C6760a;

/* renamed from: org.jsoup.nodes.h */
public class C6769h extends C6767g {

    /* renamed from: f */
    String f23749f;

    public C6769h(String str, String str2) {
        this.f23745d = str2;
        this.f23749f = str;
    }

    /* renamed from: a */
    static String m32711a(String str) {
        return C6758a.m32601b(str);
    }

    /* renamed from: e */
    private void m32712e() {
        if (this.f23744c == null) {
            this.f23744c = new C6762b();
            this.f23744c.mo21256a("text", this.f23749f);
        }
    }

    /* renamed from: a */
    public String mo21224a() {
        return "#text";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21269a(StringBuilder sb, int i, C6760a aVar) {
        String a = Entities.m32626a(mo21226c(), aVar);
        if (aVar.mo21236c() && (mo21289o() instanceof C6766f) && !((C6766f) mo21289o()).mo21285k()) {
            a = m32711a(a);
        }
        if (aVar.mo21236c() && mo21308u() == 0 && (this.f23742a instanceof C6766f) && ((C6766f) this.f23742a).mo21283i().mo21372b() && !mo21228d()) {
            mo21296c(sb, i, aVar);
        }
        sb.append(a);
    }

    /* renamed from: b */
    public String mo21294b(String str) {
        m32712e();
        return super.mo21294b(str);
    }

    /* renamed from: b */
    public C6767g mo21278b(String str, String str2) {
        m32712e();
        return super.mo21278b(str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21271b(StringBuilder sb, int i, C6760a aVar) {
    }

    /* renamed from: c */
    public String mo21226c() {
        return this.f23744c == null ? this.f23749f : this.f23744c.mo21255a("text");
    }

    /* renamed from: c */
    public boolean mo21297c(String str) {
        m32712e();
        return super.mo21297c(str);
    }

    /* renamed from: d */
    public boolean mo21228d() {
        return C6758a.m32599a(mo21226c());
    }

    /* renamed from: e */
    public String mo21300e(String str) {
        m32712e();
        return super.mo21300e(str);
    }

    /* renamed from: p */
    public C6762b mo21303p() {
        m32712e();
        return super.mo21303p();
    }

    public String toString() {
        return mo21223C_();
    }
}
