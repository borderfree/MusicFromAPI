package com.facebook.ads.internal.p065g;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.facebook.ads.internal.g.g */
public abstract class C1697g {

    /* renamed from: k */
    protected final C1691d f5593k;

    protected C1697g(C1691d dVar) {
        this.f5593k = dVar;
    }

    /* renamed from: a */
    public static String m8495a(String str, C1689b[] bVarArr) {
        StringBuilder sb = new StringBuilder("SELECT ");
        for (int i = 0; i < bVarArr.length - 1; i++) {
            sb.append(bVarArr[i].f5548b);
            sb.append(", ");
        }
        sb.append(bVarArr[bVarArr.length - 1].f5548b);
        sb.append(" FROM ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m8496a(String str, C1689b[] bVarArr, C1689b bVar) {
        StringBuilder sb = new StringBuilder(m8495a(str, bVarArr));
        sb.append(" WHERE ");
        sb.append(bVar.f5548b);
        sb.append(" = ?");
        return sb.toString();
    }

    /* renamed from: c */
    private String mo6841c() {
        C1689b[] b = mo6840b();
        if (b.length < 1) {
            return null;
        }
        String str = "";
        for (int i = 0; i < b.length - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(b[i].mo6836a());
            sb.append(", ");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(b[b.length - 1].mo6836a());
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract String mo6837a();

    /* renamed from: a */
    public void mo6869a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(mo6837a());
        sb.append(" (");
        sb.append(mo6841c());
        sb.append(")");
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: b */
    public void mo6870b(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE IF EXISTS ");
        sb.append(mo6837a());
        sQLiteDatabase.execSQL(sb.toString());
    }

    /* renamed from: b */
    public abstract C1689b[] mo6840b();

    /* renamed from: e */
    public void mo6871e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public SQLiteDatabase mo6872f() {
        return this.f5593k.mo6844a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo6873g() {
        return mo6872f().delete(mo6837a(), null, null) > 0;
    }
}
