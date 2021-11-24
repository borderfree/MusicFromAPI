package com.seattleclouds.util;

import android.util.Log;
import com.seattleclouds.App;

/* renamed from: com.seattleclouds.util.af */
public class C6577af {

    /* renamed from: a */
    private static final String f23263a = "af";

    /* renamed from: a */
    public static void m31831a(Exception exc) {
        if (!App.f18500b) {
            Log.e(f23263a, "Error occurred", exc);
        } else if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        } else {
            throw new RuntimeException(exc);
        }
    }
}
