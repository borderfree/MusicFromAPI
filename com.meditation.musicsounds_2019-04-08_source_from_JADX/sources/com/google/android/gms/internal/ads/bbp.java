package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@C3464ci
public final class bbp implements MediationAdRequest {

    /* renamed from: a */
    private final Date f13527a;

    /* renamed from: b */
    private final int f13528b;

    /* renamed from: c */
    private final Set<String> f13529c;

    /* renamed from: d */
    private final boolean f13530d;

    /* renamed from: e */
    private final Location f13531e;

    /* renamed from: f */
    private final int f13532f;

    /* renamed from: g */
    private final boolean f13533g;

    public bbp(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f13527a = date;
        this.f13528b = i;
        this.f13529c = set;
        this.f13531e = location;
        this.f13530d = z;
        this.f13532f = i2;
        this.f13533g = z2;
    }

    public final Date getBirthday() {
        return this.f13527a;
    }

    public final int getGender() {
        return this.f13528b;
    }

    public final Set<String> getKeywords() {
        return this.f13529c;
    }

    public final Location getLocation() {
        return this.f13531e;
    }

    public final boolean isDesignedForFamilies() {
        return this.f13533g;
    }

    public final boolean isTesting() {
        return this.f13530d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f13532f;
    }
}
