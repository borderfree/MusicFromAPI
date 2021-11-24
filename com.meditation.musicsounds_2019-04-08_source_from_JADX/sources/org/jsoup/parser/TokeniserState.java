package org.jsoup.parser;

enum TokeniserState {
    Data {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char c = aVar.mo21354c();
            if (c != 0) {
                if (c == '&') {
                    tokeniserState = CharacterReferenceInData;
                } else if (c == '<') {
                    tokeniserState = TagOpen;
                } else if (c != 65535) {
                    eVar.mo21384a(aVar.mo21349a('&', '<', 0));
                    return;
                } else {
                    eVar.mo21385a((Token) new C6774d());
                    return;
                }
                eVar.mo21388b(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            eVar.mo21383a(aVar.mo21356d());
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            Character a = eVar.mo21380a(null, false);
            eVar.mo21383a(a == null ? '&' : a.charValue());
            eVar.mo21386a(Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char c = aVar.mo21354c();
            if (c != 0) {
                if (c == '&') {
                    tokeniserState = CharacterReferenceInRcdata;
                } else if (c == '<') {
                    tokeniserState = RcdataLessthanSign;
                } else if (c != 65535) {
                    eVar.mo21384a(aVar.mo21349a('&', '<', 0));
                    return;
                } else {
                    eVar.mo21385a((Token) new C6774d());
                    return;
                }
                eVar.mo21388b(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            aVar.mo21360f();
            eVar.mo21383a(65533);
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            Character a = eVar.mo21380a(null, false);
            eVar.mo21383a(a == null ? '&' : a.charValue());
            eVar.mo21386a(Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c = aVar.mo21354c();
            if (c == 0) {
                eVar.mo21390c(this);
                aVar.mo21360f();
                eVar.mo21383a(65533);
            } else if (c == '<') {
                eVar.mo21388b(RawtextLessthanSign);
            } else if (c != 65535) {
                eVar.mo21384a(aVar.mo21349a('<', 0));
            } else {
                eVar.mo21385a((Token) new C6774d());
            }
        }
    },
    ScriptData {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c = aVar.mo21354c();
            if (c == 0) {
                eVar.mo21390c(this);
                aVar.mo21360f();
                eVar.mo21383a(65533);
            } else if (c == '<') {
                eVar.mo21388b(ScriptDataLessthanSign);
            } else if (c != 65535) {
                eVar.mo21384a(aVar.mo21349a('<', 0));
            } else {
                eVar.mo21385a((Token) new C6774d());
            }
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c = aVar.mo21354c();
            if (c == 0) {
                eVar.mo21390c(this);
                aVar.mo21360f();
                eVar.mo21383a(65533);
            } else if (c != 65535) {
                eVar.mo21384a(aVar.mo21347a(0));
            } else {
                eVar.mo21385a((Token) new C6774d());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            char c = aVar.mo21354c();
            if (c == '!') {
                tokeniserState = MarkupDeclarationOpen;
            } else if (c == '/') {
                tokeniserState = EndTagOpen;
            } else if (c != '?') {
                if (aVar.mo21368m()) {
                    eVar.mo21381a(true);
                    tokeniserState2 = TagName;
                } else {
                    eVar.mo21390c(this);
                    eVar.mo21383a('<');
                    tokeniserState2 = Data;
                }
                eVar.mo21386a(tokeniserState2);
                return;
            } else {
                tokeniserState = BogusComment;
            }
            eVar.mo21388b(tokeniserState);
        }
    },
    EndTagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            if (aVar.mo21350b()) {
                eVar.mo21392d(this);
                eVar.mo21384a("</");
                tokeniserState2 = Data;
            } else if (aVar.mo21368m()) {
                eVar.mo21381a(false);
                tokeniserState2 = TagName;
            } else {
                if (aVar.mo21351b('>')) {
                    eVar.mo21390c(this);
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    tokeniserState = BogusComment;
                }
                eVar.mo21388b(tokeniserState);
                return;
            }
            eVar.mo21386a(tokeniserState2);
        }
    },
    TagName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            eVar.f23793b.mo21333b(aVar.mo21349a(9, 10, 12, ' ', '/', '>', 0).toLowerCase());
            char d = aVar.mo21356d();
            if (d != 0) {
                if (!(d == 12 || d == ' ')) {
                    if (d != '/') {
                        if (d == '>') {
                            eVar.mo21389c();
                        } else if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    break;
                                default:
                                    return;
                            }
                        } else {
                            eVar.mo21392d(this);
                        }
                        tokeniserState = Data;
                    } else {
                        tokeniserState = SelfClosingStartTag;
                    }
                    eVar.mo21386a(tokeniserState);
                    return;
                }
                tokeniserState = BeforeAttributeName;
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.f23793b.mo21333b(TokeniserState.f23763a);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21351b('/')) {
                eVar.mo21396h();
                eVar.mo21388b(RCDATAEndTagOpen);
                return;
            }
            if (aVar.mo21368m()) {
                StringBuilder sb = new StringBuilder();
                sb.append("</");
                sb.append(eVar.mo21398j());
                if (!aVar.mo21361f(sb.toString())) {
                    eVar.f23793b = new C6775e(eVar.mo21398j());
                    eVar.mo21389c();
                    aVar.mo21358e();
                    tokeniserState = Data;
                    eVar.mo21386a(tokeniserState);
                }
            }
            eVar.mo21384a("<");
            tokeniserState = Rcdata;
            eVar.mo21386a(tokeniserState);
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21368m()) {
                eVar.mo21381a(false);
                eVar.f23793b.mo21331a(Character.toLowerCase(aVar.mo21354c()));
                eVar.f23792a.append(Character.toLowerCase(aVar.mo21354c()));
                eVar.mo21388b(RCDATAEndTagName);
                return;
            }
            eVar.mo21384a("</");
            eVar.mo21386a(Rcdata);
        }
    },
    RCDATAEndTagName {
        /* renamed from: a */
        private void m32752a(C6873e eVar, C6869a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(eVar.f23792a.toString());
            eVar.mo21384a(sb.toString());
            eVar.mo21386a(Rcdata);
        }

        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23793b.mo21333b(j.toLowerCase());
                eVar.f23792a.append(j);
                return;
            }
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d != '/') {
                    if (d != '>') {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                        }
                    } else if (eVar.mo21397i()) {
                        eVar.mo21389c();
                        tokeniserState = Data;
                        eVar.mo21386a(tokeniserState);
                    }
                    m32752a(eVar, aVar);
                }
                if (eVar.mo21397i()) {
                    tokeniserState = SelfClosingStartTag;
                    eVar.mo21386a(tokeniserState);
                }
                m32752a(eVar, aVar);
            }
            if (eVar.mo21397i()) {
                tokeniserState = BeforeAttributeName;
                eVar.mo21386a(tokeniserState);
            }
            m32752a(eVar, aVar);
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21351b('/')) {
                eVar.mo21396h();
                eVar.mo21388b(RawtextEndTagOpen);
                return;
            }
            eVar.mo21383a('<');
            eVar.mo21386a(Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                eVar.mo21381a(false);
                tokeniserState = RawtextEndTagName;
            } else {
                eVar.mo21384a("</");
                tokeniserState = Rawtext;
            }
            eVar.mo21386a(tokeniserState);
        }
    },
    RawtextEndTagName {
        /* renamed from: a */
        private void m32753a(C6873e eVar, C6869a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(eVar.f23792a.toString());
            eVar.mo21384a(sb.toString());
            eVar.mo21386a(Rawtext);
        }

        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23793b.mo21333b(j.toLowerCase());
                eVar.f23792a.append(j);
                return;
            }
            if (eVar.mo21397i() && !aVar.mo21350b()) {
                char d = aVar.mo21356d();
                if (!(d == 12 || d == ' ')) {
                    if (d == '/') {
                        tokeniserState = SelfClosingStartTag;
                    } else if (d != '>') {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.f23792a.append(d);
                                break;
                        }
                    } else {
                        eVar.mo21389c();
                        tokeniserState = Data;
                    }
                    eVar.mo21386a(tokeniserState);
                }
                tokeniserState = BeforeAttributeName;
                eVar.mo21386a(tokeniserState);
            }
            m32753a(eVar, aVar);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d == '!') {
                eVar.mo21384a("<!");
                tokeniserState = ScriptDataEscapeStart;
            } else if (d != '/') {
                eVar.mo21384a("<");
                aVar.mo21358e();
                tokeniserState = ScriptData;
            } else {
                eVar.mo21396h();
                tokeniserState = ScriptDataEndTagOpen;
            }
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                eVar.mo21381a(false);
                tokeniserState = ScriptDataEndTagName;
            } else {
                eVar.mo21384a("</");
                tokeniserState = ScriptData;
            }
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataEndTagName {
        /* renamed from: a */
        private void m32754a(C6873e eVar, C6869a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(eVar.f23792a.toString());
            eVar.mo21384a(sb.toString());
            eVar.mo21386a(ScriptData);
        }

        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23793b.mo21333b(j.toLowerCase());
                eVar.f23792a.append(j);
                return;
            }
            if (eVar.mo21397i() && !aVar.mo21350b()) {
                char d = aVar.mo21356d();
                if (!(d == 12 || d == ' ')) {
                    if (d == '/') {
                        tokeniserState = SelfClosingStartTag;
                    } else if (d != '>') {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.f23792a.append(d);
                                break;
                        }
                    } else {
                        eVar.mo21389c();
                        tokeniserState = Data;
                    }
                    eVar.mo21386a(tokeniserState);
                }
                tokeniserState = BeforeAttributeName;
                eVar.mo21386a(tokeniserState);
            }
            m32754a(eVar, aVar);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21351b('-')) {
                eVar.mo21383a('-');
                eVar.mo21388b(ScriptDataEscapeStartDash);
                return;
            }
            eVar.mo21386a(ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21351b('-')) {
                eVar.mo21383a('-');
                eVar.mo21388b(ScriptDataEscapedDashDash);
                return;
            }
            eVar.mo21386a(ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21350b()) {
                eVar.mo21392d(this);
                eVar.mo21386a(Data);
                return;
            }
            char c = aVar.mo21354c();
            if (c != 0) {
                if (c == '-') {
                    eVar.mo21383a('-');
                    tokeniserState = ScriptDataEscapedDash;
                } else if (c != '<') {
                    eVar.mo21384a(aVar.mo21349a('-', '<', 0));
                } else {
                    tokeniserState = ScriptDataEscapedLessthanSign;
                }
                eVar.mo21388b(tokeniserState);
            } else {
                eVar.mo21390c(this);
                aVar.mo21360f();
                eVar.mo21383a(65533);
            }
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21350b()) {
                eVar.mo21392d(this);
                eVar.mo21386a(Data);
                return;
            }
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d == '-') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptDataEscapedDashDash;
                } else if (d == '<') {
                    tokeniserState = ScriptDataEscapedLessthanSign;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            d = 65533;
            eVar.mo21383a(d);
            tokeniserState = ScriptDataEscaped;
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21350b()) {
                eVar.mo21392d(this);
                eVar.mo21386a(Data);
                return;
            }
            char d = aVar.mo21356d();
            if (d == 0) {
                eVar.mo21390c(this);
                d = 65533;
            } else if (d != '-') {
                if (d == '<') {
                    tokeniserState = ScriptDataEscapedLessthanSign;
                } else if (d == '>') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptData;
                }
                eVar.mo21386a(tokeniserState);
            } else {
                eVar.mo21383a(d);
            }
            eVar.mo21383a(d);
            tokeniserState = ScriptDataEscaped;
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                eVar.mo21396h();
                eVar.f23792a.append(Character.toLowerCase(aVar.mo21354c()));
                StringBuilder sb = new StringBuilder();
                sb.append("<");
                sb.append(aVar.mo21354c());
                eVar.mo21384a(sb.toString());
                tokeniserState = ScriptDataDoubleEscapeStart;
            } else if (aVar.mo21351b('/')) {
                eVar.mo21396h();
                tokeniserState = ScriptDataEscapedEndTagOpen;
            } else {
                eVar.mo21383a('<');
                eVar.mo21386a(ScriptDataEscaped);
                return;
            }
            eVar.mo21388b(tokeniserState);
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21368m()) {
                eVar.mo21381a(false);
                eVar.f23793b.mo21331a(Character.toLowerCase(aVar.mo21354c()));
                eVar.f23792a.append(aVar.mo21354c());
                eVar.mo21388b(ScriptDataEscapedEndTagName);
                return;
            }
            eVar.mo21384a("</");
            eVar.mo21386a(ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* renamed from: a */
        private void m32755a(C6873e eVar, C6869a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("</");
            sb.append(eVar.f23792a.toString());
            eVar.mo21384a(sb.toString());
            eVar.mo21386a(ScriptDataEscaped);
        }

        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23793b.mo21333b(j.toLowerCase());
                eVar.f23792a.append(j);
                aVar.mo21360f();
                return;
            }
            if (eVar.mo21397i() && !aVar.mo21350b()) {
                char d = aVar.mo21356d();
                if (!(d == 12 || d == ' ')) {
                    if (d == '/') {
                        tokeniserState = SelfClosingStartTag;
                    } else if (d != '>') {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.f23792a.append(d);
                                break;
                        }
                    } else {
                        eVar.mo21389c();
                        tokeniserState = Data;
                    }
                    eVar.mo21386a(tokeniserState);
                }
                tokeniserState = BeforeAttributeName;
                eVar.mo21386a(tokeniserState);
            }
            m32755a(eVar, aVar);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23792a.append(j.toLowerCase());
                eVar.mo21384a(j);
                return;
            }
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ' || d == '/' || d == '>')) {
                switch (d) {
                    case 9:
                    case 10:
                        break;
                    default:
                        aVar.mo21358e();
                        eVar.mo21386a(ScriptDataEscaped);
                        break;
                }
            }
            eVar.mo21386a(eVar.f23792a.toString().equals("script") ? ScriptDataDoubleEscaped : ScriptDataEscaped);
            eVar.mo21383a(d);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char c = aVar.mo21354c();
            if (c != 0) {
                if (c == '-') {
                    eVar.mo21383a(c);
                    tokeniserState = ScriptDataDoubleEscapedDash;
                } else if (c == '<') {
                    eVar.mo21383a(c);
                    tokeniserState = ScriptDataDoubleEscapedLessthanSign;
                } else if (c != 65535) {
                    eVar.mo21384a(aVar.mo21349a('-', '<', 0));
                    return;
                } else {
                    eVar.mo21392d(this);
                    eVar.mo21386a(Data);
                    return;
                }
                eVar.mo21388b(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            aVar.mo21360f();
            eVar.mo21383a(65533);
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d == '-') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptDataDoubleEscapedDashDash;
                } else if (d == '<') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptDataDoubleEscapedLessthanSign;
                } else if (d == 65535) {
                    eVar.mo21392d(this);
                    tokeniserState = Data;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            d = 65533;
            eVar.mo21383a(d);
            tokeniserState = ScriptDataDoubleEscaped;
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d == 0) {
                eVar.mo21390c(this);
                d = 65533;
            } else if (d != '-') {
                if (d == '<') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptDataDoubleEscapedLessthanSign;
                } else if (d == '>') {
                    eVar.mo21383a(d);
                    tokeniserState = ScriptData;
                } else if (d == 65535) {
                    eVar.mo21392d(this);
                    tokeniserState = Data;
                }
                eVar.mo21386a(tokeniserState);
            } else {
                eVar.mo21383a(d);
                return;
            }
            eVar.mo21383a(d);
            tokeniserState = ScriptDataDoubleEscaped;
            eVar.mo21386a(tokeniserState);
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21351b('/')) {
                eVar.mo21383a('/');
                eVar.mo21396h();
                eVar.mo21388b(ScriptDataDoubleEscapeEnd);
                return;
            }
            eVar.mo21386a(ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            if (aVar.mo21368m()) {
                String j = aVar.mo21365j();
                eVar.f23792a.append(j.toLowerCase());
                eVar.mo21384a(j);
                return;
            }
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ' || d == '/' || d == '>')) {
                switch (d) {
                    case 9:
                    case 10:
                        break;
                    default:
                        aVar.mo21358e();
                        eVar.mo21386a(ScriptDataDoubleEscaped);
                        break;
                }
            }
            eVar.mo21386a(eVar.f23792a.toString().equals("script") ? ScriptDataEscaped : ScriptDataDoubleEscaped);
            eVar.mo21383a(d);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d == 0) {
                eVar.mo21390c(this);
            } else if (d != 12 && d != ' ') {
                if (!(d == '\"' || d == '\'')) {
                    if (d != '/') {
                        if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    return;
                                default:
                                    switch (d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            eVar.mo21389c();
                                            break;
                                    }
                            }
                        } else {
                            eVar.mo21392d(this);
                        }
                        tokeniserState = Data;
                    } else {
                        tokeniserState = SelfClosingStartTag;
                    }
                    eVar.mo21386a(tokeniserState);
                }
                eVar.mo21390c(this);
                eVar.f23793b.mo21337l();
                eVar.f23793b.mo21332b(d);
                tokeniserState = AttributeName;
                eVar.mo21386a(tokeniserState);
            } else {
                return;
            }
            eVar.f23793b.mo21337l();
            aVar.mo21358e();
            tokeniserState = AttributeName;
            eVar.mo21386a(tokeniserState);
        }
    },
    AttributeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            C6777g gVar;
            TokeniserState tokeniserState;
            eVar.f23793b.mo21335c(aVar.mo21349a(9, 10, 12, ' ', '/', '=', '>', 0, '\"', '\'', '<').toLowerCase());
            char d = aVar.mo21356d();
            if (d != 0) {
                if (!(d == 12 || d == ' ')) {
                    if (!(d == '\"' || d == '\'')) {
                        if (d != '/') {
                            if (d != 65535) {
                                switch (d) {
                                    case 9:
                                    case 10:
                                        break;
                                    default:
                                        switch (d) {
                                            case '<':
                                                break;
                                            case '=':
                                                tokeniserState = BeforeAttributeValue;
                                                break;
                                            case '>':
                                                eVar.mo21389c();
                                                break;
                                            default:
                                                return;
                                        }
                                }
                            } else {
                                eVar.mo21392d(this);
                            }
                            tokeniserState = Data;
                        } else {
                            tokeniserState = SelfClosingStartTag;
                        }
                        eVar.mo21386a(tokeniserState);
                        return;
                    }
                    eVar.mo21390c(this);
                    gVar = eVar.f23793b;
                }
                tokeniserState = AfterAttributeName;
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            gVar = eVar.f23793b;
            d = 65533;
            gVar.mo21332b(d);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            C6777g gVar;
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d == 0) {
                eVar.mo21390c(this);
                gVar = eVar.f23793b;
                d = 65533;
                gVar.mo21332b(d);
            } else if (d != 12 && d != ' ') {
                if (!(d == '\"' || d == '\'')) {
                    if (d != '/') {
                        if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    return;
                                default:
                                    switch (d) {
                                        case '<':
                                            break;
                                        case '=':
                                            tokeniserState = BeforeAttributeValue;
                                            break;
                                        case '>':
                                            eVar.mo21389c();
                                            break;
                                        default:
                                            eVar.f23793b.mo21337l();
                                            aVar.mo21358e();
                                            break;
                                    }
                            }
                        } else {
                            eVar.mo21392d(this);
                        }
                        tokeniserState = Data;
                    } else {
                        tokeniserState = SelfClosingStartTag;
                    }
                    eVar.mo21386a(tokeniserState);
                }
                eVar.mo21390c(this);
                eVar.f23793b.mo21337l();
                gVar = eVar.f23793b;
                gVar.mo21332b(d);
            } else {
                return;
            }
            tokeniserState = AttributeName;
            eVar.mo21386a(tokeniserState);
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
            r3.mo21334c(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
            r3 = AttributeValue_unquoted;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r2.mo21386a(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
            r3 = Data;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void read(org.jsoup.parser.C6873e r2, org.jsoup.parser.C6869a r3) {
            /*
                r1 = this;
                char r0 = r3.mo21356d()
                switch(r0) {
                    case 0: goto L_0x0029;
                    case 9: goto L_0x0035;
                    case 10: goto L_0x0035;
                    case 12: goto L_0x0035;
                    case 32: goto L_0x0035;
                    case 34: goto L_0x0026;
                    case 38: goto L_0x0007;
                    case 39: goto L_0x0023;
                    case 60: goto L_0x001d;
                    case 61: goto L_0x001d;
                    case 62: goto L_0x0014;
                    case 96: goto L_0x001d;
                    case 65535: goto L_0x0010;
                    default: goto L_0x0007;
                }
            L_0x0007:
                r3.mo21358e()
            L_0x000a:
                org.jsoup.parser.TokeniserState r3 = AttributeValue_unquoted
            L_0x000c:
                r2.mo21386a(r3)
                goto L_0x0035
            L_0x0010:
                r2.mo21392d(r1)
                goto L_0x001a
            L_0x0014:
                r2.mo21390c(r1)
                r2.mo21389c()
            L_0x001a:
                org.jsoup.parser.TokeniserState r3 = Data
                goto L_0x000c
            L_0x001d:
                r2.mo21390c(r1)
                org.jsoup.parser.Token$g r3 = r2.f23793b
                goto L_0x0031
            L_0x0023:
                org.jsoup.parser.TokeniserState r3 = AttributeValue_singleQuoted
                goto L_0x000c
            L_0x0026:
                org.jsoup.parser.TokeniserState r3 = AttributeValue_doubleQuoted
                goto L_0x000c
            L_0x0029:
                r2.mo21390c(r1)
                org.jsoup.parser.Token$g r3 = r2.f23793b
                r0 = 65533(0xfffd, float:9.1831E-41)
            L_0x0031:
                r3.mo21334c(r0)
                goto L_0x000a
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.C680837.read(org.jsoup.parser.e, org.jsoup.parser.a):void");
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c;
            C6777g gVar;
            TokeniserState tokeniserState;
            String a = aVar.mo21349a('\"', '&', 0);
            if (a.length() > 0) {
                eVar.f23793b.mo21336d(a);
            }
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d == '\"') {
                    tokeniserState = AfterAttributeValue_quoted;
                } else if (d == '&') {
                    Character a2 = eVar.mo21380a(Character.valueOf('\"'), true);
                    if (a2 != null) {
                        gVar = eVar.f23793b;
                        c = a2.charValue();
                    } else {
                        eVar.f23793b.mo21334c('&');
                        return;
                    }
                } else if (d == 65535) {
                    eVar.mo21392d(this);
                    tokeniserState = Data;
                } else {
                    return;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            gVar = eVar.f23793b;
            c = 65533;
            gVar.mo21334c(c);
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c;
            C6777g gVar;
            TokeniserState tokeniserState;
            String a = aVar.mo21349a('\'', '&', 0);
            if (a.length() > 0) {
                eVar.f23793b.mo21336d(a);
            }
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != 65535) {
                    switch (d) {
                        case '&':
                            Character a2 = eVar.mo21380a(Character.valueOf('\''), true);
                            if (a2 == null) {
                                gVar = eVar.f23793b;
                                c = '&';
                                break;
                            } else {
                                gVar = eVar.f23793b;
                                c = a2.charValue();
                                break;
                            }
                        case '\'':
                            tokeniserState = AfterAttributeValue_quoted;
                            break;
                        default:
                            return;
                    }
                } else {
                    eVar.mo21392d(this);
                    tokeniserState = Data;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            gVar = eVar.f23793b;
            c = 65533;
            gVar.mo21334c(c);
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
            r3.mo21386a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            r3.mo21334c(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
            r4 = Data;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void read(org.jsoup.parser.C6873e r3, org.jsoup.parser.C6869a r4) {
            /*
                r2 = this;
                r0 = 12
                char[] r0 = new char[r0]
                r0 = {9, 10, 12, 32, 38, 62, 0, 34, 39, 60, 61, 96} // fill-array
                java.lang.String r0 = r4.mo21349a(r0)
                int r1 = r0.length()
                if (r1 <= 0) goto L_0x0016
                org.jsoup.parser.Token$g r1 = r3.f23793b
                r1.mo21336d(r0)
            L_0x0016:
                char r4 = r4.mo21356d()
                switch(r4) {
                    case 0: goto L_0x004d;
                    case 9: goto L_0x0047;
                    case 10: goto L_0x0047;
                    case 12: goto L_0x0047;
                    case 32: goto L_0x0047;
                    case 34: goto L_0x0041;
                    case 38: goto L_0x0028;
                    case 39: goto L_0x0041;
                    case 60: goto L_0x0041;
                    case 61: goto L_0x0041;
                    case 62: goto L_0x0022;
                    case 96: goto L_0x0041;
                    case 65535: goto L_0x001e;
                    default: goto L_0x001d;
                }
            L_0x001d:
                goto L_0x0058
            L_0x001e:
                r3.mo21392d(r2)
                goto L_0x0025
            L_0x0022:
                r3.mo21389c()
            L_0x0025:
                org.jsoup.parser.TokeniserState r4 = Data
                goto L_0x0049
            L_0x0028:
                r4 = 62
                java.lang.Character r4 = java.lang.Character.valueOf(r4)
                r0 = 1
                java.lang.Character r4 = r3.mo21380a(r4, r0)
                if (r4 == 0) goto L_0x003c
                org.jsoup.parser.Token$g r3 = r3.f23793b
                char r4 = r4.charValue()
                goto L_0x0055
            L_0x003c:
                org.jsoup.parser.Token$g r3 = r3.f23793b
                r4 = 38
                goto L_0x0055
            L_0x0041:
                r3.mo21390c(r2)
                org.jsoup.parser.Token$g r3 = r3.f23793b
                goto L_0x0055
            L_0x0047:
                org.jsoup.parser.TokeniserState r4 = BeforeAttributeName
            L_0x0049:
                r3.mo21386a(r4)
                goto L_0x0058
            L_0x004d:
                r3.mo21390c(r2)
                org.jsoup.parser.Token$g r3 = r3.f23793b
                r4 = 65533(0xfffd, float:9.1831E-41)
            L_0x0055:
                r3.mo21334c(r4)
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.TokeniserState.C681240.read(org.jsoup.parser.e, org.jsoup.parser.a):void");
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d != '/') {
                    if (d == '>') {
                        eVar.mo21389c();
                    } else if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.mo21390c(this);
                                aVar.mo21358e();
                                break;
                        }
                    } else {
                        eVar.mo21392d(this);
                    }
                    tokeniserState = Data;
                } else {
                    tokeniserState = SelfClosingStartTag;
                }
                eVar.mo21386a(tokeniserState);
            }
            tokeniserState = BeforeAttributeName;
            eVar.mo21386a(tokeniserState);
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d == '>') {
                eVar.f23793b.f23759c = true;
                eVar.mo21389c();
                tokeniserState = Data;
            } else if (d != 65535) {
                eVar.mo21390c(this);
                tokeniserState = BeforeAttributeName;
            } else {
                eVar.mo21392d(this);
                tokeniserState = Data;
            }
            eVar.mo21386a(tokeniserState);
        }
    },
    BogusComment {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            aVar.mo21358e();
            C6772b bVar = new C6772b();
            bVar.f23753b.append(aVar.mo21347a('>'));
            eVar.mo21385a((Token) bVar);
            eVar.mo21388b(Data);
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21357d("--")) {
                eVar.mo21391d();
                tokeniserState = CommentStart;
            } else if (aVar.mo21359e("DOCTYPE")) {
                tokeniserState = Doctype;
            } else if (aVar.mo21357d("[CDATA[")) {
                tokeniserState = CdataSection;
            } else {
                eVar.mo21390c(this);
                eVar.mo21388b(BogusComment);
                return;
            }
            eVar.mo21386a(tokeniserState);
        }
    },
    CommentStart {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '-') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        eVar.f23795d.f23753b.append(d);
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.mo21393e();
                    tokeniserState = Data;
                } else {
                    tokeniserState = CommentStartDash;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            eVar.f23795d.f23753b.append(65533);
            tokeniserState = Comment;
            eVar.mo21386a(tokeniserState);
        }
    },
    CommentStartDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '-') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        eVar.f23795d.f23753b.append(d);
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.mo21393e();
                    tokeniserState = Data;
                } else {
                    tokeniserState = CommentStartDash;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            eVar.f23795d.f23753b.append(65533);
            tokeniserState = Comment;
            eVar.mo21386a(tokeniserState);
        }
    },
    Comment {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char c = aVar.mo21354c();
            if (c == 0) {
                eVar.mo21390c(this);
                eVar.f23795d.f23753b.append(65533);
            } else if (c == '-') {
                eVar.mo21388b(CommentEndDash);
            } else if (c != 65535) {
                eVar.f23795d.f23753b.append(aVar.mo21349a('-', 0));
            } else {
                eVar.mo21392d(this);
                eVar.mo21393e();
                eVar.mo21386a(Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d == '-') {
                    tokeniserState = CommentEnd;
                } else if (d != 65535) {
                    StringBuilder sb = eVar.f23795d.f23753b;
                    sb.append('-');
                    sb.append(d);
                } else {
                    eVar.mo21392d(this);
                    eVar.mo21393e();
                    tokeniserState = Data;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            StringBuilder sb2 = eVar.f23795d.f23753b;
            sb2.append('-');
            sb2.append(65533);
            tokeniserState = Comment;
            eVar.mo21386a(tokeniserState);
        }
    },
    CommentEnd {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d == '!') {
                    eVar.mo21390c(this);
                    tokeniserState = CommentEndBang;
                } else if (d != '-') {
                    if (d != '>') {
                        if (d != 65535) {
                            eVar.mo21390c(this);
                            StringBuilder sb = eVar.f23795d.f23753b;
                            sb.append("--");
                            sb.append(d);
                        } else {
                            eVar.mo21392d(this);
                        }
                    }
                    eVar.mo21393e();
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    eVar.f23795d.f23753b.append('-');
                    return;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            StringBuilder sb2 = eVar.f23795d.f23753b;
            sb2.append("--");
            sb2.append(65533);
            tokeniserState = Comment;
            eVar.mo21386a(tokeniserState);
        }
    },
    CommentEndBang {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '-') {
                    if (d != '>') {
                        if (d != 65535) {
                            StringBuilder sb = eVar.f23795d.f23753b;
                            sb.append("--!");
                            sb.append(d);
                        } else {
                            eVar.mo21392d(this);
                        }
                    }
                    eVar.mo21393e();
                    tokeniserState = Data;
                } else {
                    eVar.f23795d.f23753b.append("--!");
                    tokeniserState = CommentEndDash;
                }
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            StringBuilder sb2 = eVar.f23795d.f23753b;
            sb2.append("--!");
            sb2.append(65533);
            tokeniserState = Comment;
            eVar.mo21386a(tokeniserState);
        }
    },
    Doctype {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d != 65535) {
                    switch (d) {
                        case 9:
                        case 10:
                            break;
                        default:
                            eVar.mo21390c(this);
                            break;
                    }
                } else {
                    eVar.mo21392d(this);
                    eVar.mo21394f();
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                    eVar.mo21386a(tokeniserState);
                }
            }
            tokeniserState = BeforeDoctypeName;
            eVar.mo21386a(tokeniserState);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                eVar.mo21394f();
                eVar.mo21386a(DoctypeName);
                return;
            }
            char d = aVar.mo21356d();
            if (d != 0) {
                if (!(d == 12 || d == ' ')) {
                    if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.mo21394f();
                                eVar.f23794c.f23754b.append(d);
                                break;
                        }
                    } else {
                        eVar.mo21392d(this);
                        eVar.mo21394f();
                        eVar.f23794c.f23757e = true;
                        eVar.mo21395g();
                        tokeniserState = Data;
                        eVar.mo21386a(tokeniserState);
                    }
                }
            }
            eVar.mo21390c(this);
            eVar.f23794c.f23754b.append(65533);
            tokeniserState = DoctypeName;
            eVar.mo21386a(tokeniserState);
        }
    },
    DoctypeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            if (aVar.mo21368m()) {
                eVar.f23794c.f23754b.append(aVar.mo21365j().toLowerCase());
                return;
            }
            char d = aVar.mo21356d();
            if (d != 0) {
                if (!(d == 12 || d == ' ')) {
                    if (d != '>') {
                        if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    break;
                                default:
                                    sb = eVar.f23794c.f23754b;
                                    break;
                            }
                        } else {
                            eVar.mo21392d(this);
                            eVar.f23794c.f23757e = true;
                        }
                    }
                    eVar.mo21395g();
                    tokeniserState = Data;
                    eVar.mo21386a(tokeniserState);
                }
                tokeniserState = AfterDoctypeName;
                eVar.mo21386a(tokeniserState);
            }
            eVar.mo21390c(this);
            sb = eVar.f23794c.f23754b;
            d = 65533;
            sb.append(d);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            TokeniserState tokeniserState2;
            if (aVar.mo21350b()) {
                eVar.mo21392d(this);
                eVar.f23794c.f23757e = true;
                eVar.mo21395g();
                eVar.mo21386a(Data);
                return;
            }
            if (aVar.mo21351b('>')) {
                eVar.mo21395g();
                tokeniserState = Data;
            } else {
                if (aVar.mo21359e("PUBLIC")) {
                    tokeniserState2 = AfterDoctypePublicKeyword;
                } else if (aVar.mo21359e("SYSTEM")) {
                    tokeniserState2 = AfterDoctypeSystemKeyword;
                } else {
                    eVar.mo21390c(this);
                    eVar.f23794c.f23757e = true;
                    tokeniserState = BogusDoctype;
                }
                eVar.mo21386a(tokeniserState2);
            }
            eVar.mo21388b(tokeniserState);
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d == '\"') {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypePublicIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.mo21390c(this);
                                eVar.f23794c.f23757e = true;
                                tokeniserState = BogusDoctype;
                                break;
                        }
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypePublicIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
            tokeniserState = BeforeDoctypePublicIdentifier;
            eVar.mo21386a(tokeniserState);
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 12 && d != ' ') {
                if (d == '\"') {
                    tokeniserState = DoctypePublicIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                return;
                            default:
                                eVar.mo21390c(this);
                                eVar.f23794c.f23757e = true;
                                tokeniserState = BogusDoctype;
                                break;
                        }
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = DoctypePublicIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '\"') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        sb = eVar.f23794c.f23755c;
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = AfterDoctypePublicIdentifier;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            sb = eVar.f23794c.f23755c;
            d = 65533;
            sb.append(d);
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        sb = eVar.f23794c.f23755c;
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = AfterDoctypePublicIdentifier;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            sb = eVar.f23794c.f23755c;
            d = 65533;
            sb.append(d);
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d == '\"') {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d != '>') {
                        if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    break;
                                default:
                                    eVar.mo21390c(this);
                                    eVar.f23794c.f23757e = true;
                                    tokeniserState = BogusDoctype;
                                    break;
                            }
                        } else {
                            eVar.mo21392d(this);
                            eVar.f23794c.f23757e = true;
                        }
                    }
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
            tokeniserState = BetweenDoctypePublicAndSystemIdentifiers;
            eVar.mo21386a(tokeniserState);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 12 && d != ' ') {
                if (d == '\"') {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d != '>') {
                        if (d != 65535) {
                            switch (d) {
                                case 9:
                                case 10:
                                    return;
                                default:
                                    eVar.mo21390c(this);
                                    eVar.f23794c.f23757e = true;
                                    tokeniserState = BogusDoctype;
                                    break;
                            }
                        } else {
                            eVar.mo21392d(this);
                            eVar.f23794c.f23757e = true;
                        }
                    }
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (!(d == 12 || d == ' ')) {
                if (d == '\"') {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                break;
                            default:
                                eVar.mo21390c(this);
                                eVar.f23794c.f23757e = true;
                                eVar.mo21395g();
                                return;
                        }
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    eVar.mo21390c(this);
                    tokeniserState = DoctypeSystemIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
            tokeniserState = BeforeDoctypeSystemIdentifier;
            eVar.mo21386a(tokeniserState);
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 12 && d != ' ') {
                if (d == '\"') {
                    tokeniserState = DoctypeSystemIdentifier_doubleQuoted;
                } else if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                return;
                            default:
                                eVar.mo21390c(this);
                                eVar.f23794c.f23757e = true;
                                tokeniserState = BogusDoctype;
                                break;
                        }
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = DoctypeSystemIdentifier_singleQuoted;
                }
                eVar.mo21386a(tokeniserState);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '\"') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        sb = eVar.f23794c.f23756d;
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = AfterDoctypeSystemIdentifier;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            sb = eVar.f23794c.f23756d;
            d = 65533;
            sb.append(d);
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            StringBuilder sb;
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 0) {
                if (d != '\'') {
                    if (d == '>') {
                        eVar.mo21390c(this);
                    } else if (d != 65535) {
                        sb = eVar.f23794c.f23756d;
                    } else {
                        eVar.mo21392d(this);
                    }
                    eVar.f23794c.f23757e = true;
                    eVar.mo21395g();
                    tokeniserState = Data;
                } else {
                    tokeniserState = AfterDoctypeSystemIdentifier;
                }
                eVar.mo21386a(tokeniserState);
                return;
            }
            eVar.mo21390c(this);
            sb = eVar.f23794c.f23756d;
            d = 65533;
            sb.append(d);
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            TokeniserState tokeniserState;
            char d = aVar.mo21356d();
            if (d != 12 && d != ' ') {
                if (d != '>') {
                    if (d != 65535) {
                        switch (d) {
                            case 9:
                            case 10:
                                return;
                            default:
                                eVar.mo21390c(this);
                                tokeniserState = BogusDoctype;
                                break;
                        }
                        eVar.mo21386a(tokeniserState);
                    }
                    eVar.mo21392d(this);
                    eVar.f23794c.f23757e = true;
                }
                eVar.mo21395g();
                tokeniserState = Data;
                eVar.mo21386a(tokeniserState);
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            char d = aVar.mo21356d();
            if (d == '>' || d == 65535) {
                eVar.mo21395g();
                eVar.mo21386a(Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: 0000 */
        public void read(C6873e eVar, C6869a aVar) {
            eVar.mo21384a(aVar.mo21348a("]]>"));
            aVar.mo21357d("]]>");
            eVar.mo21386a(Data);
        }
    };
    
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23763a = null;

    static {
        f23763a = String.valueOf(65533);
    }

    /* access modifiers changed from: 0000 */
    public abstract void read(C6873e eVar, C6869a aVar);
}
