package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public final class asc {

    /* renamed from: a */
    public final int f13057a;

    /* renamed from: b */
    public final byte[] f13058b;

    /* renamed from: c */
    public final Map<String, String> f13059c;

    /* renamed from: d */
    public final List<aod> f13060d;

    /* renamed from: e */
    public final boolean f13061e;

    /* renamed from: f */
    private final long f13062f;

    private asc(int i, byte[] bArr, Map<String, String> map, List<aod> list, boolean z, long j) {
        this.f13057a = i;
        this.f13058b = bArr;
        this.f13059c = map;
        this.f13060d = list == null ? null : Collections.unmodifiableList(list);
        this.f13061e = z;
        this.f13062f = j;
    }

    @Deprecated
    public asc(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new aod((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        List list = arrayList;
        this(i, bArr, map, list, z, j);
    }

    public asc(int i, byte[] bArr, boolean z, long j, List<aod> list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (aod aod : list) {
                treeMap.put(aod.mo12126a(), aod.mo12127b());
            }
        }
        Map map = treeMap;
        this(i, bArr, map, list, z, j);
    }

    @Deprecated
    public asc(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0);
    }
}
