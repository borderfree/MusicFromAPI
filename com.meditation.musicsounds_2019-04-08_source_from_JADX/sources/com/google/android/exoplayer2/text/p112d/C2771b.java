package com.google.android.exoplayer2.text.p112d;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.text.C2741a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.google.android.exoplayer2.text.d.b */
final class C2771b {

    /* renamed from: a */
    public final String f9559a;

    /* renamed from: b */
    public final String f9560b;

    /* renamed from: c */
    public final boolean f9561c;

    /* renamed from: d */
    public final long f9562d;

    /* renamed from: e */
    public final long f9563e;

    /* renamed from: f */
    public final C2774e f9564f;

    /* renamed from: g */
    public final String f9565g;

    /* renamed from: h */
    private final String[] f9566h;

    /* renamed from: i */
    private final HashMap<String, Integer> f9567i;

    /* renamed from: j */
    private final HashMap<String, Integer> f9568j;

    /* renamed from: k */
    private List<C2771b> f9569k;

    private C2771b(String str, String str2, long j, long j2, C2774e eVar, String[] strArr, String str3) {
        this.f9559a = str;
        this.f9560b = str2;
        this.f9564f = eVar;
        this.f9566h = strArr;
        this.f9561c = str2 != null;
        this.f9562d = j;
        this.f9563e = j2;
        this.f9565g = (String) C2488a.m11664a(str3);
        this.f9567i = new HashMap<>();
        this.f9568j = new HashMap<>();
    }

    /* renamed from: a */
    private SpannableStringBuilder m13156a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int i3 = 0;
        int length = spannableStringBuilder.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (spannableStringBuilder.charAt(i4) == ' ') {
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                    i6++;
                }
                int i7 = i6 - i5;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i4, i4 + i7);
                    length -= i7;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i8 = 0;
        while (true) {
            i = length - 1;
            if (i8 >= i) {
                break;
            }
            if (spannableStringBuilder.charAt(i8) == 10) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                    length--;
                }
            }
            i8++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
            spannableStringBuilder.delete(i, length);
            length--;
        }
        while (true) {
            i2 = length - 1;
            if (i3 >= i2) {
                break;
            }
            if (spannableStringBuilder.charAt(i3) == ' ') {
                int i10 = i3 + 1;
                if (spannableStringBuilder.charAt(i10) == 10) {
                    spannableStringBuilder.delete(i3, i10);
                    length--;
                }
            }
            i3++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
            spannableStringBuilder.delete(i2, length);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    private static SpannableStringBuilder m13157a(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    /* renamed from: a */
    public static C2771b m13158a(String str) {
        C2771b bVar = new C2771b(null, C2773d.m13171a(str), -9223372036854775807L, -9223372036854775807L, null, null, "");
        return bVar;
    }

    /* renamed from: a */
    public static C2771b m13159a(String str, long j, long j2, C2774e eVar, String[] strArr, String str2) {
        C2771b bVar = new C2771b(str, null, j, j2, eVar, strArr, str2);
        return bVar;
    }

    /* renamed from: a */
    private void m13160a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.f9567i.clear();
        this.f9568j.clear();
        String str2 = this.f9565g;
        if (!"".equals(str2)) {
            str = str2;
        }
        if (this.f9561c && z) {
            m13157a(str, map).append(this.f9560b);
        } else if ("br".equals(this.f9559a) && z) {
            m13157a(str, map).append(10);
        } else if (!"metadata".equals(this.f9559a) && mo9444a(j)) {
            boolean equals = "p".equals(this.f9559a);
            for (Entry entry : map.entrySet()) {
                this.f9567i.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
            }
            for (int i = 0; i < mo9440a(); i++) {
                mo9441a(i).m13160a(j, z || equals, str, map);
            }
            if (equals) {
                C2773d.m13172a(m13157a(str, map));
            }
            for (Entry entry2 : map.entrySet()) {
                this.f9568j.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
            }
        }
    }

    /* renamed from: a */
    private void m13161a(Map<String, C2774e> map, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i != i2) {
            C2774e a = C2773d.m13170a(this.f9564f, this.f9566h, map);
            if (a != null) {
                C2773d.m13173a(spannableStringBuilder, i, i2, a);
            }
        }
    }

    /* renamed from: a */
    private void m13162a(Map<String, C2774e> map, Map<String, SpannableStringBuilder> map2) {
        for (Entry entry : this.f9568j.entrySet()) {
            String str = (String) entry.getKey();
            m13161a(map, (SpannableStringBuilder) map2.get(str), this.f9567i.containsKey(str) ? ((Integer) this.f9567i.get(str)).intValue() : 0, ((Integer) entry.getValue()).intValue());
            for (int i = 0; i < mo9440a(); i++) {
                mo9441a(i).m13162a(map, map2);
            }
        }
    }

    /* renamed from: a */
    private void m13163a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f9559a);
        if (z || equals) {
            if (this.f9562d != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f9562d));
            }
            if (this.f9563e != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.f9563e));
            }
        }
        if (this.f9569k != null) {
            for (int i = 0; i < this.f9569k.size(); i++) {
                ((C2771b) this.f9569k.get(i)).m13163a(treeSet, z || equals);
            }
        }
    }

    /* renamed from: a */
    public int mo9440a() {
        if (this.f9569k == null) {
            return 0;
        }
        return this.f9569k.size();
    }

    /* renamed from: a */
    public C2771b mo9441a(int i) {
        if (this.f9569k != null) {
            return (C2771b) this.f9569k.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public List<C2741a> mo9442a(long j, Map<String, C2774e> map, Map<String, C2772c> map2) {
        TreeMap treeMap = new TreeMap();
        m13160a(j, false, this.f9565g, (Map<String, SpannableStringBuilder>) treeMap);
        m13162a(map, (Map<String, SpannableStringBuilder>) treeMap);
        ArrayList arrayList = new ArrayList();
        for (Entry entry : treeMap.entrySet()) {
            C2772c cVar = (C2772c) map2.get(entry.getKey());
            C2741a aVar = new C2741a(m13156a((SpannableStringBuilder) entry.getValue()), null, cVar.f9572c, cVar.f9573d, cVar.f9574e, cVar.f9571b, Integer.MIN_VALUE, cVar.f9575f);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo9443a(C2771b bVar) {
        if (this.f9569k == null) {
            this.f9569k = new ArrayList();
        }
        this.f9569k.add(bVar);
    }

    /* renamed from: a */
    public boolean mo9444a(long j) {
        return (this.f9562d == -9223372036854775807L && this.f9563e == -9223372036854775807L) || (this.f9562d <= j && this.f9563e == -9223372036854775807L) || ((this.f9562d == -9223372036854775807L && j < this.f9563e) || (this.f9562d <= j && j < this.f9563e));
    }

    /* renamed from: b */
    public long[] mo9445b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        m13163a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            jArr[i] = ((Long) it.next()).longValue();
            i = i2;
        }
        return jArr;
    }
}
