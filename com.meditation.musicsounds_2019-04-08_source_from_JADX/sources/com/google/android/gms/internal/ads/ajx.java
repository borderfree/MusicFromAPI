package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class ajx {

    /* renamed from: a */
    private ByteArrayOutputStream f12243a = new ByteArrayOutputStream(4096);

    /* renamed from: b */
    private Base64OutputStream f12244b = new Base64OutputStream(this.f12243a, 10);

    /* renamed from: a */
    public final void mo12061a(byte[] bArr) {
        this.f12244b.write(bArr);
    }

    public final String toString() {
        String str;
        try {
            this.f12244b.close();
        } catch (IOException e) {
            C3643iy.m19173b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f12243a.close();
            str = this.f12243a.toString();
        } catch (IOException e2) {
            C3643iy.m19173b("HashManager: Unable to convert to Base64.", e2);
            str = "";
        } catch (Throwable th) {
            this.f12243a = null;
            this.f12244b = null;
            throw th;
        }
        this.f12243a = null;
        this.f12244b = null;
        return str;
    }
}
