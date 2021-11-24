package org.jsoup.nodes;

import org.jsoup.nodes.Document.C6760a;

/* renamed from: org.jsoup.nodes.c */
public class C6763c extends C6767g {
    public C6763c(String str, String str2) {
        super(str2);
        this.f23744c.mo21256a("comment", str);
    }

    /* renamed from: a */
    public String mo21224a() {
        return "#comment";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21269a(StringBuilder sb, int i, C6760a aVar) {
        if (aVar.mo21236c()) {
            mo21296c(sb, i, aVar);
        }
        sb.append("<!--");
        sb.append(mo21270b());
        sb.append("-->");
    }

    /* renamed from: b */
    public String mo21270b() {
        return this.f23744c.mo21255a("comment");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21271b(StringBuilder sb, int i, C6760a aVar) {
    }

    public String toString() {
        return mo21223C_();
    }
}
