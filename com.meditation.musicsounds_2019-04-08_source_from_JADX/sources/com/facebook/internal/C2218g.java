package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C2189f;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.C2230m.C2231a;
import com.facebook.internal.C2244t.C2251f;

/* renamed from: com.facebook.internal.g */
public class C2218g {

    /* renamed from: com.facebook.internal.g$a */
    public interface C2219a {
        /* renamed from: a */
        Bundle mo7830a();

        /* renamed from: b */
        Bundle mo7831b();
    }

    /* renamed from: a */
    public static void m10176a(C2201a aVar) {
        m10178a(aVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
    }

    /* renamed from: a */
    public static void m10177a(C2201a aVar, Activity activity) {
        activity.startActivityForResult(aVar.mo7809b(), aVar.mo7811d());
        aVar.mo7812e();
    }

    /* renamed from: a */
    public static void m10178a(C2201a aVar, FacebookException facebookException) {
        m10185b(aVar, facebookException);
    }

    /* renamed from: a */
    public static void m10179a(C2201a aVar, C2219a aVar2, C2217f fVar) {
        Context f = C2189f.m10092f();
        String action = fVar.getAction();
        C2251f b = m10184b(fVar);
        int b2 = b.mo7875b();
        if (b2 != -1) {
            Bundle a = C2244t.m10303a(b2) ? aVar2.mo7830a() : aVar2.mo7831b();
            if (a == null) {
                a = new Bundle();
            }
            Intent a2 = C2244t.m10293a(f, aVar.mo7810c().toString(), action, b, a);
            if (a2 != null) {
                aVar.mo7808a(a2);
                return;
            }
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    /* renamed from: a */
    public static void m10180a(C2201a aVar, C2236o oVar) {
        oVar.mo7862a(aVar.mo7809b(), aVar.mo7811d());
        aVar.mo7812e();
    }

    /* renamed from: a */
    public static void m10181a(C2201a aVar, String str, Bundle bundle) {
        C2264y.m10426b(C2189f.m10092f());
        C2264y.m10420a(C2189f.m10092f());
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        C2244t.m10302a(intent, aVar.mo7810c().toString(), str, C2244t.m10288a(), bundle2);
        intent.setClass(C2189f.m10092f(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.mo7808a(intent);
    }

    /* renamed from: a */
    public static boolean m10182a(C2217f fVar) {
        return m10184b(fVar).mo7875b() != -1;
    }

    /* renamed from: a */
    private static int[] m10183a(String str, String str2, C2217f fVar) {
        C2231a a = C2230m.m10220a(str, str2, fVar.name());
        if (a != null) {
            return a.mo7858c();
        }
        return new int[]{fVar.getMinVersion()};
    }

    /* renamed from: b */
    public static C2251f m10184b(C2217f fVar) {
        String j = C2189f.m10096j();
        String action = fVar.getAction();
        return C2244t.m10299a(action, m10183a(j, action, fVar));
    }

    /* renamed from: b */
    public static void m10185b(C2201a aVar, FacebookException facebookException) {
        if (facebookException != null) {
            C2264y.m10426b(C2189f.m10092f());
            Intent intent = new Intent();
            intent.setClass(C2189f.m10092f(), FacebookActivity.class);
            intent.setAction(FacebookActivity.f5195n);
            C2244t.m10302a(intent, aVar.mo7810c().toString(), (String) null, C2244t.m10288a(), C2244t.m10297a(facebookException));
            aVar.mo7808a(intent);
        }
    }
}
