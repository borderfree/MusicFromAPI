package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C5022a;
import java.nio.charset.Charset;

/* renamed from: com.google.zxing.datamatrix.encoder.h */
final class C5048h {

    /* renamed from: a */
    int f17981a;

    /* renamed from: b */
    private final String f17982b;

    /* renamed from: c */
    private SymbolShapeHint f17983c;

    /* renamed from: d */
    private C5022a f17984d;

    /* renamed from: e */
    private C5022a f17985e;

    /* renamed from: f */
    private final StringBuilder f17986f;

    /* renamed from: g */
    private int f17987g;

    /* renamed from: h */
    private C5051k f17988h;

    /* renamed from: i */
    private int f17989i;

    C5048h(String str) {
        byte[] bytes = str.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f17982b = sb.toString();
        this.f17983c = SymbolShapeHint.FORCE_NONE;
        this.f17986f = new StringBuilder(str.length());
        this.f17987g = -1;
    }

    /* renamed from: l */
    private int m25014l() {
        return this.f17982b.length() - this.f17989i;
    }

    /* renamed from: a */
    public String mo16449a() {
        return this.f17982b;
    }

    /* renamed from: a */
    public void mo16450a(char c) {
        this.f17986f.append(c);
    }

    /* renamed from: a */
    public void mo16451a(int i) {
        this.f17989i = i;
    }

    /* renamed from: a */
    public void mo16452a(C5022a aVar, C5022a aVar2) {
        this.f17984d = aVar;
        this.f17985e = aVar2;
    }

    /* renamed from: a */
    public void mo16453a(SymbolShapeHint symbolShapeHint) {
        this.f17983c = symbolShapeHint;
    }

    /* renamed from: a */
    public void mo16454a(String str) {
        this.f17986f.append(str);
    }

    /* renamed from: b */
    public char mo16455b() {
        return this.f17982b.charAt(this.f17981a);
    }

    /* renamed from: b */
    public void mo16456b(int i) {
        this.f17987g = i;
    }

    /* renamed from: c */
    public StringBuilder mo16457c() {
        return this.f17986f;
    }

    /* renamed from: c */
    public void mo16458c(int i) {
        if (this.f17988h == null || i > this.f17988h.mo16472f()) {
            this.f17988h = C5051k.m25051a(i, this.f17983c, this.f17984d, this.f17985e, true);
        }
    }

    /* renamed from: d */
    public int mo16459d() {
        return this.f17986f.length();
    }

    /* renamed from: e */
    public int mo16460e() {
        return this.f17987g;
    }

    /* renamed from: f */
    public void mo16461f() {
        this.f17987g = -1;
    }

    /* renamed from: g */
    public boolean mo16462g() {
        return this.f17981a < m25014l();
    }

    /* renamed from: h */
    public int mo16463h() {
        return m25014l() - this.f17981a;
    }

    /* renamed from: i */
    public C5051k mo16464i() {
        return this.f17988h;
    }

    /* renamed from: j */
    public void mo16465j() {
        mo16458c(mo16459d());
    }

    /* renamed from: k */
    public void mo16466k() {
        this.f17988h = null;
    }
}
