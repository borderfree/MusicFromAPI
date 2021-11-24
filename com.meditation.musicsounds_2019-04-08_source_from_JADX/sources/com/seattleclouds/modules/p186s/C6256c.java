package com.seattleclouds.modules.p186s;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6593am;
import java.util.HashMap;

/* renamed from: com.seattleclouds.modules.s.c */
public class C6256c {

    /* renamed from: a */
    HashMap<String, Integer> f22182a;

    /* renamed from: b */
    C6257a f22183b;

    /* renamed from: c */
    private final Context f22184c;

    /* renamed from: d */
    private String f22185d;

    /* renamed from: e */
    private Bundle f22186e;

    /* renamed from: com.seattleclouds.modules.s.c$a */
    private class C6257a {

        /* renamed from: a */
        final Spinner f22187a;

        /* renamed from: b */
        final Spinner f22188b;

        /* renamed from: c */
        final TextView f22189c;

        C6257a(Spinner spinner, Spinner spinner2, TextView textView) {
            this.f22187a = spinner;
            this.f22188b = spinner2;
            this.f22189c = textView;
        }
    }

    public C6256c(Context context, HashMap<String, Integer> hashMap, String str, Bundle bundle) {
        this.f22184c = context;
        this.f22182a = hashMap;
        this.f22186e = bundle;
        if (str == null) {
            str = "#";
        }
        mo19598a(str);
    }

    /* renamed from: a */
    private void m30417a(Context context, Spinner spinner) {
        String[] strArr = new String[7];
        int i = 10;
        int i2 = 0;
        while (i > 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            strArr[i2] = sb.toString();
            i--;
            i2++;
        }
        strArr[6] = "0";
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(17367049);
        if (spinner != null) {
            spinner.setAdapter(arrayAdapter);
        }
        spinner.setPrompt(context.getString(C5462k.scoreboard_num_of_rounds));
    }

    /* renamed from: a */
    private void m30418a(Spinner spinner, String str) {
        SpinnerAdapter adapter = spinner.getAdapter();
        if (str != null) {
            for (int i = 0; i < adapter.getCount(); i++) {
                if (((String) adapter.getItem(i)).compareTo(str) == 0) {
                    spinner.setSelection(i);
                    return;
                }
            }
            spinner.setSelection(-1);
        }
    }

    /* renamed from: a */
    public View mo19597a(View view) {
        if (view == 0) {
            r5 = (ViewGroup) ((LayoutInflater) this.f22184c.getSystemService("layout_inflater")).inflate(C5460i.scoreboard_round_view, null);
            this.f22183b = new C6257a((Spinner) r5.findViewById(C5458g.scoreboard_f1_scores_picker), (Spinner) r5.findViewById(C5458g.scoreboard_f2_scores_picker), (TextView) r5.findViewById(C5458g.scoreboard_round_title_txt));
            r5.setTag(this.f22183b);
            m30417a(this.f22184c, this.f22183b.f22187a);
            m30417a(this.f22184c, this.f22183b.f22188b);
            C6593am.m31915a(this.f22183b.f22189c, this.f22186e);
            r5 = r5;
        } else {
            this.f22183b = (C6257a) view.getTag();
            r5 = view;
        }
        m30418a(this.f22183b.f22187a, ((Integer) this.f22182a.get("fighter1Scores")).toString());
        m30418a(this.f22183b.f22188b, ((Integer) this.f22182a.get("fighter2Scores")).toString());
        this.f22183b.f22189c.setText(this.f22185d);
        return r5;
    }

    /* renamed from: a */
    public void mo19598a(String str) {
        this.f22185d = str;
    }
}
