package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0419y.C0423c;
import android.support.p009v4.app.C0419y.C0424d;
import android.support.p009v4.app.C0419y.C0425e;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C3086be;
import com.google.android.gms.common.api.internal.C3087bf;
import com.google.android.gms.common.api.internal.C3141g;
import com.google.android.gms.common.internal.C3243f;
import com.google.android.gms.common.internal.C3244g;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3304i;
import com.google.android.gms.common.util.C3309n;
import com.google.android.gms.internal.p128c.C4164e;
import com.google.android.gms.p115a.C2838a.C2839a;
import com.google.android.gms.p115a.C2838a.C2840b;

/* renamed from: com.google.android.gms.common.d */
public class C3177d extends C3182e {

    /* renamed from: a */
    public static final int f10954a = C3182e.f10966b;

    /* renamed from: c */
    private static final Object f10955c = new Object();

    /* renamed from: d */
    private static final C3177d f10956d = new C3177d();

    /* renamed from: e */
    private String f10957e;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.d$a */
    private class C3178a extends C4164e {

        /* renamed from: a */
        private final Context f10958a;

        public C3178a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f10958a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            if (message.what != 1) {
                int i = message.what;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int a = C3177d.this.mo11106a(this.f10958a);
            if (C3177d.this.mo11114a(a)) {
                C3177d.this.mo11113a(this.f10958a, a);
            }
        }
    }

    C3177d() {
    }

    /* renamed from: a */
    public static Dialog m14627a(Activity activity, OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        Builder builder = new Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C3243f.m14856c(activity, 18));
        builder.setPositiveButton("", null);
        AlertDialog create = builder.create();
        m14630a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    static Dialog m14628a(Context context, int i, C3244g gVar, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(context, 5);
        }
        if (builder == null) {
            builder = new Builder(context);
        }
        builder.setMessage(C3243f.m14856c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String e = C3243f.m14858e(context, i);
        if (e != null) {
            builder.setPositiveButton(e, gVar);
        }
        String a = C3243f.m14851a(context, i);
        if (a != null) {
            builder.setTitle(a);
        }
        return builder.create();
    }

    /* renamed from: a */
    public static C3177d m14629a() {
        return f10956d;
    }

    /* renamed from: a */
    static void m14630a(Activity activity, Dialog dialog, String str, OnCancelListener onCancelListener) {
        if (activity instanceof C0367h) {
            C3187i.m14681a(dialog, onCancelListener).mo1448a(((C0367h) activity).mo1469g(), str);
            return;
        }
        C3173c.m14623a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m14631a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo11119b(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String b = C3243f.m14855b(context, i);
            String d = C3243f.m14857d(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0424d a = new C0424d(context).mo1733c(true).mo1730b(true).mo1723a((CharSequence) b).mo1721a((C0425e) new C0423c().mo1711a((CharSequence) d));
            if (C3304i.m15057a(context)) {
                C3266s.m14919a(C3309n.m15076h());
                a.mo1713a(context.getApplicationInfo().icon).mo1731c(2);
                if (C3304i.m15058b(context)) {
                    a.mo1715a(C2839a.common_full_open_on_phone, (CharSequence) resources.getString(C2840b.common_open_on_phone), pendingIntent);
                } else {
                    a.mo1717a(pendingIntent);
                }
            } else {
                a.mo1713a(17301642).mo1735d((CharSequence) resources.getString(C2840b.common_google_play_services_notification_ticker)).mo1716a(System.currentTimeMillis()).mo1717a(pendingIntent).mo1729b((CharSequence) d);
            }
            if (C3309n.m15080l()) {
                C3266s.m14919a(C3309n.m15080l());
                String c = m14632c();
                if (c == null) {
                    c = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(c);
                    String b2 = C3243f.m14854b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(c, b2, 4);
                    } else if (!b2.equals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                a.mo1724a(c);
            }
            Notification a2 = a.mo1712a();
            switch (i) {
                case 1:
                case 2:
                case 3:
                    i2 = 10436;
                    C3183f.sCanceledAvailabilityNotification.set(false);
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            notificationManager.notify(i2, a2);
        }
    }

    /* renamed from: c */
    private final String m14632c() {
        String str;
        synchronized (f10955c) {
            str = this.f10957e;
        }
        return str;
    }

    /* renamed from: a */
    public int mo11106a(Context context) {
        return super.mo11106a(context);
    }

    /* renamed from: a */
    public Dialog mo11107a(Activity activity, int i, int i2) {
        return mo11108a(activity, i, i2, (OnCancelListener) null);
    }

    /* renamed from: a */
    public Dialog mo11108a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        return m14628a((Context) activity, i, C3244g.m14859a(activity, mo11111a((Context) activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: a */
    public PendingIntent mo11109a(Context context, int i, int i2) {
        return super.mo11109a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo11110a(Context context, ConnectionResult connectionResult) {
        return connectionResult.mo10758a() ? connectionResult.mo10761d() : mo11109a(context, connectionResult.mo10760c(), 0);
    }

    /* renamed from: a */
    public Intent mo11111a(Context context, int i, String str) {
        return super.mo11111a(context, i, str);
    }

    /* renamed from: a */
    public final C3086be mo11112a(Context context, C3087bf bfVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3086be beVar = new C3086be(bfVar);
        context.registerReceiver(beVar, intentFilter);
        beVar.mo10957a(context);
        if (mo11132a(context, "com.google.android.gms")) {
            return beVar;
        }
        bfVar.mo10917a();
        beVar.mo10956a();
        return null;
    }

    /* renamed from: a */
    public void mo11113a(Context context, int i) {
        m14631a(context, i, (String) null, mo11131a(context, i, 0, "n"));
    }

    /* renamed from: a */
    public final boolean mo11114a(int i) {
        return super.mo11114a(i);
    }

    /* renamed from: a */
    public final boolean mo11115a(Activity activity, C3141g gVar, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = m14628a((Context) activity, i, C3244g.m14861a(gVar, mo11111a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m14630a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: a */
    public final boolean mo11116a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo11110a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m14631a(context, connectionResult.mo10760c(), (String) null, GoogleApiActivity.m13988a(context, a, i));
        return true;
    }

    /* renamed from: b */
    public int mo11117b(Context context, int i) {
        return super.mo11117b(context, i);
    }

    /* renamed from: b */
    public final String mo11118b(int i) {
        return super.mo11118b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11119b(Context context) {
        new C3178a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: b */
    public boolean mo11120b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Dialog a = mo11108a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m14630a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
