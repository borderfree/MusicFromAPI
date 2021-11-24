package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4343ea;
import com.google.android.gms.internal.measurement.C4344eb;

/* renamed from: com.google.android.gms.internal.measurement.eb */
public abstract class C4344eb<MessageType extends C4343ea<MessageType, BuilderType>, BuilderType extends C4344eb<MessageType, BuilderType>> implements C4420gr {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract BuilderType mo14304a(MessageType messagetype);

    /* renamed from: a */
    public final /* synthetic */ C4420gr mo14305a(C4419gq gqVar) {
        if (mo14501l().getClass().isInstance(gqVar)) {
            return mo14304a((MessageType) (C4343ea) gqVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
