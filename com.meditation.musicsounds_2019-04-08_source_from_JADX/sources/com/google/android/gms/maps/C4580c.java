package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.p132g.C4197h;
import com.google.android.gms.maps.model.C4604c;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4548ac;
import com.google.android.gms.maps.p133a.C4551af;
import com.google.android.gms.maps.p133a.C4553b;
import com.google.android.gms.maps.p133a.C4554c;
import com.google.android.gms.maps.p133a.C4561i;
import com.google.android.gms.maps.p133a.C4567o;
import com.google.android.gms.maps.p133a.C4569q;
import com.google.android.gms.maps.p133a.C4577y;

/* renamed from: com.google.android.gms.maps.c */
public final class C4580c {

    /* renamed from: a */
    private final C4553b f16573a;

    /* renamed from: b */
    private C4595i f16574b;

    /* renamed from: com.google.android.gms.maps.c$a */
    public interface C4581a {
        /* renamed from: a */
        void mo15117a();

        /* renamed from: b */
        void mo15118b();
    }

    /* renamed from: com.google.android.gms.maps.c$b */
    public interface C4582b {
        /* renamed from: a */
        View mo15119a(C4604c cVar);

        /* renamed from: b */
        View mo15120b(C4604c cVar);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$c */
    public interface C4583c {
        /* renamed from: a */
        void mo15121a(CameraPosition cameraPosition);
    }

    /* renamed from: com.google.android.gms.maps.c$d */
    public interface C4584d {
        /* renamed from: a */
        void mo15122a(C4604c cVar);
    }

    /* renamed from: com.google.android.gms.maps.c$e */
    public interface C4585e {
        /* renamed from: a */
        boolean mo15123a(C4604c cVar);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.maps.c$f */
    public interface C4586f {
        /* renamed from: a */
        void mo15124a(Location location);
    }

    /* renamed from: com.google.android.gms.maps.c$g */
    private static final class C4587g extends C4577y {

        /* renamed from: a */
        private final C4581a f16575a;

        C4587g(C4581a aVar) {
            this.f16575a = aVar;
        }

        /* renamed from: a */
        public final void mo15094a() {
            this.f16575a.mo15117a();
        }

        /* renamed from: b */
        public final void mo15095b() {
            this.f16575a.mo15118b();
        }
    }

    public C4580c(C4553b bVar) {
        this.f16573a = (C4553b) C3266s.m14913a(bVar);
    }

    /* renamed from: a */
    public final CameraPosition mo15096a() {
        try {
            return this.f16573a.mo15053a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final C4604c mo15097a(MarkerOptions markerOptions) {
        try {
            C4197h a = this.f16573a.mo15052a(markerOptions);
            if (a != null) {
                return new C4604c(a);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo15098a(int i) {
        try {
            this.f16573a.mo15054a(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo15099a(C4544a aVar) {
        try {
            this.f16573a.mo15055a(aVar.mo15042a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo15100a(C4544a aVar, C4581a aVar2) {
        try {
            this.f16573a.mo15056a(aVar.mo15042a(), aVar2 == null ? null : new C4587g(aVar2));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo15101a(C4582b bVar) {
        if (bVar == null) {
            try {
                this.f16573a.mo15057a((C4548ac) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15057a((C4548ac) new C4610n(this, bVar));
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo15102a(C4583c cVar) {
        if (cVar == null) {
            try {
                this.f16573a.mo15058a((C4551af) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15058a((C4551af) new C4614r(this, cVar));
        }
    }

    /* renamed from: a */
    public final void mo15103a(C4584d dVar) {
        if (dVar == null) {
            try {
                this.f16573a.mo15060a((C4561i) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15060a((C4561i) new C4599m(this, dVar));
        }
    }

    /* renamed from: a */
    public final void mo15104a(C4585e eVar) {
        if (eVar == null) {
            try {
                this.f16573a.mo15061a((C4567o) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15061a((C4567o) new C4598l(this, eVar));
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo15105a(C4586f fVar) {
        if (fVar == null) {
            try {
                this.f16573a.mo15062a((C4569q) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15062a((C4569q) new C4611o(this, fVar));
        }
    }

    /* renamed from: a */
    public final void mo15106a(C4588d dVar) {
        if (dVar == null) {
            try {
                this.f16573a.mo15059a((C4554c) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16573a.mo15059a((C4554c) new C4612p(this, dVar));
        }
    }

    /* renamed from: a */
    public final void mo15107a(boolean z) {
        try {
            this.f16573a.mo15063a(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final float mo15108b() {
        try {
            return this.f16573a.mo15064b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void mo15109b(C4544a aVar) {
        try {
            this.f16573a.mo15065b(aVar.mo15042a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final float mo15110c() {
        try {
            return this.f16573a.mo15066c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final void mo15111d() {
        try {
            this.f16573a.mo15067d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final int mo15112e() {
        try {
            return this.f16573a.mo15068e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final boolean mo15113f() {
        try {
            return this.f16573a.mo15069f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    /* renamed from: g */
    public final Location mo15114g() {
        try {
            return this.f16573a.mo15070g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public final C4595i mo15115h() {
        try {
            if (this.f16574b == null) {
                this.f16574b = new C4595i(this.f16573a.mo15071h());
            }
            return this.f16574b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final C4592g mo15116i() {
        try {
            return new C4592g(this.f16573a.mo15072i());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
