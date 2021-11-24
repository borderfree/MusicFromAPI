package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

public final class ago extends ahl {
    public ago(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        this.f12042b.f15097F = Integer.valueOf(2);
        try {
            boolean booleanValue = ((Boolean) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()})).booleanValue();
            this.f12042b.f15097F = Integer.valueOf(booleanValue ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
