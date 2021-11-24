package com.seattleclouds.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* renamed from: com.seattleclouds.util.ao */
public class C6595ao {
    /* renamed from: a */
    public static void m31926a(Context context, int i) {
        m31927a(context, i, false);
    }

    /* renamed from: a */
    public static void m31927a(Context context, int i, boolean z) {
        Toast.makeText(context, i, z ? 1 : 0).show();
    }

    /* renamed from: a */
    public static void m31928a(Context context, String str) {
        m31930a(context, str, false);
    }

    /* renamed from: a */
    public static void m31929a(final Context context, final String str, Boolean bool) {
        if (bool.booleanValue()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    Toast.makeText(context, str, 0).show();
                }
            });
        }
    }

    /* renamed from: a */
    public static void m31930a(Context context, String str, boolean z) {
        Toast.makeText(context, str, z ? 1 : 0).show();
    }
}
