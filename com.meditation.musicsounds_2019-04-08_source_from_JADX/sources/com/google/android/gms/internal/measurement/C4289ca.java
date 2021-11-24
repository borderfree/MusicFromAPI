package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.ca */
public final class C4289ca {

    /* renamed from: b */
    private static final Method f15857b = m21153b();

    /* renamed from: c */
    private static final Method f15858c = m21154c();

    /* renamed from: d */
    private static volatile C4291cc f15859d = C4290cb.f15861a;

    /* renamed from: a */
    private final JobScheduler f15860a;

    private C4289ca(JobScheduler jobScheduler) {
        this.f15860a = jobScheduler;
    }

    /* renamed from: a */
    private final int m21150a(JobInfo jobInfo, String str, int i, String str2) {
        if (f15857b != null) {
            try {
                return ((Integer) f15857b.invoke(this.f15860a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f15860a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m21151a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f15857b == null || !f15859d.mo14220a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C4289ca(jobScheduler).m21150a(jobInfo, str, m21155d(), str2);
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m21152a() {
        return false;
    }

    /* renamed from: b */
    private static Method m21153b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Method m21154c() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m21155d() {
        if (f15858c != null) {
            try {
                return ((Integer) f15858c.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }
}
