package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.i */
public final class C4524i {
    /* renamed from: a */
    public static int m22614a(int i) {
        if ((i < 0 || i > 1) && (1000 > i || i > 1002)) {
            return 1;
        }
        return i;
    }

    /* renamed from: b */
    public static Status m22615b(int i) {
        if (i == 1) {
            i = 13;
        }
        return new Status(i);
    }
}
