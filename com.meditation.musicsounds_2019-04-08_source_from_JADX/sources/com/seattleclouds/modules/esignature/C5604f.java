package com.seattleclouds.modules.esignature;

import android.app.Activity;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.modules.esignature.utility.C5613a;
import com.seattleclouds.modules.esignature.utility.Transaction;
import java.util.Locale;

/* renamed from: com.seattleclouds.modules.esignature.f */
public class C5604f extends C5602d {

    /* renamed from: f */
    private Transaction f19917f;

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19917f = (Transaction) m.getParcelable("transaction");
        }
        if (this.f19917f == null) {
            App.m25625a((Fragment) this);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (C5279b.m26372a()) {
            C5279b.m26365a((Activity) mo1318s(), true);
        }
        this.f19915d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C5279b.m26372a()) {
                    C5279b.m26374b((Activity) C5604f.this.mo1318s());
                } else {
                    C5279b.m26365a((Activity) C5604f.this.mo1318s(), true);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18105a(ViewGroup viewGroup, Bundle bundle) {
        ((TextView) viewGroup.findViewById(C5458g.transaction_subject_text_view)).setText(String.format(Locale.getDefault(), mo1219a(C5462k.esignature_transaction_message), new Object[]{this.f19917f.mo18112a()}));
        ((Button) viewGroup.findViewById(C5458g.go_to_documents_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (!C5279b.m26385c()) {
                    return;
                }
                if (C5604f.this.mo1307m() != null) {
                    C5613a.m27863a(C5604f.this.mo1307m(), (Activity) C5604f.this.mo1318s());
                } else {
                    App.m25625a((Fragment) C5604f.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_esignature_transaction;
    }
}
