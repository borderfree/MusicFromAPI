package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;

@C3464ci
public final class apx {

    /* renamed from: a */
    private final Context f12587a;

    public apx(Context context) {
        C3266s.m14914a(context, (Object) "Context can not be null");
        this.f12587a = context;
    }

    /* renamed from: a */
    private final boolean m16873a(Intent intent) {
        C3266s.m14914a(intent, (Object) "Intent can not be null");
        return !this.f12587a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: a */
    public final boolean mo12276a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m16873a(intent);
    }

    /* renamed from: b */
    public final boolean mo12277b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m16873a(intent);
    }

    /* renamed from: c */
    public final boolean mo12278c() {
        return ((Boolean) C3710lk.m19088a(this.f12587a, new apy())).booleanValue() && C3181c.m14658a(this.f12587a).mo11122a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean mo12279d() {
        return m16873a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
