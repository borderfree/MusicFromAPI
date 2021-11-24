package com.seattleclouds.modules.rateandreview;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;

/* renamed from: com.seattleclouds.modules.rateandreview.b */
public class C6244b {

    /* renamed from: a */
    private static final String f22109a = null;

    /* renamed from: b */
    private static C6244b f22110b;

    private C6244b() {
    }

    /* renamed from: a */
    public static synchronized C6244b m30355a() {
        C6244b bVar;
        synchronized (C6244b.class) {
            if (f22110b == null) {
                f22110b = new C6244b();
            }
            bVar = f22110b;
        }
        return bVar;
    }

    /* renamed from: a */
    private String m30356a(int i, int i2) {
        return i > i2 ? "star.png" : "stargrey.png";
    }

    /* renamed from: a */
    public String mo19533a(String str) {
        int i;
        int i2;
        String str2 = "";
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/getpagerate.ashx?username=");
        sb.append(App.f18523y);
        sb.append("&appid=");
        sb.append(App.f18524z);
        sb.append("&pageid=");
        sb.append(str);
        try {
            str2 = HTTPUtil.m31767b(sb.toString());
        } catch (IOException e) {
            Log.e(f22109a, e.getMessage());
        }
        if (str2.startsWith("OK")) {
            String[] split = str2.substring(2).split(":");
            if (split.length == 3) {
                i = Integer.parseInt(split[0]);
                i2 = Integer.parseInt(split[2]);
                String str3 = "";
                str3 = C6613i.m31991b(App.m25649e(str));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<div style='width:110px;'><a href='ratings://");
                sb2.append(str);
                sb2.append("' style='line-height:16px;'><img src='");
                sb2.append(m30356a(i, 0));
                sb2.append("'/><img src='");
                sb2.append(m30356a(i, 1));
                sb2.append("'/><img src='");
                sb2.append(m30356a(i, 2));
                sb2.append("'/><img src='");
                sb2.append(m30356a(i, 3));
                sb2.append("'/><img src='");
                sb2.append(m30356a(i, 4));
                sb2.append("'/></a><br><a href='ratings://");
                sb2.append(str);
                sb2.append("' style='line-height:16px;text-decoration:underline;'><font size='2' face='helvetica'> ");
                sb2.append(i2);
                sb2.append(" comment(s)</font></a></div>");
                return str3.replace("[%rate%]", sb2.toString());
            }
        }
        i2 = 0;
        i = 0;
        String str32 = "";
        try {
            str32 = C6613i.m31991b(App.m25649e(str));
        } catch (IOException unused) {
            Log.e(f22109a, "Error getting rawHtml");
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append("<div style='width:110px;'><a href='ratings://");
        sb22.append(str);
        sb22.append("' style='line-height:16px;'><img src='");
        sb22.append(m30356a(i, 0));
        sb22.append("'/><img src='");
        sb22.append(m30356a(i, 1));
        sb22.append("'/><img src='");
        sb22.append(m30356a(i, 2));
        sb22.append("'/><img src='");
        sb22.append(m30356a(i, 3));
        sb22.append("'/><img src='");
        sb22.append(m30356a(i, 4));
        sb22.append("'/></a><br><a href='ratings://");
        sb22.append(str);
        sb22.append("' style='line-height:16px;text-decoration:underline;'><font size='2' face='helvetica'> ");
        sb22.append(i2);
        sb22.append(" comment(s)</font></a></div>");
        return str32.replace("[%rate%]", sb22.toString());
    }

    /* renamed from: a */
    public void mo19534a(Activity activity, C5230aa aaVar) {
        Bundle bundle = new Bundle();
        bundle.putString("pageid", aaVar.mo17046a());
        bundle.putString("fb_id", activity.getString(C5462k.facebook_app_id));
        activity.startActivity(App.m25603a(new FragmentInfo(C6234a.class.getName(), bundle), (Context) activity));
    }
}
