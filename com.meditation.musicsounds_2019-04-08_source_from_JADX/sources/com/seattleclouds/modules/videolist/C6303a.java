package com.seattleclouds.modules.videolist;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.util.C6608d;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.seattleclouds.modules.videolist.a */
public class C6303a extends AsyncTask<Object, Void, List<VideoFile>> {

    /* renamed from: a */
    static final String f22388a = "a";

    /* renamed from: b */
    C6608d f22389b;

    /* renamed from: a */
    private List<VideoFile> m30660a(String str) {
        new ArrayList(0);
        if (App.m25667n(str)) {
            C6320c cVar = new C6320c();
            InputStream e = App.m25649e(str);
            if (e != null) {
                List<VideoFile> a = cVar.mo19731a(e);
                for (VideoFile videoFile : a) {
                    videoFile.mo19707f(m30661b(videoFile.mo19704e()));
                }
                for (VideoFile videoFile2 : a) {
                    String str2 = f22388a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("uid: ");
                    sb.append(videoFile2.mo19697b());
                    sb.append(" title: ");
                    sb.append(videoFile2.mo19692a());
                    sb.append(" image_thmb: ");
                    sb.append(videoFile2.mo19706f());
                    sb.append(" file_url: ");
                    sb.append(videoFile2.mo19704e());
                    Log.d(str2, sb.toString());
                }
                return a;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("XML file not found! Path:");
            sb2.append(str);
            throw new FileNotFoundException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("XML file not found! Path:");
        sb3.append(str);
        throw new FileNotFoundException(sb3.toString());
    }

    /* renamed from: b */
    private String m30661b(String str) {
        return str != null ? Uri.parse(str).getLastPathSegment() : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<VideoFile> doInBackground(Object... objArr) {
        List<VideoFile> arrayList = new ArrayList<>(0);
        try {
            String str = (String) String.class.cast(objArr[0]);
            this.f22389b = (C6608d) C6608d.class.cast(objArr[1]);
            List<VideoFile> a = m30660a(str);
            try {
                if (isCancelled()) {
                    a = null;
                }
                return a;
            } catch (Exception e) {
                Exception exc = e;
                arrayList = a;
                e = exc;
                String str2 = f22388a;
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR: ");
                sb.append(e.getLocalizedMessage());
                Log.e(str2, sb.toString(), e);
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            String str22 = f22388a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR: ");
            sb2.append(e.getLocalizedMessage());
            Log.e(str22, sb2.toString(), e);
            return arrayList;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<VideoFile> list) {
        this.f22389b.mo16855a(list);
        super.onPostExecute(list);
    }
}
