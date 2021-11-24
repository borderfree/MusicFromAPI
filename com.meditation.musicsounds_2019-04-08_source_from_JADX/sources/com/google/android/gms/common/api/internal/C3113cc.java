package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.common.internal.C3266s;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.cc */
public class C3113cc extends C3116ce {

    /* renamed from: e */
    private final SparseArray<C3114a> f10772e = new SparseArray<>();

    /* renamed from: com.google.android.gms.common.api.internal.cc$a */
    private class C3114a implements C3043c {

        /* renamed from: a */
        public final int f10773a;

        /* renamed from: b */
        public final C3040d f10774b;

        /* renamed from: c */
        public final C3043c f10775c;

        public C3114a(int i, C3040d dVar, C3043c cVar) {
            this.f10773a = i;
            this.f10774b = dVar;
            this.f10775c = cVar;
            dVar.mo10841a((C3043c) this);
        }

        /* renamed from: a */
        public final void mo10865a(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            C3113cc.this.mo10995b(connectionResult, this.f10773a);
        }
    }

    private C3113cc(C3141g gVar) {
        super(gVar);
        this.f10638a.mo11010a("AutoManageHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    private final C3114a m14304b(int i) {
        if (this.f10772e.size() <= i) {
            return null;
        }
        return (C3114a) this.f10772e.get(this.f10772e.keyAt(i));
    }

    /* renamed from: b */
    public static C3113cc m14305b(C3140f fVar) {
        C3141g a = m14100a(fVar);
        C3113cc ccVar = (C3113cc) a.mo11009a("AutoManageHelper", C3113cc.class);
        return ccVar != null ? ccVar : new C3113cc(a);
    }

    /* renamed from: a */
    public final void mo10988a(int i) {
        C3114a aVar = (C3114a) this.f10772e.get(i);
        this.f10772e.remove(i);
        if (aVar != null) {
            aVar.f10774b.mo10846b((C3043c) aVar);
            aVar.f10774b.mo10852g();
        }
    }

    /* renamed from: a */
    public final void mo10989a(int i, C3040d dVar, C3043c cVar) {
        C3266s.m14914a(dVar, (Object) "GoogleApiClient instance cannot be null");
        boolean z = this.f10772e.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C3266s.m14920a(z, (Object) sb.toString());
        C3117cf cfVar = (C3117cf) this.f10783c.get();
        boolean z2 = this.f10782b;
        String valueOf = String.valueOf(cfVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        this.f10772e.put(i, new C3114a(i, dVar, cVar));
        if (this.f10782b && cfVar == null) {
            String valueOf2 = String.valueOf(dVar);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            dVar.mo10850e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10990a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C3114a aVar = (C3114a) this.f10772e.get(i);
        if (aVar != null) {
            mo10988a(i);
            C3043c cVar = aVar.f10775c;
            if (cVar != null) {
                cVar.mo10865a(connectionResult);
            }
        }
    }

    /* renamed from: a */
    public void mo10887a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f10772e.size(); i++) {
            C3114a b = m14304b(i);
            if (b != null) {
                printWriter.append(str).append("GoogleApiClient #").print(b.f10773a);
                printWriter.println(":");
                b.f10774b.mo10843a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: b */
    public void mo10888b() {
        super.mo10888b();
        boolean z = this.f10782b;
        String valueOf = String.valueOf(this.f10772e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f10783c.get() == null) {
            for (int i = 0; i < this.f10772e.size(); i++) {
                C3114a b = m14304b(i);
                if (b != null) {
                    b.f10774b.mo10850e();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo10891d() {
        super.mo10891d();
        for (int i = 0; i < this.f10772e.size(); i++) {
            C3114a b = m14304b(i);
            if (b != null) {
                b.f10774b.mo10852g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo10991f() {
        for (int i = 0; i < this.f10772e.size(); i++) {
            C3114a b = m14304b(i);
            if (b != null) {
                b.f10774b.mo10850e();
            }
        }
    }
}
