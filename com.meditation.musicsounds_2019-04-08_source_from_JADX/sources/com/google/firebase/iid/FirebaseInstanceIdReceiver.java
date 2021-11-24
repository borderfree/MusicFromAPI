package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p009v4.content.C0461f;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C3309n;
import javax.annotation.concurrent.GuardedBy;

public final class FirebaseInstanceIdReceiver extends C0461f {

    /* renamed from: a */
    private static boolean f17686a = false;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: b */
    private static C4931ai f17687b;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: c */
    private static C4931ai f17688c;

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m24534a(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = C3309n.m15080l() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m24537b(broadcastReceiver, context, str, intent);
        }
        int a = C4970w.m24661a().mo16244a(context, str, intent);
        if (!C3309n.m15080l() || a != 402) {
            return a;
        }
        m24537b(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: a */
    private static synchronized C4931ai m24535a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f17688c == null) {
                    f17688c = new C4931ai(context, str);
                }
                C4931ai aiVar = f17688c;
                return aiVar;
            }
            if (f17687b == null) {
                f17687b = new C4931ai(context, str);
            }
            C4931ai aiVar2 = f17687b;
            return aiVar2;
        }
    }

    /* renamed from: a */
    private final void m24536a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            i = m24534a(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    /* renamed from: b */
    private static int m24537b(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "FirebaseInstanceId";
            String str3 = "Binding to service: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m24535a(context, str).mo16191a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m24536a(context, intent2, intent.getAction());
            } else {
                m24536a(context, intent, intent.getAction());
            }
        }
    }
}
