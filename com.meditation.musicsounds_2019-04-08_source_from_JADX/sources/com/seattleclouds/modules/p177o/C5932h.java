package com.seattleclouds.modules.p177o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.p159d.C5328a;
import com.seattleclouds.p159d.C5329b;
import com.seattleclouds.util.C6576ae;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6644x;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.o.h */
public class C5932h extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5931g f20975a;

    /* renamed from: ae */
    private int f20976ae;

    /* renamed from: af */
    private C6576ae f20977af;

    /* renamed from: ag */
    private String f20978ag;

    /* renamed from: ah */
    private Bundle f20979ah;

    /* renamed from: ai */
    private int f20980ai = -1;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f20981aj = this.f20980ai;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public int f20982ak = this.f20980ai;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f20983b;

    /* renamed from: c */
    private ExpandableListView f20984c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C5942e f20985d;

    /* renamed from: e */
    private LayoutInflater f20986e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C5944i> f20987f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ArrayList<C5946k> f20988g;

    /* renamed from: h */
    private ArrayList<C5945j> f20989h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f20990i;

    /* renamed from: com.seattleclouds.modules.o.h$a */
    private static class C5938a {

        /* renamed from: a */
        final TextView f20996a;

        /* renamed from: b */
        final TextView f20997b;

        C5938a(TextView textView, TextView textView2) {
            this.f20996a = textView;
            this.f20997b = textView2;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.h$b */
    private static class C5939b {

        /* renamed from: a */
        final TextView f20998a;

        /* renamed from: b */
        final TextView f20999b;

        C5939b(TextView textView, TextView textView2) {
            this.f20998a = textView;
            this.f20999b = textView2;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.h$c */
    private static class C5940c {

        /* renamed from: a */
        final ImageView f21000a;

        C5940c(ImageView imageView) {
            this.f21000a = imageView;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.h$d */
    private static class C5941d {

        /* renamed from: a */
        final CheckedTextView f21001a;

        C5941d(CheckedTextView checkedTextView) {
            this.f21001a = checkedTextView;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.h$e */
    private class C5942e extends BaseExpandableListAdapter {
        private C5942e() {
        }

        public Object getChild(int i, int i2) {
            return i == 0 ? i2 == 0 ? C5932h.this.f20975a.mo18753b() : i2 == 1 ? C5932h.this.f20975a.mo18752a() : "something is wrong" : i == C5932h.this.f20981aj ? C5932h.this.f20975a.mo18754c().get(i2) : i >= C5932h.this.f20982ak ? ((C5944i) C5932h.this.f20987f.get(i - C5932h.this.f20982ak)).mo18784d().get(i2) : "undefined";
        }

        public long getChildId(int i, int i2) {
            return (long) i2;
        }

        public int getChildType(int i, int i2) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 1;
            }
            return i >= 2 ? 2 : 0;
        }

        public int getChildTypeCount() {
            return 3;
        }

        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            return i == 0 ? i2 == 0 ? C5932h.this.m29109a(view, (String) getChild(i, i2)) : C5932h.this.m29118b(view, (String) getChild(i, i2)) : i == C5932h.this.f20981aj ? C5932h.this.m29108a(view, (C5946k) getChild(i, i2)) : i >= C5932h.this.f20982ak ? C5932h.this.m29107a(view, (C5945j) getChild(i, i2)) : C5932h.this.m29107a(view, (C5945j) getChild(i, i2));
        }

        public int getChildrenCount(int i) {
            ArrayList d;
            if (i == 0) {
                return 2;
            }
            if (i == C5932h.this.f20981aj) {
                d = C5932h.this.f20975a.mo18754c();
            } else if (i < C5932h.this.f20982ak) {
                return 0;
            } else {
                d = ((C5944i) C5932h.this.f20987f.get(i - C5932h.this.f20982ak)).mo18784d();
            }
            return d.size();
        }

        public Object getGroup(int i) {
            return i == 0 ? "Details" : i == C5932h.this.f20981aj ? C5932h.this.f20988g : i >= C5932h.this.f20982ak ? C5932h.this.f20987f.get(i - C5932h.this.f20982ak) : "undefined";
        }

        public int getGroupCount() {
            return C5932h.this.f20990i;
        }

        public long getGroupId(int i) {
            return (long) i;
        }

        public int getGroupType(int i) {
            return 0;
        }

        public int getGroupTypeCount() {
            return 2;
        }

        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            if (i == 0) {
                return C5932h.this.m29110a(view, C5932h.this.f20975a.mo17509h(), C5932h.this.mo1219a(C5462k.product_order_product_details));
            } else if (i == C5932h.this.f20981aj) {
                String a = C5932h.this.mo1219a(C5462k.product_order_sizes);
                StringBuilder sb = new StringBuilder();
                sb.append(C5932h.this.mo1219a(C5462k.product_order_count));
                sb.append(C5932h.this.f20988g.size());
                return C5932h.this.m29110a(view, a, sb.toString());
            } else if (i < C5932h.this.f20982ak) {
                return C5932h.this.m29110a(view, "undefined", "undefined");
            } else {
                C5944i iVar = (C5944i) getGroup(i);
                return C5932h.this.m29110a(view, iVar.mo18778a(), String.format(C5932h.this.mo1318s().getString(C5462k.product_order_product_options_group_details), new Object[]{Integer.valueOf(iVar.mo18783c()), Integer.valueOf(iVar.mo18781b())}));
            }
        }

        public boolean hasStableIds() {
            return false;
        }

        public boolean isChildSelectable(int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.h$f */
    private static class C5943f {

        /* renamed from: a */
        final CheckedTextView f21003a;

        C5943f(CheckedTextView checkedTextView) {
            this.f21003a = checkedTextView;
        }
    }

    /* renamed from: a */
    private int m29106a(ArrayList<C5944i> arrayList, String str) {
        if (!(arrayList == null || arrayList.size() == 0)) {
            int i = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C5944i) it.next()).mo18778a().equalsIgnoreCase(str)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m29107a(View view, C5945j jVar) {
        C5941d dVar;
        if (view == 0 || !C5939b.class.isInstance(view)) {
            r6 = (CheckedTextView) this.f20986e.inflate(17367055, null);
            C6593am.m31915a((TextView) r6, this.f20979ah);
            dVar = new C5941d(r6);
            r6.setTag(dVar);
            r6 = r6;
        } else {
            dVar = (C5941d) view.getTag();
            r6 = view;
        }
        if (jVar.mo18789d() ^ dVar.f21001a.isChecked()) {
            dVar.f21001a.toggle();
        }
        CheckedTextView checkedTextView = dVar.f21001a;
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.mo17509h());
        sb.append(" (");
        sb.append(C6644x.m32095a(this.f20978ag, jVar.mo17511i()));
        sb.append(")");
        checkedTextView.setText(sb.toString());
        return r6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m29108a(View view, C5946k kVar) {
        C5943f fVar;
        if (view == 0) {
            r6 = (CheckedTextView) this.f20986e.inflate(17367055, null);
            fVar = new C5943f(r6);
            C6593am.m31915a((TextView) r6, this.f20979ah);
            r6.setTag(fVar);
            r6 = r6;
        } else {
            fVar = (C5943f) view.getTag();
            r6 = view;
        }
        if (kVar.mo18793c() ^ fVar.f21003a.isChecked()) {
            fVar.f21003a.toggle();
        }
        CheckedTextView checkedTextView = fVar.f21003a;
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.mo18790a());
        sb.append(" (");
        sb.append(C6644x.m32095a(this.f20978ag, kVar.mo18792b()));
        sb.append(")");
        checkedTextView.setText(sb.toString());
        return r6;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m29109a(View view, String str) {
        if (view == null || !(view.getTag() instanceof C5940c)) {
            view = this.f20986e.inflate(C5460i.product_order_list_item_detail_image, null);
            C5940c cVar = new C5940c((ImageView) view.findViewById(C5458g.product_order_detail_image));
            view.setTag(cVar);
            InputStream e = App.m25649e(str);
            if (!TextUtils.isEmpty(str) && e != null) {
                this.f20977af.mo8578a((Object) str, cVar.f21000a);
                try {
                    e.close();
                } catch (IOException unused) {
                }
            }
        } else {
            C5940c cVar2 = (C5940c) view.getTag();
        }
        return view;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m29110a(View view, String str, String str2) {
        C5939b bVar;
        if (view == 0 || !C5939b.class.isInstance(view)) {
            r4 = (ViewGroup) this.f20986e.inflate(17367047, null);
            TextView textView = (TextView) r4.findViewById(16908308);
            TextView textView2 = (TextView) r4.findViewById(16908309);
            C6593am.m31915a(textView, this.f20979ah);
            C6593am.m31915a(textView2, this.f20979ah);
            C5939b bVar2 = new C5939b(textView, textView2);
            r4.setTag(bVar2);
            bVar = bVar2;
            r4 = r4;
        } else {
            bVar = (C5939b) view.getTag();
            r4 = view;
        }
        bVar.f20998a.setText(str);
        bVar.f20999b.setText(str2);
        return r4;
    }

    /* renamed from: a */
    private ArrayList<C5944i> m29115a(C5931g gVar) {
        ArrayList d = gVar.mo18755d();
        ArrayList<C5944i> arrayList = new ArrayList<>();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            C5945j jVar = (C5945j) it.next();
            int a = m29106a(arrayList, jVar.mo18788c());
            if (a < 0) {
                C5944i iVar = new C5944i();
                iVar.mo18780a(jVar.mo18788c());
                iVar.mo18782b(jVar.mo18787b());
                iVar.mo18779a(jVar.mo18785a());
                iVar.mo18784d().add(jVar);
                arrayList.add(iVar);
            } else {
                ((C5944i) arrayList.get(a)).mo18784d().add(jVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29116a(C5931g gVar, ArrayList<C5944i> arrayList) {
        C5328a aVar = new C5328a();
        aVar.mo17488a(gVar.mo17509h());
        ArrayList c = gVar.mo18754c();
        if (c != null && c.size() != 0) {
            Iterator it = c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5946k kVar = (C5946k) it.next();
                if (kVar.mo18793c()) {
                    aVar.mo17486a(kVar.mo18792b());
                    aVar.mo17500f(kVar.mo18790a());
                    break;
                }
            }
        } else {
            aVar.mo17486a(gVar.mo17511i());
        }
        aVar.mo17491b(gVar.mo17509h());
        aVar.mo17497e(this.f20983b);
        aVar.mo17493c(gVar.mo18753b());
        aVar.mo17495d(gVar.mo18756e());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C5944i iVar = (C5944i) it2.next();
            Iterator it3 = iVar.mo18784d().iterator();
            int i = 0;
            while (it3.hasNext()) {
                C5945j jVar = (C5945j) it3.next();
                if (jVar.mo18789d()) {
                    aVar.mo17487a((C5329b) jVar);
                    i++;
                }
            }
            if (i > iVar.mo18783c() && iVar.mo18783c() != 0) {
                C6620n.m32031a((Context) mo1318s(), C5462k.info, String.format(mo1219a(C5462k.product_order_warning_message_too_many_options_in_group), new Object[]{iVar.mo18778a()}));
                return;
            } else if (i < iVar.mo18781b() && iVar.mo18781b() != 0) {
                C6620n.m32031a((Context) mo1318s(), C5462k.info, String.format(mo1219a(C5462k.product_order_warning_message_too_few_options_in_group), new Object[]{iVar.mo18778a()}));
                return;
            }
        }
        int b = App.f18489V.mo17517b(aVar, (Context) mo1318s());
        String string = mo1318s().getString(C5462k.shoppingcart_failed_added);
        switch (b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.mo17485a());
                sb.append(" ");
                sb.append(mo1318s().getString(C5462k.shoppingcart_succ_added));
                string = sb.toString();
                break;
            case 1:
                string = mo1318s().getString(C5462k.shoppingcart_failed_added);
                break;
        }
        String str = string;
        C6620n.m32037a((Context) mo1318s(), mo1318s().getString(C5462k.info), str, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }, mo1318s().getString(C5462k.f19438OK), (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5919c.m29042a((Context) C5932h.this.mo1318s()).mo18724a((Activity) C5932h.this.mo1318s(), (Fragment) C5932h.this, C5932h.this.f20983b);
            }
        }, mo1318s().getString(C5462k.product_order_dialog_message_show_order_page));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public View m29118b(View view, String str) {
        C5938a aVar;
        if (view == null) {
            view = this.f20986e.inflate(17367044, null);
            TextView textView = (TextView) view.findViewById(16908308);
            TextView textView2 = (TextView) view.findViewById(16908309);
            C6593am.m31915a(textView, this.f20979ah);
            C6593am.m31915a(textView2, this.f20979ah);
            aVar = new C5938a(textView, textView2);
            view.setTag(aVar);
        } else {
            aVar = (C5938a) view.getTag();
        }
        aVar.f20996a.setText(mo1318s().getString(C5462k.product_order_description_field_title));
        aVar.f20997b.setMovementMethod(new ScrollingMovementMethod());
        aVar.f20997b.setLines(5);
        aVar.f20997b.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        aVar.f20997b.setText(str);
        return view;
    }

    /* renamed from: b */
    private void m29120b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        new LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        Button button = new Button(context);
        button.setText(C5462k.product_order_add_to_order_button_title);
        button.setLayoutParams(layoutParams);
        button.setGravity(17);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C5932h.this.m29116a(C5932h.this.f20975a, C5932h.this.f20987f);
            }
        });
        C6593am.m31915a((TextView) button, this.f20979ah);
        linearLayout.addView(button);
        this.f20984c.addFooterView(linearLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m29124d() {
        ArrayList c = this.f20975a.mo18754c();
        if (c != null) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                ((C5946k) it.next()).mo18791a(false);
            }
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f20977af != null) {
            this.f20977af.mo8585i();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f20986e = layoutInflater;
        this.f20984c = (ExpandableListView) this.f20986e.inflate(17367041, viewGroup, false);
        String str = null;
        this.f20985d = new C5942e();
        Bundle m = mo1307m();
        int i2 = -1;
        if (m != null) {
            str = m.getString("PAGE_ID_KEY");
            i2 = m.getInt("CATEGORY_INDEX_KEY");
            i = m.getInt("PRODUCT_INDEX_KEY");
            this.f20983b = m.getString("ADDRESS_KEY");
            this.f20979ah = m.getBundle("PAGE_STYLE");
            C6593am.m31914a((View) this.f20984c, this.f20979ah);
        } else {
            i = -1;
        }
        m29120b((Context) mo1318s());
        mo1450b();
        this.f20975a = C5919c.m29042a((Context) mo1318s()).mo18721a(str, i2, i);
        this.f20988g = this.f20975a.mo18754c();
        if (this.f20988g.size() > 0) {
            this.f20981aj = 1;
        }
        this.f20987f = m29115a(this.f20975a);
        this.f20989h = this.f20975a.mo18755d();
        if (this.f20988g.size() > 0) {
            this.f20982ak = 1;
        }
        mo1453c();
        this.f20984c.setAdapter(this.f20985d);
        this.f20984c.setOnChildClickListener(new OnChildClickListener() {
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
                if (i == C5932h.this.f20981aj) {
                    C5932h.this.m29124d();
                    ((C5946k) C5932h.this.f20988g.get(i2)).mo18791a(true);
                } else if (i >= C5932h.this.f20982ak && view.getTag().getClass() == C5941d.class) {
                    C5941d dVar = (C5941d) view.getTag();
                    ((C5945j) C5932h.this.f20985d.getChild(i, i2)).mo18786a(!dVar.f21001a.isChecked());
                    dVar.f21001a.toggle();
                }
                C5932h.this.f20985d.notifyDataSetChanged();
                return false;
            }
        });
        if (this.f20985d.getGroupCount() > 0) {
            this.f20984c.expandGroup(0);
        }
        return this.f20984c;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1283e(true);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.product_order_cart_menu, menu);
        menu.findItem(C5458g.search_product).setVisible(false);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.product_order_cart_menu) {
            return super.mo1245a(menuItem);
        }
        C5919c.m29042a((Context) mo1318s()).mo18724a((Activity) mo1318s(), (Fragment) this, this.f20983b);
        return true;
    }

    /* renamed from: b */
    public void mo1450b() {
        C5230aa r = App.m25674r();
        String g = r == null ? "USD" : r.mo17060aF().mo18812g();
        if (g == null || g.length() == 0) {
            g = "USD";
        }
        this.f20978ag = g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1453c() {
        int i;
        if (this.f20987f.size() > 0) {
            if (this.f20981aj != this.f20980ai) {
                this.f20982ak = 2;
            } else {
                this.f20982ak = 1;
            }
        }
        this.f20976ae = this.f20987f.size();
        if (this.f20981aj == this.f20980ai && this.f20982ak == this.f20980ai) {
            this.f20990i = 1;
        } else if (this.f20981aj == this.f20980ai || this.f20982ak != this.f20980ai) {
            if (this.f20981aj == this.f20980ai && this.f20982ak != this.f20980ai) {
                i = this.f20976ae + 1;
            } else if (this.f20981aj != this.f20980ai && this.f20982ak != this.f20980ai) {
                i = this.f20976ae + 2;
            } else {
                return;
            }
            this.f20990i = i;
        } else {
            this.f20990i = 2;
        }
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        this.f20977af = new C6576ae(mo1318s(), C6619m.m32014a(mo1318s(), 240.0f));
        super.mo1278d(bundle);
    }
}
