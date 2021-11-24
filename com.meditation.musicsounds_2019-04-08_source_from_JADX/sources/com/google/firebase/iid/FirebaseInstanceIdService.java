package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

@Deprecated
public class FirebaseInstanceIdService extends C4924ab {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo16175a(Intent intent) {
        return (Intent) C4970w.m24661a().f17792a.poll();
    }

    @Deprecated
    /* renamed from: a */
    public void mo16176a() {
    }

    /* renamed from: b */
    public final void mo16177b(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo16176a();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m24498a().mo16166i();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId.m24498a().mo16170m();
            }
        }
    }
}
