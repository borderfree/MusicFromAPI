package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.df */
public final class C4321df implements C4326dk {

    /* renamed from: a */
    static final Map<Uri, C4321df> f16014a = new C0488a();

    /* renamed from: g */
    private static final String[] f16015g = {"key", "value"};

    /* renamed from: b */
    private final ContentResolver f16016b;

    /* renamed from: c */
    private final Uri f16017c;

    /* renamed from: d */
    private final Object f16018d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f16019e;

    /* renamed from: f */
    private final List<C4325dj> f16020f = new ArrayList();

    private C4321df(ContentResolver contentResolver, Uri uri) {
        this.f16016b = contentResolver;
        this.f16017c = uri;
        this.f16016b.registerContentObserver(uri, false, new C4323dh(this, null));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C4321df m21246a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.df> r0 = com.google.android.gms.internal.measurement.C4321df.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.df> r1 = f16014a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.df r1 = (com.google.android.gms.internal.measurement.C4321df) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.df r2 = new com.google.android.gms.internal.measurement.df     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.df> r3 = f16014a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4321df.m21246a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.df");
    }

    /* renamed from: d */
    private final Map<String, String> m21247d() {
        try {
            return (Map) C4327dl.m21259a(new C4322dg(this));
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo14275a(String str) {
        return (String) mo14276a().get(str);
    }

    /* renamed from: a */
    public final Map<String, String> mo14276a() {
        Map<String, String> map = this.f16019e;
        if (map == null) {
            synchronized (this.f16018d) {
                map = this.f16019e;
                if (map == null) {
                    map = m21247d();
                    this.f16019e = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo14277b() {
        synchronized (this.f16018d) {
            this.f16019e = null;
            C4333dr.m21273a();
        }
        synchronized (this) {
            for (C4325dj a : this.f16020f) {
                a.mo14281a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo14278c() {
        Cursor query = this.f16016b.query(this.f16017c, f16015g, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new C0488a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }
}
