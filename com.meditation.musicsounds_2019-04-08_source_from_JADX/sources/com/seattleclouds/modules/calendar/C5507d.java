package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6611g;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.calendar.d */
public class C5507d extends BaseAdapter {

    /* renamed from: a */
    private LayoutInflater f19598a;

    /* renamed from: b */
    private C5505b f19599b;

    /* renamed from: c */
    private ArrayList<String> f19600c;

    /* renamed from: d */
    private Map<String, Integer> f19601d;

    /* renamed from: e */
    private int f19602e;

    /* renamed from: com.seattleclouds.modules.calendar.d$a */
    private static class C5509a {

        /* renamed from: a */
        public TextView f19603a;

        /* renamed from: b */
        public View f19604b;

        private C5509a() {
        }
    }

    public C5507d(Context context, ArrayList<String> arrayList, Map<String, Integer> map, int i) {
        this.f19598a = LayoutInflater.from(context);
        this.f19599b = new C5505b(context);
        this.f19600c = arrayList;
        this.f19601d = map;
        this.f19602e = i;
    }

    public int getCount() {
        return this.f19600c.size();
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5509a aVar;
        if (view == null) {
            view = this.f19598a.inflate(C5460i.calendar_event_category_list_item, viewGroup, false);
            aVar = new C5509a();
            aVar.f19603a = (TextView) view.findViewById(C5458g.category_text);
            aVar.f19604b = view.findViewById(C5458g.categoryMarker);
            view.setTag(aVar);
        } else {
            aVar = (C5509a) view.getTag();
        }
        String str = (String) this.f19600c.get(i);
        aVar.f19603a.setText(str);
        Integer num = (Integer) this.f19601d.get(str);
        if (num == null) {
            num = Integer.valueOf(this.f19602e);
        }
        C6611g.m31978a(aVar.f19604b, this.f19599b.mo17840a(num.intValue()));
        return view;
    }
}
