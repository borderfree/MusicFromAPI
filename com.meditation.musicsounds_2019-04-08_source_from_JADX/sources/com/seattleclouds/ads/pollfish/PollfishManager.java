package com.seattleclouds.ads.pollfish;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.PollfishClosedListener;
import com.pollfish.interfaces.PollfishOpenedListener;
import com.pollfish.interfaces.PollfishSurveyCompletedListener;
import com.pollfish.interfaces.PollfishSurveyNotAvailableListener;
import com.pollfish.interfaces.PollfishSurveyReceivedListener;
import com.pollfish.interfaces.PollfishUserNotEligibleListener;
import com.pollfish.main.PollFish;
import com.seattleclouds.App;
import com.seattleclouds.ads.C5260d;
import java.util.HashMap;

public class PollfishManager implements PollfishClosedListener, PollfishOpenedListener, PollfishSurveyCompletedListener, PollfishSurveyNotAvailableListener, PollfishSurveyReceivedListener, PollfishUserNotEligibleListener {

    /* renamed from: a */
    private static PollfishManager f18865a;

    /* renamed from: b */
    private static final HashMap<String, Position> f18866b = new HashMap<String, Position>() {
        private static final long serialVersionUID = 1;

        {
            put("tl", Position.TOP_LEFT);
            put("tr", Position.TOP_RIGHT);
            put("ml", Position.MIDDLE_LEFT);
            put("mr", Position.MIDDLE_RIGHT);
            put("bl", Position.BOTTOM_LEFT);
            put("br", Position.BOTTOM_RIGHT);
        }
    };

    /* renamed from: a */
    public static PollfishManager m26261a() {
        if (f18865a == null) {
            f18865a = new PollfishManager();
        }
        return f18865a;
    }

    public static void show(Activity activity) {
        m26261a().mo17284a(activity);
    }

    /* renamed from: a */
    public void mo17284a(Activity activity) {
        String l = App.f18501c.mo16971l();
        if (activity != null && !TextUtils.isEmpty(l) && !C5260d.m26241a().mo17273c()) {
            Position position = (Position) f18866b.get(App.f18501c.mo16974m());
            if (position != null) {
                PollFish.init(activity, l, position, App.f18501c.mo16977n(), this, this, this, this, this, this, null, null, App.f18510l);
            }
        }
    }

    public void onPollfishClosed() {
    }

    public void onPollfishOpened() {
    }

    public void onPollfishSurveyCompleted(boolean z, int i) {
    }

    public void onPollfishSurveyNotAvailable() {
        Log.w("PollfishManager", "Survey not available at this moment");
    }

    public void onPollfishSurveyReceived(boolean z, int i) {
    }

    public void onUserNotEligible() {
        Log.w("PollfishManager", "onUserNotEligible");
    }
}
