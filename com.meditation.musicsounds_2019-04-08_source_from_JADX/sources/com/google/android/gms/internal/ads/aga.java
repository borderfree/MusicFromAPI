package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class aga {

    /* renamed from: b */
    private static final String f11933b = "aga";

    /* renamed from: a */
    protected Context f11934a;

    /* renamed from: c */
    private ExecutorService f11935c;

    /* renamed from: d */
    private DexClassLoader f11936d;

    /* renamed from: e */
    private afn f11937e;

    /* renamed from: f */
    private byte[] f11938f;

    /* renamed from: g */
    private volatile AdvertisingIdClient f11939g = null;

    /* renamed from: h */
    private volatile boolean f11940h = false;

    /* renamed from: i */
    private Future f11941i = null;

    /* renamed from: j */
    private boolean f11942j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile C4110yz f11943k = null;

    /* renamed from: l */
    private Future f11944l = null;

    /* renamed from: m */
    private afg f11945m;

    /* renamed from: n */
    private boolean f11946n = false;

    /* renamed from: o */
    private boolean f11947o = false;

    /* renamed from: p */
    private Map<Pair<String, String>, ahj> f11948p;

    /* renamed from: q */
    private boolean f11949q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f11950r;

    /* renamed from: s */
    private boolean f11951s;

    /* renamed from: com.google.android.gms.internal.ads.aga$a */
    final class C3405a extends BroadcastReceiver {
        private C3405a() {
        }

        /* synthetic */ C3405a(aga aga, agc agc) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                aga.this.f11950r = true;
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                aga.this.f11950r = false;
            }
        }
    }

    private aga(Context context) {
        boolean z = true;
        this.f11950r = true;
        this.f11951s = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            z = false;
        }
        this.f11942j = z;
        if (this.f11942j) {
            context = applicationContext;
        }
        this.f11934a = context;
        this.f11948p = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|(14:28|29|(2:31|(1:33)(2:34|35))|36|(1:38)|39|40|41|42|43|44|45|(1:47)|48)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ zzcl -> 0x0152, zzcw -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ all -> 0x011f, FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fa A[Catch:{ zzcl -> 0x0152, zzcw -> 0x0159 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.aga m16145a(android.content.Context r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            com.google.android.gms.internal.ads.aga r0 = new com.google.android.gms.internal.ads.aga
            r0.<init>(r8)
            com.google.android.gms.internal.ads.agc r8 = new com.google.android.gms.internal.ads.agc     // Catch:{ zzcw -> 0x0159 }
            r8.<init>()     // Catch:{ zzcw -> 0x0159 }
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newCachedThreadPool(r8)     // Catch:{ zzcw -> 0x0159 }
            r0.f11935c = r8     // Catch:{ zzcw -> 0x0159 }
            r0.f11940h = r11     // Catch:{ zzcw -> 0x0159 }
            if (r11 == 0) goto L_0x0021
            java.util.concurrent.ExecutorService r8 = r0.f11935c     // Catch:{ zzcw -> 0x0159 }
            com.google.android.gms.internal.ads.agd r11 = new com.google.android.gms.internal.ads.agd     // Catch:{ zzcw -> 0x0159 }
            r11.<init>(r0)     // Catch:{ zzcw -> 0x0159 }
            java.util.concurrent.Future r8 = r8.submit(r11)     // Catch:{ zzcw -> 0x0159 }
            r0.f11941i = r8     // Catch:{ zzcw -> 0x0159 }
        L_0x0021:
            java.util.concurrent.ExecutorService r8 = r0.f11935c     // Catch:{ zzcw -> 0x0159 }
            com.google.android.gms.internal.ads.agf r11 = new com.google.android.gms.internal.ads.agf     // Catch:{ zzcw -> 0x0159 }
            r11.<init>(r0)     // Catch:{ zzcw -> 0x0159 }
            r8.execute(r11)     // Catch:{ zzcw -> 0x0159 }
            r8 = 1
            r11 = 0
            com.google.android.gms.common.e r1 = com.google.android.gms.common.C3182e.m14660b()     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f11934a     // Catch:{ Throwable -> 0x004b }
            int r2 = r1.mo11136d(r2)     // Catch:{ Throwable -> 0x004b }
            if (r2 <= 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            r0.f11946n = r2     // Catch:{ Throwable -> 0x004b }
            android.content.Context r2 = r0.f11934a     // Catch:{ Throwable -> 0x004b }
            int r1 = r1.mo11106a(r2)     // Catch:{ Throwable -> 0x004b }
            if (r1 != 0) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = 0
        L_0x0049:
            r0.f11947o = r1     // Catch:{ Throwable -> 0x004b }
        L_0x004b:
            r0.mo11868a(r11, r8)     // Catch:{ zzcw -> 0x0159 }
            boolean r1 = com.google.android.gms.internal.ads.agi.m16186a()     // Catch:{ zzcw -> 0x0159 }
            if (r1 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12700bM     // Catch:{ zzcw -> 0x0159 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ zzcw -> 0x0159 }
            java.lang.Object r1 = r2.mo12297a(r1)     // Catch:{ zzcw -> 0x0159 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ zzcw -> 0x0159 }
            boolean r1 = r1.booleanValue()     // Catch:{ zzcw -> 0x0159 }
            if (r1 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ zzcw -> 0x0159 }
            java.lang.String r9 = "Task Context initialization must not be called from the UI thread."
            r8.<init>(r9)     // Catch:{ zzcw -> 0x0159 }
            throw r8     // Catch:{ zzcw -> 0x0159 }
        L_0x006f:
            com.google.android.gms.internal.ads.afn r1 = new com.google.android.gms.internal.ads.afn     // Catch:{ zzcw -> 0x0159 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ zzcw -> 0x0159 }
            r0.f11937e = r1     // Catch:{ zzcw -> 0x0159 }
            com.google.android.gms.internal.ads.afn r1 = r0.f11937e     // Catch:{ zzcl -> 0x0152 }
            byte[] r9 = r1.mo11856a(r9)     // Catch:{ zzcl -> 0x0152 }
            r0.f11938f = r9     // Catch:{ zzcl -> 0x0152 }
            android.content.Context r9 = r0.f11934a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.io.File r9 = r9.getCacheDir()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 != 0) goto L_0x0098
            android.content.Context r9 = r0.f11934a     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r1 = "dex"
            java.io.File r9 = r9.getDir(r1, r11)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            if (r9 == 0) goto L_0x0092
            goto L_0x0098
        L_0x0092:
            com.google.android.gms.internal.ads.zzcw r8 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            throw r8     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0098:
            java.lang.String r1 = "1521499837408"
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = "%s/%s.jar"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r6[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r6[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            boolean r4 = r3.exists()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            if (r4 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.afn r4 = r0.f11937e     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r6 = r0.f11938f     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            byte[] r10 = r4.mo11857a(r6, r10)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3.createNewFile()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            int r6 = r10.length     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r4.write(r10, r11, r6)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
        L_0x00c9:
            r0.m16154b(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            dalvik.system.DexClassLoader r10 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011f }
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ all -> 0x011f }
            java.lang.String r6 = r9.getAbsolutePath()     // Catch:{ all -> 0x011f }
            android.content.Context r7 = r0.f11934a     // Catch:{ all -> 0x011f }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ all -> 0x011f }
            r10.<init>(r4, r6, r2, r7)     // Catch:{ all -> 0x011f }
            r0.f11936d = r10     // Catch:{ all -> 0x011f }
            m16148a(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r0.m16149a(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r10 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r9 = java.lang.String.format(r10, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            m16150a(r9)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            boolean r9 = r0.f11951s     // Catch:{ zzcw -> 0x0159 }
            if (r9 != 0) goto L_0x0115
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch:{ zzcw -> 0x0159 }
            r9.<init>()     // Catch:{ zzcw -> 0x0159 }
            java.lang.String r10 = "android.intent.action.USER_PRESENT"
            r9.addAction(r10)     // Catch:{ zzcw -> 0x0159 }
            java.lang.String r10 = "android.intent.action.SCREEN_OFF"
            r9.addAction(r10)     // Catch:{ zzcw -> 0x0159 }
            android.content.Context r10 = r0.f11934a     // Catch:{ zzcw -> 0x0159 }
            com.google.android.gms.internal.ads.aga$a r11 = new com.google.android.gms.internal.ads.aga$a     // Catch:{ zzcw -> 0x0159 }
            r11.<init>(r0, r2)     // Catch:{ zzcw -> 0x0159 }
            r10.registerReceiver(r11, r9)     // Catch:{ zzcw -> 0x0159 }
            r0.f11951s = r8     // Catch:{ zzcw -> 0x0159 }
        L_0x0115:
            com.google.android.gms.internal.ads.afg r9 = new com.google.android.gms.internal.ads.afg     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r0)     // Catch:{ zzcw -> 0x0159 }
            r0.f11945m = r9     // Catch:{ zzcw -> 0x0159 }
            r0.f11949q = r8     // Catch:{ zzcw -> 0x0159 }
            goto L_0x0159
        L_0x011f:
            r10 = move-exception
            m16148a(r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r0.m16149a(r9, r1)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r2 = "%s/%s.dex"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3[r11] = r9     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            r3[r8] = r1     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            java.lang.String r8 = java.lang.String.format(r2, r3)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            m16150a(r8)     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
            throw r10     // Catch:{ FileNotFoundException -> 0x014b, IOException -> 0x0144, zzcl -> 0x013d, NullPointerException -> 0x0136 }
        L_0x0136:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzcw -> 0x0159 }
            throw r9     // Catch:{ zzcw -> 0x0159 }
        L_0x013d:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzcw -> 0x0159 }
            throw r9     // Catch:{ zzcw -> 0x0159 }
        L_0x0144:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzcw -> 0x0159 }
            throw r9     // Catch:{ zzcw -> 0x0159 }
        L_0x014b:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzcw -> 0x0159 }
            throw r9     // Catch:{ zzcw -> 0x0159 }
        L_0x0152:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzcw r9 = new com.google.android.gms.internal.ads.zzcw     // Catch:{ zzcw -> 0x0159 }
            r9.<init>(r8)     // Catch:{ zzcw -> 0x0159 }
            throw r9     // Catch:{ zzcw -> 0x0159 }
        L_0x0159:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aga.m16145a(android.content.Context, java.lang.String, java.lang.String, boolean):com.google.android.gms.internal.ads.aga");
    }

    /* renamed from: a */
    private static void m16148a(File file) {
        if (!file.exists()) {
            Log.d(f11933b, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:20|21|22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0091 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[SYNTHETIC, Splitter:B:39:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a8 A[SYNTHETIC, Splitter:B:43:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2 A[SYNTHETIC, Splitter:B:52:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[SYNTHETIC, Splitter:B:56:0x00b7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16149a(java.io.File r8, java.lang.String r9) {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r8
            r5 = 1
            r3[r5] = r9
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x001b
            return
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r8
            r2[r5] = r9
            java.lang.String r8 = java.lang.String.format(r3, r2)
            r1.<init>(r8)
            boolean r8 = r1.exists()
            if (r8 != 0) goto L_0x0033
            return
        L_0x0033:
            long r2 = r1.length()
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x003e
            return
        L_0x003e:
            int r8 = (int) r2
            byte[] r8 = new byte[r8]
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            r3.<init>(r1)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00af, all -> 0x009f }
            int r5 = r3.read(r8)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            if (r5 > 0) goto L_0x0054
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            m16148a(r1)
            return
        L_0x0054:
            com.google.android.gms.internal.ads.acs r5 = new com.google.android.gms.internal.ads.acs     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.<init>()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r6.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f11497d = r6     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = r9.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f11496c = r9     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            com.google.android.gms.internal.ads.afn r9 = r7.f11937e     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r6 = r7.f11938f     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.lang.String r8 = r9.mo11855a(r6, r8)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = r8.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f11494a = r8     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r8 = com.google.android.gms.internal.ads.aen.m16079a(r8)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r5.f11495b = r8     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r0.createNewFile()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            r8.<init>(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b0, all -> 0x009d }
            byte[] r9 = com.google.android.gms.internal.ads.C3401ads.m16013a(r5)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            int r0 = r9.length     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.write(r9, r4, r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r8.close()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x009b, all -> 0x0098 }
            r3.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            r8.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            m16148a(r1)
            return
        L_0x0098:
            r9 = move-exception
            r2 = r8
            goto L_0x00a1
        L_0x009b:
            r2 = r8
            goto L_0x00b0
        L_0x009d:
            r9 = move-exception
            goto L_0x00a1
        L_0x009f:
            r9 = move-exception
            r3 = r2
        L_0x00a1:
            if (r3 == 0) goto L_0x00a6
            r3.close()     // Catch:{ IOException -> 0x00a6 }
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            r2.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            m16148a(r1)
            throw r9
        L_0x00af:
            r3 = r2
        L_0x00b0:
            if (r3 == 0) goto L_0x00b5
            r3.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            m16148a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aga.m16149a(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static void m16150a(String str) {
        m16148a(new File(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m16153b(int i, C4110yz yzVar) {
        if (i < 4) {
            if (yzVar == null) {
                return true;
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12703bP)).booleanValue() && (yzVar.f15148n == null || yzVar.f15148n.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12704bQ)).booleanValue() && (yzVar.f15115X == null || yzVar.f15115X.f11549a == null || yzVar.f15115X.f11549a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:29|30|31|32|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7 A[SYNTHETIC, Splitter:B:52:0x00c7] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cc A[SYNTHETIC, Splitter:B:56:0x00cc] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d3 A[SYNTHETIC, Splitter:B:64:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A[SYNTHETIC, Splitter:B:68:0x00d8] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m16154b(java.io.File r10, java.lang.String r11) {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "%s/%s.tmp"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r10
            r5 = 1
            r3[r5] = r11
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001b
            return r4
        L_0x001b:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "%s/%s.dex"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r10
            r2[r5] = r11
            java.lang.String r10 = java.lang.String.format(r3, r2)
            r1.<init>(r10)
            boolean r10 = r1.exists()
            if (r10 == 0) goto L_0x0033
            return r4
        L_0x0033:
            r10 = 0
            long r2 = r0.length()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0042
            m16148a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            return r4
        L_0x0042:
            int r2 = (int) r2     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            byte[] r2 = new byte[r2]     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            r3.<init>(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d0, all -> 0x00c3 }
            int r6 = r3.read(r2)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r6 > 0) goto L_0x005e
            java.lang.String r11 = f11933b     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r1 = "Cannot read the cache data."
            android.util.Log.d(r11, r1)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            m16148a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r4
        L_0x005e:
            com.google.android.gms.internal.ads.acs r6 = new com.google.android.gms.internal.ads.acs     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.ads r2 = com.google.android.gms.internal.ads.C3401ads.m16011a(r6, r2)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            com.google.android.gms.internal.ads.acs r2 = (com.google.android.gms.internal.ads.acs) r2     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r7 = r2.f11496c     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r7)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = r11.equals(r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f11495b     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r2.f11494a     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = com.google.android.gms.internal.ads.aen.m16079a(r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 == 0) goto L_0x00ba
            byte[] r11 = r2.f11497d     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r6 = r6.getBytes()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            boolean r11 = java.util.Arrays.equals(r11, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            if (r11 != 0) goto L_0x0093
            goto L_0x00ba
        L_0x0093:
            com.google.android.gms.internal.ads.afn r11 = r9.f11937e     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r0 = r9.f11938f     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.lang.String r6 = new java.lang.String     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r2 = r2.f11494a     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r6.<init>(r2)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            byte[] r11 = r11.mo11857a(r0, r6)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r1.createNewFile()     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r0.<init>(r1)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            int r10 = r11.length     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r0.write(r11, r4, r10)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00b8, all -> 0x00b5 }
            r3.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r0.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            return r5
        L_0x00b5:
            r11 = move-exception
            r10 = r0
            goto L_0x00c5
        L_0x00b8:
            r10 = r0
            goto L_0x00d1
        L_0x00ba:
            m16148a(r0)     // Catch:{ zzcl | IOException | NoSuchAlgorithmException -> 0x00d1, all -> 0x00c1 }
            r3.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            return r4
        L_0x00c1:
            r11 = move-exception
            goto L_0x00c5
        L_0x00c3:
            r11 = move-exception
            r3 = r10
        L_0x00c5:
            if (r3 == 0) goto L_0x00ca
            r3.close()     // Catch:{ IOException -> 0x00ca }
        L_0x00ca:
            if (r10 == 0) goto L_0x00cf
            r10.close()     // Catch:{ IOException -> 0x00cf }
        L_0x00cf:
            throw r11
        L_0x00d0:
            r3 = r10
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            r3.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            if (r10 == 0) goto L_0x00db
            r10.close()     // Catch:{ IOException -> 0x00db }
        L_0x00db:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aga.m16154b(java.io.File, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m16155o() {
        try {
            if (this.f11939g == null && this.f11942j) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f11934a);
                advertisingIdClient.start();
                this.f11939g = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.f11939g = null;
        }
    }

    /* renamed from: p */
    private final C4110yz m16156p() {
        try {
            return C3907ss.m19856a(this.f11934a, this.f11934a.getPackageName(), Integer.toString(this.f11934a.getPackageManager().getPackageInfo(this.f11934a.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Context mo11866a() {
        return this.f11934a;
    }

    /* renamed from: a */
    public final Method mo11867a(String str, String str2) {
        ahj ahj = (ahj) this.f11948p.get(new Pair(str, str2));
        if (ahj == null) {
            return null;
        }
        return ahj.mo11915a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11868a(int i, boolean z) {
        if (this.f11947o) {
            Future submit = this.f11935c.submit(new age(this, i, z));
            if (i == 0) {
                this.f11944l = submit;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11869a(String str, String str2, Class<?>... clsArr) {
        if (this.f11948p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f11948p.put(new Pair(str, str2), new ahj(this, str, str2, clsArr));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C4110yz mo11870b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException unused) {
            }
        }
        return m16156p();
    }

    /* renamed from: b */
    public final boolean mo11871b() {
        return this.f11949q;
    }

    /* renamed from: c */
    public final ExecutorService mo11872c() {
        return this.f11935c;
    }

    /* renamed from: d */
    public final DexClassLoader mo11873d() {
        return this.f11936d;
    }

    /* renamed from: e */
    public final afn mo11874e() {
        return this.f11937e;
    }

    /* renamed from: f */
    public final byte[] mo11875f() {
        return this.f11938f;
    }

    /* renamed from: g */
    public final boolean mo11876g() {
        return this.f11946n;
    }

    /* renamed from: h */
    public final afg mo11877h() {
        return this.f11945m;
    }

    /* renamed from: i */
    public final boolean mo11878i() {
        return this.f11947o;
    }

    /* renamed from: j */
    public final boolean mo11879j() {
        return this.f11950r;
    }

    /* renamed from: k */
    public final C4110yz mo11880k() {
        return this.f11943k;
    }

    /* renamed from: l */
    public final Future mo11881l() {
        return this.f11944l;
    }

    /* renamed from: m */
    public final AdvertisingIdClient mo11882m() {
        if (!this.f11940h) {
            return null;
        }
        if (this.f11939g != null) {
            return this.f11939g;
        }
        if (this.f11941i != null) {
            try {
                this.f11941i.get(2000, TimeUnit.MILLISECONDS);
                this.f11941i = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f11941i.cancel(true);
            }
        }
        return this.f11939g;
    }

    /* renamed from: n */
    public final int mo11883n() {
        if (this.f11945m != null) {
            return afg.m16097a();
        }
        return Integer.MIN_VALUE;
    }
}
