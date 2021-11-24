package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.aj */
final class C3212aj implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f11009a = new HashSet();

    /* renamed from: b */
    private int f11010b = 2;

    /* renamed from: c */
    private boolean f11011c;

    /* renamed from: d */
    private IBinder f11012d;

    /* renamed from: e */
    private final C3249a f11013e;

    /* renamed from: f */
    private ComponentName f11014f;

    /* renamed from: g */
    private final /* synthetic */ C3211ai f11015g;

    public C3212aj(C3211ai aiVar, C3249a aVar) {
        this.f11015g = aiVar;
        this.f11013e = aVar;
    }

    /* renamed from: a */
    public final void mo11174a(ServiceConnection serviceConnection, String str) {
        this.f11015g.f11006d;
        this.f11015g.f11004b;
        this.f11013e.mo11275a(this.f11015g.f11004b);
        this.f11009a.add(serviceConnection);
    }

    /* renamed from: a */
    public final void mo11175a(String str) {
        this.f11010b = 3;
        this.f11011c = this.f11015g.f11006d.mo11313a(this.f11015g.f11004b, str, this.f11013e.mo11275a(this.f11015g.f11004b), this, this.f11013e.mo11278c());
        if (this.f11011c) {
            this.f11015g.f11005c.sendMessageDelayed(this.f11015g.f11005c.obtainMessage(1, this.f11013e), this.f11015g.f11008f);
            return;
        }
        this.f11010b = 2;
        try {
            this.f11015g.f11006d.mo11311a(this.f11015g.f11004b, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo11176a() {
        return this.f11011c;
    }

    /* renamed from: a */
    public final boolean mo11177a(ServiceConnection serviceConnection) {
        return this.f11009a.contains(serviceConnection);
    }

    /* renamed from: b */
    public final int mo11178b() {
        return this.f11010b;
    }

    /* renamed from: b */
    public final void mo11179b(ServiceConnection serviceConnection, String str) {
        this.f11015g.f11006d;
        this.f11015g.f11004b;
        this.f11009a.remove(serviceConnection);
    }

    /* renamed from: b */
    public final void mo11180b(String str) {
        this.f11015g.f11005c.removeMessages(1, this.f11013e);
        this.f11015g.f11006d.mo11311a(this.f11015g.f11004b, this);
        this.f11011c = false;
        this.f11010b = 2;
    }

    /* renamed from: c */
    public final boolean mo11181c() {
        return this.f11009a.isEmpty();
    }

    /* renamed from: d */
    public final IBinder mo11182d() {
        return this.f11012d;
    }

    /* renamed from: e */
    public final ComponentName mo11183e() {
        return this.f11014f;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f11015g.f11003a) {
            this.f11015g.f11005c.removeMessages(1, this.f11013e);
            this.f11012d = iBinder;
            this.f11014f = componentName;
            for (ServiceConnection onServiceConnected : this.f11009a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f11010b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11015g.f11003a) {
            this.f11015g.f11005c.removeMessages(1, this.f11013e);
            this.f11012d = null;
            this.f11014f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f11009a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f11010b = 2;
        }
    }
}
