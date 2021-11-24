package com.seattleclouds.modules.p177o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.seattleclouds.modules.o.l */
public class C5947l extends C6671x {

    /* renamed from: ae */
    private String f21015ae = null;

    /* renamed from: af */
    private int f21016af = -1;

    /* renamed from: ag */
    private String f21017ag = "";
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public Bundle f21018ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public SearchView f21019ai;

    /* renamed from: aj */
    private String f21020aj = "";
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public List<C5952b> f21021ak = new ArrayList();

    /* renamed from: al */
    private boolean f21022al = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<Map<String, String>> f21023i = new ArrayList();

    /* renamed from: com.seattleclouds.modules.o.l$a */
    private class C5951a implements ViewBinder {
        private C5951a() {
        }

        public boolean setViewValue(View view, Object obj, String str) {
            TextView textView = (TextView) view;
            textView.setText(str);
            C6593am.m31915a(textView, C5947l.this.f21018ah);
            return true;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.l$b */
    private class C5952b {

        /* renamed from: b */
        private int f21029b;

        /* renamed from: c */
        private int f21030c;

        /* renamed from: d */
        private int f21031d;

        /* renamed from: e */
        private int f21032e;

        public C5952b(int i, int i2, int i3, int i4) {
            this.f21029b = i;
            this.f21030c = i2;
            this.f21031d = i3;
            this.f21032e = i4;
        }

        /* renamed from: a */
        public int mo18799a() {
            return this.f21029b;
        }

        /* renamed from: b */
        public int mo18800b() {
            return this.f21030c;
        }

        /* renamed from: c */
        public int mo18801c() {
            return this.f21031d;
        }

        /* renamed from: d */
        public int mo18802d() {
            return this.f21032e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Spanned m29156a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<b>");
        sb.append(str.substring(i, i2));
        sb.append("</b>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* renamed from: as */
    private void m29158as() {
        this.f21023i = C5919c.m29042a((Context) mo1318s()).mo18723a(this.f21015ae, this.f21016af);
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), this.f21023i, C5460i.product_order_product_list_item, new String[]{"product", "product_details", "price"}, new int[]{C5458g.product_order_products_list_item_product_name_txtview, C5458g.product_order_products_list_item_product_details_txtview, C5458g.product_order_products_list_item_product_price_txtview});
        simpleAdapter.setViewBinder(new C5951a());
        mo1691a((ListAdapter) simpleAdapter);
        mo1693a((CharSequence) mo1318s().getString(C5462k.product_order_info_message_there_are_no_any_products));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29161c(String str) {
        Pattern pattern;
        String str2;
        String trim = str == null ? "" : str.trim();
        if (!trim.equals(this.f21020aj) || this.f21022al) {
            if (trim.length() == 0) {
                m29163d(trim);
            }
            if (trim.length() > 0) {
                if (trim.length() < 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\\b");
                    sb.append(trim);
                    str2 = sb.toString();
                } else {
                    str2 = trim;
                }
                pattern = Pattern.compile(str2, 2);
            } else {
                pattern = null;
            }
            this.f21023i.clear();
            this.f21021ak.clear();
            m29158as();
            ArrayList arrayList = new ArrayList();
            for (Map map : this.f21023i) {
                if (pattern != null) {
                    Matcher matcher = pattern.matcher((CharSequence) map.get("product"));
                    Matcher matcher2 = pattern.matcher((CharSequence) map.get("product_details"));
                    Matcher matcher3 = pattern.matcher((CharSequence) map.get("price"));
                    Boolean valueOf = Boolean.valueOf(matcher.find());
                    Boolean valueOf2 = Boolean.valueOf(matcher2.find());
                    Boolean valueOf3 = Boolean.valueOf(matcher3.find());
                    if (valueOf.booleanValue() || valueOf2.booleanValue() || valueOf3.booleanValue()) {
                        if (valueOf.booleanValue()) {
                            C5952b bVar = r0;
                            List<C5952b> list = this.f21021ak;
                            C5952b bVar2 = new C5952b(0, matcher.start(), matcher.end(), arrayList.size());
                            list.add(bVar);
                        }
                        if (valueOf2.booleanValue()) {
                            List<C5952b> list2 = this.f21021ak;
                            C5952b bVar3 = new C5952b(1, matcher2.start(), matcher2.end(), arrayList.size());
                            list2.add(bVar3);
                        }
                        if (valueOf3.booleanValue()) {
                            List<C5952b> list3 = this.f21021ak;
                            C5952b bVar4 = new C5952b(2, matcher3.start(), matcher3.end(), arrayList.size());
                            list3.add(bVar4);
                        }
                        arrayList.add(map);
                    }
                }
            }
            this.f21023i.clear();
            if (arrayList.size() > 0) {
                this.f21023i = arrayList;
            } else if (trim.length() == 0 && arrayList.size() == 0) {
                m29158as();
            }
            C59503 r0 = new SimpleAdapter(mo1318s(), this.f21023i, C5460i.product_order_product_list_item, new String[]{"product", "product_details", "price"}, new int[]{C5458g.product_order_products_list_item_product_name_txtview, C5458g.product_order_products_list_item_product_details_txtview, C5458g.product_order_products_list_item_product_price_txtview}) {
                public View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    TextView textView = (TextView) view2.findViewById(C5458g.product_order_products_list_item_product_name_txtview);
                    TextView textView2 = (TextView) view2.findViewById(C5458g.product_order_products_list_item_product_details_txtview);
                    TextView textView3 = (TextView) view2.findViewById(C5458g.product_order_products_list_item_product_price_txtview);
                    Map map = (Map) C5947l.this.f21023i.get(i);
                    ArrayList<C5952b> arrayList = new ArrayList<>();
                    if (C5947l.this.f21021ak.size() > 0) {
                        for (int i2 = 0; i2 < C5947l.this.f21021ak.size(); i2++) {
                            if (((C5952b) C5947l.this.f21021ak.get(i2)).mo18802d() == i) {
                                arrayList.add(C5947l.this.f21021ak.get(i2));
                            }
                        }
                    }
                    for (C5952b bVar : arrayList) {
                        if (bVar != null && bVar.mo18799a() == 0) {
                            textView.setText(C5947l.this.m29156a((String) map.get("product"), bVar.mo18800b(), bVar.mo18801c()));
                        }
                        if (bVar != null && bVar.mo18799a() == 1) {
                            textView2.setText(C5947l.this.m29156a((String) map.get("product_details"), bVar.mo18800b(), bVar.mo18801c()));
                        }
                        if (bVar != null && bVar.mo18799a() == 2) {
                            textView3.setText(C5947l.this.m29156a((String) map.get("price"), bVar.mo18800b(), bVar.mo18801c()));
                        }
                    }
                    return view2;
                }
            };
            mo1693a((CharSequence) mo1219a(C5462k.product_order_search_by_location_no_any_products));
            r0.setViewBinder(new C5951a());
            mo1691a((ListAdapter) r0);
            m29163d(trim);
        }
    }

    /* renamed from: d */
    private void m29163d(String str) {
        this.f21020aj = str;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1283e(true);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21015ae = m.getString("PAGE_ID_KEY");
            this.f21016af = m.getInt("INDEX_KEY");
            this.f21017ag = m.getString("ADDRESS_KEY");
            this.f21018ah = m.getBundle("PAGE_STYLE");
        }
        if (bundle != null && bundle.containsKey("SEARCH_KEY")) {
            this.f21020aj = bundle.getString("SEARCH_KEY");
            if (this.f21020aj != null && !this.f21020aj.isEmpty()) {
                this.f21022al = true;
            }
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.product_order_cart_menu, menu);
        MenuItem findItem = menu.findItem(C5458g.search_product);
        findItem.setActionView(mo18794e());
        findItem.setVisible(true);
        if (this.f21022al) {
            m29161c(this.f21020aj);
            this.f21019ai.mo4608a((CharSequence) this.f21020aj, true);
            this.f21019ai.setFocusable(true);
            this.f21019ai.setIconified(false);
            this.f21019ai.requestFocusFromTouch();
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        m29158as();
        C6593am.m31914a(view, this.f21018ah);
        super.mo1242a(view, bundle);
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        mo18795e(i);
        super.mo1692a(listView, view, i, j);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.product_order_cart_menu) {
            return super.mo1245a(menuItem);
        }
        C5919c.m29042a((Context) mo1318s()).mo18724a((Activity) mo1318s(), (Fragment) this, "");
        return true;
    }

    /* renamed from: e */
    public View mo18794e() {
        this.f21019ai = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f21019ai.setQueryHint(mo1318s().getString(C5462k.product_order_search_by_products));
        this.f21019ai.mo4608a((CharSequence) this.f21020aj, false);
        this.f21019ai.setFocusable(false);
        this.f21019ai.setMaxWidth(C6619m.m32022d(mo1318s()));
        this.f21019ai.setOnQueryTextListener(new C0973c() {
            /* renamed from: a */
            public boolean mo4687a(String str) {
                C5947l.this.f21019ai.clearFocus();
                return false;
            }

            /* renamed from: a_ */
            public boolean mo4688a_(String str) {
                C5947l.this.m29161c(str);
                return false;
            }
        });
        this.f21019ai.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z && C5947l.this.f21019ai.getQuery().toString().trim().length() == 0) {
                    C5947l.this.f21019ai.setIconified(true);
                }
            }
        });
        return this.f21019ai;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo18795e(int i) {
        Map map = (Map) this.f21023i.get(i);
        int parseInt = map != null ? Integer.parseInt((String) map.get("productIndex")) : -1;
        Bundle bundle = new Bundle();
        bundle.putString("PAGE_ID_KEY", this.f21015ae);
        bundle.putString("ADDRESS_KEY", this.f21017ag);
        bundle.putInt("CATEGORY_INDEX_KEY", this.f21016af);
        bundle.putInt("PRODUCT_INDEX_KEY", parseInt);
        bundle.putBundle("PAGE_STYLE", this.f21018ah);
        App.m25620a(new FragmentInfo(C5932h.class.getName(), bundle), (Fragment) this);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putString("SEARCH_KEY", this.f21020aj);
    }
}
