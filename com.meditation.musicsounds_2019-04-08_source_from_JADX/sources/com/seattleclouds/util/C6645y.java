package com.seattleclouds.util;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.support.p009v4.app.C0419y.C0422b;
import android.support.p009v4.app.C0419y.C0423c;
import android.support.p009v4.app.C0419y.C0424d;
import android.support.p009v4.app.C0419y.C0425e;
import android.util.Log;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.request.C1583b;
import com.bumptech.glide.request.p055a.C1577f;
import com.bumptech.glide.request.p055a.C1579h;
import com.bumptech.glide.request.p056b.C1586b;
import com.seattleclouds.App;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.seattleclouds.util.y */
public class C6645y {

    /* renamed from: a */
    private static final AtomicInteger f23377a = new AtomicInteger(new Random().nextInt(100000) + 1);

    /* renamed from: a */
    public static int m32096a() {
        int i;
        int i2;
        do {
            i = f23377a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f23377a.compareAndSet(i, i2));
        return i;
    }

    @TargetApi(26)
    /* renamed from: a */
    private static NotificationChannel m32097a(String str, String str2, int i) {
        NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.setLockscreenVisibility(1);
        StringBuilder sb = new StringBuilder();
        sb.append("Add new  NotificationChannel: ");
        sb.append(notificationChannel.toString());
        Log.d("NotificationUtil", sb.toString());
        return notificationChannel;
    }

