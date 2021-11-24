package com.seattleclouds.modules.dropbox.medialist;

import android.util.Log;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaFile {

    /* renamed from: a */
    private static String f19691a = "MediaFile";

    /* renamed from: b */
    private String f19692b;

    /* renamed from: c */
    private String f19693c;

    /* renamed from: d */
    private String f19694d;

    /* renamed from: e */
    private String f19695e;

    /* renamed from: f */
    private String f19696f;

    /* renamed from: g */
    private MediaFileStatus f19697g;

    /* renamed from: h */
    private long f19698h;

    /* renamed from: i */
    private int f19699i;

    /* renamed from: j */
    private int f19700j;

    /* renamed from: k */
    private String f19701k;

    /* renamed from: l */
    private String f19702l;

    /* renamed from: m */
    private JSONObject f19703m;

    /* renamed from: n */
    private String f19704n;

    public enum MediaFileStatus {
        ONLINE,
        DOWNLOADING,
        LOCAL
    }

    public MediaFile(JSONObject jSONObject) {
        String string;
        String str;
        String str2;
        mo17922a(MediaFileStatus.ONLINE);
        String str3 = "Name";
        try {
            str3 = jSONObject.getString("name");
        } catch (JSONException e) {
            Log.e(f19691a, "Unable to extras file name", e);
        } finally {
            mo17930d(str3);
            mo17929c(str3);
        }
        String str4 = "id";
        try {
            str4 = jSONObject.getString("id");
        } catch (JSONException e2) {
            Log.e(f19691a, "Unable to extras file id", e2);
        } finally {
            mo17932e(str4);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String format = simpleDateFormat.format(new Date());
        try {
            mo17934f(simpleDateFormat.format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(jSONObject.getString("client_modified"))));
        } catch (JSONException e3) {
            e = e3;
            str = f19691a;
            str2 = "Unable to extras file client modified";
        } catch (ParseException e4) {
            e = e4;
            str = f19691a;
            str2 = "Unable to parse client modified";
        } catch (Throwable th) {
            mo17934f(format);
            throw th;
        }
        try {
            mo17920a(jSONObject.getLong("size"));
        } catch (JSONException e5) {
            Log.e(f19691a, "Unable to extras file size", e5);
            mo17920a(0);
        } catch (Throwable th2) {
            mo17920a(0);
            mo17938h();
            throw th2;
        }
        mo17938h();
        String str5 = "";
        try {
            str5 = jSONObject.getString("path_lower");
        } catch (JSONException e6) {
            Log.e(f19691a, "Unable to extras file path lower", e6);
        } finally {
            mo17936g(str5);
        }
        String str6 = "";
        try {
            str6 = jSONObject.getString("path_display");
        } catch (JSONException e7) {
            Log.e(f19691a, "Unable to extras file path display", e7);
        } finally {
            mo17936g(str6);
        }
        String str7 = "dropbox_media_file.png";
        try {
            string = jSONObject.getString("imageThmb");
            try {
                mo17927b(string);
            } catch (JSONException unused) {
                str7 = string;
            }
        } catch (JSONException unused2) {
            mo17927b(str7);
            return;
        }
        Log.e(str, str2, e);
        mo17934f(format);
        mo17920a(jSONObject.getLong("size"));
        mo17938h();
        String str52 = "";
        str52 = jSONObject.getString("path_lower");
        String str62 = "";
        str62 = jSONObject.getString("path_display");
        String str72 = "dropbox_media_file.png";
        string = jSONObject.getString("imageThmb");
        mo17927b(string);
    }

    /* renamed from: a */
    public MediaFileStatus mo17919a() {
        return this.f19697g;
    }

    /* renamed from: a */
    public MediaFile mo17920a(long j) {
        this.f19698h = j;
        return this;
    }

    /* renamed from: a */
    public void mo17921a(int i) {
        this.f19699i = i;
    }

    /* renamed from: a */
    public void mo17922a(MediaFileStatus mediaFileStatus) {
        this.f19697g = mediaFileStatus;
    }

    /* renamed from: a */
    public void mo17923a(String str) {
        this.f19702l = str;
    }

    /* renamed from: a */
    public void mo17924a(JSONObject jSONObject) {
        this.f19703m = jSONObject;
    }

    /* renamed from: b */
    public String mo17925b() {
        return this.f19702l;
    }

    /* renamed from: b */
    public void mo17926b(int i) {
        this.f19700j = i;
    }

    /* renamed from: b */
    public void mo17927b(String str) {
        this.f19693c = str;
    }

    /* renamed from: c */
    public int mo17928c() {
        return this.f19699i;
    }

    /* renamed from: c */
    public void mo17929c(String str) {
        this.f19692b = str;
    }

    /* renamed from: d */
    public MediaFile mo17930d(String str) {
        this.f19694d = str;
        return this;
    }

    /* renamed from: d */
    public String mo17931d() {
        try {
            return this.f19703m.getString("link");
        } catch (JSONException e) {
            String str = f19691a;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: e */
    public MediaFile mo17932e(String str) {
        this.f19695e = str;
        return this;
    }

    /* renamed from: e */
    public String mo17933e() {
        return this.f19693c;
    }

    /* renamed from: f */
    public MediaFile mo17934f(String str) {
        this.f19696f = str;
        return this;
    }

    /* renamed from: f */
    public String mo17935f() {
        return this.f19692b;
    }

    /* renamed from: g */
    public MediaFile mo17936g(String str) {
        this.f19704n = str;
        return this;
    }

    /* renamed from: g */
    public String mo17937g() {
        return this.f19701k;
    }

    /* renamed from: h */
    public void mo17938h() {
        long j;
        String str = " MB";
        if (this.f19698h < 1024) {
            str = " bytes";
            j = this.f19698h;
        } else if (this.f19698h < 1048576) {
            str = " KB";
            j = this.f19698h / 1024;
        } else {
            j = this.f19698h / 1048576;
        }
        double d = (double) j;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append(decimalFormat.format(d));
        sb.append(str);
        this.f19701k = sb.toString();
    }

    /* renamed from: i */
    public long mo17939i() {
        return this.f19698h;
    }

    /* renamed from: j */
    public String mo17940j() {
        return this.f19694d;
    }

    /* renamed from: k */
    public String mo17941k() {
        return this.f19695e;
    }

    /* renamed from: l */
    public String mo17942l() {
        return this.f19696f;
    }

    /* renamed from: m */
    public String mo17943m() {
        return this.f19704n;
    }
}
