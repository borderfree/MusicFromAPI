package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@C3464ci
public final class bbu implements NativeMediationAdRequest {

    /* renamed from: a */
    private final Date f13542a;

    /* renamed from: b */
    private final int f13543b;

    /* renamed from: c */
    private final Set<String> f13544c;

    /* renamed from: d */
    private final boolean f13545d;

    /* renamed from: e */
    private final Location f13546e;

    /* renamed from: f */
    private final int f13547f;

    /* renamed from: g */
    private final zzpl f13548g;

    /* renamed from: h */
    private final List<String> f13549h = new ArrayList();

    /* renamed from: i */
    private final boolean f13550i;

    /* renamed from: j */
    private final Map<String, Boolean> f13551j = new HashMap();

    public bbu(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzpl zzpl, List<String> list, boolean z2) {
        Map<String, Boolean> map;
        String str;
        Boolean valueOf;
        this.f13542a = date;
        this.f13543b = i;
        this.f13544c = set;
        this.f13546e = location;
        this.f13545d = z;
        this.f13547f = i2;
        this.f13548g = zzpl;
        this.f13550i = z2;
        String str2 = "custom:";
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith(str2)) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.f13551j;
                            str = split[1];
                            valueOf = Boolean.valueOf(true);
                        } else if ("false".equals(split[2])) {
                            map = this.f13551j;
                            str = split[1];
                            valueOf = Boolean.valueOf(false);
                        }
                        map.put(str, valueOf);
                    }
                } else {
                    this.f13549h.add(str3);
                }
            }
        }
    }

    public final float getAdVolume() {
        return apf.m16830a().mo12240b();
    }

    public final Date getBirthday() {
        return this.f13542a;
    }

    public final int getGender() {
        return this.f13543b;
    }

    public final Set<String> getKeywords() {
        return this.f13544c;
    }

    public final Location getLocation() {
        return this.f13546e;
    }

    public final NativeAdOptions getNativeAdOptions() {
        if (this.f13548g == null) {
            return null;
        }
        Builder requestMultipleImages = new Builder().setReturnUrlsForImageAssets(this.f13548g.f15515b).setImageOrientation(this.f13548g.f15516c).setRequestMultipleImages(this.f13548g.f15517d);
        if (this.f13548g.f15514a >= 2) {
            requestMultipleImages.setAdChoicesPlacement(this.f13548g.f15518e);
        }
        if (this.f13548g.f15514a >= 3 && this.f13548g.f15519f != null) {
            requestMultipleImages.setVideoOptions(new VideoOptions(this.f13548g.f15519f));
        }
        return requestMultipleImages.build();
    }

    public final boolean isAdMuted() {
        return apf.m16830a().mo12241c();
    }

    public final boolean isAppInstallAdRequested() {
        return this.f13549h != null && (this.f13549h.contains("2") || this.f13549h.contains("6"));
    }

    public final boolean isContentAdRequested() {
        return this.f13549h != null && (this.f13549h.contains("1") || this.f13549h.contains("6"));
    }

    public final boolean isDesignedForFamilies() {
        return this.f13550i;
    }

    public final boolean isTesting() {
        return this.f13545d;
    }

    public final boolean isUnifiedNativeAdRequested() {
        return this.f13549h != null && this.f13549h.contains("6");
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f13547f;
    }

    public final boolean zzna() {
        return this.f13549h != null && this.f13549h.contains("3");
    }

    public final Map<String, Boolean> zznb() {
        return this.f13551j;
    }
}
