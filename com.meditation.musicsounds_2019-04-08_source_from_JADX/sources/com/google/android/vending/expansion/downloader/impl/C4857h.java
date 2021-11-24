package com.google.android.vending.expansion.downloader.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import com.google.android.vending.expansion.downloader.C4831d;
import com.google.android.vending.expansion.downloader.impl.C4850e.C4851a;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.google.android.vending.expansion.downloader.impl.h */
public class C4857h implements C4851a {

    /* renamed from: a */
    CharSequence f17505a;

    /* renamed from: b */
    CharSequence f17506b;

    /* renamed from: c */
    int f17507c;

    /* renamed from: d */
    long f17508d = -1;

    /* renamed from: e */
    long f17509e = -1;

    /* renamed from: f */
    long f17510f;

    /* renamed from: g */
    PendingIntent f17511g;

    /* renamed from: h */
    Notification f17512h = new Notification();

    /* renamed from: a */
    public Notification mo16023a(Context context) {
        Notification notification = this.f17512h;
        notification.icon = this.f17507c;
        notification.flags |= 2;
        if (VERSION.SDK_INT > 10) {
            notification.flags |= 8;
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C5460i.status_bar_ongoing_event_progress_bar);
        remoteViews.setTextViewText(C5458g.title, this.f17505a);
        remoteViews.setViewVisibility(C5458g.description, 0);
        remoteViews.setTextViewText(C5458g.description, C4831d.m24153a(this.f17509e, this.f17508d));
        remoteViews.setViewVisibility(C5458g.progress_bar_frame, 0);
        remoteViews.setProgressBar(C5458g.progress_bar, (int) (this.f17508d >> 8), (int) (this.f17509e >> 8), this.f17508d <= 0);
        remoteViews.setViewVisibility(C5458g.time_remaining, 0);
        remoteViews.setTextViewText(C5458g.time_remaining, context.getString(C5462k.time_remaining_notification, new Object[]{C4831d.m24152a(this.f17510f)}));
        remoteViews.setTextViewText(C5458g.progress_text, C4831d.m24158b(this.f17509e, this.f17508d));
        remoteViews.setImageViewResource(C5458g.appIcon, this.f17507c);
        notification.contentView = remoteViews;
        notification.contentIntent = this.f17511g;
        return notification;
    }

    /* renamed from: a */
    public void mo16024a(int i) {
        this.f17507c = i;
    }

    /* renamed from: a */
    public void mo16025a(long j) {
        this.f17508d = j;
    }

    /* renamed from: a */
    public void mo16026a(PendingIntent pendingIntent) {
        this.f17511g = pendingIntent;
    }

    /* renamed from: a */
    public void mo16027a(CharSequence charSequence) {
        this.f17505a = charSequence;
    }

    /* renamed from: b */
    public void mo16028b(long j) {
        this.f17509e = j;
    }

    /* renamed from: b */
    public void mo16029b(CharSequence charSequence) {
        this.f17506b = charSequence;
    }

    /* renamed from: c */
    public void mo16030c(long j) {
        this.f17510f = j;
    }
}
