package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C3248j {

    /* renamed from: a */
    private static final Object f11102a = new Object();

    /* renamed from: b */
    private static C3248j f11103b;

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class C3249a {

        /* renamed from: a */
        private final String f11104a;

        /* renamed from: b */
        private final String f11105b;

        /* renamed from: c */
        private final ComponentName f11106c;

        /* renamed from: d */
        private final int f11107d;

        public C3249a(ComponentName componentName, int i) {
            this.f11104a = null;
            this.f11105b = null;
            this.f11106c = (ComponentName) C3266s.m14913a(componentName);
            this.f11107d = 129;
        }

        public C3249a(String str, String str2, int i) {
            this.f11104a = C3266s.m14915a(str);
            this.f11105b = C3266s.m14915a(str2);
            this.f11106c = null;
            this.f11107d = i;
        }

        /* renamed from: a */
        public final Intent mo11275a(Context context) {
            return this.f11104a != null ? new Intent(this.f11104a).setPackage(this.f11105b) : new Intent().setComponent(this.f11106c);
        }

        /* renamed from: a */
        public final String mo11276a() {
            return this.f11105b;
        }

        /* renamed from: b */
        public final ComponentName mo11277b() {
            return this.f11106c;
        }

        /* renamed from: c */
        public final int mo11278c() {
            return this.f11107d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3249a)) {
                return false;
            }
            C3249a aVar = (C3249a) obj;
            return C3261q.m14906a(this.f11104a, aVar.f11104a) && C3261q.m14906a(this.f11105b, aVar.f11105b) && C3261q.m14906a(this.f11106c, aVar.f11106c) && this.f11107d == aVar.f11107d;
        }

        public final int hashCode() {
            return C3261q.m14904a(this.f11104a, this.f11105b, this.f11106c, Integer.valueOf(this.f11107d));
        }

        public final String toString() {
            return this.f11104a == null ? this.f11106c.flattenToString() : this.f11104a;
        }
    }

    /* renamed from: a */
    public static C3248j m14881a(Context context) {
        synchronized (f11102a) {
            if (f11103b == null) {
                f11103b = new C3211ai(context.getApplicationContext());
            }
        }
        return f11103b;
    }

    /* renamed from: a */
    public final void mo11272a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo11172b(new C3249a(str, str2, i), serviceConnection, str3);
    }

    /* renamed from: a */
    public boolean mo11273a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return mo11171a(new C3249a(componentName, 129), serviceConnection, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo11171a(C3249a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: b */
    public void mo11274b(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo11172b(new C3249a(componentName, 129), serviceConnection, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11172b(C3249a aVar, ServiceConnection serviceConnection, String str);
}
