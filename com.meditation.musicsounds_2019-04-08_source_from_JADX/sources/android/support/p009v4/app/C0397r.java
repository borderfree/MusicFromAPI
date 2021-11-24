package android.support.p009v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.view.C0626s;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.app.r */
class C0397r {

    /* renamed from: a */
    private static final int[] f1173a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    private static final C0408t f1174b = (VERSION.SDK_INT >= 21 ? new C0403s() : null);

    /* renamed from: c */
    private static final C0408t f1175c = m1830a();

    /* renamed from: android.support.v4.app.r$a */
    static class C0402a {

        /* renamed from: a */
        public Fragment f1204a;

        /* renamed from: b */
        public boolean f1205b;

        /* renamed from: c */
        public C0360c f1206c;

        /* renamed from: d */
        public Fragment f1207d;

        /* renamed from: e */
        public boolean f1208e;

        /* renamed from: f */
        public C0360c f1209f;

        C0402a() {
        }
    }

    /* renamed from: a */
    private static C0402a m1829a(C0402a aVar, SparseArray<C0402a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0402a aVar2 = new C0402a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0408t m1830a() {
        try {
            return (C0408t) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0408t m1831a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object Q = fragment.mo1207Q();
            if (Q != null) {
                arrayList.add(Q);
            }
            Object P = fragment.mo1206P();
            if (P != null) {
                arrayList.add(P);
            }
            Object T = fragment.mo1210T();
            if (T != null) {
                arrayList.add(T);
            }
        }
        if (fragment2 != null) {
            Object O = fragment2.mo1205O();
            if (O != null) {
                arrayList.add(O);
            }
            Object R = fragment2.mo1208R();
            if (R != null) {
                arrayList.add(R);
            }
            Object S = fragment2.mo1209S();
            if (S != null) {
                arrayList.add(S);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f1174b != null && m1852a(f1174b, (List<Object>) arrayList)) {
            return f1174b;
        }
        if (f1175c != null && m1852a(f1175c, (List<Object>) arrayList)) {
            return f1175c;
        }
        if (f1174b == null && f1175c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C0488a<String, String> m1832a(int i, ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C0488a<String, String> aVar = new C0488a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0360c cVar = (C0360c) arrayList.get(i4);
            if (cVar.mo1430c(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (cVar.f1047r != null) {
                    int size = cVar.f1047r.size();
                    if (booleanValue) {
                        arrayList3 = cVar.f1047r;
                        arrayList4 = cVar.f1048s;
                    } else {
                        ArrayList arrayList5 = cVar.f1047r;
                        arrayList3 = cVar.f1048s;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m1835a(C0408t tVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return tVar.mo969c(tVar.mo964b(z ? fragment2.mo1210T() : fragment.mo1209S()));
    }

    /* renamed from: a */
    private static Object m1836a(C0408t tVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return tVar.mo964b(z ? fragment.mo1208R() : fragment.mo1205O());
    }

    /* renamed from: a */
    private static Object m1837a(C0408t tVar, ViewGroup viewGroup, View view, C0488a<String, String> aVar, C0402a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final View view2;
        C0408t tVar2 = tVar;
        View view3 = view;
        C0488a<String, String> aVar3 = aVar;
        C0402a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = aVar4.f1204a;
        Fragment fragment2 = aVar4.f1207d;
        if (fragment != null) {
            fragment.mo1199I().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar4.f1205b;
        Object a = aVar.isEmpty() ? null : m1835a(tVar2, fragment, fragment2, z);
        C0488a b = m1853b(tVar2, aVar3, a, aVar4);
        C0488a c = m1862c(tVar2, aVar3, a, aVar4);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (c != null) {
                c.clear();
            }
            obj3 = null;
        } else {
            m1851a(arrayList3, b, (Collection<String>) aVar.keySet());
            m1851a(arrayList4, c, aVar.values());
            obj3 = a;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1858b(fragment, fragment2, z, b, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            tVar2.mo959a(obj3, view3, arrayList3);
            m1848a(tVar, obj3, obj2, b, aVar4.f1208e, aVar4.f1209f);
            Rect rect2 = new Rect();
            View b2 = m1854b(c, aVar4, obj4, z);
            if (b2 != null) {
                tVar2.mo957a(obj4, rect2);
            }
            rect = rect2;
            view2 = b2;
        } else {
            view2 = null;
            rect = null;
        }
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final C0488a aVar5 = c;
        final C0408t tVar3 = tVar;
        C04003 r0 = new Runnable() {
            public void run() {
                C0397r.m1858b(fragment3, fragment4, z2, aVar5, false);
                if (view2 != null) {
                    tVar3.mo1682a(view2, rect);
                }
            }
        };
        C0351ab.m1466a(viewGroup, r0);
        return obj3;
    }

    /* renamed from: a */
    private static Object m1838a(C0408t tVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo1212V() : fragment.mo1211U();
        return z2 ? tVar.mo955a(obj2, obj, obj3) : tVar.mo965b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m1839a(C0488a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo2011c(i))) {
                return (String) aVar.mo2010b(i);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r10.f947u != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r13 = r1;
        r1 = false;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0087, code lost:
        if (r10.f917K == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0089, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1842a(android.support.p009v4.app.C0360c r15, android.support.p009v4.app.C0360c.C0361a r16, android.util.SparseArray<android.support.p009v4.app.C0397r.C0402a> r17, boolean r18, boolean r19) {
        /*
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            android.support.v4.app.Fragment r10 = r1.f1052b
            if (r10 != 0) goto L_0x000c
            return
        L_0x000c:
            int r11 = r10.f915I
            if (r11 != 0) goto L_0x0011
            return
        L_0x0011:
            if (r3 == 0) goto L_0x001a
            int[] r4 = f1173a
            int r1 = r1.f1051a
            r1 = r4[r1]
            goto L_0x001c
        L_0x001a:
            int r1 = r1.f1051a
        L_0x001c:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x007c
            switch(r1) {
                case 3: goto L_0x0052;
                case 4: goto L_0x003a;
                case 5: goto L_0x0028;
                case 6: goto L_0x0052;
                case 7: goto L_0x007c;
                default: goto L_0x0023;
            }
        L_0x0023:
            r1 = 0
        L_0x0024:
            r12 = 0
            r13 = 0
            goto L_0x008f
        L_0x0028:
            if (r19 == 0) goto L_0x0037
            boolean r1 = r10.f932Z
            if (r1 == 0) goto L_0x008b
            boolean r1 = r10.f917K
            if (r1 != 0) goto L_0x008b
            boolean r1 = r10.f947u
            if (r1 == 0) goto L_0x008b
            goto L_0x0089
        L_0x0037:
            boolean r1 = r10.f917K
            goto L_0x008c
        L_0x003a:
            if (r19 == 0) goto L_0x0049
            boolean r1 = r10.f932Z
            if (r1 == 0) goto L_0x006d
            boolean r1 = r10.f947u
            if (r1 == 0) goto L_0x006d
            boolean r1 = r10.f917K
            if (r1 == 0) goto L_0x006d
        L_0x0048:
            goto L_0x006b
        L_0x0049:
            boolean r1 = r10.f947u
            if (r1 == 0) goto L_0x006d
            boolean r1 = r10.f917K
            if (r1 != 0) goto L_0x006d
            goto L_0x0048
        L_0x0052:
            if (r19 == 0) goto L_0x006f
            boolean r1 = r10.f947u
            if (r1 != 0) goto L_0x006d
            android.view.View r1 = r10.f925S
            if (r1 == 0) goto L_0x006d
            android.view.View r1 = r10.f925S
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x006d
            float r1 = r10.f933aa
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x006d
        L_0x006b:
            r1 = 1
            goto L_0x0078
        L_0x006d:
            r1 = 0
            goto L_0x0078
        L_0x006f:
            boolean r1 = r10.f947u
            if (r1 == 0) goto L_0x006d
            boolean r1 = r10.f917K
            if (r1 != 0) goto L_0x006d
            goto L_0x006b
        L_0x0078:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x008f
        L_0x007c:
            if (r19 == 0) goto L_0x0081
            boolean r1 = r10.f931Y
            goto L_0x008c
        L_0x0081:
            boolean r1 = r10.f947u
            if (r1 != 0) goto L_0x008b
            boolean r1 = r10.f917K
            if (r1 != 0) goto L_0x008b
        L_0x0089:
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            r4 = r1
            r1 = 1
            goto L_0x0024
        L_0x008f:
            java.lang.Object r6 = r2.get(r11)
            android.support.v4.app.r$a r6 = (android.support.p009v4.app.C0397r.C0402a) r6
            if (r4 == 0) goto L_0x00a1
            android.support.v4.app.r$a r6 = m1829a(r6, r2, r11)
            r6.f1204a = r10
            r6.f1205b = r3
            r6.f1206c = r0
        L_0x00a1:
            r14 = r6
            r9 = 0
            if (r19 != 0) goto L_0x00c9
            if (r1 == 0) goto L_0x00c9
            if (r14 == 0) goto L_0x00af
            android.support.v4.app.Fragment r1 = r14.f1207d
            if (r1 != r10) goto L_0x00af
            r14.f1207d = r9
        L_0x00af:
            android.support.v4.app.m r4 = r0.f1030a
            int r1 = r10.f937k
            if (r1 >= r5) goto L_0x00c9
            int r1 = r4.f1117l
            if (r1 < r5) goto L_0x00c9
            boolean r1 = r0.f1049t
            if (r1 != 0) goto L_0x00c9
            r4.mo1601g(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r1 = 0
            r5 = r10
            r9 = r1
            r4.mo1566a(r5, r6, r7, r8, r9)
        L_0x00c9:
            if (r13 == 0) goto L_0x00db
            if (r14 == 0) goto L_0x00d1
            android.support.v4.app.Fragment r1 = r14.f1207d
            if (r1 != 0) goto L_0x00db
        L_0x00d1:
            android.support.v4.app.r$a r14 = m1829a(r14, r2, r11)
            r14.f1207d = r10
            r14.f1208e = r3
            r14.f1209f = r0
        L_0x00db:
            if (r19 != 0) goto L_0x00e8
            if (r12 == 0) goto L_0x00e8
            if (r14 == 0) goto L_0x00e8
            android.support.v4.app.Fragment r0 = r14.f1204a
            if (r0 != r10) goto L_0x00e8
            r0 = 0
            r14.f1204a = r0
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.app.C0397r.m1842a(android.support.v4.app.c, android.support.v4.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m1843a(C0360c cVar, SparseArray<C0402a> sparseArray, boolean z) {
        int size = cVar.f1031b.size();
        for (int i = 0; i < size; i++) {
            m1842a(cVar, (C0361a) cVar.f1031b.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    private static void m1844a(C0377m mVar, int i, C0402a aVar, View view, C0488a<String, String> aVar2) {
        Object obj;
        C0377m mVar2 = mVar;
        C0402a aVar3 = aVar;
        View view2 = view;
        ViewGroup viewGroup = mVar2.f1119n.mo1331a() ? (ViewGroup) mVar2.f1119n.mo1330a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar3.f1204a;
            Fragment fragment2 = aVar3.f1207d;
            C0408t a = m1831a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar3.f1205b;
                boolean z2 = aVar3.f1208e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m1836a(a, fragment, z);
                Object b = m1855b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                Object a3 = m1837a(a, viewGroup, view, aVar2, aVar, arrayList2, arrayList, a2, b);
                Object obj3 = obj2;
                if (obj3 == null && a3 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList b2 = m1857b(a, obj, fragment2, arrayList3, view2);
                ArrayList b3 = m1857b(a, obj3, fragment, arrayList, view2);
                m1861b(b3, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList4 = b2;
                Object a4 = m1838a(a, obj3, obj, a3, fragment3, z);
                if (a4 != null) {
                    m1847a(a, obj, fragment2, arrayList4);
                    ArrayList a5 = a.mo1681a(arrayList);
                    a.mo960a(a4, obj3, b3, obj, arrayList4, a3, arrayList);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo956a(viewGroup3, a4);
                    a.mo1683a(viewGroup3, arrayList3, arrayList, a5, aVar2);
                    m1861b(b3, 0);
                    a.mo962a(a3, arrayList3, arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m1845a(C0377m mVar, ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (mVar.f1117l >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0360c cVar = (C0360c) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    m1859b(cVar, sparseArray, z);
                } else {
                    m1843a(cVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(mVar.f1118m.mo1529g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0488a a = m1832a(keyAt, arrayList, arrayList2, i, i2);
                    C0402a aVar = (C0402a) sparseArray.valueAt(i4);
                    if (z) {
                        m1844a(mVar, keyAt, aVar, view, a);
                    } else {
                        m1860b(mVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1846a(C0408t tVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final C0408t tVar2 = tVar;
        final View view2 = view;
        final Fragment fragment2 = fragment;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C03992 r0 = new Runnable() {
            public void run() {
                if (obj3 != null) {
                    tVar2.mo970c(obj3, view2);
                    arrayList5.addAll(C0397r.m1857b(tVar2, obj3, fragment2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        tVar2.mo968b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        };
        ViewGroup viewGroup2 = viewGroup;
        C0351ab.m1466a(viewGroup, r0);
    }

    /* renamed from: a */
    private static void m1847a(C0408t tVar, Object obj, Fragment fragment, final ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f947u && fragment.f917K && fragment.f932Z) {
            fragment.mo1306l(true);
            tVar.mo967b(obj, fragment.mo1199I(), arrayList);
            C0351ab.m1466a(fragment.f924R, new Runnable() {
                public void run() {
                    C0397r.m1861b(arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m1848a(C0408t tVar, Object obj, Object obj2, C0488a<String, View> aVar, boolean z, C0360c cVar) {
        if (cVar.f1047r != null && !cVar.f1047r.isEmpty()) {
            View view = (View) aVar.get((String) (z ? cVar.f1048s : cVar.f1047r).get(0));
            tVar.mo958a(obj, view);
            if (obj2 != null) {
                tVar.mo958a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m1849a(C0488a<String, String> aVar, C0488a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo2011c(size))) {
                aVar.mo2015d(size);
            }
        }
    }

    /* renamed from: a */
    private static void m1851a(ArrayList<View> arrayList, C0488a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo2011c(size);
            if (collection.contains(C0626s.m2870m(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m1852a(C0408t tVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!tVar.mo963a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C0488a<String, View> m1853b(C0408t tVar, C0488a<String, String> aVar, Object obj, C0402a aVar2) {
        C0353ad adVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f1207d;
        C0488a<String, View> aVar3 = new C0488a<>();
        tVar.mo1687a((Map<String, View>) aVar3, fragment.mo1199I());
        C0360c cVar = aVar2.f1209f;
        if (aVar2.f1208e) {
            adVar = fragment.mo1257al();
            arrayList = cVar.f1048s;
        } else {
            adVar = fragment.mo1258am();
            arrayList = cVar.f1047r;
        }
        aVar3.mo1878a(arrayList);
        if (adVar != null) {
            adVar.mo1390a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C0626s.m2870m(view))) {
                    aVar.put(C0626s.m2870m(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo1878a(aVar3.keySet());
        }
        return aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static View m1854b(C0488a<String, View> aVar, C0402a aVar2, Object obj, boolean z) {
        C0360c cVar = aVar2.f1206c;
        if (obj == null || aVar == null || cVar.f1047r == null || cVar.f1047r.isEmpty()) {
            return null;
        }
        return (View) aVar.get((String) (z ? cVar.f1047r : cVar.f1048s).get(0));
    }

    /* renamed from: b */
    private static Object m1855b(C0408t tVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return tVar.mo964b(z ? fragment.mo1206P() : fragment.mo1207Q());
    }

    /* renamed from: b */
    private static Object m1856b(C0408t tVar, ViewGroup viewGroup, View view, C0488a<String, String> aVar, C0402a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C0488a<String, String> aVar3;
        Object obj3;
        Object obj4;
        Rect rect;
        C0408t tVar2 = tVar;
        C0402a aVar4 = aVar2;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = aVar4.f1204a;
        Fragment fragment2 = aVar4.f1207d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = aVar4.f1205b;
        if (aVar.isEmpty()) {
            aVar3 = aVar;
            obj3 = null;
        } else {
            obj3 = m1835a(tVar2, fragment, fragment2, z);
            aVar3 = aVar;
        }
        C0488a b = m1853b(tVar2, aVar3, obj3, aVar4);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m1858b(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            tVar2.mo959a(obj4, view, arrayList3);
            m1848a(tVar, obj4, obj2, b, aVar4.f1208e, aVar4.f1209f);
            if (obj5 != null) {
                tVar2.mo957a(obj5, rect);
            }
        } else {
            rect = null;
        }
        final C0408t tVar3 = tVar;
        final C0488a<String, String> aVar5 = aVar;
        final Object obj6 = obj4;
        final C0402a aVar6 = aVar2;
        C04014 r13 = r0;
        final ArrayList<View> arrayList4 = arrayList2;
        final View view2 = view;
        final Fragment fragment3 = fragment;
        final Fragment fragment4 = fragment2;
        final boolean z2 = z;
        final ArrayList<View> arrayList5 = arrayList;
        final Object obj7 = obj;
        final Rect rect2 = rect;
        C04014 r0 = new Runnable() {
            public void run() {
                C0488a a = C0397r.m1862c(tVar3, aVar5, obj6, aVar6);
                if (a != null) {
                    arrayList4.addAll(a.values());
                    arrayList4.add(view2);
                }
                C0397r.m1858b(fragment3, fragment4, z2, a, false);
                if (obj6 != null) {
                    tVar3.mo962a(obj6, arrayList5, arrayList4);
                    View a2 = C0397r.m1854b(a, aVar6, obj7, z2);
                    if (a2 != null) {
                        tVar3.mo1682a(a2, rect2);
                    }
                }
            }
        };
        C0351ab.m1466a(viewGroup, r13);
        return obj4;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ArrayList<View> m1857b(C0408t tVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View I = fragment.mo1199I();
        if (I != null) {
            tVar.mo1686a(arrayList2, I);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        tVar.mo961a(obj, arrayList2);
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1858b(Fragment fragment, Fragment fragment2, boolean z, C0488a<String, View> aVar, boolean z2) {
        C0353ad al = z ? fragment2.mo1257al() : fragment.mo1257al();
        if (al != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo2010b(i));
                arrayList.add(aVar.mo2011c(i));
            }
            if (z2) {
                al.mo1389a(arrayList2, arrayList, null);
            } else {
                al.mo1391b(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: b */
    public static void m1859b(C0360c cVar, SparseArray<C0402a> sparseArray, boolean z) {
        if (cVar.f1030a.f1119n.mo1331a()) {
            for (int size = cVar.f1031b.size() - 1; size >= 0; size--) {
                m1842a(cVar, (C0361a) cVar.f1031b.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m1860b(C0377m mVar, int i, C0402a aVar, View view, C0488a<String, String> aVar2) {
        Object obj;
        C0377m mVar2 = mVar;
        C0402a aVar3 = aVar;
        View view2 = view;
        C0488a<String, String> aVar4 = aVar2;
        ViewGroup viewGroup = mVar2.f1119n.mo1331a() ? (ViewGroup) mVar2.f1119n.mo1330a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = aVar3.f1204a;
            Fragment fragment2 = aVar3.f1207d;
            C0408t a = m1831a(fragment2, fragment);
            if (a != null) {
                boolean z = aVar3.f1205b;
                boolean z2 = aVar3.f1208e;
                Object a2 = m1836a(a, fragment, z);
                Object b = m1855b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0408t tVar = a;
                Object b2 = m1856b(a, viewGroup, view, aVar2, aVar, arrayList, arrayList2, a2, obj2);
                Object obj4 = obj3;
                if (obj4 == null && b2 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList b3 = m1857b(tVar, obj, fragment2, arrayList3, view2);
                Object obj5 = (b3 == null || b3.isEmpty()) ? null : obj;
                tVar.mo966b(obj4, view2);
                Object a3 = m1838a(tVar, obj4, obj5, b2, fragment, aVar3.f1205b);
                if (a3 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    C0408t tVar2 = tVar;
                    tVar2.mo960a(a3, obj4, arrayList4, obj5, b3, b2, arrayList2);
                    m1846a(tVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList4, obj5, b3);
                    ArrayList arrayList5 = arrayList2;
                    tVar.mo1684a((View) viewGroup, arrayList5, (Map<String, String>) aVar4);
                    tVar.mo956a(viewGroup, a3);
                    tVar.mo1685a(viewGroup, arrayList5, (Map<String, String>) aVar4);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1861b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C0488a<String, View> m1862c(C0408t tVar, C0488a<String, String> aVar, Object obj, C0402a aVar2) {
        C0353ad adVar;
        ArrayList<String> arrayList;
        Fragment fragment = aVar2.f1204a;
        View I = fragment.mo1199I();
        if (aVar.isEmpty() || obj == null || I == null) {
            aVar.clear();
            return null;
        }
        C0488a<String, View> aVar3 = new C0488a<>();
        tVar.mo1687a((Map<String, View>) aVar3, I);
        C0360c cVar = aVar2.f1206c;
        if (aVar2.f1205b) {
            adVar = fragment.mo1258am();
            arrayList = cVar.f1047r;
        } else {
            adVar = fragment.mo1257al();
            arrayList = cVar.f1048s;
        }
        if (arrayList != null) {
            aVar3.mo1878a(arrayList);
            aVar3.mo1878a(aVar.values());
        }
        if (adVar != null) {
            adVar.mo1390a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    String a = m1839a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C0626s.m2870m(view))) {
                    String a2 = m1839a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C0626s.m2870m(view));
                    }
                }
            }
        } else {
            m1849a(aVar, aVar3);
        }
        return aVar3;
    }
}
