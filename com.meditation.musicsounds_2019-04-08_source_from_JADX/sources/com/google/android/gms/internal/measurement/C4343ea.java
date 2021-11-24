package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4343ea;
import com.google.android.gms.internal.measurement.C4344eb;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ea */
public abstract class C4343ea<MessageType extends C4343ea<MessageType, BuilderType>, BuilderType extends C4344eb<MessageType, BuilderType>> implements C4419gq {
    private static boolean zzbtj = false;
    protected int zzbti = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14300a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final zzte mo14301d() {
        try {
            C4357eo zzao = zzte.zzao(mo14497h());
            mo14493a(zzao.mo14335b());
            return zzao.mo14334a();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + String.valueOf(str).length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo14302e() {
        throw new UnsupportedOperationException();
    }
}
