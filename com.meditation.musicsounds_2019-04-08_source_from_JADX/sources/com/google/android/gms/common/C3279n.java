package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3215am;
import com.google.android.gms.common.internal.C3216an;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.n */
abstract class C3279n extends C3216an {

    /* renamed from: a */
    private int f11140a;

    protected C3279n(byte[] bArr) {
        C3266s.m14923b(bArr.length == 25);
        this.f11140a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m14997a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final C3323b mo11189a() {
        return C3327d.m15136a(mo11301c());
    }

    /* renamed from: b */
    public final int mo11190b() {
        return hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract byte[] mo11301c();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3215am)) {
            try {
                C3215am amVar = (C3215am) obj;
                if (amVar.mo11190b() != hashCode()) {
                    return false;
                }
                C3323b a = amVar.mo11189a();
                if (a == null) {
                    return false;
                }
                return Arrays.equals(mo11301c(), (byte[]) C3327d.m15137a(a));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f11140a;
    }
}
