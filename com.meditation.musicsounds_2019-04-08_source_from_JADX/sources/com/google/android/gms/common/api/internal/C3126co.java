package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.co */
final class C3126co implements C3089bh {

    /* renamed from: a */
    private final /* synthetic */ C3123cl f10811a;

    private C3126co(C3123cl clVar) {
        this.f10811a = clVar;
    }

    /* synthetic */ C3126co(C3123cl clVar, C3124cm cmVar) {
        this(clVar);
    }

    /* renamed from: a */
    public final void mo10904a(int i, boolean z) {
        this.f10811a.f10807m.lock();
        try {
            if (this.f10811a.f10806l) {
                this.f10811a.f10806l = false;
                this.f10811a.m14339a(i, z);
            } else {
                this.f10811a.f10806l = true;
                this.f10811a.f10798d.mo10863a(i);
            }
        } finally {
            this.f10811a.f10807m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10905a(Bundle bundle) {
        this.f10811a.f10807m.lock();
        try {
            this.f10811a.f10805k = ConnectionResult.f10553a;
            this.f10811a.m14352e();
        } finally {
            this.f10811a.f10807m.unlock();
        }
    }

    /* renamed from: a */
    public final void mo10906a(ConnectionResult connectionResult) {
        this.f10811a.f10807m.lock();
        try {
            this.f10811a.f10805k = connectionResult;
            this.f10811a.m14352e();
        } finally {
            this.f10811a.f10807m.unlock();
        }
    }
}
