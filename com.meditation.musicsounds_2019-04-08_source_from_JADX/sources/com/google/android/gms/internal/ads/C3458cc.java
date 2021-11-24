package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.p123d.C3181c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.cc */
public final class C3458cc implements C3462cg {

    /* renamed from: a */
    private static final Object f13676a = new Object();

    /* renamed from: b */
    private static C3462cg f13677b = null;

    /* renamed from: c */
    private static C3462cg f13678c = null;

    /* renamed from: d */
    private final Object f13679d;

    /* renamed from: e */
    private final Context f13680e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f13681f;

    /* renamed from: g */
    private final ExecutorService f13682g;

    /* renamed from: h */
    private final zzang f13683h;

    private C3458cc(Context context) {
        this(context, zzang.m20619a());
    }

    private C3458cc(Context context, zzang zzang) {
        this.f13679d = new Object();
        this.f13681f = new WeakHashMap<>();
        this.f13682g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f13680e = context;
        this.f13683h = zzang;
    }

    /* renamed from: a */
    private final Builder m18246a(String str, String str2, String str3, int i) {
        boolean z;
        try {
            z = C3181c.m14658a(this.f13680e).mo11126a();
        } catch (Throwable th) {
            C3731me.m19173b("Error fetching instant app info", th);
            z = false;
        }
        String str4 = "unknown";
        try {
            str4 = this.f13680e.getPackageName();
        } catch (Throwable unused) {
            C3731me.m19178e("Cannot obtain package name, proceeding.");
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT));
        String str5 = "device";
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (!str7.startsWith(str6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 1 + String.valueOf(str7).length());
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            str7 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter(str5, str7).appendQueryParameter("js", this.f13683h.f15360a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", aqm.m16919a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "193400285").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", ane.m16647c()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(ane.m16650f().mo12297a(aqm.f12829dj)));
    }

    /* renamed from: a */
    public static C3462cg m18247a(Context context) {
        synchronized (f13676a) {
            if (f13677b == null) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12687b)).booleanValue()) {
                    f13677b = new C3458cc(context);
                } else {
                    f13677b = new C3463ch();
                }
            }
        }
        return f13677b;
    }

    /* renamed from: a */
    public static C3462cg m18248a(Context context, zzang zzang) {
        synchronized (f13676a) {
            if (f13678c == null) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12687b)).booleanValue()) {
                    C3458cc ccVar = new C3458cc(context, zzang);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (ccVar.f13679d) {
                            ccVar.f13681f.put(thread, Boolean.valueOf(true));
                        }
                        thread.setUncaughtExceptionHandler(new C3460ce(ccVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C3459cd(ccVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f13678c = ccVar;
                } else {
                    f13678c = new C3463ch();
                }
            }
        }
        return f13678c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12835a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0042
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0036
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C3719lt.m19121b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r6 = 1
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = ""
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo12837a(r11, r10, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3458cc.mo12835a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo12836a(Throwable th, String str) {
        mo12837a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo12837a(Throwable th, String str, float f) {
        if (C3719lt.m19112a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            C4099yp.m20379a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m18246a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.f13682g.submit(new C3461cf(this, new C3732mf(), (String) obj));
                }
            }
        }
    }
}
