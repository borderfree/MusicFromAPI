package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import com.facebook.internal.C2202b;
import com.facebook.internal.C2258x;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.f */
class C2152f {

    /* renamed from: a */
    private List<AppEvent> f7031a = new ArrayList();

    /* renamed from: b */
    private List<AppEvent> f7032b = new ArrayList();

    /* renamed from: c */
    private int f7033c;

    /* renamed from: d */
    private C2202b f7034d;

    /* renamed from: e */
    private String f7035e;

    /* renamed from: f */
    private final int f7036f = 1000;

    public C2152f(C2202b bVar, String str) {
        this.f7034d = bVar;
        this.f7035e = str;
    }

    /* renamed from: a */
    private void m9991a(GraphRequest graphRequest, Context context, int i, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject;
        try {
            jSONObject = AppEventsLoggerUtility.m9998a(GraphAPIActivityType.CUSTOM_APP_EVENTS, this.f7034d, this.f7035e, z, context);
            if (this.f7033c > 0) {
                jSONObject.put("num_skipped_events", i);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.mo6575a(jSONObject);
        Bundle e = graphRequest.mo6580e();
        if (e == null) {
            e = new Bundle();
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2 != null) {
            e.putByteArray("custom_events_file", m9992a(jSONArray2));
            graphRequest.mo6574a((Object) jSONArray2);
        }
        graphRequest.mo6571a(e);
    }

    /* renamed from: a */
    private byte[] m9992a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            C2258x.m10383a("Encoding exception: ", (Exception) e);
            return null;
        }
    }

    /* renamed from: a */
    public synchronized int mo7704a() {
        return this.f7031a.size();
    }

    /* renamed from: a */
    public int mo7705a(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        synchronized (this) {
            int i = this.f7033c;
            this.f7032b.addAll(this.f7031a);
            this.f7031a.clear();
            JSONArray jSONArray = new JSONArray();
            for (AppEvent appEvent : this.f7032b) {
                if (!appEvent.isChecksumValid()) {
                    C2258x.m10384a("Event with invalid checksum: %s", appEvent.toString());
                } else if (z || !appEvent.getIsImplicit()) {
                    jSONArray.put(appEvent.getJSONObject());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            m9991a(graphRequest, context, i, jSONArray, z2);
            return jSONArray.length();
        }
    }

    /* renamed from: a */
    public synchronized void mo7706a(AppEvent appEvent) {
        if (this.f7031a.size() + this.f7032b.size() >= 1000) {
            this.f7033c++;
        } else {
            this.f7031a.add(appEvent);
        }
    }

    /* renamed from: a */
    public synchronized void mo7707a(boolean z) {
        if (z) {
            try {
                this.f7031a.addAll(this.f7032b);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7032b.clear();
        this.f7033c = 0;
    }

    /* renamed from: b */
    public synchronized List<AppEvent> mo7708b() {
        List<AppEvent> list;
        list = this.f7031a;
        this.f7031a = new ArrayList();
        return list;
    }
}
