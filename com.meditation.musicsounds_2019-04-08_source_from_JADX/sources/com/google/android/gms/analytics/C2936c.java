package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.p116a.C2932a;
import com.google.android.gms.analytics.p116a.C2933b;
import com.google.android.gms.analytics.p116a.C2934c;
import com.google.android.gms.internal.measurement.C4271bj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.c */
public class C2936c {

    /* renamed from: com.google.android.gms.analytics.c$a */
    public static class C2937a<T extends C2937a> {

        /* renamed from: a */
        private Map<String, String> f10368a = new HashMap();

        /* renamed from: b */
        private C2933b f10369b;

        /* renamed from: c */
        private Map<String, List<C2932a>> f10370c = new HashMap();

        /* renamed from: d */
        private List<C2934c> f10371d = new ArrayList();

        /* renamed from: e */
        private List<C2932a> f10372e = new ArrayList();

        protected C2937a() {
        }

        /* renamed from: a */
        public final T mo10606a(String str, String str2) {
            if (str != null) {
                this.f10368a.put(str, str2);
            } else {
                C4271bj.m21062a("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        /* renamed from: a */
        public Map<String, String> mo10607a() {
            HashMap hashMap = new HashMap(this.f10368a);
            if (this.f10369b != null) {
                hashMap.putAll(this.f10369b.mo10595a());
            }
            int i = 1;
            for (C2934c a : this.f10371d) {
                hashMap.putAll(a.mo10597a(C2945i.m13791e(i)));
                i++;
            }
            int i2 = 1;
            for (C2932a a2 : this.f10372e) {
                hashMap.putAll(a2.mo10593a(C2945i.m13789c(i2)));
                i2++;
            }
            int i3 = 1;
            for (Entry entry : this.f10370c.entrySet()) {
                List<C2932a> list = (List) entry.getValue();
                String h = C2945i.m13794h(i3);
                int i4 = 1;
                for (C2932a aVar : list) {
                    String valueOf = String.valueOf(h);
                    String valueOf2 = String.valueOf(C2945i.m13793g(i4));
                    hashMap.putAll(aVar.mo10593a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    String valueOf3 = String.valueOf(h);
                    String valueOf4 = String.valueOf("nm");
                    hashMap.put(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), (String) entry.getKey());
                }
                i3++;
            }
            return hashMap;
        }
    }

    /* renamed from: com.google.android.gms.analytics.c$b */
    public static class C2938b extends C2937a<C2938b> {
        public C2938b() {
            mo10606a("&t", "screenview");
        }
    }
}
