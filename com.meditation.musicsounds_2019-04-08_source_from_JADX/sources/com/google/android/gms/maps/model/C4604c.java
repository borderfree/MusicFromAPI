package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.internal.p132g.C4197h;

/* renamed from: com.google.android.gms.maps.model.c */
public final class C4604c {

    /* renamed from: a */
    private final C4197h f16619a;

    public C4604c(C4197h hVar) {
        this.f16619a = (C4197h) C3266s.m14913a(hVar);
    }

    /* renamed from: a */
    public final String mo15177a() {
        try {
            return this.f16619a.mo14037a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public final void mo15178a(C4602a aVar) {
        if (aVar == null) {
            try {
                this.f16619a.mo14038a((C3323b) null);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            this.f16619a.mo14038a(aVar.mo15176a());
        }
    }

    /* renamed from: a */
    public final void mo15179a(String str) {
        try {
            this.f16619a.mo14039a(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final String mo15180b() {
        try {
            return this.f16619a.mo14041b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final void mo15181c() {
        try {
            this.f16619a.mo14042c();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final boolean mo15182d() {
        try {
            return this.f16619a.mo14043d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4604c)) {
            return false;
        }
        try {
            return this.f16619a.mo14040a(((C4604c) obj).f16619a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f16619a.mo14044e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
