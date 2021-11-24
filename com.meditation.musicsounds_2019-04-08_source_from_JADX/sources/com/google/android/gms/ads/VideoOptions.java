package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.zzmu;

@C3464ci
public final class VideoOptions {

    /* renamed from: a */
    private final boolean f9876a;

    /* renamed from: b */
    private final boolean f9877b;

    /* renamed from: c */
    private final boolean f9878c;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f9879a = true;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f9880b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f9881c = false;

        public final VideoOptions build() {
            return new VideoOptions(this);
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.f9881c = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.f9880b = z;
            return this;
        }

        public final Builder setStartMuted(boolean z) {
            this.f9879a = z;
            return this;
        }
    }

    private VideoOptions(Builder builder) {
        this.f9876a = builder.f9879a;
        this.f9877b = builder.f9880b;
        this.f9878c = builder.f9881c;
    }

    public VideoOptions(zzmu zzmu) {
        this.f9876a = zzmu.f15511a;
        this.f9877b = zzmu.f15512b;
        this.f9878c = zzmu.f15513c;
    }

    public final boolean getClickToExpandRequested() {
        return this.f9878c;
    }

    public final boolean getCustomControlsRequested() {
        return this.f9877b;
    }

    public final boolean getStartMuted() {
        return this.f9876a;
    }
}
