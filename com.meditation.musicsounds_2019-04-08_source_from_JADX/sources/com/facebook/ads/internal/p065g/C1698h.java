package com.facebook.ads.internal.p065g;

import android.database.Cursor;
import android.database.SQLException;

/* renamed from: com.facebook.ads.internal.g.h */
public class C1698h extends C1697g {

    /* renamed from: a */
    public static final C1689b f5594a = new C1689b(0, "token_id", "TEXT PRIMARY KEY");

    /* renamed from: b */
    public static final C1689b f5595b = new C1689b(1, "token", "TEXT");

    /* renamed from: c */
    public static final C1689b[] f5596c = {f5594a, f5595b};

    /* renamed from: d */
    private static final String f5597d = C1698h.class.getSimpleName();

    /* renamed from: e */
    private static final String f5598e = m8495a("tokens", f5596c);

    /* renamed from: f */
    private static final String f5599f = m8496a("tokens", f5596c, f5595b);

    /* renamed from: g */
    private static final String f5600g;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens.");
        sb.append(f5594a.f5548b);
        sb.append(" = ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5551b.f5548b);
        sb.append(")");
        f5600g = sb.toString();
    }

    public C1698h(C1691d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public String mo6837a() {
        return "tokens";
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo6874a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0068
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.mo6872f()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = f5599f     // Catch:{ all -> 0x0060 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0060 }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x0060 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ all -> 0x0060 }
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0026
            com.facebook.ads.internal.g.b r2 = f5594a     // Catch:{ all -> 0x005e }
            int r2 = r2.f5547a     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x005e }
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0033
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r2
        L_0x0033:
            java.util.UUID r2 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x005e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005e }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x005e }
            r4 = 2
            r3.<init>(r4)     // Catch:{ all -> 0x005e }
            com.facebook.ads.internal.g.b r4 = f5594a     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r4.f5548b     // Catch:{ all -> 0x005e }
            r3.put(r4, r2)     // Catch:{ all -> 0x005e }
            com.facebook.ads.internal.g.b r4 = f5595b     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r4.f5548b     // Catch:{ all -> 0x005e }
            r3.put(r4, r6)     // Catch:{ all -> 0x005e }
            android.database.sqlite.SQLiteDatabase r6 = r5.mo6872f()     // Catch:{ all -> 0x005e }
            java.lang.String r4 = "tokens"
            r6.insertOrThrow(r4, r0, r3)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r2
        L_0x005e:
            r6 = move-exception
            goto L_0x0062
        L_0x0060:
            r6 = move-exception
            r1 = r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()
        L_0x0067:
            throw r6
        L_0x0068:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid token."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p065g.C1698h.mo6874a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public C1689b[] mo6840b() {
        return f5596c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Cursor mo6841c() {
        return mo6872f().rawQuery(f5598e, null);
    }

    /* renamed from: d */
    public void mo6875d() {
        try {
            mo6872f().execSQL(f5600g);
        } catch (SQLException unused) {
        }
    }
}
