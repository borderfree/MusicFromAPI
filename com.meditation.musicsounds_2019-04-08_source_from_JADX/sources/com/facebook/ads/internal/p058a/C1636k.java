package com.facebook.ads.internal.p058a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p080c.C1830g;

/* renamed from: com.facebook.ads.internal.a.k */
public class C1636k extends C1627b {

    /* renamed from: d */
    private static final String f5318d = "k";

    /* renamed from: e */
    private final Uri f5319e;

    public C1636k(Context context, C1728c cVar, String str, Uri uri) {
        super(context, cVar, str);
        this.f5319e = uri;
    }

    /* renamed from: a */
    public C1715a mo6654a() {
        return C1715a.OPEN_LINK;
    }

    /* renamed from: b */
    public void mo6655b() {
        try {
            Log.w("REDIRECTACTION: ", this.f5319e.toString());
            C1830g.m8990a(new C1830g(), this.f5293a, this.f5319e, this.f5295c);
        } catch (Exception e) {
            String str = f5318d;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open link url: ");
            sb.append(this.f5319e.toString());
            Log.d(str, sb.toString(), e);
        }
    }
}
