package com.bumptech.glide;

import com.bumptech.glide.C1260h;
import com.bumptech.glide.request.p056b.C1584a;
import com.bumptech.glide.request.p056b.C1588c;

/* renamed from: com.bumptech.glide.h */
public abstract class C1260h<CHILD extends C1260h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    private C1588c<? super TranscodeType> f4479a = C1584a.m7864a();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C1260h) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C1588c<? super TranscodeType> mo5915b() {
        return this.f4479a;
    }
}
