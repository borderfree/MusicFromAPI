package com.facebook;

import com.facebook.internal.C2240r;
import com.facebook.internal.C2258x;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.i */
public class C2199i {

    /* renamed from: a */
    private final HttpURLConnection f7139a;

    /* renamed from: b */
    private final JSONObject f7140b;

    /* renamed from: c */
    private final JSONArray f7141c;

    /* renamed from: d */
    private final FacebookRequestError f7142d;

    /* renamed from: e */
    private final String f7143e;

    /* renamed from: f */
    private final GraphRequest f7144f;

    C2199i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(graphRequest, httpURLConnection, null, null, null, facebookRequestError);
    }

    C2199i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(graphRequest, httpURLConnection, str, null, jSONArray, null);
    }

    C2199i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(graphRequest, httpURLConnection, str, jSONObject, null, null);
    }

    C2199i(GraphRequest graphRequest, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        this.f7144f = graphRequest;
        this.f7139a = httpURLConnection;
        this.f7143e = str;
        this.f7140b = jSONObject;
        this.f7141c = jSONArray;
        this.f7142d = facebookRequestError;
    }

    /* renamed from: a */
    private static C2199i m10127a(GraphRequest graphRequest, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            FacebookRequestError a = FacebookRequestError.m8011a(jSONObject, obj2, httpURLConnection);
            if (a != null) {
                if (a.mo6555c() == 190 && C2258x.m10390a(graphRequest.mo6581f())) {
                    AccessToken.m7989a((AccessToken) null);
                }
                return new C2199i(graphRequest, httpURLConnection, a);
            }
            Object a2 = C2258x.m10361a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (a2 instanceof JSONObject) {
                return new C2199i(graphRequest, httpURLConnection, a2.toString(), (JSONObject) a2);
            }
            if (a2 instanceof JSONArray) {
                return new C2199i(graphRequest, httpURLConnection, a2.toString(), (JSONArray) a2);
            }
            obj = JSONObject.NULL;
        }
        if (obj == JSONObject.NULL) {
            return new C2199i(graphRequest, httpURLConnection, obj.toString(), (JSONObject) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Got unexpected object type in response, class: ");
        sb.append(obj.getClass().getSimpleName());
        throw new FacebookException(sb.toString());
    }

    /* renamed from: a */
    static List<C2199i> m10128a(InputStream inputStream, HttpURLConnection httpURLConnection, C2196h hVar) {
        String a = C2258x.m10365a(inputStream);
        C2240r.m10259a(LoggingBehavior.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(a.length()), a);
        return m10129a(a, httpURLConnection, hVar);
    }

    /* renamed from: a */
    static List<C2199i> m10129a(String str, HttpURLConnection httpURLConnection, C2196h hVar) {
        List<C2199i> a = m10131a(httpURLConnection, (List<GraphRequest>) hVar, new JSONTokener(str).nextValue());
        C2240r.m10259a(LoggingBehavior.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", hVar.mo7780b(), Integer.valueOf(str.length()), a);
        return a;
    }

    /* renamed from: a */
    static List<C2199i> m10130a(HttpURLConnection httpURLConnection, C2196h hVar) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            return m10128a(inputStream, httpURLConnection, hVar);
        } catch (FacebookException e) {
            C2240r.m10259a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e);
            return m10132a((List<GraphRequest>) hVar, httpURLConnection, e);
        } catch (Exception e2) {
            C2240r.m10259a(LoggingBehavior.REQUESTS, "Response", "Response <Error>: %s", e2);
            return m10132a((List<GraphRequest>) hVar, httpURLConnection, new FacebookException((Throwable) e2));
        } finally {
            C2258x.m10380a(inputStream);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.facebook.C2199i> m10131a(java.net.HttpURLConnection r7, java.util.List<com.facebook.GraphRequest> r8, java.lang.Object r9) {
        /*
            int r0 = r8.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x004e
            java.lang.Object r3 = r8.get(r2)
            com.facebook.GraphRequest r3 = (com.facebook.GraphRequest) r3
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r4.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            java.lang.String r5 = "body"
            r4.put(r5, r9)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            if (r7 == 0) goto L_0x0024
            int r5 = r7.getResponseCode()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x0026
        L_0x0024:
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0026:
            java.lang.String r6 = "code"
            r4.put(r6, r5)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.<init>()     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            r5.put(r4)     // Catch:{ JSONException -> 0x0040, IOException -> 0x0034 }
            goto L_0x004f
        L_0x0034:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
            goto L_0x004b
        L_0x0040:
            r4 = move-exception
            com.facebook.i r5 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r4)
            r5.<init>(r3, r7, r6)
        L_0x004b:
            r1.add(r5)
        L_0x004e:
            r5 = r9
        L_0x004f:
            boolean r3 = r5 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0091
            org.json.JSONArray r5 = (org.json.JSONArray) r5
            int r3 = r5.length()
            if (r3 != r0) goto L_0x0091
        L_0x005b:
            int r0 = r5.length()
            if (r2 >= r0) goto L_0x0090
            java.lang.Object r0 = r8.get(r2)
            com.facebook.GraphRequest r0 = (com.facebook.GraphRequest) r0
            java.lang.Object r3 = r5.get(r2)     // Catch:{ JSONException -> 0x007f, FacebookException -> 0x0073 }
            com.facebook.i r3 = m10127a(r0, r7, r3, r9)     // Catch:{ JSONException -> 0x007f, FacebookException -> 0x0073 }
            r1.add(r3)     // Catch:{ JSONException -> 0x007f, FacebookException -> 0x0073 }
            goto L_0x008d
        L_0x0073:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
            goto L_0x008a
        L_0x007f:
            r3 = move-exception
            com.facebook.i r4 = new com.facebook.i
            com.facebook.FacebookRequestError r6 = new com.facebook.FacebookRequestError
            r6.<init>(r7, r3)
            r4.<init>(r0, r7, r6)
        L_0x008a:
            r1.add(r4)
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0090:
            return r1
        L_0x0091:
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r8 = "Unexpected number of results"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C2199i.m10131a(java.net.HttpURLConnection, java.util.List, java.lang.Object):java.util.List");
    }

    /* renamed from: a */
    static List<C2199i> m10132a(List<GraphRequest> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2199i((GraphRequest) list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, (Exception) facebookException)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final FacebookRequestError mo7795a() {
        return this.f7142d;
    }

    /* renamed from: b */
    public final JSONObject mo7796b() {
        return this.f7140b;
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            String str2 = "%d";
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(this.f7139a != null ? this.f7139a.getResponseCode() : 200);
            str = String.format(locale, str2, objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{Response: ");
        sb.append(" responseCode: ");
        sb.append(str);
        sb.append(", graphObject: ");
        sb.append(this.f7140b);
        sb.append(", error: ");
        sb.append(this.f7142d);
        sb.append("}");
        return sb.toString();
    }
}
