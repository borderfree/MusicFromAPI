package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzael extends AbstractSafeParcelable {
    public static final Creator<zzael> CREATOR = new C3492dj();

    /* renamed from: a */
    public final boolean f15333a;

    /* renamed from: b */
    public final List<String> f15334b;

    public zzael() {
        this(false, Collections.emptyList());
    }

    public zzael(boolean z, List<String> list) {
        this.f15333a = z;
        this.f15334b = list;
    }

    /* renamed from: a */
    public static zzael m20612a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new zzael();
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("reporting_urls");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(optJSONArray.getString(i));
                } catch (JSONException e) {
                    C3643iy.m19175c("Error grabbing url from json.", e);
                }
            }
        }
        return new zzael(jSONObject.optBoolean("enable_protection"), arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14971a(parcel, 2, this.f15333a);
        C3267a.m14978b(parcel, 3, this.f15334b, false);
        C3267a.m14956a(parcel, a);
    }
}
