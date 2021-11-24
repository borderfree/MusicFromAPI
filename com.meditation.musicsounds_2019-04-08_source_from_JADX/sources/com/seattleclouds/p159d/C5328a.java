package com.seattleclouds.p159d;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.seattleclouds.d.a */
public class C5328a {

    /* renamed from: a */
    private String f19093a = "Product Name";

    /* renamed from: b */
    private String f19094b = "Product Name";

    /* renamed from: c */
    private String f19095c = "";

    /* renamed from: d */
    private String f19096d = "";

    /* renamed from: e */
    private String f19097e = "";

    /* renamed from: f */
    private String f19098f = "";

    /* renamed from: g */
    private double f19099g = 0.0d;

    /* renamed from: h */
    private double f19100h = 0.99d;

    /* renamed from: i */
    private ArrayList<C5329b> f19101i = new ArrayList<>(0);

    /* renamed from: k */
    private void mo17521k() {
        this.f19099g = 0.0d;
        Iterator it = this.f19101i.iterator();
        while (it.hasNext()) {
            this.f19099g += ((C5329b) it.next()).mo17511i();
        }
    }

    /* renamed from: a */
    public C5329b mo17484a(int i) {
        return (C5329b) this.f19101i.get(i);
    }

    /* renamed from: a */
    public String mo17485a() {
        return this.f19094b;
    }

    /* renamed from: a */
    public void mo17486a(double d) {
        this.f19100h = d;
    }

    /* renamed from: a */
    public void mo17487a(C5329b bVar) {
        if (bVar != null) {
            this.f19101i.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo17488a(String str) {
        this.f19094b = str;
    }

    /* renamed from: a */
    public void mo17489a(ArrayList<C5329b> arrayList) {
        if (arrayList != null) {
            this.f19101i = arrayList;
        }
    }

    /* renamed from: b */
    public double mo17490b() {
        return this.f19100h;
    }

    /* renamed from: b */
    public void mo17491b(String str) {
        this.f19093a = str;
    }

    /* renamed from: c */
    public double mo17492c() {
        mo17521k();
        return this.f19100h + this.f19099g;
    }

    /* renamed from: c */
    public void mo17493c(String str) {
        this.f19096d = str;
    }

    /* renamed from: d */
    public ArrayList<C5329b> mo17494d() {
        return this.f19101i;
    }

    /* renamed from: d */
    public void mo17495d(String str) {
        this.f19098f = str;
    }

    /* renamed from: e */
    public int mo17496e() {
        return this.f19101i.size();
    }

    /* renamed from: e */
    public void mo17497e(String str) {
        this.f19097e = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C5328a aVar = (C5328a) C5328a.class.cast(obj);
        if (this.f19093a.compareTo(aVar.mo17499f()) != 0 || this.f19094b.compareTo(aVar.mo17485a()) != 0 || this.f19100h != aVar.mo17490b() || !this.f19096d.equalsIgnoreCase(aVar.mo17501g()) || !this.f19098f.equalsIgnoreCase(aVar.mo17502h()) || !this.f19097e.equalsIgnoreCase(aVar.mo17504i()) || !this.f19095c.equalsIgnoreCase(aVar.mo17505j()) || this.f19101i.size() != aVar.mo17494d().size()) {
            return false;
        }
        int size = this.f19101i.size();
        ArrayList d = aVar.mo17494d();
        for (int i = 0; i < size; i++) {
            if (!((C5329b) this.f19101i.get(i)).equals(d.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public String mo17499f() {
        return this.f19093a;
    }

    /* renamed from: f */
    public void mo17500f(String str) {
        this.f19095c = str;
    }

    /* renamed from: g */
    public String mo17501g() {
        return this.f19096d;
    }

    /* renamed from: h */
    public String mo17502h() {
        return this.f19098f;
    }

    public int hashCode() {
        Iterator it = this.f19101i.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C5329b) it.next()).hashCode();
        }
        return i + this.f19093a.hashCode() + this.f19096d.hashCode() + this.f19098f.hashCode() + this.f19094b.hashCode() + this.f19097e.hashCode() + this.f19095c.hashCode() + ((int) this.f19100h);
    }

    /* renamed from: i */
    public String mo17504i() {
        return this.f19097e;
    }

    /* renamed from: j */
    public String mo17505j() {
        return this.f19095c;
    }
}
