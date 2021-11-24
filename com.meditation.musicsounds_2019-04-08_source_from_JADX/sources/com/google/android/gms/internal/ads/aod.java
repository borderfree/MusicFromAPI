package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class aod {

    /* renamed from: a */
    private final String f12505a;

    /* renamed from: b */
    private final String f12506b;

    public aod(String str, String str2) {
        this.f12505a = str;
        this.f12506b = str2;
    }

    /* renamed from: a */
    public final String mo12126a() {
        return this.f12505a;
    }

    /* renamed from: b */
    public final String mo12127b() {
        return this.f12506b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aod aod = (aod) obj;
            return TextUtils.equals(this.f12505a, aod.f12505a) && TextUtils.equals(this.f12506b, aod.f12506b);
        }
    }

    public final int hashCode() {
        return (this.f12505a.hashCode() * 31) + this.f12506b.hashCode();
    }

    public final String toString() {
        String str = this.f12505a;
        String str2 = this.f12506b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
