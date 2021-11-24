package com.seattleclouds.modules.p177o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.SearchView;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
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
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.o.f */
public class C5922f extends C6671x {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public Bundle f20940ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public List<Map<String, String>> f20941af = new ArrayList();

    /* renamed from: ag */
    private List<Map<String, String>> f20942ag = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public List<Map<String, String>> f20943ah = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public List<C5930b> f20944ai = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public List<C5930b> f20945aj = new ArrayList();

    /* renamed from: ak */
    private C5919c f20946ak;

    /* renamed from: al */
    private int f20947al = 0;

    /* renamed from: am */
    private String f20948am = "";
    /* access modifiers changed from: private */

    /* renamed from: an */
    public SearchView f20949an;

    /* renamed from: ao */
    private boolean f20950ao = true;

    /* renamed from: ap */
    private String f20951ap = "";
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f20952aq = false;

    /* renamed from: ar */
    private boolean f20953ar = false;

    /* renamed from: i */
    private String f20954i;

    /* renamed from: com.seattleclouds.modules.o.f$a */
    private class C5929a implements ViewBinder {
        private C5929a() {
        }

        public boolean setViewValue(View view, Object obj, String str) {
            TextView textView = (TextView) view;
            textView.setText(str);
            C6593am.m31915a(textView, C5922f.this.f20940ae);
            return true;
        }
    }

    /* renamed from: com.seattleclouds.modules.o.f$b */
    private class C5930b {

        /* renamed from: b */
        private int f20963b;

        /* renamed from: c */
        private int f20964c;

        /* renamed from: d */
        private int f20965d;

        /* renamed from: e */
        private int f20966e;

        public C5930b(int i, int i2, int i3, int i4) {
            this.f20963b = i;
            this.f20964c = i2;
            this.f20965d = i3;
            this.f20966e = i4;
        }

        /* renamed from: a */
        public int mo18748a() {
            return this.f20963b;
        }

        /* renamed from: b */
        public int mo18749b() {
            return this.f20964c;
        }

        /* renamed from: c */
        public int mo18750c() {
            return this.f20965d;
        }

        /* renamed from: d */
        public int mo18751d() {
            return this.f20966e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Spanned m29068a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<b>");
        sb.append(str.substring(i, i2));
        sb.append("</b>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* renamed from: a */
    private void m29069a(C5919c cVar) {
        this.f20941af = cVar.mo18727c(this.f20954i);
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), this.f20941af, 17367044, new String[]{"city", "locationDetail"}, new int[]{16908308, 16908309});
        mo1693a((CharSequence) mo1219a(C5462k.product_order_info_message_there_are_no_any_locations));
        simpleAdapter.setViewBinder(new C5929a());
        mo1691a((ListAdapter) simpleAdapter);
    }

