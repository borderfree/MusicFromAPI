package android.support.p023v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p009v4.content.C0460e;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.q */
class C0802q {

    /* renamed from: a */
    private static C0802q f2352a;

    /* renamed from: b */
    private final Context f2353b;

    /* renamed from: c */
    private final LocationManager f2354c;

    /* renamed from: d */
    private final C0803a f2355d = new C0803a();

    /* renamed from: android.support.v7.app.q$a */
    private static class C0803a {

        /* renamed from: a */
        boolean f2356a;

        /* renamed from: b */
        long f2357b;

        /* renamed from: c */
        long f2358c;

        /* renamed from: d */
        long f2359d;

        /* renamed from: e */
        long f2360e;

        /* renamed from: f */
        long f2361f;

        C0803a() {
        }
    }

    C0802q(Context context, LocationManager locationManager) {
        this.f2353b = context;
        this.f2354c = locationManager;
    }

    /* renamed from: a */
    private Location m3787a(String str) {
        try {
            if (this.f2354c.isProviderEnabled(str)) {
                return this.f2354c.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    static C0802q m3788a(Context context) {
        if (f2352a == null) {
            Context applicationContext = context.getApplicationContext();
            f2352a = new C0802q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f2352a;
    }

    /* renamed from: a */
    private void m3789a(Location location) {
        long j;
        C0803a aVar = this.f2355d;
        long currentTimeMillis = System.currentTimeMillis();
        C0801p a = C0801p.m3785a();
        C0801p pVar = a;
        pVar.mo3200a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f2349a;
        pVar.mo3200a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f2351c == 1;
        long j3 = a.f2350b;
        long j4 = j2;
        long j5 = a.f2349a;
        long j6 = j3;
        boolean z2 = z;
        a.mo3200a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f2350b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f2356a = z2;
        aVar.f2357b = j4;
        aVar.f2358c = j6;
        aVar.f2359d = j5;
        aVar.f2360e = j7;
        aVar.f2361f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m3790b() {
        Location location = null;
        Location a = C0460e.m2103a(this.f2353b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m3787a("network") : null;
        if (C0460e.m2103a(this.f2353b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m3787a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m3791c() {
        return this.f2355d.f2361f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3201a() {
        C0803a aVar = this.f2355d;
        if (m3791c()) {
            return aVar.f2356a;
        }
        Location b = m3790b();
        if (b != null) {
            m3789a(b);
            return aVar.f2356a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
