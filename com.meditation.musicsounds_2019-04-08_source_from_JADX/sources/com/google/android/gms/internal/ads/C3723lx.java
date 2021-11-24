package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.C3298c;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3303h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lx */
public final class C3723lx {

    /* renamed from: a */
    private static Object f14424a = new Object();

    /* renamed from: b */
    private static boolean f14425b = false;

    /* renamed from: c */
    private static boolean f14426c = false;

    /* renamed from: d */
    private static C3300e f14427d = C3303h.m15052d();

    /* renamed from: e */
    private static final Set<String> f14428e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f */
    private final List<String> f14429f;

    public C3723lx() {
        this(null);
    }

    public C3723lx(String str) {
        List<String> list;
        if (!m19149c()) {
            list = new ArrayList<>();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String str2 = "network_request_";
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                String valueOf2 = String.valueOf(str);
                strArr2[0] = valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3);
                String str4 = "network_request_";
                String valueOf3 = String.valueOf(uuid);
                strArr2[1] = valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4);
                list = Arrays.asList(strArr2);
            }
        }
        this.f14429f = list;
    }

    /* renamed from: a */
    public static void m19135a() {
        synchronized (f14424a) {
            f14425b = false;
            f14426c = false;
            C3731me.m19178e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19136a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m19137a(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m19137a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str = (String) entry.getKey();
                if (!f14428e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            C3731me.m19174c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19138a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private final void m19139a(String str, C3730md mdVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f14427d.mo11326a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f14429f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            mdVar.mo13243a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C3731me.m19173b("unable to log", e);
        }
        m19148c(stringWriter.toString());
    }

    /* renamed from: a */
    static final /* synthetic */ void m19140a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m19137a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(C3298c.m15033a(bArr));
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static void m19141a(boolean z) {
        synchronized (f14424a) {
            f14425b = true;
            f14426c = z;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19142a(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C3298c.m15033a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a = C3719lt.m19110a(a);
            if (a != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public static boolean m19143a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12721bh)).booleanValue()) {
            return false;
        }
        try {
            return Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e) {
            C3731me.m19175c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: b */
    private final void m19144b(String str) {
        m19139a("onNetworkRequestError", (C3730md) new C3729mc(str));
    }

    /* renamed from: b */
    private final void m19145b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m19139a("onNetworkRequest", (C3730md) new C3724ly(str, str2, map, bArr));
    }

    /* renamed from: b */
    private final void m19146b(Map<String, ?> map, int i) {
        m19139a("onNetworkResponse", (C3730md) new C3727ma(i, map));
    }

    /* renamed from: b */
    public static boolean m19147b() {
        boolean z;
        synchronized (f14424a) {
            z = f14425b;
        }
        return z;
    }

    /* renamed from: c */
    private static synchronized void m19148c(String str) {
        synchronized (C3723lx.class) {
            C3731me.m19176d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                C3731me.m19176d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            C3731me.m19176d("GMA Debug FINISH");
        }
    }

    /* renamed from: c */
    public static boolean m19149c() {
        boolean z;
        synchronized (f14424a) {
            z = f14425b && f14426c;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo13237a(String str) {
        if (m19149c() && str != null) {
            mo13242a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo13238a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m19149c()) {
            m19145b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void mo13239a(HttpURLConnection httpURLConnection, int i) {
        String str;
        if (m19149c()) {
            m19146b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e.getMessage());
                    C3731me.m19178e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    str = null;
                }
                m19144b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo13240a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m19149c()) {
            m19145b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    /* renamed from: a */
    public final void mo13241a(Map<String, ?> map, int i) {
        if (m19149c()) {
            m19146b(map, i);
            if (i < 200 || i >= 300) {
                m19144b(null);
            }
        }
    }

    /* renamed from: a */
    public final void mo13242a(byte[] bArr) {
        m19139a("onNetworkResponseBody", (C3730md) new C3728mb(bArr));
    }
}
