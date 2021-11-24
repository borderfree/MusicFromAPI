package com.seattleclouds.modules.magazinestore;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.vending.billing.util.C1149b.C1160e;
import com.android.vending.billing.util.C1161c;
import com.android.vending.billing.util.C1162d;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5456e;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.billing.C5316c;
import com.seattleclouds.billing.C5319d;
import com.seattleclouds.util.C6576ae;
import com.seattleclouds.util.C6619m;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.seattleclouds.modules.magazinestore.b */
public class C5830b extends C6557s implements OnItemClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f20660a = C5830b.class.getCanonicalName();

    /* renamed from: ae */
    private C1160e f20661ae = new C1160e() {
        /* renamed from: a */
        public void mo5630a(C1161c cVar, C1162d dVar) {
            if (C5319d.m26613c() != null) {
                if (cVar.mo5634d()) {
                    String b = C5830b.f20660a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error querying inventory: ");
                    sb.append(cVar);
                    Log.e(b, sb.toString());
                    C5830b.this.f20669i = false;
                    return;
                }
                Iterator it = C5830b.this.f20662b.iterator();
                while (it.hasNext()) {
                    MagazineInfo magazineInfo = (MagazineInfo) it.next();
                    if (dVar.mo5641c(magazineInfo.f20648f)) {
                        magazineInfo.f20650h = dVar.mo5636a(magazineInfo.f20648f).mo5649c();
                    }
                    magazineInfo.f20649g = dVar.mo5640b(magazineInfo.f20648f) != null;
                }
                C5830b.this.f20669i = false;
                C5830b.m28712d("Finished querying inventory");
                C5830b.m28712d("Refreshing magazine adapter");
                C5830b.this.f20664d.notifyDataSetChanged();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ArrayList<MagazineInfo> f20662b = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public GridView f20663c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5835a f20664d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6576ae f20665e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f20666f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f20667g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f20668h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f20669i = false;

    /* renamed from: com.seattleclouds.modules.magazinestore.b$a */
    private class C5835a extends BaseAdapter {

        /* renamed from: b */
        private Context f20675b;

        /* renamed from: c */
        private DateFormat f20676c;

        /* renamed from: d */
        private LayoutInflater f20677d;

        /* renamed from: e */
        private LayoutParams f20678e;

        /* renamed from: f */
        private int f20679f = 0;

        C5835a(Context context) {
            this.f20675b = context;
            this.f20677d = LayoutInflater.from(this.f20675b);
            this.f20676c = android.text.format.DateFormat.getMediumDateFormat(context);
            this.f20678e = new LayoutParams(-1, C6619m.m32014a(context, 238.0f));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo18575a(int i) {
            if (i != this.f20679f) {
                this.f20679f = i;
                this.f20678e = new LayoutParams(-1, this.f20679f);
                int i2 = i + (i / 5);
                double d = (double) i2;
                Double.isNaN(d);
                C5830b.this.f20665e.mo8575a((int) (d * 0.74d), i2);
                notifyDataSetChanged();
            }
        }

        public int getCount() {
            return C5830b.this.f20662b.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? this.f20677d.inflate(C5460i.view_magazine_card, viewGroup, false) : view;
            ImageView imageView = (ImageView) inflate.findViewById(C5458g.cover_image);
            TextView textView = (TextView) inflate.findViewById(C5458g.title);
            TextView textView2 = (TextView) inflate.findViewById(C5458g.issue);
            Button button = (Button) inflate.findViewById(C5458g.btn_magazine_action);
            if (view == null) {
                imageView.setLayoutParams(this.f20678e);
                button.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        Integer num = (Integer) view.getTag();
                        if (num != null) {
                            C5830b.m28704a((MagazineInfo) C5830b.this.f20662b.get(num.intValue()), (Fragment) C5830b.this);
                        }
                    }
                });
            }
            if (imageView.getLayoutParams().height != this.f20679f) {
                imageView.setLayoutParams(this.f20678e);
            }
            MagazineInfo magazineInfo = (MagazineInfo) C5830b.this.f20662b.get(i);
            textView.setText(magazineInfo.f20643a);
            textView2.setText(this.f20676c.format(magazineInfo.f20646d));
            if (C5830b.this.mo1318s() != null) {
                button.setText(C5830b.m28702a((Context) C5830b.this.mo1318s(), magazineInfo));
            }
            button.setTag(Integer.valueOf(i));
            if (C5830b.this.f20668h != 0) {
                C5830b.this.f20665e.mo8578a((Object) magazineInfo.f20644b, imageView);
            }
            return inflate;
        }
    }

    /* renamed from: a */
    static String m28702a(Context context, MagazineInfo magazineInfo) {
        String string = context.getString(C5462k.magazine_store_buy);
        if (magazineInfo.f20649g) {
            return context.getString(C5462k.magazine_store_open);
        }
        if (magazineInfo.f20650h == null) {
            return string;
        }
        try {
            return context.getString(C5462k.magazine_store_buy_with_price, new Object[]{magazineInfo.f20650h});
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getString(C5462k.magazine_store_buy));
            sb.append(" ");
            sb.append(magazineInfo.f20650h);
            return sb.toString();
        }
    }

    /* renamed from: a */
    static void m28704a(MagazineInfo magazineInfo, Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_PRODUCT_ID", magazineInfo.f20648f);
        bundle.putString("ARG_REDIRECT_URL", magazineInfo.f20647e);
        bundle.putString("ARG_PRODUCT_TYPE", "nonConsumable");
        if (App.f18510l) {
            bundle.putBoolean("ARG_SIMULATION_MODE", true);
        }
        App.m25620a(new FragmentInfo(C5316c.class.getName(), bundle), fragment);
    }

    /* renamed from: c */
    private void m28709c() {
        if (!this.f20669i && this.f20662b.size() != 0) {
            C5319d c = C5319d.m26613c();
            if (c != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f20662b.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    MagazineInfo magazineInfo = (MagazineInfo) it.next();
                    if (!(magazineInfo.f20649g || magazineInfo.f20648f == null || magazineInfo.f20648f.length() == 0)) {
                        if (c.mo17460g(magazineInfo.f20648f)) {
                            magazineInfo.f20649g = true;
                            z = true;
                        } else if (magazineInfo.f20650h == null) {
                            arrayList.add(magazineInfo.f20648f);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    this.f20669i = true;
                    try {
                        c.mo5612a(true, (List<String>) arrayList, this.f20661ae);
                    } catch (IllegalStateException e) {
                        this.f20669i = false;
                        String str = f20660a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot start inventory query, illegal state: ");
                        sb.append(e);
                        Log.w(str, sb.toString());
                    }
                }
                if (!this.f20669i) {
                    if (z && this.f20664d != null) {
                        m28712d("Previously unowned product marked as owned, refreshing UI");
                        this.f20664d.notifyDataSetChanged();
                    }
                    m28712d("No unowned SKUs without known price in magazine info list. Nothing to query.");
                }
            } else {
                Log.w(f20660a, "SCIabHelper not initialized");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m28712d(String str) {
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f20665e != null) {
            this.f20665e.mo8585i();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_magazine_store, viewGroup, false);
        if (this.f20662b.size() == 0) {
            Log.e(f20660a, "No magazines");
            return inflate;
        }
        this.f20663c = (GridView) inflate.findViewById(C5458g.grid);
        this.f20663c.setAdapter(this.f20664d);
        this.f20663c.setOnItemClickListener(this);
        this.f20663c.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                C5830b.this.f20665e.mo8581b(i == 2);
            }
        });
        this.f20663c.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (C5830b.this.f20668h != C5830b.this.f20663c.getWidth()) {
                    C5830b.this.f20668h = C5830b.this.f20663c.getWidth();
                    int floor = (int) Math.floor((double) (C5830b.this.f20663c.getWidth() / (C5830b.this.f20666f + C5830b.this.f20667g)));
                    if (floor > 0) {
                        double width = (double) ((C5830b.this.f20663c.getWidth() / floor) - C5830b.this.f20667g);
                        Double.isNaN(width);
                        int i = (int) (width / 0.74d);
                        C5830b.this.f20663c.setNumColumns(floor);
                        C5830b.this.f20664d.mo18575a(i);
                    }
                }
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            ArrayList<MagazineInfo> parcelableArrayList = m.getParcelableArrayList("ARG_MAGAZINES_INFO");
            if (parcelableArrayList != null) {
                this.f20662b = parcelableArrayList;
            }
        }
        if (this.f20662b.size() == 0) {
            Log.e(f20660a, "No magazines");
            return;
        }
        m28709c();
        Collections.sort(this.f20662b, new Comparator<MagazineInfo>() {
            /* renamed from: a */
            public int compare(MagazineInfo magazineInfo, MagazineInfo magazineInfo2) {
                return magazineInfo2.f20646d.compareTo(magazineInfo.f20646d);
            }
        });
        Date date = new Date();
        Iterator it = this.f20662b.iterator();
        while (it.hasNext()) {
            MagazineInfo magazineInfo = (MagazineInfo) it.next();
            if (!magazineInfo.f20646d.after(date)) {
                break;
            }
            it.remove();
            StringBuilder sb = new StringBuilder();
            sb.append("Removed unreleased magazine: ");
            sb.append(magazineInfo);
            m28712d(sb.toString());
        }
        this.f20666f = mo1320t().getDimensionPixelSize(C5456e.magazine_cover_width);
        this.f20667g = mo1320t().getDimensionPixelSize(C5456e.magazine_card_spacing);
        double d = (double) this.f20666f;
        Double.isNaN(d);
        int i = (int) (d / 0.74d);
        this.f20664d = new C5835a(mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "magazineCovers");
        aVar.mo8566a(0.25f);
        this.f20665e = new C6576ae(mo1318s(), i);
        if (mo1318s() != null) {
            this.f20665e.mo8576a(mo1318s().mo1469g(), aVar);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m28709c();
            if (this.f20665e != null) {
                this.f20665e.mo8579a(false);
            }
            if (this.f20664d != null) {
                this.f20664d.notifyDataSetChanged();
            }
        } else if (this.f20665e != null) {
            this.f20665e.mo8581b(false);
            this.f20665e.mo8579a(true);
            this.f20665e.mo8584h();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_MAGAZINE_INFO", (Parcelable) this.f20662b.get(i));
        App.m25620a(new FragmentInfo(C5827a.class.getName(), bundle), (Fragment) this);
    }
}
