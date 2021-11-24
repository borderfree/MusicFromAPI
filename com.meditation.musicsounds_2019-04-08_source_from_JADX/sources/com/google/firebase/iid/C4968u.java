package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.p009v4.p019g.C0510m;
import android.util.Log;
import com.google.android.gms.tasks.C4797g;
import com.google.android.gms.tasks.C4800i;
import com.google.firebase.iid.zzl.C4974a;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.u */
final class C4968u {

    /* renamed from: a */
    private static int f17782a;

    /* renamed from: b */
    private static PendingIntent f17783b;
    @GuardedBy("responseCallbacks")

    /* renamed from: c */
    private final C0510m<String, C4797g<Bundle>> f17784c = new C0510m<>();

    /* renamed from: d */
    private final Context f17785d;

    /* renamed from: e */
    private final C4962o f17786e;

    /* renamed from: f */
    private Messenger f17787f;

    /* renamed from: g */
    private Messenger f17788g;

    /* renamed from: h */
    private zzl f17789h;

    public C4968u(Context context, C4962o oVar) {
        this.f17785d = context;
        this.f17786e = oVar;
        this.f17787f = new Messenger(new C4969v(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    private static synchronized String m24652a() {
        String num;
        synchronized (C4968u.class) {
            int i = f17782a;
            f17782a = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: a */
    private static synchronized void m24653a(Context context, Intent intent) {
        synchronized (C4968u.class) {
            if (f17783b == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f17783b = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f17783b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m24654a(Message message) {
        String str;
        String str2;
        if (message == null || !(message.obj instanceof Intent)) {
            str = "FirebaseInstanceId";
            str2 = "Dropping invalid message";
        } else {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new C4974a());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzl) {
                    this.f17789h = (zzl) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.f17788g = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            String action = intent2.getAction();
            if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str3 = "FirebaseInstanceId";
                    String str4 = "Unexpected response action: ";
                    String valueOf = String.valueOf(action);
                    Log.d(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                }
                return;
            }
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("FirebaseInstanceId", sb.toString());
                } else {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String str5 = "FirebaseInstanceId";
                        String str6 = "Received InstanceID error ";
                        String valueOf3 = String.valueOf(stringExtra2);
                        Log.d(str5, valueOf3.length() != 0 ? str6.concat(valueOf3) : new String(str6));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length <= 2 || !"ID".equals(split[1])) {
                            str = "FirebaseInstanceId";
                            String str7 = "Unexpected structured response ";
                            String valueOf4 = String.valueOf(stringExtra2);
                            str2 = valueOf4.length() != 0 ? str7.concat(valueOf4) : new String(str7);
                        } else {
                            String str8 = split[2];
                            String str9 = split[3];
                            if (str9.startsWith(":")) {
                                str9 = str9.substring(1);
                            }
                            m24656a(str8, intent2.putExtra("error", str9).getExtras());
                        }
                    } else {
                        synchronized (this.f17784c) {
                            for (int i = 0; i < this.f17784c.size(); i++) {
                                m24656a((String) this.f17784c.mo2010b(i), intent2.getExtras());
                            }
                        }
                    }
                }
            }
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str10 = "FirebaseInstanceId";
                    String str11 = "Unexpected response string: ";
                    String valueOf5 = String.valueOf(stringExtra);
                    Log.d(str10, valueOf5.length() != 0 ? str11.concat(valueOf5) : new String(str11));
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            Bundle extras = intent2.getExtras();
            extras.putString("registration_id", group2);
            m24656a(group, extras);
            return;
        }
        Log.w(str, str2);
    }

    /* renamed from: a */
    private final void m24656a(String str, Bundle bundle) {
        synchronized (this.f17784c) {
            C4797g gVar = (C4797g) this.f17784c.remove(str);
            if (gVar == null) {
                String str2 = "FirebaseInstanceId";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            gVar.mo15931a(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m24657b(Bundle bundle) {
        Bundle c = m24658c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m24658c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m24658c(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = m24652a()
            com.google.android.gms.tasks.g r1 = new com.google.android.gms.tasks.g
            r1.<init>()
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r8.f17784c
            monitor-enter(r2)
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r3 = r8.f17784c     // Catch:{ all -> 0x0124 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0124 }
            monitor-exit(r2)     // Catch:{ all -> 0x0124 }
            com.google.firebase.iid.o r2 = r8.f17786e
            int r2 = r2.mo16236a()
            if (r2 == 0) goto L_0x011c
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.o r3 = r8.f17786e
            int r3 = r3.mo16236a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
        L_0x002f:
            r2.setAction(r3)
            goto L_0x0036
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x002f
        L_0x0036:
            r2.putExtras(r9)
            android.content.Context r9 = r8.f17785d
            m24653a(r9, r2)
            java.lang.String r9 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r9, r3)
            java.lang.String r9 = "FirebaseInstanceId"
            r3 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x0094
            java.lang.String r9 = "FirebaseInstanceId"
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
            android.util.Log.d(r9, r5)
        L_0x0094:
            java.lang.String r9 = "google.messenger"
            android.os.Messenger r5 = r8.f17787f
            r2.putExtra(r9, r5)
            android.os.Messenger r9 = r8.f17788g
            if (r9 != 0) goto L_0x00a3
            com.google.firebase.iid.zzl r9 = r8.f17789h
            if (r9 == 0) goto L_0x00c9
        L_0x00a3:
            android.os.Message r9 = android.os.Message.obtain()
            r9.obj = r2
            android.os.Messenger r5 = r8.f17788g     // Catch:{ RemoteException -> 0x00b9 }
            if (r5 == 0) goto L_0x00b3
            android.os.Messenger r5 = r8.f17788g     // Catch:{ RemoteException -> 0x00b9 }
            r5.send(r9)     // Catch:{ RemoteException -> 0x00b9 }
            goto L_0x00dc
        L_0x00b3:
            com.google.firebase.iid.zzl r5 = r8.f17789h     // Catch:{ RemoteException -> 0x00b9 }
            r5.mo16258a(r9)     // Catch:{ RemoteException -> 0x00b9 }
            goto L_0x00dc
        L_0x00b9:
            java.lang.String r9 = "FirebaseInstanceId"
            boolean r9 = android.util.Log.isLoggable(r9, r3)
            if (r9 == 0) goto L_0x00c9
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r9, r3)
        L_0x00c9:
            com.google.firebase.iid.o r9 = r8.f17786e
            int r9 = r9.mo16236a()
            if (r9 != r4) goto L_0x00d7
            android.content.Context r9 = r8.f17785d
            r9.sendBroadcast(r2)
            goto L_0x00dc
        L_0x00d7:
            android.content.Context r9 = r8.f17785d
            r9.startService(r2)
        L_0x00dc:
            com.google.android.gms.tasks.f r9 = r1.mo15929a()     // Catch:{ InterruptedException | TimeoutException -> 0x0100, ExecutionException -> 0x00f9 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x0100, ExecutionException -> 0x00f9 }
            java.lang.Object r9 = com.google.android.gms.tasks.C4800i.m24064a(r9, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x0100, ExecutionException -> 0x00f9 }
            android.os.Bundle r9 = (android.os.Bundle) r9     // Catch:{ InterruptedException | TimeoutException -> 0x0100, ExecutionException -> 0x00f9 }
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r1 = r8.f17784c
            monitor-enter(r1)
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r8.f17784c     // Catch:{ all -> 0x00f4 }
            r2.remove(r0)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f4 }
            return r9
        L_0x00f4:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f4 }
            throw r9
        L_0x00f7:
            r9 = move-exception
            goto L_0x010f
        L_0x00f9:
            r9 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f7 }
            r1.<init>(r9)     // Catch:{ all -> 0x00f7 }
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x0100:
            java.lang.String r9 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r9, r1)     // Catch:{ all -> 0x00f7 }
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "TIMEOUT"
            r9.<init>(r1)     // Catch:{ all -> 0x00f7 }
            throw r9     // Catch:{ all -> 0x00f7 }
        L_0x010f:
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r1 = r8.f17784c
            monitor-enter(r1)
            android.support.v4.g.m<java.lang.String, com.google.android.gms.tasks.g<android.os.Bundle>> r2 = r8.f17784c     // Catch:{ all -> 0x0119 }
            r2.remove(r0)     // Catch:{ all -> 0x0119 }
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            throw r9
        L_0x0119:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            throw r9
        L_0x011c:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r9.<init>(r0)
            throw r9
        L_0x0124:
            r9 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0124 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4968u.m24658c(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo16242a(Bundle bundle) {
        if (this.f17786e.mo16239d() < 12000000) {
            return m24657b(bundle);
        }
        try {
            return (Bundle) C4800i.m24063a(C4951d.m24618a(this.f17785d).mo16217b(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e.getCause() instanceof zzal) || ((zzal) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return m24657b(bundle);
        }
    }
}
