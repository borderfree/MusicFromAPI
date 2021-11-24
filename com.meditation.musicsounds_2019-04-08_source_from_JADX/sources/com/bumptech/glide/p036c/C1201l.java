package com.bumptech.glide.p036c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.C1231g;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.c.l */
public class C1201l implements Callback {

    /* renamed from: i */
    private static final C1203a f4348i = new C1203a() {
        /* renamed from: a */
        public C1231g mo5783a(C1186c cVar, C1196h hVar, C1204m mVar, Context context) {
            return new C1231g(cVar, hVar, mVar, context);
        }
    };

    /* renamed from: a */
    final Map<FragmentManager, C1199k> f4349a = new HashMap();

    /* renamed from: b */
    final Map<C0374l, C1206o> f4350b = new HashMap();

    /* renamed from: c */
    private volatile C1231g f4351c;

    /* renamed from: d */
    private final Handler f4352d;

    /* renamed from: e */
    private final C1203a f4353e;

    /* renamed from: f */
    private final C0488a<View, Fragment> f4354f = new C0488a<>();

    /* renamed from: g */
    private final C0488a<View, android.app.Fragment> f4355g = new C0488a<>();

    /* renamed from: h */
    private final Bundle f4356h = new Bundle();

    /* renamed from: com.bumptech.glide.c.l$a */
    public interface C1203a {
        /* renamed from: a */
        C1231g mo5783a(C1186c cVar, C1196h hVar, C1204m mVar, Context context);
    }

