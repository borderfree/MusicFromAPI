package android.support.p009v4.p010a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.p009v4.content.p015a.C0442a.C0444b;
import android.support.p009v4.content.p015a.C0442a.C0445c;
import android.support.p009v4.p017e.C0464b.C0470b;
import android.support.p009v4.p019g.C0510m;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: android.support.v4.a.e */
class C0327e extends C0329g {

    /* renamed from: a */
    private static final Class f880a;

    /* renamed from: b */
    private static final Constructor f881b;

    /* renamed from: c */
    private static final Method f882c;

    /* renamed from: d */
    private static final Method f883d;

    static {
        Method method;
        Method method2;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f881b = constructor;
        f880a = cls;
        f882c = method;
        f883d = method2;
    }

    C0327e() {
    }

    /* renamed from: a */
    private static Typeface m1227a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f880a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f883d.invoke(null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m1228a() {
        if (f882c == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f882c != null;
    }

    /* renamed from: a */
    private static boolean m1229a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f882c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1230b() {
        try {
            return f881b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, CancellationSignal cancellationSignal, C0470b[] bVarArr, int i) {
        Object b = m1230b();
        C0510m mVar = new C0510m();
        for (C0470b bVar : bVarArr) {
            Uri a = bVar.mo1864a();
            ByteBuffer byteBuffer = (ByteBuffer) mVar.get(a);
            if (byteBuffer == null) {
                byteBuffer = C0333h.m1262a(context, cancellationSignal, a);
                mVar.put(a, byteBuffer);
            }
            if (!m1229a(b, byteBuffer, bVar.mo1865b(), bVar.mo1866c(), bVar.mo1867d())) {
                return null;
            }
        }
        return Typeface.create(m1227a(b), i);
    }

    /* renamed from: a */
    public Typeface mo1175a(Context context, C0444b bVar, Resources resources, int i) {
        C0445c[] a;
        Object b = m1230b();
        for (C0445c cVar : bVar.mo1805a()) {
            ByteBuffer a2 = C0333h.m1261a(context, resources, cVar.mo1809d());
            if (a2 == null || !m1229a(b, a2, 0, cVar.mo1807b(), cVar.mo1808c())) {
                return null;
            }
        }
        return m1227a(b);
    }
}
