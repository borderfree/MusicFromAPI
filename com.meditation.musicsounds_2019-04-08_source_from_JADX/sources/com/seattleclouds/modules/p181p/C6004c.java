package com.seattleclouds.modules.p181p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.p.c */
public class C6004c extends C6557s {

    /* renamed from: a */
    ListView f21328a;

    /* renamed from: b */
    C6005a f21329b;

    /* renamed from: c */
    private View f21330c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList<C6020i> f21331d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Bundle f21332e;

    /* renamed from: com.seattleclouds.modules.p.c$a */
    protected class C6005a extends BaseAdapter {

        /* renamed from: b */
        private C6020i f21334b;

        protected C6005a() {
        }

        public int getCount() {
            if (C6004c.this.f21331d == null) {
                return 0;
            }
            return C6004c.this.f21331d.size();
        }

        public Object getItem(int i) {
            return C6004c.this.f21331d.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6006b bVar;
            this.f21334b = (C6020i) C6004c.this.f21331d.get(i);
            if (view == 0) {
                r3 = (ViewGroup) ((LayoutInflater) C6004c.this.mo1318s().getSystemService("layout_inflater")).inflate(C5460i.quiz_highscores_list_cell, null);
                bVar = new C6006b((TextView) r3.findViewById(C5458g.quiz_highscore_player_name), (TextView) r3.findViewById(C5458g.quiz_highscore_player_score));
                r3.setTag(bVar);
                r3 = r3;
            } else {
                bVar = (C6006b) view.getTag();
                r3 = view;
            }
            bVar.f21335a.setText(this.f21334b.mo19022a().toString());
            bVar.f21336b.setText(Integer.toString(this.f21334b.mo19025b().intValue()));
            C6593am.m31915a(bVar.f21335a, C6004c.this.f21332e);
            C6593am.m31915a(bVar.f21336b, C6004c.this.f21332e);
            return r3;
        }
    }

    /* renamed from: com.seattleclouds.modules.p.c$b */
    private static class C6006b {

        /* renamed from: a */
        final TextView f21335a;

        /* renamed from: b */
        final TextView f21336b;

        C6006b(TextView textView, TextView textView2) {
            this.f21335a = textView;
            this.f21336b = textView2;
        }
    }

    /* renamed from: c */
    private void m29466c(View view) {
        this.f21328a = (ListView) view.findViewById(C5458g.quiz_highscores_list);
        this.f21329b = new C6005a();
        this.f21328a.setAdapter(this.f21329b);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21331d = new ArrayList<>(0);
        this.f21330c = layoutInflater.inflate(C5460i.quiz_highscores, viewGroup, false);
        this.f21331d = C6021j.m29529a((Context) mo1318s()).mo19026a(C6007d.m29468a((Context) mo1318s()).mo19004j());
        m29466c(this.f21330c);
        this.f21330c.setBackgroundDrawable(App.m25658j(C6007d.m29468a((Context) mo1318s()).mo19005k()));
        Bundle m = mo1307m();
        if (m != null) {
            this.f21332e = m.getBundle("PAGE_STYLE");
            C6593am.m31914a(this.f21330c, this.f21332e);
        }
        return this.f21330c;
    }
}
