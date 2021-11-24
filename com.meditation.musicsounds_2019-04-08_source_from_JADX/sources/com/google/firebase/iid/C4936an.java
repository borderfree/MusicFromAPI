package com.google.firebase.iid;

import com.google.android.gms.tasks.C4797g;

/* renamed from: com.google.firebase.iid.an */
final /* synthetic */ class C4936an implements Runnable {

    /* renamed from: a */
    private final FirebaseInstanceId f17720a;

    /* renamed from: b */
    private final String f17721b;

    /* renamed from: c */
    private final String f17722c;

    /* renamed from: d */
    private final C4797g f17723d;

    /* renamed from: e */
    private final String f17724e;

    C4936an(FirebaseInstanceId firebaseInstanceId, String str, String str2, C4797g gVar, String str3) {
        this.f17720a = firebaseInstanceId;
        this.f17721b = str;
        this.f17722c = str2;
        this.f17723d = gVar;
        this.f17724e = str3;
    }

    public final void run() {
        this.f17720a.mo16155a(this.f17721b, this.f17722c, this.f17723d, this.f17724e);
    }
}
