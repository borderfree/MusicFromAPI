package com.google.android.vending.expansion.downloader.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;

/* renamed from: com.google.android.vending.expansion.downloader.impl.f */
public class C4852f {

    /* renamed from: a */
    public static final String f17484a = "com.google.android.vending.expansion.downloader.impl.f";

    /* renamed from: i */
    private static C4852f f17485i;

    /* renamed from: j */
    private static final String[] f17486j = {"FN", "URI", "ETAG", "TOTALBYTES", "CURRENTBYTES", "LASTMOD", "STATUS", "CONTROL", "FAILCOUNT", "RETRYAFTER", "REDIRECTCOUNT", "FILEIDX"};

    /* renamed from: b */
    final SQLiteOpenHelper f17487b;

    /* renamed from: c */
    SQLiteStatement f17488c;

    /* renamed from: d */
    SQLiteStatement f17489d;

    /* renamed from: e */
    long f17490e = -1;

    /* renamed from: f */
    int f17491f = -1;

    /* renamed from: g */
    int f17492g = -1;

    /* renamed from: h */
    int f17493h;

    /* renamed from: com.google.android.vending.expansion.downloader.impl.f$a */
    public static class C4853a implements BaseColumns {

        /* renamed from: a */
        public static final String[][] f17494a = {new String[]{"_id", "INTEGER PRIMARY KEY"}, new String[]{"FILEIDX", "INTEGER UNIQUE"}, new String[]{"URI", "TEXT"}, new String[]{"FN", "TEXT UNIQUE"}, new String[]{"ETAG", "TEXT"}, new String[]{"TOTALBYTES", "INTEGER"}, new String[]{"CURRENTBYTES", "INTEGER"}, new String[]{"LASTMOD", "INTEGER"}, new String[]{"STATUS", "INTEGER"}, new String[]{"CONTROL", "INTEGER"}, new String[]{"FAILCOUNT", "INTEGER"}, new String[]{"RETRYAFTER", "INTEGER"}, new String[]{"REDIRECTCOUNT", "INTEGER"}};
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.f$b */
    protected static class C4854b extends SQLiteOpenHelper {

        /* renamed from: a */
        private static final String[][][] f17495a = {C4853a.f17494a, C4855c.f17497a};

        /* renamed from: b */
        private static final String[] f17496b = {"DownloadColumns", "MetadataColumns"};

        C4854b(Context context) {
            super(context, "DownloadsDB", null, 7);
        }

