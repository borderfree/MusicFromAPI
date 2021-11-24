package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzp {
    /* renamed from: a */
    private static String m13702a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String str = obj == null ? "null" : obj instanceof Bundle ? m13702a((Bundle) obj) : obj.toString();
            sb.append(str);
        }
        return sb.toString();
    }

    public static Object[] zza(String str, zzjj zzjj, String str2, int i, zzjn zzjn) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzjj.f15482b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m13702a(zzjj.f15483c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzjj.f15484d));
        }
        if (hashSet.contains("keywords")) {
            if (zzjj.f15485e != null) {
                arrayList.add(zzjj.f15485e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzjj.f15486f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzjj.f15487g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzjj.f15488h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzjj.f15489i);
        }
        if (hashSet.contains("location")) {
            if (zzjj.f15491k != null) {
                arrayList.add(zzjj.f15491k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzjj.f15492l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m13702a(zzjj.f15493m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m13702a(zzjj.f15494n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzjj.f15495o != null) {
                arrayList.add(zzjj.f15495o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzjj.f15496p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzjj.f15497q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzjj.f15498r));
        }
        return arrayList.toArray();
    }
}
