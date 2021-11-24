package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.jsoup.nodes.Entities.EscapeMode;
import org.jsoup.parser.C6872d;

public class Document extends C6766f {

    /* renamed from: f */
    private C6760a f23719f = new C6760a();

    /* renamed from: g */
    private QuirksMode f23720g = QuirksMode.noQuirks;

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* renamed from: org.jsoup.nodes.Document$a */
    public static class C6760a implements Cloneable {

        /* renamed from: a */
        private EscapeMode f23722a = EscapeMode.base;

        /* renamed from: b */
        private Charset f23723b = Charset.forName("UTF-8");

        /* renamed from: c */
        private CharsetEncoder f23724c = this.f23723b.newEncoder();

        /* renamed from: d */
        private boolean f23725d = true;

        /* renamed from: e */
        private int f23726e = 1;

        /* renamed from: a */
        public C6760a mo21232a(String str) {
            mo21233a(Charset.forName(str));
            return this;
        }

        /* renamed from: a */
        public C6760a mo21233a(Charset charset) {
            this.f23723b = charset;
            this.f23724c = charset.newEncoder();
            return this;
        }

        /* renamed from: a */
        public EscapeMode mo21234a() {
            return this.f23722a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public CharsetEncoder mo21235b() {
            return this.f23724c;
        }

        /* renamed from: c */
        public boolean mo21236c() {
            return this.f23725d;
        }

        /* renamed from: d */
        public int mo21238d() {
            return this.f23726e;
        }

        /* renamed from: e */
        public C6760a clone() {
            try {
                C6760a aVar = (C6760a) super.clone();
                aVar.mo21232a(this.f23723b.name());
                aVar.f23722a = EscapeMode.valueOf(this.f23722a.name());
                return aVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Document(String str) {
        super(C6872d.m32796a("#root"), str);
    }

    /* renamed from: C_ */
    public String mo21223C_() {
        return super.mo21288n();
    }

    /* renamed from: a */
    public String mo21224a() {
        return "#document";
    }

    /* renamed from: a */
    public Document mo21225a(QuirksMode quirksMode) {
        this.f23720g = quirksMode;
        return this;
    }

    /* renamed from: c */
    public Document mo21231g() {
        Document document = (Document) super.mo21231g();
        document.f23719f = this.f23719f.clone();
        return document;
    }

    /* renamed from: d */
    public C6760a mo21228d() {
        return this.f23719f;
    }

    /* renamed from: e */
    public QuirksMode mo21229e() {
        return this.f23720g;
    }
}
