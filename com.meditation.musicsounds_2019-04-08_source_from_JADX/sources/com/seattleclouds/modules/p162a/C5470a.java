package com.seattleclouds.modules.p162a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6578ag;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.a.a */
public class C5470a {
    /* renamed from: a */
    private static Map<String, String> m27268a(String str) {
        HashMap hashMap = new HashMap();
        C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(str);
        hashMap.put("description", aaVar.mo17042Y());
        hashMap.put("sharelink", aaVar.mo17044Z());
        hashMap.put("storelink", aaVar.mo17070aP());
        hashMap.put("iphone", aaVar.mo17079aa());
        hashMap.put("ipad", aaVar.mo17081ab());
        hashMap.put("android", aaVar.mo17083ac());
        hashMap.put("kindle", aaVar.mo17085ad());
        hashMap.put("appmartstore", aaVar.mo17087ae());
        hashMap.put("primarystore", aaVar.mo17089af());
        return hashMap;
    }

    /* renamed from: a */
    public static void m27269a(Context context, String str) {
        HashMap hashMap = (HashMap) m27268a(str);
        if (hashMap != null) {
            Resources resources = context.getResources();
            String str2 = (String) App.f18501c.mo16990y().get("appname");
            if (str2 == null) {
                str2 = resources.getString(C5462k.app_name);
            }
            String str3 = (String) hashMap.get("storelink");
            if (str3 == null || str3.trim().length() == 0) {
                str3 = (String) hashMap.get("sharelink");
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.EMAIL", new String[0]);
            intent.putExtra("android.intent.extra.SUBJECT", String.format(resources.getString(C5462k.appshare_subject), new Object[]{str2}));
            StringBuilder sb = new StringBuilder();
            sb.append((String) hashMap.get("description"));
            sb.append(String.format(resources.getString(C5462k.appshare_email_app_link), new Object[]{str3}));
            intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(sb.toString()));
            intent.setType("message/rfc822");
            try {
                context.startActivity(Intent.createChooser(intent, resources.getString(C5462k.appshare_choose_client)));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(context, C5462k.appshare_choose_client_notfound, 0).show();
            }
        }
    }

    /* renamed from: b */
    public static void m27270b(Context context, String str) {
        HashMap hashMap = (HashMap) m27268a(str);
        if (hashMap != null) {
            Resources resources = context.getResources();
            String str2 = (String) App.f18501c.mo16990y().get("appname");
            if (str2 == null) {
                str2 = resources.getString(C5462k.app_name);
            }
            String str3 = (String) hashMap.get("iphone");
            String str4 = (String) hashMap.get("ipad");
            String str5 = (String) hashMap.get("android");
            String str6 = (String) hashMap.get("kindle");
            String str7 = (String) hashMap.get("appmartstore");
            String str8 = (String) hashMap.get("primarystore");
            String format = String.format(resources.getString(C5462k.appshare_subject), new Object[]{str2});
            StringBuilder sb = new StringBuilder();
            sb.append((String) hashMap.get("description"));
            sb.append("\n");
            String sb2 = sb.toString();
            if (!(str8 == null || str8.trim().length() == 0)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("\n\n");
                sb3.append(String.format(resources.getString(C5462k.appshare_app_link_name_primary), new Object[]{str8}));
                sb2 = sb3.toString();
            }
            if (!(str3 == null || str3.trim().length() == 0 || str3.equals(str8))) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append("\n\n");
                sb4.append(String.format(resources.getString(C5462k.appshare_app_link_name_iphone), new Object[]{str3}));
                sb2 = sb4.toString();
            }
            if (!(str4 == null || str4.trim().length() == 0 || str4.equals(str8))) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append("\n\n");
                sb5.append(String.format(resources.getString(C5462k.appshare_app_link_name_ipad), new Object[]{str4}));
                sb2 = sb5.toString();
            }
            if (!(str5 == null || str5.trim().length() == 0 || str5.equals(str8))) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb2);
                sb6.append("\n\n");
                sb6.append(String.format(resources.getString(C5462k.appshare_app_link_name_android), new Object[]{str5}));
                sb2 = sb6.toString();
            }
            if (!(str6 == null || str6.trim().length() == 0 || str6.equals(str8))) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb2);
                sb7.append("\n\n");
                sb7.append(String.format(resources.getString(C5462k.appshare_app_link_name_amazon), new Object[]{str6}));
                sb2 = sb7.toString();
            }
            if (!(str7 == null || str7.trim().length() == 0 || str7.equals(str8))) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(sb2);
                sb8.append("\n\n");
                sb8.append(String.format(resources.getString(C5462k.appshare_app_link_name_appmart), new Object[]{str7}));
                sb2 = sb8.toString();
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.addFlags(524288);
            intent.putExtra("android.intent.extra.SUBJECT", format);
            intent.putExtra("android.intent.extra.TEXT", sb2);
            context.startActivity(Intent.createChooser(intent, resources.getString(C5462k.appshare_create_chooser_title)));
        }
    }

    /* renamed from: a */
    public void mo17781a(C6557s sVar, String str) {
        if (((C5230aa) App.f18501c.mo16902D().get(str)) != null) {
            HashMap hashMap = (HashMap) m27268a(str);
            if (hashMap != null) {
                String str2 = (String) hashMap.get("storelink");
                if (str2 == null || str2.trim().length() == 0) {
                    str2 = (String) hashMap.get("sharelink");
                }
                String[] split = str2.split("=");
                if (split.length == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split[0]);
                    sb.append("=");
                    sb.append(URLEncoder.encode(split[1]));
                    str2 = sb.toString();
                }
                String str3 = (String) App.f18501c.mo16990y().get("appname");
                if (str3 == null) {
                    str3 = sVar.mo1320t().getString(C5462k.app_name);
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http://");
                    sb2.append(App.f18516r);
                    sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb2.append(App.m25673q());
                    sb2.append("/bigicon.png");
                    String sb3 = sb2.toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("appName", str3);
                    bundle.putString("slink", str2);
                    bundle.putString("description", (String) hashMap.get("description"));
                    bundle.putString("iconUrlString", sb3);
                    C6578ag.m31838a((Activity) sVar.mo1318s(), bundle);
                } catch (Exception e) {
                    Log.d("AppShare", "share on facebook", e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17782a(C6557s sVar, String str, String str2) {
        if (str.equalsIgnoreCase("email")) {
            m27269a((Context) sVar.mo1318s(), str2);
        } else if (str.equalsIgnoreCase("facebook")) {
            new C5470a().mo17781a(sVar, str2);
        } else if (str.equals("apps")) {
            m27270b(sVar.mo1318s(), str2);
        }
    }
}
