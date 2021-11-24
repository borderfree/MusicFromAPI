package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.cv */
public final class C3477cv {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m18276b(Context context, boolean z) {
        if (!z) {
            return true;
        }
        int b = DynamiteModule.m15151b(context, ModuleDescriptor.MODULE_ID);
        return b != 0 && b <= DynamiteModule.m15144a(context, ModuleDescriptor.MODULE_ID);
    }
}
