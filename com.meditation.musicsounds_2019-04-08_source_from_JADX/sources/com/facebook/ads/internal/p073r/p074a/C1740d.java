package com.facebook.ads.internal.p073r.p074a;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.r.a.d */
public abstract class C1740d implements C1750n {

    /* renamed from: a */
    private final C1751o f5740a;

    public C1740d() {
        this(new C1741e());
    }

    public C1740d(C1751o oVar) {
        this.f5740a = oVar;
    }

    /* renamed from: a */
    public OutputStream mo6972a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: a */
    public HttpURLConnection mo6973a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    /* renamed from: a */
    public void mo6974a(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    /* renamed from: a */
    public void mo6975a(HttpURLConnection httpURLConnection, C1746j jVar, String str) {
        httpURLConnection.setRequestMethod(jVar.mo6994c());
        httpURLConnection.setDoOutput(jVar.mo6993b());
        httpURLConnection.setDoInput(jVar.mo6992a());
        if (str != null) {
            httpURLConnection.setRequestProperty("Content-Type", str);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
    }

    /* renamed from: a */
    public boolean mo6976a(C1749m mVar) {
        C1745i a = mVar.mo7013a();
        if (this.f5740a.mo6982a()) {
            this.f5740a.mo6980a("BasicRequestHandler.onError got");
            mVar.printStackTrace();
        }
        return a != null && a.mo6987a() > 0;
    }

    /* renamed from: a */
    public byte[] mo6977a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    public InputStream mo6978b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }
}
