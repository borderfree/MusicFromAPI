package com.seattleclouds.modules.p168f;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.webkit.WebView;
import com.seattleclouds.App;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6638s;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.f.a */
public class C5614a {

    /* renamed from: a */
    private static C5614a f19944a;

    /* renamed from: d */
    private static String f19945d;

    /* renamed from: e */
    private static String f19946e;

    /* renamed from: b */
    private C5615a f19947b = null;

    /* renamed from: c */
    private ArrayList<Map<String, String>> f19948c = new ArrayList<>();

    /* renamed from: com.seattleclouds.modules.f.a$a */
    private class C5615a extends SQLiteOpenHelper {
        public C5615a(Context context) {
            super(context, "favorites.db", null, 1);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table favorites( _id integer primary key autoincrement, type text not null, itemID text not null, md5ID text not null, rssURL text not null, title text not null, pictureURL text not null, link text not null);");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            String name = SQLiteOpenHelper.class.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Upgrading database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            sb.append(", which will destroy all old data");
            Log.w(name, sb.toString());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTSfavorites");
            onCreate(sQLiteDatabase);
        }
    }

    public C5614a(Context context) {
        this.f19947b = new C5615a(context.getApplicationContext());
        m27870f();
    }

    /* renamed from: a */
    public static C5614a m27865a(Context context) {
        if (f19944a == null && context != null) {
            f19944a = new C5614a(context);
        }
        return f19944a;
    }

    /* renamed from: a */
    public static String m27866a() {
        if (f19945d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data:image/png;base64,");
            sb.append(C6638s.m32072a("favorite.png"));
            f19945d = sb.toString();
        }
        return f19945d;
    }

    /* renamed from: a */
    public static void m27867a(Context context, WebView webView, String[] strArr) {
        String sb;
        String sb2;
        if (strArr.length > 0 && strArr[0].equalsIgnoreCase("add") && strArr.length > 1) {
            String str = strArr[1];
            if (str.equalsIgnoreCase("RSSItem")) {
                if (strArr.length > 5) {
                    try {
                        String decode = URLDecoder.decode(strArr[2], "UTF-8");
                        String decode2 = URLDecoder.decode(strArr[3], "UTF-8");
                        String decode3 = URLDecoder.decode(strArr[4], "UTF-8");
                        String decode4 = URLDecoder.decode(strArr[5], "UTF-8");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(decode);
                        sb3.append(decode2);
                        String e = C6592al.m31912e(sb3.toString());
                        C5614a a = m27865a(context);
                        if (a.mo18139b(e)) {
                            a.mo18135a(decode2, decode);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("document.getElementById('rsstable').contentWindow.document.getElementById('");
                            sb4.append(e);
                            sb4.append("').src = '");
                            sb4.append(m27868b());
                            sb4.append("';");
                            C6602at.m31951a(webView, sb4.toString());
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("document.getElementById('");
                            sb5.append(e);
                            sb5.append("').src = '");
                            sb5.append(m27868b());
                            sb5.append("';");
                            sb2 = sb5.toString();
                        } else {
                            a.mo18136a(decode2, decode, decode3, decode4);
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("document.getElementById('rsstable').contentWindow.document.getElementById('");
                            sb6.append(e);
                            sb6.append("').src = '");
                            sb6.append(m27866a());
                            sb6.append("';");
                            C6602at.m31951a(webView, sb6.toString());
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("document.getElementById('");
                            sb7.append(e);
                            sb7.append("').src = '");
                            sb7.append(m27866a());
                            sb7.append("';");
                            sb2 = sb7.toString();
                        }
                        C6602at.m31951a(webView, sb2);
                    } catch (UnsupportedEncodingException e2) {
                        Log.d("Favorites:", "UnsupportedEncodingException", e2);
                    }
                }
            } else if (str.equalsIgnoreCase("ILTI") && strArr.length > 5) {
                String str2 = strArr[2];
                String decode5 = URLDecoder.decode(strArr[3], "UTF-8");
                String decode6 = URLDecoder.decode(strArr[4], "UTF-8");
                String decode7 = URLDecoder.decode(strArr[5], "UTF-8");
                C5614a a2 = m27865a(context);
                if (a2.mo18139b(str2)) {
                    a2.mo18134a(str2);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("document.getElementById('rsstable').contentWindow.document.getElementById('");
                    sb8.append(str2);
                    sb8.append("').src = '");
                    sb8.append(m27868b());
                    sb8.append("';");
                    C6602at.m31951a(webView, sb8.toString());
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("document.getElementById('");
                    sb9.append(str2);
                    sb9.append("').src = '");
                    sb9.append(m27868b());
                    sb9.append("';");
                    sb = sb9.toString();
                } else {
                    a2.mo18138b(str2, decode6, decode7, decode5);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("document.getElementById('rsstable').contentWindow.document.getElementById('");
                    sb10.append(str2);
                    sb10.append("').src = '");
                    sb10.append(m27866a());
                    sb10.append("';");
                    C6602at.m31951a(webView, sb10.toString());
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("document.getElementById('");
                    sb11.append(str2);
                    sb11.append("').src = '");
                    sb11.append(m27866a());
                    sb11.append("';");
                    sb = sb11.toString();
                }
                C6602at.m31951a(webView, sb);
            }
        }
    }

