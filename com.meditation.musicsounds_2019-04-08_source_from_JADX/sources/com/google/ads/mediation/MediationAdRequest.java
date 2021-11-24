package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {

    /* renamed from: a */
    private final Date f7581a;

    /* renamed from: b */
    private final Gender f7582b;

    /* renamed from: c */
    private final Set<String> f7583c;

    /* renamed from: d */
    private final boolean f7584d;

    /* renamed from: e */
    private final Location f7585e;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.f7581a = date;
        this.f7582b = gender;
        this.f7583c = set;
        this.f7584d = z;
        this.f7585e = location;
    }

    public Integer getAgeInYears() {
        if (this.f7581a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.f7581a);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        if (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) {
            valueOf = Integer.valueOf(valueOf.intValue() - 1);
        }
        return valueOf;
    }

    public Date getBirthday() {
        return this.f7581a;
    }

    public Gender getGender() {
        return this.f7582b;
    }

    public Set<String> getKeywords() {
        return this.f7583c;
    }

    public Location getLocation() {
        return this.f7585e;
    }

    public boolean isTesting() {
        return this.f7584d;
    }
}
