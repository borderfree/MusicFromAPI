package com.google.android.gms.internal.ads;

@C3464ci
final class axg {

    /* renamed from: a */
    private static final axd f13276a = axd.m17586a();

    /* renamed from: b */
    private static final float f13277b = ((Float) ane.m16650f().mo12297a(aqm.f12719bf)).floatValue();

    /* renamed from: c */
    private static final long f13278c = ((Long) ane.m16650f().mo12297a(aqm.f12717bd)).longValue();

    /* renamed from: d */
    private static final float f13279d = ((Float) ane.m16650f().mo12297a(aqm.f12720bg)).floatValue();

    /* renamed from: e */
    private static final long f13280e = ((Long) ane.m16650f().mo12297a(aqm.f12718be)).longValue();

    /* renamed from: a */
    private static int m17600a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }

    /* renamed from: a */
    static boolean m17601a() {
        int h = f13276a.mo12584h();
        int i = f13276a.mo12585i();
        int g = f13276a.mo12583g() + f13276a.mo12582f();
        int i2 = Integer.MAX_VALUE;
        int i3 = (h >= 16 || f13280e == 0) ? f13279d != 0.0f ? ((int) (f13279d * ((float) h))) + 1 : Integer.MAX_VALUE : m17600a(f13280e, h);
        if (i <= i3) {
            if (h < 16 && f13278c != 0) {
                i2 = m17600a(f13278c, h);
            } else if (f13277b != 0.0f) {
                i2 = (int) (f13277b * ((float) h));
            }
            if (g <= i2) {
                return true;
            }
        }
        return false;
    }
}
