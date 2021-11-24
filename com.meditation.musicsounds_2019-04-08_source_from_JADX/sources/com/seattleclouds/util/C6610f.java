package com.seattleclouds.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p009v4.p010a.C0310a;

/* renamed from: com.seattleclouds.util.f */
public class C6610f {

    /* renamed from: a */
    public static final int[] f23325a = {16842910};

    /* renamed from: b */
    public static final int[] f23326b = {-16842910};

    /* renamed from: c */
    public static final int[] f23327c = {16842908};

    /* renamed from: d */
    public static final int[] f23328d = {16843518};

    /* renamed from: e */
    public static final int[] f23329e = {16842919};

    /* renamed from: f */
    public static final int[] f23330f = {16842912};

    /* renamed from: g */
    public static final int[] f23331g = {16842913};

    /* renamed from: h */
    public static final int[] f23332h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f23333i = new int[0];

    /* renamed from: a */
    public static int m31968a(int i, float f) {
        return C0310a.m1169b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    /* renamed from: a */
    public static ColorStateList m31969a(int i, int i2) {
        return new ColorStateList(new int[][]{f23326b, f23333i}, new int[]{i2, i});
    }

    /* renamed from: a */
    public static ColorStateList m31970a(Context context, int i) {
        return m31969a(i, C6594an.m31922d(context, i));
    }

    /* renamed from: a */
    public static Integer m31971a(String str, Integer num) {
        if (!(str == null || str.trim().length() == 0)) {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(trim);
                trim = sb.toString();
            }
            try {
                return Integer.valueOf(Color.parseColor(trim));
            } catch (Exception unused) {
            }
        }
        return num;
    }

    /* renamed from: b */
    public static ColorStateList m31972b(int i, int i2) {
        return new ColorStateList(new int[][]{f23331g, f23333i}, new int[]{i2, i});
    }
}
