package com.seattleclouds.previewer.appmart.order.p189a;

import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.previewer.appmart.order.p190b.C6388a;

/* renamed from: com.seattleclouds.previewer.appmart.order.a.c */
public class C6385c extends C0926a<C6386a> {

    /* renamed from: a */
    private C6388a f22666a = C6388a.m31014a();

    /* renamed from: b */
    private Integer[] f22667b = {Integer.valueOf(C5457f.ic_perm_identity_black_new_order), Integer.valueOf(C5457f.ic_call_new_order), Integer.valueOf(C5457f.ic_mail_black_new_order), Integer.valueOf(C5457f.ic_location_on_new_order), Integer.valueOf(C5457f.ic_public_new_order), Integer.valueOf(C5457f.ic_memberid_new_order), Integer.valueOf(C5457f.ic_phone_new_order), Integer.valueOf(C5457f.ic_invert_colors_new_order), Integer.valueOf(C5457f.ic_chat_new_order), Integer.valueOf(C5457f.ic_attach_file_new_order)};

    /* renamed from: com.seattleclouds.previewer.appmart.order.a.c$a */
    public static class C6386a extends C0958w {

        /* renamed from: A */
        public RelativeLayout f22668A;

        /* renamed from: B */
        public TextView f22669B;

        /* renamed from: C */
        public TextView f22670C;

        /* renamed from: D */
        public RelativeLayout f22671D;

        /* renamed from: E */
        public TextView f22672E;

        /* renamed from: n */
        public ImageView f22673n;

        /* renamed from: o */
        public View f22674o;

        /* renamed from: p */
        public TextView f22675p;

        /* renamed from: q */
        public TextView f22676q;

        /* renamed from: r */
        public RelativeLayout f22677r;

        /* renamed from: s */
        public TextView f22678s;

        /* renamed from: t */
        public TextView f22679t;

        /* renamed from: u */
        public RelativeLayout f22680u;

        /* renamed from: v */
        public TextView f22681v;

        /* renamed from: w */
        public TextView f22682w;

        /* renamed from: x */
        public RelativeLayout f22683x;

        /* renamed from: y */
        public TextView f22684y;

        /* renamed from: z */
        public TextView f22685z;

        public C6386a(View view) {
            super(view);
            this.f22673n = (ImageView) view.findViewById(C5458g.image_view_list_item1_fragment_summary);
            this.f22674o = view.findViewById(C5458g.divide_list_item);
            this.f22675p = (TextView) view.findViewById(C5458g.text_view_list_item1_fragment_summary);
            this.f22676q = (TextView) view.findViewById(C5458g.description_text_view_list_item1_fragment_summary);
            this.f22677r = (RelativeLayout) view.findViewById(C5458g.description_list_item1);
            this.f22678s = (TextView) view.findViewById(C5458g.text_view_list_item2_fragment_summary);
            this.f22679t = (TextView) view.findViewById(C5458g.description_text_view_list_item2_fragment_summary);
            this.f22680u = (RelativeLayout) view.findViewById(C5458g.description_list_item2);
            this.f22681v = (TextView) view.findViewById(C5458g.text_view_list_item3_fragment_summary);
            this.f22682w = (TextView) view.findViewById(C5458g.description_text_view_list_item3_fragment_summary);
            this.f22683x = (RelativeLayout) view.findViewById(C5458g.description_list_item3);
            this.f22684y = (TextView) view.findViewById(C5458g.text_view_list_item4_fragment_summary);
            this.f22685z = (TextView) view.findViewById(C5458g.description_text_view_list_item4_fragment_summary);
            this.f22668A = (RelativeLayout) view.findViewById(C5458g.description_list_item4);
            this.f22669B = (TextView) view.findViewById(C5458g.text_view_list_item5_fragment_summary);
            this.f22670C = (TextView) view.findViewById(C5458g.description_text_view_list_item5_fragment_summary);
            this.f22671D = (RelativeLayout) view.findViewById(C5458g.description_list_item5);
            this.f22672E = (TextView) view.findViewById(C5458g.summary_new_order);
        }
    }

    /* renamed from: a */
    private void m31005a(C6386a aVar, int i, int i2, int i3, int i4, int i5, int i6) {
        aVar.f22677r.setVisibility(i);
        aVar.f22680u.setVisibility(i2);
        aVar.f22683x.setVisibility(i3);
        aVar.f22668A.setVisibility(i4);
        aVar.f22671D.setVisibility(i5);
        aVar.f22674o.setVisibility(i6);
    }

