package com.google.android.exoplayer2.text.p114f;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.C2741a;

/* renamed from: com.google.android.exoplayer2.text.f.e */
final class C2785e extends C2741a {

    /* renamed from: m */
    public final long f9631m;

    /* renamed from: n */
    public final long f9632n;

    /* renamed from: com.google.android.exoplayer2.text.f.e$1 */
    static /* synthetic */ class C27861 {

        /* renamed from: a */
        static final /* synthetic */ int[] f9633a = new int[Alignment.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9633a = r0
                int[] r0 = f9633a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f9633a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f9633a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2785e.C27861.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.f.e$a */
    public static final class C2787a {

        /* renamed from: a */
        private long f9634a;

        /* renamed from: b */
        private long f9635b;

        /* renamed from: c */
        private SpannableStringBuilder f9636c;

        /* renamed from: d */
        private Alignment f9637d;

        /* renamed from: e */
        private float f9638e;

        /* renamed from: f */
        private int f9639f;

        /* renamed from: g */
        private int f9640g;

        /* renamed from: h */
        private float f9641h;

        /* renamed from: i */
        private int f9642i;

        /* renamed from: j */
        private float f9643j;

        public C2787a() {
            mo9503a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r4.f9642i = 0;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.google.android.exoplayer2.text.p114f.C2785e.C2787a m13265c() {
            /*
                r4 = this;
                android.text.Layout$Alignment r0 = r4.f9637d
                if (r0 != 0) goto L_0x0009
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x0006:
                r4.f9642i = r0
                goto L_0x0036
            L_0x0009:
                int[] r0 = com.google.android.exoplayer2.text.p114f.C2785e.C27861.f9633a
                android.text.Layout$Alignment r1 = r4.f9637d
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 0
                switch(r0) {
                    case 1: goto L_0x002f;
                    case 2: goto L_0x0034;
                    case 3: goto L_0x0032;
                    default: goto L_0x0017;
                }
            L_0x0017:
                java.lang.String r0 = "WebvttCueBuilder"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unrecognized alignment: "
                r2.append(r3)
                android.text.Layout$Alignment r3 = r4.f9637d
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.w(r0, r2)
            L_0x002f:
                r4.f9642i = r1
                goto L_0x0036
            L_0x0032:
                r0 = 2
                goto L_0x0006
            L_0x0034:
                r0 = 1
                goto L_0x0006
            L_0x0036:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2785e.C2787a.m13265c():com.google.android.exoplayer2.text.f.e$a");
        }

        /* renamed from: a */
        public C2787a mo9498a(float f) {
            this.f9638e = f;
            return this;
        }

        /* renamed from: a */
        public C2787a mo9499a(int i) {
            this.f9639f = i;
            return this;
        }

        /* renamed from: a */
        public C2787a mo9500a(long j) {
            this.f9634a = j;
            return this;
        }

        /* renamed from: a */
        public C2787a mo9501a(Alignment alignment) {
            this.f9637d = alignment;
            return this;
        }

        /* renamed from: a */
        public C2787a mo9502a(SpannableStringBuilder spannableStringBuilder) {
            this.f9636c = spannableStringBuilder;
            return this;
        }

        /* renamed from: a */
        public void mo9503a() {
            this.f9634a = 0;
            this.f9635b = 0;
            this.f9636c = null;
            this.f9637d = null;
            this.f9638e = Float.MIN_VALUE;
            this.f9639f = Integer.MIN_VALUE;
            this.f9640g = Integer.MIN_VALUE;
            this.f9641h = Float.MIN_VALUE;
            this.f9642i = Integer.MIN_VALUE;
            this.f9643j = Float.MIN_VALUE;
        }

        /* renamed from: b */
        public C2787a mo9504b(float f) {
            this.f9641h = f;
            return this;
        }

        /* renamed from: b */
        public C2787a mo9505b(int i) {
            this.f9640g = i;
            return this;
        }

        /* renamed from: b */
        public C2787a mo9506b(long j) {
            this.f9635b = j;
            return this;
        }

        /* renamed from: b */
        public C2785e mo9507b() {
            if (this.f9641h != Float.MIN_VALUE && this.f9642i == Integer.MIN_VALUE) {
                m13265c();
            }
            C2785e eVar = new C2785e(this.f9634a, this.f9635b, this.f9636c, this.f9637d, this.f9638e, this.f9639f, this.f9640g, this.f9641h, this.f9642i, this.f9643j);
            return eVar;
        }

        /* renamed from: c */
        public C2787a mo9508c(float f) {
            this.f9643j = f;
            return this;
        }

        /* renamed from: c */
        public C2787a mo9509c(int i) {
            this.f9642i = i;
            return this;
        }
    }

    public C2785e(long j, long j2, CharSequence charSequence) {
        this(j, j2, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2785e(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f9631m = j;
        this.f9632n = j2;
    }

    public C2785e(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    /* renamed from: a */
    public boolean mo9497a() {
        return this.f9391d == Float.MIN_VALUE && this.f9394g == Float.MIN_VALUE;
    }
}
