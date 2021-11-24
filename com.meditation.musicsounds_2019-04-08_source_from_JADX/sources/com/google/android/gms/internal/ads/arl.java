package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@C3464ci
public final class arl extends asv {

    /* renamed from: a */
    private static final int f12958a = Color.rgb(12, 174, 206);

    /* renamed from: b */
    private static final int f12959b;

    /* renamed from: c */
    private static final int f12960c;

    /* renamed from: d */
    private static final int f12961d = f12958a;

    /* renamed from: e */
    private final String f12962e;

    /* renamed from: f */
    private final List<arp> f12963f = new ArrayList();

    /* renamed from: g */
    private final List<asy> f12964g = new ArrayList();

    /* renamed from: h */
    private final int f12965h;

    /* renamed from: i */
    private final int f12966i;

    /* renamed from: j */
    private final int f12967j;

    /* renamed from: k */
    private final int f12968k;

    /* renamed from: l */
    private final int f12969l;

    /* renamed from: m */
    private final boolean f12970m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        f12959b = rgb;
        f12960c = rgb;
    }

    public arl(String str, List<arp> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f12962e = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                arp arp = (arp) list.get(i3);
                this.f12963f.add(arp);
                this.f12964g.add(arp);
            }
        }
        this.f12965h = num != null ? num.intValue() : f12960c;
        this.f12966i = num2 != null ? num2.intValue() : f12961d;
        this.f12967j = num3 != null ? num3.intValue() : 12;
        this.f12968k = i;
        this.f12969l = i2;
        this.f12970m = z;
    }

    /* renamed from: a */
    public final String mo12340a() {
        return this.f12962e;
    }

    /* renamed from: b */
    public final List<asy> mo12341b() {
        return this.f12964g;
    }

    /* renamed from: c */
    public final List<arp> mo12342c() {
        return this.f12963f;
    }

    /* renamed from: d */
    public final int mo12343d() {
        return this.f12965h;
    }

    /* renamed from: e */
    public final int mo12344e() {
        return this.f12966i;
    }

    /* renamed from: f */
    public final int mo12345f() {
        return this.f12967j;
    }

    /* renamed from: g */
    public final int mo12346g() {
        return this.f12968k;
    }

    /* renamed from: h */
    public final int mo12347h() {
        return this.f12969l;
    }

    /* renamed from: i */
    public final boolean mo12348i() {
        return this.f12970m;
    }
}
