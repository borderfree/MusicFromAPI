package com.jasonkostempski.android.calendar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p009v4.content.C0452b;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.jasonkostempski.android.calendar.C5100b.C5101a;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6614j;
import java.util.Calendar;
import java.util.Set;

public class CalendarView extends LinearLayout {

    /* renamed from: a */
    private C5101a f18093a = new C5101a() {
        /* renamed from: a */
        public void mo16534a(C5100b bVar) {
            if (Boolean.valueOf((CalendarView.this.f18114v == bVar.mo16546a() && CalendarView.this.f18115w == bVar.mo16552b()) ? false : true).booleanValue()) {
                CalendarView.this.m25222a();
                CalendarView.this.m25228d();
            }
            CalendarView.this.m25226c();
            CalendarView.this.m25225b();
        }
    };

    /* renamed from: b */
    private OnClickListener f18094b = new OnClickListener() {
        public void onClick(View view) {
            int i = view == CalendarView.this.f18110r ? 1 : -1;
            if (CalendarView.this.f18113u == 2) {
                CalendarView.this.f18103k.mo16556c(i);
            } else if (CalendarView.this.f18113u == 1) {
                CalendarView.this.f18103k.mo16557d(i);
                CalendarView.this.m25230e();
            } else if (CalendarView.this.f18113u == 3) {
                CalendarView.this.f18103k.mo16553b(i);
                CalendarView.this.m25225b();
            }
        }
    };

    /* renamed from: c */
    private OnClickListener f18095c = new OnClickListener() {
        public void onClick(View view) {
            int[] iArr = (int[]) view.findViewById(C5458g.day_text).getTag();
            CalendarView.this.f18103k.mo16554b(iArr[0], iArr[1]);
            CalendarView.this.m25230e();
            CalendarView.this.setView(1);
        }
    };

    /* renamed from: d */
    private OnClickListener f18096d = new OnClickListener() {
        public void onClick(View view) {
            CalendarView.this.f18103k.mo16549a(CalendarView.this.f18114v, ((Integer) view.getTag()).intValue());
            CalendarView.this.setView(2);
        }
    };

    /* renamed from: e */
    private OnClickListener f18097e = new OnClickListener() {
        public void onClick(View view) {
            CalendarView.this.f18103k.mo16548a(((Integer) view.getTag()).intValue());
            CalendarView.this.setView(3);
        }
    };

    /* renamed from: f */
    private OnClickListener f18098f = new OnClickListener() {
        public void onClick(View view) {
            CalendarView.this.setView(CalendarView.this.f18113u + 1);
        }
    };

    /* renamed from: g */
    private final int f18099g = 5;

    /* renamed from: h */
    private final int f18100h = 4;

    /* renamed from: i */
    private final int f18101i = 3;

    /* renamed from: j */
    private final int f18102j = 0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5100b f18103k;

    /* renamed from: l */
    private TableLayout f18104l;

    /* renamed from: m */
    private TableLayout f18105m;

    /* renamed from: n */
    private TableLayout f18106n;

    /* renamed from: o */
    private LinearLayout f18107o;

    /* renamed from: p */
    private Button f18108p;

    /* renamed from: q */
    private Button f18109q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Button f18110r;

    /* renamed from: s */
    private C5097a f18111s;

    /* renamed from: t */
    private C5098b f18112t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f18113u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f18114v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f18115w;

    /* renamed from: com.jasonkostempski.android.calendar.CalendarView$a */
    public interface C5097a {
        /* renamed from: a */
        void mo16540a(CalendarView calendarView);
    }

    /* renamed from: com.jasonkostempski.android.calendar.CalendarView$b */
    public interface C5098b {
        /* renamed from: a */
        void mo16541a(CalendarView calendarView);
    }

    public CalendarView(Context context) {
        super(context);
        m25223a(context);
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25223a(context);
    }

