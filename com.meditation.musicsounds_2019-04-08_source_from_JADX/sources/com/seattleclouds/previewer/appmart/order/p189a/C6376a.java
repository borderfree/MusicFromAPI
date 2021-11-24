package com.seattleclouds.previewer.appmart.order.p189a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p023v7.widget.CardView;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5455d;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.previewer.appmart.order.C6387b;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;

/* renamed from: com.seattleclouds.previewer.appmart.order.a.a */
public class C6376a extends C0926a<C6378a> {

    /* renamed from: a */
    public static String[] f22621a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String[] f22622b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static SparseBooleanArray f22623c = new SparseBooleanArray();

    /* renamed from: d */
    private Context f22624d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f22625e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f22626f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6388a f22627g = C6388a.m31014a();

    /* renamed from: h */
    private Integer[] f22628h = {Integer.valueOf(C5457f.ic_call_new_order_features_mod), Integer.valueOf(C5457f.ic_social_new_order_features), Integer.valueOf(C5457f.ic_shopping_cart_new_order_features), Integer.valueOf(C5457f.ic_qr_code_new_order_features), Integer.valueOf(C5457f.ic_app_analyctis_new_order_features_mod), Integer.valueOf(C5457f.ic_coupon_new_order_features), Integer.valueOf(C5457f.ic_gps_new_order_features), Integer.valueOf(C5457f.ic_in_app_new_order_features), Integer.valueOf(C5457f.ic_credit_card_new_order), Integer.valueOf(C5457f.ic_notifications_new_order_features), Integer.valueOf(C5457f.ic_sync_new_order_features), Integer.valueOf(C5457f.ic_wheel_new_design_features)};

    /* renamed from: i */
    private Drawable f22629i;

    /* renamed from: com.seattleclouds.previewer.appmart.order.a.a$a */
    public static class C6378a extends C0958w {

        /* renamed from: n */
        public TextView f22633n;

        /* renamed from: o */
        public ImageView f22634o;

        /* renamed from: p */
        public CardView f22635p;

        /* renamed from: q */
        public ImageView f22636q;

        public C6378a(View view) {
            super(view);
            this.f22633n = (TextView) view.findViewById(C5458g.name_features);
            this.f22634o = (ImageView) view.findViewById(C5458g.image_features);
            this.f22635p = (CardView) view.findViewById(C5458g.card_view_features);
            this.f22636q = (ImageView) view.findViewById(C5458g.image_select);
        }
    }

    public C6376a(String[] strArr, String[] strArr2, Context context) {
        f22621a = strArr;
        f22622b = strArr2;
        this.f22624d = context;
        this.f22629i = C6387b.m31011a(this.f22624d, C5457f.ic_done_new_order_features);
        this.f22626f = C6387b.m31013b(this.f22624d, C5455d.ic_color);
        this.f22625e = C6387b.m31013b(this.f22624d, C5455d.colorWhite);
        if (!this.f22627g.mo19883X()) {
            f22623c.clear();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30975b(C6378a aVar, int i) {
        if (VERSION.SDK_INT >= 21) {
            C0311a.m1173a(aVar.f22634o.getDrawable(), i);
            return;
        }
        Drawable g = C0311a.m1186g(aVar.f22634o.getBackground());
        C0311a.m1175a(g, ColorStateList.valueOf(i));
        if (VERSION.SDK_INT >= 16) {
            aVar.f22634o.setBackground(g);
        } else {
            aVar.f22634o.setBackgroundDrawable(g);
        }
    }

    /* renamed from: c */
    private void m30977c(C6378a aVar, int i) {
        if (VERSION.SDK_INT >= 21) {
            aVar.f22634o.setImageDrawable(C6387b.m31011a(this.f22624d, this.f22628h[i].intValue()));
        } else if (VERSION.SDK_INT >= 16) {
            aVar.f22634o.setBackground(C6387b.m31011a(this.f22624d, this.f22628h[i].intValue()));
        } else {
            aVar.f22634o.setBackgroundDrawable(C6387b.m31011a(this.f22624d, this.f22628h[i].intValue()));
        }
    }

    /* renamed from: a */
    public int mo342a() {
        return f22621a.length;
    }

    /* renamed from: a */
    public C6378a mo353b(ViewGroup viewGroup, int i) {
        return new C6378a(LayoutInflater.from(viewGroup.getContext()).inflate(C5460i.fragment_new_order_features_list_items, viewGroup, false));
    }

    /* renamed from: a */
    public void mo350a(final C6378a aVar, int i) {
        final int e = aVar.mo4585e();
        aVar.f22633n.setText(f22621a[e]);
        m30977c(aVar, i);
        aVar.f22635p.setSelected(f22623c.get(e, false));
        aVar.f22636q.setVisibility(f22623c.get(e, false) ? 0 : 8);
        m30975b(aVar, f22623c.get(e, false) ? this.f22625e : this.f22626f);
        aVar.f22635p.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C6376a.f22623c.get(e, false)) {
                    aVar.f22636q.setVisibility(8);
                    aVar.f22635p.setSelected(false);
                    C6376a.this.m30975b(aVar, C6376a.this.f22626f);
                    C6376a.f22623c.delete(e);
                    C6376a.this.f22627g.mo19934v(C6376a.f22622b[e]);
                    return;
                }
                C6376a.f22623c.put(e, true);
                aVar.f22635p.setSelected(true);
                aVar.f22636q.setVisibility(0);
                C6376a.this.m30975b(aVar, C6376a.this.f22625e);
                C6376a.this.f22627g.mo19892b(true);
                C6376a.this.f22627g.mo19932u(C6376a.f22622b[e]);
            }
        });
    }
}
