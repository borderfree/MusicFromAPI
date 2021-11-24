package com.seattleclouds.util;

import android.text.GetChars;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.Arrays;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.util.al */
public class C6592al {
    /* renamed from: a */
    public static String m31903a(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return String.valueOf(cArr);
    }

    /* renamed from: a */
    public static String m31904a(String str) {
        int lastIndexOf = str.lastIndexOf(TableOfContents.DEFAULT_PATH_SEPARATOR);
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf + 1);
        }
        int indexOf = str.indexOf("?");
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a */
    public static String m31905a(String str, String str2, String str3, String... strArr) {
        StringBuilder sb = new StringBuilder(strArr.length * 50);
        if (str != null) {
            sb.append(str);
        }
        if (strArr.length > 0) {
            sb.append(strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb.append(str3);
                sb.append(strArr[i]);
            }
        }
        if (str2 != null) {
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m31906a(String str, String... strArr) {
        return m31905a(null, null, str, strArr);
    }

    /* renamed from: a */
    public static boolean m31907a(String str, String str2) {
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    /* renamed from: a */
    public static char[] m31908a(GetChars getChars) {
        if (getChars == null) {
            return new char[0];
        }
        int length = getChars.length();
        char[] cArr = new char[length];
        getChars.getChars(0, length, cArr, 0);
        return cArr;
    }

    /* renamed from: b */
    public static boolean m31909b(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: c */
    public static boolean m31910c(String str) {
        return str == null || TextUtils.getTrimmedLength(str) == 0;
    }

    /* renamed from: d */
    public static String m31911d(String str) {
        return str != null ? str : "";
    }

    /* renamed from: e */
    public static String m31912e(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            int length = digest.length;
            StringBuilder sb = new StringBuilder(length << 1);
            for (int i = 0; i < length; i++) {
                sb.append(Character.forDigit((digest[i] & 240) >> 4, 16));
                sb.append(Character.forDigit(digest[i] & 15, 16));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: f */
    public static String m31913f(String str) {
        return Normalizer.normalize(str, Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
