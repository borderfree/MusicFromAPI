package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.internal.ads.ub */
public class C3944ub extends auc<String> {

    /* renamed from: a */
    private final Object f14963a = new Object();

    /* renamed from: b */
    private bcg<String> f14964b;

    public C3944ub(int i, String str, bcg<String> bcg, bbf bbf) {
        super(i, str, bbf);
        this.f14964b = bcg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bae<String> mo12491a(asc asc) {
        String str;
        try {
            byte[] bArr = asc.f13058b;
            String str2 = "ISO-8859-1";
            String str3 = (String) asc.f13059c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";");
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(asc.f13058b);
        }
        return bae.m17737a(str, C3781oa.m19263a(asc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12495a(String str) {
        bcg<String> bcg;
        synchronized (this.f14963a) {
            bcg = this.f14964b;
        }
        if (bcg != null) {
            bcg.mo12789a(str);
        }
    }
}
