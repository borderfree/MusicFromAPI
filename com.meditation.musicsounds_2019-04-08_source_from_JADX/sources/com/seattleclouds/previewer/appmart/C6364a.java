package com.seattleclouds.previewer.appmart;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.preference.PreferenceManager;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.seattleclouds.previewer.appmart.a */
public class C6364a {

    /* renamed from: com.seattleclouds.previewer.appmart.a$a */
    public static class C6365a extends DialogFragment {
        public Dialog onCreateDialog(Bundle bundle) {
            int i = C5462k.previewer_appmart_privacy_dialog_title;
            int i2 = C5462k.previewer_appmart_privacy_dialog_message;
            int i3 = C5462k.previewer_appmart_privacy_dialog_pos_button;
            int i4 = C5462k.previewer_appmart_privacy_dialog_neg_button;
            Iterator it = new PrivacyPolicyUtil$PrivacyPolicyDialogFragment$1(this).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Locale) it.next()).getISO3Language().equals(Locale.getDefault().getISO3Language())) {
                        i = C5462k.previewer_appmart_privacy_dialog_title_ch;
                        i2 = C5462k.previewer_appmart_privacy_dialog_message_ch;
                        i3 = C5462k.previewer_appmart_privacy_dialog_pos_button_ch;
                        i4 = C5462k.previewer_appmart_privacy_dialog_neg_button_ch;
                        break;
                    }
                } else {
                    break;
                }
            }
            C0766a aVar = new C0766a(getActivity());
            aVar.mo3056a(false).mo3047a(i).mo3060b(i2).mo3048a(i3, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C6364a.m30919c();
                    C6365a.this.dismiss();
                }
            }).mo3061b(i4, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Activity activity = C6365a.this.getActivity();
                    if (activity != null) {
                        if (VERSION.SDK_INT >= 21) {
                            activity.finishAndRemoveTask();
                        } else {
                            activity.finish();
                        }
                    }
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                }
            });
            return aVar.mo3065b();
        }
    }

    /* renamed from: a */
    public static void m30917a(Activity activity) {
        if (App.f18511m) {
            if (activity == null) {
                Log.e("PrivacyPolicyUtil", "Activity is null");
            } else if (m30918b()) {
                Log.d("PrivacyPolicyUtil", "Privacy was accepted");
            } else if (activity.getFragmentManager().findFragmentByTag("PrivacyPolicyUtil") != null) {
                Log.d("PrivacyPolicyUtil", "Privacy is being shown");
            } else {
                new C6365a().show(activity.getFragmentManager(), "PrivacyPolicyUtil");
            }
        }
    }

    /* renamed from: b */
    private static boolean m30918b() {
        return PreferenceManager.getDefaultSharedPreferences(App.m25647e()).getBoolean("KEY_PREF_PRIVACY_ACCEPTED", false);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m30919c() {
        PreferenceManager.getDefaultSharedPreferences(App.m25647e()).edit().putBoolean("KEY_PREF_PRIVACY_ACCEPTED", true).apply();
    }
}
