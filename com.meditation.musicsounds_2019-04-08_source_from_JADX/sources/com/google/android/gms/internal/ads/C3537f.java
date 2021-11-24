package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.C2850R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.f */
public final class C3537f extends C3726m {

    /* renamed from: a */
    private final Map<String, String> f13968a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13969b;

    public C3537f(C3832py pyVar, Map<String, String> map) {
        super(pyVar, "storePicture");
        this.f13968a = map;
        this.f13969b = pyVar.mo13411d();
    }

    /* renamed from: a */
    public final void mo12898a() {
        if (this.f13969b == null) {
            mo13247a("Activity context is not available");
            return;
        }
        zzbv.zzek();
        if (!C3653jh.m18905f(this.f13969b).mo12278c()) {
            mo13247a("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f13968a.get("iurl");
        if (TextUtils.isEmpty(str)) {
            mo13247a("Image url cannot be empty.");
        } else if (!URLUtil.isValidUrl(str)) {
            String str2 = "Invalid image url: ";
            String valueOf = String.valueOf(str);
            mo13247a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            zzbv.zzek();
            if (!C3653jh.m18897c(lastPathSegment)) {
                String str3 = "Image type not recognized: ";
                String valueOf2 = String.valueOf(lastPathSegment);
                mo13247a(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                return;
            }
            Resources h = zzbv.zzeo().mo13056h();
            zzbv.zzek();
            Builder e = C3653jh.m18901e(this.f13969b);
            e.setTitle(h != null ? h.getString(C2850R.string.f9924s1) : "Save image");
            e.setMessage(h != null ? h.getString(C2850R.string.f9925s2) : "Allow Ad to store image in Picture gallery?");
            e.setPositiveButton(h != null ? h.getString(C2850R.string.f9926s3) : "Accept", new C3564g(this, str, lastPathSegment));
            e.setNegativeButton(h != null ? h.getString(C2850R.string.f9927s4) : "Decline", new C3591h(this));
            e.create().show();
        }
    }
}
