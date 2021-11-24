package com.seattleclouds;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C5451m.C5465n;
import com.seattleclouds.ads.AdsManagerKeys;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.ads.RemoveAdsActivity;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.p157b.C5302b;
import com.seattleclouds.util.C6595ao;

public class SettingsActivity extends C6348n {

    /* renamed from: com.seattleclouds.SettingsActivity$a */
    public static final class C5217a extends PreferenceFragment {
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            addPreferencesFromResource(C5465n.pref_app);
            Preference findPreference = findPreference("pref_forceSync");
            findPreference.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    C5217a.this.getActivity().setResult(1);
                    C5217a.this.getActivity().finish();
                    return true;
                }
            });
            if (!App.f18510l && !App.f18501c.mo16930a("forceSync")) {
                getPreferenceScreen().removePreference(findPreference);
            } else if (App.f18510l) {
                findPreference.setTitle(C5462k.settings_pref_force_sync_previewer);
                findPreference.setSummary(C5462k.settings_pref_force_sync_summary_previewer);
            }
            Preference findPreference2 = findPreference("pref_clearResources");
            findPreference2.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    new C0766a(C5217a.this.getActivity()).mo3047a(C5462k.settings_clear_resources_title).mo3060b(App.f18510l ? C5462k.settings_clear_resources_warning_previewer : C5462k.settings_clear_resources_warning).mo3048a(C5462k.settings_clear_resources_button, (OnClickListener) new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C5302b.m26515a();
                            Toast.makeText(C5217a.this.getActivity(), C5462k.settings_resources_cleared, 0).show();
                            C5217a.this.getActivity().setResult(App.f18510l ? 2 : 1);
                            C5217a.this.getActivity().finish();
                        }
                    }).mo3061b(C5462k.cancel, (OnClickListener) new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).mo3068c();
                    return true;
                }
            });
            if (!App.f18510l && !App.f18501c.mo16930a("clearResources")) {
                getPreferenceScreen().removePreference(findPreference2);
            }
            Preference findPreference3 = findPreference("pref_appUserSignOut");
            findPreference3.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    C5217a.this.getActivity().setResult(3);
                    C5217a.this.getActivity().finish();
                    return true;
                }
            });
            if (!(C5279b.m26372a() && (App.f18510l || App.f18501c.mo16930a("appUserSignOut")))) {
                getPreferenceScreen().removePreference(findPreference3);
            }
            Preference findPreference4 = findPreference("pref_removeAds");
            if (!AdsManagerKeys.m26119b().mo17222c() || !App.f18501c.mo16930a("adsremove") || C5260d.m26241a().mo17273c()) {
                getPreferenceScreen().removePreference(findPreference4);
                return;
            }
            findPreference4.setTitle(C5462k.settings_pref_app_remove_ads);
            findPreference4.setSummary(C5462k.settings_pref_app_remove_ads_summary);
            findPreference4.setOnPreferenceClickListener(new OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    if (!App.f18501c.mo16930a("removeAds")) {
                        C6595ao.m31928a((Context) C5217a.this.getActivity(), C5217a.this.getString(C5462k.settings_pref_remove_ads_disabled));
                    } else if (AdsManagerKeys.m26119b().mo17236q().isEmpty()) {
                        Toast.makeText(C5217a.this.getActivity(), C5462k.remove_ads_error_empty, 1).show();
                    } else {
                        RemoveAdsActivity.m26153a(C5217a.this.getActivity());
                    }
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(16908290, new C5217a(), "fragment").commit();
        }
    }
}
