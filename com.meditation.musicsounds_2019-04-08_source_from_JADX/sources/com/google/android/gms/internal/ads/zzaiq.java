package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

@C3464ci
public final class zzaiq extends AbstractSafeParcelable {
    public static final Creator<zzaiq> CREATOR = new C3604hm();

    /* renamed from: a */
    public final String f15352a;

    /* renamed from: b */
    public final String f15353b;

    /* renamed from: c */
    public final boolean f15354c;

    /* renamed from: d */
    public final boolean f15355d;

    /* renamed from: e */
    public final List<String> f15356e;

    /* renamed from: f */
    public final boolean f15357f;

    /* renamed from: g */
    public final boolean f15358g;

    /* renamed from: h */
    public final List<String> f15359h;

    public zzaiq(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f15352a = str;
        this.f15353b = str2;
        this.f15354c = z;
        this.f15355d = z2;
        this.f15356e = list;
        this.f15357f = z3;
        this.f15358g = z4;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        this.f15359h = list2;
    }

    /* renamed from: a */
    public static zzaiq m20618a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zzaiq zzaiq = new zzaiq(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C3702lc.m19077a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C3702lc.m19077a(jSONObject.optJSONArray("webview_permissions"), null));
        return zzaiq;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15352a, false);
        C3267a.m14968a(parcel, 3, this.f15353b, false);
        C3267a.m14971a(parcel, 4, this.f15354c);
        C3267a.m14971a(parcel, 5, this.f15355d);
        C3267a.m14978b(parcel, 6, this.f15356e, false);
        C3267a.m14971a(parcel, 7, this.f15357f);
        C3267a.m14971a(parcel, 8, this.f15358g);
        C3267a.m14978b(parcel, 9, this.f15359h, false);
        C3267a.m14956a(parcel, a);
    }
}
