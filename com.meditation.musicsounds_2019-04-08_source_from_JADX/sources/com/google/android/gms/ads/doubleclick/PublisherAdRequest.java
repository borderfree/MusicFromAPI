package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.aoz;
import com.google.android.gms.internal.ads.apa;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class PublisherAdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;

    /* renamed from: a */
    private final aoz f9883a;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final apa f9884a = new apa();

        public final Builder addCategoryExclusion(String str) {
            this.f9884a.mo12186g(str);
            return this;
        }

        public final Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.f9884a.mo12178b(cls, bundle);
            return this;
        }

        public final Builder addCustomTargeting(String str, String str2) {
            this.f9884a.mo12175a(str, str2);
            return this;
        }

        public final Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.f9884a.mo12175a(str, TextUtils.join(",", list));
            }
            return this;
        }

        public final Builder addKeyword(String str) {
            this.f9884a.mo12174a(str);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.f9884a.mo12172a(networkExtras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f9884a.mo12173a(cls, bundle);
            return this;
        }

        public final Builder addTestDevice(String str) {
            this.f9884a.mo12179b(str);
            return this;
        }

        public final PublisherAdRequest build() {
            return new PublisherAdRequest(this);
        }

        public final Builder setBirthday(Date date) {
            this.f9884a.mo12176a(date);
            return this;
        }

        public final Builder setContentUrl(String str) {
            C3266s.m14914a(str, (Object) "Content URL must be non-null.");
            C3266s.m14916a(str, (Object) "Content URL must be non-empty.");
            C3266s.m14925b(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length()));
            this.f9884a.mo12183d(str);
            return this;
        }

        public final Builder setGender(int i) {
            this.f9884a.mo12170a(i);
            return this;
        }

        public final Builder setIsDesignedForFamilies(boolean z) {
            this.f9884a.mo12182c(z);
            return this;
        }

        public final Builder setLocation(Location location) {
            this.f9884a.mo12171a(location);
            return this;
        }

        @Deprecated
        public final Builder setManualImpressionsEnabled(boolean z) {
            this.f9884a.mo12177a(z);
            return this;
        }

        public final Builder setPublisherProvidedId(String str) {
            this.f9884a.mo12184e(str);
            return this;
        }

        public final Builder setRequestAgent(String str) {
            this.f9884a.mo12185f(str);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean z) {
            this.f9884a.mo12180b(z);
            return this;
        }
    }

    private PublisherAdRequest(Builder builder) {
        this.f9883a = new aoz(builder.f9884a);
    }

    public static void updateCorrelator() {
    }

    public final Date getBirthday() {
        return this.f9883a.mo12152a();
    }

    public final String getContentUrl() {
        return this.f9883a.mo12155b();
    }

    public final <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f9883a.mo12157c(cls);
    }

    public final Bundle getCustomTargeting() {
        return this.f9883a.mo12167m();
    }

    public final int getGender() {
        return this.f9883a.mo12156c();
    }

    public final Set<String> getKeywords() {
        return this.f9883a.mo12158d();
    }

    public final Location getLocation() {
        return this.f9883a.mo12159e();
    }

    public final boolean getManualImpressionsEnabled() {
        return this.f9883a.mo12160f();
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return this.f9883a.mo12151a(cls);
    }

    public final <T extends MediationAdapter> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f9883a.mo12154b(cls);
    }

    public final String getPublisherProvidedId() {
        return this.f9883a.mo12161g();
    }

    public final boolean isTestDevice(Context context) {
        return this.f9883a.mo12153a(context);
    }

    public final aoz zzay() {
        return this.f9883a;
    }
}