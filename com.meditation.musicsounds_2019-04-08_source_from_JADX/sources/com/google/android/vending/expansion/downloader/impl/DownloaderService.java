package com.google.android.vending.expansion.downloader.impl;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.util.Log;
import com.google.android.vending.expansion.downloader.C4827c;
import com.google.android.vending.expansion.downloader.C4831d;
import com.google.android.vending.expansion.downloader.C4833f;
import com.google.android.vending.expansion.downloader.C4834g;
import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import com.google.android.vending.licensing.C4860a;
import com.google.android.vending.licensing.C4861b;
import com.google.android.vending.licensing.C4866e;
import com.google.android.vending.licensing.C4870f;
import java.io.File;

public abstract class DownloaderService extends C4846b implements C4833f {

    /* renamed from: g */
    private static boolean f17411g;

    /* renamed from: a */
    long f17412a;

    /* renamed from: b */
    long f17413b;

    /* renamed from: c */
    int f17414c;

    /* renamed from: d */
    long f17415d;

    /* renamed from: e */
    long f17416e;

    /* renamed from: f */
    float f17417f;

    /* renamed from: h */
    private boolean f17418h;

    /* renamed from: i */
    private boolean f17419i;

    /* renamed from: j */
    private boolean f17420j;

    /* renamed from: k */
    private boolean f17421k;

    /* renamed from: l */
    private boolean f17422l;

    /* renamed from: m */
    private boolean f17423m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f17424n;

    /* renamed from: o */
    private int f17425o;

    /* renamed from: p */
    private int f17426p;

    /* renamed from: q */
    private ConnectivityManager f17427q;

    /* renamed from: r */
    private WifiManager f17428r;

    /* renamed from: s */
    private PackageInfo f17429s;

    /* renamed from: t */
    private BroadcastReceiver f17430t;

    /* renamed from: u */
    private final C4834g f17431u = C4827c.m24137a((C4833f) this);

    /* renamed from: v */
    private final Messenger f17432v = this.f17431u.mo15962a();

    /* renamed from: w */
    private Messenger f17433w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C4850e f17434x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public PendingIntent f17435y;

    /* renamed from: z */
    private PendingIntent f17436z;

    public static class GenerateSaveFileError extends Exception {
        private static final long serialVersionUID = 3465966015408936540L;
        String mMessage;
        int mStatus;

