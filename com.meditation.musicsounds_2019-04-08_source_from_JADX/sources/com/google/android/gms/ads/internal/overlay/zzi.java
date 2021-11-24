package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3832py;

@C3464ci
public final class zzi {
    public final int index;
    public final ViewGroup parent;
    public final LayoutParams zzbyi;
    public final Context zzrt;

    public zzi(C3832py pyVar) {
        this.zzbyi = pyVar.getLayoutParams();
        ViewParent parent2 = pyVar.getParent();
        this.zzrt = pyVar.mo13514o();
        if (parent2 == null || !(parent2 instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.parent = (ViewGroup) parent2;
        this.index = this.parent.indexOfChild(pyVar.getView());
        this.parent.removeView(pyVar.getView());
        pyVar.mo13493b(true);
    }
}
