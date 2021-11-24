package android.support.p009v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0023d;
import android.arch.lifecycle.C0024e;
import android.arch.lifecycle.C0033l;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Bundle;
import android.support.p009v4.p019g.C0510m;

/* renamed from: android.support.v4.app.ae */
public class C0354ae extends Activity implements C0023d {

    /* renamed from: a */
    private C0510m<Class<? extends Object>, Object> f1025a = new C0510m<>();

    /* renamed from: b */
    private C0024e f1026b = new C0024e(this);

    /* renamed from: B_ */
    public Lifecycle mo65B_() {
        return this.f1026b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0033l.m118a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1026b.mo67a(State.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
