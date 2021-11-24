package com.seattleclouds.modules.p181p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6597ap;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.p.e */
public class C6008e extends C6557s {

    /* renamed from: a */
    OnClickListener f21349a = new OnClickListener() {
        public void onClick(View view) {
            C6008e.this.f21359an = (String) view.getTag();
            C6597ap.m31932a(C6008e.this.mo1318s(), C6008e.this.f21365g, C6008e.this.f21352ag, "PUSH_FROM_RIGHT");
            C6008e.this.mo19007e(Integer.parseInt(C6008e.this.f21359an));
            C6008e.this.f21358am = Boolean.valueOf(true);
        }
    };

    /* renamed from: ae */
    private ImageView f21350ae = null;

    /* renamed from: af */
    private TextView f21351af = null;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public View f21352ag = null;

    /* renamed from: ah */
    private TextView f21353ah = null;

    /* renamed from: ai */
    private Button f21354ai = null;

    /* renamed from: aj */
    private ScrollView f21355aj = null;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public C6007d f21356ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public Bundle f21357al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public Boolean f21358am = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: an */
    public String f21359an;

    /* renamed from: b */
    OnClickListener f21360b = new OnClickListener() {
        public void onClick(View view) {
            C6008e.this.f21365g.setVisibility(0);
            C6008e.this.f21356ak.mo18992b();
            C6008e.this.f21358am = Boolean.valueOf(false);
            if (C6008e.this.mo1453c()) {
                C6008e.this.f21352ag.setVisibility(8);
                return;
            }
            App.m25625a((Fragment) C6008e.this);
            Bundle bundle = new Bundle();
            bundle.putBundle("PAGE_STYLE", C6008e.this.f21357al);
            App.m25620a(new FragmentInfo(C6013g.class.getName(), bundle), (Fragment) C6008e.this);
        }
    };

    /* renamed from: c */
    private View f21361c = null;

    /* renamed from: d */
    private View f21362d = null;

    /* renamed from: e */
    private TextView f21363e = null;

    /* renamed from: f */
    private TextView f21364f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScrollView f21365g = null;

    /* renamed from: h */
    private LinearLayout f21366h = null;

