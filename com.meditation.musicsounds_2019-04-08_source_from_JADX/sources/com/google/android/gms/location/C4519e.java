package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.e */
public class C4519e {

    /* renamed from: a */
    private final int f16521a;

    /* renamed from: b */
    private final int f16522b;

    /* renamed from: c */
    private final List<C4515b> f16523c;

    /* renamed from: d */
    private final Location f16524d;

    private C4519e(int i, int i2, List<C4515b> list, Location location) {
        this.f16521a = i;
        this.f16522b = i2;
        this.f16523c = list;
        this.f16524d = location;
    }

    /* renamed from: a */
    public static C4519e m22605a(Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra("gms_error_code", -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1 && (intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4)) {
            i = intExtra2;
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            ArrayList arrayList3 = arrayList2;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList.add(zzbh.m20921a((byte[]) obj));
            }
        }
        return new C4519e(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    /* renamed from: a */
    public boolean mo14980a() {
        return this.f16521a != -1;
    }

    /* renamed from: b */
    public int mo14981b() {
        return this.f16521a;
    }

    /* renamed from: c */
    public int mo14982c() {
        return this.f16522b;
    }

    /* renamed from: d */
    public List<C4515b> mo14983d() {
        return this.f16523c;
    }
}
