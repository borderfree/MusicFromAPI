package com.seattleclouds.modules.goaltracker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.seattleclouds.modules.goaltracker.d */
public class C5703d extends C6557s {

    /* renamed from: a */
    private EditText f20263a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public String f20264ae = "REPEAT_DAYLY";
    /* access modifiers changed from: private */

    /* renamed from: af */
    public String f20265af = "";
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public String f20266ag = "";
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public String f20267ah;

    /* renamed from: ai */
    private String f20268ai;

    /* renamed from: aj */
    private int f20269aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public HashMap<String, String> f20270ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public ArrayList<HashMap<String, String>> f20271al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public C5694a f20272am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public GoalTrackerAlarmReceiver f20273an = new GoalTrackerAlarmReceiver();
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public Bundle f20274ao;

    /* renamed from: b */
    private EditText f20275b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f20276c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f20277d;

    /* renamed from: e */
    private Spinner f20278e;

    /* renamed from: f */
    private Spinner f20279f;

    /* renamed from: g */
    private Spinner f20280g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Date f20281h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f20282i = "PRIORITY_HIGH";

    /* renamed from: a */
    private void m28212a(String str, String str2) {
        this.f20270ak = this.f20272am.mo18337b(str2);
        Calendar instance = Calendar.getInstance();
        if (this.f20270ak == null) {
            this.f20281h = instance.getTime();
        } else {
            try {
                instance.setTimeInMillis(Long.parseLong((String) this.f20270ak.get("due_date_time")));
            } catch (NumberFormatException unused) {
            }
            this.f20281h = instance.getTime();
            this.f20282i = (String) this.f20270ak.get("priority");
            this.f20278e.setSelection(m28218c(this.f20282i), true);
            this.f20264ae = (String) this.f20270ak.get("repeat_interval");
            this.f20279f.setSelection(m28223d(this.f20264ae), true);
            this.f20280g.setSelection(m28227e(this.f20267ah), true);
            this.f20265af = (String) this.f20270ak.get("title");
            this.f20263a.setText(this.f20265af);
            this.f20266ag = (String) this.f20270ak.get("note");
            this.f20275b.setText(this.f20266ag);
        }
        this.f20276c.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(this.f20281h));
        this.f20277d.setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(this.f20281h));
    }

    /* renamed from: b */
    private ArrayList<HashMap<String, String>> m28214b() {
        ArrayList<HashMap<String, String>> c = this.f20272am.mo18340c();
        if (c != null && c.size() > 0) {
            return c;
        }
        Calendar instance = Calendar.getInstance();
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Category 1");
        hashMap.put("id", UUID.randomUUID().toString());
        StringBuilder sb = new StringBuilder();
        sb.append(instance.getTimeInMillis());
        sb.append("");
        hashMap.put("created_time", sb.toString());
        this.f20272am.mo18336a(hashMap);
        return this.f20272am.mo18340c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28216b(Activity activity) {
        final Calendar instance = Calendar.getInstance();
        instance.setTime(this.f20281h);
        Activity activity2 = activity;
        DatePickerDialog datePickerDialog = new DatePickerDialog(activity2, new OnDateSetListener() {
            public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                instance.set(1, i);
                instance.set(2, i2);
                instance.set(5, i3);
                C5703d.this.f20281h = instance.getTime();
                C5703d.this.f20276c.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(C5703d.this.f20281h));
            }
        }, instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.show();
    }

    /* renamed from: c */
    private int m28218c(String str) {
        if ("PRIORITY_HIGH".equals(str)) {
            return 0;
        }
        if ("PRIORITY_MEDIUM".equals(str)) {
            return 1;
        }
        return "PRIORITY_LOW".equals(str) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28221c(Activity activity) {
        final Calendar instance = Calendar.getInstance();
        instance.setTime(this.f20281h);
        Activity activity2 = activity;
        TimePickerDialog timePickerDialog = new TimePickerDialog(activity2, new OnTimeSetListener() {
            public void onTimeSet(TimePicker timePicker, int i, int i2) {
                instance.set(11, i);
                instance.set(12, i2);
                C5703d.this.f20281h = instance.getTime();
                C5703d.this.f20277d.setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(C5703d.this.f20281h));
            }
        }, instance.get(11), instance.get(12), DateFormat.is24HourFormat(activity));
        timePickerDialog.show();
    }

    /* renamed from: c */
    private String[] m28222c() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f20271al.iterator();
        while (it.hasNext()) {
            arrayList.add(((HashMap) it.next()).get("name"));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: d */
    private int m28223d(String str) {
        if ("REPEAT_DAYLY".equals(str)) {
            return 0;
        }
        if ("REPEAT_WEEKLY".equals(str)) {
            return 1;
        }
        return "REPEAT_MONTHLY".equals(str) ? 2 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public HashMap<String, String> m28226d() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("title", this.f20265af);
        Calendar instance = Calendar.getInstance();
        instance.setTime(this.f20281h);
        StringBuilder sb = new StringBuilder();
        sb.append(instance.getTimeInMillis());
        sb.append("");
        hashMap.put("due_date_time", sb.toString());
        hashMap.put("priority", this.f20282i);
        hashMap.put("repeat_interval", this.f20264ae);
        hashMap.put("note", this.f20266ag);
        hashMap.put("priority", this.f20282i);
        hashMap.put("id", UUID.randomUUID().toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(instance.getTimeInMillis());
        sb2.append("");
        hashMap.put("created_time", sb2.toString());
        hashMap.put("category_id", this.f20267ah);
        hashMap.put("progress", String.valueOf(this.f20269aj));
        return hashMap;
    }

    /* renamed from: e */
    private int m28227e(String str) {
        if (str == null) {
            return 0;
        }
        Iterator it = this.f20271al.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((HashMap) it.next()).get("id"))) {
                return i;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20267ah = m.getString("CATEGORY_ID_KEY");
            this.f20268ai = m.getString("GOAL_ID_KEY");
            this.f20274ao = m.getBundle("PAGE_STYLE");
            this.f20269aj = m.getInt("GOAL_PROGRESS_KEY");
        }
        final C0367h s = mo1318s();
        this.f20272am = C5694a.m28160a((Context) s);
        this.f20272am.mo18334a();
        this.f20271al = m28214b();
        View inflate = layoutInflater.inflate(C5460i.goal_tracker_edit_goal_fragment, viewGroup, false);
        C6593am.m31914a(inflate, this.f20274ao);
        this.f20263a = (EditText) inflate.findViewById(C5458g.goal_tracker_edit_fragment_goal_title_value_edit_text);
        C6593am.m31915a((TextView) this.f20263a, this.f20274ao);
        this.f20275b = (EditText) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_notes_edit_text);
        C6593am.m31915a((TextView) this.f20275b, this.f20274ao);
        this.f20276c = (TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_due_date_text_view);
        C6593am.m31915a(this.f20276c, this.f20274ao);
        this.f20277d = (TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_alert_time_text_view);
        C6593am.m31915a(this.f20277d, this.f20274ao);
        this.f20278e = (Spinner) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_priority_spinner);
        this.f20279f = (Spinner) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_repeat_interval_spinner);
        this.f20280g = (Spinner) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_category_spinner);
        Button button = (Button) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_save_button);
        C6593am.m31915a((TextView) button, this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_goal_title_text_view), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_due_date_title_text_view), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_priority_title_text_view), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_goal_alert_time_title_text_view), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.f19434xec9a5161), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_goal_category_title_text_view), this.f20274ao);
        C6593am.m31915a((TextView) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_goal_notes_title_text_view), this.f20274ao);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                HashMap a = C5703d.this.m28226d();
                if (C5703d.this.f20270ak == null) {
                    C5703d.this.f20272am.mo18335a(C5703d.this.f20267ah, a);
                } else {
                    a.put("id", C5703d.this.f20270ak.get("id"));
                    C5703d.this.f20272am.mo18342c(a);
                }
                C5703d.this.f20272am.mo18338b();
                Calendar instance = Calendar.getInstance();
                instance.setTime(C5703d.this.f20281h);
                C5703d.this.f20273an.mo18331a(s.getBaseContext(), (String) a.get("id"), instance, (String) a.get("repeat_interval"));
                App.m25625a((Fragment) C5703d.this);
            }
        });
        ImageButton imageButton = (ImageButton) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_alert_time_image_button);
        ((ImageButton) inflate.findViewById(C5458g.goal_tracker_goal_edit_fragment_due_date_image_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5703d.this.m28216b(s);
            }
        });
        imageButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5703d.this.m28221c(s);
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f20263a.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C5703d.this.f20265af = charSequence.toString();
            }
        });
        this.f20275b.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C5703d.this.f20266ag = charSequence.toString();
            }
        });
        C0367h s = mo1318s();
        C570510 r10 = new ArrayAdapter<String>(mo1318s(), 17367048, new String[]{mo1219a(C5462k.goal_tracker_goal_edit_fragment_priority_high), mo1219a(C5462k.goal_tracker_goal_edit_fragment_priority_medium), mo1219a(C5462k.goal_tracker_goal_edit_fragment_priority_low)}) {
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                C6593am.m31915a((TextView) dropDownView, C5703d.this.f20274ao);
                return dropDownView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                C6593am.m31915a((TextView) view2, C5703d.this.f20274ao);
                return view2;
            }
        };
        r10.setDropDownViewResource(17367049);
        this.f20278e.setAdapter(r10);
        this.f20278e.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C5703d dVar;
                String str;
                switch (i) {
                    case 1:
                        dVar = C5703d.this;
                        str = "PRIORITY_MEDIUM";
                        break;
                    case 2:
                        dVar = C5703d.this;
                        str = "PRIORITY_LOW";
                        break;
                    default:
                        dVar = C5703d.this;
                        str = "PRIORITY_HIGH";
                        break;
                }
                dVar.f20282i = str;
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        C570712 r102 = new ArrayAdapter<CharSequence>(mo1318s(), 17367048, new String[]{mo1219a(C5462k.goal_tracker_goal_edit_fragment_repeat_interval_daily), mo1219a(C5462k.goal_tracker_goal_edit_fragment_repeat_interval_weekly), mo1219a(C5462k.goal_tracker_goal_edit_fragment_repeat_interval_montly)}) {
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                C6593am.m31915a((TextView) dropDownView, C5703d.this.f20274ao);
                return dropDownView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                C6593am.m31915a((TextView) view2, C5703d.this.f20274ao);
                return view2;
            }
        };
        r102.setDropDownViewResource(17367049);
        this.f20279f.setAdapter(r102);
        this.f20279f.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                C5703d dVar;
                String str;
                switch (i) {
                    case 1:
                        dVar = C5703d.this;
                        str = "REPEAT_WEEKLY";
                        break;
                    case 2:
                        dVar = C5703d.this;
                        str = "REPEAT_MONTHLY";
                        break;
                    default:
                        dVar = C5703d.this;
                        str = "REPEAT_DAYLY";
                        break;
                }
                dVar.f20264ae = str;
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        C57092 r103 = new ArrayAdapter<CharSequence>(s, 17367048, m28222c()) {
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                C6593am.m31915a((TextView) dropDownView, C5703d.this.f20274ao);
                return dropDownView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                C6593am.m31915a((TextView) view2, C5703d.this.f20274ao);
                return view2;
            }
        };
        r103.setDropDownViewResource(17367049);
        this.f20280g.setAdapter(r103);
        this.f20280g.setSelection(m28227e(this.f20267ah));
        this.f20280g.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (C5703d.this.f20271al != null) {
                    C5703d.this.f20267ah = (String) ((HashMap) C5703d.this.f20271al.get(i)).get("id");
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        m28212a(this.f20267ah, this.f20268ai);
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (bundle != null) {
            this.f20276c.setText(bundle.getString("GOAL_DATE"));
            this.f20277d.setText(bundle.getString("GOAL_ALERT_TIME"));
            this.f20281h.setTime(bundle.getLong("DUE_DATE_TIME"));
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putString("GOAL_DATE", this.f20276c.getText().toString());
        bundle.putString("GOAL_ALERT_TIME", this.f20277d.getText().toString());
        bundle.putLong("DUE_DATE_TIME", this.f20281h.getTime());
    }
}