    /* renamed from: b */
    public static String m27868b() {
        if (f19946e == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data:image/png;base64,");
            sb.append(C6638s.m32072a("favoriteoff.png"));
            f19946e = sb.toString();
        }
        return f19946e;
    }

    /* renamed from: b */
    private void m27869b(String str, String str2) {
        for (int i = 0; i < this.f19948c.size(); i++) {
            if (((String) ((Map) this.f19948c.get(i)).get(str)).equals(str2)) {
                this.f19948c.remove(i);
                return;
            }
        }
    }

    /* renamed from: f */
    private void m27870f() {
        if (this.f19947b != null) {
            Cursor query = this.f19947b.getReadableDatabase().query("favorites", new String[]{"type", "itemID", "md5ID", "rssURL", "title", "pictureURL", "link"}, null, null, null, null, null);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", query.getString(0));
                hashMap.put("itemID", query.getString(1));
                hashMap.put("md5ID", query.getString(2));
                hashMap.put("rssURL", query.getString(3));
                hashMap.put("title", query.getString(4));
                hashMap.put("pictureURL", query.getString(5));
                hashMap.put("link", query.getString(6));
                this.f19948c.add(hashMap);
                query.moveToNext();
            }
            query.close();
        }
    }

    /* renamed from: a */
    public void mo18134a(String str) {
        if (this.f19947b != null) {
            SQLiteDatabase writableDatabase = this.f19947b.getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM favorites WHERE md5ID='");
            sb.append(str);
            sb.append("';");
            writableDatabase.execSQL(sb.toString());
            m27869b("md5ID", str);
        }
    }

    /* renamed from: a */
    public void mo18135a(String str, String str2) {
        if (this.f19947b != null) {
            SQLiteDatabase writableDatabase = this.f19947b.getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            String e = C6592al.m31912e(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DELETE FROM favorites WHERE md5ID='");
            sb2.append(e);
            sb2.append("';");
            writableDatabase.execSQL(sb2.toString());
            m27869b("md5ID", e);
        }
    }

    /* renamed from: a */
    public void mo18136a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "RSSItem");
        hashMap.put("itemID", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        hashMap.put("md5ID", C6592al.m31912e(sb.toString()));
        hashMap.put("rssURL", str2);
        try {
            hashMap.put("title", new String(str3.getBytes(), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            hashMap.put("title", str3);
        }
        hashMap.put("pictureURL", str4);
        hashMap.put("link", "");
        mo18137a(hashMap);
    }

    /* renamed from: a */
    public void mo18137a(HashMap<String, String> hashMap) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", (String) hashMap.get("type"));
        contentValues.put("itemID", (String) hashMap.get("itemID"));
        contentValues.put("md5ID", (String) hashMap.get("md5ID"));
        contentValues.put("rssURL", (String) hashMap.get("rssURL"));
        contentValues.put("title", (String) hashMap.get("title"));
        contentValues.put("pictureURL", (String) hashMap.get("pictureURL"));
        contentValues.put("link", (String) hashMap.get("link"));
        this.f19947b.getWritableDatabase().insert("favorites", null, contentValues);
        this.f19948c.add(hashMap);
    }

    /* renamed from: b */
    public void mo18138b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "ILTI");
        hashMap.put("itemID", "");
        hashMap.put("md5ID", str);
        hashMap.put("rssURL", "");
        try {
            hashMap.put("title", new String(str2.getBytes(), "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            hashMap.put("title", str2);
        }
        hashMap.put("pictureURL", str3);
        hashMap.put("link", str4);
        mo18137a(hashMap);
    }

    /* renamed from: b */
    public boolean mo18139b(String str) {
        for (int i = 0; i < this.f19948c.size(); i++) {
            if (((String) ((Map) this.f19948c.get(i)).get("md5ID")).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String[] mo18140c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f19948c.size(); i++) {
            arrayList.add(((Map) this.f19948c.get(i)).get("md5ID"));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    public ArrayList<Map<String, String>> mo18141d() {
        return this.f19948c;
    }

    /* renamed from: e */
    public String mo18142e() {
        String str;
        String str2;
        String str3;
        String str4 = "{\"favorites\":[]}";
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f19948c.size(); i++) {
            Map map = (Map) this.f19948c.get(i);
            JSONObject jSONObject2 = new JSONObject(map);
            try {
                if (((String) map.get("link")).length() > 0) {
                    str3 = (String) map.get("link");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http://");
                    sb.append(App.f18516r);
                    sb.append("/reader.ashx?itemid=");
                    sb.append(URLEncoder.encode((String) map.get("itemID"), "UTF-8"));
                    sb.append("&rssurl=");
                    sb.append(URLEncoder.encode((String) map.get("rssURL"), "UTF-8"));
                    str3 = sb.toString();
                }
                jSONObject2.put("itemURL", str3);
                jSONArray.put(jSONObject2);
            } catch (JSONException e) {
                e = e;
                str2 = "Favorites:";
                str = "JSONException";
                Log.d(str2, str, e);
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                str2 = "Favorites:";
                str = "UnsupportedEncodingException";
                Log.d(str2, str, e);
            }
        }
        try {
            jSONObject.put("favorites", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.d("Favorites:", "JSONException", e3);
            return str4;
        }
    }
}
