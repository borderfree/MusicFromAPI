package com.seattleclouds.modules.videolist;

import java.text.DecimalFormat;

public class VideoFile {

    /* renamed from: a */
    private String f22375a;

    /* renamed from: b */
    private String f22376b;

    /* renamed from: c */
    private Status f22377c;

    /* renamed from: d */
    private String f22378d;

    /* renamed from: e */
    private String f22379e;

    /* renamed from: f */
    private String f22380f;

    /* renamed from: g */
    private int f22381g;

    /* renamed from: h */
    private int f22382h;

    /* renamed from: i */
    private String f22383i;

    /* renamed from: j */
    private long f22384j;

    /* renamed from: k */
    private String f22385k;

    /* renamed from: l */
    private String f22386l;

    public enum Status {
        ONLINE,
        DOWNLOADING,
        LOCAL
    }

    VideoFile() {
        mo19696a("defaultTitle");
        mo19699b("defaultUID");
        mo19695a(Status.ONLINE);
        mo19701c("defaultDestinationPath");
        mo19694a(-1);
        mo19709g(null);
        mo19711h(null);
    }

    VideoFile(String str, String str2, String str3, String str4, long j, String str5) {
        mo19699b(str);
        mo19696a(str2);
        mo19695a(Status.ONLINE);
        mo19705e(str3);
        mo19703d(str4);
        mo19694a(j);
        mo19711h(str5);
        m30637k();
    }

    /* renamed from: k */
    private void m30637k() {
        DecimalFormat decimalFormat;
        float f;
        String format;
        if (this.f22384j < 1024) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22384j);
            sb.append(" bytes");
            format = sb.toString();
        } else {
            if (this.f22384j / 1024 < 1024) {
                decimalFormat = new DecimalFormat("0.0 KB");
                f = (float) this.f22384j;
            } else {
                decimalFormat = new DecimalFormat("0.0 MB");
                f = ((float) this.f22384j) / 1024.0f;
            }
            format = decimalFormat.format((double) (f / 1024.0f));
        }
        this.f22385k = format;
    }

    /* renamed from: a */
    public String mo19692a() {
        return this.f22375a;
    }

    /* renamed from: a */
    public void mo19693a(int i) {
        this.f22381g = i;
    }

    /* renamed from: a */
    public void mo19694a(long j) {
        if (j < 0) {
            j = 0;
        }
        this.f22384j = j;
    }

    /* renamed from: a */
    public void mo19695a(Status status) {
        this.f22377c = status;
    }

    /* renamed from: a */
    public void mo19696a(String str) {
        this.f22375a = str;
    }

    /* renamed from: b */
    public String mo19697b() {
        return this.f22376b;
    }

    /* renamed from: b */
    public void mo19698b(int i) {
        this.f22382h = i;
    }

    /* renamed from: b */
    public void mo19699b(String str) {
        this.f22376b = str;
    }

    /* renamed from: c */
    public Status mo19700c() {
        return this.f22377c;
    }

    /* renamed from: c */
    public void mo19701c(String str) {
        this.f22378d = str;
    }

    /* renamed from: d */
    public String mo19702d() {
        return this.f22378d;
    }

    /* renamed from: d */
    public void mo19703d(String str) {
        this.f22380f = str;
    }

    /* renamed from: e */
    public String mo19704e() {
        return this.f22380f;
    }

    /* renamed from: e */
    public void mo19705e(String str) {
        this.f22383i = str;
    }

    /* renamed from: f */
    public String mo19706f() {
        return this.f22383i;
    }

    /* renamed from: f */
    public void mo19707f(String str) {
        this.f22379e = str;
    }

    /* renamed from: g */
    public String mo19708g() {
        return this.f22379e;
    }

    /* renamed from: g */
    public void mo19709g(String str) {
        if (str == null) {
            str = "0";
        }
        this.f22385k = str;
    }

    /* renamed from: h */
    public long mo19710h() {
        return this.f22384j;
    }

    /* renamed from: h */
    public void mo19711h(String str) {
        if (str == null) {
            str = "NA";
        }
        this.f22386l = str;
    }

    /* renamed from: i */
    public String mo19712i() {
        return this.f22385k;
    }

    /* renamed from: j */
    public String mo19713j() {
        String str = "";
        if (this.f22384j != 0) {
            str = mo19712i();
        }
        if (this.f22386l.compareTo("NA") == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(this.f22386l);
        return sb.toString();
    }
}
