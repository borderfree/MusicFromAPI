package com.seattleclouds.mbfx;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.mbfx.a */
public class C5467a {

    /* renamed from: a */
    public static String f19460a = "DynamicHTML";

    /* renamed from: com.seattleclouds.mbfx.a$a */
    public interface C5468a {
        /* renamed from: a */
        void mo17777a(String str);

        /* renamed from: b_ */
        void mo17778b_(int i);

        /* renamed from: x_ */
        void mo17779x_();

        /* renamed from: y_ */
        void mo17780y_();
    }

    /* renamed from: a */
    public static Object m27252a(Object obj, String str) {
        if (obj == null || str == null) {
            return obj;
        }
        String[] split = str.split("\\.");
        if (!obj.getClass().equals(JSONObject.class)) {
            return obj;
        }
        if (str.indexOf(".") == -1) {
            try {
                return ((JSONObject) obj).get(str);
            } catch (JSONException e) {
                e.printStackTrace();
                return obj;
            } catch (NullPointerException e2) {
                String str2 = f19460a;
                StringBuilder sb = new StringBuilder();
                sb.append("getJSONforPath: ");
                sb.append(e2);
                Log.e(str2, sb.toString());
                return obj;
            }
        } else if (split.length <= 0) {
            return obj;
        } else {
            for (String str3 : split) {
                try {
                    String str4 = f19460a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("KEY: ");
                    sb2.append(str3);
                    Log.e(str4, sb2.toString());
                    obj = ((JSONObject) obj).get(str3);
                } catch (JSONException unused) {
                    String str5 = f19460a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getJSONforPath: ");
                    sb3.append(str);
                    Log.e(str5, sb3.toString());
                } catch (NullPointerException e3) {
                    String str6 = f19460a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("getJSONforPath: ");
                    sb4.append(e3);
                    Log.e(str6, sb4.toString());
                }
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static String m27253a(String str) {
        String substring;
        String str2;
        String str3;
        StringBuilder sb;
        String str4;
        if (str != null) {
            while (true) {
                int indexOf = str.indexOf("{");
                if (indexOf == -1) {
                    break;
                }
                String substring2 = str.substring(indexOf);
                int indexOf2 = substring2.indexOf("}");
                if (indexOf2 != -1) {
                    substring = substring2.substring(0, indexOf2 + 1);
                    int indexOf3 = substring2.indexOf("}");
                    if (indexOf3 != -1) {
                        str2 = "";
                        try {
                            str3 = (String) User.class.getField(substring2.substring(1, indexOf3)).get(C5469b.m27263a());
                        } catch (SecurityException e) {
                            e = e;
                            str4 = f19460a;
                            sb = new StringBuilder();
                        } catch (NoSuchFieldException e2) {
                            e = e2;
                            str4 = f19460a;
                            sb = new StringBuilder();
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            str4 = f19460a;
                            sb = new StringBuilder();
                        } catch (IllegalAccessException e4) {
                            e = e4;
                            str4 = f19460a;
                            sb = new StringBuilder();
                        } catch (NullPointerException e5) {
                            e = e5;
                            str4 = f19460a;
                            sb = new StringBuilder();
                        }
                        str = str.replace(substring, str3.toString());
                    }
                }
            }
        }
        return str;
        sb.append("replaceMBFXContextinURL: ");
        sb.append(e);
        Log.e(str4, sb.toString());
        str3 = str2;
        str = str.replace(substring, str3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:32:0x00c6 ?: BREAK  
    EDGE_INSN: B:56:0x00c6->B:32:0x00c6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27254a(java.lang.String r9, java.lang.Object r10) {
        /*
            java.lang.Class r0 = r10.getClass()
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0010
            r0 = r10
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            goto L_0x002f
        L_0x0010:
            java.lang.Class r0 = r10.getClass()
            java.lang.Class<org.json.JSONArray> r1 = org.json.JSONArray.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0020
            r0 = r10
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            goto L_0x0030
        L_0x0020:
            java.lang.Class r0 = r10.getClass()
            java.lang.Class<org.json.JSONStringer> r1 = org.json.JSONStringer.class
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            r0 = r10
            org.json.JSONStringer r0 = (org.json.JSONStringer) r0
        L_0x002f:
            r0 = 0
        L_0x0030:
            r1 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.String r2 = ""
            r3 = r2
            r2 = 0
        L_0x0037:
            int r4 = r0.length()
            if (r2 >= r4) goto L_0x0089
            java.lang.String r4 = ""
            java.lang.Object r5 = r0.get(r2)     // Catch:{ JSONException -> 0x0061, NullPointerException -> 0x0049 }
            java.lang.String r5 = m27254a(r9, r5)     // Catch:{ JSONException -> 0x0061, NullPointerException -> 0x0049 }
            r4 = r5
            goto L_0x0077
        L_0x0049:
            r5 = move-exception
            java.lang.String r6 = f19460a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "processDynamicBlock: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            android.util.Log.e(r6, r5)
            goto L_0x0077
        L_0x0061:
            java.lang.String r5 = f19460a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "processDynamicBlock Array index: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r5, r6)
        L_0x0077:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            int r2 = r2 + 1
            goto L_0x0037
        L_0x0089:
            r9 = r3
        L_0x008a:
            java.lang.String r0 = "[%for-each"
            int r0 = r9.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L_0x00c6
            java.lang.String r0 = r9.substring(r0)
            java.lang.String r3 = "[%end for-each%]"
            int r3 = r0.indexOf(r3)
            if (r3 == r2) goto L_0x008a
            int r4 = r3 + 16
            java.lang.String r4 = r0.substring(r1, r4)
            java.lang.String r5 = "%]"
            int r5 = r0.indexOf(r5)
            if (r5 == r2) goto L_0x008a
            r2 = 11
            java.lang.String r2 = r0.substring(r2, r5)
            int r5 = r5 + 2
            java.lang.String r0 = r0.substring(r5, r3)
            java.lang.Object r2 = m27252a(r10, r2)
            java.lang.String r0 = m27254a(r0, r2)
            java.lang.String r9 = r9.replace(r4, r0)
            goto L_0x008a
        L_0x00c6:
            java.lang.String r0 = "[%="
            int r0 = r9.indexOf(r0)
            if (r0 == r2) goto L_0x0136
            java.lang.String r0 = r9.substring(r0)
            java.lang.String r3 = "%]"
            int r3 = r0.indexOf(r3)
            if (r3 == r2) goto L_0x00c6
            int r3 = r3 + 2
            java.lang.String r3 = r0.substring(r1, r3)
            java.lang.String r4 = "%]"
            int r4 = r0.indexOf(r4)
            if (r4 == r2) goto L_0x00c6
            r5 = 3
            java.lang.String r0 = r0.substring(r5, r4)
            java.lang.Object r0 = m27252a(r10, r0)
            java.lang.String r4 = ""
            java.lang.Class r5 = r0.getClass()     // Catch:{ NullPointerException -> 0x0116 }
            java.lang.Class<org.json.JSONStringer> r6 = org.json.JSONStringer.class
            boolean r5 = r5.equals(r6)     // Catch:{ NullPointerException -> 0x0116 }
            if (r5 == 0) goto L_0x0107
            org.json.JSONStringer r0 = (org.json.JSONStringer) r0     // Catch:{ NullPointerException -> 0x0116 }
            java.lang.String r0 = r0.toString()     // Catch:{ NullPointerException -> 0x0116 }
        L_0x0105:
            r4 = r0
            goto L_0x012d
        L_0x0107:
            java.lang.Class r5 = r0.getClass()     // Catch:{ NullPointerException -> 0x0116 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = r5.equals(r6)     // Catch:{ NullPointerException -> 0x0116 }
            if (r5 == 0) goto L_0x012d
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NullPointerException -> 0x0116 }
            goto L_0x0105
        L_0x0116:
            r0 = move-exception
            java.lang.String r5 = f19460a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "processDynamicBlock Process values: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.e(r5, r0)
        L_0x012d:
            java.lang.String r0 = r4.toString()
            java.lang.String r9 = r9.replace(r3, r0)
            goto L_0x00c6
        L_0x0136:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.mbfx.C5467a.m27254a(java.lang.String, java.lang.Object):java.lang.String");
    }

    /* renamed from: a */
    public static JSONObject m27255a(int i, JSONObject jSONObject) {
        if (i != -1) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("items");
                return (jSONArray == null || jSONArray.length() <= i) ? null : jSONArray.getJSONObject(i);
            } catch (JSONException unused) {
                Log.e("getJsonForRssItem", "Error getting JSONObject");
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        new org.json.JSONObject("{}");
        r9.mo17778b_(5);
        r9.mo17780y_();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0072 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m27256a(java.lang.String r6, org.json.JSONObject r7, android.app.Activity r8, com.seattleclouds.mbfx.C5467a.C5468a r9) {
        /*
            r9.mo17779x_()
            android.net.Uri r0 = android.net.Uri.parse(r6)
            java.lang.String r1 = r0.getLastPathSegment()
            com.seattleclouds.a r2 = com.seattleclouds.App.f18501c
            java.util.Map r2 = r2.mo16902D()
            java.lang.Object r2 = r2.get(r1)
            com.seattleclouds.aa r2 = (com.seattleclouds.C5230aa) r2
            java.lang.String r3 = "itemid"
            java.lang.String r3 = r0.getQueryParameter(r3)
            r4 = -1
            if (r3 == 0) goto L_0x002f
            java.lang.String r3 = "itemid"
            java.lang.String r0 = r0.getQueryParameter(r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x002f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x002f }
            goto L_0x0030
        L_0x002f:
            r0 = -1
        L_0x0030:
            if (r2 == 0) goto L_0x011e
            boolean r3 = r2.mo16999C()
            if (r3 == 0) goto L_0x011e
            java.lang.String r3 = r2.mo17046a()     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.io.InputStream r3 = com.seattleclouds.App.m25649e(r3)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r3 = com.seattleclouds.util.C6613i.m31991b(r3)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r6 = m27258c(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r5 = ""
            boolean r5 = r6.equalsIgnoreCase(r5)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            if (r5 == 0) goto L_0x0054
            java.lang.String r6 = r2.mo16994A()     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
        L_0x0054:
            if (r7 != 0) goto L_0x0081
            java.lang.String r6 = m27253a(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r6 = com.seattleclouds.util.HTTPUtil.m31767b(r6)     // Catch:{ IllegalStateException -> 0x0072 }
            if (r6 == 0) goto L_0x006c
            java.lang.String r7 = "{"
            int r7 = r6.indexOf(r7)     // Catch:{ IllegalStateException -> 0x0072 }
            if (r7 == r4) goto L_0x006c
            java.lang.String r6 = r6.substring(r7)     // Catch:{ IllegalStateException -> 0x0072 }
        L_0x006c:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ IllegalStateException -> 0x0072 }
            r7.<init>(r6)     // Catch:{ IllegalStateException -> 0x0072 }
            goto L_0x0085
        L_0x0072:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r7 = "{}"
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            r6 = 5
            r9.mo17778b_(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            r9.mo17780y_()     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            return
        L_0x0081:
            org.json.JSONObject r7 = m27255a(r0, r7)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
        L_0x0085:
            if (r0 != r4) goto L_0x008b
            com.seattleclouds.App.m25634b(r8, r1)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            goto L_0x00b4
        L_0x008b:
            java.lang.String r6 = "identifier"
            java.lang.String r6 = r7.getString(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            if (r6 != 0) goto L_0x0099
            java.lang.String r6 = "title"
            java.lang.String r6 = r7.getString(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
        L_0x0099:
            if (r6 != 0) goto L_0x009d
            java.lang.String r6 = ""
        L_0x009d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            r0.append(r1)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r1 = "_"
            r0.append(r1)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            r0.append(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r6 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            com.seattleclouds.App.m25634b(r8, r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
        L_0x00b4:
            java.lang.String r6 = m27254a(r3, r7)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            java.lang.String r6 = m27257b(r6)     // Catch:{ FileNotFoundException -> 0x0105, IOException -> 0x00ec, JSONException -> 0x00cd }
            if (r6 == 0) goto L_0x00c9
            java.lang.String r7 = ""
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00c9
            r9.mo17777a(r6)
        L_0x00c9:
            r9.mo17780y_()
            return
        L_0x00cd:
            r6 = move-exception
            java.lang.String r7 = f19460a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "dynamic page: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r7, r8, r6)
            r6 = 3
        L_0x00e5:
            r9.mo17778b_(r6)
        L_0x00e8:
            r9.mo17780y_()
            return
        L_0x00ec:
            r6 = move-exception
            java.lang.String r7 = f19460a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "dynamic page: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r7, r8, r6)
            r6 = 1
            goto L_0x00e5
        L_0x0105:
            r6 = move-exception
            java.lang.String r7 = f19460a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "dynamic page: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.e(r7, r8, r6)
            r6 = 2
            goto L_0x00e5
        L_0x011e:
            r9.mo17778b_(r4)
            goto L_0x00e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.mbfx.C5467a.m27256a(java.lang.String, org.json.JSONObject, android.app.Activity, com.seattleclouds.mbfx.a$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m27257b(java.lang.String r6) {
        /*
        L_0x0000:
            java.lang.String r0 = "{%="
            int r0 = r6.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L_0x0086
            java.lang.String r0 = r6.substring(r0)
            java.lang.String r2 = "%}"
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L_0x0000
            r3 = 0
            int r2 = r2 + 2
            java.lang.String r2 = r0.substring(r3, r2)
            java.lang.String r3 = "%}"
            int r3 = r0.indexOf(r3)
            if (r3 == r1) goto L_0x0000
            r1 = 3
            java.lang.String r0 = r0.substring(r1, r3)
            java.lang.String r1 = ""
            java.lang.Class<com.seattleclouds.mbfx.User> r3 = com.seattleclouds.mbfx.User.class
            java.lang.reflect.Field r0 = r3.getField(r0)     // Catch:{ SecurityException -> 0x0060, NoSuchFieldException -> 0x0057, IllegalArgumentException -> 0x004e, IllegalAccessException -> 0x0045, NullPointerException -> 0x003c }
            com.seattleclouds.mbfx.User r3 = com.seattleclouds.mbfx.C5469b.m27263a()     // Catch:{ SecurityException -> 0x0060, NoSuchFieldException -> 0x0057, IllegalArgumentException -> 0x004e, IllegalAccessException -> 0x0045, NullPointerException -> 0x003c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ SecurityException -> 0x0060, NoSuchFieldException -> 0x0057, IllegalArgumentException -> 0x004e, IllegalAccessException -> 0x0045, NullPointerException -> 0x003c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SecurityException -> 0x0060, NoSuchFieldException -> 0x0057, IllegalArgumentException -> 0x004e, IllegalAccessException -> 0x0045, NullPointerException -> 0x003c }
            goto L_0x0078
        L_0x003c:
            r0 = move-exception
            java.lang.String r3 = f19460a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0068
        L_0x0045:
            r0 = move-exception
            java.lang.String r3 = f19460a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0068
        L_0x004e:
            r0 = move-exception
            java.lang.String r3 = f19460a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0068
        L_0x0057:
            r0 = move-exception
            java.lang.String r3 = f19460a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0068
        L_0x0060:
            r0 = move-exception
            java.lang.String r3 = f19460a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0068:
            java.lang.String r5 = "replaceMBFXContext: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r3, r0)
            r0 = r1
        L_0x0078:
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = ""
        L_0x007c:
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r6.replace(r2, r0)
            goto L_0x0000
        L_0x0086:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.mbfx.C5467a.m27257b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m27258c(String str) {
        String str2 = "";
        try {
            int indexOf = str.indexOf("?");
            if (indexOf == -1) {
                return str2;
            }
            String substring = str.substring(indexOf + 1);
            int indexOf2 = substring.indexOf("=");
            if (indexOf2 == -1 || substring == null || substring.equalsIgnoreCase("")) {
                return str2;
            }
            String substring2 = substring.substring(0, indexOf2);
            return (substring2 == null || !substring2.equalsIgnoreCase("jsonurl")) ? str2 : substring.substring(indexOf2 + 1);
        } catch (Exception e) {
            String str3 = f19460a;
            StringBuilder sb = new StringBuilder();
            sb.append("getNamedParamFromUrl: ");
            sb.append(e);
            Log.e(str3, sb.toString());
            return str2;
        }
    }
}
