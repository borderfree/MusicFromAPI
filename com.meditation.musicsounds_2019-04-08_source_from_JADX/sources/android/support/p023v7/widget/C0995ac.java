package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.ac */
class C0995ac {

    /* renamed from: a */
    final C0997b f3413a;

    /* renamed from: b */
    final C0996a f3414b = new C0996a();

    /* renamed from: c */
    final List<View> f3415c = new ArrayList();

    /* renamed from: android.support.v7.widget.ac$a */
    static class C0996a {

        /* renamed from: a */
        long f3416a = 0;

        /* renamed from: b */
        C0996a f3417b;

        C0996a() {
        }

        /* renamed from: b */
        private void m5432b() {
            if (this.f3417b == null) {
                this.f3417b = new C0996a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4963a() {
            this.f3416a = 0;
            if (this.f3417b != null) {
                this.f3417b.mo4963a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4964a(int i) {
            if (i >= 64) {
                m5432b();
                this.f3417b.mo4964a(i - 64);
                return;
            }
            this.f3416a |= 1 << i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4965a(int i, boolean z) {
            if (i >= 64) {
                m5432b();
                this.f3417b.mo4965a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3416a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            this.f3416a = (this.f3416a & j) | (((j ^ -1) & this.f3416a) << 1);
            if (z) {
                mo4964a(i);
            } else {
                mo4966b(i);
            }
            if (z2 || this.f3417b != null) {
                m5432b();
                this.f3417b.mo4965a(0, z2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4966b(int i) {
            if (i < 64) {
                this.f3416a &= (1 << i) ^ -1;
            } else if (this.f3417b != null) {
                this.f3417b.mo4966b(i - 64);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo4967c(int i) {
            if (i >= 64) {
                m5432b();
                return this.f3417b.mo4967c(i - 64);
            }
            return (this.f3416a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo4968d(int i) {
            if (i >= 64) {
                m5432b();
                return this.f3417b.mo4968d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3416a & j) != 0;
            this.f3416a &= j ^ -1;
            long j2 = j - 1;
            this.f3416a = (this.f3416a & j2) | Long.rotateRight((j2 ^ -1) & this.f3416a, 1);
            if (this.f3417b != null) {
                if (this.f3417b.mo4967c(0)) {
                    mo4964a(63);
                }
                this.f3417b.mo4968d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo4969e(int i) {
            return this.f3417b == null ? i >= 64 ? Long.bitCount(this.f3416a) : Long.bitCount(this.f3416a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3416a & ((1 << i) - 1)) : this.f3417b.mo4969e(i - 64) + Long.bitCount(this.f3416a);
        }

        public String toString() {
            if (this.f3417b == null) {
                return Long.toBinaryString(this.f3416a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f3417b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f3416a));
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.ac$b */
    interface C0997b {
        /* renamed from: a */
        int mo4297a();

        /* renamed from: a */
        int mo4298a(View view);

        /* renamed from: a */
        void mo4299a(int i);

        /* renamed from: a */
        void mo4300a(View view, int i);

        /* renamed from: a */
        void mo4301a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C0958w mo4302b(View view);

        /* renamed from: b */
        View mo4303b(int i);

        /* renamed from: b */
        void mo4304b();

        /* renamed from: c */
        void mo4305c(int i);

        /* renamed from: c */
        void mo4306c(View view);

        /* renamed from: d */
        void mo4307d(View view);
    }

    C0995ac(C0997b bVar) {
        this.f3413a = bVar;
    }

    /* renamed from: f */
    private int m5412f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f3413a.mo4297a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f3414b.mo4969e(i2));
            if (e == 0) {
                while (this.f3414b.mo4967c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* renamed from: g */
    private void m5413g(View view) {
        this.f3415c.add(view);
        this.f3413a.mo4306c(view);
    }

    /* renamed from: h */
    private boolean m5414h(View view) {
        if (!this.f3415c.remove(view)) {
            return false;
        }
        this.f3413a.mo4307d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4945a() {
        this.f3414b.mo4963a();
        for (int size = this.f3415c.size() - 1; size >= 0; size--) {
            this.f3413a.mo4307d((View) this.f3415c.get(size));
            this.f3415c.remove(size);
        }
        this.f3413a.mo4304b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4946a(int i) {
        int f = m5412f(i);
        View b = this.f3413a.mo4303b(f);
        if (b != null) {
            if (this.f3414b.mo4968d(f)) {
                m5414h(b);
            }
            this.f3413a.mo4299a(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4947a(View view) {
        int a = this.f3413a.mo4298a(view);
        if (a >= 0) {
            if (this.f3414b.mo4968d(a)) {
                m5414h(view);
            }
            this.f3413a.mo4299a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4948a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f3413a.mo4297a() : m5412f(i);
        this.f3414b.mo4965a(a, z);
        if (z) {
            m5413g(view);
        }
        this.f3413a.mo4301a(view, a, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4949a(View view, int i, boolean z) {
        int a = i < 0 ? this.f3413a.mo4297a() : m5412f(i);
        this.f3414b.mo4965a(a, z);
        if (z) {
            m5413g(view);
        }
        this.f3413a.mo4300a(view, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4950a(View view, boolean z) {
        mo4949a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4951b() {
        return this.f3413a.mo4297a() - this.f3415c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4952b(View view) {
        int a = this.f3413a.mo4298a(view);
        if (a != -1 && !this.f3414b.mo4967c(a)) {
            return a - this.f3414b.mo4969e(a);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4953b(int i) {
        return this.f3413a.mo4303b(m5412f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4954c() {
        return this.f3413a.mo4297a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo4955c(int i) {
        int size = this.f3415c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f3415c.get(i2);
            C0958w b = this.f3413a.mo4302b(view);
            if (b.mo4584d() == i && !b.mo4594n() && !b.mo4597q()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4956c(View view) {
        return this.f3415c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo4957d(int i) {
        return this.f3413a.mo4303b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4958d(View view) {
        int a = this.f3413a.mo4298a(view);
        if (a >= 0) {
            this.f3414b.mo4964a(a);
            m5413g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4959e(int i) {
        int f = m5412f(i);
        this.f3414b.mo4968d(f);
        this.f3413a.mo4305c(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4960e(View view) {
        int a = this.f3413a.mo4298a(view);
        if (a < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f3414b.mo4967c(a)) {
            this.f3414b.mo4966b(a);
            m5414h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4961f(View view) {
        int a = this.f3413a.mo4298a(view);
        if (a == -1) {
            m5414h(view);
            return true;
        } else if (!this.f3414b.mo4967c(a)) {
            return false;
        } else {
            this.f3414b.mo4968d(a);
            m5414h(view);
            this.f3413a.mo4299a(a);
            return true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3414b.toString());
        sb.append(", hidden list:");
        sb.append(this.f3415c.size());
        return sb.toString();
    }
}
