package com.seattleclouds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;

public class OneFragmentActivity extends C6348n {

    /* renamed from: n */
    private static final String f18568n = "OneFragmentActivity";

    /* renamed from: o */
    private Bundle f18569o = null;

    /* renamed from: a */
    public static Intent m25751a(Context context, Class<? extends Fragment> cls) {
        Intent intent = new Intent(context, OneFragmentActivity.class);
        intent.putExtra("ARG_COMPAT_FRAGMENT_CLASS_NAME", cls.getName());
        return intent;
    }

    /* renamed from: a */
    public static Intent m25752a(Context context, Class<? extends Fragment> cls, boolean z) {
        Intent intent = new Intent(context, OneFragmentActivity.class);
        intent.putExtra("ARG_COMPAT_FRAGMENT_CLASS_NAME", cls.getName());
        intent.putExtra("ARG_RETAIN_FRAGMENT", z);
        return intent;
    }

    /* renamed from: b */
    public static Intent m25753b(Context context, Class<? extends android.app.Fragment> cls) {
        Intent intent = new Intent(context, OneFragmentActivity.class);
        intent.putExtra("ARG_FRAGMENT_CLASS_NAME", cls.getName());
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString("ARG_FRAGMENT_CLASS_NAME");
                String string2 = extras.getString("ARG_COMPAT_FRAGMENT_CLASS_NAME");
                boolean z = extras.getBoolean("ARG_RETAIN_FRAGMENT", false);
                this.f18569o = extras.getBundle("LOGIN_REGISTER_PAGE_STYLE");
                extras.remove("ARG_FRAGMENT_CLASS_NAME");
                extras.remove("ARG_COMPAT_FRAGMENT_CLASS_NAME");
                extras.remove("ARG_RETAIN_FRAGMENT");
                if (string2 != null) {
                    Fragment a = Fragment.m1271a((Context) this, string2, extras);
                    a.mo1280d(z);
                    if (this.f18569o != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBundle("LOGIN_REGISTER_PAGE_STYLE", this.f18569o);
                        a.mo1289g(bundle2);
                    }
                    mo1469g().mo1536a().mo1411a(16908290, a, "fragment").mo1428c();
                } else if (string != null) {
                    android.app.Fragment instantiate = android.app.Fragment.instantiate(this, string, extras);
                    instantiate.setRetainInstance(z);
                    if (this.f18569o != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putBundle("LOGIN_REGISTER_PAGE_STYLE", this.f18569o);
                        instantiate.setArguments(bundle3);
                    }
                    getFragmentManager().beginTransaction().add(16908290, instantiate, "fragment").commit();
                } else {
                    Log.w(f18568n, "Fragment class name not specified or invalid");
                }
            }
        }
    }
}
