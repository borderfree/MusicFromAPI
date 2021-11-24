package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C2841R;

@C3464ci
public final class ams {

    /* renamed from: a */
    private final AdSize[] f12444a;

    /* renamed from: b */
    private final String f12445b;

    public ams(Context context, AttributeSet attributeSet) {
        AdSize[] a;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C2841R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(C2841R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(C2841R.styleable.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            a = m16603a(string);
        } else if (!z && z2) {
            a = m16603a(string2);
        } else if (z) {
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        this.f12444a = a;
        this.f12445b = obtainAttributes.getString(C2841R.styleable.AdsAttrs_adUnitId);
        if (TextUtils.isEmpty(this.f12445b)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* renamed from: a */
    private static AdSize[] m16603a(String str) {
        String[] split = str.split("\\s*,\\s*");
        AdSize[] adSizeArr = new AdSize[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    adSizeArr[i] = new AdSize("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    String str2 = "Could not parse XML attribute \"adSize\": ";
                    String valueOf = String.valueOf(trim);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.FULL_BANNER;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i] = AdSize.LEADERBOARD;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i] = AdSize.FLUID;
            } else if ("ICON".equals(trim)) {
                adSizeArr[i] = AdSize.zzup;
            } else {
                String str3 = "Could not parse XML attribute \"adSize\": ";
                String valueOf2 = String.valueOf(trim);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
        }
        if (adSizeArr.length != 0) {
            return adSizeArr;
        }
        String str4 = "Could not parse XML attribute \"adSize\": ";
        String valueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(valueOf3.length() != 0 ? str4.concat(valueOf3) : new String(str4));
    }

    /* renamed from: a */
    public final String mo12109a() {
        return this.f12445b;
    }

    /* renamed from: a */
    public final AdSize[] mo12110a(boolean z) {
        if (z || this.f12444a.length == 1) {
            return this.f12444a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }
}
