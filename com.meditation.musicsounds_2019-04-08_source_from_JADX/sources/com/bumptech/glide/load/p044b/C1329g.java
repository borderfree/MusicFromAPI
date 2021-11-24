package com.bumptech.glide.load.p044b;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p040g.C1257i;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.b.g */
public class C1329g implements C1375c {

    /* renamed from: b */
    private final C1330h f4557b;

    /* renamed from: c */
    private final URL f4558c;

    /* renamed from: d */
    private final String f4559d;

    /* renamed from: e */
    private String f4560e;

    /* renamed from: f */
    private URL f4561f;

    /* renamed from: g */
    private volatile byte[] f4562g;

    /* renamed from: h */
    private int f4563h;

    public C1329g(String str) {
        this(str, C1330h.f4565b);
    }

    public C1329g(String str, C1330h hVar) {
        this.f4558c = null;
        this.f4559d = C1257i.m6693a(str);
        this.f4557b = (C1330h) C1257i.m6691a(hVar);
    }

    public C1329g(URL url) {
        this(url, C1330h.f4565b);
    }

    public C1329g(URL url, C1330h hVar) {
        this.f4558c = (URL) C1257i.m6691a(url);
        this.f4559d = null;
        this.f4557b = (C1330h) C1257i.m6691a(hVar);
    }

    /* renamed from: d */
    private URL m6930d() {
        if (this.f4561f == null) {
            this.f4561f = new URL(m6931e());
        }
        return this.f4561f;
    }

    /* renamed from: e */
    private String m6931e() {
        if (TextUtils.isEmpty(this.f4560e)) {
            String str = this.f4559d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C1257i.m6691a(this.f4558c)).toString();
            }
            this.f4560e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f4560e;
    }

    /* renamed from: f */
    private byte[] m6932f() {
        if (this.f4562g == null) {
            this.f4562g = mo6011c().getBytes(f4627a);
        }
        return this.f4562g;
    }

    /* renamed from: a */
    public URL mo6009a() {
        return m6930d();
    }

    /* renamed from: a */
    public void mo5844a(MessageDigest messageDigest) {
        messageDigest.update(m6932f());
    }

    /* renamed from: b */
    public Map<String, String> mo6010b() {
        return this.f4557b.mo6013a();
    }

    /* renamed from: c */
    public String mo6011c() {
        return this.f4559d != null ? this.f4559d : ((URL) C1257i.m6691a(this.f4558c)).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1329g)) {
            return false;
        }
        C1329g gVar = (C1329g) obj;
        return mo6011c().equals(gVar.mo6011c()) && this.f4557b.equals(gVar.f4557b);
    }

    public int hashCode() {
        if (this.f4563h == 0) {
            this.f4563h = mo6011c().hashCode();
            this.f4563h = (this.f4563h * 31) + this.f4557b.hashCode();
        }
        return this.f4563h;
    }

    public String toString() {
        return mo6011c();
    }
}