    /* renamed from: a */
    private TextView m25221a(TableRow tableRow, int i) {
        return (TextView) tableRow.getChildAt(i).findViewById(C5458g.day_text);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25222a() {
        Context context;
        int i;
        int[] f = this.f18103k.mo16560f();
        int i2 = -1;
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 < f.length; i5++) {
            if (f[i5] == 1) {
                i2++;
            }
            TextView a = m25221a((TableRow) this.f18104l.getChildAt(i3), i4);
            C6611g.m31978a((View) a, (Drawable) null);
            StringBuilder sb = new StringBuilder();
            sb.append(f[i5]);
            sb.append("");
            a.setText(sb.toString());
            if (i2 == 0) {
                context = getContext();
                i = 16842806;
            } else {
                context = getContext();
                i = 16842808;
            }
            a.setTextColor(C6594an.m31917a(context, i));
            a.setTag(new int[]{i2, f[i5]});
            i4++;
            if (i4 == 7) {
                i3++;
                i4 = 0;
            }
        }
    }

    /* renamed from: a */
    private void m25223a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C5460i.calendar_view, this, true);
        this.f18103k = new C5100b();
        this.f18104l = (TableLayout) inflate.findViewById(C5458g.days);
        this.f18105m = (TableLayout) inflate.findViewById(C5458g.months);
        this.f18106n = (TableLayout) inflate.findViewById(C5458g.years);
        this.f18108p = (Button) inflate.findViewById(C5458g.f19437up);
        this.f18109q = (Button) inflate.findViewById(C5458g.previous);
        this.f18110r = (Button) inflate.findViewById(C5458g.next);
        this.f18107o = (LinearLayout) inflate.findViewById(C5458g.events);
        m25226c();
        String[] d = this.f18103k.mo16558d();
        int i = 0;
        while (i < 7) {
            TableRow tableRow = (TableRow) this.f18104l.getChildAt(i);
            for (int i2 = 0; i2 < 7; i2++) {
                Boolean valueOf = Boolean.valueOf(i == 0);
                View childAt = tableRow.getChildAt(i2);
                TextView textView = (TextView) childAt.findViewById(C5458g.day_text);
                if (valueOf.booleanValue()) {
                    textView.setText(d[i2]);
                } else {
                    childAt.setOnClickListener(this.f18095c);
                }
            }
            i++;
        }
        m25222a();
        String[] e = this.f18103k.mo16559e();
        int i3 = 0;
        int i4 = 0;
        while (i3 < 3) {
            TableRow tableRow2 = (TableRow) this.f18105m.getChildAt(i3);
            int i5 = i4;
            for (int i6 = 0; i6 < 4; i6++) {
                TextView textView2 = (TextView) tableRow2.getChildAt(i6);
                textView2.setOnClickListener(this.f18096d);
                textView2.setText(e[i5]);
                textView2.setTag(Integer.valueOf(i5));
                i5++;
            }
            i3++;
            i4 = i5;
        }
        for (int i7 = 0; i7 < 3; i7++) {
            TableRow tableRow3 = (TableRow) this.f18106n.getChildAt(i7);
            for (int i8 = 0; i8 < 4; i8++) {
                ((TextView) tableRow3.getChildAt(i8)).setOnClickListener(this.f18097e);
            }
        }
        this.f18103k.mo16550a(this.f18093a);
        this.f18108p.setOnClickListener(this.f18098f);
        this.f18109q.setOnClickListener(this.f18094b);
        this.f18110r.setOnClickListener(this.f18094b);
        setView(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25225b() {
        String str;
        Button button;
        String str2;
        C5100b bVar;
        switch (this.f18113u) {
            case 0:
                button = this.f18108p;
                str = "ITEM_VIEW";
                break;
            case 1:
                button = this.f18108p;
                StringBuilder sb = new StringBuilder();
                sb.append(DateFormat.format("EEEE, ", this.f18103k.mo16561g()));
                sb.append(DateFormat.getMediumDateFormat(getContext()).format(this.f18103k.mo16561g().getTime()));
                str = sb.toString();
                break;
            case 2:
                button = this.f18108p;
                bVar = this.f18103k;
                str2 = "MMMM yyyy";
                break;
            case 3:
                button = this.f18108p;
                bVar = this.f18103k;
                str2 = "yyyy";
                break;
            case 4:
                button = this.f18108p;
                str = "DECADE_VIEW";
                break;
            case 5:
                button = this.f18108p;
                str = "CENTURY_VIEW";
                break;
            default:
                return;
        }
        str = bVar.mo16547a((CharSequence) str2);
        button.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25226c() {
        this.f18114v = this.f18103k.mo16546a();
        this.f18115w = this.f18103k.mo16552b();
        this.f18103k.mo16555c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25228d() {
        if (this.f18111s != null) {
            this.f18111s.mo16540a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m25230e() {
        if (this.f18112t != null) {
            this.f18112t.mo16541a(this);
        }
    }

    /* renamed from: a */
    public void mo16523a(Set<Calendar> set, int i) {
        Calendar b = C6614j.m32003b(this.f18103k.mo16562h().getTime());
        Calendar instance = Calendar.getInstance();
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < 42; i4++) {
            View childAt = ((TableRow) this.f18104l.getChildAt(i2)).getChildAt(i3);
            View findViewById = childAt.findViewById(C5458g.day_marker);
            if (set.contains(b)) {
                View findViewById2 = childAt.findViewById(C5458g.day_marker);
                findViewById2.setVisibility(0);
                findViewById2.setBackgroundColor(i);
            } else {
                findViewById.setVisibility(8);
            }
            C6611g.m31978a(childAt, C6614j.m32000a(b, instance) ? C0452b.m2059a(getContext(), C5457f.calendar_today_marker) : null);
            b.add(5, 1);
            i3++;
            if (i3 == 7) {
                i2++;
                i3 = 0;
            }
        }
    }

    public Calendar getSelectedDay() {
        return this.f18103k.mo16561g();
    }

    public int getView() {
        return this.f18113u;
    }

    public Calendar getVisibleEndDate() {
        return this.f18103k.mo16563i();
    }

    public Calendar getVisibleStartDate() {
        return this.f18103k.mo16562h();
    }

    public void setDaysWithEvents(C5099a[] aVarArr) {
        Calendar h = this.f18103k.mo16562h();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < 42 && i != aVarArr.length; i4++) {
            TextView a = m25221a((TableRow) this.f18104l.getChildAt(i2), i3);
            int i5 = ((int[]) a.getTag())[1];
            int i6 = 0;
            while (true) {
                if (i6 >= aVarArr.length) {
                    break;
                }
                C5099a aVar = aVarArr[i6];
                if (h.get(1) == aVar.mo16542a() && h.get(2) == aVar.mo16543b() && i5 == aVar.mo16544c()) {
                    a.setBackgroundColor(aVar.mo16545d());
                    i++;
                    break;
                }
                i6++;
            }
            h.add(5, 1);
            i3++;
            if (i3 == 7) {
                i2++;
                i3 = 0;
            }
        }
    }

    public void setListViewItems(View[] viewArr) {
        this.f18107o.removeAllViews();
        for (View addView : viewArr) {
            this.f18107o.addView(addView);
        }
    }

    public void setOnMonthChangedListener(C5097a aVar) {
        this.f18111s = aVar;
    }

    public void setOnSelectedDayChangedListener(C5098b bVar) {
        this.f18112t = bVar;
    }

    public void setSelectedDay(Calendar calendar) {
        if (!getSelectedDay().equals(calendar)) {
            this.f18103k.mo16551a(calendar);
            if (this.f18113u == 1) {
                m25230e();
            } else if (this.f18113u == 3) {
                m25225b();
            }
        }
    }

    public void setView(int i) {
        if (this.f18113u != i) {
            this.f18113u = i;
            boolean z = true;
            int i2 = 8;
            this.f18107o.setVisibility(this.f18113u == 1 ? 0 : 8);
            this.f18106n.setVisibility(this.f18113u == 4 ? 0 : 8);
            this.f18105m.setVisibility(this.f18113u == 3 ? 0 : 8);
            TableLayout tableLayout = this.f18104l;
            if (this.f18113u == 2) {
                i2 = 0;
            }
            tableLayout.setVisibility(i2);
            Button button = this.f18108p;
            if (this.f18113u == 3) {
                z = false;
            }
            button.setEnabled(z);
            m25225b();
        }
    }
}
