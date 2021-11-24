package com.seattleclouds.modules.goaltracker;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0355af;
import android.support.p009v4.app.C0419y.C0423c;
import android.support.p009v4.app.C0419y.C0424d;
import android.support.p009v4.app.C0419y.C0425e;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6645y;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class GoalTrackerAlarmReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f20231a = "GoalTrackerAlarmReceiver";

    /* renamed from: a */
    private String m28151a(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        String string = intent.getExtras().getString("GOAL_ID_KEY");
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    /* renamed from: a */
    private String m28152a(String str) {
        return "PRIORITY_HIGH".equals(str) ? "H" : "PRIORITY_MEDIUM".equals(str) ? "M" : "PRIORITY_LOW".equals(str) ? "L" : "L";
    }

    /* renamed from: a */
    private String m28153a(HashMap<String, String> hashMap) {
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(Long.parseLong((String) hashMap.get("due_date_time")));
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(instance.getTime());
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" - ");
            sb.append(Integer.parseInt((String) hashMap.get("progress")));
            sb.append("% - ");
            sb.append(m28152a((String) hashMap.get("priority")));
            return sb.toString();
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m28154a(Context context, String str) {
        C5694a a = C5694a.m28160a(context);
        a.mo18334a();
        return a.mo18337b(str);
    }

    /* renamed from: a */
    private void m28155a(Context context, Intent intent, String str) {
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, str.hashCode(), intent, 0));
    }

    /* renamed from: a */
    private void m28156a(HashMap<String, String> hashMap, Context context) {
        if (hashMap != null) {
            PendingIntent b = m28158b(context, hashMap);
            C0424d b2 = new C0424d(context, "goal_tacker").mo1713a(C5457f.ic_notif_reminder).mo1723a((CharSequence) hashMap.get("title")).mo1721a((C0425e) new C0423c().mo1711a((CharSequence) hashMap.get("note"))).mo1732c((CharSequence) m28153a(hashMap)).mo1730b(true);
            b2.mo1717a(b);
            C6645y.m32098a(177373, b2.mo1712a(), "goal_tacker");
        }
    }

    /* renamed from: a */
    private boolean m28157a(Context context, HashMap<String, String> hashMap) {
        boolean z = true;
        if (hashMap == null) {
            return true;
        }
        if (Integer.parseInt((String) hashMap.get("progress")) < 100) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private PendingIntent m28158b(Context context, HashMap<String, String> hashMap) {
        App.m25618a(context);
        C0355af a = C0355af.m1481a(context);
        a.mo1398a(Intent.makeRestartActivityTask(new ComponentName(context, AppStarterActivity.class)));
        a.mo1398a(App.m25603a(new FragmentInfo(C5717e.class.getName(), new Bundle()), context));
        Bundle bundle = new Bundle();
        bundle.putString("GOAL_ID_KEY", (String) hashMap.get("id"));
        Intent a2 = App.m25603a(new FragmentInfo(C5699c.class.getName(), bundle), context);
        a2.putExtra("ARG_STARTED_FROM_NOTIFICATION", true);
        a.mo1398a(a2);
        return a.mo1394a(0, 268435456);
    }

    /* renamed from: a */
    public void mo18331a(Context context, String str, Calendar calendar, String str2) {
        int i;
        long timeInMillis;
        long j;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, GoalTrackerAlarmReceiver.class);
        intent.putExtra("GOAL_ID_KEY", str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, str.hashCode(), intent, 0);
        if ("REPEAT_DAYLY".equals(str2)) {
            i = 0;
            timeInMillis = calendar.getTimeInMillis();
            j = 86400000;
        } else if ("REPEAT_WEEKLY".equals(str2)) {
            i = 0;
            timeInMillis = calendar.getTimeInMillis();
            j = 604800000;
        } else if ("REPEAT_MONTHLY".equals(str2)) {
            i = 0;
            timeInMillis = calendar.getTimeInMillis();
            j = 2592000000L;
        } else if ("REPEAT_10_SEC_TEST_ONLY".equals(str2)) {
            i = 0;
            timeInMillis = calendar.getTimeInMillis() + 10000;
            j = 300000;
        } else {
            return;
        }
        alarmManager.setRepeating(i, timeInMillis, j, broadcast);
    }

    public void onReceive(Context context, Intent intent) {
        String a = m28151a(context, intent);
        if (a != null) {
            HashMap a2 = m28154a(context, a);
            if (m28157a(context, a2)) {
                m28155a(context, intent, a);
            }
            if (a2 != null) {
                m28156a(a2, context);
            }
        }
    }
}
