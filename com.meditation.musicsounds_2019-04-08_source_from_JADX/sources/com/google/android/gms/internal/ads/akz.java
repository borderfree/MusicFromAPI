package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@C3464ci
public final class akz {

    /* renamed from: a */
    ahq f12279a;

    /* renamed from: b */
    boolean f12280b;

    public akz() {
    }

    public akz(Context context) {
        aqm.m16920a(context);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12821db)).booleanValue()) {
            try {
                this.f12279a = ahr.m16252a(DynamiteModule.m15147a(context, DynamiteModule.f11241a, ModuleDescriptor.MODULE_ID).mo11352a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                C3327d.m15136a(context);
                this.f12279a.mo11926a(C3327d.m15136a(context), "GMA_SDK");
                this.f12280b = true;
            } catch (RemoteException | LoadingException | NullPointerException unused) {
                C3731me.m19172b("Cannot dynamite load clearcut");
            }
        }
    }

    public akz(Context context, String str, String str2) {
        aqm.m16920a(context);
        try {
            this.f12279a = ahr.m16252a(DynamiteModule.m15147a(context, DynamiteModule.f11241a, ModuleDescriptor.MODULE_ID).mo11352a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            C3327d.m15136a(context);
            this.f12279a.mo11927a(C3327d.m15136a(context), str, null);
            this.f12280b = true;
        } catch (RemoteException | LoadingException | NullPointerException unused) {
            C3731me.m19172b("Cannot dynamite load clearcut");
        }
    }

    /* renamed from: a */
    public final alb mo12083a(byte[] bArr) {
        return new alb(this, bArr);
    }
}
