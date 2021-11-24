package com.seattleclouds.modules.p181p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6620n;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.p.h */
public class C6016h extends C6557s {

    /* renamed from: a */
    private View f21382a = null;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public ArrayList<C6003b> f21383ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C6007d f21384af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Bundle f21385ag;

    /* renamed from: b */
    private TextView f21386b;

    /* renamed from: c */
    private Button f21387c;

    /* renamed from: d */
    private Button f21388d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f21389e;

    /* renamed from: f */
    private String f21390f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f21391g;

    /* renamed from: h */
    private String f21392h;

    /* renamed from: i */
    private boolean f21393i;

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29514c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21389e);
        sb.append(".json");
        C6012f fVar = new C6012f(sb.toString());
        fVar.mo19014a((C6608d) new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                C6016h.this.f21383ae = (ArrayList) obj;
                C6016h.this.m29516d();
            }
        });
        fVar.execute(new String[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m29516d() {
        if (this.f21383ae.size() > 0) {
            this.f21384af.mo18997d();
            this.f21384af.mo18990a(this.f21383ae);
            this.f21384af.mo18988a(Boolean.valueOf(this.f21393i));
            this.f21384af.mo18994b(this.f21391g);
            this.f21384af.mo18989a(this.f21389e);
            this.f21384af.mo18996c(0);
            this.f21384af.mo18998d(this.f21383ae.size());
            this.f21384af.mo18995c();
            Bundle bundle = new Bundle();
            bundle.putBundle("PAGE_STYLE", this.f21385ag);
            App.m25620a(new FragmentInfo(C6008e.class.getName(), bundle), (Fragment) this);
            return;
        }
        C6620n.m32034a((Context) mo1318s(), "Quiz", "Unable to start quiz. No items found.");
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21382a = layoutInflater.inflate(C5460i.quiz_root, viewGroup, false);
        this.f21386b = (TextView) this.f21382a.findViewById(C5458g.quiz_root_title);
        this.f21387c = (Button) this.f21382a.findViewById(C5458g.quiz_root_start_btn);
        this.f21388d = (Button) this.f21382a.findViewById(C5458g.quiz_root_high_scores_btn);
        mo1450b();
        C6593am.m31914a(this.f21382a, this.f21385ag);
        return this.f21382a;
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        this.f21386b.setText(this.f21390f);
        view.setBackgroundDrawable(App.m25658j(this.f21391g));
        this.f21387c.setBackgroundDrawable(App.m25658j(this.f21392h));
        this.f21388d.setBackgroundDrawable(App.m25658j(this.f21392h));
        C6593am.m31914a(this.f21382a, this.f21385ag);
        super.mo1242a(view, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f21389e = m.getString("pageId");
            this.f21390f = m.getString("quizTitle");
            this.f21391g = m.getString("quizBgImage");
            this.f21392h = m.getString("quizButtonsBgImage");
            this.f21393i = m.getBoolean("isQuizRandomize");
            this.f21385ag = m.getBundle("PAGE_STYLE");
        }
        this.f21384af = C6007d.m29468a((Context) mo1318s());
        this.f21386b.setText(this.f21390f);
        C6593am.m31915a(this.f21386b, this.f21385ag);
        this.f21387c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6016h.this.m29514c();
            }
        });
        this.f21388d.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C6016h.this.f21384af.mo18989a(C6016h.this.f21389e);
                Bundle bundle = new Bundle();
                bundle.putString("quizBgImage", C6016h.this.f21391g);
                bundle.putBundle("PAGE_STYLE", C6016h.this.f21385ag);
                App.m25620a(new FragmentInfo(C6004c.class.getName(), bundle), (Fragment) C6016h.this);
            }
        });
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }
}
