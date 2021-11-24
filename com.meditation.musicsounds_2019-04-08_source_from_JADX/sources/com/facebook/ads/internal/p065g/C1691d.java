package com.facebook.ads.internal.p065g;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import com.facebook.ads.internal.p065g.C1695f.C1696a;
import com.facebook.ads.internal.p077s.p078a.C1788d;
import com.facebook.ads.internal.p077s.p078a.C1802m;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.internal.g.d */
public class C1691d {

    /* renamed from: a */
    private static final String f5561a;

    /* renamed from: b */
    private static final ReentrantReadWriteLock f5562b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final Lock f5563c = f5562b.readLock();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Lock f5564d = f5562b.writeLock();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f5565e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1698h f5566f = new C1698h(this);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1690c f5567g = new C1690c(this);

    /* renamed from: h */
    private SQLiteOpenHelper f5568h;

    /* renamed from: com.facebook.ads.internal.g.d$a */
    private static class C1693a<T> extends AsyncTask<Void, Void, T> {

        /* renamed from: a */
        private final C1695f<T> f5577a;

        /* renamed from: b */
        private final C1688a<T> f5578b;

        /* renamed from: c */
        private final Context f5579c;

        /* renamed from: d */
        private C1696a f5580d;

        C1693a(Context context, C1695f<T> fVar, C1688a<T> aVar) {
            this.f5577a = fVar;
            this.f5578b = aVar;
            this.f5579c = context;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T doInBackground(Void... voidArr) {
            T t;
            Exception e;
            try {
                t = this.f5577a.mo6857b();
                try {
                    this.f5580d = this.f5577a.mo6866c();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                Exception exc = e3;
                t = null;
                e = exc;
                C1831a.m8998a(this.f5579c, "database", C1832b.f6001o, e);
                this.f5580d = C1696a.UNKNOWN;
                return t;
            }
            return t;
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(T t) {
            if (this.f5580d == null) {
                this.f5578b.mo6835a(t);
            } else {
                this.f5578b.mo6834a(this.f5580d.mo6867a(), this.f5580d.mo6868b());
            }
            this.f5578b.mo6833a();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT tokens.");
        sb.append(C1698h.f5594a.f5548b);
        sb.append(", ");
        sb.append("tokens");
        sb.append(".");
        sb.append(C1698h.f5595b.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5550a.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5552c.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5553d.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5554e.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5555f.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5556g.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5557h.f5548b);
        sb.append(", ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5558i.f5548b);
        sb.append(" FROM ");
        sb.append("events");
        sb.append(" JOIN ");
        sb.append("tokens");
        sb.append(" ON ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5551b.f5548b);
        sb.append(" = ");
        sb.append("tokens");
        sb.append(".");
        sb.append(C1698h.f5594a.f5548b);
        sb.append(" ORDER BY ");
        sb.append("events");
        sb.append(".");
        sb.append(C1690c.f5554e.f5548b);
        sb.append(" ASC");
        f5561a = sb.toString();
    }

    public C1691d(Context context) {
        this.f5565e = context;
    }

    /* renamed from: j */
    private synchronized SQLiteDatabase m8471j() {
        if (this.f5568h == null) {
            this.f5568h = new C1694e(this.f5565e, this);
        }
        return this.f5568h.getWritableDatabase();
    }

    /* renamed from: a */
    public Cursor mo6843a(int i) {
        f5563c.lock();
        try {
            SQLiteDatabase a = mo6844a();
            StringBuilder sb = new StringBuilder();
            sb.append(f5561a);
            sb.append(" LIMIT ");
            sb.append(String.valueOf(i));
            Cursor rawQuery = a.rawQuery(sb.toString(), null);
            return rawQuery;
        } finally {
            f5563c.unlock();
        }
    }

    /* renamed from: a */
    public SQLiteDatabase mo6844a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m8471j();
        }
        throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
    }

    /* renamed from: a */
    public <T> AsyncTask mo6845a(C1695f<T> fVar, C1688a<T> aVar) {
        return C1788d.m8878a(C1802m.f5872b, new C1693a(this.f5565e.getApplicationContext(), fVar, aVar), new Void[0]);
    }

    /* renamed from: a */
    public AsyncTask mo6846a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map, C1688a<String> aVar) {
        final String str4 = str;
        final int i2 = i;
        final String str5 = str2;
        final double d3 = d;
        final double d4 = d2;
        final String str6 = str3;
        final Map<String, String> map2 = map;
        C16921 r0 = new C1699i<String>() {
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0090 A[Catch:{ Exception -> 0x0094 }] */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9 A[Catch:{ Exception -> 0x00bd }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.String mo6857b() {
                /*
                    r14 = this;
                    java.lang.String r0 = r2
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    r1 = 0
                    if (r0 == 0) goto L_0x000a
                    return r1
                L_0x000a:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p065g.C1691d.f5564d
                    r0.lock()
                    com.facebook.ads.internal.g.d r0 = com.facebook.ads.internal.p065g.C1691d.this     // Catch:{ Exception -> 0x006e, all -> 0x0069 }
                    android.database.sqlite.SQLiteDatabase r0 = r0.mo6844a()     // Catch:{ Exception -> 0x006e, all -> 0x0069 }
                    r0.beginTransaction()     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.g.d r2 = com.facebook.ads.internal.p065g.C1691d.this     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.g.c r3 = r2.f5567g     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.g.d r2 = com.facebook.ads.internal.p065g.C1691d.this     // Catch:{ Exception -> 0x0067 }
                    com.facebook.ads.internal.g.h r2 = r2.f5566f     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r4 = r2     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r4 = r2.mo6874a(r4)     // Catch:{ Exception -> 0x0067 }
                    int r5 = r3     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r6 = r4     // Catch:{ Exception -> 0x0067 }
                    double r7 = r5     // Catch:{ Exception -> 0x0067 }
                    double r9 = r7     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r11 = r9     // Catch:{ Exception -> 0x0067 }
                    java.util.Map r12 = r10     // Catch:{ Exception -> 0x0067 }
                    java.lang.String r2 = r3.mo6838a(r4, r5, r6, r7, r9, r11, r12)     // Catch:{ Exception -> 0x0067 }
                    r0.setTransactionSuccessful()     // Catch:{ Exception -> 0x0067 }
                    if (r0 == 0) goto L_0x005f
                    boolean r1 = r0.isOpen()
                    if (r1 == 0) goto L_0x005f
                    boolean r1 = r0.inTransaction()     // Catch:{ Exception -> 0x0051 }
                    if (r1 == 0) goto L_0x005f
                    r0.endTransaction()     // Catch:{ Exception -> 0x0051 }
                    goto L_0x005f
                L_0x0051:
                    r0 = move-exception
                    com.facebook.ads.internal.g.d r1 = com.facebook.ads.internal.p065g.C1691d.this
                    android.content.Context r1 = r1.f5565e
                    java.lang.String r3 = "database"
                    int r4 = com.facebook.ads.internal.p077s.p081d.C1832b.f6000n
                    com.facebook.ads.internal.p077s.p081d.C1831a.m8998a(r1, r3, r4, r0)
                L_0x005f:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p065g.C1691d.f5564d
                    r0.unlock()
                    return r2
                L_0x0067:
                    r2 = move-exception
                    goto L_0x0070
                L_0x0069:
                    r0 = move-exception
                    r13 = r1
                    r1 = r0
                    r0 = r13
                    goto L_0x00ab
                L_0x006e:
                    r2 = move-exception
                    r0 = r1
                L_0x0070:
                    com.facebook.ads.internal.g.f$a r3 = com.facebook.ads.internal.p065g.C1695f.C1696a.DATABASE_INSERT     // Catch:{ all -> 0x00aa }
                    r14.mo6865a(r3)     // Catch:{ all -> 0x00aa }
                    com.facebook.ads.internal.g.d r3 = com.facebook.ads.internal.p065g.C1691d.this     // Catch:{ all -> 0x00aa }
                    android.content.Context r3 = r3.f5565e     // Catch:{ all -> 0x00aa }
                    java.lang.String r4 = "database"
                    int r5 = com.facebook.ads.internal.p077s.p081d.C1832b.f5998l     // Catch:{ all -> 0x00aa }
                    com.facebook.ads.internal.p077s.p081d.C1831a.m8998a(r3, r4, r5, r2)     // Catch:{ all -> 0x00aa }
                    if (r0 == 0) goto L_0x00a2
                    boolean r2 = r0.isOpen()
                    if (r2 == 0) goto L_0x00a2
                    boolean r2 = r0.inTransaction()     // Catch:{ Exception -> 0x0094 }
                    if (r2 == 0) goto L_0x00a2
                    r0.endTransaction()     // Catch:{ Exception -> 0x0094 }
                    goto L_0x00a2
                L_0x0094:
                    r0 = move-exception
                    com.facebook.ads.internal.g.d r2 = com.facebook.ads.internal.p065g.C1691d.this
                    android.content.Context r2 = r2.f5565e
                    java.lang.String r3 = "database"
                    int r4 = com.facebook.ads.internal.p077s.p081d.C1832b.f6000n
                    com.facebook.ads.internal.p077s.p081d.C1831a.m8998a(r2, r3, r4, r0)
                L_0x00a2:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p065g.C1691d.f5564d
                    r0.unlock()
                    return r1
                L_0x00aa:
                    r1 = move-exception
                L_0x00ab:
                    if (r0 == 0) goto L_0x00cb
                    boolean r2 = r0.isOpen()
                    if (r2 == 0) goto L_0x00cb
                    boolean r2 = r0.inTransaction()     // Catch:{ Exception -> 0x00bd }
                    if (r2 == 0) goto L_0x00cb
                    r0.endTransaction()     // Catch:{ Exception -> 0x00bd }
                    goto L_0x00cb
                L_0x00bd:
                    r0 = move-exception
                    com.facebook.ads.internal.g.d r2 = com.facebook.ads.internal.p065g.C1691d.this
                    android.content.Context r2 = r2.f5565e
                    int r3 = com.facebook.ads.internal.p077s.p081d.C1832b.f6000n
                    java.lang.String r4 = "database"
                    com.facebook.ads.internal.p077s.p081d.C1831a.m8998a(r2, r4, r3, r0)
                L_0x00cb:
                    java.util.concurrent.locks.Lock r0 = com.facebook.ads.internal.p065g.C1691d.f5564d
                    r0.unlock()
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p065g.C1691d.C16921.mo6857b():java.lang.String");
            }
        };
        return mo6845a(r0, aVar);
    }

    /* renamed from: a */
    public boolean mo6847a(String str) {
        f5564d.lock();
        boolean z = true;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append("events");
            sb.append(" SET ");
            sb.append(C1690c.f5558i.f5548b);
            sb.append("=");
            sb.append(C1690c.f5558i.f5548b);
            sb.append("+1");
            sb.append(" WHERE ");
            sb.append(C1690c.f5550a.f5548b);
            sb.append("=?");
            mo6844a().execSQL(sb.toString(), new String[]{str});
        } catch (SQLiteException unused) {
            z = false;
        }
        f5564d.unlock();
        return z;
    }

    /* renamed from: b */
    public synchronized void mo6848b() {
        for (C1697g e : mo6850c()) {
            e.mo6871e();
        }
        if (this.f5568h != null) {
            this.f5568h.close();
            this.f5568h = null;
        }
    }

    /* renamed from: b */
    public boolean mo6849b(String str) {
        f5564d.lock();
        try {
            return this.f5567g.mo6839a(str);
        } finally {
            f5564d.unlock();
        }
    }

    /* renamed from: c */
    public C1697g[] mo6850c() {
        return new C1697g[]{this.f5566f, this.f5567g};
    }

    /* renamed from: d */
    public Cursor mo6851d() {
        f5563c.lock();
        try {
            return this.f5567g.mo6841c();
        } finally {
            f5563c.unlock();
        }
    }

    /* renamed from: e */
    public Cursor mo6852e() {
        f5563c.lock();
        try {
            return this.f5567g.mo6842d();
        } finally {
            f5563c.unlock();
        }
    }

    /* renamed from: f */
    public Cursor mo6853f() {
        f5563c.lock();
        try {
            return this.f5566f.mo6841c();
        } finally {
            f5563c.unlock();
        }
    }

    /* renamed from: g */
    public void mo6854g() {
        f5564d.lock();
        try {
            this.f5566f.mo6875d();
        } finally {
            f5564d.unlock();
        }
    }

    /* renamed from: h */
    public void mo6855h() {
        f5564d.lock();
        try {
            this.f5567g.mo6873g();
            this.f5566f.mo6873g();
        } finally {
            f5564d.unlock();
        }
    }
}
