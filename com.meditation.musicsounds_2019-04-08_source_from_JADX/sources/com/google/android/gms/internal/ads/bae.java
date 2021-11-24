package com.google.android.gms.internal.ads;

public final class bae<T> {

    /* renamed from: a */
    public final T f13443a;

    /* renamed from: b */
    public final afd f13444b;

    /* renamed from: c */
    public final zzae f13445c;

    /* renamed from: d */
    public boolean f13446d;

    private bae(zzae zzae) {
        this.f13446d = false;
        this.f13443a = null;
        this.f13444b = null;
        this.f13445c = zzae;
    }

    private bae(T t, afd afd) {
        this.f13446d = false;
        this.f13443a = t;
        this.f13444b = afd;
        this.f13445c = null;
    }

    /* renamed from: a */
    public static <T> bae<T> m17736a(zzae zzae) {
        return new bae<>(zzae);
    }

    /* renamed from: a */
    public static <T> bae<T> m17737a(T t, afd afd) {
        return new bae<>(t, afd);
    }
}
