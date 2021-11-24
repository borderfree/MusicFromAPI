package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p102c.C2488a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.e */
public final class C2811e {

    /* renamed from: a */
    public final Uri f9717a;

    /* renamed from: b */
    public final byte[] f9718b;

    /* renamed from: c */
    public final long f9719c;

    /* renamed from: d */
    public final long f9720d;

    /* renamed from: e */
    public final long f9721e;

    /* renamed from: f */
    public final String f9722f;

    /* renamed from: g */
    public final int f9723g;

    public C2811e(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C2811e(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C2811e(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C2488a.m11666a(j >= 0);
        C2488a.m11666a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        C2488a.m11666a(z);
        this.f9717a = uri;
        this.f9718b = bArr;
        this.f9719c = j;
        this.f9720d = j2;
        this.f9721e = j3;
        this.f9722f = str;
        this.f9723g = i;
    }

    /* renamed from: a */
    public boolean mo9546a(int i) {
        return (this.f9723g & i) == i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        sb.append(this.f9717a);
        sb.append(", ");
        sb.append(Arrays.toString(this.f9718b));
        sb.append(", ");
        sb.append(this.f9719c);
        sb.append(", ");
        sb.append(this.f9720d);
        sb.append(", ");
        sb.append(this.f9721e);
        sb.append(", ");
        sb.append(this.f9722f);
        sb.append(", ");
        sb.append(this.f9723g);
        sb.append("]");
        return sb.toString();
    }
}
