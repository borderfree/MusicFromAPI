package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aji {

    /* renamed from: a */
    private final int f12173a;

    /* renamed from: b */
    private final int f12174b;

    /* renamed from: c */
    private final int f12175c;

    /* renamed from: d */
    private final ajv f12176d;

    /* renamed from: e */
    private final akf f12177e;

    /* renamed from: f */
    private final Object f12178f = new Object();

    /* renamed from: g */
    private ArrayList<String> f12179g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<String> f12180h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<ajt> f12181i = new ArrayList<>();

    /* renamed from: j */
    private int f12182j = 0;

    /* renamed from: k */
    private int f12183k = 0;

    /* renamed from: l */
    private int f12184l = 0;

    /* renamed from: m */
    private int f12185m;

    /* renamed from: n */
    private String f12186n = "";

    /* renamed from: o */
    private String f12187o = "";

    /* renamed from: p */
    private String f12188p = "";

    public aji(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f12173a = i;
        this.f12174b = i2;
        this.f12175c = i3;
        this.f12176d = new ajv(i4);
        this.f12177e = new akf(i5, i6, i7);
    }

    /* renamed from: a */
    private static String m16363a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            sb.append((String) obj);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    /* renamed from: c */
    private final void m16364c(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null && str.length() >= this.f12175c) {
            synchronized (this.f12178f) {
                this.f12179g.add(str);
                this.f12182j += str.length();
                if (z) {
                    this.f12180h.add(str);
                    ArrayList<ajt> arrayList = this.f12181i;
                    ajt ajt = new ajt(f, f2, f3, f4, this.f12180h.size() - 1);
                    arrayList.add(ajt);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12005a(int i) {
        this.f12183k = i;
    }

    /* renamed from: a */
    public final void mo12006a(String str, boolean z, float f, float f2, float f3, float f4) {
        m16364c(str, z, f, f2, f3, f4);
        synchronized (this.f12178f) {
            if (this.f12184l < 0) {
                C3643iy.m19172b("ActivityContent: negative number of WebViews.");
            }
            mo12016h();
        }
    }

    /* renamed from: a */
    public final boolean mo12007a() {
        boolean z;
        synchronized (this.f12178f) {
            z = this.f12184l == 0;
        }
        return z;
    }

    /* renamed from: b */
    public final String mo12008b() {
        return this.f12186n;
    }

    /* renamed from: b */
    public final void mo12009b(String str, boolean z, float f, float f2, float f3, float f4) {
        m16364c(str, z, f, f2, f3, f4);
    }

    /* renamed from: c */
    public final String mo12010c() {
        return this.f12187o;
    }

    /* renamed from: d */
    public final String mo12011d() {
        return this.f12188p;
    }

    /* renamed from: e */
    public final void mo12012e() {
        synchronized (this.f12178f) {
            this.f12185m -= 100;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aji)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aji aji = (aji) obj;
        return aji.f12186n != null && aji.f12186n.equals(this.f12186n);
    }

    /* renamed from: f */
    public final void mo12014f() {
        synchronized (this.f12178f) {
            this.f12184l--;
        }
    }

    /* renamed from: g */
    public final void mo12015g() {
        synchronized (this.f12178f) {
            this.f12184l++;
        }
    }

    /* renamed from: h */
    public final void mo12016h() {
        synchronized (this.f12178f) {
            int i = (this.f12182j * this.f12173a) + (this.f12183k * this.f12174b);
            if (i > this.f12185m) {
                this.f12185m = i;
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12630W)).booleanValue() && !zzbv.zzeo().mo13060l().mo13104b()) {
                    this.f12186n = this.f12176d.mo12059a(this.f12179g);
                    this.f12187o = this.f12176d.mo12059a(this.f12180h);
                }
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12632Y)).booleanValue() && !zzbv.zzeo().mo13060l().mo13110d()) {
                    this.f12188p = this.f12177e.mo12069a(this.f12180h, this.f12181i);
                }
            }
        }
    }

    public final int hashCode() {
        return this.f12186n.hashCode();
    }

    /* renamed from: i */
    public final int mo12018i() {
        return this.f12185m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int mo12019j() {
        return this.f12182j;
    }

    public final String toString() {
        int i = this.f12183k;
        int i2 = this.f12185m;
        int i3 = this.f12182j;
        String a = m16363a(this.f12179g, 100);
        String a2 = m16363a(this.f12180h, 100);
        String str = this.f12186n;
        String str2 = this.f12187o;
        String str3 = this.f12188p;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 165 + String.valueOf(a2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(a);
        sb.append("\n viewableText");
        sb.append(a2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
