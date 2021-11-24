package com.facebook.ads.internal.p065g;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.g.c */
public class C1690c extends C1697g {

    /* renamed from: a */
    public static final C1689b f5550a = new C1689b(0, "event_id", "TEXT PRIMARY KEY");

    /* renamed from: b */
    public static final C1689b f5551b = new C1689b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");

    /* renamed from: c */
    public static final C1689b f5552c = new C1689b(2, "priority", "INTEGER");

    /* renamed from: d */
    public static final C1689b f5553d = new C1689b(3, "type", "TEXT");

    /* renamed from: e */
    public static final C1689b f5554e = new C1689b(4, "time", "REAL");

    /* renamed from: f */
    public static final C1689b f5555f = new C1689b(5, "session_time", "REAL");

    /* renamed from: g */
    public static final C1689b f5556g = new C1689b(6, "session_id", "TEXT");

    /* renamed from: h */
    public static final C1689b f5557h = new C1689b(7, "data", "TEXT");

    /* renamed from: i */
    public static final C1689b f5558i = new C1689b(8, "attempt", "INTEGER");

    /* renamed from: j */
    public static final C1689b[] f5559j = {f5550a, f5551b, f5552c, f5553d, f5554e, f5555f, f5556g, f5557h, f5558i};

    /* renamed from: l */
    private static final String f5560l = m8495a("events", f5559j);

    public C1690c(C1691d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public String mo6837a() {
        return "events";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo6838a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(f5550a.f5548b, uuid);
        contentValues.put(f5551b.f5548b, str);
        contentValues.put(f5552c.f5548b, Integer.valueOf(i));
        contentValues.put(f5553d.f5548b, str2);
        contentValues.put(f5554e.f5548b, Double.valueOf(d));
        contentValues.put(f5555f.f5548b, Double.valueOf(d2));
        contentValues.put(f5556g.f5548b, str3);
        contentValues.put(f5557h.f5548b, map != null ? new JSONObject(map).toString() : null);
        contentValues.put(f5558i.f5548b, Integer.valueOf(0));
        mo6872f().insertOrThrow("events", null, contentValues);
        return uuid;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6839a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f5550a.f5548b);
        sb.append(" = ?");
        return mo6872f().delete("events", sb.toString(), new String[]{str}) > 0;
    }

    /* renamed from: b */
    public C1689b[] mo6840b() {
        return f5559j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Cursor mo6841c() {
        return mo6872f().rawQuery("SELECT count(*) FROM events", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Cursor mo6842d() {
        return mo6872f().rawQuery(f5560l, null);
    }
}
