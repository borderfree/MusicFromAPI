package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C3185h.C3186a;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.u */
public class C3269u {

    /* renamed from: a */
    private final Resources f11119a;

    /* renamed from: b */
    private final String f11120b = this.f11119a.getResourcePackageName(C3186a.common_google_play_services_unknown_issue);

    public C3269u(Context context) {
        C3266s.m14913a(context);
        this.f11119a = context.getResources();
    }

    @Nullable
    /* renamed from: a */
    public String mo11291a(String str) {
        int identifier = this.f11119a.getIdentifier(str, "string", this.f11120b);
        if (identifier == 0) {
            return null;
        }
        return this.f11119a.getString(identifier);
    }
}
