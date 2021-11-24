package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C3333a;
import com.google.android.gms.dynamite.DynamiteModule.C3333a.C3334a;
import com.google.android.gms.dynamite.DynamiteModule.C3333a.C3335b;

/* renamed from: com.google.android.gms.dynamite.c */
final class C3340c implements C3333a {
    C3340c() {
    }

    /* renamed from: a */
    public final C3335b mo11353a(Context context, String str, C3334a aVar) {
        C3335b bVar = new C3335b();
        bVar.f11255a = aVar.mo11354a(context, str);
        if (bVar.f11255a != 0) {
            bVar.f11257c = -1;
        } else {
            bVar.f11256b = aVar.mo11355a(context, str, true);
            if (bVar.f11256b != 0) {
                bVar.f11257c = 1;
            }
        }
        return bVar;
    }
}
