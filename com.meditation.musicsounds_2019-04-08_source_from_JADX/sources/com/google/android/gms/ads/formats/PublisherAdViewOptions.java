package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.amr;
import com.google.android.gms.internal.ads.aoe;
import com.google.android.gms.internal.ads.aof;

@C3464ci
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Creator<PublisherAdViewOptions> CREATOR = new zzc();

    /* renamed from: a */
    private final boolean f9901a;

    /* renamed from: b */
    private final aoe f9902b;

    /* renamed from: c */
    private AppEventListener f9903c;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f9904a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public AppEventListener f9905b;

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.f9905b = appEventListener;
            return this;
        }

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f9904a = z;
            return this;
        }
    }

    private PublisherAdViewOptions(Builder builder) {
        this.f9901a = builder.f9904a;
        this.f9903c = builder.f9905b;
        this.f9902b = this.f9903c != null ? new amr(this.f9903c) : null;
    }

    PublisherAdViewOptions(boolean z, IBinder iBinder) {
        this.f9901a = z;
        this.f9902b = iBinder != null ? aof.m16683a(iBinder) : null;
    }

    public final AppEventListener getAppEventListener() {
        return this.f9903c;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f9901a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 1, getManualImpressionsEnabled());
        C3267a.m14963a(parcel, 2, this.f9902b == null ? null : this.f9902b.asBinder(), false);
        C3267a.m14956a(parcel, a);
    }

    public final aoe zzbg() {
        return this.f9902b;
    }
}
