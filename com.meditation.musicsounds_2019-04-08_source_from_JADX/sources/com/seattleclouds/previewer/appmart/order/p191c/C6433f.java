package com.seattleclouds.previewer.appmart.order.p191c;

import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.previewer.appmart.order.p189a.C6379b;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;

/* renamed from: com.seattleclouds.previewer.appmart.order.c.f */
public class C6433f extends C6557s {

    /* renamed from: a */
    private RecyclerView f22850a;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_new_order_payment, viewGroup, false);
        this.f22850a = (RecyclerView) inflate.findViewById(C5458g.recycler_view_payment);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        if (z) {
            this.f22850a.setHasFixedSize(true);
            this.f22850a.setLayoutManager(new LinearLayoutManager(mo1318s()));
            this.f22850a.setAdapter(new C6379b(mo1316q()));
        }
        super.mo17454a(z);
    }

    /* renamed from: b */
    public boolean mo1450b() {
        C6388a a = C6388a.m31014a();
        if (a.mo19857F() == null) {
            Toast.makeText(mo1318s(), C5462k.new_order_payment_select_price, 0).show();
            return true;
        }
        C0367h s = mo1318s();
        StringBuilder sb = new StringBuilder();
        sb.append(mo1219a(C5462k.new_order_payment_select));
        sb.append(" ");
        sb.append(a.mo19857F().toString());
        Toast.makeText(s, sb.toString(), 0).show();
        return false;
    }
}
