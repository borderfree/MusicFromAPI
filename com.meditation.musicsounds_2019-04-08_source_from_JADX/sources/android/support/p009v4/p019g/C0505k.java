package android.support.p009v4.p019g;

/* renamed from: android.support.v4.g.k */
public final class C0505k {

    /* renamed from: android.support.v4.g.k$a */
    public interface C0506a<T> {
        /* renamed from: a */
        T mo2001a();

        /* renamed from: a */
        boolean mo2002a(T t);
    }

    /* renamed from: android.support.v4.g.k$b */
    public static class C0507b<T> implements C0506a<T> {

        /* renamed from: a */
        private final Object[] f1502a;

        /* renamed from: b */
        private int f1503b;

        public C0507b(int i) {
            if (i > 0) {
                this.f1502a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: b */
        private boolean m2247b(T t) {
            for (int i = 0; i < this.f1503b; i++) {
                if (this.f1502a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public T mo2001a() {
            if (this.f1503b <= 0) {
                return null;
            }
            int i = this.f1503b - 1;
            T t = this.f1502a[i];
            this.f1502a[i] = null;
            this.f1503b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo2002a(T t) {
            if (m2247b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f1503b >= this.f1502a.length) {
                return false;
            } else {
                this.f1502a[this.f1503b] = t;
                this.f1503b++;
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.g.k$c */
    public static class C0508c<T> extends C0507b<T> {

        /* renamed from: a */
        private final Object f1504a = new Object();

        public C0508c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo2001a() {
            T a;
            synchronized (this.f1504a) {
                a = super.mo2001a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo2002a(T t) {
            boolean a;
            synchronized (this.f1504a) {
                a = super.mo2002a(t);
            }
            return a;
        }
    }
}
