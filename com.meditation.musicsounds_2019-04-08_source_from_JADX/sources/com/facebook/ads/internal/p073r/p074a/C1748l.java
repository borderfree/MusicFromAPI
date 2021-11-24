package com.facebook.ads.internal.p073r.p074a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.r.a.l */
public class C1748l implements Map<String, String> {

    /* renamed from: a */
    private Map<String, String> f5754a = new HashMap();

    /* renamed from: a */
    public C1748l mo6995a(Map<? extends String, ? extends String> map) {
        putAll(map);
        return this;
    }

    /* renamed from: a */
    public String mo6996a() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f5754a.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            String str2 = (String) this.f5754a.get(str);
            if (str2 != null) {
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String get(Object obj) {
        return (String) this.f5754a.get(obj);
    }

    /* renamed from: a */
    public String put(String str, String str2) {
        return (String) this.f5754a.put(str, str2);
    }

    /* renamed from: b */
    public String remove(Object obj) {
        return (String) this.f5754a.remove(obj);
    }

    /* renamed from: b */
    public byte[] mo7000b() {
        try {
            return mo6996a().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.f5754a.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f5754a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f5754a.containsValue(obj);
    }

    public Set<Entry<String, String>> entrySet() {
        return this.f5754a.entrySet();
    }

    public boolean isEmpty() {
        return this.f5754a.isEmpty();
    }

    public Set<String> keySet() {
        return this.f5754a.keySet();
    }

    public void putAll(Map<? extends String, ? extends String> map) {
        this.f5754a.putAll(map);
    }

    public int size() {
        return this.f5754a.size();
    }

    public Collection<String> values() {
        return this.f5754a.values();
    }
}
