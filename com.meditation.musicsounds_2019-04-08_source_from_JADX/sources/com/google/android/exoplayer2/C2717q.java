package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.q */
public abstract class C2717q {

    /* renamed from: a */
    public static final C2717q f9292a = new C2717q() {
        /* renamed from: a */
        public int mo9318a(Object obj) {
            return -1;
        }

        /* renamed from: a */
        public C2719a mo9320a(int i, C2719a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: a */
        public C2720b mo9323a(int i, C2720b bVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        /* renamed from: b */
        public int mo9325b() {
            return 0;
        }

        /* renamed from: c */
        public int mo9326c() {
            return 0;
        }
    };

    /* renamed from: com.google.android.exoplayer2.q$a */
    public static final class C2719a {

        /* renamed from: a */
        public Object f9293a;

        /* renamed from: b */
        public Object f9294b;

        /* renamed from: c */
        public int f9295c;

        /* renamed from: d */
        public long f9296d;

        /* renamed from: e */
        public boolean f9297e;

        /* renamed from: f */
        private long f9298f;

        /* renamed from: a */
        public long mo9327a() {
            return this.f9296d;
        }

        /* renamed from: a */
        public C2719a mo9328a(Object obj, Object obj2, int i, long j, long j2, boolean z) {
            this.f9293a = obj;
            this.f9294b = obj2;
            this.f9295c = i;
            this.f9296d = j;
            this.f9298f = j2;
            this.f9297e = z;
            return this;
        }

        /* renamed from: b */
        public long mo9329b() {
            return C2468b.m11602a(this.f9298f);
        }
    }

    /* renamed from: com.google.android.exoplayer2.q$b */
    public static final class C2720b {

        /* renamed from: a */
        public Object f9299a;

        /* renamed from: b */
        public long f9300b;

        /* renamed from: c */
        public long f9301c;

        /* renamed from: d */
        public boolean f9302d;

        /* renamed from: e */
        public boolean f9303e;

        /* renamed from: f */
        public int f9304f;

        /* renamed from: g */
        public int f9305g;

        /* renamed from: h */
        public long f9306h;

        /* renamed from: i */
        public long f9307i;

        /* renamed from: j */
        public long f9308j;

        /* renamed from: a */
        public long mo9330a() {
            return this.f9306h;
        }

        /* renamed from: a */
        public C2720b mo9331a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.f9299a = obj;
            this.f9300b = j;
            this.f9301c = j2;
            this.f9302d = z;
            this.f9303e = z2;
            this.f9306h = j3;
            this.f9307i = j4;
            this.f9304f = i;
            this.f9305g = i2;
            this.f9308j = j5;
            return this;
        }

        /* renamed from: b */
        public long mo9332b() {
            return C2468b.m11602a(this.f9307i);
        }

        /* renamed from: c */
        public long mo9333c() {
            return this.f9308j;
        }
    }

    /* renamed from: a */
    public abstract int mo9318a(Object obj);

    /* renamed from: a */
    public final C2719a mo9319a(int i, C2719a aVar) {
        return mo9320a(i, aVar, false);
    }

    /* renamed from: a */
    public abstract C2719a mo9320a(int i, C2719a aVar, boolean z);

    /* renamed from: a */
    public final C2720b mo9321a(int i, C2720b bVar) {
        return mo9322a(i, bVar, false);
    }

    /* renamed from: a */
    public C2720b mo9322a(int i, C2720b bVar, boolean z) {
        return mo9323a(i, bVar, z, 0);
    }

    /* renamed from: a */
    public abstract C2720b mo9323a(int i, C2720b bVar, boolean z, long j);

    /* renamed from: a */
    public final boolean mo9324a() {
        return mo9325b() == 0;
    }

    /* renamed from: b */
    public abstract int mo9325b();

    /* renamed from: c */
    public abstract int mo9326c();
}
