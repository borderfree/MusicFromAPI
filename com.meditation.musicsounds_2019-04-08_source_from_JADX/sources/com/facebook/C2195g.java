package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.g */
public class C2195g extends AsyncTask<Void, Void, List<C2199i>> {

    /* renamed from: a */
    private static final String f7128a = C2195g.class.getCanonicalName();

    /* renamed from: b */
    private final HttpURLConnection f7129b;

    /* renamed from: c */
    private final C2196h f7130c;

    /* renamed from: d */
    private Exception f7131d;

    public C2195g(C2196h hVar) {
        this(null, hVar);
    }

    public C2195g(HttpURLConnection httpURLConnection, C2196h hVar) {
        this.f7130c = hVar;
        this.f7129b = httpURLConnection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C2199i> doInBackground(Void... voidArr) {
        try {
            return this.f7129b == null ? this.f7130c.mo7786g() : GraphRequest.m8031a(this.f7129b, this.f7130c);
        } catch (Exception e) {
            this.f7131d = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<C2199i> list) {
        super.onPostExecute(list);
        if (this.f7131d != null) {
            Log.d(f7128a, String.format("onPostExecute: exception encountered during request: %s", new Object[]{this.f7131d.getMessage()}));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        super.onPreExecute();
        if (C2189f.m10086b()) {
            Log.d(f7128a, String.format("execute async task: %s", new Object[]{this}));
        }
        if (this.f7130c.mo7781c() == null) {
            this.f7130c.mo7773a(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.f7129b);
        sb.append(", requests: ");
        sb.append(this.f7130c);
        sb.append("}");
        return sb.toString();
    }
}
