package com.facebook.ads.internal.view.p089d.p090a;

import android.graphics.Rect;
import android.support.p023v7.widget.C1033ao;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.support.p023v7.widget.RecyclerView.C0946n;
import android.support.p023v7.widget.RecyclerView.C0952s;
import android.view.View;
import com.facebook.ads.internal.p083t.C1838a;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b.C1910c;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b.C1911d;
import com.facebook.ads.internal.view.component.p087a.p088a.C1902b.C1912e;
import com.facebook.ads.internal.view.p089d.p090a.C1937d.C1938a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.view.d.a.a */
public class C1931a extends C0946n {

    /* renamed from: a */
    private final LinearLayoutManager f6374a;

    /* renamed from: b */
    private final int f6375b;

    /* renamed from: c */
    private final C0952s f6376c;

    /* renamed from: d */
    private final Set<Integer> f6377d = new HashSet();

    /* renamed from: e */
    private List<C1935b> f6378e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1838a f6379f;

    /* renamed from: g */
    private boolean f6380g = true;

    /* renamed from: h */
    private C1938a f6381h;

    /* renamed from: i */
    private boolean f6382i = true;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6383j = true;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f6384k;

    /* renamed from: l */
    private int f6385l = -1;

    /* renamed from: m */
    private final C1912e f6386m = new C1912e() {

        /* renamed from: b */
        private float f6390b = 0.0f;

        /* renamed from: a */
        public float mo7288a() {
            return this.f6390b;
        }

        /* renamed from: a */
        public void mo7289a(float f) {
            this.f6390b = f;
        }
    };

    /* renamed from: n */
    private final C1910c f6387n = new C1910c() {
        /* renamed from: a */
        public void mo7285a(int i) {
            C1931a.this.m9330a(i, true);
            if (C1931a.this.m9350h()) {
                C1931a.this.m9348f();
            } else {
                C1931a.this.m9328a(i);
            }
        }
    };

    /* renamed from: o */
    private final C1911d f6388o = new C1911d() {
        /* renamed from: a */
        public void mo7286a(View view) {
            C1902b bVar = (C1902b) view;
            bVar.mo7269h();
            if (C1931a.this.f6384k) {
                C1931a.this.f6383j = true;
            }
            if (C1931a.this.f6379f.mo7110b() && ((Integer) bVar.getTag(-1593835536)).intValue() == 0) {
                C1931a.this.f6379f.mo7106a();
            }
        }

        /* renamed from: b */
        public void mo7287b(View view) {
            if (C1931a.this.f6384k) {
                C1931a.this.f6383j = false;
            }
        }
    };

    C1931a(C1936c cVar, int i, List<C1935b> list, C1838a aVar) {
        this.f6374a = cVar.getLayoutManager();
        this.f6375b = i;
        this.f6378e = list;
        this.f6379f = aVar;
        this.f6376c = new C1033ao(cVar.getContext());
        cVar.mo4144a((C0946n) this);
    }

    /* renamed from: a */
    private C1902b m9326a(int i, int i2) {
        return m9327a(i, i2, true);
    }

