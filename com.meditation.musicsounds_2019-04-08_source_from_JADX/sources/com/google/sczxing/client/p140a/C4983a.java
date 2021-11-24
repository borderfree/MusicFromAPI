package com.google.sczxing.client.p140a;

import android.app.Activity;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.google.sczxing.client.result.C5000d;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.sczxing.client.a.a */
public final class C4983a extends C4990h {

    /* renamed from: a */
    private static final DateFormat[] f17824a = {new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH), new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH)};

    /* renamed from: b */
    private static final int[] f17825b = {C5462k.barcode_button_add_contact, C5462k.barcode_button_show_map, C5462k.barcode_button_dial, C5462k.barcode_button_email};

    /* renamed from: c */
    private final boolean[] f17826c;

    /* renamed from: d */
    private int f17827d;

    public C4983a(Activity activity, C5009m mVar) {
        super(activity, mVar);
        C5000d dVar = (C5000d) mVar;
        String[] i = dVar.mo16324i();
        boolean z = i != null && i.length > 0 && i[0].length() > 0;
        String[] c = dVar.mo16318c();
        boolean z2 = c != null && c.length > 0;
        String[] e = dVar.mo16320e();
        boolean z3 = e != null && e.length > 0;
        this.f17826c = new boolean[4];
        this.f17826c[0] = true;
        this.f17826c[1] = z;
        this.f17826c[2] = z2;
        this.f17826c[3] = z3;
        this.f17827d = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f17826c[i2]) {
                this.f17827d++;
            }
        }
    }

    /* renamed from: c */
    private int m24721c(int i) {
        if (i < this.f17827d) {
            int i2 = -1;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this.f17826c[i3]) {
                    i2++;
                }
                if (i2 == i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Date m24722h(java.lang.String r6) {
        /*
            java.text.DateFormat[] r0 = f17824a
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r1) goto L_0x0021
            r4 = r0[r3]
            monitor-enter(r4)
            r4.setLenient(r2)     // Catch:{ all -> 0x001e }
            java.text.ParsePosition r5 = new java.text.ParsePosition     // Catch:{ all -> 0x001e }
            r5.<init>(r2)     // Catch:{ all -> 0x001e }
            java.util.Date r5 = r4.parse(r6, r5)     // Catch:{ all -> 0x001e }
            if (r5 == 0) goto L_0x001a
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            return r5
        L_0x001a:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            int r3 = r3 + 1
            goto L_0x0005
        L_0x001e:
            r6 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r6
        L_0x0021:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.sczxing.client.p140a.C4983a.m24722h(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public int mo16285a() {
        return this.f17827d;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17825b[m24721c(i)];
    }

    /* renamed from: b */
    public CharSequence mo16287b() {
        C5000d dVar = (C5000d) mo16308d();
        StringBuilder sb = new StringBuilder(100);
        C5009m.m24846a(dVar.mo16316a(), sb);
        int length = sb.length();
        String b = dVar.mo16317b();
        if (b != null && b.length() > 0) {
            sb.append("\n(");
            sb.append(b);
            sb.append(')');
        }
        C5009m.m24845a(dVar.mo16326k(), sb);
        C5009m.m24845a(dVar.mo16327l(), sb);
        C5009m.m24846a(dVar.mo16324i(), sb);
        String[] c = dVar.mo16318c();
        if (c != null) {
            for (String formatNumber : c) {
                C5009m.m24845a(PhoneNumberUtils.formatNumber(formatNumber), sb);
            }
        }
        C5009m.m24846a(dVar.mo16320e(), sb);
        C5009m.m24845a(dVar.mo16328m(), sb);
        String n = dVar.mo16329n();
        if (n != null && n.length() > 0) {
            Date h = m24722h(n);
            if (h != null) {
                C5009m.m24845a(DateFormat.getDateInstance().format(Long.valueOf(h.getTime())), sb);
            }
        }
        C5009m.m24845a(dVar.mo16323h(), sb);
        if (length <= 0) {
            return sb.toString();
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        spannableString.setSpan(new StyleSpan(1), 0, length, 0);
        return spannableString;
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5000d dVar = (C5000d) mo16308d();
        String[] i2 = dVar.mo16324i();
        String str = null;
        String str2 = (i2 == null || i2.length < 1) ? null : i2[0];
        String[] j = dVar.mo16325j();
        String str3 = (j == null || j.length < 1) ? null : j[0];
        switch (m24721c(i)) {
            case 0:
                mo16300a(dVar.mo16316a(), dVar.mo16317b(), dVar.mo16318c(), dVar.mo16319d(), dVar.mo16320e(), dVar.mo16321f(), dVar.mo16323h(), dVar.mo16322g(), str2, str3, dVar.mo16327l(), dVar.mo16326k(), dVar.mo16328m(), dVar.mo16329n());
                return;
            case 1:
                String[] a = dVar.mo16316a();
                if (a != null) {
                    str = a[0];
                }
                mo16295a(str2, (CharSequence) str);
                return;
            case 2:
                mo16306c(dVar.mo16318c()[0]);
                return;
            case 3:
                mo16297a(dVar.mo16320e()[0], (String) null, (String) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_address_book;
    }
}
