package com.google.android.gms.common.util;

import android.util.Base64;

/* renamed from: com.google.android.gms.common.util.c */
public final class C3298c {
    /* renamed from: a */
    public static String m15033a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }
}
