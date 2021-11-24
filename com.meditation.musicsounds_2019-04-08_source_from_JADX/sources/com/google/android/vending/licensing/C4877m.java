package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* renamed from: com.google.android.vending.licensing.m */
public class C4877m implements C4874j {

    /* renamed from: a */
    private long f17563a;

    /* renamed from: b */
    private long f17564b;

    /* renamed from: c */
    private long f17565c;

    /* renamed from: d */
    private long f17566d;

    /* renamed from: e */
    private long f17567e = 0;

    /* renamed from: f */
    private int f17568f;

    /* renamed from: g */
    private C4875k f17569g;

    public C4877m(Context context, C4873i iVar) {
        this.f17569g = new C4875k(context.getSharedPreferences("com.android.vending.licensing.ServerManagedPolicy", 0), iVar);
        this.f17568f = Integer.parseInt(this.f17569g.mo16079b("lastResponse", Integer.toString(291)));
        this.f17563a = Long.parseLong(this.f17569g.mo16079b("validityTimestamp", "0"));
        this.f17564b = Long.parseLong(this.f17569g.mo16079b("retryUntil", "0"));
        this.f17565c = Long.parseLong(this.f17569g.mo16079b("maxRetries", "0"));
        this.f17566d = Long.parseLong(this.f17569g.mo16079b("retryCount", "0"));
    }

    /* renamed from: a */
    private void m24372a(int i) {
        this.f17567e = System.currentTimeMillis();
        this.f17568f = i;
        this.f17569g.mo16078a("lastResponse", Integer.toString(i));
    }

    /* renamed from: a */
    private void m24373a(long j) {
        this.f17566d = j;
        this.f17569g.mo16078a("retryCount", Long.toString(j));
    }

    /* renamed from: a */
    private void m24374a(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            l = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(l.longValue());
        }
        this.f17563a = l.longValue();
        this.f17569g.mo16078a("validityTimestamp", str);
    }

    /* renamed from: b */
    private void m24375b(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            str = "0";
            l = Long.valueOf(0);
        }
        this.f17564b = l.longValue();
        this.f17569g.mo16078a("retryUntil", str);
    }

    /* renamed from: c */
    private void m24376c(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            str = "0";
            l = Long.valueOf(0);
        }
        this.f17565c = l.longValue();
        this.f17569g.mo16078a("maxRetries", str);
    }

    /* renamed from: d */
    private Map<String, String> m24377d(String str) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("?");
            sb.append(str);
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI(sb.toString()), "UTF-8")) {
                hashMap.put(nameValuePair.getName(), nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
            Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo16055a(int i, C4876l lVar) {
        String str;
        m24373a(i != 291 ? 0 : this.f17566d + 1);
        if (i == 256) {
            Map d = m24377d(lVar.f17562g);
            this.f17568f = i;
            m24374a((String) d.get("VT"));
            m24375b((String) d.get("GT"));
            str = (String) d.get("GR");
        } else {
            if (i == 561) {
                m24374a("0");
                m24375b("0");
                str = "0";
            }
            m24372a(i);
            this.f17569g.mo16077a();
        }
        m24376c(str);
        m24372a(i);
        this.f17569g.mo16077a();
    }

    /* renamed from: c */
    public boolean mo16061c() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (this.f17568f == 256) {
            if (currentTimeMillis <= this.f17563a) {
                return true;
            }
        } else if (this.f17568f == 291 && currentTimeMillis < this.f17567e + 60000 && (currentTimeMillis <= this.f17564b || this.f17566d <= this.f17565c)) {
            z = true;
        }
        return z;
    }
}
