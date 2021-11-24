package com.google.sczxing.client.p140a;

import android.app.Activity;
import com.google.sczxing.client.result.C5003g;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: com.google.sczxing.client.a.b */
public final class C4984b extends C4990h {

    /* renamed from: a */
    private static final DateFormat f17828a = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);

    /* renamed from: b */
    private static final DateFormat f17829b = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);

    /* renamed from: c */
    private static final int[] f17830c = {C5462k.barcode_button_add_calendar};

    public C4984b(Activity activity, C5009m mVar) {
        super(activity, mVar);
    }

    /* renamed from: a */
    private static void m24728a(String str, StringBuilder sb, boolean z, boolean z2) {
        Date parse;
        String format;
        Date parse2;
        if (str.length() == 8) {
            synchronized (f17828a) {
                parse2 = f17828a.parse(str, new ParsePosition(0));
            }
            if (z && !z2) {
                parse2 = new Date(parse2.getTime() - 86400000);
            }
            format = DateFormat.getDateInstance().format(Long.valueOf(parse2.getTime()));
        } else {
            synchronized (f17829b) {
                parse = f17829b.parse(str.substring(0, 15), new ParsePosition(0));
            }
            long time = parse.getTime();
            if (str.length() == 16 && str.charAt(15) == 'Z') {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                time += (long) (gregorianCalendar.get(15) + gregorianCalendar.get(16));
            }
            format = DateFormat.getDateTimeInstance().format(Long.valueOf(time));
        }
        C5009m.m24845a(format, sb);
    }

    /* renamed from: a */
    public int mo16285a() {
        return f17830c.length;
    }

    /* renamed from: a */
    public int mo16286a(int i) {
        return f17830c[i];
    }

    /* renamed from: b */
    public CharSequence mo16287b() {
        C5003g gVar = (C5003g) mo16308d();
        StringBuilder sb = new StringBuilder(100);
        C5009m.m24845a(gVar.mo16333a(), sb);
        String b = gVar.mo16334b();
        m24728a(b, sb, false, false);
        String c = gVar.mo16335c();
        if (c != null) {
            m24728a(c, sb, true, b.equals(c));
        }
        C5009m.m24845a(gVar.mo16336d(), sb);
        C5009m.m24845a(gVar.mo16337e(), sb);
        C5009m.m24845a(gVar.mo16338f(), sb);
        return sb.toString();
    }

    /* renamed from: b */
    public void mo16288b(int i) {
        C5003g gVar = (C5003g) mo16308d();
        if (i == 0) {
            mo16299a(gVar.mo16333a(), gVar.mo16334b(), gVar.mo16335c(), gVar.mo16336d(), gVar.mo16338f());
        }
    }

    /* renamed from: c */
    public int mo16289c() {
        return C5462k.barcode_result_calendar;
    }
}
