package org.jsoup.parser;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.helper.C6759b;

/* renamed from: org.jsoup.parser.e */
class C6873e {

    /* renamed from: a */
    StringBuilder f23792a;

    /* renamed from: b */
    C6777g f23793b;

    /* renamed from: c */
    C6773c f23794c;

    /* renamed from: d */
    C6772b f23795d;

    /* renamed from: e */
    private C6869a f23796e;

    /* renamed from: f */
    private boolean f23797f = true;

    /* renamed from: g */
    private List<C6870b> f23798g = new ArrayList();

    /* renamed from: h */
    private TokeniserState f23799h = TokeniserState.Data;

    /* renamed from: i */
    private Token f23800i;

    /* renamed from: j */
    private boolean f23801j = false;

    /* renamed from: k */
    private StringBuilder f23802k = new StringBuilder();

    /* renamed from: l */
    private C6776f f23803l;

    /* renamed from: m */
    private boolean f23804m = true;

    C6873e(C6869a aVar) {
        this.f23796e = aVar;
    }

    /* renamed from: b */
    private void m32805b(String str) {
        if (this.f23797f) {
            this.f23798g.add(new C6870b(str, this.f23796e.mo21346a()));
        }
    }

    /* renamed from: k */
    private void m32806k() {
        if (this.f23797f) {
            this.f23798g.add(new C6870b("Invalid character reference", this.f23796e.mo21346a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cd, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Character mo21380a(java.lang.Character r7, boolean r8) {
        /*
            r6 = this;
            org.jsoup.parser.a r0 = r6.f23796e
            boolean r0 = r0.mo21350b()
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            if (r7 == 0) goto L_0x0019
            char r7 = r7.charValue()
            org.jsoup.parser.a r0 = r6.f23796e
            char r0 = r0.mo21354c()
            if (r7 != r0) goto L_0x0019
            return r1
        L_0x0019:
            org.jsoup.parser.a r7 = r6.f23796e
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {9, 10, 12, 60, 38} // fill-array
            boolean r7 = r7.mo21353b(r0)
            if (r7 == 0) goto L_0x0028
            return r1
        L_0x0028:
            org.jsoup.parser.a r7 = r6.f23796e
            r7.mo21362g()
            org.jsoup.parser.a r7 = r6.f23796e
            java.lang.String r0 = "#"
            boolean r7 = r7.mo21357d(r0)
            if (r7 == 0) goto L_0x009b
            org.jsoup.parser.a r7 = r6.f23796e
            java.lang.String r8 = "X"
            boolean r7 = r7.mo21359e(r8)
            if (r7 == 0) goto L_0x0048
            org.jsoup.parser.a r8 = r6.f23796e
            java.lang.String r8 = r8.mo21366k()
            goto L_0x004e
        L_0x0048:
            org.jsoup.parser.a r8 = r6.f23796e
            java.lang.String r8 = r8.mo21367l()
        L_0x004e:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x005d
        L_0x0054:
            r6.m32806k()
        L_0x0057:
            org.jsoup.parser.a r7 = r6.f23796e
            r7.mo21363h()
            return r1
        L_0x005d:
            org.jsoup.parser.a r0 = r6.f23796e
            java.lang.String r1 = ";"
            boolean r0 = r0.mo21357d(r1)
            if (r0 != 0) goto L_0x006a
            r6.m32806k()
        L_0x006a:
            if (r7 == 0) goto L_0x006f
            r7 = 16
            goto L_0x0071
        L_0x006f:
            r7 = 10
        L_0x0071:
            r0 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8, r7)     // Catch:{ NumberFormatException -> 0x007b }
            int r7 = r7.intValue()     // Catch:{ NumberFormatException -> 0x007b }
            goto L_0x007c
        L_0x007b:
            r7 = -1
        L_0x007c:
            if (r7 == r0) goto L_0x0094
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r8) goto L_0x0088
            r8 = 57343(0xdfff, float:8.0355E-41)
            if (r7 <= r8) goto L_0x0094
        L_0x0088:
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r8) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            char r7 = (char) r7
        L_0x008f:
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            return r7
        L_0x0094:
            r6.m32806k()
            r7 = 65533(0xfffd, float:9.1831E-41)
            goto L_0x008f
        L_0x009b:
            org.jsoup.parser.a r7 = r6.f23796e
            java.lang.String r7 = r7.mo21365j()
            org.jsoup.parser.a r0 = r6.f23796e
            r2 = 59
            boolean r0 = r0.mo21351b(r2)
            r2 = 1
            r3 = 0
            r4 = 0
        L_0x00ac:
            int r5 = r7.length()
            if (r5 <= 0) goto L_0x00cb
            if (r4 != 0) goto L_0x00cb
            boolean r5 = org.jsoup.nodes.Entities.m32628a(r7)
            if (r5 == 0) goto L_0x00bc
            r4 = 1
            goto L_0x00ac
        L_0x00bc:
            int r5 = r7.length()
            int r5 = r5 - r2
            java.lang.String r7 = r7.substring(r3, r5)
            org.jsoup.parser.a r5 = r6.f23796e
            r5.mo21358e()
            goto L_0x00ac
        L_0x00cb:
            if (r4 != 0) goto L_0x00d0
            if (r0 == 0) goto L_0x0057
            goto L_0x0054
        L_0x00d0:
            if (r8 == 0) goto L_0x00ee
            org.jsoup.parser.a r8 = r6.f23796e
            boolean r8 = r8.mo21368m()
            if (r8 != 0) goto L_0x0057
            org.jsoup.parser.a r8 = r6.f23796e
            boolean r8 = r8.mo21369n()
            if (r8 != 0) goto L_0x0057
            org.jsoup.parser.a r8 = r6.f23796e
            r0 = 61
            boolean r8 = r8.mo21351b(r0)
            if (r8 == 0) goto L_0x00ee
            goto L_0x0057
        L_0x00ee:
            org.jsoup.parser.a r8 = r6.f23796e
            java.lang.String r0 = ";"
            boolean r8 = r8.mo21357d(r0)
            if (r8 != 0) goto L_0x00fb
            r6.m32806k()
        L_0x00fb:
            java.lang.Character r7 = org.jsoup.nodes.Entities.m32629b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6873e.mo21380a(java.lang.Character, boolean):java.lang.Character");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6777g mo21381a(boolean z) {
        this.f23793b = z ? new C6776f() : new C6775e();
        return this.f23793b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Token mo21382a() {
        if (!this.f23804m) {
            m32805b("Self closing flag not acknowledged");
            this.f23804m = true;
        }
        while (!this.f23801j) {
            this.f23799h.read(this, this.f23796e);
        }
        if (this.f23802k.length() > 0) {
            String sb = this.f23802k.toString();
            this.f23802k.delete(0, this.f23802k.length());
            return new C6771a(sb);
        }
        this.f23801j = false;
        return this.f23800i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21383a(char c) {
        this.f23802k.append(c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21384a(String str) {
        this.f23802k.append(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21385a(Token token) {
        C6759b.m32605a(this.f23801j, "There is an unread token pending!");
        this.f23800i = token;
        this.f23801j = true;
        if (token.f23750a == TokenType.StartTag) {
            C6776f fVar = (C6776f) token;
            this.f23803l = fVar;
            if (fVar.f23759c) {
                this.f23804m = false;
            }
        } else if (token.f23750a == TokenType.EndTag && ((C6775e) token).f23760d.mo21254a() > 0) {
            m32805b("Attributes incorrectly present on end tag");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21386a(TokeniserState tokeniserState) {
        this.f23799h = tokeniserState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21387b() {
        this.f23804m = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21388b(TokeniserState tokeniserState) {
        this.f23796e.mo21360f();
        this.f23799h = tokeniserState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo21389c() {
        this.f23793b.mo21338m();
        mo21385a((Token) this.f23793b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo21390c(TokeniserState tokeniserState) {
        if (this.f23797f) {
            this.f23798g.add(new C6870b("Unexpected character in input", this.f23796e.mo21354c(), tokeniserState, this.f23796e.mo21346a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo21391d() {
        this.f23795d = new C6772b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo21392d(TokeniserState tokeniserState) {
        if (this.f23797f) {
            this.f23798g.add(new C6870b("Unexpectedly reached end of file (EOF)", tokeniserState, this.f23796e.mo21346a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo21393e() {
        mo21385a((Token) this.f23795d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21394f() {
        this.f23794c = new C6773c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21395g() {
        mo21385a((Token) this.f23794c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21396h() {
        this.f23792a = new StringBuilder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo21397i() {
        return this.f23793b.f23758b.equals(this.f23803l.f23758b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo21398j() {
        return this.f23803l.f23758b;
    }
}
