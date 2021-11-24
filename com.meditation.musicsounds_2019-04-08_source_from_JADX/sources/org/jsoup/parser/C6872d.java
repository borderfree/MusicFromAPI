package org.jsoup.parser;

import com.seattleclouds.modules.nativetetris.C5915i;
import com.seattleclouds.modules.p176n.C5894b;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.helper.C6759b;

/* renamed from: org.jsoup.parser.d */
public class C6872d {

    /* renamed from: a */
    private static final Map<String, C6872d> f23778a = new HashMap();

    /* renamed from: j */
    private static final String[] f23779j = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext"};

    /* renamed from: k */
    private static final String[] f23780k = {"object", "base", "font", "tt", C5915i.f20903a, C5894b.f20856a, "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device"};

    /* renamed from: l */
    private static final String[] f23781l = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device"};

    /* renamed from: m */
    private static final String[] f23782m = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td"};

    /* renamed from: n */
    private static final String[] f23783n = {"pre", "plaintext", "title"};

    /* renamed from: b */
    private String f23784b;

    /* renamed from: c */
    private boolean f23785c = true;

    /* renamed from: d */
    private boolean f23786d = true;

    /* renamed from: e */
    private boolean f23787e = true;

    /* renamed from: f */
    private boolean f23788f = true;

    /* renamed from: g */
    private boolean f23789g = false;

    /* renamed from: h */
    private boolean f23790h = false;

    /* renamed from: i */
    private boolean f23791i = false;

    static {
        for (String dVar : f23779j) {
            m32797a(new C6872d(dVar));
        }
        for (String dVar2 : f23780k) {
            C6872d dVar3 = new C6872d(dVar2);
            dVar3.f23785c = false;
            dVar3.f23787e = false;
            dVar3.f23786d = false;
            m32797a(dVar3);
        }
        for (String str : f23781l) {
            C6872d dVar4 = (C6872d) f23778a.get(str);
            C6759b.m32602a((Object) dVar4);
            dVar4.f23787e = false;
            dVar4.f23788f = false;
            dVar4.f23789g = true;
        }
        for (String str2 : f23782m) {
            C6872d dVar5 = (C6872d) f23778a.get(str2);
            C6759b.m32602a((Object) dVar5);
            dVar5.f23786d = false;
        }
        for (String str3 : f23783n) {
            C6872d dVar6 = (C6872d) f23778a.get(str3);
            C6759b.m32602a((Object) dVar6);
            dVar6.f23791i = true;
        }
    }

    private C6872d(String str) {
        this.f23784b = str.toLowerCase();
    }

    /* renamed from: a */
    public static C6872d m32796a(String str) {
        C6872d dVar;
        C6759b.m32602a((Object) str);
        String lowerCase = str.trim().toLowerCase();
        C6759b.m32603a(lowerCase);
        synchronized (f23778a) {
            dVar = (C6872d) f23778a.get(lowerCase);
            if (dVar == null) {
                dVar = new C6872d(lowerCase);
                dVar.f23785c = false;
                dVar.f23787e = true;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static C6872d m32797a(C6872d dVar) {
        synchronized (f23778a) {
            f23778a.put(dVar.f23784b, dVar);
        }
        return dVar;
    }

    /* renamed from: b */
    public static boolean m32798b(String str) {
        return f23778a.containsKey(str);
    }

    /* renamed from: a */
    public String mo21371a() {
        return this.f23784b;
    }

    /* renamed from: b */
    public boolean mo21372b() {
        return this.f23786d;
    }

    /* renamed from: c */
    public boolean mo21373c() {
        return this.f23789g || this.f23790h;
    }

    /* renamed from: d */
    public boolean mo21374d() {
        return f23778a.containsKey(this.f23784b);
    }

    /* renamed from: e */
    public boolean mo21375e() {
        return this.f23791i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6872d)) {
            return false;
        }
        C6872d dVar = (C6872d) obj;
        return this.f23787e == dVar.f23787e && this.f23788f == dVar.f23788f && this.f23789g == dVar.f23789g && this.f23786d == dVar.f23786d && this.f23785c == dVar.f23785c && this.f23791i == dVar.f23791i && this.f23790h == dVar.f23790h && this.f23784b.equals(dVar.f23784b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C6872d mo21377f() {
        this.f23790h = true;
        return this;
    }

    public int hashCode() {
        return (((((((((((((this.f23784b.hashCode() * 31) + (this.f23785c ? 1 : 0)) * 31) + (this.f23786d ? 1 : 0)) * 31) + (this.f23787e ? 1 : 0)) * 31) + (this.f23788f ? 1 : 0)) * 31) + (this.f23789g ? 1 : 0)) * 31) + (this.f23790h ? 1 : 0)) * 31) + (this.f23791i ? 1 : 0);
    }

    public String toString() {
        return this.f23784b;
    }
}
