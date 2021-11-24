package com.pollfish.p147c;

import android.app.Activity;
import android.os.AsyncTask;
import com.pollfish.interfaces.C5174a.C5175a;
import com.pollfish.p145a.C5105a;
import com.pollfish.p150f.C5162b;

/* renamed from: com.pollfish.c.a */
public class C5112a extends AsyncTask {

    /* renamed from: a */
    private Activity f18263a;

    /* renamed from: b */
    private C5175a f18264b;

    /* renamed from: c */
    private boolean f18265c;

    public C5112a(Activity activity, C5175a aVar, boolean z) {
        this.f18263a = activity;
        this.f18264b = aVar;
        this.f18265c = z;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.pollfish.a.a] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19, types: [com.pollfish.a.a] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23 */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: type inference failed for: r2v25 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v27 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v29 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1
      assigns: []
      uses: []
      mth insns count: 204
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01cf  */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.pollfish.p145a.C5105a mo16668a(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "CheckAdIdTask"
            java.lang.String r1 = "getAdIdThread"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            r0 = 0
            if (r7 == 0) goto L_0x0210
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ Throwable -> 0x018a }
            int r1 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r1)     // Catch:{ Throwable -> 0x018a }
            if (r1 != 0) goto L_0x0172
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.String r2 = "google play services are up to date"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ Throwable -> 0x018a }
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.String r2 = "Google play Services are available go check if can retrieve advertising id"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ Throwable -> 0x018a }
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r1)     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            if (r1 == 0) goto L_0x008b
            com.pollfish.a.a r2 = new com.pollfish.a.a     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            java.lang.String r3 = r1.getId()     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            boolean r1 = r1.isLimitAdTrackingEnabled()     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            r2.<init>(r3, r1)     // Catch:{ VerifyError -> 0x0143, IOException -> 0x0116, GooglePlayServicesRepairableException -> 0x00ea, GooglePlayServicesNotAvailableException -> 0x00be, Exception -> 0x008e }
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            r3.<init>()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r4 = "Google Advertising ID: "
            r3.append(r4)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r4 = r2.mo16589a()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            r3.append(r4)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r3 = r3.toString()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            r3.<init>()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r4 = "optOutFromAdsEnabled: "
            r3.append(r4)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.Boolean r4 = r2.mo16590b()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            r3.append(r4)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r3 = r3.toString()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            java.lang.String r1 = r2.mo16589a()     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            if (r1 != 0) goto L_0x01cd
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.String r3 = "Advertising Identifier is null - set googleAdId object to null"
            com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ VerifyError -> 0x0088, IOException -> 0x0085, GooglePlayServicesRepairableException -> 0x0083, GooglePlayServicesNotAvailableException -> 0x0081, Exception -> 0x007f }
            goto L_0x008b
        L_0x007f:
            r1 = move-exception
            goto L_0x0090
        L_0x0081:
            r1 = move-exception
            goto L_0x00c0
        L_0x0083:
            r1 = move-exception
            goto L_0x00ec
        L_0x0085:
            r1 = move-exception
            goto L_0x0118
        L_0x0088:
            r1 = move-exception
            goto L_0x0145
        L_0x008b:
            r2 = r0
            goto L_0x01cd
        L_0x008e:
            r1 = move-exception
            r2 = r0
        L_0x0090:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "getAdIdThread Exception : "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            com.pollfish.p150f.C5162b.m25519b(r3, r4)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "Error while retrieving advertising id: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
        L_0x00b9:
            android.util.Log.e(r3, r1)     // Catch:{ Throwable -> 0x0170 }
            goto L_0x01cd
        L_0x00be:
            r1 = move-exception
            r2 = r0
        L_0x00c0:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "getAdIdThread GooglePlayServicesNotAvailableException : "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            com.pollfish.p150f.C5162b.m25519b(r3, r4)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "Error while retrieving advertising id - GooglePlayServicesNotAvailableException: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            goto L_0x00b9
        L_0x00ea:
            r1 = move-exception
            r2 = r0
        L_0x00ec:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "getAdIdThread GooglePlayServicesRepairableException : "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            com.pollfish.p150f.C5162b.m25519b(r3, r4)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "Error while retrieving advertising id - GooglePlayServicesRepairableException: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            goto L_0x00b9
        L_0x0116:
            r1 = move-exception
            r2 = r0
        L_0x0118:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "getAdIdThread IOException : "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            com.pollfish.p150f.C5162b.m25519b(r3, r4)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "Error while retrieving advertising id - IOException exception: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            goto L_0x00b9
        L_0x0143:
            r1 = move-exception
            r2 = r0
        L_0x0145:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "getAdIdThread VerifyError : "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            com.pollfish.p150f.C5162b.m25519b(r3, r4)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0170 }
            r4.<init>()     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r5 = "Error while retrieving advertising id: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0170 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0170 }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x0170 }
            goto L_0x00b9
        L_0x0170:
            r1 = move-exception
            goto L_0x018c
        L_0x0172:
            java.lang.String r2 = "CheckAdIdTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x018a }
            r3.<init>()     // Catch:{ Throwable -> 0x018a }
            java.lang.String r4 = "google play services  error code: "
            r3.append(r4)     // Catch:{ Throwable -> 0x018a }
            r3.append(r1)     // Catch:{ Throwable -> 0x018a }
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x018a }
            com.pollfish.p150f.C5162b.m25519b(r2, r1)     // Catch:{ Throwable -> 0x018a }
            goto L_0x008b
        L_0x018a:
            r1 = move-exception
            r2 = r0
        L_0x018c:
            java.lang.String r3 = "CheckAdIdTask"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getAdIdThread VerifyError : "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.pollfish.p150f.C5162b.m25519b(r3, r4)
            java.lang.String r3 = "PollFish"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error : "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
            java.lang.String r1 = "PollFish"
            java.lang.String r3 = "You have to include Google Play Services to enable Pollfish SDK for Google Play into your app."
            android.util.Log.e(r1, r3)
            java.lang.String r1 = "PollFish"
            java.lang.String r3 = "Have a look on how to set up Google Play Services for your app here: https://developer.android.com/google/play-services/setup.html#ensure"
            android.util.Log.e(r1, r3)
            java.lang.String r1 = "PollFish"
            java.lang.String r3 = "Google Play Services are required in order to retrieve device Advertising Id that will be used for distributing targeted surveys as explicity required form Google Play policies: https://play.google.com/about/developer-content-policy.html"
            android.util.Log.e(r1, r3)
        L_0x01cd:
            if (r2 != 0) goto L_0x020e
            java.lang.String r1 = "PollFish"
            java.lang.String r3 = "Missing updated version of Google Play Services"
            android.util.Log.e(r1, r3)
            java.lang.String r1 = "CheckAdIdTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isDebuggable: "
            r3.append(r4)
            boolean r4 = r6.f18265c
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.pollfish.p150f.C5162b.m25518a(r1, r3)
            boolean r1 = r6.f18265c
            if (r1 == 0) goto L_0x020e
            boolean r7 = com.pollfish.p150f.C5166c.m25542b(r7)
            if (r7 == 0) goto L_0x020e
            java.lang.String r7 = "PollFish"
            java.lang.String r1 = "Only emulators with Google APIs include Google Play Services"
            android.util.Log.w(r7, r1)
            java.lang.String r7 = "PollFish"
            java.lang.String r1 = "App is running on emulator & Pollfish is in developer mode - show demo surveys for testing purposes only"
            android.util.Log.w(r7, r1)
            com.pollfish.a.a r7 = new com.pollfish.a.a
            java.lang.String r1 = "noMac"
            r7.<init>(r1, r0)
            goto L_0x0211
        L_0x020e:
            r7 = r2
            goto L_0x0211
        L_0x0210:
            r7 = r0
        L_0x0211:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5112a.mo16668a(android.app.Activity):com.pollfish.a.a");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5105a doInBackground(Void... voidArr) {
        C5105a aVar;
        Object e;
        StringBuilder sb;
        String str;
        Object e2;
        Object e3;
        String str2;
        String str3;
        C5162b.m25518a("CheckAdIdTask", "checking advertising id availability");
        try {
            aVar = mo16668a(this.f18263a);
            if (aVar != null) {
                str2 = "CheckAdIdTask";
                str3 = "surveys are allowed";
            } else {
                str2 = "CheckAdIdTask";
                str3 = "surveys are limited";
            }
            try {
                C5162b.m25518a(str2, str3);
                C5162b.m25518a("CheckAdIdTask", "Ready to move on...");
            } catch (Exception e4) {
                e2 = e4;
                str = "CheckAdIdTask";
                sb = new StringBuilder();
                sb.append("doInBackground getAdIdThread: ");
                sb.append(e);
                C5162b.m25519b(str, sb.toString());
                return aVar;
            } catch (NoSuchMethodError e5) {
                e3 = e5;
                str = "CheckAdIdTask";
                sb = new StringBuilder();
                sb.append("doInBackground getAdIdThread: ");
                sb.append(e);
                C5162b.m25519b(str, sb.toString());
                return aVar;
            } catch (NoClassDefFoundError e6) {
                e = e6;
                str = "CheckAdIdTask";
                sb = new StringBuilder();
                sb.append("doInBackground getAdIdThread: ");
                sb.append(e);
                C5162b.m25519b(str, sb.toString());
                return aVar;
            }
        } catch (Exception e7) {
            Object obj = e7;
            aVar = null;
            e2 = obj;
            str = "CheckAdIdTask";
            sb = new StringBuilder();
            sb.append("doInBackground getAdIdThread: ");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return aVar;
        } catch (NoSuchMethodError e8) {
            Object obj2 = e8;
            aVar = null;
            e3 = obj2;
            str = "CheckAdIdTask";
            sb = new StringBuilder();
            sb.append("doInBackground getAdIdThread: ");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return aVar;
        } catch (NoClassDefFoundError e9) {
            Object obj3 = e9;
            aVar = null;
            e = obj3;
            str = "CheckAdIdTask";
            sb = new StringBuilder();
            sb.append("doInBackground getAdIdThread: ");
            sb.append(e);
            C5162b.m25519b(str, sb.toString());
            return aVar;
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(C5105a aVar) {
        String str;
        String str2;
        if (aVar != null) {
            str = "CheckAdIdTask";
            StringBuilder sb = new StringBuilder();
            sb.append("Retrieved googleAdId object with advertising id: ");
            sb.append(aVar.mo16589a());
            sb.append(" and opt out from interest based ads option: ");
            sb.append(aVar.mo16590b());
            str2 = sb.toString();
        } else {
            str = "CheckAdIdTask";
            str2 = "googleAdId = null";
        }
        C5162b.m25518a(str, str2);
        if (this.f18264b != null) {
            this.f18264b.mo16789a(aVar);
        } else {
            C5162b.m25518a("CheckAdIdTask", "advertisingIdListener == null");
        }
        super.onPostExecute(aVar);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        C5162b.m25518a("CheckAdIdTask", "CheckAdIdTask: onPreExecute");
        super.onPreExecute();
    }
}
