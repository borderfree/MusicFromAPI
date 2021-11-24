package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Creator<RemoteMessage> CREATOR = new C4980e();

    /* renamed from: a */
    Bundle f17812a;

    public RemoteMessage(Bundle bundle) {
        this.f17812a = bundle;
    }

    /* renamed from: a */
    public final Intent mo16269a() {
        Intent intent = new Intent();
        intent.putExtras(this.f17812a);
        return intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14962a(parcel, 2, this.f17812a, false);
        C3267a.m14956a(parcel, a);
    }
}
