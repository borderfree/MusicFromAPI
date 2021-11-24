package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.fw */
final class C3560fw extends C3587gw {

    /* renamed from: a */
    private final C3837qc f14003a;

    C3560fw(C3837qc qcVar) {
        this.f14003a = qcVar;
    }

    /* renamed from: a */
    public final C3809pb mo12927a(auc<?> auc, Map<String, String> map) {
        try {
            HttpResponse b = this.f14003a.mo12970b(auc, map);
            int statusCode = b.getStatusLine().getStatusCode();
            Header[] allHeaders = b.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new aod(header.getName(), header.getValue()));
            }
            if (b.getEntity() == null) {
                return new C3809pb(statusCode, arrayList);
            }
            long contentLength = b.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new C3809pb(statusCode, arrayList, (int) b.getEntity().getContentLength(), b.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
