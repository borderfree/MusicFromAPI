package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import java.util.Map;

@C3464ci
public final class bar extends bat {

    /* renamed from: b */
    private static final bcv f13515b = new bcv();

    /* renamed from: a */
    private Map<Class<? extends NetworkExtras>, NetworkExtras> f13516a;

    /* renamed from: d */
    private final <NetworkExtrasT extends com.google.ads.mediation.NetworkExtras, ServerParametersT extends MediationServerParameters> bav m17798d(String str) {
        try {
            Class cls = Class.forName(str, false, bar.class.getClassLoader());
            if (MediationAdapter.class.isAssignableFrom(cls)) {
                MediationAdapter mediationAdapter = (MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return new bbv(mediationAdapter, (com.google.ads.mediation.NetworkExtras) this.f13516a.get(mediationAdapter.getAdditionalParametersType()));
            } else if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                return new bbq((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                C3731me.m19178e(sb.toString());
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            return m17799e(str);
        }
    }

    /* renamed from: e */
    private final bav m17799e(String str) {
        try {
            C3731me.m19172b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new bbq(new AdMobAdapter());
            }
            if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                return new bbq(new AdUrlAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new bbq(new CustomEventAdapter());
            }
            if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                com.google.ads.mediation.customevent.CustomEventAdapter customEventAdapter = new com.google.ads.mediation.customevent.CustomEventAdapter();
                return new bbv(customEventAdapter, (CustomEventExtras) this.f13516a.get(customEventAdapter.getAdditionalParametersType()));
            }
            throw new RemoteException();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43);
            sb.append("Could not instantiate mediation adapter: ");
            sb.append(str);
            sb.append(". ");
            C3731me.m19175c(sb.toString(), th);
        }
    }

    /* renamed from: a */
    public final bav mo12681a(String str) {
        return m17798d(str);
    }

    /* renamed from: a */
    public final void mo12682a(Map<Class<? extends NetworkExtras>, NetworkExtras> map) {
        this.f13516a = map;
    }

    /* renamed from: b */
    public final boolean mo12683b(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, bar.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", assuming old implementation.");
            C3731me.m19178e(sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    public final bcq mo12684c(String str) {
        return bcv.m18177a(str);
    }
}