    /* renamed from: i */
    private View f21367i = null;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21361c = layoutInflater.inflate(C5460i.quiz_play, viewGroup, false);
        mo1450b();
        this.f21361c.setBackgroundDrawable(App.m25658j(this.f21356ak.mo19005k()));
        C6593am.m31914a(this.f21361c, this.f21357al);
        return this.f21361c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f21357al = m.getBundle("PAGE_STYLE");
        }
        this.f21356ak = C6007d.m29468a((Context) mo1318s());
        this.f21367i = this.f21361c.findViewById(C5458g.quiz_play_question_container);
        this.f21350ae = (ImageView) this.f21361c.findViewById(C5458g.quiz_play_question_image);
        this.f21351af = (TextView) this.f21361c.findViewById(C5458g.quiz_play_question_text);
        this.f21365g = (ScrollView) this.f21361c.findViewById(C5458g.quiz_play_answers_container);
        this.f21366h = (LinearLayout) this.f21361c.findViewById(C5458g.quiz_play_answers_container_linear);
        this.f21352ag = this.f21361c.findViewById(C5458g.quiz_play_feedback_container);
        this.f21355aj = (ScrollView) this.f21361c.findViewById(C5458g.quiz_play_feedback_scroll_view);
        this.f21353ah = (TextView) this.f21361c.findViewById(C5458g.quiz_play_feedback_answer_tw);
        this.f21354ai = (Button) this.f21361c.findViewById(C5458g.quiz_play_feedback_next_btn);
        this.f21354ai.setOnClickListener(this.f21360b);
        this.f21364f = (TextView) this.f21361c.findViewById(C5458g.quiz_play_question_points);
        this.f21363e = (TextView) this.f21361c.findViewById(C5458g.quiz_play_question_passed);
        TextView textView = (TextView) this.f21361c.findViewById(C5458g.quiz_play_passed_tv);
        TextView textView2 = (TextView) this.f21361c.findViewById(C5458g.quiz_play_current_points_tv);
        C6593am.m31915a(this.f21351af, this.f21357al);
        C6593am.m31915a(this.f21353ah, this.f21357al);
        C6593am.m31915a(this.f21364f, this.f21357al);
        C6593am.m31915a(this.f21363e, this.f21357al);
        C6593am.m31915a(textView, this.f21357al);
        C6593am.m31915a(textView2, this.f21357al);
        mo1453c();
    }

    /* renamed from: b */
    public void mo19006b(int i, int i2) {
        this.f21363e.setText(String.format("%d / %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1453c() {
        if (this.f21356ak.mo18999e() == null) {
            return false;
        }
        C6597ap.m31933a(mo1318s(), this.f21366h, "PUSH_FROM_RIGHT");
        C6597ap.m31933a(mo1318s(), this.f21367i, "PUSH_FROM_RIGHT");
        this.f21366h.removeAllViews();
        this.f21350ae.setImageDrawable(App.m25658j(this.f21356ak.mo18999e().mo18972b()));
        this.f21351af.setText(this.f21356ak.mo18999e().mo18968a());
        this.f21355aj.setBackgroundDrawable(App.m25658j(this.f21356ak.mo18999e().mo18978e()));
        this.f21353ah.setText(this.f21356ak.mo18999e().mo18976d());
        this.f21354ai.setBackgroundDrawable(App.m25658j(this.f21356ak.mo18999e().mo18980f()));
        Iterator it = this.f21356ak.mo18999e().mo18982g().iterator();
        int i = 0;
        while (it.hasNext()) {
            String a = ((C6002a) it.next()).mo18964a();
            Button button = new Button(mo1318s());
            button.setText(a);
            button.setOnClickListener(this.f21349a);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.setMargins(10, 10, 10, 0);
            button.setLayoutParams(layoutParams);
            this.f21366h.addView(button);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(Color.parseColor("#e3bb87")));
            stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(-256));
            stateListDrawable.addState(StateSet.WILD_CARD, App.m25658j(this.f21356ak.mo18999e().mo18980f()));
            button.setBackgroundDrawable(stateListDrawable);
            int i2 = i + 1;
            button.setTag(Integer.toString(i));
            i = i2;
        }
        return true;
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (bundle != null) {
            this.f21363e.setText(bundle.getString("TOTAL_PASSED_AMOUNT"));
            this.f21364f.setText(bundle.getString("CURRENT_POINTS_AMOUNT"));
            this.f21358am = Boolean.valueOf(bundle.getBoolean("ALREADY_ANSWERED"));
            this.f21359an = bundle.getString("ANSWER");
        }
        if (this.f21358am.booleanValue()) {
            C6597ap.m31932a(mo1318s(), this.f21365g, this.f21352ag, "PUSH_FROM_RIGHT");
        }
    }

    /* renamed from: e */
    public void mo19007e(int i) {
        boolean z;
        if (this.f21356ak.mo18991a(i)) {
            this.f21356ak.mo18993b(this.f21356ak.mo18999e().mo18974c().intValue());
            z = true;
        } else {
            z = false;
        }
        mo19009m(z);
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C6008e.this.mo19008f(C6008e.this.f21356ak.mo19000f());
                    C6008e.this.f21356ak.mo19001g();
                    C6008e.this.mo19006b(C6008e.this.f21356ak.mo19002h(), C6008e.this.f21356ak.mo19003i());
                }
            });
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putString("TOTAL_PASSED_AMOUNT", this.f21363e.getText().toString());
        bundle.putString("CURRENT_POINTS_AMOUNT", this.f21364f.getText().toString());
        bundle.putBoolean("ALREADY_ANSWERED", this.f21358am.booleanValue());
        bundle.putString("ANSWER", this.f21359an);
    }

    /* renamed from: f */
    public void mo19008f(int i) {
        this.f21364f.setText(Integer.toString(i));
    }

    /* renamed from: m */
    public void mo19009m(boolean z) {
    }
}
