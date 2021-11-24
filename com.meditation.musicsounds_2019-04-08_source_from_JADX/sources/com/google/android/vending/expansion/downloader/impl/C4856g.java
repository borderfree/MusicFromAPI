package com.google.android.vending.expansion.downloader.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.vending.expansion.downloader.C4831d;
import com.google.android.vending.expansion.downloader.impl.C4850e.C4851a;
import com.seattleclouds.C5451m.C5462k;

@TargetApi(11)
/* renamed from: com.google.android.vending.expansion.downloader.impl.g */
public class C4856g implements C4851a {

    /* renamed from: a */
    CharSequence f17498a;

    /* renamed from: b */
    CharSequence f17499b;

    /* renamed from: c */
    int f17500c;

    /* renamed from: d */
    long f17501d = -1;

    /* renamed from: e */
    long f17502e = -1;

    /* renamed from: f */
    long f17503f;

    /* renamed from: g */
    PendingIntent f17504g;

    /* renamed from: a */
    public Notification mo16023a(Context context) {
        Builder builder = new Builder(context);
        builder.setContentTitle(this.f17498a);
        if (this.f17501d <= 0 || -1 == this.f17502e) {
            builder.setProgress(0, 0, true);
        } else {
            builder.setProgress((int) (this.f17501d >> 8), (int) (this.f17502e >> 8), false);
        }
        builder.setContentText(C4831d.m24153a(this.f17502e, this.f17501d));
        builder.setContentInfo(context.getString(C5462k.time_remaining_notification, new Object[]{C4831d.m24152a(this.f17503f)}));
        builder.setSmallIcon(this.f17500c != 0 ? this.f17500c : 17301633);
        builder.setOngoing(true);
        builder.setTicker(this.f17499b);
        builder.setContentIntent(this.f17504g);
        builder.setOnlyAlertOnce(true);
        return builder.getNotification();
    }

    /* renamed from: a */
    public void mo16024a(int i) {
        this.f17500c = i;
    }

    /* renamed from: a */
    public void mo16025a(long j) {
        this.f17501d = j;
    }

    /* renamed from: a */
    public void mo16026a(PendingIntent pendingIntent) {
        this.f17504g = pendingIntent;
    }

    /* renamed from: a */
    public void mo16027a(CharSequence charSequence) {
        this.f17498a = charSequence;
    }

    /* renamed from: b */
    public void mo16028b(long j) {
        this.f17502e = j;
    }

    /* renamed from: b */
    public void mo16029b(CharSequence charSequence) {
        this.f17499b = charSequence;
    }

    /* renamed from: c */
    public void mo16030c(long j) {
        this.f17503f = j;
    }
}
