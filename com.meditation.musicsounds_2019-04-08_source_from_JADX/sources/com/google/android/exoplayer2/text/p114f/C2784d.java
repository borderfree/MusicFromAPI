package com.google.android.exoplayer2.text.p114f;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.d */
final class C2784d {

    /* renamed from: a */
    private String f9615a;

    /* renamed from: b */
    private String f9616b;

    /* renamed from: c */
    private List<String> f9617c;

    /* renamed from: d */
    private String f9618d;

    /* renamed from: e */
    private String f9619e;

    /* renamed from: f */
    private int f9620f;

    /* renamed from: g */
    private boolean f9621g;

    /* renamed from: h */
    private int f9622h;

    /* renamed from: i */
    private boolean f9623i;

    /* renamed from: j */
    private int f9624j;

    /* renamed from: k */
    private int f9625k;

    /* renamed from: l */
    private int f9626l;

    /* renamed from: m */
    private int f9627m;

    /* renamed from: n */
    private int f9628n;

    /* renamed from: o */
    private float f9629o;

    /* renamed from: p */
    private Alignment f9630p;

    public C2784d() {
        mo9477a();
    }

    /* renamed from: a */
    private static int m13240a(int i, String str, String str2, int i2) {
        if (!str.isEmpty()) {
            int i3 = -1;
            if (i != -1) {
                if (str.equals(str2)) {
                    i3 = i + i2;
                }
                return i3;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int mo9474a(String str, String str2, String[] strArr, String str3) {
        if (this.f9615a.isEmpty() && this.f9616b.isEmpty() && this.f9617c.isEmpty() && this.f9618d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int a = m13240a(m13240a(m13240a(0, this.f9615a, str, 1073741824), this.f9616b, str2, 2), this.f9618d, str3, 4);
        if (a == -1 || !Arrays.asList(strArr).containsAll(this.f9617c)) {
            return 0;
        }
        return a + (this.f9617c.size() * 4);
    }

    /* renamed from: a */
    public C2784d mo9475a(int i) {
        this.f9620f = i;
        this.f9621g = true;
        return this;
    }

    /* renamed from: a */
    public C2784d mo9476a(boolean z) {
        this.f9625k = z ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public void mo9477a() {
        this.f9615a = "";
        this.f9616b = "";
        this.f9617c = Collections.emptyList();
        this.f9618d = "";
        this.f9619e = null;
        this.f9621g = false;
        this.f9623i = false;
        this.f9624j = -1;
        this.f9625k = -1;
        this.f9626l = -1;
        this.f9627m = -1;
        this.f9628n = -1;
        this.f9630p = null;
    }

    /* renamed from: a */
    public void mo9478a(String str) {
        this.f9615a = str;
    }

    /* renamed from: a */
    public void mo9479a(String[] strArr) {
        this.f9617c = Arrays.asList(strArr);
    }

    /* renamed from: b */
    public int mo9480b() {
        if (this.f9626l == -1 && this.f9627m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f9626l == 1 ? 1 : 0;
        if (this.f9627m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: b */
    public C2784d mo9481b(int i) {
        this.f9622h = i;
        this.f9623i = true;
        return this;
    }

    /* renamed from: b */
    public C2784d mo9482b(boolean z) {
        this.f9626l = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public void mo9483b(String str) {
        this.f9616b = str;
    }

    /* renamed from: c */
    public C2784d mo9484c(boolean z) {
        this.f9627m = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public void mo9485c(String str) {
        this.f9618d = str;
    }

    /* renamed from: c */
    public boolean mo9486c() {
        return this.f9624j == 1;
    }

    /* renamed from: d */
    public C2784d mo9487d(String str) {
        this.f9619e = C2511s.m11818d(str);
        return this;
    }

    /* renamed from: d */
    public boolean mo9488d() {
        return this.f9625k == 1;
    }

    /* renamed from: e */
    public String mo9489e() {
        return this.f9619e;
    }

    /* renamed from: f */
    public int mo9490f() {
        if (this.f9621g) {
            return this.f9620f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: g */
    public boolean mo9491g() {
        return this.f9621g;
    }

    /* renamed from: h */
    public int mo9492h() {
        if (this.f9623i) {
            return this.f9622h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: i */
    public boolean mo9493i() {
        return this.f9623i;
    }

    /* renamed from: j */
    public Alignment mo9494j() {
        return this.f9630p;
    }

    /* renamed from: k */
    public int mo9495k() {
        return this.f9628n;
    }

    /* renamed from: l */
    public float mo9496l() {
        return this.f9629o;
    }
}
