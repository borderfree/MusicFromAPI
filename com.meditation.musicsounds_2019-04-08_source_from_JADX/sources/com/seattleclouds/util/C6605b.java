package com.seattleclouds.util;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: com.seattleclouds.util.b */
public class C6605b {

    /* renamed from: a */
    private final Map<String, Object> f23322a = new HashMap();

    /* renamed from: b */
    private final Random f23323b = new Random();

    /* renamed from: com.seattleclouds.util.b$a */
    private static class C6606a {

        /* renamed from: a */
        public static final C6605b f23324a = new C6605b();
    }

    /* renamed from: a */
    public static C6605b m31955a() {
        return C6606a.f23324a;
    }

    /* renamed from: a */
    private synchronized String m31956a(Object obj) {
        String b;
        b = m31957b();
        this.f23322a.put(b, obj);
        return b;
    }

    /* renamed from: b */
    private String m31957b() {
        String num;
        do {
            num = Integer.toString(this.f23323b.nextInt());
        } while (this.f23322a.containsKey(num));
        return num;
    }

    /* renamed from: a */
    public synchronized Object mo20594a(String str) {
        return this.f23322a.get(str);
    }

    /* renamed from: a */
    public String mo20595a(ArrayList<? extends Parcelable> arrayList) {
        return m31956a((Object) arrayList);
    }

    /* renamed from: b */
    public synchronized void mo20596b(String str) {
        this.f23322a.remove(str);
    }
}
