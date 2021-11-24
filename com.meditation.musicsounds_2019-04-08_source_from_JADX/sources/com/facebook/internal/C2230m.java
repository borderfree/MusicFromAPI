package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.m */
public final class C2230m {

    /* renamed from: a */
    private boolean f7190a;

    /* renamed from: b */
    private String f7191b;

    /* renamed from: c */
    private boolean f7192c;

    /* renamed from: d */
    private boolean f7193d;

    /* renamed from: e */
    private int f7194e;

    /* renamed from: f */
    private EnumSet<SmartLoginOption> f7195f;

    /* renamed from: g */
    private Map<String, Map<String, C2231a>> f7196g;

    /* renamed from: h */
    private boolean f7197h;

    /* renamed from: i */
    private C2225j f7198i;

    /* renamed from: j */
    private String f7199j;

    /* renamed from: k */
    private String f7200k;

    /* renamed from: l */
    private boolean f7201l;

    /* renamed from: m */
    private String f7202m;

    /* renamed from: com.facebook.internal.m$a */
    public static class C2231a {

        /* renamed from: a */
        private String f7203a;

        /* renamed from: b */
        private String f7204b;

        /* renamed from: c */
        private Uri f7205c;

        /* renamed from: d */
        private int[] f7206d;

        private C2231a(String str, String str2, Uri uri, int[] iArr) {
            this.f7203a = str;
            this.f7204b = str2;
            this.f7205c = uri;
            this.f7206d = iArr;
        }

        /* renamed from: a */
        public static C2231a m10230a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C2258x.m10392a(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C2258x.m10392a(str) || C2258x.m10392a(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C2258x.m10392a(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C2231a(str, str2, uri, m10231a(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: a */
        private static int[] m10231a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C2258x.m10392a(optString)) {
                        try {
                            optInt = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C2258x.m10383a("FacebookSDK", (Exception) e);
                            optInt = -1;
                        }
                    }
                }
                iArr[i] = optInt;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo7856a() {
            return this.f7203a;
        }

        /* renamed from: b */
        public String mo7857b() {
            return this.f7204b;
        }

        /* renamed from: c */
        public int[] mo7858c() {
            return this.f7206d;
        }
    }

    public C2230m(boolean z, String str, boolean z2, boolean z3, int i, EnumSet<SmartLoginOption> enumSet, Map<String, Map<String, C2231a>> map, boolean z4, C2225j jVar, String str2, String str3, boolean z5, String str4) {
        this.f7190a = z;
        this.f7191b = str;
        this.f7192c = z2;
        this.f7193d = z3;
        this.f7196g = map;
        this.f7198i = jVar;
        this.f7194e = i;
        this.f7197h = z4;
        this.f7195f = enumSet;
        this.f7199j = str2;
        this.f7200k = str3;
        this.f7201l = z5;
        this.f7202m = str4;
    }

    /* renamed from: a */
    public static C2231a m10220a(String str, String str2, String str3) {
        if (!C2258x.m10392a(str2) && !C2258x.m10392a(str3)) {
            C2230m a = C2232n.m10235a(str);
            if (a != null) {
                Map map = (Map) a.mo7852f().get(str2);
                if (map != null) {
                    return (C2231a) map.get(str3);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo7847a() {
        return this.f7190a;
    }

    /* renamed from: b */
    public boolean mo7848b() {
        return this.f7193d;
    }

    /* renamed from: c */
    public int mo7849c() {
        return this.f7194e;
    }

    /* renamed from: d */
    public boolean mo7850d() {
        return this.f7197h;
    }

    /* renamed from: e */
    public EnumSet<SmartLoginOption> mo7851e() {
        return this.f7195f;
    }

    /* renamed from: f */
    public Map<String, Map<String, C2231a>> mo7852f() {
        return this.f7196g;
    }

    /* renamed from: g */
    public C2225j mo7853g() {
        return this.f7198i;
    }

    /* renamed from: h */
    public boolean mo7854h() {
        return this.f7201l;
    }

    /* renamed from: i */
    public String mo7855i() {
        return this.f7202m;
    }
}
