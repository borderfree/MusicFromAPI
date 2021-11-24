package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C3000u();

    /* renamed from: a */
    private final String f10498a;

    /* renamed from: b */
    private GoogleSignInOptions f10499b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f10498a = C3266s.m14915a(str);
        this.f10499b = googleSignInOptions;
    }

    /* renamed from: a */
    public final GoogleSignInOptions mo10712a() {
        return this.f10499b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        return this.f10498a.equals(signInConfiguration.f10498a) && (this.f10499b != null ? this.f10499b.equals(signInConfiguration.f10499b) : signInConfiguration.f10499b == null);
    }

    public final int hashCode() {
        return new C2980a().mo10718a((Object) this.f10498a).mo10718a((Object) this.f10499b).mo10717a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f10498a, false);
        C3267a.m14964a(parcel, 5, (Parcelable) this.f10499b, i, false);
        C3267a.m14956a(parcel, a);
    }
}
