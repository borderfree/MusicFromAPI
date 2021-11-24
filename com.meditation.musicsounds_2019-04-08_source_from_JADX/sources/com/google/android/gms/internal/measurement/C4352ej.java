package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.ej */
final class C4352ej implements Comparator<zzte> {
    C4352ej() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzte zzte = (zzte) obj;
        zzte zzte2 = (zzte) obj2;
        C4356en enVar = (C4356en) zzte.iterator();
        C4356en enVar2 = (C4356en) zzte2.iterator();
        while (enVar.hasNext() && enVar2.hasNext()) {
            int compare = Integer.compare(zzte.m22405a(enVar.mo14328a()), zzte.m22405a(enVar2.mo14328a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzte.size(), zzte2.size());
    }
}
