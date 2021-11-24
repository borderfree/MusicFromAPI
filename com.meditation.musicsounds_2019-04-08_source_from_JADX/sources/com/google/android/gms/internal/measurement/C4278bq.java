package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C3266s;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.measurement.bq */
public final class C4278bq {

    /* renamed from: a */
    private final String f15824a;

    /* renamed from: b */
    private final long f15825b;

    /* renamed from: c */
    private final /* synthetic */ C4276bo f15826c;

    private C4278bq(C4276bo boVar, String str, long j) {
        this.f15826c = boVar;
        C3266s.m14915a(str);
        C3266s.m14923b(j > 0);
        this.f15824a = str;
        this.f15825b = j;
    }

    /* renamed from: b */
    private final void m21103b() {
        long a = this.f15826c.mo14825h().mo11326a();
        Editor edit = this.f15826c.f15820a.edit();
        edit.remove(m21106e());
        edit.remove(m21107f());
        edit.putLong(m21105d(), a);
        edit.commit();
    }

    /* renamed from: c */
    private final long m21104c() {
        return this.f15826c.f15820a.getLong(m21105d(), 0);
    }

    /* renamed from: d */
    private final String m21105d() {
        return String.valueOf(this.f15824a).concat(":start");
    }

    /* renamed from: e */
    private final String m21106e() {
        return String.valueOf(this.f15824a).concat(":count");
    }

    /* renamed from: f */
    private final String m21107f() {
        return String.valueOf(this.f15824a).concat(":value");
    }

    /* renamed from: a */
    public final Pair<String, Long> mo14199a() {
        long c = m21104c();
        long abs = c == 0 ? 0 : Math.abs(c - this.f15826c.mo14825h().mo11326a());
        if (abs < this.f15825b) {
            return null;
        }
        if (abs > (this.f15825b << 1)) {
            m21103b();
            return null;
        }
        String string = this.f15826c.f15820a.getString(m21107f(), null);
        long j = this.f15826c.f15820a.getLong(m21106e(), 0);
        m21103b();
        if (string == null || j <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo14200a(String str) {
        if (m21104c() == 0) {
            m21103b();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.f15826c.f15820a.getLong(m21106e(), 0);
            if (j <= 0) {
                Editor edit = this.f15826c.f15820a.edit();
                edit.putString(m21107f(), str);
                edit.putLong(m21106e(), 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            boolean z = (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
            Editor edit2 = this.f15826c.f15820a.edit();
            if (z) {
                edit2.putString(m21107f(), str);
            }
            edit2.putLong(m21106e(), j2);
            edit2.apply();
        }
    }
}
