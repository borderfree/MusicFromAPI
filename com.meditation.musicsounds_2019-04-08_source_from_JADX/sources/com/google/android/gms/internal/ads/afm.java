package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class afm {

    /* renamed from: e */
    private static final String[] f11904e = {"/aclk", "/pcs/click"};

    /* renamed from: a */
    private String f11905a = "googleads.g.doubleclick.net";

    /* renamed from: b */
    private String f11906b = "/pagead/ads";

    /* renamed from: c */
    private String f11907c = "ad.doubleclick.net";

    /* renamed from: d */
    private String[] f11908d = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: f */
    private afi f11909f;

    public afm(afi afi) {
        this.f11909f = afi;
    }

    /* renamed from: a */
    private final Uri m16118a(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean c = m16119c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzcj("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzcj("Query parameter already exists: ms");
            }
            String zza = z ? this.f11909f.zza(context, str, view, activity) : this.f11909f.zza(context);
            if (c) {
                String str2 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    StringBuilder sb = new StringBuilder(uri2.substring(0, i));
                    sb.append(str2);
                    sb.append("=");
                    sb.append(zza);
                    sb.append(";");
                    sb.append(uri2.substring(i));
                    return Uri.parse(sb.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder sb2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                sb2.append(";");
                sb2.append(str2);
                sb2.append("=");
                sb2.append(zza);
                sb2.append(";");
                sb2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(sb2.toString());
            }
            String str3 = "ms";
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str3, zza).build();
            }
            int i2 = indexOf3 + 1;
            StringBuilder sb3 = new StringBuilder(uri3.substring(0, i2));
            sb3.append(str3);
            sb3.append("=");
            sb3.append(zza);
            sb3.append("&");
            sb3.append(uri3.substring(i2));
            return Uri.parse(sb3.toString());
        } catch (UnsupportedOperationException unused) {
            throw new zzcj("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: c */
    private final boolean m16119c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f11907c);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    public final Uri mo11849a(Uri uri, Context context) {
        return m16118a(uri, context, null, false, null, null);
    }

    /* renamed from: a */
    public final Uri mo11850a(Uri uri, Context context, View view, Activity activity) {
        try {
            return m16118a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzcj("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    public final afi mo11851a() {
        return this.f11909f;
    }

    /* renamed from: a */
    public final void mo11852a(MotionEvent motionEvent) {
        this.f11909f.zza(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo11853a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f11908d) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final boolean mo11854b(Uri uri) {
        if (mo11853a(uri)) {
            for (String endsWith : f11904e) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
