package com.seattleclouds.modules.calendar;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p023v7.app.C0765d.C0766a;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6614j;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.widget.DateTimePicker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class EventEditActivity extends C6348n {

    /* renamed from: A */
    private ViewGroup f19539A = null;

    /* renamed from: B */
    private List<EditText> f19540B = new ArrayList();

    /* renamed from: C */
    private List<EditText> f19541C = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: D */
    public String f19542D = null;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public String f19543E = "";
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C5506c f19544F;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Long f19545n = null;

    /* renamed from: o */
    private boolean f19546o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public EditText f19547p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Spinner f19548q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public EditText f19549r;

    /* renamed from: s */
    private View f19550s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public EditText f19551t;

    /* renamed from: u */
    private View f19552u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public EditText f19553v;

    /* renamed from: w */
    private View f19554w;

    /* renamed from: x */
    private DateTimePicker f19555x;

    /* renamed from: y */
    private DateTimePicker f19556y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public CheckBox f19557z;

    /* renamed from: c */
    private int m27336c(int i) {
        try {
            return Integer.parseInt(((EditText) this.f19540B.get(i)).getText().toString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27338c(boolean z) {
        DateTimePicker dateTimePicker;
        int i;
        this.f19557z.setChecked(z);
        if (z) {
            dateTimePicker = this.f19555x;
            i = 1;
        } else {
            dateTimePicker = this.f19555x;
            i = 0;
        }
        dateTimePicker.setMode(i);
        this.f19556y.setMode(i);
    }

    /* renamed from: d */
    private int m27339d(int i) {
        try {
            return Integer.parseInt(((EditText) this.f19541C.get(i)).getText().toString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27348m() {
        /*
            r4 = this;
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = "categories"
            java.util.ArrayList r0 = r0.getStringArrayList(r2)
            if (r0 == 0) goto L_0x0022
            int r2 = r0.size()
            if (r2 == 0) goto L_0x0022
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r2 = 1
            if (r0 != 0) goto L_0x002c
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r3 = ""
            r0[r1] = r3
        L_0x002c:
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r4, r3, r0)
            r3 = 17367049(0x1090009, float:2.516295E-38)
            r1.setDropDownViewResource(r3)
            android.widget.Spinner r3 = r4.f19548q
            r3.setAdapter(r1)
            android.widget.Spinner r1 = r4.f19548q
            int r0 = r0.length
            int r0 = r0 - r2
            r1.setSelection(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.calendar.EventEditActivity.m27348m():void");
    }

    /* renamed from: n */
    private void m27349n() {
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("databaseName") : null;
        if (string == null || string.trim().equals("")) {
            string = "calendar.db";
        }
        this.f19544F = new C5506c(this, string);
    }

    /* renamed from: q */
    private void m27350q() {
        Date date;
        Date date2;
        Date date3 = new Date();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f19545n = Long.valueOf(extras.getLong("_id", -1));
            Long valueOf = Long.valueOf(extras.getLong("startDate"));
            if (valueOf != null) {
                date3 = new Date(valueOf.longValue());
            }
        }
        boolean z = false;
        if (this.f19545n.longValue() == -1) {
            Calendar instance = Calendar.getInstance();
            instance.setTime(date3);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            instance.add(11, 1);
            date = instance.getTime();
            instance.add(11, 1);
            date2 = instance.getTime();
        } else {
            Cursor a = this.f19544F.mo17845a(this.f19545n.longValue());
            this.f19547p.setText(a.getString(a.getColumnIndex("title")));
            Date date4 = new Date(a.getLong(a.getColumnIndex("start_date")));
            Date date5 = new Date(a.getLong(a.getColumnIndex("end_date")));
            m27338c(a.getInt(a.getColumnIndex("is_all_day")) == 1);
            String string = a.getString(a.getColumnIndex("category"));
            int i = 0;
            while (true) {
                if (i >= this.f19548q.getCount()) {
                    break;
                } else if (string.equals(this.f19548q.getItemAtPosition(i).toString())) {
                    this.f19548q.setSelection(i);
                    break;
                } else {
                    i++;
                }
            }
            this.f19553v.setText(a.getString(a.getColumnIndex("location")));
            this.f19549r.setText(a.getString(a.getColumnIndex("reference")));
            this.f19551t.setText(a.getString(a.getColumnIndex("case_number")));
            this.f19542D = a.getString(a.getColumnIndex("recurring_event_id"));
            if (a.getInt(a.getColumnIndex("is_synced_event")) == 1) {
                z = true;
            }
            this.f19546o = z;
            this.f19543E = a.getString(a.getColumnIndex("description"));
            a.close();
            date = date4;
            date2 = date5;
        }
        this.f19555x.setDate(date);
        this.f19556y.setDate(date2);
    }

    /* renamed from: r */
    private void m27351r() {
        LayoutInflater layoutInflater = getLayoutInflater();
        this.f19539A = (ViewGroup) findViewById(C5458g.days_on_days_off_fields_container);
        int i = 0;
        while (i < 6) {
            View inflate = layoutInflater.inflate(C5460i.calendar_event_days_on_days_off_field, this.f19539A, false);
            inflate.setId(2131300353 + i);
            TextView textView = (TextView) inflate.findViewById(C5458g.days_on_label);
            StringBuilder sb = new StringBuilder();
            sb.append(textView.getText().toString());
            sb.append(" ");
            int i2 = i + 1;
            sb.append(i2);
            textView.setText(sb.toString());
            TextView textView2 = (TextView) inflate.findViewById(C5458g.days_off_label);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(textView2.getText().toString());
            sb2.append(" ");
            sb2.append(i2);
            textView2.setText(sb2.toString());
            EditText editText = (EditText) inflate.findViewById(C5458g.days_on_text);
            int i3 = 2131300453 + i;
            editText.setId(i3);
            int i4 = 2131300553 + i;
            editText.setNextFocusDownId(i4);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(editText.getHint().toString());
            sb3.append(" ");
            sb3.append(i2);
            editText.setHint(sb3.toString());
            this.f19540B.add(editText);
            EditText editText2 = (EditText) inflate.findViewById(C5458g.days_off_text);
            editText2.setId(i4);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(editText2.getHint().toString());
            sb4.append(" ");
            sb4.append(i2);
            editText2.setHint(sb4.toString());
            if (i != 5) {
                editText2.setNextFocusDownId(i3 + 1);
            }
            this.f19541C.add(editText2);
            this.f19539A.addView(inflate);
            i = i2;
        }
    }

    /* renamed from: s */
    private void m27352s() {
        if (this.f19539A == null) {
            m27351r();
        }
        this.f19539A.setVisibility(0);
        ((EditText) this.f19540B.get(0)).requestFocus();
    }

    /* renamed from: t */
    private void m27353t() {
        if (this.f19539A != null) {
            this.f19539A.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27354u() {
        /*
            r5 = this;
            android.view.View r0 = r5.f19550s
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r5.f19552u
            r0.setVisibility(r1)
            android.view.View r0 = r5.f19554w
            r0.setVisibility(r1)
            android.widget.Spinner r0 = r5.f19548q
            java.lang.Object r0 = r0.getSelectedItem()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Sick Time"
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "Comp Time Used"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "Comp Time Earned"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = "Furlough Day"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0041
            android.view.View r1 = r5.f19554w
            r1.setVisibility(r2)
        L_0x0041:
            java.lang.String r1 = "Court"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x004f
            android.view.View r1 = r5.f19552u
        L_0x004b:
            r1.setVisibility(r2)
            goto L_0x005a
        L_0x004f:
            java.lang.String r1 = "Detail"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005a
            android.view.View r1 = r5.f19550s
            goto L_0x004b
        L_0x005a:
            java.lang.String r1 = "Work"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 1
            r5.m27338c(r0)
            java.lang.Long r0 = r5.f19545n
            long r0 = r0.longValue()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0079
            r5.m27352s()
            goto L_0x0079
        L_0x0076:
            r5.m27353t()
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.calendar.EventEditActivity.m27354u():void");
    }

    /* renamed from: v */
    private void m27355v() {
        Button button = (Button) findViewById(C5458g.delete_button);
        C5334b.m26754a(Color.parseColor("#F44336"), button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5510e.m27423a(EventEditActivity.this, EventEditActivity.this.f19544F, EventEditActivity.this.f19545n.longValue(), EventEditActivity.this.f19542D, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EventEditActivity.this.setResult(102);
                        EventEditActivity.this.finish();
                    }
                });
            }
        });
        if (this.f19545n.longValue() == -1) {
            button.setVisibility(8);
        }
        this.f19557z.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                EventEditActivity.this.m27338c(((CheckBox) view).isChecked());
            }
        });
        this.f19548q.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                EventEditActivity.this.m27354u();
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        ((Button) findViewById(C5458g.view_description_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (EventEditActivity.this.f19543E != null && EventEditActivity.this.f19543E.trim().length() != 0) {
                    if (EventEditActivity.this.f19543E.startsWith("local://")) {
                        App.m25637b(EventEditActivity.this.f19543E, (Activity) EventEditActivity.this);
                    } else if (EventEditActivity.this.f19543E.startsWith("html:")) {
                        FragmentInfo q = App.m25672q(null);
                        q.mo16870c().putString("ARG_HTML_STRING", EventEditActivity.this.f19543E.substring(5));
                        EventEditActivity.this.startActivity(App.m25603a(q, (Context) EventEditActivity.this));
                    }
                }
            }
        });
    }

    /* renamed from: w */
    private void m27356w() {
        findViewById(C5458g.delete_button).setVisibility(8);
        ((ViewGroup) findViewById(C5458g.event_details_form)).setEnabled(false);
        View findViewById = findViewById(C5458g.view_description_button);
        findViewById.setVisibility(0);
        findViewById.setEnabled(true);
    }

    /* renamed from: x */
    private void m27357x() {
        int i;
        StringBuilder sb = new StringBuilder(getString(C5462k.calendar_work_events_generation_confirmation));
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        int a = C6614j.m31992a(this.f19555x.getCalendar(), this.f19556y.getCalendar(), true) + 1;
        Date date = this.f19555x.getDate();
        Date b = C6614j.m32004b(date, this.f19556y.getCalendar().getTime());
        for (int i2 = 0; i2 < a; i2 = i) {
            i = i2;
            for (int i3 = 0; i3 < this.f19540B.size(); i3++) {
                int c = m27336c(i3);
                int i4 = i;
                for (int i5 = 0; i5 < c && i4 < a; i5++) {
                    Date a2 = C6614j.m31998a(date, i4);
                    arrayList.add(a2);
                    arrayList2.add(C6614j.m31998a(b, i4));
                    i4++;
                    sb.append(DateFormat.format("MMM d, ", a2));
                }
                i = m27339d(i3) + i4;
            }
        }
        C0766a aVar = new C0766a(this);
        aVar.mo3063b((CharSequence) sb.substring(0, sb.length() - 2)).mo3047a(C5462k.confirmation).mo3056a(true).mo3048a(17039370, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String uuid = UUID.randomUUID().toString();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    EventEditActivity.this.f19544F.mo17843a(uuid, EventEditActivity.this.f19547p.getText().toString(), EventEditActivity.this.f19548q.getSelectedItem().toString(), EventEditActivity.this.f19553v.getText().toString(), (Date) arrayList.get(i2), (Date) arrayList2.get(i2), EventEditActivity.this.f19557z.isChecked(), EventEditActivity.this.f19551t.getText().toString(), EventEditActivity.this.f19549r.getText().toString());
                }
                EventEditActivity.this.setResult(101);
                EventEditActivity.this.finish();
            }
        }).mo3061b(17039360, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        aVar.mo3065b().show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(C5460i.calendar_event_edit);
        this.f19547p = (EditText) findViewById(C5458g.event_title_text);
        this.f19548q = (Spinner) findViewById(C5458g.category_spinner);
        this.f19549r = (EditText) findViewById(C5458g.event_reference_text);
        this.f19550s = findViewById(C5458g.event_reference_field_container);
        this.f19551t = (EditText) findViewById(C5458g.event_case_number_text);
        this.f19552u = findViewById(C5458g.event_case_number_field_container);
        this.f19553v = (EditText) findViewById(C5458g.event_location_text);
        this.f19554w = findViewById(C5458g.event_location_field_container);
        this.f19555x = (DateTimePicker) findViewById(C5458g.start_date_picker);
        this.f19556y = (DateTimePicker) findViewById(C5458g.end_date_picker);
        this.f19557z = (CheckBox) findViewById(C5458g.all_day_checkbox);
        m27348m();
        m27349n();
        m27351r();
        m27350q();
        m27354u();
        m27355v();
        if (this.f19546o) {
            m27356w();
            i = C5462k.calendar_event_edit_title_view;
        } else {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                i = extras.getLong("_id", -1) == -1 ? C5462k.calendar_event_edit_title_create : C5462k.calendar_event_edit_title_edit;
            }
            getWindow().setSoftInputMode(3);
        }
        setTitle(i);
        getWindow().setSoftInputMode(3);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        if (this.f19546o) {
            return false;
        }
        getMenuInflater().inflate(C5461j.calendar_event, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f19544F != null) {
            this.f19544F.close();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.save) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f19556y.getCalendar().compareTo(this.f19555x.getCalendar()) < 0) {
            C6620n.m32028a((Context) this, C5462k.warning, C5462k.calendar_event_edit_error_start_date_after_end_date);
        } else if (!this.f19548q.getSelectedItem().toString().equals("Work") || m27336c(0) == 0 || m27339d(0) == 0 || C6614j.m32000a(this.f19555x.getCalendar(), this.f19556y.getCalendar())) {
            if (this.f19545n.longValue() == -1) {
                this.f19544F.mo17843a(this.f19542D, this.f19547p.getText().toString(), this.f19548q.getSelectedItem().toString(), this.f19553v.getText().toString(), this.f19555x.getDate(), this.f19556y.getDate(), this.f19557z.isChecked(), this.f19551t.getText().toString(), this.f19549r.getText().toString());
            } else {
                C5506c cVar = this.f19544F;
                C5506c cVar2 = cVar;
                cVar2.mo17841a(this.f19545n.longValue(), this.f19542D, this.f19547p.getText().toString(), this.f19548q.getSelectedItem().toString(), this.f19553v.getText().toString(), this.f19555x.getDate(), this.f19556y.getDate(), this.f19557z.isChecked(), this.f19551t.getText().toString(), this.f19549r.getText().toString());
            }
            setResult(101);
            finish();
        } else {
            m27357x();
        }
        return true;
    }
}
