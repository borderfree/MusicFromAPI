package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.List;

@C3464ci
public final class zzhl extends AbstractSafeParcelable {
    public static final Creator<zzhl> CREATOR = new akp();

    /* renamed from: a */
    public final String f15449a;

    /* renamed from: b */
    private final long f15450b;

    /* renamed from: c */
    private final String f15451c;

    /* renamed from: d */
    private final String f15452d;

    /* renamed from: e */
    private final String f15453e;

    /* renamed from: f */
    private final Bundle f15454f;

    /* renamed from: g */
    private final boolean f15455g;

    /* renamed from: h */
    private long f15456h;

    zzhl(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f15449a = str;
        this.f15450b = j;
        if (str2 == null) {
            str2 = "";
        }
        this.f15451c = str2;
        if (str3 == null) {
            str3 = "";
        }
        this.f15452d = str3;
        if (str4 == null) {
            str4 = "";
        }
        this.f15453e = str4;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f15454f = bundle;
        this.f15455g = z;
        this.f15456h = j2;
    }

    /* renamed from: a */
    public static zzhl m20753a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C3643iy.m19178e(sb.toString());
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : zzbv.zzem().mo13149a(uri)) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            zzhl zzhl = new zzhl(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
            return zzhl;
        } catch (NullPointerException | NumberFormatException e) {
            C3643iy.m19175c("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static zzhl m20754a(String str) {
        return m20753a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15449a, false);
        C3267a.m14961a(parcel, 3, this.f15450b);
        C3267a.m14968a(parcel, 4, this.f15451c, false);
        C3267a.m14968a(parcel, 5, this.f15452d, false);
        C3267a.m14968a(parcel, 6, this.f15453e, false);
        C3267a.m14962a(parcel, 7, this.f15454f, false);
        C3267a.m14971a(parcel, 8, this.f15455g);
        C3267a.m14961a(parcel, 9, this.f15456h);
        C3267a.m14956a(parcel, a);
    }
}
