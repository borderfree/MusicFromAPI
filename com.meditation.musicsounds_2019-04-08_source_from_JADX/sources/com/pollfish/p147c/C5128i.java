package com.pollfish.p147c;

import android.app.Activity;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.p145a.C5109d;
import com.pollfish.p150f.C5162b;
import java.io.File;
import java.util.ArrayList;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.i */
public class C5128i extends C5119h {

    /* renamed from: a */
    private Activity f18316a;

    /* renamed from: b */
    private C5176b f18317b;

    public C5128i(C5176b bVar, Activity activity) {
        this.f18317b = bVar;
        this.f18316a = activity;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x017c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x017d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0188, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0189, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0188 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x000a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList mo16674a(java.lang.Void... r11) {
        /*
            r10 = this;
            java.lang.String r11 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r0 = "trying to read poll_resources.json file..."
            com.pollfish.p150f.C5162b.m25518a(r11, r0)
            r11 = 0
            java.lang.Class<com.pollfish.main.PollFish> r0 = com.pollfish.main.PollFish.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r1 = "html/poll_resources"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r2 = "poll_res inputStream == null"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            android.app.Activity r1 = r10.f18316a     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r2 = "poll_resources"
            java.lang.String r3 = "raw"
            android.app.Activity r4 = r10.f18316a     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            int r1 = r1.getIdentifier(r2, r3, r4)     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            r3.<init>()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r4 = "getBitmap context.getPackageName(): "
            r3.append(r4)     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            android.app.Activity r4 = r10.f18316a     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            r3.append(r4)     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            android.app.Activity r2 = r10.f18316a     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            java.io.InputStream r1 = r2.openRawResource(r1)     // Catch:{ Exception -> 0x0059, IOException -> 0x0188 }
            r0 = r1
            goto L_0x0060
        L_0x0059:
            java.lang.String r1 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r2 = "activity.getResources().openRawResource(R.raw.poll_resources"
            com.pollfish.p150f.C5162b.m25519b(r1, r2)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
        L_0x0060:
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r1 = "poll_res inputStream == null after get from raw"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            android.app.Activity r0 = r10.f18316a     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r1 = "html/poll_resources"
            java.io.InputStream r0 = r0.open(r1)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            if (r0 != 0) goto L_0x0082
            java.lang.String r1 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r2 = "inputStream == null after getAssets"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
        L_0x0082:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r1.<init>()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
        L_0x0087:
            int r2 = r0.read()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r3 = -1
            if (r2 == r3) goto L_0x0092
            r1.write(r2)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            goto L_0x0087
        L_0x0092:
            r0.close()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            if (r0 != 0) goto L_0x009c
            return r11
        L_0x009c:
            com.pollfish.b.a r1 = new com.pollfish.b.a     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r1.<init>()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r0 = r1.mo16667a(r0)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r1 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r2.<init>()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r3 = "decrypted: "
            r2.append(r3)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r2.append(r0)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            r1.<init>()     // Catch:{ IOException -> 0x0188, Exception -> 0x017c }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r0 = 0
        L_0x00c6:
            int r2 = r11.length()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            if (r0 >= r2) goto L_0x01a0
            org.json.JSONObject r2 = r11.getJSONObject(r0)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = "cache_path"
            java.lang.String r5 = r2.getString(r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = "project_path"
            java.lang.String r6 = r2.getString(r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = "raw_path"
            java.lang.String r7 = r2.getString(r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = "url_path"
            java.lang.String r8 = r2.getString(r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = "file_type"
            int r9 = r2.getInt(r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r2 = "./"
            boolean r2 = r5.startsWith(r2)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r2 = "./"
            java.lang.String r3 = "/"
            r5.replaceFirst(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
        L_0x00fd:
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.<init>()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r4 = "ReadAssetsJsonAndWriteCacheTask: attributeCachePath:"
            r3.append(r4)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.append(r5)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.<init>()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r4 = "ReadAssetsJsonAndWriteCacheTask: attributeProjectPath:"
            r3.append(r4)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.append(r6)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.<init>()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r4 = "ReadAssetsJsonAndWriteCacheTask: attributeRawPath:"
            r3.append(r4)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.append(r7)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.<init>()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r4 = "ReadAssetsJsonAndWriteCacheTask: attributeType:"
            r3.append(r4)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.append(r9)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r2 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.<init>()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r4 = "ReadAssetsJsonAndWriteCacheTask: attributeType:"
            r3.append(r4)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r3.append(r9)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            com.pollfish.a.d r2 = new com.pollfish.a.d     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            r1.add(r2)     // Catch:{ IOException -> 0x017a, Exception -> 0x0178 }
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x0178:
            r0 = move-exception
            goto L_0x017e
        L_0x017a:
            r0 = move-exception
            goto L_0x018a
        L_0x017c:
            r0 = move-exception
            r1 = r11
        L_0x017e:
            java.lang.String r11 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while reading resources_html file...: "
            goto L_0x0193
        L_0x0188:
            r0 = move-exception
            r1 = r11
        L_0x018a:
            java.lang.String r11 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while reading resources_html file - io...: "
        L_0x0193:
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.pollfish.p150f.C5162b.m25519b(r11, r0)
        L_0x01a0:
            java.lang.String r11 = "ReadAssetsJsonAndWriteCacheTask"
            java.lang.String r0 = "finished reading resources_html file..."
            com.pollfish.p150f.C5162b.m25518a(r11, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5128i.mo16674a(java.lang.Void[]):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16676a() {
        super.mo16676a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(ArrayList arrayList) {
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Num of asset files to copy in internal cache: ");
            sb.append(arrayList.size());
            C5162b.m25518a("ReadAssetsJsonAndWriteCacheTask", sb.toString());
            try {
                this.f18317b.mo16781a(arrayList.size());
                C5162b.m25518a("ReadAssetsJsonAndWriteCacheTask", "Creating internal cache paths..");
                for (int i = 0; i < arrayList.size(); i++) {
                    C5109d dVar = (C5109d) arrayList.get(i);
                    if (dVar != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f18316a.getApplicationContext().getCacheDir().getAbsolutePath());
                        sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                        sb2.append("pollfish_cache");
                        sb2.append(dVar.mo16654a());
                        File file = new File(sb2.toString());
                        if (!file.exists()) {
                            File parentFile = file.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                                if (parentFile.isDirectory()) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Creating directory: ");
                                    sb3.append(parentFile.getAbsolutePath());
                                    C5162b.m25518a("ReadAssetsJsonAndWriteCacheTask", sb3.toString());
                                }
                            }
                            new C5129j(dVar, this.f18317b, this.f18316a).execute(new Void[0]);
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("file: ");
                            sb4.append(file.getAbsolutePath());
                            sb4.append(" already exists in cache!");
                            C5162b.m25518a("ReadAssetsJsonAndWriteCacheTask", sb4.toString());
                            this.f18317b.mo16780a();
                        }
                    }
                }
            } catch (Exception e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ReadAssetsJsonTask error while executing resource objects: ");
                sb5.append(e);
                C5162b.m25519b("ReadAssetsJsonAndWriteCacheTask", sb5.toString());
            }
        }
        super.mo16677a((Object) arrayList);
    }
}
