package com.seattleclouds.modules.p181p;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.p.d */
public class C6007d {

    /* renamed from: a */
    private static C6007d f21337a;

    /* renamed from: b */
    private C6003b f21338b;

    /* renamed from: c */
    private int f21339c;

    /* renamed from: d */
    private int f21340d;

    /* renamed from: e */
    private int f21341e;

    /* renamed from: f */
    private int f21342f;

    /* renamed from: g */
    private Boolean f21343g;

    /* renamed from: h */
    private ArrayList<C6003b> f21344h;

    /* renamed from: i */
    private ArrayList<C6003b> f21345i;

    /* renamed from: j */
    private String f21346j;

    /* renamed from: k */
    private String f21347k;

    /* renamed from: l */
    private int f21348l;

    public C6007d(Context context) {
    }

    /* renamed from: a */
    public static C6007d m29468a(Context context) {
        if (f21337a == null && context != null) {
            f21337a = new C6007d(context);
        }
        return f21337a;
    }

    /* renamed from: a */
    public void mo18987a() {
        C6003b bVar;
        int i;
        if (this.f21345i.size() > 0) {
            int size = this.f21345i.size();
            if (this.f21343g.booleanValue()) {
                double random = Math.random();
                double d = (double) size;
                Double.isNaN(d);
                i = (int) (random * d);
            } else {
                i = 0;
            }
            this.f21348l = i;
            bVar = (C6003b) this.f21345i.get(i);
        } else {
            bVar = null;
        }
        this.f21338b = bVar;
    }

    /* renamed from: a */
    public void mo18988a(Boolean bool) {
        this.f21343g = bool;
    }

    /* renamed from: a */
    public void mo18989a(String str) {
        this.f21346j = str;
    }

    /* renamed from: a */
    public void mo18990a(ArrayList<C6003b> arrayList) {
        this.f21344h = arrayList;
    }

    /* renamed from: a */
    public boolean mo18991a(int i) {
        if (this.f21338b != null) {
            return ((C6002a) this.f21338b.mo18982g().get(i)).mo18967b().booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public void mo18992b() {
        if (this.f21345i.size() > 0) {
            this.f21345i.remove(this.f21348l);
        }
        mo18987a();
    }

    /* renamed from: b */
    public void mo18993b(int i) {
        this.f21339c += i;
    }

    /* renamed from: b */
    public void mo18994b(String str) {
        this.f21347k = str;
    }

    /* renamed from: c */
    public void mo18995c() {
        this.f21345i = new ArrayList<>(this.f21344h);
        mo18987a();
    }

    /* renamed from: c */
    public void mo18996c(int i) {
        this.f21342f = i;
    }

    /* renamed from: d */
    public void mo18997d() {
        this.f21339c = 0;
        this.f21340d = 0;
        this.f21345i = new ArrayList<>();
    }

    /* renamed from: d */
    public void mo18998d(int i) {
        this.f21341e = i;
    }

    /* renamed from: e */
    public C6003b mo18999e() {
        return this.f21338b;
    }

    /* renamed from: f */
    public int mo19000f() {
        return this.f21339c;
    }

    /* renamed from: g */
    public void mo19001g() {
        this.f21342f++;
    }

    /* renamed from: h */
    public int mo19002h() {
        return this.f21342f;
    }

    /* renamed from: i */
    public int mo19003i() {
        return this.f21341e;
    }

    /* renamed from: j */
    public String mo19004j() {
        return this.f21346j;
    }

    /* renamed from: k */
    public String mo19005k() {
        return this.f21347k;
    }
}
