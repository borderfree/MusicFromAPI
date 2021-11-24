package com.pollfish.p147c;

import android.app.Activity;
import com.pollfish.interfaces.C5174a.C5177c;
import com.pollfish.p145a.C5106b;
import com.pollfish.p145a.C5108c;
import com.pollfish.p145a.C5110e;
import com.pollfish.p150f.C5162b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* renamed from: com.pollfish.c.e */
public class C5116e extends C5119h {

    /* renamed from: a */
    private C5108c f18277a;

    /* renamed from: b */
    private String f18278b;

    /* renamed from: c */
    private int f18279c;

    /* renamed from: d */
    private String f18280d;

    /* renamed from: e */
    private JSONObject f18281e = null;

    /* renamed from: f */
    private String f18282f = null;

    /* renamed from: g */
    private C5177c f18283g;

    /* renamed from: h */
    private Activity f18284h = null;

    /* renamed from: i */
    private boolean f18285i = false;

    /* renamed from: j */
    private boolean f18286j = false;

    /* renamed from: k */
    private C5106b f18287k = null;

    /* renamed from: l */
    private String f18288l = null;

    public C5116e(C5108c cVar, String str, int i, String str2, JSONObject jSONObject, C5177c cVar2, Activity activity, boolean z, String str3, C5106b bVar, String str4) {
        this.f18277a = cVar;
        this.f18278b = str;
        this.f18279c = i;
        this.f18280d = str2;
        this.f18281e = jSONObject;
        this.f18284h = activity;
        this.f18285i = z;
        this.f18287k = bVar;
        this.f18288l = str4;
        if (str3 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Request for: ");
            sb.append(str3);
            sb.append(" sent from offline queue");
            C5162b.m25518a("ContactServerTask", sb.toString());
            this.f18282f = str3;
            this.f18286j = true;
        }
        this.f18283g = cVar2;
    }

