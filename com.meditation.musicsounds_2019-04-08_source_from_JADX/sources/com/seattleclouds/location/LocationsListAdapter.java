package com.seattleclouds.location;

import android.content.Context;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.feedback.LocationModel;
import com.seattleclouds.util.C6636r;
import java.util.ArrayList;
import java.util.List;

public class LocationsListAdapter extends BaseAdapter {

    /* renamed from: a */
    private LayoutInflater f19267a;

    /* renamed from: b */
    private List<LocationModel> f19268b;

    /* renamed from: c */
    private C6636r f19269c;

    /* renamed from: d */
    private boolean f19270d = true;

    /* renamed from: e */
    private Context f19271e = null;

    /* renamed from: f */
    private String f19272f = getClass().toString();

    private enum AddressComponent {
        Country,
        State,
        City,
        Address,
        PostalCode
    }

    /* renamed from: com.seattleclouds.location.LocationsListAdapter$a */
    private class C5393a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f19275b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f19276c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f19277d;

        private C5393a(String str, String str2, String str3) {
            this.f19275b = str;
            this.f19276c = str2;
            this.f19277d = str3;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("mKey:");
            sb.append(this.f19275b);
            sb.append(", mTranslation:");
            sb.append(this.f19276c);
            sb.append(", mValue:");
            sb.append(this.f19277d);
            return sb.toString();
        }
    }

    /* renamed from: com.seattleclouds.location.LocationsListAdapter$b */
    private static class C5394b {

        /* renamed from: a */
        public TextView f19278a;

        /* renamed from: b */
        public TextView f19279b;

        /* renamed from: c */
        public TextView f19280c;

        /* renamed from: d */
        public TextView f19281d;

        /* renamed from: e */
        public ImageView f19282e;

        /* renamed from: f */
        public LinearLayout f19283f;

        /* renamed from: g */
        public LinearLayout f19284g;

        /* renamed from: h */
        public LinearLayout f19285h;

        /* renamed from: i */
        public LinearLayout f19286i;

        private C5394b() {
            this.f19278a = null;
            this.f19279b = null;
            this.f19280c = null;
            this.f19281d = null;
            this.f19282e = null;
            this.f19283f = null;
            this.f19284g = null;
            this.f19285h = null;
            this.f19286i = null;
        }
    }

    public LocationsListAdapter(Context context, List<LocationModel> list, C6636r rVar, boolean z) {
        this.f19271e = context;
        this.f19267a = LayoutInflater.from(context);
        this.f19268b = list;
        this.f19269c = rVar;
        this.f19270d = z;
    }

    /* renamed from: a */
    private boolean m27020a(LinearLayout linearLayout, int i) {
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            TextView textView = (TextView) linearLayout.getChildAt(i2);
            if (textView != null && textView.getId() == i) {
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return this.f19268b.size();
    }

    public Object getItem(int i) {
        return this.f19268b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5394b bVar;
        LinearLayout linearLayout;
        LocationModel locationModel = (LocationModel) getItem(i);
        if (view == null) {
            view = this.f19267a.inflate(C5460i.location_list_item, viewGroup, false);
            bVar = new C5394b();
            bVar.f19278a = (TextView) view.findViewById(C5458g.text1);
            bVar.f19280c = (TextView) view.findViewById(C5458g.text2);
            bVar.f19281d = (TextView) view.findViewById(C5458g.text3);
            bVar.f19279b = (TextView) view.findViewById(C5458g.text4);
            bVar.f19282e = (ImageView) view.findViewById(C5458g.imageView);
            bVar.f19283f = (LinearLayout) view.findViewById(C5458g.llAddressContent);
            bVar.f19284g = (LinearLayout) view.findViewById(C5458g.addressLeft);
            bVar.f19285h = (LinearLayout) view.findViewById(C5458g.addressRight);
            bVar.f19286i = (LinearLayout) view.findViewById(C5458g.addressBottom);
            view.setTag(bVar);
        } else {
            bVar = (C5394b) view.getTag();
        }
        bVar.f19278a.setText(locationModel.f19980a);
        TextView textView = bVar.f19280c;
        String str = "%.1f %s";
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(locationModel.f19994o);
        objArr[1] = this.f19270d ? "mi" : "km";
        textView.setText(String.format(str, objArr));
        bVar.f19279b.setText(locationModel.f19991l);
        bVar.f19281d.setText(locationModel.f19989j);
        if (locationModel.f19990k == null || locationModel.f19990k.length() <= 0) {
            bVar.f19282e.setImageResource(C5457f.no_image_available);
        } else {
            this.f19269c.mo8578a((Object) locationModel.f19990k, bVar.f19282e);
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(locationModel.f19983d)) {
            C5393a aVar = new C5393a(AddressComponent.Country.toString(), this.f19271e.getString(C5462k.location_finder_address_country), locationModel.f19983d);
            arrayList.add(aVar);
        }
        if (!TextUtils.isEmpty(locationModel.f19984e)) {
            C5393a aVar2 = new C5393a(AddressComponent.State.toString(), this.f19271e.getString(C5462k.location_finder_address_state), locationModel.f19984e);
            arrayList.add(aVar2);
        }
        if (!TextUtils.isEmpty(locationModel.f19985f)) {
            C5393a aVar3 = new C5393a(AddressComponent.City.toString(), this.f19271e.getString(C5462k.location_finder_address_city), locationModel.f19985f);
            arrayList.add(aVar3);
        }
        if (!TextUtils.isEmpty(locationModel.f19987h)) {
            C5393a aVar4 = new C5393a(AddressComponent.PostalCode.toString(), this.f19271e.getString(C5462k.location_finder_address_postal_code), locationModel.f19987h);
            arrayList.add(aVar4);
        }
        if (!TextUtils.isEmpty(locationModel.f19986g)) {
            C5393a aVar5 = new C5393a(AddressComponent.Address.toString(), this.f19271e.getString(C5462k.location_finder_address_address), locationModel.f19986g);
            arrayList.add(aVar5);
        }
        if (bVar.f19284g.getChildCount() > 0) {
            bVar.f19284g.removeAllViews();
        }
        if (bVar.f19285h.getChildCount() > 0) {
            bVar.f19285h.removeAllViews();
        }
        if (bVar.f19286i.getChildCount() > 0) {
            bVar.f19286i.removeAllViews();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C5393a aVar6 = (C5393a) arrayList.get(i2);
            LayoutParams layoutParams = new LayoutParams(-1, -2, 5.0f);
            TextView textView2 = new TextView(this.f19271e);
            textView2.setText(String.format(aVar6.f19276c, new Object[]{aVar6.f19277d}));
            StringBuilder sb = new StringBuilder();
            sb.append(aVar6.f19275b.toString());
            sb.append("_");
            sb.append(locationModel.f19980a);
            int hashCode = sb.toString().hashCode();
            textView2.setId(hashCode);
            textView2.setMaxLines(3);
            textView2.setMinLines(1);
            textView2.setEllipsize(TruncateAt.END);
            textView2.setTextSize(16.0f);
            if (!aVar6.f19275b.toString().equals(AddressComponent.Address.toString())) {
                textView2.setPadding(10, 10, 10, 10);
                textView2.setLayoutParams(layoutParams);
                if (i2 % 2 == 0) {
                    if (!m27020a(bVar.f19284g, hashCode)) {
                        linearLayout = bVar.f19284g;
                    }
                } else if (!m27020a(bVar.f19285h, hashCode)) {
                    linearLayout = bVar.f19285h;
                }
            } else {
                textView2.setPadding(10, 0, 0, 0);
                if (!m27020a(bVar.f19286i, hashCode)) {
                    linearLayout = bVar.f19286i;
                }
            }
            linearLayout.addView(textView2);
        }
        return view;
    }
}
