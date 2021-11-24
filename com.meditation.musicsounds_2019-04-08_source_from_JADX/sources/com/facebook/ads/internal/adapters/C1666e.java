package com.facebook.ads.internal.adapters;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.ads.internal.p058a.C1629d;
import com.facebook.ads.internal.p070l.C1717c;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.e */
public class C1666e {

    /* renamed from: a */
    private final String f5458a;

    /* renamed from: b */
    private final String f5459b;

    /* renamed from: c */
    private final C1629d f5460c;

    /* renamed from: d */
    private final Collection<String> f5461d;

    /* renamed from: e */
    private final Map<String, String> f5462e;

    /* renamed from: f */
    private final String f5463f;

    /* renamed from: g */
    private final int f5464g;

    /* renamed from: h */
    private final int f5465h;

    /* renamed from: i */
    private final int f5466i;

    /* renamed from: j */
    private final String f5467j;

    private C1666e(String str, String str2, C1629d dVar, Collection<String> collection, Map<String, String> map, String str3, int i, int i2, int i3, String str4) {
        this.f5458a = str;
        this.f5459b = str2;
        this.f5460c = dVar;
        this.f5461d = collection;
        this.f5462e = map;
        this.f5463f = str3;
        this.f5464g = i;
        this.f5465h = i2;
        this.f5466i = i3;
        this.f5467j = str4;
    }

    /* renamed from: a */
    public static C1666e m8357a(Intent intent) {
        C1666e eVar = new C1666e(C1717c.m8603a(intent.getByteArrayExtra("markup")), intent.getStringExtra("activation_command"), C1629d.NONE, null, null, intent.getStringExtra("request_id"), intent.getIntExtra("viewability_check_initial_delay", 0), intent.getIntExtra("viewability_check_interval", 1000), intent.getIntExtra("skipAfterSeconds", 0), intent.getStringExtra("ct"));
        return eVar;
    }

    /* renamed from: a */
    public static C1666e m8358a(Bundle bundle) {
        C1666e eVar = new C1666e(C1717c.m8603a(bundle.getByteArray("markup")), null, C1629d.NONE, null, null, bundle.getString("request_id"), bundle.getInt("viewability_check_initial_delay"), bundle.getInt("viewability_check_interval"), bundle.getInt("skip_after_seconds", 0), bundle.getString("ct"));
        return eVar;
    }

    /* renamed from: a */
    public String mo6779a() {
        return this.f5458a;
    }

    /* renamed from: b */
    public String mo6780b() {
        return this.f5459b;
    }

    /* renamed from: c */
    public String mo6781c() {
        return this.f5463f;
    }

    /* renamed from: d */
    public int mo6782d() {
        return this.f5464g;
    }

    /* renamed from: e */
    public int mo6783e() {
        return this.f5465h;
    }

    /* renamed from: f */
    public String mo6784f() {
        return this.f5467j;
    }

    /* renamed from: g */
    public Bundle mo6785g() {
        Bundle bundle = new Bundle();
        bundle.putByteArray("markup", C1717c.m8604a(this.f5458a));
        bundle.putString("request_id", this.f5463f);
        bundle.putInt("viewability_check_initial_delay", this.f5464g);
        bundle.putInt("viewability_check_interval", this.f5465h);
        bundle.putInt("skip_after_seconds", this.f5466i);
        bundle.putString("ct", this.f5467j);
        return bundle;
    }
}
