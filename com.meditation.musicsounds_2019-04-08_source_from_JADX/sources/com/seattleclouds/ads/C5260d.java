package com.seattleclouds.ads;

import android.content.SharedPreferences.Editor;
import com.seattleclouds.App;
import com.seattleclouds.billing.C5319d;

/* renamed from: com.seattleclouds.ads.d */
public class C5260d {

    /* renamed from: a */
    private static C5260d f18848a;

    private C5260d() {
        if (f18848a != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /* renamed from: a */
    public static C5260d m26241a() {
        if (f18848a == null) {
            synchronized (C5260d.class) {
                if (f18848a == null) {
                    f18848a = new C5260d();
                }
            }
        }
        return f18848a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo17272b() {
        Editor edit = App.m25647e().getSharedPreferences("com.seattleclouds.file.removeads", 0).edit();
        edit.putBoolean("com.seattleclouds.file.removeads", true);
        edit.apply();
    }

    /* renamed from: c */
    public boolean mo17273c() {
        if (App.m25647e().getSharedPreferences("com.seattleclouds.file.removeads", 0).getBoolean("com.seattleclouds.file.removeads", false)) {
            return true;
        }
        if (C5319d.m26613c() == null) {
            return false;
        }
        boolean containsKey = C5319d.m26613c().mo17459g().containsKey(AdsManagerKeys.m26119b().mo17236q());
        if (containsKey) {
            mo17272b();
        }
        return containsKey;
    }
}
