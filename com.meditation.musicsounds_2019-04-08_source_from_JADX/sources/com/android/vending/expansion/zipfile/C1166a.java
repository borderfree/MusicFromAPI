package com.android.vending.expansion.zipfile;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.Vector;

/* renamed from: com.android.vending.expansion.zipfile.a */
public class C1166a {
    /* renamed from: a */
    public static C1167b m6305a(String[] strArr) {
        C1167b bVar = null;
        for (String str : strArr) {
            if (bVar == null) {
                bVar = new C1167b(str);
            } else {
                bVar.mo5663c(str);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static String[] m6306a(Context context, int i, int i2) {
        String packageName = context.getPackageName();
        Vector vector = new Vector();
        if (Environment.getExternalStorageState().equals("mounted")) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            StringBuilder sb = new StringBuilder();
            sb.append(externalStorageDirectory.toString());
            sb.append("/Android/obb/");
            sb.append(packageName);
            File file = new File(sb.toString());
            if (file.exists()) {
                if (i > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file);
                    sb2.append(File.separator);
                    sb2.append("main.");
                    sb2.append(i);
                    sb2.append(".");
                    sb2.append(packageName);
                    sb2.append(".obb");
                    String sb3 = sb2.toString();
                    if (new File(sb3).isFile()) {
                        vector.add(sb3);
                    }
                }
                if (i2 > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(file);
                    sb4.append(File.separator);
                    sb4.append("patch.");
                    sb4.append(i2);
                    sb4.append(".");
                    sb4.append(packageName);
                    sb4.append(".obb");
                    String sb5 = sb4.toString();
                    if (new File(sb5).isFile()) {
                        vector.add(sb5);
                    }
                }
            }
        }
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    /* renamed from: b */
    public static C1167b m6307b(Context context, int i, int i2) {
        return m6305a(m6306a(context, i, i2));
    }
}
