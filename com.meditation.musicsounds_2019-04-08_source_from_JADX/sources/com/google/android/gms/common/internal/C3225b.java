package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public class C3225b {
    /* renamed from: a */
    public static ApiException m14749a(Status status) {
        return status.mo10794c() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
