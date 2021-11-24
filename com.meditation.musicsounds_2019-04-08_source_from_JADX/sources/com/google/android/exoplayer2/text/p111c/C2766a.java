package com.google.android.exoplayer2.text.p111c;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.p102c.C2493f;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2753b;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.c.a */
public final class C2766a extends C2753b {

    /* renamed from: a */
    private static final Pattern f9546a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: b */
    private final StringBuilder f9547b = new StringBuilder();

    public C2766a() {
        super("SubripDecoder");
    }

    /* renamed from: a */
    private static long m13133a(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2767b mo9429a(byte[] bArr, int i, boolean z) {
        String str;
        String str2;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        C2493f fVar = new C2493f();
        C2500k kVar = new C2500k(bArr, i);
        while (true) {
            String y = kVar.mo8852y();
            if (y == null) {
                C2741a[] aVarArr = new C2741a[arrayList.size()];
                arrayList.toArray(aVarArr);
                return new C2767b(aVarArr, fVar.mo8806b());
            } else if (y.length() != 0) {
                try {
                    Integer.parseInt(y);
                    y = kVar.mo8852y();
                    Matcher matcher = f9546a.matcher(y);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        fVar.mo8805a(m13133a(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            fVar.mo8805a(m13133a(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        this.f9547b.setLength(0);
                        while (true) {
                            String y2 = kVar.mo8852y();
                            if (TextUtils.isEmpty(y2)) {
                                break;
                            }
                            if (this.f9547b.length() > 0) {
                                this.f9547b.append("<br>");
                            }
                            this.f9547b.append(y2.trim());
                        }
                        arrayList.add(new C2741a(Html.fromHtml(this.f9547b.toString())));
                        if (z2) {
                            arrayList.add(null);
                        }
                    } else {
                        str = "SubripDecoder";
                        sb = new StringBuilder();
                        str2 = "Skipping invalid timing: ";
                        sb.append(str2);
                        sb.append(y);
                        Log.w(str, sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    str = "SubripDecoder";
                    sb = new StringBuilder();
                    str2 = "Skipping invalid index: ";
                }
            }
        }
    }
}
