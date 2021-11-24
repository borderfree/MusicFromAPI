package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.firebase.C4890b;
import com.google.firebase.analytics.connector.C4884a;
import com.google.firebase.components.C4900a;
import com.google.firebase.components.C4905d;
import com.google.firebase.components.C4906e;
import com.google.firebase.p134a.C4883d;
import java.util.Collections;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements C4905d {
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C4900a<?>> getComponents() {
        return Collections.singletonList(C4900a.m24437a(C4884a.class).mo16128a(C4906e.m24461a(C4890b.class)).mo16128a(C4906e.m24461a(Context.class)).mo16128a(C4906e.m24461a(C4883d.class)).mo16127a(C4888a.f17586a).mo16129b().mo16130c());
    }
}
