package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4107yw;
import com.google.android.gms.internal.ads.C4108yx;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.yw */
public abstract class C4107yw<MessageType extends C4107yw<MessageType, BuilderType>, BuilderType extends C4108yx<MessageType, BuilderType>> implements abl {
    private static boolean zzdpg = false;
    protected int zzdpf = 0;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11475a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final zzbah mo11552h() {
        try {
            C4122zk zzbo = zzbah.zzbo(mo11481l());
            mo11476a(zzbo.mo13844b());
            return zzbo.mo13843a();
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

    /* renamed from: i */
    public final byte[] mo11553i() {
        try {
            byte[] bArr = new byte[mo11481l()];
            zzbav a = zzbav.m20641a(bArr);
            mo11476a(a);
            a.mo13942b();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
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
    /* renamed from: j */
    public int mo11479j() {
        throw new UnsupportedOperationException();
    }
}
