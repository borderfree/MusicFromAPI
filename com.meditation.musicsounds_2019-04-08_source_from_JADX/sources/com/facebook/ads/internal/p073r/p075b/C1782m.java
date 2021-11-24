package com.facebook.ads.internal.p073r.p075b;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.r.b.m */
public class C1782m {
    /* renamed from: a */
    static String m8858a(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* renamed from: a */
    private static String m8859a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format(Locale.US, "%02x", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m8860a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("ProxyCache", "Error closing resource", e);
            }
        }
    }

    /* renamed from: a */
    static void m8861a(byte[] bArr, long j, int i) {
        C1777j.m8842a(bArr, "Buffer must be not null!");
        boolean z = false;
        C1777j.m8843a(j >= 0, "Data offset must be positive!");
        if (i >= 0 && i <= bArr.length) {
            z = true;
        }
        C1777j.m8843a(z, "Length must be in range [0..buffer.length]");
    }

    /* renamed from: b */
    static String m8862b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* renamed from: c */
    static String m8863c(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* renamed from: d */
    public static String m8864d(String str) {
        try {
            return m8859a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
