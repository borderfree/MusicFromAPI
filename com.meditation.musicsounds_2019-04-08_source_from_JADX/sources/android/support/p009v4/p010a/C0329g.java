package android.support.p009v4.p010a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.support.p009v4.content.p015a.C0442a.C0444b;
import android.support.p009v4.content.p015a.C0442a.C0445c;
import android.support.p009v4.p017e.C0464b.C0470b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: android.support.v4.a.g */
class C0329g implements C0325a {

    /* renamed from: android.support.v4.a.g$a */
    private interface C0332a<T> {
        /* renamed from: a */
        boolean mo1179a(T t);

        /* renamed from: b */
        int mo1180b(T t);
    }

    C0329g() {
    }

    /* renamed from: a */
    private C0445c m1243a(C0444b bVar, int i) {
        return (C0445c) m1244a(bVar.mo1805a(), i, new C0332a<C0445c>() {
            /* renamed from: a */
            public int mo1180b(C0445c cVar) {
                return cVar.mo1807b();
            }

            /* renamed from: b */
            public boolean mo1179a(C0445c cVar) {
                return cVar.mo1808c();
            }
        });
    }

    /* renamed from: a */
    private static <T> T m1244a(T[] tArr, int i, C0332a<T> aVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.mo1180b(t2) - i2) * 2) + (aVar.mo1179a(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo1173a(Context context, Resources resources, int i, String str, int i2) {
        File a = C0333h.m1260a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0333h.m1265a(a, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo1174a(Context context, CancellationSignal cancellationSignal, C0470b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo1177a(bVarArr, i).mo1864a());
            try {
                Typeface a = mo1176a(context, inputStream);
                C0333h.m1264a((Closeable) inputStream);
                return a;
            } catch (IOException unused) {
                C0333h.m1264a((Closeable) inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C0333h.m1264a((Closeable) inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0333h.m1264a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C0333h.m1264a((Closeable) inputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo1175a(Context context, C0444b bVar, Resources resources, int i) {
        C0445c a = m1243a(bVar, i);
        if (a == null) {
            return null;
        }
        return C0324c.m1217a(context, resources, a.mo1809d(), a.mo1806a(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo1176a(Context context, InputStream inputStream) {
        File a = C0333h.m1260a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!C0333h.m1266a(a, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a.getPath());
            a.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0470b mo1177a(C0470b[] bVarArr, int i) {
        return (C0470b) m1244a(bVarArr, i, new C0332a<C0470b>() {
            /* renamed from: a */
            public int mo1180b(C0470b bVar) {
                return bVar.mo1866c();
            }

            /* renamed from: b */
            public boolean mo1179a(C0470b bVar) {
                return bVar.mo1867d();
            }
        });
    }
}
