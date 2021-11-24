package com.seattleclouds.p159d;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6620n;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.d.c */
public class C5330c {

    /* renamed from: a */
    private static boolean f19104a = true;

    /* renamed from: b */
    private static String f19105b = "c";

    /* renamed from: c */
    private String f19106c = "";

    /* renamed from: d */
    private ArrayList<C5331d> f19107d = new ArrayList<>();

    /* renamed from: a */
    public int mo17512a(C5328a aVar, Context context) {
        if (aVar == null) {
            return 3;
        }
        int indexOf = this.f19107d.indexOf(aVar);
        if (indexOf >= 0) {
            this.f19107d.remove(indexOf);
        }
        return 2;
    }

    /* renamed from: a */
    public int mo17513a(Integer num, C5328a aVar, Context context) {
        if (aVar == null) {
            return 5;
        }
        int indexOf = this.f19107d.indexOf(aVar);
        if (indexOf < 0) {
            return 5;
        }
        ((C5331d) this.f19107d.get(indexOf)).mo17520b(num.intValue());
        return 4;
    }

    /* renamed from: a */
    public void mo17514a() {
        this.f19107d.clear();
    }

    /* renamed from: a */
    public void mo17515a(WebView webView, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:document.getElementById(\"shpreturnurl\").value = \"");
        sb.append(App.f18483P);
        sb.append("\";");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("document.getElementById(\"shppage\").value = \"");
        sb3.append(str);
        sb3.append("\";");
        String sb4 = sb3.toString();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f19107d.iterator();
        while (it.hasNext()) {
            C5331d dVar = (C5331d) it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("itemid", dVar.mo17499f());
                jSONObject.put("itemname", dVar.mo17485a());
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator('.');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                jSONObject.put("itemprice", decimalFormat.format(dVar.mo17490b()));
                jSONObject.put("itemcount", dVar.mo17521k());
                jSONObject.put("urlimg", dVar.mo17501g());
                jSONObject.put("urlinfo", dVar.mo17502h());
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                String str2 = f19105b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("ERROR:");
                sb5.append(e.getLocalizedMessage());
                Log.e(str2, sb5.toString(), e);
                return;
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (f19104a) {
            Log.d(f19105b, jSONArray2);
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb4);
        sb6.append("getShoppingCart(");
        sb6.append(jSONArray2);
        sb6.append(");");
        webView.loadUrl(sb6.toString());
    }

    /* renamed from: a */
    public void mo17516a(String str, Context context) {
        C5328a aVar = new C5328a();
        Resources resources = context.getResources();
        String string = resources.getString(C5462k.shoppingcart_failed_added);
        aVar.mo17491b(Uri.parse(str).getHost());
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            resources.getString(C5462k.shoppingcart_succ_added);
            for (String split : str.substring(indexOf + 1).split("&")) {
                String[] split2 = split.split("=");
                if (split2.length == 2) {
                    String str2 = split2[0];
                    String str3 = split2[1];
                    if (str2.equalsIgnoreCase("itemname")) {
                        aVar.mo17488a(URLDecoder.decode(str3, "UTF-8"));
                    } else if (str2.equalsIgnoreCase("itemprice")) {
                        str3 = str3.replaceAll("[^\\d.]", "");
                        aVar.mo17486a(Double.parseDouble(str3));
                    } else if (str2.equalsIgnoreCase("urlimg")) {
                        aVar.mo17493c(str3);
                    }
                    if (str2.equalsIgnoreCase("urlinfo")) {
                        aVar.mo17495d(str3);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.mo17485a());
            sb.append(" ");
            sb.append(resources.getString(C5462k.shoppingcart_succ_added));
            string = sb.toString();
        }
        int indexOf2 = this.f19107d.indexOf(aVar);
        if (indexOf2 >= 0) {
            C5331d dVar = (C5331d) this.f19107d.get(indexOf2);
            dVar.mo17520b(dVar.mo17521k() + 1);
        } else {
            this.f19107d.add(new C5331d(aVar));
        }
        C6620n.m32034a(context, "Info", string);
    }

    /* renamed from: b */
    public int mo17517b(C5328a aVar, Context context) {
        if (aVar == null) {
            return 1;
        }
        int indexOf = this.f19107d.indexOf(aVar);
        if (indexOf >= 0) {
            C5331d dVar = (C5331d) this.f19107d.get(indexOf);
            dVar.mo17520b(dVar.mo17521k() + 1);
        } else {
            this.f19107d.add(new C5331d(aVar));
        }
        return 0;
    }

    /* renamed from: b */
    public ArrayList<C5331d> mo17518b() {
        return this.f19107d;
    }

    /* renamed from: b */
    public void mo17519b(String str, Context context) {
        Resources resources = context.getResources();
        String string = resources.getString(C5462k.shoppingcart_failed_removed);
        String host = Uri.parse(str).getHost();
        Iterator it = this.f19107d.iterator();
        int i = 0;
        String str2 = string;
        int i2 = -1;
        while (it.hasNext()) {
            C5331d dVar = (C5331d) it.next();
            if (dVar.mo17499f().compareTo(host) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(dVar.mo17485a());
                sb.append(" ");
                sb.append(resources.getString(C5462k.shoppingcart_succ_removed));
                str2 = sb.toString();
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            C5331d dVar2 = (C5331d) this.f19107d.get(i2);
            int k = dVar2.mo17521k();
            if (k > 1) {
                dVar2.mo17520b(k - 1);
            } else {
                this.f19107d.remove(i2);
            }
        }
        C6620n.m32034a(context, "Info", str2);
    }
}
