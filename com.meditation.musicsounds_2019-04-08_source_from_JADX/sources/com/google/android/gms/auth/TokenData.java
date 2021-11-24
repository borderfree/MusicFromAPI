package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C3006f();

    /* renamed from: a */
    private final int f10424a;

    /* renamed from: b */
    private final String f10425b;

    /* renamed from: c */
    private final Long f10426c;

    /* renamed from: d */
    private final boolean f10427d;

    /* renamed from: e */
    private final boolean f10428e;

    /* renamed from: f */
    private final List<String> f10429f;

    /* renamed from: g */
    private final String f10430g;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f10424a = i;
        this.f10425b = C3266s.m14915a(str);
        this.f10426c = l;
        this.f10427d = z;
        this.f10428e = z2;
        this.f10429f = list;
        this.f10430g = str2;
    }

    /* renamed from: a */
    public static TokenData m13838a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    /* renamed from: a */
    public final String mo10659a() {
        return this.f10425b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f10425b, tokenData.f10425b) && C3261q.m14906a(this.f10426c, tokenData.f10426c) && this.f10427d == tokenData.f10427d && this.f10428e == tokenData.f10428e && C3261q.m14906a(this.f10429f, tokenData.f10429f) && C3261q.m14906a(this.f10430g, tokenData.f10430g);
    }

    public int hashCode() {
        return C3261q.m14904a(this.f10425b, this.f10426c, Boolean.valueOf(this.f10427d), Boolean.valueOf(this.f10428e), this.f10429f, this.f10430g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10424a);
        C3267a.m14968a(parcel, 2, this.f10425b, false);
        C3267a.m14967a(parcel, 3, this.f10426c, false);
        C3267a.m14971a(parcel, 4, this.f10427d);
        C3267a.m14971a(parcel, 5, this.f10428e);
        C3267a.m14978b(parcel, 6, this.f10429f, false);
        C3267a.m14968a(parcel, 7, this.f10430g, false);
        C3267a.m14956a(parcel, a);
    }
}
