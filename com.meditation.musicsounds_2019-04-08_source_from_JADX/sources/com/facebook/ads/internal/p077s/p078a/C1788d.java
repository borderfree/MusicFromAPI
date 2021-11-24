package com.facebook.ads.internal.p077s.p078a;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import com.facebook.ads.internal.settings.C1837b;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.internal.s.a.d */
public class C1788d {
    /* renamed from: a */
    public static <P, PR, R> AsyncTask<P, PR, R> m8878a(Executor executor, AsyncTask<P, PR, R> asyncTask, P... pArr) {
        if (VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(executor, pArr);
        } else {
            asyncTask.execute(pArr);
        }
        return asyncTask;
    }

    /* renamed from: a */
    public static void m8879a() {
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m8880a(Context context, String str) {
        if (C1837b.m9006a(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (displayed for test ads only)");
            Log.d("FBAudienceNetworkLog", sb.toString());
        }
    }
}
