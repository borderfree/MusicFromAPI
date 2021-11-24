package com.google.android.vending.expansion.downloader.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Messenger;
import android.support.p009v4.app.C0419y.C0424d;
import com.google.android.vending.expansion.downloader.C4822b;
import com.google.android.vending.expansion.downloader.C4832e;
import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import com.seattleclouds.util.C6645y;

/* renamed from: com.google.android.vending.expansion.downloader.impl.e */
public class C4850e implements C4832e {

    /* renamed from: b */
    static final int f17471b = "DownloadNotification".hashCode();

    /* renamed from: a */
    final C4851a f17472a;

    /* renamed from: c */
    private int f17473c = -1;

    /* renamed from: d */
    private final Context f17474d;

    /* renamed from: e */
    private final NotificationManager f17475e;

    /* renamed from: f */
    private String f17476f;

    /* renamed from: g */
    private C4832e f17477g;

    /* renamed from: h */
    private C0424d f17478h;

    /* renamed from: i */
    private Notification f17479i;

    /* renamed from: j */
    private CharSequence f17480j;

    /* renamed from: k */
    private String f17481k;

    /* renamed from: l */
    private PendingIntent f17482l;

    /* renamed from: m */
    private DownloadProgressInfo f17483m;

    /* renamed from: com.google.android.vending.expansion.downloader.impl.e$a */
    public interface C4851a {
        /* renamed from: a */
        Notification mo16023a(Context context);

        /* renamed from: a */
        void mo16024a(int i);

        /* renamed from: a */
        void mo16025a(long j);

        /* renamed from: a */
        void mo16026a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo16027a(CharSequence charSequence);

        /* renamed from: b */
        void mo16028b(long j);

        /* renamed from: b */
        void mo16029b(CharSequence charSequence);

        /* renamed from: c */
        void mo16030c(long j);
    }

    C4850e(Context context, CharSequence charSequence) {
        this.f17474d = context;
        this.f17480j = charSequence;
        this.f17475e = (NotificationManager) this.f17474d.getSystemService("notification");
        this.f17472a = C4848c.m24258a();
        this.f17478h = new C0424d(this.f17474d, "download");
        C6645y.m32100a(this.f17475e, "download");
        this.f17479i = this.f17478h.mo1712a();
    }

