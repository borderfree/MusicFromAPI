package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.cv */
public final class C4310cv extends C4478ir<C4310cv> {

    /* renamed from: a */
    public C4311cw[] f15935a;

    public C4310cv() {
        this.f15935a = C4311cw.m21213a();
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C4486iz.m22281a(ioVar, 10);
                int length = this.f15935a == null ? 0 : this.f15935a.length;
                C4311cw[] cwVarArr = new C4311cw[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f15935a, 0, cwVarArr, 0, length);
                }
                while (length < cwVarArr.length - 1) {
                    cwVarArr[length] = new C4311cw();
                    ioVar.mo14710a((C4483iw) cwVarArr[length]);
                    ioVar.mo14707a();
                    length++;
                }
                cwVarArr[length] = new C4311cw();
                ioVar.mo14710a((C4483iw) cwVarArr[length]);
                this.f15935a = cwVarArr;
            } else if (!super.mo14761a(ioVar, a)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15935a != null && this.f15935a.length > 0) {
            for (C4311cw cwVar : this.f15935a) {
                if (cwVar != null) {
                    iqVar.mo14753a(1, (C4483iw) cwVar);
                }
            }
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15935a != null && this.f15935a.length > 0) {
            for (C4311cw cwVar : this.f15935a) {
                if (cwVar != null) {
                    b += C4477iq.m22224b(1, (C4483iw) cwVar);
                }
            }
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4310cv)) {
            return false;
        }
        C4310cv cvVar = (C4310cv) obj;
        if (!C4482iv.m22271a((Object[]) this.f15935a, (Object[]) cvVar.f15935a)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cvVar.f16310L == null || cvVar.f16310L.mo14773b() : this.f16310L.equals(cvVar.f16310L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + C4482iv.m22267a((Object[]) this.f15935a)) * 31) + ((this.f16310L == null || this.f16310L.mo14773b()) ? 0 : this.f16310L.hashCode());
    }
}
