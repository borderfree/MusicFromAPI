package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.util.Log;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/* renamed from: com.facebook.internal.s */
public final class C2241s {

    /* renamed from: a */
    private static final String f7231a = "com.facebook.internal.s";

    /* renamed from: b */
    private static File f7232b;

    /* renamed from: com.facebook.internal.s$a */
    public static final class C2243a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final UUID f7233a;

        /* renamed from: b */
        private final String f7234b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final String f7235c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Bitmap f7236d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public Uri f7237e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f7238f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f7239g;

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C2243a(java.util.UUID r4, android.graphics.Bitmap r5, android.net.Uri r6) {
            /*
                r3 = this;
                r3.<init>()
                r3.f7233a = r4
                r3.f7236d = r5
                r3.f7237e = r6
                r0 = 1
                if (r6 == 0) goto L_0x005a
                java.lang.String r5 = r6.getScheme()
                java.lang.String r1 = "content"
                boolean r1 = r1.equalsIgnoreCase(r5)
                if (r1 == 0) goto L_0x002f
                r3.f7238f = r0
                java.lang.String r5 = r6.getAuthority()
                if (r5 == 0) goto L_0x002d
                java.lang.String r5 = r6.getAuthority()
                java.lang.String r6 = "media"
                boolean r5 = r5.startsWith(r6)
                if (r5 != 0) goto L_0x002d
                goto L_0x005c
            L_0x002d:
                r0 = 0
                goto L_0x005c
            L_0x002f:
                java.lang.String r1 = "file"
                java.lang.String r2 = r6.getScheme()
                boolean r1 = r1.equalsIgnoreCase(r2)
                if (r1 == 0) goto L_0x003c
                goto L_0x005c
            L_0x003c:
                boolean r6 = com.facebook.internal.C2258x.m10399b(r6)
                if (r6 == 0) goto L_0x0043
                goto L_0x005e
            L_0x0043:
                com.facebook.FacebookException r4 = new com.facebook.FacebookException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Unsupported scheme for media Uri : "
                r6.append(r0)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r4.<init>(r5)
                throw r4
            L_0x005a:
                if (r5 == 0) goto L_0x0086
            L_0x005c:
                r3.f7239g = r0
            L_0x005e:
                boolean r5 = r3.f7239g
                if (r5 != 0) goto L_0x0064
                r5 = 0
                goto L_0x006c
            L_0x0064:
                java.util.UUID r5 = java.util.UUID.randomUUID()
                java.lang.String r5 = r5.toString()
            L_0x006c:
                r3.f7235c = r5
                boolean r5 = r3.f7239g
                if (r5 != 0) goto L_0x0079
                android.net.Uri r4 = r3.f7237e
                java.lang.String r4 = r4.toString()
                goto L_0x0083
            L_0x0079:
                java.lang.String r5 = com.facebook.C2189f.m10096j()
                java.lang.String r6 = r3.f7235c
                java.lang.String r4 = com.facebook.C2188e.m10078a(r5, r4, r6)
            L_0x0083:
                r3.f7234b = r4
                return
            L_0x0086:
                com.facebook.FacebookException r4 = new com.facebook.FacebookException
                java.lang.String r5 = "Cannot share media without a bitmap or Uri set"
                r4.<init>(r5)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2241s.C2243a.<init>(java.util.UUID, android.graphics.Bitmap, android.net.Uri):void");
        }

        /* renamed from: a */
        public String mo7870a() {
            return this.f7234b;
        }
    }

    private C2241s() {
    }

    /* renamed from: a */
    public static C2243a m10269a(UUID uuid, Bitmap bitmap) {
        C2264y.m10422a((Object) uuid, "callId");
        C2264y.m10422a((Object) bitmap, "attachmentBitmap");
        return new C2243a(uuid, bitmap, null);
    }

    /* renamed from: a */
    public static C2243a m10270a(UUID uuid, Uri uri) {
        C2264y.m10422a((Object) uuid, "callId");
        C2264y.m10422a((Object) uri, "attachmentUri");
        return new C2243a(uuid, null, uri);
    }

    /* renamed from: a */
    static synchronized File m10271a() {
        File file;
        synchronized (C2241s.class) {
            if (f7232b == null) {
                f7232b = new File(C2189f.m10092f().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f7232b;
        }
        return file;
    }

    /* renamed from: a */
    public static File m10272a(UUID uuid, String str) {
        if (C2258x.m10392a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m10273a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    static File m10273a(UUID uuid, String str, boolean z) {
        File a = m10274a(uuid, z);
        if (a == null) {
            return null;
        }
        try {
            return new File(a, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static File m10274a(UUID uuid, boolean z) {
        if (f7232b == null) {
            return null;
        }
        File file = new File(f7232b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    private static void m10275a(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            C2258x.m10380a((Closeable) fileOutputStream);
        }
    }

    /* renamed from: a */
    private static void m10276a(Uri uri, boolean z, File file) {
        InputStream inputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (!z) {
            try {
                inputStream = new FileInputStream(uri.getPath());
            } catch (Throwable th) {
                C2258x.m10380a((Closeable) fileOutputStream);
                throw th;
            }
        } else {
            inputStream = C2189f.m10092f().getContentResolver().openInputStream(uri);
        }
        C2258x.m10356a(inputStream, (OutputStream) fileOutputStream);
        C2258x.m10380a((Closeable) fileOutputStream);
    }

    /* renamed from: a */
    public static void m10277a(Collection<C2243a> collection) {
        if (collection != null && collection.size() != 0) {
            if (f7232b == null) {
                m10280c();
            }
            m10279b();
            ArrayList<File> arrayList = new ArrayList<>();
            try {
                for (C2243a aVar : collection) {
                    if (aVar.f7239g) {
                        File a = m10273a(aVar.f7233a, aVar.f7235c, true);
                        arrayList.add(a);
                        if (aVar.f7236d != null) {
                            m10275a(aVar.f7236d, a);
                        } else if (aVar.f7237e != null) {
                            m10276a(aVar.f7237e, aVar.f7238f, a);
                        }
                    }
                }
            } catch (IOException e) {
                String str = f7231a;
                StringBuilder sb = new StringBuilder();
                sb.append("Got unexpected exception:");
                sb.append(e);
                Log.e(str, sb.toString());
                for (File delete : arrayList) {
                    try {
                        delete.delete();
                    } catch (Exception unused) {
                    }
                }
                throw new FacebookException((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static void m10278a(UUID uuid) {
        File a = m10274a(uuid, false);
        if (a != null) {
            C2258x.m10381a(a);
        }
    }

    /* renamed from: b */
    static File m10279b() {
        File a = m10271a();
        a.mkdirs();
        return a;
    }

    /* renamed from: c */
    public static void m10280c() {
        C2258x.m10381a(m10271a());
    }
}
