package com.google.android.vending.expansion.downloader;

import android.app.PendingIntent;
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
import com.google.android.vending.expansion.downloader.impl.DownloaderService;

/* renamed from: com.google.android.vending.expansion.downloader.b */
public class C4822b {

    /* renamed from: com.google.android.vending.expansion.downloader.b$a */
    private static class C4823a implements C4832e {

        /* renamed from: a */
        private Messenger f17372a;

        public C4823a(Messenger messenger) {
            this.f17372a = messenger;
        }

        /* renamed from: a */
        private void m24125a(int i, Bundle bundle) {
            Message obtain = Message.obtain(null, i);
            obtain.setData(bundle);
            try {
                this.f17372a.send(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo15959a(int i) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("newState", i);
            m24125a(10, bundle);
        }

        /* renamed from: a */
        public void mo15960a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo15961a(DownloadProgressInfo downloadProgressInfo) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("progress", downloadProgressInfo);
            m24125a(11, bundle);
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.b$b */
    private static class C4824b implements C4834g {

        /* renamed from: a */
        final Messenger f17373a = new Messenger(new Handler() {
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 10:
                        C4824b.this.f17374b.mo15959a(message.getData().getInt("newState"));
                        return;
                    case 11:
                        Bundle data = message.getData();
                        if (C4824b.this.f17378f != null) {
                            data.setClassLoader(C4824b.this.f17378f.getClassLoader());
                            C4824b.this.f17374b.mo15961a((DownloadProgressInfo) message.getData().getParcelable("progress"));
                            return;
                        }
                        return;
                    case 12:
                        C4824b.this.f17374b.mo15960a((Messenger) message.getData().getParcelable("EMH"));
                        return;
                    default:
                        return;
                }
            }
        });
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4832e f17374b = null;

        /* renamed from: c */
        private Class<?> f17375c;

        /* renamed from: d */
        private boolean f17376d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Messenger f17377e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Context f17378f;

        /* renamed from: g */
        private ServiceConnection f17379g = new ServiceConnection() {
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                C4824b.this.f17377e = new Messenger(iBinder);
                C4824b.this.f17374b.mo15960a(C4824b.this.f17377e);
            }

            public void onServiceDisconnected(ComponentName componentName) {
                C4824b.this.f17377e = null;
            }
        };

        public C4824b(C4832e eVar, Class<?> cls) {
            this.f17374b = eVar;
            this.f17375c = cls;
        }

        /* renamed from: a */
        public Messenger mo15962a() {
            return this.f17373a;
        }

        /* renamed from: a */
        public void mo15963a(Context context) {
            this.f17378f = context;
            Intent intent = new Intent(context, this.f17375c);
            intent.putExtra("EMH", this.f17373a);
            if (context.bindService(intent, this.f17379g, 2)) {
                this.f17376d = true;
            }
        }

        /* renamed from: b */
        public void mo15964b(Context context) {
            if (this.f17376d) {
                context.unbindService(this.f17379g);
                this.f17376d = false;
            }
            this.f17378f = null;
        }
    }

    /* renamed from: a */
    public static int m24121a(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return DownloaderService.m24204a(context, pendingIntent, cls);
    }

    /* renamed from: a */
    public static int m24122a(Context context, Intent intent, Class<?> cls) {
        return DownloaderService.m24206a(context, intent, cls);
    }

    /* renamed from: a */
    public static C4832e m24123a(Messenger messenger) {
        return new C4823a(messenger);
    }

    /* renamed from: a */
    public static C4834g m24124a(C4832e eVar, Class<?> cls) {
        return new C4824b(eVar, cls);
    }
}