    /* renamed from: a */
    private String m25364a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m25365a(inputStream, byteArrayOutputStream);
        String byteArrayOutputStream2 = byteArrayOutputStream.toString();
        byteArrayOutputStream.close();
        return byteArrayOutputStream2;
    }

    /* renamed from: a */
    private void m25365a(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error:");
            sb.append(e);
            C5162b.m25519b("ContactServerTask", sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a A[SYNTHETIC, Splitter:B:34:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0128 A[SYNTHETIC, Splitter:B:40:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x017d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25366e() {
        /*
            r5 = this;
            java.lang.String r0 = "ContactServerTask"
            java.lang.String r1 = "saveInQueue()"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            boolean r0 = r5.f18286j
            if (r0 != 0) goto L_0x0144
            boolean r0 = r5.f18285i
            if (r0 == 0) goto L_0x0144
            java.lang.String r0 = "ContactServerTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "save file: "
            r1.append(r2)
            java.lang.String r2 = r5.f18282f
            r1.append(r2)
            java.lang.String r2 = " at queue: "
            r1.append(r2)
            boolean r2 = r5.f18285i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f1 }
            r1.<init>()     // Catch:{ Exception -> 0x00f1 }
            android.app.Activity r2 = r5.f18284h     // Catch:{ Exception -> 0x00f1 }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x00f1 }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x00f1 }
            r1.append(r2)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r2 = "pollfish_queue"
            r1.append(r2)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f1 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00f1 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00f1 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x00f1 }
            if (r3 != 0) goto L_0x0064
            r2.mkdirs()     // Catch:{ Exception -> 0x00f1 }
        L_0x0064:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f1 }
            r3.<init>()     // Catch:{ Exception -> 0x00f1 }
            r3.append(r1)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r4 = r5.f18282f     // Catch:{ Exception -> 0x00f1 }
            r3.append(r4)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00f1 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r0 = "ContactServerTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r3.<init>()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r4 = "Saving file in queue at path: "
            r3.append(r4)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r3.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r1 = r5.f18282f     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r3.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            org.json.JSONObject r0 = r5.f18281e     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            if (r0 == 0) goto L_0x00d9
            org.json.JSONObject r0 = r5.f18281e     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            if (r0 <= 0) goto L_0x00d9
            org.json.JSONObject r0 = r5.f18281e     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r1 = "serverUrl"
            java.lang.String r3 = r5.f18278b     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            org.json.JSONObject r0 = r5.f18281e     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r1 = "ContactServerTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r3.<init>()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r4 = "jsonParamsString : "
            r3.append(r4)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r3.append(r0)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            com.pollfish.p150f.C5162b.m25518a(r1, r3)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            if (r0 == 0) goto L_0x00d9
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r2.write(r0)     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
        L_0x00d9:
            r2.close()     // Catch:{ Exception -> 0x00ec, all -> 0x00e9 }
            r2.close()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x0144
        L_0x00e0:
            r0 = move-exception
            java.lang.String r1 = "ContactServerTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0116
        L_0x00e9:
            r1 = move-exception
            r0 = r2
            goto L_0x0126
        L_0x00ec:
            r1 = move-exception
            r0 = r2
            goto L_0x00f2
        L_0x00ef:
            r1 = move-exception
            goto L_0x0126
        L_0x00f1:
            r1 = move-exception
        L_0x00f2:
            java.lang.String r2 = "ContactServerTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.lang.String r4 = "Error writing at queue: "
            r3.append(r4)     // Catch:{ all -> 0x00ef }
            r3.append(r1)     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00ef }
            com.pollfish.p150f.C5162b.m25519b(r2, r1)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x0144
            r0.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x0144
        L_0x010e:
            r0 = move-exception
            java.lang.String r1 = "ContactServerTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0116:
            java.lang.String r3 = "Error closing stream at writing at queue: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.pollfish.p150f.C5162b.m25519b(r1, r0)
            goto L_0x0144
        L_0x0126:
            if (r0 == 0) goto L_0x0143
            r0.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x0143
        L_0x012c:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing stream at writing at queue: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ContactServerTask"
            com.pollfish.p150f.C5162b.m25519b(r2, r0)
        L_0x0143:
            throw r1
        L_0x0144:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017f }
            r1.<init>()     // Catch:{ Exception -> 0x017f }
            android.app.Activity r2 = r5.f18284h     // Catch:{ Exception -> 0x017f }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Exception -> 0x017f }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x017f }
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = "pollfish_queue"
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r2 = r5.f18282f     // Catch:{ Exception -> 0x017f }
            r1.append(r2)     // Catch:{ Exception -> 0x017f }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x017f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x017f }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x017f }
            if (r0 == 0) goto L_0x0196
            r0 = 1
            return r0
        L_0x017f:
            r0 = move-exception
            java.lang.String r1 = "ContactServerTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error saveInQueue: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.pollfish.p150f.C5162b.m25519b(r1, r0)
        L_0x0196:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5116e.m25366e():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5110e mo16674a(Void... voidArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Contacting server at url: ");
        sb.append(this.f18278b);
        sb.append(" ...");
        C5162b.m25518a("ContactServerTask", sb.toString());
        try {
            return mo16690b();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doInBackground error: ");
            sb2.append(e);
            C5162b.m25519b("ContactServerTask", sb2.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16676a() {
        super.mo16676a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(C5110e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Returned from contacting server at url: ");
        sb.append(this.f18278b);
        sb.append(" ...");
        C5162b.m25518a("ContactServerTask", sb.toString());
        if (this.f18283g != null) {
            this.f18283g.mo16790a(eVar);
        }
        super.mo16677a((Object) eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0496, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0497, code lost:
        r2 = r0;
        r3 = "ContactServerTask";
        r5 = new java.lang.StringBuilder();
        r6 = "Exception error:";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x04a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x04a4, code lost:
        r2 = r0;
        r5 = new java.lang.StringBuilder();
        r5.append("IOException error:");
        r5.append(r2);
        com.pollfish.p150f.C5162b.m25519b("ContactServerTask", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x04c3, code lost:
        r2 = m25366e();
        r5 = new java.lang.StringBuilder();
        r5.append("sucessfullySavedInQueue: ");
        r5.append(r2);
        com.pollfish.p150f.C5162b.m25518a("ContactServerTask", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x04e5, code lost:
        if (r1.f18278b.contains("/device/register") != false) goto L_0x04e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x04e7, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("serverUrl:");
        r3.append(r1.f18278b);
        com.pollfish.p150f.C5162b.m25518a("ContactServerTask", r3.toString());
        com.pollfish.p150f.C5162b.m25518a("ContactServerTask", "on time out inform to trigger survey not available");
        r4 = new com.pollfish.p145a.C5110e(-1, null, r1.f18278b, false, null, false, false, null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0517, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0518, code lost:
        r2 = r0;
        r3 = "ContactServerTask";
        r5 = new java.lang.StringBuilder();
        r6 = "ClientProtocolException error:";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0522, code lost:
        r5.append(r6);
        r5.append(r2);
        com.pollfish.p150f.C5162b.m25519b(r3, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        r5 = r0;
        r7 = "ContactServerTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8 = new java.lang.StringBuilder();
        r8.append("Error while converting opt_out param: ");
        r8.append(r5);
        com.pollfish.p150f.C5162b.m25519b(r7, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        r5 = r0;
        r7 = "ContactServerTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8 = new java.lang.StringBuilder();
        r8.append("Error while converting survey id: ");
        r8.append(r5);
        com.pollfish.p150f.C5162b.m25519b(r7, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x016d, code lost:
        r5 = r0;
        r7 = "ContactServerTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("timestamp error: ");
        r9.append(r5);
        com.pollfish.p150f.C5162b.m25519b(r7, r9.toString());
        r1.f18282f = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x019a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x019b, code lost:
        r5 = r0;
        r7 = "ContactServerTask";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("encryption error: ");
        r9.append(r5);
        com.pollfish.p150f.C5162b.m25519b(r7, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01b6, code lost:
        r5 = r0;
        r9 = new java.lang.StringBuilder();
        r9.append("encryption SignatureException: ");
        r9.append(r5);
        com.pollfish.p150f.C5162b.m25519b("ContactServerTask", r9.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x04a3 A[ExcHandler: IOException (r0v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0517 A[ExcHandler: ClientProtocolException (r0v0 'e' org.apache.http.client.ClientProtocolException A[CUSTOM_DECLARE]), Splitter:B:1:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01dd A[Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020f A[Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x037c A[Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0412 A[Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.pollfish.p145a.C5110e mo16690b() {
        /*
            r18 = this;
            r1 = r18
            org.apache.http.params.BasicHttpParams r2 = new org.apache.http.params.BasicHttpParams
            r2.<init>()
            r3 = 6000(0x1770, float:8.408E-42)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r2, r3)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r2, r3)
            org.apache.http.impl.client.DefaultHttpClient r3 = new org.apache.http.impl.client.DefaultHttpClient
            r3.<init>(r2)
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost
            java.lang.String r4 = r1.f18278b
            r2.<init>(r4)
            r4 = 0
            boolean r5 = r1.f18286j     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r6 = 0
            if (r5 != 0) goto L_0x02d0
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 != 0) goto L_0x002c
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r1.f18281e = r5     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x002c:
            java.lang.String r5 = "ContactServerTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "jsonParams before google play .getAdvertising_id(): "
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16620J()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "api_key"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16623a()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "device_id"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16620J()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.Boolean r5 = r5.mo16621K()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x0094
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ Exception -> 0x007c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r7 = "opt_out"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ Exception -> 0x007c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.Boolean r8 = r8.mo16621K()     // Catch:{ Exception -> 0x007c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x007c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            r5.put(r7, r8)     // Catch:{ Exception -> 0x007c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            goto L_0x0094
        L_0x007c:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = "Error while converting opt_out param: "
            r8.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x0094:
            int r5 = r1.f18279c     // Catch:{ Exception -> 0x00a6, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            if (r5 < 0) goto L_0x00be
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ Exception -> 0x00a6, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r7 = "survey_id"
            int r8 = r1.f18279c     // Catch:{ Exception -> 0x00a6, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00a6, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            r5.put(r7, r8)     // Catch:{ Exception -> 0x00a6, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            goto L_0x00be
        L_0x00a6:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = "Error while converting survey id: "
            r8.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x00be:
            java.lang.String r5 = r1.f18280d     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x0100
            java.lang.String r5 = "ContactServerTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "request_uuid: "
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r1.f18280d     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ Exception -> 0x00e8, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r7 = "request_uuid"
            java.lang.String r8 = r1.f18280d     // Catch:{ Exception -> 0x00e8, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00e8, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            r5.put(r7, r8)     // Catch:{ Exception -> 0x00e8, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            goto L_0x0100
        L_0x00e8:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = "Error while converting request_uuid: "
            r8.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x0100:
            java.lang.String r5 = "ContactServerTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "survey_id: "
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            int r8 = r1.f18279c     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "version"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16628c()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "debug"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16611A()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "google_play"
            r8 = 1
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "ContactServerTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = "jsonParams before google play: "
            r7.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r9 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = r9.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "add timestamp and encryption to request"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x016c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            r1.f18282f = r5     // Catch:{ Exception -> 0x016c, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            goto L_0x0188
        L_0x016c:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = "timestamp error: "
            r9.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r9.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = ""
            r1.f18282f = r5     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x0188:
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "timestamp"
            java.lang.String r9 = r1.f18282f     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r1.f18282f     // Catch:{ SignatureException -> 0x01b5, Exception -> 0x019a, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            java.lang.String r7 = "skasdh*h3jkas^7938UbnJGshas72123"
            java.lang.String r5 = com.pollfish.p150f.C5166c.m25532a(r5, r7)     // Catch:{ SignatureException -> 0x01b5, Exception -> 0x019a, ClientProtocolException -> 0x0517, IOException -> 0x04a3 }
            goto L_0x01ce
        L_0x019a:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = "encryption error: "
            r9.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r9.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x01b2:
            java.lang.String r5 = ""
            goto L_0x01ce
        L_0x01b5:
            r0 = move-exception
            r5 = r0
            java.lang.String r7 = "ContactServerTask"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = "encryption SignatureException: "
            r9.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r9.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r9.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25519b(r7, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            goto L_0x01b2
        L_0x01ce:
            org.json.JSONObject r7 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = "encryption"
            java.lang.String r5 = r5.toUpperCase()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.put(r9, r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.b r5 = r1.f18287k     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x01f7
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "response_type"
            com.pollfish.a.b r9 = r1.f18287k     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = r9.mo16597c()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "s_id"
            com.pollfish.a.b r9 = r1.f18287k     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = r9.mo16595b()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x01f7:
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x02d0
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            int r5 = r5.length()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7 = 4
            if (r5 != r7) goto L_0x02d0
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "adding user consent data"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x02d0
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            boolean r5 = com.pollfish.p150f.C5166c.m25539a(r5, r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x023e
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "adding wifi"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            android.app.Activity r7 = r1.f18284h     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = com.pollfish.p150f.C5166c.m25557n(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.mo16627b(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r5.mo16615E()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x023e
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "wifis"
            com.pollfish.a.c r9 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = r9.mo16615E()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x023e:
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            boolean r5 = com.pollfish.p150f.C5166c.m25539a(r5, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x026d
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "adding applications"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            android.app.Activity r7 = r1.f18284h     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = com.pollfish.p150f.C5166c.m25556m(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.mo16625a(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r5.mo16639l()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x026d
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "applications"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16639l()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x026d:
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7 = 2
            boolean r5 = com.pollfish.p150f.C5166c.m25539a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x029d
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "adding imei"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            android.app.Activity r7 = r1.f18284h     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = com.pollfish.p150f.C5166c.m25561r(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.mo16629c(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r5.mo16617G()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x029d
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "imei"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16617G()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x029d:
            java.lang.String r5 = r1.f18288l     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7 = 3
            boolean r5 = com.pollfish.p150f.C5166c.m25539a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x02d0
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r7 = "adding mac"
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r5.mo16626b()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 == 0) goto L_0x02d0
            com.pollfish.a.c r5 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = r5.mo16626b()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "noMac"
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r5 != 0) goto L_0x02d0
            org.json.JSONObject r5 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "mac"
            com.pollfish.a.c r8 = r1.f18277a     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.mo16626b()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.put(r7, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x02d0:
            java.lang.String r5 = "ContactServerTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "jsonParams.toString():"
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.json.JSONObject r8 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.append(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = r7.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r5, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.message.BasicNameValuePair r7 = new org.apache.http.message.BasicNameValuePair     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "dontencrypt"
            java.lang.String r9 = "true"
            r7.<init>(r8, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.add(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.message.BasicNameValuePair r7 = new org.apache.http.message.BasicNameValuePair     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "json"
            org.json.JSONObject r9 = r1.f18281e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r9 = r9.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>(r8, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.add(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.client.entity.UrlEncodedFormEntity r7 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r7.<init>(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r2.setEntity(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = ""
            java.lang.String r7 = ""
            java.lang.String r8 = "ContactServerTask"
            java.lang.String r9 = "Execute HTTP Post Request"
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.HttpResponse r2 = r3.execute(r2)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r3 = "ContactServerTask"
            java.lang.String r8 = "waiting response.."
            com.pollfish.p150f.C5162b.m25518a(r3, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.StatusLine r3 = r2.getStatusLine()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            int r9 = r3.getStatusCode()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = "responseStatus: "
            r8.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.append(r9)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r3, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = "serverUrl: "
            r8.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r10 = r1.f18278b     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r8.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = r8.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r3, r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r9 == r3) goto L_0x0369
            r3 = 204(0xcc, float:2.86E-43)
            if (r9 != r3) goto L_0x03fb
        L_0x0369:
            java.lang.String r3 = r1.f18278b     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r8 = "/device/register"
            boolean r3 = r3.contains(r8)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r3 == 0) goto L_0x03fb
            org.apache.http.Header[] r3 = r2.getAllHeaders()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            int r8 = r3.length     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r10 = r7
            r7 = 0
        L_0x037a:
            if (r6 >= r8) goto L_0x03f7
            r11 = r3[r6]     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r12 = "ContactServerTask"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r13.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r14 = "Key : "
            r13.append(r14)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r14 = r11.getName()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r13.append(r14)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r14 = " ,Value : "
            r13.append(r14)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r14 = r11.getValue()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r13.append(r14)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = r13.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r12, r13)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r12 = r11.getName()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = "has_accepted_terms"
            boolean r12 = r12.equalsIgnoreCase(r13)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r12 == 0) goto L_0x03ce
            java.lang.String r7 = r11.getValue()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            boolean r7 = java.lang.Boolean.parseBoolean(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r12 = "ContactServerTask"
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r13.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r14 = "hasAccepted : "
            r13.append(r14)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r13.append(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = r13.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r12, r13)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x03ce:
            java.lang.String r12 = r11.getName()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = "allow_data"
            boolean r12 = r12.equalsIgnoreCase(r13)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r12 == 0) goto L_0x03f4
            java.lang.String r10 = r11.getValue()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r11 = "ContactServerTask"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r12.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = "allowedData : "
            r12.append(r13)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r12.append(r10)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r12 = r12.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r11, r12)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x03f4:
            int r6 = r6 + 1
            goto L_0x037a
        L_0x03f7:
            r15 = r7
            r16 = r10
            goto L_0x03fe
        L_0x03fb:
            r16 = r7
            r15 = 0
        L_0x03fe:
            java.lang.String r3 = "ContactServerTask"
            java.lang.String r6 = "before httpResponse.getEntity()"
            com.pollfish.p150f.C5162b.m25518a(r3, r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            org.apache.http.HttpEntity r3 = r2.getEntity()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r6 = "ContactServerTask"
            java.lang.String r7 = "httpResponse.getEntity()"
            com.pollfish.p150f.C5162b.m25518a(r6, r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r3 == 0) goto L_0x045c
            java.io.InputStream r3 = r3.getContent()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r6 = "responseEntity.getContent()"
            com.pollfish.p150f.C5162b.m25518a(r5, r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "Content-Encoding"
            org.apache.http.Header r2 = r2.getFirstHeader(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "ContactServerTask"
            java.lang.String r6 = "getFirstHeader"
            com.pollfish.p150f.C5162b.m25518a(r5, r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r2 == 0) goto L_0x043e
            java.lang.String r2 = r2.getValue()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r5 = "gzip"
            boolean r2 = r2.equalsIgnoreCase(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r2 == 0) goto L_0x043e
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r2.<init>(r3)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            goto L_0x043f
        L_0x043e:
            r2 = r3
        L_0x043f:
            java.lang.String r5 = r1.m25364a(r2)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r6.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r7 = "responseString: "
            r6.append(r7)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r6.append(r5)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r6 = r6.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r3, r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r2.close()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x045c:
            r10 = r5
            r2 = 500(0x1f4, float:7.0E-43)
            if (r9 != r2) goto L_0x0483
            boolean r2 = r1.f18285i     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r2 == 0) goto L_0x0483
            boolean r2 = r1.f18286j     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            if (r2 != 0) goto L_0x0483
            boolean r2 = r18.m25366e()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.<init>()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r6 = "sucessfullySavedInQueue: "
            r5.append(r6)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r5.append(r2)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r2 = r5.toString()     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            com.pollfish.p150f.C5162b.m25518a(r3, r2)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
        L_0x0483:
            com.pollfish.a.e r2 = new com.pollfish.a.e     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r11 = r1.f18278b     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            boolean r12 = r1.f18285i     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            java.lang.String r13 = r1.f18282f     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            boolean r14 = r1.f18286j     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r17 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ ClientProtocolException -> 0x0517, IOException -> 0x04a3, Exception -> 0x0496 }
            r4 = r2
            goto L_0x052f
        L_0x0496:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception error:"
            goto L_0x0522
        L_0x04a3:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "IOException error:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.pollfish.p150f.C5162b.m25519b(r3, r2)
            boolean r2 = r1.f18285i
            if (r2 == 0) goto L_0x04dd
            boolean r2 = r1.f18286j
            if (r2 != 0) goto L_0x04dd
            boolean r2 = r18.m25366e()
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sucessfullySavedInQueue: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.pollfish.p150f.C5162b.m25518a(r3, r2)
        L_0x04dd:
            java.lang.String r2 = r1.f18278b
            java.lang.String r3 = "/device/register"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x052f
            java.lang.String r2 = "ContactServerTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "serverUrl:"
            r3.append(r4)
            java.lang.String r4 = r1.f18278b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.pollfish.p150f.C5162b.m25518a(r2, r3)
            java.lang.String r2 = "ContactServerTask"
            java.lang.String r3 = "on time out inform to trigger survey not available"
            com.pollfish.p150f.C5162b.m25518a(r2, r3)
            com.pollfish.a.e r2 = new com.pollfish.a.e
            r5 = -1
            r6 = 0
            java.lang.String r7 = r1.f18278b
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x052f
        L_0x0517:
            r0 = move-exception
            r2 = r0
            java.lang.String r3 = "ContactServerTask"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ClientProtocolException error:"
        L_0x0522:
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.pollfish.p150f.C5162b.m25519b(r3, r2)
        L_0x052f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5116e.mo16690b():com.pollfish.a.e");
    }
}
