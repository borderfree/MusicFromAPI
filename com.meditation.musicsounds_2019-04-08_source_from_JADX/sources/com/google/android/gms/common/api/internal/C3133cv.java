package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.p019g.C0488a;
import com.google.android.gms.internal.p129d.C4170e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cv */
public final class C3133cv extends Fragment implements C3141g {

    /* renamed from: a */
    private static WeakHashMap<C0367h, WeakReference<C3133cv>> f10842a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f10843b = new C0488a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10844c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f10845d;

    /* renamed from: a */
    public static C3133cv m14420a(C0367h hVar) {
        WeakReference weakReference = (WeakReference) f10842a.get(hVar);
        if (weakReference != null) {
            C3133cv cvVar = (C3133cv) weakReference.get();
            if (cvVar != null) {
                return cvVar;
            }
        }
        try {
            C3133cv cvVar2 = (C3133cv) hVar.mo1469g().mo1535a("SupportLifecycleFragmentImpl");
            if (cvVar2 == null || cvVar2.mo1191A()) {
                cvVar2 = new C3133cv();
                hVar.mo1469g().mo1536a().mo1413a((Fragment) cvVar2, "SupportLifecycleFragmentImpl").mo1431d();
            }
            f10842a.put(hVar, new WeakReference(cvVar2));
            return cvVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: J */
    public final void mo1200J() {
        super.mo1200J();
        this.f10844c = 3;
        for (LifecycleCallback c : this.f10843b.values()) {
            c.mo10890c();
        }
    }

    /* renamed from: L */
    public final void mo1202L() {
        super.mo1202L();
        this.f10844c = 5;
        for (LifecycleCallback e : this.f10843b.values()) {
            e.mo10892e();
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo11009a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f10843b.get(str));
    }

    /* renamed from: a */
    public final void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        for (LifecycleCallback a : this.f10843b.values()) {
            a.mo10885a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f10844c = 1;
        this.f10845d = bundle;
        for (Entry entry : this.f10843b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo10886a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* renamed from: a */
    public final void mo11010a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f10843b.containsKey(str)) {
            this.f10843b.put(str, lifecycleCallback);
            if (this.f10844c > 0) {
                new C4170e(Looper.getMainLooper()).post(new C3134cw(this, lifecycleCallback, str));
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

    /* renamed from: a */
    public final void mo1243a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1243a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f10843b.values()) {
            a.mo10887a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (bundle != null) {
            for (Entry entry : this.f10843b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo10889b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* renamed from: g */
    public final void mo1288g() {
        super.mo1288g();
        this.f10844c = 2;
        for (LifecycleCallback b : this.f10843b.values()) {
            b.mo10888b();
        }
    }

    /* renamed from: h */
    public final void mo1292h() {
        super.mo1292h();
        this.f10844c = 4;
        for (LifecycleCallback d : this.f10843b.values()) {
            d.mo10891d();
        }
    }

    /* renamed from: j_ */
    public final /* synthetic */ Activity mo11012j_() {
        return mo1318s();
    }
}
