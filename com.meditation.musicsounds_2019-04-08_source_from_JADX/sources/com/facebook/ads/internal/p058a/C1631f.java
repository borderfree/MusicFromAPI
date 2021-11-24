package com.facebook.ads.internal.p058a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p070l.C1714a.C1715a;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p080c.C1830g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.a.f */
public class C1631f extends C1633h {

    /* renamed from: e */
    private static final String f5301e = "f";

    /* renamed from: f */
    private final Uri f5302f;

    /* renamed from: g */
    private final Map<String, String> f5303g;

    /* renamed from: h */
    private final boolean f5304h;

    public C1631f(Context context, C1728c cVar, String str, Uri uri, Map<String, String> map, C1637l lVar, boolean z) {
        super(context, cVar, str, lVar);
        this.f5302f = uri;
        this.f5303g = map;
        this.f5304h = z;
    }

    /* renamed from: a */
    private Intent m8179a(C1632g gVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(gVar.mo6660a()) && !TextUtils.isEmpty(gVar.mo6661b())) {
            intent.setComponent(new ComponentName(gVar.mo6660a(), gVar.mo6661b()));
        }
        if (!TextUtils.isEmpty(gVar.mo6662c())) {
            intent.setData(Uri.parse(gVar.mo6662c()));
        }
        return intent;
    }

    /* renamed from: b */
    private Intent m8180b(C1632g gVar) {
        if (TextUtils.isEmpty(gVar.mo6660a()) || !C1630e.m8178a(this.f5293a, gVar.mo6660a())) {
            return null;
        }
        String c = gVar.mo6662c();
        if (!TextUtils.isEmpty(c) && (c.startsWith("tel:") || c.startsWith("telprompt:"))) {
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        PackageManager packageManager = this.f5293a.getPackageManager();
        if (TextUtils.isEmpty(gVar.mo6661b()) && TextUtils.isEmpty(c)) {
            return packageManager.getLaunchIntentForPackage(gVar.mo6660a());
        }
        Intent a = m8179a(gVar);
        List queryIntentActivities = packageManager.queryIntentActivities(a, 65536);
        if (a.getComponent() == null) {
            Iterator it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo resolveInfo = (ResolveInfo) it.next();
                if (resolveInfo.activityInfo.packageName.equals(gVar.mo6660a())) {
                    a.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || a.getComponent() == null) {
            return null;
        }
        return a;
    }

    /* renamed from: g */
    private List<C1632g> m8181g() {
        String queryParameter = this.f5302f.getQueryParameter("appsite_data");
        if (TextUtils.isEmpty(queryParameter) || "[]".equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C1632g a = C1632g.m8189a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        } catch (JSONException e) {
            Log.w(f5301e, "Error parsing appsite_data", e);
        }
        return arrayList;
    }

    /* renamed from: h */
    private boolean m8182h() {
        List<Intent> e = mo6658e();
        if (e == null) {
            return false;
        }
        for (Intent startActivity : e) {
            try {
                this.f5293a.startActivity(startActivity);
                return true;
            } catch (Exception e2) {
                Log.d(f5301e, "Failed to open app intent, falling back", e2);
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m8183i() {
        C1830g gVar = new C1830g();
        try {
            C1830g.m8990a(gVar, this.f5293a, mo6657d(), this.f5295c);
            return true;
        } catch (Exception e) {
            String str = f5301e;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to open market url: ");
            sb.append(this.f5302f.toString());
            Log.d(str, sb.toString(), e);
            String queryParameter = this.f5302f.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                C1830g.m8990a(gVar, this.f5293a, Uri.parse(queryParameter), this.f5295c);
            }
            return false;
        }
    }

    /* renamed from: a */
    public C1715a mo6654a() {
        return C1715a.OPEN_STORE;
    }

    /* renamed from: c */
    public C1626a mo6656c() {
        String str = "opened_deeplink";
        C1626a aVar = null;
        if (!m8182h()) {
            try {
                str = m8183i() ? "opened_store_url" : "opened_store_fallback_url";
            } catch (Exception unused) {
                Log.d(f5301e, "Failed to open all options including fallback url, can't open anything");
                aVar = C1626a.CANNOT_OPEN;
            }
        }
        this.f5303g.put(str, String.valueOf(true));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Uri mo6657d() {
        String queryParameter = this.f5302f.getQueryParameter("store_url");
        if (!TextUtils.isEmpty(queryParameter)) {
            return Uri.parse(queryParameter);
        }
        return Uri.parse(String.format(Locale.US, "market://details?id=%s", new Object[]{this.f5302f.getQueryParameter("store_id")}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<Intent> mo6658e() {
        List<C1632g> g = m8181g();
        ArrayList arrayList = new ArrayList();
        if (g != null) {
            for (C1632g b : g) {
                Intent b2 = m8180b(b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo6659f() {
        C1626a aVar;
        if (!this.f5304h) {
            aVar = mo6656c();
        } else {
            this.f5303g.put("opened_store_url", String.valueOf(true));
            aVar = null;
        }
        mo6663a(this.f5303g, aVar);
    }
}
