package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import org.jsoup.helper.C6759b;
import org.jsoup.nodes.Document.C6760a;

/* renamed from: org.jsoup.nodes.b */
public class C6762b implements Cloneable, Iterable<C6761a> {

    /* renamed from: a */
    private LinkedHashMap<String, C6761a> f23739a = null;

    /* renamed from: a */
    public int mo21254a() {
        if (this.f23739a == null) {
            return 0;
        }
        return this.f23739a.size();
    }

    /* renamed from: a */
    public String mo21255a(String str) {
        C6759b.m32603a(str);
        if (this.f23739a == null) {
            return "";
        }
        C6761a aVar = (C6761a) this.f23739a.get(str.toLowerCase());
        return aVar != null ? aVar.getValue() : "";
    }

    /* renamed from: a */
    public void mo21256a(String str, String str2) {
        mo21258a(new C6761a(str, str2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21257a(StringBuilder sb, C6760a aVar) {
        if (this.f23739a != null) {
            for (Entry value : this.f23739a.entrySet()) {
                C6761a aVar2 = (C6761a) value.getValue();
                sb.append(" ");
                aVar2.mo21243a(sb, aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo21258a(C6761a aVar) {
        C6759b.m32602a((Object) aVar);
        if (this.f23739a == null) {
            this.f23739a = new LinkedHashMap<>(2);
        }
        this.f23739a.put(aVar.getKey(), aVar);
    }

    /* renamed from: a */
    public void mo21259a(C6762b bVar) {
        if (bVar.mo21254a() != 0) {
            if (this.f23739a == null) {
                this.f23739a = new LinkedHashMap<>(bVar.mo21254a());
            }
            this.f23739a.putAll(bVar.f23739a);
        }
    }

    /* renamed from: b */
    public List<C6761a> mo21260b() {
        if (this.f23739a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f23739a.size());
        for (Entry value : this.f23739a.entrySet()) {
            arrayList.add(value.getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public boolean mo21261b(String str) {
        return this.f23739a != null && this.f23739a.containsKey(str.toLowerCase());
    }

    /* renamed from: c */
    public String mo21262c() {
        StringBuilder sb = new StringBuilder();
        mo21257a(sb, new Document("").mo21228d());
        return sb.toString();
    }

    /* renamed from: d */
    public C6762b clone() {
        if (this.f23739a == null) {
            return new C6762b();
        }
        try {
            C6762b bVar = (C6762b) super.clone();
            bVar.f23739a = new LinkedHashMap<>(this.f23739a.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                C6761a aVar = (C6761a) it.next();
                bVar.f23739a.put(aVar.getKey(), aVar.clone());
            }
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6762b)) {
            return false;
        }
        C6762b bVar = (C6762b) obj;
        return this.f23739a == null ? bVar.f23739a == null : this.f23739a.equals(bVar.f23739a);
    }

    public int hashCode() {
        if (this.f23739a != null) {
            return this.f23739a.hashCode();
        }
        return 0;
    }

    public Iterator<C6761a> iterator() {
        return mo21260b().iterator();
    }

    public String toString() {
        return mo21262c();
    }
}
