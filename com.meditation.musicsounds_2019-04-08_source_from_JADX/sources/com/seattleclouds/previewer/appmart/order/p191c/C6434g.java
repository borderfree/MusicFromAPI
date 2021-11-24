package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.appmart.order.p189a.C6385c;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.g */
public class C6434g extends C6557s {

    /* renamed from: a */
    private RecyclerView f22851a;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_summary, viewGroup, false);
        this.f22851a = (RecyclerView) inflate.findViewById(C5458g.recycler_view_summary);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            this.f22851a.setHasFixedSize(true);
            this.f22851a.setLayoutManager(new LinearLayoutManager(mo1318s()));
            this.f22851a.setAdapter(new C6385c());
        }
    }
}
