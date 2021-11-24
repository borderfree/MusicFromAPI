package android.support.p009v4.p017e;

import android.support.p009v4.p019g.C0509l;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.e.a */
public final class C0463a {

    /* renamed from: a */
    private final String f1390a;

    /* renamed from: b */
    private final String f1391b;

    /* renamed from: c */
    private final String f1392c;

    /* renamed from: d */
    private final List<List<byte[]>> f1393d;

    /* renamed from: e */
    private final int f1394e = 0;

    /* renamed from: f */
    private final String f1395f;

    public C0463a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1390a = (String) C0509l.m2252a(str);
        this.f1391b = (String) C0509l.m2252a(str2);
        this.f1392c = (String) C0509l.m2252a(str3);
        this.f1393d = (List) C0509l.m2252a(list);
        StringBuilder sb = new StringBuilder(this.f1390a);
        sb.append("-");
        sb.append(this.f1391b);
        sb.append("-");
        sb.append(this.f1392c);
        this.f1395f = sb.toString();
    }

    /* renamed from: a */
    public String mo1848a() {
        return this.f1390a;
    }

    /* renamed from: b */
    public String mo1849b() {
        return this.f1391b;
    }

    /* renamed from: c */
    public String mo1850c() {
        return this.f1392c;
    }

    /* renamed from: d */
    public List<List<byte[]>> mo1851d() {
        return this.f1393d;
    }

    /* renamed from: e */
    public int mo1852e() {
        return this.f1394e;
    }

    /* renamed from: f */
    public String mo1853f() {
        return this.f1395f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.f1390a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.f1391b);
        sb2.append(", mQuery: ");
        sb2.append(this.f1392c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.f1393d.size(); i++) {
            sb.append(" [");
            List list = (List) this.f1393d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.f1394e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
