package com.seattleclouds.p160e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.C0310a;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6610f;

/* renamed from: com.seattleclouds.e.e */
public class C5339e {

    /* renamed from: a */
    private static final boolean f19133a = (VERSION.SDK_INT < 21);

    /* renamed from: a */
    public static ColorStateList m26796a(Context context, int i) {
        return new ColorStateList(new int[][]{C6610f.f23326b, C6610f.f23327c, C6610f.f23328d, C6610f.f23329e, C6610f.f23330f, C6610f.f23331g, C6610f.f23333i}, new int[]{C6594an.m31923e(context, C5453b.colorControlNormal), i, i, i, i, i, C6594an.m31917a(context, C5453b.colorControlNormal)});
    }

    /* renamed from: b */
    public static ColorStateList m26797b(Context context, int i) {
        int i2 = 4;
        int[][] iArr = new int[(f19133a ? 4 : 2)][];
        if (!f19133a) {
            i2 = 2;
        }
        int[] iArr2 = new int[i2];
        iArr[0] = C6610f.f23326b;
        iArr2[0] = C6594an.m31922d(context, i);
        char c = 1;
        if (f19133a) {
            int a = C0310a.m1166a(C6594an.m31917a(context, C5453b.colorControlHighlight), i);
            iArr[1] = C6610f.f23329e;
            iArr2[1] = a;
            iArr[2] = C6610f.f23327c;
            iArr2[2] = a;
            c = 3;
        }
        iArr[c] = C6610f.f23333i;
        iArr2[c] = i;
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: c */
    public static ColorStateList m26798c(Context context, int i) {
        return C6610f.m31969a(i, VERSION.SDK_INT < 21 ? C6594an.m31923e(context, 16842808) : C6594an.m31917a(context, 16842808));
    }

    /* renamed from: d */
    public static ColorStateList m26799d(Context context, int i) {
        return new ColorStateList(new int[][]{C6610f.f23326b, C6610f.f23332h, C6610f.f23333i}, new int[]{C6594an.m31923e(context, C5453b.colorControlNormal), C6594an.m31917a(context, C5453b.colorControlNormal), i});
    }

    /* renamed from: e */
    public static ColorStateList m26800e(Context context, int i) {
        return new ColorStateList(new int[][]{C6610f.f23326b, C6610f.f23330f, C6610f.f23333i}, new int[]{C6594an.m31923e(context, C5453b.colorControlNormal), i, C6594an.m31917a(context, C5453b.colorControlNormal)});
    }

    /* renamed from: f */
    public static ColorStateList m26801f(Context context, int i) {
        return new ColorStateList(new int[][]{C6610f.f23326b, C6610f.f23332h, C6610f.f23333i}, new int[]{C6594an.m31923e(context, C5453b.colorControlNormal), C6594an.m31917a(context, C5453b.colorControlNormal), i});
    }

    /* renamed from: g */
    public static ColorStateList m26802g(Context context, int i) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = C6594an.m31920b(context, C5453b.colorSwitchThumbNormal);
        if (b == null || !b.isStateful()) {
            iArr[0] = C6610f.f23326b;
            iArr2[0] = C6594an.m31923e(context, C5453b.colorSwitchThumbNormal);
            iArr[1] = C6610f.f23330f;
            iArr2[1] = i;
            iArr[2] = C6610f.f23333i;
            iArr2[2] = C6594an.m31917a(context, C5453b.colorSwitchThumbNormal);
        } else {
            iArr[0] = C6610f.f23326b;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = C6610f.f23330f;
            iArr2[1] = i;
            iArr[2] = C6610f.f23333i;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: h */
    public static ColorStateList m26803h(Context context, int i) {
        return new ColorStateList(new int[][]{C6610f.f23326b, C6610f.f23330f, C6610f.f23333i}, new int[]{C6594an.m31918a(context, 16842800, 0.1f), C6610f.m31968a(i, 0.3f), C6594an.m31918a(context, 16842800, 0.3f)});
    }
}
