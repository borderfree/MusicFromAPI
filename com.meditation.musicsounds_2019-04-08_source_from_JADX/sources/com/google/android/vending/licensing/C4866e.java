package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.vending.licensing.C4863d.C4864a;
import com.google.android.vending.licensing.ILicensingService.C4858a;
import com.google.android.vending.licensing.util.Base64DecoderException;
import com.google.android.vending.licensing.util.C4878a;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.google.android.vending.licensing.e */
public class C4866e implements ServiceConnection {

    /* renamed from: a */
    private static final SecureRandom f17528a = new SecureRandom();

    /* renamed from: b */
    private ILicensingService f17529b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public PublicKey f17530c;

    /* renamed from: d */
    private final Context f17531d;

    /* renamed from: e */
    private final C4874j f17532e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f17533f;

    /* renamed from: g */
    private final String f17534g;

    /* renamed from: h */
    private final String f17535h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Set<C4871g> f17536i = new HashSet();

    /* renamed from: j */
    private final Queue<C4871g> f17537j = new LinkedList();

    /* renamed from: com.google.android.vending.licensing.e$a */
    private class C4867a extends C4864a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4871g f17539b;

        /* renamed from: c */
        private Runnable f17540c;

        public C4867a(C4871g gVar) {
            this.f17539b = gVar;
            this.f17540c = new Runnable(C4866e.this) {
                public void run() {
                    Log.i("LicenseChecker", "Check timed out.");
                    C4866e.this.m24342b(C4867a.this.f17539b);
                    C4866e.this.m24338a(C4867a.this.f17539b);
                }
            };
            m24349a();
        }

        /* renamed from: a */
        private void m24349a() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            C4866e.this.f17533f.postDelayed(this.f17540c, 10000);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m24350b() {
            Log.i("LicenseChecker", "Clearing timeout.");
            C4866e.this.f17533f.removeCallbacks(this.f17540c);
        }

        /* renamed from: a */
        public void mo16063a(final int i, final String str, final String str2) {
            C4866e.this.f17533f.post(new Runnable() {
                public void run() {
                    Log.i("LicenseChecker", "Received response.");
                    if (C4866e.this.f17536i.contains(C4867a.this.f17539b)) {
                        C4867a.this.m24350b();
                        C4867a.this.f17539b.mo16074a(C4866e.this.f17530c, i, str, str2);
                        C4866e.this.m24338a(C4867a.this.f17539b);
                    }
                }
            });
        }
    }

    public C4866e(Context context, C4874j jVar, String str) {
        this.f17531d = context;
        this.f17532e = jVar;
        this.f17530c = m24335a(str);
        this.f17534g = this.f17531d.getPackageName();
        this.f17535h = m24334a(context, this.f17534g);
        HandlerThread handlerThread = new HandlerThread("background thread");
        handlerThread.start();
        this.f17533f = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    private static String m24334a(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (NameNotFoundException unused) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    /* renamed from: a */
    private static PublicKey m24335a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(C4878a.m24383a(str)));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (Base64DecoderException e2) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(e2);
        } catch (InvalidKeySpecException e3) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m24338a(C4871g gVar) {
        this.f17536i.remove(gVar);
        if (this.f17536i.isEmpty()) {
            m24344c();
        }
    }

    /* renamed from: b */
    private void m24340b() {
        while (true) {
            C4871g gVar = (C4871g) this.f17537j.poll();
            if (gVar != null) {
                String str = "LicenseChecker";
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calling checkLicense on service for ");
                    sb.append(gVar.mo16076c());
                    Log.i(str, sb.toString());
                    this.f17529b.mo16047a((long) gVar.mo16075b(), gVar.mo16076c(), new C4867a(gVar));
                    this.f17536i.add(gVar);
                } catch (RemoteException e) {
                    Log.w("LicenseChecker", "RemoteException in checkLicense call.", e);
                    m24342b(gVar);
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m24342b(C4871g gVar) {
        this.f17532e.mo16055a(291, null);
        if (this.f17532e.mo16061c()) {
            gVar.mo16073a().mo15997a(291);
        } else {
            gVar.mo16073a().mo15998b(291);
        }
    }

    /* renamed from: c */
    private void m24344c() {
        if (this.f17529b != null) {
            try {
                this.f17531d.unbindService(this);
            } catch (IllegalArgumentException unused) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.f17529b = null;
        }
    }

    /* renamed from: d */
    private int m24345d() {
        return f17528a.nextInt();
    }

    /* renamed from: a */
    public synchronized void mo16067a() {
        m24344c();
        this.f17533f.getLooper().quit();
    }

    /* renamed from: a */
    public synchronized void mo16068a(C4870f fVar) {
        if (this.f17532e.mo16061c()) {
            Log.i("LicenseChecker", "Using cached license response");
            fVar.mo15997a(256);
        } else {
            C4871g gVar = new C4871g(this.f17532e, new C4872h(), fVar, m24345d(), this.f17534g, this.f17535h);
            if (this.f17529b == null) {
                Log.i("LicenseChecker", "Binding to licensing service.");
                try {
                    if (this.f17531d.bindService(new Intent(new String(C4878a.m24383a("Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U="))).setPackage(new String(C4878a.m24383a("Y29tLmFuZHJvaWQudmVuZGluZw=="))), this, 1)) {
                        this.f17537j.offer(gVar);
                    } else {
                        Log.e("LicenseChecker", "Could not bind to service.");
                        m24342b(gVar);
                    }
                } catch (SecurityException unused) {
                    fVar.mo15999c(6);
                } catch (Base64DecoderException e) {
                    e.printStackTrace();
                }
            } else {
                this.f17537j.offer(gVar);
                m24340b();
            }
        }
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17529b = C4858a.m24310a(iBinder);
        m24340b();
    }

    public synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.w("LicenseChecker", "Service unexpectedly disconnected.");
        this.f17529b = null;
    }
}
