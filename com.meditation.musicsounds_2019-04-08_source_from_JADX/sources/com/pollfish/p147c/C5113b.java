package com.pollfish.p147c;

import android.app.Activity;
import com.pollfish.interfaces.C5174a.C5179e;
import com.pollfish.p150f.C5162b;
import java.io.File;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.pollfish.c.b */
public class C5113b extends C5119h {

    /* renamed from: a */
    Activity f18266a;

    /* renamed from: b */
    private String f18267b = "";

    /* renamed from: c */
    private C5179e f18268c = null;

    /* renamed from: d */
    private String f18269d;

    public C5113b(String str, Activity activity, C5179e eVar) {
        this.f18267b = str;
        this.f18266a = activity;
        this.f18268c = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getApplicationContext().getCacheDir().getAbsolutePath());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("pollfish_queue");
        this.f18269d = sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void mo16674a(Void... voidArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("check queue on return from server for file: ");
        sb.append(this.f18267b);
        C5162b.m25518a("CheckQueueOnReturnTask", sb.toString());
        try {
            File file = new File(this.f18269d);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Queue size: ");
                    sb2.append(listFiles.length);
                    sb2.append(" after returning from server before deleting file: ");
                    sb2.append(this.f18267b);
                    C5162b.m25518a("CheckQueueOnReturnTask", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f18269d);
                    sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb3.append(this.f18267b);
                    File file2 = new File(sb3.toString());
                    if (file2.exists()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("File in queue with name: ");
                        sb4.append(this.f18267b);
                        sb4.append(" exists in queue");
                        C5162b.m25518a("CheckQueueOnReturnTask", sb4.toString());
                        boolean delete = file2.delete();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("File in queue with name: ");
                        sb5.append(this.f18267b);
                        sb5.append(" deleted: ");
                        sb5.append(delete);
                        C5162b.m25518a("CheckQueueOnReturnTask", sb5.toString());
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("File in queue with name: ");
                        sb6.append(this.f18267b);
                        sb6.append(" does not exist");
                        C5162b.m25518a("CheckQueueOnReturnTask", sb6.toString());
                    }
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 != null) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Queue size: ");
                        sb7.append(listFiles2.length);
                        sb7.append(" after deleting: ");
                        sb7.append(this.f18267b);
                        C5162b.m25518a("CheckQueueOnReturnTask", sb7.toString());
                        if (this.f18268c != null && listFiles2.length == 0) {
                            C5162b.m25518a("CheckQueueOnReturnTask", "Queue is empty proceed to register");
                            this.f18268c.mo16788a();
                        }
                        for (int i = 0; i < listFiles2.length; i++) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("Files left in queue [");
                            sb8.append(i);
                            sb8.append("]: ");
                            sb8.append(listFiles2[i].getName());
                            C5162b.m25518a("CheckQueueOnReturnTask", sb8.toString());
                        }
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Error while cleaning queue after returning from sucessfuly sent on server: ");
            sb9.append(e);
            C5162b.m25519b("CheckQueueOnReturnTask", sb9.toString());
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16676a() {
        super.mo16676a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(Void voidR) {
        super.mo16677a((Object) voidR);
    }
}