        public GenerateSaveFileError(int i, String str) {
            this.mStatus = i;
            this.mMessage = str;
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.DownloaderService$a */
    private class C4838a extends BroadcastReceiver {

        /* renamed from: a */
        final Service f17437a;

        C4838a(Service service) {
            this.f17437a = service;
        }

        public void onReceive(Context context, Intent intent) {
            DownloaderService.this.mo15986g();
            if (DownloaderService.this.f17424n && !DownloaderService.m24220n()) {
                Log.d("LVLDL", "InnerBroadcastReceiver Called");
                Intent intent2 = new Intent(context, this.f17437a.getClass());
                intent2.putExtra("EPI", DownloaderService.this.f17435y);
                context.startService(intent2);
            }
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.DownloaderService$b */
    private class C4839b implements Runnable {

        /* renamed from: a */
        final Context f17439a;

        C4839b(Context context, PendingIntent pendingIntent) {
            this.f17439a = context;
            DownloaderService.this.f17435y = pendingIntent;
        }

        public void run() {
            DownloaderService.m24215b(true);
            DownloaderService.this.f17434x.mo15959a(2);
            final C4861b bVar = new C4861b(this.f17439a, new C4860a(DownloaderService.this.mo15988i(), this.f17439a.getPackageName(), Secure.getString(this.f17439a.getContentResolver(), "android_id")));
            bVar.mo16053a();
            new C4866e(this.f17439a, bVar, DownloaderService.this.mo15987h()).mo16068a((C4870f) new C4870f() {
                /* renamed from: a */
                public void mo15997a(int i) {
                    int i2;
                    try {
                        int b = bVar.mo16057b();
                        C4852f a = C4852f.m24274a(C4839b.this.f17439a);
                        if (b != 0) {
                            i2 = 0;
                            for (int i3 = 0; i3 < b; i3++) {
                                String b2 = bVar.mo16058b(i3);
                                if (b2 != null) {
                                    C4849d dVar = new C4849d(i3, b2, C4839b.this.f17439a.getPackageName());
                                    long c = bVar.mo16060c(i3);
                                    if (DownloaderService.this.mo15983a(a, i3, b2, c)) {
                                        i2 |= -1;
                                        dVar.mo16019a();
                                        dVar.f17458a = bVar.mo16052a(i3);
                                        dVar.f17462e = c;
                                        dVar.f17465h = i2;
                                    } else {
                                        C4849d a2 = a.mo16034a(dVar.f17460c);
                                        if (a2 == null) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("file ");
                                            sb.append(dVar.f17460c);
                                            sb.append(" found. Not downloading.");
                                            Log.d("LVLDL", sb.toString());
                                            dVar.f17465h = 200;
                                            dVar.f17462e = c;
                                            dVar.f17463f = c;
                                            dVar.f17458a = bVar.mo16052a(i3);
                                        } else if (a2.f17465h != 200) {
                                            a2.f17458a = bVar.mo16052a(i3);
                                            a.mo16043c(a2);
                                            i2 |= -1;
                                        }
                                    }
                                    a.mo16043c(dVar);
                                }
                            }
                        } else {
                            i2 = 0;
                        }
                        a.mo16036a(C4839b.this.f17439a.getPackageManager().getPackageInfo(C4839b.this.f17439a.getPackageName(), 0).versionCode, i2);
                        switch (DownloaderService.m24204a(C4839b.this.f17439a, DownloaderService.this.f17435y, DownloaderService.this.getClass())) {
                            case 0:
                                DownloaderService.this.f17434x.mo15959a(5);
                                break;
                            case 1:
                                Log.e("LVLDL", "In LVL checking loop!");
                                DownloaderService.this.f17434x.mo15959a(15);
                                throw new RuntimeException("Error with LVL checking and database integrity");
                        }
                        DownloaderService.m24215b(false);
                    } catch (NameNotFoundException e) {
                        e.printStackTrace();
                        throw new RuntimeException("Error with getting information from package name");
                    } catch (Throwable th) {
                        DownloaderService.m24215b(false);
                        throw th;
                    }
                }

                /* renamed from: b */
                public void mo15998b(int i) {
                    if (i == 291) {
                        DownloaderService.this.f17434x.mo15959a(16);
                    } else if (i == 561) {
                        try {
                            DownloaderService.this.f17434x.mo15959a(15);
                        } catch (Throwable th) {
                            DownloaderService.m24215b(false);
                            throw th;
                        }
                    }
                    DownloaderService.m24215b(false);
                }

                /* renamed from: c */
                public void mo15999c(int i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("applicationError: ");
                    sb.append(i);
                    Log.w("DownloaderService", sb.toString());
                    try {
                        DownloaderService.this.f17434x.mo15959a(16);
                    } finally {
                        DownloaderService.m24215b(false);
                    }
                }
            });
        }
    }

    public DownloaderService() {
        super("LVLDownloadService");
    }

    /* renamed from: a */
    public static int m24204a(Context context, PendingIntent pendingIntent, Class<?> cls) {
        return m24205a(context, pendingIntent, context.getPackageName(), cls.getName());
    }

    /* renamed from: a */
    public static int m24205a(Context context, PendingIntent pendingIntent, String str, String str2) {
        int i = 0;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        C4852f a = C4852f.m24274a(context);
        int a2 = m24212a(a, packageInfo);
        int i2 = 2;
        if (a.f17492g == 0) {
            C4849d[] a3 = a.mo16039a();
            if (a3 != null) {
                int length = a3.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C4849d dVar = a3[i];
                    if (!C4831d.m24157a(context, dVar.f17460c, dVar.f17462e, true)) {
                        a.mo16042c(-1);
                        break;
                    }
                    i++;
                }
            }
            i2 = a2;
        }
        switch (i2) {
            case 1:
            case 2:
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.putExtra("EPI", pendingIntent);
                context.startService(intent);
                break;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m24206a(Context context, Intent intent, Class<?> cls) {
        return m24204a(context, (PendingIntent) intent.getParcelableExtra("EPI"), cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r2.f17422l = true;
        r2.f17423m = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2.f17420j = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2.f17422l = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r2.f17423m = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24209a(int r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            r1 = 0
            switch(r3) {
                case 0: goto L_0x0014;
                case 1: goto L_0x000d;
                case 6: goto L_0x0006;
                case 7: goto L_0x000d;
                case 9: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x001d
        L_0x0006:
            r2.f17420j = r0
        L_0x0008:
            r2.f17422l = r0
            r2.f17423m = r0
            goto L_0x001d
        L_0x000d:
            r2.f17420j = r1
        L_0x000f:
            r2.f17422l = r1
        L_0x0011:
            r2.f17423m = r1
            goto L_0x001d
        L_0x0014:
            r2.f17420j = r0
            switch(r4) {
                case 1: goto L_0x000f;
                case 2: goto L_0x000f;
                case 3: goto L_0x001a;
                case 4: goto L_0x000f;
                case 5: goto L_0x001a;
                case 6: goto L_0x001a;
                case 7: goto L_0x000f;
                case 8: goto L_0x001a;
                case 9: goto L_0x001a;
                case 10: goto L_0x001a;
                case 11: goto L_0x000f;
                case 12: goto L_0x0019;
                case 13: goto L_0x0008;
                case 14: goto L_0x0008;
                case 15: goto L_0x0008;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000d
        L_0x001a:
            r2.f17422l = r0
            goto L_0x0011
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.DownloaderService.m24209a(int, int):void");
    }

    /* renamed from: a */
    private void m24210a(NetworkInfo networkInfo) {
        boolean z = this.f17418h;
        boolean z2 = this.f17419i;
        boolean z3 = this.f17420j;
        boolean z4 = this.f17421k;
        boolean z5 = this.f17422l;
        boolean z6 = false;
        if (networkInfo != null) {
            this.f17421k = networkInfo.isRoaming();
            this.f17419i = networkInfo.isFailover();
            this.f17418h = networkInfo.isConnected();
            m24209a(networkInfo.getType(), networkInfo.getSubtype());
        } else {
            this.f17421k = false;
            this.f17419i = false;
            this.f17418h = false;
            m24209a(-1, -1);
        }
        if (!(!this.f17424n && z == this.f17418h && z2 == this.f17419i && z3 == this.f17420j && z4 == this.f17421k && z5 == this.f17422l)) {
            z6 = true;
        }
        this.f17424n = z6;
    }

    /* renamed from: a */
    private static boolean m24212a(C4852f fVar, PackageInfo packageInfo) {
        return fVar.f17491f != packageInfo.versionCode;
    }

    /* renamed from: b */
    private void m24214b(long j) {
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (alarmManager == null) {
            Log.e("LVLDL", "couldn't get alarm manager");
            return;
        }
        String j2 = mo15989j();
        Intent intent = new Intent("android.intent.action.DOWNLOAD_WAKEUP");
        intent.putExtra("EPI", this.f17435y);
        intent.setClassName(getPackageName(), j2);
        this.f17436z = PendingIntent.getBroadcast(this, 0, intent, 1073741824);
        alarmManager.set(0, System.currentTimeMillis() + j, this.f17436z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static synchronized void m24215b(boolean z) {
        synchronized (DownloaderService.class) {
            f17411g = z;
        }
    }

    /* renamed from: b */
    public static boolean m24216b(int i) {
        return i >= 400 && i < 600;
    }

    /* renamed from: c */
    public static boolean m24217c(int i) {
        return (i >= 200 && i < 300) || (i >= 400 && i < 600);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static synchronized boolean m24220n() {
        boolean z;
        synchronized (DownloaderService.class) {
            z = f17411g;
        }
        return z;
    }

    /* renamed from: o */
    private void m24221o() {
        if (this.f17436z != null) {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            if (alarmManager == null) {
                Log.e("LVLDL", "couldn't get alarm manager");
            } else {
                alarmManager.cancel(this.f17436z);
                this.f17436z = null;
            }
        }
    }

    /* renamed from: a */
    public int mo15977a(C4852f fVar) {
        if (!this.f17418h) {
            return 2;
        }
        if (!this.f17420j) {
            return 1;
        }
        int i = fVar.f17493h;
        if (this.f17421k) {
            return 5;
        }
        return (i & 1) != 0 ? 1 : 6;
    }

    /* renamed from: a */
    public String mo15978a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4831d.m24154a((Context) this));
        sb.append(File.separator);
        sb.append(str);
        sb.append(".tmp");
        return sb.toString();
    }

    /* renamed from: a */
    public String mo15979a(String str, long j) {
        String a = mo15978a(str);
        File file = new File(a);
        if (!C4831d.m24156a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("External media not mounted: ");
            sb.append(a);
            Log.d("LVLDL", sb.toString());
            throw new GenerateSaveFileError(499, "external media is not yet mounted");
        } else if (file.exists()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("File already exists: ");
            sb2.append(a);
            Log.d("LVLDL", sb2.toString());
            throw new GenerateSaveFileError(488, "requested destination file already exists");
        } else if (C4831d.m24150a(C4831d.m24151a(a)) >= j) {
            return a;
        } else {
            throw new GenerateSaveFileError(498, "insufficient space on external storage");
        }
    }

    /* renamed from: a */
    public void mo15968a() {
        this.f17425o = 1;
        this.f17426p = 490;
    }

    /* renamed from: a */
    public void mo15969a(int i) {
        C4852f.m24274a((Context) this).mo16041b(i);
    }

    /* renamed from: a */
    public void mo15980a(long j) {
        long j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (0 != this.f17416e) {
            float f = ((float) (j - this.f17415d)) / ((float) (uptimeMillis - this.f17416e));
            if (0.0f != this.f17417f) {
                f = (f * 0.005f) + (this.f17417f * 0.995f);
            }
            this.f17417f = f;
            j2 = (long) (((float) (this.f17413b - j)) / this.f17417f);
        } else {
            j2 = -1;
        }
        long j3 = j2;
        this.f17416e = uptimeMillis;
        this.f17415d = j;
        C4850e eVar = this.f17434x;
        DownloadProgressInfo downloadProgressInfo = new DownloadProgressInfo(this.f17413b, j, j3, this.f17417f);
        eVar.mo15961a(downloadProgressInfo);
    }

    /* renamed from: a */
    public void mo15981a(Context context) {
        Context applicationContext = context.getApplicationContext();
        new Handler(applicationContext.getMainLooper()).post(new C4839b(applicationContext, this.f17435y));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15982a(Intent intent) {
        int i;
        boolean z = true;
        m24215b(true);
        try {
            C4852f a = C4852f.m24274a((Context) this);
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("EPI");
            if (pendingIntent != null) {
                this.f17434x.mo16021a(pendingIntent);
                this.f17435y = pendingIntent;
            } else if (this.f17435y != null) {
                this.f17434x.mo16021a(this.f17435y);
            } else {
                Log.e("LVLDL", "Downloader started in bad state without notification intent.");
                m24215b(false);
                return;
            }
            if (m24212a(a, this.f17429s)) {
                mo15981a((Context) this);
                return;
            }
            C4849d[] a2 = a.mo16039a();
            long j = 0;
            this.f17412a = 0;
            this.f17413b = 0;
            this.f17414c = a2.length;
            for (C4849d dVar : a2) {
                if (dVar.f17465h == 200 && !C4831d.m24157a(this, dVar.f17460c, dVar.f17462e, true)) {
                    dVar.f17465h = 0;
                    dVar.f17463f = 0;
                }
                this.f17413b += dVar.f17462e;
                this.f17412a += dVar.f17463f;
            }
            mo15986g();
            if (this.f17430t == null) {
                this.f17430t = new C4838a(this);
                IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                registerReceiver(this.f17430t, intentFilter);
            }
            int length = a2.length;
            int i2 = 0;
            while (i2 < length) {
                C4849d dVar2 = a2[i2];
                long j2 = dVar2.f17463f;
                if (dVar2.f17465h != 200) {
                    DownloadThread downloadThread = new DownloadThread(dVar2, this, this.f17434x);
                    m24221o();
                    m24214b(5000);
                    downloadThread.mo15976a();
                    m24221o();
                }
                a.mo16044d(dVar2);
                int i3 = dVar2.f17465h;
                if (i3 == 200) {
                    this.f17412a += dVar2.f17463f - j2;
                    a.mo16036a(this.f17429s.versionCode, 0);
                    i2++;
                    j = 0;
                } else if (i3 != 403) {
                    if (i3 == 487) {
                        dVar2.f17463f = j;
                        a.mo16043c(dVar2);
                        i = 13;
                    } else if (i3 != 490) {
                        switch (i3) {
                            case 193:
                                z = false;
                                i = 7;
                                break;
                            case 194:
                            case 195:
                                i = 6;
                                break;
                            case 196:
                            case 197:
                                if (this.f17428r != null && !this.f17428r.isWifiEnabled()) {
                                    i = 8;
                                    break;
                                } else {
                                    i = 9;
                                    break;
                                }
                            default:
                                switch (i3) {
                                    case 498:
                                        i = 17;
                                        break;
                                    case 499:
                                        i = 14;
                                        break;
                                    default:
                                        z = false;
                                        i = 19;
                                        break;
                                }
                        }
                    } else {
                        z = false;
                        i = 18;
                    }
                    if (z) {
                        m24214b(60000);
                    } else {
                        m24221o();
                    }
                    this.f17434x.mo15959a(i);
                    m24215b(false);
                    return;
                } else {
                    mo15981a((Context) this);
                    m24215b(false);
                    return;
                }
            }
            this.f17434x.mo15959a(5);
            m24215b(false);
        } finally {
            m24215b(false);
        }
    }

    /* renamed from: a */
    public void mo15970a(Messenger messenger) {
        this.f17433w = messenger;
        this.f17434x.mo16022b(this.f17433w);
    }

    /* renamed from: a */
    public boolean mo15983a(C4852f fVar, int i, String str, long j) {
        C4849d a = fVar.mo16034a(str);
        if (a != null) {
            String str2 = a.f17460c;
            if (str2 != null) {
                if (str.equals(str2)) {
                    return false;
                }
                File file = new File(C4831d.m24155a((Context) this, str2));
                if (file.exists()) {
                    file.delete();
                }
            }
        }
        return true ^ C4831d.m24157a(this, str, j, true);
    }

    /* renamed from: b */
    public void mo15971b() {
        this.f17425o = 1;
        this.f17426p = 193;
    }

    /* renamed from: c */
    public void mo15972c() {
        if (this.f17425o == 1) {
            this.f17425o = 0;
        }
        Intent intent = new Intent(this, getClass());
        intent.putExtra("EPI", this.f17435y);
        startService(intent);
    }

    /* renamed from: d */
    public void mo15973d() {
        this.f17434x.mo16020a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo15984e() {
        return C4852f.m24274a((Context) this).f17492g == 0;
    }

    /* renamed from: f */
    public boolean mo15985f() {
        return this.f17418h && !this.f17420j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo15986g() {
        if (this.f17427q == null) {
            this.f17427q = (ConnectivityManager) getSystemService("connectivity");
        }
        if (this.f17428r == null) {
            this.f17428r = (WifiManager) getApplicationContext().getSystemService("wifi");
        }
        if (this.f17427q == null) {
            Log.w("LVLDL", "couldn't get connectivity manager to poll network state");
        } else {
            m24210a(this.f17427q.getActiveNetworkInfo());
        }
    }

    /* renamed from: h */
    public abstract String mo15987h();

    /* renamed from: i */
    public abstract byte[] mo15988i();

    /* renamed from: j */
    public abstract String mo15989j();

    /* renamed from: k */
    public int mo15990k() {
        return this.f17425o;
    }

    /* renamed from: l */
    public int mo15991l() {
        return this.f17426p;
    }

    public IBinder onBind(Intent intent) {
        Log.d("LVLDL", "Service Bound");
        return this.f17432v.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        try {
            this.f17429s = getPackageManager().getPackageInfo(getPackageName(), 0);
            this.f17434x = new C4850e(this, getPackageManager().getApplicationLabel(getApplicationInfo()));
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onDestroy() {
        if (this.f17430t != null) {
            unregisterReceiver(this.f17430t);
            this.f17430t = null;
        }
        this.f17431u.mo15964b(this);
        super.onDestroy();
    }
}
