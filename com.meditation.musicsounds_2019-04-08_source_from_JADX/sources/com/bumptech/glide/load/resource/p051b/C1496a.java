package com.bumptech.glide.load.resource.p051b;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.content.p015a.C0447b;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.C0830d;

/* renamed from: com.bumptech.glide.load.resource.b.a */
public final class C1496a {

    /* renamed from: a */
    private static volatile boolean f4940a = true;

    /* renamed from: a */
    public static Drawable m7473a(Context context, int i, Theme theme) {
        return m7475a(context, context, i, theme);
    }

    /* renamed from: a */
    public static Drawable m7474a(Context context, Context context2, int i) {
        return m7475a(context, context2, i, null);
    }

    /* renamed from: a */
    private static Drawable m7475a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f4940a) {
                return m7476b(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f4940a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0452b.m2059a(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m7477c(context2, i, theme);
    }

    /* renamed from: b */
    private static Drawable m7476b(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new C0830d(context, theme);
        }
        return C0817b.m3884b(context, i);
    }

    /* renamed from: c */
    private static Drawable m7477c(Context context, int i, Theme theme) {
        return C0447b.m2045a(context.getResources(), i, theme);
    }
}
