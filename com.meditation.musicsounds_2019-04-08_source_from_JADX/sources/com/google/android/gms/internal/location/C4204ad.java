package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3240e;
import com.google.android.gms.common.internal.C3245h;

/* renamed from: com.google.android.gms.internal.location.ad */
public class C4204ad extends C3245h<C4217j> {

    /* renamed from: e */
    protected final C4233z<C4217j> f15636e = new C4205ae(this);

    /* renamed from: f */
    private final String f15637f;

    public C4204ad(Context context, Looper looper, C3042b bVar, C3043c cVar, String str, C3240e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.f15637f = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo10733a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C4217j ? (C4217j) queryLocalInterface : new C4218k(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo10734b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: f */
    public int mo10738f() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public String mo10739i_() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo11225u() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f15637f);
        return bundle;
    }
}
