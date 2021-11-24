package com.pollfish.p147c;

import android.os.AsyncTask;
import com.pollfish.p150f.C5162b;
import com.pollfish.p153g.C5169c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.pollfish.c.g */
public class C5118g extends AsyncTask {

    /* renamed from: a */
    private String f18294a = "";

    /* renamed from: b */
    private HashMap f18295b = null;

    /* renamed from: c */
    private C5169c f18296c;

    /* renamed from: d */
    private String f18297d;

    public C5118g(String str, HashMap hashMap, C5169c cVar, String str2) {
        this.f18294a = str;
        this.f18295b = hashMap;
        this.f18296c = cVar;
        this.f18297d = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(String... strArr) {
        if (this.f18294a != null) {
            C5162b.m25518a("LoadContentInWebViewTask", "Html assets do not exist in cache- start replacing relative paths");
            try {
                C5162b.m25518a("LoadContentInWebViewTask", "replacing things in temp webview content");
                if (this.f18295b != null) {
                    Iterator it = this.f18295b.entrySet().iterator();
                    while (it.hasNext()) {
                        Entry entry = (Entry) it.next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append("key: ");
                        sb.append(entry.getKey());
                        sb.append(" = ");
                        sb.append(entry.getValue());
                        C5162b.m25518a("LoadContentInWebViewTask", sb.toString());
                        it.remove();
                        this.f18294a = this.f18294a.replaceAll(str, str2);
                    }
                }
                C5162b.m25518a("LoadContentInWebViewTask", "finished replacing things in temp webview content");
                return Boolean.valueOf(true);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error while replacing web content html:");
                sb2.append(e);
                C5162b.m25519b("LoadContentInWebViewTask", sb2.toString());
            }
        }
        return Boolean.valueOf(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadContentInWebViewTask onPostExecute: ");
        sb.append(bool);
        C5162b.m25518a("LoadContentInWebViewTask", sb.toString());
        if (bool.booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file:///");
            sb2.append(this.f18297d);
            this.f18296c.loadDataWithBaseURL(sb2.toString(), this.f18294a, "text/html", "utf-8", null);
            this.f18296c.setBackgroundColor(0);
        }
        super.onPostExecute(bool);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        C5162b.m25518a("LoadContentInWebViewTask", "LoadContentInWebViewTask: onPreExecute");
        super.onPreExecute();
    }
}
