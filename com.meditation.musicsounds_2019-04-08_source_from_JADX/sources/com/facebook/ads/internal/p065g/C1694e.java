package com.facebook.ads.internal.p065g;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p069k.C1713a;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.g.e */
public class C1694e extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f5581a = "e";

    /* renamed from: c */
    private static String f5582c;

    /* renamed from: b */
    private final C1691d f5583b;

    public C1694e(Context context, C1691d dVar) {
        super(context, m8489a(context), null, 4);
        if (dVar != null) {
            this.f5583b = dVar;
            return;
        }
        throw new IllegalArgumentException("AdDatabaseHelper can not be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8488a() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0049 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0049 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            int r5 = android.os.Process.myPid()     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r0.<init>()     // Catch:{ all -> 0x0044 }
        L_0x0031:
            int r2 = r1.read()     // Catch:{ all -> 0x0044 }
            if (r2 <= 0) goto L_0x003c
            char r2 = (char) r2     // Catch:{ all -> 0x0044 }
            r0.append(r2)     // Catch:{ all -> 0x0044 }
            goto L_0x0031
        L_0x003c:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0044 }
            r1.close()
            return r0
        L_0x0044:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x004a
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()
        L_0x004f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p065g.C1694e.m8488a():java.lang.String");
    }

    /* renamed from: a */
    private static String m8489a(Context context) {
        String format = String.format(Locale.US, "ads%s.db", new Object[]{""});
        if (!C1713a.m8593x(context)) {
            return format;
        }
        String packageName = context.getPackageName();
        try {
            if (f5582c == null) {
                f5582c = m8488a();
            }
            if (packageName.equals(f5582c) || TextUtils.isEmpty(f5582c)) {
                return format;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('_');
            sb.append(f5582c);
            return String.format(Locale.US, "ads%s.db", new Object[]{sb.toString()});
        } catch (Exception unused) {
            Log.d(f5581a, "Can't fetch process name.");
            return format;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (C1697g a : this.f5583b.mo6850c()) {
            a.mo6869a(sQLiteDatabase);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C1697g[] c;
        for (C1697g gVar : this.f5583b.mo6850c()) {
            gVar.mo6870b(sQLiteDatabase);
            gVar.mo6869a(sQLiteDatabase);
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS crashes");
        }
        if (i <= 3 && i2 >= 4) {
            C1689b bVar = C1690c.f5558i;
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE events ADD COLUMN ");
            sb.append(bVar.f5548b);
            sb.append(" ");
            sb.append(bVar.f5549c);
            sb.append(" DEFAULT 0");
            sQLiteDatabase.execSQL(sb.toString());
        }
    }
}
