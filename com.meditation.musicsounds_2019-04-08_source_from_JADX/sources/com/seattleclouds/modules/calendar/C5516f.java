package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6614j;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.calendar.f */
public class C5516f extends BaseAdapter {

    /* renamed from: a */
    private static int f19613a;

    /* renamed from: b */
    private static int f19614b;

    /* renamed from: c */
    private Context f19615c;

    /* renamed from: d */
    private LayoutInflater f19616d;

    /* renamed from: e */
    private DateFormat f19617e;

    /* renamed from: f */
    private C5505b f19618f;

    /* renamed from: g */
    private List<C5522h> f19619g;

    /* renamed from: h */
    private Map<String, Integer> f19620h;

    /* renamed from: i */
    private int f19621i;

    /* renamed from: com.seattleclouds.modules.calendar.f$a */
    private static class C5518a {

        /* renamed from: a */
        public TextView f19622a;

        /* renamed from: b */
        public TextView f19623b;

        /* renamed from: c */
        public TextView f19624c;

        /* renamed from: d */
        public TextView f19625d;

        /* renamed from: e */
        public TextView f19626e;

        /* renamed from: f */
        public TextView f19627f;

        /* renamed from: g */
        public View f19628g;

        private C5518a() {
        }
    }

    public C5516f(Context context, List<C5522h> list, Map<String, Integer> map, int i) {
        this.f19615c = context;
        this.f19616d = LayoutInflater.from(context);
        this.f19617e = android.text.format.DateFormat.getTimeFormat(context);
        this.f19618f = new C5505b(context);
        this.f19619g = list;
        this.f19620h = map;
        this.f19621i = i;
        f19613a = C6594an.m31917a(context, 16842808);
        f19614b = C6594an.m31917a(context, 16842806);
    }

