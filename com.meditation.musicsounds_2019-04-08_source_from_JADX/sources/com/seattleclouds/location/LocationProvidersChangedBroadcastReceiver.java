package com.seattleclouds.location;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.support.p009v4.content.C0461f;
import com.seattleclouds.location.geofencing.C5437a;
import com.seattleclouds.util.C6595ao;

public class LocationProvidersChangedBroadcastReceiver extends C0461f {
    public void onReceive(Context context, Intent intent) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return;
        }
        if (locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network")) {
            C6595ao.m31929a(context, "We are good for geofencing...", Boolean.valueOf(false));
            if (!C5437a.m27181a(context).booleanValue()) {
                C6595ao.m31929a(context, "Restore geofences...", Boolean.valueOf(false));
                new C5437a(context).mo17743a(false);
            }
        }
    }
}
