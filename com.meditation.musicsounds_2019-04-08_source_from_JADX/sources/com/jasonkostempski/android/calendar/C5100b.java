package com.jasonkostempski.android.calendar;

import android.text.format.DateFormat;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: com.jasonkostempski.android.calendar.b */
public class C5100b {

    /* renamed from: a */
    private Calendar f18126a = Calendar.getInstance();

    /* renamed from: b */
    private String[] f18127b = new String[this.f18126a.getActualMaximum(7)];

    /* renamed from: c */
    private String[] f18128c = new String[(this.f18126a.getActualMaximum(2) + 1)];

    /* renamed from: d */
    private C5101a f18129d;

    /* renamed from: e */
    private Calendar f18130e;

    /* renamed from: f */
    private Calendar f18131f;

    /* renamed from: com.jasonkostempski.android.calendar.b$a */
    public interface C5101a {
        /* renamed from: a */
        void mo16534a(C5100b bVar);
    }

    public C5100b() {
        int i = 0;
        while (i < this.f18127b.length) {
            int i2 = i + 1;
            this.f18127b[i] = DateUtils.getDayOfWeekString(i2, 30);
            i = i2;
        }
        for (int i3 = 0; i3 < this.f18128c.length; i3++) {
            this.f18128c[i3] = DateUtils.getMonthString(i3, 30);
        }
    }

    /* renamed from: j */
    private void m25245j() {
        if (this.f18129d != null) {
            this.f18129d.mo16534a(this);
        }
    }

    /* renamed from: a */
    public int mo16546a() {
        return this.f18126a.get(1);
    }

    /* renamed from: a */
    public String mo16547a(CharSequence charSequence) {
        return DateFormat.format(charSequence, this.f18126a).toString();
    }

    /* renamed from: a */
    public void mo16548a(int i) {
        this.f18126a.set(1, i);
        m25245j();
    }

    /* renamed from: a */
    public void mo16549a(int i, int i2) {
        this.f18126a.set(1, i);
        this.f18126a.set(2, i2);
        m25245j();
    }

    /* renamed from: a */
    public void mo16550a(C5101a aVar) {
        this.f18129d = aVar;
    }

    /* renamed from: a */
    public void mo16551a(Calendar calendar) {
        this.f18126a.setTime(calendar.getTime());
        m25245j();
    }

    /* renamed from: b */
    public int mo16552b() {
        return this.f18126a.get(2);
    }

    /* renamed from: b */
    public void mo16553b(int i) {
        if (i != 0) {
            this.f18126a.add(1, i);
            m25245j();
        }
    }

    /* renamed from: b */
    public void mo16554b(int i, int i2) {
        this.f18126a.add(2, i);
        this.f18126a.set(5, i2);
        m25245j();
    }

    /* renamed from: c */
    public int mo16555c() {
        return this.f18126a.get(5);
    }

    /* renamed from: c */
    public void mo16556c(int i) {
        if (i != 0) {
            this.f18126a.add(2, i);
            m25245j();
        }
    }

    /* renamed from: d */
    public void mo16557d(int i) {
        if (i != 0) {
            this.f18126a.add(5, i);
            m25245j();
        }
    }

    /* renamed from: d */
    public String[] mo16558d() {
        return this.f18127b;
    }

    /* renamed from: e */
    public String[] mo16559e() {
        return this.f18128c;
    }

    /* renamed from: f */
    public int[] mo16560f() {
        int i;
        this.f18130e = null;
        this.f18131f = null;
        int[] iArr = new int[42];
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f18126a.get(1), this.f18126a.get(2), this.f18126a.get(5), this.f18126a.get(11), this.f18126a.get(12), this.f18126a.get(13));
        gregorianCalendar.set(5, 1);
        int i2 = gregorianCalendar.get(7);
        int actualMaximum = gregorianCalendar.getActualMaximum(5);
        int i3 = i2 - 1;
        if (i3 > 0) {
            gregorianCalendar.set(5, -1);
            int actualMaximum2 = gregorianCalendar.getActualMaximum(5);
            i = 0;
            for (int i4 = i3; i4 > 0; i4--) {
                int i5 = (actualMaximum2 - i4) + 1;
                if (i4 == i3) {
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), gregorianCalendar.get(13));
                    this.f18130e = gregorianCalendar2;
                    this.f18130e.set(5, i5);
                }
                iArr[i] = i5;
                i++;
            }
        } else {
            i = 0;
        }
        int i6 = 0;
        while (i6 < actualMaximum) {
            if (i6 == 0 && this.f18130e == null) {
                GregorianCalendar gregorianCalendar3 = new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), gregorianCalendar.get(13));
                this.f18130e = gregorianCalendar3;
            }
            i6++;
            iArr[i] = i6;
            i++;
        }
        int i7 = i;
        int i8 = 1;
        while (i < iArr.length) {
            if (i == i7) {
                iArr[i7] = i8;
            }
            i8++;
            i7++;
            i++;
        }
        this.f18131f = (Calendar) this.f18126a.clone();
        this.f18131f.add(2, 1);
        this.f18131f.set(5, iArr[41]);
        return iArr;
    }

    /* renamed from: g */
    public Calendar mo16561g() {
        return (Calendar) this.f18126a.clone();
    }

    /* renamed from: h */
    public Calendar mo16562h() {
        return (Calendar) this.f18130e.clone();
    }

    /* renamed from: i */
    public Calendar mo16563i() {
        return (Calendar) this.f18131f.clone();
    }
}
