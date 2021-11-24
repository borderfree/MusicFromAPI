package com.seattleclouds.location;

import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n.C6349a;
import com.seattleclouds.C6561t;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.util.C6607c;
import com.seattleclouds.util.C6636r;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.location.e */
public class C5417e extends C6671x implements C6349a {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public boolean f19346ae = true;

    /* renamed from: af */
    private Button f19347af;

    /* renamed from: ag */
    private C6636r f19348ag;

    /* renamed from: ah */
    private View f19349ah;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<LocationModel> f19350i;

    /* renamed from: a */
    public static FragmentInfo m27098a(ArrayList<LocationModel> arrayList, boolean z) {
        Bundle bundle = new Bundle();
        C6607c.m31962a(bundle, arrayList);
        bundle.putBoolean("resultDistanceInMiles", z);
        return new FragmentInfo(C5417e.class.getName(), bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m27102e() {
        App.m25620a(C5399b.m27037a(this.f19350i, this.f19346ae), (Fragment) this);
    }

    /* renamed from: L */
    public void mo1202L() {
        C6561t.m31739b((Fragment) this, (C6349a) this);
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19349ah = layoutInflater.inflate(C5460i.locations_list, viewGroup, false);
        return this.f19349ah;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        C6561t.m31733a((Fragment) this, (C6349a) this);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19350i = C6607c.m31961a(m);
            this.f19346ae = m.getBoolean("resultDistanceInMiles", true);
        }
        if (this.f19350i == null) {
            this.f19350i = new ArrayList<>();
        }
        this.f19347af = (Button) this.f19349ah.findViewById(C5458g.show_on_map_button);
        this.f19347af.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5417e.this.m27102e();
            }
        });
        C2420a aVar = new C2420a(mo1318s(), "locationListImageCache");
        aVar.mo8566a(0.25f);
        this.f19348ag = new C6636r(mo1318s(), 100);
        this.f19348ag.mo8576a(mo1318s().mo1469g(), aVar);
        mo1691a((ListAdapter) new LocationsListAdapter(mo1318s(), this.f19350i, this.f19348ag, this.f19346ae));
        mo1450b().setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                App.m25620a(C5399b.m27037a((ArrayList<LocationModel>) new LocationsListFragment$2$1<LocationModel>(this, 1, i), C5417e.this.f19346ae), (Fragment) C5417e.this);
            }
        });
    }

    /* renamed from: w_ */
    public boolean mo17583w_() {
        C6607c.m31963b(mo1307m());
        return false;
    }
}
