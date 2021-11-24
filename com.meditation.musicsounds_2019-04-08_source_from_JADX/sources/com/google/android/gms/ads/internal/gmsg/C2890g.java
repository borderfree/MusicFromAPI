package com.google.android.gms.ads.internal.gmsg;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3832py;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.g */
final class C2890g implements zzv<C3832py> {
    C2890g() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        WindowManager windowManager = (WindowManager) pyVar.getContext().getSystemService("window");
        zzbv.zzek();
        View view = (View) pyVar;
        DisplayMetrics a = C3653jh.m18861a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        pyVar.mo12588a("locationReady", (Map<String, ?>) hashMap);
        C3643iy.m19178e("GET LOCATION COMPILED");
    }
}
