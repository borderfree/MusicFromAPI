package android.support.p009v4.content.p015a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.a.b */
public final class C0447b {

    /* renamed from: android.support.v4.content.a.b$a */
    public static abstract class C0448a {
        /* renamed from: a */
        public abstract void mo1813a(int i);

        /* renamed from: a */
        public final void mo1814a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0448a.this.mo1813a(i);
                }
            });
        }

        /* renamed from: a */
        public abstract void mo1815a(Typeface typeface);

        /* renamed from: a */
        public final void mo1816a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    C0448a.this.mo1815a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m2042a(Context context, int i, TypedValue typedValue, int i2, C0448a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m2043a(context, i, typedValue, i2, aVar, null, true);
    }

    /* renamed from: a */
    private static Typeface m2043a(Context context, int i, TypedValue typedValue, int i2, C0448a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m2044a(context, resources, typedValue, i, i2, aVar, handler, z);
        if (a != null || aVar != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Font resource ID #0x");
        sb.append(Integer.toHexString(i));
        sb.append(" could not be retrieved.");
        throw new NotFoundException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m2044a(android.content.Context r14, android.content.res.Resources r15, android.util.TypedValue r16, int r17, int r18, android.support.p009v4.content.p015a.C0447b.C0448a r19, android.os.Handler r20, boolean r21) {
        /*
            r0 = r15
            r1 = r16
            r4 = r17
            r5 = r18
            r9 = r19
            r10 = r20
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x009e
            java.lang.CharSequence r1 = r1.string
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r11.startsWith(r1)
            r12 = 0
            r13 = -3
            if (r1 != 0) goto L_0x0025
            if (r9 == 0) goto L_0x0024
            r9.mo1814a(r13, r10)
        L_0x0024:
            return r12
        L_0x0025:
            android.graphics.Typeface r1 = android.support.p009v4.p010a.C0324c.m1220a(r15, r4, r5)
            if (r1 == 0) goto L_0x0031
            if (r9 == 0) goto L_0x0030
            r9.mo1816a(r1, r10)
        L_0x0030:
            return r1
        L_0x0031:
            java.lang.String r1 = r11.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r15.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            android.support.v4.content.a.a$a r2 = android.support.p009v4.content.p015a.C0442a.m2027a(r1, r15)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0054
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to find font-family tag"
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0053
            r9.mo1814a(r13, r10)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
        L_0x0053:
            return r12
        L_0x0054:
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            android.graphics.Typeface r0 = android.support.p009v4.p010a.C0324c.m1219a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r14
            android.graphics.Typeface r0 = android.support.p009v4.p010a.C0324c.m1217a(r14, r15, r4, r11, r5)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.mo1816a(r0, r10)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.mo1814a(r13, r10)     // Catch:{ XmlPullParserException -> 0x0081, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to read xml resource "
            goto L_0x008b
        L_0x0081:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to parse xml resource "
        L_0x008b:
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
            if (r9 == 0) goto L_0x009d
            r9.mo1814a(r13, r10)
        L_0x009d:
            return r12
        L_0x009e:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r15.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r17)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.content.p015a.C0447b.m2044a(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.a.b$a, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static Drawable m2045a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
