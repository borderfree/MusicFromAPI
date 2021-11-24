package com.seattleclouds.util;

import android.app.Activity;
import java.security.InvalidParameterException;

/* renamed from: com.seattleclouds.util.aj */
public class C6589aj {
    /* renamed from: a */
    public static String m31897a(Activity activity, String str, String str2) {
        if (activity != null) {
            return m31898a(activity.getWindow().getDecorView().getRootView(), str, str2);
        }
        throw new InvalidParameterException("Activity cannot be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e A[SYNTHETIC, Splitter:B:19:0x006e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31898a(android.view.View r5, java.lang.String r6, java.lang.String r7) {
        /*
            boolean r0 = com.seattleclouds.util.C6592al.m31909b(r6)
            if (r0 != 0) goto L_0x0085
            boolean r0 = com.seattleclouds.util.C6592al.m31909b(r7)
            if (r0 != 0) goto L_0x007d
            if (r5 == 0) goto L_0x0075
            r0 = 1
            r5.setDrawingCacheEnabled(r0)
            android.graphics.Bitmap r0 = r5.getDrawingCache()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            r1 = 0
            r5.setDrawingCacheEnabled(r1)
            r5 = 0
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            r1.mkdirs()     // Catch:{ all -> 0x006b }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x006b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x006b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006b }
            r3.<init>()     // Catch:{ all -> 0x006b }
            r3.append(r6)     // Catch:{ all -> 0x006b }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ all -> 0x006b }
            r3.append(r7)     // Catch:{ all -> 0x006b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x006b }
            r2.<init>(r3)     // Catch:{ all -> 0x006b }
            r1.<init>(r2)     // Catch:{ all -> 0x006b }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0067 }
            r2 = 100
            r0.compress(r5, r2, r1)     // Catch:{ all -> 0x0067 }
            r1.flush()     // Catch:{ IOException -> 0x0052 }
            r1.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            return r5
        L_0x0067:
            r5 = move-exception
            r6 = r5
            r5 = r1
            goto L_0x006c
        L_0x006b:
            r6 = move-exception
        L_0x006c:
            if (r5 == 0) goto L_0x0074
            r5.flush()     // Catch:{ IOException -> 0x0074 }
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            throw r6
        L_0x0075:
            java.security.InvalidParameterException r5 = new java.security.InvalidParameterException
            java.lang.String r6 = "View cannot be null"
            r5.<init>(r6)
            throw r5
        L_0x007d:
            java.security.InvalidParameterException r5 = new java.security.InvalidParameterException
            java.lang.String r6 = "Invalid filename parameter"
            r5.<init>(r6)
            throw r5
        L_0x0085:
            java.security.InvalidParameterException r5 = new java.security.InvalidParameterException
            java.lang.String r6 = "Invalid directory parameter"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6589aj.m31898a(android.view.View, java.lang.String, java.lang.String):java.lang.String");
    }
}
