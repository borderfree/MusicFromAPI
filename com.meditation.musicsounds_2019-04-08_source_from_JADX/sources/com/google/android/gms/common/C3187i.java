package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0374l;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.common.i */
public class C3187i extends C0366g {

    /* renamed from: ae */
    private Dialog f10969ae = null;

    /* renamed from: af */
    private OnCancelListener f10970af = null;

    /* renamed from: a */
    public static C3187i m14681a(Dialog dialog, OnCancelListener onCancelListener) {
        C3187i iVar = new C3187i();
        Dialog dialog2 = (Dialog) C3266s.m14914a(dialog, (Object) "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        iVar.f10969ae = dialog2;
        if (onCancelListener != null) {
            iVar.f10970af = onCancelListener;
        }
        return iVar;
    }

    /* renamed from: a */
    public void mo1448a(C0374l lVar, String str) {
        super.mo1448a(lVar, str);
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        if (this.f10969ae == null) {
            mo1451b(false);
        }
        return this.f10969ae;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f10970af != null) {
            this.f10970af.onCancel(dialogInterface);
        }
    }
}
