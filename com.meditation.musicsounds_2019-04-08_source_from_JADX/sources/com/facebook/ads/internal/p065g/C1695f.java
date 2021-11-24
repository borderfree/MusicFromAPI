package com.facebook.ads.internal.p065g;

/* renamed from: com.facebook.ads.internal.g.f */
public abstract class C1695f<T> {

    /* renamed from: a */
    private C1696a f5584a;

    /* renamed from: com.facebook.ads.internal.g.f$a */
    public enum C1696a {
        UNKNOWN(9000, "An unknown error has occurred."),
        DATABASE_SELECT(3001, "Failed to read from database."),
        DATABASE_INSERT(3002, "Failed to insert row into database."),
        DATABASE_UPDATE(3003, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");
        

        /* renamed from: f */
        private final int f5591f;

        /* renamed from: g */
        private final String f5592g;

        private C1696a(int i, String str) {
            this.f5591f = i;
            this.f5592g = str;
        }

        /* renamed from: a */
        public int mo6867a() {
            return this.f5591f;
        }

        /* renamed from: b */
        public String mo6868b() {
            return this.f5592g;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6865a(C1696a aVar) {
        this.f5584a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo6857b();

    /* renamed from: c */
    public C1696a mo6866c() {
        return this.f5584a;
    }
}
