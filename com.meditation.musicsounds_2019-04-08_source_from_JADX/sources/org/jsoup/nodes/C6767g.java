package org.jsoup.nodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jsoup.helper.C6758a;
import org.jsoup.helper.C6759b;
import org.jsoup.nodes.Document.C6760a;
import org.jsoup.p201a.C6754d;
import org.jsoup.p201a.C6755e;

/* renamed from: org.jsoup.nodes.g */
public abstract class C6767g implements Cloneable {

    /* renamed from: a */
    C6767g f23742a;

    /* renamed from: b */
    List<C6767g> f23743b;

    /* renamed from: c */
    C6762b f23744c;

    /* renamed from: d */
    String f23745d;

    /* renamed from: e */
    int f23746e;

    /* renamed from: org.jsoup.nodes.g$a */
    private static class C6768a implements C6755e {

        /* renamed from: a */
        private StringBuilder f23747a;

        /* renamed from: b */
        private C6760a f23748b;

        C6768a(StringBuilder sb, C6760a aVar) {
            this.f23747a = sb;
            this.f23748b = aVar;
        }

        /* renamed from: a */
        public void mo21177a(C6767g gVar, int i) {
            gVar.mo21269a(this.f23747a, i, this.f23748b);
        }

        /* renamed from: b */
        public void mo21178b(C6767g gVar, int i) {
            if (!gVar.mo21224a().equals("#text")) {
                gVar.mo21271b(this.f23747a, i, this.f23748b);
            }
        }
    }

    protected C6767g() {
        this.f23743b = Collections.emptyList();
        this.f23744c = null;
    }

    protected C6767g(String str) {
        this(str, new C6762b());
    }

    protected C6767g(String str, C6762b bVar) {
        C6759b.m32602a((Object) str);
        C6759b.m32602a((Object) bVar);
        this.f23743b = new ArrayList(4);
        this.f23745d = str.trim();
        this.f23744c = bVar;
    }

    /* renamed from: a */
    private void mo21276a(C6767g gVar) {
        if (gVar.f23742a != null) {
            gVar.f23742a.mo21301e(gVar);
        }
        gVar.mo21299d(this);
    }

    /* renamed from: c */
    private void mo21226c() {
        for (int i = 0; i < this.f23743b.size(); i++) {
            ((C6767g) this.f23743b.get(i)).mo21295b(i);
        }
    }

    /* renamed from: d */
    private C6760a mo21228d() {
        return (mo21305r() != null ? mo21305r() : new Document("")).mo21228d();
    }

    /* renamed from: C_ */
    public String mo21223C_() {
        StringBuilder sb = new StringBuilder(32768);
        mo21292a(sb);
        return sb.toString();
    }

    /* renamed from: a */
    public abstract String mo21224a();

