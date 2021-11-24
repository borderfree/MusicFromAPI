package com.facebook.ads.internal.view.p085b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.b.c */
public class C1873c {

    /* renamed from: a */
    public final String f6159a;

    /* renamed from: b */
    public final long f6160b;

    /* renamed from: c */
    public final long f6161c;

    /* renamed from: d */
    public final long f6162d;

    /* renamed from: e */
    public final long f6163e;

    /* renamed from: f */
    public final long f6164f;

    /* renamed from: g */
    public final long f6165g;

    /* renamed from: h */
    public final long f6166h;

    /* renamed from: com.facebook.ads.internal.view.b.c$a */
    public static class C1875a {

        /* renamed from: a */
        private final String f6167a;

        /* renamed from: b */
        private long f6168b = -1;

        /* renamed from: c */
        private long f6169c = -1;

        /* renamed from: d */
        private long f6170d = -1;

        /* renamed from: e */
        private long f6171e = -1;

        /* renamed from: f */
        private long f6172f = -1;

        /* renamed from: g */
        private long f6173g = -1;

        /* renamed from: h */
        private long f6174h = -1;

        public C1875a(String str) {
            this.f6167a = str;
        }

        /* renamed from: a */
        public C1875a mo7160a(long j) {
            this.f6168b = j;
            return this;
        }

        /* renamed from: a */
        public C1873c mo7161a() {
            C1873c cVar = new C1873c(this.f6167a, this.f6168b, this.f6169c, this.f6170d, this.f6171e, this.f6172f, this.f6173g, this.f6174h);
            return cVar;
        }

        /* renamed from: b */
        public C1875a mo7162b(long j) {
            this.f6169c = j;
            return this;
        }

        /* renamed from: c */
        public C1875a mo7163c(long j) {
            this.f6170d = j;
            return this;
        }

        /* renamed from: d */
        public C1875a mo7164d(long j) {
            this.f6171e = j;
            return this;
        }

        /* renamed from: e */
        public C1875a mo7165e(long j) {
            this.f6172f = j;
            return this;
        }

        /* renamed from: f */
        public C1875a mo7166f(long j) {
            this.f6173g = j;
            return this;
        }

        /* renamed from: g */
        public C1875a mo7167g(long j) {
            this.f6174h = j;
            return this;
        }
    }

    private C1873c(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f6159a = str;
        this.f6160b = j;
        this.f6161c = j2;
        this.f6162d = j3;
        this.f6163e = j4;
        this.f6164f = j5;
        this.f6165g = j6;
        this.f6166h = j7;
    }

    /* renamed from: a */
    public Map<String, String> mo7159a() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("initial_url", this.f6159a);
        hashMap.put("handler_time_ms", String.valueOf(this.f6160b));
        hashMap.put("load_start_ms", String.valueOf(this.f6161c));
        hashMap.put("response_end_ms", String.valueOf(this.f6162d));
        hashMap.put("dom_content_loaded_ms", String.valueOf(this.f6163e));
        hashMap.put("scroll_ready_ms", String.valueOf(this.f6164f));
        hashMap.put("load_finish_ms", String.valueOf(this.f6165g));
        hashMap.put("session_finish_ms", String.valueOf(this.f6166h));
        return hashMap;
    }
}
