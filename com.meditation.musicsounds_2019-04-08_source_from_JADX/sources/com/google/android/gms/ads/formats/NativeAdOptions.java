package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.internal.ads.C3464ci;

@C3464ci
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* renamed from: a */
    private final boolean f9887a;

    /* renamed from: b */
    private final int f9888b;

    /* renamed from: c */
    private final boolean f9889c;

    /* renamed from: d */
    private final int f9890d;

    /* renamed from: e */
    private final VideoOptions f9891e;

    public @interface AdChoicesPlacement {
    }

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f9892a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f9893b = -1;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f9894c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public VideoOptions f9895d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f9896e = 1;

        public final NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        public final Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.f9896e = i;
            return this;
        }

        public final Builder setImageOrientation(int i) {
            this.f9893b = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.f9894c = z;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.f9892a = z;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.f9895d = videoOptions;
            return this;
        }
    }

    private NativeAdOptions(Builder builder) {
        this.f9887a = builder.f9892a;
        this.f9888b = builder.f9893b;
        this.f9889c = builder.f9894c;
        this.f9890d = builder.f9896e;
        this.f9891e = builder.f9895d;
    }

    public final int getAdChoicesPlacement() {
        return this.f9890d;
    }

    public final int getImageOrientation() {
        return this.f9888b;
    }

    public final VideoOptions getVideoOptions() {
        return this.f9891e;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.f9889c;
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.f9887a;
    }
}
