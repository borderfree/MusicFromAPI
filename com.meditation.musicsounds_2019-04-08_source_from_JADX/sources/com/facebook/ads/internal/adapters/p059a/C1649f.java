package com.facebook.ads.internal.adapters.p059a;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.a.f */
public class C1649f implements Serializable {
    private static final long serialVersionUID = -2102939945352398575L;

    /* renamed from: a */
    private final byte[] f5374a;

    /* renamed from: b */
    private final String f5375b;

    /* renamed from: c */
    private final List<String> f5376c;

    /* renamed from: d */
    private String f5377d;

    C1649f(byte[] bArr, String str, List<String> list) {
        this.f5374a = bArr;
        this.f5375b = str;
        this.f5376c = list;
    }

    /* renamed from: a */
    public String mo6715a() {
        return this.f5377d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6716a(String str) {
        this.f5377d = str;
    }

    /* renamed from: b */
    public byte[] mo6717b() {
        return this.f5374a;
    }

    /* renamed from: c */
    public String mo6718c() {
        return this.f5375b;
    }

    /* renamed from: d */
    public List<String> mo6719d() {
        return Collections.unmodifiableList(this.f5376c);
    }
}
