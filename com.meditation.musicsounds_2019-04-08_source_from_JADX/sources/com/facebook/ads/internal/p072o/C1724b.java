package com.facebook.ads.internal.p072o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p071m.C1721a;
import com.facebook.ads.internal.p073r.p074a.C1735a;
import com.facebook.ads.internal.p073r.p074a.C1745i;
import com.facebook.ads.internal.p073r.p074a.C1748l;
import com.facebook.ads.internal.p077s.p080c.C1826d;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.o.b */
public class C1724b {

    /* renamed from: a */
    private static final String f5673a = "b";

    /* renamed from: b */
    private final C1727a f5674b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ThreadPoolExecutor f5675c;

    /* renamed from: d */
    private final ConnectivityManager f5676d;

    /* renamed from: e */
    private final C1735a f5677e;

    /* renamed from: f */
    private final Handler f5678f;

    /* renamed from: g */
    private final long f5679g;

    /* renamed from: h */
    private final long f5680h;

    /* renamed from: i */
    private final Context f5681i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Runnable f5682j = new Runnable() {
        public void run() {
            C1724b.m8634a(C1724b.this);
            if (C1724b.this.f5686n > 0) {
                try {
                    Thread.sleep(C1724b.this.f5686n);
                } catch (InterruptedException unused) {
                }
            }
            C1724b.this.mo6930c();
        }
    };

    /* renamed from: k */
    private final Runnable f5683k = new Runnable() {
        public void run() {
            C1724b.this.f5684l = false;
            if (C1724b.this.f5675c.getQueue().isEmpty()) {
                C1724b.this.f5675c.execute(C1724b.this.f5682j);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f5684l;

    /* renamed from: m */
    private int f5685m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f5686n;

    /* renamed from: com.facebook.ads.internal.o.b$a */
    public interface C1727a {
        /* renamed from: a */
        JSONObject mo6933a();

        /* renamed from: a */
        boolean mo6934a(JSONArray jSONArray);

        /* renamed from: b */
        void mo6935b();

        /* renamed from: b */
        void mo6936b(JSONArray jSONArray);

        /* renamed from: c */
        void mo6937c();

        /* renamed from: d */
        boolean mo6938d();
    }

    C1724b(Context context, C1727a aVar) {
        this.f5674b = aVar;
        this.f5681i = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f5675c = threadPoolExecutor;
        this.f5676d = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5677e = C1826d.m8976b(context);
        this.f5678f = new Handler(Looper.getMainLooper());
        this.f5679g = C1713a.m8582m(context);
        this.f5680h = C1713a.m8583n(context);
    }

    /* renamed from: a */
    static /* synthetic */ int m8634a(C1724b bVar) {
        int i = bVar.f5685m + 1;
        bVar.f5685m = i;
        return i;
    }

    /* renamed from: a */
    private void m8635a(long j) {
        this.f5678f.postDelayed(this.f5683k, j);
    }

    /* renamed from: d */
    private void m8640d() {
        if (this.f5685m >= 5) {
            m8641e();
            mo6929b();
            return;
        }
        this.f5686n = this.f5685m == 1 ? 2000 : this.f5686n * 2;
        mo6928a();
    }

    /* renamed from: e */
    private void m8641e() {
        this.f5685m = 0;
        this.f5686n = 0;
        if (this.f5675c.getQueue().size() == 0) {
            this.f5674b.mo6935b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6928a() {
        this.f5684l = true;
        this.f5678f.removeCallbacks(this.f5683k);
        m8635a(this.f5679g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6929b() {
        if (!this.f5684l) {
            this.f5684l = true;
            this.f5678f.removeCallbacks(this.f5683k);
            m8635a(this.f5680h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo6930c() {
        C1727a aVar;
        JSONArray jSONArray;
        try {
            NetworkInfo activeNetworkInfo = this.f5676d.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    JSONObject a = this.f5674b.mo6933a();
                    if (a == null) {
                        m8641e();
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("attempt", String.valueOf(this.f5685m));
                    a.put("data", jSONObject);
                    C1748l lVar = new C1748l();
                    lVar.put("payload", a.toString());
                    C1745i b = this.f5677e.mo6966b(C1721a.m8615a(this.f5681i), lVar);
                    String e = b != null ? b.mo6991e() : null;
                    if (TextUtils.isEmpty(e)) {
                        if (a.has("events")) {
                            aVar = this.f5674b;
                            jSONArray = a.getJSONArray("events");
                        }
                        m8640d();
                        return;
                    }
                    if (b.mo6987a() == 200) {
                        if (this.f5674b.mo6934a(new JSONArray(e))) {
                            if (this.f5674b.mo6938d()) {
                            }
                        }
                        m8640d();
                        return;
                    } else if (b.mo6987a() != 413 || !C1713a.m8587r(this.f5681i)) {
                        if (a.has("events")) {
                            aVar = this.f5674b;
                            jSONArray = a.getJSONArray("events");
                        }
                        m8640d();
                        return;
                    } else {
                        this.f5674b.mo6937c();
                    }
                    m8641e();
                    return;
                    aVar.mo6936b(jSONArray);
                    m8640d();
                    return;
                }
            }
            m8635a(this.f5680h);
        } catch (Exception unused) {
            m8640d();
        }
    }
}
