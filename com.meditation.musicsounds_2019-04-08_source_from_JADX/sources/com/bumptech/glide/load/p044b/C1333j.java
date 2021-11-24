package com.bumptech.glide.load.p044b;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.b.j */
public final class C1333j implements C1330h {

    /* renamed from: c */
    private final Map<String, List<C1332i>> f4566c;

    /* renamed from: d */
    private volatile Map<String, String> f4567d;

    /* renamed from: com.bumptech.glide.load.b.j$a */
    public static final class C1334a {

        /* renamed from: a */
        private static final String f4568a = m6943b();

        /* renamed from: b */
        private static final Map<String, List<C1332i>> f4569b;

        /* renamed from: c */
        private boolean f4570c = true;

        /* renamed from: d */
        private Map<String, List<C1332i>> f4571d = f4569b;

        /* renamed from: e */
        private boolean f4572e = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f4568a)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1335b(f4568a)));
            }
            f4569b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m6943b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1333j mo6018a() {
            this.f4570c = true;
            return new C1333j(this.f4571d);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.j$b */
    static final class C1335b implements C1332i {

        /* renamed from: a */
        private final String f4573a;

        C1335b(String str) {
            this.f4573a = str;
        }

        /* renamed from: a */
        public String mo6014a() {
            return this.f4573a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1335b)) {
                return false;
            }
            return this.f4573a.equals(((C1335b) obj).f4573a);
        }

        public int hashCode() {
            return this.f4573a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f4573a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    C1333j(Map<String, List<C1332i>> map) {
        this.f4566c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    private String m6940a(List<C1332i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((C1332i) list.get(i)).mo6014a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private Map<String, String> m6941b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f4566c.entrySet()) {
            String a = m6940a((List) entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo6013a() {
        if (this.f4567d == null) {
            synchronized (this) {
                if (this.f4567d == null) {
                    this.f4567d = Collections.unmodifiableMap(m6941b());
                }
            }
        }
        return this.f4567d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1333j)) {
            return false;
        }
        return this.f4566c.equals(((C1333j) obj).f4566c);
    }

    public int hashCode() {
        return this.f4566c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f4566c);
        sb.append('}');
        return sb.toString();
    }
}