    /* renamed from: a */
    private void m27424a(C5522h hVar, View view) {
        TextView textView;
        int i;
        C5518a aVar = (C5518a) view.getTag();
        String e = hVar.mo17890e();
        String f = hVar.mo17892f();
        boolean a = C6614j.m32001a(new Date(), hVar.mo17897j());
        if (e == null && f == null) {
            String str = "";
            if (a) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f19615c.getString(C5462k.today));
                sb.append(", ");
                str = sb.toString();
                a = true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append((String) android.text.format.DateFormat.format("EEEE", hVar.mo17897j()));
            e = sb2.toString();
            f = android.text.format.DateFormat.getMediumDateFormat(this.f19615c).format(hVar.mo17897j());
            hVar.mo17883b(e);
            hVar.mo17887c(f);
        }
        if (a) {
            aVar.f19622a.setTextColor(f19614b);
            textView = aVar.f19623b;
            i = f19614b;
        } else {
            aVar.f19622a.setTextColor(f19613a);
            textView = aVar.f19623b;
            i = f19613a;
        }
        textView.setTextColor(i);
        aVar.f19622a.setText(e);
        aVar.f19623b.setText(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a7  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27425b(android.view.View r5, com.seattleclouds.modules.calendar.C5522h r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getTag()
            com.seattleclouds.modules.calendar.f$a r0 = (com.seattleclouds.modules.calendar.C5516f.C5518a) r0
            long r1 = r6.mo17886c()
            int r1 = (int) r1
            r5.setId(r1)
            java.lang.String r5 = r6.mo17892f()
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r4.f19620h
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0022
            int r1 = r4.f19621i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0022:
            android.view.View r2 = r0.f19628g
            com.seattleclouds.modules.calendar.b r3 = r4.f19618f
            int r1 = r1.intValue()
            android.graphics.drawable.Drawable r1 = r3.mo17840a(r1)
            com.seattleclouds.util.C6611g.m31978a(r2, r1)
            android.widget.TextView r1 = r0.f19622a
            java.lang.String r2 = r6.mo17890e()
            r1.setText(r2)
            java.lang.String r1 = "Court"
            boolean r1 = r5.equals(r1)
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L_0x0054
            android.widget.TextView r5 = r0.f19623b
            r5.setVisibility(r3)
            android.widget.TextView r5 = r0.f19623b
            java.lang.String r1 = r6.mo17895h()
        L_0x0050:
            r5.setText(r1)
            goto L_0x006d
        L_0x0054:
            java.lang.String r1 = "Detail"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0068
            android.widget.TextView r5 = r0.f19623b
            r5.setVisibility(r3)
            android.widget.TextView r5 = r0.f19623b
            java.lang.String r1 = r6.mo17896i()
            goto L_0x0050
        L_0x0068:
            android.widget.TextView r5 = r0.f19623b
            r5.setVisibility(r2)
        L_0x006d:
            java.lang.String r5 = r6.mo17894g()
            if (r5 == 0) goto L_0x0087
            java.lang.String r1 = ""
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x007c
            goto L_0x0087
        L_0x007c:
            android.widget.TextView r1 = r0.f19624c
            r1.setVisibility(r3)
            android.widget.TextView r1 = r0.f19624c
            r1.setText(r5)
            goto L_0x008c
        L_0x0087:
            android.widget.TextView r5 = r0.f19624c
            r5.setVisibility(r2)
        L_0x008c:
            android.widget.TextView r5 = r0.f19625d
            r5.setVisibility(r2)
            android.widget.TextView r5 = r0.f19627f
            r5.setVisibility(r2)
            android.widget.TextView r5 = r0.f19626e
            r5.setVisibility(r2)
            boolean r5 = r6.mo17899l()
            if (r5 == 0) goto L_0x00a7
        L_0x00a1:
            android.widget.TextView r5 = r0.f19626e
            r5.setVisibility(r3)
            goto L_0x00f1
        L_0x00a7:
            java.util.Date r5 = r6.mo17897j()
            java.util.Date r1 = r6.mo17898k()
            com.seattleclouds.modules.calendar.h r2 = r6.mo17882b()
            java.util.Date r2 = r2.mo17897j()
            boolean r2 = com.seattleclouds.util.C6614j.m32001a(r5, r2)
            if (r2 == 0) goto L_0x00ce
            android.widget.TextView r6 = r0.f19625d
            r6.setVisibility(r3)
            android.widget.TextView r6 = r0.f19625d
            java.text.DateFormat r0 = r4.f19617e
            java.lang.String r5 = r0.format(r5)
            r6.setText(r5)
            goto L_0x00f1
        L_0x00ce:
            com.seattleclouds.modules.calendar.h r5 = r6.mo17882b()
            java.util.Date r5 = r5.mo17897j()
            boolean r5 = com.seattleclouds.util.C6614j.m32001a(r1, r5)
            if (r5 == 0) goto L_0x00a1
            android.widget.TextView r5 = r0.f19627f
            r5.setVisibility(r3)
            android.widget.TextView r5 = r0.f19625d
            r5.setVisibility(r3)
            android.widget.TextView r5 = r0.f19625d
            java.text.DateFormat r6 = r4.f19617e
            java.lang.String r6 = r6.format(r1)
            r5.setText(r6)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.calendar.C5516f.m27425b(android.view.View, com.seattleclouds.modules.calendar.h):void");
    }

    /* renamed from: a */
    public View mo17864a(int i, ViewGroup viewGroup) {
        View view;
        C5522h hVar = (C5522h) getItem(i);
        C5518a aVar = new C5518a();
        if (hVar.mo17875a() == 0) {
            view = this.f19616d.inflate(C5460i.calendar_event_list_item_header, viewGroup, false);
            aVar.f19622a = (TextView) view.findViewById(C5458g.section_left_label);
            aVar.f19623b = (TextView) view.findViewById(C5458g.section_right_label);
        } else {
            view = this.f19616d.inflate(C5460i.calendar_event_list_item, viewGroup, false);
            aVar.f19622a = (TextView) view.findViewById(C5458g.title_text);
            aVar.f19623b = (TextView) view.findViewById(C5458g.detail_text);
            aVar.f19624c = (TextView) view.findViewById(C5458g.location_text);
            aVar.f19625d = (TextView) view.findViewById(C5458g.time_text);
            aVar.f19626e = (TextView) view.findViewById(C5458g.all_day_text);
            aVar.f19627f = (TextView) view.findViewById(C5458g.ends_text);
            aVar.f19628g = view.findViewById(C5458g.categoryMarker);
        }
        view.setTag(aVar);
        return view;
    }

    /* renamed from: a */
    public void mo17865a(View view, C5522h hVar) {
        if (hVar.mo17875a() == 0) {
            m27424a(hVar, view);
        } else {
            m27425b(view, hVar);
        }
    }

    /* renamed from: a */
    public void mo17866a(List<C5522h> list) {
        this.f19619g = list;
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f19619g.size();
    }

    public Object getItem(int i) {
        return this.f19619g.get(i);
    }

    public long getItemId(int i) {
        return ((C5522h) this.f19619g.get(i)).mo17886c();
    }

    public int getItemViewType(int i) {
        return ((C5522h) this.f19619g.get(i)).mo17875a();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5522h hVar = (C5522h) getItem(i);
        if (view == null) {
            view = mo17864a(i, viewGroup);
        }
        mo17865a(view, hVar);
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean isEnabled(int i) {
        return getItemViewType(i) != 0;
    }
}
