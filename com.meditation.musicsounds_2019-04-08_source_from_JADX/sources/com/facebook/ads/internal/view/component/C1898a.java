package com.facebook.ads.internal.view.component;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1648e;
import com.facebook.ads.internal.p058a.C1627b;
import com.facebook.ads.internal.p058a.C1628c;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a */
public class C1898a extends C1922b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f6261b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1838a f6262c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1806p f6263d;

    /* renamed from: e */
    private final C1728c f6264e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1845a f6265f;

    public C1898a(Context context, boolean z, boolean z2, String str, C1647d dVar, C1728c cVar, C1845a aVar, C1838a aVar2, C1806p pVar) {
        super(context, z, z2, dVar);
        this.f6264e = cVar;
        this.f6265f = aVar;
        this.f6261b = str;
        this.f6262c = aVar2;
        this.f6263d = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C1627b m9212a(Uri uri, String str, Map<String, String> map, boolean z) {
        return C1628c.m8175a(getContext(), this.f6264e, str, uri, map, z);
    }

    /* renamed from: a */
    private void m9215a(String str, String str2, String str3, Map<String, String> map, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f6264e == null) {
            setVisibility(8);
            return;
        }
        setText(str);
        final String str4 = str2;
        final Map<String, String> map2 = map;
        final String str5 = str3;
        final boolean z2 = z;
        C18991 r1 = new OnClickListener() {
            public void onClick(View view) {
                String str;
                String str2;
                if (!C1713a.m8573d(C1898a.this.getContext()) || C1898a.this.f6263d.mo7070b()) {
                    try {
                        Uri parse = Uri.parse(str4);
                        C1898a.this.f6262c.mo7108a(map2);
                        map2.put("touch", C1800k.m8915a(C1898a.this.f6263d.mo7071c()));
                        C1627b a = C1898a.this.m9212a(parse, str5, map2, z2);
                        if (a != null) {
                            a.mo6655b();
                        }
                        if (C1898a.this.f6265f != null) {
                            C1898a.this.f6265f.mo6645a(C1898a.this.f6261b);
                        }
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        str2 = String.valueOf(C1898a.class);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while opening ");
                        sb.append(str4);
                        str = sb.toString();
                        Log.e(str2, str, e);
                    } catch (Exception e2) {
                        e = e2;
                        str2 = String.valueOf(C1898a.class);
                        str = "Error executing action";
                        Log.e(str2, str, e);
                    }
                }
            }
        };
        setOnClickListener(r1);
    }

    /* renamed from: a */
    public void mo7252a(C1648e eVar, String str, Map<String, String> map) {
        m9215a(eVar.mo6714b(), eVar.mo6713a(), str, map, false);
    }

    /* renamed from: a */
    public void mo7253a(C1648e eVar, String str, Map<String, String> map, boolean z) {
        m9215a(eVar.mo6714b(), eVar.mo6713a(), str, map, z);
    }

    /* renamed from: b */
    public void mo7254b(C1648e eVar, String str, Map<String, String> map) {
        Uri parse = Uri.parse(eVar.mo6713a());
        this.f6262c.mo7108a(map);
        map.put("touch", C1800k.m8915a(this.f6263d.mo7071c()));
        C1627b a = m9212a(parse, str, map, false);
        if (a != null) {
            a.mo6656c();
        }
    }
}
