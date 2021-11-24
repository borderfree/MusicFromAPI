package com.seattleclouds.modules.p186s;

import android.os.AsyncTask;
import android.util.Log;
import com.seattleclouds.App;
import java.io.File;
import java.io.FileInputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/* renamed from: com.seattleclouds.modules.s.e */
class C6263e extends AsyncTask<String, Void, Void> {

    /* renamed from: b */
    private static final String f22225b = "e";

    /* renamed from: a */
    boolean f22226a = false;

    C6263e() {
    }

    /* renamed from: a */
    private void m30448a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/sendemail.ashx?username=");
        sb.append(App.f18523y);
        sb.append("&appid=");
        sb.append(App.f18524z);
        sb.append("&pageid=");
        sb.append(str2);
        sb.append("&publisherid=");
        sb.append(App.f18522x);
        sb.append("&email=");
        sb.append(str3);
        String sb2 = sb.toString();
        File file = new File(str);
        try {
            if (file.exists() && str3 != null) {
                if (str3.length() != 0) {
                    DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost(sb2);
                    InputStreamEntity inputStreamEntity = new InputStreamEntity(new FileInputStream(file), -1);
                    inputStreamEntity.setContentType("binary/octet-stream");
                    inputStreamEntity.setChunked(true);
                    httpPost.setEntity(inputStreamEntity);
                    HttpResponse execute = defaultHttpClient.execute(httpPost);
                    if (this.f22226a && execute != null) {
                        String str4 = f22225b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Email sent with response");
                        sb3.append(execute.toString());
                        Log.d(str4, sb3.toString());
                    }
                }
            }
        } catch (Exception e) {
            String str5 = f22225b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ERROR: ");
            sb4.append(e.getMessage());
            Log.e(str5, sb4.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void doInBackground(String... strArr) {
        m30448a(strArr[0], strArr[1], strArr[2]);
        return null;
    }
}
