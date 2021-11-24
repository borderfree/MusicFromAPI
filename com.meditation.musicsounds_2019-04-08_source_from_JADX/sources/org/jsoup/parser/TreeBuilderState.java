package org.jsoup.parser;

import java.util.Iterator;
import org.jsoup.helper.C6758a;
import org.jsoup.nodes.C6765e;
import org.jsoup.nodes.C6766f;
import org.jsoup.nodes.C6767g;
import org.jsoup.nodes.Document.QuirksMode;

enum TreeBuilderState {
    Initial {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (TreeBuilderState.m32757a(token)) {
                return true;
            }
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                C6773c b = token.mo21310b();
                fVar.mo21432f().mo21276a((C6767g) new C6765e(b.mo21324l(), b.mo21325m(), b.mo21326n(), fVar.mo21435g()));
                if (b.mo21327o()) {
                    fVar.mo21432f().mo21225a(QuirksMode.quirks);
                }
                fVar.mo21408a(BeforeHtml);
            } else {
                fVar.mo21408a(BeforeHtml);
                return fVar.mo21412a(token);
            }
            return true;
        }
    },
    BeforeHtml {
        /* renamed from: a */
        private boolean m32767a(Token token, C6874f fVar) {
            fVar.mo21400a("html");
            fVar.mo21408a(BeforeHead);
            return fVar.mo21412a(token);
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            }
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (TreeBuilderState.m32757a(token)) {
                return true;
            } else {
                if (!token.mo21311c() || !token.mo21312d().mo21339n().equals("html")) {
                    if (token.mo21313e()) {
                        if (C6758a.m32600a(token.mo21314f().mo21339n(), "head", "body", "html", "br")) {
                            return m32767a(token, fVar);
                        }
                    }
                    if (!token.mo21313e()) {
                        return m32767a(token, fVar);
                    }
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                }
                fVar.mo21401a(token.mo21312d());
                fVar.mo21408a(BeforeHead);
            }
            return true;
        }
    },
    BeforeHead {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (TreeBuilderState.m32757a(token)) {
                return true;
            }
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else if (token.mo21311c() && token.mo21312d().mo21339n().equals("html")) {
                return InBody.process(token, fVar);
            } else {
                if (!token.mo21311c() || !token.mo21312d().mo21339n().equals("head")) {
                    if (token.mo21313e()) {
                        if (C6758a.m32600a(token.mo21314f().mo21339n(), "head", "body", "html", "br")) {
                            fVar.mo21412a((Token) new C6776f("head"));
                            return fVar.mo21412a(token);
                        }
                    }
                    if (token.mo21313e()) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                    fVar.mo21412a((Token) new C6776f("head"));
                    return fVar.mo21412a(token);
                }
                fVar.mo21436g(fVar.mo21401a(token.mo21312d()));
                fVar.mo21408a(InHead);
            }
            return true;
        }
    },
    InHead {
        /* renamed from: a */
        private boolean m32768a(Token token, C6874f fVar) {
            fVar.mo21412a((Token) new C6775e("head"));
            return fVar.mo21412a(token);
        }

        /* access modifiers changed from: 0000 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(org.jsoup.parser.Token r9, org.jsoup.parser.C6874f r10) {
            /*
                r8 = this;
                boolean r0 = org.jsoup.parser.TreeBuilderState.m32757a(r9)
                r1 = 1
                if (r0 == 0) goto L_0x000f
                org.jsoup.parser.Token$a r9 = r9.mo21318j()
                r10.mo21406a(r9)
                return r1
            L_0x000f:
                int[] r0 = org.jsoup.parser.TreeBuilderState.C686124.f23767a
                org.jsoup.parser.Token$TokenType r2 = r9.f23750a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                r2 = 3
                r3 = 2
                r4 = 0
                switch(r0) {
                    case 1: goto L_0x0112;
                    case 2: goto L_0x010e;
                    case 3: goto L_0x005b;
                    case 4: goto L_0x0024;
                    default: goto L_0x001f;
                }
            L_0x001f:
                boolean r9 = r8.m32768a(r9, r10)
                return r9
            L_0x0024:
                org.jsoup.parser.Token$e r0 = r9.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r5 = "head"
                boolean r5 = r0.equals(r5)
                if (r5 == 0) goto L_0x003e
                r10.mo21441i()
                org.jsoup.parser.TreeBuilderState r9 = AfterHead
            L_0x0039:
                r10.mo21408a(r9)
                goto L_0x0119
            L_0x003e:
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.String r5 = "body"
                r2[r4] = r5
                java.lang.String r5 = "html"
                r2[r1] = r5
                java.lang.String r1 = "br"
                r2[r3] = r1
                boolean r0 = org.jsoup.helper.C6758a.m32600a(r0, r2)
                if (r0 == 0) goto L_0x0057
                boolean r9 = r8.m32768a(r9, r10)
                return r9
            L_0x0057:
                r10.mo21419b(r8)
                return r4
            L_0x005b:
                org.jsoup.parser.Token$f r0 = r9.mo21312d()
                java.lang.String r5 = r0.mo21339n()
                java.lang.String r6 = "html"
                boolean r6 = r5.equals(r6)
                if (r6 == 0) goto L_0x0072
                org.jsoup.parser.TreeBuilderState r0 = InBody
                boolean r9 = r0.process(r9, r10)
                return r9
            L_0x0072:
                r6 = 5
                java.lang.String[] r6 = new java.lang.String[r6]
                java.lang.String r7 = "base"
                r6[r4] = r7
                java.lang.String r7 = "basefont"
                r6[r1] = r7
                java.lang.String r7 = "bgsound"
                r6[r3] = r7
                java.lang.String r7 = "command"
                r6[r2] = r7
                r2 = 4
                java.lang.String r7 = "link"
                r6[r2] = r7
                boolean r2 = org.jsoup.helper.C6758a.m32600a(r5, r6)
                if (r2 == 0) goto L_0x00a9
                org.jsoup.nodes.f r9 = r10.mo21415b(r0)
                java.lang.String r0 = "base"
                boolean r0 = r5.equals(r0)
                if (r0 == 0) goto L_0x0119
                java.lang.String r0 = "href"
                boolean r0 = r9.mo21297c(r0)
                if (r0 == 0) goto L_0x0119
                r10.mo21403a(r9)
                goto L_0x0119
            L_0x00a9:
                java.lang.String r2 = "meta"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x00b5
                r10.mo21415b(r0)
                goto L_0x0119
            L_0x00b5:
                java.lang.String r2 = "title"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x00c1
                org.jsoup.parser.TreeBuilderState.m32756a(r0, r10)
                goto L_0x0119
            L_0x00c1:
                java.lang.String[] r2 = new java.lang.String[r3]
                java.lang.String r3 = "noframes"
                r2[r4] = r3
                java.lang.String r3 = "style"
                r2[r1] = r3
                boolean r2 = org.jsoup.helper.C6758a.m32600a(r5, r2)
                if (r2 == 0) goto L_0x00d5
                org.jsoup.parser.TreeBuilderState.m32758b(r0, r10)
                goto L_0x0119
            L_0x00d5:
                java.lang.String r2 = "noscript"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x00e4
                r10.mo21401a(r0)
                org.jsoup.parser.TreeBuilderState r9 = InHeadNoscript
                goto L_0x0039
            L_0x00e4:
                java.lang.String r2 = "script"
                boolean r2 = r5.equals(r2)
                if (r2 == 0) goto L_0x00fd
                r10.mo21401a(r0)
                org.jsoup.parser.e r9 = r10.f23807b
                org.jsoup.parser.TokeniserState r0 = org.jsoup.parser.TokeniserState.ScriptData
                r9.mo21386a(r0)
                r10.mo21416b()
                org.jsoup.parser.TreeBuilderState r9 = Text
                goto L_0x0039
            L_0x00fd:
                java.lang.String r0 = "head"
                boolean r0 = r5.equals(r0)
                if (r0 == 0) goto L_0x0109
                r10.mo21419b(r8)
                return r4
            L_0x0109:
                boolean r9 = r8.m32768a(r9, r10)
                return r9
            L_0x010e:
                r10.mo21419b(r8)
                return r4
            L_0x0112:
                org.jsoup.parser.Token$b r9 = r9.mo21316h()
                r10.mo21407a(r9)
            L_0x0119:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TreeBuilderState.C68634.process(org.jsoup.parser.Token, org.jsoup.parser.f):boolean");
        }
    },
    InHeadNoscript {
        /* renamed from: a */
        private boolean m32769a(Token token, C6874f fVar) {
            fVar.mo21419b((TreeBuilderState) this);
            fVar.mo21412a((Token) new C6775e("noscript"));
            return fVar.mo21412a(token);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
            if (org.jsoup.helper.C6758a.m32600a(r8.mo21312d().mo21339n(), "basefont", "bgsound", "link", "meta", "noframes", "style") != false) goto L_0x00d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
            if (org.jsoup.helper.C6758a.m32600a(r8.mo21312d().mo21339n(), "head", "noscript") == false) goto L_0x00c1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(org.jsoup.parser.Token r8, org.jsoup.parser.C6874f r9) {
            /*
                r7 = this;
                boolean r0 = r8.mo21309a()
                r1 = 1
                if (r0 == 0) goto L_0x000b
                r9.mo21419b(r7)
                goto L_0x0046
            L_0x000b:
                boolean r0 = r8.mo21311c()
                if (r0 == 0) goto L_0x0028
                org.jsoup.parser.Token$f r0 = r8.mo21312d()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r2 = "html"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0028
                org.jsoup.parser.TreeBuilderState r0 = InBody
            L_0x0023:
                boolean r8 = r9.mo21413a(r8, r0)
                return r8
            L_0x0028:
                boolean r0 = r8.mo21313e()
                if (r0 == 0) goto L_0x0047
                org.jsoup.parser.Token$e r0 = r8.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r2 = "noscript"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0047
                r9.mo21441i()
                org.jsoup.parser.TreeBuilderState r8 = InHead
                r9.mo21408a(r8)
            L_0x0046:
                return r1
            L_0x0047:
                boolean r0 = org.jsoup.parser.TreeBuilderState.m32757a(r8)
                if (r0 != 0) goto L_0x00d0
                boolean r0 = r8.mo21315g()
                if (r0 != 0) goto L_0x00d0
                boolean r0 = r8.mo21311c()
                r2 = 2
                r3 = 0
                if (r0 == 0) goto L_0x0088
                org.jsoup.parser.Token$f r0 = r8.mo21312d()
                java.lang.String r0 = r0.mo21339n()
                r4 = 6
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.String r5 = "basefont"
                r4[r3] = r5
                java.lang.String r5 = "bgsound"
                r4[r1] = r5
                java.lang.String r5 = "link"
                r4[r2] = r5
                r5 = 3
                java.lang.String r6 = "meta"
                r4[r5] = r6
                r5 = 4
                java.lang.String r6 = "noframes"
                r4[r5] = r6
                r5 = 5
                java.lang.String r6 = "style"
                r4[r5] = r6
                boolean r0 = org.jsoup.helper.C6758a.m32600a(r0, r4)
                if (r0 == 0) goto L_0x0088
                goto L_0x00d0
            L_0x0088:
                boolean r0 = r8.mo21313e()
                if (r0 == 0) goto L_0x00a3
                org.jsoup.parser.Token$e r0 = r8.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r4 = "br"
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x00a3
                boolean r8 = r7.m32769a(r8, r9)
                return r8
            L_0x00a3:
                boolean r0 = r8.mo21311c()
                if (r0 == 0) goto L_0x00c1
                org.jsoup.parser.Token$f r0 = r8.mo21312d()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.String r4 = "head"
                r2[r3] = r4
                java.lang.String r4 = "noscript"
                r2[r1] = r4
                boolean r0 = org.jsoup.helper.C6758a.m32600a(r0, r2)
                if (r0 != 0) goto L_0x00c7
            L_0x00c1:
                boolean r0 = r8.mo21313e()
                if (r0 == 0) goto L_0x00cb
            L_0x00c7:
                r9.mo21419b(r7)
                return r3
            L_0x00cb:
                boolean r8 = r7.m32769a(r8, r9)
                return r8
            L_0x00d0:
                org.jsoup.parser.TreeBuilderState r0 = InHead
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TreeBuilderState.C68645.process(org.jsoup.parser.Token, org.jsoup.parser.f):boolean");
        }
    },
    AfterHead {
        /* renamed from: a */
        private boolean m32770a(Token token, C6874f fVar) {
            fVar.mo21412a((Token) new C6776f("body"));
            fVar.mo21409a(true);
            return fVar.mo21412a(token);
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            TreeBuilderState treeBuilderState;
            if (TreeBuilderState.m32757a(token)) {
                fVar.mo21406a(token.mo21318j());
            } else if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
            } else {
                if (token.mo21311c()) {
                    C6776f d = token.mo21312d();
                    String n = d.mo21339n();
                    if (n.equals("html")) {
                        return fVar.mo21413a(token, InBody);
                    }
                    if (n.equals("body")) {
                        fVar.mo21401a(d);
                        fVar.mo21409a(false);
                        treeBuilderState = InBody;
                    } else if (n.equals("frameset")) {
                        fVar.mo21401a(d);
                        treeBuilderState = InFrameset;
                    } else {
                        if (C6758a.m32600a(n, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                            fVar.mo21419b((TreeBuilderState) this);
                            C6766f o = fVar.mo21454o();
                            fVar.mo21424c(o);
                            fVar.mo21413a(token, InHead);
                            fVar.mo21431e(o);
                        } else if (n.equals("head")) {
                            fVar.mo21419b((TreeBuilderState) this);
                            return false;
                        }
                    }
                    fVar.mo21408a(treeBuilderState);
                } else if (token.mo21313e()) {
                    if (!C6758a.m32600a(token.mo21314f().mo21339n(), "body", "html")) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                }
                m32770a(token, fVar);
            }
            return true;
        }
    },
    InBody {
        /* access modifiers changed from: 0000 */
        public boolean anyOtherEndTag(Token token, C6874f fVar) {
            C6766f fVar2;
            String n = token.mo21314f().mo21339n();
            Iterator descendingIterator = fVar.mo21444j().descendingIterator();
            do {
                if (descendingIterator.hasNext()) {
                    fVar2 = (C6766f) descendingIterator.next();
                    if (fVar2.mo21224a().equals(n)) {
                        fVar.mo21445j(n);
                        if (!n.equals(fVar.mo21429e().mo21224a())) {
                            fVar.mo21419b((TreeBuilderState) this);
                        }
                        fVar.mo21423c(n);
                    }
                }
                return true;
            } while (!fVar.mo21443i(fVar2));
            fVar.mo21419b((TreeBuilderState) this);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
            r2.mo21409a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
            r2.mo21408a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:317:0x0933, code lost:
            if (r2.mo21415b(r3).mo21294b("type").equalsIgnoreCase("hidden") == false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x012c, code lost:
            if (r27.mo21429e().mo21224a().equals(r7) == false) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:403:0x0bb1, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0199, code lost:
            if (r27.mo21429e().mo21224a().equals(r7) == false) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bd, code lost:
            if (r27.mo21429e().mo21224a().equals(r7) == false) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ea, code lost:
            if (r27.mo21429e().mo21224a().equals(r7) == false) goto L_0x012e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x039a  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x03a7  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x03da A[LOOP:3: B:143:0x03d8->B:144:0x03da, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(org.jsoup.parser.Token r26, org.jsoup.parser.C6874f r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                int[] r3 = org.jsoup.parser.TreeBuilderState.C686124.f23767a
                org.jsoup.parser.Token$TokenType r4 = r1.f23750a
                int r4 = r4.ordinal()
                r3 = r3[r4]
                r8 = 9
                r9 = 7
                r11 = 8
                r12 = 6
                r13 = 5
                r14 = 4
                r15 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                switch(r3) {
                    case 1: goto L_0x0baa;
                    case 2: goto L_0x0ba6;
                    case 3: goto L_0x0454;
                    case 4: goto L_0x0050;
                    case 5: goto L_0x0021;
                    default: goto L_0x001f;
                }
            L_0x001f:
                goto L_0x0bb1
            L_0x0021:
                org.jsoup.parser.Token$a r1 = r26.mo21318j()
                java.lang.String r3 = r1.mo21320l()
                java.lang.String r4 = org.jsoup.parser.TreeBuilderState.f23765a
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0037
                r2.mo21419b(r0)
                return r6
            L_0x0037:
                boolean r3 = org.jsoup.parser.TreeBuilderState.m32757a(r1)
                if (r3 == 0) goto L_0x0045
                r27.mo21461u()
                r2.mo21406a(r1)
                goto L_0x0bb1
            L_0x0045:
                r27.mo21461u()
                r2.mo21406a(r1)
            L_0x004b:
                r2.mo21409a(r6)
                goto L_0x0bb1
            L_0x0050:
                org.jsoup.parser.Token$e r3 = r26.mo21314f()
                java.lang.String r7 = r3.mo21339n()
                java.lang.String r10 = "body"
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x0073
                java.lang.String r1 = "body"
                boolean r1 = r2.mo21430e(r1)
                if (r1 != 0) goto L_0x006c
                r2.mo21419b(r0)
                return r6
            L_0x006c:
                org.jsoup.parser.TreeBuilderState r1 = AfterBody
            L_0x006e:
                r2.mo21408a(r1)
                goto L_0x0bb1
            L_0x0073:
                java.lang.String r10 = "html"
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x008d
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "body"
                r1.<init>(r4)
                boolean r1 = r2.mo21412a(r1)
                if (r1 == 0) goto L_0x0bb1
                boolean r1 = r2.mo21412a(r3)
                return r1
            L_0x008d:
                r10 = 24
                java.lang.String[] r10 = new java.lang.String[r10]
                java.lang.String r21 = "address"
                r10[r6] = r21
                java.lang.String r21 = "article"
                r10[r5] = r21
                java.lang.String r21 = "aside"
                r10[r4] = r21
                java.lang.String r21 = "blockquote"
                r10[r15] = r21
                java.lang.String r21 = "button"
                r10[r14] = r21
                java.lang.String r21 = "center"
                r10[r13] = r21
                java.lang.String r21 = "details"
                r10[r12] = r21
                java.lang.String r21 = "dir"
                r10[r9] = r21
                java.lang.String r21 = "div"
                r10[r11] = r21
                java.lang.String r21 = "dl"
                r10[r8] = r21
                java.lang.String r21 = "fieldset"
                r20 = 10
                r10[r20] = r21
                java.lang.String r21 = "figcaption"
                r19 = 11
                r10[r19] = r21
                java.lang.String r21 = "figure"
                r18 = 12
                r10[r18] = r21
                java.lang.String r21 = "footer"
                r17 = 13
                r10[r17] = r21
                java.lang.String r21 = "header"
                r16 = 14
                r10[r16] = r21
                r21 = 15
                java.lang.String r22 = "hgroup"
                r10[r21] = r22
                r21 = 16
                java.lang.String r22 = "listing"
                r10[r21] = r22
                r21 = 17
                java.lang.String r22 = "menu"
                r10[r21] = r22
                r21 = 18
                java.lang.String r22 = "nav"
                r10[r21] = r22
                r21 = 19
                java.lang.String r22 = "ol"
                r10[r21] = r22
                r21 = 20
                java.lang.String r22 = "pre"
                r10[r21] = r22
                r21 = 21
                java.lang.String r22 = "section"
                r10[r21] = r22
                r21 = 22
                java.lang.String r22 = "summary"
                r10[r21] = r22
                r21 = 23
                java.lang.String r22 = "ul"
                r10[r21] = r22
                boolean r10 = org.jsoup.helper.C6758a.m32600a(r7, r10)
                if (r10 == 0) goto L_0x0136
                boolean r1 = r2.mo21430e(r7)
                if (r1 != 0) goto L_0x011d
                r2.mo21419b(r0)
                return r6
            L_0x011d:
                r27.mo21459t()
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0131
            L_0x012e:
                r2.mo21419b(r0)
            L_0x0131:
                r2.mo21423c(r7)
                goto L_0x0bb1
            L_0x0136:
                java.lang.String r10 = "form"
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x016c
                org.jsoup.nodes.f r1 = r27.mo21456q()
                r3 = 0
                r2.mo21438h(r3)
                if (r1 == 0) goto L_0x0168
                boolean r3 = r2.mo21430e(r7)
                if (r3 != 0) goto L_0x014f
                goto L_0x0168
            L_0x014f:
                r27.mo21459t()
                org.jsoup.nodes.f r3 = r27.mo21429e()
                java.lang.String r3 = r3.mo21224a()
                boolean r3 = r3.equals(r7)
                if (r3 != 0) goto L_0x0163
                r2.mo21419b(r0)
            L_0x0163:
                r2.mo21431e(r1)
                goto L_0x0bb1
            L_0x0168:
                r2.mo21419b(r0)
                return r6
            L_0x016c:
                java.lang.String r10 = "p"
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x019c
                boolean r1 = r2.mo21437g(r7)
                if (r1 != 0) goto L_0x018a
                r2.mo21419b(r0)
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                r1.<init>(r7)
                r2.mo21412a(r1)
                boolean r1 = r2.mo21412a(r3)
                return r1
            L_0x018a:
                r2.mo21445j(r7)
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0131
                goto L_0x012e
            L_0x019c:
                java.lang.String r3 = "li"
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L_0x01c1
                boolean r1 = r2.mo21434f(r7)
                if (r1 != 0) goto L_0x01ae
                r2.mo21419b(r0)
                return r6
            L_0x01ae:
                r2.mo21445j(r7)
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0131
                goto L_0x012e
            L_0x01c1:
                java.lang.String[] r3 = new java.lang.String[r4]
                java.lang.String r10 = "dd"
                r3[r6] = r10
                java.lang.String r10 = "dt"
                r3[r5] = r10
                boolean r3 = org.jsoup.helper.C6758a.m32600a(r7, r3)
                if (r3 == 0) goto L_0x01ee
                boolean r1 = r2.mo21430e(r7)
                if (r1 != 0) goto L_0x01db
                r2.mo21419b(r0)
                return r6
            L_0x01db:
                r2.mo21445j(r7)
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0131
                goto L_0x012e
            L_0x01ee:
                java.lang.String[] r3 = new java.lang.String[r12]
                java.lang.String r10 = "h1"
                r3[r6] = r10
                java.lang.String r10 = "h2"
                r3[r5] = r10
                java.lang.String r10 = "h3"
                r3[r4] = r10
                java.lang.String r10 = "h4"
                r3[r15] = r10
                java.lang.String r10 = "h5"
                r3[r14] = r10
                java.lang.String r10 = "h6"
                r3[r13] = r10
                boolean r3 = org.jsoup.helper.C6758a.m32600a(r7, r3)
                if (r3 == 0) goto L_0x0265
                java.lang.String[] r1 = new java.lang.String[r12]
                java.lang.String r3 = "h1"
                r1[r6] = r3
                java.lang.String r3 = "h2"
                r1[r5] = r3
                java.lang.String r3 = "h3"
                r1[r4] = r3
                java.lang.String r3 = "h4"
                r1[r15] = r3
                java.lang.String r3 = "h5"
                r1[r14] = r3
                java.lang.String r3 = "h6"
                r1[r13] = r3
                boolean r1 = r2.mo21421b(r1)
                if (r1 != 0) goto L_0x0232
                r2.mo21419b(r0)
                return r6
            L_0x0232:
                r2.mo21445j(r7)
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0246
                r2.mo21419b(r0)
            L_0x0246:
                java.lang.String[] r1 = new java.lang.String[r12]
                java.lang.String r3 = "h1"
                r1[r6] = r3
                java.lang.String r3 = "h2"
                r1[r5] = r3
                java.lang.String r3 = "h3"
                r1[r4] = r3
                java.lang.String r3 = "h4"
                r1[r15] = r3
                java.lang.String r3 = "h5"
                r1[r14] = r3
                java.lang.String r3 = "h6"
                r1[r13] = r3
                r2.mo21410a(r1)
                goto L_0x0bb1
            L_0x0265:
                java.lang.String r3 = "sarcasm"
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L_0x0272
                boolean r1 = r25.anyOtherEndTag(r26, r27)
                return r1
            L_0x0272:
                r3 = 14
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.String r10 = "a"
                r3[r6] = r10
                java.lang.String r10 = "b"
                r3[r5] = r10
                java.lang.String r10 = "big"
                r3[r4] = r10
                java.lang.String r10 = "code"
                r3[r15] = r10
                java.lang.String r10 = "em"
                r3[r14] = r10
                java.lang.String r10 = "font"
                r3[r13] = r10
                java.lang.String r10 = "i"
                r3[r12] = r10
                java.lang.String r10 = "nobr"
                r3[r9] = r10
                java.lang.String r9 = "s"
                r3[r11] = r9
                java.lang.String r9 = "small"
                r3[r8] = r9
                java.lang.String r8 = "strike"
                r9 = 10
                r3[r9] = r8
                java.lang.String r8 = "strong"
                r9 = 11
                r3[r9] = r8
                java.lang.String r8 = "tt"
                r9 = 12
                r3[r9] = r8
                java.lang.String r8 = "u"
                r9 = 13
                r3[r9] = r8
                boolean r3 = org.jsoup.helper.C6758a.m32600a(r7, r3)
                if (r3 == 0) goto L_0x03f6
                r3 = 0
            L_0x02bd:
                if (r3 >= r11) goto L_0x0bb1
                org.jsoup.nodes.f r8 = r2.mo21447k(r7)
                if (r8 != 0) goto L_0x02ca
                boolean r1 = r25.anyOtherEndTag(r26, r27)
                return r1
            L_0x02ca:
                boolean r9 = r2.mo21428d(r8)
                if (r9 != 0) goto L_0x02d7
                r2.mo21419b(r0)
            L_0x02d3:
                r2.mo21449k(r8)
                return r5
            L_0x02d7:
                java.lang.String r9 = r8.mo21224a()
                boolean r9 = r2.mo21430e(r9)
                if (r9 != 0) goto L_0x02e5
                r2.mo21419b(r0)
                return r6
            L_0x02e5:
                org.jsoup.nodes.f r9 = r27.mo21429e()
                if (r9 == r8) goto L_0x02ee
                r2.mo21419b(r0)
            L_0x02ee:
                r10 = 0
                org.jsoup.helper.DescendableLinkedList r12 = r27.mo21444j()
                r23 = r10
                r10 = 0
                r16 = 0
            L_0x02f8:
                int r9 = r12.size()
                if (r10 >= r9) goto L_0x031f
                java.lang.Object r9 = r12.get(r10)
                org.jsoup.nodes.f r9 = (org.jsoup.nodes.C6766f) r9
                if (r9 != r8) goto L_0x0313
                int r9 = r10 + -1
                java.lang.Object r9 = r12.get(r9)
                org.jsoup.nodes.f r9 = (org.jsoup.nodes.C6766f) r9
                r23 = r9
                r16 = 1
                goto L_0x031c
            L_0x0313:
                if (r16 == 0) goto L_0x031c
                boolean r17 = r2.mo21443i(r9)
                if (r17 == 0) goto L_0x031c
                goto L_0x0320
            L_0x031c:
                int r10 = r10 + 1
                goto L_0x02f8
            L_0x031f:
                r9 = 0
            L_0x0320:
                if (r9 != 0) goto L_0x032a
                java.lang.String r1 = r8.mo21224a()
                r2.mo21423c(r1)
                goto L_0x02d3
            L_0x032a:
                r12 = r9
                r24 = r12
                r10 = 0
            L_0x032e:
                if (r10 >= r15) goto L_0x0376
                boolean r16 = r2.mo21428d(r12)
                if (r16 == 0) goto L_0x033a
                org.jsoup.nodes.f r12 = r2.mo21433f(r12)
            L_0x033a:
                boolean r16 = r2.mo21451l(r12)
                if (r16 != 0) goto L_0x0344
                r2.mo21431e(r12)
                goto L_0x036f
            L_0x0344:
                if (r12 != r8) goto L_0x0347
                goto L_0x0376
            L_0x0347:
                org.jsoup.nodes.f r11 = new org.jsoup.nodes.f
                java.lang.String r16 = r12.mo21224a()
                org.jsoup.parser.d r14 = org.jsoup.parser.C6872d.m32796a(r16)
                java.lang.String r15 = r27.mo21435g()
                r11.<init>(r14, r15)
                r2.mo21425c(r12, r11)
                r2.mo21418b(r12, r11)
                org.jsoup.nodes.f r12 = r24.mo21289o()
                if (r12 == 0) goto L_0x0367
                r24.mo21306s()
            L_0x0367:
                r12 = r24
                r11.mo21276a(r12)
                r12 = r11
                r24 = r12
            L_0x036f:
                int r10 = r10 + 1
                r11 = 8
                r14 = 4
                r15 = 3
                goto L_0x032e
            L_0x0376:
                r12 = r24
                java.lang.String r10 = r23.mo21224a()
                java.lang.String[] r11 = new java.lang.String[r13]
                java.lang.String r14 = "table"
                r11[r6] = r14
                java.lang.String r14 = "tbody"
                r11[r5] = r14
                java.lang.String r14 = "tfoot"
                r11[r4] = r14
                java.lang.String r14 = "thead"
                r15 = 3
                r11[r15] = r14
                java.lang.String r14 = "tr"
                r15 = 4
                r11[r15] = r14
                boolean r10 = org.jsoup.helper.C6758a.m32600a(r10, r11)
                if (r10 == 0) goto L_0x03a7
                org.jsoup.nodes.f r10 = r12.mo21289o()
                if (r10 == 0) goto L_0x03a3
                r12.mo21306s()
            L_0x03a3:
                r2.mo21405a(r12)
                goto L_0x03b5
            L_0x03a7:
                org.jsoup.nodes.f r10 = r12.mo21289o()
                if (r10 == 0) goto L_0x03b0
                r12.mo21306s()
            L_0x03b0:
                r10 = r23
                r10.mo21276a(r12)
            L_0x03b5:
                org.jsoup.nodes.f r10 = new org.jsoup.nodes.f
                org.jsoup.parser.d r11 = org.jsoup.parser.C6872d.m32796a(r7)
                java.lang.String r12 = r27.mo21435g()
                r10.<init>(r11, r12)
                java.util.List r11 = r9.mo21304q()
                java.util.List r12 = r9.mo21304q()
                int r12 = r12.size()
                org.jsoup.nodes.g[] r12 = new org.jsoup.nodes.C6767g[r12]
                java.lang.Object[] r11 = r11.toArray(r12)
                org.jsoup.nodes.g[] r11 = (org.jsoup.nodes.C6767g[]) r11
                int r12 = r11.length
                r14 = 0
            L_0x03d8:
                if (r14 >= r12) goto L_0x03e2
                r15 = r11[r14]
                r10.mo21276a(r15)
                int r14 = r14 + 1
                goto L_0x03d8
            L_0x03e2:
                r9.mo21276a(r10)
                r2.mo21449k(r8)
                r2.mo21431e(r8)
                r2.mo21404a(r9, r10)
                int r3 = r3 + 1
                r11 = 8
                r14 = 4
                r15 = 3
                goto L_0x02bd
            L_0x03f6:
                r3 = 3
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.String r8 = "applet"
                r3[r6] = r8
                java.lang.String r8 = "marquee"
                r3[r5] = r8
                java.lang.String r8 = "object"
                r3[r4] = r8
                boolean r3 = org.jsoup.helper.C6758a.m32600a(r7, r3)
                if (r3 == 0) goto L_0x0439
                java.lang.String r1 = "name"
                boolean r1 = r2.mo21430e(r1)
                if (r1 != 0) goto L_0x0bb1
                boolean r1 = r2.mo21430e(r7)
                if (r1 != 0) goto L_0x041d
                r2.mo21419b(r0)
                return r6
            L_0x041d:
                r27.mo21459t()
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                boolean r1 = r1.equals(r7)
                if (r1 != 0) goto L_0x0431
                r2.mo21419b(r0)
            L_0x0431:
                r2.mo21423c(r7)
                r27.mo21462v()
                goto L_0x0bb1
            L_0x0439:
                java.lang.String r3 = "br"
                boolean r3 = r7.equals(r3)
                if (r3 == 0) goto L_0x044f
                r2.mo21419b(r0)
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                java.lang.String r3 = "br"
                r1.<init>(r3)
                r2.mo21412a(r1)
                return r6
            L_0x044f:
                boolean r1 = r25.anyOtherEndTag(r26, r27)
                return r1
            L_0x0454:
                org.jsoup.parser.Token$f r3 = r26.mo21312d()
                java.lang.String r7 = r3.mo21339n()
                java.lang.String r10 = "html"
                boolean r10 = r7.equals(r10)
                if (r10 == 0) goto L_0x0497
                r2.mo21419b(r0)
                org.jsoup.helper.DescendableLinkedList r1 = r27.mo21444j()
                java.lang.Object r1 = r1.getFirst()
                org.jsoup.nodes.f r1 = (org.jsoup.nodes.C6766f) r1
                org.jsoup.nodes.b r2 = r3.mo21341p()
                java.util.Iterator r2 = r2.iterator()
            L_0x0479:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0bb1
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.a r3 = (org.jsoup.nodes.C6761a) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.mo21297c(r4)
                if (r4 != 0) goto L_0x0479
                org.jsoup.nodes.b r4 = r1.mo21303p()
                r4.mo21258a(r3)
                goto L_0x0479
            L_0x0497:
                r10 = 10
                java.lang.String[] r11 = new java.lang.String[r10]
                java.lang.String r10 = "base"
                r11[r6] = r10
                java.lang.String r10 = "basefont"
                r11[r5] = r10
                java.lang.String r10 = "bgsound"
                r11[r4] = r10
                java.lang.String r10 = "command"
                r14 = 3
                r11[r14] = r10
                java.lang.String r10 = "link"
                r14 = 4
                r11[r14] = r10
                java.lang.String r10 = "meta"
                r11[r13] = r10
                java.lang.String r10 = "noframes"
                r11[r12] = r10
                java.lang.String r10 = "script"
                r11[r9] = r10
                java.lang.String r10 = "style"
                r14 = 8
                r11[r14] = r10
                java.lang.String r10 = "title"
                r11[r8] = r10
                boolean r10 = org.jsoup.helper.C6758a.m32600a(r7, r11)
                if (r10 == 0) goto L_0x04d4
                org.jsoup.parser.TreeBuilderState r3 = InHead
                boolean r1 = r2.mo21413a(r1, r3)
                return r1
            L_0x04d4:
                java.lang.String r1 = "body"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0532
                r2.mo21419b(r0)
                org.jsoup.helper.DescendableLinkedList r1 = r27.mo21444j()
                int r7 = r1.size()
                if (r7 == r5) goto L_0x0531
                int r7 = r1.size()
                if (r7 <= r4) goto L_0x0502
                java.lang.Object r4 = r1.get(r5)
                org.jsoup.nodes.f r4 = (org.jsoup.nodes.C6766f) r4
                java.lang.String r4 = r4.mo21224a()
                java.lang.String r7 = "body"
                boolean r4 = r4.equals(r7)
                if (r4 != 0) goto L_0x0502
                goto L_0x0531
            L_0x0502:
                r2.mo21409a(r6)
                java.lang.Object r1 = r1.get(r5)
                org.jsoup.nodes.f r1 = (org.jsoup.nodes.C6766f) r1
                org.jsoup.nodes.b r2 = r3.mo21341p()
                java.util.Iterator r2 = r2.iterator()
            L_0x0513:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0bb1
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.a r3 = (org.jsoup.nodes.C6761a) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.mo21297c(r4)
                if (r4 != 0) goto L_0x0513
                org.jsoup.nodes.b r4 = r1.mo21303p()
                r4.mo21258a(r3)
                goto L_0x0513
            L_0x0531:
                return r6
            L_0x0532:
                java.lang.String r1 = "frameset"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0588
                r2.mo21419b(r0)
                org.jsoup.helper.DescendableLinkedList r1 = r27.mo21444j()
                int r7 = r1.size()
                if (r7 == r5) goto L_0x0587
                int r7 = r1.size()
                if (r7 <= r4) goto L_0x0560
                java.lang.Object r4 = r1.get(r5)
                org.jsoup.nodes.f r4 = (org.jsoup.nodes.C6766f) r4
                java.lang.String r4 = r4.mo21224a()
                java.lang.String r7 = "body"
                boolean r4 = r4.equals(r7)
                if (r4 != 0) goto L_0x0560
                goto L_0x0587
            L_0x0560:
                boolean r4 = r27.mo21427d()
                if (r4 != 0) goto L_0x0567
                return r6
            L_0x0567:
                java.lang.Object r4 = r1.get(r5)
                org.jsoup.nodes.f r4 = (org.jsoup.nodes.C6766f) r4
                org.jsoup.nodes.f r6 = r4.mo21289o()
                if (r6 == 0) goto L_0x0576
                r4.mo21306s()
            L_0x0576:
                int r4 = r1.size()
                if (r4 <= r5) goto L_0x0580
                r1.removeLast()
                goto L_0x0576
            L_0x0580:
                r2.mo21401a(r3)
                org.jsoup.parser.TreeBuilderState r1 = InFrameset
                goto L_0x006e
            L_0x0587:
                return r6
            L_0x0588:
                r1 = 22
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.String r10 = "address"
                r1[r6] = r10
                java.lang.String r10 = "article"
                r1[r5] = r10
                java.lang.String r10 = "aside"
                r1[r4] = r10
                java.lang.String r10 = "blockquote"
                r11 = 3
                r1[r11] = r10
                java.lang.String r10 = "center"
                r11 = 4
                r1[r11] = r10
                java.lang.String r10 = "details"
                r1[r13] = r10
                java.lang.String r10 = "dir"
                r1[r12] = r10
                java.lang.String r10 = "div"
                r1[r9] = r10
                java.lang.String r10 = "dl"
                r11 = 8
                r1[r11] = r10
                java.lang.String r10 = "fieldset"
                r1[r8] = r10
                java.lang.String r10 = "figcaption"
                r11 = 10
                r1[r11] = r10
                java.lang.String r10 = "figure"
                r11 = 11
                r1[r11] = r10
                java.lang.String r10 = "footer"
                r11 = 12
                r1[r11] = r10
                java.lang.String r10 = "header"
                r11 = 13
                r1[r11] = r10
                java.lang.String r10 = "hgroup"
                r11 = 14
                r1[r11] = r10
                r10 = 15
                java.lang.String r11 = "menu"
                r1[r10] = r11
                r10 = 16
                java.lang.String r11 = "nav"
                r1[r10] = r11
                r10 = 17
                java.lang.String r11 = "ol"
                r1[r10] = r11
                r10 = 18
                java.lang.String r11 = "p"
                r1[r10] = r11
                r10 = 19
                java.lang.String r11 = "section"
                r1[r10] = r11
                r10 = 20
                java.lang.String r11 = "summary"
                r1[r10] = r11
                r10 = 21
                java.lang.String r11 = "ul"
                r1[r10] = r11
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x061d
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0618
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
            L_0x0615:
                r2.mo21412a(r1)
            L_0x0618:
                r2.mo21401a(r3)
                goto L_0x0bb1
            L_0x061d:
                java.lang.String[] r1 = new java.lang.String[r12]
                java.lang.String r10 = "h1"
                r1[r6] = r10
                java.lang.String r10 = "h2"
                r1[r5] = r10
                java.lang.String r10 = "h3"
                r1[r4] = r10
                java.lang.String r10 = "h4"
                r11 = 3
                r1[r11] = r10
                java.lang.String r10 = "h5"
                r11 = 4
                r1[r11] = r10
                java.lang.String r10 = "h6"
                r1[r13] = r10
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x0682
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0651
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r7 = "p"
                r1.<init>(r7)
                r2.mo21412a(r1)
            L_0x0651:
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                java.lang.String[] r7 = new java.lang.String[r12]
                java.lang.String r8 = "h1"
                r7[r6] = r8
                java.lang.String r6 = "h2"
                r7[r5] = r6
                java.lang.String r6 = "h3"
                r7[r4] = r6
                java.lang.String r4 = "h4"
                r6 = 3
                r7[r6] = r4
                java.lang.String r4 = "h5"
                r6 = 4
                r7[r6] = r4
                java.lang.String r4 = "h6"
                r7[r13] = r4
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r1, r7)
                if (r1 == 0) goto L_0x0618
                r2.mo21419b(r0)
                r27.mo21441i()
                goto L_0x0618
            L_0x0682:
                java.lang.String[] r1 = new java.lang.String[r4]
                java.lang.String r10 = "pre"
                r1[r6] = r10
                java.lang.String r10 = "listing"
                r1[r5] = r10
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x06a9
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x06a4
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x06a4:
                r2.mo21401a(r3)
                goto L_0x004b
            L_0x06a9:
                java.lang.String r1 = "form"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x06d6
                org.jsoup.nodes.f r1 = r27.mo21456q()
                if (r1 == 0) goto L_0x06bb
                r2.mo21419b(r0)
                return r6
            L_0x06bb:
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x06cd
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x06cd:
                org.jsoup.nodes.f r1 = r2.mo21401a(r3)
                r2.mo21438h(r1)
                goto L_0x0bb1
            L_0x06d6:
                java.lang.String r1 = "li"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x073d
                r2.mo21409a(r6)
                org.jsoup.helper.DescendableLinkedList r1 = r27.mo21444j()
                int r7 = r1.size()
                int r7 = r7 - r5
            L_0x06ea:
                if (r7 <= 0) goto L_0x072c
                java.lang.Object r8 = r1.get(r7)
                org.jsoup.nodes.f r8 = (org.jsoup.nodes.C6766f) r8
                java.lang.String r9 = r8.mo21224a()
                java.lang.String r10 = "li"
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x0709
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "li"
                r1.<init>(r4)
                r2.mo21412a(r1)
                goto L_0x072c
            L_0x0709:
                boolean r9 = r2.mo21443i(r8)
                if (r9 == 0) goto L_0x0729
                java.lang.String r8 = r8.mo21224a()
                r9 = 3
                java.lang.String[] r10 = new java.lang.String[r9]
                java.lang.String r9 = "address"
                r10[r6] = r9
                java.lang.String r9 = "div"
                r10[r5] = r9
                java.lang.String r9 = "p"
                r10[r4] = r9
                boolean r8 = org.jsoup.helper.C6758a.m32600a(r8, r10)
                if (r8 != 0) goto L_0x0729
                goto L_0x072c
            L_0x0729:
                int r7 = r7 + -1
                goto L_0x06ea
            L_0x072c:
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0618
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                goto L_0x0615
            L_0x073d:
                java.lang.String[] r1 = new java.lang.String[r4]
                java.lang.String r10 = "dd"
                r1[r6] = r10
                java.lang.String r10 = "dt"
                r1[r5] = r10
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x07b6
                r2.mo21409a(r6)
                org.jsoup.helper.DescendableLinkedList r1 = r27.mo21444j()
                int r7 = r1.size()
                int r7 = r7 - r5
            L_0x0759:
                if (r7 <= 0) goto L_0x07a5
                java.lang.Object r8 = r1.get(r7)
                org.jsoup.nodes.f r8 = (org.jsoup.nodes.C6766f) r8
                java.lang.String r9 = r8.mo21224a()
                java.lang.String[] r10 = new java.lang.String[r4]
                java.lang.String r11 = "dd"
                r10[r6] = r11
                java.lang.String r11 = "dt"
                r10[r5] = r11
                boolean r9 = org.jsoup.helper.C6758a.m32600a(r9, r10)
                if (r9 == 0) goto L_0x0782
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = r8.mo21224a()
                r1.<init>(r4)
                r2.mo21412a(r1)
                goto L_0x07a5
            L_0x0782:
                boolean r9 = r2.mo21443i(r8)
                if (r9 == 0) goto L_0x07a2
                java.lang.String r8 = r8.mo21224a()
                r9 = 3
                java.lang.String[] r10 = new java.lang.String[r9]
                java.lang.String r9 = "address"
                r10[r6] = r9
                java.lang.String r9 = "div"
                r10[r5] = r9
                java.lang.String r9 = "p"
                r10[r4] = r9
                boolean r8 = org.jsoup.helper.C6758a.m32600a(r8, r10)
                if (r8 != 0) goto L_0x07a2
                goto L_0x07a5
            L_0x07a2:
                int r7 = r7 + -1
                goto L_0x0759
            L_0x07a5:
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0618
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                goto L_0x0615
            L_0x07b6:
                java.lang.String r1 = "plaintext"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x07dc
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x07d0
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x07d0:
                r2.mo21401a(r3)
                org.jsoup.parser.e r1 = r2.f23807b
                org.jsoup.parser.TokeniserState r2 = org.jsoup.parser.TokeniserState.PLAINTEXT
                r1.mo21386a(r2)
                goto L_0x0bb1
            L_0x07dc:
                java.lang.String r1 = "button"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0803
                java.lang.String r1 = "button"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x07fe
                r2.mo21419b(r0)
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "button"
                r1.<init>(r4)
                r2.mo21412a(r1)
                r2.mo21412a(r3)
                goto L_0x0bb1
            L_0x07fe:
                r27.mo21461u()
                goto L_0x06a4
            L_0x0803:
                java.lang.String r1 = "a"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x083a
                java.lang.String r1 = "a"
                org.jsoup.nodes.f r1 = r2.mo21447k(r1)
                if (r1 == 0) goto L_0x082e
                r2.mo21419b(r0)
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "a"
                r1.<init>(r4)
                r2.mo21412a(r1)
                java.lang.String r1 = "a"
                org.jsoup.nodes.f r1 = r2.mo21414b(r1)
                if (r1 == 0) goto L_0x082e
                r2.mo21449k(r1)
                r2.mo21431e(r1)
            L_0x082e:
                r27.mo21461u()
            L_0x0831:
                org.jsoup.nodes.f r1 = r2.mo21401a(r3)
                r2.mo21446j(r1)
                goto L_0x0bb1
            L_0x083a:
                r1 = 12
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.String r10 = "b"
                r1[r6] = r10
                java.lang.String r10 = "big"
                r1[r5] = r10
                java.lang.String r10 = "code"
                r1[r4] = r10
                java.lang.String r10 = "em"
                r11 = 3
                r1[r11] = r10
                java.lang.String r10 = "font"
                r11 = 4
                r1[r11] = r10
                java.lang.String r10 = "i"
                r1[r13] = r10
                java.lang.String r10 = "s"
                r1[r12] = r10
                java.lang.String r10 = "small"
                r1[r9] = r10
                java.lang.String r10 = "strike"
                r11 = 8
                r1[r11] = r10
                java.lang.String r10 = "strong"
                r1[r8] = r10
                java.lang.String r10 = "tt"
                r11 = 10
                r1[r11] = r10
                java.lang.String r10 = "u"
                r11 = 11
                r1[r11] = r10
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x087d
                goto L_0x082e
            L_0x087d:
                java.lang.String r1 = "nobr"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x089e
                r27.mo21461u()
                java.lang.String r1 = "nobr"
                boolean r1 = r2.mo21430e(r1)
                if (r1 == 0) goto L_0x0831
                r2.mo21419b(r0)
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "nobr"
                r1.<init>(r4)
                r2.mo21412a(r1)
                goto L_0x082e
            L_0x089e:
                r1 = 3
                java.lang.String[] r10 = new java.lang.String[r1]
                java.lang.String r1 = "applet"
                r10[r6] = r1
                java.lang.String r1 = "marquee"
                r10[r5] = r1
                java.lang.String r1 = "object"
                r10[r4] = r1
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r10)
                if (r1 == 0) goto L_0x08be
                r27.mo21461u()
                r2.mo21401a(r3)
                r27.mo21463w()
                goto L_0x004b
            L_0x08be:
                java.lang.String r1 = "table"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x08ee
                org.jsoup.nodes.Document r1 = r27.mo21432f()
                org.jsoup.nodes.Document$QuirksMode r1 = r1.mo21229e()
                org.jsoup.nodes.Document$QuirksMode r4 = org.jsoup.nodes.Document.QuirksMode.quirks
                if (r1 == r4) goto L_0x08e4
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x08e4
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x08e4:
                r2.mo21401a(r3)
                r2.mo21409a(r6)
                org.jsoup.parser.TreeBuilderState r1 = InTable
                goto L_0x006e
            L_0x08ee:
                java.lang.String[] r1 = new java.lang.String[r12]
                java.lang.String r10 = "area"
                r1[r6] = r10
                java.lang.String r10 = "br"
                r1[r5] = r10
                java.lang.String r10 = "embed"
                r1[r4] = r10
                java.lang.String r10 = "img"
                r11 = 3
                r1[r11] = r10
                java.lang.String r10 = "keygen"
                r11 = 4
                r1[r11] = r10
                java.lang.String r10 = "wbr"
                r1[r13] = r10
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x0918
                r27.mo21461u()
            L_0x0913:
                r2.mo21415b(r3)
                goto L_0x004b
            L_0x0918:
                java.lang.String r1 = "input"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0937
                r27.mo21461u()
                org.jsoup.nodes.f r1 = r2.mo21415b(r3)
                java.lang.String r3 = "type"
                java.lang.String r1 = r1.mo21294b(r3)
                java.lang.String r3 = "hidden"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 != 0) goto L_0x0bb1
                goto L_0x004b
            L_0x0937:
                r1 = 3
                java.lang.String[] r10 = new java.lang.String[r1]
                java.lang.String r1 = "param"
                r10[r6] = r1
                java.lang.String r1 = "source"
                r10[r5] = r1
                java.lang.String r1 = "track"
                r10[r4] = r1
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r10)
                if (r1 == 0) goto L_0x0951
                r2.mo21415b(r3)
                goto L_0x0bb1
            L_0x0951:
                java.lang.String r1 = "hr"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x096c
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0913
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
                goto L_0x0913
            L_0x096c:
                java.lang.String r1 = "image"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x097e
                java.lang.String r1 = "img"
                r3.mo21330a(r1)
                boolean r1 = r2.mo21412a(r3)
                return r1
            L_0x097e:
                java.lang.String r1 = "isindex"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0a50
                r2.mo21419b(r0)
                org.jsoup.nodes.f r1 = r27.mo21456q()
                if (r1 == 0) goto L_0x0990
                return r6
            L_0x0990:
                org.jsoup.parser.e r1 = r2.f23807b
                r1.mo21387b()
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                java.lang.String r7 = "form"
                r1.<init>(r7)
                r2.mo21412a(r1)
                org.jsoup.nodes.b r1 = r3.f23760d
                java.lang.String r7 = "action"
                boolean r1 = r1.mo21261b(r7)
                if (r1 == 0) goto L_0x09ba
                org.jsoup.nodes.f r1 = r27.mo21456q()
                java.lang.String r7 = "action"
                org.jsoup.nodes.b r8 = r3.f23760d
                java.lang.String r9 = "action"
                java.lang.String r8 = r8.mo21255a(r9)
                r1.mo21278b(r7, r8)
            L_0x09ba:
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                java.lang.String r7 = "hr"
                r1.<init>(r7)
                r2.mo21412a(r1)
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                java.lang.String r7 = "label"
                r1.<init>(r7)
                r2.mo21412a(r1)
                org.jsoup.nodes.b r1 = r3.f23760d
                java.lang.String r7 = "prompt"
                boolean r1 = r1.mo21261b(r7)
                if (r1 == 0) goto L_0x09e1
                org.jsoup.nodes.b r1 = r3.f23760d
                java.lang.String r7 = "prompt"
                java.lang.String r1 = r1.mo21255a(r7)
                goto L_0x09e3
            L_0x09e1:
                java.lang.String r1 = "This is a searchable index. Enter search keywords: "
            L_0x09e3:
                org.jsoup.parser.Token$a r7 = new org.jsoup.parser.Token$a
                r7.<init>(r1)
                r2.mo21412a(r7)
                org.jsoup.nodes.b r1 = new org.jsoup.nodes.b
                r1.<init>()
                org.jsoup.nodes.b r3 = r3.f23760d
                java.util.Iterator r3 = r3.iterator()
            L_0x09f6:
                boolean r7 = r3.hasNext()
                if (r7 == 0) goto L_0x0a1f
                java.lang.Object r7 = r3.next()
                org.jsoup.nodes.a r7 = (org.jsoup.nodes.C6761a) r7
                java.lang.String r8 = r7.getKey()
                r9 = 3
                java.lang.String[] r10 = new java.lang.String[r9]
                java.lang.String r9 = "name"
                r10[r6] = r9
                java.lang.String r9 = "action"
                r10[r5] = r9
                java.lang.String r9 = "prompt"
                r10[r4] = r9
                boolean r8 = org.jsoup.helper.C6758a.m32600a(r8, r10)
                if (r8 != 0) goto L_0x09f6
                r1.mo21258a(r7)
                goto L_0x09f6
            L_0x0a1f:
                java.lang.String r3 = "name"
                java.lang.String r4 = "isindex"
                r1.mo21256a(r3, r4)
                org.jsoup.parser.Token$f r3 = new org.jsoup.parser.Token$f
                java.lang.String r4 = "input"
                r3.<init>(r4, r1)
                r2.mo21412a(r3)
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r3 = "label"
                r1.<init>(r3)
                r2.mo21412a(r1)
                org.jsoup.parser.Token$f r1 = new org.jsoup.parser.Token$f
                java.lang.String r3 = "hr"
                r1.<init>(r3)
                r2.mo21412a(r1)
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r3 = "form"
                r1.<init>(r3)
                r2.mo21412a(r1)
                goto L_0x0bb1
            L_0x0a50:
                java.lang.String r1 = "textarea"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0a6c
                r2.mo21401a(r3)
                org.jsoup.parser.e r1 = r2.f23807b
                org.jsoup.parser.TokeniserState r3 = org.jsoup.parser.TokeniserState.Rcdata
                r1.mo21386a(r3)
                r27.mo21416b()
                r2.mo21409a(r6)
                org.jsoup.parser.TreeBuilderState r1 = Text
                goto L_0x006e
            L_0x0a6c:
                java.lang.String r1 = "xmp"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0a91
                java.lang.String r1 = "p"
                boolean r1 = r2.mo21437g(r1)
                if (r1 == 0) goto L_0x0a86
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "p"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x0a86:
                r27.mo21461u()
            L_0x0a89:
                r2.mo21409a(r6)
            L_0x0a8c:
                org.jsoup.parser.TreeBuilderState.m32758b(r3, r2)
                goto L_0x0bb1
            L_0x0a91:
                java.lang.String r1 = "iframe"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0a9a
                goto L_0x0a89
            L_0x0a9a:
                java.lang.String r1 = "noembed"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0aa3
                goto L_0x0a8c
            L_0x0aa3:
                java.lang.String r1 = "select"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0ae9
                r27.mo21461u()
                r2.mo21401a(r3)
                r2.mo21409a(r6)
                org.jsoup.parser.TreeBuilderState r1 = r27.mo21402a()
                org.jsoup.parser.TreeBuilderState r3 = InTable
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0ae5
                org.jsoup.parser.TreeBuilderState r3 = InCaption
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0ae5
                org.jsoup.parser.TreeBuilderState r3 = InTableBody
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0ae5
                org.jsoup.parser.TreeBuilderState r3 = InRow
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x0ae5
                org.jsoup.parser.TreeBuilderState r3 = InCell
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x0ae1
                goto L_0x0ae5
            L_0x0ae1:
                org.jsoup.parser.TreeBuilderState r1 = InSelect
                goto L_0x006e
            L_0x0ae5:
                org.jsoup.parser.TreeBuilderState r1 = InSelectInTable
                goto L_0x006e
            L_0x0ae9:
                java.lang.String r1 = "optgroup"
                java.lang.String[] r10 = new java.lang.String[r5]
                java.lang.String r11 = "option"
                r10[r6] = r11
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r1, r10)
                if (r1 == 0) goto L_0x0b16
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                java.lang.String r4 = "option"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0b11
                org.jsoup.parser.Token$e r1 = new org.jsoup.parser.Token$e
                java.lang.String r4 = "option"
                r1.<init>(r4)
                r2.mo21412a(r1)
            L_0x0b11:
                r27.mo21461u()
                goto L_0x0618
            L_0x0b16:
                java.lang.String r1 = "rp"
                java.lang.String[] r10 = new java.lang.String[r5]
                java.lang.String r11 = "rt"
                r10[r6] = r11
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r1, r10)
                if (r1 == 0) goto L_0x0b49
                java.lang.String r1 = "ruby"
                boolean r1 = r2.mo21430e(r1)
                if (r1 == 0) goto L_0x0bb1
                r27.mo21459t()
                org.jsoup.nodes.f r1 = r27.mo21429e()
                java.lang.String r1 = r1.mo21224a()
                java.lang.String r4 = "ruby"
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto L_0x0618
                r2.mo21419b(r0)
                java.lang.String r1 = "ruby"
                r2.mo21426d(r1)
                goto L_0x0618
            L_0x0b49:
                java.lang.String r1 = "math"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0b5d
            L_0x0b51:
                r27.mo21461u()
                r2.mo21401a(r3)
                org.jsoup.parser.e r1 = r2.f23807b
                r1.mo21387b()
                goto L_0x0bb1
            L_0x0b5d:
                java.lang.String r1 = "svg"
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0b66
                goto L_0x0b51
            L_0x0b66:
                r1 = 11
                java.lang.String[] r1 = new java.lang.String[r1]
                java.lang.String r10 = "caption"
                r1[r6] = r10
                java.lang.String r10 = "col"
                r1[r5] = r10
                java.lang.String r10 = "colgroup"
                r1[r4] = r10
                java.lang.String r4 = "frame"
                r10 = 3
                r1[r10] = r4
                java.lang.String r4 = "head"
                r10 = 4
                r1[r10] = r4
                java.lang.String r4 = "tbody"
                r1[r13] = r4
                java.lang.String r4 = "td"
                r1[r12] = r4
                java.lang.String r4 = "tfoot"
                r1[r9] = r4
                java.lang.String r4 = "th"
                r9 = 8
                r1[r9] = r4
                java.lang.String r4 = "thead"
                r1[r8] = r4
                java.lang.String r4 = "tr"
                r8 = 10
                r1[r8] = r4
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r7, r1)
                if (r1 == 0) goto L_0x0b11
                r2.mo21419b(r0)
                return r6
            L_0x0ba6:
                r2.mo21419b(r0)
                return r6
            L_0x0baa:
                org.jsoup.parser.Token$b r1 = r26.mo21316h()
                r2.mo21407a(r1)
            L_0x0bb1:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TreeBuilderState.C68667.process(org.jsoup.parser.Token, org.jsoup.parser.f):boolean");
        }
    },
    Text {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21317i()) {
                fVar.mo21406a(token.mo21318j());
            } else if (token.mo21319k()) {
                fVar.mo21419b((TreeBuilderState) this);
                fVar.mo21441i();
                fVar.mo21408a(fVar.mo21422c());
                return fVar.mo21412a(token);
            } else if (token.mo21313e()) {
                fVar.mo21441i();
                fVar.mo21408a(fVar.mo21422c());
            }
            return true;
        }
    },
    InTable {
        /* access modifiers changed from: 0000 */
        public boolean anythingElse(Token token, C6874f fVar) {
            fVar.mo21419b((TreeBuilderState) this);
            if (!C6758a.m32600a(fVar.mo21429e().mo21224a(), "table", "tbody", "tfoot", "thead", "tr")) {
                return fVar.mo21413a(token, InBody);
            }
            fVar.mo21420b(true);
            boolean a = fVar.mo21413a(token, InBody);
            fVar.mo21420b(false);
            return a;
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            TreeBuilderState treeBuilderState;
            if (token.mo21317i()) {
                fVar.mo21457r();
                fVar.mo21416b();
                fVar.mo21408a(InTableText);
                return fVar.mo21412a(token);
            }
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else if (token.mo21311c()) {
                C6776f d = token.mo21312d();
                String n = d.mo21339n();
                if (n.equals("caption")) {
                    fVar.mo21448k();
                    fVar.mo21463w();
                    fVar.mo21401a(d);
                    treeBuilderState = InCaption;
                } else if (n.equals("colgroup")) {
                    fVar.mo21448k();
                    fVar.mo21401a(d);
                    treeBuilderState = InColumnGroup;
                } else if (n.equals("col")) {
                    fVar.mo21412a((Token) new C6776f("colgroup"));
                    return fVar.mo21412a(token);
                } else {
                    if (C6758a.m32600a(n, "tbody", "tfoot", "thead")) {
                        fVar.mo21448k();
                        fVar.mo21401a(d);
                        treeBuilderState = InTableBody;
                    } else {
                        if (C6758a.m32600a(n, "td", "th", "tr")) {
                            fVar.mo21412a((Token) new C6776f("tbody"));
                            return fVar.mo21412a(token);
                        } else if (n.equals("table")) {
                            fVar.mo21419b((TreeBuilderState) this);
                            if (fVar.mo21412a((Token) new C6775e("table"))) {
                                return fVar.mo21412a(token);
                            }
                        } else {
                            if (C6758a.m32600a(n, "style", "script")) {
                                return fVar.mo21413a(token, InHead);
                            }
                            if (n.equals("input")) {
                                if (!d.f23760d.mo21255a("type").equalsIgnoreCase("hidden")) {
                                    return anythingElse(token, fVar);
                                }
                                fVar.mo21415b(d);
                            } else if (!n.equals("form")) {
                                return anythingElse(token, fVar);
                            } else {
                                fVar.mo21419b((TreeBuilderState) this);
                                if (fVar.mo21456q() != null) {
                                    return false;
                                }
                                fVar.mo21438h(fVar.mo21415b(d));
                            }
                        }
                    }
                }
                fVar.mo21408a(treeBuilderState);
            } else if (token.mo21313e()) {
                String n2 = token.mo21314f().mo21339n();
                if (!n2.equals("table")) {
                    if (!C6758a.m32600a(n2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        return anythingElse(token, fVar);
                    }
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                } else if (!fVar.mo21440h(n2)) {
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                } else {
                    fVar.mo21423c("table");
                    fVar.mo21453n();
                }
            } else if (token.mo21319k()) {
                if (fVar.mo21429e().mo21224a().equals("html")) {
                    fVar.mo21419b((TreeBuilderState) this);
                }
                return true;
            }
            return anythingElse(token, fVar);
        }
    },
    InTableText {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (C686124.f23767a[token.f23750a.ordinal()] != 5) {
                if (fVar.mo21458s().size() > 0) {
                    for (C6771a aVar : fVar.mo21458s()) {
                        if (!TreeBuilderState.m32757a(aVar)) {
                            fVar.mo21419b((TreeBuilderState) this);
                            if (C6758a.m32600a(fVar.mo21429e().mo21224a(), "table", "tbody", "tfoot", "thead", "tr")) {
                                fVar.mo21420b(true);
                                fVar.mo21413a((Token) aVar, InBody);
                                fVar.mo21420b(false);
                            } else {
                                fVar.mo21413a((Token) aVar, InBody);
                            }
                        } else {
                            fVar.mo21406a(aVar);
                        }
                    }
                    fVar.mo21457r();
                }
                fVar.mo21408a(fVar.mo21422c());
                return fVar.mo21412a(token);
            }
            C6771a j = token.mo21318j();
            if (j.mo21320l().equals(TreeBuilderState.f23765a)) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            }
            fVar.mo21458s().add(j);
            return true;
        }
    },
    InCaption {
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
            if (org.jsoup.helper.C6758a.m32600a(r14.mo21312d().mo21339n(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr") == false) goto L_0x0092;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(org.jsoup.parser.Token r14, org.jsoup.parser.C6874f r15) {
            /*
                r13 = this;
                boolean r0 = r14.mo21313e()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x004e
                org.jsoup.parser.Token$e r0 = r14.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r3 = "caption"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x004e
                org.jsoup.parser.Token$e r14 = r14.mo21314f()
                java.lang.String r14 = r14.mo21339n()
                boolean r14 = r15.mo21440h(r14)
                if (r14 != 0) goto L_0x002a
                r15.mo21419b(r13)
                return r2
            L_0x002a:
                r15.mo21459t()
                org.jsoup.nodes.f r14 = r15.mo21429e()
                java.lang.String r14 = r14.mo21224a()
                java.lang.String r0 = "caption"
                boolean r14 = r14.equals(r0)
                if (r14 != 0) goto L_0x0040
                r15.mo21419b(r13)
            L_0x0040:
                java.lang.String r14 = "caption"
                r15.mo21423c(r14)
                r15.mo21462v()
                org.jsoup.parser.TreeBuilderState r14 = InTable
                r15.mo21408a(r14)
                goto L_0x00bd
            L_0x004e:
                boolean r0 = r14.mo21311c()
                r3 = 8
                r4 = 7
                r5 = 6
                r6 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 9
                if (r0 == 0) goto L_0x0092
                org.jsoup.parser.Token$f r0 = r14.mo21312d()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String[] r11 = new java.lang.String[r10]
                java.lang.String r12 = "caption"
                r11[r2] = r12
                java.lang.String r12 = "col"
                r11[r1] = r12
                java.lang.String r12 = "colgroup"
                r11[r9] = r12
                java.lang.String r12 = "tbody"
                r11[r8] = r12
                java.lang.String r12 = "td"
                r11[r7] = r12
                java.lang.String r12 = "tfoot"
                r11[r6] = r12
                java.lang.String r12 = "th"
                r11[r5] = r12
                java.lang.String r12 = "thead"
                r11[r4] = r12
                java.lang.String r12 = "tr"
                r11[r3] = r12
                boolean r0 = org.jsoup.helper.C6758a.m32600a(r0, r11)
                if (r0 != 0) goto L_0x00a8
            L_0x0092:
                boolean r0 = r14.mo21313e()
                if (r0 == 0) goto L_0x00be
                org.jsoup.parser.Token$e r0 = r14.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r11 = "table"
                boolean r0 = r0.equals(r11)
                if (r0 == 0) goto L_0x00be
            L_0x00a8:
                r15.mo21419b(r13)
                org.jsoup.parser.Token$e r0 = new org.jsoup.parser.Token$e
                java.lang.String r2 = "caption"
                r0.<init>(r2)
                boolean r0 = r15.mo21412a(r0)
                if (r0 == 0) goto L_0x00bd
                boolean r14 = r15.mo21412a(r14)
                return r14
            L_0x00bd:
                return r1
            L_0x00be:
                boolean r0 = r14.mo21313e()
                if (r0 == 0) goto L_0x0102
                org.jsoup.parser.Token$e r0 = r14.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                r11 = 10
                java.lang.String[] r11 = new java.lang.String[r11]
                java.lang.String r12 = "body"
                r11[r2] = r12
                java.lang.String r12 = "col"
                r11[r1] = r12
                java.lang.String r1 = "colgroup"
                r11[r9] = r1
                java.lang.String r1 = "html"
                r11[r8] = r1
                java.lang.String r1 = "tbody"
                r11[r7] = r1
                java.lang.String r1 = "td"
                r11[r6] = r1
                java.lang.String r1 = "tfoot"
                r11[r5] = r1
                java.lang.String r1 = "th"
                r11[r4] = r1
                java.lang.String r1 = "thead"
                r11[r3] = r1
                java.lang.String r1 = "tr"
                r11[r10] = r1
                boolean r0 = org.jsoup.helper.C6758a.m32600a(r0, r11)
                if (r0 == 0) goto L_0x0102
                r15.mo21419b(r13)
                return r2
            L_0x0102:
                org.jsoup.parser.TreeBuilderState r0 = InBody
                boolean r14 = r15.mo21413a(r14, r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TreeBuilderState.C684711.process(org.jsoup.parser.Token, org.jsoup.parser.f):boolean");
        }
    },
    InColumnGroup {
        /* renamed from: a */
        private boolean m32759a(Token token, C6874f fVar) {
            if (fVar.mo21412a((Token) new C6775e("colgroup"))) {
                return fVar.mo21412a(token);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (TreeBuilderState.m32757a(token)) {
                fVar.mo21406a(token.mo21318j());
                return true;
            }
            int i = C686124.f23767a[token.f23750a.ordinal()];
            if (i != 6) {
                switch (i) {
                    case 1:
                        fVar.mo21407a(token.mo21316h());
                        break;
                    case 2:
                        fVar.mo21419b((TreeBuilderState) this);
                        break;
                    case 3:
                        C6776f d = token.mo21312d();
                        String n = d.mo21339n();
                        if (n.equals("html")) {
                            return fVar.mo21413a(token, InBody);
                        }
                        if (n.equals("col")) {
                            fVar.mo21415b(d);
                            break;
                        } else {
                            return m32759a(token, fVar);
                        }
                    case 4:
                        if (token.mo21314f().mo21339n().equals("colgroup")) {
                            if (!fVar.mo21429e().mo21224a().equals("html")) {
                                fVar.mo21441i();
                                fVar.mo21408a(InTable);
                                break;
                            } else {
                                fVar.mo21419b((TreeBuilderState) this);
                                return false;
                            }
                        } else {
                            return m32759a(token, fVar);
                        }
                    default:
                        return m32759a(token, fVar);
                }
                return true;
            } else if (fVar.mo21429e().mo21224a().equals("html")) {
                return true;
            } else {
                return m32759a(token, fVar);
            }
        }
    },
    InTableBody {
        /* renamed from: a */
        private boolean m32760a(Token token, C6874f fVar) {
            if (fVar.mo21440h("tbody") || fVar.mo21440h("thead") || fVar.mo21430e("tfoot")) {
                fVar.mo21450l();
                fVar.mo21412a((Token) new C6775e(fVar.mo21429e().mo21224a()));
                return fVar.mo21412a(token);
            }
            fVar.mo21419b((TreeBuilderState) this);
            return false;
        }

        /* renamed from: b */
        private boolean m32761b(Token token, C6874f fVar) {
            return fVar.mo21413a(token, InTable);
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            TreeBuilderState treeBuilderState;
            switch (C686124.f23767a[token.f23750a.ordinal()]) {
                case 3:
                    C6776f d = token.mo21312d();
                    String n = d.mo21339n();
                    if (n.equals("tr")) {
                        fVar.mo21450l();
                        fVar.mo21401a(d);
                        treeBuilderState = InRow;
                        break;
                    } else {
                        if (C6758a.m32600a(n, "th", "td")) {
                            fVar.mo21419b((TreeBuilderState) this);
                            fVar.mo21412a((Token) new C6776f("tr"));
                            return fVar.mo21412a((Token) d);
                        }
                        return C6758a.m32600a(n, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? m32760a(token, fVar) : m32761b(token, fVar);
                    }
                case 4:
                    String n2 = token.mo21314f().mo21339n();
                    if (C6758a.m32600a(n2, "tbody", "tfoot", "thead")) {
                        if (fVar.mo21440h(n2)) {
                            fVar.mo21450l();
                            fVar.mo21441i();
                            treeBuilderState = InTable;
                            break;
                        } else {
                            fVar.mo21419b((TreeBuilderState) this);
                            return false;
                        }
                    } else if (n2.equals("table")) {
                        return m32760a(token, fVar);
                    } else {
                        if (!C6758a.m32600a(n2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                            return m32761b(token, fVar);
                        }
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                default:
                    return m32761b(token, fVar);
            }
            fVar.mo21408a(treeBuilderState);
            return true;
        }
    },
    InRow {
        /* renamed from: a */
        private boolean m32762a(Token token, C6874f fVar) {
            return fVar.mo21413a(token, InTable);
        }

        /* renamed from: b */
        private boolean m32763b(Token token, C6874f fVar) {
            if (fVar.mo21412a((Token) new C6775e("tr"))) {
                return fVar.mo21412a(token);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21311c()) {
                C6776f d = token.mo21312d();
                String n = d.mo21339n();
                if (C6758a.m32600a(n, "th", "td")) {
                    fVar.mo21452m();
                    fVar.mo21401a(d);
                    fVar.mo21408a(InCell);
                    fVar.mo21463w();
                } else {
                    return C6758a.m32600a(n, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? m32763b(token, fVar) : m32762a(token, fVar);
                }
            } else if (!token.mo21313e()) {
                return m32762a(token, fVar);
            } else {
                String n2 = token.mo21314f().mo21339n();
                if (n2.equals("tr")) {
                    if (!fVar.mo21440h(n2)) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                    fVar.mo21452m();
                    fVar.mo21441i();
                    fVar.mo21408a(InTableBody);
                } else if (n2.equals("table")) {
                    return m32763b(token, fVar);
                } else {
                    if (!C6758a.m32600a(n2, "tbody", "tfoot", "thead")) {
                        if (!C6758a.m32600a(n2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                            return m32762a(token, fVar);
                        }
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    } else if (!fVar.mo21440h(n2)) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    } else {
                        fVar.mo21412a((Token) new C6775e("tr"));
                        return fVar.mo21412a(token);
                    }
                }
            }
            return true;
        }
    },
    InCell {
        /* renamed from: a */
        private void m32764a(C6874f fVar) {
            fVar.mo21412a((Token) fVar.mo21440h("td") ? new C6775e("td") : new C6775e("th"));
        }

        /* renamed from: a */
        private boolean m32765a(Token token, C6874f fVar) {
            return fVar.mo21413a(token, InBody);
        }

        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21313e()) {
                String n = token.mo21314f().mo21339n();
                if (!C6758a.m32600a(n, "td", "th")) {
                    if (C6758a.m32600a(n, "body", "caption", "col", "colgroup", "html")) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                    if (!C6758a.m32600a(n, "table", "tbody", "tfoot", "thead", "tr")) {
                        return m32765a(token, fVar);
                    }
                    if (!fVar.mo21440h(n)) {
                        fVar.mo21419b((TreeBuilderState) this);
                        return false;
                    }
                } else if (!fVar.mo21440h(n)) {
                    fVar.mo21419b((TreeBuilderState) this);
                    fVar.mo21408a(InRow);
                    return false;
                } else {
                    fVar.mo21459t();
                    if (!fVar.mo21429e().mo21224a().equals(n)) {
                        fVar.mo21419b((TreeBuilderState) this);
                    }
                    fVar.mo21423c(n);
                    fVar.mo21462v();
                    fVar.mo21408a(InRow);
                    return true;
                }
            } else {
                if (token.mo21311c()) {
                    if (C6758a.m32600a(token.mo21312d().mo21339n(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                        if (!fVar.mo21440h("td") && !fVar.mo21440h("th")) {
                            fVar.mo21419b((TreeBuilderState) this);
                            return false;
                        }
                    }
                }
                return m32765a(token, fVar);
            }
            m32764a(fVar);
            return fVar.mo21412a(token);
        }
    },
    InSelect {
        /* renamed from: a */
        private boolean m32766a(Token token, C6874f fVar) {
            fVar.mo21419b((TreeBuilderState) this);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
            if (r8.mo21429e().mo21224a().equals("optgroup") != false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
            if (r8.mo21429e().mo21224a().equals("option") != false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
            if (r8.mo21429e().mo21224a().equals("html") == false) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
            r8.mo21419b((org.jsoup.parser.TreeBuilderState) r6);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(org.jsoup.parser.Token r7, org.jsoup.parser.C6874f r8) {
            /*
                r6 = this;
                int[] r0 = org.jsoup.parser.TreeBuilderState.C686124.f23767a
                org.jsoup.parser.Token$TokenType r1 = r7.f23750a
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 1: goto L_0x019f;
                    case 2: goto L_0x019b;
                    case 3: goto L_0x00d9;
                    case 4: goto L_0x0044;
                    case 5: goto L_0x0029;
                    case 6: goto L_0x0014;
                    default: goto L_0x000f;
                }
            L_0x000f:
                boolean r7 = r6.m32766a(r7, r8)
                return r7
            L_0x0014:
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r0 = "html"
                boolean r7 = r7.equals(r0)
                if (r7 != 0) goto L_0x01a6
            L_0x0024:
                r8.mo21419b(r6)
                goto L_0x01a6
            L_0x0029:
                org.jsoup.parser.Token$a r7 = r7.mo21318j()
                java.lang.String r0 = r7.mo21320l()
                java.lang.String r3 = org.jsoup.parser.TreeBuilderState.f23765a
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x003f
                r8.mo21419b(r6)
                return r2
            L_0x003f:
                r8.mo21406a(r7)
                goto L_0x01a6
            L_0x0044:
                org.jsoup.parser.Token$e r0 = r7.mo21314f()
                java.lang.String r0 = r0.mo21339n()
                java.lang.String r3 = "optgroup"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x00a1
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r0 = "option"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x008c
                org.jsoup.nodes.f r7 = r8.mo21429e()
                org.jsoup.nodes.f r7 = r8.mo21433f(r7)
                if (r7 == 0) goto L_0x008c
                org.jsoup.nodes.f r7 = r8.mo21429e()
                org.jsoup.nodes.f r7 = r8.mo21433f(r7)
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r0 = "optgroup"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x008c
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r0 = "option"
                r7.<init>(r0)
                r8.mo21412a(r7)
            L_0x008c:
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r0 = "optgroup"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0024
            L_0x009c:
                r8.mo21441i()
                goto L_0x01a6
            L_0x00a1:
                java.lang.String r3 = "option"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x00ba
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r0 = "option"
                boolean r7 = r7.equals(r0)
                if (r7 == 0) goto L_0x0024
                goto L_0x009c
            L_0x00ba:
                java.lang.String r3 = "select"
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L_0x00d4
                boolean r7 = r8.mo21442i(r0)
                if (r7 != 0) goto L_0x00cc
                r8.mo21419b(r6)
                return r2
            L_0x00cc:
                r8.mo21423c(r0)
                r8.mo21453n()
                goto L_0x01a6
            L_0x00d4:
                boolean r7 = r6.m32766a(r7, r8)
                return r7
            L_0x00d9:
                org.jsoup.parser.Token$f r0 = r7.mo21312d()
                java.lang.String r3 = r0.mo21339n()
                java.lang.String r4 = "html"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x00f0
                org.jsoup.parser.TreeBuilderState r7 = InBody
                boolean r7 = r8.mo21413a(r0, r7)
                return r7
            L_0x00f0:
                java.lang.String r4 = "option"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x0107
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r2 = "option"
                r7.<init>(r2)
            L_0x00ff:
                r8.mo21412a(r7)
            L_0x0102:
                r8.mo21401a(r0)
                goto L_0x01a6
            L_0x0107:
                java.lang.String r4 = "optgroup"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x013f
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r2 = "option"
                boolean r7 = r7.equals(r2)
                if (r7 == 0) goto L_0x0127
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r2 = "option"
                r7.<init>(r2)
                goto L_0x00ff
            L_0x0127:
                org.jsoup.nodes.f r7 = r8.mo21429e()
                java.lang.String r7 = r7.mo21224a()
                java.lang.String r2 = "optgroup"
                boolean r7 = r7.equals(r2)
                if (r7 == 0) goto L_0x0102
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r2 = "optgroup"
                r7.<init>(r2)
                goto L_0x00ff
            L_0x013f:
                java.lang.String r4 = "select"
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x0156
                r8.mo21419b(r6)
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r0 = "select"
                r7.<init>(r0)
                boolean r7 = r8.mo21412a(r7)
                return r7
            L_0x0156:
                r4 = 3
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.String r5 = "input"
                r4[r2] = r5
                java.lang.String r5 = "keygen"
                r4[r1] = r5
                r1 = 2
                java.lang.String r5 = "textarea"
                r4[r1] = r5
                boolean r1 = org.jsoup.helper.C6758a.m32600a(r3, r4)
                if (r1 == 0) goto L_0x0187
                r8.mo21419b(r6)
                java.lang.String r7 = "select"
                boolean r7 = r8.mo21442i(r7)
                if (r7 != 0) goto L_0x0178
                return r2
            L_0x0178:
                org.jsoup.parser.Token$e r7 = new org.jsoup.parser.Token$e
                java.lang.String r1 = "select"
                r7.<init>(r1)
                r8.mo21412a(r7)
                boolean r7 = r8.mo21412a(r0)
                return r7
            L_0x0187:
                java.lang.String r0 = "script"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x0196
                org.jsoup.parser.TreeBuilderState r0 = InHead
                boolean r7 = r8.mo21413a(r7, r0)
                return r7
            L_0x0196:
                boolean r7 = r6.m32766a(r7, r8)
                return r7
            L_0x019b:
                r8.mo21419b(r6)
                return r2
            L_0x019f:
                org.jsoup.parser.Token$b r7 = r7.mo21316h()
                r8.mo21407a(r7)
            L_0x01a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TreeBuilderState.C685216.process(org.jsoup.parser.Token, org.jsoup.parser.f):boolean");
        }
    },
    InSelectInTable {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21311c()) {
                if (C6758a.m32600a(token.mo21312d().mo21339n(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                    fVar.mo21419b((TreeBuilderState) this);
                    fVar.mo21412a((Token) new C6775e("select"));
                    return fVar.mo21412a(token);
                }
            }
            if (token.mo21313e()) {
                if (C6758a.m32600a(token.mo21314f().mo21339n(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                    fVar.mo21419b((TreeBuilderState) this);
                    if (!fVar.mo21440h(token.mo21314f().mo21339n())) {
                        return false;
                    }
                    fVar.mo21412a((Token) new C6775e("select"));
                    return fVar.mo21412a(token);
                }
            }
            return fVar.mo21413a(token, InSelect);
        }
    },
    AfterBody {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (TreeBuilderState.m32757a(token)) {
                return fVar.mo21413a(token, InBody);
            }
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else if (token.mo21311c() && token.mo21312d().mo21339n().equals("html")) {
                return fVar.mo21413a(token, InBody);
            } else {
                if (!token.mo21313e() || !token.mo21314f().mo21339n().equals("html")) {
                    if (!token.mo21319k()) {
                        fVar.mo21419b((TreeBuilderState) this);
                        fVar.mo21408a(InBody);
                        return fVar.mo21412a(token);
                    }
                } else if (fVar.mo21439h()) {
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                } else {
                    fVar.mo21408a(AfterAfterBody);
                }
            }
            return true;
        }
    },
    InFrameset {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            TreeBuilderState treeBuilderState;
            if (TreeBuilderState.m32757a(token)) {
                fVar.mo21406a(token.mo21318j());
            } else if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else if (token.mo21311c()) {
                C6776f d = token.mo21312d();
                String n = d.mo21339n();
                if (n.equals("html")) {
                    treeBuilderState = InBody;
                } else if (n.equals("frameset")) {
                    fVar.mo21401a(d);
                } else if (n.equals("frame")) {
                    fVar.mo21415b(d);
                } else if (n.equals("noframes")) {
                    treeBuilderState = InHead;
                } else {
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                }
                return fVar.mo21413a((Token) d, treeBuilderState);
            } else if (!token.mo21313e() || !token.mo21314f().mo21339n().equals("frameset")) {
                if (!token.mo21319k()) {
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                } else if (!fVar.mo21429e().mo21224a().equals("html")) {
                    fVar.mo21419b((TreeBuilderState) this);
                }
            } else if (fVar.mo21429e().mo21224a().equals("html")) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else {
                fVar.mo21441i();
                if (!fVar.mo21439h() && !fVar.mo21429e().mo21224a().equals("frameset")) {
                    fVar.mo21408a(AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            TreeBuilderState treeBuilderState;
            if (TreeBuilderState.m32757a(token)) {
                fVar.mo21406a(token.mo21318j());
            } else if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a()) {
                fVar.mo21419b((TreeBuilderState) this);
                return false;
            } else {
                if (token.mo21311c() && token.mo21312d().mo21339n().equals("html")) {
                    treeBuilderState = InBody;
                } else if (token.mo21313e() && token.mo21314f().mo21339n().equals("html")) {
                    fVar.mo21408a(AfterAfterFrameset);
                } else if (token.mo21311c() && token.mo21312d().mo21339n().equals("noframes")) {
                    treeBuilderState = InHead;
                } else if (!token.mo21319k()) {
                    fVar.mo21419b((TreeBuilderState) this);
                    return false;
                }
                return fVar.mo21413a(token, treeBuilderState);
            }
            return true;
        }
    },
    AfterAfterBody {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a() || TreeBuilderState.m32757a(token) || (token.mo21311c() && token.mo21312d().mo21339n().equals("html"))) {
                return fVar.mo21413a(token, InBody);
            } else {
                if (!token.mo21319k()) {
                    fVar.mo21419b((TreeBuilderState) this);
                    fVar.mo21408a(InBody);
                    return fVar.mo21412a(token);
                }
            }
            return true;
        }
    },
    AfterAfterFrameset {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            if (token.mo21315g()) {
                fVar.mo21407a(token.mo21316h());
            } else if (token.mo21309a() || TreeBuilderState.m32757a(token) || (token.mo21311c() && token.mo21312d().mo21339n().equals("html"))) {
                return fVar.mo21413a(token, InBody);
            } else {
                if (!token.mo21319k()) {
                    if (token.mo21311c() && token.mo21312d().mo21339n().equals("nofrmes")) {
                        return fVar.mo21413a(token, InHead);
                    }
                    fVar.mo21419b((TreeBuilderState) this);
                    fVar.mo21408a(InBody);
                    return fVar.mo21412a(token);
                }
            }
            return true;
        }
    },
    ForeignContent {
        /* access modifiers changed from: 0000 */
        public boolean process(Token token, C6874f fVar) {
            return true;
        }
    };
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f23765a;

    static {
        f23765a = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m32756a(C6776f fVar, C6874f fVar2) {
        fVar2.mo21401a(fVar);
        fVar2.f23807b.mo21386a(TokeniserState.Rcdata);
        fVar2.mo21416b();
        fVar2.mo21408a(Text);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m32757a(Token token) {
        if (!token.mo21317i()) {
            return false;
        }
        String l = token.mo21318j().mo21320l();
        for (int i = 0; i < l.length(); i++) {
            if (!Character.isWhitespace(l.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m32758b(C6776f fVar, C6874f fVar2) {
        fVar2.mo21401a(fVar);
        fVar2.f23807b.mo21386a(TokeniserState.Rawtext);
        fVar2.mo21416b();
        fVar2.mo21408a(Text);
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean process(Token token, C6874f fVar);
}