        /* renamed from: a */
        private String m24291a(String str, String[][] strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(str);
            sb.append(" (");
            for (String[] strArr2 : strArr) {
                sb.append(' ');
                sb.append(strArr2[0]);
                sb.append(' ');
                sb.append(strArr2[1]);
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
            sb.append(");");
            return sb.toString();
        }

        /* renamed from: a */
        private void m24292a(SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            for (String str : f17496b) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DROP TABLE IF EXISTS ");
                    sb.append(str);
                    sQLiteDatabase.execSQL(sb.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            int length = f17495a.length;
            int i = 0;
            while (i < length) {
                try {
                    sQLiteDatabase.execSQL(m24291a(f17496b[i], f17495a[i]));
                    i++;
                } catch (Exception e) {
                    while (true) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            String name = C4854b.class.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("Upgrading database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            sb.append(", which will destroy all old data");
            Log.w(name, sb.toString());
            m24292a(sQLiteDatabase);
            onCreate(sQLiteDatabase);
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.f$c */
    public static class C4855c implements BaseColumns {

        /* renamed from: a */
        public static final String[][] f17497a = {new String[]{"_id", "INTEGER PRIMARY KEY"}, new String[]{"APKVERSION", "INTEGER"}, new String[]{"DOWNLOADSTATUS", "INTEGER"}, new String[]{"DOWNLOADFLAGS", "INTEGER"}};
    }

    private C4852f(Context context) {
        this.f17487b = new C4854b(context);
        Cursor rawQuery = this.f17487b.getReadableDatabase().rawQuery("SELECT APKVERSION,_id,DOWNLOADSTATUS,DOWNLOADFLAGS FROM MetadataColumns LIMIT 1", null);
        if (rawQuery != null && rawQuery.moveToFirst()) {
            this.f17491f = rawQuery.getInt(0);
            this.f17490e = rawQuery.getLong(1);
            this.f17492g = rawQuery.getInt(2);
            this.f17493h = rawQuery.getInt(3);
            rawQuery.close();
        }
        f17485i = this;
    }

    /* renamed from: a */
    public static synchronized C4852f m24274a(Context context) {
        synchronized (C4852f.class) {
            if (f17485i == null) {
                C4852f fVar = new C4852f(context);
                return fVar;
            }
            C4852f fVar2 = f17485i;
            return fVar2;
        }
    }

    /* renamed from: b */
    private SQLiteStatement m24275b() {
        if (this.f17488c == null) {
            this.f17488c = this.f17487b.getReadableDatabase().compileStatement("SELECT _id FROM DownloadColumns WHERE FILEIDX = ?");
        }
        return this.f17488c;
    }

    /* renamed from: c */
    private SQLiteStatement m24276c() {
        if (this.f17489d == null) {
            this.f17489d = this.f17487b.getReadableDatabase().compileStatement("UPDATE DownloadColumns SET CURRENTBYTES = ? WHERE FILEIDX = ?");
        }
        return this.f17489d;
    }

    /* renamed from: a */
    public long mo16031a(int i) {
        SQLiteStatement b = m24275b();
        b.clearBindings();
        b.bindLong(1, (long) i);
        try {
            return b.simpleQueryForLong();
        } catch (SQLiteDoneException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public long mo16032a(C4849d dVar) {
        return mo16031a(dVar.f17459b);
    }

    /* renamed from: a */
    public C4849d mo16033a(Cursor cursor) {
        C4849d dVar = new C4849d(cursor.getInt(11), cursor.getString(0), getClass().getPackage().getName());
        mo16035a(dVar, cursor);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.vending.expansion.downloader.impl.C4849d mo16034a(java.lang.String r11) {
        /*
            r10 = this;
            android.database.sqlite.SQLiteOpenHelper r0 = r10.f17487b
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()
            r0 = 0
            java.lang.String r2 = "DownloadColumns"
            java.lang.String[] r3 = f17486j     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "FN = ?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x0037 }
            r6 = 0
            r5[r6] = r11     // Catch:{ all -> 0x0037 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0037 }
            if (r11 == 0) goto L_0x0031
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0031
            com.google.android.vending.expansion.downloader.impl.d r0 = r10.mo16033a(r11)     // Catch:{ all -> 0x002c }
            if (r11 == 0) goto L_0x002b
            r11.close()
        L_0x002b:
            return r0
        L_0x002c:
            r0 = move-exception
            r9 = r0
            r0 = r11
            r11 = r9
            goto L_0x0038
        L_0x0031:
            if (r11 == 0) goto L_0x0036
            r11.close()
        L_0x0036:
            return r0
        L_0x0037:
            r11 = move-exception
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.C4852f.mo16034a(java.lang.String):com.google.android.vending.expansion.downloader.impl.d");
    }

    /* renamed from: a */
    public void mo16035a(C4849d dVar, Cursor cursor) {
        dVar.f17458a = cursor.getString(1);
        dVar.f17461d = cursor.getString(2);
        dVar.f17462e = cursor.getLong(3);
        dVar.f17463f = cursor.getLong(4);
        dVar.f17464g = cursor.getLong(5);
        dVar.f17465h = cursor.getInt(6);
        dVar.f17466i = cursor.getInt(7);
        dVar.f17467j = cursor.getInt(8);
        dVar.f17468k = cursor.getInt(9);
        dVar.f17469l = cursor.getInt(10);
    }

    /* renamed from: a */
    public boolean mo16036a(int i, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("APKVERSION", Integer.valueOf(i));
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i2));
        if (!mo16037a(contentValues)) {
            return false;
        }
        this.f17491f = i;
        this.f17492g = i2;
        return true;
    }

    /* renamed from: a */
    public boolean mo16037a(ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.f17487b.getWritableDatabase();
        if (-1 == this.f17490e) {
            long insert = writableDatabase.insert("MetadataColumns", "APKVERSION", contentValues);
            if (-1 == insert) {
                return false;
            }
            this.f17490e = insert;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("_id = ");
            sb.append(this.f17490e);
            if (writableDatabase.update("MetadataColumns", contentValues, sb.toString(), null) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo16038a(C4849d dVar, ContentValues contentValues) {
        long a = dVar == null ? -1 : mo16032a(dVar);
        boolean z = false;
        try {
            SQLiteDatabase writableDatabase = this.f17487b.getWritableDatabase();
            if (a != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("DownloadColumns._id = ");
                sb.append(a);
                return 1 != writableDatabase.update("DownloadColumns", contentValues, sb.toString(), null) ? false : false;
            }
            if (-1 != writableDatabase.insert("DownloadColumns", "URI", contentValues)) {
                z = true;
            }
            return z;
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.vending.expansion.downloader.impl.C4849d[] mo16039a() {
        /*
            r10 = this;
            android.database.sqlite.SQLiteOpenHelper r0 = r10.f17487b
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()
            r0 = 0
            java.lang.String r2 = "DownloadColumns"
            java.lang.String[] r3 = f17486j     // Catch:{ all -> 0x0041 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003b
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x003b
            int r0 = r1.getCount()     // Catch:{ all -> 0x0039 }
            com.google.android.vending.expansion.downloader.impl.d[] r0 = new com.google.android.vending.expansion.downloader.impl.C4849d[r0]     // Catch:{ all -> 0x0039 }
            r2 = 0
        L_0x0023:
            com.google.android.vending.expansion.downloader.impl.d r3 = r10.mo16033a(r1)     // Catch:{ all -> 0x0039 }
            int r4 = r2 + 1
            r0[r2] = r3     // Catch:{ all -> 0x0039 }
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            r2 = r4
            goto L_0x0023
        L_0x0039:
            r0 = move-exception
            goto L_0x0045
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()
        L_0x0040:
            return r0
        L_0x0041:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.C4852f.mo16039a():com.google.android.vending.expansion.downloader.impl.d[]");
    }

    /* renamed from: b */
    public void mo16040b(C4849d dVar) {
        SQLiteStatement c = m24276c();
        c.clearBindings();
        c.bindLong(1, dVar.f17463f);
        c.bindLong(2, (long) dVar.f17459b);
        c.execute();
    }

    /* renamed from: b */
    public boolean mo16041b(int i) {
        if (this.f17493h == i) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADFLAGS", Integer.valueOf(i));
        if (!mo16037a(contentValues)) {
            return false;
        }
        this.f17493h = i;
        return true;
    }

    /* renamed from: c */
    public boolean mo16042c(int i) {
        if (this.f17492g == i) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("DOWNLOADSTATUS", Integer.valueOf(i));
        if (!mo16037a(contentValues)) {
            return false;
        }
        this.f17492g = i;
        return true;
    }

    /* renamed from: c */
    public boolean mo16043c(C4849d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("FILEIDX", Integer.valueOf(dVar.f17459b));
        contentValues.put("FN", dVar.f17460c);
        contentValues.put("URI", dVar.f17458a);
        contentValues.put("ETAG", dVar.f17461d);
        contentValues.put("TOTALBYTES", Long.valueOf(dVar.f17462e));
        contentValues.put("CURRENTBYTES", Long.valueOf(dVar.f17463f));
        contentValues.put("LASTMOD", Long.valueOf(dVar.f17464g));
        contentValues.put("STATUS", Integer.valueOf(dVar.f17465h));
        contentValues.put("CONTROL", Integer.valueOf(dVar.f17466i));
        contentValues.put("FAILCOUNT", Integer.valueOf(dVar.f17467j));
        contentValues.put("RETRYAFTER", Integer.valueOf(dVar.f17468k));
        contentValues.put("REDIRECTCOUNT", Integer.valueOf(dVar.f17469l));
        return mo16038a(dVar, contentValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16044d(com.google.android.vending.expansion.downloader.impl.C4849d r12) {
        /*
            r11 = this;
            android.database.sqlite.SQLiteOpenHelper r0 = r11.f17487b
            android.database.sqlite.SQLiteDatabase r1 = r0.getReadableDatabase()
            r0 = 0
            java.lang.String r2 = "DownloadColumns"
            java.lang.String[] r3 = f17486j     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = "FN= ?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch:{ all -> 0x0036 }
            java.lang.String r6 = r12.f17460c     // Catch:{ all -> 0x0036 }
            r10 = 0
            r5[r10] = r6     // Catch:{ all -> 0x0036 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0030
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0030
            r11.mo16035a(r12, r1)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            return r9
        L_0x002d:
            r12 = move-exception
            r0 = r1
            goto L_0x0037
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()
        L_0x0035:
            return r10
        L_0x0036:
            r12 = move-exception
        L_0x0037:
            if (r0 == 0) goto L_0x003c
            r0.close()
        L_0x003c:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.C4852f.mo16044d(com.google.android.vending.expansion.downloader.impl.d):boolean");
    }
}
