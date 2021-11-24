package com.facebook.ads.internal.p073r.p074a;

import com.facebook.ads.internal.settings.C1837b;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.r.a.e */
public class C1741e implements C1751o {
    /* renamed from: a */
    private void m8722a(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String str2 : (List) map.get(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(":");
                    sb.append(str2);
                    mo6980a(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo6979a(C1745i iVar) {
        if (iVar != null) {
            mo6980a("=== HTTP Response ===");
            StringBuilder sb = new StringBuilder();
            sb.append("Receive url: ");
            sb.append(iVar.mo6988b());
            mo6980a(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Status: ");
            sb2.append(iVar.mo6987a());
            mo6980a(sb2.toString());
            m8722a(iVar.mo6989c());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Content:\n");
            sb3.append(iVar.mo6991e());
            mo6980a(sb3.toString());
        }
    }

    /* renamed from: a */
    public void mo6980a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo6981a(HttpURLConnection httpURLConnection, Object obj) {
        mo6980a("=== HTTP Request ===");
        StringBuilder sb = new StringBuilder();
        sb.append(httpURLConnection.getRequestMethod());
        sb.append(" ");
        sb.append(httpURLConnection.getURL().toString());
        mo6980a(sb.toString());
        if (obj instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Content: ");
            sb2.append((String) obj);
            mo6980a(sb2.toString());
        }
        m8722a(httpURLConnection.getRequestProperties());
    }

    /* renamed from: a */
    public boolean mo6982a() {
        return C1837b.m9009d();
    }
}
