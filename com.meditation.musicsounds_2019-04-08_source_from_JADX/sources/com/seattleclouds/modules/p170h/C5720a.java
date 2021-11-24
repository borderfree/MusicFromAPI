package com.seattleclouds.modules.p170h;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6589aj;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.h.a */
public class C5720a extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f20309a = "a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String[] f20310b = new String[13];

    /* renamed from: ae */
    private String f20311ae;

    /* renamed from: af */
    private TextView f20312af;

    /* renamed from: ag */
    private TextView f20313ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public TextView f20314ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public TextView f20315ai;

    /* renamed from: aj */
    private TextView f20316aj;

    /* renamed from: ak */
    private TextView f20317ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public TextView f20318al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public TextView f20319am;

    /* renamed from: an */
    private ListView f20320an;

    /* renamed from: c */
    private String f20321c;

    /* renamed from: d */
    private String f20322d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public JSONObject f20323e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<C5727b> f20324f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Bundle f20325g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f20326h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f20327i;

    /* renamed from: com.seattleclouds.modules.h.a$a */
    private class C5725a extends ArrayAdapter<String> {

        /* renamed from: a */
        int[] f20335a;

        /* renamed from: com.seattleclouds.modules.h.a$a$a */
        private class C5726a {

            /* renamed from: a */
            public final TextView f20337a;

            public C5726a(TextView textView) {
                this.f20337a = textView;
            }
        }

        public C5725a(Context context, String[] strArr, int[] iArr) {
            super(context, 17367043, strArr);
            this.f20335a = iArr;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5726a aVar;
            if (view == null) {
                view = (TextView) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(17367043, viewGroup, false);
                aVar = new C5726a((TextView) view);
                view.setTag(aVar);
            } else {
                aVar = (C5726a) view.getTag();
            }
            aVar.f20337a.setText((String) getItem(i));
            Drawable drawable = C5720a.this.mo1320t().getDrawable(this.f20335a[i]);
            drawable.setBounds(0, 0, 64, 64);
            aVar.f20337a.setCompoundDrawables(drawable, null, null, null);
            return view;
        }
    }

    /* renamed from: com.seattleclouds.modules.h.a$b */
    private class C5727b {

        /* renamed from: a */
        public int f20339a;

        /* renamed from: b */
        public int f20340b;

        /* renamed from: c */
        public String f20341c;

        /* renamed from: d */
        public String f20342d;

        public C5727b(String str, String str2, int i, int i2) {
            this.f20342d = str;
            this.f20341c = str2;
            this.f20339a = i;
            this.f20340b = i2;
        }
    }

    /* renamed from: com.seattleclouds.modules.h.a$c */
    private class C5728c extends AsyncTask<Void, Void, Boolean> {
        private C5728c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            boolean z;
            C5720a.this.f20323e = C5720a.this.m28264aC();
            if (C5720a.this.f20323e == null) {
                z = false;
            } else {
                C5720a.this.f20324f = C5720a.this.m28257a(C5720a.this.f20323e, C5720a.this.m28265aD());
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                C5720a.this.m28283e();
                C5720a.this.m28266aE();
            } else {
                Toast.makeText(C5720a.this.mo1318s(), C5720a.this.mo1219a(C5462k.golf_sc_invalid_config_file), 1).show();
            }
            super.onPostExecute(bool);
        }
    }

    /* renamed from: com.seattleclouds.modules.h.a$d */
    private class C5729d extends BaseAdapter {
        private C5729d() {
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public int getCount() {
            return C5720a.this.f20324f.size();
        }

        public Object getItem(int i) {
            return C5720a.this.f20324f.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5733e eVar;
            final C5727b bVar = (C5727b) C5720a.this.f20324f.get(i);
            if (view == 0) {
                r8 = (ViewGroup) ((LayoutInflater) C5720a.this.mo1318s().getSystemService("layout_inflater")).inflate(C5460i.golf_scorecard_list_item_view, viewGroup, false);
                eVar = new C5733e((TextView) r8.findViewById(C5458g.golf_sc_hole_txtview), (TextView) r8.findViewById(C5458g.golf_sc_par_txtview), (Spinner) r8.findViewById(C5458g.golf_sc_player1_score_spinner), (Spinner) r8.findViewById(C5458g.golf_sc_player2_score_spinner));
                r8.setTag(eVar);
                C57301 r0 = new ArrayAdapter<String>(C5720a.this.mo1318s(), 17367048, C5720a.f20310b) {
                    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                        View dropDownView = super.getDropDownView(i, view, viewGroup);
                        C6593am.m31915a((TextView) dropDownView, C5720a.this.f20325g);
                        return dropDownView;
                    }

                    public View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        C6593am.m31915a((TextView) view2, C5720a.this.f20325g);
                        return view2;
                    }
                };
                r0.setDropDownViewResource(17367049);
                eVar.f20353c.setAdapter(r0);
                eVar.f20354d.setAdapter(r0);
                C6593am.m31915a(eVar.f20351a, C5720a.this.f20325g);
                C6593am.m31915a(eVar.f20352b, C5720a.this.f20325g);
                r8 = r8;
            } else {
                eVar = (C5733e) view.getTag();
                r8 = view;
            }
            eVar.f20353c.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    bVar.f20339a = Integer.parseInt(C5720a.f20310b[i]);
                    TextView b = C5720a.this.f20314ah;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(C5720a.this.m28276c("player1Property"));
                    b.setText(sb.toString());
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            eVar.f20354d.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    bVar.f20340b = Integer.parseInt(C5720a.f20310b[i]);
                    TextView c = C5720a.this.f20315ai;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(C5720a.this.m28276c("player2Property"));
                    c.setText(sb.toString());
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            C5720a aVar = C5720a.this;
            Spinner spinner = eVar.f20353c;
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f20339a);
            sb.append("");
            aVar.m28259a(spinner, sb.toString());
            C5720a aVar2 = C5720a.this;
            Spinner spinner2 = eVar.f20354d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(bVar.f20340b);
            sb2.append("");
            aVar2.m28259a(spinner2, sb2.toString());
            eVar.f20351a.setText(bVar.f20342d);
            eVar.f20352b.setText(bVar.f20341c);
            return r8;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return true;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    /* renamed from: com.seattleclouds.modules.h.a$e */
    private class C5733e {

        /* renamed from: a */
        final TextView f20351a;

        /* renamed from: b */
        final TextView f20352b;

        /* renamed from: c */
        final Spinner f20353c;

        /* renamed from: d */
        final Spinner f20354d;

        C5733e(TextView textView, TextView textView2, Spinner spinner, Spinner spinner2) {
            this.f20353c = spinner;
            this.f20354d = spinner2;
            this.f20351a = textView;
            this.f20352b = textView2;
        }
    }

    static {
        for (int i = 12; i >= 0; i--) {
            String[] strArr = f20310b;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            strArr[i] = sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<C5727b> m28257a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        String string;
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            this.f20311ae = jSONObject.getString("emailProperty");
        } catch (JSONException unused) {
            this.f20311ae = "";
        }
        if (jSONObject2 != null) {
            try {
                this.f20326h = jSONObject2.getString("player1Property");
            } catch (JSONException unused2) {
                this.f20326h = mo1219a(C5462k.golf_sc_player_name_1);
            }
            try {
                string = jSONObject2.getString("player2Property");
            } catch (JSONException unused3) {
                this.f20326h = mo1219a(C5462k.golf_sc_player_name_2);
            }
        } else {
            try {
                this.f20326h = jSONObject.getString("player1Property");
            } catch (JSONException unused4) {
                this.f20326h = mo1219a(C5462k.golf_sc_player_name_1);
            }
            string = jSONObject.getString("player2Property");
        }
        this.f20327i = string;
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("holes");
            if (jSONObject2 != null) {
                jSONArray = jSONObject2.getJSONArray("holes");
            }
            this.f20324f = new ArrayList<>(jSONArray2.length());
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i4);
                String sb2 = sb.toString();
                String str3 = "4/4";
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                try {
                    str = jSONObject3.getString("name");
                } catch (JSONException unused5) {
                    str = sb2;
                }
                try {
                    str2 = jSONObject3.getString("par");
                } catch (JSONException unused6) {
                    str2 = str3;
                }
                if (jSONArray != null) {
                    if (i4 < jSONArray.length()) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        try {
                            i3 = jSONObject4.getInt("player1Property");
                        } catch (JSONException unused7) {
                            i3 = 0;
                        }
                        try {
                            i = jSONObject4.getInt("player2Property");
                            i2 = i3;
                        } catch (JSONException unused8) {
                            i2 = i3;
                        }
                        ArrayList<C5727b> arrayList = this.f20324f;
                        C5727b bVar = new C5727b(str, str2, i2, i);
                        arrayList.add(bVar);
                    }
                }
                i2 = 0;
                i = 0;
                ArrayList<C5727b> arrayList2 = this.f20324f;
                C5727b bVar2 = new C5727b(str, str2, i2, i);
                arrayList2.add(bVar2);
            }
            return this.f20324f;
        } catch (JSONException e) {
            String str4 = f20309a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ERROR");
            sb3.append(e.getLocalizedMessage());
            Log.e(str4, sb3.toString(), e);
            this.f20324f = new ArrayList<>(18);
            for (int i5 = 0; i5 < 18; i5++) {
                ArrayList<C5727b> arrayList3 = this.f20324f;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                sb4.append(i5);
                C5727b bVar3 = new C5727b(sb4.toString(), "4/4", 0, 0);
                arrayList3.add(bVar3);
            }
            return this.f20324f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28259a(Spinner spinner, String str) {
        SpinnerAdapter adapter = spinner.getAdapter();
        if (str != null) {
            for (int i = 0; i < adapter.getCount(); i++) {
                if (((String) adapter.getItem(i)).compareTo(str) == 0) {
                    spinner.setSelection(i);
                    return;
                }
            }
            spinner.setSelection(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m28262aA() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f20311ae});
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        C0367h s = mo1318s();
        String str = this.f20322d;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(C6589aj.m31897a((Activity) s, str, sb.toString()))));
        mo1230a(Intent.createChooser(intent, mo1219a(C5462k.golf_sc_share_scores_using)));
    }

    /* renamed from: aB */
    private void m28263aB() {
        File file = new File(this.f20322d);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String file2 : list) {
                new File(file, file2).delete();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public JSONObject m28264aC() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f20321c);
        sb2.append(".json");
        try {
            return new JSONObject(C6613i.m31991b(App.m25649e(sb2.toString())));
        } catch (IllegalArgumentException e) {
            str2 = f20309a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e.getLocalizedMessage();
            r0 = e;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
            return null;
        } catch (IOException e2) {
            str2 = f20309a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e2.getLocalizedMessage();
            r0 = e2;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
            return null;
        } catch (JSONException e3) {
            str2 = f20309a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e3.getLocalizedMessage();
            r0 = e3;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
            return null;
        } catch (Exception e4) {
            str2 = f20309a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str = e4.getLocalizedMessage();
            r0 = e4;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public JSONObject m28265aD() {
        JSONObject jSONObject;
        C0367h s = mo1318s();
        StringBuilder sb = new StringBuilder();
        sb.append("GolfScoreCardPrefs");
        sb.append(this.f20321c);
        String string = s.getSharedPreferences(sb.toString(), 0).getString("GolfScoreCardPrefs", null);
        if (string == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (JSONException e) {
            String str = f20309a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR: ");
            sb2.append(e.getLocalizedMessage());
            Log.e(str, sb2.toString(), e);
            jSONObject = null;
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: aE */
    public void m28266aE() {
        try {
            this.f20312af.setText(this.f20323e.getString("holeProperty"));
            this.f20313ag.setText(this.f20323e.getString("parProperty"));
            this.f20318al.setText(this.f20326h);
            this.f20319am.setText(this.f20327i);
            TextView textView = this.f20316aj;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f20323e.getString("totalParProperty"));
            sb.append("");
            textView.setText(sb.toString());
            TextView textView2 = this.f20317ak;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f20323e.getString("totalProperty"));
            sb2.append("");
            textView2.setText(sb2.toString());
        } catch (JSONException e) {
            String str = f20309a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ERROR:");
            sb3.append(e.getLocalizedMessage());
            Log.e(str, sb3.toString(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aF */
    public void m28267aF() {
        Iterator it = this.f20324f.iterator();
        while (it.hasNext()) {
            C5727b bVar = (C5727b) it.next();
            bVar.f20339a = 0;
            bVar.f20340b = 0;
        }
        ((C5729d) this.f20320an.getAdapter()).notifyDataSetChanged();
    }

    /* renamed from: aG */
    private void m28268aG() {
        View inflate = View.inflate(mo1318s(), C5460i.golf_scorecard_player_info_picker, null);
        final EditText editText = (EditText) inflate.findViewById(C5458g.golf_sc_player1_name_edittxt);
        final EditText editText2 = (EditText) inflate.findViewById(C5458g.golf_sc_player2_name_edittxt);
        editText.setText(this.f20326h);
        editText2.setText(this.f20327i);
        new C0766a(mo1318s()).mo3062b(inflate).mo3048a(C5462k.apply, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5720a.this.f20318al.setText(editText.getText().toString());
                C5720a.this.f20319am.setText(editText2.getText().toString());
                C5720a.this.f20326h = editText.getText().toString();
                C5720a.this.f20327i = editText2.getText().toString();
            }
        }).mo3061b(C5462k.cancel, (OnClickListener) null).mo3065b().show();
    }

    /* renamed from: aH */
    private String m28269aH() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("player1Property", this.f20326h);
            jSONObject.put("player2Property", this.f20327i);
            JSONArray jSONArray = new JSONArray();
            if (this.f20324f != null) {
                Iterator it = this.f20324f.iterator();
                while (it.hasNext()) {
                    C5727b bVar = (C5727b) it.next();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("player1Property", bVar.f20339a);
                    } catch (Exception unused) {
                        jSONObject2.put("player1Property", 0);
                    }
                    try {
                        jSONObject2.put("player2Property", bVar.f20340b);
                    } catch (Exception unused2) {
                        jSONObject2.put("player2Property", 0);
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("holes", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            String str = f20309a;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: ");
            sb.append(e.getLocalizedMessage());
            Log.e(str, sb.toString(), e);
            return null;
        }
    }

    /* renamed from: as */
    private void m28270as() {
        final String[] strArr = {mo1219a(C5462k.golf_sc_facebook_menu_title), mo1219a(C5462k.golf_sc_twitter_menu_title), mo1219a(C5462k.golf_sc_share_via_apps_title)};
        int[] iArr = {C5457f.facebook_blue_icon_2013, C5457f.twitter_bird_white_on_blue, 17301586};
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3047a(C5462k.golf_sc_pick_your_choice_title).mo3053a((ListAdapter) new C5725a(mo1318s(), strArr, iArr), (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String str;
                StringBuilder sb;
                String str2;
                switch (i) {
                    case 0:
                        C5720a.this.m28271at();
                        return;
                    case 1:
                        C5720a.this.m28272az();
                        return;
                    case 2:
                        try {
                            C5720a.this.m28262aA();
                            return;
                        } catch (InvalidParameterException e) {
                            str2 = C5720a.f20309a;
                            sb = new StringBuilder();
                            sb.append("Error: ");
                            str = e.getLocalizedMessage();
                            sb.append(str);
                            Log.e(str2, sb.toString());
                            Toast.makeText(C5720a.this.mo1318s().getApplicationContext(), C5720a.this.mo1219a(C5462k.error_unable_to_create_screenshot), 1).show();
                            return;
                        } catch (FileNotFoundException e2) {
                            str2 = C5720a.f20309a;
                            sb = new StringBuilder();
                            sb.append("Error: ");
                            str = e2.getLocalizedMessage();
                            sb.append(str);
                            Log.e(str2, sb.toString());
                            Toast.makeText(C5720a.this.mo1318s().getApplicationContext(), C5720a.this.mo1219a(C5462k.error_unable_to_create_screenshot), 1).show();
                            return;
                        }
                    default:
                        return;
                }
            }
        });
        aVar.mo3068c();
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m28271at() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.addFlags(1);
        intent.setType("image/*");
        C0367h s = mo1318s();
        String str = this.f20322d;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(C6589aj.m31897a((Activity) s, str, sb.toString()))));
        for (ResolveInfo resolveInfo : mo1318s().getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.name.contains("facebook")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setFlags(536870912);
                intent.setComponent(componentName);
                mo1230a(intent);
                return;
            }
        }
        Toast.makeText(mo1318s().getApplicationContext(), mo1219a(C5462k.golf_sc_install_facebook_app_message), 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m28272az() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.SUBJECT", "subject");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setType("image/*");
        C0367h s = mo1318s();
        String str = this.f20322d;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(C6589aj.m31897a((Activity) s, str, sb.toString()))));
        for (ResolveInfo resolveInfo : mo1318s().getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.name.contains("com.twitter")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(536870912);
                intent.setComponent(componentName);
                mo1230a(intent);
                return;
            }
        }
        Toast.makeText(mo1318s().getApplicationContext(), mo1219a(C5462k.golf_sc_install_twitter_app_message), 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m28276c(String str) {
        int i = 0;
        if (str == "player1Property") {
            Iterator it = this.f20324f.iterator();
            while (it.hasNext()) {
                i += ((C5727b) it.next()).f20339a;
            }
        } else if (str == "player2Property") {
            Iterator it2 = this.f20324f.iterator();
            while (it2.hasNext()) {
                i += ((C5727b) it2.next()).f20340b;
            }
        }
        return i;
    }

    /* renamed from: c */
    private void m28279c(View view) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20325g = m.getBundle("PAGE_STYLE");
            C6593am.m31914a(view, this.f20325g);
            C6593am.m31915a(this.f20318al, this.f20325g);
            C6593am.m31915a(this.f20319am, this.f20325g);
            C6593am.m31915a(this.f20314ah, this.f20325g);
            C6593am.m31915a(this.f20315ai, this.f20325g);
            C6593am.m31915a(this.f20312af, this.f20325g);
            C6593am.m31915a(this.f20313ag, this.f20325g);
            C6593am.m31915a(this.f20316aj, this.f20325g);
            C6593am.m31915a(this.f20317ak, this.f20325g);
            C6593am.m31915a(this.f20314ah, this.f20325g);
            C6593am.m31915a(this.f20315ai, this.f20325g);
        }
    }

    /* renamed from: d */
    private void m28281d() {
        C0367h s = mo1318s();
        StringBuilder sb = new StringBuilder();
        sb.append("GolfScoreCardPrefs");
        sb.append(this.f20321c);
        Editor edit = s.getSharedPreferences(sb.toString(), 0).edit();
        String aH = m28269aH();
        if (aH != null) {
            edit.putString("GolfScoreCardPrefs", aH);
        } else {
            C6595ao.m31926a((Context) mo1318s(), C5462k.golf_sc_unable_to_save_state);
        }
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28283e() {
        this.f20320an.setAdapter(new C5729d());
        StringBuilder sb = new StringBuilder();
        sb.append(mo1318s().getExternalFilesDir(null));
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(this.f20321c);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        this.f20322d = sb.toString();
        m28263aB();
    }

    /* renamed from: K */
    public void mo1201K() {
        m28281d();
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_golf_scorecard, viewGroup, false);
        this.f20318al = (TextView) inflate.findViewById(C5458g.golf_sc_player1_name_title_txtview);
        this.f20319am = (TextView) inflate.findViewById(C5458g.golf_sc_player2_name_title_txtview);
        this.f20312af = (TextView) inflate.findViewById(C5458g.golf_sc_holes_title_txtview);
        this.f20313ag = (TextView) inflate.findViewById(C5458g.golf_sc_par_title_txtview);
        this.f20316aj = (TextView) inflate.findViewById(C5458g.golf_sc_par_total_txtview);
        this.f20317ak = (TextView) inflate.findViewById(C5458g.golf_sc_holes_total_txtview);
        this.f20314ah = (TextView) inflate.findViewById(C5458g.golf_sc_player1_total_txtview);
        this.f20315ai = (TextView) inflate.findViewById(C5458g.golf_sc_player2_total_txtview);
        this.f20320an = (ListView) inflate.findViewById(C5458g.golf_sc_scores_list);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20321c = m.getString("PAGE_ID");
        }
        m28279c(inflate);
        new C5728c().execute(new Void[0]);
        return inflate;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.golf_scorecard_menu, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.golf_sc_edit_score_menubutton) {
            m28268aG();
            return true;
        } else if (itemId == C5458g.golf_sc_post_via_menubutton) {
            m28270as();
            return true;
        } else if (itemId != C5458g.golf_sc_reset_score_menubutton) {
            return super.mo1245a(menuItem);
        } else {
            C6620n.m32038a(mo1318s(), null, mo1219a(C5462k.golf_sc_clear_scores_message), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5720a.this.m28267aF();
                    TextView b = C5720a.this.f20314ah;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(C5720a.this.m28276c("player1Property"));
                    b.setText(sb.toString());
                    TextView c = C5720a.this.f20315ai;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(C5720a.this.m28276c("player2Property"));
                    c.setText(sb2.toString());
                }
            }, mo1219a(C5462k.f19438OK), null, null, new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }, mo1219a(C5462k.cancel));
            return true;
        }
    }
}
