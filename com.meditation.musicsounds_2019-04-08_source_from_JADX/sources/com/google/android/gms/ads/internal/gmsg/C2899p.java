package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.axh;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.p */
final class C2899p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axh f9997a;

    /* renamed from: b */
    private final /* synthetic */ Map f9998b;

    /* renamed from: c */
    private final /* synthetic */ HttpClient f9999c;

    C2899p(HttpClient httpClient, Map map, axh axh) {
        this.f9999c = httpClient;
        this.f9998b = map;
        this.f9997a = axh;
    }

    public final void run() {
        C3643iy.m19172b("Received Http request.");
        try {
            JSONObject send = this.f9999c.send(new JSONObject((String) this.f9998b.get("http_request")));
            if (send == null) {
                C3643iy.m19174c("Response should not be null.");
            } else {
                C3653jh.f14275a.post(new C2900q(this, send));
            }
        } catch (Exception e) {
            C3643iy.m19173b("Error converting request to json.", e);
        }
    }
}
