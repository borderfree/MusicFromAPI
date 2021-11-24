package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public abstract class aju {

    /* renamed from: b */
    private static MessageDigest f12237b;

    /* renamed from: a */
    protected Object f12238a = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo12057a() {
        synchronized (this.f12238a) {
            if (f12237b != null) {
                MessageDigest messageDigest = f12237b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f12237b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f12237b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte[] mo12058a(String str);
}
