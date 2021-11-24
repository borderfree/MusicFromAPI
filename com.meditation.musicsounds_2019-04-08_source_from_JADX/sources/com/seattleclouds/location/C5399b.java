package com.seattleclouds.location;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.gms.maps.C4580c.C4582b;
import com.google.android.gms.maps.model.C4604c;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.util.C6636r;
import com.seattleclouds.util.C6636r.C6637a;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.location.b */
public class C5399b extends C5420f {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f19303c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4604c f19304d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6636r f19305e;

    /* renamed from: a */
    public static FragmentInfo m27037a(ArrayList<LocationModel> arrayList, boolean z) {
        FragmentInfo a = C5420f.m27113a(arrayList, null);
        a.mo16868a(C5399b.class.getName());
        a.mo16869b().putBoolean("resultDistanceInMiles", z);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1453c() {
        super.mo1453c();
        Bundle m = mo1307m();
        if (m != null) {
            this.f19303c = m.getBoolean("resultDistanceInMiles", true);
        }
        C2420a aVar = new C2420a(mo1318s(), "locationListImageCache");
        aVar.mo8566a(0.25f);
        this.f19305e = new C6636r(mo1318s(), 100);
        this.f19305e.mo8576a(mo1318s().mo1469g(), aVar);
        this.f19305e.mo20627a((C6637a) new C6637a() {
            /* renamed from: a */
            public void mo17709a(ImageView imageView) {
                C4604c cVar = (C4604c) imageView.getTag();
                if (cVar != null && C5399b.this.f19304d == cVar && cVar.mo15182d()) {
                    cVar.mo15181c();
                }
            }
        });
        this.f19353a.mo15101a((C4582b) new C4582b() {
            /* renamed from: a */
            public View mo15119a(C4604c cVar) {
                return null;
            }

            /* renamed from: b */
            public View mo15120b(C4604c cVar) {
                LocationModel locationModel = (LocationModel) C5399b.this.f19361b.get(cVar);
                View view = null;
                if (locationModel != null) {
                    C5399b.this.f19304d = cVar;
                    view = C5399b.this.mo1318s().getLayoutInflater().inflate(C5460i.location_info_window_with_image, null);
                    TextView textView = (TextView) view.findViewById(C5458g.text2);
                    TextView textView2 = (TextView) view.findViewById(C5458g.text3);
                    ImageView imageView = (ImageView) view.findViewById(C5458g.imageView);
                    ((TextView) view.findViewById(C5458g.text1)).setText(locationModel.f19980a);
                    String str = "%.1f %s";
                    Object[] objArr = new Object[2];
                    objArr[0] = Double.valueOf(locationModel.f19994o);
                    objArr[1] = C5399b.this.f19303c ? "mi" : "km";
                    textView.setText(String.format(str, objArr));
                    textView2.setText(locationModel.f19989j);
                    imageView.setTag(cVar);
                    if (locationModel.f19990k == null || locationModel.f19990k.length() <= 0) {
                        imageView.setImageResource(C5457f.no_image_available);
                    } else {
                        C5399b.this.f19305e.mo8578a((Object) locationModel.f19990k, imageView);
                    }
                }
                return view;
            }
        });
    }
}
