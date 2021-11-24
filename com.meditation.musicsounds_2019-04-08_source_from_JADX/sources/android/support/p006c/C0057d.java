package android.support.p006c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.p006c.C0063g.C0064a;

/* renamed from: android.support.c.d */
public abstract class C0057d implements ServiceConnection {
    /* renamed from: a */
    public abstract void mo107a(ComponentName componentName, C0047b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo107a(componentName, new C0047b(C0064a.m171a(iBinder), componentName) {
        });
    }
}
