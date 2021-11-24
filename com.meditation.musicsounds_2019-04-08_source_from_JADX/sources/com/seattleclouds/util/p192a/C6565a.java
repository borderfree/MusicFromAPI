package com.seattleclouds.util.p192a;

import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.seattleclouds.util.a.a */
public class C6565a extends Thread {

    /* renamed from: a */
    private DefaultHttpClient f23235a = new DefaultHttpClient();

    /* renamed from: b */
    private HttpUriRequest f23236b;

    /* renamed from: c */
    private Handler f23237c;

    /* renamed from: d */
    private C6566b f23238d;

    protected C6565a(HttpUriRequest httpUriRequest, Handler handler, C6566b bVar) {
        this.f23236b = httpUriRequest;
        this.f23237c = handler;
        this.f23238d = bVar;
    }

    /* renamed from: a */
    private HttpClient m31782a() {
        return this.f23235a;
    }

    public void run() {
        String str;
        String str2;
        HttpResponse execute;
        try {
            synchronized (this.f23235a) {
                execute = m31782a().execute(this.f23236b);
            }
            this.f23238d.mo20540a(execute);
            this.f23237c.post(this.f23238d);
            return;
        } catch (SecurityException e) {
            e = e;
            str2 = "AsynchronousSender";
            str = e.toString();
        } catch (ClientProtocolException e2) {
            e = e2;
            str2 = "AsynchronousSender";
            str = e.toString();
        } catch (ConnectTimeoutException e3) {
            this.f23238d.mo20541a(true);
            this.f23237c.post(this.f23238d);
            Log.w("AsynchronousSender", e3.toString());
            return;
        } catch (SocketTimeoutException e4) {
            Log.w("AsynchronousSender", e4.toString(), e4);
            this.f23238d.mo20541a(true);
            this.f23237c.post(this.f23238d);
            return;
        } catch (IOException e5) {
            e = e5;
            this.f23237c.post(this.f23238d);
            str2 = "AsynchronousSender";
            str = e.toString();
        } catch (IllegalArgumentException e6) {
            Log.w("AsynchronousSender", e6.toString(), e6);
            return;
        }
        Log.e(str2, str, e);
    }
}
