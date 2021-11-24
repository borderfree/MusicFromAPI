package org.jsoup.parser;

/* renamed from: org.jsoup.parser.b */
class C6870b {

    /* renamed from: a */
    private String f23772a;

    /* renamed from: b */
    private int f23773b;

    /* renamed from: c */
    private char f23774c;

    /* renamed from: d */
    private TokeniserState f23775d;

    /* renamed from: e */
    private TreeBuilderState f23776e;

    /* renamed from: f */
    private Token f23777f;

    C6870b(String str, char c, TokeniserState tokeniserState, int i) {
        this.f23772a = str;
        this.f23774c = c;
        this.f23775d = tokeniserState;
        this.f23773b = i;
    }

    C6870b(String str, int i) {
        this.f23772a = str;
        this.f23773b = i;
    }

    C6870b(String str, TokeniserState tokeniserState, int i) {
        this.f23772a = str;
        this.f23775d = tokeniserState;
        this.f23773b = i;
    }

    C6870b(String str, TreeBuilderState treeBuilderState, Token token, int i) {
        this.f23772a = str;
        this.f23776e = treeBuilderState;
        this.f23777f = token;
        this.f23773b = i;
    }
}
