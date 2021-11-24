package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3141g;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C3244g implements OnClickListener {
    /* renamed from: a */
    public static C3244g m14859a(Activity activity, Intent intent, int i) {
        return new C3271w(intent, activity, i);
    }

    /* renamed from: a */
    public static C3244g m14860a(Fragment fragment, Intent intent, int i) {
        return new C3272x(intent, fragment, i);
    }

    /* renamed from: a */
    public static C3244g m14861a(C3141g gVar, Intent intent, int i) {
        return new C3273y(intent, gVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11259a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo11259a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
