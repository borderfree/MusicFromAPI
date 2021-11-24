package com.google.android.vending.licensing;

import android.content.Context;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

/* renamed from: com.google.android.vending.licensing.b */
public class C4861b implements C4874j {

    /* renamed from: a */
    private long f17517a;

    /* renamed from: b */
    private long f17518b;

    /* renamed from: c */
    private long f17519c;

    /* renamed from: d */
    private long f17520d;

    /* renamed from: e */
    private long f17521e = 0;

    /* renamed from: f */
    private int f17522f;

    /* renamed from: g */
    private C4875k f17523g;

    /* renamed from: h */
    private Vector<String> f17524h = new Vector<>();

    /* renamed from: i */
    private Vector<String> f17525i = new Vector<>();

    /* renamed from: j */
    private Vector<Long> f17526j = new Vector<>();

    public C4861b(Context context, C4873i iVar) {
        this.f17523g = new C4875k(context.getSharedPreferences("com.android.vending.licensing.APKExpansionPolicy", 0), iVar);
        this.f17522f = Integer.parseInt(this.f17523g.mo16079b("lastResponse", Integer.toString(291)));
        this.f17517a = Long.parseLong(this.f17523g.mo16079b("validityTimestamp", "0"));
        this.f17518b = Long.parseLong(this.f17523g.mo16079b("retryUntil", "0"));
        this.f17519c = Long.parseLong(this.f17523g.mo16079b("maxRetries", "0"));
        this.f17520d = Long.parseLong(this.f17523g.mo16079b("retryCount", "0"));
    }

    /* renamed from: a */
    private void m24314a(long j) {
        this.f17520d = j;
        this.f17523g.mo16078a("retryCount", Long.toString(j));
    }

    /* renamed from: a */
    private void m24315a(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License validity timestamp (VT) missing, caching for a minute");
            l = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(l.longValue());
        }
        this.f17517a = l.longValue();
        this.f17523g.mo16078a("validityTimestamp", str);
    }

    /* renamed from: b */
    private void m24316b(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "License retry timestamp (GT) missing, grace period disabled");
            str = "0";
            l = Long.valueOf(0);
        }
        this.f17518b = l.longValue();
        this.f17523g.mo16078a("retryUntil", str);
    }

    /* renamed from: c */
    private void m24317c(String str) {
        Long l;
        try {
            l = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("APKExpansionPolicy", "Licence retry count (GR) missing, grace period disabled");
            str = "0";
            l = Long.valueOf(0);
        }
        this.f17519c = l.longValue();
        this.f17523g.mo16078a("maxRetries", str);
    }

    /* renamed from: d */
    private Map<String, String> m24318d(String str) {
        HashMap hashMap = new HashMap();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("?");
            sb.append(str);
            for (NameValuePair nameValuePair : URLEncodedUtils.parse(new URI(sb.toString()), "UTF-8")) {
                String name = nameValuePair.getName();
                int i = 0;
                while (hashMap.containsKey(name)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(nameValuePair.getName());
                    i++;
                    sb2.append(i);
                    name = sb2.toString();
                }
                hashMap.put(name, nameValuePair.getValue());
            }
        } catch (URISyntaxException unused) {
            Log.w("APKExpansionPolicy", "Invalid syntax error while decoding extras data from server.");
        }
        return hashMap;
    }

    /* renamed from: d */
    private void m24319d(int i) {
        this.f17521e = System.currentTimeMillis();
        this.f17522f = i;
        this.f17523g.mo16078a("lastResponse", Integer.toString(i));
    }

    /* renamed from: a */
    public String mo16052a(int i) {
        if (i < this.f17524h.size()) {
            return (String) this.f17524h.elementAt(i);
        }
        return null;
    }

    /* renamed from: a */
    public void mo16053a() {
        this.f17523g.mo16078a("lastResponse", Integer.toString(291));
        m24316b("0");
        m24317c("0");
        m24314a(Long.parseLong("0"));
        m24315a("0");
        this.f17523g.mo16077a();
    }

    /* renamed from: a */
    public void mo16054a(int i, long j) {
        if (i >= this.f17526j.size()) {
            this.f17526j.setSize(i + 1);
        }
        this.f17526j.set(i, Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo16055a(int i, C4876l lVar) {
        m24314a(i != 291 ? 0 : this.f17520d + 1);
        if (i == 256) {
            Map d = m24318d(lVar.f17562g);
            this.f17522f = i;
            m24315a(Long.toString(System.currentTimeMillis() + 60000));
            for (String str : d.keySet()) {
                if (str.equals("VT")) {
                    m24315a((String) d.get(str));
                } else if (str.equals("GT")) {
                    m24316b((String) d.get(str));
                } else if (str.equals("GR")) {
                    m24317c((String) d.get(str));
                } else if (str.startsWith("FILE_URL")) {
                    mo16056a(Integer.parseInt(str.substring("FILE_URL".length())) - 1, (String) d.get(str));
                } else if (str.startsWith("FILE_NAME")) {
                    mo16059b(Integer.parseInt(str.substring("FILE_NAME".length())) - 1, (String) d.get(str));
                } else if (str.startsWith("FILE_SIZE")) {
                    mo16054a(Integer.parseInt(str.substring("FILE_SIZE".length())) - 1, Long.parseLong((String) d.get(str)));
                }
            }
        } else if (i == 561) {
            m24315a("0");
            m24316b("0");
            m24317c("0");
        }
        m24319d(i);
        this.f17523g.mo16077a();
    }

    /* renamed from: a */
    public void mo16056a(int i, String str) {
        if (i >= this.f17524h.size()) {
            this.f17524h.setSize(i + 1);
        }
        this.f17524h.set(i, str);
    }

    /* renamed from: b */
    public int mo16057b() {
        return this.f17524h.size();
    }

    /* renamed from: b */
    public String mo16058b(int i) {
        if (i < this.f17525i.size()) {
            return (String) this.f17525i.elementAt(i);
        }
        return null;
    }

    /* renamed from: b */
    public void mo16059b(int i, String str) {
        if (i >= this.f17525i.size()) {
            this.f17525i.setSize(i + 1);
        }
        this.f17525i.set(i, str);
    }

    /* renamed from: c */
    public long mo16060c(int i) {
        if (i < this.f17526j.size()) {
            return ((Long) this.f17526j.elementAt(i)).longValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo16061c() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (this.f17522f == 256) {
            if (currentTimeMillis <= this.f17517a) {
                return true;
            }
        } else if (this.f17522f == 291 && currentTimeMillis < this.f17521e + 60000 && (currentTimeMillis <= this.f17518b || this.f17520d <= this.f17519c)) {
            z = true;
        }
        return z;
    }
}
