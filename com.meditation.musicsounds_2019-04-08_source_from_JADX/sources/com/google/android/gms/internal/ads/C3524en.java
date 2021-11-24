package com.google.android.gms.internal.ads;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.en */
public final class C3524en {

    /* renamed from: a */
    private static final SimpleDateFormat f13843a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00de A[Catch:{ JSONException -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4 A[Catch:{ JSONException -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015e A[Catch:{ JSONException -> 0x026a }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167 A[Catch:{ JSONException -> 0x026a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaej m18346a(android.content.Context r54, com.google.android.gms.internal.ads.zzaef r55, java.lang.String r56) {
        /*
            r0 = r55
            r15 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x026a }
            r1 = r56
            r10.<init>(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "ad_base_url"
            r11 = 0
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r2 = "ad_url"
            java.lang.String r4 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r2 = "ad_size"
            java.lang.String r13 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r2 = "ad_slot_size"
            java.lang.String r40 = r10.optString(r2, r13)     // Catch:{ JSONException -> 0x026a }
            r12 = 1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.f15269m     // Catch:{ JSONException -> 0x026a }
            if (r2 == 0) goto L_0x002d
            r24 = 1
            goto L_0x002f
        L_0x002d:
            r24 = 0
        L_0x002f:
            java.lang.String r2 = "ad_json"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x026a }
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = "ad_html"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x026a }
        L_0x003d:
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "body"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x026a }
        L_0x0045:
            if (r2 != 0) goto L_0x0053
            java.lang.String r3 = "ads"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x026a }
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = r10.toString()     // Catch:{ JSONException -> 0x026a }
        L_0x0053:
            java.lang.String r3 = "debug_dialog"
            java.lang.String r19 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r3 = "debug_signals"
            java.lang.String r42 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r3 = "interstitial_timeout"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x026a }
            r8 = -1
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = "interstitial_timeout"
            double r5 = r10.getDouble(r3)     // Catch:{ JSONException -> 0x026a }
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r16
            long r5 = (long) r5     // Catch:{ JSONException -> 0x026a }
            r16 = r5
            goto L_0x007c
        L_0x007a:
            r16 = r8
        L_0x007c:
            java.lang.String r3 = "orientation"
            java.lang.String r3 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r5 = "portrait"
            boolean r5 = r5.equals(r3)     // Catch:{ JSONException -> 0x026a }
            r14 = -1
            if (r5 == 0) goto L_0x0096
            com.google.android.gms.internal.ads.jn r3 = com.google.android.gms.ads.internal.zzbv.zzem()     // Catch:{ JSONException -> 0x026a }
            int r3 = r3.mo13156b()     // Catch:{ JSONException -> 0x026a }
        L_0x0093:
            r18 = r3
            goto L_0x00a9
        L_0x0096:
            java.lang.String r5 = "landscape"
            boolean r3 = r5.equals(r3)     // Catch:{ JSONException -> 0x026a }
            if (r3 == 0) goto L_0x00a7
            com.google.android.gms.internal.ads.jn r3 = com.google.android.gms.ads.internal.zzbv.zzem()     // Catch:{ JSONException -> 0x026a }
            int r3 = r3.mo13143a()     // Catch:{ JSONException -> 0x026a }
            goto L_0x0093
        L_0x00a7:
            r18 = -1
        L_0x00a9:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x026a }
            if (r3 == 0) goto L_0x00d7
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x026a }
            if (r3 != 0) goto L_0x00d7
            com.google.android.gms.internal.ads.zzang r1 = r0.f15267k     // Catch:{ JSONException -> 0x026a }
            java.lang.String r3 = r1.f15360a     // Catch:{ JSONException -> 0x026a }
            r5 = 0
            r6 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r1 = r55
            r2 = r54
            r8 = r20
            r9 = r21
            com.google.android.gms.internal.ads.zzaej r1 = com.google.android.gms.internal.ads.C3519ei.m18337a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r2 = r1.f15307a     // Catch:{ JSONException -> 0x026a }
            java.lang.String r3 = r1.f15308b     // Catch:{ JSONException -> 0x026a }
            long r4 = r1.f15319m     // Catch:{ JSONException -> 0x026a }
            r20 = r4
            r4 = r3
            r3 = r2
            goto L_0x00dc
        L_0x00d7:
            r3 = r1
            r4 = r2
            r1 = r11
            r20 = -1
        L_0x00dc:
            if (r4 != 0) goto L_0x00e4
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ JSONException -> 0x026a }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x026a }
            return r0
        L_0x00e4:
            java.lang.String r2 = "click_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x026a }
            if (r1 != 0) goto L_0x00ee
            r5 = r11
            goto L_0x00f0
        L_0x00ee:
            java.util.List<java.lang.String> r5 = r1.f15309c     // Catch:{ JSONException -> 0x026a }
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            java.util.List r2 = m18348a(r2, r5)     // Catch:{ JSONException -> 0x026a }
            r5 = r2
        L_0x00f7:
            java.lang.String r2 = "impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x026a }
            if (r1 != 0) goto L_0x0101
            r6 = r11
            goto L_0x0103
        L_0x0101:
            java.util.List<java.lang.String> r6 = r1.f15311e     // Catch:{ JSONException -> 0x026a }
        L_0x0103:
            if (r2 == 0) goto L_0x010a
            java.util.List r2 = m18348a(r2, r6)     // Catch:{ JSONException -> 0x026a }
            r6 = r2
        L_0x010a:
            java.lang.String r2 = "downloaded_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x026a }
            if (r1 != 0) goto L_0x0114
            r7 = r11
            goto L_0x0116
        L_0x0114:
            java.util.List<java.lang.String> r7 = r1.f15300R     // Catch:{ JSONException -> 0x026a }
        L_0x0116:
            if (r2 == 0) goto L_0x011f
            java.util.List r2 = m18348a(r2, r7)     // Catch:{ JSONException -> 0x026a }
            r48 = r2
            goto L_0x0121
        L_0x011f:
            r48 = r7
        L_0x0121:
            java.lang.String r2 = "manual_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x026a }
            if (r1 != 0) goto L_0x012b
            r7 = r11
            goto L_0x012d
        L_0x012b:
            java.util.List<java.lang.String> r7 = r1.f15315i     // Catch:{ JSONException -> 0x026a }
        L_0x012d:
            if (r2 == 0) goto L_0x0136
            java.util.List r2 = m18348a(r2, r7)     // Catch:{ JSONException -> 0x026a }
            r22 = r2
            goto L_0x0138
        L_0x0136:
            r22 = r7
        L_0x0138:
            if (r1 == 0) goto L_0x014e
            int r2 = r1.f15317k     // Catch:{ JSONException -> 0x026a }
            if (r2 == r14) goto L_0x0142
            int r2 = r1.f15317k     // Catch:{ JSONException -> 0x026a }
            r18 = r2
        L_0x0142:
            long r7 = r1.f15312f     // Catch:{ JSONException -> 0x026a }
            r25 = 0
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x014e
            long r1 = r1.f15312f     // Catch:{ JSONException -> 0x026a }
            r7 = r1
            goto L_0x0150
        L_0x014e:
            r7 = r16
        L_0x0150:
            java.lang.String r1 = "active_view"
            java.lang.String r23 = r10.optString(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "ad_is_javascript"
            boolean r25 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            if (r25 == 0) goto L_0x0167
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x026a }
            r26 = r1
            goto L_0x0169
        L_0x0167:
            r26 = r11
        L_0x0169:
            java.lang.String r1 = "mediation"
            boolean r9 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "custom_render_allowed"
            boolean r27 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "content_url_opted_out"
            boolean r28 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r43 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "prefetch"
            boolean r29 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "refresh_interval_milliseconds"
            r11 = -1
            long r16 = r10.optLong(r1, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r11 = r10.optLong(r1, r11)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "gws_query_id"
            java.lang.String r2 = ""
            java.lang.String r30 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "height"
            java.lang.String r2 = "fluid"
            java.lang.String r14 = ""
            java.lang.String r2 = r10.optString(r2, r14)     // Catch:{ JSONException -> 0x026a }
            boolean r31 = r1.equals(r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "native_express"
            boolean r32 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "video_start_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x026a }
            r2 = 0
            java.util.List r33 = m18348a(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "video_complete_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x026a }
            java.util.List r34 = m18348a(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "rewards"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x026a }
            com.google.android.gms.internal.ads.zzaig r35 = com.google.android.gms.internal.ads.zzaig.m20617a(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "use_displayed_impression"
            boolean r36 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "auto_protection_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x026a }
            com.google.android.gms.internal.ads.zzael r37 = com.google.android.gms.internal.ads.zzael.m20612a(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "set_cookie"
            java.lang.String r2 = ""
            java.lang.String r38 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "remote_ping_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x026a }
            r2 = 0
            java.util.List r39 = m18348a(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "safe_browsing"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x026a }
            com.google.android.gms.internal.ads.zzaiq r41 = com.google.android.gms.internal.ads.zzaiq.m20618a(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r0.f15238K     // Catch:{ JSONException -> 0x026a }
            boolean r44 = r10.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "custom_close_blocked"
            boolean r45 = r10.optBoolean(r1)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "enable_omid"
            boolean r47 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "omid_settings"
            r2 = 0
            java.lang.String r50 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x026a }
            java.lang.String r1 = "disable_closable_area"
            boolean r49 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x026a }
            com.google.android.gms.internal.ads.zzaej r51 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ JSONException -> 0x026a }
            boolean r14 = r0.f15272p     // Catch:{ JSONException -> 0x026a }
            boolean r10 = r0.f15234G     // Catch:{ JSONException -> 0x026a }
            boolean r2 = r0.f15248U     // Catch:{ JSONException -> 0x026a }
            r46 = 0
            r1 = r51
            r52 = r2
            r2 = r55
            r0 = r10
            r10 = r11
            r12 = r22
            r22 = r13
            r53 = r14
            r13 = r16
            r15 = r18
            r16 = r22
            r17 = r20
            r20 = r25
            r21 = r26
            r22 = r23
            r23 = r27
            r25 = r53
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r35
            r32 = r33
            r33 = r34
            r34 = r36
            r35 = r37
            r36 = r0
            r37 = r38
            r38 = r39
            r39 = r44
            r44 = r52
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ JSONException -> 0x026a }
            return r51
        L_0x026a:
            r0 = move-exception
            java.lang.String r1 = "Could not parse the inline ad response: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0280
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0285
        L_0x0280:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0285:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)
            com.google.android.gms.internal.ads.zzaej r0 = new com.google.android.gms.internal.ads.zzaej
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3524en.m18346a(android.content.Context, com.google.android.gms.internal.ads.zzaef, java.lang.String):com.google.android.gms.internal.ads.zzaej");
    }

    /* renamed from: a */
    private static Integer m18347a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* renamed from: a */
    private static List<String> m18348a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    private static JSONArray m18349a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:217:0x0601 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x061e A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x062a A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x064c A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0670 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x069c A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x06be A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x06cf A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x06f5 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x070d A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x071c A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0747 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x07bf A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x07e9 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0805 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0808 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0821 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x082c A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x084b A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0854 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0861 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0894 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x08c5 A[Catch:{ JSONException -> 0x091c }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x08ee A[Catch:{ JSONException -> 0x091c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18350a(android.content.Context r22, com.google.android.gms.internal.ads.C3517eg r23) {
        /*
            r1 = r23
            com.google.android.gms.internal.ads.zzaef r2 = r1.f13817j
            android.location.Location r3 = r1.f13811d
            com.google.android.gms.internal.ads.ew r4 = r1.f13818k
            android.os.Bundle r5 = r1.f13808a
            org.json.JSONObject r6 = r1.f13819l
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x091c }
            r8.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "extra_caps"
            com.google.android.gms.internal.ads.aqc<java.lang.String> r10 = com.google.android.gms.internal.ads.aqm.f12707bT     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r11 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r10 = r11.mo12297a(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x091c }
            java.util.List<java.lang.String> r9 = r1.f13810c     // Catch:{ JSONException -> 0x091c }
            int r9 = r9.size()     // Catch:{ JSONException -> 0x091c }
            if (r9 <= 0) goto L_0x0035
            java.lang.String r9 = "eid"
            java.lang.String r10 = ","
            java.util.List<java.lang.String> r11 = r1.f13810c     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = android.text.TextUtils.join(r10, r11)     // Catch:{ JSONException -> 0x091c }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0035:
            android.os.Bundle r9 = r2.f15258b     // Catch:{ JSONException -> 0x091c }
            if (r9 == 0) goto L_0x0040
            java.lang.String r9 = "ad_pos"
            android.os.Bundle r10 = r2.f15258b     // Catch:{ JSONException -> 0x091c }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0040:
            com.google.android.gms.internal.ads.zzjj r9 = r2.f15259c     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = com.google.android.gms.internal.ads.C3637is.m18766a()     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x004d
            java.lang.String r11 = "abf"
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x004d:
            long r10 = r9.f15482b     // Catch:{ JSONException -> 0x091c }
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0067
            java.lang.String r10 = "cust_age"
            java.text.SimpleDateFormat r11 = f13843a     // Catch:{ JSONException -> 0x091c }
            java.util.Date r14 = new java.util.Date     // Catch:{ JSONException -> 0x091c }
            long r12 = r9.f15482b     // Catch:{ JSONException -> 0x091c }
            r14.<init>(r12)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r11 = r11.format(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x091c }
        L_0x0067:
            android.os.Bundle r10 = r9.f15483c     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x0072
            java.lang.String r10 = "extras"
            android.os.Bundle r11 = r9.f15483c     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x091c }
        L_0x0072:
            int r10 = r9.f15484d     // Catch:{ JSONException -> 0x091c }
            r11 = -1
            if (r10 == r11) goto L_0x0082
            java.lang.String r10 = "cust_gender"
            int r12 = r9.f15484d     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x091c }
        L_0x0082:
            java.util.List<java.lang.String> r10 = r9.f15485e     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x008d
            java.lang.String r10 = "kw"
            java.util.List<java.lang.String> r12 = r9.f15485e     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x091c }
        L_0x008d:
            int r10 = r9.f15487g     // Catch:{ JSONException -> 0x091c }
            if (r10 == r11) goto L_0x009c
            java.lang.String r10 = "tag_for_child_directed_treatment"
            int r12 = r9.f15487g     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x091c }
        L_0x009c:
            boolean r10 = r9.f15486f     // Catch:{ JSONException -> 0x091c }
            r12 = 1
            if (r10 == 0) goto L_0x00c2
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.aqm.f12830dk     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r13 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r10 = r13.mo12297a(r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ JSONException -> 0x091c }
            boolean r10 = r10.booleanValue()     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x00bd
            java.lang.String r10 = "test_request"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x091c }
        L_0x00b9:
            r8.put(r10, r13)     // Catch:{ JSONException -> 0x091c }
            goto L_0x00c2
        L_0x00bd:
            java.lang.String r10 = "adtest"
            java.lang.String r13 = "on"
            goto L_0x00b9
        L_0x00c2:
            int r10 = r9.f15481a     // Catch:{ JSONException -> 0x091c }
            r13 = 2
            if (r10 < r13) goto L_0x00e3
            boolean r10 = r9.f15488h     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x00d4
            java.lang.String r10 = "d_imp_hdr"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x00d4:
            java.lang.String r10 = r9.f15489i     // Catch:{ JSONException -> 0x091c }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ JSONException -> 0x091c }
            if (r10 != 0) goto L_0x00e3
            java.lang.String r10 = "ppid"
            java.lang.String r14 = r9.f15489i     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x00e3:
            int r10 = r9.f15481a     // Catch:{ JSONException -> 0x091c }
            r14 = 3
            if (r10 < r14) goto L_0x00f3
            java.lang.String r10 = r9.f15492l     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x00f3
            java.lang.String r10 = "url"
            java.lang.String r14 = r9.f15492l     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x00f3:
            int r10 = r9.f15481a     // Catch:{ JSONException -> 0x091c }
            r14 = 5
            if (r10 < r14) goto L_0x0119
            android.os.Bundle r10 = r9.f15494n     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x0103
            java.lang.String r10 = "custom_targeting"
            android.os.Bundle r15 = r9.f15494n     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x091c }
        L_0x0103:
            java.util.List<java.lang.String> r10 = r9.f15495o     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x010e
            java.lang.String r10 = "category_exclusions"
            java.util.List<java.lang.String> r15 = r9.f15495o     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x091c }
        L_0x010e:
            java.lang.String r10 = r9.f15496p     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x0119
            java.lang.String r10 = "request_agent"
            java.lang.String r15 = r9.f15496p     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x091c }
        L_0x0119:
            int r10 = r9.f15481a     // Catch:{ JSONException -> 0x091c }
            r15 = 6
            if (r10 < r15) goto L_0x0129
            java.lang.String r10 = r9.f15497q     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x0129
            java.lang.String r10 = "request_pkg"
            java.lang.String r7 = r9.f15497q     // Catch:{ JSONException -> 0x091c }
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x091c }
        L_0x0129:
            int r7 = r9.f15481a     // Catch:{ JSONException -> 0x091c }
            r10 = 7
            if (r7 < r10) goto L_0x0139
            java.lang.String r7 = "is_designed_for_families"
            boolean r9 = r9.f15498r     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x091c }
        L_0x0139:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn[] r7 = r7.f15505g     // Catch:{ JSONException -> 0x091c }
            if (r7 != 0) goto L_0x0156
            java.lang.String r7 = "format"
            com.google.android.gms.internal.ads.zzjn r10 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = r10.f15499a     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            boolean r7 = r7.f15507i     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x018c
            java.lang.String r7 = "fluid"
            java.lang.String r10 = "height"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            goto L_0x018c
        L_0x0156:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn[] r7 = r7.f15505g     // Catch:{ JSONException -> 0x091c }
            int r10 = r7.length     // Catch:{ JSONException -> 0x091c }
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0160:
            if (r15 >= r10) goto L_0x018c
            r14 = r7[r15]     // Catch:{ JSONException -> 0x091c }
            boolean r12 = r14.f15507i     // Catch:{ JSONException -> 0x091c }
            if (r12 != 0) goto L_0x0173
            if (r16 != 0) goto L_0x0173
            java.lang.String r12 = "format"
            java.lang.String r13 = r14.f15499a     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            r16 = 1
        L_0x0173:
            boolean r12 = r14.f15507i     // Catch:{ JSONException -> 0x091c }
            if (r12 == 0) goto L_0x0182
            if (r17 != 0) goto L_0x0182
            java.lang.String r12 = "fluid"
            java.lang.String r13 = "height"
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            r17 = 1
        L_0x0182:
            if (r16 == 0) goto L_0x0186
            if (r17 != 0) goto L_0x018c
        L_0x0186:
            int r15 = r15 + 1
            r12 = 1
            r13 = 2
            r14 = 5
            goto L_0x0160
        L_0x018c:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            int r7 = r7.f15503e     // Catch:{ JSONException -> 0x091c }
            if (r7 != r11) goto L_0x0199
            java.lang.String r7 = "smart_w"
            java.lang.String r10 = "full"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0199:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            int r7 = r7.f15500b     // Catch:{ JSONException -> 0x091c }
            r10 = -2
            if (r7 != r10) goto L_0x01a7
            java.lang.String r7 = "smart_h"
            java.lang.String r12 = "auto"
            r8.put(r7, r12)     // Catch:{ JSONException -> 0x091c }
        L_0x01a7:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn[] r7 = r7.f15505g     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x0215
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x091c }
            r7.<init>()     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn r12 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.zzjn[] r12 = r12.f15505g     // Catch:{ JSONException -> 0x091c }
            int r13 = r12.length     // Catch:{ JSONException -> 0x091c }
            r14 = 0
            r15 = 0
        L_0x01b9:
            if (r14 >= r13) goto L_0x01fb
            r9 = r12[r14]     // Catch:{ JSONException -> 0x091c }
            boolean r10 = r9.f15507i     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x01c3
            r15 = 1
            goto L_0x01f6
        L_0x01c3:
            int r10 = r7.length()     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x01ce
            java.lang.String r10 = "|"
            r7.append(r10)     // Catch:{ JSONException -> 0x091c }
        L_0x01ce:
            int r10 = r9.f15503e     // Catch:{ JSONException -> 0x091c }
            if (r10 != r11) goto L_0x01da
            int r10 = r9.f15504f     // Catch:{ JSONException -> 0x091c }
            float r10 = (float) r10     // Catch:{ JSONException -> 0x091c }
            float r11 = r4.f13929s     // Catch:{ JSONException -> 0x091c }
            float r10 = r10 / r11
            int r10 = (int) r10     // Catch:{ JSONException -> 0x091c }
            goto L_0x01dc
        L_0x01da:
            int r10 = r9.f15503e     // Catch:{ JSONException -> 0x091c }
        L_0x01dc:
            r7.append(r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ JSONException -> 0x091c }
            int r10 = r9.f15500b     // Catch:{ JSONException -> 0x091c }
            r11 = -2
            if (r10 != r11) goto L_0x01f1
            int r9 = r9.f15501c     // Catch:{ JSONException -> 0x091c }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x091c }
            float r10 = r4.f13929s     // Catch:{ JSONException -> 0x091c }
            float r9 = r9 / r10
            int r9 = (int) r9     // Catch:{ JSONException -> 0x091c }
            goto L_0x01f3
        L_0x01f1:
            int r9 = r9.f15500b     // Catch:{ JSONException -> 0x091c }
        L_0x01f3:
            r7.append(r9)     // Catch:{ JSONException -> 0x091c }
        L_0x01f6:
            int r14 = r14 + 1
            r10 = -2
            r11 = -1
            goto L_0x01b9
        L_0x01fb:
            if (r15 == 0) goto L_0x0210
            int r9 = r7.length()     // Catch:{ JSONException -> 0x091c }
            if (r9 == 0) goto L_0x020a
            java.lang.String r9 = "|"
            r10 = 0
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x091c }
            goto L_0x020b
        L_0x020a:
            r10 = 0
        L_0x020b:
            java.lang.String r9 = "320x50"
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x091c }
        L_0x0210:
            java.lang.String r9 = "sz"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x091c }
        L_0x0215:
            int r7 = r2.f15269m     // Catch:{ JSONException -> 0x091c }
            r9 = 24
            if (r7 == 0) goto L_0x0280
            java.lang.String r7 = "native_version"
            int r10 = r2.f15269m     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "native_templates"
            java.util.List<java.lang.String> r10 = r2.f15270n     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "native_image_orientation"
            com.google.android.gms.internal.ads.zzpl r10 = r2.f15281y     // Catch:{ JSONException -> 0x091c }
            if (r10 != 0) goto L_0x0236
        L_0x0233:
            java.lang.String r10 = "any"
            goto L_0x0243
        L_0x0236:
            int r10 = r10.f15516c     // Catch:{ JSONException -> 0x091c }
            switch(r10) {
                case 0: goto L_0x0233;
                case 1: goto L_0x0241;
                case 2: goto L_0x023e;
                default: goto L_0x023b;
            }     // Catch:{ JSONException -> 0x091c }
        L_0x023b:
            java.lang.String r10 = "not_set"
            goto L_0x0243
        L_0x023e:
            java.lang.String r10 = "landscape"
            goto L_0x0243
        L_0x0241:
            java.lang.String r10 = "portrait"
        L_0x0243:
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.util.List<java.lang.String> r7 = r2.f15282z     // Catch:{ JSONException -> 0x091c }
            boolean r7 = r7.isEmpty()     // Catch:{ JSONException -> 0x091c }
            if (r7 != 0) goto L_0x0255
            java.lang.String r7 = "native_custom_templates"
            java.util.List<java.lang.String> r10 = r2.f15282z     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0255:
            int r7 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            if (r7 < r9) goto L_0x0264
            java.lang.String r7 = "max_num_ads"
            int r10 = r2.f15252Y     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0264:
            java.lang.String r7 = r2.f15250W     // Catch:{ JSONException -> 0x091c }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x091c }
            if (r7 != 0) goto L_0x0280
            java.lang.String r7 = "native_advanced_settings"
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0279 }
            java.lang.String r11 = r2.f15250W     // Catch:{ JSONException -> 0x0279 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x0279 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x0279 }
            goto L_0x0280
        L_0x0279:
            r0 = move-exception
            r7 = r0
            java.lang.String r10 = "Problem creating json from native advanced settings"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r10, r7)     // Catch:{ JSONException -> 0x091c }
        L_0x0280:
            java.util.List<java.lang.Integer> r7 = r2.f15249V     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x02be
            java.util.List<java.lang.Integer> r7 = r2.f15249V     // Catch:{ JSONException -> 0x091c }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x091c }
            if (r7 <= 0) goto L_0x02be
            java.util.List<java.lang.Integer> r7 = r2.f15249V     // Catch:{ JSONException -> 0x091c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x091c }
        L_0x0292:
            boolean r10 = r7.hasNext()     // Catch:{ JSONException -> 0x091c }
            if (r10 == 0) goto L_0x02be
            java.lang.Object r10 = r7.next()     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ JSONException -> 0x091c }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x091c }
            r12 = 2
            if (r11 != r12) goto L_0x02b0
            java.lang.String r10 = "iba"
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x091c }
        L_0x02ac:
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x091c }
            goto L_0x0292
        L_0x02b0:
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x091c }
            r11 = 1
            if (r10 != r11) goto L_0x0292
            java.lang.String r10 = "ina"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x091c }
            goto L_0x02ac
        L_0x02be:
            com.google.android.gms.internal.ads.zzjn r7 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            boolean r7 = r7.f15508j     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x02ce
            java.lang.String r7 = "ene"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x091c }
        L_0x02ce:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.aqm.f12684ax     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r10 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r7 = r10.mo12297a(r7)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x091c }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x02ea
            java.lang.String r7 = "xsrve"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x091c }
        L_0x02ea:
            com.google.android.gms.internal.ads.zzlu r7 = r2.f15242O     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x0305
            java.lang.String r7 = "is_icon_ad"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "icon_ad_expansion_behavior"
            com.google.android.gms.internal.ads.zzlu r10 = r2.f15242O     // Catch:{ JSONException -> 0x091c }
            int r10 = r10.f15509a     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0305:
            java.lang.String r7 = "slotname"
            java.lang.String r10 = r2.f15261e     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "pn"
            android.content.pm.ApplicationInfo r10 = r2.f15262f     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = r10.packageName     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            android.content.pm.PackageInfo r7 = r2.f15263g     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x0326
            java.lang.String r7 = "vc"
            android.content.pm.PackageInfo r10 = r2.f15263g     // Catch:{ JSONException -> 0x091c }
            int r10 = r10.versionCode     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0326:
            java.lang.String r7 = "ms"
            java.lang.String r10 = r1.f13815h     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "seq_num"
            java.lang.String r10 = r2.f15265i     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "session_id"
            java.lang.String r10 = r2.f15266j     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "js"
            com.google.android.gms.internal.ads.zzang r10 = r2.f15267k     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = r10.f15360a     // Catch:{ JSONException -> 0x091c }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.fg r7 = r1.f13812e     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r10 = r2.f15240M     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r11 = r1.f13809b     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "am"
            int r13 = r4.f13911a     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "cog"
            boolean r13 = r4.f13912b     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r13 = m18347a(r13)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "coh"
            boolean r13 = r4.f13913c     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r13 = m18347a(r13)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = r4.f13914d     // Catch:{ JSONException -> 0x091c }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ JSONException -> 0x091c }
            if (r12 != 0) goto L_0x037a
            java.lang.String r12 = "carrier"
            java.lang.String r13 = r4.f13914d     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
        L_0x037a:
            java.lang.String r12 = "gl"
            java.lang.String r13 = r4.f13915e     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x091c }
            boolean r12 = r4.f13916f     // Catch:{ JSONException -> 0x091c }
            if (r12 == 0) goto L_0x038f
            java.lang.String r12 = "simulator"
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x038f:
            boolean r12 = r4.f13917g     // Catch:{ JSONException -> 0x091c }
            if (r12 == 0) goto L_0x039e
            java.lang.String r12 = "is_sidewinder"
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            goto L_0x039f
        L_0x039e:
            r13 = 1
        L_0x039f:
            java.lang.String r12 = "ma"
            boolean r14 = r4.f13918h     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = m18347a(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "sp"
            boolean r14 = r4.f13919i     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = m18347a(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "hl"
            java.lang.String r14 = r4.f13920j     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = r4.f13921k     // Catch:{ JSONException -> 0x091c }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ JSONException -> 0x091c }
            if (r12 != 0) goto L_0x03cb
            java.lang.String r12 = "mv"
            java.lang.String r14 = r4.f13921k     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x03cb:
            java.lang.String r12 = "muv"
            int r14 = r4.f13923m     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            int r12 = r4.f13924n     // Catch:{ JSONException -> 0x091c }
            r14 = -2
            if (r12 == r14) goto L_0x03e6
            java.lang.String r12 = "cnt"
            int r14 = r4.f13924n     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
        L_0x03e6:
            java.lang.String r12 = "gnt"
            int r14 = r4.f13925o     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "pt"
            int r14 = r4.f13926p     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "rm"
            int r14 = r4.f13927q     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r12 = "riv"
            int r14 = r4.f13928r     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x091c }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r12.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r14 = "build_build"
            java.lang.String r15 = r4.f13936z     // Catch:{ JSONException -> 0x091c }
            r12.putString(r14, r15)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r14 = "build_device"
            java.lang.String r15 = r4.f13909A     // Catch:{ JSONException -> 0x091c }
            r12.putString(r14, r15)     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r14.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r15 = "is_charging"
            boolean r13 = r4.f13933w     // Catch:{ JSONException -> 0x091c }
            r14.putBoolean(r15, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = "battery_level"
            r19 = r10
            double r9 = r4.f13932v     // Catch:{ JSONException -> 0x091c }
            r14.putDouble(r13, r9)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "battery"
            r12.putBundle(r9, r14)     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r9.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "active_network_state"
            int r13 = r4.f13935y     // Catch:{ JSONException -> 0x091c }
            r9.putInt(r10, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "active_network_metered"
            boolean r13 = r4.f13934x     // Catch:{ JSONException -> 0x091c }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x091c }
            if (r7 == 0) goto L_0x0473
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r10.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = "predicted_latency_micros"
            int r14 = r7.f13977a     // Catch:{ JSONException -> 0x091c }
            r10.putInt(r13, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = "predicted_down_throughput_bps"
            long r14 = r7.f13978b     // Catch:{ JSONException -> 0x091c }
            r10.putLong(r13, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = "predicted_up_throughput_bps"
            long r14 = r7.f13979c     // Catch:{ JSONException -> 0x091c }
            r10.putLong(r13, r14)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "predictions"
            r9.putBundle(r7, r10)     // Catch:{ JSONException -> 0x091c }
        L_0x0473:
            java.lang.String r7 = "network"
            r12.putBundle(r7, r9)     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r7.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "is_browser_custom_tabs_capable"
            boolean r10 = r4.f13910B     // Catch:{ JSONException -> 0x091c }
            r7.putBoolean(r9, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "browser"
            r12.putBundle(r9, r7)     // Catch:{ JSONException -> 0x091c }
            if (r19 == 0) goto L_0x0548
            java.lang.String r7 = "android_mem_info"
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r9.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "runtime_free"
            java.lang.String r13 = "runtime_free_memory"
            r20 = r5
            r21 = r6
            r14 = r19
            r5 = -1
            long r15 = r14.getLong(r13, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r10, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "runtime_max"
            java.lang.String r13 = "runtime_max_memory"
            long r15 = r14.getLong(r13, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r10, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r10 = "runtime_total"
            java.lang.String r13 = "runtime_total_memory"
            long r5 = r14.getLong(r13, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = java.lang.Long.toString(r5)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r10, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = "web_view_count"
            java.lang.String r6 = "web_view_count"
            r10 = 0
            int r6 = r14.getInt(r6, r10)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r5, r6)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = "debug_memory_info"
            android.os.Parcelable r5 = r14.getParcelable(r5)     // Catch:{ JSONException -> 0x091c }
            android.os.Debug$MemoryInfo r5 = (android.os.Debug.MemoryInfo) r5     // Catch:{ JSONException -> 0x091c }
            if (r5 == 0) goto L_0x0544
            java.lang.String r6 = "debug_info_dalvik_private_dirty"
            int r13 = r5.dalvikPrivateDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_dalvik_pss"
            int r13 = r5.dalvikPss     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_dalvik_shared_dirty"
            int r13 = r5.dalvikSharedDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_native_private_dirty"
            int r13 = r5.nativePrivateDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_native_pss"
            int r13 = r5.nativePss     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_native_shared_dirty"
            int r13 = r5.nativeSharedDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_other_private_dirty"
            int r13 = r5.otherPrivateDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_other_pss"
            int r13 = r5.otherPss     // Catch:{ JSONException -> 0x091c }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r13)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "debug_info_other_shared_dirty"
            int r5 = r5.otherSharedDirty     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ JSONException -> 0x091c }
            r9.putString(r6, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0544:
            r12.putBundle(r7, r9)     // Catch:{ JSONException -> 0x091c }
            goto L_0x054d
        L_0x0548:
            r20 = r5
            r21 = r6
            r10 = 0
        L_0x054d:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r5.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "parental_controls"
            r5.putBundle(r6, r11)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = r4.f13922l     // Catch:{ JSONException -> 0x091c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x091c }
            if (r6 != 0) goto L_0x0566
            java.lang.String r6 = "package_version"
            java.lang.String r7 = r4.f13922l     // Catch:{ JSONException -> 0x091c }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x091c }
        L_0x0566:
            java.lang.String r6 = "play_store"
            r12.putBundle(r6, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = "device"
            r8.put(r5, r12)     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r5.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "doritos"
            java.lang.String r7 = r1.f13813f     // Catch:{ JSONException -> 0x091c }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "doritos_v2"
            java.lang.String r7 = r1.f13814g     // Catch:{ JSONException -> 0x091c }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r6 = com.google.android.gms.internal.ads.aqm.f12644aJ     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r7 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r6 = r7.mo12297a(r6)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x091c }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x091c }
            if (r6 == 0) goto L_0x05d1
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.f13816i     // Catch:{ JSONException -> 0x091c }
            if (r6 == 0) goto L_0x05a6
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.f13816i     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = r6.getId()     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.f13816i     // Catch:{ JSONException -> 0x091c }
            boolean r9 = r6.isLimitAdTrackingEnabled()     // Catch:{ JSONException -> 0x091c }
            goto L_0x05a8
        L_0x05a6:
            r7 = 0
            r9 = 0
        L_0x05a8:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x091c }
            if (r6 != 0) goto L_0x05c0
            java.lang.String r6 = "rdid"
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "is_lat"
            r5.putBoolean(r6, r9)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "idtype"
            java.lang.String r7 = "adid"
        L_0x05bc:
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x091c }
            goto L_0x05d1
        L_0x05c0:
            com.google.android.gms.internal.ads.ane.m16645a()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = com.google.android.gms.internal.ads.C3719lt.m19119b(r22)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "pdid"
            r5.putString(r7, r6)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r6 = "pdidtype"
            java.lang.String r7 = "ssaid"
            goto L_0x05bc
        L_0x05d1:
            java.lang.String r6 = "pii"
            r8.put(r6, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = "platform"
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x091c }
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r5 = "submodel"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x091c }
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x091c }
            if (r3 == 0) goto L_0x05ea
        L_0x05e6:
            m18352a(r8, r3)     // Catch:{ JSONException -> 0x091c }
            goto L_0x05fc
        L_0x05ea:
            com.google.android.gms.internal.ads.zzjj r3 = r2.f15259c     // Catch:{ JSONException -> 0x091c }
            int r3 = r3.f15481a     // Catch:{ JSONException -> 0x091c }
            r5 = 2
            if (r3 < r5) goto L_0x05fc
            com.google.android.gms.internal.ads.zzjj r3 = r2.f15259c     // Catch:{ JSONException -> 0x091c }
            android.location.Location r3 = r3.f15491k     // Catch:{ JSONException -> 0x091c }
            if (r3 == 0) goto L_0x05fc
            com.google.android.gms.internal.ads.zzjj r3 = r2.f15259c     // Catch:{ JSONException -> 0x091c }
            android.location.Location r3 = r3.f15491k     // Catch:{ JSONException -> 0x091c }
            goto L_0x05e6
        L_0x05fc:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 2
            if (r3 < r5) goto L_0x0608
            java.lang.String r3 = "quality_signals"
            android.os.Bundle r5 = r2.f15268l     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0608:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 4
            if (r3 < r5) goto L_0x061c
            boolean r3 = r2.f15272p     // Catch:{ JSONException -> 0x091c }
            if (r3 == 0) goto L_0x061c
            java.lang.String r3 = "forceHttps"
            boolean r5 = r2.f15272p     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x061c:
            if (r20 == 0) goto L_0x0625
            java.lang.String r3 = "content_info"
            r5 = r20
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0625:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 5
            if (r3 < r5) goto L_0x064c
            java.lang.String r3 = "u_sd"
            float r4 = r2.f15275s     // Catch:{ JSONException -> 0x091c }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "sh"
            int r4 = r2.f15274r     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "sw"
            int r4 = r2.f15273q     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
        L_0x0648:
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
            goto L_0x066b
        L_0x064c:
            java.lang.String r3 = "u_sd"
            float r5 = r4.f13929s     // Catch:{ JSONException -> 0x091c }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "sh"
            int r5 = r4.f13931u     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "sw"
            int r4 = r4.f13930t     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            goto L_0x0648
        L_0x066b:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r4 = 6
            if (r3 < r4) goto L_0x0697
            java.lang.String r3 = r2.f15276t     // Catch:{ JSONException -> 0x091c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x091c }
            if (r3 != 0) goto L_0x068c
            java.lang.String r3 = "view_hierarchy"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0685 }
            java.lang.String r5 = r2.f15276t     // Catch:{ JSONException -> 0x0685 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0685 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x0685 }
            goto L_0x068c
        L_0x0685:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "Problem serializing view hierarchy to JSON"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r4, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x068c:
            java.lang.String r3 = "correlation_id"
            long r4 = r2.f15277u     // Catch:{ JSONException -> 0x091c }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
        L_0x0697:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r4 = 7
            if (r3 < r4) goto L_0x06a3
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r2.f15278v     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
        L_0x06a3:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r4 = 12
            if (r3 < r4) goto L_0x06b8
            java.lang.String r3 = r2.f15229B     // Catch:{ JSONException -> 0x091c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x091c }
            if (r3 != 0) goto L_0x06b8
            java.lang.String r3 = "anchor"
            java.lang.String r4 = r2.f15229B     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
        L_0x06b8:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r4 = 13
            if (r3 < r4) goto L_0x06c9
            java.lang.String r3 = "android_app_volume"
            float r4 = r2.f15230C     // Catch:{ JSONException -> 0x091c }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
        L_0x06c9:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r4 = 18
            if (r3 < r4) goto L_0x06da
            java.lang.String r3 = "android_app_muted"
            boolean r5 = r2.f15236I     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x06da:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 14
            if (r3 < r5) goto L_0x06ef
            int r3 = r2.f15231D     // Catch:{ JSONException -> 0x091c }
            if (r3 <= 0) goto L_0x06ef
            java.lang.String r3 = "target_api"
            int r5 = r2.f15231D     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x06ef:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 15
            if (r3 < r5) goto L_0x0707
            java.lang.String r3 = "scroll_index"
            int r5 = r2.f15232E     // Catch:{ JSONException -> 0x091c }
            r6 = -1
            if (r5 != r6) goto L_0x06fd
            goto L_0x0700
        L_0x06fd:
            int r11 = r2.f15232E     // Catch:{ JSONException -> 0x091c }
            r6 = r11
        L_0x0700:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0707:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r5 = 16
            if (r3 < r5) goto L_0x0718
            java.lang.String r3 = "_activity_context"
            boolean r5 = r2.f15233F     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0718:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            if (r3 < r4) goto L_0x0743
            java.lang.String r3 = r2.f15237J     // Catch:{ JSONException -> 0x091c }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x091c }
            if (r3 != 0) goto L_0x0738
            java.lang.String r3 = "app_settings"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0731 }
            java.lang.String r6 = r2.f15237J     // Catch:{ JSONException -> 0x0731 }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0731 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0731 }
            goto L_0x0738
        L_0x0731:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Problem creating json from app settings"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r5, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x0738:
            java.lang.String r3 = "render_in_browser"
            boolean r5 = r2.f15238K     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x091c }
        L_0x0743:
            int r3 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            if (r3 < r4) goto L_0x0752
            java.lang.String r3 = "android_num_video_cache_tasks"
            int r4 = r2.f15239L     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x091c }
        L_0x0752:
            com.google.android.gms.internal.ads.zzang r3 = r2.f15267k     // Catch:{ JSONException -> 0x091c }
            boolean r4 = r2.f15253Z     // Catch:{ JSONException -> 0x091c }
            boolean r1 = r1.f13820m     // Catch:{ JSONException -> 0x091c }
            boolean r5 = r2.f15256ab     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r6.<init>()     // Catch:{ JSONException -> 0x091c }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r7.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "cl"
            java.lang.String r11 = "193400285"
            r7.putString(r9, r11)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "rapid_rc"
            java.lang.String r11 = "dev"
            r7.putString(r9, r11)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "rapid_rollup"
            java.lang.String r11 = "HEAD"
            r7.putString(r9, r11)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = "build_meta"
            r6.putBundle(r9, r7)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "mf"
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.aqm.f12709bV     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r11 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r9 = r11.mo12297a(r9)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ JSONException -> 0x091c }
            boolean r9 = r9.booleanValue()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r9 = java.lang.Boolean.toString(r9)     // Catch:{ JSONException -> 0x091c }
            r6.putString(r7, r9)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r7 = "instant_app"
            r6.putBoolean(r7, r4)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r4 = "lite"
            boolean r3 = r3.f15364e     // Catch:{ JSONException -> 0x091c }
            r6.putBoolean(r4, r3)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "local_service"
            r6.putBoolean(r3, r1)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = "is_privileged_process"
            r6.putBoolean(r1, r5)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = "sdk_env"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = "cache_state"
            r3 = r21
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
            int r1 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r3 = 19
            if (r1 < r3) goto L_0x07c6
            java.lang.String r1 = "gct"
            java.lang.String r3 = r2.f15241N     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x07c6:
            int r1 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r3 = 21
            if (r1 < r3) goto L_0x07d7
            boolean r1 = r2.f15243P     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x07d7
            java.lang.String r1 = "de"
            java.lang.String r3 = "1"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x07d7:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12654aT     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r3 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r1 = r3.mo12297a(r1)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x091c }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x081d
            com.google.android.gms.internal.ads.zzjn r1 = r2.f15260d     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = r1.f15499a     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "interstitial_mb"
            boolean r3 = r1.equals(r3)     // Catch:{ JSONException -> 0x091c }
            if (r3 != 0) goto L_0x0800
            java.lang.String r3 = "reward_mb"
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x07fe
            goto L_0x0800
        L_0x07fe:
            r1 = 0
            goto L_0x0801
        L_0x0800:
            r1 = 1
        L_0x0801:
            android.os.Bundle r3 = r2.f15244Q     // Catch:{ JSONException -> 0x091c }
            if (r3 == 0) goto L_0x0808
            r18 = 1
            goto L_0x080a
        L_0x0808:
            r18 = 0
        L_0x080a:
            if (r1 == 0) goto L_0x081d
            if (r18 == 0) goto L_0x081d
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x091c }
            r1.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r4 = "interstitial_pool"
            r1.putBundle(r4, r3)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r3 = "counters"
            r8.put(r3, r1)     // Catch:{ JSONException -> 0x091c }
        L_0x081d:
            java.lang.String r1 = r2.f15245R     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x0828
            java.lang.String r1 = "gmp_app_id"
            java.lang.String r3 = r2.f15245R     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x0828:
            java.lang.String r1 = r2.f15246S     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x084b
            java.lang.String r1 = "TIME_OUT"
            java.lang.String r3 = r2.f15246S     // Catch:{ JSONException -> 0x091c }
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x0846
            java.lang.String r1 = "sai_timeout"
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r3 = com.google.android.gms.internal.ads.aqm.f12682av     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r4 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r3 = r4.mo12297a(r3)     // Catch:{ JSONException -> 0x091c }
        L_0x0842:
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
            goto L_0x0850
        L_0x0846:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = r2.f15246S     // Catch:{ JSONException -> 0x091c }
            goto L_0x0842
        L_0x084b:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = ""
            goto L_0x0842
        L_0x0850:
            java.lang.String r1 = r2.f15247T     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x085b
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r3 = r2.f15247T     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x085b:
            int r1 = r2.f15254a     // Catch:{ JSONException -> 0x091c }
            r3 = 24
            if (r1 < r3) goto L_0x086c
            java.lang.String r1 = "disable_ml"
            boolean r3 = r2.f15255aa     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x086c:
            com.google.android.gms.internal.ads.aqc<java.lang.String> r1 = com.google.android.gms.internal.ads.aqm.f12612E     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r3 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r1 = r3.mo12297a(r1)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x08b3
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x091c }
            if (r3 != 0) goto L_0x08b3
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqc<java.lang.Integer> r4 = com.google.android.gms.internal.ads.aqm.f12613F     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r5 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r4 = r5.mo12297a(r4)     // Catch:{ JSONException -> 0x091c }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ JSONException -> 0x091c }
            int r4 = r4.intValue()     // Catch:{ JSONException -> 0x091c }
            if (r3 < r4) goto L_0x08b3
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x091c }
            r3.<init>()     // Catch:{ JSONException -> 0x091c }
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ JSONException -> 0x091c }
            int r4 = r1.length     // Catch:{ JSONException -> 0x091c }
        L_0x08a0:
            if (r10 >= r4) goto L_0x08ae
            r5 = r1[r10]     // Catch:{ JSONException -> 0x091c }
            java.util.List r6 = com.google.android.gms.internal.ads.C3717lr.m19097a(r5)     // Catch:{ JSONException -> 0x091c }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x091c }
            int r10 = r10 + 1
            goto L_0x08a0
        L_0x08ae:
            java.lang.String r1 = "video_decoders"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x08b3:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12826dg     // Catch:{ JSONException -> 0x091c }
            com.google.android.gms.internal.ads.aqk r3 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ JSONException -> 0x091c }
            java.lang.Object r1 = r3.mo12297a(r1)     // Catch:{ JSONException -> 0x091c }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x091c }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x08d4
            java.lang.String r1 = "omid_v"
            com.google.android.gms.internal.ads.o r3 = com.google.android.gms.ads.internal.zzbv.zzfa()     // Catch:{ JSONException -> 0x091c }
            r4 = r22
            java.lang.String r3 = r3.mo13346b(r4)     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x091c }
        L_0x08d4:
            java.util.ArrayList<java.lang.String> r1 = r2.f15257ac     // Catch:{ JSONException -> 0x091c }
            if (r1 == 0) goto L_0x08e7
            java.util.ArrayList<java.lang.String> r1 = r2.f15257ac     // Catch:{ JSONException -> 0x091c }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x091c }
            if (r1 != 0) goto L_0x08e7
            java.lang.String r1 = "android_permissions"
            java.util.ArrayList<java.lang.String> r2 = r2.f15257ac     // Catch:{ JSONException -> 0x091c }
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x091c }
        L_0x08e7:
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.C3643iy.m19171a(r1)     // Catch:{ JSONException -> 0x091c }
            if (r2 == 0) goto L_0x0913
            com.google.android.gms.internal.ads.jh r2 = com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ JSONException -> 0x091c }
            org.json.JSONObject r2 = r2.mo13124a(r8)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ JSONException -> 0x091c }
            java.lang.String r2 = "Ad Request JSON: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x091c }
            int r3 = r1.length()     // Catch:{ JSONException -> 0x091c }
            if (r3 == 0) goto L_0x090b
            java.lang.String r1 = r2.concat(r1)     // Catch:{ JSONException -> 0x091c }
            goto L_0x0910
        L_0x090b:
            java.lang.String r1 = new java.lang.String     // Catch:{ JSONException -> 0x091c }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x091c }
        L_0x0910:
            com.google.android.gms.internal.ads.C3643iy.m18780a(r1)     // Catch:{ JSONException -> 0x091c }
        L_0x0913:
            com.google.android.gms.internal.ads.jh r1 = com.google.android.gms.ads.internal.zzbv.zzek()     // Catch:{ JSONException -> 0x091c }
            org.json.JSONObject r1 = r1.mo13124a(r8)     // Catch:{ JSONException -> 0x091c }
            return r1
        L_0x091c:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Problem serializing ad request to JSON: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0933
            java.lang.String r1 = r2.concat(r1)
            goto L_0x0938
        L_0x0933:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x0938:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3524en.m18350a(android.content.Context, com.google.android.gms.internal.ads.eg):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m18351a(com.google.android.gms.internal.ads.zzaej r9) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r9.f15307a
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = "ad_base_url"
            java.lang.String r2 = r9.f15307a
            r0.put(r1, r2)
        L_0x0010:
            java.lang.String r1 = r9.f15318l
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "ad_size"
            java.lang.String r2 = r9.f15318l
            r0.put(r1, r2)
        L_0x001b:
            java.lang.String r1 = "native"
            boolean r2 = r9.f15325s
            r0.put(r1, r2)
            boolean r1 = r9.f15325s
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "ad_json"
        L_0x0028:
            java.lang.String r2 = r9.f15308b
            r0.put(r1, r2)
            goto L_0x0031
        L_0x002e:
            java.lang.String r1 = "ad_html"
            goto L_0x0028
        L_0x0031:
            java.lang.String r1 = r9.f15320n
            if (r1 == 0) goto L_0x003c
            java.lang.String r1 = "debug_dialog"
            java.lang.String r2 = r9.f15320n
            r0.put(r1, r2)
        L_0x003c:
            java.lang.String r1 = r9.f15294L
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = "debug_signals"
            java.lang.String r2 = r9.f15294L
            r0.put(r1, r2)
        L_0x0047:
            long r1 = r9.f15312f
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0060
            java.lang.String r1 = "interstitial_timeout"
            long r5 = r9.f15312f
            double r5 = (double) r5
            r7 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r7
            r0.put(r1, r5)
        L_0x0060:
            int r1 = r9.f15317k
            com.google.android.gms.internal.ads.jn r2 = com.google.android.gms.ads.internal.zzbv.zzem()
            int r2 = r2.mo13156b()
            if (r1 != r2) goto L_0x0074
            java.lang.String r1 = "orientation"
            java.lang.String r2 = "portrait"
        L_0x0070:
            r0.put(r1, r2)
            goto L_0x0085
        L_0x0074:
            int r1 = r9.f15317k
            com.google.android.gms.internal.ads.jn r2 = com.google.android.gms.ads.internal.zzbv.zzem()
            int r2 = r2.mo13143a()
            if (r1 != r2) goto L_0x0085
            java.lang.String r1 = "orientation"
            java.lang.String r2 = "landscape"
            goto L_0x0070
        L_0x0085:
            java.util.List<java.lang.String> r1 = r9.f15309c
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "click_urls"
            java.util.List<java.lang.String> r2 = r9.f15309c
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x0094:
            java.util.List<java.lang.String> r1 = r9.f15311e
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = "impression_urls"
            java.util.List<java.lang.String> r2 = r9.f15311e
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x00a3:
            java.util.List<java.lang.String> r1 = r9.f15300R
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = "downloaded_impression_urls"
            java.util.List<java.lang.String> r2 = r9.f15300R
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x00b2:
            java.util.List<java.lang.String> r1 = r9.f15315i
            if (r1 == 0) goto L_0x00c1
            java.lang.String r1 = "manual_impression_urls"
            java.util.List<java.lang.String> r2 = r9.f15315i
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x00c1:
            java.lang.String r1 = r9.f15323q
            if (r1 == 0) goto L_0x00cc
            java.lang.String r1 = "active_view"
            java.lang.String r2 = r9.f15323q
            r0.put(r1, r2)
        L_0x00cc:
            java.lang.String r1 = "ad_is_javascript"
            boolean r2 = r9.f15321o
            r0.put(r1, r2)
            java.lang.String r1 = r9.f15322p
            if (r1 == 0) goto L_0x00de
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r2 = r9.f15322p
            r0.put(r1, r2)
        L_0x00de:
            java.lang.String r1 = "mediation"
            boolean r2 = r9.f15313g
            r0.put(r1, r2)
            java.lang.String r1 = "custom_render_allowed"
            boolean r2 = r9.f15324r
            r0.put(r1, r2)
            java.lang.String r1 = "content_url_opted_out"
            boolean r2 = r9.f15327u
            r0.put(r1, r2)
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r2 = r9.f15295M
            r0.put(r1, r2)
            java.lang.String r1 = "prefetch"
            boolean r2 = r9.f15328v
            r0.put(r1, r2)
            long r1 = r9.f15316j
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x010e
            java.lang.String r1 = "refresh_interval_milliseconds"
            long r5 = r9.f15316j
            r0.put(r1, r5)
        L_0x010e:
            long r1 = r9.f15314h
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x011b
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r2 = r9.f15314h
            r0.put(r1, r2)
        L_0x011b:
            java.lang.String r1 = r9.f15330x
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x012a
            java.lang.String r1 = "gws_query_id"
            java.lang.String r2 = r9.f15330x
            r0.put(r1, r2)
        L_0x012a:
            java.lang.String r1 = "fluid"
            boolean r2 = r9.f15331y
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "height"
            goto L_0x0135
        L_0x0133:
            java.lang.String r2 = ""
        L_0x0135:
            r0.put(r1, r2)
            java.lang.String r1 = "native_express"
            boolean r2 = r9.f15332z
            r0.put(r1, r2)
            java.util.List<java.lang.String> r1 = r9.f15284B
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = "video_start_urls"
            java.util.List<java.lang.String> r2 = r9.f15284B
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x014e:
            java.util.List<java.lang.String> r1 = r9.f15285C
            if (r1 == 0) goto L_0x015d
            java.lang.String r1 = "video_complete_urls"
            java.util.List<java.lang.String> r2 = r9.f15285C
            org.json.JSONArray r2 = m18349a(r2)
            r0.put(r1, r2)
        L_0x015d:
            com.google.android.gms.internal.ads.zzaig r1 = r9.f15283A
            if (r1 == 0) goto L_0x0183
            java.lang.String r1 = "rewards"
            com.google.android.gms.internal.ads.zzaig r2 = r9.f15283A
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "rb_type"
            java.lang.String r5 = r2.f15350a
            r3.put(r4, r5)
            java.lang.String r4 = "rb_amount"
            int r2 = r2.f15351b
            r3.put(r4, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r2.put(r3)
            r0.put(r1, r2)
        L_0x0183:
            java.lang.String r1 = "use_displayed_impression"
            boolean r2 = r9.f15286D
            r0.put(r1, r2)
            java.lang.String r1 = "auto_protection_configuration"
            com.google.android.gms.internal.ads.zzael r2 = r9.f15287E
            r0.put(r1, r2)
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r9.f15291I
            r0.put(r1, r2)
            java.lang.String r1 = "disable_closable_area"
            boolean r9 = r9.f15301S
            r0.put(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3524en.m18351a(com.google.android.gms.internal.ads.zzaej):org.json.JSONObject");
    }

    /* renamed from: a */
    private static void m18352a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }
}
