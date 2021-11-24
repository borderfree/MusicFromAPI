package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.p006c.C0046a;
import android.support.p006c.C0047b;
import android.support.p006c.C0057d;
import android.support.p006c.C0059e;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class arj implements aei {

    /* renamed from: a */
    private C0059e f12954a;

    /* renamed from: b */
    private C0047b f12955b;

    /* renamed from: c */
    private C0057d f12956c;

    /* renamed from: d */
    private ark f12957d;

    /* renamed from: a */
    public static boolean m16981a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(aeg.m16058a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo11834a() {
        this.f12955b = null;
        this.f12954a = null;
        if (this.f12957d != null) {
            this.f12957d.mo12339b();
        }
    }

    /* renamed from: a */
    public final void mo12334a(Activity activity) {
        if (this.f12956c != null) {
            activity.unbindService(this.f12956c);
            this.f12955b = null;
            this.f12954a = null;
            this.f12956c = null;
        }
    }

    /* renamed from: a */
    public final void mo11835a(C0047b bVar) {
        this.f12955b = bVar;
        this.f12955b.mo94a(0);
        if (this.f12957d != null) {
            this.f12957d.mo12338a();
        }
    }

    /* renamed from: a */
    public final void mo12335a(ark ark) {
        this.f12957d = ark;
    }

    /* renamed from: a */
    public final boolean mo12336a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f12955b == null) {
            return false;
        }
        if (this.f12955b == null) {
            this.f12954a = null;
        } else if (this.f12954a == null) {
            this.f12954a = this.f12955b.mo93a((C0046a) null);
        }
        C0059e eVar = this.f12954a;
        if (eVar == null) {
            return false;
        }
        return eVar.mo110a(uri, null, null);
    }

    /* renamed from: b */
    public final void mo12337b(Activity activity) {
        if (this.f12955b == null) {
            String a = aeg.m16058a(activity);
            if (a != null) {
                this.f12956c = new aeh(this);
                C0047b.m138a(activity, a, this.f12956c);
            }
        }
    }
}
