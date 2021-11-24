package com.facebook.ads.internal.view.p089d.p090a;

import android.support.p023v7.widget.RecyclerView.C0958w;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup.MarginLayoutParams;
import com.facebook.ads.internal.p064f.C1684a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import com.facebook.ads.internal.p077s.p078a.C1806p;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.p083t.C1838a.C1839a;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b.C1908a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.d.a.g */
class C1944g extends C0958w {

    /* renamed from: n */
    private final C1902b f6439n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final SparseBooleanArray f6440o;

    /* renamed from: p */
    private final int f6441p;

    /* renamed from: q */
    private final int f6442q;

    /* renamed from: r */
    private final int f6443r;

    /* renamed from: s */
    private final int f6444s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C1838a f6445t;

    /* renamed from: u */
    private C1839a f6446u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C1838a f6447v;

    C1944g(C1902b bVar, SparseBooleanArray sparseBooleanArray, C1838a aVar, int i, int i2, int i3, int i4) {
        super(bVar);
        this.f6439n = bVar;
        this.f6440o = sparseBooleanArray;
        this.f6447v = aVar;
        this.f6441p = i;
        this.f6442q = i2;
        this.f6443r = i3;
        this.f6444s = i4;
    }

    /* renamed from: a */
    private String m9398a(C1684a aVar, String str) {
        String a = (aVar == null || str == null) ? "" : aVar.mo6828a(str);
        return !TextUtils.isEmpty(a) ? a : str;
    }

    /* renamed from: a */
    private void m9399a(C1728c cVar, C1806p pVar, String str, final C1935b bVar) {
        if (!this.f6440o.get(bVar.mo7335b())) {
            if (this.f6445t != null) {
                this.f6445t.mo7111c();
                this.f6445t = null;
            }
            final Map a = bVar.mo7334a();
            final String str2 = str;
            final C1935b bVar2 = bVar;
            final C1806p pVar2 = pVar;
            final C1728c cVar2 = cVar;
            C19451 r1 = new C1839a() {
                /* renamed from: a */
                public void mo7113a() {
                    if (!C1944g.this.f6447v.mo7110b() && !TextUtils.isEmpty(str2) && !C1944g.this.f6440o.get(bVar2.mo7335b())) {
                        if (C1944g.this.f6445t != null) {
                            C1944g.this.f6445t.mo7108a(a);
                        }
                        a.put("touch", C1800k.m8915a(pVar2.mo7071c()));
                        cVar2.mo6939a(str2, a);
                        C1944g.this.f6440o.put(bVar2.mo7335b(), true);
                    }
                }
            };
            this.f6446u = r1;
            this.f6445t = new C1838a(this.f6439n, 10, this.f6446u);
            this.f6445t.mo7107a(100);
            this.f6445t.mo7109b(100);
            this.f6439n.setOnAssetsLoadedListener(new C1908a() {
                /* renamed from: a */
                public void mo7284a() {
                    if (bVar.mo7335b() == 0) {
                        C1944g.this.f6447v.mo7106a();
                    }
                    C1944g.this.f6445t.mo7106a();
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7356a(C1935b bVar, C1728c cVar, C1684a aVar, C1806p pVar, String str) {
        int b = bVar.mo7335b();
        this.f6439n.setTag(-1593835536, Integer.valueOf(b));
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(this.f6441p, -2);
        marginLayoutParams.setMargins(b == 0 ? this.f6442q : this.f6443r, 0, b >= this.f6444s + -1 ? this.f6442q : this.f6443r, 0);
        String g = bVar.mo7336c().mo6731c().mo6685g();
        String a = bVar.mo7336c().mo6731c().mo6678a();
        this.f6439n.setIsVideo(!TextUtils.isEmpty(a));
        if (this.f6439n.mo7263d()) {
            this.f6439n.setVideoPlaceholderUrl(g);
            this.f6439n.setVideoUrl(m9398a(aVar, a));
        } else {
            this.f6439n.setImageUrl(g);
        }
        this.f6439n.setLayoutParams(marginLayoutParams);
        this.f6439n.mo7261a(bVar.mo7336c().mo6729a().mo6699a(), bVar.mo7336c().mo6729a().mo6701c());
        this.f6439n.mo7260a(bVar.mo7336c().mo6730b(), bVar.mo7334a());
        this.f6439n.mo7262a(bVar.mo7334a());
        m9399a(cVar, pVar, str, bVar);
    }
}
