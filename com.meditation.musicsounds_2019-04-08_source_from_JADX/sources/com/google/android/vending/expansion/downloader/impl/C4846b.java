package com.google.android.vending.expansion.downloader.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.vending.expansion.downloader.impl.b */
public abstract class C4846b extends Service {

    /* renamed from: a */
    private String f17453a;

    /* renamed from: b */
    private boolean f17454b;

    /* renamed from: c */
    private volatile C4847a f17455c;

    /* renamed from: d */
    private volatile Looper f17456d;

    /* renamed from: com.google.android.vending.expansion.downloader.impl.b$a */
    private final class C4847a extends Handler {
        public C4847a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C4846b.this.mo15982a((Intent) message.obj);
            if (C4846b.this.mo15984e()) {
                Log.d("CancellableIntentService", "stopSelf");
                C4846b.this.stopSelf(message.arg1);
                Log.d("CancellableIntentService", "afterStopSelf");
            }
        }
    }

    public C4846b(String str) {
        this.f17453a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15982a(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo15984e();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        StringBuilder sb = new StringBuilder();
        sb.append("IntentService[");
        sb.append(this.f17453a);
        sb.append("]");
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        this.f17456d = handlerThread.getLooper();
        this.f17455c = new C4847a(this.f17456d);
    }

    public void onDestroy() {
        Thread thread = this.f17456d.getThread();
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        this.f17456d.quit();
        Log.d("CancellableIntentService", "onDestroy");
    }

    public void onStart(Intent intent, int i) {
        if (!this.f17455c.hasMessages(-10)) {
            Message obtainMessage = this.f17455c.obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = intent;
            obtainMessage.what = -10;
            this.f17455c.sendMessage(obtainMessage);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.f17454b ? 3 : 2;
    }
}
