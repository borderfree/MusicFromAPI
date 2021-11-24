package com.seattleclouds.modules.goaltracker;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.goaltracker.a */
public class C5694a {

    /* renamed from: a */
    private static final String f20232a = "a";

    /* renamed from: b */
    private static C5694a f20233b;

    /* renamed from: c */
    private Context f20234c;

    /* renamed from: d */
    private JSONArray f20235d;

    /* renamed from: e */
    private JSONArray f20236e;

    /* renamed from: f */
    private JSONObject f20237f;

    private C5694a() {
    }

    /* renamed from: a */
    public static C5694a m28160a(Context context) {
        f20233b = new C5694a();
        f20233b.m28163b(context);
        return f20233b;
    }

    /* renamed from: a */
    private HashMap<String, String> m28161a(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("title", jSONObject.getString("title"));
            hashMap.put("due_date_time", jSONObject.getString("due_date_time"));
            hashMap.put("created_time", jSONObject.getString("created_time"));
            hashMap.put("priority", jSONObject.getString("priority"));
            hashMap.put("repeat_interval", jSONObject.getString("repeat_interval"));
            hashMap.put("note", jSONObject.getString("note"));
            hashMap.put("progress", jSONObject.getString("progress"));
            hashMap.put("id", jSONObject.getString("id"));
            hashMap.put("category_id", jSONObject.getString("category_id"));
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private HashMap<String, String> m28162b(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("name", jSONObject.getString("name"));
            hashMap.put("id", jSONObject.getString("id"));
            hashMap.put("created_time", jSONObject.getString("created_time"));
            return hashMap;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private void m28163b(Context context) {
        this.f20234c = context.getApplicationContext();
    }

    /* renamed from: a */
    public ArrayList<HashMap<String, String>> mo18333a(String str) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        int i = 0;
        while (i < this.f20236e.length()) {
            try {
                JSONObject jSONObject = this.f20236e.getJSONObject(i);
                HashMap hashMap = new HashMap();
                if (str == null || jSONObject.getString("category_id").equals(str)) {
                    hashMap.put("title", jSONObject.getString("title"));
                    hashMap.put("id", jSONObject.getString("id"));
                    hashMap.put("due_date_time", jSONObject.getString("due_date_time"));
                    hashMap.put("created_time", jSONObject.getString("created_time"));
                    hashMap.put("priority", jSONObject.getString("priority"));
                    hashMap.put("repeat_interval", jSONObject.getString("repeat_interval"));
                    hashMap.put("note", jSONObject.getString("note"));
                    hashMap.put("progress", jSONObject.getString("progress"));
                    hashMap.put("category_id", jSONObject.getString("category_id"));
                    arrayList.add(hashMap);
                    i++;
                } else {
                    i++;
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo18334a() {
        if (this.f20234c != null) {
            try {
                this.f20237f = new JSONObject(this.f20234c.getSharedPreferences("GOAL_CATEGORIES_SHARED_PREF_KEY", 0).getString("saved_goals_categories", "{\"categories\":[],\"goals\":[]}"));
                this.f20235d = this.f20237f.getJSONArray("categories");
                this.f20236e = this.f20237f.getJSONArray("goals");
            } catch (JSONException e) {
                Log.e(f20232a, "Error parsing cofig", e);
            }
        }
    }

    /* renamed from: a */
    public void mo18335a(String str, HashMap<String, String> hashMap) {
        if (str != null && str.length() != 0 && hashMap != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("title", hashMap.get("title"));
                jSONObject.put("due_date_time", hashMap.get("due_date_time"));
                jSONObject.put("priority", hashMap.get("priority"));
                jSONObject.put("repeat_interval", hashMap.get("repeat_interval"));
                jSONObject.put("note", hashMap.get("note"));
                jSONObject.put("created_time", hashMap.get("created_time"));
                jSONObject.put("id", hashMap.get("id"));
                jSONObject.put("progress", hashMap.get("progress"));
                jSONObject.put("category_id", str);
                this.f20236e.put(jSONObject);
            } catch (JSONException e) {
                Log.e(f20232a, "Unable to add a new goal with", e);
            }
        }
    }

    /* renamed from: a */
    public void mo18336a(HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", hashMap.get("name"));
            jSONObject.put("id", hashMap.get("id"));
            jSONObject.put("created_time", hashMap.get("created_time"));
            this.f20235d.put(jSONObject);
        } catch (JSONException unused) {
            Log.e(f20232a, "Error adding a new category");
        }
    }

    /* renamed from: b */
    public HashMap<String, String> mo18337b(String str) {
        if (!(str == null || str.length() == 0)) {
            int i = 0;
            while (i < this.f20236e.length()) {
                try {
                    JSONObject jSONObject = this.f20236e.getJSONObject(i);
                    if (str.equals(jSONObject.getString("id"))) {
                        return m28161a(jSONObject);
                    }
                    i++;
                } catch (JSONException e) {
                    Log.e(f20232a, "Can't get goal", e);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo18338b() {
        Editor edit = this.f20234c.getSharedPreferences("GOAL_CATEGORIES_SHARED_PREF_KEY", 0).edit();
        try {
            this.f20237f.put("categories", this.f20235d);
            this.f20237f.put("goals", this.f20236e);
            edit.putString("saved_goals_categories", this.f20237f.toString());
            edit.commit();
        } catch (JSONException e) {
            Log.e(f20232a, "Unable to save settings:", e);
        }
    }

    /* renamed from: b */
    public void mo18339b(HashMap<String, String> hashMap) {
        String str = (String) hashMap.get("id");
        if (str != null) {
            int i = 0;
            while (i < this.f20235d.length()) {
                try {
                    JSONObject jSONObject = this.f20235d.getJSONObject(i);
                    if (str.equals(jSONObject.getString("id"))) {
                        jSONObject.put("name", hashMap.get("name"));
                        return;
                    }
                    i++;
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public ArrayList<HashMap<String, String>> mo18340c() {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        if (this.f20235d == null) {
            return arrayList;
        }
        int i = 0;
        while (i < this.f20235d.length()) {
            try {
                new HashMap();
                HashMap b = m28162b(this.f20235d.getJSONObject(i));
                if (b != null) {
                    arrayList.add(b);
                }
                i++;
            } catch (JSONException e) {
                Log.e(f20232a, "Error parsing cofig", e);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public HashMap<String, String> mo18341c(String str) {
        if (!(str == null || str.length() == 0)) {
            int i = 0;
            while (i < this.f20236e.length()) {
                try {
                    JSONObject jSONObject = this.f20236e.getJSONObject(i);
                    if (str.equals(jSONObject.getString("id"))) {
                        JSONArray jSONArray = new JSONArray();
                        int length = this.f20236e.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            if (i2 != i) {
                                jSONArray.put(this.f20236e.get(i2));
                            }
                        }
                        this.f20236e = jSONArray;
                        return m28161a(jSONObject);
                    }
                    i++;
                } catch (JSONException e) {
                    Log.e(f20232a, "Can't get json object", e);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo18342c(HashMap<String, String> hashMap) {
        String str = (String) hashMap.get("id");
        if (!(str == null || str.length() == 0)) {
            JSONObject jSONObject = null;
            int i = 0;
            while (true) {
                try {
                    if (i >= this.f20236e.length()) {
                        break;
                    }
                    jSONObject = this.f20236e.getJSONObject(i);
                    if (str.equals(jSONObject.getString("id"))) {
                        break;
                    }
                    i++;
                } catch (JSONException e) {
                    String str2 = f20232a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to update the goal with id:");
                    sb.append(str);
                    Log.e(str2, sb.toString(), e);
                }
            }
            if (jSONObject != null) {
                jSONObject.put("title", hashMap.get("title"));
                jSONObject.put("due_date_time", hashMap.get("due_date_time"));
                jSONObject.put("created_time", hashMap.get("created_time"));
                jSONObject.put("priority", hashMap.get("priority"));
                jSONObject.put("repeat_interval", hashMap.get("repeat_interval"));
                jSONObject.put("note", hashMap.get("note"));
                jSONObject.put("category_id", hashMap.get("category_id"));
                jSONObject.put("progress", hashMap.get("progress"));
            }
        }
    }

    /* renamed from: d */
    public HashMap<String, String> mo18343d(String str) {
        if (!(str == null || str.length() == 0)) {
            int i = 0;
            while (i < this.f20235d.length()) {
                try {
                    JSONObject jSONObject = this.f20235d.getJSONObject(i);
                    if (jSONObject.getString("id").equals(str)) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < this.f20236e.length(); i2++) {
                            try {
                                JSONObject jSONObject2 = this.f20236e.getJSONObject(i2);
                                if (jSONObject2.getString("category_id").equals(str)) {
                                    arrayList.add(jSONObject2.getString("id"));
                                }
                            } catch (JSONException e) {
                                Log.e(f20232a, "Can't get json object", e);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            mo18341c((String) it.next());
                        }
                        JSONArray jSONArray = new JSONArray();
                        int length = this.f20235d.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            if (i3 != i) {
                                jSONArray.put(this.f20235d.get(i3));
                            }
                        }
                        this.f20235d = jSONArray;
                        return m28162b(jSONObject);
                    }
                    continue;
                    i++;
                } catch (JSONException e2) {
                    Log.e(f20232a, "Can't get json object", e2);
                }
            }
        }
        return null;
    }
}
