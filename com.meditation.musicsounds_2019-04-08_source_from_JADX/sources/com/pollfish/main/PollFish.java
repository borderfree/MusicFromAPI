package com.pollfish.main;

import android.app.Activity;
import android.util.Log;
import android.view.ViewGroup;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5180f;
import com.pollfish.interfaces.PollfishClosedListener;
import com.pollfish.interfaces.PollfishOpenedListener;
import com.pollfish.interfaces.PollfishSurveyCompletedListener;
import com.pollfish.interfaces.PollfishSurveyNotAvailableListener;
import com.pollfish.interfaces.PollfishSurveyReceivedListener;
import com.pollfish.interfaces.PollfishUserNotEligibleListener;
import com.pollfish.p148d.C5131a;
import com.pollfish.p150f.C5148a;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;
import java.util.Map;

public class PollFish {
    protected static String TAG = "PollFish";
    protected static C5131a overlayLayout;
    protected static Activity pollfishActivity;

    private static void Initialise(Activity activity, String str, Position position, int i, boolean z, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, String str2, boolean z2, int i2, ViewGroup viewGroup, String str3, boolean z3) {
        boolean z4;
        Class<C5148a> cls = C5148a.class;
        boolean z5 = false;
        C5148a.f18370a = false;
        pollfishActivity = activity;
        overlayLayout = null;
        String str4 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Postback server-to-server param - request_uuid: ");
        sb.append(str3);
        C5162b.m25518a(str4, sb.toString());
        if (i2 >= 0) {
            z4 = true;
        } else if (!z3) {
            C5162b.m25520c(TAG, "Pollfish mode based on key used to sign the app");
            if ((activity.getApplicationInfo().flags & 2) != 0) {
                z5 = true;
            }
            z4 = z5;
        } else {
            C5162b.m25520c(TAG, "Pollfish mode based on developer choice in init");
            String str5 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pollfish mode : ");
            boolean z6 = z2;
            sb2.append(z6);
            C5162b.m25520c(str5, sb2.toString());
            z4 = z6;
        }
        String trim = str.trim();
        if (z4) {
            Log.w(TAG, "Pollfish runs in developer mode");
        }
        if (z) {
            Log.w(TAG, "Pollfish runs in custom mode");
        }
        boolean a = C5166c.m25537a(activity);
        Log.w(TAG, "You are using Pollfish SDK for Google Play Store");
        String str6 = str2 != null ? str2 : "https://wss.pollfish.com";
        String str7 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("server To Connect Url: ");
        sb3.append(str6);
        C5162b.m25518a(str7, sb3.toString());
        if (a) {
            C5162b.m25518a(TAG, "All permissions in place");
            try {
                C5148a aVar = new C5148a(activity, trim, z4, position, i, z, new C5180f() {
                    /* renamed from: a */
                    public void mo16839a(C5131a aVar) {
                        C5131a aVar2;
                        boolean z;
                        C5162b.m25518a(PollFish.TAG, "OnSurveyRenderedListenerListener - use generated overlayLayout");
                        PollFish.overlayLayout = aVar;
                        String str = PollFish.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("shouldHide: ");
                        sb.append(C5148a.f18370a);
                        C5162b.m25518a(str, sb.toString());
                        if (PollFish.overlayLayout != null && C5148a.f18370a) {
                            aVar2 = PollFish.overlayLayout;
                            z = true;
                        } else if (PollFish.overlayLayout != null && !C5148a.f18370a) {
                            aVar2 = PollFish.overlayLayout;
                            z = false;
                        } else {
                            return;
                        }
                        aVar2.mo16740b(z);
                    }
                }, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, str6, i2, viewGroup, str3);
                aVar.mo16775a();
            } catch (Exception e) {
                String str8 = TAG;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Error while trying to begin LifeCycle: ");
                sb4.append(e);
                C5162b.m25519b(str8, sb4.toString());
            }
        } else {
            Log.w(TAG, "Pollfish requires the following permission: INTERNET. Please place it in your manifest file");
        }
    }

