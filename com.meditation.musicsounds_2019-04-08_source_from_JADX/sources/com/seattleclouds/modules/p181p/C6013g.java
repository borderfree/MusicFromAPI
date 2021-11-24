package com.seattleclouds.modules.p181p;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;

/* renamed from: com.seattleclouds.modules.p.g */
public class C6013g extends C6557s {

    /* renamed from: a */
    private View f21375a;

    /* renamed from: b */
    private TextView f21376b;

    /* renamed from: c */
    private EditText f21377c;

    /* renamed from: d */
    private Button f21378d;

    /* renamed from: e */
    private Bundle f21379e;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21375a = layoutInflater.inflate(C5460i.quiz_result, viewGroup, false);
        mo1450b();
        this.f21375a.setBackgroundDrawable(App.m25658j(C6007d.m29468a((Context) mo1318s()).mo19005k()));
        C6593am.m31914a(this.f21375a, this.f21379e);
        return this.f21375a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f21379e = m.getBundle("PAGE_STYLE");
        }
        this.f21376b = (TextView) this.f21375a.findViewById(C5458g.quiz_result_score_tw);
        this.f21376b.setText(Integer.toString(C6007d.m29468a((Context) mo1318s()).mo19000f()));
        this.f21377c = (EditText) this.f21375a.findViewById(C5458g.quiz_result_score_amount);
        this.f21377c.setOnEditorActionListener(new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean c = C6013g.this.mo1453c();
                App.m25625a((Fragment) C6013g.this);
                return c;
            }
        });
        this.f21378d = (Button) this.f21375a.findViewById(C5458g.quiz_result_finish_btn);
        this.f21378d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6013g.this.mo1453c();
                App.m25625a((Fragment) C6013g.this);
            }
        });
        C6593am.m31915a((TextView) this.f21377c, this.f21379e);
        C6593am.m31915a(this.f21376b, this.f21379e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1453c() {
        String obj = this.f21377c.getText().toString();
        if (obj.length() > 0) {
            return C6021j.m29529a((Context) mo1318s()).mo19027a(Integer.valueOf(C6007d.m29468a((Context) mo1318s()).mo19000f()), C6007d.m29468a((Context) mo1318s()).mo19004j(), obj);
        }
        return false;
    }
}
