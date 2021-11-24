package com.seattleclouds.modules.messenger;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6593am;
import java.text.DateFormat;
import java.util.List;

/* renamed from: com.seattleclouds.modules.messenger.e */
public class C5856e extends BaseAdapter {

    /* renamed from: a */
    private LayoutInflater f20743a;

    /* renamed from: b */
    private List<C5855d> f20744b;

    /* renamed from: c */
    private DateFormat f20745c;

    /* renamed from: d */
    private DateFormat f20746d;

    /* renamed from: e */
    private Bundle f20747e;

    /* renamed from: com.seattleclouds.modules.messenger.e$a */
    private static class C5858a {

        /* renamed from: a */
        public TextView f20748a;

        /* renamed from: b */
        public TextView f20749b;

        /* renamed from: c */
        public TextView f20750c;

        private C5858a() {
        }
    }

    public C5856e(Context context, List<C5855d> list, Bundle bundle) {
        this.f20743a = LayoutInflater.from(context);
        this.f20744b = list;
        this.f20745c = android.text.format.DateFormat.getDateFormat(context);
        this.f20746d = android.text.format.DateFormat.getTimeFormat(context);
        this.f20747e = bundle;
    }

    public int getCount() {
        return this.f20744b.size();
    }

    public Object getItem(int i) {
        return this.f20744b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5858a aVar;
        if (view == null) {
            view = this.f20743a.inflate(C5460i.messenger_messages_list_item, viewGroup, false);
            aVar = new C5858a();
            aVar.f20749b = (TextView) view.findViewById(C5458g.username);
            C6593am.m31915a(aVar.f20749b, this.f20747e);
            aVar.f20748a = (TextView) view.findViewById(C5458g.text);
            C6593am.m31915a(aVar.f20748a, this.f20747e);
            aVar.f20750c = (TextView) view.findViewById(C5458g.date);
            C6593am.m31915a(aVar.f20750c, this.f20747e);
            view.setTag(aVar);
        } else {
            aVar = (C5858a) view.getTag();
        }
        C5855d dVar = (C5855d) this.f20744b.get(i);
        aVar.f20749b.setText(dVar.f20741d);
        aVar.f20748a.setText(dVar.f20739b);
        if (dVar.f20742e == null) {
            aVar.f20750c.setText("at some time");
        } else {
            TextView textView = aVar.f20750c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20745c.format(dVar.f20742e));
            sb.append(", ");
            sb.append(this.f20746d.format(dVar.f20742e));
            textView.setText(sb.toString());
        }
        return view;
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
