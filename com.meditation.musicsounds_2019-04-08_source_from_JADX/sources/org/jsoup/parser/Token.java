package org.jsoup.parser;

import org.jsoup.helper.C6759b;
import org.jsoup.nodes.C6761a;
import org.jsoup.nodes.C6762b;

abstract class Token {

    /* renamed from: a */
    TokenType f23750a;

    enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* renamed from: org.jsoup.parser.Token$a */
    static class C6771a extends Token {

        /* renamed from: b */
        private final String f23752b;

        C6771a(String str) {
            super();
            this.f23750a = TokenType.Character;
            this.f23752b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public String mo21320l() {
            return this.f23752b;
        }

        public String toString() {
            return mo21320l();
        }
    }

    /* renamed from: org.jsoup.parser.Token$b */
    static class C6772b extends Token {

        /* renamed from: b */
        final StringBuilder f23753b;

        C6772b() {
            super();
            this.f23753b = new StringBuilder();
            this.f23750a = TokenType.Comment;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public String mo21322l() {
            return this.f23753b.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("<!--");
            sb.append(mo21322l());
            sb.append("-->");
            return sb.toString();
        }
    }

    /* renamed from: org.jsoup.parser.Token$c */
    static class C6773c extends Token {

        /* renamed from: b */
        final StringBuilder f23754b;

        /* renamed from: c */
        final StringBuilder f23755c;

        /* renamed from: d */
        final StringBuilder f23756d;

        /* renamed from: e */
        boolean f23757e;

        C6773c() {
            super();
            this.f23754b = new StringBuilder();
            this.f23755c = new StringBuilder();
            this.f23756d = new StringBuilder();
            this.f23757e = false;
            this.f23750a = TokenType.Doctype;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public String mo21324l() {
            return this.f23754b.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public String mo21325m() {
            return this.f23755c.toString();
        }

        /* renamed from: n */
        public String mo21326n() {
            return this.f23756d.toString();
        }

        /* renamed from: o */
        public boolean mo21327o() {
            return this.f23757e;
        }
    }

    /* renamed from: org.jsoup.parser.Token$d */
    static class C6774d extends Token {
        C6774d() {
            super();
            this.f23750a = TokenType.EOF;
        }
    }

    /* renamed from: org.jsoup.parser.Token$e */
    static class C6775e extends C6777g {
        C6775e() {
            this.f23750a = TokenType.EndTag;
        }

        C6775e(String str) {
            this();
            this.f23758b = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(mo21339n());
            sb.append(" ");
            sb.append(this.f23760d.toString());
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: org.jsoup.parser.Token$f */
    static class C6776f extends C6777g {
        C6776f() {
            this.f23750a = TokenType.StartTag;
        }

        C6776f(String str) {
            this();
            this.f23758b = str;
        }

        C6776f(String str, C6762b bVar) {
            this();
            this.f23758b = str;
            this.f23760d = bVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("<");
            sb.append(mo21339n());
            sb.append(" ");
            sb.append(this.f23760d.toString());
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: org.jsoup.parser.Token$g */
    static abstract class C6777g extends Token {

        /* renamed from: b */
        protected String f23758b;

        /* renamed from: c */
        boolean f23759c = false;

        /* renamed from: d */
        C6762b f23760d = new C6762b();

        /* renamed from: e */
        private String f23761e;

        /* renamed from: f */
        private String f23762f;

        C6777g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C6777g mo21330a(String str) {
            this.f23758b = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21331a(char c) {
            mo21333b(String.valueOf(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo21332b(char c) {
            mo21335c(String.valueOf(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo21333b(String str) {
            if (this.f23758b != null) {
                str = this.f23758b.concat(str);
            }
            this.f23758b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo21334c(char c) {
            mo21336d(String.valueOf(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo21335c(String str) {
            if (this.f23761e != null) {
                str = this.f23761e.concat(str);
            }
            this.f23761e = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo21336d(String str) {
            if (this.f23762f != null) {
                str = this.f23762f.concat(str);
            }
            this.f23762f = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo21337l() {
            if (this.f23761e != null) {
                if (this.f23762f == null) {
                    this.f23762f = "";
                }
                this.f23760d.mo21258a(new C6761a(this.f23761e, this.f23762f));
            }
            this.f23761e = null;
            this.f23762f = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo21338m() {
            if (this.f23761e != null) {
                mo21337l();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public String mo21339n() {
            C6759b.m32609b(this.f23758b.length() == 0);
            return this.f23758b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public boolean mo21340o() {
            return this.f23759c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public C6762b mo21341p() {
            return this.f23760d;
        }
    }

    private Token() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21309a() {
        return this.f23750a == TokenType.Doctype;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C6773c mo21310b() {
        return (C6773c) this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo21311c() {
        return this.f23750a == TokenType.StartTag;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C6776f mo21312d() {
        return (C6776f) this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo21313e() {
        return this.f23750a == TokenType.EndTag;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C6775e mo21314f() {
        return (C6775e) this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo21315g() {
        return this.f23750a == TokenType.Comment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public C6772b mo21316h() {
        return (C6772b) this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo21317i() {
        return this.f23750a == TokenType.Character;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C6771a mo21318j() {
        return (C6771a) this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo21319k() {
        return this.f23750a == TokenType.EOF;
    }
}
