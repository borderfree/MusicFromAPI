package com.seattleclouds.previewer.appmart.order.colorpickerpalette;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.previewer.appmart.order.C6387b;
import com.seattleclouds.previewer.appmart.order.colorpickerpalette.C6445b.C6446a;

/* renamed from: com.seattleclouds.previewer.appmart.order.colorpickerpalette.a */
public class C6443a extends C0366g implements C6446a {

    /* renamed from: ae */
    protected C0765d f22911ae;

    /* renamed from: af */
    protected C6446a f22912af;

    /* renamed from: ag */
    private int f22913ag = C5462k.new_order_design_accent_color;

    /* renamed from: ah */
    private int[] f22914ah = null;

    /* renamed from: ai */
    private String[] f22915ai = null;

    /* renamed from: aj */
    private int f22916aj;

    /* renamed from: ak */
    private int f22917ak;

    /* renamed from: al */
    private int f22918al;

    /* renamed from: am */
    private NewOrderColorPickerPalette f22919am;

    /* renamed from: a */
    public static C6443a m31235a(int i, int[] iArr, int i2, int i3, int i4) {
        C6443a aVar = new C6443a();
        aVar.mo20081b(i, iArr, i2, i3, i4);
        return aVar;
    }

    /* renamed from: as */
    private void m31236as() {
        if (this.f22919am != null && this.f22914ah != null) {
            this.f22919am.mo20078a(this.f22914ah, this.f22916aj, this.f22915ai);
        }
    }

    /* renamed from: a */
    public void mo20079a(int i, int i2, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        bundle.putInt("columns", i2);
        bundle.putInt("size", i3);
        mo1289g(bundle);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (mo1307m() != null) {
            this.f22913ag = mo1307m().getInt("title_id");
            this.f22917ak = mo1307m().getInt("columns");
            this.f22918al = mo1307m().getInt("size");
        }
        if (bundle != null) {
            this.f22914ah = bundle.getIntArray("colors");
            this.f22916aj = ((Integer) bundle.getSerializable("selected_color")).intValue();
            this.f22915ai = bundle.getStringArray("color_content_descriptions");
        }
    }

    /* renamed from: a */
    public void mo20080a(int[] iArr, int i) {
        if (this.f22914ah != iArr || this.f22916aj != i) {
            this.f22914ah = iArr;
            this.f22916aj = i;
            m31236as();
        }
    }

    /* renamed from: b */
    public void mo20081b(int i, int[] iArr, int i2, int i3, int i4) {
        mo20079a(i, i3, i4);
        mo20080a(iArr, i2);
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        C0367h s = mo1318s();
        View inflate = LayoutInflater.from(mo1318s()).inflate(C5460i.fragment_new_order_color_palette, null);
        this.f22919am = (NewOrderColorPickerPalette) inflate.findViewById(C5458g.color_picker);
        this.f22919am.mo20076a(this.f22918al, this.f22917ak, (C6446a) this);
        m31236as();
        ((FloatingActionButton) inflate.findViewById(C5458g.floating_action_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("TAG_SELECTED_COLOR", "");
                C6443a.this.mo1311o().mo1222a(C6443a.this.mo1315p(), -1, intent);
                C6443a.this.mo1450b();
            }
        });
        this.f22911ae = new C0766a(s).mo3047a(this.f22913ag).mo3062b(inflate).mo3065b();
        return this.f22911ae;
    }

    /* renamed from: d */
    public void mo20082d(int i) {
        if (this.f22912af != null) {
            this.f22912af.mo20082d(i);
        }
        if (mo1311o() instanceof C6446a) {
            ((C6446a) mo1311o()).mo20082d(i);
        }
        if (i != this.f22916aj) {
            this.f22916aj = i;
            this.f22919am.mo20077a(this.f22914ah, this.f22916aj);
        }
        Intent intent = new Intent();
        intent.putExtra("TAG_SELECTED_COLOR", C6387b.m31012a(i));
        mo1311o().mo1222a(mo1315p(), -1, intent);
        mo1450b();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putIntArray("colors", this.f22914ah);
        bundle.putSerializable("selected_color", Integer.valueOf(this.f22916aj));
        bundle.putStringArray("color_content_descriptions", this.f22915ai);
    }
}