    /* renamed from: a */
    private C1902b m9327a(int i, int i2, boolean z) {
        C1902b bVar = null;
        while (i <= i2) {
            C1902b bVar2 = (C1902b) this.f6374a.mo4088c(i);
            if (bVar2.mo7264e()) {
                return null;
            }
            boolean a = m9335a((View) bVar2);
            if (bVar == null && bVar2.mo7263d() && a && !this.f6377d.contains(Integer.valueOf(i)) && (!z || m9342b(bVar2))) {
                bVar = bVar2;
            }
            if (bVar2.mo7263d() && !a) {
                m9330a(i, false);
            }
            i++;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9328a(int i) {
        C1902b a = m9327a(i + 1, this.f6374a.mo4110o(), false);
        if (a != null) {
            a.mo7265f();
            m9339b(((Integer) a.getTag(-1593835536)).intValue());
        }
    }

    /* renamed from: a */
    private void m9329a(int i, int i2, int i3) {
        if (m9350h() && this.f6381h != null) {
            int n = this.f6374a.mo4109n();
            if (n != -1) {
                i = n;
            } else if (i3 >= 0) {
                i = i2;
            }
            this.f6381h.mo7339a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9330a(int i, boolean z) {
        if (z) {
            this.f6377d.add(Integer.valueOf(i));
        } else {
            this.f6377d.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private static void m9331a(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.5f);
    }

    /* renamed from: a */
    private void m9332a(C1902b bVar, boolean z) {
        if (m9350h()) {
            m9331a((View) bVar, z);
        }
        if (!z && bVar.mo7264e()) {
            bVar.mo7266g();
        }
    }

    /* renamed from: a */
    private static boolean m9335a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.15f;
    }

    /* renamed from: a */
    private boolean m9336a(C1902b bVar) {
        if (!this.f6380g || !bVar.mo7263d()) {
            return false;
        }
        this.f6380g = false;
        return true;
    }

    /* renamed from: b */
    private void m9339b(int i) {
        this.f6376c.mo4543d(i);
        this.f6374a.mo4395a(this.f6376c);
    }

    /* renamed from: b */
    private void m9340b(int i, int i2) {
        while (i <= i2) {
            m9343c(i);
            i++;
        }
    }

    /* renamed from: b */
    private static boolean m9342b(C1902b bVar) {
        return ((int) (bVar.getX() + ((float) bVar.getWidth()))) <= ((int) (((float) bVar.getWidth()) * 1.3f));
    }

    /* renamed from: c */
    private void m9343c(int i) {
        C1902b bVar = (C1902b) this.f6374a.mo4088c(i);
        if (m9335a((View) bVar)) {
            m9332a(bVar, true);
        }
        if (m9336a(bVar)) {
            this.f6386m.mo7289a(((C1935b) this.f6378e.get(((Integer) bVar.getTag(-1593835536)).intValue())).mo7336c().mo6731c().mo6684f() ? 1.0f : 0.0f);
        }
    }

    /* renamed from: c */
    private void m9344c(int i, int i2) {
        m9347d(i);
        m9347d(i2);
    }

    /* renamed from: d */
    private void m9347d(int i) {
        C1902b bVar = (C1902b) this.f6374a.mo4088c(i);
        if (!m9335a((View) bVar)) {
            m9332a(bVar, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9348f() {
        int n = this.f6374a.mo4109n();
        if (n != -1 && n < this.f6378e.size() - 1) {
            m9339b(n + 1);
        }
    }

    /* renamed from: g */
    private void m9349g() {
        if (this.f6383j) {
            C1902b a = m9326a(this.f6374a.mo4108m(), this.f6374a.mo4110o());
            if (a != null) {
                a.mo7265f();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m9350h() {
        return this.f6375b == 1;
    }

    /* renamed from: a */
    public void mo7328a() {
        this.f6385l = -1;
        int o = this.f6374a.mo4110o();
        for (int m = this.f6374a.mo4108m(); m <= o; m++) {
            C1902b bVar = (C1902b) this.f6374a.mo4088c(m);
            if (bVar.mo7264e()) {
                this.f6385l = m;
                bVar.mo7266g();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo4485a(RecyclerView recyclerView, int i) {
        super.mo4485a(recyclerView, i);
        if (i == 0) {
            this.f6384k = true;
            m9349g();
        }
    }

    /* renamed from: a */
    public void mo4486a(RecyclerView recyclerView, int i, int i2) {
        super.mo4486a(recyclerView, i, i2);
        this.f6384k = false;
        if (this.f6382i) {
            this.f6384k = true;
            m9349g();
            this.f6382i = false;
        }
        int m = this.f6374a.mo4108m();
        int o = this.f6374a.mo4110o();
        m9344c(m, o);
        m9340b(m, o);
        m9329a(m, o, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7329a(C1938a aVar) {
        this.f6381h = aVar;
    }

    /* renamed from: b */
    public void mo7330b() {
        C1902b bVar = (C1902b) this.f6374a.mo4088c(this.f6385l);
        if (this.f6385l >= 0) {
            bVar.mo7265f();
        }
    }

    /* renamed from: c */
    public C1912e mo7331c() {
        return this.f6386m;
    }

    /* renamed from: d */
    public C1910c mo7332d() {
        return this.f6387n;
    }

    /* renamed from: e */
    public C1911d mo7333e() {
        return this.f6388o;
    }
}