    /* renamed from: a */
    public void mo16020a() {
        if (this.f17477g != null) {
            this.f17477g.mo15959a(this.f17473c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r6 = com.google.android.vending.expansion.downloader.C4831d.m24149a(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15959a(int r6) {
        /*
            r5 = this;
            com.google.android.vending.expansion.downloader.e r0 = r5.f17477g
            if (r0 == 0) goto L_0x0009
            com.google.android.vending.expansion.downloader.e r0 = r5.f17477g
            r0.mo15959a(r6)
        L_0x0009:
            int r0 = r5.f17473c
            if (r6 == r0) goto L_0x00bc
            r5.f17473c = r6
            r0 = 1
            if (r6 == r0) goto L_0x00bc
            android.app.PendingIntent r1 = r5.f17482l
            if (r1 != 0) goto L_0x0018
            goto L_0x00bc
        L_0x0018:
            r1 = 17301634(0x1080082, float:2.497962E-38)
            r2 = 0
            r3 = 17301642(0x108008a, float:2.4979642E-38)
            if (r6 == 0) goto L_0x0045
            r4 = 7
            if (r6 == r4) goto L_0x003f
            switch(r6) {
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x003f;
                default: goto L_0x0027;
            }
        L_0x0027:
            switch(r6) {
                case 15: goto L_0x0032;
                case 16: goto L_0x0032;
                case 17: goto L_0x0032;
                case 18: goto L_0x0032;
                case 19: goto L_0x0032;
                default: goto L_0x002a;
            }
        L_0x002a:
            int r6 = com.google.android.vending.expansion.downloader.C4831d.m24149a(r6)
        L_0x002e:
            r1 = 17301642(0x108008a, float:2.4979642E-38)
            goto L_0x0049
        L_0x0032:
            int r6 = com.google.android.vending.expansion.downloader.C4831d.m24149a(r6)
            goto L_0x0047
        L_0x0037:
            r1 = 17301633(0x1080081, float:2.4979616E-38)
        L_0x003a:
            int r6 = com.google.android.vending.expansion.downloader.C4831d.m24149a(r6)
            goto L_0x0049
        L_0x003f:
            int r6 = com.google.android.vending.expansion.downloader.C4831d.m24149a(r6)
            r0 = 0
            goto L_0x0049
        L_0x0045:
            int r6 = com.seattleclouds.C5451m.C5462k.state_unknown
        L_0x0047:
            r0 = 0
            goto L_0x002e
        L_0x0049:
            android.content.Context r2 = r5.f17474d
            java.lang.String r6 = r2.getString(r6)
            r5.f17481k = r6
            java.lang.CharSequence r6 = r5.f17480j
            java.lang.String r6 = r6.toString()
            r5.f17476f = r6
            android.support.v4.app.y$d r6 = r5.f17478h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.CharSequence r3 = r5.f17480j
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            java.lang.String r3 = r5.f17481k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r6.mo1735d(r2)
            android.support.v4.app.y$d r6 = r5.f17478h
            r6.mo1713a(r1)
            android.support.v4.app.y$d r6 = r5.f17478h
            java.lang.String r1 = r5.f17476f
            r6.mo1723a(r1)
            android.support.v4.app.y$d r6 = r5.f17478h
            java.lang.String r1 = r5.f17481k
            r6.mo1729b(r1)
            android.support.v4.app.y$d r6 = r5.f17478h
            android.app.PendingIntent r1 = r5.f17482l
            r6.mo1717a(r1)
            android.support.v4.app.y$d r6 = r5.f17478h
            android.app.Notification r6 = r6.mo1712a()
            r5.f17479i = r6
            if (r0 == 0) goto L_0x00a3
            android.app.Notification r6 = r5.f17479i
            int r0 = r6.flags
            r0 = r0 | 2
        L_0x00a0:
            r6.flags = r0
            goto L_0x00b2
        L_0x00a3:
            android.app.Notification r6 = r5.f17479i
            int r0 = r6.flags
            r0 = r0 & -3
            r6.flags = r0
            android.app.Notification r6 = r5.f17479i
            int r0 = r6.flags
            r0 = r0 | 16
            goto L_0x00a0
        L_0x00b2:
            android.app.NotificationManager r6 = r5.f17475e
            int r0 = f17471b
            android.app.Notification r1 = r5.f17479i
            r6.notify(r0, r1)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.C4850e.mo15959a(int):void");
    }

    /* renamed from: a */
    public void mo16021a(PendingIntent pendingIntent) {
        this.f17482l = pendingIntent;
    }

    /* renamed from: a */
    public void mo15960a(Messenger messenger) {
    }

    /* renamed from: a */
    public void mo15961a(DownloadProgressInfo downloadProgressInfo) {
        Notification a;
        this.f17483m = downloadProgressInfo;
        if (this.f17477g != null) {
            this.f17477g.mo15961a(downloadProgressInfo);
        }
        if (downloadProgressInfo.f17367a <= 0) {
            this.f17478h.mo1735d((CharSequence) this.f17476f);
            this.f17478h.mo1713a(17301633);
            this.f17478h.mo1723a(this.f17480j);
            this.f17478h.mo1729b((CharSequence) this.f17481k);
            this.f17478h.mo1717a(this.f17482l);
            a = this.f17478h.mo1712a();
        } else {
            this.f17472a.mo16028b(downloadProgressInfo.f17368b);
            this.f17472a.mo16025a(downloadProgressInfo.f17367a);
            this.f17472a.mo16024a(17301633);
            this.f17472a.mo16026a(this.f17482l);
            C4851a aVar = this.f17472a;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f17480j);
            sb.append(": ");
            sb.append(this.f17481k);
            aVar.mo16029b((CharSequence) sb.toString());
            this.f17472a.mo16027a(this.f17480j);
            this.f17472a.mo16030c(downloadProgressInfo.f17369c);
            a = this.f17472a.mo16023a(this.f17474d);
        }
        this.f17479i = a;
        this.f17475e.notify(f17471b, this.f17479i);
    }

    /* renamed from: b */
    public void mo16022b(Messenger messenger) {
        this.f17477g = C4822b.m24123a(messenger);
        if (this.f17483m != null) {
            this.f17477g.mo15961a(this.f17483m);
        }
        if (this.f17473c != -1) {
            this.f17477g.mo15959a(this.f17473c);
        }
    }
}
