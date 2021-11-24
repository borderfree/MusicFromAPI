package com.seattleclouds.previewer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import com.seattleclouds.C5232ac;
import com.seattleclouds.OneFragmentActivity;

public class PreviewerOneFragmentActivity extends OneFragmentActivity {
    /* renamed from: b */
    public static Intent m30890b(Context context, Class<? extends Fragment> cls, boolean z) {
        Intent a = OneFragmentActivity.m25752a(context, cls, z);
        a.setClass(context, PreviewerOneFragmentActivity.class);
        return a;
    }

    /* renamed from: c */
    public static Intent m30891c(Context context, Class<? extends Fragment> cls) {
        Intent a = OneFragmentActivity.m25751a(context, cls);
        a.setClass(context, PreviewerOneFragmentActivity.class);
        return a;
    }

    /* renamed from: d */
    public static Intent m30892d(Context context, Class<? extends android.app.Fragment> cls) {
        Intent b = OneFragmentActivity.m25753b(context, cls);
        b.setClass(context, PreviewerOneFragmentActivity.class);
        return b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo19774a(C5232ac.m26100m());
        super.onCreate(bundle);
    }
}
