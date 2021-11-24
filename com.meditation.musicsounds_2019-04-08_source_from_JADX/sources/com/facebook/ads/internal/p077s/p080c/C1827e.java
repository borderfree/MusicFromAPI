package com.facebook.ads.internal.p077s.p080c;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p067i.C1704a;
import com.facebook.ads.internal.p073r.p074a.C1735a;
import com.facebook.ads.internal.p073r.p074a.C1745i;
import com.facebook.ads.internal.p073r.p074a.C1748l;
import com.facebook.ads.internal.p077s.p078a.C1800k;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.s.c.e */
public class C1827e extends AsyncTask<String, Void, C1829f> {

    /* renamed from: a */
    private static final String f5966a = "e";

    /* renamed from: b */
    private static final Set<String> f5967b = new HashSet();

    /* renamed from: c */
    private Context f5968c;

    /* renamed from: d */
    private Map<String, String> f5969d;

    /* renamed from: e */
    private Map<String, String> f5970e;

    /* renamed from: f */
    private C1745i f5971f;

    /* renamed from: g */
    private C1828a f5972g;

    /* renamed from: com.facebook.ads.internal.s.c.e$a */
    public interface C1828a {
        /* renamed from: a */
        void mo7101a();

        /* renamed from: a */
        void mo7102a(C1829f fVar);
    }

    static {
        f5967b.add("#");
        f5967b.add("null");
    }

    public C1827e(Context context, Map<String, String> map) {
        this(context, map, null);
    }

    public C1827e(Context context, Map<String, String> map, Map<String, String> map2) {
        this.f5968c = context;
        HashMap hashMap = null;
        this.f5969d = map != null ? new HashMap<>(map) : null;
        if (map2 != null) {
            hashMap = new HashMap(map2);
        }
        this.f5970e = hashMap;
    }

    /* renamed from: a */
    private String m8980a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String str4 = str.contains("?") ? "&" : "?";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str4);
        sb.append(str2);
        sb.append("=");
        sb.append(URLEncoder.encode(str3));
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m8981a(String str) {
        C1745i a;
        C1735a a2 = C1826d.m8971a(this.f5968c);
        boolean z = false;
        try {
            if (this.f5970e != null) {
                if (this.f5970e.size() != 0) {
                    C1748l lVar = new C1748l();
                    lVar.mo6995a(this.f5970e);
                    a = a2.mo6966b(str, lVar);
                    this.f5971f = a;
                    if (this.f5971f != null && this.f5971f.mo6987a() == 200) {
                        z = true;
                    }
                    return z;
                }
            }
            a = a2.mo6960a(str, (C1748l) null);
            this.f5971f = a;
            z = true;
            return z;
        } catch (Exception e) {
            String str2 = f5966a;
            StringBuilder sb = new StringBuilder();
            sb.append("Error opening url: ");
            sb.append(str);
            Log.e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    private String m8982b(String str) {
        try {
            return m8980a(str, "analog", C1800k.m8915a(C1704a.m8531a()));
        } catch (Exception unused) {
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1829f doInBackground(String... strArr) {
        String str = strArr[0];
        if (!TextUtils.isEmpty(str) && !f5967b.contains(str)) {
            String b = m8982b(str);
            if (this.f5969d != null && !this.f5969d.isEmpty()) {
                for (Entry entry : this.f5969d.entrySet()) {
                    b = m8980a(b, (String) entry.getKey(), (String) entry.getValue());
                }
            }
            int i = 1;
            while (true) {
                int i2 = i + 1;
                if (i > 2) {
                    break;
                } else if (m8981a(b)) {
                    return new C1829f(this.f5971f);
                } else {
                    i = i2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo7096a(C1828a aVar) {
        this.f5972g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C1829f fVar) {
        if (this.f5972g != null) {
            this.f5972g.mo7102a(fVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        if (this.f5972g != null) {
            this.f5972g.mo7101a();
        }
    }
}
