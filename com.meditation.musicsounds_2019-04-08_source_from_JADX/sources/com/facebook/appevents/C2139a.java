package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C2189f;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.a */
class C2139a {

    /* renamed from: a */
    private static final String f7009a = "a";

    /* renamed from: b */
    private static ReentrantReadWriteLock f7010b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f7011c;

    /* renamed from: d */
    private static volatile boolean f7012d = false;

    C2139a() {
    }

    /* renamed from: a */
    public static void m9961a() {
        if (!f7012d) {
            AppEventsLogger.m9954g().execute(new Runnable() {
                public void run() {
                    C2139a.m9964d();
                }
            });
        }
    }

    /* renamed from: b */
    public static String m9962b() {
        if (!f7012d) {
            Log.w(f7009a, "initStore should have been called before calling setUserID");
            m9964d();
        }
        f7010b.readLock().lock();
        try {
            return f7011c;
        } finally {
            f7010b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m9964d() {
        if (!f7012d) {
            f7010b.writeLock().lock();
            try {
                if (!f7012d) {
                    f7011c = PreferenceManager.getDefaultSharedPreferences(C2189f.m10092f()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f7012d = true;
                    f7010b.writeLock().unlock();
                }
            } finally {
                f7010b.writeLock().unlock();
            }
        }
    }
}
