package com.seattleclouds.modules.dropbox.medialist;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.dropbox.medialist.d */
class C5555d extends AsyncTask<Object, Integer, Object> {

    /* renamed from: b */
    private static final String f19764b = "d";

    /* renamed from: a */
    C6608d f19765a;

    C5555d() {
    }

    /* renamed from: a */
    public static JSONObject m27600a(String str, String str2) {
        String str3;
        String str4;
        StringBuilder sb;
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("tokenid", str2);
            hashMap.put("action", "get_temporary_link");
            hashMap.put("path", str);
            hashMap.put("vApi", "v2");
            String b = HTTPUtil.m31768b(C5536b.f19709a, hashMap);
            if (!TextUtils.isEmpty(b)) {
                JSONObject jSONObject = new JSONObject(b);
                if (jSONObject.getString("resp").equalsIgnoreCase("success")) {
                    return jSONObject.getJSONObject("get_temporary_link");
                }
            } else {
                Log.e(f19764b, "Failed to get response.");
            }
        } catch (UnsupportedEncodingException e) {
            str3 = f19764b;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str4 = e.getLocalizedMessage();
            r2 = e;
            sb.append(str4);
            Log.e(str3, sb.toString(), r2);
            return null;
        } catch (IOException e2) {
            str3 = f19764b;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str4 = e2.getLocalizedMessage();
            r2 = e2;
            sb.append(str4);
            Log.e(str3, sb.toString(), r2);
            return null;
        } catch (JSONException e3) {
            str3 = f19764b;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str4 = e3.getLocalizedMessage();
            r2 = e3;
            sb.append(str4);
            Log.e(str3, sb.toString(), r2);
            return null;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object doInBackground(Object... objArr) {
        MediaFile mediaFile = (MediaFile) MediaFile.class.cast(objArr[0]);
        try {
            JSONObject a = m27600a(mediaFile.mo17943m(), (String) String.class.cast(objArr[1]));
            this.f19765a = (C6608d) C6608d.class.cast(objArr[2]);
            mediaFile.mo17924a(a);
            return mediaFile;
        } catch (Exception e) {
            String str = f19764b;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Object obj) {
        try {
            if (this.f19765a != null) {
                this.f19765a.mo16855a(obj);
            }
        } catch (Exception e) {
            String str = f19764b;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
        }
    }
}
