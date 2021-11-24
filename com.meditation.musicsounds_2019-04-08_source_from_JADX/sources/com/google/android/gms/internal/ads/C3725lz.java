package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.ads.lz */
final class C3725lz {

    /* renamed from: a */
    long f14434a;

    /* renamed from: b */
    final String f14435b;

    /* renamed from: c */
    final String f14436c;

    /* renamed from: d */
    final long f14437d;

    /* renamed from: e */
    final long f14438e;

    /* renamed from: f */
    final long f14439f;

    /* renamed from: g */
    final long f14440g;

    /* renamed from: h */
    final List<aod> f14441h;

    C3725lz(String str, afd afd) {
        List list;
        afd afd2 = afd;
        String str2 = afd2.f11860b;
        long j = afd2.f11861c;
        long j2 = afd2.f11862d;
        long j3 = afd2.f11863e;
        long j4 = afd2.f11864f;
        if (afd2.f11866h != null) {
            list = afd2.f11866h;
        } else {
            Map<String, String> map = afd2.f11865g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new aod((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
        this.f14434a = (long) afd2.f11859a.length;
    }

    private C3725lz(String str, String str2, long j, long j2, long j3, long j4, List<aod> list) {
        this.f14435b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f14436c = str2;
        this.f14437d = j;
        this.f14438e = j2;
        this.f14439f = j3;
        this.f14440g = j4;
        this.f14441h = list;
    }

    /* renamed from: a */
    static C3725lz m19157a(C3752mz mzVar) {
        if (C3697ky.m19054a((InputStream) mzVar) == 538247942) {
            C3725lz lzVar = new C3725lz(C3697ky.m19056a(mzVar), C3697ky.m19056a(mzVar), C3697ky.m19062b((InputStream) mzVar), C3697ky.m19062b((InputStream) mzVar), C3697ky.m19062b((InputStream) mzVar), C3697ky.m19062b((InputStream) mzVar), C3697ky.m19063b(mzVar));
            return lzVar;
        }
        throw new IOException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo13244a(OutputStream outputStream) {
        try {
            C3697ky.m19057a(outputStream, 538247942);
            C3697ky.m19059a(outputStream, this.f14435b);
            C3697ky.m19059a(outputStream, this.f14436c == null ? "" : this.f14436c);
            C3697ky.m19058a(outputStream, this.f14437d);
            C3697ky.m19058a(outputStream, this.f14438e);
            C3697ky.m19058a(outputStream, this.f14439f);
            C3697ky.m19058a(outputStream, this.f14440g);
            List<aod> list = this.f14441h;
            if (list != null) {
                C3697ky.m19057a(outputStream, list.size());
                for (aod aod : list) {
                    C3697ky.m19059a(outputStream, aod.mo12126a());
                    C3697ky.m19059a(outputStream, aod.mo12127b());
                }
            } else {
                C3697ky.m19057a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            C3504dv.m18312b("%s", e.toString());
            return false;
        }
    }
}
