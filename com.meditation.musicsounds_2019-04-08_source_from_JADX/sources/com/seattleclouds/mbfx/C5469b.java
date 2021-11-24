package com.seattleclouds.mbfx;

import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.util.C6613i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.p198io.C6730b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.mbfx.b */
public class C5469b {

    /* renamed from: a */
    private static User f19461a;

    /* renamed from: a */
    public static User m27263a() {
        return f19461a;
    }

    /* renamed from: a */
    public static void m27264a(User user) {
        f19461a = user;
        m27266c();
    }

    /* renamed from: b */
    public static JSONObject m27265b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (f19461a != null) {
                JSONObject a = f19461a.mo17770a();
                String str = "user";
                if (a == null) {
                    a = new JSONObject();
                }
                jSONObject.put(str, a);
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("getJSONDictionary: ");
            sb.append(e);
            Log.e("MBFXContext", sb.toString());
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static void m27266c() {
        try {
            JSONObject b = m27265b();
            StringBuilder sb = new StringBuilder();
            sb.append("JSON: ");
            sb.append(b.toString());
            Log.v("MBFXContext", sb.toString());
            String jSONObject = b.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("var context=");
            sb2.append(jSONObject);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(App.m25665m());
            sb4.append("/MBFX/context.js");
            C6730b.m32451a(new File(sb4.toString()), false).write(sb3.getBytes());
        } catch (Exception e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("saveContextToJS: ");
            sb5.append(e);
            Log.e("MBFXContext", sb5.toString());
        }
    }

    /* renamed from: d */
    public static void m27267d() {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(App.m25665m());
        sb2.append("/MBFX/context.js");
        File file = new File(sb2.toString());
        if (file.exists()) {
            try {
                JSONObject jSONObject = new JSONObject(C6613i.m31991b(new FileInputStream(file)).substring(12)).getJSONObject("user");
                if (jSONObject != null) {
                    User user = new User();
                    user.f19448a = jSONObject.optString("username");
                    user.f19450c = jSONObject.optString("firstName");
                    user.f19451d = jSONObject.optString("lastName");
                    String string = jSONObject.getString("userid");
                    if (string != null) {
                        user.f19452e = string;
                        m27264a(user);
                    }
                }
            } catch (FileNotFoundException e) {
                e = e;
                str = "MBFXContext";
                sb = new StringBuilder();
                sb.append("readContextFromJS: ");
                sb.append(e);
                Log.e(str, sb.toString());
            } catch (IOException e2) {
                e = e2;
                str = "MBFXContext";
                sb = new StringBuilder();
                sb.append("readContextFromJS: ");
                sb.append(e);
                Log.e(str, sb.toString());
            } catch (JSONException e3) {
                e = e3;
                str = "MBFXContext";
                sb = new StringBuilder();
                sb.append("readContextFromJS: ");
                sb.append(e);
                Log.e(str, sb.toString());
            }
        }
    }
}
