package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import org.json.JSONArray;
import org.json.JSONException;

@C3464ci
public final class zzaig extends AbstractSafeParcelable {
    public static final Creator<zzaig> CREATOR = new C3595hd();

    /* renamed from: a */
    public final String f15350a;

    /* renamed from: b */
    public final int f15351b;

    public zzaig(RewardItem rewardItem) {
        this(rewardItem.getType(), rewardItem.getAmount());
    }

    public zzaig(String str, int i) {
        this.f15350a = str;
        this.f15351b = i;
    }

    /* renamed from: a */
    public static zzaig m20616a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m20617a(new JSONArray(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static zzaig m20617a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzaig(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzaig)) {
            zzaig zzaig = (zzaig) obj;
            if (C3261q.m14906a(this.f15350a, zzaig.f15350a) && C3261q.m14906a(Integer.valueOf(this.f15351b), Integer.valueOf(zzaig.f15351b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C3261q.m14904a(this.f15350a, Integer.valueOf(this.f15351b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14968a(parcel, 2, this.f15350a, false);
        C3267a.m14960a(parcel, 3, this.f15351b);
        C3267a.m14956a(parcel, a);
    }
}
