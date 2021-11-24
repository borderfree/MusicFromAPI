package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.util.C3299d;
import com.google.android.gms.common.util.C3312q;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.jt */
public class C3665jt extends C3667jv {
    /* renamed from: a */
    public final Drawable mo13144a(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return new BitmapDrawable(context.getResources(), createBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    /* renamed from: a */
    public final String mo13147a(Context context) {
        C3712lm a = C3712lm.m19091a();
        if (TextUtils.isEmpty(a.f14396a)) {
            a.f14396a = (String) (C3299d.m15035a() ? C3710lk.m19088a(context, new C3713ln(a, context)) : C3710lk.m19088a(context, new C3714lo(a, C3183f.getRemoteContext(context), context)));
        }
        return a.f14396a;
    }

    /* renamed from: a */
    public final boolean mo13153a(Context context, WebSettings webSettings) {
        super.mo13153a(context, webSettings);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    /* renamed from: b */
    public final void mo13157b(Context context) {
        C3712lm a = C3712lm.m19091a();
        C3643iy.m18780a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(a.f14396a)) {
            Context remoteContext = C3183f.getRemoteContext(context);
            if (C3299d.m15035a() || remoteContext == null) {
                Editor putString = context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context));
                if (remoteContext == null) {
                    putString.apply();
                } else {
                    C3312q.m15086a(context, putString, "admob_user_agent");
                }
            }
            a.f14396a = defaultUserAgent;
        }
        C3643iy.m18780a("User agent is updated.");
    }
}
