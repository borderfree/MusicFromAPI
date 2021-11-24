package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.g */
public interface C3141g {
    /* renamed from: a */
    <T extends LifecycleCallback> T mo11009a(String str, Class<T> cls);

    /* renamed from: a */
    void mo11010a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: j_ */
    Activity mo11012j_();

    void startActivityForResult(Intent intent, int i);
}
