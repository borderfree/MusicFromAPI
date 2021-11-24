package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class aep implements Runnable {
    private aep() {
    }

    public final void run() {
        try {
            aen.f11650c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } catch (Throwable th) {
            aen.f11648a.countDown();
            throw th;
        }
        aen.f11648a.countDown();
    }
}
