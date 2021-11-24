package com.seattleclouds.modules.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6638s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.feedback.b */
public class C5669b {

    /* renamed from: a */
    private static String f20151a;

    /* renamed from: b */
    private static Activity f20152b;

    /* renamed from: c */
    private static String f20153c;

    /* renamed from: a */
    public static String m28021a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ArrayList o = ((C5230aa) App.f18501c.mo16902D().get(Uri.parse(f20153c).getLastPathSegment())).mo17172o();
        String str = f20151a;
        int i = 0;
        while (i < o.size()) {
            Field field = (Field) o.get(i);
            String str2 = (String) arrayList2.get(arrayList.indexOf(field.mo18165c()));
            if (!field.mo18167d().equals("required") || !C6592al.m31909b(str2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("[%=field;");
                sb.append(field.mo18165c());
                sb.append(";");
                sb.append(field.mo18163b());
                sb.append(";");
                sb.append(field.mo18167d());
                sb.append("%]");
                String sb2 = sb.toString();
                if (field.mo18163b().equals("location") || field.mo18163b().equals("date") || field.mo18163b().equals("time") || field.mo18163b().equals("text") || field.mo18163b().equals("email")) {
                    str = str.replace(sb2, str2);
                } else if (field.mo18163b().equals("image") || field.mo18163b().equals("camera")) {
                    String str3 = "";
                    Bitmap a = C6638s.m32067a(Uri.parse(str2), 200, f20152b);
                    if (a != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        a.compress(CompressFormat.JPEG, 80, byteArrayOutputStream);
                        String str4 = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0));
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("<img width=\"160\" src=\"data:image/jpg;base64,");
                        sb3.append(str4);
                        sb3.append("\">");
                        str3 = sb3.toString();
                    }
                    str = str.replace(sb2, str3);
                }
                i++;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(field.mo18165c());
                sb4.append(" can not be empty");
                C6620n.m32036a((Context) f20152b, "Required field", sb4.toString(), (OnClickListener) null, (OnCancelListener) null);
                return null;
            }
        }
        f20151a = str;
        return f20151a;
    }

    /* renamed from: a */
    public static ArrayList<Object> m28022a(Activity activity, String str, boolean z) {
        String str2;
        f20152b = activity;
        f20153c = str;
        String str3 = "";
        try {
            f20151a = C6613i.m31991b(App.m25649e(Uri.parse(f20153c).getLastPathSegment()));
            str2 = f20151a;
        } catch (IOException unused) {
            Log.e("FieldProcessing", "Error getting rawHtml");
            str2 = str3;
        }
        String str4 = "";
        ArrayList arrayList = new ArrayList();
        int indexOf = str2.indexOf("[%");
        int i = 0;
        while (indexOf != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str2.substring(0, indexOf));
            str4 = sb.toString();
            String substring = str2.substring(indexOf + 2);
            String str5 = "";
            int indexOf2 = substring.indexOf("%]");
            if (indexOf2 != -1) {
                String substring2 = substring.substring(0, indexOf2);
                substring = substring.substring(indexOf2 + 2);
                if (substring2.substring(0, 1).equals("=")) {
                    String[] split = substring2.substring(1).split(";");
                    if (split[0].equals("field")) {
                        Field field = new Field(Integer.toString(i));
                        field.mo18164b(split[1]);
                        field.mo18162a(split[2]);
                        field.mo18166c(split[3]);
                        arrayList.add(field);
                        i++;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str5);
                str4 = sb2.toString();
            }
            indexOf = str2.indexOf("[%");
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str4);
        sb3.append(str2);
        String sb4 = sb3.toString();
        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(arrayList);
        arrayList2.add(sb4);
        return arrayList2;
    }
}
