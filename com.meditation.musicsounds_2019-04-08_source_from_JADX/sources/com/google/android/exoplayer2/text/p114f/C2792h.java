package com.google.android.exoplayer2.text.p114f;

import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.f.h */
public final class C2792h {

    /* renamed from: a */
    private static final Pattern f9659a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    private static final Pattern f9660b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static long m13300a(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String parseLong : split[0].split(":")) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        return ((j * 1000) + Long.parseLong(split[1])) * 1000;
    }

    /* renamed from: a */
    public static void m13301a(C2500k kVar) {
        String y = kVar.mo8852y();
        if (y == null || !f9660b.matcher(y).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected WEBVTT. Got ");
            sb.append(y);
            throw new SubtitleDecoderException(sb.toString());
        }
    }

    /* renamed from: b */
    public static float m13302b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
