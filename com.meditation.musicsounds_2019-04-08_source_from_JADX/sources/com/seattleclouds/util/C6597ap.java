package com.seattleclouds.util;

import android.app.Activity;
import android.content.Context;
import android.support.p009v4.app.C0396q;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.seattleclouds.C5451m.C5452a;
import java.util.HashMap;

/* renamed from: com.seattleclouds.util.ap */
public class C6597ap {

    /* renamed from: a */
    private static final String f23313a = "ap";

    /* renamed from: b */
    private static boolean f23314b = false;

    /* renamed from: c */
    private static HashMap<String, HashMap<String, Integer>> f23315c;

    /* renamed from: a */
    public static HashMap<String, HashMap<String, Integer>> m31931a() {
        if (f23315c == null) {
            if (f23314b) {
                Log.d(f23313a, "TRANSITIONS INIT");
            }
            f23315c = new HashMap<>(7);
            HashMap hashMap = new HashMap();
            hashMap.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_fade_enter));
            hashMap.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_fade_exit));
            hashMap.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_fade_pop_enter));
            hashMap.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_fade_pop_exit));
            f23315c.put("FADE", hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_down_enter));
            hashMap2.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_down_exit));
            hashMap2.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_down_pop_enter));
            hashMap2.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_down_pop_exit));
            f23315c.put("PUSH_FROM_TOP", hashMap2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_up_enter));
            hashMap3.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_up_exit));
            hashMap3.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_up_pop_enter));
            hashMap3.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_up_pop_exit));
            f23315c.put("PUSH_FROM_BOTTOM", hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_left_enter));
            hashMap4.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_left_exit));
            hashMap4.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_left_pop_enter));
            hashMap4.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_left_pop_exit));
            f23315c.put("PUSH_FROM_RIGHT", hashMap4);
            HashMap hashMap5 = new HashMap();
            hashMap5.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_right_enter));
            hashMap5.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_right_exit));
            hashMap5.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_push_right_pop_enter));
            hashMap5.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_push_right_pop_exit));
            f23315c.put("PUSH_FROM_LEFT", hashMap5);
            HashMap hashMap6 = new HashMap();
            hashMap6.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_zoom_enter));
            hashMap6.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_zoom_exit));
            hashMap6.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_zoom_pop_enter));
            hashMap6.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_zoom_pop_exit));
            f23315c.put("ZOOM_IN", hashMap6);
            HashMap hashMap7 = new HashMap();
            hashMap7.put("ENTER_TRANSITION", Integer.valueOf(C5452a.sc_flip_enter));
            hashMap7.put("EXIT_TRANSITION", Integer.valueOf(C5452a.sc_flip_exit));
            hashMap7.put("POP_ENTER_TRANSITION", Integer.valueOf(C5452a.sc_flip_pop_enter));
            hashMap7.put("POP_EXIT_TRANSITION", Integer.valueOf(C5452a.sc_flip_pop_exit));
            f23315c.put("FLIP_FROM_LEFT", hashMap7);
        }
        return f23315c;
    }

    /* renamed from: a */
    public static void m31932a(Context context, View view, View view2, String str) {
        if (f23314b) {
            String str2 = f23313a;
            StringBuilder sb = new StringBuilder();
            sb.append("TRANSITION: ");
            sb.append(str);
            Log.d(str2, sb.toString());
        }
        if (!(str == null || str.length() == 0 || str.equalsIgnoreCase("NONE"))) {
            HashMap hashMap = (HashMap) m31931a().get(str);
            Integer.valueOf(0);
            Integer.valueOf(0);
            if (hashMap != null) {
                Integer num = (Integer) hashMap.get("EXIT_TRANSITION");
                Integer num2 = (Integer) hashMap.get("ENTER_TRANSITION");
                Animation loadAnimation = AnimationUtils.loadAnimation(context, num.intValue());
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, num2.intValue());
                view.startAnimation(loadAnimation);
                view2.startAnimation(loadAnimation2);
            }
        }
        view.setVisibility(8);
        view2.setVisibility(0);
    }

    /* renamed from: a */
    public static void m31933a(Context context, View view, String str) {
        if (f23314b) {
            String str2 = f23313a;
            StringBuilder sb = new StringBuilder();
            sb.append("TRANSITION: ");
            sb.append(str);
            Log.d(str2, sb.toString());
        }
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("NONE")) {
            view.setVisibility(0);
            return;
        }
        HashMap hashMap = (HashMap) m31931a().get(str);
        Integer.valueOf(0);
        if (hashMap != null) {
            view.startAnimation(AnimationUtils.loadAnimation(context, ((Integer) hashMap.get("ENTER_TRANSITION")).intValue()));
        }
        view.setVisibility(0);
    }

    /* renamed from: a */
    public static void m31934a(String str, Activity activity) {
        if (f23314b) {
            String str2 = f23313a;
            StringBuilder sb = new StringBuilder();
            sb.append("TRANSITION: ");
            sb.append(str);
            Log.d(str2, sb.toString());
        }
        if (str != null && str.length() != 0 && !str.equalsIgnoreCase("NONE")) {
            HashMap hashMap = (HashMap) m31931a().get(str);
            Integer.valueOf(0);
            Integer.valueOf(0);
            if (hashMap != null) {
                activity.overridePendingTransition(((Integer) hashMap.get("ENTER_TRANSITION")).intValue(), ((Integer) hashMap.get("EXIT_TRANSITION")).intValue());
            }
        }
    }

    /* renamed from: a */
    public static void m31935a(String str, C0396q qVar) {
        if (f23314b) {
            String str2 = f23313a;
            StringBuilder sb = new StringBuilder();
            sb.append("TRANSITION: ");
            sb.append(str);
            Log.d(str2, sb.toString());
        }
        if (str == null || str.length() == 0 || str.equalsIgnoreCase("NONE")) {
            str = "PUSH_FROM_RIGHT";
        }
        HashMap hashMap = (HashMap) m31931a().get(str);
        if (hashMap != null) {
            qVar.mo1409a(((Integer) hashMap.get("ENTER_TRANSITION")).intValue(), ((Integer) hashMap.get("EXIT_TRANSITION")).intValue(), ((Integer) hashMap.get("POP_ENTER_TRANSITION")).intValue(), ((Integer) hashMap.get("POP_EXIT_TRANSITION")).intValue());
            return;
        }
        qVar.mo1409a(C5452a.sc_push_left_enter, C5452a.sc_push_left_exit, C5452a.sc_push_left_pop_enter, C5452a.sc_push_left_pop_exit);
    }

    /* renamed from: b */
    public static void m31936b(String str, Activity activity) {
        if (str != null && str.length() != 0 && !str.equalsIgnoreCase("NONE")) {
            if (f23314b) {
                String str2 = f23313a;
                StringBuilder sb = new StringBuilder();
                sb.append("TRANSITION: ");
                sb.append(str);
                Log.d(str2, sb.toString());
            }
            HashMap hashMap = (HashMap) m31931a().get(str);
            Integer.valueOf(0);
            Integer.valueOf(0);
            if (hashMap != null) {
                activity.overridePendingTransition(((Integer) hashMap.get("POP_ENTER_TRANSITION")).intValue(), ((Integer) hashMap.get("POP_EXIT_TRANSITION")).intValue());
            }
        }
    }
}
