package com.seattleclouds.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.seattleclouds.util.w */
public class C6642w {
    /* renamed from: a */
    public static <K, V extends Comparable<? super V>> Map<K, V> m32093a(Map<K, V> map) {
        LinkedList<Entry> linkedList = new LinkedList<>(map.entrySet());
        Collections.sort(linkedList, new Comparator<Entry<K, V>>() {
            /* renamed from: a */
            public int compare(Entry<K, V> entry, Entry<K, V> entry2) {
                return ((Comparable) entry2.getValue()).compareTo(entry.getValue());
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : linkedList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
