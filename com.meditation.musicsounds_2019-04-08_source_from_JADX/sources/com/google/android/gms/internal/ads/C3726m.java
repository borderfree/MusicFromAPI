package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.m */
public class C3726m {

    /* renamed from: a */
    private final C3832py f14442a;

    /* renamed from: b */
    private final String f14443b;

    public C3726m(C3832py pyVar) {
        this(pyVar, "");
    }

    public C3726m(C3832py pyVar, String str) {
        this.f14442a = pyVar;
        this.f14443b = str;
    }

    /* renamed from: a */
    public final void mo13245a(int i, int i2, int i3, int i4) {
        try {
            this.f14442a.mo12589a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public final void mo13246a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f14442a.mo12589a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while obtaining screen information.", e);
        }
    }

    /* renamed from: a */
    public final void mo13247a(String str) {
        try {
            this.f14442a.mo12589a("onError", new JSONObject().put("message", str).put("action", this.f14443b));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo13248b(int i, int i2, int i3, int i4) {
        try {
            this.f14442a.mo12589a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: b */
    public final void mo13249b(String str) {
        try {
            this.f14442a.mo12589a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: c */
    public final void mo13250c(String str) {
        try {
            this.f14442a.mo12589a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while dispatching state change.", e);
        }
    }
}
