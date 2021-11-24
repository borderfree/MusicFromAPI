package com.google.android.vending.licensing;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.google.android.vending.licensing.l */
public class C4876l {

    /* renamed from: a */
    public int f17556a;

    /* renamed from: b */
    public int f17557b;

    /* renamed from: c */
    public String f17558c;

    /* renamed from: d */
    public String f17559d;

    /* renamed from: e */
    public String f17560e;

    /* renamed from: f */
    public long f17561f;

    /* renamed from: g */
    public String f17562g;

    /* renamed from: a */
    public static C4876l m24371a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (-1 == indexOf) {
            str2 = "";
        } else {
            String substring = str.substring(0, indexOf);
            str2 = indexOf >= str.length() ? "" : str.substring(indexOf + 1);
            str = substring;
        }
        String[] split = TextUtils.split(str, Pattern.quote("|"));
        if (split.length >= 6) {
            C4876l lVar = new C4876l();
            lVar.f17562g = str2;
            lVar.f17556a = Integer.parseInt(split[0]);
            lVar.f17557b = Integer.parseInt(split[1]);
            lVar.f17558c = split[2];
            lVar.f17559d = split[3];
            lVar.f17560e = split[4];
            lVar.f17561f = Long.parseLong(split[5]);
            return lVar;
        }
        throw new IllegalArgumentException("Wrong number of fields.");
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f17556a), Integer.valueOf(this.f17557b), this.f17558c, this.f17559d, this.f17560e, Long.valueOf(this.f17561f)});
    }
}
