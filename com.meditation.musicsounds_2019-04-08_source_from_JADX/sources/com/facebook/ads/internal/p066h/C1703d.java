package com.facebook.ads.internal.p066h;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import com.facebook.ads.internal.p077s.p078a.C1801l;
import com.facebook.ads.internal.p077s.p078a.C1804n;
import com.facebook.ads.internal.p077s.p078a.C1805o;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.d */
public class C1703d {

    /* renamed from: a */
    private static final String f5611a = "com.facebook.ads.internal.h.d";

    /* renamed from: b */
    private static final Object f5612b = new Object();

    /* renamed from: c */
    private static final Set<String> f5613c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private static final Map<String, Integer> f5614d = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static C1702c m8517a(Exception exc, Context context, Map<String, String> map) {
        try {
            C1702c cVar = new C1702c(C1801l.m8917b(), C1801l.m8918c(), new C1700a(C1804n.m8919a(exc), map, true).mo6876a());
            try {
                m8521a(cVar, context);
                return cVar;
            } catch (Exception unused) {
                return cVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static JSONArray m8518a(Context context) {
        return m8519a(context, -1);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [int] */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r9v9, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r9v14, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r9v16, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20, types: [int] */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r9v0, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v2
      assigns: []
      uses: []
      mth insns count: 134
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC, Splitter:B:57:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c6 A[Catch:{ IOException -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cb A[Catch:{ IOException -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00da A[SYNTHETIC, Splitter:B:72:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4 A[Catch:{ IOException -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9 A[Catch:{ IOException -> 0x00e0 }] */
    /* JADX WARNING: Unknown variable types count: 21 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m8519a(android.content.Context r8, int r9) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = f5612b
            monitor-enter(r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException | JSONException -> 0x00b2, all -> 0x00ad }
            java.io.File r4 = r8.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00b2, all -> 0x00ad }
            java.lang.String r5 = "debuglogs"
            r3.<init>(r4, r5)     // Catch:{ IOException | JSONException -> 0x00b2, all -> 0x00ad }
            boolean r3 = r3.exists()     // Catch:{ IOException | JSONException -> 0x00b2, all -> 0x00ad }
            if (r3 == 0) goto L_0x0090
            java.lang.String r3 = "debuglogs"
            java.io.FileInputStream r8 = r8.openFileInput(r3)     // Catch:{ IOException | JSONException -> 0x00b2, all -> 0x00ad }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x008d, all -> 0x008a }
            r3.<init>(r8)     // Catch:{ IOException | JSONException -> 0x008d, all -> 0x008a }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x0088 }
            r4.<init>(r3)     // Catch:{ IOException | JSONException -> 0x0088 }
        L_0x002a:
            java.lang.String r2 = r4.readLine()     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            if (r2 == 0) goto L_0x0080
            if (r9 == 0) goto L_0x0080
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            r5.<init>(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            java.lang.String r2 = "attempt"
            boolean r2 = r5.has(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            if (r2 != 0) goto L_0x0049
            java.lang.String r2 = "attempt"
            r6 = 0
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            r5.put(r2, r6)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
        L_0x0049:
            java.lang.String r2 = "id"
            java.lang.String r2 = r5.getString(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            java.util.Set<java.lang.String> r6 = f5613c     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            boolean r6 = r6.contains(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "attempt"
            int r6 = r5.getInt(r6)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5614d     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            boolean r7 = r7.containsKey(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            if (r7 == 0) goto L_0x0075
            java.lang.String r6 = "attempt"
            java.util.Map<java.lang.String, java.lang.Integer> r7 = f5614d     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            java.lang.Object r2 = r7.get(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            r5.put(r6, r2)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            goto L_0x0078
        L_0x0075:
            m8523a(r2, r6)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
        L_0x0078:
            r0.put(r5)     // Catch:{ IOException | JSONException -> 0x0085, all -> 0x0082 }
            if (r9 <= 0) goto L_0x002a
            int r9 = r9 + -1
            goto L_0x002a
        L_0x0080:
            r2 = r4
            goto L_0x0092
        L_0x0082:
            r9 = move-exception
            goto L_0x00d8
        L_0x0085:
            r9 = move-exception
            r2 = r4
            goto L_0x00b5
        L_0x0088:
            r9 = move-exception
            goto L_0x00b5
        L_0x008a:
            r9 = move-exception
            r3 = r2
            goto L_0x00b0
        L_0x008d:
            r9 = move-exception
            r3 = r2
            goto L_0x00b5
        L_0x0090:
            r8 = r2
            r3 = r8
        L_0x0092:
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009a
        L_0x0098:
            r8 = move-exception
            goto L_0x00a5
        L_0x009a:
            if (r3 == 0) goto L_0x009f
            r3.close()     // Catch:{ IOException -> 0x0098 }
        L_0x009f:
            if (r8 == 0) goto L_0x00d4
            r8.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x00d4
        L_0x00a5:
            java.lang.String r9 = f5611a     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Failed to close buffers"
        L_0x00a9:
            android.util.Log.e(r9, r2, r8)     // Catch:{ all -> 0x00de }
            goto L_0x00d4
        L_0x00ad:
            r9 = move-exception
            r8 = r2
            r3 = r8
        L_0x00b0:
            r4 = r3
            goto L_0x00d8
        L_0x00b2:
            r9 = move-exception
            r8 = r2
            r3 = r8
        L_0x00b5:
            java.lang.String r4 = f5611a     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = "Failed to read crashes"
            android.util.Log.e(r4, r5, r9)     // Catch:{ all -> 0x00d6 }
            if (r2 == 0) goto L_0x00c4
            r2.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00c4
        L_0x00c2:
            r8 = move-exception
            goto L_0x00cf
        L_0x00c4:
            if (r3 == 0) goto L_0x00c9
            r3.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c9:
            if (r8 == 0) goto L_0x00d4
            r8.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00d4
        L_0x00cf:
            java.lang.String r9 = f5611a     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Failed to close buffers"
            goto L_0x00a9
        L_0x00d4:
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            return r0
        L_0x00d6:
            r9 = move-exception
            r4 = r2
        L_0x00d8:
            if (r4 == 0) goto L_0x00e2
            r4.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00e2
        L_0x00de:
            r8 = move-exception
            goto L_0x00f5
        L_0x00e0:
            r8 = move-exception
            goto L_0x00ed
        L_0x00e2:
            if (r3 == 0) goto L_0x00e7
            r3.close()     // Catch:{ IOException -> 0x00e0 }
        L_0x00e7:
            if (r8 == 0) goto L_0x00f4
            r8.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00f4
        L_0x00ed:
            java.lang.String r0 = f5611a     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "Failed to close buffers"
            android.util.Log.e(r0, r2, r8)     // Catch:{ all -> 0x00de }
        L_0x00f4:
            throw r9     // Catch:{ all -> 0x00de }
        L_0x00f5:
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p066h.C1703d.m8519a(android.content.Context, int):org.json.JSONArray");
    }

    /* renamed from: a */
    private static JSONObject m8520a(C1702c cVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", UUID.randomUUID().toString());
        jSONObject.put("type", cVar.mo6878a());
        jSONObject.put("time", C1805o.m8920a(cVar.mo6879b()));
        jSONObject.put("session_time", C1805o.m8920a(cVar.mo6880c()));
        jSONObject.put("session_id", cVar.mo6881d());
        jSONObject.put("data", cVar.mo6882e() != null ? new JSONObject(cVar.mo6882e()) : new JSONObject());
        jSONObject.put("attempt", String.valueOf(0));
        return jSONObject;
    }

    /* renamed from: a */
    public static void m8521a(C1702c cVar, Context context) {
        if (cVar != null && context != null) {
            synchronized (f5612b) {
                try {
                    JSONObject a = m8520a(cVar);
                    FileOutputStream openFileOutput = context.openFileOutput("debuglogs", 32768);
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.toString());
                    sb.append("\n");
                    openFileOutput.write(sb.toString().getBytes());
                    openFileOutput.close();
                    m8530e(context);
                } catch (Exception e) {
                    Log.e(f5611a, "Failed to store crash", e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m8522a(String str) {
        Integer num = (Integer) f5614d.get(str);
        if (num == null) {
            num = Integer.valueOf(0);
        } else {
            f5614d.remove(str);
        }
        f5614d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: a */
    private static void m8523a(String str, int i) {
        if (!f5613c.contains(str)) {
            if (f5614d.containsKey(str)) {
                f5614d.remove(str);
            }
            f5614d.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException("finished event should not be updated to OngoingEvent.");
    }

    /* renamed from: b */
    public static void m8524b(Context context) {
        synchronized (f5612b) {
            File file = new File(context.getFilesDir(), "debuglogs");
            if (file.exists()) {
                file.delete();
            }
            m8525b(context, 0);
            f5613c.clear();
            f5614d.clear();
        }
    }

    /* renamed from: b */
    private static void m8525b(Context context, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).edit();
        String str = "EventCount";
        if (i < 0) {
            i = 0;
        }
        edit.putInt(str, i).apply();
    }

    /* renamed from: b */
    public static void m8526b(String str) {
        if (f5614d.containsKey(str)) {
            f5614d.remove(str);
        }
        f5613c.add(str);
    }

    /* renamed from: c */
    public static int m8527c(Context context) {
        return context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) - f5613c.size();
    }

    /* renamed from: c */
    public static boolean m8528c(String str) {
        return f5613c.contains(str) || f5614d.containsKey(str);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.io.Reader, java.io.InputStreamReader] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1
      assigns: []
      uses: []
      mth insns count: 173
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0138 A[Catch:{ IOException -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f6 A[SYNTHETIC, Splitter:B:70:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fe A[Catch:{ IOException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0103 A[Catch:{ IOException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0108 A[Catch:{ IOException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0124 A[SYNTHETIC, Splitter:B:89:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x012e A[Catch:{ IOException -> 0x012a }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0133 A[Catch:{ IOException -> 0x012a }] */
    /* JADX WARNING: Unknown variable types count: 20 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8529d(android.content.Context r11) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = f5612b
            monitor-enter(r1)
            r2 = 0
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ IOException | JSONException -> 0x00e9, all -> 0x00e4 }
            java.io.File r5 = r11.getFilesDir()     // Catch:{ IOException | JSONException -> 0x00e9, all -> 0x00e4 }
            java.lang.String r6 = "debuglogs"
            r4.<init>(r5, r6)     // Catch:{ IOException | JSONException -> 0x00e9, all -> 0x00e4 }
            boolean r4 = r4.exists()     // Catch:{ IOException | JSONException -> 0x00e9, all -> 0x00e4 }
            if (r4 == 0) goto L_0x00ac
            java.lang.String r4 = "debuglogs"
            java.io.FileInputStream r4 = r11.openFileInput(r4)     // Catch:{ IOException | JSONException -> 0x00e9, all -> 0x00e4 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException | JSONException -> 0x00a8, all -> 0x00a5 }
            r5.<init>(r4)     // Catch:{ IOException | JSONException -> 0x00a8, all -> 0x00a5 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException | JSONException -> 0x00a2, all -> 0x009e }
            r6.<init>(r5)     // Catch:{ IOException | JSONException -> 0x00a2, all -> 0x009e }
        L_0x002b:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            if (r7 == 0) goto L_0x005f
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r8.<init>(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.lang.String r7 = "id"
            java.lang.String r7 = r8.getString(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.util.Set<java.lang.String> r9 = f5613c     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            boolean r9 = r9.contains(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            if (r9 != 0) goto L_0x002b
            java.util.Map<java.lang.String, java.lang.Integer> r9 = f5614d     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            boolean r9 = r9.containsKey(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            if (r9 == 0) goto L_0x005b
            java.lang.String r9 = "attempt"
            java.util.Map<java.lang.String, java.lang.Integer> r10 = f5614d     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r8.put(r9, r7)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
        L_0x005b:
            r0.put(r8)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            goto L_0x002b
        L_0x005f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r7.<init>()     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            int r8 = r0.length()     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r9 = 0
        L_0x0069:
            if (r9 >= r8) goto L_0x007e
            org.json.JSONObject r10 = r0.getJSONObject(r9)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r7.append(r10)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            r10 = 10
            r7.append(r10)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            int r9 = r9 + 1
            goto L_0x0069
        L_0x007e:
            java.lang.String r0 = "debuglogs"
            java.io.FileOutputStream r0 = r11.openFileOutput(r0, r2)     // Catch:{ IOException | JSONException -> 0x0099, all -> 0x0096 }
            java.lang.String r3 = r7.toString()     // Catch:{ IOException | JSONException -> 0x0094, all -> 0x0091 }
            byte[] r3 = r3.getBytes()     // Catch:{ IOException | JSONException -> 0x0094, all -> 0x0091 }
            r0.write(r3)     // Catch:{ IOException | JSONException -> 0x0094, all -> 0x0091 }
            r3 = r6
            goto L_0x00af
        L_0x0091:
            r11 = move-exception
            goto L_0x0121
        L_0x0094:
            r11 = move-exception
            goto L_0x009b
        L_0x0096:
            r11 = move-exception
            goto L_0x0122
        L_0x0099:
            r11 = move-exception
            r0 = r3
        L_0x009b:
            r3 = r6
            goto L_0x00ed
        L_0x009e:
            r11 = move-exception
            r6 = r3
            goto L_0x0122
        L_0x00a2:
            r11 = move-exception
            r0 = r3
            goto L_0x00ed
        L_0x00a5:
            r11 = move-exception
            r5 = r3
            goto L_0x00e7
        L_0x00a8:
            r11 = move-exception
            r0 = r3
            r5 = r0
            goto L_0x00ed
        L_0x00ac:
            r0 = r3
            r4 = r0
            r5 = r4
        L_0x00af:
            int r6 = m8527c(r11)     // Catch:{ IOException | JSONException -> 0x00e2 }
            m8525b(r11, r6)     // Catch:{ IOException | JSONException -> 0x00e2 }
            if (r3 == 0) goto L_0x00be
            r3.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00be
        L_0x00bc:
            r11 = move-exception
            goto L_0x00ce
        L_0x00be:
            if (r5 == 0) goto L_0x00c3
            r5.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00c3:
            if (r4 == 0) goto L_0x00c8
            r4.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00c8:
            if (r0 == 0) goto L_0x00d5
            r0.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00d5
        L_0x00ce:
            java.lang.String r0 = f5611a     // Catch:{ all -> 0x0128 }
            java.lang.String r2 = "Failed to close buffers"
            android.util.Log.e(r0, r2, r11)     // Catch:{ all -> 0x0128 }
        L_0x00d5:
            java.util.Set<java.lang.String> r11 = f5613c     // Catch:{ all -> 0x0128 }
            r11.clear()     // Catch:{ all -> 0x0128 }
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f5614d     // Catch:{ all -> 0x0128 }
            r11.clear()     // Catch:{ all -> 0x0128 }
            monitor-exit(r1)     // Catch:{ all -> 0x0128 }
            r11 = 1
            return r11
        L_0x00e2:
            r11 = move-exception
            goto L_0x00ed
        L_0x00e4:
            r11 = move-exception
            r4 = r3
            r5 = r4
        L_0x00e7:
            r6 = r5
            goto L_0x0122
        L_0x00e9:
            r11 = move-exception
            r0 = r3
            r4 = r0
            r5 = r4
        L_0x00ed:
            java.lang.String r6 = f5611a     // Catch:{ all -> 0x011f }
            java.lang.String r7 = "Failed to rewrite File."
            android.util.Log.e(r6, r7, r11)     // Catch:{ all -> 0x011f }
            if (r3 == 0) goto L_0x00fc
            r3.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x00fc
        L_0x00fa:
            r11 = move-exception
            goto L_0x010c
        L_0x00fc:
            if (r5 == 0) goto L_0x0101
            r5.close()     // Catch:{ IOException -> 0x00fa }
        L_0x0101:
            if (r4 == 0) goto L_0x0106
            r4.close()     // Catch:{ IOException -> 0x00fa }
        L_0x0106:
            if (r0 == 0) goto L_0x0113
            r0.close()     // Catch:{ IOException -> 0x00fa }
            goto L_0x0113
        L_0x010c:
            java.lang.String r0 = f5611a     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "Failed to close buffers"
            android.util.Log.e(r0, r3, r11)     // Catch:{ all -> 0x0128 }
        L_0x0113:
            java.util.Set<java.lang.String> r11 = f5613c     // Catch:{ all -> 0x0128 }
            r11.clear()     // Catch:{ all -> 0x0128 }
            java.util.Map<java.lang.String, java.lang.Integer> r11 = f5614d     // Catch:{ all -> 0x0128 }
            r11.clear()     // Catch:{ all -> 0x0128 }
            monitor-exit(r1)     // Catch:{ all -> 0x0128 }
            return r2
        L_0x011f:
            r11 = move-exception
            r6 = r3
        L_0x0121:
            r3 = r0
        L_0x0122:
            if (r6 == 0) goto L_0x012c
            r6.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x012c
        L_0x0128:
            r11 = move-exception
            goto L_0x014e
        L_0x012a:
            r0 = move-exception
            goto L_0x013c
        L_0x012c:
            if (r5 == 0) goto L_0x0131
            r5.close()     // Catch:{ IOException -> 0x012a }
        L_0x0131:
            if (r4 == 0) goto L_0x0136
            r4.close()     // Catch:{ IOException -> 0x012a }
        L_0x0136:
            if (r3 == 0) goto L_0x0143
            r3.close()     // Catch:{ IOException -> 0x012a }
            goto L_0x0143
        L_0x013c:
            java.lang.String r2 = f5611a     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "Failed to close buffers"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0128 }
        L_0x0143:
            java.util.Set<java.lang.String> r0 = f5613c     // Catch:{ all -> 0x0128 }
            r0.clear()     // Catch:{ all -> 0x0128 }
            java.util.Map<java.lang.String, java.lang.Integer> r0 = f5614d     // Catch:{ all -> 0x0128 }
            r0.clear()     // Catch:{ all -> 0x0128 }
            throw r11     // Catch:{ all -> 0x0128 }
        L_0x014e:
            monitor-exit(r1)     // Catch:{ all -> 0x0128 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p066h.C1703d.m8529d(android.content.Context):boolean");
    }

    /* renamed from: e */
    private static void m8530e(Context context) {
        m8525b(context, context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) + 1);
    }
}
