package com.seattleclouds.util;

import android.os.Bundle;
import com.seattleclouds.modules.feedback.LocationModel;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.util.c */
public class C6607c {
    /* renamed from: a */
    public static ArrayList<LocationModel> m31961a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("ArgumentUtil.locationsList")) {
            return bundle.getParcelableArrayList("ArgumentUtil.locationsList");
        }
        return (ArrayList) C6605b.m31955a().mo20594a(bundle.getString("ArgumentUtil.locationsTicket"));
    }

    /* renamed from: a */
    public static void m31962a(Bundle bundle, ArrayList<LocationModel> arrayList) {
        if (bundle != null) {
            if (arrayList == null || arrayList.size() <= 50) {
                bundle.putParcelableArrayList("ArgumentUtil.locationsList", arrayList);
            } else {
                bundle.putString("ArgumentUtil.locationsTicket", C6605b.m31955a().mo20595a(arrayList));
            }
        }
    }

    /* renamed from: b */
    public static void m31963b(Bundle bundle) {
        if (bundle != null && bundle.containsKey("ArgumentUtil.locationsTicket")) {
            C6605b.m31955a().mo20596b(bundle.getString("ArgumentUtil.locationsTicket"));
        }
    }
}
