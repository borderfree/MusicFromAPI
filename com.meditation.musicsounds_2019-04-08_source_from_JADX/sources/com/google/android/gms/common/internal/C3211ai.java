package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.internal.p129d.C4170e;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.ai */
final class C3211ai extends C3248j implements Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: a */
    public final HashMap<C3249a, C3212aj> f11003a = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f11004b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Handler f11005c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C3285a f11006d;

    /* renamed from: e */
    private final long f11007e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f11008f;

    C3211ai(Context context) {
        this.f11004b = context.getApplicationContext();
        this.f11005c = new C4170e(context.getMainLooper(), this);
        this.f11006d = C3285a.m15014a();
        this.f11007e = 5000;
        this.f11008f = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11171a(C3249a aVar, ServiceConnection serviceConnection, String str) {
        boolean a;
        C3266s.m14914a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f11003a) {
            C3212aj ajVar = (C3212aj) this.f11003a.get(aVar);
            if (ajVar == null) {
                ajVar = new C3212aj(this, aVar);
                ajVar.mo11174a(serviceConnection, str);
                ajVar.mo11175a(str);
                this.f11003a.put(aVar, ajVar);
            } else {
                this.f11005c.removeMessages(0, aVar);
                if (!ajVar.mo11177a(serviceConnection)) {
                    ajVar.mo11174a(serviceConnection, str);
                    switch (ajVar.mo11178b()) {
                        case 1:
                            serviceConnection.onServiceConnected(ajVar.mo11183e(), ajVar.mo11182d());
                            break;
                        case 2:
                            ajVar.mo11175a(str);
                            break;
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            a = ajVar.mo11176a();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11172b(C3249a aVar, ServiceConnection serviceConnection, String str) {
        C3266s.m14914a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f11003a) {
            C3212aj ajVar = (C3212aj) this.f11003a.get(aVar);
            if (ajVar == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (ajVar.mo11177a(serviceConnection)) {
                ajVar.mo11179b(serviceConnection, str);
                if (ajVar.mo11181c()) {
                    this.f11005c.sendMessageDelayed(this.f11005c.obtainMessage(0, aVar), this.f11007e);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                synchronized (this.f11003a) {
                    C3249a aVar = (C3249a) message.obj;
                    C3212aj ajVar = (C3212aj) this.f11003a.get(aVar);
                    if (ajVar != null && ajVar.mo11181c()) {
                        if (ajVar.mo11176a()) {
                            ajVar.mo11180b("GmsClientSupervisor");
                        }
                        this.f11003a.remove(aVar);
                    }
                }
                return true;
            case 1:
                synchronized (this.f11003a) {
                    C3249a aVar2 = (C3249a) message.obj;
                    C3212aj ajVar2 = (C3212aj) this.f11003a.get(aVar2);
                    if (ajVar2 != null && ajVar2.mo11178b() == 3) {
                        String valueOf = String.valueOf(aVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName e = ajVar2.mo11183e();
                        if (e == null) {
                            e = aVar2.mo11277b();
                        }
                        if (e == null) {
                            e = new ComponentName(aVar2.mo11276a(), "unknown");
                        }
                        ajVar2.onServiceDisconnected(e);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
