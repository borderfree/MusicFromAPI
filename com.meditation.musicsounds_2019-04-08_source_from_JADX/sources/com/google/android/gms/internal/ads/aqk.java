package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.gms.common.C3183f;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class aqk {

    /* renamed from: a */
    private final Object f12601a = new Object();

    /* renamed from: b */
    private final ConditionVariable f12602b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f12603c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SharedPreferences f12604d = null;

    /* renamed from: e */
    private Context f12605e;

    /* renamed from: a */
    public final <T> T mo12297a(aqc<T> aqc) {
        if (this.f12602b.block(5000)) {
            if (!this.f12603c || this.f12604d == null) {
                synchronized (this.f12601a) {
                    if (this.f12603c) {
                        if (this.f12604d == null) {
                        }
                    }
                    T b = aqc.mo12289b();
                    return b;
                }
            }
            return C3710lk.m19088a(this.f12605e, new aql(this, aqc));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }

    /* renamed from: a */
    public final void mo12298a(Context context) {
        if (!this.f12603c) {
            synchronized (this.f12601a) {
                if (!this.f12603c) {
                    this.f12605e = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        Context remoteContext = C3183f.getRemoteContext(context);
                        if (remoteContext == null && context != null) {
                            remoteContext = context.getApplicationContext();
                            if (remoteContext == null) {
                                remoteContext = context;
                            }
                        }
                        if (remoteContext != null) {
                            ane.m16648d();
                            this.f12604d = remoteContext.getSharedPreferences("google_ads_flags", 0);
                            this.f12603c = true;
                            this.f12602b.open();
                        }
                    } finally {
                        this.f12602b.open();
                    }
                }
            }
        }
    }
}
