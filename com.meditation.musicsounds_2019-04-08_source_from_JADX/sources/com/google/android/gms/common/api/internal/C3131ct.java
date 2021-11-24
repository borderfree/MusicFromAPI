package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.internal.p129d.C4170e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.ct */
public final class C3131ct extends Fragment implements C3141g {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<C3131ct>> f10835a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f10836b = new C0488a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10837c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f10838d;

    /* renamed from: a */
    public static C3131ct m14414a(Activity activity) {
        WeakReference weakReference = (WeakReference) f10835a.get(activity);
        if (weakReference != null) {
            C3131ct ctVar = (C3131ct) weakReference.get();
            if (ctVar != null) {
                return ctVar;
            }
        }
        try {
            C3131ct ctVar2 = (C3131ct) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (ctVar2 == null || ctVar2.isRemoving()) {
                ctVar2 = new C3131ct();
                activity.getFragmentManager().beginTransaction().add(ctVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f10835a.put(activity, new WeakReference(ctVar2));
            return ctVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo11009a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f10836b.get(str));
    }

    /* renamed from: a */
    public final void mo11010a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f10836b.containsKey(str)) {
            this.f10836b.put(str, lifecycleCallback);
            if (this.f10837c > 0) {
                new C4170e(Looper.getMainLooper()).post(new C3132cu(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f10836b.values()) {
            a.mo10887a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: j_ */
    public final Activity mo11012j_() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f10836b.values()) {
            a.mo10885a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10837c = 1;
        this.f10838d = bundle;
        for (Entry entry : this.f10836b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo10886a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f10837c = 5;
        for (LifecycleCallback e : this.f10836b.values()) {
            e.mo10892e();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f10837c = 3;
        for (LifecycleCallback c : this.f10836b.values()) {
            c.mo10890c();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f10836b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo10889b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f10837c = 2;
        for (LifecycleCallback b : this.f10836b.values()) {
            b.mo10888b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f10837c = 4;
        for (LifecycleCallback d : this.f10836b.values()) {
            d.mo10891d();
        }
    }
}
