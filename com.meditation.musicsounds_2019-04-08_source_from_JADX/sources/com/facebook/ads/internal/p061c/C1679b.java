package com.facebook.ads.internal.p061c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.c.b */
public class C1679b {

    /* renamed from: a */
    private final List<String> f5511a = new ArrayList();

    /* renamed from: b */
    private final List<String> f5512b = new ArrayList();

    /* renamed from: com.facebook.ads.internal.c.b$a */
    public enum C1680a {
        REPORT("report"),
        HIDE("hide"),
        NONE("none");
        

        /* renamed from: d */
        private final String f5517d;

        private C1680a(String str) {
            this.f5517d = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo6821a() {
            return this.f5517d;
        }
    }

    /* renamed from: a */
    public void mo6812a() {
        this.f5511a.add("start");
    }

    /* renamed from: a */
    public void mo6813a(int i) {
        this.f5512b.add(String.valueOf(i));
    }

    /* renamed from: a */
    public void mo6814a(C1680a aVar) {
        List<String> list = this.f5511a;
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo6821a());
        sb.append("_end");
        list.add(sb.toString());
    }

    /* renamed from: a */
    public void mo6815a(C1680a aVar, int i) {
        List<String> list = this.f5511a;
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.mo6821a());
        sb.append("_");
        sb.append(i);
        list.add(sb.toString());
    }

    /* renamed from: b */
    public void mo6816b() {
        this.f5511a.add("why_am_i_seeing_this");
    }

    /* renamed from: c */
    public void mo6817c() {
        this.f5511a.add("manage_ad_preferences");
    }

    /* renamed from: d */
    public Map<String, String> mo6818d() {
        HashMap hashMap = new HashMap();
        hashMap.put("user_journey", new JSONArray(this.f5511a).toString());
        hashMap.put("options_selected", new JSONArray(this.f5512b).toString());
        return hashMap;
    }

    /* renamed from: e */
    public boolean mo6819e() {
        return !this.f5511a.isEmpty() || !this.f5512b.isEmpty();
    }

    /* renamed from: f */
    public void mo6820f() {
        this.f5511a.clear();
        this.f5512b.clear();
    }
}
