package com.bumptech.glide.load.engine.p047b;

import android.support.p009v4.p019g.C0505k.C0506a;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p040g.C1254f;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.p040g.p041a.C1238a;
import com.bumptech.glide.p040g.p041a.C1238a.C1242a;
import com.bumptech.glide.p040g.p041a.C1238a.C1244c;
import com.bumptech.glide.p040g.p041a.C1247c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.b.j */
public class C1436j {

    /* renamed from: a */
    private final C1254f<C1375c, String> f4777a = new C1254f<>(1000);

    /* renamed from: b */
    private final C0506a<C1438a> f4778b = C1238a.m6646b(10, new C1242a<C1438a>() {
        /* renamed from: a */
        public C1438a mo5874b() {
            try {
                return new C1438a(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    /* renamed from: com.bumptech.glide.load.engine.b.j$a */
    private static final class C1438a implements C1244c {

        /* renamed from: a */
        final MessageDigest f4780a;

        /* renamed from: b */
        private final C1247c f4781b = C1247c.m6662a();

        C1438a(MessageDigest messageDigest) {
            this.f4780a = messageDigest;
        }

        /* renamed from: c_ */
        public C1247c mo5876c_() {
            return this.f4781b;
        }
    }

    /* renamed from: b */
    private String m7285b(C1375c cVar) {
        C1438a aVar = (C1438a) C1257i.m6691a(this.f4778b.mo2001a());
        try {
            cVar.mo5844a(aVar.f4780a);
            return C1258j.m6703a(aVar.f4780a.digest());
        } finally {
            this.f4778b.mo2002a(aVar);
        }
    }

    /* renamed from: a */
    public String mo6195a(C1375c cVar) {
        String str;
        synchronized (this.f4777a) {
            str = (String) this.f4777a.mo5900b(cVar);
        }
        if (str == null) {
            str = m7285b(cVar);
        }
        synchronized (this.f4777a) {
            this.f4777a.mo5901b(cVar, str);
        }
        return str;
    }
}
