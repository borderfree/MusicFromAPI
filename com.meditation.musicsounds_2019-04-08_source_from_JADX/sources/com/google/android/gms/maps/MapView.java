package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3321a;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamic.C3328e;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.p133a.C4556d;
import com.google.android.gms.maps.p133a.C4559g;
import com.google.android.gms.maps.p133a.C4565m;
import com.google.android.gms.maps.p133a.C4574v;
import com.google.android.gms.maps.p133a.C4575w;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {

    /* renamed from: a */
    private final C4543b f16559a;

    /* renamed from: com.google.android.gms.maps.MapView$a */
    static class C4542a implements C4559g {

        /* renamed from: a */
        private final ViewGroup f16560a;

        /* renamed from: b */
        private final C4556d f16561b;

        /* renamed from: c */
        private View f16562c;

        public C4542a(ViewGroup viewGroup, C4556d dVar) {
            this.f16561b = (C4556d) C3266s.m14913a(dVar);
            this.f16560a = (ViewGroup) C3266s.m14913a(viewGroup);
        }

        /* renamed from: a */
        public final void mo11343a() {
            try {
                this.f16561b.mo15075a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo11344a(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C4574v.m22769a(bundle, bundle2);
                this.f16561b.mo15076a(bundle2);
                C4574v.m22769a(bundle2, bundle);
                this.f16562c = (View) C3327d.m15137a(this.f16561b.mo15082e());
                this.f16560a.removeAllViews();
                this.f16560a.addView(this.f16562c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: a */
        public final void mo15040a(C4591f fVar) {
            try {
                this.f16561b.mo15077a((C4565m) new C4597k(this, fVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo11345b() {
            try {
                this.f16561b.mo15078b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: b */
        public final void mo11346b(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                C4574v.m22769a(bundle, bundle2);
                this.f16561b.mo15079b(bundle2);
                C4574v.m22769a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: c */
        public final void mo11347c() {
            try {
                this.f16561b.mo15080c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        /* renamed from: d */
        public final void mo11348d() {
            try {
                this.f16561b.mo15081d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.maps.MapView$b */
    static class C4543b extends C3321a<C4542a> {

        /* renamed from: a */
        private final ViewGroup f16563a;

        /* renamed from: b */
        private final Context f16564b;

        /* renamed from: c */
        private C3328e<C4542a> f16565c;

        /* renamed from: d */
        private final GoogleMapOptions f16566d;

        /* renamed from: e */
        private final List<C4591f> f16567e = new ArrayList();

        C4543b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.f16563a = viewGroup;
            this.f16564b = context;
            this.f16566d = googleMapOptions;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo11335a(C3328e<C4542a> eVar) {
            this.f16565c = eVar;
            if (this.f16565c != null && mo11333a() == null) {
                try {
                    C4590e.m22824a(this.f16564b);
                    C4556d a = C4575w.m22771a(this.f16564b).mo15049a(C3327d.m15136a(this.f16564b), this.f16566d);
                    if (a != null) {
                        this.f16565c.mo11349a(new C4542a(this.f16563a, a));
                        for (C4591f a2 : this.f16567e) {
                            ((C4542a) mo11333a()).mo15040a(a2);
                        }
                        this.f16567e.clear();
                    }
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo15041a(C4591f fVar) {
            if (mo11333a() != null) {
                ((C4542a) mo11333a()).mo15040a(fVar);
            } else {
                this.f16567e.add(fVar);
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.f16559a = new C4543b(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16559a = new C4543b(this, context, GoogleMapOptions.m22629a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16559a = new C4543b(this, context, GoogleMapOptions.m22629a(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f16559a = new C4543b(this, context, googleMapOptions);
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo15033a() {
        this.f16559a.mo11336b();
    }

    /* renamed from: a */
    public final void mo15034a(Bundle bundle) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitAll().build());
        try {
            this.f16559a.mo11334a(bundle);
            if (this.f16559a.mo11333a() == null) {
                C3321a.m15117a((FrameLayout) this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public void mo15035a(C4591f fVar) {
        C3266s.m14922b("getMapAsync() must be called on the main thread");
        this.f16559a.mo15041a(fVar);
    }

    /* renamed from: b */
    public final void mo15036b() {
        this.f16559a.mo11338c();
    }

    /* renamed from: b */
    public final void mo15037b(Bundle bundle) {
        this.f16559a.mo11337b(bundle);
    }

    /* renamed from: c */
    public final void mo15038c() {
        this.f16559a.mo11339d();
    }

    /* renamed from: d */
    public final void mo15039d() {
        this.f16559a.mo11340e();
    }
}
