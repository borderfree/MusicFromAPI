package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.appmart.order.p189a.C6376a;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.c */
public class C6411c extends C6557s {
    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_features, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C5458g.recycler_view_features);
        recyclerView.setHasFixedSize(true);
        String[] strArr = {"call", "social", "cart", "qr", "analytics", "coupons", "directions", "inapp", "loyalty", "push", "sync", "wheel"};
        String[] strArr2 = {mo1219a(C5462k.new_order_features_call), mo1219a(C5462k.new_order_features_social), mo1219a(C5462k.new_order_features_cart), mo1219a(C5462k.new_order_features_qr), mo1219a(C5462k.new_order_features_analytics), mo1219a(C5462k.new_order_features_coupons), mo1219a(C5462k.new_order_features_directions), mo1219a(C5462k.new_order_features_inapp), mo1219a(C5462k.new_order_features_loyalty), mo1219a(C5462k.new_order_features_push), mo1219a(C5462k.new_order_features_sync), mo1219a(C5462k.new_order_features_wheel)};
        recyclerView.setLayoutManager(new LinearLayoutManager(mo1318s()));
        recyclerView.setAdapter(new C6376a(strArr2, strArr, mo1318s()));
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
    }
}
