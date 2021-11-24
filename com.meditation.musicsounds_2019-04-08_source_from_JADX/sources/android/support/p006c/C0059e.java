package android.support.p006c;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.c.e */
public final class C0059e {

    /* renamed from: a */
    private final Object f100a = new Object();

    /* renamed from: b */
    private final C0063g f101b;

    /* renamed from: c */
    private final C0060f f102c;

    /* renamed from: d */
    private final ComponentName f103d;

    C0059e(C0063g gVar, C0060f fVar, ComponentName componentName) {
        this.f101b = gVar;
        this.f102c = fVar;
        this.f103d = componentName;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo109a() {
        return this.f102c.asBinder();
    }

    /* renamed from: a */
    public boolean mo110a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f101b.mo121a(this.f102c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ComponentName mo111b() {
        return this.f103d;
    }
}
