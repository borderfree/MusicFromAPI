package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.internal.C3266s;

public abstract class RemoteCreator<T> {

    /* renamed from: a */
    private final String f11228a;

    /* renamed from: b */
    private T f11229b;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(String str) {
        this.f11228a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final T mo11331a(Context context) {
        if (this.f11229b == null) {
            C3266s.m14913a(context);
            Context remoteContext = C3183f.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.f11229b = mo11332a((IBinder) remoteContext.getClassLoader().loadClass(this.f11228a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new RemoteCreatorException("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException("Could not access creator.", e3);
                }
            } else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }
        return this.f11229b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo11332a(IBinder iBinder);
}
