package com.pollfish.p145a;

import com.pollfish.p150f.C5162b;

/* renamed from: com.pollfish.a.e */
public class C5110e {

    /* renamed from: a */
    private int f18251a;

    /* renamed from: b */
    private String f18252b;

    /* renamed from: c */
    private String f18253c;

    /* renamed from: d */
    private String f18254d;

    /* renamed from: e */
    private String f18255e;

    /* renamed from: f */
    private boolean f18256f;

    /* renamed from: g */
    private boolean f18257g;

    /* renamed from: h */
    private boolean f18258h = false;

    /* renamed from: i */
    private boolean f18259i = false;

    public C5110e(int i, String str, String str2, boolean z, String str3, boolean z2, boolean z3, String str4, boolean z4) {
        this.f18251a = i;
        this.f18252b = str;
        this.f18253c = str2;
        this.f18257g = z;
        this.f18254d = str3;
        this.f18258h = z2;
        this.f18256f = z3;
        this.f18255e = str4;
        this.f18259i = z4;
        StringBuilder sb = new StringBuilder();
        sb.append("ServerResponse with status:");
        sb.append(this.f18251a);
        sb.append(" from server url: ");
        sb.append(str2);
        sb.append(" with saveAtQueue: ");
        sb.append(z);
        sb.append(" and timestamp: ");
        sb.append(str3);
        sb.append(" and fromOfflineQueue: ");
        sb.append(z2);
        sb.append(" hasAcceptedTerms:");
        sb.append(z3);
        sb.append(" allowedData:");
        sb.append(str4);
        sb.append(" timeOutHappened: ");
        sb.append(z4);
        C5162b.m25518a("ServerResponse", sb.toString());
    }

    /* renamed from: a */
    public int mo16659a() {
        return this.f18251a;
    }

    /* renamed from: b */
    public String mo16660b() {
        return this.f18252b;
    }

    /* renamed from: c */
    public String mo16661c() {
        return this.f18253c;
    }

    /* renamed from: d */
    public String mo16662d() {
        return this.f18254d;
    }

    /* renamed from: e */
    public boolean mo16663e() {
        return this.f18258h;
    }

    /* renamed from: f */
    public boolean mo16664f() {
        return this.f18256f;
    }

    /* renamed from: g */
    public String mo16665g() {
        return this.f18255e;
    }

    /* renamed from: h */
    public boolean mo16666h() {
        return this.f18259i;
    }
}
