package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.analytics.C2939d;

@Deprecated
/* renamed from: com.google.android.gms.internal.measurement.bj */
public final class C4271bj {

    /* renamed from: a */
    private static volatile C2939d f15808a = new C4254at();

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: a */
    public static void m21062a(String str) {
        C4272bk b = C4272bk.m21066b();
        if (b != null) {
            b.mo14821e(str);
        } else if (m21064a(2)) {
            Log.w((String) C4262ba.f15760b.mo14166a(), str);
        }
        C2939d dVar = f15808a;
        if (dVar != null) {
            dVar.mo10609a(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    /* renamed from: a */
    public static void m21063a(String str, Object obj) {
        String str2;
        C4272bk b = C4272bk.m21066b();
        if (b != null) {
            b.mo14822e(str, obj);
        } else if (m21064a(3)) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(":");
                sb.append(valueOf);
                str2 = sb.toString();
            } else {
                str2 = str;
            }
            Log.e((String) C4262ba.f15760b.mo14166a(), str2);
        }
        C2939d dVar = f15808a;
        if (dVar != null) {
            dVar.mo10610b(str);
        }
    }

    /* renamed from: a */
    private static boolean m21064a(int i) {
        return f15808a != null && f15808a.mo10608a() <= i;
    }
}
