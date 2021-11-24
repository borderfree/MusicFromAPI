package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rk */
public final class C3872rk extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f14810a;

    /* renamed from: b */
    private Context f14811b;

    /* renamed from: c */
    private Context f14812c;

    public C3872rk(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo13601a() {
        return this.f14810a;
    }

    /* renamed from: b */
    public final Context mo13602b() {
        return this.f14812c;
    }

    public final Object getSystemService(String str) {
        return this.f14812c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f14811b = context.getApplicationContext();
        this.f14810a = context instanceof Activity ? (Activity) context : null;
        this.f14812c = context;
        super.setBaseContext(this.f14811b);
    }

    public final void startActivity(Intent intent) {
        if (this.f14810a != null) {
            this.f14810a.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f14811b.startActivity(intent);
    }
}
