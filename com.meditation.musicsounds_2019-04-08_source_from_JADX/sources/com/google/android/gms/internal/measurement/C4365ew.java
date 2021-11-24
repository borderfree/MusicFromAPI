package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4388e;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ew */
final class C4365ew implements C4474in {

    /* renamed from: a */
    private final zztv f16085a;

    private C4365ew(zztv zztv) {
        this.f16085a = (zztv) C4390fo.m21609a(zztv, "output");
    }

    /* renamed from: a */
    public static C4365ew m21449a(zztv zztv) {
        return zztv.f16416a != null ? zztv.f16416a : new C4365ew(zztv);
    }

    /* renamed from: a */
    public final int mo14406a() {
        return C4388e.f16128j;
    }

    /* renamed from: a */
    public final void mo14407a(int i) {
        this.f16085a.mo14903a(i, 3);
    }

    /* renamed from: a */
    public final void mo14408a(int i, double d) {
        this.f16085a.mo14901a(i, d);
    }

    /* renamed from: a */
    public final void mo14409a(int i, float f) {
        this.f16085a.mo14902a(i, f);
    }

    /* renamed from: a */
    public final void mo14410a(int i, int i2) {
        this.f16085a.mo14932e(i, i2);
    }

    /* renamed from: a */
    public final void mo14411a(int i, long j) {
        this.f16085a.mo14904a(i, j);
    }

    /* renamed from: a */
    public final <K, V> void mo14412a(int i, C4413gk<K, V> gkVar, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.f16085a.mo14903a(i, 2);
            this.f16085a.mo14918b(C4412gj.m21678a(gkVar, entry.getKey(), entry.getValue()));
            C4412gj.m21679a(this.f16085a, gkVar, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final void mo14413a(int i, zzte zzte) {
        this.f16085a.mo14907a(i, zzte);
    }

    /* renamed from: a */
    public final void mo14414a(int i, Object obj) {
        if (obj instanceof zzte) {
            this.f16085a.mo14922b(i, (zzte) obj);
        } else {
            this.f16085a.mo14921b(i, (C4419gq) obj);
        }
    }

    /* renamed from: a */
    public final void mo14415a(int i, Object obj, C4437hh hhVar) {
        this.f16085a.mo14906a(i, (C4419gq) obj, hhVar);
    }

    /* renamed from: a */
    public final void mo14416a(int i, String str) {
        this.f16085a.mo14908a(i, str);
    }

    /* renamed from: a */
    public final void mo14417a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C4403ga) {
            C4403ga gaVar = (C4403ga) list;
            while (i2 < list.size()) {
                Object b = gaVar.mo14530b(i2);
                if (b instanceof String) {
                    this.f16085a.mo14908a(i, (String) b);
                } else {
                    this.f16085a.mo14907a(i, (zzte) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14908a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo14418a(int i, List<?> list, C4437hh hhVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo14415a(i, list.get(i2), hhVar);
        }
    }

    /* renamed from: a */
    public final void mo14419a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22436f(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14900a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14919b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo14420a(int i, boolean z) {
        this.f16085a.mo14909a(i, z);
    }

    /* renamed from: b */
    public final void mo14421b(int i) {
        this.f16085a.mo14903a(i, 4);
    }

    /* renamed from: b */
    public final void mo14422b(int i, int i2) {
        this.f16085a.mo14919b(i, i2);
    }

    /* renamed from: b */
    public final void mo14423b(int i, long j) {
        this.f16085a.mo14927c(i, j);
    }

    /* renamed from: b */
    public final void mo14424b(int i, Object obj, C4437hh hhVar) {
        zztv zztv = this.f16085a;
        C4419gq gqVar = (C4419gq) obj;
        zztv.mo14903a(i, 3);
        hhVar.mo14573a(gqVar, (C4474in) zztv.f16416a);
        zztv.mo14903a(i, 4);
    }

    /* renamed from: b */
    public final void mo14425b(int i, List<zzte> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16085a.mo14907a(i, (zzte) list.get(i2));
        }
    }

    /* renamed from: b */
    public final void mo14426b(int i, List<?> list, C4437hh hhVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo14424b(i, list.get(i2), hhVar);
        }
    }

    /* renamed from: b */
    public final void mo14427b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22448i(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14930d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14932e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo14428c(int i, int i2) {
        this.f16085a.mo14919b(i, i2);
    }

    /* renamed from: c */
    public final void mo14429c(int i, long j) {
        this.f16085a.mo14904a(i, j);
    }

    /* renamed from: c */
    public final void mo14430c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22432d(((Long) list.get(i4)).longValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14910a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14904a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo14431d(int i, int i2) {
        this.f16085a.mo14932e(i, i2);
    }

    /* renamed from: d */
    public final void mo14432d(int i, long j) {
        this.f16085a.mo14927c(i, j);
    }

    /* renamed from: d */
    public final void mo14433d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22435e(((Long) list.get(i4)).longValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14910a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14904a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo14434e(int i, int i2) {
        this.f16085a.mo14926c(i, i2);
    }

    /* renamed from: e */
    public final void mo14435e(int i, long j) {
        this.f16085a.mo14920b(i, j);
    }

    /* renamed from: e */
    public final void mo14436e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22443g(((Long) list.get(i4)).longValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14928c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14927c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo14437f(int i, int i2) {
        this.f16085a.mo14931d(i, i2);
    }

    /* renamed from: f */
    public final void mo14438f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22411b(((Float) list.get(i4)).floatValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14899a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14902a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo14439g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22410b(((Double) list.get(i4)).doubleValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14898a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14901a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo14440h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22453k(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14900a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14919b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo14441i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22422b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14916a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14909a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo14442j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22440g(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14918b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14926c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo14443k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22451j(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14930d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14932e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo14444l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22447h(((Long) list.get(i4)).longValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14928c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14927c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo14445m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22444h(((Integer) list.get(i4)).intValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14925c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14931d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo14446n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f16085a.mo14903a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m22439f(((Long) list.get(i4)).longValue());
            }
            this.f16085a.mo14918b(i3);
            while (i2 < list.size()) {
                this.f16085a.mo14923b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16085a.mo14920b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
