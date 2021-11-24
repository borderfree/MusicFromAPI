package com.bumptech.glide.load.p042a;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1329g;
import com.bumptech.glide.p040g.C1251c;
import com.bumptech.glide.p040g.C1253e;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.a.j */
public class C1282j implements C1272d<InputStream> {

    /* renamed from: a */
    static final C1284b f4512a = new C1283a();

    /* renamed from: b */
    private final C1329g f4513b;

    /* renamed from: c */
    private final int f4514c;

    /* renamed from: d */
    private final C1284b f4515d;

    /* renamed from: e */
    private HttpURLConnection f4516e;

    /* renamed from: f */
    private InputStream f4517f;

    /* renamed from: g */
    private volatile boolean f4518g;

    /* renamed from: com.bumptech.glide.load.a.j$a */
    private static class C1283a implements C1284b {
        C1283a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo5963a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.a.j$b */
    interface C1284b {
        /* renamed from: a */
        HttpURLConnection mo5963a(URL url);
    }

    public C1282j(C1329g gVar, int i) {
        this(gVar, i, f4512a);
    }

    C1282j(C1329g gVar, int i, C1284b bVar) {
        this.f4513b = gVar;
        this.f4514c = i;
        this.f4515d = bVar;
    }

    /* renamed from: a */
    private InputStream m6787a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C1251c.m6671a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got non empty content encoding: ");
                sb.append(httpURLConnection.getContentEncoding());
                Log.d("HttpUrlFetcher", sb.toString());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f4517f = inputStream;
        return this.f4517f;
    }

    /* renamed from: a */
    private InputStream m6788a(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f4516e = this.f4515d.mo5963a(url);
            for (Entry entry : map.entrySet()) {
                this.f4516e.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f4516e.setConnectTimeout(this.f4514c);
            this.f4516e.setReadTimeout(this.f4514c);
            this.f4516e.setUseCaches(false);
            this.f4516e.setDoInput(true);
            this.f4516e.setInstanceFollowRedirects(false);
            this.f4516e.connect();
            this.f4517f = this.f4516e.getInputStream();
            if (this.f4518g) {
                return null;
            }
            int responseCode = this.f4516e.getResponseCode();
            if (m6789a(responseCode)) {
                return m6787a(this.f4516e);
            }
            if (m6790b(responseCode)) {
                String headerField = this.f4516e.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo5932b();
                    return m6788a(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f4516e.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    private static boolean m6789a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: b */
    private static boolean m6790b(int i) {
        return i / 100 == 3;
    }

    /* renamed from: a */
    public Class<InputStream> mo5924a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public void mo5931a(Priority priority, C1273a<? super InputStream> aVar) {
        StringBuilder sb;
        String str;
        long a = C1253e.m6677a();
        try {
            aVar.mo5946a(m6788a(this.f4513b.mo6009a(), 0, null, this.f4513b.mo6010b()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                str = "HttpUrlFetcher";
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C1253e.m6676a(a));
                Log.v(str, sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo5945a((Exception) e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                str = "HttpUrlFetcher";
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(C1253e.m6676a(a));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void mo5932b() {
        if (this.f4517f != null) {
            try {
                this.f4517f.close();
            } catch (IOException unused) {
            }
        }
        if (this.f4516e != null) {
            this.f4516e.disconnect();
        }
        this.f4516e = null;
    }

    /* renamed from: c */
    public void mo5933c() {
        this.f4518g = true;
    }

    /* renamed from: d */
    public DataSource mo5934d() {
        return DataSource.REMOTE;
    }
}
