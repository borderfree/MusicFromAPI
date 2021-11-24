package com.seattleclouds.util;

import android.os.Build.VERSION;

/* renamed from: com.seattleclouds.util.ar */
public class C6599ar {

    /* renamed from: a */
    public static final boolean f23316a = (VERSION.SDK_INT >= 24);

    /* renamed from: b */
    public static final boolean f23317b = (VERSION.SDK_INT >= 23);

    /* renamed from: c */
    public static final boolean f23318c;

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 26) {
            z = true;
        }
        f23318c = z;
    }
}