    /* renamed from: a */
    public C6767g mo21290a(int i) {
        return (C6767g) this.f23743b.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21291a(int i, C6767g... gVarArr) {
        C6759b.m32606a((Object[]) gVarArr);
        for (int length = gVarArr.length - 1; length >= 0; length--) {
            C6767g gVar = gVarArr[length];
            mo21276a(gVar);
            this.f23743b.add(i, gVar);
        }
        mo21226c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21292a(StringBuilder sb) {
        new C6754d(new C6768a(sb, mo21228d())).mo21215a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo21269a(StringBuilder sb, int i, C6760a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21293a(C6767g... gVarArr) {
        for (C6767g gVar : gVarArr) {
            mo21276a(gVar);
            this.f23743b.add(gVar);
            gVar.mo21295b(this.f23743b.size() - 1);
        }
    }

    /* renamed from: b */
    public String mo21294b(String str) {
        C6759b.m32602a((Object) str);
        return this.f23744c.mo21261b(str) ? this.f23744c.mo21255a(str) : str.toLowerCase().startsWith("abs:") ? mo21300e(str.substring("abs:".length())) : "";
    }

    /* renamed from: b */
    public C6767g mo21278b(String str, String str2) {
        this.f23744c.mo21256a(str, str2);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21295b(int i) {
        this.f23746e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo21271b(StringBuilder sb, int i, C6760a aVar);

    /* renamed from: c */
    public C6767g mo21279c(C6767g gVar) {
        C6759b.m32602a((Object) gVar);
        C6759b.m32602a((Object) this.f23742a);
        this.f23742a.mo21291a(mo21308u(), gVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo21296c(StringBuilder sb, int i, C6760a aVar) {
        sb.append("\n");
        sb.append(C6758a.m32598a(i * aVar.mo21238d()));
    }

    /* renamed from: c */
    public boolean mo21297c(String str) {
        C6759b.m32602a((Object) str);
        if (str.toLowerCase().startsWith("abs:")) {
            String substring = str.substring("abs:".length());
            if (this.f23744c.mo21261b(substring) && !mo21300e(substring).equals("")) {
                return true;
            }
        }
        return this.f23744c.mo21261b(str);
    }

    /* renamed from: d */
    public void mo21298d(String str) {
        C6759b.m32602a((Object) str);
        this.f23745d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo21299d(C6767g gVar) {
        if (this.f23742a != null) {
            this.f23742a.mo21301e(this);
        }
        this.f23742a = gVar;
    }

    /* renamed from: e */
    public String mo21300e(String str) {
        C6759b.m32603a(str);
        String b = mo21294b(str);
        if (!mo21297c(str)) {
            return "";
        }
        try {
            URL url = new URL(this.f23745d);
            try {
                if (b.startsWith("?")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(url.getPath());
                    sb.append(b);
                    b = sb.toString();
                }
                return new URL(url, b).toExternalForm();
            } catch (MalformedURLException unused) {
                return "";
            }
        } catch (MalformedURLException unused2) {
            return new URL(b).toExternalForm();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo21301e(C6767g gVar) {
        C6759b.m32604a(gVar.f23742a == this);
        this.f23743b.remove(gVar.mo21308u());
        mo21226c();
        gVar.f23742a = null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C6767g mo21302f(C6767g gVar) {
        try {
            C6767g gVar2 = (C6767g) super.clone();
            gVar2.f23742a = gVar;
            gVar2.f23746e = gVar == null ? 0 : this.f23746e;
            gVar2.f23744c = this.f23744c != null ? this.f23744c.clone() : null;
            gVar2.f23745d = this.f23745d;
            gVar2.f23743b = new ArrayList(this.f23743b.size());
            for (C6767g f : this.f23743b) {
                gVar2.f23743b.add(f.mo21302f(gVar2));
            }
            return gVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    public C6767g clone() {
        return mo21302f(null);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f23742a != null ? this.f23742a.hashCode() : 0) * 31;
        if (this.f23744c != null) {
            i = this.f23744c.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: o */
    public C6767g mo21289o() {
        return this.f23742a;
    }

    /* renamed from: p */
    public C6762b mo21303p() {
        return this.f23744c;
    }

    /* renamed from: q */
    public List<C6767g> mo21304q() {
        return Collections.unmodifiableList(this.f23743b);
    }

    /* renamed from: r */
    public Document mo21305r() {
        if (this instanceof Document) {
            return (Document) this;
        }
        if (this.f23742a == null) {
            return null;
        }
        return this.f23742a.mo21305r();
    }

    /* renamed from: s */
    public void mo21306s() {
        C6759b.m32602a((Object) this.f23742a);
        this.f23742a.mo21301e(this);
    }

    /* renamed from: t */
    public C6767g mo21307t() {
        if (this.f23742a == null) {
            return null;
        }
        List<C6767g> list = this.f23742a.f23743b;
        Integer valueOf = Integer.valueOf(mo21308u());
        C6759b.m32602a((Object) valueOf);
        if (list.size() > valueOf.intValue() + 1) {
            return (C6767g) list.get(valueOf.intValue() + 1);
        }
        return null;
    }

    public String toString() {
        return mo21223C_();
    }

    /* renamed from: u */
    public int mo21308u() {
        return this.f23746e;
    }
}
