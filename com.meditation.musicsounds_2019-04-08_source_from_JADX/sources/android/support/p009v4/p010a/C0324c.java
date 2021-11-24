package android.support.p009v4.p010a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.p009v4.content.p015a.C0442a.C0443a;
import android.support.p009v4.content.p015a.C0442a.C0444b;
import android.support.p009v4.content.p015a.C0442a.C0446d;
import android.support.p009v4.content.p015a.C0447b.C0448a;
import android.support.p009v4.p017e.C0464b;
import android.support.p009v4.p017e.C0464b.C0470b;
import android.support.p009v4.p019g.C0496g;

/* renamed from: android.support.v4.a.c */
public class C0324c {

    /* renamed from: a */
    private static final C0325a f878a;

    /* renamed from: b */
    private static final C0496g<String, Typeface> f879b = new C0496g<>(16);

    /* renamed from: android.support.v4.a.c$a */
    interface C0325a {
        /* renamed from: a */
        Typeface mo1173a(Context context, Resources resources, int i, String str, int i2);

        /* renamed from: a */
        Typeface mo1174a(Context context, CancellationSignal cancellationSignal, C0470b[] bVarArr, int i);

        /* renamed from: a */
        Typeface mo1175a(Context context, C0444b bVar, Resources resources, int i);
    }

    static {
        C0325a gVar = VERSION.SDK_INT >= 26 ? new C0328f() : (VERSION.SDK_INT < 24 || !C0327e.m1228a()) ? VERSION.SDK_INT >= 21 ? new C0326d() : new C0329g() : new C0327e();
        f878a = gVar;
    }

    /* renamed from: a */
    public static Typeface m1217a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f878a.mo1173a(context, resources, i, str, i2);
        if (a != null) {
            f879b.mo1929a(m1221b(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m1218a(Context context, CancellationSignal cancellationSignal, C0470b[] bVarArr, int i) {
        return f878a.mo1174a(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: a */
    public static Typeface m1219a(Context context, C0443a aVar, Resources resources, int i, int i2, C0448a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0446d) {
            C0446d dVar = (C0446d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo1811b() == 0) {
                z2 = true;
            }
            typeface = C0464b.m2115a(context, dVar.mo1810a(), aVar2, handler, z2, z ? dVar.mo1812c() : -1, i2);
        } else {
            typeface = f878a.mo1175a(context, (C0444b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo1816a(typeface, handler);
                } else {
                    aVar2.mo1814a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f879b.mo1929a(m1221b(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m1220a(Resources resources, int i, int i2) {
        return (Typeface) f879b.mo1928a(m1221b(resources, i, i2));
    }

    /* renamed from: b */
    private static String m1221b(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }
}
