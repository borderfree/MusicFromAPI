package com.google.firebase.messaging;

import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* renamed from: com.google.firebase.messaging.a */
public class C4975a {

    /* renamed from: a */
    private static final Pattern f17813a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b */
    private static C4975a f17814b;

    /* renamed from: c */
    private final FirebaseInstanceId f17815c;

    private C4975a(FirebaseInstanceId firebaseInstanceId) {
        this.f17815c = firebaseInstanceId;
    }

    /* renamed from: a */
    public static synchronized C4975a m24698a() {
        C4975a aVar;
        synchronized (C4975a.class) {
            if (f17814b == null) {
                f17814b = new C4975a(FirebaseInstanceId.m24498a());
            }
            aVar = f17814b;
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo16272a(boolean z) {
        this.f17815c.mo16160b(z);
    }

    /* renamed from: b */
    public boolean mo16273b() {
        return this.f17815c.mo16171n();
    }
}
