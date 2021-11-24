package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.k */
final class C4958k {

    /* renamed from: a */
    private final Messenger f17765a;

    /* renamed from: b */
    private final zzl f17766b;

    C4958k(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f17765a = new Messenger(iBinder);
            this.f17766b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f17766b = new zzl(iBinder);
            this.f17765a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16230a(Message message) {
        if (this.f17765a != null) {
            this.f17765a.send(message);
        } else if (this.f17766b != null) {
            this.f17766b.mo16258a(message);
        } else {
            throw new IllegalStateException("Both messengers are null");
        }
    }
}
