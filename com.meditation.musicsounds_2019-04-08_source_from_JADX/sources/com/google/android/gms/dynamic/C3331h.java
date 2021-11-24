package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.dynamic.h */
final class C3331h implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f11238a;

    /* renamed from: b */
    private final /* synthetic */ Intent f11239b;

    C3331h(Context context, Intent intent) {
        this.f11238a = context;
        this.f11239b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f11238a.startActivity(this.f11239b);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
