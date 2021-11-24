package com.google.android.gms.ads.mediation;

import android.os.Bundle;

public interface MediationAdapter {

    public static class zza {

        /* renamed from: a */
        private int f10296a;

        public final zza zzaj(int i) {
            this.f10296a = 1;
            return this;
        }

        public final Bundle zzvx() {
            Bundle bundle = new Bundle();
            bundle.putInt("capabilities", this.f10296a);
            return bundle;
        }
    }

    void onDestroy();

    void onPause();

    void onResume();
}
