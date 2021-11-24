package android.support.p009v4.p010a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.support.p009v4.content.p015a.C0442a.C0444b;
import android.support.p009v4.content.p015a.C0442a.C0445c;
import android.support.p009v4.p017e.C0464b;
import android.support.p009v4.p017e.C0464b.C0470b;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: android.support.v4.a.f */
public class C0328f extends C0326d {

    /* renamed from: a */
    private static final Class f884a;

    /* renamed from: b */
    private static final Constructor f885b;

    /* renamed from: c */
    private static final Method f886c;

    /* renamed from: d */
    private static final Method f887d;

    /* renamed from: e */
    private static final Method f888e;

    /* renamed from: f */
    private static final Method f889f;

    /* renamed from: g */
    private static final Method f890g;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class cls;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method4 = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method3 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
            method5.setAccessible(true);
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            cls = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        f885b = constructor;
        f884a = cls;
        f886c = method4;
        f887d = method3;
        f888e = method2;
        f889f = method;
        f890g = method5;
    }

    /* renamed from: a */
    private static Typeface m1233a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f884a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f890g.invoke(null, new Object[]{newInstance, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1234a() {
        if (f886c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f886c != null;
    }

    /* renamed from: a */
    private static boolean m1235a(Context context, Object obj, String str, int i, int i2, int i3) {
        try {
            return ((Boolean) f886c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static boolean m1236a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) f887d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static Object m1237b() {
        try {
            return f885b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static boolean m1238b(Object obj) {
        try {
            return ((Boolean) f888e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m1239c(Object obj) {
        try {
            f889f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public Typeface mo1173a(Context context, Resources resources, int i, String str, int i2) {
        if (!m1234a()) {
            return super.mo1173a(context, resources, i, str, i2);
        }
        Object b = m1237b();
        if (!m1235a(context, b, str, 0, -1, -1)) {
            m1239c(b);
            return null;
        } else if (!m1238b(b)) {
            return null;
        } else {
            return m1233a(b);
        }
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, CancellationSignal cancellationSignal, C0470b[] bVarArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m1234a()) {
            C0470b a = mo1177a(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(a.mo1864a(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a.mo1866c()).setItalic(a.mo1867d()).build();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return build;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r11;
                    th2 = th4;
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map a2 = C0464b.m2121a(context, bVarArr, cancellationSignal);
            Object b = m1237b();
            boolean z = false;
            for (C0470b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) a2.get(bVar.mo1864a());
                if (byteBuffer != null) {
                    if (!m1236a(b, byteBuffer, bVar.mo1865b(), bVar.mo1866c(), bVar.mo1867d() ? 1 : 0)) {
                        m1239c(b);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m1239c(b);
                return null;
            } else if (!m1238b(b)) {
                return null;
            } else {
                return Typeface.create(m1233a(b), i);
            }
        }
        if (openFileDescriptor != null) {
            if (th != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    th.addSuppressed(th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    /* renamed from: a */
    public Typeface mo1175a(Context context, C0444b bVar, Resources resources, int i) {
        C0445c[] a;
        if (!m1234a()) {
            return super.mo1175a(context, bVar, resources, i);
        }
        Object b = m1237b();
        for (C0445c cVar : bVar.mo1805a()) {
            if (!m1235a(context, b, cVar.mo1806a(), 0, cVar.mo1807b(), cVar.mo1808c() ? 1 : 0)) {
                m1239c(b);
                return null;
            }
        }
        if (!m1238b(b)) {
            return null;
        }
        return m1233a(b);
    }
}
