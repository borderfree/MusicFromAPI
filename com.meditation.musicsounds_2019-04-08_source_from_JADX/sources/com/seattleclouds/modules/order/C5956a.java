package com.seattleclouds.modules.order;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.paypal.PayPalController;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.modules.order.indiapay.IndiaPayActivity;
import com.seattleclouds.modules.order.indiapay.p180c.C6000c;
import com.seattleclouds.modules.order.indiapay.p180c.C6001d;
import com.seattleclouds.p159d.C5328a;
import com.seattleclouds.p159d.C5329b;
import com.seattleclouds.p159d.C5331d;
import com.seattleclouds.paypal.C6356b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6644x;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.seattleclouds.modules.order.a */
public class C5956a extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f21058a = "a";

    /* renamed from: aA */
    private static boolean f21059aA = false;

    /* renamed from: ae */
    private static String f21060ae = "pickUpAddress";

    /* renamed from: af */
    private static String f21061af = "shippingPrice";

    /* renamed from: ag */
    private static String f21062ag = "paymentMethod";

    /* renamed from: ah */
    private static String f21063ah = "cardNumber";

    /* renamed from: ai */
    private static String f21064ai = "cardCode";

    /* renamed from: aj */
    private static String f21065aj = "cardExpMonth";

    /* renamed from: ak */
    private static String f21066ak = "cardExpYear";

    /* renamed from: al */
    private static String f21067al = "firstName";

    /* renamed from: am */
    private static String f21068am = "lastName";

    /* renamed from: an */
    private static String f21069an = "itemId";

    /* renamed from: ao */
    private static String f21070ao = "itemName";

    /* renamed from: ap */
    private static String f21071ap = "itemPrice";

    /* renamed from: aq */
    private static String f21072aq = "itemQuantity";
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public static String f21073ar = "Cash";
    /* access modifiers changed from: private */

    /* renamed from: as */
    public static String f21074as = "pod";
    /* access modifiers changed from: private */

    /* renamed from: at */
    public static String f21075at = "authorizeNet";
    /* access modifiers changed from: private */

    /* renamed from: au */
    public static String f21076au = "payPal";
    /* access modifiers changed from: private */

    /* renamed from: av */
    public static String f21077av = "payPalSDK";
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public static String f21078aw = "indiaPay";
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public static String f21079ax = "Pick up";
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public static String f21080ay = "Delivery";

    /* renamed from: az */
    private static String f21081az = "None";

    /* renamed from: b */
    private static String f21082b = "publisherId";

    /* renamed from: c */
    private static String f21083c = "username";

    /* renamed from: d */
    private static String f21084d = "appId";

    /* renamed from: e */
    private static String f21085e = "email";

    /* renamed from: f */
    private static String f21086f = "phoneNumber";

    /* renamed from: g */
    private static String f21087g = "orderInstructions";

    /* renamed from: h */
    private static String f21088h = "deliveryMethod";

    /* renamed from: i */
    private static String f21089i = "deliveryAddress";

    /* renamed from: aB */
    private View f21090aB;

    /* renamed from: aC */
    private ExpandableListView f21091aC;

    /* renamed from: aD */
    private View f21092aD;

    /* renamed from: aE */
    private View f21093aE;

    /* renamed from: aF */
    private TextView f21094aF;

    /* renamed from: aG */
    private TextView f21095aG;

    /* renamed from: aH */
    private TextView f21096aH;

    /* renamed from: aI */
    private TextView f21097aI;

    /* renamed from: aJ */
    private EditText f21098aJ;

    /* renamed from: aK */
    private EditText f21099aK;
    /* access modifiers changed from: private */

    /* renamed from: aL */
    public Spinner f21100aL;

    /* renamed from: aM */
    private EditText f21101aM;

    /* renamed from: aN */
    private EditText f21102aN;
    /* access modifiers changed from: private */

    /* renamed from: aO */
    public TextView f21103aO;

    /* renamed from: aP */
    private Spinner f21104aP;

    /* renamed from: aQ */
    private EditText f21105aQ;

    /* renamed from: aR */
    private EditText f21106aR;

    /* renamed from: aS */
    private Spinner f21107aS;

    /* renamed from: aT */
    private Spinner f21108aT;

    /* renamed from: aU */
    private EditText f21109aU;

    /* renamed from: aV */
    private EditText f21110aV;
    /* access modifiers changed from: private */

    /* renamed from: aW */
    public LinearLayout f21111aW;
    /* access modifiers changed from: private */

    /* renamed from: aX */
    public LinearLayout f21112aX;
    /* access modifiers changed from: private */

    /* renamed from: aY */
    public LinearLayout f21113aY;

    /* renamed from: aZ */
    private LinearLayout f21114aZ;
    /* access modifiers changed from: private */

    /* renamed from: bA */
    public boolean f21115bA = false;
    /* access modifiers changed from: private */

    /* renamed from: bB */
    public int f21116bB = C5462k.order_error_message_order_failed;

    /* renamed from: bC */
    private int f21117bC = 0;
    /* access modifiers changed from: private */

    /* renamed from: bD */
    public String[] f21118bD = {"JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC"};
    /* access modifiers changed from: private */

    /* renamed from: bE */
    public String[] f21119bE = {"2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027"};
    /* access modifiers changed from: private */

    /* renamed from: ba */
    public ArrayList<C5331d> f21120ba;

    /* renamed from: bb */
    private LayoutInflater f21121bb;
    /* access modifiers changed from: private */

    /* renamed from: bc */
    public C5972d f21122bc;
    /* access modifiers changed from: private */

    /* renamed from: bd */
    public ProgressDialog f21123bd;
    /* access modifiers changed from: private */

    /* renamed from: be */
    public Bundle f21124be;

    /* renamed from: bf */
    private PayPalController f21125bf;

    /* renamed from: bg */
    private String f21126bg;
    /* access modifiers changed from: private */

    /* renamed from: bh */
    public OrderConfigInfo f21127bh;

    /* renamed from: bi */
    private String f21128bi = "";

    /* renamed from: bj */
    private String f21129bj = "";
    /* access modifiers changed from: private */

    /* renamed from: bk */
    public String f21130bk = "";

    /* renamed from: bl */
    private String f21131bl = "";
    /* access modifiers changed from: private */

    /* renamed from: bm */
    public C5969a f21132bm = new C5969a("", "");
    /* access modifiers changed from: private */

    /* renamed from: bn */
    public ArrayAdapter<C5969a> f21133bn;

    /* renamed from: bo */
    private String f21134bo = "";

    /* renamed from: bp */
    private String f21135bp = "";
    /* access modifiers changed from: private */

    /* renamed from: bq */
    public String f21136bq = "";
    /* access modifiers changed from: private */

    /* renamed from: br */
    public String f21137br = "";

    /* renamed from: bs */
    private String f21138bs = "";

    /* renamed from: bt */
    private String f21139bt = "";

    /* renamed from: bu */
    private String f21140bu = "";

    /* renamed from: bv */
    private double f21141bv = 0.0d;

    /* renamed from: bw */
    private String f21142bw = "";

    /* renamed from: bx */
    private double f21143bx = 0.0d;

    /* renamed from: by */
    private String f21144by = "USD";

    /* renamed from: bz */
    private double f21145bz = 0.0d;

    /* renamed from: com.seattleclouds.modules.order.a$a */
    protected class C5969a {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f21164b = "";
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f21165c = "";

        public C5969a(String str, String str2) {
            this.f21164b = str;
            this.f21165c = str2;
        }

        public boolean equals(Object obj) {
            return (!(obj instanceof String) || this.f21164b == null || this.f21164b.isEmpty()) ? super.equals(obj) : this.f21164b.equalsIgnoreCase((String) obj);
        }
    }

    /* renamed from: com.seattleclouds.modules.order.a$b */
    private class C5970b extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        Map<String, String> f21166a;

        private C5970b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str;
            if (!C5956a.this.f21115bA) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C5268b.m26280b(App.f18516r));
            sb.append("://");
            sb.append(App.f18516r);
            sb.append("/processmobileorder.ashx");
            try {
                str = HTTPUtil.m31768b(sb.toString(), this.f21166a);
            } catch (IOException e) {
                String a = C5956a.this.mo1219a(C5462k.order_something_went_wrong);
                String aB = C5956a.f21058a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ERROR: ");
                sb2.append(a);
                Log.e(aB, sb2.toString(), e);
                str = a;
            }
            return str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (C5956a.this.f21115bA) {
                C5956a.this.f21123bd.dismiss();
                if (str == null || str.compareToIgnoreCase("OK") != 0) {
                    if (str == null) {
                        str = "";
                    }
                    str = C5956a.this.m29258d(str.replace("ERROR:", ""));
                    C6595ao.m31930a((Context) C5956a.this.mo1318s(), str, true);
                } else {
                    C6595ao.m31930a((Context) C5956a.this.mo1318s(), C5956a.this.mo1318s().getString(C5462k.order_info_message_order_was_successfully_processed), true);
                    C5956a.this.f21120ba.clear();
                    C5956a.this.f21122bc.notifyDataSetChanged();
                    C5956a.this.m29224aF();
                    C5956a.this.m29222aD();
                }
            }
            super.onPostExecute(str);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5956a.this.m29225aG();
            C5956a.this.f21115bA = true;
            C5956a.this.f21116bB = C5462k.order_info_message_order_was_successfully_processed;
            this.f21166a = C5956a.this.m29236aR();
            if (!C5956a.this.f21115bA) {
                C5956a.this.f21123bd.cancel();
                C0367h s = C5956a.this.mo1318s();
                if (s != null) {
                    C6595ao.m31926a((Context) s, C5956a.this.f21116bB);
                }
            }
            if (C5956a.this.f21132bm.equals(C5956a.f21075at)) {
                C5956a.this.m29227aI();
            }
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.modules.order.a$c */
    private static class C5971c {

        /* renamed from: a */
        final TextView f21168a;

        /* renamed from: b */
        final TextView f21169b;

        /* renamed from: c */
        final TextView f21170c;

        /* renamed from: d */
        final EditText f21171d;

        C5971c(TextView textView, TextView textView2, TextView textView3, EditText editText) {
            this.f21168a = textView;
            this.f21169b = textView2;
            this.f21170c = textView3;
            this.f21171d = editText;
        }
    }

    /* renamed from: com.seattleclouds.modules.order.a$d */
    private class C5972d extends BaseExpandableListAdapter {
        private C5972d() {
        }

        public Object getChild(int i, int i2) {
            return ((C5328a) C5328a.class.cast(getGroup(i))).mo17484a(i2);
        }

        public long getChildId(int i, int i2) {
            return 0;
        }

        public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            return C5956a.this.mo18827a(view, (C5329b) C5329b.class.cast(getChild(i, i2)));
        }

        public int getChildrenCount(int i) {
            return ((C5328a) C5328a.class.cast(getGroup(i))).mo17496e();
        }

        public Object getGroup(int i) {
            return C5956a.this.f21120ba.get(i);
        }

        public int getGroupCount() {
            return C5956a.this.f21120ba.size();
        }

        public long getGroupId(int i) {
            return 0;
        }

        public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
            return C5956a.this.mo18828a(view, (C5331d) C5331d.class.cast(getGroup(i)), i);
        }

        public boolean hasStableIds() {
            return false;
        }

        public boolean isChildSelectable(int i, int i2) {
            return true;
        }
    }

    /* renamed from: com.seattleclouds.modules.order.a$e */
    private static class C5973e {

        /* renamed from: a */
        final TextView f21173a;

        /* renamed from: b */
        final TextView f21174b;

        C5973e(TextView textView, TextView textView2) {
            this.f21173a = textView;
            this.f21174b = textView2;
        }
    }

    /* renamed from: a */
    private int m29199a(Window window) {
        return window.getAttributes().softInputMode & 240;
    }

    /* renamed from: a */
    private int m29200a(C5969a aVar) {
        ArrayList aU = m29239aU();
        for (int i = 0; i < aU.size(); i++) {
            if (aVar.equals(((C5969a) aU.get(i)).f21164b)) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private int m29202a(String str, String[] strArr) {
        int i = 0;
        for (String a : strArr) {
            if (C6592al.m31907a(a, str)) {
                return i;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: a */
    private String m29206a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            try {
                sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                Log.e(f21058a, "ERROR:", e);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m29207a(ViewGroup viewGroup) {
        this.f21090aB = this.f21121bb.inflate(C5460i.order_list, viewGroup, false);
        C6593am.m31914a(this.f21090aB, this.f21124be);
        this.f21091aC = (ExpandableListView) this.f21090aB.findViewById(C5458g.order_list);
        this.f21092aD = this.f21121bb.inflate(C5460i.order_list_header, null);
        C6593am.m31914a(this.f21092aD, this.f21124be);
        C6593am.m31915a((TextView) this.f21092aD.findViewById(C5458g.order_product_item_name), this.f21124be);
        C6593am.m31915a((TextView) this.f21092aD.findViewById(C5458g.order_product_item_quantity), this.f21124be);
        C6593am.m31915a((TextView) this.f21092aD.findViewById(C5458g.order_product_item_price), this.f21124be);
        this.f21093aE = this.f21121bb.inflate(C5460i.order_list_footer, null);
        C6593am.m31914a(this.f21093aE, this.f21124be);
        this.f21094aF = (TextView) this.f21093aE.findViewById(C5458g.order_shipping_value);
        C6593am.m31915a(this.f21094aF, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_shipping_title), this.f21124be);
        this.f21096aH = (TextView) this.f21093aE.findViewById(C5458g.order_subtotal);
        C6593am.m31915a(this.f21096aH, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_subtotal_title), this.f21124be);
        this.f21095aG = (TextView) this.f21093aE.findViewById(C5458g.order_tax_value);
        C6593am.m31915a(this.f21095aG, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_tax_title), this.f21124be);
        this.f21097aI = (TextView) this.f21093aE.findViewById(C5458g.order_total_value);
        C6593am.m31915a(this.f21097aI, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_total_title), this.f21124be);
        this.f21091aC.addHeaderView(this.f21092aD);
        this.f21091aC.addFooterView(this.f21093aE);
        this.f21101aM = (EditText) this.f21093aE.findViewById(C5458g.order_phone_number);
        C6593am.m31915a((TextView) this.f21101aM, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_phone_number_title), this.f21124be);
        this.f21098aJ = (EditText) this.f21093aE.findViewById(C5458g.order_details_email);
        C6593am.m31915a((TextView) this.f21098aJ, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_details_email_title), this.f21124be);
        this.f21099aK = (EditText) this.f21093aE.findViewById(C5458g.order_details_insturctions);
        C6593am.m31915a((TextView) this.f21099aK, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_details_insturctions_title), this.f21124be);
        this.f21102aN = (EditText) this.f21093aE.findViewById(C5458g.order_delivery_address);
        C6593am.m31915a((TextView) this.f21102aN, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_delivery_address_title), this.f21124be);
        this.f21109aU = (EditText) this.f21093aE.findViewById(C5458g.order_card_holder_first_name);
        C6593am.m31915a((TextView) this.f21109aU, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_holder_first_name_title), this.f21124be);
        this.f21110aV = (EditText) this.f21093aE.findViewById(C5458g.order_card_holder_name);
        C6593am.m31915a((TextView) this.f21110aV, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_holder_name_title), this.f21124be);
        this.f21106aR = (EditText) this.f21093aE.findViewById(C5458g.order_card_code);
        C6593am.m31915a((TextView) this.f21106aR, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_code_title), this.f21124be);
        this.f21105aQ = (EditText) this.f21093aE.findViewById(C5458g.order_card_number);
        C6593am.m31915a((TextView) this.f21105aQ, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_number_title), this.f21124be);
        this.f21114aZ = (LinearLayout) this.f21093aE.findViewById(C5458g.order_delivery_methods_block);
        this.f21113aY = (LinearLayout) this.f21093aE.findViewById(C5458g.order_delivery_address_block);
        this.f21100aL = (Spinner) this.f21093aE.findViewById(C5458g.order_delivery_method);
        m29212a(this.f21100aL);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_delivery_method_title), this.f21124be);
        this.f21107aS = (Spinner) this.f21093aE.findViewById(C5458g.order_card_exp_month);
        m29254c(this.f21107aS);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_exp_month_title), this.f21124be);
        this.f21108aT = (Spinner) this.f21093aE.findViewById(C5458g.order_card_exp_year);
        m29259d(this.f21108aT);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_card_exp_year_title), this.f21124be);
        this.f21104aP = (Spinner) this.f21093aE.findViewById(C5458g.order_payment_method);
        m29246b(this.f21104aP);
        this.f21103aO = (TextView) this.f21093aE.findViewById(C5458g.order_pikup_delivery_note);
        C6593am.m31915a(this.f21103aO, this.f21124be);
        C6593am.m31915a((TextView) this.f21093aE.findViewById(C5458g.order_payment_method_title), this.f21124be);
        this.f21111aW = (LinearLayout) this.f21093aE.findViewById(C5458g.order_details_block);
        this.f21112aX = (LinearLayout) this.f21093aE.findViewById(C5458g.order_credit_card_info);
        Button button = (Button) this.f21093aE.findViewById(C5458g.order_submit_button);
        C6593am.m31915a((TextView) button, this.f21124be);
        m29209a(button);
        if (f21059aA) {
            this.f21101aM.setText("01234567890");
            this.f21098aJ.setText("dimame032@gmail.com");
            this.f21099aK.setText("My order instructions");
        }
    }

    /* renamed from: a */
    private void m29208a(Window window, int i) {
        window.setSoftInputMode(i | (window.getAttributes().softInputMode & -241));
    }

    /* renamed from: a */
    private void m29209a(Button button) {
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C5956a.this.f21123bd.isShowing()) {
                    C5956a.this.f21123bd.cancel();
                } else {
                    C5956a.this.m29233aO();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29210a(EditText editText) {
        boolean z;
        String obj = editText.getText().toString();
        int c = m29249c(obj);
        if (c > 999) {
            c = 999;
            z = true;
        } else {
            z = false;
        }
        m29214a(m29243b(editText), c);
        if (z) {
            String num = Integer.toString(c);
            editText.getText().replace(0, obj.length(), num);
            editText.setSelection(0, num.length());
        }
    }

    /* renamed from: a */
    private void m29211a(final EditText editText, int i) {
        editText.setText(String.valueOf(i));
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                C5956a.this.m29210a(editText);
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        editText.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z) {
                    C5956a.this.m29253c(editText);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m29212a(Spinner spinner) {
        final Resources t = mo1320t();
        ArrayList aS = m29237aS();
        if (this.f21132bm.f21164b == f21074as) {
            aS.remove(mo1219a(C5462k.order_delivery_method_pickup));
        }
        if (aS.size() == 0) {
            this.f21114aZ.setVisibility(8);
            this.f21113aY.setVisibility(8);
            return;
        }
        this.f21114aZ.setVisibility(0);
        this.f21113aY.setVisibility(0);
        final String[] strArr = (String[]) aS.toArray(new String[aS.size()]);
        C59645 r2 = new ArrayAdapter<String>(mo1318s(), 17367048, strArr) {
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                C6593am.m31915a((TextView) dropDownView, C5956a.this.f21124be);
                return dropDownView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                C6593am.m31915a((TextView) view2, C5956a.this.f21124be);
                return view2;
            }
        };
        r2.setDropDownViewResource(17367049);
        spinner.setAdapter(r2);
        spinner.setPrompt(t.getString(C5462k.order_choose_payment_method_promt));
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (strArr[i].equalsIgnoreCase(t.getString(C5462k.order_delivery_method_pickup))) {
                    C5956a.this.f21130bk = C5956a.f21079ax;
                    C5956a.this.f21113aY.setVisibility(8);
                    C5956a.this.f21103aO.setText(C5956a.this.f21127bh.mo18806b());
                } else if (strArr[i].equalsIgnoreCase(t.getString(C5462k.order_delivery_method_delivery))) {
                    C5956a.this.f21130bk = C5956a.f21080ay;
                    C5956a.this.f21103aO.setText(C5956a.this.f21127bh.mo18807c());
                    if (!C5956a.this.f21132bm.equals(C5956a.f21076au) && !C5956a.this.f21132bm.equals(C5956a.f21077av) && !C5956a.this.f21132bm.equals(C5956a.f21078aw)) {
                        C5956a.this.f21113aY.setVisibility(0);
                    }
                }
                C5956a.this.m29224aF();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /* renamed from: a */
    private void m29213a(C5331d dVar) {
        if (dVar != null) {
            C0367h s = mo1318s();
            if (s != null) {
                App.f18489V.mo17512a((C5328a) dVar, (Context) s);
                this.f21122bc.notifyDataSetChanged();
                m29224aF();
                m29222aD();
            }
        }
    }

    /* renamed from: a */
    private void m29214a(C5331d dVar, int i) {
        if (dVar != null) {
            C0367h s = mo1318s();
            if (!(s == null || i == dVar.mo17521k())) {
                App.f18489V.mo17513a(Integer.valueOf(i), dVar, s);
                this.f21120ba = App.f18489V.mo17518b();
                m29224aF();
            }
        }
    }

    /* renamed from: a */
    private boolean m29218a(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: aC */
    private void m29221aC() {
        C0367h s = mo1318s();
        if (s != null) {
            Window window = s.getWindow();
            if (!(window == null || this.f21117bC == m29199a(window))) {
                m29208a(window, this.f21117bC);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m29222aD() {
        for (int i = 0; i < this.f21120ba.size(); i++) {
            this.f21091aC.collapseGroup(i);
            this.f21091aC.expandGroup(i);
        }
    }

    /* renamed from: aE */
    private void m29223aE() {
        this.f21101aM.setText(this.f21142bw);
        this.f21098aJ.setText(this.f21128bi);
        this.f21099aK.setText(this.f21129bj);
        int indexOf = m29238aT().indexOf(this.f21130bk);
        if (indexOf == -1) {
            indexOf = 0;
        }
        this.f21100aL.setSelection(indexOf);
        this.f21102aN.setText(this.f21131bl);
        int a = m29200a(this.f21132bm);
        if (a == -1) {
            a = 0;
        }
        this.f21104aP.setSelection(a);
        if (!C6592al.m31909b(this.f21138bs)) {
            this.f21109aU.setText(this.f21138bs);
        }
        if (!C6592al.m31909b(this.f21139bt)) {
            this.f21110aV.setText(this.f21139bt);
        }
        if (!C6592al.m31909b(this.f21134bo)) {
            this.f21105aQ.setText(this.f21134bo);
        }
        if (!C6592al.m31909b(this.f21135bp)) {
            this.f21106aR.setText(this.f21135bp);
        }
        if (this.f21136bq.isEmpty()) {
            this.f21107aS.setSelection(0);
        } else {
            this.f21107aS.setSelection(m29202a(this.f21136bq, this.f21118bD));
        }
        if (this.f21136bq.isEmpty()) {
            this.f21108aT.setSelection(0);
        } else {
            this.f21108aT.setSelection(m29202a(this.f21137br, this.f21119bE));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aF */
    public void m29224aF() {
        String str;
        TextView textView;
        double d = this.f21141bv;
        double d2 = this.f21145bz / 100.0d;
        Iterator it = this.f21120ba.iterator();
        double d3 = 0.0d;
        while (it.hasNext()) {
            C5331d dVar = (C5331d) it.next();
            double c = dVar.mo17492c();
            double k = (double) dVar.mo17521k();
            Double.isNaN(k);
            d3 += c * k;
        }
        double d4 = d2 * d3;
        if (this.f21130bk.equalsIgnoreCase(f21080ay)) {
            if (this.f21127bh.mo18816k()) {
                if (d3 <= this.f21143bx || this.f21143bx == 0.0d) {
                    d3 += d;
                    this.f21094aF.setText(C6644x.m32095a(this.f21144by, d));
                } else {
                    textView = this.f21094aF;
                    str = mo1219a(C5462k.order_free_delivery_field_title);
                }
            }
            double d5 = d3 + d4;
            this.f21096aH.setText(C6644x.m32095a(this.f21144by, d3));
            this.f21095aG.setText(C6644x.m32095a(this.f21144by, d4));
            this.f21097aI.setText(C6644x.m32095a(this.f21144by, d5));
        }
        textView = this.f21094aF;
        str = "--.--";
        textView.setText(str);
        double d52 = d3 + d4;
        this.f21096aH.setText(C6644x.m32095a(this.f21144by, d3));
        this.f21095aG.setText(C6644x.m32095a(this.f21144by, d4));
        this.f21097aI.setText(C6644x.m32095a(this.f21144by, d52));
    }

    /* access modifiers changed from: private */
    /* renamed from: aG */
    public void m29225aG() {
        this.f21128bi = this.f21098aJ.getText().toString();
        this.f21129bj = this.f21099aK.getText().toString();
        this.f21131bl = this.f21102aN.getText().toString();
        this.f21142bw = this.f21101aM.getText().toString();
        this.f21138bs = this.f21109aU.getText().toString();
        this.f21139bt = this.f21110aV.getText().toString();
        this.f21134bo = this.f21105aQ.getText().toString();
        this.f21135bp = this.f21106aR.getText().toString();
        this.f21136bq = this.f21118bD[this.f21107aS.getSelectedItemPosition()];
        this.f21137br = this.f21119bE[this.f21108aT.getSelectedItemPosition()];
    }

    /* renamed from: aH */
    private void m29226aH() {
        C0367h s = mo1318s();
        if (s != null) {
            SharedPreferences preferences = s.getPreferences(0);
            this.f21138bs = preferences.getString(f21067al, "");
            this.f21139bt = preferences.getString(f21068am, "");
            this.f21134bo = preferences.getString(f21063ah, "");
            this.f21135bp = preferences.getString(f21064ai, "");
            this.f21136bq = preferences.getString(f21065aj, "");
            this.f21137br = preferences.getString(f21066ak, "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aI */
    public void m29227aI() {
        m29225aG();
        C0367h s = mo1318s();
        if (s != null) {
            Editor edit = s.getPreferences(0).edit();
            edit.putString(f21067al, this.f21138bs);
            edit.putString(f21068am, this.f21139bt);
            edit.putString(f21063ah, this.f21134bo);
            edit.putString(f21064ai, this.f21135bp);
            edit.putString(f21065aj, this.f21136bq);
            edit.putString(f21066ak, this.f21137br);
            edit.commit();
        }
    }

    /* renamed from: aJ */
    private boolean m29228aJ() {
        this.f21140bu = ((C5331d) this.f21120ba.get(0)).mo17504i();
        Iterator it = this.f21120ba.iterator();
        while (it.hasNext()) {
            if (!((C5331d) it.next()).mo17504i().equalsIgnoreCase(this.f21140bu)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: aK */
    private void m29229aK() {
        C0367h s = mo1318s();
        if (s != null) {
            this.f21123bd = new ProgressDialog(s);
            this.f21123bd.setMessage(mo1320t().getText(C5462k.order_progress_dialog_message));
            this.f21123bd.setProgressStyle(0);
            this.f21123bd.setCancelable(false);
            this.f21123bd.setCanceledOnTouchOutside(false);
            this.f21123bd.setTitle(C5462k.order_progress_dialog_title);
        }
    }

    /* renamed from: aL */
    private void m29230aL() {
        C0367h s;
        int i;
        int i2;
        HashMap aQ = m29235aQ();
        if (aQ == null) {
            s = mo1318s();
            i = C5462k.error;
            i2 = this.f21116bB;
        } else {
            String a = m29206a((Map<String, String>) aQ);
            StringBuilder sb = new StringBuilder();
            sb.append(C5268b.m26280b(App.f18516r));
            sb.append("://");
            sb.append(App.f18516r);
            sb.append("/orderpaypalec.aspx?");
            sb.append(a);
            String sb2 = sb.toString();
            if (VERSION.SDK_INT < 15 || VERSION.SDK_INT > 18) {
                Intent intent = new Intent(mo1318s(), OrderPaypalActivity.class);
                intent.putExtra(OrderPaypalActivity.f21053n, sb2);
                mo1318s().startActivity(intent);
            } else if (!m29218a("com.android.chrome", (Context) mo1318s())) {
                s = mo1318s();
                i = C5462k.warning;
                i2 = C5462k.order_warning_message_install_chrome;
            } else {
                try {
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setData(Uri.parse(sb2));
                    mo1230a(intent2);
                } catch (Exception e) {
                    String str = f21058a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error: ");
                    sb3.append(e.getMessage());
                    Log.e(str, sb3.toString(), e);
                    C6620n.m32028a((Context) mo1318s(), C5462k.warning, C5462k.order_warning_message_enable_chrome);
                }
            }
            return;
        }
        C6620n.m32028a((Context) s, i, i2);
    }

    /* renamed from: aM */
    private boolean m29231aM() {
        int i;
        this.f21115bA = false;
        this.f21116bB = C5462k.order_error_message;
        if (this.f21120ba == null || this.f21120ba.size() == 0) {
            i = C5462k.order_info_message_there_are_no_any_products;
            this.f21116bB = i;
            C6620n.m32028a((Context) mo1318s(), C5462k.error, this.f21116bB);
        } else if (this.f21130bk.equalsIgnoreCase(f21079ax) && this.f21127bh.mo18817l() && !m29228aJ()) {
            i = C5462k.order_warning_message_different_pickup_addresses;
            this.f21116bB = i;
            C6620n.m32028a((Context) mo1318s(), C5462k.error, this.f21116bB);
        } else if (this.f21130bk.length() == 0 && this.f21127bh.mo18816k() && this.f21127bh.mo18817l()) {
            i = C5462k.order_delivey_method_required;
            this.f21116bB = i;
            C6620n.m32028a((Context) mo1318s(), C5462k.error, this.f21116bB);
        } else if (this.f21132bm.f21164b.length() != 0 && this.f21141bv >= 0.0d) {
            this.f21115bA = true;
        } else {
            i = C5462k.order_error_message_order_failed;
            this.f21116bB = i;
            C6620n.m32028a((Context) mo1318s(), C5462k.error, this.f21116bB);
        }
        return this.f21115bA;
    }

    /* renamed from: aN */
    private void m29232aN() {
        if (m29231aM()) {
            String n = this.f21127bh.mo18819n();
            if (C6592al.m31909b(n) || n.contains(" ")) {
                C6620n.m32028a((Context) mo1318s(), C5462k.order_paypal_invalid_merchant, C5462k.order_paypal_invalid_client_id);
                return;
            }
            if (this.f21125bf == null) {
                this.f21125bf = C6356b.m30880b();
                this.f21125bf.initialize(this, this.f21127bh.mo18818m(), this.f21127bh.mo18819n(), App.f18522x, App.f18523y, App.f18524z);
                this.f21125bf.addObserver(new Observer() {
                    public void update(Observable observable, Object obj) {
                        if (!(obj instanceof Boolean)) {
                            return;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            C6595ao.m31930a((Context) C5956a.this.mo1318s(), C5956a.this.mo1318s().getString(C5462k.order_info_message_order_was_successfully_processed), true);
                            C5956a.this.f21120ba.clear();
                            C5956a.this.f21122bc.notifyDataSetChanged();
                            C5956a.this.m29224aF();
                            C5956a.this.m29222aD();
                            return;
                        }
                        C6595ao.m31930a((Context) C5956a.this.mo1318s(), C5956a.this.mo1219a(C5462k.order_paypal_validation_failed), true);
                    }
                });
            }
            if (!C6356b.m30879a()) {
                C6595ao.m31930a((Context) mo1318s(), mo1219a(C5462k.order_paypal_library_not_available), true);
                return;
            }
            this.f21125bf.startService();
            this.f21125bf.clearProducts();
            this.f21125bf.setFreeShippingItemName(mo1219a(C5462k.order_paypal_item_free_shipping));
            Iterator it = this.f21120ba.iterator();
            while (it.hasNext()) {
                C5331d dVar = (C5331d) it.next();
                String a = dVar.mo17485a();
                if (!C6592al.m31909b(dVar.mo17505j())) {
                    a = String.format("%1s %2s%3s", new Object[]{a, mo1219a(C5462k.order_size_title), dVar.mo17505j()});
                }
                this.f21125bf.addProduct(a, dVar.mo17521k(), dVar.mo17490b(), this.f21144by, null);
                Iterator it2 = dVar.mo17494d().iterator();
                while (it2.hasNext()) {
                    C5329b bVar = (C5329b) it2.next();
                    this.f21125bf.addProduct(String.format("%1s (%2s)", new Object[]{dVar.mo17485a(), bVar.mo17509h()}), dVar.mo17521k(), bVar.mo17511i(), this.f21144by, null);
                }
            }
            this.f21125bf.addDeliveryAmount(this.f21127bh.mo18816k(), this.f21141bv, this.f21143bx);
            this.f21125bf.addTaxAmount(this.f21145bz);
            this.f21125bf.makePayment(this.f21144by, this.f21127bh.mo18820o(), this.f21129bj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aO */
    public void m29233aO() {
        m29225aG();
        if (this.f21132bm.equals(f21076au)) {
            m29230aL();
        } else if (this.f21132bm.equals(f21077av)) {
            m29232aN();
        } else if (this.f21132bm.equals(f21078aw)) {
            m29234aP();
        } else {
            this.f21123bd.show();
            new C5970b().execute(new Void[0]);
        }
    }

    /* renamed from: aP */
    private void m29234aP() {
        if (m29231aM()) {
            double d = this.f21141bv;
            double d2 = this.f21145bz / 100.0d;
            Iterator it = this.f21120ba.iterator();
            double d3 = 0.0d;
            while (it.hasNext()) {
                C5331d dVar = (C5331d) it.next();
                double c = dVar.mo17492c();
                double k = (double) dVar.mo17521k();
                Double.isNaN(k);
                d3 += c * k;
            }
            double d4 = d2 * d3;
            if (this.f21130bk.equalsIgnoreCase(f21080ay) && this.f21127bh.mo18816k() && (d3 <= this.f21143bx || this.f21143bx == 0.0d)) {
                d3 += d;
            }
            double d5 = d3 + d4;
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setDecimalSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            String format = decimalFormat.format(d5);
            Intent intent = new Intent(mo1318s(), IndiaPayActivity.class);
            C6000c cVar = new C6000c();
            cVar.mo18918c(format);
            cVar.mo18912a(this.f21127bh.mo18813h());
            cVar.mo18924e(this.f21144by);
            cVar.mo18935k(this.f21127bh.mo18814i());
            cVar.mo18921d(this.f21127bh.mo18815j());
            cVar.mo18919c(this.f21127bh.mo18816k() && f21080ay.equals(this.f21130bk));
            cVar.mo18952s(this.f21126bg);
            C6001d.m29442a().mo18962a(cVar);
            mo1230a(intent);
        }
    }

    /* renamed from: aQ */
    private HashMap<String, String> m29235aQ() {
        int i;
        String str;
        String str2;
        HashMap<String, String> hashMap = new HashMap<>(0);
        this.f21116bB = C5462k.order_error_message;
        if (this.f21120ba == null || this.f21120ba.size() == 0) {
            this.f21115bA = false;
            i = C5462k.order_info_message_there_are_no_any_products;
        } else {
            hashMap.put(f21082b, App.f18522x);
            hashMap.put(f21083c, App.f18523y);
            hashMap.put(f21084d, App.f18524z);
            hashMap.put("pageId", this.f21126bg);
            hashMap.put("action", "preloading");
            if (this.f21128bi.length() == 0) {
                this.f21115bA = false;
                i = C5462k.order_email_invalid;
            } else {
                hashMap.put(f21085e, this.f21128bi);
                if (this.f21142bw.length() == 0) {
                    this.f21115bA = false;
                    i = C5462k.order_phone_required;
                } else {
                    hashMap.put(f21086f, this.f21142bw);
                    if (this.f21130bk.equalsIgnoreCase(f21079ax) && this.f21127bh.mo18817l()) {
                        if (!m29228aJ()) {
                            this.f21115bA = false;
                            i = C5462k.order_warning_message_different_pickup_addresses;
                        } else {
                            hashMap.put(f21060ae, this.f21140bu);
                        }
                    }
                    if (this.f21130bk.length() != 0 || !this.f21127bh.mo18816k() || !this.f21127bh.mo18817l()) {
                        if (this.f21127bh.mo18816k() || this.f21127bh.mo18817l()) {
                            str2 = f21088h;
                            str = this.f21130bk;
                        } else {
                            str2 = f21088h;
                            str = f21081az;
                        }
                        hashMap.put(str2, str);
                        if (this.f21132bm.f21164b.length() != 0) {
                            hashMap.put(f21062ag, this.f21132bm.f21164b);
                            hashMap.put(f21087g, this.f21129bj);
                            if (this.f21141bv >= 0.0d) {
                                String str3 = f21061af;
                                StringBuilder sb = new StringBuilder();
                                sb.append("");
                                sb.append(this.f21141bv);
                                hashMap.put(str3, sb.toString());
                                Iterator it = this.f21120ba.iterator();
                                int i2 = 1;
                                while (it.hasNext()) {
                                    C5331d dVar = (C5331d) it.next();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(f21069an);
                                    sb2.append(i2);
                                    String sb3 = sb2.toString();
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("itemId");
                                    sb4.append(i2);
                                    hashMap.put(sb3, sb4.toString());
                                    String j = dVar.mo17505j();
                                    if (!(dVar.mo17505j() == null || dVar.mo17505j().length() == 0)) {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(" ");
                                        sb5.append(mo1219a(C5462k.order_size_title));
                                        sb5.append(dVar.mo17505j());
                                        j = sb5.toString();
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(f21070ao);
                                    sb6.append(i2);
                                    String sb7 = sb6.toString();
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append(dVar.mo17485a());
                                    sb8.append(j);
                                    hashMap.put(sb7, sb8.toString());
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(f21071ap);
                                    sb9.append(i2);
                                    String sb10 = sb9.toString();
                                    StringBuilder sb11 = new StringBuilder();
                                    sb11.append("");
                                    sb11.append(dVar.mo17490b());
                                    hashMap.put(sb10, sb11.toString());
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append(f21072aq);
                                    sb12.append(i2);
                                    String sb13 = sb12.toString();
                                    StringBuilder sb14 = new StringBuilder();
                                    sb14.append("");
                                    sb14.append(dVar.mo17521k());
                                    hashMap.put(sb13, sb14.toString());
                                    i2++;
                                    Iterator it2 = dVar.mo17494d().iterator();
                                    while (it2.hasNext()) {
                                        C5329b bVar = (C5329b) it2.next();
                                        StringBuilder sb15 = new StringBuilder();
                                        sb15.append(f21069an);
                                        sb15.append(i2);
                                        String sb16 = sb15.toString();
                                        StringBuilder sb17 = new StringBuilder();
                                        sb17.append("itemId");
                                        sb17.append(i2);
                                        hashMap.put(sb16, sb17.toString());
                                        StringBuilder sb18 = new StringBuilder();
                                        sb18.append(f21070ao);
                                        sb18.append(i2);
                                        String sb19 = sb18.toString();
                                        StringBuilder sb20 = new StringBuilder();
                                        sb20.append(dVar.mo17485a());
                                        sb20.append("(");
                                        sb20.append(bVar.mo17509h());
                                        sb20.append(")");
                                        hashMap.put(sb19, sb20.toString());
                                        StringBuilder sb21 = new StringBuilder();
                                        sb21.append(f21071ap);
                                        sb21.append(i2);
                                        String sb22 = sb21.toString();
                                        StringBuilder sb23 = new StringBuilder();
                                        sb23.append("");
                                        sb23.append(bVar.mo17511i());
                                        hashMap.put(sb22, sb23.toString());
                                        StringBuilder sb24 = new StringBuilder();
                                        sb24.append(f21072aq);
                                        sb24.append(i2);
                                        String sb25 = sb24.toString();
                                        StringBuilder sb26 = new StringBuilder();
                                        sb26.append("");
                                        sb26.append(dVar.mo17521k());
                                        hashMap.put(sb25, sb26.toString());
                                        i2++;
                                    }
                                }
                                return hashMap;
                            }
                        }
                        this.f21115bA = false;
                        i = C5462k.order_error_message_order_failed;
                    } else {
                        this.f21115bA = false;
                        i = C5462k.order_delivey_method_required;
                    }
                }
            }
        }
        this.f21116bB = i;
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: aR */
    public HashMap<String, String> m29236aR() {
        int i;
        HashMap<String, String> hashMap = new HashMap<>(0);
        if (this.f21120ba == null || this.f21120ba.size() == 0) {
            this.f21115bA = false;
            i = C5462k.order_info_message_there_are_no_any_products;
        } else {
            hashMap.put(f21082b, App.f18522x);
            hashMap.put(f21083c, App.f18523y);
            hashMap.put(f21084d, App.f18524z);
            hashMap.put("pageId", this.f21126bg);
            if (this.f21142bw.length() == 0) {
                this.f21115bA = false;
                i = C5462k.order_phone_required;
            } else {
                hashMap.put(f21086f, this.f21142bw);
                if (this.f21128bi.length() == 0) {
                    this.f21115bA = false;
                    i = C5462k.order_email_invalid;
                } else {
                    hashMap.put(f21085e, this.f21128bi);
                    hashMap.put(f21088h, this.f21130bk);
                    if (this.f21130bk.equalsIgnoreCase(f21079ax) && this.f21127bh.mo18817l()) {
                        if (!m29228aJ()) {
                            this.f21115bA = false;
                            i = C5462k.order_warning_message_different_pickup_addresses;
                        } else {
                            hashMap.put(f21060ae, this.f21140bu);
                        }
                    }
                    if (!this.f21127bh.mo18817l() && !this.f21127bh.mo18816k()) {
                        this.f21130bk = f21081az;
                    } else if (this.f21130bk.length() == 0) {
                        this.f21115bA = false;
                        i = C5462k.order_delivey_method_required;
                    }
                    hashMap.put(f21088h, this.f21130bk);
                    if (this.f21130bk.compareTo(f21080ay) == 0 && this.f21131bl.length() == 0 && this.f21127bh.mo18816k()) {
                        this.f21115bA = false;
                        i = C5462k.order_delivey_address_required;
                    } else {
                        hashMap.put(f21089i, this.f21131bl);
                        if (this.f21132bm.f21164b.length() != 0) {
                            hashMap.put(f21062ag, this.f21132bm.f21164b);
                            hashMap.put(f21087g, this.f21129bj);
                            if (this.f21141bv >= 0.0d || !this.f21127bh.mo18816k()) {
                                String str = f21061af;
                                StringBuilder sb = new StringBuilder();
                                sb.append("");
                                sb.append(this.f21141bv);
                                hashMap.put(str, sb.toString());
                                int i2 = 1;
                                if (this.f21132bm.equals(f21075at)) {
                                    if (this.f21138bs.length() == 0) {
                                        this.f21115bA = false;
                                        i = C5462k.order_first_name_required;
                                    } else {
                                        hashMap.put(f21067al, this.f21138bs);
                                        if (this.f21139bt.length() == 0) {
                                            this.f21115bA = false;
                                            i = C5462k.order_last_name_required;
                                        } else {
                                            hashMap.put(f21068am, this.f21139bt);
                                            if (this.f21134bo.length() == 0) {
                                                this.f21115bA = false;
                                                i = C5462k.order_card_number_required;
                                            } else {
                                                hashMap.put(f21063ah, this.f21134bo);
                                                if (this.f21135bp.length() == 0) {
                                                    this.f21115bA = false;
                                                    i = C5462k.order_security_code_invalid;
                                                } else {
                                                    hashMap.put(f21064ai, this.f21135bp);
                                                    String str2 = f21065aj;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(m29202a(this.f21136bq, this.f21118bD) + 1);
                                                    sb2.append("");
                                                    hashMap.put(str2, sb2.toString());
                                                    hashMap.put(f21066ak, this.f21137br);
                                                }
                                            }
                                        }
                                    }
                                }
                                Iterator it = this.f21120ba.iterator();
                                while (it.hasNext()) {
                                    C5331d dVar = (C5331d) it.next();
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(f21069an);
                                    sb3.append(i2);
                                    String sb4 = sb3.toString();
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("itemId");
                                    sb5.append(i2);
                                    hashMap.put(sb4, sb5.toString());
                                    String j = dVar.mo17505j();
                                    if (!(dVar.mo17505j() == null && dVar.mo17505j().length() == 0)) {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(" ");
                                        sb6.append(mo1219a(C5462k.order_size_title));
                                        sb6.append(dVar.mo17505j());
                                        j = sb6.toString();
                                    }
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(f21070ao);
                                    sb7.append(i2);
                                    String sb8 = sb7.toString();
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(dVar.mo17485a());
                                    sb9.append(j);
                                    hashMap.put(sb8, sb9.toString());
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append(f21071ap);
                                    sb10.append(i2);
                                    String sb11 = sb10.toString();
                                    StringBuilder sb12 = new StringBuilder();
                                    sb12.append("");
                                    sb12.append(dVar.mo17490b());
                                    hashMap.put(sb11, sb12.toString());
                                    StringBuilder sb13 = new StringBuilder();
                                    sb13.append(f21072aq);
                                    sb13.append(i2);
                                    String sb14 = sb13.toString();
                                    StringBuilder sb15 = new StringBuilder();
                                    sb15.append("");
                                    sb15.append(dVar.mo17521k());
                                    hashMap.put(sb14, sb15.toString());
                                    i2++;
                                    Iterator it2 = dVar.mo17494d().iterator();
                                    while (it2.hasNext()) {
                                        C5329b bVar = (C5329b) it2.next();
                                        StringBuilder sb16 = new StringBuilder();
                                        sb16.append(f21069an);
                                        sb16.append(i2);
                                        String sb17 = sb16.toString();
                                        StringBuilder sb18 = new StringBuilder();
                                        sb18.append("itemId");
                                        sb18.append(i2);
                                        hashMap.put(sb17, sb18.toString());
                                        StringBuilder sb19 = new StringBuilder();
                                        sb19.append(f21070ao);
                                        sb19.append(i2);
                                        String sb20 = sb19.toString();
                                        StringBuilder sb21 = new StringBuilder();
                                        sb21.append(dVar.mo17485a());
                                        sb21.append("(");
                                        sb21.append(bVar.mo17509h());
                                        sb21.append(")");
                                        hashMap.put(sb20, sb21.toString());
                                        StringBuilder sb22 = new StringBuilder();
                                        sb22.append(f21071ap);
                                        sb22.append(i2);
                                        String sb23 = sb22.toString();
                                        StringBuilder sb24 = new StringBuilder();
                                        sb24.append("");
                                        sb24.append(bVar.mo17511i());
                                        hashMap.put(sb23, sb24.toString());
                                        StringBuilder sb25 = new StringBuilder();
                                        sb25.append(f21072aq);
                                        sb25.append(i2);
                                        String sb26 = sb25.toString();
                                        StringBuilder sb27 = new StringBuilder();
                                        sb27.append("");
                                        sb27.append(dVar.mo17521k());
                                        hashMap.put(sb26, sb27.toString());
                                        i2++;
                                    }
                                }
                                return hashMap;
                            }
                        }
                        this.f21115bA = false;
                        i = C5462k.order_error_message_order_failed;
                    }
                }
            }
        }
        this.f21116bB = i;
        return null;
    }

    /* renamed from: aS */
    private ArrayList<String> m29237aS() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f21127bh.mo18817l()) {
            arrayList.add(mo1219a(C5462k.order_delivery_method_pickup));
        }
        if (this.f21127bh.mo18816k()) {
            arrayList.add(mo1219a(C5462k.order_delivery_method_delivery));
        }
        return arrayList;
    }

    /* renamed from: aT */
    private ArrayList<String> m29238aT() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f21127bh.mo18817l()) {
            arrayList.add(f21079ax);
        }
        if (this.f21127bh.mo18816k()) {
            arrayList.add(f21080ay);
        }
        return arrayList;
    }

    /* renamed from: aU */
    private ArrayList<C5969a> m29239aU() {
        ArrayList<C5969a> arrayList = new ArrayList<>();
        int d = this.f21127bh.mo18808d();
        if ((d & 1) == 1) {
            arrayList.add(new C5969a(f21073ar, mo1219a(C5462k.order_payment_method_cash)));
        }
        if ((d & 32) == 32) {
            arrayList.add(new C5969a(f21074as, mo1219a(C5462k.order_payment_method_cashPOD)));
        }
        if ((d & 2) == 2) {
            arrayList.add(new C5969a(f21075at, mo1219a(C5462k.order_payment_method_credit_card)));
        }
        if ((d & 4) == 4) {
            String str = "%1s%2s";
            Object[] objArr = new Object[2];
            objArr[0] = mo1219a(C5462k.order_payment_method_paypal);
            objArr[1] = this.f21127bh.mo18818m() ? " (Sandbox)" : "";
            arrayList.add(new C5969a(f21076au, String.format(str, objArr)));
        }
        if ((d & 16) == 16) {
            String str2 = "%1s%2s";
            Object[] objArr2 = new Object[2];
            objArr2[0] = mo1219a(C5462k.order_payment_method_paypal_sdk);
            objArr2[1] = this.f21127bh.mo18818m() ? " (Sandbox)" : "";
            arrayList.add(new C5969a(f21077av, String.format(str2, objArr2)));
        }
        if ((d & 64) == 64) {
            arrayList.add(new C5969a(f21078aw, mo1219a(C5462k.order_payment_method_indiapay)));
        }
        return arrayList;
    }

    /* renamed from: b */
    private C5331d m29243b(EditText editText) {
        Object tag = editText.getTag();
        if (tag != null && (tag instanceof Integer)) {
            int intValue = ((Integer) tag).intValue();
            if (intValue >= 0 && intValue < this.f21120ba.size()) {
                return (C5331d) this.f21120ba.get(intValue);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m29246b(Spinner spinner) {
        Resources t = mo1320t();
        ArrayList aU = m29239aU();
        final C5969a[] aVarArr = (C5969a[]) aU.toArray(new C5969a[aU.size()]);
        C0367h s = mo1318s();
        if (s != null) {
            C59667 r2 = new ArrayAdapter<C5969a>(s, 17367048, aVarArr) {
                public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    View dropDownView = super.getDropDownView(i, view, viewGroup);
                    TextView textView = (TextView) dropDownView;
                    textView.setText(aVarArr[i].f21165c);
                    C6593am.m31915a(textView, C5956a.this.f21124be);
                    return dropDownView;
                }

                public View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    TextView textView = (TextView) view2;
                    textView.setText(aVarArr[i].f21165c);
                    C6593am.m31915a(textView, C5956a.this.f21124be);
                    return view2;
                }
            };
            this.f21133bn = r2;
            this.f21133bn.setDropDownViewResource(17367049);
            spinner.setAdapter(this.f21133bn);
            spinner.setPrompt(t.getString(C5462k.order_choose_payment_method_promt));
            spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                    /*
                        r0 = this;
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a r2 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.ArrayAdapter r2 = r2.f21133bn
                        java.lang.Object r2 = r2.getItem(r3)
                        com.seattleclouds.modules.order.a$a r2 = (com.seattleclouds.modules.order.C5956a.C5969a) r2
                        r1.f21132bm = r2
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r2 = com.seattleclouds.modules.order.C5956a.f21073ar
                        boolean r1 = r1.equals(r2)
                        r2 = 0
                        r3 = 8
                        if (r1 == 0) goto L_0x0038
                    L_0x0024:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21112aX
                        r1.setVisibility(r3)
                    L_0x002d:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21111aW
                        r1.setVisibility(r2)
                        goto L_0x00a8
                    L_0x0038:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21074as
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L_0x0049
                        goto L_0x0024
                    L_0x0049:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21075at
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L_0x0063
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21112aX
                        r1.setVisibility(r2)
                        goto L_0x002d
                    L_0x0063:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21076au
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L_0x0074
                        goto L_0x0024
                    L_0x0074:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21077av
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L_0x0097
                    L_0x0084:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21112aX
                        r1.setVisibility(r3)
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21111aW
                        r1.setVisibility(r3)
                        goto L_0x00a8
                    L_0x0097:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r1 = r1.f21132bm
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21078aw
                        boolean r1 = r1.equals(r4)
                        if (r1 == 0) goto L_0x00a8
                        goto L_0x0084
                    L_0x00a8:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        java.lang.String r1 = r1.f21130bk
                        java.lang.String r4 = com.seattleclouds.modules.order.C5956a.f21080ay
                        if (r1 != r4) goto L_0x00ef
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.LinearLayout r1 = r1.f21113aY
                        com.seattleclouds.modules.order.a r4 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r4 = r4.f21132bm
                        java.lang.String r5 = com.seattleclouds.modules.order.C5956a.f21076au
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L_0x00ea
                        com.seattleclouds.modules.order.a r4 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r4 = r4.f21132bm
                        java.lang.String r5 = com.seattleclouds.modules.order.C5956a.f21077av
                        boolean r4 = r4.equals(r5)
                        if (r4 != 0) goto L_0x00ea
                        com.seattleclouds.modules.order.a r4 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a$a r4 = r4.f21132bm
                        java.lang.String r5 = com.seattleclouds.modules.order.C5956a.f21078aw
                        boolean r4 = r4.equals(r5)
                        if (r4 == 0) goto L_0x00ec
                    L_0x00ea:
                        r2 = 8
                    L_0x00ec:
                        r1.setVisibility(r2)
                    L_0x00ef:
                        com.seattleclouds.modules.order.a r1 = com.seattleclouds.modules.order.C5956a.this
                        com.seattleclouds.modules.order.a r2 = com.seattleclouds.modules.order.C5956a.this
                        android.widget.Spinner r2 = r2.f21100aL
                        r1.m29212a(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.order.C5956a.C59678.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
        }
    }

    /* renamed from: c */
    private int m29249c(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 0) {
                return 0;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29253c(EditText editText) {
        String obj = editText.getText().toString();
        int c = m29249c(obj);
        if (c == 0) {
            m29213a(m29243b(editText));
            return;
        }
        String num = Integer.toString(c);
        if (!num.equals(obj)) {
            editText.setText(num);
        }
    }

    /* renamed from: c */
    private void m29254c(Spinner spinner) {
        C0367h s = mo1318s();
        if (s != null) {
            C59689 r1 = new ArrayAdapter<String>(s, 17367048, this.f21118bD) {
                public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    View dropDownView = super.getDropDownView(i, view, viewGroup);
                    C6593am.m31915a((TextView) dropDownView, C5956a.this.f21124be);
                    return dropDownView;
                }

                public View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    C6593am.m31915a((TextView) view2, C5956a.this.f21124be);
                    return view2;
                }
            };
            r1.setDropDownViewResource(17367049);
            spinner.setAdapter(r1);
            spinner.setPrompt(mo1320t().getString(C5462k.order_exp_month_spinner_promt));
            spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C5956a.this.f21136bq = C5956a.this.f21118bD[i];
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m29258d(String str) {
        Resources t;
        int i;
        if (str == null) {
            str = "";
        }
        if (str.equalsIgnoreCase("Email is required.")) {
            t = mo1320t();
            i = C5462k.order_email_required;
        } else if (str.equalsIgnoreCase("Delivery method is required.")) {
            t = mo1320t();
            i = C5462k.order_delivey_method_required;
        } else if (str.equalsIgnoreCase("Delivery address is required.")) {
            t = mo1320t();
            i = C5462k.order_delivey_address_required;
        } else if (str.equalsIgnoreCase("Card number is required.")) {
            t = mo1320t();
            i = C5462k.order_card_number_required;
        } else if (str.equalsIgnoreCase("The credit card number is invalid.")) {
            t = mo1320t();
            i = C5462k.order_card_invalid;
        } else if (str.equalsIgnoreCase("Card security code is required.")) {
            t = mo1320t();
            i = C5462k.order_security_code_required;
        } else if (str.equalsIgnoreCase("The card code is invalid.")) {
            t = mo1320t();
            i = C5462k.order_security_code_invalid;
        } else if (str.equalsIgnoreCase("First name is required.")) {
            t = mo1320t();
            i = C5462k.order_first_name_required;
        } else if (str.equalsIgnoreCase("Last name is required.")) {
            t = mo1320t();
            i = C5462k.order_last_name_required;
        } else if (str.equalsIgnoreCase("Credit card expiration date is invalid.")) {
            t = mo1320t();
            i = C5462k.order_invalid_date;
        } else if (str.equalsIgnoreCase("The credit card has expired.")) {
            t = mo1320t();
            i = C5462k.order_card_expired;
        } else if (!str.equalsIgnoreCase("Email address is invalid")) {
            return str;
        } else {
            t = mo1320t();
            i = C5462k.order_email_invalid;
        }
        return t.getString(i);
    }

    /* renamed from: d */
    private void m29259d(Spinner spinner) {
        C0367h s = mo1318s();
        if (s != null) {
            C59612 r1 = new ArrayAdapter<String>(s, 17367048, this.f21119bE) {
                public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    View dropDownView = super.getDropDownView(i, view, viewGroup);
                    C6593am.m31915a((TextView) dropDownView, C5956a.this.f21124be);
                    return dropDownView;
                }

                public View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    C6593am.m31915a((TextView) view2, C5956a.this.f21124be);
                    return view2;
                }
            };
            r1.setDropDownViewResource(17367049);
            spinner.setAdapter(r1);
            spinner.setPrompt(mo1320t().getString(C5462k.order_exp_month_spinner_promt));
            spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C5956a.this.f21137br = C5956a.this.f21119bE[i];
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
        }
    }

    /* renamed from: e */
    private void m29262e(int i) {
        C0367h s = mo1318s();
        if (s != null) {
            Window window = s.getWindow();
            if (window != null) {
                this.f21117bC = m29199a(window);
                if (i != this.f21117bC) {
                    m29208a(window, i);
                }
            }
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21121bb = layoutInflater;
        m29207a(viewGroup);
        this.f21091aC.setAdapter(this.f21122bc);
        m29222aD();
        m29224aF();
        if (bundle != null) {
            this.f21142bw = bundle.getString(f21086f);
            this.f21128bi = bundle.getString(f21085e);
            this.f21129bj = bundle.getString(f21087g);
            this.f21130bk = bundle.getString(f21088h);
            this.f21131bl = bundle.getString(f21089i);
            this.f21132bm.f21164b = bundle.getString(f21062ag);
            this.f21138bs = bundle.getString(f21067al);
            this.f21139bt = bundle.getString(f21068am);
            this.f21134bo = bundle.getString(f21063ah);
            this.f21135bp = bundle.getString(f21064ai);
            this.f21136bq = bundle.getString(f21065aj);
            this.f21137br = bundle.getString(f21066ak);
            this.f21101aM.setText(this.f21142bw);
            this.f21098aJ.setText(this.f21128bi);
            this.f21099aK.setText(this.f21129bj);
            this.f21102aN.setText(this.f21131bl);
            this.f21109aU.setText(this.f21138bs);
            this.f21110aV.setText(this.f21139bt);
            this.f21105aQ.setText(this.f21134bo);
            this.f21106aR.setText(this.f21135bp);
        }
        m29223aE();
        return this.f21090aB;
    }

    /* renamed from: a */
    public View mo18827a(View view, C5329b bVar) {
        C5973e eVar;
        if (view == 0 || !C5971c.class.isInstance(view)) {
            r6 = (ViewGroup) this.f21121bb.inflate(C5460i.order_subitem_cell, null);
            eVar = new C5973e((TextView) r6.findViewById(C5458g.order_product_subitem_name), (TextView) r6.findViewById(C5458g.order_product_subitem_price));
            r6.setTag(eVar);
            r6 = r6;
        } else {
            eVar = (C5973e) view.getTag();
            r6 = view;
        }
        eVar.f21173a.setText(bVar.mo17509h());
        eVar.f21174b.setText(C6644x.m32095a(this.f21144by, bVar.mo17511i()));
        C6593am.m31915a(eVar.f21173a, this.f21124be);
        C6593am.m31915a(eVar.f21174b, this.f21124be);
        return r6;
    }

    /* renamed from: a */
    public View mo18828a(View view, C5331d dVar, int i) {
        C5971c cVar;
        if (view == 0 || !C5971c.class.isInstance(view)) {
            r6 = (ViewGroup) this.f21121bb.inflate(C5460i.order_item_cell, null);
            cVar = new C5971c((TextView) r6.findViewById(C5458g.order_product_item_name), (TextView) r6.findViewById(C5458g.order_product_item_detail), (TextView) r6.findViewById(C5458g.order_product_item_price), (EditText) r6.findViewById(C5458g.order_product_item_quantity_edit));
            r6.setTag(cVar);
            C6593am.m31915a(cVar.f21169b, this.f21124be);
            C6593am.m31915a(cVar.f21168a, this.f21124be);
            C6593am.m31915a(cVar.f21170c, this.f21124be);
            r6 = r6;
        } else {
            cVar = (C5971c) view.getTag();
            r6 = view;
        }
        cVar.f21168a.setText(dVar.mo17485a());
        cVar.f21169b.setText(dVar.mo17505j());
        cVar.f21171d.setTag(Integer.valueOf(i));
        m29211a(cVar.f21171d, dVar.mo17521k());
        cVar.f21170c.setText(C6644x.m32095a(this.f21144by, dVar.mo17490b()));
        return r6;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (this.f21125bf == null || !this.f21125bf.onActivityResult(i, i2, intent)) {
            super.mo1222a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f21126bg = m.getString("pageId");
            this.f21127bh = (OrderConfigInfo) m.getParcelable("ORDER_INFO");
            this.f21124be = m.getBundle("PAGE_STYLE");
        }
        this.f21141bv = this.f21127bh.mo18810e();
        this.f21143bx = this.f21127bh.mo18811f();
        this.f21145bz = this.f21127bh.mo18803a();
        this.f21144by = this.f21127bh.mo18812g();
        this.f21122bc = new C5972d();
        m29229aK();
        this.f21120ba = App.f18489V.mo17518b();
        if (bundle == null) {
            m29226aH();
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m29262e(32);
        } else {
            m29221aC();
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        if (mo1193C()) {
            m29225aG();
        }
        bundle.putString(f21086f, this.f21142bw);
        bundle.putString(f21085e, this.f21128bi);
        bundle.putString(f21087g, this.f21129bj);
        bundle.putString(f21088h, this.f21130bk);
        bundle.putString(f21089i, this.f21131bl);
        bundle.putString(f21062ag, this.f21132bm.f21164b);
        bundle.putString(f21067al, this.f21138bs);
        bundle.putString(f21068am, this.f21139bt);
        bundle.putString(f21063ah, this.f21134bo);
        bundle.putString(f21064ai, this.f21135bp);
        bundle.putString(f21065aj, this.f21136bq);
        bundle.putString(f21066ak, this.f21137br);
        super.mo1282e(bundle);
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        this.f21122bc.notifyDataSetChanged();
        m29224aF();
    }

    /* renamed from: h */
    public void mo1292h() {
        super.mo1292h();
        m29227aI();
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f21125bf != null) {
            this.f21125bf.stopService();
            this.f21125bf = null;
        }
        m29225aG();
        super.mo1296i();
    }
}
