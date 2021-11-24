package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.tk */
public final class C3926tk {

    /* renamed from: a */
    private static final CopyOnWriteArrayList<C3925tj> f14944a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C3925tj m19886a(String str) {
        Iterator it = f14944a.iterator();
        while (it.hasNext()) {
            C3925tj tjVar = (C3925tj) it.next();
            if (tjVar.mo13697a(str)) {
                return tjVar;
            }
        }
        String str2 = "No KMS client does support: ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
