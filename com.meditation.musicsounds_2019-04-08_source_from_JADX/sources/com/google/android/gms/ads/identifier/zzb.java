package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C3183f;

public final class zzb {

    /* renamed from: a */
    private SharedPreferences f9923a;

    public zzb(Context context) {
        try {
            Context remoteContext = C3183f.getRemoteContext(context);
            this.f9923a = remoteContext == null ? null : remoteContext.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f9923a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final float mo9968a(String str, float f) {
        try {
            if (this.f9923a == null) {
                return 0.0f;
            }
            return this.f9923a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo9969a(String str, String str2) {
        try {
            return this.f9923a == null ? str2 : this.f9923a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean getBoolean(String str, boolean z) {
        try {
            if (this.f9923a == null) {
                return false;
            }
            return this.f9923a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
