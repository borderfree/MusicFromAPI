package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.dy */
public final class C4340dy implements C4326dk {

    /* renamed from: a */
    static final Map<String, C4340dy> f16044a = new HashMap();

    /* renamed from: b */
    private final SharedPreferences f16045b;

    /* renamed from: c */
    private final OnSharedPreferenceChangeListener f16046c = new C4341dz(this);

    /* renamed from: d */
    private final Object f16047d = new Object();

    /* renamed from: e */
    private volatile Map<String, ?> f16048e;

    /* renamed from: f */
    private final List<C4325dj> f16049f = new ArrayList();

    private C4340dy(SharedPreferences sharedPreferences) {
        this.f16045b = sharedPreferences;
        this.f16045b.registerOnSharedPreferenceChangeListener(this.f16046c);
    }

    /* renamed from: a */
    static C4340dy m21302a(Context context, String str) {
        C4340dy dyVar;
        SharedPreferences sharedPreferences;
        if (!((!C4320de.m21242a() || str.startsWith("direct_boot:")) ? true : C4320de.m21243a(context))) {
            return null;
        }
        synchronized (C4340dy.class) {
            dyVar = (C4340dy) f16044a.get(str);
            if (dyVar == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C4320de.m21242a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                dyVar = new C4340dy(sharedPreferences);
                f16044a.put(str, dyVar);
            }
        }
        return dyVar;
    }

    /* renamed from: a */
    public final Object mo14275a(String str) {
        Map<String, ?> map = this.f16048e;
        if (map == null) {
            synchronized (this.f16047d) {
                map = this.f16048e;
                if (map == null) {
                    map = this.f16045b.getAll();
                    this.f16048e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14293a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f16047d) {
            this.f16048e = null;
            C4333dr.m21273a();
        }
        synchronized (this) {
            for (C4325dj a : this.f16049f) {
                a.mo14281a();
            }
        }
    }
}
