package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.cn */
final class C3125cn implements C3089bh {

    /* renamed from: a */
    private final /* synthetic */ C3123cl f10810a;

    private C3125cn(C3123cl clVar) {
        this.f10810a = clVar;
    }

    /* synthetic */ C3125cn(C3123cl clVar, C3124cm cmVar) {
        this(clVar);
    }

    /* renamed from: a */
    public final void mo10904a(int i, boolean z) {
        this.f10810a.f10807m.lock();
        try {
            if (!this.f10810a.f10806l && this.f10810a.f10805k != null) {
                if (this.f10810a.f10805k.mo10759b()) {
                    this.f10810a.f10806l = true;
                    this.f10810a.f10799e.mo10863a(i);
                }
            }
            this.f10810a.f10806l = false;
            this.f10810a.m14339a(i, z);
        } finally {
            this.f10810a.f10807m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10905a(Bundle bundle) {
        this.f10810a.f10807m.lock();
        try {
            this.f10810a.m14340a(bundle);
            this.f10810a.f10804j = ConnectionResult.f10553a;
            this.f10810a.m14352e();
        } finally {
            this.f10810a.f10807m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10906a(ConnectionResult connectionResult) {
        this.f10810a.f10807m.lock();
        try {
            this.f10810a.f10804j = connectionResult;
            this.f10810a.m14352e();
        } finally {
            this.f10810a.f10807m.unlock();
        }
    }
}
