package com.pollfish.p147c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.p145a.C5109d;
import com.pollfish.p150f.C5162b;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.f */
public class C5117f extends C5119h {

    /* renamed from: a */
    private C5109d f18289a;

    /* renamed from: b */
    private Activity f18290b;

    /* renamed from: c */
    private String f18291c;

    /* renamed from: d */
    private String f18292d;

    /* renamed from: e */
    private C5176b f18293e;

    public C5117f(C5109d dVar, Activity activity, C5176b bVar) {
        this.f18289a = dVar;
        this.f18290b = activity;
        this.f18293e = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getCacheDir().getAbsolutePath());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("pollfish_cache");
        sb.append(dVar.mo16654a());
        this.f18291c = sb.toString();
        try {
            this.f18292d = this.f18291c.substring(this.f18291c.lastIndexOf(TableOfContents.DEFAULT_PATH_SEPARATOR) + 1, this.f18291c.length());
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error retrieving file parent and name: ");
            sb2.append(this.f18292d);
            C5162b.m25519b("DownloadAssetTask", sb2.toString());
        }
    }

    /* renamed from: a */
    private boolean m25373a(Context context, Bitmap bitmap, String str) {
        if (bitmap != null) {
            try {
                return m25374a(bitmap, str);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bitmap not loaded: ");
                sb.append(e);
                C5162b.m25519b("DownloadAssetTask", sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bitmap = null for path: ");
            sb2.append(str);
            C5162b.m25518a("DownloadAssetTask", sb2.toString());
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[Catch:{ Exception -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25374a(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            r2 = 100
            r4.compress(r1, r2, r5)     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            r5.flush()     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x0022, IOException -> 0x0019 }
            r4 = 1
            return r4
        L_0x0019:
            r4 = move-exception
            java.lang.String r5 = "DownloadAssetTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x002a
        L_0x0022:
            r4 = move-exception
            java.lang.String r5 = "DownloadAssetTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x002a:
            java.lang.String r2 = "writeToCacheFromBitmap error: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r5, r4)
            boolean r4 = r0.exists()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x005a
            r0.delete()     // Catch:{ Exception -> 0x0043 }
            goto L_0x005a
        L_0x0043:
            r4 = move-exception
            java.lang.String r5 = "DownloadAssetTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "writeToCacheFromBitmap error: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.pollfish.p150f.C5162b.m25519b(r5, r4)
        L_0x005a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p147c.C5117f.m25374a(android.graphics.Bitmap, java.lang.String):boolean");
    }

    /* renamed from: a */
    private boolean m25375a(InputStream inputStream, File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[256];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    return file.exists();
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("writeToMemoryFromInputStream error: ");
            sb.append(e);
            C5162b.m25519b("DownloadAssetTask", sb.toString());
            try {
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("writeToMemoryFromInputStream error: ");
                sb2.append(e);
                C5162b.m25519b("DownloadAssetTask", sb2.toString());
            }
            return false;
        }
    }

    /* renamed from: a */
    private boolean m25376a(String str) {
        StringBuilder sb;
        String str2;
        boolean a;
        boolean z = false;
        try {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.setConnectTimeout(5000);
            openConnection.setReadTimeout(5000);
            openConnection.connect();
            InputStream inputStream = openConnection.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
            if (this.f18289a.mo16658e() == 1) {
                a = m25373a(this.f18290b, BitmapFactory.decodeStream(bufferedInputStream), this.f18291c);
            } else {
                a = m25375a(inputStream, new File(this.f18291c));
            }
            z = a;
            bufferedInputStream.close();
            inputStream.close();
        } catch (IOException e) {
            e = e;
            str2 = "DownloadAssetTask";
            sb = new StringBuilder();
            sb.append("Error getting the ASSET from server: ");
            sb.append(e);
            C5162b.m25519b(str2, sb.toString());
            return z;
        } catch (Exception e2) {
            e = e2;
            str2 = "DownloadAssetTask";
            sb = new StringBuilder();
            sb.append("Error getting the ASSET from server: ");
            sb.append(e);
            C5162b.m25519b(str2, sb.toString());
            return z;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo16674a(Void... voidArr) {
        boolean z;
        boolean exists = new File(this.f18291c).exists();
        StringBuilder sb = new StringBuilder();
        sb.append("file: ");
        sb.append(this.f18292d);
        sb.append(" exists in cache: ");
        sb.append(exists);
        C5162b.m25518a("DownloadAssetTask", sb.toString());
        if (!exists) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Downloading file: ");
            sb2.append(this.f18292d);
            C5162b.m25518a("DownloadAssetTask", sb2.toString());
            z = m25376a(this.f18289a.mo16657d());
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("Downloading file with name: ");
        sb.append(this.f18292d);
        sb.append(" with sucess: ");
        sb.append(bool);
        C5162b.m25518a("DownloadAssetTask", sb.toString());
        if (bool.booleanValue()) {
            this.f18293e.mo16783a(this.f18289a.mo16654a());
        }
        this.f18293e.mo16780a();
    }
}