    public C1201l(C1203a aVar) {
        if (aVar == null) {
            aVar = f4348i;
        }
        this.f4353e = aVar;
        this.f4352d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    /* renamed from: a */
    private android.app.Fragment m6506a(View view, Activity activity) {
        this.f4355g.clear();
        m6512a(activity.getFragmentManager(), this.f4355g);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (android.app.Fragment) this.f4355g.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f4355g.clear();
        return fragment;
    }

    /* renamed from: a */
    private Fragment m6507a(View view, C0367h hVar) {
        this.f4354f.clear();
        m6513a((Collection<Fragment>) hVar.mo1469g().mo1543e(), (Map<View, Fragment>) this.f4354f);
        View findViewById = hVar.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById)) {
            fragment = (Fragment) this.f4354f.get(view);
            if (fragment != null || !(view.getParent() instanceof View)) {
                break;
            }
            view = (View) view.getParent();
        }
        this.f4354f.clear();
        return fragment;
    }

    /* renamed from: a */
    private C1199k m6508a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C1199k kVar = (C1199k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null) {
            kVar = (C1199k) this.f4349a.get(fragmentManager);
            if (kVar == null) {
                kVar = new C1199k();
                kVar.mo5763a(fragment);
                if (z) {
                    kVar.mo5762a().mo5750a();
                }
                this.f4349a.put(fragmentManager, kVar);
                fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f4352d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return kVar;
    }

    /* renamed from: a */
    private C1206o m6509a(C0374l lVar, Fragment fragment, boolean z) {
        C1206o oVar = (C1206o) lVar.mo1535a("com.bumptech.glide.manager");
        if (oVar == null) {
            oVar = (C1206o) this.f4350b.get(lVar);
            if (oVar == null) {
                oVar = new C1206o();
                oVar.mo5792c(fragment);
                if (z) {
                    oVar.mo1450b().mo5750a();
                }
                this.f4350b.put(lVar, oVar);
                lVar.mo1536a().mo1413a((Fragment) oVar, "com.bumptech.glide.manager").mo1431d();
                this.f4352d.obtainMessage(2, lVar).sendToTarget();
            }
        }
        return oVar;
    }

    @Deprecated
    /* renamed from: a */
    private C1231g m6510a(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        C1199k a = m6508a(fragmentManager, fragment, z);
        C1231g b = a.mo5765b();
        if (b != null) {
            return b;
        }
        C1231g a2 = this.f4353e.mo5783a(C1186c.m6450a(context), a.mo5762a(), a.mo5766c(), context);
        a.mo5764a(a2);
        return a2;
    }

    /* renamed from: a */
    private C1231g m6511a(Context context, C0374l lVar, Fragment fragment, boolean z) {
        C1206o a = m6509a(lVar, fragment, z);
        C1231g c = a.mo1453c();
        if (c != null) {
            return c;
        }
        C1231g a2 = this.f4353e.mo5783a(C1186c.m6450a(context), a.mo1450b(), a.mo5793d(), context);
        a.mo5791a(a2);
        return a2;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: a */
    private void m6512a(FragmentManager fragmentManager, C0488a<View, android.app.Fragment> aVar) {
        if (VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    m6512a(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        m6515b(fragmentManager, aVar);
    }

    /* renamed from: a */
    private static void m6513a(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment fragment : collection) {
                if (!(fragment == null || fragment.mo1199I() == null)) {
                    map.put(fragment.mo1199I(), fragment);
                    m6513a((Collection<Fragment>) fragment.mo1323v().mo1543e(), map);
                }
            }
        }
    }

    /* renamed from: b */
    private C1231g m6514b(Context context) {
        if (this.f4351c == null) {
            synchronized (this) {
                if (this.f4351c == null) {
                    this.f4351c = this.f4353e.mo5783a(C1186c.m6450a(context.getApplicationContext()), new C1188b(), new C1195g(), context.getApplicationContext());
                }
            }
        }
        return this.f4351c;
    }

    @Deprecated
    /* renamed from: b */
    private void m6515b(FragmentManager fragmentManager, C0488a<View, android.app.Fragment> aVar) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f4356h.putInt("key", i);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f4356h, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    if (VERSION.SDK_INT >= 17) {
                        m6512a(fragment.getChildFragmentManager(), aVar);
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private Activity m6516c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6516c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m6517c(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: d */
    private static boolean m6518d(Activity activity) {
        return !activity.isFinishing();
    }

    /* renamed from: a */
    public C1231g mo5774a(Activity activity) {
        if (C1258j.m6715d()) {
            return mo5776a(activity.getApplicationContext());
        }
        m6517c(activity);
        return m6510a((Context) activity, activity.getFragmentManager(), (android.app.Fragment) null, m6518d(activity));
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: a */
    public C1231g mo5775a(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C1258j.m6715d() || VERSION.SDK_INT < 17) {
            return mo5776a(fragment.getActivity().getApplicationContext());
        } else {
            return m6510a((Context) fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: a */
    public C1231g mo5776a(Context context) {
        if (context != null) {
            if (C1258j.m6714c() && !(context instanceof Application)) {
                if (context instanceof C0367h) {
                    return mo5778a((C0367h) context);
                }
                if (context instanceof Activity) {
                    return mo5774a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo5776a(((ContextWrapper) context).getBaseContext());
                }
            }
            return m6514b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public C1231g mo5777a(Fragment fragment) {
        C1257i.m6692a(fragment.mo1318s(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C1258j.m6715d()) {
            return mo5776a(fragment.mo1318s().getApplicationContext());
        }
        return m6511a((Context) fragment.mo1318s(), fragment.mo1323v(), fragment, fragment.mo1193C());
    }

    /* renamed from: a */
    public C1231g mo5778a(C0367h hVar) {
        if (C1258j.m6715d()) {
            return mo5776a(hVar.getApplicationContext());
        }
        m6517c((Activity) hVar);
        return m6511a((Context) hVar, hVar.mo1469g(), (Fragment) null, m6518d(hVar));
    }

    /* renamed from: a */
    public C1231g mo5779a(View view) {
        if (!C1258j.m6715d()) {
            C1257i.m6691a(view);
            C1257i.m6692a(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity c = m6516c(view.getContext());
            if (c != null) {
                if (c instanceof C0367h) {
                    Fragment a = m6507a(view, (C0367h) c);
                    return a != null ? mo5777a(a) : mo5774a(c);
                }
                android.app.Fragment a2 = m6506a(view, c);
                return a2 == null ? mo5774a(c) : mo5775a(a2);
            }
        }
        return mo5776a(view.getContext().getApplicationContext());
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: b */
    public C1199k mo5780b(Activity activity) {
        return m6508a(activity.getFragmentManager(), (android.app.Fragment) null, m6518d(activity));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1206o mo5781b(C0367h hVar) {
        return m6509a(hVar.mo1469g(), (Fragment) null, m6518d(hVar));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2 = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj2 = (FragmentManager) message.obj;
                map = this.f4349a;
                break;
            case 2:
                obj2 = (C0374l) message.obj;
                map = this.f4350b;
                break;
            default:
                z = false;
                obj = null;
                break;
        }
        obj = map.remove(obj2);
        if (z && obj == null && Log.isLoggable("RMRetriever", 5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(obj2);
            Log.w("RMRetriever", sb.toString());
        }
        return z;
    }
}
