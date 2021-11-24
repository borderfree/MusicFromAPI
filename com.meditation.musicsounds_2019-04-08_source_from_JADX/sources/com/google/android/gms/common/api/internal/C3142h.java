package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.p128c.C4164e;

/* renamed from: com.google.android.gms.common.api.internal.h */
public final class C3142h<L> {

    /* renamed from: a */
    private final C3145c f10894a;

    /* renamed from: b */
    private volatile L f10895b;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static final class C3143a<L> {

        /* renamed from: a */
        private final L f10896a;

        /* renamed from: b */
        private final String f10897b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3143a)) {
                return false;
            }
            C3143a aVar = (C3143a) obj;
            return this.f10896a == aVar.f10896a && this.f10897b.equals(aVar.f10897b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f10896a) * 31) + this.f10897b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.h$b */
    public interface C3144b<L> {
        /* renamed from: a */
        void mo11065a();

        /* renamed from: a */
        void mo11066a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.h$c */
    private final class C3145c extends C4164e {

        /* renamed from: a */
        private final /* synthetic */ C3142h f10898a;

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C3266s.m14923b(z);
            this.f10898a.mo11062b((C3144b) message.obj);
        }
    }

    /* renamed from: a */
    public final void mo11060a() {
        this.f10895b = null;
    }

    /* renamed from: a */
    public final void mo11061a(C3144b<? super L> bVar) {
        C3266s.m14914a(bVar, (Object) "Notifier must not be null");
        this.f10894a.sendMessage(this.f10894a.obtainMessage(1, bVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11062b(C3144b<? super L> bVar) {
        L l = this.f10895b;
        if (l == null) {
            bVar.mo11065a();
            return;
        }
        try {
            bVar.mo11066a(l);
        } catch (RuntimeException e) {
            bVar.mo11065a();
            throw e;
        }
    }
}
