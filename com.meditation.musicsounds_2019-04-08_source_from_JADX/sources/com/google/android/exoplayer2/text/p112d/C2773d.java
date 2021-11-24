package com.google.android.exoplayer2.text.p112d;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.d.d */
final class C2773d {
    /* renamed from: a */
    public static C2774e m13170a(C2774e eVar, String[] strArr, Map<String, C2774e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (eVar == null && strArr.length == 1) {
            return (C2774e) map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            C2774e eVar2 = new C2774e();
            int length = strArr.length;
            while (i < length) {
                eVar2.mo9450a((C2774e) map.get(strArr[i]));
                i++;
            }
            return eVar2;
        } else if (eVar != null && strArr != null && strArr.length == 1) {
            return eVar.mo9450a((C2774e) map.get(strArr[0]));
        } else {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i < length2) {
                    eVar.mo9450a((C2774e) map.get(strArr[i]));
                    i++;
                }
            }
            return eVar;
        }
    }

    /* renamed from: a */
    static String m13171a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* renamed from: a */
    static void m13172a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    /* renamed from: a */
    public static void m13173a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C2774e eVar) {
        Object obj;
        if (eVar.mo9446a() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.mo9446a()), i, i2, 33);
        }
        if (eVar.mo9456b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (eVar.mo9459c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (eVar.mo9463f()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.mo9462e()), i, i2, 33);
        }
        if (eVar.mo9465h()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.mo9464g()), i, i2, 33);
        }
        if (eVar.mo9461d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.mo9461d()), i, i2, 33);
        }
        if (eVar.mo9467j() != null) {
            spannableStringBuilder.setSpan(new Standard(eVar.mo9467j()), i, i2, 33);
        }
        switch (eVar.mo9468k()) {
            case 1:
                obj = new AbsoluteSizeSpan((int) eVar.mo9469l(), true);
                break;
            case 2:
                obj = new RelativeSizeSpan(eVar.mo9469l());
                break;
            case 3:
                obj = new RelativeSizeSpan(eVar.mo9469l() / 100.0f);
                break;
            default:
                return;
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }
}
