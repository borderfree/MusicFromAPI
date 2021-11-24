package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.measurement.internal.C4638av;
import com.google.android.gms.measurement.internal.C4666bw;
import com.google.android.gms.measurement.internal.C4683cm;
import com.google.android.gms.measurement.internal.C4762m;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: a */
    private final C4638av f16625a;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
            C3266s.m14913a(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            if (conditionalUserProperty.mValue != null) {
                this.mValue = C4683cm.m23209a(conditionalUserProperty.mValue);
                if (this.mValue == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    public static final class C4615a extends C4666bw {
    }

    public AppMeasurement(C4638av avVar) {
        C3266s.m14913a(avVar);
        this.f16625a = avVar;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return C4638av.m23035a(context, (C4762m) null).mo15342i();
    }

    /* renamed from: a */
    public void mo15195a(String str, String str2, Object obj) {
        C3266s.m14915a(str);
        this.f16625a.mo15341h().mo15416a(str, str2, obj, true);
    }

    /* renamed from: a */
    public final void mo15196a(boolean z) {
        this.f16625a.mo15341h().mo15419a(z);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f16625a.mo15323A().mo15235a(str, this.f16625a.mo15248m().mo11327b());
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f16625a.mo15341h().mo15422c(str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        this.f16625a.mo15341h().mo15418a(str, str2, str3, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f16625a.mo15323A().mo15237b(str, this.f16625a.mo15248m().mo11327b());
    }

    @Keep
    public long generateEventId() {
        return this.f16625a.mo15343j().mo15598g();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f16625a.mo15341h().mo15424x();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        return this.f16625a.mo15341h().mo15406a(str, str2);
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        return this.f16625a.mo15341h().mo15407a(str, str2, str3);
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f16625a.mo15341h().mo15404A();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f16625a.mo15341h().mo15426z();
    }

    @Keep
    public String getGmpAppId() {
        return this.f16625a.mo15341h().mo15405B();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        this.f16625a.mo15341h();
        C3266s.m14915a(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f16625a.mo15341h().mo15409a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        return this.f16625a.mo15341h().mo15408a(str, str2, str3, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f16625a.mo15341h().mo15413a(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        this.f16625a.mo15341h().mo15410a(conditionalUserProperty);
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        this.f16625a.mo15341h().mo15420b(conditionalUserProperty);
    }
}
