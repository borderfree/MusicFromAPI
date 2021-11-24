package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3036b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3256o.C3257a;
import com.google.android.gms.internal.p129d.C4170e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C3227d<T extends IInterface> {

    /* renamed from: d */
    public static final String[] f11026d = {"service_esmobile", "service_googleme"};

    /* renamed from: e */
    private static final Feature[] f11027e = new Feature[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public ConnectionResult f11028A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f11029B;

    /* renamed from: C */
    private volatile zzb f11030C;

    /* renamed from: a */
    final Handler f11031a;

    /* renamed from: b */
    protected C3230c f11032b;

    /* renamed from: c */
    protected AtomicInteger f11033c;

    /* renamed from: f */
    private int f11034f;

    /* renamed from: g */
    private long f11035g;

    /* renamed from: h */
    private long f11036h;

    /* renamed from: i */
    private int f11037i;

    /* renamed from: j */
    private long f11038j;

    /* renamed from: k */
    private C3214al f11039k;

    /* renamed from: l */
    private final Context f11040l;

    /* renamed from: m */
    private final Looper f11041m;

    /* renamed from: n */
    private final C3248j f11042n;

    /* renamed from: o */
    private final C3182e f11043o;

    /* renamed from: p */
    private final Object f11044p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Object f11045q;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: r */
    public C3258p f11046r;
    @GuardedBy("mLock")

    /* renamed from: s */
    private T f11047s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final ArrayList<C3235h<?>> f11048t;
    @GuardedBy("mLock")

    /* renamed from: u */
    private C3237j f11049u;
    @GuardedBy("mLock")

    /* renamed from: v */
    private int f11050v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C3228a f11051w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C3229b f11052x;

    /* renamed from: y */
    private final int f11053y;

    /* renamed from: z */
    private final String f11054z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public interface C3228a {
        /* renamed from: a */
        void mo11230a(int i);

        /* renamed from: a */
        void mo11231a(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public interface C3229b {
        /* renamed from: a */
        void mo11160a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    public interface C3230c {
        /* renamed from: a */
        void mo11054a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    protected class C3231d implements C3230c {
        public C3231d() {
        }

        /* renamed from: a */
        public void mo11054a(ConnectionResult connectionResult) {
            if (connectionResult.mo10759b()) {
                C3227d.this.mo11208a((C3252m) null, C3227d.this.mo11229y());
                return;
            }
            if (C3227d.this.f11052x != null) {
                C3227d.this.f11052x.mo11160a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    public interface C3232e {
        /* renamed from: a */
        void mo10953a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    private abstract class C3233f extends C3235h<Boolean> {

        /* renamed from: a */
        private final int f11056a;

        /* renamed from: b */
        private final Bundle f11057b;

        protected C3233f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f11056a = i;
            this.f11057b = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11232a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo11233a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C3227d.this.m14761b(1, null);
                return;
            }
            int i = this.f11056a;
            if (i != 0) {
                if (i != 10) {
                    C3227d.this.m14761b(1, null);
                    if (this.f11057b != null) {
                        pendingIntent = (PendingIntent) this.f11057b.getParcelable("pendingIntent");
                    }
                    mo11232a(new ConnectionResult(this.f11056a, pendingIntent));
                } else {
                    C3227d.this.m14761b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C3227d.this.mo10739i_(), C3227d.this.mo10734b()}));
                }
            } else if (!mo11234a()) {
                C3227d.this.m14761b(1, null);
                mo11232a(new ConnectionResult(8, null));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo11234a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo11235b() {
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$g */
    final class C3234g extends C4170e {
        public C3234g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m14819a(Message message) {
            C3235h hVar = (C3235h) message.obj;
            hVar.mo11235b();
            hVar.mo11238d();
        }

        /* renamed from: b */
        private static boolean m14820b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 7;
        }

        public final void handleMessage(Message message) {
            if (C3227d.this.f11033c.get() != message.arg1) {
                if (m14820b(message)) {
                    m14819a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !C3227d.this.mo11213i()) {
                m14819a(message);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 4) {
                    C3227d.this.f11028A = new ConnectionResult(message.arg2);
                    if (!C3227d.this.mo15889A() || C3227d.this.f11029B) {
                        ConnectionResult d = C3227d.this.f11028A != null ? C3227d.this.f11028A : new ConnectionResult(8);
                        C3227d.this.f11032b.mo11054a(d);
                        C3227d.this.mo11204a(d);
                        return;
                    }
                    C3227d.this.m14761b(3, null);
                } else if (message.what == 5) {
                    ConnectionResult d2 = C3227d.this.f11028A != null ? C3227d.this.f11028A : new ConnectionResult(8);
                    C3227d.this.f11032b.mo11054a(d2);
                    C3227d.this.mo11204a(d2);
                } else if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                    C3227d.this.f11032b.mo11054a(connectionResult);
                    C3227d.this.mo11204a(connectionResult);
                } else if (message.what == 6) {
                    C3227d.this.m14761b(5, null);
                    if (C3227d.this.f11051w != null) {
                        C3227d.this.f11051w.mo11230a(message.arg2);
                    }
                    C3227d.this.mo11199a(message.arg2);
                    C3227d.this.m14759a(5, 1, null);
                } else if (message.what == 2 && !C3227d.this.mo11212h()) {
                    m14819a(message);
                } else if (m14820b(message)) {
                    ((C3235h) message.obj).mo11237c();
                } else {
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("GmsClient", sb.toString(), new Exception());
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    protected abstract class C3235h<TListener> {

        /* renamed from: a */
        private TListener f11060a;

        /* renamed from: b */
        private boolean f11061b = false;

        public C3235h(TListener tlistener) {
            this.f11060a = tlistener;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo11233a(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo11235b();

        /* renamed from: c */
        public final void mo11237c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f11060a;
                if (this.f11061b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    mo11233a(tlistener);
                } catch (RuntimeException e) {
                    mo11235b();
                    throw e;
                }
            } else {
                mo11235b();
            }
            synchronized (this) {
                this.f11061b = true;
            }
            mo11238d();
        }

        /* renamed from: d */
        public final void mo11238d() {
            mo11239e();
            synchronized (C3227d.this.f11048t) {
                C3227d.this.f11048t.remove(this);
            }
        }

        /* renamed from: e */
        public final void mo11239e() {
            synchronized (this) {
                this.f11060a = null;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$i */
    public static final class C3236i extends C3257a {

        /* renamed from: a */
        private C3227d f11063a;

        /* renamed from: b */
        private final int f11064b;

        public C3236i(C3227d dVar, int i) {
            this.f11063a = dVar;
            this.f11064b = i;
        }

        /* renamed from: a */
        public final void mo11192a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        /* renamed from: a */
        public final void mo11193a(int i, IBinder iBinder, Bundle bundle) {
            C3266s.m14914a(this.f11063a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f11063a.mo11201a(i, iBinder, bundle, this.f11064b);
            this.f11063a = null;
        }

        /* renamed from: a */
        public final void mo11194a(int i, IBinder iBinder, zzb zzb) {
            C3266s.m14914a(this.f11063a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C3266s.m14913a(zzb);
            this.f11063a.m14758a(zzb);
            mo11193a(i, iBinder, zzb.f11131a);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$j */
    public final class C3237j implements ServiceConnection {

        /* renamed from: a */
        private final int f11065a;

        public C3237j(int i) {
            this.f11065a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3258p pVar;
            if (iBinder == null) {
                C3227d.this.m14763c(16);
                return;
            }
            synchronized (C3227d.this.f11045q) {
                C3227d dVar = C3227d.this;
                if (iBinder == null) {
                    pVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    pVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C3258p)) ? new C3260a(iBinder) : (C3258p) queryLocalInterface;
                }
                dVar.f11046r = pVar;
            }
            C3227d.this.mo11200a(0, (Bundle) null, this.f11065a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C3227d.this.f11045q) {
                C3227d.this.f11046r = null;
            }
            C3227d.this.f11031a.sendMessage(C3227d.this.f11031a.obtainMessage(6, this.f11065a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$k */
    protected final class C3238k extends C3233f {

        /* renamed from: a */
        private final IBinder f11067a;

        public C3238k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f11067a = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11232a(ConnectionResult connectionResult) {
            if (C3227d.this.f11052x != null) {
                C3227d.this.f11052x.mo11160a(connectionResult);
            }
            C3227d.this.mo11204a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo11234a() {
            boolean z = false;
            try {
                String interfaceDescriptor = this.f11067a.getInterfaceDescriptor();
                if (!C3227d.this.mo10734b().equals(interfaceDescriptor)) {
                    String b = C3227d.this.mo10734b();
                    StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(b);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a = C3227d.this.mo10733a(this.f11067a);
                if (a != null && (C3227d.this.m14759a(2, 4, a) || C3227d.this.m14759a(3, 4, a))) {
                    C3227d.this.f11028A = null;
                    Bundle a2 = C3227d.this.mo11198a();
                    if (C3227d.this.f11051w != null) {
                        C3227d.this.f11051w.mo11231a(a2);
                    }
                    z = true;
                }
                return z;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$l */
    protected final class C3239l extends C3233f {
        public C3239l(int i, Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11232a(ConnectionResult connectionResult) {
            C3227d.this.f11032b.mo11054a(connectionResult);
            C3227d.this.mo11204a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo11234a() {
            C3227d.this.f11032b.mo11054a(ConnectionResult.f10553a);
            return true;
        }
    }

    protected C3227d(Context context, Looper looper, int i, C3228a aVar, C3229b bVar, String str) {
        this(context, looper, C3248j.m14881a(context), C3182e.m14660b(), i, (C3228a) C3266s.m14913a(aVar), (C3229b) C3266s.m14913a(bVar), str);
    }

    protected C3227d(Context context, Looper looper, C3248j jVar, C3182e eVar, int i, C3228a aVar, C3229b bVar, String str) {
        this.f11044p = new Object();
        this.f11045q = new Object();
        this.f11048t = new ArrayList<>();
        this.f11050v = 1;
        this.f11028A = null;
        this.f11029B = false;
        this.f11030C = null;
        this.f11033c = new AtomicInteger(0);
        this.f11040l = (Context) C3266s.m14914a(context, (Object) "Context must not be null");
        this.f11041m = (Looper) C3266s.m14914a(looper, (Object) "Looper must not be null");
        this.f11042n = (C3248j) C3266s.m14914a(jVar, (Object) "Supervisor must not be null");
        this.f11043o = (C3182e) C3266s.m14914a(eVar, (Object) "API availability must not be null");
        this.f11031a = new C3234g(looper);
        this.f11053y = i;
        this.f11051w = aVar;
        this.f11052x = bVar;
        this.f11054z = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final boolean mo15889A() {
        if (this.f11029B || TextUtils.isEmpty(mo10734b()) || TextUtils.isEmpty(mo11220p())) {
            return false;
        }
        try {
            Class.forName(mo10734b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14758a(zzb zzb) {
        this.f11030C = zzb;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m14759a(int i, int i2, T t) {
        synchronized (this.f11044p) {
            if (this.f11050v != i) {
                return false;
            }
            m14761b(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m14761b(int i, T t) {
        C3266s.m14923b((i == 4) == (t != null));
        synchronized (this.f11044p) {
            this.f11050v = i;
            this.f11047s = t;
            mo11202a(i, t);
            switch (i) {
                case 1:
                    if (this.f11049u != null) {
                        this.f11042n.mo11272a(mo10739i_(), mo11219o(), 129, this.f11049u, mo10737e());
                        this.f11049u = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!(this.f11049u == null || this.f11039k == null)) {
                        String a = this.f11039k.mo11186a();
                        String b = this.f11039k.mo11187b();
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 70 + String.valueOf(b).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append(b);
                        Log.e("GmsClient", sb.toString());
                        this.f11042n.mo11272a(this.f11039k.mo11186a(), this.f11039k.mo11187b(), this.f11039k.mo11188c(), this.f11049u, mo10737e());
                        this.f11033c.incrementAndGet();
                    }
                    this.f11049u = new C3237j(this.f11033c.get());
                    this.f11039k = (this.f11050v != 3 || mo11220p() == null) ? new C3214al(mo11219o(), mo10739i_(), false, 129) : new C3214al(mo11222r().getPackageName(), mo11220p(), true, 129);
                    if (!this.f11042n.mo11171a(new C3249a(this.f11039k.mo11186a(), this.f11039k.mo11187b(), this.f11039k.mo11188c()), (ServiceConnection) this.f11049u, mo10737e())) {
                        String a2 = this.f11039k.mo11186a();
                        String b2 = this.f11039k.mo11187b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a2);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        mo11200a(16, (Bundle) null, this.f11033c.get());
                        break;
                    }
                    break;
                case 4:
                    mo11203a(t);
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m14763c(int i) {
        int i2;
        if (mo11262z()) {
            i2 = 5;
            this.f11029B = true;
        } else {
            i2 = 4;
        }
        this.f11031a.sendMessage(this.f11031a.obtainMessage(i2, this.f11033c.get(), 16));
    }

    /* renamed from: e */
    private final String mo10737e() {
        return this.f11054z == null ? this.f11040l.getClass().getName() : this.f11054z;
    }

    /* renamed from: z */
    private final boolean mo11262z() {
        boolean z;
        synchronized (this.f11044p) {
            z = this.f11050v == 3;
        }
        return z;
    }

    /* renamed from: a */
    public Bundle mo11198a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo10733a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11199a(int i) {
        this.f11034f = i;
        this.f11035g = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11200a(int i, Bundle bundle, int i2) {
        this.f11031a.sendMessage(this.f11031a.obtainMessage(7, i2, -1, new C3239l(i, null)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11201a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f11031a.sendMessage(this.f11031a.obtainMessage(1, i2, -1, new C3238k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11202a(int i, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11203a(T t) {
        this.f11036h = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11204a(ConnectionResult connectionResult) {
        this.f11037i = connectionResult.mo10760c();
        this.f11038j = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo11205a(C3230c cVar) {
        this.f11032b = (C3230c) C3266s.m14914a(cVar, (Object) "Connection progress callbacks cannot be null.");
        m14761b(2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11206a(C3230c cVar, int i, PendingIntent pendingIntent) {
        this.f11032b = (C3230c) C3266s.m14914a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f11031a.sendMessage(this.f11031a.obtainMessage(3, this.f11033c.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public void mo11207a(C3232e eVar) {
        eVar.mo10953a();
    }

    /* renamed from: a */
    public void mo11208a(C3252m mVar, Set<Scope> set) {
        Bundle u = mo11225u();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f11053y);
        getServiceRequest.f10973a = this.f11040l.getPackageName();
        getServiceRequest.f10976d = u;
        if (set != null) {
            getServiceRequest.f10975c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo11214j()) {
            getServiceRequest.f10977e = mo11223s() != null ? mo11223s() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                getServiceRequest.f10974b = mVar.asBinder();
            }
        } else if (mo11228x()) {
            getServiceRequest.f10977e = mo11223s();
        }
        getServiceRequest.f10978f = f11027e;
        getServiceRequest.f10979g = mo11224t();
        try {
            synchronized (this.f11045q) {
                if (this.f11046r != null) {
                    this.f11046r.mo11285a(new C3236i(this, this.f11033c.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo11210b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo11201a(8, (IBinder) null, (Bundle) null, this.f11033c.get());
        }
    }

    /* renamed from: a */
    public void mo11209a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C3258p pVar;
        String str2;
        String str3;
        synchronized (this.f11044p) {
            i = this.f11050v;
            t = this.f11047s;
        }
        synchronized (this.f11045q) {
            pVar = this.f11046r;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                str2 = "DISCONNECTED";
                break;
            case 2:
                str2 = "REMOTE_CONNECTING";
                break;
            case 3:
                str2 = "LOCAL_CONNECTING";
                break;
            case 4:
                str2 = "CONNECTED";
                break;
            case 5:
                str2 = "DISCONNECTING";
                break;
            default:
                str2 = "UNKNOWN";
                break;
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo10734b()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (pVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(pVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f11036h > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f11036h;
            String format = simpleDateFormat.format(new Date(this.f11036h));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f11035g > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f11034f) {
                case 1:
                    str3 = "CAUSE_SERVICE_DISCONNECTED";
                    break;
                case 2:
                    str3 = "CAUSE_NETWORK_LOST";
                    break;
                default:
                    str3 = String.valueOf(this.f11034f);
                    break;
            }
            printWriter.append(str3);
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f11035g;
            String format2 = simpleDateFormat.format(new Date(this.f11035g));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f11038j > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C3036b.m14027a(this.f11037i));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f11038j;
            String format3 = simpleDateFormat.format(new Date(this.f11038j));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo10734b();

    /* renamed from: b */
    public void mo11210b(int i) {
        this.f11031a.sendMessage(this.f11031a.obtainMessage(6, this.f11033c.get(), i));
    }

    /* renamed from: c */
    public boolean mo10735c() {
        return false;
    }

    /* renamed from: d */
    public Intent mo10736d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: f */
    public int mo10738f() {
        return C3182e.f10966b;
    }

    /* renamed from: g */
    public void mo11211g() {
        this.f11033c.incrementAndGet();
        synchronized (this.f11048t) {
            int size = this.f11048t.size();
            for (int i = 0; i < size; i++) {
                ((C3235h) this.f11048t.get(i)).mo11239e();
            }
            this.f11048t.clear();
        }
        synchronized (this.f11045q) {
            this.f11046r = null;
        }
        m14761b(1, null);
    }

    /* renamed from: h */
    public boolean mo11212h() {
        boolean z;
        synchronized (this.f11044p) {
            z = this.f11050v == 4;
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo11213i() {
        boolean z;
        synchronized (this.f11044p) {
            if (this.f11050v != 2) {
                if (this.f11050v != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public abstract String mo10739i_();

    /* renamed from: j */
    public boolean mo11214j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo11215k() {
        return true;
    }

    /* renamed from: l */
    public IBinder mo11216l() {
        synchronized (this.f11045q) {
            if (this.f11046r == null) {
                return null;
            }
            IBinder asBinder = this.f11046r.asBinder();
            return asBinder;
        }
    }

    /* renamed from: m */
    public String mo11217m() {
        if (mo11212h() && this.f11039k != null) {
            return this.f11039k.mo11187b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: n */
    public final Feature[] mo11218n() {
        zzb zzb = this.f11030C;
        if (zzb == null) {
            return null;
        }
        return zzb.f11132b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo11219o() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public String mo11220p() {
        return null;
    }

    /* renamed from: q */
    public void mo11221q() {
        int b = this.f11043o.mo11117b(this.f11040l, mo10738f());
        if (b != 0) {
            m14761b(1, null);
            mo11206a((C3230c) new C3231d(), b, (PendingIntent) null);
            return;
        }
        mo11205a((C3230c) new C3231d());
    }

    /* renamed from: r */
    public final Context mo11222r() {
        return this.f11040l;
    }

    /* renamed from: s */
    public Account mo11223s() {
        return null;
    }

    /* renamed from: t */
    public Feature[] mo11224t() {
        return f11027e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Bundle mo11225u() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo11226v() {
        if (!mo11212h()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: w */
    public final T mo11227w() {
        T t;
        synchronized (this.f11044p) {
            if (this.f11050v != 5) {
                mo11226v();
                C3266s.m14920a(this.f11047s != null, (Object) "Client is connected but service is null");
                t = this.f11047s;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* renamed from: x */
    public boolean mo11228x() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Set<Scope> mo11229y() {
        return Collections.EMPTY_SET;
    }
}
