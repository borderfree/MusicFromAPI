package com.seattleclouds.modules.esignature;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.modules.esignature.p167a.C5597a;
import com.seattleclouds.modules.esignature.utility.Transaction;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.widget.MultiSwipeRefreshLayout;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.esignature.g */
public class C5607g extends C5602d implements C5596a {

    /* renamed from: ae */
    private MultiSwipeRefreshLayout f19920ae;

    /* renamed from: af */
    private RecyclerView f19921af;

    /* renamed from: ag */
    private C5597a f19922ag;

    /* renamed from: ah */
    private ArrayList<Transaction> f19923ah = new ArrayList<>();

    /* renamed from: ai */
    private boolean f19924ai = false;

    /* renamed from: aj */
    private C5600b f19925aj;

    /* renamed from: f */
    protected View f19926f;

    /* renamed from: g */
    protected View f19927g;

    /* renamed from: h */
    protected int f19928h;

    /* renamed from: i */
    private TextView f19929i;

    /* renamed from: m */
    private void m27821m(boolean z) {
        int i = 8;
        this.f19921af.setVisibility(z ? 0 : 8);
        TextView textView = this.f19929i;
        if (!z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f19924ai = bundle.getBoolean("KEY_DATA_RECEIVED");
            this.f19923ah = bundle.getParcelableArrayList("KEY_TRANSACTION_LIST");
        }
        this.f19928h = mo1320t().getInteger(17694721);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f19915d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C5279b.m26372a()) {
                    C5279b.m26374b((Activity) C5607g.this.mo1318s());
                } else {
                    C5279b.m26364a((Activity) C5607g.this.mo1318s());
                }
            }
        });
        if (C5279b.m26372a()) {
            C5279b.m26364a((Activity) mo1318s());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18105a(ViewGroup viewGroup, Bundle bundle) {
        C5338d o = ((C6348n) mo1318s()).mo19778o();
        this.f19921af = (RecyclerView) viewGroup.findViewById(C5458g.recycler_view);
        this.f19929i = (TextView) viewGroup.findViewById(C5458g.empty_view);
        this.f19915d = (Button) viewGroup.findViewById(C5458g.show_sign_in_button);
        this.f19920ae = (MultiSwipeRefreshLayout) viewGroup.findViewById(C5458g.swipe_refresh);
        this.f19926f = viewGroup.findViewById(C5458g.content);
        this.f19927g = viewGroup.findViewById(C5458g.progress);
        this.f19921af.setHasFixedSize(true);
        this.f19921af.setLayoutManager(new LinearLayoutManager(mo1318s()));
        this.f19922ag = new C5597a(this.f19923ah, mo1318s());
        this.f19921af.setAdapter(this.f19922ag);
        this.f19929i.setVisibility(8);
        this.f19920ae.setColorSchemeColors(o.mo17546c(mo1318s()));
        this.f19920ae.setSwipeableChildren(C5458g.recycler_view, C5458g.empty_view);
        this.f19920ae.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C5607g.this.mo18109d();
            }
        });
        this.f19920ae.setEnabled(false);
    }

    /* renamed from: a */
    public void mo18095a(String str) {
        if (!this.f19924ai) {
            mo18108a(false, true);
            this.f19924ai = true;
        } else {
            this.f19920ae.setRefreshing(false);
        }
        m27821m(false);
        if (str != null) {
            C6620n.m32033a((Context) mo1318s(), str);
        }
        this.f19925aj = null;
    }

    /* renamed from: a */
    public void mo18096a(ArrayList<Transaction> arrayList) {
        if (!this.f19924ai) {
            mo18108a(false, true);
            this.f19924ai = true;
        } else {
            this.f19920ae.setRefreshing(false);
        }
        if (arrayList == null || arrayList.isEmpty()) {
            m27821m(false);
        } else {
            this.f19923ah.clear();
            this.f19923ah.addAll(arrayList);
            this.f19922ag.mo4336e();
            this.f19920ae.setEnabled(true);
            m27821m(true);
        }
        this.f19925aj = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18108a(boolean z, boolean z2) {
        View view = z ? this.f19927g : this.f19926f;
        View view2 = z ? this.f19926f : this.f19927g;
        if (z2) {
            C6600as.m31947a(view, view2, this.f19928h);
            return;
        }
        view.setVisibility(0);
        view2.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_esignature_list;
    }

    /* renamed from: b */
    public void mo18097b(String str) {
    }

    /* renamed from: c */
    public void mo1453c() {
        super.mo1453c();
        if (C5279b.m26385c()) {
            String e = C5279b.m26389e();
            if (!e.isEmpty() && !this.f19924ai && this.f19925aj == null) {
                mo18108a(true, false);
                this.f19925aj = new C5600b(this, e);
                this.f19925aj.mo8524c((Params[]) new String[0]);
            } else if (!this.f19923ah.isEmpty()) {
                m27821m(true);
                this.f19920ae.setEnabled(true);
            } else {
                m27821m(false);
            }
        } else {
            this.f19924ai = false;
            this.f19920ae.setEnabled(false);
        }
    }

    /* renamed from: d */
    public void mo18109d() {
        if (C5279b.m26385c()) {
            String e = C5279b.m26389e();
            if (!e.isEmpty()) {
                this.f19925aj = new C5600b(this, e);
                this.f19925aj.mo8524c((Params[]) new String[0]);
                return;
            }
            this.f19920ae.setRefreshing(false);
            return;
        }
        this.f19920ae.setRefreshing(false);
        this.f19920ae.setEnabled(false);
        mo1453c();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("KEY_DATA_RECEIVED", this.f19924ai);
        bundle.putParcelableArrayList("KEY_TRANSACTION_LIST", this.f19923ah);
        super.mo1282e(bundle);
    }
}
