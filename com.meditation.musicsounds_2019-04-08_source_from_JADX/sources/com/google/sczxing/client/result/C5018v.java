package com.google.sczxing.client.result;

import com.google.sczxing.client.p140a.C4988f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.sczxing.client.result.v */
public final class C5018v extends C5010n {

    /* renamed from: a */
    private static final Pattern f17909a = Pattern.compile("[a-zA-Z0-9]{2,}://[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)*(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: b */
    private static final Pattern f17910b = Pattern.compile("([a-zA-Z0-9\\-]+\\.)+[a-zA-Z0-9\\-]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* renamed from: a */
    static boolean m24878a(CharSequence charSequence) {
        Matcher matcher = f17909a.matcher(charSequence);
        boolean z = true;
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f17910b.matcher(charSequence);
        if (!matcher2.find() || matcher2.start() != 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public C5017u mo16314b(C4988f fVar) {
        String a = fVar.mo16290a();
        if (a.startsWith("URL:")) {
            a = a.substring(4);
        }
        String trim = a.trim();
        if (m24878a((CharSequence) trim)) {
            return new C5017u(trim, null);
        }
        return null;
    }
}
