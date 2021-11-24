package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.internal.measurement.C4298cj;
import com.google.android.gms.internal.measurement.C4299ck;
import com.google.android.gms.internal.measurement.C4300cl;
import com.google.android.gms.internal.measurement.C4301cm;
import com.google.android.gms.internal.measurement.C4302cn;
import com.google.android.gms.internal.measurement.C4306cr;
import com.google.android.gms.internal.measurement.C4307cs;
import com.google.android.gms.internal.measurement.C4308ct;
import com.google.android.gms.internal.measurement.C4309cu;
import com.google.android.gms.internal.measurement.C4310cv;
import com.google.android.gms.internal.measurement.C4311cw;
import com.google.android.gms.internal.measurement.C4312cx;
import com.google.android.gms.internal.measurement.C4313cy;
import com.google.android.gms.internal.measurement.C4314cz;
import com.google.android.gms.internal.measurement.C4477iq;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.eh */
public final class C4733eh extends C4725ea {
    C4733eh(C4726eb ebVar) {
        super(ebVar);
    }

    /* renamed from: a */
    static C4309cu m23483a(C4308ct ctVar, String str) {
        C4309cu[] cuVarArr;
        for (C4309cu cuVar : ctVar.f15924a) {
            if (cuVar.f15930a.equals(str)) {
                return cuVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m23484a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private final void m23485a(StringBuilder sb, int i, C4299ck ckVar) {
        String[] strArr;
        if (ckVar != null) {
            m23484a(sb, i);
            sb.append("filter {\n");
            m23488a(sb, i, "complement", (Object) ckVar.f15882c);
            m23488a(sb, i, "param_name", (Object) mo15250o().mo15842b(ckVar.f15883d));
            int i2 = i + 1;
            String str = "string_filter";
            C4302cn cnVar = ckVar.f15880a;
            if (cnVar != null) {
                m23484a(sb, i2);
                sb.append(str);
                sb.append(" {\n");
                if (cnVar.f15895a != null) {
                    String str2 = "UNKNOWN_MATCH_TYPE";
                    switch (cnVar.f15895a.intValue()) {
                        case 1:
                            str2 = "REGEXP";
                            break;
                        case 2:
                            str2 = "BEGINS_WITH";
                            break;
                        case 3:
                            str2 = "ENDS_WITH";
                            break;
                        case 4:
                            str2 = "PARTIAL";
                            break;
                        case 5:
                            str2 = "EXACT";
                            break;
                        case 6:
                            str2 = "IN_LIST";
                            break;
                    }
                    m23488a(sb, i2, "match_type", (Object) str2);
                }
                m23488a(sb, i2, "expression", (Object) cnVar.f15896b);
                m23488a(sb, i2, "case_sensitive", (Object) cnVar.f15897c);
                if (cnVar.f15898d.length > 0) {
                    m23484a(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str3 : cnVar.f15898d) {
                        m23484a(sb, i2 + 2);
                        sb.append(str3);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                m23484a(sb, i2);
                sb.append("}\n");
            }
            m23486a(sb, i2, "number_filter", ckVar.f15881b);
            m23484a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m23486a(StringBuilder sb, int i, String str, C4300cl clVar) {
        if (clVar != null) {
            m23484a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (clVar.f15884a != null) {
                String str2 = "UNKNOWN_COMPARISON_TYPE";
                switch (clVar.f15884a.intValue()) {
                    case 1:
                        str2 = "LESS_THAN";
                        break;
                    case 2:
                        str2 = "GREATER_THAN";
                        break;
                    case 3:
                        str2 = "EQUAL";
                        break;
                    case 4:
                        str2 = "BETWEEN";
                        break;
                }
                m23488a(sb, i, "comparison_type", (Object) str2);
            }
            m23488a(sb, i, "match_as_float", (Object) clVar.f15885b);
            m23488a(sb, i, "comparison_value", (Object) clVar.f15886c);
            m23488a(sb, i, "min_comparison_value", (Object) clVar.f15887d);
            m23488a(sb, i, "max_comparison_value", (Object) clVar.f15888e);
            m23484a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private final void m23487a(StringBuilder sb, int i, String str, C4312cx cxVar, String str2) {
        if (cxVar != null) {
            m23484a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (cxVar.f15979b != null) {
                m23484a(sb, 4);
                sb.append("results: ");
                long[] jArr = cxVar.f15979b;
                int length = jArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    Long valueOf = Long.valueOf(jArr[i2]);
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf);
                    i2++;
                    i3 = i4;
                }
                sb.append(10);
            }
            if (cxVar.f15978a != null) {
                m23484a(sb, 4);
                sb.append("status: ");
                long[] jArr2 = cxVar.f15978a;
                int length2 = jArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    Long valueOf2 = Long.valueOf(jArr2[i5]);
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(valueOf2);
                    i5++;
                    i6 = i7;
                }
                sb.append(10);
            }
            if (mo15255t().mo15751k(str2)) {
                if (cxVar.f15980c != null) {
                    m23484a(sb, 4);
                    sb.append("dynamic_filter_timestamps: {");
                    C4307cs[] csVarArr = cxVar.f15980c;
                    int length3 = csVarArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        C4307cs csVar = csVarArr[i8];
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(csVar.f15921a);
                        sb.append(":");
                        sb.append(csVar.f15922b);
                        i8++;
                        i9 = i10;
                    }
                    sb.append("}\n");
                }
                if (cxVar.f15981d != null) {
                    m23484a(sb, 4);
                    sb.append("sequence_filter_timestamps: {");
                    C4313cy[] cyVarArr = cxVar.f15981d;
                    int length4 = cyVarArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length4) {
                        C4313cy cyVar = cyVarArr[i11];
                        int i13 = i12 + 1;
                        if (i12 != 0) {
                            sb.append(", ");
                        }
                        sb.append(cyVar.f15983a);
                        sb.append(": [");
                        long[] jArr3 = cyVar.f15984b;
                        int length5 = jArr3.length;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < length5) {
                            long j = jArr3[i14];
                            int i16 = i15 + 1;
                            if (i15 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j);
                            i14++;
                            i15 = i16;
                        }
                        sb.append("]");
                        i11++;
                        i12 = i13;
                    }
                    sb.append("}\n");
                }
            }
            m23484a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m23488a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m23484a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: a */
    static boolean m23489a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m23490a(long[] jArr, int i) {
        if (i >= (jArr.length << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & jArr[i / 64]) != 0;
    }

    /* renamed from: a */
    static long[] m23491a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    jArr[i] = jArr[i] | (1 << i2);
                }
            }
        }
        return jArr;
    }

    /* renamed from: a */
    static C4309cu[] m23492a(C4309cu[] cuVarArr, String str, Object obj) {
        for (C4309cu cuVar : cuVarArr) {
            if (str.equals(cuVar.f15930a)) {
                cuVar.f15932c = null;
                cuVar.f15931b = null;
                cuVar.f15933d = null;
                if (obj instanceof Long) {
                    cuVar.f15932c = (Long) obj;
                } else if (obj instanceof String) {
                    cuVar.f15931b = (String) obj;
                } else if (obj instanceof Double) {
                    cuVar.f15933d = (Double) obj;
                }
                return cuVarArr;
            }
        }
        C4309cu[] cuVarArr2 = new C4309cu[(cuVarArr.length + 1)];
        System.arraycopy(cuVarArr, 0, cuVarArr2, 0, cuVarArr.length);
        C4309cu cuVar2 = new C4309cu();
        cuVar2.f15930a = str;
        if (obj instanceof Long) {
            cuVar2.f15932c = (Long) obj;
        } else if (obj instanceof String) {
            cuVar2.f15931b = (String) obj;
        } else if (obj instanceof Double) {
            cuVar2.f15933d = (Double) obj;
        }
        cuVarArr2[cuVarArr.length] = cuVar2;
        return cuVarArr2;
    }

    /* renamed from: b */
    static Object m23493b(C4308ct ctVar, String str) {
        C4309cu a = m23483a(ctVar, str);
        if (a != null) {
            if (a.f15931b != null) {
                return a.f15931b;
            }
            if (a.f15932c != null) {
                return a.f15932c;
            }
            if (a.f15933d != null) {
                return a.f15933d;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo15253r().mo15852u_().mo15858a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo15563a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.r r5 = r4.mo15253r()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15852u_()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo15858a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4733eh.mo15563a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo15564a(C4298cj cjVar) {
        if (cjVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        m23488a(sb, 0, "filter_id", (Object) cjVar.f15872a);
        m23488a(sb, 0, "event_name", (Object) mo15250o().mo15841a(cjVar.f15873b));
        m23486a(sb, 1, "event_count_filter", cjVar.f15875d);
        sb.append("  filters {\n");
        for (C4299ck a : cjVar.f15874c) {
            m23485a(sb, 2, a);
        }
        m23484a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo15565a(C4301cm cmVar) {
        if (cmVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        m23488a(sb, 0, "filter_id", (Object) cmVar.f15890a);
        m23488a(sb, 0, "property_name", (Object) mo15250o().mo15843c(cmVar.f15891b));
        m23485a(sb, 1, cmVar.f15892c);
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15566a(C4309cu cuVar, Object obj) {
        C3266s.m14913a(obj);
        cuVar.f15931b = null;
        cuVar.f15932c = null;
        cuVar.f15933d = null;
        if (obj instanceof String) {
            cuVar.f15931b = (String) obj;
        } else if (obj instanceof Long) {
            cuVar.f15932c = (Long) obj;
        } else if (obj instanceof Double) {
            cuVar.f15933d = (Double) obj;
        } else {
            mo15253r().mo15852u_().mo15859a("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15567a(C4314cz czVar, Object obj) {
        C3266s.m14913a(obj);
        czVar.f15988c = null;
        czVar.f15989d = null;
        czVar.f15990e = null;
        if (obj instanceof String) {
            czVar.f15988c = (String) obj;
        } else if (obj instanceof Long) {
            czVar.f15989d = (Long) obj;
        } else if (obj instanceof Double) {
            czVar.f15990e = (Double) obj;
        } else {
            mo15253r().mo15852u_().mo15859a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15568a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo15248m().mo11326a() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo15569a(zzag zzag, zzk zzk) {
        C3266s.m14913a(zzag);
        C3266s.m14913a(zzk);
        if (!TextUtils.isEmpty(zzk.f17265b) || !TextUtils.isEmpty(zzk.f17281r)) {
            return true;
        }
        mo15256u();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo15570a(C4310cv cvVar) {
        try {
            byte[] bArr = new byte[cvVar.mo14784e()];
            C4477iq a = C4477iq.m22220a(bArr, 0, bArr.length);
            cvVar.mo14224a(a);
            a.mo14747a();
            return bArr;
        } catch (IOException e) {
            mo15253r().mo15852u_().mo15859a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final byte[] mo15571a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo15253r().mo15852u_().mo15859a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo15572b(C4310cv cvVar) {
        C4311cw[] cwVarArr;
        int i;
        int i2;
        C4310cv cvVar2 = cvVar;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (cvVar2.f15935a != null) {
            for (C4311cw cwVar : cvVar2.f15935a) {
                if (!(cwVar == null || cwVar == null)) {
                    m23484a(sb, 1);
                    sb.append("bundle {\n");
                    m23488a(sb, 1, "protocol_version", (Object) cwVar.f15952a);
                    m23488a(sb, 1, "platform", (Object) cwVar.f15960i);
                    m23488a(sb, 1, "gmp_version", (Object) cwVar.f15968q);
                    m23488a(sb, 1, "uploading_gmp_version", (Object) cwVar.f15969r);
                    m23488a(sb, 1, "config_version", (Object) cwVar.f15941E);
                    m23488a(sb, 1, "gmp_app_id", (Object) cwVar.f15976y);
                    m23488a(sb, 1, "admob_app_id", (Object) cwVar.f15945I);
                    m23488a(sb, 1, "app_id", (Object) cwVar.f15966o);
                    m23488a(sb, 1, "app_version", (Object) cwVar.f15967p);
                    m23488a(sb, 1, "app_version_major", (Object) cwVar.f15939C);
                    m23488a(sb, 1, "firebase_instance_id", (Object) cwVar.f15938B);
                    m23488a(sb, 1, "dev_cert_hash", (Object) cwVar.f15973v);
                    m23488a(sb, 1, "app_store", (Object) cwVar.f15965n);
                    m23488a(sb, 1, "upload_timestamp_millis", (Object) cwVar.f15955d);
                    m23488a(sb, 1, "start_timestamp_millis", (Object) cwVar.f15956e);
                    m23488a(sb, 1, "end_timestamp_millis", (Object) cwVar.f15957f);
                    m23488a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) cwVar.f15958g);
                    m23488a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) cwVar.f15959h);
                    m23488a(sb, 1, "app_instance_id", (Object) cwVar.f15972u);
                    m23488a(sb, 1, "resettable_device_id", (Object) cwVar.f15970s);
                    m23488a(sb, 1, "device_id", (Object) cwVar.f15940D);
                    m23488a(sb, 1, "ds_id", (Object) cwVar.f15943G);
                    m23488a(sb, 1, "limited_ad_tracking", (Object) cwVar.f15971t);
                    m23488a(sb, 1, "os_version", (Object) cwVar.f15961j);
                    m23488a(sb, 1, "device_model", (Object) cwVar.f15962k);
                    m23488a(sb, 1, "user_default_language", (Object) cwVar.f15963l);
                    m23488a(sb, 1, "time_zone_offset_minutes", (Object) cwVar.f15964m);
                    m23488a(sb, 1, "bundle_sequential_index", (Object) cwVar.f15974w);
                    m23488a(sb, 1, "service_upload", (Object) cwVar.f15977z);
                    m23488a(sb, 1, "health_monitor", (Object) cwVar.f15975x);
                    if (!(cwVar.f15942F == null || cwVar.f15942F.longValue() == 0)) {
                        m23488a(sb, 1, "android_id", (Object) cwVar.f15942F);
                    }
                    if (cwVar.f15944H != null) {
                        m23488a(sb, 1, "retry_counter", (Object) cwVar.f15944H);
                    }
                    C4314cz[] czVarArr = cwVar.f15954c;
                    if (czVarArr != null) {
                        for (C4314cz czVar : czVarArr) {
                            if (czVar != null) {
                                m23484a(sb, 2);
                                sb.append("user_property {\n");
                                m23488a(sb, 2, "set_timestamp_millis", (Object) czVar.f15986a);
                                m23488a(sb, 2, "name", (Object) mo15250o().mo15843c(czVar.f15987b));
                                m23488a(sb, 2, "string_value", (Object) czVar.f15988c);
                                m23488a(sb, 2, "int_value", (Object) czVar.f15989d);
                                m23488a(sb, 2, "double_value", (Object) czVar.f15990e);
                                m23484a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    C4306cr[] crVarArr = cwVar.f15937A;
                    String str = cwVar.f15966o;
                    if (crVarArr != null) {
                        int length = crVarArr.length;
                        int i3 = 0;
                        while (i3 < length) {
                            C4306cr crVar = crVarArr[i3];
                            if (crVar != null) {
                                m23484a(sb, 2);
                                sb.append("audience_membership {\n");
                                m23488a(sb, 2, "audience_id", (Object) crVar.f15916a);
                                m23488a(sb, 2, "new_audience", (Object) crVar.f15919d);
                                StringBuilder sb2 = sb;
                                C4306cr crVar2 = crVar;
                                i2 = i3;
                                i = length;
                                String str2 = str;
                                m23487a(sb2, 2, "current_data", crVar.f15917b, str2);
                                m23487a(sb2, 2, "previous_data", crVar2.f15918c, str2);
                                m23484a(sb, 2);
                                sb.append("}\n");
                            } else {
                                i2 = i3;
                                i = length;
                            }
                            i3 = i2 + 1;
                            length = i;
                        }
                    }
                    C4308ct[] ctVarArr = cwVar.f15953b;
                    if (ctVarArr != null) {
                        for (C4308ct ctVar : ctVarArr) {
                            if (ctVar != null) {
                                m23484a(sb, 2);
                                sb.append("event {\n");
                                m23488a(sb, 2, "name", (Object) mo15250o().mo15841a(ctVar.f15925b));
                                m23488a(sb, 2, "timestamp_millis", (Object) ctVar.f15926c);
                                m23488a(sb, 2, "previous_timestamp_millis", (Object) ctVar.f15927d);
                                m23488a(sb, 2, "count", (Object) ctVar.f15928e);
                                C4309cu[] cuVarArr = ctVar.f15924a;
                                if (cuVarArr != null) {
                                    for (C4309cu cuVar : cuVarArr) {
                                        if (cuVar != null) {
                                            m23484a(sb, 3);
                                            sb.append("param {\n");
                                            m23488a(sb, 3, "name", (Object) mo15250o().mo15842b(cuVar.f15930a));
                                            m23488a(sb, 3, "string_value", (Object) cuVar.f15931b);
                                            m23488a(sb, 3, "int_value", (Object) cuVar.f15932c);
                                            m23488a(sb, 3, "double_value", (Object) cuVar.f15933d);
                                            m23484a(sb, 3);
                                            sb.append("}\n");
                                        }
                                    }
                                }
                                m23484a(sb, 2);
                                sb.append("}\n");
                            }
                        }
                    }
                    m23484a(sb, 1);
                    sb.append("}\n");
                }
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo15573b(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo15253r().mo15852u_().mo15859a("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo15238c() {
        super.mo15238c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo15239d() {
        super.mo15239d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15307e() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int[] mo15574f() {
        Map a = C4756h.m23784a(this.f17003a.mo15249n());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C4756h.f17131U.mo15821b()).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo15253r().mo15849i().mo15859a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo15253r().mo15849i().mo15859a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4733eh mo15309g() {
        return super.mo15309g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C4741ep mo15311h() {
        return super.mo15311h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C4747ev mo15312i() {
        return super.mo15312i();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
