package com.google.android.gms.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4286by;
import com.google.android.gms.internal.measurement.C4288c;
import com.google.android.gms.internal.measurement.C4452hw;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.google.android.gms.analytics.p */
public final class C2952p {

    /* renamed from: a */
    private static volatile C2952p f10404a;

    /* renamed from: b */
    private final Context f10405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C2958s> f10406c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final C2946j f10407d = new C2946j();

    /* renamed from: e */
    private final C2953a f10408e = new C2953a();

    /* renamed from: f */
    private volatile C4452hw f10409f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public UncaughtExceptionHandler f10410g;

    /* renamed from: com.google.android.gms.analytics.p$a */
    class C2953a extends ThreadPoolExecutor {
        public C2953a() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C2954b(null));
            allowCoreThreadTimeOut(true);
        }

        /* access modifiers changed from: protected */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new C2957r(this, runnable, t);
        }
    }

    /* renamed from: com.google.android.gms.analytics.p$b */
    static class C2954b implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f10412a = new AtomicInteger();

        private C2954b() {
        }

        /* synthetic */ C2954b(C2956q qVar) {
            this();
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = f10412a.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new C2955c(runnable, sb.toString());
        }
    }

    /* renamed from: com.google.android.gms.analytics.p$c */
    static class C2955c extends Thread {
        C2955c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    private C2952p(Context context) {
        Context applicationContext = context.getApplicationContext();
        C3266s.m14913a(applicationContext);
        this.f10405b = applicationContext;
    }

    /* renamed from: a */
    public static C2952p m13822a(Context context) {
        C3266s.m14913a(context);
        if (f10404a == null) {
            synchronized (C2952p.class) {
                if (f10404a == null) {
                    f10404a = new C2952p(context);
                }
            }
        }
        return f10404a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m13826b(C2948l lVar) {
        C3266s.m14926c("deliver should be called from worker thread");
        C3266s.m14924b(lVar.mo10635f(), "Measurement must be submitted");
        List<C2959t> c = lVar.mo10632c();
        if (!c.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (C2959t tVar : c) {
                Uri a = tVar.mo10622a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    tVar.mo10623a(lVar);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m13827d() {
        if (!(Thread.currentThread() instanceof C2955c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final C4452hw mo10644a() {
        if (this.f10409f == null) {
            synchronized (this) {
                if (this.f10409f == null) {
                    C4452hw hwVar = new C4452hw();
                    PackageManager packageManager = this.f10405b.getPackageManager();
                    String packageName = this.f10405b.getPackageName();
                    hwVar.mo14636c(packageName);
                    hwVar.mo14638d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f10405b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException unused) {
                        String str2 = "GAv4";
                        String str3 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    hwVar.mo14632a(packageName);
                    hwVar.mo14634b(str);
                    this.f10409f = hwVar;
                }
            }
        }
        return this.f10409f;
    }

    /* renamed from: a */
    public final <V> Future<V> mo10645a(Callable<V> callable) {
        C3266s.m14913a(callable);
        if (!(Thread.currentThread() instanceof C2955c)) {
            return this.f10408e.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10646a(C2948l lVar) {
        if (lVar.mo10638i()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!lVar.mo10635f()) {
            C2948l a = lVar.mo10626a();
            a.mo10636g();
            this.f10408e.execute(new C2956q(this, a));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }

    /* renamed from: a */
    public final void mo10647a(Runnable runnable) {
        C3266s.m14913a(runnable);
        this.f10408e.submit(runnable);
    }

    /* renamed from: a */
    public final void mo10648a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f10410g = uncaughtExceptionHandler;
    }

    /* renamed from: b */
    public final C4288c mo10649b() {
        DisplayMetrics displayMetrics = this.f10405b.getResources().getDisplayMetrics();
        C4288c cVar = new C4288c();
        cVar.mo14218a(C4286by.m21130a(Locale.getDefault()));
        cVar.f15852b = displayMetrics.widthPixels;
        cVar.f15853c = displayMetrics.heightPixels;
        return cVar;
    }

    /* renamed from: c */
    public final Context mo10650c() {
        return this.f10405b;
    }
}
