package com.seattleclouds.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.seattleclouds.util.e */
public class C6609e {
    /* renamed from: a */
    public static <T> ArrayList<T> m31965a(T... tArr) {
        if (tArr == null) {
            return new ArrayList<>();
        }
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static HashMap<String, String> m31966a(String... strArr) {
        if (strArr == null) {
            return new HashMap<>();
        }
        HashMap<String, String> hashMap = new HashMap<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            hashMap.put(strArr[i], strArr[i + 1]);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static <T> HashSet<T> m31967b(T... tArr) {
        if (tArr == null) {
            return new HashSet<>();
        }
        HashSet<T> hashSet = new HashSet<>(tArr.length);
        for (T add : tArr) {
            hashSet.add(add);
        }
        return hashSet;
    }
}
