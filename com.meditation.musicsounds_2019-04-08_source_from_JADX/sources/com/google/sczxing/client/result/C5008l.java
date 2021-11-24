package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.l */
public final class C5008l extends C5010n {

    /* renamed from: a */
    private static final Pattern f17890a = Pattern.compile("geo:([\\-0-9.]+),([\\-0-9.]+)(?:,([\\-0-9.]+))?(?:\\?(.*))?", 2);

    /* renamed from: a */
    public C5007k mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        if (a == null) {
            return null;
        }
        Matcher matcher = f17890a.matcher(a);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(4);
        try {
            double parseDouble = Double.parseDouble(matcher.group(1));
            if (parseDouble <= 90.0d) {
                if (parseDouble >= -90.0d) {
                    double parseDouble2 = Double.parseDouble(matcher.group(2));
                    if (parseDouble2 <= 180.0d) {
                        if (parseDouble2 >= -180.0d) {
                            double d = 0.0d;
                            if (matcher.group(3) != null) {
                                double parseDouble3 = Double.parseDouble(matcher.group(3));
                                if (parseDouble3 < 0.0d) {
                                    return null;
                                }
                                d = parseDouble3;
                            }
                            C5007k kVar = new C5007k(parseDouble, parseDouble2, d, group);
                            return kVar;
                        }
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
