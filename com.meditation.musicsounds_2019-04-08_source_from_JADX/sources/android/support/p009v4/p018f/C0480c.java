package android.support.p009v4.p018f;

import java.util.Locale;

/* renamed from: android.support.v4.f.c */
public final class C0480c {

    /* renamed from: a */
    public static final C0479b f1440a = new C0485e(null, false);

    /* renamed from: b */
    public static final C0479b f1441b = new C0485e(null, true);

    /* renamed from: c */
    public static final C0479b f1442c = new C0485e(C0482b.f1449a, false);

    /* renamed from: d */
    public static final C0479b f1443d = new C0485e(C0482b.f1449a, true);

    /* renamed from: e */
    public static final C0479b f1444e = new C0485e(C0481a.f1446a, false);

    /* renamed from: f */
    public static final C0479b f1445f = C0486f.f1452a;

    /* renamed from: android.support.v4.f.c$a */
    private static class C0481a implements C0483c {

        /* renamed from: a */
        static final C0481a f1446a = new C0481a(true);

        /* renamed from: b */
        static final C0481a f1447b = new C0481a(false);

        /* renamed from: c */
        private final boolean f1448c;

        private C0481a(boolean z) {
            this.f1448c = z;
        }

        /* renamed from: a */
        public int mo1876a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                switch (C0480c.m2152a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (this.f1448c) {
                            return 0;
                        }
                        break;
                    case 1:
                        if (!this.f1448c) {
                            return 1;
                        }
                        break;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f1448c ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: android.support.v4.f.c$b */
    private static class C0482b implements C0483c {

        /* renamed from: a */
        static final C0482b f1449a = new C0482b();

        private C0482b() {
        }

        /* renamed from: a */
        public int mo1876a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0480c.m2153b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: android.support.v4.f.c$c */
    private interface C0483c {
        /* renamed from: a */
        int mo1876a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.f.c$d */
    private static abstract class C0484d implements C0479b {

        /* renamed from: a */
        private final C0483c f1450a;

        C0484d(C0483c cVar) {
            this.f1450a = cVar;
        }

        /* renamed from: b */
        private boolean m2157b(CharSequence charSequence, int i, int i2) {
            switch (this.f1450a.mo1876a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return mo1877a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo1877a();

        /* renamed from: a */
        public boolean mo1875a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f1450a == null ? mo1877a() : m2157b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: android.support.v4.f.c$e */
    private static class C0485e extends C0484d {

        /* renamed from: a */
        private final boolean f1451a;

        C0485e(C0483c cVar, boolean z) {
            super(cVar);
            this.f1451a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo1877a() {
            return this.f1451a;
        }
    }

    /* renamed from: android.support.v4.f.c$f */
    private static class C0486f extends C0484d {

        /* renamed from: a */
        static final C0486f f1452a = new C0486f();

        C0486f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo1877a() {
            return C0487d.m2162a(Locale.getDefault()) == 1;
        }
    }

    /* renamed from: a */
    static int m2152a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        return 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m2153b(int r0) {
        /*
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0008;
                case 2: goto L_0x0008;
                default: goto L_0x0003;
            }
        L_0x0003:
            switch(r0) {
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0008;
                case 17: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r0 = 2
            return r0
        L_0x0008:
            r0 = 0
            return r0
        L_0x000a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.p018f.C0480c.m2153b(int):int");
    }
}
