package com.seattleclouds.modules.calendar;

import java.util.Date;

/* renamed from: com.seattleclouds.modules.calendar.h */
public class C5522h {

    /* renamed from: a */
    private int f19642a;

    /* renamed from: b */
    private C5522h f19643b;

    /* renamed from: c */
    private long f19644c;

    /* renamed from: d */
    private String f19645d;

    /* renamed from: e */
    private String f19646e;

    /* renamed from: f */
    private String f19647f;

    /* renamed from: g */
    private String f19648g;

    /* renamed from: h */
    private String f19649h;

    /* renamed from: i */
    private String f19650i;

    /* renamed from: j */
    private Date f19651j;

    /* renamed from: k */
    private Date f19652k;

    /* renamed from: l */
    private boolean f19653l;

    /* renamed from: m */
    private boolean f19654m;

    public C5522h() {
        this.f19642a = 1;
    }

    public C5522h(int i, C5522h hVar, long j, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, boolean z, boolean z2) {
        this.f19642a = 1;
        this.f19642a = i;
        this.f19643b = hVar;
        this.f19644c = j;
        this.f19645d = str;
        this.f19646e = str2;
        this.f19647f = str3;
        this.f19648g = str4;
        this.f19649h = str5;
        this.f19650i = str6;
        this.f19651j = date;
        this.f19652k = date2;
        this.f19653l = z;
        this.f19654m = z2;
    }

    public C5522h(C5522h hVar) {
        this(hVar.mo17875a(), hVar.mo17882b(), hVar.mo17886c(), hVar.mo17888d(), hVar.mo17890e(), hVar.mo17892f(), hVar.mo17894g(), hVar.mo17895h(), hVar.mo17896i(), hVar.mo17897j(), hVar.mo17898k(), hVar.mo17899l(), hVar.mo17900m());
    }

    /* renamed from: a */
    public int mo17875a() {
        return this.f19642a;
    }

    /* renamed from: a */
    public void mo17876a(int i) {
        this.f19642a = i;
    }

    /* renamed from: a */
    public void mo17877a(long j) {
        this.f19644c = j;
    }

    /* renamed from: a */
    public void mo17878a(C5522h hVar) {
        this.f19643b = hVar;
    }

    /* renamed from: a */
    public void mo17879a(String str) {
        this.f19645d = str;
    }

    /* renamed from: a */
    public void mo17880a(Date date) {
        this.f19651j = date;
    }

    /* renamed from: a */
    public void mo17881a(boolean z) {
        this.f19653l = z;
    }

    /* renamed from: b */
    public C5522h mo17882b() {
        return this.f19643b;
    }

    /* renamed from: b */
    public void mo17883b(String str) {
        this.f19646e = str;
    }

    /* renamed from: b */
    public void mo17884b(Date date) {
        this.f19652k = date;
    }

    /* renamed from: b */
    public void mo17885b(boolean z) {
        this.f19654m = z;
    }

    /* renamed from: c */
    public long mo17886c() {
        return this.f19644c;
    }

    /* renamed from: c */
    public void mo17887c(String str) {
        this.f19647f = str;
    }

    /* renamed from: d */
    public String mo17888d() {
        return this.f19645d;
    }

    /* renamed from: d */
    public void mo17889d(String str) {
        this.f19648g = str;
    }

    /* renamed from: e */
    public String mo17890e() {
        return this.f19646e;
    }

    /* renamed from: e */
    public void mo17891e(String str) {
        this.f19649h = str;
    }

    /* renamed from: f */
    public String mo17892f() {
        return this.f19647f;
    }

    /* renamed from: f */
    public void mo17893f(String str) {
        this.f19650i = str;
    }

    /* renamed from: g */
    public String mo17894g() {
        return this.f19648g;
    }

    /* renamed from: h */
    public String mo17895h() {
        return this.f19649h;
    }

    /* renamed from: i */
    public String mo17896i() {
        return this.f19650i;
    }

    /* renamed from: j */
    public Date mo17897j() {
        return this.f19651j;
    }

    /* renamed from: k */
    public Date mo17898k() {
        return this.f19652k;
    }

    /* renamed from: l */
    public boolean mo17899l() {
        return this.f19653l;
    }

    /* renamed from: m */
    public boolean mo17900m() {
        return this.f19654m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("title=");
        sb.append(this.f19646e);
        sb.append(" date=");
        sb.append(this.f19651j);
        return sb.toString();
    }
}
