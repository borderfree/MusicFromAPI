package com.google.android.vending.expansion.downloader.impl;

import android.os.Build.VERSION;
import com.google.android.vending.expansion.downloader.impl.C4850e.C4851a;

/* renamed from: com.google.android.vending.expansion.downloader.impl.c */
public class C4848c {
    /* renamed from: a */
    public static C4851a m24258a() {
        return VERSION.SDK_INT > 13 ? new C4856g() : new C4857h();
    }
}
