package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class agi {

    /* renamed from: a */
    private static final char[] f11978a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static long m16182a(double d, DisplayMetrics displayMetrics) {
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: a */
    public static Activity m16183a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        Context context = view.getContext();
        int i = 0;
        while ((context instanceof ContextWrapper) && i < 10) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public static String m16184a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return ael.m16070a(bArr, true);
    }

    /* renamed from: a */
    public static String m16185a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        C4099yp.m20379a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static boolean m16186a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m16187a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    /* renamed from: b */
    public static boolean m16188b(String str) {
        return str == null || str.isEmpty();
    }
}
