package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.analytics.C2952p;

/* renamed from: com.google.android.gms.internal.measurement.bo */
public final class C4276bo extends C4497s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public SharedPreferences f15820a;

    /* renamed from: b */
    private long f15821b;

    /* renamed from: c */
    private long f15822c = -1;

    /* renamed from: d */
    private final C4278bq f15823d;

    protected C4276bo(C4499u uVar) {
        super(uVar);
        C4278bq bqVar = new C4278bq(this, "monitoring", ((Long) C4262ba.f15744D.mo14166a()).longValue());
        this.f15823d = bqVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
        this.f15820a = mo14826i().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    /* renamed from: a */
    public final void mo14192a(String str) {
        C2952p.m13827d();
        mo14840x();
        Editor edit = this.f15820a.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            mo14821e("Failed to commit campaign data");
        }
    }

    /* renamed from: b */
    public final long mo14193b() {
        C2952p.m13827d();
        mo14840x();
        if (this.f15821b == 0) {
            long j = this.f15820a.getLong("first_run", 0);
            if (j == 0) {
                j = mo14825h().mo11326a();
                Editor edit = this.f15820a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    mo14821e("Failed to commit first run time");
                }
            }
            this.f15821b = j;
        }
        return this.f15821b;
    }

    /* renamed from: c */
    public final C4285bx mo14194c() {
        return new C4285bx(mo14825h(), mo14193b());
    }

    /* renamed from: d */
    public final long mo14195d() {
        C2952p.m13827d();
        mo14840x();
        if (this.f15822c == -1) {
            this.f15822c = this.f15820a.getLong("last_dispatch", 0);
        }
        return this.f15822c;
    }

    /* renamed from: e */
    public final void mo14196e() {
        C2952p.m13827d();
        mo14840x();
        long a = mo14825h().mo11326a();
        Editor edit = this.f15820a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.f15822c = a;
    }

    /* renamed from: f */
    public final String mo14197f() {
        C2952p.m13827d();
        mo14840x();
        String string = this.f15820a.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* renamed from: z */
    public final C4278bq mo14198z() {
        return this.f15823d;
    }
}
