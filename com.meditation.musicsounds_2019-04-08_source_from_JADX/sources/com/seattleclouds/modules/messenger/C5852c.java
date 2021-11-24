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
import java.util.List;

/* renamed from: com.seattleclouds.modules.messenger.c */
public class C5852c extends BaseAdapter {

    /* renamed from: a */
    private LayoutInflater f20734a;

    /* renamed from: b */
    private List<Conversation> f20735b;

    /* renamed from: c */
    private Bundle f20736c;

    /* renamed from: com.seattleclouds.modules.messenger.c$a */
    private static class C5854a {

        /* renamed from: a */
        public TextView f20737a;

        private C5854a() {
        }
    }

    public C5852c(Context context, List<Conversation> list, Bundle bundle) {
        this.f20734a = LayoutInflater.from(context);
        this.f20735b = list;
        this.f20736c = bundle;
    }

    public int getCount() {
        return this.f20735b.size();
    }

    public Object getItem(int i) {
        return this.f20735b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5854a aVar;
        if (view == null) {
            view = this.f20734a.inflate(C5460i.messenger_conversations_list_item, viewGroup, false);
            aVar = new C5854a();
            aVar.f20737a = (TextView) view.findViewById(C5458g.title);
            C6593am.m31915a(aVar.f20737a, this.f20736c);
            view.setTag(aVar);
        } else {
            aVar = (C5854a) view.getTag();
        }
        aVar.f20737a.setText(((Conversation) this.f20735b.get(i)).f20682b);
        return view;
    }
}
