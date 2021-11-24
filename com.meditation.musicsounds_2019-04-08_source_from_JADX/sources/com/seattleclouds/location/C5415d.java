package com.seattleclouds.location;

import android.location.Location;
import com.seattleclouds.util.C6609e;
import java.text.NumberFormat;
import java.util.Set;

/* renamed from: com.seattleclouds.location.d */
public class C5415d {

    /* renamed from: a */
    private static NumberFormat f19341a = NumberFormat.getInstance();

    /* renamed from: b */
    private static Set<String> f19342b = C6609e.m31967b("com.google.android.apps.uploader", "com.htc.task", "com.htc.mirrorlinkserver", "com.htc.autobot.cargps.provider", "com.vznavigator.Generic", "com.vzw.hss.myverizon", "com.verizon.messaging.vzmsgs");

    /* renamed from: c */
    private static Set<String> f19343c = C6609e.m31967b("com.fakegps.mock", "com.lexa.fakegps", "com.lexa.fakegpsdonate", "com.incorporateapps.fakegps.fre", "com.incorporateapps.fakegps", "com.blogspot.newapphorizons.fakegps", "com.kristo.fakegpspro", "ait.com.locationfaker", "com.tistory.maxxgreen.app.virtuallocation", "ru.gavrikov.mocklocations", "com.polliapps.fakelocation", "com.tim.apps.mockgps", "tinder.location.everywhere", "org.ajeje.fakelocation", "com.iapplize.locationmockup", "com.merlich.gpssimulator_free", "com.appandmobile.locationspooferfree", "com.app.and.mobile.locationspoofer");

    /* renamed from: com.seattleclouds.location.d$a */
    public static class C5416a {

        /* renamed from: a */
        private static String f19344a;

        /* renamed from: b */
        private static String f19345b;

        public C5416a(String str, String str2) {
            f19344a = str;
            f19345b = str2;
        }

        /* renamed from: a */
        public static String m27096a() {
            return f19344a;
        }

        /* renamed from: b */
        public static String m27097b() {
            return f19345b;
        }
    }

    static {
        f19341a.setMaximumFractionDigits(6);
        f19341a.setMinimumFractionDigits(6);
    }

    /* renamed from: a */
    public static double m27090a(double d, double d2, double d3, double d4, boolean z) {
        double d5 = (((d3 - d) * 3.141592653589793d) / 180.0d) / 2.0d;
        double d6 = (((d4 - d2) * 3.141592653589793d) / 180.0d) / 2.0d;
        double sin = (Math.sin(d5) * Math.sin(d5)) + (Math.cos((d * 3.141592653589793d) / 180.0d) * Math.cos((d3 * 3.141592653589793d) / 180.0d) * Math.sin(d6) * Math.sin(d6));
        return (z ? 3959.0d : 6371.0d) * Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d;
    }

    /* renamed from: a */
    public static float m27091a(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) (d / 0.9144d);
    }

    /* renamed from: a */
    public static String m27092a(double d, double d2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(m27093a(d, i));
        sb.append(", ");
        sb.append(m27093a(d2, i));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m27093a(double d, int i) {
        switch (i) {
            case 1:
                return m27095a(Location.convert(d, 1), 5);
            case 2:
                return m27095a(Location.convert(d, 2), 2);
            default:
                return f19341a.format(d);
        }
    }

    /* renamed from: a */
    public static String m27094a(String str) {
        String[] split = str.split(",");
        if (split.length <= 3) {
            return str;
        }
        StringBuilder sb = new StringBuilder((split.length - 1) * 20);
        sb.append(split[1].trim());
        for (int i = 2; i < split.length; i++) {
            sb.append(",");
            sb.append(split[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m27095a(String str, int i) {
        int lastIndexOf = str.lastIndexOf(".");
        String str2 = "";
        if (lastIndexOf != str.length() - 1) {
            if (lastIndexOf == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                str = sb.toString();
            } else {
                int i2 = lastIndexOf + 1;
                String substring = str.substring(0, i2);
                str2 = str.substring(i2);
                str = substring;
            }
        }
        if (str2.length() > i) {
            str2 = str2.substring(0, i);
        }
        while (str2.length() < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("0");
            str2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str2);
        return sb3.toString();
    }
}
