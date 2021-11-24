package android.support.p009v4.p017e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.p009v4.content.p015a.C0442a;
import android.support.p009v4.p010a.C0324c;
import android.support.p009v4.p010a.C0333h;
import android.support.p009v4.p017e.C0472c.C0477a;
import android.support.p009v4.p019g.C0496g;
import android.support.p009v4.p019g.C0509l;
import android.support.p009v4.p019g.C0510m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.e.b */
public class C0464b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0496g<String, Typeface> f1396a = new C0496g<>(16);

    /* renamed from: b */
    private static final C0472c f1397b = new C0472c("fonts", 10, 10000);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f1398c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C0510m<String, ArrayList<C0477a<C0471c>>> f1399d = new C0510m<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f1400e = new Comparator<byte[]>() {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    };

    /* renamed from: android.support.v4.e.b$a */
    public static class C0469a {

        /* renamed from: a */
        private final int f1408a;

        /* renamed from: b */
        private final C0470b[] f1409b;

        public C0469a(int i, C0470b[] bVarArr) {
            this.f1408a = i;
            this.f1409b = bVarArr;
        }

        /* renamed from: a */
        public int mo1862a() {
            return this.f1408a;
        }

        /* renamed from: b */
        public C0470b[] mo1863b() {
            return this.f1409b;
        }
    }

    /* renamed from: android.support.v4.e.b$b */
    public static class C0470b {

        /* renamed from: a */
        private final Uri f1410a;

        /* renamed from: b */
        private final int f1411b;

        /* renamed from: c */
        private final int f1412c;

        /* renamed from: d */
        private final boolean f1413d;

        /* renamed from: e */
        private final int f1414e;

        public C0470b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f1410a = (Uri) C0509l.m2252a(uri);
            this.f1411b = i;
            this.f1412c = i2;
            this.f1413d = z;
            this.f1414e = i3;
        }

        /* renamed from: a */
        public Uri mo1864a() {
            return this.f1410a;
        }

        /* renamed from: b */
        public int mo1865b() {
            return this.f1411b;
        }

        /* renamed from: c */
        public int mo1866c() {
            return this.f1412c;
        }

        /* renamed from: d */
        public boolean mo1867d() {
            return this.f1413d;
        }

        /* renamed from: e */
        public int mo1868e() {
            return this.f1414e;
        }
    }

    /* renamed from: android.support.v4.e.b$c */
    private static final class C0471c {

        /* renamed from: a */
        final Typeface f1415a;

        /* renamed from: b */
        final int f1416b;

        C0471c(Typeface typeface, int i) {
            this.f1415a = typeface;
            this.f1416b = i;
        }
    }

    /* renamed from: a */
    public static ProviderInfo m2114a(PackageManager packageManager, C0463a aVar, Resources resources) {
        String a = aVar.mo1848a();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(a, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(a);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(aVar.mo1849b())) {
            List a2 = m2120a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f1400e);
            List a3 = m2119a(aVar, resources);
            for (int i = 0; i < a3.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a3.get(i));
                Collections.sort(arrayList, f1400e);
                if (m2122a(a2, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(a);
            sb2.append(", but package was not ");
            sb2.append(aVar.mo1849b());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* JADX INFO: used method not loaded: android.support.v4.e.c.a(java.util.concurrent.Callable, android.support.v4.e.c$a):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        f1397b.mo1870a((java.util.concurrent.Callable) r1, (android.support.p009v4.p017e.C0472c.C0477a) new android.support.p009v4.p017e.C0464b.C04673());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m2115a(final android.content.Context r2, final android.support.p009v4.p017e.C0463a r3, final android.support.p009v4.content.p015a.C0447b.C0448a r4, final android.os.Handler r5, boolean r6, int r7, final int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo1853f()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            android.support.v4.g.g<java.lang.String, android.graphics.Typeface> r1 = f1396a
            java.lang.Object r1 = r1.mo1928a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo1815a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0045
            r1 = -1
            if (r7 != r1) goto L_0x0045
            android.support.v4.e.b$c r2 = m2124b(r2, r3, r8)
            if (r4 == 0) goto L_0x0042
            int r3 = r2.f1416b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f1415a
            r4.mo1816a(r3, r5)
            goto L_0x0042
        L_0x003d:
            int r3 = r2.f1416b
            r4.mo1814a(r3, r5)
        L_0x0042:
            android.graphics.Typeface r2 = r2.f1415a
            return r2
        L_0x0045:
            android.support.v4.e.b$1 r1 = new android.support.v4.e.b$1
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0059
            android.support.v4.e.c r3 = f1397b     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Object r3 = r3.mo1869a(r1, r7)     // Catch:{ InterruptedException -> 0x0058 }
            android.support.v4.e.b$c r3 = (android.support.p009v4.p017e.C0464b.C0471c) r3     // Catch:{ InterruptedException -> 0x0058 }
            android.graphics.Typeface r3 = r3.f1415a     // Catch:{ InterruptedException -> 0x0058 }
            return r3
        L_0x0058:
            return r2
        L_0x0059:
            if (r4 != 0) goto L_0x005d
            r3 = r2
            goto L_0x0062
        L_0x005d:
            android.support.v4.e.b$2 r3 = new android.support.v4.e.b$2
            r3.<init>(r4, r5)
        L_0x0062:
            java.lang.Object r4 = f1398c
            monitor-enter(r4)
            android.support.v4.g.m<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r5 = f1399d     // Catch:{ all -> 0x0097 }
            boolean r5 = r5.containsKey(r0)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007a
            android.support.v4.g.m<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r5 = f1399d     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
        L_0x007a:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            return r2
        L_0x007c:
            if (r3 == 0) goto L_0x008b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0097 }
            r5.<init>()     // Catch:{ all -> 0x0097 }
            r5.add(r3)     // Catch:{ all -> 0x0097 }
            android.support.v4.g.m<java.lang.String, java.util.ArrayList<android.support.v4.e.c$a<android.support.v4.e.b$c>>> r3 = f1399d     // Catch:{ all -> 0x0097 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0097 }
        L_0x008b:
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            android.support.v4.e.c r3 = f1397b
            android.support.v4.e.b$3 r4 = new android.support.v4.e.b$3
            r4.<init>(r0)
            r3.mo1870a(r1, r4)
            return r2
        L_0x0097:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0097 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.p017e.C0464b.m2115a(android.content.Context, android.support.v4.e.a, android.support.v4.content.a.b$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static C0469a m2116a(Context context, CancellationSignal cancellationSignal, C0463a aVar) {
        ProviderInfo a = m2114a(context.getPackageManager(), aVar, context.getResources());
        return a == null ? new C0469a(1, null) : new C0469a(0, m2123a(context, aVar, a.authority, cancellationSignal));
    }

    /* renamed from: a */
    private static List<List<byte[]>> m2119a(C0463a aVar, Resources resources) {
        return aVar.mo1851d() != null ? aVar.mo1851d() : C0442a.m2028a(resources, aVar.mo1852e());
    }

    /* renamed from: a */
    private static List<byte[]> m2120a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m2121a(Context context, C0470b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0470b bVar : bVarArr) {
            if (bVar.mo1868e() == 0) {
                Uri a = bVar.mo1864a();
                if (!hashMap.containsKey(a)) {
                    hashMap.put(a, C0333h.m1262a(context, cancellationSignal, a));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    private static boolean m2122a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    static C0470b[] m2123a(Context context, C0463a aVar, String str, CancellationSignal cancellationSignal) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Builder().scheme("content").authority(str2).build();
        Uri build2 = new Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor query = VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1850c()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.mo1850c()}, null);
            if (query != null && query.getCount() > 0) {
                int columnIndex = query.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = query.getColumnIndex("_id");
                int columnIndex3 = query.getColumnIndex("file_id");
                int columnIndex4 = query.getColumnIndex("font_ttc_index");
                int columnIndex5 = query.getColumnIndex("font_weight");
                int columnIndex6 = query.getColumnIndex("font_italic");
                while (query.moveToNext()) {
                    int i = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                    C0470b bVar = new C0470b(columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3)), columnIndex4 != -1 ? query.getInt(columnIndex4) : 0, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i);
                    arrayList2.add(bVar);
                }
                arrayList = arrayList2;
            }
            if (query != null) {
                query.close();
            }
            return (C0470b[]) arrayList.toArray(new C0470b[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0471c m2124b(Context context, C0463a aVar, int i) {
        try {
            C0469a a = m2116a(context, (CancellationSignal) null, aVar);
            int i2 = -3;
            if (a.mo1862a() == 0) {
                Typeface a2 = C0324c.m1218a(context, null, a.mo1863b(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C0471c(a2, i2);
            }
            if (a.mo1862a() == 1) {
                i2 = -2;
            }
            return new C0471c(null, i2);
        } catch (NameNotFoundException unused) {
            return new C0471c(null, -1);
        }
    }
}
