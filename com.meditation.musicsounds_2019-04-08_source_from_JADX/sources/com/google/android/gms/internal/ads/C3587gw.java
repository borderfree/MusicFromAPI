package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* renamed from: com.google.android.gms.internal.ads.gw */
public abstract class C3587gw implements C3837qc {
    /* renamed from: a */
    public abstract C3809pb mo12927a(auc<?> auc, Map<String, String> map);

    @Deprecated
    /* renamed from: b */
    public final HttpResponse mo12970b(auc<?> auc, Map<String, String> map) {
        C3809pb a = mo12927a(auc, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), a.mo13437a(), ""));
        ArrayList arrayList = new ArrayList();
        for (aod aod : a.mo13438b()) {
            arrayList.add(new BasicHeader(aod.mo12126a(), aod.mo12127b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream d = a.mo13440d();
        if (d != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(d);
            basicHttpEntity.setContentLength((long) a.mo13439c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }
}
