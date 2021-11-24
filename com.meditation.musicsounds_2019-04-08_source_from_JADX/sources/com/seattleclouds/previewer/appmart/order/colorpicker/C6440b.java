package com.seattleclouds.previewer.appmart.order.colorpicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.previewer.appmart.order.colorpicker.NewOrderColorPickerView.C6438c;

/* renamed from: com.seattleclouds.previewer.appmart.order.colorpicker.b */
public class C6440b extends C0366g implements C6438c {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public NewOrderColorPickerView f22897ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public View f22898af;

    /* renamed from: ag */
    private EditText f22899ag;

    /* renamed from: ah */
    private int f22900ah = 0;

    /* renamed from: ai */
    private int f22901ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public String f22902aj = "^#([A-Fa-f0-9]{8}|[A-Fa-f0-9]{6})$";

    /* renamed from: b */
    public static C6440b m31221b(int i, int i2) {
        C6440b bVar = new C6440b();
        Bundle bundle = new Bundle();
        bundle.putInt("COLOR_ARGS", i);
        bundle.putInt("TITLE_ID", i2);
        bVar.mo1289g(bundle);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m31223e(int i) {
        return String.format("#%08X", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (mo1307m() != null) {
            this.f22900ah = mo1307m().getInt("COLOR_ARGS");
            this.f22901ai = mo1307m().getInt("TITLE_ID");
        }
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        C0766a aVar = new C0766a(mo1318s());
        View inflate = mo1318s().getLayoutInflater().inflate(C5460i.fragment_new_order_color_piker, null);
        this.f22899ag = (EditText) inflate.findViewById(C5458g.color_hex_code);
        this.f22898af = inflate.findViewById(C5458g.color_panel);
        this.f22897ae = (NewOrderColorPickerView) inflate.findViewById(C5458g.new_order_color_picker_view);
        this.f22897ae.mo20046a(this.f22900ah, true);
        this.f22899ag.setText(m31223e(this.f22900ah));
        this.f22898af.setBackgroundColor(this.f22900ah);
        this.f22899ag.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                String charSequence = textView.getText().toString();
                if (i != 6 || charSequence.isEmpty()) {
                    return false;
                }
                if (charSequence.matches(C6440b.this.f22902aj)) {
                    int parseColor = Color.parseColor(charSequence);
                    C6440b.this.f22897ae.setColor(parseColor);
                    C6440b.this.f22898af.setBackgroundColor(parseColor);
                } else {
                    Toast.makeText(C6440b.this.mo1318s(), C5462k.color_picker_incorrect_hex_codes, 0).show();
                }
                return true;
            }
        });
        ((LinearLayout) this.f22897ae.getParent()).setPadding(this.f22897ae.getPaddingLeft(), 0, this.f22897ae.getPaddingRight(), 0);
        this.f22897ae.setOnColorChangedListener(this);
        aVar.mo3062b(inflate).mo3047a(this.f22901ai).mo3048a(17039370, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra("TAG_SELECTED_COLOR", C6440b.this.m31223e(C6440b.this.f22897ae.getColor()));
                C6440b.this.mo1311o().mo1222a(C6440b.this.mo1315p(), -1, intent);
            }
        }).mo3061b(17039360, (OnClickListener) null);
        C0765d b = aVar.mo3065b();
        b.requestWindowFeature(1);
        b.getWindow().setLayout((int) TypedValue.applyDimension(1, 200.0f, mo1318s().getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 150.0f, mo1318s().getResources().getDisplayMetrics()));
        return b;
    }

    /* renamed from: d */
    public void mo20068d(int i) {
        this.f22899ag.setText(m31223e(i));
        this.f22898af.setBackgroundColor(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
