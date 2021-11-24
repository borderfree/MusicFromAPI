package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C3266s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.bn */
final class C4275bn {

    /* renamed from: a */
    private int f15817a;

    /* renamed from: b */
    private ByteArrayOutputStream f15818b = new ByteArrayOutputStream();

    /* renamed from: c */
    private final /* synthetic */ C4274bm f15819c;

    public C4275bn(C4274bm bmVar) {
        this.f15819c = bmVar;
    }

    /* renamed from: a */
    public final int mo14189a() {
        return this.f15817a;
    }

    /* renamed from: a */
    public final boolean mo14190a(C4267bf bfVar) {
        C3266s.m14913a(bfVar);
        if (this.f15817a + 1 > C4253as.m21002g()) {
            return false;
        }
        String a = this.f15819c.mo14186a(bfVar, false);
        if (a == null) {
            this.f15819c.mo14827j().mo14179a(bfVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        if (length > C4253as.m20998c()) {
            this.f15819c.mo14827j().mo14179a(bfVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f15818b.size() > 0) {
            length++;
        }
        if (this.f15818b.size() + length > ((Integer) C4262ba.f15778t.mo14166a()).intValue()) {
            return false;
        }
        try {
            if (this.f15818b.size() > 0) {
                this.f15818b.write(C4274bm.f15814c);
            }
            this.f15818b.write(bytes);
            this.f15817a++;
            return true;
        } catch (IOException e) {
            this.f15819c.mo14822e("Failed to write payload when batching hits", e);
            return true;
        }
    }

    /* renamed from: b */
    public final byte[] mo14191b() {
        return this.f15818b.toByteArray();
    }
}
