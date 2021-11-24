package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.p006c.C0054c;
import android.support.p006c.C0054c.C0056a;
import com.facebook.C2189f;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.facebook.internal.e */
public class C2216e {

    /* renamed from: a */
    private Uri f7168a;

    public C2216e(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a = C2257w.m10351a();
        StringBuilder sb = new StringBuilder();
        sb.append(C2189f.m10093g());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("dialog/");
        sb.append(str);
        this.f7168a = C2258x.m10358a(a, sb.toString(), bundle);
    }

    /* renamed from: a */
    public void mo7826a(Activity activity, String str) {
        C0054c a = new C0056a().mo106a();
        a.f92a.setPackage(str);
        a.f92a.addFlags(1073741824);
        a.mo105a(activity, this.f7168a);
    }
}
