package com.seattleclouds.modules.p187t;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.util.C6638s;

/* renamed from: com.seattleclouds.modules.t.b */
public class C6289b extends C2422c {
    public C6289b(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo8568a(Object obj) {
        String valueOf = String.valueOf(obj);
        return (valueOf.startsWith("http://") || valueOf.startsWith("https://")) ? super.mo8568a(obj) : C6638s.m32069a(valueOf, this.f7714a, this.f7715b, true);
    }
}