    /* renamed from: as */
    private void m29072as() {
        this.f20943ah = C5919c.m29042a((Context) mo1318s()).mo18729e(this.f20954i);
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), this.f20943ah, C5460i.product_order_product_list_item, new String[]{"product", "product_details", "price"}, new int[]{C5458g.product_order_products_list_item_product_name_txtview, C5458g.product_order_products_list_item_product_details_txtview, C5458g.product_order_products_list_item_product_price_txtview});
        simpleAdapter.setViewBinder(new C5929a());
        mo1691a((ListAdapter) simpleAdapter);
        mo1693a((CharSequence) mo1318s().getString(C5462k.product_order_info_message_there_are_no_any_products));
    }

    /* renamed from: at */
    private void m29073at() {
        C0766a aVar = new C0766a(mo1318s());
        View inflate = mo1318s().getLayoutInflater().inflate(C5460i.product_order_company_info, null);
        TextView textView = (TextView) inflate.findViewById(C5458g.product_order_company_info);
        TextView textView2 = (TextView) inflate.findViewById(C5458g.product_order_company_brief);
        C5918b b = this.f20946ak.mo18726b(this.f20954i);
        if (b != null) {
            textView.setText(b.mo18717a().mo18730a());
            textView2.setText(b.mo18717a().mo18732b());
            aVar.mo3062b(inflate).mo3048a(C5462k.f19438OK, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            aVar.mo3065b().show();
        }
    }

    /* renamed from: b */
    private void m29075b(C5919c cVar) {
        this.f20942ag = cVar.mo18728d(this.f20954i);
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), this.f20942ag, 17367044, new String[]{"category", "productCount"}, new int[]{16908308, 16908309});
        simpleAdapter.setViewBinder(new C5929a());
        mo1691a((ListAdapter) simpleAdapter);
        mo1693a((CharSequence) mo1219a(C5462k.product_order_info_message_there_are_no_any_categoreis));
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [com.seattleclouds.modules.o.f$6] */
    /* JADX WARNING: type inference failed for: r9v2, types: [android.widget.SimpleAdapter, android.widget.ListAdapter] */
    /* JADX WARNING: type inference failed for: r0v39, types: [com.seattleclouds.modules.o.f$5] */
    /* JADX WARNING: type inference failed for: r0v63, types: [com.seattleclouds.modules.o.f$6] */
    /* JADX WARNING: type inference failed for: r0v64, types: [com.seattleclouds.modules.o.f$5] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v63, types: [com.seattleclouds.modules.o.f$6]
      assigns: [com.seattleclouds.modules.o.f$6, com.seattleclouds.modules.o.f$5]
      uses: [com.seattleclouds.modules.o.f$6, android.widget.SimpleAdapter, android.widget.ListAdapter, com.seattleclouds.modules.o.f$5]
      mth insns count: 241
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m29078d(java.lang.String r22) {
        /*
            r21 = this;
            r7 = r21
            if (r22 != 0) goto L_0x0008
            java.lang.String r0 = ""
        L_0x0006:
            r8 = r0
            goto L_0x000d
        L_0x0008:
            java.lang.String r0 = r22.trim()
            goto L_0x0006
        L_0x000d:
            java.lang.String r0 = r7.f20951ap
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r7.f20953ar
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            int r0 = r8.length()
            r6 = 1
            if (r0 != 0) goto L_0x0028
            int r0 = r7.f20947al
            if (r0 != r6) goto L_0x0028
            r7.m29080e(r8)
        L_0x0028:
            int r0 = r8.length()
            r9 = 3
            r11 = 2
            if (r0 <= 0) goto L_0x004f
            int r0 = r8.length()
            if (r0 >= r9) goto L_0x0048
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "\\b"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            goto L_0x0049
        L_0x0048:
            r0 = r8
        L_0x0049:
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r11)
            r12 = r0
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20941af
            r0.clear()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20942ag
            r0.clear()
            java.util.List<com.seattleclouds.modules.o.f$b> r0 = r7.f20944ai
            r0.clear()
            java.util.List<com.seattleclouds.modules.o.f$b> r0 = r7.f20945aj
            r0.clear()
            int r0 = r7.f20947al
            r13 = 0
            if (r0 != r6) goto L_0x015f
            com.seattleclouds.modules.o.c r0 = r7.f20946ak
            r7.m29069a(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20941af
            java.util.Iterator r14 = r0.iterator()
        L_0x0079:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r14.next()
            r15 = r0
            java.util.Map r15 = (java.util.Map) r15
            if (r12 == 0) goto L_0x0105
            java.lang.String r0 = "city"
            java.lang.Object r0 = r15.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.util.regex.Matcher r0 = r12.matcher(r0)
            java.lang.String r1 = "locationDetail"
            java.lang.Object r1 = r15.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.regex.Matcher r16 = r12.matcher(r1)
            boolean r1 = r0.find()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r16.find()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r1.booleanValue()
            if (r2 != 0) goto L_0x00bc
            boolean r2 = r17.booleanValue()
            if (r2 == 0) goto L_0x0105
        L_0x00bc:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00e2
            java.util.List<com.seattleclouds.modules.o.f$b> r5 = r7.f20944ai
            com.seattleclouds.modules.o.f$b r4 = new com.seattleclouds.modules.o.f$b
            r2 = 0
            int r3 = r0.start()
            int r18 = r0.end()
            int r19 = r9.size()
            r0 = r4
            r1 = r21
            r10 = r4
            r4 = r18
            r6 = r5
            r5 = r19
            r0.<init>(r2, r3, r4, r5)
            r6.add(r10)
        L_0x00e2:
            boolean r0 = r17.booleanValue()
            if (r0 == 0) goto L_0x0102
            java.util.List<com.seattleclouds.modules.o.f$b> r6 = r7.f20944ai
            com.seattleclouds.modules.o.f$b r10 = new com.seattleclouds.modules.o.f$b
            r2 = 1
            int r3 = r16.start()
            int r4 = r16.end()
            int r5 = r9.size()
            r0 = r10
            r1 = r21
            r0.<init>(r2, r3, r4, r5)
            r6.add(r10)
        L_0x0102:
            r9.add(r15)
        L_0x0105:
            r6 = 1
            goto L_0x0079
        L_0x0108:
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20941af
            r0.clear()
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0116
            r7.f20941af = r9
            goto L_0x0127
        L_0x0116:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0127
            int r0 = r9.size()
            if (r0 != 0) goto L_0x0127
            com.seattleclouds.modules.o.c r0 = r7.f20946ak
            r7.m29069a(r0)
        L_0x0127:
            com.seattleclouds.modules.o.f$5 r9 = new com.seattleclouds.modules.o.f$5
            android.support.v4.app.h r2 = r21.mo1318s()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r3 = r7.f20941af
            r4 = 17367044(0x1090004, float:2.5162937E-38)
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.String r0 = "city"
            r5[r13] = r0
            java.lang.String r0 = "locationDetail"
            r1 = 1
            r5[r1] = r0
            int[] r6 = new int[r11]
            r6 = {16908308, 16908309} // fill-array
            r0 = r9
            r1 = r21
            r0.<init>(r2, r3, r4, r5, r6)
            int r0 = com.seattleclouds.C5451m.C5462k.product_order_search_by_location_no_any_locations
            java.lang.String r0 = r7.mo1219a(r0)
            r7.mo1693a(r0)
            com.seattleclouds.modules.o.f$a r0 = new com.seattleclouds.modules.o.f$a
            r1 = 0
            r0.<init>()
        L_0x0157:
            r9.setViewBinder(r0)
            r7.mo1691a(r9)
            goto L_0x02c1
        L_0x015f:
            int r0 = r7.f20947al
            if (r0 != r11) goto L_0x02c1
            r21.m29072as()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20943ah
            java.util.Iterator r10 = r0.iterator()
        L_0x0171:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r0 = r10.next()
            r14 = r0
            java.util.Map r14 = (java.util.Map) r14
            if (r12 == 0) goto L_0x0237
            java.lang.String r0 = "product"
            java.lang.Object r0 = r14.get(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.util.regex.Matcher r0 = r12.matcher(r0)
            java.lang.String r1 = "product_details"
            java.lang.Object r1 = r14.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.regex.Matcher r15 = r12.matcher(r1)
            java.lang.String r1 = "price"
            java.lang.Object r1 = r14.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.regex.Matcher r16 = r12.matcher(r1)
            boolean r1 = r0.find()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r15.find()
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r16.find()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r1.booleanValue()
            if (r2 != 0) goto L_0x01ce
            boolean r2 = r17.booleanValue()
            if (r2 != 0) goto L_0x01ce
            boolean r2 = r18.booleanValue()
            if (r2 == 0) goto L_0x0237
        L_0x01ce:
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x01f4
            java.util.List<com.seattleclouds.modules.o.f$b> r5 = r7.f20945aj
            com.seattleclouds.modules.o.f$b r4 = new com.seattleclouds.modules.o.f$b
            r2 = 0
            int r3 = r0.start()
            int r19 = r0.end()
            int r20 = r6.size()
            r0 = r4
            r1 = r21
            r11 = r4
            r4 = r19
            r13 = r5
            r5 = r20
            r0.<init>(r2, r3, r4, r5)
            r13.add(r11)
        L_0x01f4:
            boolean r0 = r17.booleanValue()
            if (r0 == 0) goto L_0x0214
            java.util.List<com.seattleclouds.modules.o.f$b> r11 = r7.f20945aj
            com.seattleclouds.modules.o.f$b r13 = new com.seattleclouds.modules.o.f$b
            r2 = 1
            int r3 = r15.start()
            int r4 = r15.end()
            int r5 = r6.size()
            r0 = r13
            r1 = r21
            r0.<init>(r2, r3, r4, r5)
            r11.add(r13)
        L_0x0214:
            boolean r0 = r18.booleanValue()
            if (r0 == 0) goto L_0x0234
            java.util.List<com.seattleclouds.modules.o.f$b> r11 = r7.f20945aj
            com.seattleclouds.modules.o.f$b r13 = new com.seattleclouds.modules.o.f$b
            r2 = 2
            int r3 = r16.start()
            int r4 = r16.end()
            int r5 = r6.size()
            r0 = r13
            r1 = r21
            r0.<init>(r2, r3, r4, r5)
            r11.add(r13)
        L_0x0234:
            r6.add(r14)
        L_0x0237:
            r11 = 2
            r13 = 0
            goto L_0x0171
        L_0x023b:
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r7.f20943ah
            r0.clear()
            r0 = 17367044(0x1090004, float:2.5162937E-38)
            int r1 = r6.size()
            if (r1 <= 0) goto L_0x0270
            r7.f20943ah = r6
            java.lang.String[] r0 = new java.lang.String[r9]
            java.lang.String r1 = "product"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "product_details"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "price"
            r4 = 2
            r0[r4] = r1
            int[] r1 = new int[r9]
            int r5 = com.seattleclouds.C5451m.C5458g.product_order_products_list_item_product_name_txtview
            r1[r2] = r5
            int r2 = com.seattleclouds.C5451m.C5458g.product_order_products_list_item_product_details_txtview
            r1[r3] = r2
            int r2 = com.seattleclouds.C5451m.C5458g.product_order_products_list_item_product_price_txtview
            r1[r4] = r2
            int r2 = com.seattleclouds.C5451m.C5460i.product_order_product_list_item
            r5 = r0
            r6 = r1
            r4 = r2
            goto L_0x02a2
        L_0x0270:
            r4 = 2
            int r1 = r8.length()
            if (r1 != 0) goto L_0x029d
            int r1 = r6.size()
            if (r1 != 0) goto L_0x029d
            com.seattleclouds.modules.o.c r1 = r7.f20946ak
            r7.m29075b(r1)
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r7.f20942ag
            r7.f20943ah = r1
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = "category"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "productCount"
            r3 = 1
            r1[r3] = r2
            int[] r2 = new int[r4]
            r2 = {16908308, 16908309} // fill-array
            r5 = r1
            r6 = r2
            r4 = 17367044(0x1090004, float:2.5162937E-38)
            goto L_0x02a2
        L_0x029d:
            r4 = 17367044(0x1090004, float:2.5162937E-38)
            r5 = 0
            r6 = 0
        L_0x02a2:
            com.seattleclouds.modules.o.f$6 r9 = new com.seattleclouds.modules.o.f$6
            android.support.v4.app.h r2 = r21.mo1318s()
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r3 = r7.f20943ah
            r0 = r9
            r1 = r21
            r0.<init>(r2, r3, r4, r5, r6)
            int r0 = com.seattleclouds.C5451m.C5462k.product_order_search_by_location_no_any_products
            java.lang.String r0 = r7.mo1219a(r0)
            r7.mo1693a(r0)
            com.seattleclouds.modules.o.f$a r0 = new com.seattleclouds.modules.o.f$a
            r1 = 0
            r0.<init>()
            goto L_0x0157
        L_0x02c1:
            r7.m29080e(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p177o.C5922f.m29078d(java.lang.String):void");
    }

    /* renamed from: e */
    private void m29080e(String str) {
        this.f20951ap = str;
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f20949an != null) {
            this.f20950ao = this.f20949an.mo4613c();
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.product_order_info_menu, menu);
        menu.findItem(C5458g.search).setActionView(mo18739e());
        if (this.f20953ar) {
            m29078d(this.f20951ap);
            this.f20949an.mo4608a((CharSequence) this.f20951ap, true);
            this.f20949an.setFocusable(true);
            this.f20949an.setIconified(false);
            this.f20949an.requestFocusFromTouch();
        }
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        switch (this.f20947al) {
            case 1:
                mo18738c((String) ((Map) this.f20941af.get(i)).get("locationDetail"));
                return;
            case 2:
                if (this.f20952aq) {
                    mo18741f(i);
                    return;
                } else {
                    mo18740e(i);
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.product_order_info_menu_icon) {
            return super.mo1245a(menuItem);
        }
        m29073at();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo18738c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("PAGE_ID_KEY", this.f20954i);
        bundle.putString("PICKUP_ADDRESS_KEY", str);
        bundle.putInt("MODE_KEY", 2);
        bundle.putBundle("PAGE_STYLE", this.f20940ae);
        App.m25620a(new FragmentInfo(C5922f.class.getName(), bundle), (Fragment) this);
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20954i = m.getString("PAGE_ID_KEY");
            this.f20947al = m.getInt("MODE_KEY");
            this.f20948am = m.getString("PICKUP_ADDRESS_KEY");
            this.f20940ae = m.getBundle("PAGE_STYLE");
        }
        if (bundle != null && bundle.containsKey("SEARCH_KEY")) {
            this.f20951ap = bundle.getString("SEARCH_KEY");
            if (this.f20951ap != null && !this.f20951ap.isEmpty()) {
                this.f20953ar = true;
            }
        }
        this.f20946ak = C5919c.m29042a((Context) mo1318s());
        this.f20946ak.mo18725a(this.f20954i);
        if (this.f20947al == 0) {
            if (this.f20946ak.mo18727c(this.f20954i).size() == 1) {
                this.f20947al = 2;
                this.f20948am = (String) ((Map) this.f20946ak.mo18727c(this.f20954i).get(0)).get("locationDetail");
            } else {
                this.f20947al = 1;
            }
        }
        switch (this.f20947al) {
            case 1:
                m29069a(this.f20946ak);
                break;
            case 2:
                m29075b(this.f20946ak);
                break;
        }
        C6593am.m31914a(mo1199I(), this.f20940ae);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x006a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo18739e() {
        /*
            r4 = this;
            android.support.v7.widget.SearchView r0 = new android.support.v7.widget.SearchView
            android.support.v4.app.h r1 = r4.mo1318s()
            com.seattleclouds.n r1 = (com.seattleclouds.C6348n) r1
            android.support.v7.app.a r1 = r1.mo3083i()
            android.content.Context r1 = r1.mo3005e()
            r0.<init>(r1)
            r4.f20949an = r0
            int r0 = r4.f20947al
            r1 = 1
            if (r0 != r1) goto L_0x002a
            android.support.v7.widget.SearchView r0 = r4.f20949an
            android.support.v4.app.h r1 = r4.mo1318s()
            int r2 = com.seattleclouds.C5451m.C5462k.product_order_search_by_location_hint
        L_0x0022:
            java.lang.String r1 = r1.getString(r2)
            r0.setQueryHint(r1)
            goto L_0x0038
        L_0x002a:
            int r0 = r4.f20947al
            r1 = 2
            if (r0 != r1) goto L_0x0038
            android.support.v7.widget.SearchView r0 = r4.f20949an
            android.support.v4.app.h r1 = r4.mo1318s()
            int r2 = com.seattleclouds.C5451m.C5462k.product_order_search_by_products
            goto L_0x0022
        L_0x0038:
            android.support.v7.widget.SearchView r0 = r4.f20949an
            java.lang.String r1 = r4.f20951ap
            r2 = 0
            r0.mo4608a(r1, r2)
            android.support.v7.widget.SearchView r0 = r4.f20949an
            r0.setFocusable(r2)
            android.support.v7.widget.SearchView r0 = r4.f20949an
            android.support.v4.app.h r1 = r4.mo1318s()
            int r1 = com.seattleclouds.util.C6619m.m32022d(r1)
            r0.setMaxWidth(r1)
            android.support.v7.widget.SearchView r0 = r4.f20949an
            com.seattleclouds.modules.o.f$2 r1 = new com.seattleclouds.modules.o.f$2
            r1.<init>()
            r0.setOnQueryTextListener(r1)
            android.support.v7.widget.SearchView r0 = r4.f20949an
            com.seattleclouds.modules.o.f$3 r1 = new com.seattleclouds.modules.o.f$3
            r1.<init>()
            r0.setOnQueryTextFocusChangeListener(r1)
            boolean r0 = r4.f20950ao
            if (r0 != 0) goto L_0x0079
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.seattleclouds.modules.o.f$4 r1 = new com.seattleclouds.modules.o.f$4
            r1.<init>()
            r2 = 10
            r0.postDelayed(r1, r2)
        L_0x0079:
            android.support.v7.widget.SearchView r0 = r4.f20949an
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p177o.C5922f.mo18739e():android.view.View");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo18740e(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("PAGE_ID_KEY", this.f20954i);
        bundle.putInt("INDEX_KEY", i);
        bundle.putString("ADDRESS_KEY", this.f20948am);
        bundle.putBundle("PAGE_STYLE", this.f20940ae);
        App.m25620a(new FragmentInfo(C5947l.class.getName(), bundle), (Fragment) this);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putString("SEARCH_KEY", this.f20951ap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo18741f(int i) {
        int i2;
        Map map = (Map) this.f20943ah.get(i);
        int i3 = -1;
        if (map != null) {
            i3 = Integer.parseInt((String) map.get("categoryIndex"));
            i2 = Integer.parseInt((String) map.get("productIndex"));
        } else {
            i2 = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putString("PAGE_ID_KEY", this.f20954i);
        bundle.putString("ADDRESS_KEY", this.f20948am);
        bundle.putInt("CATEGORY_INDEX_KEY", i3);
        bundle.putInt("PRODUCT_INDEX_KEY", i2);
        bundle.putBundle("PAGE_STYLE", this.f20940ae);
        App.m25620a(new FragmentInfo(C5932h.class.getName(), bundle), (Fragment) this);
    }
}
