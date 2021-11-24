package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2502m;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.upstream.HttpDataSource.C2801c;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.j */
public class C2817j implements HttpDataSource {

    /* renamed from: b */
    private static final Pattern f9753b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: c */
    private static final AtomicReference<byte[]> f9754c = new AtomicReference<>();

    /* renamed from: d */
    private final boolean f9755d;

    /* renamed from: e */
    private final int f9756e;

    /* renamed from: f */
    private final int f9757f;

    /* renamed from: g */
    private final String f9758g;

    /* renamed from: h */
    private final C2502m<String> f9759h;

    /* renamed from: i */
    private final C2801c f9760i;

    /* renamed from: j */
    private final C2801c f9761j = new C2801c();

    /* renamed from: k */
    private final C2819l<? super C2817j> f9762k;

    /* renamed from: l */
    private C2811e f9763l;

    /* renamed from: m */
    private HttpURLConnection f9764m;

    /* renamed from: n */
    private InputStream f9765n;

    /* renamed from: o */
    private boolean f9766o;

    /* renamed from: p */
    private long f9767p;

    /* renamed from: q */
    private long f9768q;

    /* renamed from: r */
    private long f9769r;

    /* renamed from: s */
    private long f9770s;

    public C2817j(String str, C2502m<String> mVar, C2819l<? super C2817j> lVar, int i, int i2, boolean z, C2801c cVar) {
        this.f9758g = C2488a.m11665a(str);
        this.f9759h = mVar;
        this.f9762k = lVar;
        this.f9756e = i;
        this.f9757f = i2;
        this.f9755d = z;
        this.f9760i = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m13404a(java.net.HttpURLConnection r8) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r8.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x002c
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0011 }
            goto L_0x002e
        L_0x0011:
            java.lang.String r1 = "DefaultHttpDataSource"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected Content-Length ["
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2)
        L_0x002c:
            r1 = -1
        L_0x002e:
            java.lang.String r3 = "Content-Range"
            java.lang.String r8 = r8.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00ad
            java.util.regex.Pattern r3 = f9753b
            java.util.regex.Matcher r3 = r3.matcher(r8)
            boolean r4 = r3.find()
            if (r4 == 0) goto L_0x00ad
            r4 = 2
            java.lang.String r4 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x0092 }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0092 }
            r6 = 1
            java.lang.String r3 = r3.group(r6)     // Catch:{ NumberFormatException -> 0x0092 }
            long r6 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x0092 }
            r3 = 0
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 0
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0065
            r1 = r4
            goto L_0x00ad
        L_0x0065:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = "DefaultHttpDataSource"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0092 }
            r6.<init>()     // Catch:{ NumberFormatException -> 0x0092 }
            java.lang.String r7 = "Inconsistent headers ["
            r6.append(r7)     // Catch:{ NumberFormatException -> 0x0092 }
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x0092 }
            java.lang.String r0 = "] ["
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x0092 }
            r6.append(r8)     // Catch:{ NumberFormatException -> 0x0092 }
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch:{ NumberFormatException -> 0x0092 }
            java.lang.String r0 = r6.toString()     // Catch:{ NumberFormatException -> 0x0092 }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x0092 }
            long r3 = java.lang.Math.max(r1, r4)     // Catch:{ NumberFormatException -> 0x0092 }
            r1 = r3
            goto L_0x00ad
        L_0x0092:
            java.lang.String r0 = "DefaultHttpDataSource"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected Content-Range ["
            r3.append(r4)
            r3.append(r8)
            java.lang.String r8 = "]"
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            android.util.Log.e(r0, r8)
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C2817j.m13404a(java.net.HttpURLConnection):long");
    }

    /* renamed from: a */
    private HttpURLConnection m13405a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f9756e);
        httpURLConnection.setReadTimeout(this.f9757f);
        if (this.f9760i != null) {
            for (Entry entry : this.f9760i.mo9526a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.f9761j.mo9526a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f9758g);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* renamed from: a */
    private static URL m13406a(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported protocol redirect: ");
            sb.append(protocol);
            throw new ProtocolException(sb.toString());
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: a */
    private static void m13407a(HttpURLConnection httpURLConnection, long j) {
        if (C2511s.f8123a == 19 || C2511s.f8123a == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private int m13408b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9768q != -1) {
            long j = this.f9768q - this.f9770s;
            if (j == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j);
        }
        int read = this.f9765n.read(bArr, i, i2);
        if (read != -1) {
            this.f9770s += (long) read;
            if (this.f9762k != null) {
                this.f9762k.mo9552a(this, read);
            }
            return read;
        } else if (this.f9768q == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    private HttpURLConnection m13409b(C2811e eVar) {
        HttpURLConnection a;
        C2811e eVar2 = eVar;
        URL url = new URL(eVar2.f9717a.toString());
        byte[] bArr = eVar2.f9718b;
        long j = eVar2.f9720d;
        long j2 = eVar2.f9721e;
        boolean a2 = eVar2.mo9546a(1);
        if (!this.f9755d) {
            return m13405a(url, bArr, j, j2, a2, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                long j3 = j;
                int i3 = i2;
                a = m13405a(url, bArr, j, j2, a2, false);
                int responseCode = a.getResponseCode();
                if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                    bArr = null;
                    String headerField = a.getHeaderField("Location");
                    a.disconnect();
                    url = m13406a(url, headerField);
                    i = i3;
                    j = j3;
                }
            } else {
                int i4 = i2;
                StringBuilder sb = new StringBuilder();
                sb.append("Too many redirects: ");
                sb.append(i4);
                throw new NoRouteToHostException(sb.toString());
            }
        }
        return a;
    }

    /* renamed from: d */
    private void m13410d() {
        if (this.f9769r != this.f9767p) {
            byte[] bArr = (byte[]) f9754c.getAndSet(null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (this.f9769r != this.f9767p) {
                int read = this.f9765n.read(bArr, 0, (int) Math.min(this.f9767p - this.f9769r, (long) bArr.length));
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                } else if (read != -1) {
                    this.f9769r += (long) read;
                    if (this.f9762k != null) {
                        this.f9762k.mo9552a(this, read);
                    }
                } else {
                    throw new EOFException();
                }
            }
            f9754c.set(bArr);
        }
    }

    /* renamed from: e */
    private void m13411e() {
        if (this.f9764m != null) {
            try {
                this.f9764m.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f9764m = null;
        }
    }

    /* renamed from: a */
    public int mo9518a(byte[] bArr, int i, int i2) {
        try {
            m13410d();
            return m13408b(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f9763l, 2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo9519a(com.google.android.exoplayer2.upstream.C2811e r8) {
        /*
            r7 = this;
            r7.f9763l = r8
            r0 = 0
            r7.f9770s = r0
            r7.f9769r = r0
            r2 = 1
            java.net.HttpURLConnection r3 = r7.m13409b(r8)     // Catch:{ IOException -> 0x00c7 }
            r7.f9764m = r3     // Catch:{ IOException -> 0x00c7 }
            java.net.HttpURLConnection r3 = r7.f9764m     // Catch:{ IOException -> 0x00a6 }
            int r3 = r3.getResponseCode()     // Catch:{ IOException -> 0x00a6 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 < r4) goto L_0x008a
            r5 = 299(0x12b, float:4.19E-43)
            if (r3 <= r5) goto L_0x001e
            goto L_0x008a
        L_0x001e:
            java.net.HttpURLConnection r5 = r7.f9764m
            java.lang.String r5 = r5.getContentType()
            com.google.android.exoplayer2.c.m<java.lang.String> r6 = r7.f9759h
            if (r6 == 0) goto L_0x003a
            com.google.android.exoplayer2.c.m<java.lang.String> r6 = r7.f9759h
            boolean r6 = r6.mo8862a(r5)
            if (r6 == 0) goto L_0x0031
            goto L_0x003a
        L_0x0031:
            r7.m13411e()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException r0 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
            r0.<init>(r5, r8)
            throw r0
        L_0x003a:
            if (r3 != r4) goto L_0x0044
            long r3 = r8.f9720d
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0044
            long r0 = r8.f9720d
        L_0x0044:
            r7.f9767p = r0
            boolean r0 = r8.mo9546a(r2)
            if (r0 != 0) goto L_0x0066
            long r0 = r8.f9721e
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0055
            goto L_0x0066
        L_0x0055:
            java.net.HttpURLConnection r0 = r7.f9764m
            long r0 = m13404a(r0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0063
            long r3 = r7.f9767p
            long r3 = r0 - r3
        L_0x0063:
            r7.f9768q = r3
            goto L_0x006a
        L_0x0066:
            long r0 = r8.f9721e
            r7.f9768q = r0
        L_0x006a:
            java.net.HttpURLConnection r0 = r7.f9764m     // Catch:{ IOException -> 0x0080 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0080 }
            r7.f9765n = r0     // Catch:{ IOException -> 0x0080 }
            r7.f9766o = r2
            com.google.android.exoplayer2.upstream.l<? super com.google.android.exoplayer2.upstream.j> r0 = r7.f9762k
            if (r0 == 0) goto L_0x007d
            com.google.android.exoplayer2.upstream.l<? super com.google.android.exoplayer2.upstream.j> r0 = r7.f9762k
            r0.mo9553a(r7, r8)
        L_0x007d:
            long r0 = r7.f9768q
            return r0
        L_0x0080:
            r0 = move-exception
            r7.m13411e()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            r1.<init>(r0, r8, r2)
            throw r1
        L_0x008a:
            java.net.HttpURLConnection r0 = r7.f9764m
            java.util.Map r0 = r0.getHeaderFields()
            r7.m13411e()
            com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException
            r1.<init>(r3, r0, r8)
            r8 = 416(0x1a0, float:5.83E-43)
            if (r3 != r8) goto L_0x00a5
            com.google.android.exoplayer2.upstream.DataSourceException r8 = new com.google.android.exoplayer2.upstream.DataSourceException
            r0 = 0
            r8.<init>(r0)
            r1.initCause(r8)
        L_0x00a5:
            throw r1
        L_0x00a6:
            r0 = move-exception
            r7.m13411e()
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to connect to "
            r3.append(r4)
            android.net.Uri r4 = r8.f9717a
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r0, r8, r2)
            throw r1
        L_0x00c7:
            r0 = move-exception
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r1 = new com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to connect to "
            r3.append(r4)
            android.net.Uri r4 = r8.f9717a
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r0, r8, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C2817j.mo9519a(com.google.android.exoplayer2.upstream.e):long");
    }

    /* renamed from: a */
    public Uri mo9520a() {
        if (this.f9764m == null) {
            return null;
        }
        return Uri.parse(this.f9764m.getURL().toString());
    }

    /* renamed from: b */
    public void mo9521b() {
        try {
            if (this.f9765n != null) {
                m13407a(this.f9764m, mo9556c());
                this.f9765n.close();
            }
            this.f9765n = null;
            m13411e();
            if (this.f9766o) {
                this.f9766o = false;
                if (this.f9762k != null) {
                    this.f9762k.mo9551a(this);
                }
            }
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f9763l, 3);
        } catch (Throwable th) {
            this.f9765n = null;
            m13411e();
            if (this.f9766o) {
                this.f9766o = false;
                if (this.f9762k != null) {
                    this.f9762k.mo9551a(this);
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo9556c() {
        return this.f9768q == -1 ? this.f9768q : this.f9768q - this.f9770s;
    }
}
