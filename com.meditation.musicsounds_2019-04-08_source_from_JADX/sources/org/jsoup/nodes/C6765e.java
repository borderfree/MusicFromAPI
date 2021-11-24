package org.jsoup.nodes;

import org.jsoup.helper.C6758a;
import org.jsoup.helper.C6759b;
import org.jsoup.nodes.Document.C6760a;

/* renamed from: org.jsoup.nodes.e */
public class C6765e extends C6767g {
    public C6765e(String str, String str2, String str3, String str4) {
        super(str4);
        C6759b.m32603a(str);
        mo21278b("name", str);
        mo21278b("publicId", str2);
        mo21278b("systemId", str3);
    }

    /* renamed from: a */
    public String mo21224a() {
        return "#doctype";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21269a(StringBuilder sb, int i, C6760a aVar) {
        sb.append("<!DOCTYPE ");
        sb.append(mo21294b("name"));
        if (!C6758a.m32599a(mo21294b("publicId"))) {
            sb.append(" PUBLIC \"");
            sb.append(mo21294b("publicId"));
            sb.append("\"");
        }
        if (!C6758a.m32599a(mo21294b("systemId"))) {
            sb.append(" \"");
            sb.append(mo21294b("systemId"));
            sb.append("\"");
        }
        sb.append('>');
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21271b(StringBuilder sb, int i, C6760a aVar) {
    }
}
