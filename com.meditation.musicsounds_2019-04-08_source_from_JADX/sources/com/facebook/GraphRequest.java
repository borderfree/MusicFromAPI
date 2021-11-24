package com.facebook;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C2196h.C2197a;
import com.facebook.C2196h.C2198b;
import com.facebook.internal.C2237p;
import com.facebook.internal.C2240r;
import com.facebook.internal.C2257w;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphRequest {

    /* renamed from: a */
    public static final String f5217a = "GraphRequest";

    /* renamed from: b */
    private static String f5218b;

    /* renamed from: c */
    private static Pattern f5219c = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: q */
    private static volatile String f5220q;

    /* renamed from: d */
    private AccessToken f5221d;

    /* renamed from: e */
    private HttpMethod f5222e;

    /* renamed from: f */
    private String f5223f;

    /* renamed from: g */
    private JSONObject f5224g;

    /* renamed from: h */
    private String f5225h;

    /* renamed from: i */
    private String f5226i;

    /* renamed from: j */
    private boolean f5227j;

    /* renamed from: k */
    private Bundle f5228k;

    /* renamed from: l */
    private C1609b f5229l;

    /* renamed from: m */
    private String f5230m;

    /* renamed from: n */
    private Object f5231n;

    /* renamed from: o */
    private String f5232o;

    /* renamed from: p */
    private boolean f5233p;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Creator<ParcelableResourceWithMimeType> CREATOR = new Creator<ParcelableResourceWithMimeType>() {
            /* renamed from: a */
            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel);
            }

            /* renamed from: a */
            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        };

        /* renamed from: a */
        private final String f5241a;

        /* renamed from: b */
        private final RESOURCE f5242b;

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f5241a = parcel.readString();
            this.f5242b = parcel.readParcelable(C2189f.m10092f().getClassLoader());
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f5241a = str;
            this.f5242b = resource;
        }

        /* renamed from: a */
        public String mo6592a() {
            return this.f5241a;
        }

        /* renamed from: b */
        public RESOURCE mo6593b() {
            return this.f5242b;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5241a);
            parcel.writeParcelable(this.f5242b, i);
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    private static class C1608a {

        /* renamed from: a */
        private final GraphRequest f5243a;

        /* renamed from: b */
        private final Object f5244b;

        public C1608a(GraphRequest graphRequest, Object obj) {
            this.f5243a = graphRequest;
            this.f5244b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo6600a() {
            return this.f5243a;
        }

        /* renamed from: b */
        public Object mo6601b() {
            return this.f5244b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    public interface C1609b {
        /* renamed from: a */
        void mo6589a(C2199i iVar);
    }

    /* renamed from: com.facebook.GraphRequest$c */
    public interface C1610c {
        /* renamed from: a */
        void mo6602a(JSONObject jSONObject, C2199i iVar);
    }

    /* renamed from: com.facebook.GraphRequest$d */
    private interface C1611d {
        /* renamed from: a */
        void mo6591a(String str, String str2);
    }

    /* renamed from: com.facebook.GraphRequest$e */
    public interface C1612e extends C1609b {
        /* renamed from: a */
        void mo6603a(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$f */
    private static class C1613f implements C1611d {

        /* renamed from: a */
        private final OutputStream f5245a;

        /* renamed from: b */
        private final C2240r f5246b;

        /* renamed from: c */
        private boolean f5247c = true;

        /* renamed from: d */
        private boolean f5248d = false;

        public C1613f(OutputStream outputStream, C2240r rVar, boolean z) {
            this.f5245a = outputStream;
            this.f5246b = rVar;
            this.f5248d = z;
        }

        /* renamed from: b */
        private RuntimeException m8094b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo6604a() {
            if (!this.f5248d) {
                mo6613b("--%s", "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
                return;
            }
            this.f5245a.write("&".getBytes());
        }

        /* renamed from: a */
        public void mo6605a(String str, Bitmap bitmap) {
            mo6609a(str, str, "image/png");
            bitmap.compress(CompressFormat.PNG, 100, this.f5245a);
            mo6613b("", new Object[0]);
            mo6604a();
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void mo6606a(String str, Uri uri, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6609a(str, str, str2);
            if (this.f5245a instanceof C2313m) {
                ((C2313m) this.f5245a).mo8090a(C2258x.m10408e(uri));
                i = 0;
            } else {
                i = C2258x.m10356a(C2189f.m10092f().getContentResolver().openInputStream(uri), this.f5245a) + 0;
            }
            mo6613b("", new Object[0]);
            mo6604a();
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6607a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo6609a(str, str, str2);
            if (this.f5245a instanceof C2313m) {
                ((C2313m) this.f5245a).mo8090a(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C2258x.m10356a((InputStream) new AutoCloseInputStream(parcelFileDescriptor), this.f5245a) + 0;
            }
            mo6613b("", new Object[0]);
            mo6604a();
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo6608a(String str, Object obj, GraphRequest graphRequest) {
            if (this.f5245a instanceof C2316o) {
                ((C2316o) this.f5245a).mo8091a(graphRequest);
            }
            if (GraphRequest.m8055e(obj)) {
                mo6591a(str, GraphRequest.m8056f(obj));
            } else if (obj instanceof Bitmap) {
                mo6605a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo6611a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo6606a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo6607a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo6593b();
                String a = parcelableResourceWithMimeType.mo6592a();
                if (b instanceof ParcelFileDescriptor) {
                    mo6607a(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo6606a(str, (Uri) b, a);
                } else {
                    throw m8094b();
                }
            } else {
                throw m8094b();
            }
        }

        /* renamed from: a */
        public void mo6591a(String str, String str2) {
            mo6609a(str, (String) null, (String) null);
            mo6613b("%s", str2);
            mo6604a();
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) str2);
            }
        }

        /* renamed from: a */
        public void mo6609a(String str, String str2, String str3) {
            if (!this.f5248d) {
                mo6612a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo6612a("; filename=\"%s\"", str2);
                }
                mo6613b("", new Object[0]);
                if (str3 != null) {
                    mo6613b("%s: %s", "Content-Type", str3);
                }
                mo6613b("", new Object[0]);
                return;
            }
            this.f5245a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: a */
        public void mo6610a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) {
            String str2;
            Object[] objArr;
            if (!(this.f5245a instanceof C2316o)) {
                mo6591a(str, jSONArray.toString());
                return;
            }
            C2316o oVar = (C2316o) this.f5245a;
            mo6609a(str, (String) null, (String) null);
            mo6612a("[", new Object[0]);
            int i = 0;
            for (GraphRequest graphRequest : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                oVar.mo8091a(graphRequest);
                if (i > 0) {
                    str2 = ",%s";
                    objArr = new Object[]{jSONObject.toString()};
                } else {
                    str2 = "%s";
                    objArr = new Object[]{jSONObject.toString()};
                }
                mo6612a(str2, objArr);
                i++;
            }
            mo6612a("]", new Object[0]);
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public void mo6611a(String str, byte[] bArr) {
            mo6609a(str, str, "content/unknown");
            this.f5245a.write(bArr);
            mo6613b("", new Object[0]);
            mo6604a();
            if (this.f5246b != null) {
                C2240r rVar = this.f5246b;
                StringBuilder sb = new StringBuilder();
                sb.append("    ");
                sb.append(str);
                rVar.mo7866a(sb.toString(), (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void mo6612a(String str, Object... objArr) {
            String str2;
            OutputStream outputStream;
            if (!this.f5248d) {
                if (this.f5247c) {
                    this.f5245a.write("--".getBytes());
                    this.f5245a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                    this.f5245a.write("\r\n".getBytes());
                    this.f5247c = false;
                }
                outputStream = this.f5245a;
                str2 = String.format(str, objArr);
            } else {
                outputStream = this.f5245a;
                str2 = URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8");
            }
            outputStream.write(str2.getBytes());
        }

        /* renamed from: b */
        public void mo6613b(String str, Object... objArr) {
            mo6612a(str, objArr);
            if (!this.f5248d) {
                mo6612a("\r\n", new Object[0]);
            }
        }
    }

    public GraphRequest() {
        this(null, null, null, null, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C1609b bVar) {
        this(accessToken, str, bundle, httpMethod, bVar, null);
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, C1609b bVar, String str2) {
        this.f5227j = true;
        this.f5233p = false;
        this.f5221d = accessToken;
        this.f5223f = str;
        this.f5232o = str2;
        mo6572a(bVar);
        mo6573a(httpMethod);
        this.f5228k = bundle != null ? new Bundle(bundle) : new Bundle();
        if (this.f5232o == null) {
            this.f5232o = C2189f.m10093g();
        }
    }

    /* renamed from: a */
    public static GraphRequest m8024a(AccessToken accessToken, final C1610c cVar) {
        AccessToken accessToken2 = accessToken;
        GraphRequest graphRequest = new GraphRequest(accessToken2, "me", null, null, new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                if (cVar != null) {
                    cVar.mo6602a(iVar.mo7796b(), iVar);
                }
            }
        });
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m8025a(AccessToken accessToken, String str, C1609b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, null, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    public static GraphRequest m8026a(AccessToken accessToken, String str, JSONObject jSONObject, C1609b bVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, null, HttpMethod.POST, bVar);
        graphRequest.mo6575a(jSONObject);
        return graphRequest;
    }

    /* renamed from: a */
    public static C2199i m8027a(GraphRequest graphRequest) {
        List a = m8033a(graphRequest);
        if (a != null && a.size() == 1) {
            return (C2199i) a.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: a */
    private String m8028a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f5222e == HttpMethod.POST) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f5228k.keySet()) {
            Object obj = this.f5228k.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m8055e(obj)) {
                buildUpon.appendQueryParameter(str2, m8056f(obj).toString());
            } else if (this.f5222e == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m8029a(C2196h hVar) {
        m8052d(hVar);
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection a = m8030a(hVar.size() == 1 ? new URL(hVar.get(0).mo6587l()) : new URL(C2257w.m10352b()));
                try {
                    m8037a(hVar, a);
                    return a;
                } catch (IOException | JSONException e) {
                    e = e;
                    httpURLConnection = a;
                    C2258x.m10386a((URLConnection) httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                }
            } catch (IOException | JSONException e2) {
                e = e2;
                C2258x.m10386a((URLConnection) httpURLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", (Throwable) e3);
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m8030a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m8062p());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static List<C2199i> m8031a(HttpURLConnection httpURLConnection, C2196h hVar) {
        List<C2199i> a = C2199i.m10130a(httpURLConnection, hVar);
        C2258x.m10386a((URLConnection) httpURLConnection);
        int size = hVar.size();
        if (size == a.size()) {
            m8038a(hVar, a);
            C2171b.m10050a().mo7738d();
            return a;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    public static List<C2199i> m8032a(Collection<GraphRequest> collection) {
        return m8047b(new C2196h(collection));
    }

    /* renamed from: a */
    public static List<C2199i> m8033a(GraphRequest... graphRequestArr) {
        C2264y.m10422a((Object) graphRequestArr, "requests");
        return m8032a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    private static void m8034a(Bundle bundle, C1613f fVar, GraphRequest graphRequest) {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m8055e(obj)) {
                fVar.mo6608a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m8035a(C1613f fVar, Collection<GraphRequest> collection, Map<String, C1608a> map) {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m8042a(jSONArray, map);
        }
        fVar.mo6610a("batch", jSONArray, collection);
    }

    /* renamed from: a */
    private static void m8036a(C2196h hVar, C2240r rVar, int i, URL url, OutputStream outputStream, boolean z) {
        C1613f fVar = new C1613f(outputStream, rVar, z);
        if (i == 1) {
            GraphRequest a = hVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : a.f5228k.keySet()) {
                Object obj = a.f5228k.get(str);
                if (m8053d(obj)) {
                    hashMap.put(str, new C1608a(a, obj));
                }
            }
            if (rVar != null) {
                rVar.mo7869c("  Parameters:\n");
            }
            m8034a(a.f5228k, fVar, a);
            if (rVar != null) {
                rVar.mo7869c("  Attachments:\n");
            }
            m8041a((Map<String, C1608a>) hashMap, fVar);
            if (a.f5224g != null) {
                m8043a(a.f5224g, url.getPath(), (C1611d) fVar);
                return;
            }
            return;
        }
        String g = m8058g(hVar);
        if (!C2258x.m10392a(g)) {
            fVar.mo6591a("batch_app_id", g);
            HashMap hashMap2 = new HashMap();
            m8035a(fVar, (Collection<GraphRequest>) hVar, (Map<String, C1608a>) hashMap2);
            if (rVar != null) {
                rVar.mo7869c("  Attachments:\n");
            }
            m8041a((Map<String, C1608a>) hashMap2, fVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    /* JADX WARNING: type inference failed for: r14v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r14v6 */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r14v9, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r14v10 */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m8037a(com.facebook.C2196h r13, java.net.HttpURLConnection r14) {
        /*
            com.facebook.internal.r r6 = new com.facebook.internal.r
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m8057f(r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get(r0)
            com.facebook.HttpMethod r3 = r3.f5222e
            goto L_0x001e
        L_0x001c:
            com.facebook.HttpMethod r3 = com.facebook.HttpMethod.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m8040a(r14, r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo7869c(r7)
            java.lang.String r7 = "Id"
            java.lang.String r8 = r13.mo7780b()
            r6.mo7866a(r7, r8)
            java.lang.String r7 = "URL"
            r6.mo7866a(r7, r4)
            java.lang.String r7 = "Method"
            java.lang.String r8 = r14.getRequestMethod()
            r6.mo7866a(r7, r8)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo7866a(r7, r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r8)
            r6.mo7866a(r7, r8)
            int r7 = r13.mo7770a()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo7770a()
            r14.setReadTimeout(r7)
            com.facebook.HttpMethod r7 = com.facebook.HttpMethod.POST
            if (r3 != r7) goto L_0x0071
            r0 = 1
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            r6.mo7865a()
            return
        L_0x0077:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00ca }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00ca }
            r1.<init>(r14)     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x008f
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x008c }
            r14.<init>(r1)     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r13 = move-exception
            r14 = r1
            goto L_0x00cc
        L_0x008f:
            r14 = r1
        L_0x0090:
            boolean r0 = m8054e(r13)     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00ba
            com.facebook.m r0 = new com.facebook.m     // Catch:{ all -> 0x00c8 }
            android.os.Handler r1 = r13.mo7781c()     // Catch:{ all -> 0x00c8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c8 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r0
            r12 = r5
            m8036a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c8 }
            int r1 = r0.mo8089a()     // Catch:{ all -> 0x00c8 }
            java.util.Map r10 = r0.mo8092b()     // Catch:{ all -> 0x00c8 }
            com.facebook.n r0 = new com.facebook.n     // Catch:{ all -> 0x00c8 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c8 }
            r7 = r0
            r8 = r14
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c8 }
            r14 = r0
        L_0x00ba:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m8036a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c8 }
            r14.close()
            r6.mo7865a()
            return
        L_0x00c8:
            r13 = move-exception
            goto L_0x00cc
        L_0x00ca:
            r13 = move-exception
            r14 = r0
        L_0x00cc:
            if (r14 == 0) goto L_0x00d1
            r14.close()
        L_0x00d1:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m8037a(com.facebook.h, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    static void m8038a(final C2196h hVar, List<C2199i> list) {
        int size = hVar.size();
        final ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest a = hVar.get(i);
            if (a.f5229l != null) {
                arrayList.add(new Pair(a.f5229l, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C16053 r7 = new Runnable() {
                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C1609b) pair.first).mo6589a((C2199i) pair.second);
                    }
                    for (C2197a a : hVar.mo7784e()) {
                        a.mo7740a(hVar);
                    }
                }
            };
            Handler c = hVar.mo7781c();
            if (c == null) {
                r7.run();
            } else {
                c.post(r7);
            }
        }
    }

    /* renamed from: a */
    private static void m8039a(String str, Object obj, C1611d dVar, boolean z) {
        String str2;
        String jSONObject;
        String str3;
        Class cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (z) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    m8039a(String.format("%s[%s]", new Object[]{str, str4}), jSONObject2.opt(str4), dVar, z);
                }
                return;
            }
            if (jSONObject2.has("id")) {
                str3 = "id";
            } else if (jSONObject2.has("url")) {
                str3 = "url";
            } else if (jSONObject2.has("fbsdk:create_object")) {
                jSONObject = jSONObject2.toString();
                m8039a(str, (Object) jSONObject, dVar, z);
            } else {
                return;
            }
            jSONObject = jSONObject2.optString(str3);
            m8039a(str, (Object) jSONObject, dVar, z);
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m8039a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), dVar, z);
            }
        } else {
            if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
                str2 = obj.toString();
            } else if (Date.class.isAssignableFrom(cls)) {
                str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            } else {
                return;
            }
            dVar.mo6591a(str, str2);
        }
    }

    /* renamed from: a */
    private static void m8040a(HttpURLConnection httpURLConnection, boolean z) {
        String str;
        String o;
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            str = "Content-Encoding";
            o = "gzip";
        } else {
            str = "Content-Type";
            o = m8061o();
        }
        httpURLConnection.setRequestProperty(str, o);
    }

    /* renamed from: a */
    private static void m8041a(Map<String, C1608a> map, C1613f fVar) {
        for (String str : map.keySet()) {
            C1608a aVar = (C1608a) map.get(str);
            if (m8053d(aVar.mo6601b())) {
                fVar.mo6608a(str, aVar.mo6601b(), aVar.mo6600a());
            }
        }
    }

    /* renamed from: a */
    private void m8042a(JSONArray jSONArray, Map<String, C1608a> map) {
        JSONObject jSONObject = new JSONObject();
        if (this.f5225h != null) {
            jSONObject.put("name", this.f5225h);
            jSONObject.put("omit_response_on_success", this.f5227j);
        }
        if (this.f5226i != null) {
            jSONObject.put("depends_on", this.f5226i);
        }
        String k = mo6586k();
        jSONObject.put("relative_url", k);
        jSONObject.put("method", this.f5222e);
        if (this.f5221d != null) {
            C2240r.m10260a(this.f5221d.mo6518b());
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f5228k.keySet()) {
            Object obj = this.f5228k.get(str);
            if (m8053d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C1608a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f5224g != null) {
            final ArrayList arrayList2 = new ArrayList();
            m8043a(this.f5224g, k, (C1611d) new C1611d() {
                /* renamed from: a */
                public void mo6591a(String str, String str2) {
                    arrayList2.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
                }
            });
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8043a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C1611d r8) {
        /*
            boolean r0 = m8044a(r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            m8039a(r3, r4, r8, r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m8043a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$d):void");
    }

    /* renamed from: a */
    private static boolean m8044a(String str) {
        Matcher matcher = f5219c.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        return str.startsWith("me/") || str.startsWith("/me/");
    }

    /* renamed from: b */
    public static C2195g m8045b(Collection<GraphRequest> collection) {
        return m8050c(new C2196h(collection));
    }

    /* renamed from: b */
    public static C2195g m8046b(GraphRequest... graphRequestArr) {
        C2264y.m10422a((Object) graphRequestArr, "requests");
        return m8045b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: b */
    public static List<C2199i> m8047b(C2196h hVar) {
        C2264y.m10430c(hVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection a = m8029a(hVar);
            try {
                List<C2199i> a2 = m8031a(a, hVar);
                C2258x.m10386a((URLConnection) a);
                return a2;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = a;
                C2258x.m10386a((URLConnection) httpURLConnection);
                throw th;
            }
        } catch (Exception e) {
            List<C2199i> a3 = C2199i.m10132a(hVar.mo7783d(), (HttpURLConnection) null, new FacebookException((Throwable) e));
            m8038a(hVar, a3);
            C2258x.m10386a((URLConnection) null);
            return a3;
        } catch (Throwable th2) {
            th = th2;
            C2258x.m10386a((URLConnection) httpURLConnection);
            throw th;
        }
    }

    /* renamed from: b */
    static final boolean m8048b(GraphRequest graphRequest) {
        String d = graphRequest.mo6579d();
        boolean z = true;
        if (C2258x.m10392a(d)) {
            return true;
        }
        if (d.startsWith("v")) {
            d = d.substring(1);
        }
        String[] split = d.split("\\.");
        if ((split.length < 2 || Integer.parseInt(split[0]) <= 2) && (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4)) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static C2195g m8050c(C2196h hVar) {
        C2264y.m10430c(hVar, "requests");
        C2195g gVar = new C2195g(hVar);
        gVar.executeOnExecutor(C2189f.m10090d(), new Void[0]);
        return gVar;
    }

    /* renamed from: d */
    static final void m8052d(C2196h hVar) {
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (HttpMethod.GET.equals(graphRequest.mo6578c()) && m8048b(graphRequest)) {
                Bundle e = graphRequest.mo6580e();
                if (!e.containsKey("fields") || C2258x.m10392a(e.getString("fields"))) {
                    C2240r.m10257a(LoggingBehavior.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo6577b());
                }
            }
        }
    }

    /* renamed from: d */
    private static boolean m8053d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* renamed from: e */
    private static boolean m8054e(C2196h hVar) {
        for (C2197a aVar : hVar.mo7784e()) {
            if (aVar instanceof C2198b) {
                return true;
            }
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).mo6582g() instanceof C1612e) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m8055e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m8056f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: f */
    private static boolean m8057f(C2196h hVar) {
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f5228k.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m8053d(graphRequest.f5228k.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    private static String m8058g(C2196h hVar) {
        if (!C2258x.m10392a(hVar.mo7785f())) {
            return hVar.mo7785f();
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f5221d;
            if (accessToken != null) {
                String h = accessToken.mo6526h();
                if (h != null) {
                    return h;
                }
            }
        }
        return !C2258x.m10392a(f5218b) ? f5218b : C2189f.m10096j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8059m() {
        /*
            r3 = this;
            com.facebook.AccessToken r0 = r3.f5221d
            if (r0 == 0) goto L_0x001f
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "access_token"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x005d
            com.facebook.AccessToken r0 = r3.f5221d
            java.lang.String r0 = r0.mo6518b()
            com.facebook.internal.C2240r.m10260a(r0)
        L_0x0017:
            android.os.Bundle r1 = r3.f5228k
            java.lang.String r2 = "access_token"
            r1.putString(r2, r0)
            goto L_0x005d
        L_0x001f:
            boolean r0 = r3.f5233p
            if (r0 != 0) goto L_0x005d
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "access_token"
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = com.facebook.C2189f.m10096j()
            java.lang.String r1 = com.facebook.C2189f.m10098l()
            boolean r2 = com.facebook.internal.C2258x.m10392a(r0)
            if (r2 != 0) goto L_0x0056
            boolean r2 = com.facebook.internal.C2258x.m10392a(r1)
            if (r2 != 0) goto L_0x0056
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "|"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x0017
        L_0x0056:
            java.lang.String r0 = f5217a
            java.lang.String r1 = "Warning: Request without access token missing application ID or client token."
            android.util.Log.d(r0, r1)
        L_0x005d:
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO
            boolean r0 = com.facebook.C2189f.m10084a(r0)
            if (r0 == 0) goto L_0x0081
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "debug"
            java.lang.String r2 = "info"
        L_0x007d:
            r0.putString(r1, r2)
            goto L_0x0090
        L_0x0081:
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING
            boolean r0 = com.facebook.C2189f.m10084a(r0)
            if (r0 == 0) goto L_0x0090
            android.os.Bundle r0 = r3.f5228k
            java.lang.String r1 = "debug"
            java.lang.String r2 = "warning"
            goto L_0x007d
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m8059m():void");
    }

    /* renamed from: n */
    private String m8060n() {
        if (f5219c.matcher(this.f5223f).matches()) {
            return this.f5223f;
        }
        return String.format("%s/%s", new Object[]{this.f5232o, this.f5223f});
    }

    /* renamed from: o */
    private static String m8061o() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{"3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"});
    }

    /* renamed from: p */
    private static String m8062p() {
        if (f5220q == null) {
            f5220q = String.format("%s.%s", new Object[]{"FBAndroidSDK", "4.32.0"});
            String a = C2237p.m10252a();
            if (!C2258x.m10392a(a)) {
                f5220q = String.format(Locale.ROOT, "%s/%s", new Object[]{f5220q, a});
            }
        }
        return f5220q;
    }

    /* renamed from: a */
    public final JSONObject mo6570a() {
        return this.f5224g;
    }

    /* renamed from: a */
    public final void mo6571a(Bundle bundle) {
        this.f5228k = bundle;
    }

    /* renamed from: a */
    public final void mo6572a(final C1609b bVar) {
        if (C2189f.m10084a(LoggingBehavior.GRAPH_API_DEBUG_INFO) || C2189f.m10084a(LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            this.f5229l = new C1609b() {
                /* renamed from: a */
                public void mo6589a(C2199i iVar) {
                    JSONObject b = iVar.mo7796b();
                    JSONObject optJSONObject = b != null ? b.optJSONObject("__debug__") : null;
                    JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                            String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                            String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                            String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                            if (!(optString == null || optString2 == null)) {
                                LoggingBehavior loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
                                if (optString2.equals("warning")) {
                                    loggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                                }
                                if (!C2258x.m10392a(optString3)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(optString);
                                    sb.append(" Link: ");
                                    sb.append(optString3);
                                    optString = sb.toString();
                                }
                                C2240r.m10258a(loggingBehavior, GraphRequest.f5217a, optString);
                            }
                        }
                    }
                    if (bVar != null) {
                        bVar.mo6589a(iVar);
                    }
                }
            };
        } else {
            this.f5229l = bVar;
        }
    }

    /* renamed from: a */
    public final void mo6573a(HttpMethod httpMethod) {
        if (this.f5230m == null || httpMethod == HttpMethod.GET) {
            if (httpMethod == null) {
                httpMethod = HttpMethod.GET;
            }
            this.f5222e = httpMethod;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: a */
    public final void mo6574a(Object obj) {
        this.f5231n = obj;
    }

    /* renamed from: a */
    public final void mo6575a(JSONObject jSONObject) {
        this.f5224g = jSONObject;
    }

    /* renamed from: a */
    public final void mo6576a(boolean z) {
        this.f5233p = z;
    }

    /* renamed from: b */
    public final String mo6577b() {
        return this.f5223f;
    }

    /* renamed from: c */
    public final HttpMethod mo6578c() {
        return this.f5222e;
    }

    /* renamed from: d */
    public final String mo6579d() {
        return this.f5232o;
    }

    /* renamed from: e */
    public final Bundle mo6580e() {
        return this.f5228k;
    }

    /* renamed from: f */
    public final AccessToken mo6581f() {
        return this.f5221d;
    }

    /* renamed from: g */
    public final C1609b mo6582g() {
        return this.f5229l;
    }

    /* renamed from: h */
    public final Object mo6583h() {
        return this.f5231n;
    }

    /* renamed from: i */
    public final C2199i mo6584i() {
        return m8027a(this);
    }

    /* renamed from: j */
    public final C2195g mo6585j() {
        return m8046b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final String mo6586k() {
        if (this.f5230m == null) {
            String format = String.format("%s/%s", new Object[]{C2257w.m10352b(), m8060n()});
            m8059m();
            Uri parse = Uri.parse(m8028a(format, Boolean.valueOf(true)));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final String mo6587l() {
        if (this.f5230m != null) {
            return this.f5230m.toString();
        }
        String format = String.format("%s/%s", new Object[]{(mo6578c() != HttpMethod.POST || this.f5223f == null || !this.f5223f.endsWith("/videos")) ? C2257w.m10352b() : C2257w.m10353c(), m8060n()});
        m8059m();
        return m8028a(format, Boolean.valueOf(false));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        sb.append(this.f5221d == null ? "null" : this.f5221d);
        sb.append(", graphPath: ");
        sb.append(this.f5223f);
        sb.append(", graphObject: ");
        sb.append(this.f5224g);
        sb.append(", httpMethod: ");
        sb.append(this.f5222e);
        sb.append(", parameters: ");
        sb.append(this.f5228k);
        sb.append("}");
        return sb.toString();
    }
}
