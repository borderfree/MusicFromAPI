package com.seattleclouds.util;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: com.seattleclouds.util.j */
public class C6614j {
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: a */
    private static final ThreadLocal<SimpleDateFormat> f23334a = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return C6614j.m31994a();
        }
    };
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: b */
    private static final ThreadLocal<SimpleDateFormat> f23335b = new ThreadLocal<SimpleDateFormat>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return C6614j.m31994a();
        }
    };

    /* renamed from: a */
    public static int m31992a(Calendar calendar, Calendar calendar2, boolean z) {
        int i;
        int i2;
        if (calendar.equals(calendar2)) {
            return 0;
        }
        if (calendar.after(calendar2)) {
            i = !z ? -1 : 1;
        } else {
            i = 1;
            Calendar calendar3 = calendar2;
            calendar2 = calendar;
            calendar = calendar3;
        }
        if (calendar2.get(1) == calendar.get(1)) {
            i2 = calendar.get(6) - calendar2.get(6);
        } else {
            int actualMaximum = (calendar2.getActualMaximum(6) - calendar2.get(6)) + calendar.get(6);
            Calendar calendar4 = (Calendar) calendar.clone();
            calendar4.set(1, calendar2.get(1) + 1);
            while (calendar4.before(calendar)) {
                actualMaximum += calendar4.getActualMaximum(6);
                calendar4.add(1, 1);
            }
            i2 = actualMaximum;
        }
        return i2 * i;
    }

    /* renamed from: a */
    public static int m31993a(Date date, Date date2, boolean z) {
        return m31992a(m31997a(date), m31997a(date2), z);
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    public static SimpleDateFormat m31994a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    public static Calendar m31995a(long j) {
        return m31997a(new Date(j));
    }

    /* renamed from: a */
    public static Calendar m31996a(Calendar calendar, int i) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(6, i);
        return calendar2;
    }

    /* renamed from: a */
    public static Calendar m31997a(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance;
    }

    /* renamed from: a */
    public static Date m31998a(Date date, int i) {
        return m31996a(m31997a(date), i).getTime();
    }

    /* renamed from: a */
    public static void m31999a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    /* renamed from: a */
    public static boolean m32000a(Calendar calendar, Calendar calendar2) {
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* renamed from: a */
    public static boolean m32001a(Date date, Date date2) {
        return m32000a(m31997a(date), m31997a(date2));
    }

    /* renamed from: b */
    public static Calendar m32002b(Calendar calendar, Calendar calendar2) {
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.set(11, calendar2.get(11));
        calendar3.set(12, calendar2.get(12));
        calendar3.set(13, calendar2.get(13));
        calendar3.set(14, calendar2.get(14));
        return calendar3;
    }

    /* renamed from: b */
    public static Calendar m32003b(Date date) {
        Calendar a = m31997a(date);
        m31999a(a);
        return a;
    }

    /* renamed from: b */
    public static Date m32004b(Date date, Date date2) {
        return m32002b(m31997a(date), m31997a(date2)).getTime();
    }

    /* renamed from: b */
    public static void m32005b(Calendar calendar) {
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
    }

    /* renamed from: c */
    public static Calendar m32006c(Date date) {
        Calendar a = m31997a(date);
        m32005b(a);
        return a;
    }

    /* renamed from: c */
    public static boolean m32007c(Date date, Date date2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date2);
        instance2.set(14, 0);
        return instance.compareTo(instance2) == 0;
    }
}
