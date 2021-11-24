package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bb */
final class C3430bb implements C3736mj<List<arp>, arl> {

    /* renamed from: a */
    private final /* synthetic */ String f13517a;

    /* renamed from: b */
    private final /* synthetic */ Integer f13518b;

    /* renamed from: c */
    private final /* synthetic */ Integer f13519c;

    /* renamed from: d */
    private final /* synthetic */ int f13520d;

    /* renamed from: e */
    private final /* synthetic */ int f13521e;

    /* renamed from: f */
    private final /* synthetic */ int f13522f;

    /* renamed from: g */
    private final /* synthetic */ int f13523g;

    /* renamed from: h */
    private final /* synthetic */ boolean f13524h;

    C3430bb(C3424aw awVar, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f13517a = str;
        this.f13518b = num;
        this.f13519c = num2;
        this.f13520d = i;
        this.f13521e = i2;
        this.f13522f = i3;
        this.f13523g = i4;
        this.f13524h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12712a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str = this.f13517a;
        Integer num2 = this.f13518b;
        Integer num3 = this.f13519c;
        if (this.f13520d > 0) {
            num = Integer.valueOf(this.f13520d);
        }
        arl arl = new arl(str, list, num2, num3, num, this.f13521e + this.f13522f, this.f13523g, this.f13524h);
        return arl;
    }
}
