package com.google.android.gms.internal.ads;

import android.os.RemoteException;

@C3464ci
public class bcv {
    /* renamed from: a */
    public static bcq m18177a(String str) {
        try {
            return new bcw((C3899sk) Class.forName(str, false, bcv.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
