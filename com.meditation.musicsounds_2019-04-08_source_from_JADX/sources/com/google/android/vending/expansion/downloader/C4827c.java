package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.android.vending.expansion.downloader.c */
public class C4827c {

    /* renamed from: com.google.android.vending.expansion.downloader.c$a */
    private static class C4828a implements C4833f {

        /* renamed from: a */
        private Messenger f17382a;

        public C4828a(Messenger messenger) {
            this.f17382a = messenger;
        }

        /* renamed from: a */
        private void m24138a(int i, Bundle bundle) {
            Message obtain = Message.obtain(null, i);
            obtain.setData(bundle);
            try {
                this.f17382a.send(obtain);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public void mo15968a() {
            m24138a(1, new Bundle());
        }

        /* renamed from: a */
        public void mo15969a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("flags", i);
            m24138a(3, bundle);
        }

        /* renamed from: a */
        public void mo15970a(Messenger messenger) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("EMH", messenger);
            m24138a(6, bundle);
        }

        /* renamed from: b */
        public void mo15971b() {
            m24138a(2, new Bundle());
        }

        /* renamed from: c */
        public void mo15972c() {
            m24138a(4, new Bundle());
        }

        /* renamed from: d */
        public void mo15973d() {
            m24138a(5, new Bundle());
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.c$b */
    private static class C4829b implements C4834g {

        /* renamed from: a */
        final Messenger f17383a = new Messenger(new Handler() {
            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C4829b.this.f17384b.mo15968a();
                        return;
                    case 2:
                        C4829b.this.f17384b.mo15971b();
                        return;
                    case 3:
                        C4829b.this.f17384b.mo15969a(message.getData().getInt("flags"));
                        return;
                    case 4:
                        C4829b.this.f17384b.mo15972c();
                        return;
                    case 5:
                        C4829b.this.f17384b.mo15973d();
                        return;
                    case 6:
                        C4829b.this.f17384b.mo15970a((Messenger) message.getData().getParcelable("EMH"));
                        return;
                    default:
                        return;
                }
            }
        });
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4833f f17384b = null;

        public C4829b(C4833f fVar) {
            this.f17384b = fVar;
        }

        /* renamed from: a */
        public Messenger mo15962a() {
            return this.f17383a;
        }

        /* renamed from: a */
        public void mo15963a(Context context) {
        }

        /* renamed from: b */
        public void mo15964b(Context context) {
        }
    }

    /* renamed from: a */
    public static C4833f m24136a(Messenger messenger) {
        return new C4828a(messenger);
    }

    /* renamed from: a */
    public static C4834g m24137a(C4833f fVar) {
        return new C4829b(fVar);
    }
}
