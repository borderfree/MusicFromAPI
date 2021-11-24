package com.google.android.gms.internal.ads;

final class afh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ afg f11874a;

    afh(afg afg) {
        this.f11874a = afg;
    }

    public final void run() {
        if (this.f11874a.f11872b == null) {
            synchronized (afg.f11870d) {
                if (this.f11874a.f11872b == null) {
                    boolean booleanValue = ((Boolean) ane.m16650f().mo12297a(aqm.f12690bC)).booleanValue();
                    if (booleanValue) {
                        try {
                            afg.f11869a = new akz(this.f11874a.f11873c.f11934a, "ADSHIELD", null);
                        } catch (Throwable unused) {
                            booleanValue = false;
                        }
                    }
                    this.f11874a.f11872b = Boolean.valueOf(booleanValue);
                    afg.f11870d.open();
                }
            }
        }
    }
}
