package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.gms.analytics.j */
public final class C2946j implements C2959t {

    /* renamed from: a */
    private static final Uri f10388a;

    /* renamed from: b */
    private final LogPrinter f10389b = new LogPrinter(4, "GA/LogCatTransport");

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        f10388a = builder.build();
    }

    /* renamed from: a */
    public final Uri mo10622a() {
        return f10388a;
    }

    /* renamed from: a */
    public final void mo10623a(C2948l lVar) {
        ArrayList arrayList = new ArrayList(lVar.mo10631b());
        Collections.sort(arrayList, new C2947k(this));
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String obj2 = ((C2950n) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(obj2);
            }
        }
        this.f10389b.println(sb.toString());
    }
}
