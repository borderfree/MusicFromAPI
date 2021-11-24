package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.C3300e;

/* renamed from: com.google.android.gms.measurement.internal.n */
public final class C4763n extends C4710dm {

    /* renamed from: a */
    private final C4764o f17212a = new C4764o(this, mo15249n(), "google_app_measurement_local.db");

    /* renamed from: b */
    private boolean f17213b;

    C4763n(C4638av avVar) {
        super(avVar);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r12v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r9v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r12v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [boolean, int]
      assigns: []
      uses: [?[int, short, byte, char], int, boolean]
      mth insns count: 162
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb A[SYNTHETIC, Splitter:B:49:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 19 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m23863a(int r18, byte[] r19) {
        /*
            r17 = this;
            r1 = r17
            r17.mo15236b()
            r17.mo15239d()
            boolean r0 = r1.f17213b
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r0 = "type"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r3.put(r0, r4)
            java.lang.String r0 = "entry"
            r4 = r19
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x0130
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r17.m23864y()     // Catch:{ SQLiteFullException -> 0x0104, SQLiteDatabaseLockedException -> 0x00f2, SQLiteException -> 0x00c7, all -> 0x00c3 }
            if (r9 != 0) goto L_0x0040
            r1.f17213b = r8     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r0 = move-exception
            r12 = r7
        L_0x003a:
            r7 = r9
            goto L_0x00c9
        L_0x003d:
            r0 = move-exception
            goto L_0x0106
        L_0x0040:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x003d, SQLiteDatabaseLockedException -> 0x00f3, SQLiteException -> 0x0038 }
            if (r12 == 0) goto L_0x0061
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            if (r0 == 0) goto L_0x0061
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            goto L_0x0061
        L_0x0058:
            r0 = move-exception
            goto L_0x0125
        L_0x005b:
            r0 = move-exception
            goto L_0x003a
        L_0x005d:
            r0 = move-exception
            r7 = r12
            goto L_0x0106
        L_0x0061:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.r r0 = r17.mo15253r()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = "Data loss, local db full"
            r0.mo15858a(r15)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r0 = 0
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r0 = "messages"
            java.lang.String r10 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r11 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r11[r2] = r15     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            int r0 = r9.delete(r0, r10, r11)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            long r10 = (long) r0     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.measurement.internal.r r0 = r17.mo15253r()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r4 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            java.lang.Long r2 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r16 = 0
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r0.mo15861a(r15, r4, r2, r10)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
        L_0x00ab:
            java.lang.String r0 = "messages"
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x005d, SQLiteDatabaseLockedException -> 0x00c1, SQLiteException -> 0x005b, all -> 0x0058 }
            if (r12 == 0) goto L_0x00bb
            r12.close()
        L_0x00bb:
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            return r8
        L_0x00c1:
            r7 = r12
            goto L_0x00f3
        L_0x00c3:
            r0 = move-exception
            r9 = r7
            r12 = r9
            goto L_0x0125
        L_0x00c7:
            r0 = move-exception
            r12 = r7
        L_0x00c9:
            if (r7 == 0) goto L_0x00d8
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00d5 }
            if (r2 == 0) goto L_0x00d8
            r7.endTransaction()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d8
        L_0x00d5:
            r0 = move-exception
            r9 = r7
            goto L_0x0125
        L_0x00d8:
            com.google.android.gms.measurement.internal.r r2 = r17.mo15253r()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo15859a(r4, r0)     // Catch:{ all -> 0x00d5 }
            r1.f17213b = r8     // Catch:{ all -> 0x00d5 }
            if (r12 == 0) goto L_0x00ec
            r12.close()
        L_0x00ec:
            if (r7 == 0) goto L_0x011d
            r7.close()
            goto L_0x011d
        L_0x00f2:
            r9 = r7
        L_0x00f3:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x0123 }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00fe
            r7.close()
        L_0x00fe:
            if (r9 == 0) goto L_0x011d
        L_0x0100:
            r9.close()
            goto L_0x011d
        L_0x0104:
            r0 = move-exception
            r9 = r7
        L_0x0106:
            com.google.android.gms.measurement.internal.r r2 = r17.mo15253r()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo15859a(r4, r0)     // Catch:{ all -> 0x0123 }
            r1.f17213b = r8     // Catch:{ all -> 0x0123 }
            if (r7 == 0) goto L_0x011a
            r7.close()
        L_0x011a:
            if (r9 == 0) goto L_0x011d
            goto L_0x0100
        L_0x011d:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x0123:
            r0 = move-exception
            r12 = r7
        L_0x0125:
            if (r12 == 0) goto L_0x012a
            r12.close()
        L_0x012a:
            if (r9 == 0) goto L_0x012f
            r9.close()
        L_0x012f:
            throw r0
        L_0x0130:
            com.google.android.gms.measurement.internal.r r0 = r17.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo15858a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4763n.m23863a(int, byte[]):boolean");
    }

    /* renamed from: y */
    private final SQLiteDatabase m23864y() {
        if (this.f17213b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f17212a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f17213b = true;
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable>] */
    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r9v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v13 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:54|55|56|57) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:69|70|71|72) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|165) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r9 = r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        mo15253r().mo15852u_().mo15858a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r13.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        mo15253r().mo15852u_().mo15858a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        mo15253r().mo15852u_().mo15858a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r13.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x010b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x018e A[SYNTHETIC, Splitter:B:112:0x018e] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo15828a(int r20) {
        /*
            r19 = this;
            r1 = r19
            r19.mo15239d()
            r19.mo15236b()
            boolean r0 = r1.f17213b
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.Context r0 = r19.mo15249n()
            java.lang.String r4 = "google_app_measurement_local.db"
            java.io.File r0 = r0.getDatabasePath(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0024
            return r3
        L_0x0024:
            r4 = 5
            r5 = 0
            r6 = 0
            r7 = 5
        L_0x0028:
            if (r6 >= r4) goto L_0x01fb
            r8 = 1
            android.database.sqlite.SQLiteDatabase r15 = r19.m23864y()     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01b4, SQLiteException -> 0x0189, all -> 0x0184 }
            if (r15 != 0) goto L_0x0044
            r1.f17213b = r8     // Catch:{ SQLiteFullException -> 0x0041, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x0039 }
            if (r15 == 0) goto L_0x0038
            r15.close()
        L_0x0038:
            return r2
        L_0x0039:
            r0 = move-exception
            r9 = r2
            r2 = r15
            goto L_0x018c
        L_0x003e:
            r2 = r15
            goto L_0x017d
        L_0x0041:
            r0 = move-exception
            goto L_0x01ce
        L_0x0044:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            java.lang.String r10 = "messages"
            r0 = 3
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            java.lang.String r0 = "rowid"
            r11[r5] = r0     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            java.lang.String r0 = "type"
            r11[r8] = r0     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            java.lang.String r0 = "entry"
            r14 = 2
            r11[r14] = r0     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            r12 = 0
            r13 = 0
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r9 = 100
            java.lang.String r18 = java.lang.Integer.toString(r9)     // Catch:{ SQLiteFullException -> 0x0180, SQLiteDatabaseLockedException -> 0x003e, SQLiteException -> 0x017a, all -> 0x0177 }
            r9 = r15
            r4 = 2
            r14 = r0
            r2 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteFullException -> 0x0174, SQLiteDatabaseLockedException -> 0x017d, SQLiteException -> 0x0172, all -> 0x0170 }
            r10 = -1
        L_0x0076:
            boolean r0 = r9.moveToNext()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            if (r0 == 0) goto L_0x0132
            long r10 = r9.getLong(r5)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r0 = r9.getInt(r8)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            byte[] r12 = r9.getBlob(r4)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            if (r0 != 0) goto L_0x00bd
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00a8 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x00a8 }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x00a8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzag> r0 = com.google.android.gms.measurement.internal.zzag.CREATOR     // Catch:{ ParseException -> 0x00a8 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00a8 }
            com.google.android.gms.measurement.internal.zzag r0 = (com.google.android.gms.measurement.internal.zzag) r0     // Catch:{ ParseException -> 0x00a8 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            if (r0 == 0) goto L_0x0076
        L_0x00a2:
            r3.add(r0)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            goto L_0x0076
        L_0x00a6:
            r0 = move-exception
            goto L_0x00b9
        L_0x00a8:
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x00a6 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.mo15858a(r12)     // Catch:{ all -> 0x00a6 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            goto L_0x0076
        L_0x00b9:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
        L_0x00bd:
            if (r0 != r8) goto L_0x00f0
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00d8 }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x00d8 }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x00d8 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzfv> r0 = com.google.android.gms.measurement.internal.zzfv.CREATOR     // Catch:{ ParseException -> 0x00d8 }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x00d8 }
            com.google.android.gms.measurement.internal.zzfv r0 = (com.google.android.gms.measurement.internal.zzfv) r0     // Catch:{ ParseException -> 0x00d8 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            goto L_0x00e9
        L_0x00d6:
            r0 = move-exception
            goto L_0x00ec
        L_0x00d8:
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()     // Catch:{ all -> 0x00d6 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x00d6 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo15858a(r12)     // Catch:{ all -> 0x00d6 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            r0 = 0
        L_0x00e9:
            if (r0 == 0) goto L_0x0076
            goto L_0x00a2
        L_0x00ec:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
        L_0x00f0:
            if (r0 != r4) goto L_0x0123
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x010b }
            r13.unmarshall(r12, r5, r0)     // Catch:{ ParseException -> 0x010b }
            r13.setDataPosition(r5)     // Catch:{ ParseException -> 0x010b }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzo> r0 = com.google.android.gms.measurement.internal.zzo.CREATOR     // Catch:{ ParseException -> 0x010b }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ ParseException -> 0x010b }
            com.google.android.gms.measurement.internal.zzo r0 = (com.google.android.gms.measurement.internal.zzo) r0     // Catch:{ ParseException -> 0x010b }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            goto L_0x011c
        L_0x0109:
            r0 = move-exception
            goto L_0x011f
        L_0x010b:
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()     // Catch:{ all -> 0x0109 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x0109 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo15858a(r12)     // Catch:{ all -> 0x0109 }
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            r0 = 0
        L_0x011c:
            if (r0 == 0) goto L_0x0076
            goto L_0x00a2
        L_0x011f:
            r13.recycle()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            throw r0     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
        L_0x0123:
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            java.lang.String r12 = "Unknown record type in local database"
            r0.mo15858a(r12)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            goto L_0x0076
        L_0x0132:
            java.lang.String r0 = "messages"
            java.lang.String r4 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            java.lang.String r10 = java.lang.Long.toString(r10)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            r12[r5] = r10     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r0 = r2.delete(r0, r4, r12)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            int r4 = r3.size()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            if (r0 >= r4) goto L_0x0155
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            java.lang.String r4 = "Fewer entries removed from local database than expected"
            r0.mo15858a(r4)     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
        L_0x0155:
            r2.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            r2.endTransaction()     // Catch:{ SQLiteFullException -> 0x016b, SQLiteDatabaseLockedException -> 0x0168, SQLiteException -> 0x0166 }
            if (r9 == 0) goto L_0x0160
            r9.close()
        L_0x0160:
            if (r2 == 0) goto L_0x0165
            r2.close()
        L_0x0165:
            return r3
        L_0x0166:
            r0 = move-exception
            goto L_0x018c
        L_0x0168:
            r4 = r2
            r2 = r9
            goto L_0x01b6
        L_0x016b:
            r0 = move-exception
            r15 = r2
            r2 = r9
            goto L_0x01ce
        L_0x0170:
            r0 = move-exception
            goto L_0x0186
        L_0x0172:
            r0 = move-exception
            goto L_0x018b
        L_0x0174:
            r0 = move-exception
            r15 = r2
            goto L_0x0182
        L_0x0177:
            r0 = move-exception
            r2 = r15
            goto L_0x0186
        L_0x017a:
            r0 = move-exception
            r2 = r15
            goto L_0x018b
        L_0x017d:
            r4 = r2
            r2 = 0
            goto L_0x01b6
        L_0x0180:
            r0 = move-exception
            r2 = r15
        L_0x0182:
            r2 = 0
            goto L_0x01ce
        L_0x0184:
            r0 = move-exception
            r2 = 0
        L_0x0186:
            r9 = 0
            goto L_0x01f0
        L_0x0189:
            r0 = move-exception
            r2 = 0
        L_0x018b:
            r9 = 0
        L_0x018c:
            if (r2 == 0) goto L_0x019a
            boolean r4 = r2.inTransaction()     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x019a
            r2.endTransaction()     // Catch:{ all -> 0x0198 }
            goto L_0x019a
        L_0x0198:
            r0 = move-exception
            goto L_0x01f0
        L_0x019a:
            com.google.android.gms.measurement.internal.r r4 = r19.mo15253r()     // Catch:{ all -> 0x0198 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()     // Catch:{ all -> 0x0198 }
            java.lang.String r10 = "Error reading entries from local database"
            r4.mo15859a(r10, r0)     // Catch:{ all -> 0x0198 }
            r1.f17213b = r8     // Catch:{ all -> 0x0198 }
            if (r9 == 0) goto L_0x01ae
            r9.close()
        L_0x01ae:
            if (r2 == 0) goto L_0x01e7
            r2.close()
            goto L_0x01e7
        L_0x01b4:
            r2 = 0
            r4 = 0
        L_0x01b6:
            long r8 = (long) r7
            android.os.SystemClock.sleep(r8)     // Catch:{ all -> 0x01c7 }
            int r7 = r7 + 20
            if (r2 == 0) goto L_0x01c1
            r2.close()
        L_0x01c1:
            if (r4 == 0) goto L_0x01e7
            r4.close()
            goto L_0x01e7
        L_0x01c7:
            r0 = move-exception
            r9 = r2
            r2 = r4
            goto L_0x01f0
        L_0x01cb:
            r0 = move-exception
            r2 = 0
            r15 = 0
        L_0x01ce:
            com.google.android.gms.measurement.internal.r r4 = r19.mo15253r()     // Catch:{ all -> 0x01ed }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()     // Catch:{ all -> 0x01ed }
            java.lang.String r9 = "Error reading entries from local database"
            r4.mo15859a(r9, r0)     // Catch:{ all -> 0x01ed }
            r1.f17213b = r8     // Catch:{ all -> 0x01ed }
            if (r2 == 0) goto L_0x01e2
            r2.close()
        L_0x01e2:
            if (r15 == 0) goto L_0x01e7
            r15.close()
        L_0x01e7:
            int r6 = r6 + 1
            r2 = 0
            r4 = 5
            goto L_0x0028
        L_0x01ed:
            r0 = move-exception
            r9 = r2
            r2 = r15
        L_0x01f0:
            if (r9 == 0) goto L_0x01f5
            r9.close()
        L_0x01f5:
            if (r2 == 0) goto L_0x01fa
            r2.close()
        L_0x01fa:
            throw r0
        L_0x01fb:
            com.google.android.gms.measurement.internal.r r0 = r19.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo15858a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4763n.mo15828a(int):java.util.List");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final boolean mo15829a(zzag zzag) {
        Parcel obtain = Parcel.obtain();
        zzag.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m23863a(0, marshall);
        }
        mo15253r().mo15849i().mo15858a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo15830a(zzfv zzfv) {
        Parcel obtain = Parcel.obtain();
        zzfv.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m23863a(1, marshall);
        }
        mo15253r().mo15849i().mo15858a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: a */
    public final boolean mo15831a(zzo zzo) {
        mo15251p();
        byte[] a = C4736ek.m23535a((Parcelable) zzo);
        if (a.length <= 131072) {
            return m23863a(2, a);
        }
        mo15253r().mo15849i().mo15858a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C4616a mo15240e() {
        return super.mo15240e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C4672cb mo15241f() {
        return super.mo15241f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4761l mo15242g() {
        return super.mo15242g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4689cs mo15243h() {
        return super.mo15243h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4685co mo15244i() {
        return super.mo15244i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C4763n mo15245j() {
        return super.mo15245j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C4714dq mo15246k() {
        return super.mo15246k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo15423v() {
        return false;
    }

    /* renamed from: x */
    public final void mo15832x() {
        mo15236b();
        mo15239d();
        try {
            int delete = m23864y().delete("messages", null, null) + 0;
            if (delete > 0) {
                mo15253r().mo15855x().mo15859a("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo15253r().mo15852u_().mo15859a("Error resetting local analytics data. error", e);
        }
    }
}
