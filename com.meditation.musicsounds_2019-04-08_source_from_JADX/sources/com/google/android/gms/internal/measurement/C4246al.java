package com.google.android.gms.internal.measurement;

import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.measurement.al */
public final class C4246al extends C4497s {

    /* renamed from: a */
    private volatile String f15721a;

    /* renamed from: b */
    private Future<String> f15722b;

    protected C4246al(C4499u uVar) {
        super(uVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080 A[SYNTHETIC, Splitter:B:42:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008e A[SYNTHETIC, Splitter:B:49:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c A[SYNTHETIC, Splitter:B:58:0x009c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m20982a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.C3266s.m14926c(r0)
            r0 = 0
            java.lang.String r1 = "gaClientId"
            java.io.FileInputStream r1 = r7.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x0099, IOException -> 0x0072, all -> 0x006f }
            r2 = 36
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            r4 = 0
            int r2 = r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            int r5 = r1.available()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            if (r5 <= 0) goto L_0x0035
            java.lang.String r2 = "clientId file seems corrupted, deleting it."
            r6.mo14821e(r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            r1.close()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            java.lang.String r2 = "gaClientId"
            r7.deleteFile(r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r7 = move-exception
            java.lang.String r1 = "Failed to close client id reading stream"
            r6.mo14822e(r1, r7)
        L_0x0034:
            return r0
        L_0x0035:
            r5 = 14
            if (r2 >= r5) goto L_0x0053
            java.lang.String r2 = "clientId file is empty, deleting it."
            r6.mo14821e(r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            r1.close()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            java.lang.String r2 = "gaClientId"
            r7.deleteFile(r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0052
        L_0x004c:
            r7 = move-exception
            java.lang.String r1 = "Failed to close client id reading stream"
            r6.mo14822e(r1, r7)
        L_0x0052:
            return r0
        L_0x0053:
            r1.close()     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            java.lang.String r5 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            r5.<init>(r3, r4, r2)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            java.lang.String r2 = "Read client id from disk"
            r6.mo14808a(r2, r5)     // Catch:{ FileNotFoundException -> 0x009a, IOException -> 0x006d }
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006c
        L_0x0066:
            r7 = move-exception
            java.lang.String r0 = "Failed to close client id reading stream"
            r6.mo14822e(r0, r7)
        L_0x006c:
            return r5
        L_0x006d:
            r2 = move-exception
            goto L_0x0074
        L_0x006f:
            r7 = move-exception
            r1 = r0
            goto L_0x008c
        L_0x0072:
            r2 = move-exception
            r1 = r0
        L_0x0074:
            java.lang.String r3 = "Error reading client id file, deleting it"
            r6.mo14822e(r3, r2)     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "gaClientId"
            r7.deleteFile(r2)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x008a
        L_0x0084:
            r7 = move-exception
            java.lang.String r1 = "Failed to close client id reading stream"
            r6.mo14822e(r1, r7)
        L_0x008a:
            return r0
        L_0x008b:
            r7 = move-exception
        L_0x008c:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ IOException -> 0x0092 }
            goto L_0x0098
        L_0x0092:
            r0 = move-exception
            java.lang.String r1 = "Failed to close client id reading stream"
            r6.mo14822e(r1, r0)
        L_0x0098:
            throw r7
        L_0x0099:
            r1 = r0
        L_0x009a:
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a6
        L_0x00a0:
            r7 = move-exception
            java.lang.String r1 = "Failed to close client id reading stream"
            r6.mo14822e(r1, r7)
        L_0x00a6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4246al.m20982a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[SYNTHETIC, Splitter:B:24:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0050 A[SYNTHETIC, Splitter:B:34:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005d A[SYNTHETIC, Splitter:B:40:0x005d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m20984a(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C3266s.m14915a(r5)
            java.lang.String r0 = "ClientId should be saved from worker thread"
            com.google.android.gms.common.internal.C3266s.m14926c(r0)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "Storing clientId"
            r3.mo14808a(r2, r5)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0035 }
            java.lang.String r2 = "gaClientId"
            java.io.FileOutputStream r4 = r4.openFileOutput(r2, r0)     // Catch:{ FileNotFoundException -> 0x0048, IOException -> 0x0035 }
            byte[] r5 = r5.getBytes()     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x002d, all -> 0x002a }
            r4.write(r5)     // Catch:{ FileNotFoundException -> 0x0030, IOException -> 0x002d, all -> 0x002a }
            if (r4 == 0) goto L_0x0028
            r4.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r4 = move-exception
            java.lang.String r5 = "Failed to close clientId writing stream"
            r3.mo14822e(r5, r4)
        L_0x0028:
            r4 = 1
            return r4
        L_0x002a:
            r5 = move-exception
            r1 = r4
            goto L_0x005b
        L_0x002d:
            r5 = move-exception
            r1 = r4
            goto L_0x0036
        L_0x0030:
            r5 = move-exception
            r1 = r4
            goto L_0x0049
        L_0x0033:
            r5 = move-exception
            goto L_0x005b
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            java.lang.String r4 = "Error writing to clientId file"
            r3.mo14822e(r4, r5)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = "Failed to close clientId writing stream"
            r3.mo14822e(r5, r4)
        L_0x0047:
            return r0
        L_0x0048:
            r5 = move-exception
        L_0x0049:
            java.lang.String r4 = "Error creating clientId file"
            r3.mo14822e(r4, r5)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r4 = move-exception
            java.lang.String r5 = "Failed to close clientId writing stream"
            r3.mo14822e(r5, r4)
        L_0x005a:
            return r0
        L_0x005b:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r4 = move-exception
            java.lang.String r0 = "Failed to close clientId writing stream"
            r3.mo14822e(r0, r4)
        L_0x0067:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4246al.m20984a(android.content.Context, java.lang.String):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final String m20985e() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            if (!m20984a(mo14829l().mo10650c(), lowerCase)) {
                lowerCase = "0";
            }
            return lowerCase;
        } catch (Exception e) {
            mo14822e("Error saving clientId file", e);
            return "0";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[Catch:{ InterruptedException -> 0x0031, ExecutionException -> 0x0026 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14136b() {
        /*
            r2 = this;
            r2.mo14840x()
            monitor-enter(r2)
            java.lang.String r0 = r2.f15721a     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0017
            com.google.android.gms.analytics.p r0 = r2.mo14829l()     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.measurement.am r1 = new com.google.android.gms.internal.measurement.am     // Catch:{ all -> 0x0050 }
            r1.<init>(r2)     // Catch:{ all -> 0x0050 }
            java.util.concurrent.Future r0 = r0.mo10645a(r1)     // Catch:{ all -> 0x0050 }
            r2.f15722b = r0     // Catch:{ all -> 0x0050 }
        L_0x0017:
            java.util.concurrent.Future<java.lang.String> r0 = r2.f15722b     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004c
            java.util.concurrent.Future<java.lang.String> r0 = r2.f15722b     // Catch:{ InterruptedException -> 0x0031, ExecutionException -> 0x0026 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0031, ExecutionException -> 0x0026 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x0031, ExecutionException -> 0x0026 }
            r2.f15721a = r0     // Catch:{ InterruptedException -> 0x0031, ExecutionException -> 0x0026 }
            goto L_0x003a
        L_0x0026:
            r0 = move-exception
            java.lang.String r1 = "Failed to load or generate client id"
            r2.mo14822e(r1, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "0"
        L_0x002e:
            r2.f15721a = r0     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0031:
            r0 = move-exception
            java.lang.String r1 = "ClientId loading or generation was interrupted"
            r2.mo14819d(r1, r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "0"
            goto L_0x002e
        L_0x003a:
            java.lang.String r0 = r2.f15721a     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "0"
            r2.f15721a = r0     // Catch:{ all -> 0x0050 }
        L_0x0042:
            java.lang.String r0 = "Loaded clientId"
            java.lang.String r1 = r2.f15721a     // Catch:{ all -> 0x0050 }
            r2.mo14808a(r0, r1)     // Catch:{ all -> 0x0050 }
            r0 = 0
            r2.f15722b = r0     // Catch:{ all -> 0x0050 }
        L_0x004c:
            java.lang.String r0 = r2.f15721a     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            return r0
        L_0x0050:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4246al.mo14136b():java.lang.String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo14137c() {
        synchronized (this) {
            this.f15721a = null;
            this.f15722b = mo14829l().mo10645a((Callable<V>) new C4248an<V>(this));
        }
        return mo14136b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo14138d() {
        String a = m20982a(mo14829l().mo10650c());
        return a == null ? m20985e() : a;
    }
}
