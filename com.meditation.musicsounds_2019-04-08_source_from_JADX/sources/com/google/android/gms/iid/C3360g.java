package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.tasks.C4800i;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.iid.g */
public final class C3360g {

    /* renamed from: a */
    private static final C3364k<Boolean> f11280a = C3363j.m15224a().mo11381a("gcm_iid_use_messenger_ipc", true);

    /* renamed from: b */
    private static String f11281b = null;

    /* renamed from: c */
    private static boolean f11282c = false;

    /* renamed from: d */
    private static int f11283d = 0;

    /* renamed from: e */
    private static int f11284e = 0;

    /* renamed from: f */
    private static int f11285f = 0;

    /* renamed from: g */
    private static BroadcastReceiver f11286g = null;

    /* renamed from: h */
    private Context f11287h;

    /* renamed from: i */
    private Map<String, Object> f11288i = new C0488a();

    /* renamed from: j */
    private Messenger f11289j;

    /* renamed from: k */
    private Messenger f11290k;

    /* renamed from: l */
    private MessengerCompat f11291l;

    /* renamed from: m */
    private PendingIntent f11292m;

    public C3360g(Context context) {
        this.f11287h = context;
    }

    /* renamed from: a */
    private static synchronized String m15210a() {
        String num;
        synchronized (C3360g.class) {
            int i = f11285f;
            f11285f = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    public static String m15211a(Context context) {
        boolean z;
        if (f11281b != null) {
            return f11281b;
        }
        f11283d = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!C3309n.m15080l()) {
            Iterator it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m15216a(packageManager, ((ResolveInfo) it.next()).serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                        f11282c = false;
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return f11281b;
            }
        }
        Iterator it2 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (m15216a(packageManager, ((ResolveInfo) it2.next()).activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                    f11282c = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return f11281b;
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (m15215a(packageManager, "com.google.android.gms")) {
            f11282c = C3309n.m15080l();
            return f11281b;
        } else if (C3309n.m15077i() || !m15215a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f11282c = false;
            return f11281b;
        }
    }

    /* renamed from: a */
    static String m15212a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string == null) {
                string = bundle.getString("unregistered");
            }
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if (string2 != null) {
                throw new IOException(string2);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unexpected response from GCM ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* renamed from: a */
    private static void m15213a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m15214a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f11288i.get(str);
            this.f11288i.put(str, obj);
            m15213a(obj2, obj);
        }
    }

    /* renamed from: a */
    private static boolean m15215a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f11281b = applicationInfo.packageName;
            f11284e = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m15216a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return m15215a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    /* renamed from: b */
    private static int m15217b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(m15211a(context), 0).versionCode;
        } catch (NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private final Bundle m15218b(Bundle bundle) {
        Bundle c = m15220c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m15220c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: b */
    private final synchronized void m15219b(Intent intent) {
        if (this.f11292m == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f11292m = PendingIntent.getBroadcast(this.f11287h, 0, intent2, 0);
        }
        intent.putExtra("app", this.f11292m);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0184 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m15220c(android.os.Bundle r9) {
        /*
            r8 = this;
            android.os.ConditionVariable r0 = new android.os.ConditionVariable
            r0.<init>()
            java.lang.String r1 = m15210a()
            java.lang.Class r2 = r8.getClass()
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.f11288i     // Catch:{ all -> 0x01d5 }
            r3.put(r1, r0)     // Catch:{ all -> 0x01d5 }
            monitor-exit(r2)     // Catch:{ all -> 0x01d5 }
            android.os.Messenger r2 = r8.f11289j
            if (r2 != 0) goto L_0x002d
            android.content.Context r2 = r8.f11287h
            m15211a(r2)
            android.os.Messenger r2 = new android.os.Messenger
            com.google.android.gms.iid.h r3 = new com.google.android.gms.iid.h
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r8, r4)
            r2.<init>(r3)
            r8.f11289j = r2
        L_0x002d:
            java.lang.String r2 = f11281b
            if (r2 == 0) goto L_0x01cd
            android.content.Intent r2 = new android.content.Intent
            boolean r3 = f11282c
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x003c
        L_0x003a:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x003c:
            r2.<init>(r3)
            java.lang.String r3 = f11281b
            r2.setPackage(r3)
            r2.putExtras(r9)
            r8.m15219b(r2)
            java.lang.String r9 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "|ID|"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = "|"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "X-kid"
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "|ID|"
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = "|"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "com.google.android.gsf"
            java.lang.String r3 = f11281b
            boolean r9 = r9.equals(r3)
            java.lang.String r3 = "useGsf"
            java.lang.String r3 = r2.getStringExtra(r3)
            if (r3 == 0) goto L_0x00aa
            java.lang.String r9 = "1"
            boolean r9 = r9.equals(r3)
        L_0x00aa:
            java.lang.String r3 = "InstanceID"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x00db
            java.lang.String r3 = "InstanceID"
            android.os.Bundle r5 = r2.getExtras()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Sending "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.d(r3, r5)
        L_0x00db:
            android.os.Messenger r3 = r8.f11290k
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = "google.messenger"
            android.os.Messenger r5 = r8.f11289j
            r2.putExtra(r3, r5)
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r8.f11290k     // Catch:{ RemoteException -> 0x00f3 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00f3 }
            goto L_0x017a
        L_0x00f3:
            java.lang.String r3 = "InstanceID"
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0102
            java.lang.String r3 = "InstanceID"
            java.lang.String r5 = "Messenger failed, fallback to startService"
            android.util.Log.d(r3, r5)
        L_0x0102:
            if (r9 == 0) goto L_0x013e
            monitor-enter(r8)
            android.content.BroadcastReceiver r9 = f11286g     // Catch:{ all -> 0x013b }
            if (r9 != 0) goto L_0x0139
            com.google.android.gms.iid.i r9 = new com.google.android.gms.iid.i     // Catch:{ all -> 0x013b }
            r9.<init>(r8)     // Catch:{ all -> 0x013b }
            f11286g = r9     // Catch:{ all -> 0x013b }
            java.lang.String r9 = "InstanceID"
            boolean r9 = android.util.Log.isLoggable(r9, r4)     // Catch:{ all -> 0x013b }
            if (r9 == 0) goto L_0x011f
            java.lang.String r9 = "InstanceID"
            java.lang.String r3 = "Registered GSF callback receiver"
            android.util.Log.d(r9, r3)     // Catch:{ all -> 0x013b }
        L_0x011f:
            android.content.IntentFilter r9 = new android.content.IntentFilter     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTRATION"
            r9.<init>(r3)     // Catch:{ all -> 0x013b }
            android.content.Context r3 = r8.f11287h     // Catch:{ all -> 0x013b }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x013b }
            r9.addCategory(r3)     // Catch:{ all -> 0x013b }
            android.content.Context r3 = r8.f11287h     // Catch:{ all -> 0x013b }
            android.content.BroadcastReceiver r4 = f11286g     // Catch:{ all -> 0x013b }
            java.lang.String r5 = "com.google.android.c2dm.permission.SEND"
            r6 = 0
            r3.registerReceiver(r4, r9, r5, r6)     // Catch:{ all -> 0x013b }
        L_0x0139:
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            goto L_0x016f
        L_0x013b:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x013b }
            throw r9
        L_0x013e:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r3 = r8.f11289j
            r2.putExtra(r9, r3)
            java.lang.String r9 = "messenger2"
            java.lang.String r3 = "1"
            r2.putExtra(r9, r3)
            com.google.android.gms.iid.MessengerCompat r9 = r8.f11291l
            if (r9 == 0) goto L_0x016b
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            com.google.android.gms.iid.MessengerCompat r3 = r8.f11291l     // Catch:{ RemoteException -> 0x015c }
            r3.mo11364a(r9)     // Catch:{ RemoteException -> 0x015c }
            goto L_0x017a
        L_0x015c:
            java.lang.String r9 = "InstanceID"
            boolean r9 = android.util.Log.isLoggable(r9, r4)
            if (r9 == 0) goto L_0x016b
            java.lang.String r9 = "InstanceID"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x016b:
            boolean r9 = f11282c
            if (r9 == 0) goto L_0x0175
        L_0x016f:
            android.content.Context r9 = r8.f11287h
            r9.sendBroadcast(r2)
            goto L_0x017a
        L_0x0175:
            android.content.Context r9 = r8.f11287h
            r9.startService(r2)
        L_0x017a:
            r2 = 30000(0x7530, double:1.4822E-319)
            r0.block(r2)
            java.lang.Class r9 = r8.getClass()
            monitor-enter(r9)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f11288i     // Catch:{ all -> 0x01ca }
            java.lang.Object r0 = r0.remove(r1)     // Catch:{ all -> 0x01ca }
            boolean r1 = r0 instanceof android.os.Bundle     // Catch:{ all -> 0x01ca }
            if (r1 == 0) goto L_0x0192
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x01ca }
            monitor-exit(r9)     // Catch:{ all -> 0x01ca }
            return r0
        L_0x0192:
            boolean r1 = r0 instanceof java.lang.String     // Catch:{ all -> 0x01ca }
            if (r1 == 0) goto L_0x019e
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01ca }
            r1.<init>(r0)     // Catch:{ all -> 0x01ca }
            throw r1     // Catch:{ all -> 0x01ca }
        L_0x019e:
            java.lang.String r1 = "InstanceID"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01ca }
            int r2 = r2.length()     // Catch:{ all -> 0x01ca }
            int r2 = r2 + 12
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ca }
            r3.<init>(r2)     // Catch:{ all -> 0x01ca }
            java.lang.String r2 = "No response "
            r3.append(r2)     // Catch:{ all -> 0x01ca }
            r3.append(r0)     // Catch:{ all -> 0x01ca }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01ca }
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x01ca }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ca }
            java.lang.String r1 = "TIMEOUT"
            r0.<init>(r1)     // Catch:{ all -> 0x01ca }
            throw r0     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x01ca }
            throw r0
        L_0x01cd:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x01d5:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01d5 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.iid.C3360g.m15220c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo11383a(Bundle bundle, KeyPair keyPair) {
        int b = m15217b(this.f11287h);
        bundle.putString("gmsv", Integer.toString(b));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(C3350a.m15189a(this.f11287h)));
        bundle.putString("app_ver_name", C3350a.m15193b(this.f11287h));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", C3350a.m15191a(keyPair));
        if (b < 12000000 || !((Boolean) f11280a.mo11382a()).booleanValue()) {
            return m15218b(bundle);
        }
        try {
            return (Bundle) C4800i.m24063a(new C3375v(this.f11287h).mo11407a(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("InstanceID", sb.toString());
            }
            if (!(e.getCause() instanceof zzaa) || ((zzaa) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return m15218b(bundle);
        }
    }

    /* renamed from: a */
    public final void mo11384a(Intent intent) {
        String str;
        if (intent == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Unexpected response: null");
            }
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
            String stringExtra = intent.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("InstanceID", sb.toString());
                    return;
                }
                if (Log.isLoggable("InstanceID", 3)) {
                    String str2 = "InstanceID";
                    String str3 = "Received InstanceID error ";
                    String valueOf2 = String.valueOf(stringExtra2);
                    Log.d(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                }
                String str4 = null;
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String str5 = "InstanceID";
                        String str6 = "Unexpected structured response ";
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.w(str5, valueOf3.length() != 0 ? str6.concat(valueOf3) : new String(str6));
                    }
                    if (split.length > 2) {
                        String str7 = split[2];
                        str = split[3];
                        if (str.startsWith(":")) {
                            str = str.substring(1);
                        }
                        str4 = str7;
                    } else {
                        str = "UNKNOWN";
                    }
                    stringExtra2 = str;
                    intent.putExtra("error", stringExtra2);
                }
                if (str4 == null) {
                    synchronized (getClass()) {
                        for (String str8 : this.f11288i.keySet()) {
                            Object obj = this.f11288i.get(str8);
                            this.f11288i.put(str8, stringExtra2);
                            m15213a(obj, (Object) stringExtra2);
                        }
                    }
                    return;
                }
                m15214a(str4, (Object) stringExtra2);
                return;
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("InstanceID", 3)) {
                    String str9 = "InstanceID";
                    String str10 = "Unexpected response string: ";
                    String valueOf4 = String.valueOf(stringExtra);
                    Log.d(str9, valueOf4.length() != 0 ? str10.concat(valueOf4) : new String(str10));
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            Bundle extras = intent.getExtras();
            extras.putString("registration_id", group2);
            m15214a(group, (Object) extras);
            return;
        }
        if (Log.isLoggable("InstanceID", 3)) {
            String str11 = "InstanceID";
            String str12 = "Unexpected response ";
            String valueOf5 = String.valueOf(intent.getAction());
            Log.d(str11, valueOf5.length() != 0 ? str12.concat(valueOf5) : new String(str12));
        }
    }

    /* renamed from: a */
    public final void mo11385a(Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.f11291l = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f11290k = (Messenger) parcelableExtra;
                    }
                }
                mo11384a((Intent) message.obj);
                return;
            }
            Log.w("InstanceID", "Dropping invalid message");
        }
    }
}
