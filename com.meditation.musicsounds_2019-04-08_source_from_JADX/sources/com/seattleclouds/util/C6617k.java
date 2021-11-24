package com.seattleclouds.util;

import android.os.Debug;
import android.util.Log;
import java.text.DecimalFormat;

/* renamed from: com.seattleclouds.util.k */
public class C6617k {

    /* renamed from: a */
    private static final int f23336a;

    static {
        int i = 0;
        for (StackTraceElement className : Thread.currentThread().getStackTrace()) {
            i++;
            if (className.getClassName().equals(C6617k.class.getName())) {
                break;
            }
        }
        f23336a = i;
    }

    /* renamed from: a */
    public static void m32010a(Class<?> cls) {
        Double valueOf = Double.valueOf(new Double((double) Debug.getNativeHeapAllocatedSize()).doubleValue() / new Double(1048576.0d).doubleValue());
        Double valueOf2 = Double.valueOf(new Double((double) Debug.getNativeHeapSize()).doubleValue() / 1048576.0d);
        Double valueOf3 = Double.valueOf(new Double((double) Debug.getNativeHeapFreeSize()).doubleValue() / 1048576.0d);
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);
        Log.d("MEM_DBG", "debug. =================================");
        StringBuilder sb = new StringBuilder();
        sb.append("debug.heap native: allocated ");
        sb.append(decimalFormat.format(valueOf));
        sb.append("MB of ");
        sb.append(decimalFormat.format(valueOf2));
        sb.append("MB (");
        sb.append(decimalFormat.format(valueOf3));
        sb.append("MB free) in [");
        sb.append(cls.getName().replaceAll("com.myapp.android.", ""));
        sb.append("]");
        Log.d("MEM_DBG", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("debug.memory: allocated: ");
        sb2.append(decimalFormat.format(new Double((double) (Runtime.getRuntime().totalMemory() / 1048576))));
        sb2.append("MB of ");
        sb2.append(decimalFormat.format(new Double((double) (Runtime.getRuntime().maxMemory() / 1048576))));
        sb2.append("MB (");
        sb2.append(decimalFormat.format(new Double((double) (Runtime.getRuntime().freeMemory() / 1048576))));
        sb2.append("MB free)");
        Log.d("MEM_DBG", sb2.toString());
        Log.d("MEM_DBG", "debug. =================================");
        System.gc();
        System.gc();
    }

    /* renamed from: a */
    public static void m32011a(String str, boolean z, String str2) {
        if (z) {
            Log.d(str, str2);
        }
    }
}
