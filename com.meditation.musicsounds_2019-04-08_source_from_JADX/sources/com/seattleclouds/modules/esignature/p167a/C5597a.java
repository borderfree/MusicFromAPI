package com.seattleclouds.modules.esignature.p167a;

import android.app.Activity;
import android.support.p023v7.widget.CardView;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.esignature.utility.C5613a;
import com.seattleclouds.modules.esignature.utility.Transaction;
import java.util.List;

/* renamed from: com.seattleclouds.modules.esignature.a.a */
public class C5597a extends C0926a<C5599a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<Transaction> f19895a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f19896b;

    /* renamed from: com.seattleclouds.modules.esignature.a.a$a */
    public static class C5599a extends C0958w {
        /* access modifiers changed from: private */

        /* renamed from: n */
        public CardView f19899n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public TextView f19900o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public TextView f19901p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public TextView f19902q;

        public C5599a(View view) {
            super(view);
            this.f19899n = (CardView) view.findViewById(C5458g.card_view_transaction);
            this.f19900o = (TextView) view.findViewById(C5458g.transaction_nam_text_view);
            this.f19901p = (TextView) view.findViewById(C5458g.transaction_description_text_view);
            this.f19902q = (TextView) view.findViewById(C5458g.transaction_creation_date_text_view);
        }
    }

    public C5597a(List<Transaction> list, Activity activity) {
        this.f19895a = list;
        this.f19896b = activity;
    }

    /* renamed from: a */
    public int mo342a() {
        return this.f19895a.size();
    }

    /* renamed from: a */
    public C5599a mo353b(ViewGroup viewGroup, int i) {
        return new C5599a(LayoutInflater.from(viewGroup.getContext()).inflate(C5460i.fragment_esignature_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo350a(C5599a aVar, int i) {
        final int e = aVar.mo4585e();
        aVar.f19900o.setText(((Transaction) this.f19895a.get(i)).mo18112a());
        aVar.f19901p.setText(String.format(this.f19896b.getString(C5462k.esignature_documents), new Object[]{String.valueOf(((Transaction) this.f19895a.get(i)).mo18124e())}));
        aVar.f19902q.setText(C5613a.m27860a(((Transaction) this.f19895a.get(i)).mo18121d()));
        aVar.f19899n.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5613a.m27864a((Transaction) C5597a.this.f19895a.get(e), C5597a.this.f19896b);
            }
        });
    }
}
