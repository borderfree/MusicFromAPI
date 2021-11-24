package com.facebook.appevents;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C2240r;
import com.facebook.internal.C2258x;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

class AppEvent implements Serializable {

    /* renamed from: a */
    private static final HashSet<String> f6995a = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final boolean isImplicit;
        private final String jsonString;

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, null);
        }
    }

    static class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean isImplicit;
        private final String jsonString;

        private SerializationProxyV2(String str, boolean z, String str2) {
            this.jsonString = str;
            this.isImplicit = z;
            this.checksum = str2;
        }

        private Object readResolve() {
            return new AppEvent(this.jsonString, this.isImplicit, this.checksum);
        }
    }

    public AppEvent(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) {
        this.jsonObject = m9936a(str, str2, d, bundle, z, uuid);
        this.isImplicit = z;
        this.name = str2;
        this.checksum = m9934a();
    }

    private AppEvent(String str, boolean z, String str2) {
        this.jsonObject = new JSONObject(str);
        this.isImplicit = z;
        this.name = this.jsonObject.optString("_eventName");
        this.checksum = str2;
    }

    /* renamed from: a */
    private String m9934a() {
        String sb;
        if (VERSION.SDK_INT > 19) {
            sb = this.jsonObject.toString();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator keys = this.jsonObject.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
            Collections.sort(arrayList);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                sb2.append(str);
                sb2.append(" = ");
                sb2.append(this.jsonObject.optString(str));
                sb2.append(10);
            }
            sb = sb2.toString();
        }
        return m9938b(sb);
    }

    /* renamed from: a */
    private static String m9935a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static JSONObject m9936a(String str, String str2, Double d, Bundle bundle, boolean z, UUID uuid) {
        m9937a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m9938b(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (z) {
            jSONObject.put("_implicitlyLogged", "1");
        }
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                m9937a(str3);
                Object obj = bundle.get(str3);
                if ((obj instanceof String) || (obj instanceof Number)) {
                    jSONObject.put(str3, obj.toString());
                } else {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str3}));
                }
            }
        }
        if (!z) {
            C2240r.m10259a(LoggingBehavior.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static void m9937a(String str) {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (f6995a) {
            contains = f6995a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f6995a) {
                f6995a.add(str);
            }
            return;
        }
        throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    /* renamed from: b */
    private static String m9938b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            return m9935a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C2258x.m10383a("Failed to generate checksum: ", (Exception) e);
            return "0";
        } catch (UnsupportedEncodingException e2) {
            C2258x.m10383a("Failed to generate checksum: ", (Exception) e2);
            return "1";
        }
    }

    private Object writeReplace() {
        return new SerializationProxyV2(this.jsonObject.toString(), this.isImplicit, this.checksum);
    }

    public boolean getIsImplicit() {
        return this.isImplicit;
    }

    public JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public String getName() {
        return this.name;
    }

    public boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return m9934a().equals(this.checksum);
    }

    public String toString() {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()});
    }
}
