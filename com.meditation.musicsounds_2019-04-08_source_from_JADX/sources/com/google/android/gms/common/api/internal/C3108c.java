package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C3020a;
import com.google.android.gms.common.api.C3020a.C3022b;
import com.google.android.gms.common.api.C3020a.C3023c;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.C3268t;

/* renamed from: com.google.android.gms.common.api.internal.c */
public class C3108c {

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public static abstract class C3109a<R extends C3049h, A extends C3022b> extends BasePendingResult<R> implements C3110b<R> {

        /* renamed from: b */
        private final C3023c<A> f10765b;

        /* renamed from: c */
        private final C3020a<?> f10766c;

        protected C3109a(C3020a<?> aVar, C3040d dVar) {
            super((C3040d) C3266s.m14914a(dVar, (Object) "GoogleApiClient must not be null"));
            C3266s.m14914a(aVar, (Object) "Api must not be null");
            this.f10765b = aVar.mo10806c();
            this.f10766c = aVar;
        }

        /* renamed from: a */
        private void m14286a(RemoteException remoteException) {
            mo10981b(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo10741a(A a);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10979a(R r) {
        }

        /* renamed from: a */
        public /* synthetic */ void mo10980a(Object obj) {
            super.mo10876b((C3049h) obj);
        }

        /* renamed from: b */
        public final void mo10981b(Status status) {
            C3266s.m14924b(!status.mo10795d(), "Failed result must not be success");
            C3049h a = mo10740a(status);
            mo10876b(a);
            mo10979a((R) a);
        }

        /* renamed from: b */
        public final void mo10982b(A a) {
            if (a instanceof C3268t) {
                a = ((C3268t) a).mo10737e();
            }
            try {
                mo10741a(a);
            } catch (DeadObjectException e) {
                m14286a((RemoteException) e);
                throw e;
            } catch (RemoteException e2) {
                m14286a(e2);
            }
        }

        /* renamed from: d */
        public final C3023c<A> mo10983d() {
            return this.f10765b;
        }

        /* renamed from: e */
        public final C3020a<?> mo10984e() {
            return this.f10766c;
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.c$b */
    public interface C3110b<R> {
        /* renamed from: a */
        void mo10980a(R r);
    }
}
