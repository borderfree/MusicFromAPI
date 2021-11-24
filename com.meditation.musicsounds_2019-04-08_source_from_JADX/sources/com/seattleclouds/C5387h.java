package com.seattleclouds;

import android.net.Uri;

/* renamed from: com.seattleclouds.h */
public class C5387h {

    /* renamed from: a */
    public String f19237a;

    /* renamed from: b */
    public String f19238b;

    /* renamed from: c */
    public String f19239c;

    /* renamed from: d */
    public String f19240d;

    public C5387h(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.f19237a = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f19239c = str2;
        Uri parse = Uri.parse(str);
        this.f19238b = parse.getLastPathSegment();
        this.f19240d = parse.getEncodedQuery();
    }
}
