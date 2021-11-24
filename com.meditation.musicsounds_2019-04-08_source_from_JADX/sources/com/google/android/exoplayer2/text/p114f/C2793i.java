package com.google.android.exoplayer2.text.p114f;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.i */
final class C2793i implements C2768d {

    /* renamed from: a */
    private final List<C2785e> f9661a;

    /* renamed from: b */
    private final int f9662b;

    /* renamed from: c */
    private final long[] f9663c = new long[(this.f9662b * 2)];

    /* renamed from: d */
    private final long[] f9664d;

    public C2793i(List<C2785e> list) {
        this.f9661a = list;
        this.f9662b = list.size();
        for (int i = 0; i < this.f9662b; i++) {
            C2785e eVar = (C2785e) list.get(i);
            int i2 = i * 2;
            this.f9663c[i2] = eVar.f9631m;
            this.f9663c[i2 + 1] = eVar.f9632n;
        }
        this.f9664d = Arrays.copyOf(this.f9663c, this.f9663c.length);
        Arrays.sort(this.f9664d);
    }

    /* renamed from: a */
    public int mo9424a(long j) {
        int b = C2511s.m11813b(this.f9664d, j, false, false);
        if (b < this.f9664d.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo9425a(int i) {
        boolean z = false;
        C2488a.m11666a(i >= 0);
        if (i < this.f9664d.length) {
            z = true;
        }
        C2488a.m11666a(z);
        return this.f9664d[i];
    }

    /* renamed from: b */
    public int mo9426b() {
        return this.f9664d.length;
    }

    /* renamed from: b */
    public List<C2741a> mo9427b(long j) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        C2785e eVar = null;
        for (int i = 0; i < this.f9662b; i++) {
            int i2 = i * 2;
            if (this.f9663c[i2] <= j && j < this.f9663c[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C2785e eVar2 = (C2785e) this.f9661a.get(i);
                if (!eVar2.mo9497a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(eVar.f9388a).append("\n");
                    } else {
                        append = spannableStringBuilder.append("\n");
                    }
                    append.append(eVar2.f9388a);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C2785e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }
}
