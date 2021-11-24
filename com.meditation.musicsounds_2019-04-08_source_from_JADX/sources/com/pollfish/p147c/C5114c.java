package com.pollfish.p147c;

import android.app.Activity;
import com.pollfish.interfaces.C5174a.C5177c;
import com.pollfish.interfaces.C5174a.C5179e;
import com.pollfish.p145a.C5108c;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.c */
public class C5114c extends C5119h {

    /* renamed from: a */
    private C5108c f18270a;

    /* renamed from: b */
    private C5177c f18271b;

    /* renamed from: c */
    private Activity f18272c;

    /* renamed from: d */
    private C5179e f18273d;

    /* renamed from: e */
    private String f18274e;

    public C5114c(C5108c cVar, C5177c cVar2, C5179e eVar, Activity activity) {
        this.f18270a = cVar;
        this.f18271b = cVar2;
        this.f18272c = activity;
        this.f18273d = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getCacheDir().getAbsolutePath());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("pollfish_queue");
        this.f18274e = sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo16674a(Void... voidArr) {
        C5162b.m25518a("CheckQueueTask", "checking queue..");
        try {
            File file = new File(this.f18274e);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Num of current files in queue: ");
                    sb.append(listFiles.length);
                    C5162b.m25518a("CheckQueueTask", sb.toString());
                    if (listFiles.length > 0) {
                        int a = C5166c.m25527a(this.f18272c, "pollfish_pref_queue") + 1;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("numTried to empty queue: ");
                        sb2.append(a);
                        C5162b.m25518a("CheckQueueTask", sb2.toString());
                        C5166c.m25535a(this.f18272c, "pollfish_pref_queue", a);
                        C5162b.m25518a("CheckQueueTask", "Sending files from queue to server");
                        for (File a2 : listFiles) {
                            mo16680a(a2);
                        }
                        return Boolean.valueOf(true);
                    }
                    C5162b.m25518a("CheckQueueTask", "queue is empty");
                    C5166c.m25535a(this.f18272c, "pollfish_pref_queue", 0);
                }
            }
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error reading queue in cache: ");
            sb3.append(e);
            C5162b.m25519b("CheckQueueTask", sb3.toString());
        }
        return Boolean.valueOf(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16676a() {
        super.mo16676a();
    }

    /* renamed from: a */
    public void mo16680a(File file) {
        String str = "CheckQueueTask";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Send request to server from cache with name: ");
            sb.append(file.getName());
            C5162b.m25518a(str, sb.toString());
            FileInputStream fileInputStream = new FileInputStream(file.getAbsolutePath());
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
            String string = jSONObject.getString("serverUrl");
            if (string != null) {
                jSONObject.remove("serverUrl");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Queue cache file: with params size():");
                sb2.append(jSONObject.length());
                sb2.append(" and name: ");
                sb2.append(file.getName());
                sb2.append(" is being send to server url: ");
                sb2.append(string);
                C5162b.m25518a("CheckQueueTask", sb2.toString());
                C5116e eVar = new C5116e(this.f18270a, string, -1, null, jSONObject, this.f18271b, this.f18272c, false, file.getName(), null, null);
                eVar.mo16699c(new Void[0]);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Did not find a valid server url in queue to sent request for file: ");
            sb3.append(file.getName());
            C5162b.m25518a("CheckQueueTask", sb3.toString());
        } catch (Exception e) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("loadJSONFromFile Error reading queue in cache: ");
            sb4.append(e);
            sb4.append(" deleting file");
            C5162b.m25519b("CheckQueueTask", sb4.toString());
            try {
                File file2 = new File(file.getAbsolutePath());
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Exception e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error during loadJSONFromFile for file: ");
                sb5.append(file.getName());
                sb5.append(" e: ");
                sb5.append(e2);
                sb5.append(" deleting file");
                C5162b.m25519b("CheckQueueTask", sb5.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("After checking queue result: ");
        sb.append(bool);
        C5162b.m25518a("CheckQueueTask", sb.toString());
        if (this.f18273d != null && !bool.booleanValue()) {
            this.f18273d.mo16788a();
        }
        super.mo16677a((Object) bool);
    }
}
