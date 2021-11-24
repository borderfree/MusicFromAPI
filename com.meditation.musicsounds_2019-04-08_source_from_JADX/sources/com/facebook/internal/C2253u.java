package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.u */
public abstract class C2253u implements ServiceConnection {

    /* renamed from: a */
    private final Context f7249a;

    /* renamed from: b */
    private final Handler f7250b;

    /* renamed from: c */
    private C2255a f7251c;

    /* renamed from: d */
    private boolean f7252d;

    /* renamed from: e */
    private Messenger f7253e;

    /* renamed from: f */
    private int f7254f;

    /* renamed from: g */
    private int f7255g;

    /* renamed from: h */
    private final String f7256h;

    /* renamed from: i */
    private final int f7257i;

    /* renamed from: com.facebook.internal.u$a */
    public interface C2255a {
        /* renamed from: a */
        void mo7884a(Bundle bundle);
    }

    public C2253u(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f7249a = context;
        this.f7254f = i;
        this.f7255g = i2;
        this.f7256h = str;
        this.f7257i = i3;
        this.f7250b = new Handler() {
            public void handleMessage(Message message) {
                C2253u.this.mo7877a(message);
            }
        };
    }

    /* renamed from: b */
    private void m10341b(Bundle bundle) {
        if (this.f7252d) {
            this.f7252d = false;
            C2255a aVar = this.f7251c;
            if (aVar != null) {
                aVar.mo7884a(bundle);
            }
        }
    }

    /* renamed from: c */
    private void m10342c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f7256h);
        mo7876a(bundle);
        Message obtain = Message.obtain(null, this.f7254f);
        obtain.arg1 = this.f7257i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f7250b);
        try {
            this.f7253e.send(obtain);
        } catch (RemoteException unused) {
            m10341b(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7876a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7877a(Message message) {
        if (message.what == this.f7255g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            m10341b(data);
            try {
                this.f7249a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo7878a(C2255a aVar) {
        this.f7251c = aVar;
    }

    /* renamed from: a */
    public boolean mo7879a() {
        if (this.f7252d || C2244t.m10304b(this.f7257i) == -1) {
            return false;
        }
        Intent a = C2244t.m10291a(this.f7249a);
        if (a == null) {
            return false;
        }
        this.f7252d = true;
        this.f7249a.bindService(a, this, 1);
        return true;
    }

    /* renamed from: b */
    public void mo7880b() {
        this.f7252d = false;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7253e = new Messenger(iBinder);
        m10342c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f7253e = null;
        try {
            this.f7249a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m10341b(null);
    }
}
