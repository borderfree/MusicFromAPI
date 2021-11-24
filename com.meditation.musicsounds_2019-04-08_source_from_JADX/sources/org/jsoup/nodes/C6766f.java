package org.jsoup.nodes;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jsoup.helper.C6759b;
import org.jsoup.nodes.Document.C6760a;
import org.jsoup.p201a.C6749a;
import org.jsoup.p201a.C6751b;
import org.jsoup.p201a.C6752c.C6753a;
import org.jsoup.parser.C6872d;

/* renamed from: org.jsoup.nodes.f */
public class C6766f extends C6767g {

    /* renamed from: f */
    private C6872d f23740f;

    /* renamed from: g */
    private Set<String> f23741g;

    public C6766f(C6872d dVar, String str) {
        this(dVar, str, new C6762b());
    }

    public C6766f(C6872d dVar, String str, C6762b bVar) {
        super(str, bVar);
        C6759b.m32602a((Object) dVar);
        this.f23740f = dVar;
    }

    /* renamed from: b */
    private void m32659b(StringBuilder sb) {
        for (C6767g a : this.f23743b) {
            a.mo21292a(sb);
        }
    }

    /* renamed from: a */
    public String mo21224a() {
        return this.f23740f.mo21371a();
    }

    /* renamed from: a */
    public C6751b mo21274a(String str) {
        C6759b.m32603a(str);
        return C6749a.m32583a(new C6753a(str.toLowerCase().trim()), this);
    }

    /* renamed from: a */
    public C6766f mo21278b(String str, String str2) {
        super.mo21278b(str, str2);
        return this;
    }

    /* renamed from: a */
    public C6766f mo21276a(C6767g gVar) {
        C6759b.m32602a((Object) gVar);
        mo21293a(gVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21269a(StringBuilder sb, int i, C6760a aVar) {
        if (sb.length() > 0 && aVar.mo21236c() && (this.f23740f.mo21372b() || (mo21289o() != null && mo21289o().mo21283i().mo21372b()))) {
            mo21296c(sb, i, aVar);
        }
        sb.append("<");
        sb.append(mo21281h());
        this.f23744c.mo21257a(sb, aVar);
        sb.append((!this.f23743b.isEmpty() || !this.f23740f.mo21373c()) ? ">" : " />");
    }

    /* renamed from: b */
    public C6766f mo21279c(C6767g gVar) {
        return (C6766f) super.mo21279c(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21271b(StringBuilder sb, int i, C6760a aVar) {
        if (!this.f23743b.isEmpty() || !this.f23740f.mo21373c()) {
            if (aVar.mo21236c() && !this.f23743b.isEmpty() && this.f23740f.mo21372b()) {
                mo21296c(sb, i, aVar);
            }
            sb.append("</");
            sb.append(mo21281h());
            sb.append(">");
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public C6766f mo21231g() {
        C6766f fVar = (C6766f) super.clone();
        fVar.mo21287m();
        return fVar;
    }

    /* renamed from: h */
    public String mo21281h() {
        return this.f23740f.mo21371a();
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.f23740f != null ? this.f23740f.hashCode() : 0);
    }

    /* renamed from: i */
    public C6872d mo21283i() {
        return this.f23740f;
    }

    /* renamed from: j */
    public final C6766f mo21289o() {
        return (C6766f) this.f23742a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo21285k() {
        return this.f23740f.mo21375e() || (mo21289o() != null && mo21289o().mo21285k());
    }

    /* renamed from: l */
    public String mo21286l() {
        return mo21294b("class");
    }

    /* renamed from: m */
    public Set<String> mo21287m() {
        if (this.f23741g == null) {
            this.f23741g = new LinkedHashSet(Arrays.asList(mo21286l().split("\\s+")));
        }
        return this.f23741g;
    }

    /* renamed from: n */
    public String mo21288n() {
        StringBuilder sb = new StringBuilder();
        m32659b(sb);
        return sb.toString().trim();
    }

    public String toString() {
        return mo21223C_();
    }
}