    public static void customInit(Activity activity, String str, Position position, int i) {
        Initialise(activity, str, position, i, true, null, null, null, null, null, null, null, false, -1, null, null, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, ViewGroup viewGroup) {
        Initialise(activity, str, position, i, true, null, null, null, null, null, null, null, false, -1, viewGroup, null, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, ViewGroup viewGroup, String str2) {
        Initialise(activity, str, position, i, true, null, null, null, null, null, null, null, false, -1, viewGroup, str2, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener) {
        Initialise(activity, str, position, i, true, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, null, null, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup) {
        Initialise(activity, str, position, i, true, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, viewGroup, null, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup, String str2) {
        Initialise(activity, str, position, i, true, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, viewGroup, str2, false);
    }

    public static void customInit(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup, String str2, boolean z) {
        Initialise(activity, str, position, i, true, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, z, -1, viewGroup, str2, true);
    }

    public static void customInit(Activity activity, String str, Position position, int i, boolean z) {
        Initialise(activity, str, position, i, true, null, null, null, null, null, null, null, z, -1, null, null, true);
    }

    public static void hide() {
        C5162b.m25518a(TAG, "manually called hide()");
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("overlayLayout: ");
        sb.append(overlayLayout);
        C5162b.m25518a(str, sb.toString());
        Class<C5148a> cls = C5148a.class;
        C5148a.f18370a = true;
        if (overlayLayout == null) {
            return;
        }
        if (pollfishActivity != null) {
            pollfishActivity.runOnUiThread(new Runnable() {
                public void run() {
                    PollFish.overlayLayout.mo16747h();
                }
            });
        } else {
            C5162b.m25519b(TAG, "pollfishActivity==null");
        }
    }

    public static void init(Activity activity, String str, Position position, int i) {
        Initialise(activity, str, position, i, false, null, null, null, null, null, null, null, false, -1, null, null, false);
    }

    public static void init(Activity activity, String str, Position position, int i, ViewGroup viewGroup) {
        Initialise(activity, str, position, i, false, null, null, null, null, null, null, null, false, -1, viewGroup, null, false);
    }

    public static void init(Activity activity, String str, Position position, int i, ViewGroup viewGroup, String str2) {
        Initialise(activity, str, position, i, false, null, null, null, null, null, null, null, false, -1, viewGroup, str2, false);
    }

    public static void init(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener) {
        Initialise(activity, str, position, i, false, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, null, null, false);
    }

    public static void init(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup) {
        Initialise(activity, str, position, i, false, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, viewGroup, null, false);
    }

    public static void init(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup, String str2) {
        Initialise(activity, str, position, i, false, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, false, -1, viewGroup, str2, false);
    }

    public static void init(Activity activity, String str, Position position, int i, PollfishSurveyReceivedListener pollfishSurveyReceivedListener, PollfishSurveyNotAvailableListener pollfishSurveyNotAvailableListener, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, ViewGroup viewGroup, String str2, boolean z) {
        Initialise(activity, str, position, i, false, pollfishSurveyReceivedListener, pollfishSurveyNotAvailableListener, pollfishSurveyCompletedListener, pollfishOpenedListener, pollfishClosedListener, pollfishUserNotEligibleListener, null, z, -1, viewGroup, str2, true);
    }

    private static void init(Activity activity, String str, Position position, int i, String str2, boolean z, int i2, ViewGroup viewGroup, String str3) {
        Initialise(activity, str, position, i, false, null, null, null, null, null, null, str2, z, i2, viewGroup, str3, true);
    }

    public static void init(Activity activity, String str, Position position, int i, boolean z) {
        Initialise(activity, str, position, i, false, null, null, null, null, null, null, null, z, -1, null, null, true);
    }

    public static boolean isPollfishPanelOpen() {
        if (overlayLayout != null) {
            return overlayLayout.mo16742c(true);
        }
        return false;
    }

    public static void setAttributesMap(Map map) {
        if (map == null || map.size() <= 0) {
            Log.e(TAG, "Attributes Map cannot be null or empty");
        } else if (overlayLayout != null) {
            overlayLayout.mo16735a(map);
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("setAttributesMap - attrMap:");
            sb.append(map.toString());
            C5162b.m25518a(str, sb.toString());
        } else {
            C5162b.m25518a(TAG, "setAttributesMap - PollFish.overlayLayout == null");
        }
    }

    public static void show() {
        C5162b.m25518a(TAG, "manually called show()");
        Class<C5148a> cls = C5148a.class;
        C5148a.f18370a = false;
        if (overlayLayout == null) {
            return;
        }
        if (pollfishActivity != null) {
            pollfishActivity.runOnUiThread(new Runnable() {
                public void run() {
                    PollFish.overlayLayout.mo16748i();
                }
            });
        } else {
            C5162b.m25519b(TAG, "pollfishActivity==null");
        }
    }
}
