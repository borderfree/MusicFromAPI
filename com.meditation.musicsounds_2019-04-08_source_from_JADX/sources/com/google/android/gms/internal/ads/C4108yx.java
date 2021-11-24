package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4107yw;
import com.google.android.gms.internal.ads.C4108yx;

/* renamed from: com.google.android.gms.internal.ads.yx */
public abstract class C4108yx<MessageType extends C4107yw<MessageType, BuilderType>, BuilderType extends C4108yx<MessageType, BuilderType>> implements abm {
    /* renamed from: a */
    public final /* synthetic */ abm mo11554a(abl abl) {
        if (mo11484p().getClass().isInstance(abl)) {
            return mo11488a((MessageType) (C4107yw) abl);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo11488a(MessageType messagetype);
}
