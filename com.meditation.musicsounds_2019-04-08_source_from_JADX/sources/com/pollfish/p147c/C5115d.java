package com.pollfish.p147c;

import android.app.Activity;
import android.os.AsyncTask;
import com.pollfish.p150f.C5162b;
import java.io.File;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.d */
public class C5115d extends AsyncTask {

    /* renamed from: a */
    private Activity f18275a;

    /* renamed from: b */
    private String f18276b;

    public C5115d(Activity activity) {
        this.f18275a = activity;
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getCacheDir().getAbsolutePath());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("pollfish_queue");
        this.f18276b = sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(Void... voidArr) {
        boolean z;
        C5162b.m25518a("ClearQueueTask", "clearing queue");
        StringBuilder sb = new StringBuilder();
        sb.append("queueFilePath: ");
        sb.append(this.f18276b);
        C5162b.m25518a("ClearQueueTask", sb.toString());
        try {
            File file = new File(this.f18276b);
            if (file.exists()) {
                mo16683a(file);
            }
            z = true;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error  while clearing queue: ");
            sb2.append(e);
            C5162b.m25519b("ClearQueueTask", sb2.toString());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16683a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                mo16683a(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("delete file with path: ");
        sb.append(file.getAbsolutePath());
        C5162b.m25518a("ClearQueueTask", sb.toString());
        file.delete();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cleaned queue sucessfully: ");
        sb.append(bool);
        C5162b.m25518a("ClearQueueTask", sb.toString());
        super.onPostExecute(bool);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        C5162b.m25518a("ClearQueueTask", "ClearRequestQueueTask: onPreExecute");
        super.onPreExecute();
    }
}
