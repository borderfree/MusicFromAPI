package com.google.ads.mediation.inmobi;

import com.google.ads.mediation.NetworkExtras;
import com.inmobi.commons.EducationType;
import com.inmobi.commons.EthnicityType;
import com.inmobi.commons.HasChildren;
import com.inmobi.commons.IMIDType;
import com.inmobi.commons.MaritalStatus;
import com.inmobi.commons.SexualOrientation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class InMobiAdapterExtras implements NetworkExtras {

    /* renamed from: a */
    private String f7615a = null;

    /* renamed from: b */
    private String f7616b = null;

    /* renamed from: c */
    private String f7617c = null;

    /* renamed from: d */
    private EducationType f7618d = null;

    /* renamed from: e */
    private EthnicityType f7619e = null;

    /* renamed from: f */
    private Integer f7620f = null;

    /* renamed from: g */
    private Integer f7621g = null;

    /* renamed from: h */
    private Set<String> f7622h = null;

    /* renamed from: i */
    private String f7623i = null;

    /* renamed from: j */
    private String f7624j = null;

    /* renamed from: k */
    private HasChildren f7625k = null;

    /* renamed from: l */
    private SexualOrientation f7626l = null;

    /* renamed from: m */
    private MaritalStatus f7627m = null;

    /* renamed from: n */
    private String f7628n = null;

    /* renamed from: o */
    private String f7629o = null;

    /* renamed from: p */
    private Map<String, String> f7630p;

    /* renamed from: q */
    private String f7631q = null;

    /* renamed from: r */
    private String f7632r = null;

    /* renamed from: s */
    private String f7633s = null;

    /* renamed from: t */
    private int f7634t;

    /* renamed from: u */
    private Map<IMIDType, String> f7635u = new HashMap();

    public void addIDType(IMIDType iMIDType, String str) {
        if (this.f7635u != null) {
            this.f7635u.put(iMIDType, str);
        }
    }

    public void addInterests(String str) {
        if (this.f7622h == null) {
            this.f7622h = new HashSet();
        }
        this.f7622h.add(str);
    }

    public InMobiAdapterExtras clearAge() {
        return setAge(null);
    }

    public InMobiAdapterExtras clearAreaCode() {
        return setAreaCode(null);
    }

    public InMobiAdapterExtras clearCityStateCountry() {
        return setCityStateCountry(null, null, null);
    }

    public InMobiAdapterExtras clearDeviceIdMask() {
        setDeviceIDMask(1);
        return this;
    }

    public InMobiAdapterExtras clearEducation() {
        return setEducation(null);
    }

    public InMobiAdapterExtras clearEthnicity() {
        return setEthnicity(null);
    }

    public InMobiAdapterExtras clearIncome() {
        return setIncome(null);
    }

    public InMobiAdapterExtras clearInterests() {
        return setInterests(null);
    }

    public InMobiAdapterExtras clearKeywords() {
        return setKeywords(null);
    }

    public InMobiAdapterExtras clearLanguage() {
        return setlanguage(null);
    }

    public InMobiAdapterExtras clearMartialStatus() {
        return setMartialStatus(null);
    }

    public InMobiAdapterExtras clearPostalCode() {
        return setPostalCode(null);
    }

    public InMobiAdapterExtras clearRefTag() {
        return setRefTag(null, null);
    }

    public InMobiAdapterExtras clearRequestParams() {
        return setRequestParams(null);
    }

    public InMobiAdapterExtras clearSearchString() {
        return setSearchString(null);
    }

    public InMobiAdapterExtras clearhasChildren() {
        return setHasChildren(null);
    }

    public InMobiAdapterExtras clearsexualOrientations() {
        return setSexualOrientation(null);
    }

    public Integer getAge() {
        return this.f7621g;
    }

    public String getAreaCode() {
        return this.f7615a;
    }

    public String getCity() {
        return this.f7632r;
    }

    public String getCountry() {
        return this.f7633s;
    }

    public int getDeviceIdMask() {
        return this.f7634t;
    }

    public EducationType getEducation() {
        return this.f7618d;
    }

    public EthnicityType getEthnicity() {
        return this.f7619e;
    }

    public HasChildren getHasChildren() {
        return this.f7625k;
    }

    public String getIDType(IMIDType iMIDType) {
        if (this.f7635u != null) {
            return (String) this.f7635u.get(iMIDType);
        }
        return null;
    }

    public Integer getIncome() {
        return this.f7620f;
    }

    public Set<String> getInterests() {
        if (this.f7622h == null) {
            return null;
        }
        return Collections.unmodifiableSet(this.f7622h);
    }

    public String getKeywords() {
        return this.f7629o;
    }

    public String getLangauge() {
        return this.f7628n;
    }

    public MaritalStatus getMartialStatus() {
        return this.f7627m;
    }

    public String getPostalCode() {
        return this.f7623i;
    }

    public String getRefTagKey() {
        return this.f7616b;
    }

    public String getRefTagValue() {
        return this.f7617c;
    }

    public Map<String, String> getRequestParams() {
        return this.f7630p;
    }

    public String getSearchString() {
        return this.f7624j;
    }

    public SexualOrientation getSexualOrientations() {
        return this.f7626l;
    }

    public String getState() {
        return this.f7631q;
    }

    public void removeIDType(IMIDType iMIDType) {
        if (this.f7635u != null) {
            this.f7635u.remove(iMIDType);
        }
    }

    public InMobiAdapterExtras setAge(Integer num) {
        this.f7621g = num;
        return this;
    }

    public InMobiAdapterExtras setAreaCode(String str) {
        this.f7615a = str;
        return this;
    }

    public InMobiAdapterExtras setCityStateCountry(String str, String str2, String str3) {
        this.f7631q = str2;
        this.f7632r = str;
        this.f7633s = str3;
        return this;
    }

    public void setDeviceIDMask(int i) {
        this.f7634t = i;
    }

    public InMobiAdapterExtras setEducation(EducationType educationType) {
        this.f7618d = educationType;
        return this;
    }

    public InMobiAdapterExtras setEthnicity(EthnicityType ethnicityType) {
        this.f7619e = ethnicityType;
        return this;
    }

    public InMobiAdapterExtras setHasChildren(HasChildren hasChildren) {
        this.f7625k = hasChildren;
        return this;
    }

    public InMobiAdapterExtras setIncome(Integer num) {
        this.f7620f = num;
        return this;
    }

    public InMobiAdapterExtras setInterests(Collection<String> collection) {
        if (collection == null) {
            this.f7622h = new HashSet();
        } else {
            this.f7622h = new HashSet(collection);
        }
        return this;
    }

    public InMobiAdapterExtras setKeywords(String str) {
        this.f7629o = str;
        return this;
    }

    public InMobiAdapterExtras setMartialStatus(MaritalStatus maritalStatus) {
        this.f7627m = maritalStatus;
        return this;
    }

    public InMobiAdapterExtras setPostalCode(String str) {
        this.f7623i = str;
        return this;
    }

    public InMobiAdapterExtras setRefTag(String str, String str2) {
        this.f7616b = str;
        this.f7617c = str2;
        return this;
    }

    public InMobiAdapterExtras setRequestParams(Map<String, String> map) {
        this.f7630p = map;
        return this;
    }

    public InMobiAdapterExtras setSearchString(String str) {
        this.f7624j = str;
        return this;
    }

    public InMobiAdapterExtras setSexualOrientation(SexualOrientation sexualOrientation) {
        this.f7626l = sexualOrientation;
        return this;
    }

    public InMobiAdapterExtras setlanguage(String str) {
        this.f7628n = str;
        return this;
    }
}
