package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@C3464ci
public abstract class aqc<T> {

    /* renamed from: a */
    private final int f12595a;

    /* renamed from: b */
    private final String f12596b;

    /* renamed from: c */
    private final T f12597c;

    private aqc(int i, String str, T t) {
        this.f12595a = i;
        this.f12596b = str;
        this.f12597c = t;
        ane.m16649e().mo12293a(this);
    }

    /* synthetic */ aqc(int i, String str, Object obj, aqd aqd) {
        this(i, str, obj);
    }

    /* renamed from: a */
    public static aqc<String> m16882a(int i, String str) {
        aqc<String> a = m16887a(i, str, (String) null);
        ane.m16649e().mo12295b(a);
        return a;
    }

    /* renamed from: a */
    public static aqc<Float> m16883a(int i, String str, float f) {
        return new aqg(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static aqc<Integer> m16884a(int i, String str, int i2) {
        return new aqe(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static aqc<Long> m16885a(int i, String str, long j) {
        return new aqf(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static aqc<Boolean> m16886a(int i, String str, Boolean bool) {
        return new aqd(i, str, bool);
    }

    /* renamed from: a */
    public static aqc<String> m16887a(int i, String str, String str2) {
        return new aqh(i, str, str2);
    }

    /* renamed from: b */
    public static aqc<String> m16888b(int i, String str) {
        aqc<String> a = m16887a(i, str, (String) null);
        ane.m16649e().mo12296c(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo12285a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo12286a(JSONObject jSONObject);

    /* renamed from: a */
    public final String mo12287a() {
        return this.f12596b;
    }

    /* renamed from: a */
    public abstract void mo12288a(Editor editor, T t);

    /* renamed from: b */
    public final T mo12289b() {
        return this.f12597c;
    }

    /* renamed from: c */
    public final int mo12290c() {
        return this.f12595a;
    }
}
