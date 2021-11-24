package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.p102c.C2502m;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.upstream.C2809d.C2810a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends C2809d {

    /* renamed from: a */
    public static final C2502m<String> f9699a = new C2502m<String>() {
        /* renamed from: a */
        public boolean mo8862a(String str) {
            String d = C2511s.m11818d(str);
            return !TextUtils.isEmpty(d) && (!d.contains("text") || d.contains("text/vtt")) && !d.contains("html") && !d.contains("xml");
        }
    };

    public static class HttpDataSourceException extends IOException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        public final C2811e dataSpec;
        public final int type;

        public HttpDataSourceException(C2811e eVar, int i) {
            this.dataSpec = eVar;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, C2811e eVar, int i) {
            super(iOException);
            this.dataSpec = eVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, C2811e eVar, int i) {
            super(str);
            this.dataSpec = eVar;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, C2811e eVar, int i) {
            super(str, iOException);
            this.dataSpec = eVar;
            this.type = i;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, C2811e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(str);
            super(sb.toString(), eVar, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i, Map<String, List<String>> map, C2811e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Response code: ");
            sb.append(i);
            super(sb.toString(), eVar, 1);
            this.responseCode = i;
            this.headerFields = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$a */
    public static abstract class C2799a implements C2800b {

        /* renamed from: a */
        private final C2801c f9700a = new C2801c();

        /* renamed from: b */
        public final HttpDataSource mo9523a() {
            return mo9525b(this.f9700a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract HttpDataSource mo9525b(C2801c cVar);
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b */
    public interface C2800b extends C2810a {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$c */
    public static final class C2801c {

        /* renamed from: a */
        private final Map<String, String> f9701a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f9702b;

        /* renamed from: a */
        public synchronized Map<String, String> mo9526a() {
            if (this.f9702b == null) {
                this.f9702b = Collections.unmodifiableMap(new HashMap(this.f9701a));
            }
            return this.f9702b;
        }
    }
}
