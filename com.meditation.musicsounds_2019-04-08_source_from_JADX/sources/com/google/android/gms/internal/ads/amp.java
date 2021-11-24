package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@C3464ci
public final class amp {

    /* renamed from: a */
    public static final amp f12442a = new amp();

    protected amp() {
    }

    /* renamed from: a */
    public static zzjj m16600a(Context context, aoz aoz) {
        List list;
        Context context2;
        String str;
        aoz aoz2 = aoz;
        Date a = aoz.mo12152a();
        long time = a != null ? a.getTime() : -1;
        String b = aoz.mo12155b();
        int c = aoz.mo12156c();
        Set d = aoz.mo12158d();
        if (!d.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(d));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean a2 = aoz2.mo12153a(context2);
        int l = aoz.mo12166l();
        Location e = aoz.mo12159e();
        Bundle b2 = aoz2.mo12154b(AdMobAdapter.class);
        boolean f = aoz.mo12160f();
        String g = aoz.mo12161g();
        SearchAdRequest i = aoz.mo12163i();
        zzmq zzmq = i != null ? new zzmq(i) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            ane.m16645a();
            str = C3719lt.m19111a(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        zzjj zzjj = new zzjj(7, time, b2, c, list, a2, l, f, g, zzmq, e, b, aoz.mo12165k(), aoz.mo12167m(), Collections.unmodifiableList(new ArrayList(aoz.mo12168n())), aoz.mo12162h(), str, aoz.mo12169o());
        return zzjj;
    }
}
