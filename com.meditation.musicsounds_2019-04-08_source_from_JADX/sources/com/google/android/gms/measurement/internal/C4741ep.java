package com.google.android.gms.measurement.internal;

import android.support.p009v4.p019g.C0488a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.measurement.C4298cj;
import com.google.android.gms.internal.measurement.C4299ck;
import com.google.android.gms.internal.measurement.C4300cl;
import com.google.android.gms.internal.measurement.C4301cm;
import com.google.android.gms.internal.measurement.C4302cn;
import com.google.android.gms.internal.measurement.C4307cs;
import com.google.android.gms.internal.measurement.C4309cu;
import com.google.android.gms.internal.measurement.C4314cz;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.ep */
final class C4741ep extends C4725ea {
    C4741ep(C4726eb ebVar) {
        super(ebVar);
    }

    /* renamed from: a */
    private final Boolean m23644a(double d, C4300cl clVar) {
        try {
            return m23652a(new BigDecimal(d), clVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23645a(long j, C4300cl clVar) {
        try {
            return m23652a(new BigDecimal(j), clVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23646a(C4298cj cjVar, String str, C4309cu[] cuVarArr, long j) {
        C4299ck[] ckVarArr;
        C4299ck[] ckVarArr2;
        Boolean bool;
        String str2;
        Object obj;
        if (cjVar.f15875d != null) {
            Boolean a = m23645a(j, cjVar.f15875d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        HashSet hashSet = new HashSet();
        for (C4299ck ckVar : cjVar.f15874c) {
            if (TextUtils.isEmpty(ckVar.f15883d)) {
                mo15253r().mo15849i().mo15859a("null or empty param name in filter. event", mo15250o().mo15841a(str));
                return null;
            }
            hashSet.add(ckVar.f15883d);
        }
        C0488a aVar = new C0488a();
        for (C4309cu cuVar : cuVarArr) {
            if (hashSet.contains(cuVar.f15930a)) {
                if (cuVar.f15932c != null) {
                    str2 = cuVar.f15930a;
                    obj = cuVar.f15932c;
                } else if (cuVar.f15933d != null) {
                    str2 = cuVar.f15930a;
                    obj = cuVar.f15933d;
                } else if (cuVar.f15931b != null) {
                    str2 = cuVar.f15930a;
                    obj = cuVar.f15931b;
                } else {
                    mo15253r().mo15849i().mo15860a("Unknown value for param. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(cuVar.f15930a));
                    return null;
                }
                aVar.put(str2, obj);
            }
        }
        for (C4299ck ckVar2 : cjVar.f15874c) {
            boolean equals = Boolean.TRUE.equals(ckVar2.f15882c);
            String str3 = ckVar2.f15883d;
            if (TextUtils.isEmpty(str3)) {
                mo15253r().mo15849i().mo15859a("Event has empty param name. event", mo15250o().mo15841a(str));
                return null;
            }
            Object obj2 = aVar.get(str3);
            if (obj2 instanceof Long) {
                if (ckVar2.f15881b == null) {
                    mo15253r().mo15849i().mo15860a("No number filter for long param. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                    return null;
                }
                Boolean a2 = m23645a(((Long) obj2).longValue(), ckVar2.f15881b);
                if (a2 == null) {
                    return null;
                }
                if ((true ^ a2.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj2 instanceof Double) {
                if (ckVar2.f15881b == null) {
                    mo15253r().mo15849i().mo15860a("No number filter for double param. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                    return null;
                }
                Boolean a3 = m23644a(((Double) obj2).doubleValue(), ckVar2.f15881b);
                if (a3 == null) {
                    return null;
                }
                if ((true ^ a3.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj2 instanceof String) {
                if (ckVar2.f15880a != null) {
                    bool = m23651a((String) obj2, ckVar2.f15880a);
                } else if (ckVar2.f15881b != null) {
                    String str4 = (String) obj2;
                    if (C4733eh.m23489a(str4)) {
                        bool = m23650a(str4, ckVar2.f15881b);
                    } else {
                        mo15253r().mo15849i().mo15860a("Invalid param value for number filter. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                        return null;
                    }
                } else {
                    mo15253r().mo15849i().mo15860a("No filter for String param. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if ((true ^ bool.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj2 == null) {
                mo15253r().mo15855x().mo15860a("Missing param for filter. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                return Boolean.valueOf(false);
            } else {
                mo15253r().mo15849i().mo15860a("Unknown param type. event, param", mo15250o().mo15841a(str), mo15250o().mo15842b(str3));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    private final Boolean m23647a(C4301cm cmVar, C4314cz czVar) {
        C4769t i;
        String str;
        Boolean a;
        C4299ck ckVar = cmVar.f15892c;
        if (ckVar == null) {
            i = mo15253r().mo15849i();
            str = "Missing property filter. property";
        } else {
            boolean equals = Boolean.TRUE.equals(ckVar.f15882c);
            if (czVar.f15989d != null) {
                if (ckVar.f15881b == null) {
                    i = mo15253r().mo15849i();
                    str = "No number filter for long property. property";
                } else {
                    a = m23645a(czVar.f15989d.longValue(), ckVar.f15881b);
                }
            } else if (czVar.f15990e != null) {
                if (ckVar.f15881b == null) {
                    i = mo15253r().mo15849i();
                    str = "No number filter for double property. property";
                } else {
                    a = m23644a(czVar.f15990e.doubleValue(), ckVar.f15881b);
                }
            } else if (czVar.f15988c == null) {
                i = mo15253r().mo15849i();
                str = "User property has no value, property";
            } else if (ckVar.f15880a == null) {
                if (ckVar.f15881b == null) {
                    mo15253r().mo15849i().mo15859a("No string or number filter defined. property", mo15250o().mo15843c(czVar.f15987b));
                } else if (C4733eh.m23489a(czVar.f15988c)) {
                    a = m23650a(czVar.f15988c, ckVar.f15881b);
                } else {
                    mo15253r().mo15849i().mo15860a("Invalid user property value for Numeric number filter. property, value", mo15250o().mo15843c(czVar.f15987b), czVar.f15988c);
                }
                return null;
            } else {
                a = m23651a(czVar.f15988c, ckVar.f15880a);
            }
            return m23648a(a, equals);
        }
        i.mo15859a(str, mo15250o().mo15843c(czVar.f15987b));
        return null;
    }

    /* renamed from: a */
    private static Boolean m23648a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* renamed from: a */
    private final Boolean m23649a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo15253r().mo15849i().mo15859a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    /* renamed from: a */
    private final Boolean m23650a(String str, C4300cl clVar) {
        if (!C4733eh.m23489a(str)) {
            return null;
        }
        try {
            return m23652a(new BigDecimal(str), clVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final Boolean m23651a(String str, C4302cn cnVar) {
        List list;
        C3266s.m14913a(cnVar);
        if (str == null || cnVar.f15895a == null || cnVar.f15895a.intValue() == 0) {
            return null;
        }
        if (cnVar.f15895a.intValue() == 6) {
            if (cnVar.f15898d == null || cnVar.f15898d.length == 0) {
                return null;
            }
        } else if (cnVar.f15896b == null) {
            return null;
        }
        int intValue = cnVar.f15895a.intValue();
        boolean z = cnVar.f15897c != null && cnVar.f15897c.booleanValue();
        String upperCase = (z || intValue == 1 || intValue == 6) ? cnVar.f15896b : cnVar.f15896b.toUpperCase(Locale.ENGLISH);
        if (cnVar.f15898d == null) {
            list = null;
        } else {
            String[] strArr = cnVar.f15898d;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String upperCase2 : strArr) {
                    arrayList.add(upperCase2.toUpperCase(Locale.ENGLISH));
                }
                list = arrayList;
            }
        }
        return m23649a(str, intValue, z, upperCase, list, intValue == 1 ? upperCase : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (r3 != null) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m23652a(java.math.BigDecimal r7, com.google.android.gms.internal.measurement.C4300cl r8, double r9) {
        /*
            com.google.android.gms.common.internal.C3266s.m14913a(r8)
            java.lang.Integer r0 = r8.f15884a
            r1 = 0
            if (r0 == 0) goto L_0x00ed
            java.lang.Integer r0 = r8.f15884a
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0012
            goto L_0x00ed
        L_0x0012:
            java.lang.Integer r0 = r8.f15884a
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = r8.f15887d
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r8.f15888e
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = r8.f15886c
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.Integer r0 = r8.f15884a
            int r0 = r0.intValue()
            java.lang.Integer r3 = r8.f15884a
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x005a
            java.lang.String r3 = r8.f15887d
            boolean r3 = com.google.android.gms.measurement.internal.C4733eh.m23489a(r3)
            if (r3 == 0) goto L_0x0059
            java.lang.String r3 = r8.f15888e
            boolean r3 = com.google.android.gms.measurement.internal.C4733eh.m23489a(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0059
        L_0x0048:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r4 = r8.f15887d     // Catch:{ NumberFormatException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r8 = r8.f15888e     // Catch:{ NumberFormatException -> 0x0059 }
            r4.<init>(r8)     // Catch:{ NumberFormatException -> 0x0059 }
            r8 = r3
            r3 = r1
            goto L_0x006c
        L_0x0059:
            return r1
        L_0x005a:
            java.lang.String r3 = r8.f15886c
            boolean r3 = com.google.android.gms.measurement.internal.C4733eh.m23489a(r3)
            if (r3 != 0) goto L_0x0063
            return r1
        L_0x0063:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00ed }
            java.lang.String r8 = r8.f15886c     // Catch:{ NumberFormatException -> 0x00ed }
            r3.<init>(r8)     // Catch:{ NumberFormatException -> 0x00ed }
            r8 = r1
            r4 = r8
        L_0x006c:
            if (r0 != r2) goto L_0x0071
            if (r8 != 0) goto L_0x0073
            return r1
        L_0x0071:
            if (r3 == 0) goto L_0x00ed
        L_0x0073:
            r2 = -1
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L_0x00e1;
                case 2: goto L_0x00d5;
                case 3: goto L_0x008c;
                case 4: goto L_0x007a;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x00ed
        L_0x007a:
            int r8 = r7.compareTo(r8)
            if (r8 == r2) goto L_0x0087
            int r7 = r7.compareTo(r4)
            if (r7 == r6) goto L_0x0087
            r5 = 1
        L_0x0087:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x008c:
            r0 = 0
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00c9
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 2
            r0.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r0)
            java.math.BigDecimal r8 = r3.subtract(r8)
            int r8 = r7.compareTo(r8)
            if (r8 != r6) goto L_0x00c4
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r9)
            java.math.BigDecimal r8 = r3.add(r8)
            int r7 = r7.compareTo(r8)
            if (r7 != r2) goto L_0x00c4
            r5 = 1
        L_0x00c4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00c9:
            int r7 = r7.compareTo(r3)
            if (r7 != 0) goto L_0x00d0
            r5 = 1
        L_0x00d0:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00d5:
            int r7 = r7.compareTo(r3)
            if (r7 != r6) goto L_0x00dc
            r5 = 1
        L_0x00dc:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00e1:
            int r7 = r7.compareTo(r3)
            if (r7 != r2) goto L_0x00e8
            r5 = 1
        L_0x00e8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4741ep.m23652a(java.math.BigDecimal, com.google.android.gms.internal.measurement.cl, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static void m23653a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    /* renamed from: a */
    private static C4307cs[] m23654a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        C4307cs[] csVarArr = new C4307cs[map.size()];
        for (Integer num : map.keySet()) {
            C4307cs csVar = new C4307cs();
            csVar.f15921a = num;
            csVar.f15922b = (Long) map.get(num);
            int i2 = i + 1;
            csVarArr[i] = csVar;
            i = i2;
        }
        return csVarArr;
    }

    /* renamed from: b */
    private static void m23655b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x08c5  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0a99 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C4306cr[] mo15728a(java.lang.String r99, com.google.android.gms.internal.measurement.C4308ct[] r100, com.google.android.gms.internal.measurement.C4314cz[] r101) {
        /*
            r98 = this;
            r7 = r98
            r15 = r99
            r13 = r100
            r14 = r101
            com.google.android.gms.common.internal.C3266s.m14915a(r99)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            android.support.v4.g.a r12 = new android.support.v4.g.a
            r12.<init>()
            android.support.v4.g.a r10 = new android.support.v4.g.a
            r10.<init>()
            android.support.v4.g.a r9 = new android.support.v4.g.a
            r9.<init>()
            android.support.v4.g.a r8 = new android.support.v4.g.a
            r8.<init>()
            android.support.v4.g.a r6 = new android.support.v4.g.a
            r6.<init>()
            com.google.android.gms.measurement.internal.es r0 = r98.mo15255t()
            boolean r23 = r0.mo15751k(r15)
            com.google.android.gms.measurement.internal.ev r0 = r98.mo15312i()
            java.util.Map r0 = r0.mo15796e(r15)
            if (r0 == 0) goto L_0x0185
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0185
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.cx r4 = (com.google.android.gms.internal.measurement.C4312cx) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r10.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r9.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            if (r23 == 0) goto L_0x00b3
            r27 = r0
            android.support.v4.g.a r0 = new android.support.v4.g.a
            r0.<init>()
            if (r4 == 0) goto L_0x00a5
            r28 = r1
            com.google.android.gms.internal.measurement.cs[] r1 = r4.f15980c
            if (r1 != 0) goto L_0x0083
            goto L_0x00a7
        L_0x0083:
            com.google.android.gms.internal.measurement.cs[] r1 = r4.f15980c
            r29 = r3
            int r3 = r1.length
            r30 = r11
            r11 = 0
        L_0x008b:
            if (r11 >= r3) goto L_0x00ab
            r31 = r3
            r3 = r1[r11]
            r32 = r1
            java.lang.Integer r1 = r3.f15921a
            if (r1 == 0) goto L_0x009e
            java.lang.Integer r1 = r3.f15921a
            java.lang.Long r3 = r3.f15922b
            r0.put(r1, r3)
        L_0x009e:
            int r11 = r11 + 1
            r3 = r31
            r1 = r32
            goto L_0x008b
        L_0x00a5:
            r28 = r1
        L_0x00a7:
            r29 = r3
            r30 = r11
        L_0x00ab:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r8.put(r1, r0)
            goto L_0x00bc
        L_0x00b3:
            r27 = r0
            r28 = r1
            r29 = r3
            r30 = r11
            r0 = 0
        L_0x00bc:
            if (r5 != 0) goto L_0x00d7
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.put(r1, r5)
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r9.put(r1, r3)
            goto L_0x00d9
        L_0x00d7:
            r3 = r29
        L_0x00d9:
            r1 = 0
        L_0x00da:
            long[] r11 = r4.f15978a
            int r11 = r11.length
            int r11 = r11 << 6
            if (r1 >= r11) goto L_0x012f
            long[] r11 = r4.f15978a
            boolean r11 = com.google.android.gms.measurement.internal.C4733eh.m23490a(r11, r1)
            if (r11 == 0) goto L_0x0114
            com.google.android.gms.measurement.internal.r r11 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r11 = r11.mo15855x()
            r33 = r8
            java.lang.String r8 = "Filter already evaluated. audience ID, filter ID"
            r34 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r35 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r11.mo15860a(r8, r9, r10)
            r3.set(r1)
            long[] r8 = r4.f15979b
            boolean r8 = com.google.android.gms.measurement.internal.C4733eh.m23490a(r8, r1)
            if (r8 == 0) goto L_0x011a
            r5.set(r1)
            r8 = 1
            goto L_0x011b
        L_0x0114:
            r33 = r8
            r34 = r9
            r35 = r10
        L_0x011a:
            r8 = 0
        L_0x011b:
            if (r0 == 0) goto L_0x0126
            if (r8 != 0) goto L_0x0126
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0.remove(r8)
        L_0x0126:
            int r1 = r1 + 1
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x00da
        L_0x012f:
            r33 = r8
            r34 = r9
            r35 = r10
            com.google.android.gms.internal.measurement.cr r1 = new com.google.android.gms.internal.measurement.cr
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12.put(r8, r1)
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r1.f15919d = r9
            r1.f15918c = r4
            com.google.android.gms.internal.measurement.cx r4 = new com.google.android.gms.internal.measurement.cx
            r4.<init>()
            r1.f15917b = r4
            com.google.android.gms.internal.measurement.cx r4 = r1.f15917b
            long[] r5 = com.google.android.gms.measurement.internal.C4733eh.m23491a(r5)
            r4.f15979b = r5
            com.google.android.gms.internal.measurement.cx r4 = r1.f15917b
            long[] r3 = com.google.android.gms.measurement.internal.C4733eh.m23491a(r3)
            r4.f15978a = r3
            if (r23 == 0) goto L_0x0177
            com.google.android.gms.internal.measurement.cx r1 = r1.f15917b
            com.google.android.gms.internal.measurement.cs[] r0 = m23654a(r0)
            r1.f15980c = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.support.v4.g.a r1 = new android.support.v4.g.a
            r1.<init>()
            r6.put(r0, r1)
        L_0x0177:
            r0 = r27
            r1 = r28
            r11 = r30
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x0043
        L_0x0185:
            r33 = r8
            r34 = r9
            r35 = r10
            r30 = r11
            if (r13 == 0) goto L_0x0799
            android.support.v4.g.a r9 = new android.support.v4.g.a
            r9.<init>()
            int r8 = r13.length
            r27 = 0
            r2 = r27
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x019c:
            if (r4 >= r8) goto L_0x0799
            r5 = r13[r4]
            java.lang.String r10 = r5.f15925b
            com.google.android.gms.internal.measurement.cu[] r11 = r5.f15924a
            r36 = r2
            com.google.android.gms.measurement.internal.es r2 = r98.mo15255t()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C4756h.f17133W
            boolean r2 = r2.mo15738c(r15, r3)
            r16 = 1
            if (r2 == 0) goto L_0x0379
            r98.mo15309g()
            java.lang.String r2 = "_eid"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r5, r2)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x01c4
            r2 = 1
            goto L_0x01c5
        L_0x01c4:
            r2 = 0
        L_0x01c5:
            if (r2 == 0) goto L_0x01d3
            r38 = r4
            java.lang.String r4 = "_ep"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x01d5
            r4 = 1
            goto L_0x01d6
        L_0x01d3:
            r38 = r4
        L_0x01d5:
            r4 = 0
        L_0x01d6:
            if (r4 == 0) goto L_0x0330
            r98.mo15309g()
            java.lang.String r2 = "_en"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r5, r2)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()
            java.lang.String r4 = "Extra parameter without an event name. eventId"
            r2.mo15859a(r4, r3)
            r41 = r6
            r26 = r38
            r24 = 1
            goto L_0x031c
        L_0x01ff:
            if (r0 == 0) goto L_0x0216
            if (r1 == 0) goto L_0x0216
            long r18 = r3.longValue()
            long r20 = r1.longValue()
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0210
            goto L_0x0216
        L_0x0210:
            r4 = r0
            r18 = r1
            r1 = r36
            goto L_0x0240
        L_0x0216:
            com.google.android.gms.measurement.internal.ev r2 = r98.mo15312i()
            android.util.Pair r2 = r2.mo15771a(r15, r3)
            if (r2 == 0) goto L_0x0309
            java.lang.Object r4 = r2.first
            if (r4 != 0) goto L_0x0226
            goto L_0x0309
        L_0x0226:
            java.lang.Object r0 = r2.first
            com.google.android.gms.internal.measurement.ct r0 = (com.google.android.gms.internal.measurement.C4308ct) r0
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r98.mo15309g()
            java.lang.String r4 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r0, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            r18 = r4
            r4 = r0
        L_0x0240:
            r0 = 0
            long r19 = r1 - r16
            int r0 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x028f
            com.google.android.gms.measurement.internal.ev r1 = r98.mo15312i()
            r1.mo15239d()
            com.google.android.gms.measurement.internal.r r0 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r2 = "Clearing complex main event info. appId"
            r0.mo15859a(r2, r15)
            android.database.sqlite.SQLiteDatabase r0 = r1.mo15804y()     // Catch:{ SQLiteException -> 0x0272 }
            java.lang.String r2 = "delete from main_event_params where app_id=?"
            r39 = r4
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0270 }
            r21 = 0
            r4[r21] = r15     // Catch:{ SQLiteException -> 0x026e }
            r0.execSQL(r2, r4)     // Catch:{ SQLiteException -> 0x026e }
            goto L_0x0285
        L_0x026e:
            r0 = move-exception
            goto L_0x0278
        L_0x0270:
            r0 = move-exception
            goto L_0x0276
        L_0x0272:
            r0 = move-exception
            r39 = r4
            r3 = 1
        L_0x0276:
            r21 = 0
        L_0x0278:
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15852u_()
            java.lang.String r2 = "Error clearing complex main event"
            r1.mo15859a(r2, r0)
        L_0x0285:
            r13 = r5
            r41 = r6
            r26 = r38
            r1 = r39
            r24 = 1
            goto L_0x02ac
        L_0x028f:
            r39 = r4
            r4 = 1
            r21 = 0
            com.google.android.gms.measurement.internal.ev r1 = r98.mo15312i()
            r2 = r99
            r13 = r5
            r26 = r38
            r40 = r39
            r24 = 1
            r4 = r19
            r41 = r6
            r6 = r40
            r1.mo15787a(r2, r3, r4, r6)
            r1 = r40
        L_0x02ac:
            com.google.android.gms.internal.measurement.cu[] r0 = r1.f15924a
            int r0 = r0.length
            int r2 = r11.length
            int r0 = r0 + r2
            com.google.android.gms.internal.measurement.cu[] r0 = new com.google.android.gms.internal.measurement.C4309cu[r0]
            com.google.android.gms.internal.measurement.cu[] r2 = r1.f15924a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x02b8:
            if (r4 >= r3) goto L_0x02d3
            r6 = r2[r4]
            r98.mo15309g()
            r42 = r1
            java.lang.String r1 = r6.f15930a
            com.google.android.gms.internal.measurement.cu r1 = com.google.android.gms.measurement.internal.C4733eh.m23483a(r13, r1)
            if (r1 != 0) goto L_0x02ce
            int r1 = r5 + 1
            r0[r5] = r6
            r5 = r1
        L_0x02ce:
            int r4 = r4 + 1
            r1 = r42
            goto L_0x02b8
        L_0x02d3:
            r42 = r1
            if (r5 <= 0) goto L_0x02f3
            int r1 = r11.length
            r2 = 0
        L_0x02d9:
            if (r2 >= r1) goto L_0x02e5
            r3 = r11[r2]
            int r4 = r5 + 1
            r0[r5] = r3
            int r2 = r2 + 1
            r5 = r4
            goto L_0x02d9
        L_0x02e5:
            int r1 = r0.length
            if (r5 != r1) goto L_0x02e9
            goto L_0x02ef
        L_0x02e9:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.google.android.gms.internal.measurement.cu[] r0 = (com.google.android.gms.internal.measurement.C4309cu[]) r0
        L_0x02ef:
            r29 = r0
            r0 = r10
            goto L_0x0303
        L_0x02f3:
            com.google.android.gms.measurement.internal.r r0 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r1 = "No unique parameters in main event. eventName"
            r0.mo15859a(r1, r10)
            r0 = r10
            r29 = r11
        L_0x0303:
            r25 = r18
            r36 = r19
            goto L_0x0387
        L_0x0309:
            r41 = r6
            r26 = r38
            r24 = 1
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()
            java.lang.String r4 = "Extra parameter without existing main event. eventName, eventId"
            r2.mo15860a(r4, r10, r3)
        L_0x031c:
            r31 = r8
            r65 = r9
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r2 = r36
            r72 = r41
            goto L_0x077d
        L_0x0330:
            r13 = r5
            r41 = r6
            r26 = r38
            r24 = 1
            if (r2 == 0) goto L_0x0380
            r98.mo15309g()
            java.lang.String r0 = "_epc"
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r13, r0)
            if (r0 != 0) goto L_0x0349
            r0 = r1
        L_0x0349:
            java.lang.Long r0 = (java.lang.Long) r0
            long r18 = r0.longValue()
            int r0 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0362
            com.google.android.gms.measurement.internal.r r0 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r1 = "Complex event with zero extra param count. eventName"
            r0.mo15859a(r1, r10)
            r0 = r3
            goto L_0x036f
        L_0x0362:
            com.google.android.gms.measurement.internal.ev r1 = r98.mo15312i()
            r2 = r99
            r0 = r3
            r4 = r18
            r6 = r13
            r1.mo15787a(r2, r3, r4, r6)
        L_0x036f:
            r25 = r0
            r0 = r10
            r29 = r11
            r42 = r13
            r36 = r18
            goto L_0x0387
        L_0x0379:
            r26 = r4
            r13 = r5
            r41 = r6
            r24 = 1
        L_0x0380:
            r42 = r0
            r25 = r1
            r0 = r10
            r29 = r11
        L_0x0387:
            com.google.android.gms.measurement.internal.ev r1 = r98.mo15312i()
            java.lang.String r2 = r13.f15925b
            com.google.android.gms.measurement.internal.d r1 = r1.mo15772a(r15, r2)
            if (r1 != 0) goto L_0x03e5
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15849i()
            java.lang.String r2 = "Event aggregate wasn't created during raw event logging. appId, event"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r99)
            com.google.android.gms.measurement.internal.p r4 = r98.mo15250o()
            java.lang.String r4 = r4.mo15841a(r0)
            r1.mo15860a(r2, r3, r4)
            com.google.android.gms.measurement.internal.d r1 = new com.google.android.gms.measurement.internal.d
            java.lang.String r10 = r13.f15925b
            r2 = 1
            r4 = 1
            java.lang.Long r6 = r13.f15926c
            long r16 = r6.longValue()
            r18 = 0
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r31 = r8
            r11 = r33
            r8 = r1
            r44 = r9
            r43 = r34
            r9 = r99
            r45 = r35
            r48 = r11
            r47 = r12
            r46 = r30
            r11 = r2
            r2 = r13
            r3 = r14
            r13 = r4
            r5 = r15
            r15 = r16
            r17 = r18
            r19 = r6
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            goto L_0x0426
        L_0x03e5:
            r31 = r8
            r44 = r9
            r47 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r46 = r30
            r48 = r33
            r43 = r34
            r45 = r35
            com.google.android.gms.measurement.internal.d r4 = new com.google.android.gms.measurement.internal.d
            java.lang.String r6 = r1.f16928a
            java.lang.String r8 = r1.f16929b
            long r9 = r1.f16930c
            long r52 = r9 + r16
            long r9 = r1.f16931d
            long r54 = r9 + r16
            long r9 = r1.f16932e
            long r11 = r1.f16933f
            java.lang.Long r13 = r1.f16934g
            java.lang.Long r14 = r1.f16935h
            java.lang.Long r15 = r1.f16936i
            java.lang.Boolean r1 = r1.f16937j
            r49 = r4
            r50 = r6
            r51 = r8
            r56 = r9
            r58 = r11
            r60 = r13
            r61 = r14
            r62 = r15
            r63 = r1
            r49.<init>(r50, r51, r52, r54, r56, r58, r60, r61, r62, r63)
            r1 = r4
        L_0x0426:
            com.google.android.gms.measurement.internal.ev r4 = r98.mo15312i()
            r4.mo15779a(r1)
            long r8 = r1.f16930c
            r10 = r44
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x044b
            com.google.android.gms.measurement.internal.ev r1 = r98.mo15312i()
            java.util.Map r1 = r1.mo15798f(r5, r0)
            if (r1 != 0) goto L_0x0448
            android.support.v4.g.a r1 = new android.support.v4.g.a
            r1.<init>()
        L_0x0448:
            r10.put(r0, r1)
        L_0x044b:
            r11 = r1
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x0454:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0769
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r13 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = r46
            boolean r1 = r14.contains(r1)
            if (r1 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r4 = "Skipping failed audience ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r1.mo15859a(r4, r6)
            r46 = r14
            goto L_0x0454
        L_0x0484:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r15 = r47
            java.lang.Object r1 = r15.get(r1)
            com.google.android.gms.internal.measurement.cr r1 = (com.google.android.gms.internal.measurement.C4306cr) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r6 = r45
            java.lang.Object r4 = r6.get(r4)
            java.util.BitSet r4 = (java.util.BitSet) r4
            r64 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r65 = r10
            r10 = r43
            java.lang.Object r2 = r10.get(r2)
            java.util.BitSet r2 = (java.util.BitSet) r2
            if (r23 == 0) goto L_0x04cd
            r66 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r67 = r12
            r12 = r48
            java.lang.Object r2 = r12.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r68 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7 = r41
            java.lang.Object r2 = r7.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x04d8
        L_0x04cd:
            r66 = r2
            r67 = r12
            r7 = r41
            r12 = r48
            r2 = 0
            r68 = 0
        L_0x04d8:
            if (r1 != 0) goto L_0x0537
            com.google.android.gms.internal.measurement.cr r1 = new com.google.android.gms.internal.measurement.cr
            r1.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15.put(r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r24)
            r1.f15919d = r4
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r6.put(r1, r4)
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r69 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10.put(r2, r1)
            if (r23 == 0) goto L_0x052c
            android.support.v4.g.a r2 = new android.support.v4.g.a
            r2.<init>()
            r70 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r12.put(r1, r2)
            android.support.v4.g.a r1 = new android.support.v4.g.a
            r1.<init>()
            r71 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7.put(r2, r1)
            r72 = r7
            r2 = r70
            r73 = r71
            r7 = r1
            goto L_0x0541
        L_0x052c:
            r70 = r1
            r72 = r7
            r73 = r68
            r7 = r69
            r2 = r70
            goto L_0x0541
        L_0x0537:
            r69 = r2
            r72 = r7
            r2 = r66
            r73 = r68
            r7 = r69
        L_0x0541:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r16 = r1.iterator()
        L_0x054f:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x074d
            java.lang.Object r1 = r16.next()
            com.google.android.gms.internal.measurement.cj r1 = (com.google.android.gms.internal.measurement.C4298cj) r1
            r74 = r2
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            r75 = r11
            r11 = 2
            boolean r2 = r2.mo15846a(r11)
            if (r2 == 0) goto L_0x05a1
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r5 = r1.f15872a
            r76 = r6
            com.google.android.gms.measurement.internal.p r6 = r98.mo15250o()
            r77 = r12
            java.lang.String r12 = r1.f15873b
            java.lang.String r6 = r6.mo15841a(r12)
            r2.mo15861a(r11, r3, r5, r6)
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r3 = "Filter definition"
            com.google.android.gms.measurement.internal.eh r5 = r98.mo15309g()
            java.lang.String r5 = r5.mo15564a(r1)
            r2.mo15859a(r3, r5)
            goto L_0x05a5
        L_0x05a1:
            r76 = r6
            r77 = r12
        L_0x05a5:
            java.lang.Integer r2 = r1.f15872a
            if (r2 == 0) goto L_0x070e
            java.lang.Integer r2 = r1.f15872a
            int r2 = r2.intValue()
            r11 = 256(0x100, float:3.59E-43)
            if (r2 <= r11) goto L_0x05b5
            goto L_0x070e
        L_0x05b5:
            if (r23 == 0) goto L_0x069e
            if (r1 == 0) goto L_0x05c7
            java.lang.Boolean r2 = r1.f15876e
            if (r2 == 0) goto L_0x05c7
            java.lang.Boolean r2 = r1.f15876e
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05c7
            r12 = 1
            goto L_0x05c8
        L_0x05c7:
            r12 = 0
        L_0x05c8:
            if (r1 == 0) goto L_0x05d9
            java.lang.Boolean r2 = r1.f15877f
            if (r2 == 0) goto L_0x05d9
            java.lang.Boolean r2 = r1.f15877f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05d9
            r17 = 1
            goto L_0x05db
        L_0x05d9:
            r17 = 0
        L_0x05db:
            java.lang.Integer r2 = r1.f15872a
            int r2 = r2.intValue()
            boolean r2 = r4.get(r2)
            if (r2 == 0) goto L_0x0608
            if (r12 != 0) goto L_0x0608
            if (r17 != 0) goto L_0x0608
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = r1.f15872a
            r2.mo15860a(r3, r5, r1)
            r2 = r74
            r11 = r75
            r6 = r76
            r12 = r77
            goto L_0x0747
        L_0x0608:
            r5 = r1
            r6 = r73
            r1 = r98
            r3 = r64
            r11 = r74
            r2 = r5
            r78 = r10
            r79 = r15
            r10 = r101
            r15 = r3
            r3 = r0
            r10 = r4
            r4 = r29
            r81 = r0
            r0 = r5
            r82 = r6
            r80 = r76
            r5 = r8
            java.lang.Boolean r1 = r1.m23646a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x0638
            java.lang.String r4 = "null"
            goto L_0x0639
        L_0x0638:
            r4 = r1
        L_0x0639:
            r2.mo15859a(r3, r4)
            if (r1 != 0) goto L_0x0659
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
        L_0x0645:
            r4 = r10
            r2 = r11
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
            r73 = r82
            goto L_0x0747
        L_0x0659:
            java.lang.Integer r2 = r0.f15872a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0645
            java.lang.Integer r1 = r0.f15872a
            int r1 = r1.intValue()
            r10.set(r1)
            if (r12 != 0) goto L_0x0675
            if (r17 == 0) goto L_0x0645
        L_0x0675:
            java.lang.Long r1 = r15.f15926c
            if (r1 == 0) goto L_0x0645
            if (r17 == 0) goto L_0x068b
            java.lang.Integer r0 = r0.f15872a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f15926c
            long r1 = r1.longValue()
            m23655b(r7, r0, r1)
            goto L_0x0645
        L_0x068b:
            java.lang.Integer r0 = r0.f15872a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f15926c
            long r1 = r1.longValue()
            r12 = r82
            m23653a(r12, r0, r1)
            goto L_0x0735
        L_0x069e:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            java.lang.Integer r1 = r0.f15872a
            int r1 = r1.intValue()
            boolean r1 = r10.get(r1)
            if (r1 == 0) goto L_0x06cc
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "Event filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = r0.f15872a
            goto L_0x0732
        L_0x06cc:
            r1 = r98
            r2 = r0
            r3 = r81
            r4 = r29
            r5 = r8
            java.lang.Boolean r1 = r1.m23646a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15855x()
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x06e7
            java.lang.String r4 = "null"
            goto L_0x06e8
        L_0x06e7:
            r4 = r1
        L_0x06e8:
            r2.mo15859a(r3, r4)
            if (r1 != 0) goto L_0x06f5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
            goto L_0x0735
        L_0x06f5:
            java.lang.Integer r2 = r0.f15872a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0735
            java.lang.Integer r0 = r0.f15872a
            int r0 = r0.intValue()
            r10.set(r0)
            goto L_0x0735
        L_0x070e:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15849i()
            java.lang.String r2 = "Invalid event filter ID. appId, id"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r99)
            java.lang.Integer r0 = r0.f15872a
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0732:
            r1.mo15860a(r2, r3, r0)
        L_0x0735:
            r4 = r10
            r2 = r11
            r73 = r12
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
        L_0x0747:
            r3 = r101
            r5 = r99
            goto L_0x054f
        L_0x074d:
            r79 = r15
            r45 = r6
            r43 = r10
            r48 = r12
            r46 = r14
            r2 = r64
            r10 = r65
            r12 = r67
            r41 = r72
            r47 = r79
            r3 = r101
            r5 = r99
            r7 = r98
            goto L_0x0454
        L_0x0769:
            r65 = r10
            r72 = r41
            r78 = r43
            r80 = r45
            r14 = r46
            r79 = r47
            r77 = r48
            r1 = r25
            r2 = r36
            r0 = r42
        L_0x077d:
            int r4 = r26 + 1
            r13 = r100
            r30 = r14
            r8 = r31
            r9 = r65
            r6 = r72
            r33 = r77
            r34 = r78
            r12 = r79
            r35 = r80
            r7 = r98
            r14 = r101
            r15 = r99
            goto L_0x019c
        L_0x0799:
            r72 = r6
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r24 = 1
            r1 = r101
            if (r1 == 0) goto L_0x0ac5
            android.support.v4.g.a r0 = new android.support.v4.g.a
            r0.<init>()
            int r2 = r1.length
            r3 = 0
        L_0x07b2:
            if (r3 >= r2) goto L_0x0ac5
            r4 = r1[r3]
            java.lang.String r5 = r4.f15987b
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x07d9
            com.google.android.gms.measurement.internal.ev r5 = r98.mo15312i()
            java.lang.String r6 = r4.f15987b
            r7 = r99
            java.util.Map r5 = r5.mo15800g(r7, r6)
            if (r5 != 0) goto L_0x07d3
            android.support.v4.g.a r5 = new android.support.v4.g.a
            r5.<init>()
        L_0x07d3:
            java.lang.String r6 = r4.f15987b
            r0.put(r6, r5)
            goto L_0x07db
        L_0x07d9:
            r7 = r99
        L_0x07db:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x07e3:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0aaf
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L_0x080f
            com.google.android.gms.measurement.internal.r r9 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()
            java.lang.String r10 = "Skipping failed audience ID"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.mo15859a(r10, r8)
            goto L_0x07e3
        L_0x080f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = r79
            java.lang.Object r9 = r10.get(r9)
            com.google.android.gms.internal.measurement.cr r9 = (com.google.android.gms.internal.measurement.C4306cr) r9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12 = r80
            java.lang.Object r11 = r12.get(r11)
            java.util.BitSet r11 = (java.util.BitSet) r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = r78
            java.lang.Object r13 = r15.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            if (r23 == 0) goto L_0x0854
            r83 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = r77
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r84 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r85 = r2
            r2 = r72
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x085f
        L_0x0854:
            r83 = r0
            r85 = r2
            r2 = r72
            r1 = r77
            r0 = 0
            r84 = 0
        L_0x085f:
            if (r9 != 0) goto L_0x08ac
            com.google.android.gms.internal.measurement.cr r9 = new com.google.android.gms.internal.measurement.cr
            r9.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r10.put(r11, r9)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r24)
            r9.f15919d = r11
            java.util.BitSet r11 = new java.util.BitSet
            r11.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.put(r9, r11)
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15.put(r9, r13)
            if (r23 == 0) goto L_0x08ac
            android.support.v4.g.a r0 = new android.support.v4.g.a
            r0.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r1.put(r9, r0)
            android.support.v4.g.a r9 = new android.support.v4.g.a
            r9.<init>()
            r86 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.put(r0, r9)
            r87 = r2
            r0 = r86
            goto L_0x08b1
        L_0x08ac:
            r9 = r0
            r87 = r2
            r0 = r84
        L_0x08b1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x08bf:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x0a99
            java.lang.Object r16 = r2.next()
            r88 = r2
            r2 = r16
            com.google.android.gms.internal.measurement.cm r2 = (com.google.android.gms.internal.measurement.C4301cm) r2
            r89 = r5
            com.google.android.gms.measurement.internal.r r5 = r98.mo15253r()
            r90 = r6
            r6 = 2
            boolean r5 = r5.mo15846a(r6)
            if (r5 == 0) goto L_0x0917
            com.google.android.gms.measurement.internal.r r5 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r5 = r5.mo15855x()
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r91 = r1
            java.lang.Integer r1 = r2.f15890a
            r92 = r15
            com.google.android.gms.measurement.internal.p r15 = r98.mo15250o()
            r93 = r10
            java.lang.String r10 = r2.f15891b
            java.lang.String r10 = r15.mo15843c(r10)
            r5.mo15861a(r6, r7, r1, r10)
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r5 = "Filter definition"
            com.google.android.gms.measurement.internal.eh r6 = r98.mo15309g()
            java.lang.String r6 = r6.mo15565a(r2)
            r1.mo15859a(r5, r6)
            goto L_0x091d
        L_0x0917:
            r91 = r1
            r93 = r10
            r92 = r15
        L_0x091d:
            java.lang.Integer r1 = r2.f15890a
            if (r1 == 0) goto L_0x0a62
            java.lang.Integer r1 = r2.f15890a
            int r1 = r1.intValue()
            r5 = 256(0x100, float:3.59E-43)
            if (r1 <= r5) goto L_0x092d
            goto L_0x0a62
        L_0x092d:
            if (r23 == 0) goto L_0x09ef
            if (r2 == 0) goto L_0x093f
            java.lang.Boolean r1 = r2.f15893d
            if (r1 == 0) goto L_0x093f
            java.lang.Boolean r1 = r2.f15893d
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x093f
            r1 = 1
            goto L_0x0940
        L_0x093f:
            r1 = 0
        L_0x0940:
            if (r2 == 0) goto L_0x0950
            java.lang.Boolean r6 = r2.f15894e
            if (r6 == 0) goto L_0x0950
            java.lang.Boolean r6 = r2.f15894e
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0950
            r6 = 1
            goto L_0x0951
        L_0x0950:
            r6 = 0
        L_0x0951:
            java.lang.Integer r7 = r2.f15890a
            int r7 = r7.intValue()
            boolean r7 = r11.get(r7)
            if (r7 == 0) goto L_0x0982
            if (r1 != 0) goto L_0x0982
            if (r6 != 0) goto L_0x0982
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r6 = "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f15890a
            r1.mo15860a(r6, r7, r2)
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            goto L_0x0a24
        L_0x0982:
            r10 = r87
            r7 = r98
            java.lang.Boolean r15 = r7.m23647a(r2, r4)
            com.google.android.gms.measurement.internal.r r16 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r5 = r16.mo15855x()
            r94 = r10
            java.lang.String r10 = "Property filter result"
            if (r15 != 0) goto L_0x099f
            java.lang.String r16 = "null"
            r95 = r12
            r12 = r16
            goto L_0x09a2
        L_0x099f:
            r95 = r12
            r12 = r15
        L_0x09a2:
            r5.mo15859a(r10, r12)
            if (r15 != 0) goto L_0x09a9
            goto L_0x0a41
        L_0x09a9:
            java.lang.Integer r5 = r2.f15890a
            int r5 = r5.intValue()
            r13.set(r5)
            java.lang.Integer r5 = r2.f15890a
            int r5 = r5.intValue()
            boolean r10 = r15.booleanValue()
            r11.set(r5, r10)
            boolean r5 = r15.booleanValue()
            if (r5 == 0) goto L_0x0a14
            if (r1 != 0) goto L_0x09c9
            if (r6 == 0) goto L_0x0a14
        L_0x09c9:
            java.lang.Long r1 = r4.f15986a
            if (r1 == 0) goto L_0x0a14
            if (r6 == 0) goto L_0x09df
            java.lang.Integer r1 = r2.f15890a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f15986a
            long r5 = r2.longValue()
            m23655b(r9, r1, r5)
            goto L_0x0a14
        L_0x09df:
            java.lang.Integer r1 = r2.f15890a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f15986a
            long r5 = r2.longValue()
            m23653a(r0, r1, r5)
            goto L_0x0a14
        L_0x09ef:
            r95 = r12
            r94 = r87
            r7 = r98
            java.lang.Integer r1 = r2.f15890a
            int r1 = r1.intValue()
            boolean r1 = r11.get(r1)
            if (r1 == 0) goto L_0x0a28
            com.google.android.gms.measurement.internal.r r1 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r5 = "Property filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f15890a
            r1.mo15860a(r5, r6, r2)
        L_0x0a14:
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            r87 = r94
            r12 = r95
        L_0x0a24:
            r7 = r99
            goto L_0x08bf
        L_0x0a28:
            java.lang.Boolean r1 = r7.m23647a(r2, r4)
            com.google.android.gms.measurement.internal.r r5 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r5 = r5.mo15855x()
            java.lang.String r6 = "Property filter result"
            if (r1 != 0) goto L_0x0a3b
            java.lang.String r10 = "null"
            goto L_0x0a3c
        L_0x0a3b:
            r10 = r1
        L_0x0a3c:
            r5.mo15859a(r6, r10)
            if (r1 != 0) goto L_0x0a49
        L_0x0a41:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r14.add(r1)
            goto L_0x0a14
        L_0x0a49:
            java.lang.Integer r5 = r2.f15890a
            int r5 = r5.intValue()
            r13.set(r5)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0a14
            java.lang.Integer r1 = r2.f15890a
            int r1 = r1.intValue()
            r11.set(r1)
            goto L_0x0a14
        L_0x0a62:
            r95 = r12
            r94 = r87
            r7 = r98
            com.google.android.gms.measurement.internal.r r0 = r98.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r1 = "Invalid property filter ID. appId, id"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4767r.m23924a(r99)
            java.lang.Integer r2 = r2.f15890a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mo15860a(r1, r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r14.add(r0)
            r0 = r83
            r2 = r85
            r5 = r89
            r6 = r90
            r77 = r91
            r78 = r92
            r79 = r93
            r72 = r94
            r80 = r95
            goto L_0x0aa9
        L_0x0a99:
            r7 = r98
            r77 = r1
            r79 = r10
            r80 = r12
            r78 = r15
            r0 = r83
            r2 = r85
            r72 = r87
        L_0x0aa9:
            r1 = r101
            r7 = r99
            goto L_0x07e3
        L_0x0aaf:
            r83 = r0
            r85 = r2
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r3 = r3 + 1
            r1 = r101
            goto L_0x07b2
        L_0x0ac5:
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r0 = r95.size()
            com.google.android.gms.internal.measurement.cr[] r1 = new com.google.android.gms.internal.measurement.C4306cr[r0]
            java.util.Set r0 = r95.keySet()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x0ae0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c8a
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r4 = r14.contains(r4)
            if (r4 != 0) goto L_0x0c86
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = r93
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.internal.measurement.cr r4 = (com.google.android.gms.internal.measurement.C4306cr) r4
            if (r4 != 0) goto L_0x0b0d
            com.google.android.gms.internal.measurement.cr r4 = new com.google.android.gms.internal.measurement.cr
            r4.<init>()
        L_0x0b0d:
            int r6 = r3 + 1
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4.f15916a = r3
            com.google.android.gms.internal.measurement.cx r3 = new com.google.android.gms.internal.measurement.cx
            r3.<init>()
            r4.f15917b = r3
            com.google.android.gms.internal.measurement.cx r3 = r4.f15917b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = r95
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C4733eh.m23491a(r8)
            r3.f15979b = r8
            com.google.android.gms.internal.measurement.cx r3 = r4.f15917b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = r92
            java.lang.Object r8 = r10.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C4733eh.m23491a(r8)
            r3.f15978a = r8
            if (r23 == 0) goto L_0x0be6
            com.google.android.gms.internal.measurement.cx r3 = r4.f15917b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = r91
            java.lang.Object r8 = r11.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            com.google.android.gms.internal.measurement.cs[] r8 = m23654a(r8)
            r3.f15980c = r8
            com.google.android.gms.internal.measurement.cx r3 = r4.f15917b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r12 = r94
            java.lang.Object r8 = r12.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0b76
            r13 = 0
            com.google.android.gms.internal.measurement.cy[] r8 = new com.google.android.gms.internal.measurement.C4313cy[r13]
            r96 = r2
            r97 = r5
            r15 = r8
            goto L_0x0be3
        L_0x0b76:
            r13 = 0
            int r15 = r8.size()
            com.google.android.gms.internal.measurement.cy[] r15 = new com.google.android.gms.internal.measurement.C4313cy[r15]
            java.util.Set r16 = r8.keySet()
            java.util.Iterator r16 = r16.iterator()
            r17 = 0
        L_0x0b87:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x0bdf
            java.lang.Object r18 = r16.next()
            r13 = r18
            java.lang.Integer r13 = (java.lang.Integer) r13
            r96 = r2
            com.google.android.gms.internal.measurement.cy r2 = new com.google.android.gms.internal.measurement.cy
            r2.<init>()
            r2.f15983a = r13
            java.lang.Object r13 = r8.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0bd1
            java.util.Collections.sort(r13)
            r97 = r5
            int r5 = r13.size()
            long[] r5 = new long[r5]
            java.util.Iterator r13 = r13.iterator()
            r18 = 0
        L_0x0bb7:
            boolean r19 = r13.hasNext()
            if (r19 == 0) goto L_0x0bce
            java.lang.Object r19 = r13.next()
            java.lang.Long r19 = (java.lang.Long) r19
            int r20 = r18 + 1
            long r21 = r19.longValue()
            r5[r18] = r21
            r18 = r20
            goto L_0x0bb7
        L_0x0bce:
            r2.f15984b = r5
            goto L_0x0bd3
        L_0x0bd1:
            r97 = r5
        L_0x0bd3:
            int r5 = r17 + 1
            r15[r17] = r2
            r17 = r5
            r2 = r96
            r5 = r97
            r13 = 0
            goto L_0x0b87
        L_0x0bdf:
            r96 = r2
            r97 = r5
        L_0x0be3:
            r3.f15981d = r15
            goto L_0x0bee
        L_0x0be6:
            r96 = r2
            r97 = r5
            r11 = r91
            r12 = r94
        L_0x0bee:
            com.google.android.gms.measurement.internal.ev r2 = r98.mo15312i()
            com.google.android.gms.internal.measurement.cx r3 = r4.f15917b
            r2.mo15525k()
            r2.mo15239d()
            com.google.android.gms.common.internal.C3266s.m14915a(r99)
            com.google.android.gms.common.internal.C3266s.m14913a(r3)
            int r4 = r3.mo14784e()     // Catch:{ IOException -> 0x0c61 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0c61 }
            int r5 = r4.length     // Catch:{ IOException -> 0x0c61 }
            r8 = 0
            com.google.android.gms.internal.measurement.iq r5 = com.google.android.gms.internal.measurement.C4477iq.m22220a(r4, r8, r5)     // Catch:{ IOException -> 0x0c5f }
            r3.mo14224a(r5)     // Catch:{ IOException -> 0x0c5f }
            r5.mo14747a()     // Catch:{ IOException -> 0x0c5f }
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r5 = "app_id"
            r13 = r99
            r3.put(r5, r13)
            java.lang.String r5 = "audience_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r5, r0)
            java.lang.String r0 = "current_results"
            r3.put(r0, r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo15804y()     // Catch:{ SQLiteException -> 0x0c52 }
            java.lang.String r4 = "audience_filter_values"
            r5 = 5
            r15 = 0
            long r3 = r0.insertWithOnConflict(r4, r15, r3, r5)     // Catch:{ SQLiteException -> 0x0c50 }
            r16 = -1
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0c77
            com.google.android.gms.measurement.internal.r r0 = r2.mo15253r()     // Catch:{ SQLiteException -> 0x0c50 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ SQLiteException -> 0x0c50 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r99)     // Catch:{ SQLiteException -> 0x0c50 }
            r0.mo15859a(r3, r4)     // Catch:{ SQLiteException -> 0x0c50 }
            goto L_0x0c77
        L_0x0c50:
            r0 = move-exception
            goto L_0x0c54
        L_0x0c52:
            r0 = move-exception
            r15 = 0
        L_0x0c54:
            com.google.android.gms.measurement.internal.r r2 = r2.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()
            java.lang.String r3 = "Error storing filter results. appId"
            goto L_0x0c70
        L_0x0c5f:
            r0 = move-exception
            goto L_0x0c63
        L_0x0c61:
            r0 = move-exception
            r8 = 0
        L_0x0c63:
            r13 = r99
            r15 = 0
            com.google.android.gms.measurement.internal.r r2 = r2.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15852u_()
            java.lang.String r3 = "Configuration loss. Failed to serialize filter results. appId"
        L_0x0c70:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r99)
            r2.mo15860a(r3, r4, r0)
        L_0x0c77:
            r3 = r6
            r95 = r9
            r92 = r10
            r91 = r11
            r94 = r12
            r2 = r96
            r93 = r97
            goto L_0x0ae0
        L_0x0c86:
            r13 = r99
            goto L_0x0ae0
        L_0x0c8a:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            com.google.android.gms.internal.measurement.cr[] r0 = (com.google.android.gms.internal.measurement.C4306cr[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4741ep.mo15728a(java.lang.String, com.google.android.gms.internal.measurement.ct[], com.google.android.gms.internal.measurement.cz[]):com.google.android.gms.internal.measurement.cr[]");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        return false;
    }
}
