package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

@C3464ci
public final class azo {

    /* renamed from: a */
    public static final azn<JSONObject> f13379a = new azq();

    /* renamed from: b */
    private static final Charset f13380b = Charset.forName("UTF-8");

    /* renamed from: c */
    private static final azl<InputStream> f13381c = azp.f13382a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m17715a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f13380b));
    }
}
