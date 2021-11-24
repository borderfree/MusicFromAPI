package com.bumptech.glide.load.p042a.p043a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.p046a.C1393b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a.a.e */
class C1269e {

    /* renamed from: a */
    private static final C1263a f4491a = new C1263a();

    /* renamed from: b */
    private final C1263a f4492b;

    /* renamed from: c */
    private final C1268d f4493c;

    /* renamed from: d */
    private final C1393b f4494d;

    /* renamed from: e */
    private final ContentResolver f4495e;

    /* renamed from: f */
    private final List<ImageHeaderParser> f4496f;

    C1269e(List<ImageHeaderParser> list, C1263a aVar, C1268d dVar, C1393b bVar, ContentResolver contentResolver) {
        this.f4492b = aVar;
        this.f4493c = dVar;
        this.f4494d = bVar;
        this.f4495e = contentResolver;
        this.f4496f = list;
    }

    C1269e(List<ImageHeaderParser> list, C1268d dVar, C1393b bVar, ContentResolver contentResolver) {
        this(list, f4491a, dVar, bVar, contentResolver);
    }

    /* renamed from: a */
    private boolean m6747a(File file) {
        return this.f4492b.mo5929a(file) && 0 < this.f4492b.mo5930b(file);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private String m6748c(Uri uri) {
        Cursor a = this.f4493c.mo5935a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    if (a != null) {
                        a.close();
                    }
                    return string;
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0027 A[Catch:{ all -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047 A[SYNTHETIC, Splitter:B:28:0x0047] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo5936a(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            android.content.ContentResolver r1 = r6.f4495e     // Catch:{ IOException | NullPointerException -> 0x001a, all -> 0x0017 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ IOException | NullPointerException -> 0x001a, all -> 0x0017 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r6.f4496f     // Catch:{ IOException | NullPointerException -> 0x0015 }
            com.bumptech.glide.load.engine.a.b r2 = r6.f4494d     // Catch:{ IOException | NullPointerException -> 0x0015 }
            int r0 = com.bumptech.glide.load.C1290b.m6824b(r0, r1, r2)     // Catch:{ IOException | NullPointerException -> 0x0015 }
            if (r1 == 0) goto L_0x0014
            r1.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r0
        L_0x0015:
            r0 = move-exception
            goto L_0x001e
        L_0x0017:
            r7 = move-exception
            r1 = r0
            goto L_0x0045
        L_0x001a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x001e:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = "ThumbStreamOpener"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r3.<init>()     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "Failed to open uri: "
            r3.append(r4)     // Catch:{ all -> 0x0044 }
            r3.append(r7)     // Catch:{ all -> 0x0044 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0044 }
            android.util.Log.d(r2, r7, r0)     // Catch:{ all -> 0x0044 }
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r7 = -1
            return r7
        L_0x0044:
            r7 = move-exception
        L_0x0045:
            if (r1 == 0) goto L_0x004a
            r1.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p042a.p043a.C1269e.mo5936a(android.net.Uri):int");
    }

    /* renamed from: b */
    public InputStream mo5937b(Uri uri) {
        String c = m6748c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File a = this.f4492b.mo5928a(c);
        if (!m6747a(a)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(a);
        try {
            return this.f4495e.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }
}
