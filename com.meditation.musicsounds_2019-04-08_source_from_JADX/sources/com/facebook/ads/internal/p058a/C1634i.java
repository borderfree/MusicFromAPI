package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p080c.C1830g;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.i */
class C1634i extends C1633h {

    /* renamed from: e */
    private static final String f5312e = "i";

    /* renamed from: f */
    private final Uri f5313f;

    /* renamed from: g */
    private final Map<String, String> f5314g;

    C1634i(Context context, C1728c cVar, String str, Uri uri, Map<String, String> map, C1637l lVar) {
        super(context, cVar, str, lVar);
        this.f5313f = uri;
        this.f5314g = map;
    }

    /* renamed from: a */
    public C1715a mo6654a() {
        return C1715a.OPEN_LINK;
    }

    /* renamed from: c */
    public C1626a mo6656c() {
        try {
            C1830g.m8990a(new C1830g(), this.f5293a, Uri.parse(this.f5313f.getQueryParameter("link")), this.f5295c);
            return null;
        } catch (Exception e) {
            String str = f5312e;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open link url: ");
            sb.append(this.f5313f.toString());
            Log.d(str, sb.toString(), e);
            return C1626a.CANNOT_OPEN;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6659f() {
        mo6663a(this.f5314g, mo6656c());
    }
}
