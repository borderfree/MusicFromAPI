package com.seattleclouds.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p009v4.content.FileProvider;
import com.seattleclouds.App;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.seattleclouds.util.aq */
public class C6598aq {
    /* renamed from: a */
    public static Uri m31937a(File file) {
        return VERSION.SDK_INT >= 22 ? m31940b(file) : Uri.fromFile(file);
    }

    /* renamed from: a */
    public static String m31938a(Context context, Uri uri) {
        if (!(context == null || uri == null)) {
            String[] strArr = {"_data"};
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                Cursor query = contentResolver.query(uri, strArr, null, null, null);
                if (query != null) {
                    try {
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                        query.moveToFirst();
                        return query.getString(columnIndexOrThrow);
                    } finally {
                        query.close();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static HashMap<String, String> m31939a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (C6592al.m31909b(str)) {
            return hashMap;
        }
        Uri parse = Uri.parse(str);
        for (String str2 : parse.getQueryParameterNames()) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Uri m31940b(File file) {
        Context e = App.m25647e();
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25653g());
        sb.append(".FileProvider");
        return FileProvider.m1987a(e, sb.toString(), file);
    }

    /* renamed from: b */
    public static String m31941b(String str) {
        if (C6592al.m31909b(str)) {
            return "";
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return lastPathSegment;
    }
}
