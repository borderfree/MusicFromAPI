package com.google.android.gms.internal.ads;

final class acc {

    /* renamed from: a */
    private final String f11467a;

    /* renamed from: b */
    private int f11468b = 0;

    acc(String str) {
        this.f11467a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo11595a() {
        return this.f11468b < this.f11467a.length();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo11596b() {
        String str = this.f11467a;
        int i = this.f11468b;
        this.f11468b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f11467a;
            int i3 = this.f11468b;
            this.f11468b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
