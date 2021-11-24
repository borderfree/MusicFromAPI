package android.support.p009v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p009v4.app.C0364f;
import android.support.p009v4.media.MediaMetadataCompat;
import android.support.p009v4.media.session.C0538a.C0539a;
import android.support.p009v4.media.session.C0541b.C0542a;
import android.support.p009v4.media.session.C0544c.C0545a;
import android.support.p009v4.media.session.MediaSessionCompat.QueueItem;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 {

        /* renamed from: a */
        private final List<C0527a> f1555a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0541b f1556b;

        /* renamed from: c */
        private HashMap<C0527a, C0526a> f1557c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f1558a;

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1558a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    mediaControllerImplApi21.f1556b = C0542a.m2471a(C0364f.m1533a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    mediaControllerImplApi21.m2337a();
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        private static class C0526a extends C0530c {
            C0526a(C0527a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public void mo2084a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2085a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2086a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2087a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2088a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2089a(List<QueueItem> list) {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2337a() {
            if (this.f1556b != null) {
                synchronized (this.f1555a) {
                    for (C0527a aVar : this.f1555a) {
                        C0526a aVar2 = new C0526a(aVar);
                        this.f1557c.put(aVar, aVar2);
                        aVar.f1560b = true;
                        try {
                            this.f1556b.mo2171a((C0538a) aVar2);
                            aVar.mo2090a();
                        } catch (RemoteException e) {
                            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                        }
                    }
                    this.f1555a.clear();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0527a implements DeathRecipient {

        /* renamed from: a */
        C0528a f1559a;

        /* renamed from: b */
        boolean f1560b;

        /* renamed from: c */
        private final Object f1561c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class C0528a extends Handler {

            /* renamed from: a */
            boolean f1562a;

            /* renamed from: b */
            final /* synthetic */ C0527a f1563b;

            public void handleMessage(Message message) {
                if (this.f1562a) {
                    switch (message.what) {
                        case 1:
                            this.f1563b.mo2098a((String) message.obj, message.getData());
                            break;
                        case 2:
                            this.f1563b.mo2096a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.f1563b.mo2094a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.f1563b.mo2095a((C0531b) message.obj);
                            break;
                        case 5:
                            this.f1563b.mo2099a((List) message.obj);
                            break;
                        case 6:
                            this.f1563b.mo2097a((CharSequence) message.obj);
                            break;
                        case 7:
                            this.f1563b.mo2093a((Bundle) message.obj);
                            break;
                        case 8:
                            this.f1563b.mo2101b();
                            break;
                        case 9:
                            this.f1563b.mo2091a(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.f1563b.mo2100a(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.f1563b.mo2102b(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.f1563b.mo2090a();
                            break;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        private static class C0529b implements C0545a {

            /* renamed from: a */
            private final WeakReference<C0527a> f1564a;

            C0529b(C0527a aVar) {
                this.f1564a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo2104a() {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    aVar.mo2101b();
                }
            }

            /* renamed from: a */
            public void mo2105a(int i, int i2, int i3, int i4, int i5) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    C0531b bVar = new C0531b(i, i2, i3, i4, i5);
                    aVar.mo2095a(bVar);
                }
            }

            /* renamed from: a */
            public void mo2106a(Bundle bundle) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    aVar.mo2093a(bundle);
                }
            }

            /* renamed from: a */
            public void mo2107a(CharSequence charSequence) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    aVar.mo2097a(charSequence);
                }
            }

            /* renamed from: a */
            public void mo2108a(Object obj) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null && !aVar.f1560b) {
                    aVar.mo2096a(PlaybackStateCompat.m2389a(obj));
                }
            }

            /* renamed from: a */
            public void mo2109a(String str, Bundle bundle) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar == null) {
                    return;
                }
                if (!aVar.f1560b || VERSION.SDK_INT >= 23) {
                    aVar.mo2098a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo2110a(List<?> list) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    aVar.mo2099a(QueueItem.m2380a(list));
                }
            }

            /* renamed from: b */
            public void mo2111b(Object obj) {
                C0527a aVar = (C0527a) this.f1564a.get();
                if (aVar != null) {
                    aVar.mo2094a(MediaMetadataCompat.m2310a(obj));
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        private static class C0530c extends C0539a {

            /* renamed from: a */
            private final WeakReference<C0527a> f1565a;

            C0530c(C0527a aVar) {
                this.f1565a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo2084a() {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(8, null, null);
                }
            }

            /* renamed from: a */
            public void mo2112a(int i) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo2085a(Bundle bundle) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public void mo2086a(MediaMetadataCompat mediaMetadataCompat) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: a */
            public void mo2087a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(4, parcelableVolumeInfo != null ? new C0531b(parcelableVolumeInfo.f1577a, parcelableVolumeInfo.f1578b, parcelableVolumeInfo.f1579c, parcelableVolumeInfo.f1580d, parcelableVolumeInfo.f1581e) : null, null);
                }
            }

            /* renamed from: a */
            public void mo2113a(PlaybackStateCompat playbackStateCompat) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: a */
            public void mo2088a(CharSequence charSequence) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(6, charSequence, null);
                }
            }

            /* renamed from: a */
            public void mo2114a(String str, Bundle bundle) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(1, str, bundle);
                }
            }

            /* renamed from: a */
            public void mo2089a(List<QueueItem> list) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo2115a(boolean z) {
            }

            /* renamed from: b */
            public void mo2116b() {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(13, null, null);
                }
            }

            /* renamed from: b */
            public void mo2117b(int i) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: b */
            public void mo2118b(boolean z) {
                C0527a aVar = (C0527a) this.f1565a.get();
                if (aVar != null) {
                    aVar.mo2092a(11, Boolean.valueOf(z), null);
                }
            }
        }

        public C0527a() {
            this.f1561c = VERSION.SDK_INT >= 21 ? C0544c.m2521a(new C0529b(this)) : new C0530c(this);
        }

        /* renamed from: a */
        public void mo2090a() {
        }

        /* renamed from: a */
        public void mo2091a(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2092a(int i, Object obj, Bundle bundle) {
            if (this.f1559a != null) {
                Message obtainMessage = this.f1559a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* renamed from: a */
        public void mo2093a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2094a(MediaMetadataCompat mediaMetadataCompat) {
        }

        /* renamed from: a */
        public void mo2095a(C0531b bVar) {
        }

        /* renamed from: a */
        public void mo2096a(PlaybackStateCompat playbackStateCompat) {
        }

        /* renamed from: a */
        public void mo2097a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo2098a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2099a(List<QueueItem> list) {
        }

        /* renamed from: a */
        public void mo2100a(boolean z) {
        }

        /* renamed from: b */
        public void mo2101b() {
        }

        /* renamed from: b */
        public void mo2102b(int i) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    public static final class C0531b {

        /* renamed from: a */
        private final int f1566a;

        /* renamed from: b */
        private final int f1567b;

        /* renamed from: c */
        private final int f1568c;

        /* renamed from: d */
        private final int f1569d;

        /* renamed from: e */
        private final int f1570e;

        C0531b(int i, int i2, int i3, int i4, int i5) {
            this.f1566a = i;
            this.f1567b = i2;
            this.f1568c = i3;
            this.f1569d = i4;
            this.f1570e = i5;
        }
    }
}
