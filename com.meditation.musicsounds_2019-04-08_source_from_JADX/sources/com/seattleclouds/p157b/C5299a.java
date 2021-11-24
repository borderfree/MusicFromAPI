package com.seattleclouds.p157b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;
import android.util.Xml;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p198io.C6730b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.seattleclouds.b.a */
public class C5299a extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    private static final String f18974a = "a";

    /* renamed from: b */
    private final Activity f18975b;

    /* renamed from: c */
    private ProgressDialog f18976c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6608d f18977d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f18978e = false;

    public C5299a(Activity activity) {
        this.f18975b = activity;
    }

    /* renamed from: a */
    private List<String> m26509a() {
        String str;
        StringBuilder sb;
        String str2;
        ArrayList arrayList = new ArrayList();
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(App.m25649e("sc_external_storage_resources.xml"), null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        if (newPullParser.getName().equalsIgnoreCase("file")) {
                            String attributeValue = newPullParser.getAttributeValue(null, "source");
                            if (!(attributeValue == null || attributeValue.length() == 0)) {
                                arrayList.add(attributeValue);
                            }
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            str2 = f18974a;
            sb = new StringBuilder();
            sb.append("Error parsing external resource list file ");
            str = e.toString();
            r1 = e;
            sb.append(str);
            Log.e(str2, sb.toString(), r1);
            return arrayList;
        } catch (IOException e2) {
            str2 = f18974a;
            sb = new StringBuilder();
            sb.append("Error parsing external resource list file ");
            str = e2.toString();
            r1 = e2;
            sb.append(str);
            Log.e(str2, sb.toString(), r1);
            return arrayList;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        List<String> a = m26509a();
        if (a.size() == 0) {
            Log.w(f18974a, "External resource file list is empty, nothing to download");
            return "ok";
        } else if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.w(f18974a, "External resource file list is empty, nothing to download");
            return "NO_EXTERNAL_STORAGE_RESULT";
        } else {
            String j = App.m25659j();
            File file = new File(j);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(File.separator);
            String sb2 = sb.toString();
            this.f18976c.setMax(a.size());
            int i = 0;
            for (String str : a) {
                if (this.f18978e) {
                    break;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(Uri.parse(str).getLastPathSegment());
                File file2 = new File(sb3.toString());
                if (!file2.exists()) {
                    String str2 = f18974a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Downloading file: ");
                    sb4.append(str);
                    Log.v(str2, sb4.toString());
                    try {
                        C6730b.m32462a(new URL(str), file2, 3000, 3000);
                    } catch (Exception e) {
                        String str3 = f18974a;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Error downloading file: ");
                        sb5.append(str);
                        Log.e(str3, sb5.toString(), e);
                    }
                } else {
                    String str4 = f18974a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("File already exists: ");
                    sb6.append(str);
                    Log.v(str4, sb6.toString());
                }
                i++;
                publishProgress(new Integer[]{Integer.valueOf(i)});
            }
            String str5 = f18974a;
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Downloaded ");
            sb7.append(i);
            sb7.append(" out of ");
            sb7.append(a.size());
            sb7.append(" files");
            Log.v(str5, sb7.toString());
            return "ok";
        }
    }

    /* renamed from: a */
    public void mo17393a(C6608d dVar) {
        this.f18977d = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        this.f18976c.dismiss();
        if (str.equals("NO_EXTERNAL_STORAGE_RESULT")) {
            C6620n.m32029a((Context) this.f18975b, C5462k.error, C5462k.error_cant_download_external_resources, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C5299a.this.f18977d != null) {
                        C5299a.this.f18977d.mo16855a(null);
                    }
                }
            });
        } else if (this.f18977d != null) {
            this.f18977d.mo16855a(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onProgressUpdate(Integer... numArr) {
        super.onProgressUpdate(numArr);
        this.f18976c.setProgress(numArr[0].intValue());
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        this.f18976c.dismiss();
        if (this.f18977d != null) {
            this.f18977d.mo16855a(new Boolean(true));
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        this.f18976c = new ProgressDialog(this.f18975b);
        this.f18976c.setProgressStyle(1);
        this.f18976c.setMessage("Downloading resources.\nPlease wait...");
        this.f18976c.setCancelable(true);
        this.f18976c.getWindow().clearFlags(2);
        this.f18976c.show();
        this.f18976c.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C5299a.this.f18978e = true;
            }
        });
        super.onPreExecute();
    }
}
