package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.database.Cursor;
import android.support.p009v4.widget.C0689f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.calendar.g */
public class C5519g extends C0689f {

    /* renamed from: j */
    private LayoutInflater f19629j;

    /* renamed from: k */
    private DateFormat f19630k;

    /* renamed from: l */
    private C5505b f19631l;

    /* renamed from: m */
    private Date f19632m;

    /* renamed from: n */
    private Map<String, Integer> f19633n;

    /* renamed from: o */
    private int f19634o;

    /* renamed from: com.seattleclouds.modules.calendar.g$a */
    private static class C5521a {

        /* renamed from: a */
        public TextView f19635a;

        /* renamed from: b */
        public TextView f19636b;

        /* renamed from: c */
        public TextView f19637c;

        /* renamed from: d */
        public TextView f19638d;

        /* renamed from: e */
        public TextView f19639e;

        /* renamed from: f */
        public TextView f19640f;

        /* renamed from: g */
        public View f19641g;

        private C5521a() {
        }
    }

    public C5519g(Context context, Date date, Map<String, Integer> map, int i) {
        super(context, (Cursor) null, 0);
        this.f19629j = LayoutInflater.from(context);
        this.f19630k = android.text.format.DateFormat.getTimeFormat(context);
        this.f19631l = new C5505b(context);
        this.f19632m = date;
        this.f19633n = map;
        this.f19634o = i;
    }

    /* renamed from: a */
    public View mo2862a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f19629j.inflate(C5460i.calendar_event_list_item, viewGroup, false);
        C5521a aVar = new C5521a();
        aVar.f19635a = (TextView) inflate.findViewById(C5458g.title_text);
        aVar.f19636b = (TextView) inflate.findViewById(C5458g.detail_text);
        aVar.f19637c = (TextView) inflate.findViewById(C5458g.location_text);
        aVar.f19638d = (TextView) inflate.findViewById(C5458g.time_text);
        aVar.f19639e = (TextView) inflate.findViewById(C5458g.all_day_text);
        aVar.f19640f = (TextView) inflate.findViewById(C5458g.ends_text);
        aVar.f19641g = inflate.findViewById(C5458g.categoryMarker);
        inflate.setTag(aVar);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2865a(android.view.View r6, android.content.Context r7, android.database.Cursor r8) {
        /*
            r5 = this;
            java.lang.String r7 = "_id"
            int r7 = r8.getColumnIndex(r7)
            int r7 = r8.getInt(r7)
            r6.setId(r7)
            java.lang.Object r6 = r6.getTag()
            com.seattleclouds.modules.calendar.g$a r6 = (com.seattleclouds.modules.calendar.C5519g.C5521a) r6
            java.lang.String r7 = "category"
            int r7 = r8.getColumnIndex(r7)
            java.lang.String r7 = r8.getString(r7)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.f19633n
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x002d
            int r0 = r5.f19634o
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002d:
            android.view.View r1 = r6.f19641g
            com.seattleclouds.modules.calendar.b r2 = r5.f19631l
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r0 = r2.mo17840a(r0)
            com.seattleclouds.util.C6611g.m31978a(r1, r0)
            android.widget.TextView r0 = r6.f19635a
            java.lang.String r1 = "title"
            int r1 = r8.getColumnIndex(r1)
            java.lang.String r1 = r8.getString(r1)
            r0.setText(r1)
            java.lang.String r0 = "Court"
            boolean r0 = r7.equals(r0)
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x006b
            android.widget.TextView r7 = r6.f19636b
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f19636b
            java.lang.String r0 = "case_number"
        L_0x005f:
            int r0 = r8.getColumnIndex(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.setText(r0)
            goto L_0x0082
        L_0x006b:
            java.lang.String r0 = "Detail"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x007d
            android.widget.TextView r7 = r6.f19636b
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f19636b
            java.lang.String r0 = "reference"
            goto L_0x005f
        L_0x007d:
            android.widget.TextView r7 = r6.f19636b
            r7.setVisibility(r1)
        L_0x0082:
            java.lang.String r7 = "location"
            int r7 = r8.getColumnIndex(r7)
            java.lang.String r7 = r8.getString(r7)
            if (r7 == 0) goto L_0x00a2
            java.lang.String r0 = ""
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0097
            goto L_0x00a2
        L_0x0097:
            android.widget.TextView r0 = r6.f19637c
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.f19637c
            r0.setText(r7)
            goto L_0x00a7
        L_0x00a2:
            android.widget.TextView r7 = r6.f19637c
            r7.setVisibility(r1)
        L_0x00a7:
            android.widget.TextView r7 = r6.f19638d
            r7.setVisibility(r1)
            android.widget.TextView r7 = r6.f19640f
            r7.setVisibility(r1)
            android.widget.TextView r7 = r6.f19639e
            r7.setVisibility(r1)
            java.lang.String r7 = "is_all_day"
            int r7 = r8.getColumnIndex(r7)
            int r7 = r8.getInt(r7)
            r0 = 1
            if (r7 != r0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            if (r0 == 0) goto L_0x00cd
        L_0x00c7:
            android.widget.TextView r6 = r6.f19639e
            r6.setVisibility(r2)
            goto L_0x011f
        L_0x00cd:
            java.util.Date r7 = new java.util.Date
            java.lang.String r0 = "start_date"
            int r0 = r8.getColumnIndex(r0)
            long r0 = r8.getLong(r0)
            r7.<init>(r0)
            java.util.Date r0 = new java.util.Date
            java.lang.String r1 = "end_date"
            int r1 = r8.getColumnIndex(r1)
            long r3 = r8.getLong(r1)
            r0.<init>(r3)
            java.util.Date r8 = r5.f19632m
            boolean r8 = com.seattleclouds.util.C6614j.m32001a(r7, r8)
            if (r8 == 0) goto L_0x0104
            android.widget.TextView r8 = r6.f19638d
            r8.setVisibility(r2)
            android.widget.TextView r6 = r6.f19638d
            java.text.DateFormat r8 = r5.f19630k
            java.lang.String r7 = r8.format(r7)
        L_0x0100:
            r6.setText(r7)
            goto L_0x011f
        L_0x0104:
            java.util.Date r7 = r5.f19632m
            boolean r7 = com.seattleclouds.util.C6614j.m32001a(r0, r7)
            if (r7 == 0) goto L_0x00c7
            android.widget.TextView r7 = r6.f19640f
            r7.setVisibility(r2)
            android.widget.TextView r7 = r6.f19638d
            r7.setVisibility(r2)
            android.widget.TextView r6 = r6.f19638d
            java.text.DateFormat r7 = r5.f19630k
            java.lang.String r7 = r7.format(r0)
            goto L_0x0100
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.calendar.C5519g.mo2865a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: a */
    public void mo17874a(Date date) {
        this.f19632m = date;
    }
}
