package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

@Deprecated
/* renamed from: com.google.android.gms.iid.b */
public class C3355b extends C3367n {
    /* renamed from: a */
    static void m15203a(Context context, C3365l lVar) {
        lVar.mo11392b();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }

    /* renamed from: a */
    public void mo11379a() {
    }

    /* renamed from: a */
    public void mo11380a(Intent intent) {
        if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
            Bundle bundle = null;
            String stringExtra = intent.getStringExtra("subtype");
            if (stringExtra != null) {
                bundle = new Bundle();
                bundle.putString("subtype", stringExtra);
            }
            C3350a a = C3350a.m15190a((Context) this, bundle);
            String stringExtra2 = intent.getStringExtra("CMD");
            if (Log.isLoggable("InstanceID", 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 34 + String.valueOf(stringExtra2).length());
                sb.append("Service command. subtype:");
                sb.append(stringExtra);
                sb.append(" command:");
                sb.append(stringExtra2);
                Log.d("InstanceID", sb.toString());
            }
            if ("RST".equals(stringExtra2)) {
                a.mo11371a();
            } else {
                if ("RST_FULL".equals(stringExtra2)) {
                    if (!C3350a.m15192b().mo11391a()) {
                        C3350a.m15192b().mo11392b();
                    }
                } else if ("SYNC".equals(stringExtra2)) {
                    C3350a.m15192b().mo11393b(String.valueOf(stringExtra).concat("|T|"));
                    mo11379a();
                }
                return;
            }
            mo11379a();
        }
    }
}
