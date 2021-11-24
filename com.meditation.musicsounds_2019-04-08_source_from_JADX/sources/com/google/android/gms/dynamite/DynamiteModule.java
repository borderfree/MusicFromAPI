package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3302g;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {

    /* renamed from: a */
    public static final C3333a f11241a = new C3339b();

    /* renamed from: b */
    public static final C3333a f11242b = new C3341d();

    /* renamed from: c */
    public static final C3333a f11243c = new C3342e();

    /* renamed from: d */
    public static final C3333a f11244d = new C3343f();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e */
    private static Boolean f11245e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f */
    private static C3346i f11246f = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g */
    private static C3348k f11247g = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: h */
    private static String f11248h = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: i */
    private static int f11249i = -1;

    /* renamed from: j */
    private static final ThreadLocal<C3336b> f11250j = new ThreadLocal<>();

    /* renamed from: k */
    private static final C3334a f11251k = new C3338a();

    /* renamed from: l */
    private static final C3333a f11252l = new C3340c();

    /* renamed from: m */
    private static final C3333a f11253m = new C3344g();

    /* renamed from: n */
    private final Context f11254n;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, C3338a aVar) {
            this(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C3338a aVar) {
            this(str, th);
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public interface C3333a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        public interface C3334a {
            /* renamed from: a */
            int mo11354a(Context context, String str);

            /* renamed from: a */
            int mo11355a(Context context, String str, boolean z);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$b */
        public static class C3335b {

            /* renamed from: a */
            public int f11255a = 0;

            /* renamed from: b */
            public int f11256b = 0;

            /* renamed from: c */
            public int f11257c = 0;
        }

        /* renamed from: a */
        C3335b mo11353a(Context context, String str, C3334a aVar);
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    private static class C3336b {

        /* renamed from: a */
        public Cursor f11258a;

        private C3336b() {
        }

        /* synthetic */ C3336b(C3338a aVar) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$c */
    private static class C3337c implements C3334a {

        /* renamed from: a */
        private final int f11259a;

        /* renamed from: b */
        private final int f11260b = 0;

        public C3337c(int i, int i2) {
            this.f11259a = i;
        }

        /* renamed from: a */
        public final int mo11354a(Context context, String str) {
            return this.f11259a;
        }

        /* renamed from: a */
        public final int mo11355a(Context context, String str, boolean z) {
            return 0;
        }
    }

    private DynamiteModule(Context context) {
        this.f11254n = (Context) C3266s.m14913a(context);
    }

    /* renamed from: a */
    public static int m15144a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load module descriptor class: ";
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:40|41) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.set(null, java.lang.ClassLoader.getSystemClassLoader());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0085, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba A[SYNTHETIC, Splitter:B:57:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1 A[Catch:{ LoadingException -> 0x00bf, Throwable -> 0x00e9 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0050=Splitter:B:23:0x0050, B:18:0x0035=Splitter:B:18:0x0035, B:35:0x0079=Splitter:B:35:0x0079} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15145a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00e9 }
            java.lang.Boolean r1 = f11245e     // Catch:{ all -> 0x00e6 }
            if (r1 != 0) goto L_0x00b3
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x0087 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            if (r4 != r2) goto L_0x0032
        L_0x002f:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0032:
            m15150a(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0087 }
            goto L_0x0084
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x0087 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0087 }
            if (r4 == 0) goto L_0x0050
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0050:
            int r4 = m15155c(r8, r9, r10)     // Catch:{ LoadingException -> 0x007c }
            java.lang.String r5 = f11248h     // Catch:{ LoadingException -> 0x007c }
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = f11248h     // Catch:{ LoadingException -> 0x007c }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x007c }
            if (r5 == 0) goto L_0x0061
            goto L_0x0079
        L_0x0061:
            com.google.android.gms.dynamite.h r5 = new com.google.android.gms.dynamite.h     // Catch:{ LoadingException -> 0x007c }
            java.lang.String r6 = f11248h     // Catch:{ LoadingException -> 0x007c }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x007c }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x007c }
            m15150a(r5)     // Catch:{ LoadingException -> 0x007c }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x007c }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x007c }
            f11245e = r5     // Catch:{ LoadingException -> 0x007c }
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return r4
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            return r4
        L_0x007c:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x0087 }
            r2.set(r3, r4)     // Catch:{ all -> 0x0087 }
            goto L_0x002f
        L_0x0084:
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            r1 = r2
            goto L_0x00b1
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0087 }
            throw r2     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x008a }
        L_0x008a:
            r1 = move-exception
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00e6 }
            int r3 = r3.length()     // Catch:{ all -> 0x00e6 }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e6 }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00e6 }
            r4.append(r1)     // Catch:{ all -> 0x00e6 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00e6 }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00e6 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00e6 }
        L_0x00b1:
            f11245e = r1     // Catch:{ all -> 0x00e6 }
        L_0x00b3:
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            boolean r0 = r1.booleanValue()     // Catch:{ Throwable -> 0x00e9 }
            if (r0 == 0) goto L_0x00e1
            int r9 = m15155c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00bf }
            return r9
        L_0x00bf:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ Throwable -> 0x00e9 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x00e9 }
            int r1 = r9.length()     // Catch:{ Throwable -> 0x00e9 }
            if (r1 == 0) goto L_0x00d7
            java.lang.String r9 = r0.concat(r9)     // Catch:{ Throwable -> 0x00e9 }
            goto L_0x00dc
        L_0x00d7:
            java.lang.String r9 = new java.lang.String     // Catch:{ Throwable -> 0x00e9 }
            r9.<init>(r0)     // Catch:{ Throwable -> 0x00e9 }
        L_0x00dc:
            android.util.Log.w(r10, r9)     // Catch:{ Throwable -> 0x00e9 }
            r8 = 0
            return r8
        L_0x00e1:
            int r9 = m15152b(r8, r9, r10)     // Catch:{ Throwable -> 0x00e9 }
            return r9
        L_0x00e6:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
            throw r9     // Catch:{ Throwable -> 0x00e9 }
        L_0x00e9:
            r9 = move-exception
            com.google.android.gms.common.util.C3302g.m15050a(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15145a(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: a */
    private static Context m15146a(Context context, String str, int i, Cursor cursor, C3348k kVar) {
        C3323b bVar;
        try {
            C3327d.m15136a(null);
            if (m15154b().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                bVar = kVar.mo11363b(C3327d.m15136a(context), str, i, C3327d.m15136a(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                bVar = kVar.mo11362a(C3327d.m15136a(context), str, i, C3327d.m15136a(cursor));
            }
            return (Context) C3327d.m15137a(bVar);
        } catch (Exception e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r1.f11258a != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00df, code lost:
        if (r1.f11258a != null) goto L_0x0080;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule m15147a(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.C3333a r11, java.lang.String r12) {
        /*
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r0 = f11250j
            java.lang.Object r0 = r0.get()
            com.google.android.gms.dynamite.DynamiteModule$b r0 = (com.google.android.gms.dynamite.DynamiteModule.C3336b) r0
            com.google.android.gms.dynamite.DynamiteModule$b r1 = new com.google.android.gms.dynamite.DynamiteModule$b
            r2 = 0
            r1.<init>(r2)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r3 = f11250j
            r3.set(r1)
            com.google.android.gms.dynamite.DynamiteModule$a$a r3 = f11251k     // Catch:{ all -> 0x012f }
            com.google.android.gms.dynamite.DynamiteModule$a$b r3 = r11.mo11353a(r10, r12, r3)     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "DynamiteModule"
            int r5 = r3.f11255a     // Catch:{ all -> 0x012f }
            int r6 = r3.f11256b     // Catch:{ all -> 0x012f }
            java.lang.String r7 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x012f }
            int r7 = r7.length()     // Catch:{ all -> 0x012f }
            int r7 = r7 + 68
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x012f }
            int r8 = r8.length()     // Catch:{ all -> 0x012f }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r8.<init>(r7)     // Catch:{ all -> 0x012f }
            java.lang.String r7 = "Considering local module "
            r8.append(r7)     // Catch:{ all -> 0x012f }
            r8.append(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r7 = ":"
            r8.append(r7)     // Catch:{ all -> 0x012f }
            r8.append(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = " and remote module "
            r8.append(r5)     // Catch:{ all -> 0x012f }
            r8.append(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = ":"
            r8.append(r5)     // Catch:{ all -> 0x012f }
            r8.append(r6)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x012f }
            android.util.Log.i(r4, r5)     // Catch:{ all -> 0x012f }
            int r4 = r3.f11257c     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x0105
            int r4 = r3.f11257c     // Catch:{ all -> 0x012f }
            r5 = -1
            if (r4 != r5) goto L_0x006b
            int r4 = r3.f11255a     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x0105
        L_0x006b:
            int r4 = r3.f11257c     // Catch:{ all -> 0x012f }
            r6 = 1
            if (r4 != r6) goto L_0x0074
            int r4 = r3.f11256b     // Catch:{ all -> 0x012f }
            if (r4 == 0) goto L_0x0105
        L_0x0074:
            int r4 = r3.f11257c     // Catch:{ all -> 0x012f }
            if (r4 != r5) goto L_0x008b
            com.google.android.gms.dynamite.DynamiteModule r10 = m15156c(r10, r12)     // Catch:{ all -> 0x012f }
            android.database.Cursor r11 = r1.f11258a
            if (r11 == 0) goto L_0x0085
        L_0x0080:
            android.database.Cursor r11 = r1.f11258a
            r11.close()
        L_0x0085:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r11 = f11250j
            r11.set(r0)
            return r10
        L_0x008b:
            int r4 = r3.f11257c     // Catch:{ all -> 0x012f }
            if (r4 != r6) goto L_0x00ea
            int r4 = r3.f11256b     // Catch:{ LoadingException -> 0x00a4 }
            com.google.android.gms.dynamite.DynamiteModule r4 = m15148a(r10, r12, r4)     // Catch:{ LoadingException -> 0x00a4 }
            android.database.Cursor r10 = r1.f11258a
            if (r10 == 0) goto L_0x009e
            android.database.Cursor r10 = r1.f11258a
            r10.close()
        L_0x009e:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = f11250j
            r10.set(r0)
            return r4
        L_0x00a4:
            r4 = move-exception
            java.lang.String r6 = "DynamiteModule"
            java.lang.String r7 = "Failed to load remote module: "
            java.lang.String r8 = r4.getMessage()     // Catch:{ all -> 0x012f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x012f }
            int r9 = r8.length()     // Catch:{ all -> 0x012f }
            if (r9 == 0) goto L_0x00bc
            java.lang.String r7 = r7.concat(r8)     // Catch:{ all -> 0x012f }
            goto L_0x00c2
        L_0x00bc:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x012f }
            r8.<init>(r7)     // Catch:{ all -> 0x012f }
            r7 = r8
        L_0x00c2:
            android.util.Log.w(r6, r7)     // Catch:{ all -> 0x012f }
            int r6 = r3.f11255a     // Catch:{ all -> 0x012f }
            if (r6 == 0) goto L_0x00e2
            com.google.android.gms.dynamite.DynamiteModule$c r6 = new com.google.android.gms.dynamite.DynamiteModule$c     // Catch:{ all -> 0x012f }
            int r3 = r3.f11255a     // Catch:{ all -> 0x012f }
            r7 = 0
            r6.<init>(r3, r7)     // Catch:{ all -> 0x012f }
            com.google.android.gms.dynamite.DynamiteModule$a$b r11 = r11.mo11353a(r10, r12, r6)     // Catch:{ all -> 0x012f }
            int r11 = r11.f11257c     // Catch:{ all -> 0x012f }
            if (r11 != r5) goto L_0x00e2
            com.google.android.gms.dynamite.DynamiteModule r10 = m15156c(r10, r12)     // Catch:{ all -> 0x012f }
            android.database.Cursor r11 = r1.f11258a
            if (r11 == 0) goto L_0x0085
            goto L_0x0080
        L_0x00e2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x012f }
            java.lang.String r11 = "Remote load failed. No local fallback found."
            r10.<init>(r11, r4, r2)     // Catch:{ all -> 0x012f }
            throw r10     // Catch:{ all -> 0x012f }
        L_0x00ea:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x012f }
            int r11 = r3.f11257c     // Catch:{ all -> 0x012f }
            r12 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r3.<init>(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r12 = "VersionPolicy returned invalid code:"
            r3.append(r12)     // Catch:{ all -> 0x012f }
            r3.append(r11)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = r3.toString()     // Catch:{ all -> 0x012f }
            r10.<init>(r11, r2)     // Catch:{ all -> 0x012f }
            throw r10     // Catch:{ all -> 0x012f }
        L_0x0105:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x012f }
            int r11 = r3.f11255a     // Catch:{ all -> 0x012f }
            int r12 = r3.f11256b     // Catch:{ all -> 0x012f }
            r3 = 91
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x012f }
            r4.<init>(r3)     // Catch:{ all -> 0x012f }
            java.lang.String r3 = "No acceptable module found. Local version is "
            r4.append(r3)     // Catch:{ all -> 0x012f }
            r4.append(r11)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = " and remote version is "
            r4.append(r11)     // Catch:{ all -> 0x012f }
            r4.append(r12)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = "."
            r4.append(r11)     // Catch:{ all -> 0x012f }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x012f }
            r10.<init>(r11, r2)     // Catch:{ all -> 0x012f }
            throw r10     // Catch:{ all -> 0x012f }
        L_0x012f:
            r10 = move-exception
            android.database.Cursor r11 = r1.f11258a
            if (r11 == 0) goto L_0x0139
            android.database.Cursor r11 = r1.f11258a
            r11.close()
        L_0x0139:
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r11 = f11250j
            r11.set(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15147a(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$a, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* renamed from: a */
    private static DynamiteModule m15148a(Context context, String str, int i) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                bool = f11245e;
            }
            if (bool != null) {
                return bool.booleanValue() ? m15157c(context, str, i) : m15153b(context, str, i);
            }
            throw new LoadingException("Failed to determine which loading route to use.", (C3338a) null);
        } catch (Throwable th) {
            C3302g.m15050a(context, th);
            throw th;
        }
    }

    /* renamed from: a */
    private static C3346i m15149a(Context context) {
        C3346i iVar;
        synchronized (DynamiteModule.class) {
            if (f11246f != null) {
                C3346i iVar2 = f11246f;
                return iVar2;
            } else if (C3182e.m14660b().mo11106a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        iVar = queryLocalInterface instanceof C3346i ? (C3346i) queryLocalInterface : new C3347j(iBinder);
                    }
                    if (iVar != null) {
                        f11246f = iVar;
                        return iVar;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    @GuardedBy("DynamiteModule.class")
    /* renamed from: a */
    private static void m15150a(ClassLoader classLoader) {
        C3348k kVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                kVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kVar = queryLocalInterface instanceof C3348k ? (C3348k) queryLocalInterface : new C3349l(iBinder);
            }
            f11247g = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    /* renamed from: b */
    public static int m15151b(Context context, String str) {
        return m15145a(context, str, false);
    }

    /* renamed from: b */
    private static int m15152b(Context context, String str, boolean z) {
        C3346i a = m15149a(context);
        if (a == null) {
            return 0;
        }
        try {
            if (a.mo11357a() >= 2) {
                return a.mo11360b(C3327d.m15136a(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a.mo11358a(C3327d.m15136a(context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    /* renamed from: b */
    private static DynamiteModule m15153b(Context context, String str, int i) {
        C3323b bVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        C3346i a = m15149a(context);
        if (a != null) {
            try {
                if (a.mo11357a() >= 2) {
                    bVar = a.mo11361b(C3327d.m15136a(context), str, i);
                } else {
                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                    bVar = a.mo11359a(C3327d.m15136a(context), str, i);
                }
                if (C3327d.m15137a(bVar) != null) {
                    return new DynamiteModule((Context) C3327d.m15137a(bVar));
                }
                throw new LoadingException("Failed to load remote module.", (C3338a) null);
            } catch (RemoteException e) {
                throw new LoadingException("Failed to load remote module.", e, null);
            }
        } else {
            throw new LoadingException("Failed to create IDynamiteLoader.", (C3338a) null);
        }
    }

    /* renamed from: b */
    private static Boolean m15154b() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f11249i >= 2);
        }
        return valueOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b4  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m15155c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10.length()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.<init>(r10)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r2.append(r9)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            if (r8 == 0) goto L_0x0090
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 == 0) goto L_0x0090
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r9 <= 0) goto L_0x0081
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x007e }
            f11248h = r1     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x007e }
            if (r1 < 0) goto L_0x006b
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x007e }
            f11249i = r1     // Catch:{ all -> 0x007e }
        L_0x006b:
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = f11250j     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            com.google.android.gms.dynamite.DynamiteModule$b r10 = (com.google.android.gms.dynamite.DynamiteModule.C3336b) r10     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r10 == 0) goto L_0x0081
            android.database.Cursor r1 = r10.f11258a     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            if (r1 != 0) goto L_0x0081
            r10.f11258a = r8     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r8 = r0
            goto L_0x0081
        L_0x007e:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x007e }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x0081:
            if (r8 == 0) goto L_0x0086
            r8.close()
        L_0x0086:
            return r9
        L_0x0087:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00b2
        L_0x008b:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x00a3
        L_0x0090:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            throw r9     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
        L_0x009f:
            r8 = move-exception
            goto L_0x00b2
        L_0x00a1:
            r8 = move-exception
            r9 = r0
        L_0x00a3:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00b0 }
            if (r10 == 0) goto L_0x00a8
            throw r8     // Catch:{ all -> 0x00b0 }
        L_0x00a8:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00b0 }
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r8 = move-exception
            r0 = r9
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            r0.close()
        L_0x00b7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.m15155c(android.content.Context, java.lang.String, boolean):int");
    }

    /* renamed from: c */
    private static DynamiteModule m15156c(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        Log.i(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* renamed from: c */
    private static DynamiteModule m15157c(Context context, String str, int i) {
        C3348k kVar;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            kVar = f11247g;
        }
        if (kVar != null) {
            C3336b bVar = (C3336b) f11250j.get();
            if (bVar == null || bVar.f11258a == null) {
                throw new LoadingException("No result cursor", (C3338a) null);
            }
            Context a = m15146a(context.getApplicationContext(), str, i, bVar.f11258a, kVar);
            if (a != null) {
                return new DynamiteModule(a);
            }
            throw new LoadingException("Failed to get module context", (C3338a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (C3338a) null);
    }

    /* renamed from: a */
    public final Context mo11351a() {
        return this.f11254n;
    }

    /* renamed from: a */
    public final IBinder mo11352a(String str) {
        try {
            return (IBinder) this.f11254n.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e, null);
        }
    }
}
