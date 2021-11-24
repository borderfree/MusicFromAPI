package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.support.p009v4.app.Fragment;
import com.google.android.gms.common.internal.C3244g;

public final class GooglePlayServicesUtil extends C3183f {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (C3183f.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C3177d.m14629a().mo11108a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C3183f.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C3183f.getErrorString(i);
    }

    public static Context getRemoteContext(Context context) {
        return C3183f.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return C3183f.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C3183f.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C3183f.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C3183f.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (C3183f.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C3177d a = C3177d.m14629a();
        if (fragment == null) {
            return a.mo11120b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = C3177d.m14628a((Context) activity, i, C3244g.m14860a(fragment, C3177d.m14629a().mo11111a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        C3177d.m14630a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C3177d a = C3177d.m14629a();
        if (C3183f.isPlayServicesPossiblyUpdating(context, i) || C3183f.isPlayStorePossiblyUpdating(context, i)) {
            a.mo11119b(context);
        } else {
            a.mo11113a(context, i);
        }
    }
}