    /* renamed from: a */
    public int mo342a() {
        return this.f22667b.length;
    }

    /* renamed from: a */
    public C6386a mo353b(ViewGroup viewGroup, int i) {
        return new C6386a(LayoutInflater.from(viewGroup.getContext()).inflate(C5460i.fragment_new_order_summary_list_item, viewGroup, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01af, code lost:
        r14.setText(r0);
        r4 = 0;
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b5, code lost:
        r4 = 8;
        r9 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b9, code lost:
        m31005a(r13, r4, 8, 8, 8, 8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02fe, code lost:
        r14.setText(r0);
        r3 = 0;
        r4 = 0;
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0305, code lost:
        m31005a(r13, r3, r4, r5, 8, 8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo350a(com.seattleclouds.previewer.appmart.order.p189a.C6385c.C6386a r13, int r14) {
        /*
            r12 = this;
            r0 = 8
            r1 = 0
            if (r14 == 0) goto L_0x000b
            android.widget.TextView r2 = r13.f22672E
            r2.setVisibility(r0)
            goto L_0x0010
        L_0x000b:
            android.widget.TextView r2 = r13.f22672E
            r2.setVisibility(r1)
        L_0x0010:
            switch(r14) {
                case 0: goto L_0x02d0;
                case 1: goto L_0x02a1;
                case 2: goto L_0x0272;
                case 3: goto L_0x022a;
                case 4: goto L_0x01f9;
                case 5: goto L_0x01c8;
                case 6: goto L_0x018b;
                case 7: goto L_0x00c7;
                case 8: goto L_0x0047;
                case 9: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x030f
        L_0x0015:
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19933v()
            if (r2 == 0) goto L_0x01b5
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19933v()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01b5
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r2 = r12.f22667b
            r14 = r2[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19933v()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_summary_logo_upload
            goto L_0x01af
        L_0x0047:
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19921p()
            if (r2 == 0) goto L_0x007d
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19921p()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x007d
            android.widget.ImageView r2 = r13.f22673n
            java.lang.Integer[] r3 = r12.f22667b
            r3 = r3[r14]
            int r3 = r3.intValue()
            r2.setImageResource(r3)
            android.widget.TextView r2 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r3 = r12.f22666a
            java.lang.String r3 = r3.mo19921p()
            r2.setText(r3)
            android.widget.TextView r2 = r13.f22676q
            int r3 = com.seattleclouds.C5451m.C5462k.new_order_summary_additional_requirements
            r2.setText(r3)
            r2 = 0
            r6 = 0
            goto L_0x0081
        L_0x007d:
            r2 = 8
            r6 = 8
        L_0x0081:
            com.seattleclouds.previewer.appmart.order.b.a r3 = r12.f22666a
            java.lang.String r3 = r3.mo19923q()
            if (r3 == 0) goto L_0x00b7
            com.seattleclouds.previewer.appmart.order.b.a r3 = r12.f22666a
            java.lang.String r3 = r3.mo19923q()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00b7
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r2 = r12.f22667b
            r14 = r2[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19923q()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22679t
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_summary_notes
            r14.setText(r0)
            r7 = 0
            r11 = 0
            goto L_0x00ba
        L_0x00b7:
            r11 = r2
            r7 = 8
        L_0x00ba:
            r8 = 8
            r9 = 8
            r10 = 8
            r4 = r12
            r5 = r13
            r4.m31005a(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x030f
        L_0x00c7:
            android.widget.ImageView r2 = r13.f22673n
            java.lang.Integer[] r3 = r12.f22667b
            r14 = r3[r14]
            int r14 = r14.intValue()
            r2.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19925r()
            r14.setText(r2)
            android.widget.TextView r14 = r13.f22676q
            int r2 = com.seattleclouds.C5451m.C5462k.new_order_summary_template
            r14.setText(r2)
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19927s()
            if (r14 == 0) goto L_0x010e
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19927s()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x010e
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19927s()
            r14.setText(r2)
            android.widget.TextView r14 = r13.f22679t
            int r2 = com.seattleclouds.C5451m.C5462k.new_order_summary_theme
            r14.setText(r2)
            r6 = 0
            goto L_0x0110
        L_0x010e:
            r6 = 8
        L_0x0110:
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19931u()
            if (r14 == 0) goto L_0x0138
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19931u()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0138
            android.widget.TextView r14 = r13.f22681v
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19931u()
            r14.setText(r2)
            android.widget.TextView r14 = r13.f22682w
            int r2 = com.seattleclouds.C5451m.C5462k.new_order_design_accent_color
            r14.setText(r2)
            r7 = 0
            goto L_0x013a
        L_0x0138:
            r7 = 8
        L_0x013a:
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19929t()
            if (r14 == 0) goto L_0x0162
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19929t()
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0162
            android.widget.TextView r14 = r13.f22684y
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19929t()
            r14.setText(r2)
            android.widget.TextView r14 = r13.f22685z
            int r2 = com.seattleclouds.C5451m.C5462k.new_order_design_primary_color
            r14.setText(r2)
            r8 = 0
            goto L_0x0164
        L_0x0162:
            r8 = 8
        L_0x0164:
            com.seattleclouds.previewer.appmart.order.b.a r14 = r12.f22666a
            java.lang.String r14 = r14.mo19855E()
            if (r14 == 0) goto L_0x0180
            android.widget.TextView r14 = r13.f22669B
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19855E()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22670C
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_features_step
            r14.setText(r0)
            r9 = 0
            goto L_0x0182
        L_0x0180:
            r9 = 8
        L_0x0182:
            r5 = 0
            r10 = 0
            r3 = r12
            r4 = r13
            r3.m31005a(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x030f
        L_0x018b:
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19919o()
            if (r2 == 0) goto L_0x01b5
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r2 = r12.f22667b
            r14 = r2[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19919o()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_summary_device_type
        L_0x01af:
            r14.setText(r0)
            r4 = 0
            r9 = 0
            goto L_0x01b9
        L_0x01b5:
            r4 = 8
            r9 = 8
        L_0x01b9:
            r5 = 8
            r6 = 8
            r7 = 8
            r8 = 8
            r2 = r12
            r3 = r13
            r2.m31005a(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x030f
        L_0x01c8:
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19917n()
            if (r2 == 0) goto L_0x01b5
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19917n()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01b5
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r2 = r12.f22667b
            r14 = r2[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19917n()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_we_chat_id
            goto L_0x01af
        L_0x01f9:
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19915m()
            if (r2 == 0) goto L_0x01b5
            com.seattleclouds.previewer.appmart.order.b.a r2 = r12.f22666a
            java.lang.String r2 = r2.mo19915m()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01b5
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r2 = r12.f22667b
            r14 = r2[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19915m()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_company_website
            goto L_0x01af
        L_0x022a:
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r1 = r12.f22667b
            r14 = r1[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19909j()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_company_address
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19911k()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22679t
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_country
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22681v
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19913l()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22682w
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_language
            r14.setText(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            goto L_0x0305
        L_0x0272:
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r1 = r12.f22667b
            r14 = r1[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19899e()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_email
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19907i()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22679t
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_company_email
            goto L_0x02fe
        L_0x02a1:
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r1 = r12.f22667b
            r14 = r1[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19901f()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_phone_number
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19905h()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22679t
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_company_phone_number
            goto L_0x02fe
        L_0x02d0:
            android.widget.ImageView r0 = r13.f22673n
            java.lang.Integer[] r1 = r12.f22667b
            r14 = r1[r14]
            int r14 = r14.intValue()
            r0.setImageResource(r14)
            android.widget.TextView r14 = r13.f22675p
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19896d()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22676q
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_name
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22678s
            com.seattleclouds.previewer.appmart.order.b.a r0 = r12.f22666a
            java.lang.String r0 = r0.mo19903g()
            r14.setText(r0)
            android.widget.TextView r14 = r13.f22679t
            int r0 = com.seattleclouds.C5451m.C5462k.new_order_information_owner_company_name
        L_0x02fe:
            r14.setText(r0)
            r3 = 0
            r4 = 0
            r5 = 8
        L_0x0305:
            r6 = 8
            r7 = 8
            r8 = 0
            r1 = r12
            r2 = r13
            r1.m31005a(r2, r3, r4, r5, r6, r7, r8)
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.appmart.order.p189a.C6385c.mo350a(com.seattleclouds.previewer.appmart.order.a.c$a, int):void");
    }
}
