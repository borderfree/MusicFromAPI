package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.util.C3297b;
import com.google.android.gms.measurement.AppMeasurement.C4615a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
public final class C4889b {

    /* renamed from: a */
    private static final Set<String> f17587a = new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));

    /* renamed from: b */
    private static final List<String> f17588b = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});

    /* renamed from: c */
    private static final List<String> f17589c = Arrays.asList(new String[]{"auto", "app", "am"});

    /* renamed from: d */
    private static final List<String> f17590d = Arrays.asList(new String[]{"_r", "_dbg"});

    /* renamed from: e */
    private static final List<String> f17591e = Arrays.asList((String[]) C3297b.m15032a(C4615a.f16831a, C4615a.f16832b));

    /* renamed from: f */
    private static final List<String> f17592f = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    /* renamed from: a */
    public static boolean m24402a(String str) {
        return !f17589c.contains(str);
    }

    /* renamed from: a */
    public static boolean m24403a(String str, Bundle bundle) {
        if (f17588b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String containsKey : f17590d) {
                if (bundle.containsKey(containsKey)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m24404a(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f17591e.contains(str2)) {
            return false;
        }
        for (String matches : f17592f) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24405a(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto L_0x000a
            return r0
        L_0x000a:
            boolean r5 = m24402a(r4)
            r1 = 0
            if (r5 != 0) goto L_0x0012
            return r1
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            return r1
        L_0x0015:
            java.util.List<java.lang.String> r5 = f17590d
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x001b
            return r1
        L_0x002e:
            r5 = -1
            int r2 = r4.hashCode()
            r3 = 101200(0x18b50, float:1.41811E-40)
            if (r2 == r3) goto L_0x0057
            r3 = 101230(0x18b6e, float:1.41853E-40)
            if (r2 == r3) goto L_0x004d
            r3 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r2 == r3) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            java.lang.String r2 = "fiam"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0061
            r4 = 2
            goto L_0x0062
        L_0x004d:
            java.lang.String r2 = "fdl"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0061
            r4 = 1
            goto L_0x0062
        L_0x0057:
            java.lang.String r2 = "fcm"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0061
            r4 = 0
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            switch(r4) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006e;
                case 2: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r1
        L_0x0066:
            java.lang.String r4 = "_cis"
            java.lang.String r5 = "fiam_integration"
        L_0x006a:
            r6.putString(r4, r5)
            return r0
        L_0x006e:
            java.lang.String r4 = "_cis"
            java.lang.String r5 = "fdl_integration"
            goto L_0x006a
        L_0x0073:
            java.lang.String r4 = "_cis"
            java.lang.String r5 = "fcm_integration"
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.C4889b.m24405a(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
