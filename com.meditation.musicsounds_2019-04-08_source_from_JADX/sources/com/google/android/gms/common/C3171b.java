package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.b */
public class C3171b implements ServiceConnection {

    /* renamed from: a */
    private boolean f10945a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f10946b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo11093a() {
        C3266s.m14926c("BlockingServiceConnection.getService() called on main thread");
        if (!this.f10945a) {
            this.f10945a = true;
            return (IBinder) this.f10946b.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    /* renamed from: a */
    public IBinder mo11094a(long j, TimeUnit timeUnit) {
        C3266s.m14926c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f10945a) {
            this.f10945a = true;
            IBinder iBinder = (IBinder) this.f10946b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f10946b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
