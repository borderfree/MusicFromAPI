package com.seattleclouds.scm;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import com.seattleclouds.App;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.C6645y;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PushManagerReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static volatile boolean f23217a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile long f23218b;

    /* renamed from: com.seattleclouds.scm.PushManagerReceiver$a */
    private static class C6558a extends AsyncTask<Void, Void, JSONObject> {

        /* renamed from: a */
        private final PendingResult f23219a;

        /* renamed from: b */
        private final Context f23220b;

        C6558a(Context context, PendingResult pendingResult) {
            this.f23219a = pendingResult;
            this.f23220b = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public JSONObject doInBackground(Void... voidArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(App.f18518t);
            PushManagerReceiver.m31704b(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("http://");
            sb2.append(App.f18518t);
            String sb3 = sb2.toString();
            if (HTTPUtil.m31771d(sb3)) {
                PushManagerReceiver.m31704b("HTTPUtil.isUrlAccessible = true");
                PushManagerReceiver.f23218b = System.currentTimeMillis();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb3);
                sb4.append("/scm_message.ashx");
                String sb5 = sb4.toString();
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("publisherId", App.f18522x);
                    hashMap.put("username", App.f18523y);
                    hashMap.put("appId", App.f18524z);
                    hashMap.put("deviceId", C6618l.m32012a());
                    hashMap.put("lastMessageId", String.valueOf(PushManagerReceiver.m31712h(this.f23220b).getTime()));
                    String b = HTTPUtil.m31768b(sb5, hashMap);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("request: ");
                    sb6.append(b);
                    PushManagerReceiver.m31704b(sb6.toString());
                    PushManagerReceiver.m31703b(this.f23220b, new Date(PushManagerReceiver.f23218b));
                    return new JSONObject(b);
                } catch (IOException | JSONException e) {
                    PushManagerReceiver.m31705b("request: ", e);
                }
            } else {
                PushManagerReceiver.m31704b("HTTPUtil.isUrlAccessible = false");
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(JSONObject jSONObject) {
            super.onPostExecute(jSONObject);
            if (jSONObject != null) {
                C6645y.m32101a(this.f23220b, PushManagerReceiver.m31701b(jSONObject));
            }
            PushManagerReceiver.m31710f(this.f23220b);
            if (this.f23219a != null) {
                this.f23219a.finish();
            }
        }
    }

    /* renamed from: a */
    public static void m31696a(Context context) {
        m31698a(context, false);
    }

    /* renamed from: a */
    public static void m31698a(Context context, boolean z) {
        if (!f23217a) {
            f23217a = true;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent e = m31709e(context);
            alarmManager.cancel(e);
            alarmManager.set(0, System.currentTimeMillis() + 60000, e);
            if (z) {
                if (m31706b()) {
                    m31704b("isRequestToSoon()");
                } else {
                    new C6558a(context, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("start: ");
            sb.append(String.valueOf(z));
            m31704b(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Bundle m31701b(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            Double valueOf = Double.valueOf(jSONObject.optDouble(str));
            String str2 = null;
            Object opt = jSONObject.opt(str);
            if (opt instanceof String) {
                str2 = (String) opt;
            }
            if (str2 == null && valueOf.isNaN()) {
                str2 = jSONObject.optString(str);
            }
            int i = 0;
            if (optJSONArray != null && optJSONArray.length() <= 0) {
                bundle.putStringArray(str, new String[0]);
            } else if (optJSONArray != null && !Double.isNaN(optJSONArray.optDouble(0))) {
                double[] dArr = new double[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    dArr[i] = optJSONArray.optDouble(i);
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
            } else if (optJSONArray != null && optJSONArray.optString(0) != null) {
                String[] strArr = new String[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    strArr[i] = optJSONArray.optString(i);
                    i++;
                }
                bundle.putStringArray(str, strArr);
            } else if (!valueOf.isNaN() && !str.equals("message") && !str.equals("text") && str2 == null) {
                bundle.putDouble(str, valueOf.doubleValue());
            } else if (str2 != null) {
                bundle.putString(str, str2);
            } else {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("unable to transform json to bundle ");
                sb.append(str);
                printStream.println(sb.toString());
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public static void m31702b(Context context) {
        f23217a = false;
        ((AlarmManager) context.getSystemService("alarm")).cancel(m31709e(context));
        m31704b("stop");
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public static void m31703b(Context context, Date date) {
        Editor edit = m31711g(context).edit();
        edit.putLong("lrd", date.getTime());
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31704b(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31705b(String str, Exception exc) {
    }

    /* renamed from: b */
    private static boolean m31706b() {
        return System.currentTimeMillis() - f23218b <= 60000;
    }

    /* renamed from: e */
    private static PendingIntent m31709e(Context context) {
        return PendingIntent.getBroadcast(context, 8463857, new Intent(context, PushManagerReceiver.class), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m31710f(Context context) {
        m31702b(context);
        m31696a(context);
    }

    /* renamed from: g */
    private static SharedPreferences m31711g(Context context) {
        return context.getSharedPreferences("AlarmManagerReceiver", 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static Date m31712h(Context context) {
        long j = m31711g(context).getLong("lrd", 0);
        return j == 0 ? new Date() : new Date(j);
    }

    public void onReceive(Context context, Intent intent) {
        if (C6559a.m31716b(context)) {
            new C6558a(context, goAsync()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        m31710f(context);
        m31704b("isMaybeOnline = false");
    }
}
