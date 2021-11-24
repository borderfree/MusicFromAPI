package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.c */
public class C3173c extends DialogFragment {

    /* renamed from: a */
    private Dialog f10951a = null;

    /* renamed from: b */
    private OnCancelListener f10952b = null;

    /* renamed from: a */
    public static C3173c m14623a(Dialog dialog, OnCancelListener onCancelListener) {
        C3173c cVar = new C3173c();
        Dialog dialog2 = (Dialog) C3266s.m14914a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f10951a = dialog2;
        if (onCancelListener != null) {
            cVar.f10952b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f10952b != null) {
            this.f10952b.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f10951a == null) {
            setShowsDialog(false);
        }
        return this.f10951a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
