package com.seattleclouds.util;

import android.content.Context;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.util.i */
public class C6613i {
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0052 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m31986a(java.io.InputStream r7, int r8) {
        /*
            if (r7 == 0) goto L_0x0063
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            java.lang.String r3 = "UTF-8"
            r2.<init>(r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            r1.<init>(r2, r8)     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            char[] r8 = new char[r8]     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            r2 = 1
            r3 = 0
            r4 = 0
        L_0x0018:
            int r5 = r8.length     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            int r5 = r1.read(r8, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            if (r5 <= 0) goto L_0x0033
            if (r4 != 0) goto L_0x002e
            char r4 = r8[r3]     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r4 != r6) goto L_0x002e
            int r5 = r5 + -1
            r0.append(r8, r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            goto L_0x0031
        L_0x002e:
            r0.append(r8, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
        L_0x0031:
            r4 = 1
            goto L_0x0018
        L_0x0033:
            java.lang.String r8 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x0052, all -> 0x0044 }
            r7.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x0043
        L_0x003b:
            r7 = move-exception
            java.lang.String r0 = "DataUtil"
            java.lang.String r1 = "Error closing input stream"
            android.util.Log.e(r0, r1, r7)
        L_0x0043:
            return r8
        L_0x0044:
            r8 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x0051
        L_0x0049:
            r7 = move-exception
            java.lang.String r0 = "DataUtil"
            java.lang.String r1 = "Error closing input stream"
            android.util.Log.e(r0, r1, r7)
        L_0x0051:
            throw r8
        L_0x0052:
            r7.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r7 = move-exception
            java.lang.String r8 = "DataUtil"
            java.lang.String r1 = "Error closing input stream"
            android.util.Log.e(r8, r1, r7)
        L_0x005e:
            java.lang.String r7 = r0.toString()
            return r7
        L_0x0063:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Input stream cannot be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6613i.m31986a(java.io.InputStream, int):java.lang.String");
    }

    /* renamed from: a */
    public static String m31987a(String str, String str2, Context context) {
        if (!App.m25663l()) {
            C6620n.m32028a(context, C5462k.info, C5462k.save_file_no_sdcard);
            return null;
        }
        String k = App.m25661k();
        StringBuilder sb = new StringBuilder();
        sb.append(k);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str2);
        String sb2 = sb.toString();
        new File(sb2).mkdirs();
        File file = new File(str);
        file.getName();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(file.getName());
        File file2 = new File(sb3.toString());
        try {
            m31989a(file, file2);
            return file2.getAbsolutePath();
        } catch (IOException e) {
            Log.e("DataUtil", "Exception - copyToSDCard", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m31988a(String str, String str2, String str3, Context context) {
        if (!App.m25663l()) {
            C6620n.m32028a(context, C5462k.info, C5462k.save_file_no_sdcard);
            return null;
        }
        new File(str2).mkdirs();
        File file = new File(str);
        file.getName();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str3);
        File file2 = new File(sb.toString());
        try {
            m31989a(file, file2);
            return file2.getAbsolutePath();
        } catch (IOException e) {
            Log.e("DataUtil", "Exception - copyToPath", e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m31989a(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m31990a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m31991b(InputStream inputStream) {
        return m31986a(inputStream, 8192);
    }
}
