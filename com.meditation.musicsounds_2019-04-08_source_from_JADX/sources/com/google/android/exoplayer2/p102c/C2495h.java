package com.google.android.exoplayer2.p102c;

/* renamed from: com.google.android.exoplayer2.c.h */
public final class C2495h {
    /* renamed from: a */
    public static boolean m11692a(String str) {
        return "audio".equals(m11696e(str));
    }

    /* renamed from: b */
    public static boolean m11693b(String str) {
        return "video".equals(m11696e(str));
    }

    /* renamed from: c */
    public static boolean m11694c(String str) {
        return "text".equals(m11696e(str));
    }

    /* renamed from: d */
    public static String m11695d(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            return "audio/mp4a-latm";
        }
        if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (trim.startsWith("opus")) {
            return "audio/opus";
        }
        if (trim.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        return null;
    }

    /* renamed from: e */
    private static String m11696e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid mime type: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
