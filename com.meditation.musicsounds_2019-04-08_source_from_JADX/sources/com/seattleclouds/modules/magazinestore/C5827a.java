package com.seattleclouds.modules.magazinestore;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.billing.C5319d;
import com.seattleclouds.util.C6576ae;
import com.seattleclouds.util.C6619m;
import java.text.DateFormat;

/* renamed from: com.seattleclouds.modules.magazinestore.a */
public class C5827a extends C6557s {

    /* renamed from: a */
    private View f20651a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MagazineInfo f20652b;

    /* renamed from: c */
    private DateFormat f20653c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6576ae f20654d;

    /* renamed from: e */
    private Button f20655e;

    /* renamed from: b */
    private void m28697b() {
        this.f20655e.setText(C5830b.m28702a((Context) mo1318s(), this.f20652b));
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20651a = layoutInflater.inflate(C5460i.fragment_magazine_details, viewGroup, false);
        final ImageView imageView = (ImageView) this.f20651a.findViewById(C5458g.cover);
        TextView textView = (TextView) this.f20651a.findViewById(C5458g.title);
        TextView textView2 = (TextView) this.f20651a.findViewById(C5458g.issue);
        TextView textView3 = (TextView) this.f20651a.findViewById(C5458g.description);
        this.f20655e = (Button) this.f20651a.findViewById(C5458g.btn_magazine_action);
        if (this.f20652b != null) {
            textView.setText(this.f20652b.f20643a);
            textView2.setText(this.f20653c.format(this.f20652b.f20646d));
            m28697b();
            textView3.setText(this.f20652b.f20645c);
            imageView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {

                /* renamed from: c */
                private int f20658c = 0;

                public void onGlobalLayout() {
                    if (this.f20658c != imageView.getWidth()) {
                        this.f20658c = imageView.getWidth();
                        int i = this.f20658c + (this.f20658c / 5);
                        double d = (double) i;
                        Double.isNaN(d);
                        C5827a.this.f20654d.mo8575a(i, (int) (d / 0.74d));
                        C5827a.this.f20654d.mo8578a((Object) C5827a.this.f20652b.f20644b, imageView);
                    }
                }
            });
            this.f20655e.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C5830b.m28704a(C5827a.this.f20652b, (Fragment) C5827a.this);
                }
            });
        }
        return this.f20651a;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20652b = (MagazineInfo) m.getParcelable("ARG_MAGAZINE_INFO");
        }
        if (this.f20652b == null) {
            Log.e("MagazineDetailsFragment", "MagazineInfo is null");
            return;
        }
        this.f20654d = new C6576ae(mo1318s(), C6619m.m32014a(mo1318s(), 280.0f));
        this.f20653c = android.text.format.DateFormat.getMediumDateFormat(mo1318s());
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            C5319d c = C5319d.m26613c();
            if (c != null && c.mo17460g(this.f20652b.f20648f)) {
                this.f20652b.f20649g = true;
                if (this.f20655e != null) {
                    m28697b();
                }
            }
        }
    }
}
