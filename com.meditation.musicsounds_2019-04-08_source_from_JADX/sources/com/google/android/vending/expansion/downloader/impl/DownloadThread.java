package com.google.android.vending.expansion.downloader.impl;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.vending.expansion.downloader.C4831d;
import com.google.android.vending.expansion.downloader.impl.DownloaderService.GenerateSaveFileError;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class DownloadThread {

    /* renamed from: a */
    private Context f17388a;

    /* renamed from: b */
    private C4849d f17389b;

    /* renamed from: c */
    private DownloaderService f17390c;

    /* renamed from: d */
    private final C4852f f17391d;

    /* renamed from: e */
    private final C4850e f17392e;

    /* renamed from: f */
    private String f17393f;

    private class RetryDownload extends Throwable {
        private static final long serialVersionUID = 6196036036517540229L;

        private RetryDownload() {
        }
    }

    private class StopRequest extends Throwable {
        private static final long serialVersionUID = 6338592678988347973L;
        public int mFinalStatus;

        public StopRequest(int i, String str) {
            super(str);
            this.mFinalStatus = i;
        }

        public StopRequest(int i, String str, Throwable th) {
            super(str, th);
            this.mFinalStatus = i;
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.DownloadThread$a */
    private static class C4836a {

        /* renamed from: a */
        public int f17394a;

        /* renamed from: b */
        public int f17395b;

        /* renamed from: c */
        public String f17396c;

        /* renamed from: d */
        public boolean f17397d;

        /* renamed from: e */
        public String f17398e;

        /* renamed from: f */
        public String f17399f;

        /* renamed from: g */
        public String f17400g;

        /* renamed from: h */
        public int f17401h;

        /* renamed from: i */
        public long f17402i;

        private C4836a() {
            this.f17394a = 0;
            this.f17395b = 0;
            this.f17397d = false;
            this.f17401h = 0;
            this.f17402i = 0;
        }
    }

    /* renamed from: com.google.android.vending.expansion.downloader.impl.DownloadThread$b */
    private static class C4837b {

        /* renamed from: a */
        public String f17403a;

        /* renamed from: b */
        public FileOutputStream f17404b;

        /* renamed from: c */
        public boolean f17405c = false;

        /* renamed from: d */
        public int f17406d = 0;

        /* renamed from: e */
        public int f17407e = 0;

        /* renamed from: f */
        public String f17408f;

        /* renamed from: g */
        public boolean f17409g = false;

        /* renamed from: h */
        public String f17410h;

        public C4837b(C4849d dVar, DownloaderService downloaderService) {
            this.f17407e = dVar.f17469l;
            this.f17410h = dVar.f17458a;
            this.f17403a = downloaderService.mo15978a(dVar.f17460c);
        }
    }

    public DownloadThread(C4849d dVar, DownloaderService downloaderService, C4850e eVar) {
        this.f17388a = downloaderService;
        this.f17389b = dVar;
        this.f17390c = downloaderService;
        this.f17392e = eVar;
        this.f17391d = C4852f.m24274a((Context) downloaderService);
        StringBuilder sb = new StringBuilder();
        sb.append("APKXDL (Linux; U; Android ");
        sb.append(VERSION.RELEASE);
        sb.append(";");
        sb.append(Locale.getDefault().toString());
        sb.append("; ");
        sb.append(Build.DEVICE);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(Build.ID);
        sb.append(")");
        sb.append(downloaderService.getPackageName());
        this.f17393f = sb.toString();
    }

    /* renamed from: a */
    private InputStream m24172a(C4837b bVar, HttpResponse httpResponse) {
        try {
            return httpResponse.getEntity().getContent();
        } catch (IOException e) {
            m24194c();
            int f = m24201f(bVar);
            StringBuilder sb = new StringBuilder();
            sb.append("while getting entity: ");
            sb.append(e.toString());
            throw new StopRequest(f, sb.toString(), e);
        }
    }

    /* renamed from: a */
    private void m24173a(int i, boolean z, int i2, int i3, boolean z2, String str) {
        m24189b(i, z, i2, i3, z2, str);
        DownloaderService.m24217c(i);
    }

    /* renamed from: a */
    private void m24174a(C4836a aVar, HttpGet httpGet) {
        if (aVar.f17397d) {
            if (aVar.f17396c != null) {
                httpGet.addHeader("If-Match", aVar.f17396c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(aVar.f17394a);
            sb.append("-");
            httpGet.addHeader("Range", sb.toString());
        }
    }

    /* renamed from: a */
    private void m24175a(C4837b bVar) {
        switch (this.f17390c.mo15977a(this.f17391d)) {
            case 1:
                return;
            case 2:
                throw new StopRequest(195, "waiting for network to return");
            case 3:
                throw new StopRequest(197, "waiting for wifi");
            case 5:
                throw new StopRequest(195, "roaming is not allowed");
            case 6:
                throw new StopRequest(196, "waiting for wifi or for download over cellular to be authorized");
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m24176a(C4837b bVar, int i) {
        m24198d(bVar);
        if (bVar.f17403a != null && DownloaderService.m24216b(i)) {
            new File(bVar.f17403a).delete();
            bVar.f17403a = null;
        }
    }

    /* renamed from: a */
    private void m24177a(C4837b bVar, C4836a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (aVar.f17394a - aVar.f17401h > 4096 && currentTimeMillis - aVar.f17402i > 1000) {
            this.f17389b.f17463f = (long) aVar.f17394a;
            this.f17391d.mo16040b(this.f17389b);
            aVar.f17401h = aVar.f17394a;
            aVar.f17402i = currentTimeMillis;
            this.f17390c.mo15980a(((long) aVar.f17395b) + this.f17390c.f17412a);
        }
    }

    /* renamed from: a */
    private void m24178a(C4837b bVar, C4836a aVar, int i) {
        int i2 = !DownloaderService.m24216b(i) ? (i < 300 || i >= 400) ? (!aVar.f17397d || i != 200) ? 494 : 489 : 493 : i;
        StringBuilder sb = new StringBuilder();
        sb.append("http error ");
        sb.append(i);
        throw new StopRequest(i2, sb.toString());
    }

    /* renamed from: a */
    private void m24179a(C4837b bVar, C4836a aVar, HttpResponse httpResponse) {
        if (!aVar.f17397d) {
            m24192b(bVar, aVar, httpResponse);
            try {
                bVar.f17403a = this.f17390c.mo15979a(this.f17389b.f17460c, this.f17389b.f17462e);
                try {
                    bVar.f17404b = new FileOutputStream(bVar.f17403a);
                } catch (FileNotFoundException e) {
                    try {
                        if (new File(C4831d.m24154a((Context) this.f17390c)).mkdirs()) {
                            bVar.f17404b = new FileOutputStream(bVar.f17403a);
                        }
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("while opening destination file: ");
                        sb.append(e.toString());
                        throw new StopRequest(492, sb.toString(), e);
                    }
                }
                m24196c(bVar, aVar);
                m24175a(bVar);
            } catch (GenerateSaveFileError e2) {
                throw new StopRequest(e2.mStatus, e2.mMessage);
            }
        }
    }

    /* renamed from: a */
    private void m24180a(C4837b bVar, C4836a aVar, byte[] bArr, InputStream inputStream) {
        while (true) {
            int b = m24186b(bVar, aVar, bArr, inputStream);
            if (b == -1) {
                m24191b(bVar, aVar);
                return;
            }
            bVar.f17409g = true;
            m24183a(bVar, bArr, b);
            aVar.f17394a += b;
            aVar.f17395b += b;
            m24177a(bVar, aVar);
            m24200e(bVar);
        }
    }

    /* renamed from: a */
    private void m24181a(C4837b bVar, C4841a aVar, HttpGet httpGet) {
        C4836a aVar2 = new C4836a();
        byte[] bArr = new byte[4096];
        m24200e(bVar);
        m24199d(bVar, aVar2);
        m24174a(aVar2, httpGet);
        m24175a(bVar);
        this.f17392e.mo15959a(3);
        HttpResponse b = m24188b(bVar, aVar, httpGet);
        m24197c(bVar, aVar2, b);
        m24179a(bVar, aVar2, b);
        InputStream a = m24172a(bVar, b);
        this.f17392e.mo15959a(4);
        m24180a(bVar, aVar2, bArr, a);
    }

    /* renamed from: a */
    private void m24182a(C4837b bVar, HttpResponse httpResponse, int i) {
        if (bVar.f17407e < 5) {
            Header firstHeader = httpResponse.getFirstHeader("Location");
            if (firstHeader != null) {
                try {
                    String uri = new URI(this.f17389b.f17458a).resolve(new URI(firstHeader.getValue())).toString();
                    bVar.f17407e++;
                    bVar.f17410h = uri;
                    if (i == 301 || i == 303) {
                        bVar.f17408f = uri;
                    }
                    throw new RetryDownload();
                } catch (URISyntaxException unused) {
                    throw new StopRequest(495, "Couldn't resolve redirect URI");
                }
            }
        } else {
            throw new StopRequest(497, "too many redirects");
        }
    }

    /* renamed from: a */
    private void m24183a(C4837b bVar, byte[] bArr, int i) {
        try {
            if (bVar.f17404b == null) {
                bVar.f17404b = new FileOutputStream(bVar.f17403a, true);
            }
            bVar.f17404b.write(bArr, 0, i);
            m24198d(bVar);
        } catch (IOException e) {
            if (!C4831d.m24156a()) {
                throw new StopRequest(499, "external media not mounted while writing destination file");
            } else if (C4831d.m24150a(C4831d.m24151a(bVar.f17403a)) < ((long) i)) {
                throw new StopRequest(498, "insufficient space while writing destination file", e);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("while writing destination file: ");
                sb.append(e.toString());
                throw new StopRequest(492, sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    private boolean m24184a(C4836a aVar) {
        return aVar.f17394a > 0 && aVar.f17396c == null;
    }

    /* renamed from: a */
    private static final boolean m24185a(String str) {
        if (str == null) {
            return false;
        }
        try {
            String host = URI.create(str).getHost();
            if (host != null && (host.equalsIgnoreCase("localhost") || host.equals("127.0.0.1") || host.equals("[::1]"))) {
                return true;
            }
        } catch (IllegalArgumentException unused) {
        }
        return false;
    }

    /* renamed from: b */
    private int m24186b(C4837b bVar, C4836a aVar, byte[] bArr, InputStream inputStream) {
        try {
            return inputStream.read(bArr);
        } catch (IOException e) {
            m24194c();
            this.f17389b.f17463f = (long) aVar.f17394a;
            this.f17391d.mo16043c(this.f17389b);
            if (m24184a(aVar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("while reading response: ");
                sb.append(e.toString());
                sb.append(", can't resume interrupted download with no ETag");
                throw new StopRequest(489, sb.toString(), e);
            }
            int f = m24201f(bVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("while reading response: ");
            sb2.append(e.toString());
            throw new StopRequest(f, sb2.toString(), e);
        }
    }

    /* renamed from: b */
    private String m24187b() {
        return this.f17393f;
    }

    /* renamed from: b */
    private HttpResponse m24188b(C4837b bVar, C4841a aVar, HttpGet httpGet) {
        try {
            return aVar.execute(httpGet);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("while trying to execute request: ");
            sb.append(e.toString());
            throw new StopRequest(495, sb.toString(), e);
        } catch (IOException e2) {
            m24194c();
            int f = m24201f(bVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("while trying to execute request: ");
            sb2.append(e2.toString());
            throw new StopRequest(f, sb2.toString(), e2);
        }
    }

    /* renamed from: b */
    private void m24189b(int i, boolean z, int i2, int i3, boolean z2, String str) {
        this.f17389b.f17465h = i;
        this.f17389b.f17468k = i2;
        this.f17389b.f17469l = i3;
        this.f17389b.f17464g = System.currentTimeMillis();
        if (!z) {
            this.f17389b.f17467j = 0;
        } else if (z2) {
            this.f17389b.f17467j = 1;
        } else {
            this.f17389b.f17467j++;
        }
        this.f17391d.mo16043c(this.f17389b);
    }

    /* renamed from: b */
    private void m24190b(C4837b bVar) {
        m24195c(bVar);
        String str = bVar.f17403a;
        String a = C4831d.m24155a((Context) this.f17390c, this.f17389b.f17460c);
        if (!bVar.f17403a.equals(a)) {
            File file = new File(str);
            File file2 = new File(a);
            if (this.f17389b.f17462e == -1 || this.f17389b.f17463f != this.f17389b.f17462e) {
                throw new StopRequest(487, "file delivered with incorrect size. probably due to network not browser configured");
            } else if (!file.renameTo(file2)) {
                throw new StopRequest(492, "unable to finalize destination file");
            }
        }
    }

    /* renamed from: b */
    private void m24191b(C4837b bVar, C4836a aVar) {
        this.f17389b.f17463f = (long) aVar.f17394a;
        this.f17391d.mo16043c(this.f17389b);
        if (!((aVar.f17398e == null || aVar.f17394a == Integer.parseInt(aVar.f17398e)) ? false : true)) {
            return;
        }
        if (m24184a(aVar)) {
            throw new StopRequest(489, "mismatched content length");
        }
        throw new StopRequest(m24201f(bVar), "closed socket before end of file");
    }

    /* renamed from: b */
    private void m24192b(C4837b bVar, C4836a aVar, HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Content-Disposition");
        if (firstHeader != null) {
            aVar.f17399f = firstHeader.getValue();
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Content-Location");
        if (firstHeader2 != null) {
            aVar.f17400g = firstHeader2.getValue();
        }
        Header firstHeader3 = httpResponse.getFirstHeader("ETag");
        if (firstHeader3 != null) {
            aVar.f17396c = firstHeader3.getValue();
        }
        String str = null;
        Header firstHeader4 = httpResponse.getFirstHeader("Transfer-Encoding");
        if (firstHeader4 != null) {
            str = firstHeader4.getValue();
        }
        Header firstHeader5 = httpResponse.getFirstHeader("Content-Type");
        if (firstHeader5 == null || firstHeader5.getValue().equals("application/vnd.android.obb")) {
            if (str == null) {
                Header firstHeader6 = httpResponse.getFirstHeader("Content-Length");
                if (firstHeader6 != null) {
                    aVar.f17398e = firstHeader6.getValue();
                    long parseLong = Long.parseLong(aVar.f17398e);
                    if (!(parseLong == -1 || parseLong == this.f17389b.f17462e)) {
                        Log.e("LVLDL", "Incorrect file size delivered.");
                    }
                }
            }
            if (aVar.f17398e == null && (str == null || !str.equalsIgnoreCase("chunked"))) {
                throw new StopRequest(495, "can't know size of download, giving up");
            }
            return;
        }
        throw new StopRequest(487, "file delivered with incorrect Mime type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r3.f17406d > 86400) goto L_0x0026;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24193b(com.google.android.vending.expansion.downloader.impl.DownloadThread.C4837b r3, org.apache.http.HttpResponse r4) {
        /*
            r2 = this;
            r0 = 1
            r3.f17405c = r0
            java.lang.String r0 = "Retry-After"
            org.apache.http.Header r4 = r4.getFirstHeader(r0)
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = r4.getValue()     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x003e }
            r3.f17406d = r4     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = r3.f17406d     // Catch:{ NumberFormatException -> 0x003e }
            if (r4 < 0) goto L_0x003c
            int r4 = r3.f17406d     // Catch:{ NumberFormatException -> 0x003e }
            r0 = 30
            if (r4 < r0) goto L_0x0026
            int r4 = r3.f17406d     // Catch:{ NumberFormatException -> 0x003e }
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r4 <= r0) goto L_0x0028
        L_0x0026:
            r3.f17406d = r0     // Catch:{ NumberFormatException -> 0x003e }
        L_0x0028:
            int r4 = r3.f17406d     // Catch:{ NumberFormatException -> 0x003e }
            java.util.Random r0 = com.google.android.vending.expansion.downloader.C4831d.f17386a     // Catch:{ NumberFormatException -> 0x003e }
            r1 = 31
            int r0 = r0.nextInt(r1)     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = r4 + r0
            r3.f17406d = r4     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = r3.f17406d     // Catch:{ NumberFormatException -> 0x003e }
            int r4 = r4 * 1000
        L_0x0039:
            r3.f17406d = r4     // Catch:{ NumberFormatException -> 0x003e }
            goto L_0x003e
        L_0x003c:
            r4 = 0
            goto L_0x0039
        L_0x003e:
            com.google.android.vending.expansion.downloader.impl.DownloadThread$StopRequest r3 = new com.google.android.vending.expansion.downloader.impl.DownloadThread$StopRequest
            r4 = 194(0xc2, float:2.72E-43)
            java.lang.String r0 = "got 503 Service Unavailable, will retry later"
            r3.<init>(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.DownloadThread.m24193b(com.google.android.vending.expansion.downloader.impl.DownloadThread$b, org.apache.http.HttpResponse):void");
    }

    /* renamed from: c */
    private void m24194c() {
        String str = "LVLDL";
        StringBuilder sb = new StringBuilder();
        sb.append("Net ");
        sb.append(this.f17390c.mo15977a(this.f17391d) == 1 ? "Up" : "Down");
        Log.i(str, sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039 A[SYNTHETIC, Splitter:B:23:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070 A[SYNTHETIC, Splitter:B:35:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097 A[SYNTHETIC, Splitter:B:42:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00be A[SYNTHETIC, Splitter:B:49:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c4 A[SYNTHETIC, Splitter:B:52:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24195c(com.google.android.vending.expansion.downloader.impl.DownloadThread.C4837b r7) {
        /*
            r6 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x009b, SyncFailedException -> 0x0074, IOException -> 0x004d, RuntimeException -> 0x002f }
            java.lang.String r2 = r7.f17403a     // Catch:{ FileNotFoundException -> 0x009b, SyncFailedException -> 0x0074, IOException -> 0x004d, RuntimeException -> 0x002f }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x009b, SyncFailedException -> 0x0074, IOException -> 0x004d, RuntimeException -> 0x002f }
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ FileNotFoundException -> 0x0026, SyncFailedException -> 0x0021, IOException -> 0x001c, RuntimeException -> 0x0019, all -> 0x0015 }
            r0.sync()     // Catch:{ FileNotFoundException -> 0x0026, SyncFailedException -> 0x0021, IOException -> 0x001c, RuntimeException -> 0x0019, all -> 0x0015 }
            r1.close()     // Catch:{ IOException -> 0x0044, RuntimeException -> 0x003e }
            goto L_0x00c1
        L_0x0015:
            r7 = move-exception
            r0 = r1
            goto L_0x00c2
        L_0x0019:
            r7 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x001c:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x004e
        L_0x0021:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0075
        L_0x0026:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x009c
        L_0x002c:
            r7 = move-exception
            goto L_0x00c2
        L_0x002f:
            r7 = move-exception
        L_0x0030:
            java.lang.String r1 = "LVLDL"
            java.lang.String r2 = "exception while syncing file: "
            android.util.Log.w(r1, r2, r7)     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x00c1
            r0.close()     // Catch:{ IOException -> 0x0044, RuntimeException -> 0x003e }
            goto L_0x00c1
        L_0x003e:
            r7 = move-exception
            java.lang.String r0 = "LVLDL"
            java.lang.String r1 = "exception while closing file: "
            goto L_0x0049
        L_0x0044:
            r7 = move-exception
            java.lang.String r0 = "LVLDL"
            java.lang.String r1 = "IOException while closing synced file: "
        L_0x0049:
            android.util.Log.w(r0, r1, r7)
            goto L_0x00c1
        L_0x004d:
            r1 = move-exception
        L_0x004e:
            java.lang.String r2 = "LVLDL"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r3.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "IOException trying to sync "
            r3.append(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r7.f17403a     // Catch:{ all -> 0x002c }
            r3.append(r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = ": "
            r3.append(r7)     // Catch:{ all -> 0x002c }
            r3.append(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x002c }
            android.util.Log.w(r2, r7)     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x00c1
            r0.close()     // Catch:{ IOException -> 0x0044, RuntimeException -> 0x003e }
            goto L_0x00c1
        L_0x0074:
            r1 = move-exception
        L_0x0075:
            java.lang.String r2 = "LVLDL"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r3.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "file "
            r3.append(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r7.f17403a     // Catch:{ all -> 0x002c }
            r3.append(r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " sync failed: "
            r3.append(r7)     // Catch:{ all -> 0x002c }
            r3.append(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x002c }
            android.util.Log.w(r2, r7)     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x00c1
            r0.close()     // Catch:{ IOException -> 0x0044, RuntimeException -> 0x003e }
            goto L_0x00c1
        L_0x009b:
            r1 = move-exception
        L_0x009c:
            java.lang.String r2 = "LVLDL"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r3.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "file "
            r3.append(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r7.f17403a     // Catch:{ all -> 0x002c }
            r3.append(r7)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = " not found: "
            r3.append(r7)     // Catch:{ all -> 0x002c }
            r3.append(r1)     // Catch:{ all -> 0x002c }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x002c }
            android.util.Log.w(r2, r7)     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x00c1
            r0.close()     // Catch:{ IOException -> 0x0044, RuntimeException -> 0x003e }
        L_0x00c1:
            return
        L_0x00c2:
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ IOException -> 0x00ce, RuntimeException -> 0x00c8 }
            goto L_0x00d6
        L_0x00c8:
            r0 = move-exception
            java.lang.String r1 = "LVLDL"
            java.lang.String r2 = "exception while closing file: "
            goto L_0x00d3
        L_0x00ce:
            r0 = move-exception
            java.lang.String r1 = "LVLDL"
            java.lang.String r2 = "IOException while closing synced file: "
        L_0x00d3:
            android.util.Log.w(r1, r2, r0)
        L_0x00d6:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.DownloadThread.m24195c(com.google.android.vending.expansion.downloader.impl.DownloadThread$b):void");
    }

    /* renamed from: c */
    private void m24196c(C4837b bVar, C4836a aVar) {
        this.f17389b.f17461d = aVar.f17396c;
        this.f17391d.mo16043c(this.f17389b);
    }

    /* renamed from: c */
    private void m24197c(C4837b bVar, C4836a aVar, HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 503 && this.f17389b.f17467j < 5) {
            m24193b(bVar, httpResponse);
        }
        if (statusCode == 301 || statusCode == 302 || statusCode == 303 || statusCode == 307) {
            m24182a(bVar, httpResponse, statusCode);
        }
        if (statusCode != (aVar.f17397d ? 206 : 200)) {
            m24178a(bVar, aVar, statusCode);
        } else {
            bVar.f17407e = 0;
        }
    }

    /* renamed from: d */
    private void m24198d(C4837b bVar) {
        try {
            if (bVar.f17404b != null) {
                bVar.f17404b.close();
                bVar.f17404b = null;
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    private void m24199d(C4837b bVar, C4836a aVar) {
        if (bVar.f17403a != null) {
            if (C4831d.m24159b(bVar.f17403a)) {
                File file = new File(bVar.f17403a);
                if (file.exists()) {
                    long length = file.length();
                    if (length == 0) {
                        file.delete();
                        bVar.f17403a = null;
                    } else if (this.f17389b.f17461d != null) {
                        try {
                            bVar.f17404b = new FileOutputStream(bVar.f17403a, true);
                            aVar.f17394a = (int) length;
                            if (this.f17389b.f17462e != -1) {
                                aVar.f17398e = Long.toString(this.f17389b.f17462e);
                            }
                            aVar.f17396c = this.f17389b.f17461d;
                            aVar.f17397d = true;
                        } catch (FileNotFoundException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("while opening destination for resuming: ");
                            sb.append(e.toString());
                            throw new StopRequest(492, sb.toString(), e);
                        }
                    } else {
                        file.delete();
                        throw new StopRequest(489, "Trying to resume a download that can't be resumed");
                    }
                }
            } else {
                throw new StopRequest(492, "found invalid internal destination filename");
            }
        }
        if (bVar.f17404b != null) {
            m24198d(bVar);
        }
    }

    /* renamed from: e */
    private void m24200e(C4837b bVar) {
        if (this.f17390c.mo15990k() == 1) {
            int l = this.f17390c.mo15991l();
            if (l == 193) {
                throw new StopRequest(this.f17390c.mo15991l(), "download paused");
            } else if (l == 490) {
                throw new StopRequest(this.f17390c.mo15991l(), "download cancelled");
            }
        }
    }

    /* renamed from: f */
    private int m24201f(C4837b bVar) {
        if (this.f17390c.mo15977a(this.f17391d) != 1) {
            return 195;
        }
        if (this.f17389b.f17467j < 5) {
            bVar.f17405c = true;
            return 194;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reached max retries for ");
        sb.append(this.f17389b.f17467j);
        Log.w("LVLDL", sb.toString());
        return 495;
    }

    /* renamed from: a */
    public HttpHost mo15975a(Context context, String str) {
        if (!m24185a(str) && !this.f17390c.mo15985f()) {
            String host = Proxy.getHost(context);
            if (host != null) {
                return new HttpHost(host, Proxy.getPort(context), "http");
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15976a() {
        /*
            r15 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.google.android.vending.expansion.downloader.impl.DownloadThread$b r0 = new com.google.android.vending.expansion.downloader.impl.DownloadThread$b
            com.google.android.vending.expansion.downloader.impl.d r1 = r15.f17389b
            com.google.android.vending.expansion.downloader.impl.DownloaderService r2 = r15.f17390c
            r0.<init>(r1, r2)
            r1 = 491(0x1eb, float:6.88E-43)
            r2 = 0
            android.content.Context r3 = r15.f17388a     // Catch:{ StopRequest -> 0x00dc, Throwable -> 0x0098, all -> 0x0092 }
            java.lang.String r4 = "power"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ StopRequest -> 0x00dc, Throwable -> 0x0098, all -> 0x0092 }
            android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch:{ StopRequest -> 0x00dc, Throwable -> 0x0098, all -> 0x0092 }
            java.lang.String r4 = "LVLDL"
            r5 = 1
            android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r5, r4)     // Catch:{ StopRequest -> 0x00dc, Throwable -> 0x0098, all -> 0x0092 }
            r3.acquire()     // Catch:{ StopRequest -> 0x008d, Throwable -> 0x0088, all -> 0x0082 }
            java.lang.String r4 = r15.m24187b()     // Catch:{ StopRequest -> 0x008d, Throwable -> 0x0088, all -> 0x0082 }
            android.content.Context r6 = r15.f17388a     // Catch:{ StopRequest -> 0x008d, Throwable -> 0x0088, all -> 0x0082 }
            com.google.android.vending.expansion.downloader.impl.a r4 = com.google.android.vending.expansion.downloader.impl.C4841a.m24247a(r4, r6)     // Catch:{ StopRequest -> 0x008d, Throwable -> 0x0088, all -> 0x0082 }
            r2 = 0
        L_0x0030:
            if (r2 != 0) goto L_0x005e
            org.apache.http.params.HttpParams r6 = r4.getParams()     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            android.content.Context r7 = r15.f17388a     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            java.lang.String r8 = r0.f17410h     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            org.apache.http.HttpHost r7 = r15.mo15975a(r7, r8)     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            org.apache.http.conn.params.ConnRouteParams.setDefaultProxy(r6, r7)     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            org.apache.http.client.methods.HttpGet r6 = new org.apache.http.client.methods.HttpGet     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            java.lang.String r7 = r0.f17410h     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            r6.<init>(r7)     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            r15.m24181a(r0, r4, r6)     // Catch:{ RetryDownload -> 0x0055, all -> 0x0050 }
            r6.abort()     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            r2 = 1
            goto L_0x0030
        L_0x0050:
            r2 = move-exception
            r6.abort()     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            throw r2     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
        L_0x0055:
            r6.abort()     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            goto L_0x0030
        L_0x0059:
            r2 = move-exception
            goto L_0x009c
        L_0x005b:
            r2 = move-exception
            goto L_0x00e0
        L_0x005e:
            r15.m24190b(r0)     // Catch:{ StopRequest -> 0x005b, Throwable -> 0x0059 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L_0x0068
            r3.release()
        L_0x0068:
            if (r4 == 0) goto L_0x006d
            r4.mo16000a()
        L_0x006d:
            r15.m24176a(r0, r1)
            boolean r7 = r0.f17405c
            int r8 = r0.f17406d
            int r9 = r0.f17407e
            boolean r10 = r0.f17409g
            java.lang.String r11 = r0.f17403a
            r6 = 200(0xc8, float:2.8E-43)
            r5 = r15
            r5.m24173a(r6, r7, r8, r9, r10, r11)
            goto L_0x0126
        L_0x0082:
            r4 = move-exception
            r14 = r4
            r4 = r2
            r2 = r14
            goto L_0x0128
        L_0x0088:
            r4 = move-exception
            r14 = r4
            r4 = r2
            r2 = r14
            goto L_0x009c
        L_0x008d:
            r4 = move-exception
            r14 = r4
            r4 = r2
            r2 = r14
            goto L_0x00e0
        L_0x0092:
            r3 = move-exception
            r4 = r2
            r2 = r3
            r3 = r4
            goto L_0x0128
        L_0x0098:
            r3 = move-exception
            r4 = r2
            r2 = r3
            r3 = r4
        L_0x009c:
            java.lang.String r5 = "LVLDL"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r6.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = "Exception for "
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            com.google.android.vending.expansion.downloader.impl.d r7 = r15.f17389b     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = r7.f17460c     // Catch:{ all -> 0x0127 }
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            r6.append(r2)     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0127 }
            android.util.Log.w(r5, r2)     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x00c3
            r3.release()
        L_0x00c3:
            if (r4 == 0) goto L_0x00c8
            r4.mo16000a()
        L_0x00c8:
            r15.m24176a(r0, r1)
            boolean r8 = r0.f17405c
            int r9 = r0.f17406d
            int r10 = r0.f17407e
            boolean r11 = r0.f17409g
            java.lang.String r12 = r0.f17403a
            r7 = 491(0x1eb, float:6.88E-43)
            r6 = r15
            r6.m24173a(r7, r8, r9, r10, r11, r12)
            goto L_0x0126
        L_0x00dc:
            r3 = move-exception
            r4 = r2
            r2 = r3
            r3 = r4
        L_0x00e0:
            java.lang.String r5 = "LVLDL"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r6.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = "Aborting request for download "
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            com.google.android.vending.expansion.downloader.impl.d r7 = r15.f17389b     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = r7.f17460c     // Catch:{ all -> 0x0127 }
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            java.lang.String r7 = r2.getMessage()     // Catch:{ all -> 0x0127 }
            r6.append(r7)     // Catch:{ all -> 0x0127 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0127 }
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0127 }
            r2.printStackTrace()     // Catch:{ all -> 0x0127 }
            int r8 = r2.mFinalStatus     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x0110
            r3.release()
        L_0x0110:
            if (r4 == 0) goto L_0x0115
            r4.mo16000a()
        L_0x0115:
            r15.m24176a(r0, r8)
            boolean r9 = r0.f17405c
            int r10 = r0.f17406d
            int r11 = r0.f17407e
            boolean r12 = r0.f17409g
            java.lang.String r13 = r0.f17403a
            r7 = r15
            r7.m24173a(r8, r9, r10, r11, r12, r13)
        L_0x0126:
            return
        L_0x0127:
            r2 = move-exception
        L_0x0128:
            if (r3 == 0) goto L_0x012d
            r3.release()
        L_0x012d:
            if (r4 == 0) goto L_0x0132
            r4.mo16000a()
        L_0x0132:
            r15.m24176a(r0, r1)
            boolean r7 = r0.f17405c
            int r8 = r0.f17406d
            int r9 = r0.f17407e
            boolean r10 = r0.f17409g
            java.lang.String r11 = r0.f17403a
            r6 = 491(0x1eb, float:6.88E-43)
            r5 = r15
            r5.m24173a(r6, r7, r8, r9, r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.expansion.downloader.impl.DownloadThread.mo15976a():void");
    }
}
