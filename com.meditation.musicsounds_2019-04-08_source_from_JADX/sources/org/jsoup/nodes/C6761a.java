package org.jsoup.nodes;

import java.util.Map.Entry;
import org.jsoup.helper.C6759b;
import org.jsoup.nodes.Document.C6760a;

/* renamed from: org.jsoup.nodes.a */
public class C6761a implements Cloneable, Entry<String, String> {

    /* renamed from: a */
    private String f23737a;

    /* renamed from: b */
    private String f23738b;

    public C6761a(String str, String str2) {
        C6759b.m32603a(str);
        C6759b.m32602a((Object) str2);
        this.f23737a = str.trim().toLowerCase();
        this.f23738b = str2;
    }

    /* renamed from: a */
    public String getKey() {
        return this.f23737a;
    }

    /* renamed from: a */
    public String setValue(String str) {
        C6759b.m32602a((Object) str);
        String str2 = this.f23738b;
        this.f23738b = str;
        return str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21243a(StringBuilder sb, C6760a aVar) {
        sb.append(this.f23737a);
        sb.append("=\"");
        sb.append(Entities.m32626a(this.f23738b, aVar));
        sb.append("\"");
    }

    /* renamed from: b */
    public String getValue() {
        return this.f23738b;
    }

    /* renamed from: c */
    public String mo21245c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23737a);
        sb.append("=\"");
        sb.append(Entities.m32626a(this.f23738b, new Document("").mo21228d()));
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: d */
    public C6761a clone() {
        try {
            return (C6761a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6761a)) {
            return false;
        }
        C6761a aVar = (C6761a) obj;
        if (this.f23737a == null ? aVar.f23737a == null : this.f23737a.equals(aVar.f23737a)) {
            return this.f23738b == null ? aVar.f23738b == null : this.f23738b.equals(aVar.f23738b);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f23737a != null ? this.f23737a.hashCode() : 0) * 31;
        if (this.f23738b != null) {
            i = this.f23738b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return mo21245c();
    }
}
