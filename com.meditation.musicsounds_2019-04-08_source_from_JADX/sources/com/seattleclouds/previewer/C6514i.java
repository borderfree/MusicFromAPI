package com.seattleclouds.previewer;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C5451m.C5465n;
import com.seattleclouds.ads.p156b.C5248a;

/* renamed from: com.seattleclouds.previewer.i */
public class C6514i extends PreferenceFragment {

    /* renamed from: com.seattleclouds.previewer.i$a */
    static class C6515a {

        /* renamed from: a */
        private static boolean f23098a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static boolean f23099b;

        /* renamed from: c */
        private static OnSharedPreferenceChangeListener f23100c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static C6517a f23101d;

        /* renamed from: com.seattleclouds.previewer.i$a$a */
        interface C6517a {
            /* renamed from: a */
            void mo20166a();
        }

        /* renamed from: a */
        public static void m31518a(C6517a aVar) {
            f23101d = aVar;
        }

        /* renamed from: a */
        public static boolean m31520a(Context context) {
            if (!f23098a) {
                m31523b(context);
            }
            return f23099b;
        }

        /* renamed from: b */
        private static void m31523b(Context context) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            final String string = context.getString(C5462k.previewer_settings_show_ads_key);
            f23099b = defaultSharedPreferences.getBoolean(string, false);
            f23098a = true;
            if (f23100c == null) {
                f23100c = new OnSharedPreferenceChangeListener() {
                    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        if (string.equals(str)) {
                            boolean z = sharedPreferences.getBoolean(string, false);
                            if (z != C6515a.f23099b) {
                                C6515a.f23099b = z;
                                if (C6515a.f23101d != null) {
                                    C6515a.f23101d.mo20166a();
                                }
                            }
                        }
                    }
                };
                defaultSharedPreferences.registerOnSharedPreferenceChangeListener(f23100c);
            }
        }
    }

    /* renamed from: a */
    static void m31517a(Context context) {
        context.startActivity(PreviewerOneFragmentActivity.m30892d(context, C6514i.class));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivity().setTitle(C5462k.previewer_settings_title);
        addPreferencesFromResource(C5465n.pref_previewer);
        if (!C5248a.m26201a()) {
            getPreferenceScreen().removePreference(findPreference(getString(C5462k.previewer_settings_show_ads_key)));
        }
    }
}
