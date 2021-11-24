package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3393e;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.ads.zs */
final class C4130zs implements adj {

    /* renamed from: a */
    private final zzbav f15195a;

    private C4130zs(zzbav zzbav) {
        this.f15195a = (zzbav) aak.m15383a(zzbav, "output");
    }

    /* renamed from: a */
    public static C4130zs m20544a(zzbav zzbav) {
        return zzbav.f15394a != null ? zzbav.f15394a : new C4130zs(zzbav);
    }

    /* renamed from: a */
    public final int mo11741a() {
        return C3393e.f11354j;
    }

    /* renamed from: a */
    public final void mo11742a(int i) {
        this.f15195a.mo13929a(i, 3);
    }

    /* renamed from: a */
    public final void mo11743a(int i, double d) {
        this.f15195a.mo13927a(i, d);
    }

    /* renamed from: a */
    public final void mo11744a(int i, float f) {
        this.f15195a.mo13928a(i, f);
    }

    /* renamed from: a */
    public final void mo11745a(int i, int i2) {
        this.f15195a.mo13956e(i, i2);
    }

    /* renamed from: a */
    public final void mo11746a(int i, long j) {
        this.f15195a.mo13930a(i, j);
    }

    /* renamed from: a */
    public final <K, V> void mo11747a(int i, abf<K, V> abf, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.f15195a.mo13929a(i, 2);
            this.f15195a.mo13943b(abe.m15442a(abf, entry.getKey(), entry.getValue()));
            abe.m15443a(this.f15195a, abf, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final void mo11748a(int i, zzbah zzbah) {
        this.f15195a.mo13933a(i, zzbah);
    }

    /* renamed from: a */
    public final void mo11749a(int i, Object obj) {
        if (obj instanceof zzbah) {
            this.f15195a.mo13946b(i, (zzbah) obj);
        } else {
            this.f15195a.mo13931a(i, (abl) obj);
        }
    }

    /* renamed from: a */
    public final void mo11750a(int i, Object obj, ace ace) {
        this.f15195a.mo13932a(i, (abl) obj, ace);
    }

    /* renamed from: a */
    public final void mo11751a(int i, String str) {
        this.f15195a.mo13934a(i, str);
    }

    /* renamed from: a */
    public final void mo11752a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof aav) {
            aav aav = (aav) list;
            while (i2 < list.size()) {
                Object b = aav.mo11521b(i2);
                if (b instanceof String) {
                    this.f15195a.mo13934a(i, (String) b);
                } else {
                    this.f15195a.mo13933a(i, (zzbah) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13934a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo11753a(int i, List<?> list, ace ace) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo11750a(i, list.get(i2), ace);
        }
    }

    /* renamed from: a */
    public final void mo11754a(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20666f(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13926a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13944b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo11755a(int i, boolean z) {
        this.f15195a.mo13935a(i, z);
    }

    /* renamed from: b */
    public final void mo11756b(int i) {
        this.f15195a.mo13929a(i, 4);
    }

    /* renamed from: b */
    public final void mo11757b(int i, int i2) {
        this.f15195a.mo13944b(i, i2);
    }

    /* renamed from: b */
    public final void mo11758b(int i, long j) {
        this.f15195a.mo13951c(i, j);
    }

    /* renamed from: b */
    public final void mo11759b(int i, Object obj, ace ace) {
        zzbav zzbav = this.f15195a;
        abl abl = (abl) obj;
        zzbav.mo13929a(i, 3);
        ace.mo11558a(abl, (adj) zzbav.f15394a);
        zzbav.mo13929a(i, 4);
    }

    /* renamed from: b */
    public final void mo11760b(int i, List<zzbah> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f15195a.mo13933a(i, (zzbah) list.get(i2));
        }
    }

    /* renamed from: b */
    public final void mo11761b(int i, List<?> list, ace ace) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo11759b(i, list.get(i2), ace);
        }
    }

    /* renamed from: b */
    public final void mo11762b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20678i(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13954d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13956e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo11763c(int i, int i2) {
        this.f15195a.mo13944b(i, i2);
    }

    /* renamed from: c */
    public final void mo11764c(int i, long j) {
        this.f15195a.mo13930a(i, j);
    }

    /* renamed from: c */
    public final void mo11765c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20662d(((Long) list.get(i4)).longValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13936a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13930a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo11766d(int i, int i2) {
        this.f15195a.mo13956e(i, i2);
    }

    /* renamed from: d */
    public final void mo11767d(int i, long j) {
        this.f15195a.mo13951c(i, j);
    }

    /* renamed from: d */
    public final void mo11768d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20665e(((Long) list.get(i4)).longValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13936a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13930a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo11769e(int i, int i2) {
        this.f15195a.mo13950c(i, i2);
    }

    /* renamed from: e */
    public final void mo11770e(int i, long j) {
        this.f15195a.mo13945b(i, j);
    }

    /* renamed from: e */
    public final void mo11771e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20673g(((Long) list.get(i4)).longValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13952c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13951c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo11772f(int i, int i2) {
        this.f15195a.mo13955d(i, i2);
    }

    /* renamed from: f */
    public final void mo11773f(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20643b(((Float) list.get(i4)).floatValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13925a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13928a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo11774g(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20642b(((Double) list.get(i4)).doubleValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13924a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13927a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo11775h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20683k(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13926a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13944b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo11776i(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20654b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13941a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13935a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo11777j(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20670g(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13943b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13950c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo11778k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20681j(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13954d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13956e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo11779l(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20677h(((Long) list.get(i4)).longValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13952c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13951c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo11780m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20674h(((Integer) list.get(i4)).intValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13949c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13955d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo11781n(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f15195a.mo13929a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzbav.m20669f(((Long) list.get(i4)).longValue());
            }
            this.f15195a.mo13943b(i3);
            while (i2 < list.size()) {
                this.f15195a.mo13947b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f15195a.mo13945b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
