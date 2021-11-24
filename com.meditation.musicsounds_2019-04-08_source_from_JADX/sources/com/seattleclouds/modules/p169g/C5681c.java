package com.seattleclouds.modules.p169g;

import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.HTTPUtil;
import com.seattleclouds.util.HTTPUtil.HttpUnauthorizedException;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.HashMap;
import org.apache.commons.p198io.C6732d;

/* renamed from: com.seattleclouds.modules.g.c */
class C5681c extends AsyncTask<Object, Integer, Integer> {

    /* renamed from: a */
    private static final String f20182a = "c";

    /* renamed from: b */
    private C6608d f20183b;

    C5681c() {
    }

    /* renamed from: a */
    private void m28075a(String str, InputStream inputStream) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(new URI(App.m25655h(str)))));
        C6732d.m32479a(inputStream, (OutputStream) bufferedOutputStream);
        bufferedOutputStream.close();
        inputStream.close();
    }

    /* renamed from: a */
    public int mo18275a(String str, String str2) {
        try {
            m28075a(str, HTTPUtil.m31759a(URLDecoder.decode(str2, "UTF-8"), true, true));
            return 2;
        } catch (HttpUnauthorizedException unused) {
            return 0;
        } catch (IOException | URISyntaxException e) {
            Log.e(f20182a, "ERROR: Can't get the file", e);
            return 1;
        }
    }

    /* renamed from: a */
    public int mo18276a(String str, String str2, String str3, String str4) {
        String str5;
        String message;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(str2);
            String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 2);
            HashMap hashMap = new HashMap();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Basic ");
            sb2.append(encodeToString);
            hashMap.put("Authorization", sb2.toString());
            m28075a(str3, HTTPUtil.m31757a(str4, 30000, hashMap, true));
            return 2;
        } catch (IOException e) {
            if (e.getMessage().equals("401 - UNAUTHORIZED")) {
                return 0;
            }
            str5 = f20182a;
            message = e.getMessage();
            r6 = e;
            Log.e(str5, message, r6);
            return 1;
        } catch (URISyntaxException e2) {
            str5 = f20182a;
            message = e2.getMessage();
            r6 = e2;
            Log.e(str5, message, r6);
            return 1;
        }
    }

    /* renamed from: a */
    public C5681c mo18277a(C6608d dVar) {
        this.f20183b = dVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer doInBackground(Object... objArr) {
        String str = objArr[0];
        String str2 = objArr[1];
        return Integer.valueOf(objArr.length == 4 ? mo18276a(objArr[2], objArr[3], str, str2) : mo18275a(str, str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        try {
            if (this.f20183b != null) {
                this.f20183b.mo16855a(num);
            }
        } catch (Exception e) {
            String str = f20182a;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
        }
    }
}
