package com.seattleclouds.modules.p186s;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.modules.s.b */
public class C6254b extends C0366g {

    /* renamed from: ae */
    boolean f22172ae = false;

    /* renamed from: af */
    CheckBox f22173af;

    /* renamed from: ag */
    Integer f22174ag;

    /* renamed from: ah */
    private EditText f22175ah;

    /* renamed from: ai */
    private EditText f22176ai;

    /* renamed from: aj */
    private String f22177aj;

    /* renamed from: ak */
    private String f22178ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public Spinner f22179al;

    /* renamed from: am */
    private OnClickListener f22180am;

    /* renamed from: com.seattleclouds.modules.s.b$a */
    public class C6255a implements OnItemSelectedListener {
        public C6255a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str = (String) C6254b.this.f22179al.getAdapter().getItem(i);
            C6254b.this.f22174ag = Integer.valueOf(Integer.parseInt(str));
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: a */
    private void m30407a(int i, int i2, Context context) {
        String[] strArr = new String[i];
        int i3 = 0;
        int i4 = 1;
        while (i3 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i4);
            strArr[i3] = sb.toString();
            i3++;
            i4++;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(17367049);
        if (this.f22179al != null) {
            this.f22179al.setAdapter(arrayAdapter);
        }
        this.f22179al.setPrompt(mo1219a(C5462k.scoreboard_num_of_rounds));
        this.f22179al.setOnItemSelectedListener(new C6255a());
        if (i2 < 0 || i2 >= i) {
            this.f22179al.setSelection(i / 2);
        } else {
            this.f22179al.setSelection(i2);
        }
    }

    /* renamed from: a */
    public void mo19587a(OnClickListener onClickListener) {
        this.f22180am = onClickListener;
    }

    /* renamed from: a */
    public void mo19588a(Integer num) {
        this.f22174ag = num;
    }

    /* renamed from: as */
    public String mo19589as() {
        return this.f22175ah.getText().toString();
    }

    /* renamed from: at */
    public String mo19590at() {
        return this.f22176ai.getText().toString();
    }

    /* renamed from: au */
    public Integer mo19591au() {
        return this.f22174ag;
    }

    /* renamed from: av */
    public boolean mo19592av() {
        return this.f22173af.isChecked();
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        View inflate = mo1318s().getLayoutInflater().inflate(C5460i.scoreboard_fighter_info_picker, null);
        this.f22175ah = (EditText) inflate.findViewById(C5458g.scoreboard_f1_name_txt);
        this.f22176ai = (EditText) inflate.findViewById(C5458g.scoreboard_f2_name_txt);
        this.f22173af = (CheckBox) inflate.findViewById(C5458g.scoreboard_clear_scores_chkbox);
        this.f22175ah.setText(this.f22177aj);
        this.f22176ai.setText(this.f22178ak);
        this.f22179al = (Spinner) inflate.findViewById(C5458g.scoreboard_round_spinner);
        C0367h s = mo1318s();
        if (this.f22174ag == null) {
            this.f22174ag = Integer.valueOf(12);
        }
        m30407a(12, this.f22174ag.intValue(), s);
        return new C0766a(mo1318s()).mo3062b(inflate).mo3048a(C5462k.scoreboard_apply_button_label, this.f22180am).mo3061b(C5462k.scoreboard_cancel_button_label, (OnClickListener) null).mo3065b();
    }

    /* renamed from: c */
    public void mo19593c(String str) {
        this.f22177aj = str;
        if (this.f22175ah != null) {
            this.f22175ah.setText(this.f22177aj);
        }
    }

    /* renamed from: d */
    public void mo19594d(String str) {
        this.f22178ak = str;
        if (this.f22176ai != null) {
            this.f22176ai.setText(this.f22178ak);
        }
    }
}
