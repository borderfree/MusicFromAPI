package com.seattleclouds.previewer.appmart.order.p189a;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p023v7.widget.AppCompatSeekBar;
import android.support.p023v7.widget.CardView;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5455d;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.previewer.appmart.order.C6387b;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;
import com.seattleclouds.previewer.appmart.order.p190b.C6389b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.seattleclouds.previewer.appmart.order.a.b */
public class C6379b extends C0926a<C6384a> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f22637i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static boolean f22638j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static SparseBooleanArray f22639k = new SparseBooleanArray();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<C6389b> f22640a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C6389b> f22641b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C6389b> f22642c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6388a f22643d = C6388a.m31014a();

    /* renamed from: e */
    private Context f22644e;

    /* renamed from: f */
    private int f22645f;

    /* renamed from: g */
    private int f22646g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f22647h;

    /* renamed from: com.seattleclouds.previewer.appmart.order.a.b$a */
    public class C6384a extends C0958w {

        /* renamed from: n */
        public TextView f22656n;

        /* renamed from: o */
        public TextView f22657o;

        /* renamed from: p */
        public TextView f22658p;

        /* renamed from: q */
        public LinearLayout f22659q;

        /* renamed from: r */
        public CardView f22660r;

        /* renamed from: s */
        public TextView f22661s;

        /* renamed from: t */
        public TextView f22662t;

        /* renamed from: u */
        public AppCompatSeekBar f22663u;

        /* renamed from: v */
        public RelativeLayout f22664v;

        public C6384a(View view) {
            super(view);
            this.f22656n = (TextView) view.findViewById(C5458g.price_level_card_view_fragment_payment);
            this.f22657o = (TextView) view.findViewById(C5458g.price_card_view_fragment_payment);
            this.f22659q = (LinearLayout) view.findViewById(C5458g.show_hide_info_price_level_fragment_payment);
            this.f22658p = (TextView) view.findViewById(C5458g.plans_and_price_info);
            this.f22660r = (CardView) view.findViewById(C5458g.card_view_price_fragment_payment);
            this.f22661s = (TextView) view.findViewById(C5458g.monthly_text_view);
            this.f22662t = (TextView) view.findViewById(C5458g.yearly_text_view);
            this.f22663u = (AppCompatSeekBar) view.findViewById(C5458g.switch_monthly_yearly);
            this.f22664v = (RelativeLayout) view.findViewById(C5458g.switch_monthly_yearly_layout);
        }
    }

    public C6379b(Context context) {
        this.f22644e = context;
        ArrayList<C6389b> z = this.f22643d.mo19941z();
        this.f22642c = new ArrayList();
        this.f22641b = new ArrayList();
        for (C6389b bVar : z) {
            (bVar.mo19943a().contains("Annual") ? this.f22642c : this.f22641b).add(bVar);
        }
        if (this.f22643d.mo19884Y()) {
            f22638j = true;
        }
        this.f22640a = f22638j ? this.f22641b : this.f22642c;
        f22637i = this.f22643d.mo19882W();
        if (!this.f22643d.mo19880U()) {
            f22639k.clear();
        }
        this.f22646g = C6387b.m31013b(this.f22644e, C5455d.colorTextBlack);
        this.f22645f = C6387b.m31013b(this.f22644e, C5455d.colorWhite);
        this.f22647h = C6387b.m31013b(this.f22644e, C5455d.ic_color);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30986a(TextView textView, AppCompatSeekBar appCompatSeekBar, int i) {
        if (VERSION.SDK_INT < 23) {
            textView.setTextColor(this.f22646g);
        } else {
            textView.setTextAppearance(16974344);
        }
        appCompatSeekBar.setProgress(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m30997f() {
        this.f22643d.mo19887a((C6389b) null);
        f22637i = -1;
    }

    /* renamed from: a */
    public int mo342a() {
        return this.f22640a.size();
    }

    /* renamed from: a */
    public C6384a mo353b(ViewGroup viewGroup, int i) {
        return new C6384a(LayoutInflater.from(viewGroup.getContext()).inflate(C5460i.fragment_new_order_payment_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo4333c(C6384a aVar) {
        super.mo4333c(aVar);
    }

    /* renamed from: a */
    public void mo350a(final C6384a aVar, int i) {
        TextView textView;
        final int e = aVar.mo4585e();
        aVar.f22663u.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        boolean z = false;
        if (e > 0) {
            aVar.f22664v.setVisibility(8);
        } else {
            aVar.f22664v.setVisibility(0);
        }
        if (f22638j) {
            this.f22640a = this.f22641b;
            m30986a(aVar.f22661s, aVar.f22663u, 0);
            textView = aVar.f22662t;
        } else {
            this.f22640a = this.f22642c;
            m30986a(aVar.f22662t, aVar.f22663u, 10);
            textView = aVar.f22661s;
        }
        textView.setTextColor(this.f22647h);
        aVar.f22661s.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6379b.f22638j = true;
                C6379b.this.f22640a = C6379b.this.f22641b;
                C6379b.this.m30986a(aVar.f22661s, aVar.f22663u, 0);
                C6379b.f22639k.clear();
                aVar.f22662t.setTextColor(C6379b.this.f22647h);
                C6379b.this.m30997f();
                C6379b.this.mo4336e();
            }
        });
        aVar.f22662t.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6379b.f22638j = false;
                C6379b.this.f22643d.mo19895c(false);
                C6379b.this.f22640a = C6379b.this.f22642c;
                C6379b.this.m30986a(aVar.f22662t, aVar.f22663u, 10);
                aVar.f22661s.setTextColor(C6379b.this.f22647h);
                C6379b.f22639k.clear();
                C6379b.this.m30997f();
                C6379b.this.mo4336e();
            }
        });
        if (((C6389b) this.f22640a.get(e)).mo19950d() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22644e.getResources().getString(C5462k.new_order_payment_plans_prices));
            sb.append("\n");
            sb.append(((C6389b) this.f22640a.get(e)).mo19950d());
            aVar.f22658p.setText(sb.toString());
        } else {
            aVar.f22658p.setText("");
        }
        aVar.f22656n.setText(((C6389b) this.f22640a.get(e)).mo19943a());
        aVar.f22657o.setText(((C6389b) this.f22640a.get(e)).mo19948c());
        if (f22637i == e && this.f22643d.mo19857F() != null) {
            z = true;
        }
        aVar.f22660r.setSelected(Boolean.valueOf(z).booleanValue());
        aVar.f22660r.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C6379b.f22637i >= 0 && C6379b.f22637i != e) {
                    C6379b.this.mo4332c(C6379b.f22637i);
                }
                if (C6379b.f22637i == e) {
                    aVar.f22660r.setSelected(false);
                    C6379b.this.m30997f();
                    return;
                }
                aVar.f22660r.setSelected(true);
                C6379b.this.f22643d.mo19887a((C6389b) C6379b.this.f22640a.get(e));
                C6379b.this.f22643d.mo19886a(e);
                C6379b.f22637i = e;
            }
        });
    }
}
