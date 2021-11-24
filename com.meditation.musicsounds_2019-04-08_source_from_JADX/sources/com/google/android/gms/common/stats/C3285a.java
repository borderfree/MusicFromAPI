package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C3299d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C3285a {

    /* renamed from: a */
    private static final Object f11160a = new Object();

    /* renamed from: b */
    private static volatile C3285a f11161b;

    /* renamed from: c */
    private static boolean f11162c = false;

    /* renamed from: d */
    private final List<String> f11163d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f11164e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f11165f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f11166g = Collections.EMPTY_LIST;

    private C3285a() {
    }

    /* renamed from: a */
    public static C3285a m15014a() {
        if (f11161b == null) {
            synchronized (f11160a) {
                if (f11161b == null) {
                    f11161b = new C3285a();
                }
            }
        }
        return f11161b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo11311a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public boolean mo11312a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo11313a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean mo11313a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C3299d.m15036b(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
