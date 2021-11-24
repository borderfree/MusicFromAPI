package com.facebook.ads.internal.p072o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p063e.C1683a;
import com.facebook.ads.internal.p065g.C1688a;
import com.facebook.ads.internal.p065g.C1691d;
import com.facebook.ads.internal.p068j.C1709a;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p072o.C1722a.C1723a;
import com.facebook.ads.internal.p077s.p078a.C1801l;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.o.d */
public class C1729d implements C1728c {

    /* renamed from: a */
    private static final String f5689a = "d";

    /* renamed from: b */
    private static double f5690b = 0.0d;

    /* renamed from: c */
    private static String f5691c = null;

    /* renamed from: d */
    private static volatile boolean f5692d = false;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: h */
    private static C1728c f5693h;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1724b f5694e;

    /* renamed from: f */
    private final C1691d f5695f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f5696g;

    private C1729d(Context context) {
        this.f5696g = context.getApplicationContext();
        this.f5695f = new C1691d(context);
        this.f5694e = new C1724b(context, new C1733g(context, this.f5695f));
        this.f5694e.mo6929b();
        m8665b(context);
    }

    /* renamed from: a */
    public static synchronized C1728c m8662a(Context context) {
        C1728c cVar;
        synchronized (C1729d.class) {
            if (f5693h == null) {
                f5693h = new C1729d(context.getApplicationContext());
            }
            cVar = f5693h;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m8663a(final C1722a aVar) {
        if (!aVar.mo6917g()) {
            String str = f5689a;
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to log an invalid ");
            sb.append(aVar.mo6919i());
            sb.append(" event.");
            Log.e(str, sb.toString());
            return;
        }
        this.f5695f.mo6846a(aVar.mo6911a(), aVar.mo6918h().f5702c, aVar.mo6919i().toString(), aVar.mo6912b(), aVar.mo6913c(), aVar.mo6914d(), aVar.mo6915e(), new C1688a<String>() {
            /* renamed from: a */
            public void mo6834a(int i, String str) {
                super.mo6834a(i, str);
            }

            /* renamed from: a */
            public void mo6835a(String str) {
                super.mo6835a(str);
                if (C1713a.m8576g(C1729d.this.f5696g)) {
                    C1683a.m8441a(C1729d.this.f5696g, aVar.mo6919i().toString(), str);
                }
                if (aVar.mo6916f()) {
                    C1729d.this.f5694e.mo6928a();
                } else {
                    C1729d.this.f5694e.mo6929b();
                }
            }
        });
    }

    /* renamed from: b */
    private static synchronized void m8665b(Context context) {
        synchronized (C1729d.class) {
            if (!f5692d) {
                C1709a.m8554a(context).mo6897a();
                C1801l.m8916a();
                f5690b = C1801l.m8917b();
                f5691c = C1801l.m8918c();
                f5692d = true;
            }
        }
    }

    /* renamed from: a */
    public void mo6939a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.IMMEDIATE).mo6922a(C1732f.IMPRESSION).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: a */
    public void mo6940a(String str, Map<String, String> map, String str2, C1731e eVar) {
        m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(eVar).mo6922a(C1732f.m8679a(str2)).mo6925a(true).mo6926a());
    }

    /* renamed from: b */
    public void mo6941b(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.IMMEDIATE).mo6922a(C1732f.OPEN_LINK).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: c */
    public void mo6942c(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.DEFERRED).mo6922a(C1732f.OFF_TARGET_CLICK).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: d */
    public void mo6943d(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.IMMEDIATE).mo6922a(C1732f.VIDEO).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: e */
    public void mo6944e(String str, Map<String, String> map) {
        m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.DEFERRED).mo6922a(C1732f.BROWSER_SESSION).mo6925a(false).mo6926a());
    }

    /* renamed from: f */
    public void mo6945f(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.IMMEDIATE).mo6922a(C1732f.STORE).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: g */
    public void mo6946g(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.DEFERRED).mo6922a(C1732f.CLOSE).mo6925a(true).mo6926a());
        }
    }

    /* renamed from: h */
    public void mo6947h(String str, Map<String, String> map) {
        m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.IMMEDIATE).mo6922a(C1732f.USER_RETURN).mo6925a(true).mo6926a());
    }

    /* renamed from: i */
    public void mo6948i(String str, Map<String, String> map) {
        m8663a(new C1723a().mo6923a(str).mo6920a(f5690b).mo6927b(f5691c).mo6924a(map).mo6921a(C1731e.DEFERRED).mo6922a(C1732f.AD_REPORTING).mo6925a(false).mo6926a());
    }
}