    /* renamed from: a */
    public static void m32098a(int i, Notification notification, String str) {
        NotificationManager notificationManager = (NotificationManager) App.m25647e().getSystemService("notification");
        if (notificationManager != null) {
            try {
                m32100a(notificationManager, str);
                notificationManager.notify(i, notification);
            } catch (SecurityException e) {
                Log.e("NotificationUtil", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m32099a(Notification notification, String str) {
        m32098a(m32096a(), notification, str);
    }

    /* renamed from: a */
    public static void m32100a(NotificationManager notificationManager, String str) {
        if (VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            notificationManager.createNotificationChannel(m32106b(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0.equals("electronicSignature") == false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32101a(android.content.Context r7, android.os.Bundle r8) {
        /*
            java.lang.String r0 = "push_web_server"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "FROM_SC_WEB_SERVER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0016
            java.lang.String r7 = "NotificationUtil"
            java.lang.String r8 = "Invalid push message, process only message from sc"
            android.util.Log.w(r7, r8)
            return
        L_0x0016:
            java.lang.String r0 = "module"
            java.lang.String r0 = r8.getString(r0)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = ""
        L_0x0020:
            java.lang.String r1 = "OSABB"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "com.seattleclouds.modules.bonds.BBNotifications"
            java.lang.String r3 = "processGcmMessage"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r5[r1] = r6
            java.lang.reflect.Method r0 = com.seattleclouds.App.m25615a(r0, r3, (java.lang.Class<?>[]) r5)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r7
            r4[r1] = r8
            com.seattleclouds.App.m25613a(r0, r3, r4)
            goto L_0x0084
        L_0x0048:
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.getString(r0)
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = ""
        L_0x0052:
            r3 = -1
            int r4 = r0.hashCode()
            r5 = -998583948(0xffffffffc47ad174, float:-1003.2727)
            if (r4 == r5) goto L_0x006b
            r2 = 1730802076(0x6729f19c, float:8.0253684E23)
            if (r4 == r2) goto L_0x0062
            goto L_0x0075
        L_0x0062:
            java.lang.String r2 = "electronicSignature"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x006b:
            java.lang.String r1 = "messengerMessage"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            r1 = 0
            goto L_0x0076
        L_0x0075:
            r1 = -1
        L_0x0076:
            switch(r1) {
                case 0: goto L_0x0081;
                case 1: goto L_0x007d;
                default: goto L_0x0079;
            }
        L_0x0079:
            m32107b(r7, r8)
            goto L_0x0084
        L_0x007d:
            com.seattleclouds.modules.esignature.C5603e.m27815a(r7, r8)
            goto L_0x0084
        L_0x0081:
            com.seattleclouds.modules.messenger.C5861g.m28802a(r7, r8)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6645y.m32101a(android.content.Context, android.os.Bundle):void");
    }

    /* renamed from: a */
    private static void m32102a(Context context, final C0424d dVar, final int i, final String str, String str2) {
        if (m32109b()) {
            C1186c.m6455b(context).mo5859f().mo5834a(str2).mo5835a(new C1577f<Bitmap>() {
                /* renamed from: a */
                public void mo6401a(Bitmap bitmap, C1586b<? super Bitmap> bVar) {
                    C6645y.m32108b(dVar, bitmap, i, str);
                }

                /* renamed from: c */
                public void mo6440c(Drawable drawable) {
                    C6645y.m32108b(dVar, null, i, str);
                }
            });
            return;
        }
        C1583b c = C1186c.m6455b(context).mo5859f().mo5834a(str2).mo5841c();
        Bitmap bitmap = null;
        try {
            bitmap = (Bitmap) c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        m32108b(dVar, bitmap, i, str);
        C1186c.m6455b(context).mo5852a((C1579h<?>) c);
    }

    /* renamed from: a */
    private static void m32103a(C0424d dVar, int i) {
        Notification a = dVar.mo1712a();
        if (VERSION.SDK_INT > 20) {
            a.category = "promo";
        }
        m32098a(i, a, "general");
    }

    /* renamed from: a */
    public static void m32105a(String str) {
        NotificationManager notificationManager = (NotificationManager) App.m25647e().getSystemService("notification");
        if (notificationManager != null) {
            m32100a(notificationManager, str);
        }
    }

    @android.annotation.TargetApi(26)
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.app.NotificationChannel m32106b(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 4
            switch(r0) {
                case -1436108013: goto L_0x0051;
                case -80148248: goto L_0x0047;
                case 106069776: goto L_0x003d;
                case 308618489: goto L_0x0033;
                case 991715779: goto L_0x0029;
                case 1102094766: goto L_0x001f;
                case 1427818632: goto L_0x0015;
                case 2140768070: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x005b
        L_0x000b:
            java.lang.String r0 = "media_app"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 7
            goto L_0x005c
        L_0x0015:
            java.lang.String r0 = "download"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 4
            goto L_0x005c
        L_0x001f:
            java.lang.String r0 = "goal_tacker"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 5
            goto L_0x005c
        L_0x0029:
            java.lang.String r0 = "geo_fence"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x0033:
            java.lang.String r0 = "pod_cast"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 3
            goto L_0x005c
        L_0x003d:
            java.lang.String r0 = "other"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 6
            goto L_0x005c
        L_0x0047:
            java.lang.String r0 = "general"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 0
            goto L_0x005c
        L_0x0051:
            java.lang.String r0 = "messenger"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005b
            r0 = 2
            goto L_0x005c
        L_0x005b:
            r0 = -1
        L_0x005c:
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x009e;
                case 2: goto L_0x0097;
                case 3: goto L_0x008b;
                case 4: goto L_0x0084;
                case 5: goto L_0x007d;
                case 6: goto L_0x0076;
                case 7: goto L_0x006a;
                default: goto L_0x005f;
            }
        L_0x005f:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_general
        L_0x0065:
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00a5
        L_0x006a:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r2 = com.seattleclouds.C5451m.C5462k.notification_channel_media_name
            java.lang.String r0 = r0.getString(r2)
            r3 = 3
            goto L_0x00a5
        L_0x0076:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_others
            goto L_0x0065
        L_0x007d:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_goal_tracker
            goto L_0x0065
        L_0x0084:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_download
            goto L_0x0065
        L_0x008b:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_pod_cast
            java.lang.String r0 = r0.getString(r1)
            r3 = 2
            goto L_0x00a5
        L_0x0097:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_messenger
            goto L_0x0065
        L_0x009e:
            android.content.Context r0 = com.seattleclouds.App.m25647e()
            int r1 = com.seattleclouds.C5451m.C5462k.notification_channel_geo_fence
            goto L_0x0065
        L_0x00a5:
            android.app.NotificationChannel r4 = m32097a(r4, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6645y.m32106b(java.lang.String):android.app.NotificationChannel");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0265  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m32107b(android.content.Context r14, android.os.Bundle r15) {
        /*
            java.lang.String r0 = "local_img"
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r1 = "external_img"
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r2 = "action"
            java.lang.String r2 = r15.getString(r2)
            java.lang.String r3 = "external_action"
            java.lang.String r3 = r15.getString(r3)
            java.lang.String r4 = "button_text"
            java.lang.String r4 = r15.getString(r4)
            java.lang.String r5 = "message"
            java.lang.String r15 = r15.getString(r5)
            if (r15 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.String r5 = "\\n"
            java.lang.String r6 = "\n"
            java.lang.String r15 = r15.replace(r5, r6)
            r5 = 255(0xff, float:3.57E-43)
            int r6 = r15.length()
            r7 = 0
            if (r6 <= r5) goto L_0x004d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = r15.substring(r7, r5)
            r6.append(r15)
            java.lang.String r15 = "..."
            r6.append(r15)
            java.lang.String r15 = r6.toString()
        L_0x004d:
            int r5 = com.seattleclouds.C5451m.C5462k.app_name
            java.lang.String r5 = r14.getString(r5)
            int r6 = m32096a()
            com.seattleclouds.App.m25618a(r14)
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.seattleclouds.gcm.AnnouncementActivity> r9 = com.seattleclouds.gcm.AnnouncementActivity.class
            r8.<init>(r14, r9)
            android.net.Uri$Builder r9 = new android.net.Uri$Builder
            r9.<init>()
            java.lang.String r10 = "data"
            android.net.Uri$Builder r9 = r9.scheme(r10)
            java.lang.String r10 = "id"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = ""
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r10, r11)
            android.net.Uri r9 = r9.build()
            r8.setData(r9)
            java.lang.String r9 = "ARG_STARTED_FROM_NOTIFICATION"
            r10 = 1
            r8.putExtra(r9, r10)
            boolean r9 = com.seattleclouds.util.C6592al.m31910c(r2)
            if (r9 != 0) goto L_0x00ad
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.seattleclouds.PageStarterActivity> r9 = com.seattleclouds.PageStarterActivity.class
            r8.<init>(r14, r9)
            java.lang.String r9 = "ARG_PAGE_ID"
            r8.putExtra(r9, r2)
            java.lang.String r9 = "ARG_PAGE_ID_LOCAL"
            r8.putExtra(r9, r10)
        L_0x00a7:
            java.lang.String r9 = "ARG_PAGE_NOTIFICATION_ID"
            r8.putExtra(r9, r6)
            goto L_0x00c5
        L_0x00ad:
            boolean r9 = com.seattleclouds.util.C6592al.m31910c(r3)
            if (r9 != 0) goto L_0x00c5
            android.content.Intent r8 = new android.content.Intent
            java.lang.Class<com.seattleclouds.PageStarterActivity> r9 = com.seattleclouds.PageStarterActivity.class
            r8.<init>(r14, r9)
            java.lang.String r9 = "ARG_PAGE_ID"
            r8.putExtra(r9, r3)
            java.lang.String r9 = "ARG_PAGE_ID_LOCAL"
            r8.putExtra(r9, r7)
            goto L_0x00a7
        L_0x00c5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = r14.getPackageName()
            r9.append(r11)
            java.lang.String r11 = "."
            r9.append(r11)
            java.util.UUID r11 = java.util.UUID.randomUUID()
            java.lang.String r11 = r11.toString()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.setAction(r9)
            android.content.Intent r9 = com.seattleclouds.AppStarterActivity.m25685a(r14)
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            r9.addFlags(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r14.getPackageName()
            r11.append(r12)
            java.lang.String r12 = "."
            r11.append(r12)
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r9.setAction(r11)
            android.content.Intent r11 = new android.content.Intent
            java.lang.Class<com.seattleclouds.AppStarterActivity> r12 = com.seattleclouds.AppStarterActivity.class
            r11.<init>(r14, r12)
            java.lang.String r12 = "startMainActivity"
            r11.putExtra(r12, r7)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = r14.getPackageName()
            r12.append(r13)
            java.lang.String r13 = "."
            r12.append(r13)
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.setAction(r12)
            android.support.v4.app.af r12 = android.support.p009v4.app.C0355af.m1481a(r14)
            android.support.v4.app.af r9 = r12.mo1398a(r9)
            android.support.v4.app.af r8 = r9.mo1398a(r8)
            android.support.v4.app.af r8 = r8.mo1398a(r11)
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            android.app.PendingIntent r8 = r8.mo1394a(r7, r9)
            int r9 = com.seattleclouds.C5451m.C5457f.ic_notif_custom_small
            android.support.v4.app.y$d r11 = new android.support.v4.app.y$d
            java.lang.String r12 = "general"
            r11.<init>(r14, r12)
            android.support.v4.app.y$d r9 = r11.mo1713a(r9)
            android.support.v4.app.y$d r5 = r9.mo1723a(r5)
            android.support.v4.app.y$d r5 = r5.mo1729b(r15)
            android.support.v4.app.y$c r9 = new android.support.v4.app.y$c
            r9.<init>()
            android.support.v4.app.y$c r9 = r9.mo1711a(r15)
            android.support.v4.app.y$d r5 = r5.mo1721a(r9)
            android.support.v4.app.y$d r5 = r5.mo1730b(r10)
            r9 = -1
            android.support.v4.app.y$d r5 = r5.mo1726b(r9)
            android.support.v4.app.y$d r5 = r5.mo1717a(r8)
            boolean r2 = com.seattleclouds.util.C6592al.m31910c(r2)
            if (r2 == 0) goto L_0x0197
            boolean r2 = com.seattleclouds.util.C6592al.m31910c(r3)
            if (r2 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r2 = 0
            goto L_0x0198
        L_0x0197:
            r2 = 1
        L_0x0198:
            boolean r3 = com.seattleclouds.util.C6592al.m31910c(r4)
            r9 = 22
            r11 = 23
            r12 = 15
            if (r3 != 0) goto L_0x01c7
            if (r2 == 0) goto L_0x01c7
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r12) goto L_0x01b4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 >= r11) goto L_0x01b4
            int r2 = com.seattleclouds.C5451m.C5457f.ic_notif_default_action
            r5.mo1715a(r2, r4, r8)
            goto L_0x01fd
        L_0x01b4:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r9) goto L_0x01fd
            android.support.v4.app.y$a$a r2 = new android.support.v4.app.y$a$a
            int r3 = com.seattleclouds.C5451m.C5457f.ic_notif_default_action
            r2.<init>(r3, r4, r8)
        L_0x01bf:
            android.support.v4.app.y$a r2 = r2.mo1707a()
            r5.mo1720a(r2)
            goto L_0x01fd
        L_0x01c7:
            boolean r3 = com.seattleclouds.util.C6592al.m31910c(r4)
            if (r3 == 0) goto L_0x01fd
            if (r2 == 0) goto L_0x01fd
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r12) goto L_0x01e7
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 >= r11) goto L_0x01e7
            int r2 = com.seattleclouds.C5451m.C5457f.ic_notif_default_action
            android.content.res.Resources r3 = r14.getResources()
            int r4 = com.seattleclouds.C5451m.C5462k.notif_action_button_open
            java.lang.String r3 = r3.getString(r4)
            r5.mo1715a(r2, r3, r8)
            goto L_0x01fd
        L_0x01e7:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 <= r9) goto L_0x01fd
            android.support.v4.app.y$a$a r2 = new android.support.v4.app.y$a$a
            int r3 = com.seattleclouds.C5451m.C5457f.ic_notif_default_action
            android.content.res.Resources r4 = r14.getResources()
            int r9 = com.seattleclouds.C5451m.C5462k.notif_action_button_open
            java.lang.String r4 = r4.getString(r9)
            r2.<init>(r3, r4, r8)
            goto L_0x01bf
        L_0x01fd:
            android.content.res.Resources r2 = r14.getResources()
            java.lang.String r3 = "drawable/ic_notif_custom_large"
            r4 = 0
            java.lang.String r8 = r14.getPackageName()
            int r3 = r2.getIdentifier(r3, r4, r8)
            if (r3 == 0) goto L_0x0215
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r2, r3)
            r5.mo1718a(r2)
        L_0x0215:
            boolean r2 = com.seattleclouds.util.C6592al.m31910c(r0)
            if (r2 != 0) goto L_0x0238
            java.io.InputStream r2 = com.seattleclouds.App.m25649e(r0)
            if (r2 == 0) goto L_0x0237
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)
            if (r2 == 0) goto L_0x0238
            android.support.v4.app.y$b r3 = new android.support.v4.app.y$b
            r3.<init>()
            android.support.v4.app.y$b r2 = r3.mo1708a(r2)
            r2.mo1709a(r15)
            r5.mo1721a(r2)
            goto L_0x0238
        L_0x0237:
            r7 = 1
        L_0x0238:
            if (r7 == 0) goto L_0x0265
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "http://"
            r1.append(r2)
            java.lang.String r2 = com.seattleclouds.App.f18516r
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = com.seattleclouds.App.m25673q()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m32102a(r14, r5, r6, r15, r0)
            goto L_0x0272
        L_0x0265:
            boolean r0 = com.seattleclouds.util.C6592al.m31910c(r1)
            if (r0 != 0) goto L_0x026f
            m32102a(r14, r5, r6, r15, r1)
            goto L_0x0272
        L_0x026f:
            m32103a(r5, r6)
        L_0x0272:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6645y.m32107b(android.content.Context, android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m32108b(C0424d dVar, Bitmap bitmap, int i, String str) {
        C0425e eVar;
        if (bitmap == null) {
            eVar = new C0423c().mo1711a((CharSequence) str);
        } else {
            C0422b a = new C0422b().mo1708a(bitmap);
            a.mo1709a((CharSequence) str);
            eVar = a;
        }
        dVar.mo1721a(eVar);
        m32103a(dVar, i);
    }

    /* renamed from: b */
    public static boolean m32109b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
