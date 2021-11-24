package com.seattleclouds.modules.p169g;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.SimpleAdapter;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6613i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.p198io.C6730b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.g.a */
public class C5670a extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f20154a = "a";

    /* renamed from: ae */
    private List<Map<String, String>> f20155ae = new ArrayList();

    /* renamed from: af */
    private JSONObject f20156af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public JSONArray f20157ag;

    /* renamed from: ah */
    private JSONArray f20158ah;

    /* renamed from: ai */
    private JSONArray f20159ai;

    /* renamed from: b */
    private String f20160b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f20161c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f20162d;

    /* renamed from: e */
    private SeekBar f20163e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Button f20164f;

    /* renamed from: g */
    private ListView f20165g;

    /* renamed from: h */
    private Menu f20166h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0366g f20167i;

    /* renamed from: com.seattleclouds.modules.g.a$a */
    public static class C5677a extends C0366g implements OnDateSetListener {

        /* renamed from: ae */
        Calendar f20175ae;

        /* renamed from: c */
        public Dialog mo1452c(Bundle bundle) {
            if (this.f20175ae == null) {
                this.f20175ae = Calendar.getInstance();
            }
            DatePickerDialog datePickerDialog = new DatePickerDialog(mo1318s(), this, this.f20175ae.get(1), this.f20175ae.get(2), this.f20175ae.get(5));
            return datePickerDialog;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            this.f20175ae.set(1, i);
            this.f20175ae.set(2, i2);
            this.f20175ae.set(5, i3);
            if (mo1311o() instanceof C5670a) {
                ((C5670a) mo1311o()).f20164f.setText(DateFormat.getDateFormat(mo1318s()).format(this.f20175ae.getTime()));
            }
        }
    }

    /* renamed from: a */
    private JSONArray m28025a(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            if (i2 != i) {
                jSONArray2.put(jSONArray.get(i2));
            }
        }
        return jSONArray2;
    }

    /* renamed from: a */
    private void m28026a(int i, int i2, JSONArray jSONArray) {
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONArray.put(i, jSONArray.getJSONObject(i2));
            jSONArray.put(i2, jSONObject);
        } catch (JSONException e) {
            Log.e(f20154a, "Unable to swap elements", e);
        }
    }

    /* renamed from: aA */
    private void m28029aA() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("yhfkdjmeol_fusioncharteditor_");
        sb2.append(this.f20160b);
        sb2.append(".chartdata.json");
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(new URI(App.m25655h(sb2.toString())))));
            bufferedOutputStream.write(this.f20156af.toString().getBytes());
            bufferedOutputStream.close();
            return;
        } catch (FileNotFoundException e) {
            str2 = f20154a;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str = e.getLocalizedMessage();
            r0 = e;
        } catch (IOException e2) {
            str2 = f20154a;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str = e2.getLocalizedMessage();
            r0 = e2;
        } catch (URISyntaxException e3) {
            str2 = f20154a;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str = e3.getLocalizedMessage();
            r0 = e3;
        }
        sb.append(str);
        Log.e(str2, sb.toString(), r0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.util.Log.e(f20154a, "ERROR: Can't parse total or free value");
        r4 = 0.125f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0046 */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28030as() {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12.f20155ae = r0
            r0 = 0
            r1 = 0
        L_0x0009:
            org.json.JSONArray r2 = r12.f20157ag
            int r2 = r2.length()
            if (r1 >= r2) goto L_0x00ca
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            org.json.JSONArray r3 = r12.f20158ah     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONObject r3 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r4 = "value"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONArray r4 = r12.f20159ai     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r5 = "value"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x00ab }
            r5 = 1048576000(0x3e800000, float:0.25)
            r6 = 1040187392(0x3e000000, float:0.125)
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x0044 }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0046 }
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0040
            goto L_0x004f
        L_0x0040:
            r3 = 981668463(0x3a83126f, float:0.001)
            goto L_0x004f
        L_0x0044:
            r3 = 1048576000(0x3e800000, float:0.25)
        L_0x0046:
            java.lang.String r4 = f20154a     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r5 = "ERROR: Can't parse total or free value"
            android.util.Log.e(r4, r5)     // Catch:{ JSONException -> 0x00ab }
            r4 = 1040187392(0x3e000000, float:0.125)
        L_0x004f:
            java.lang.String r5 = "info"
            int r6 = com.seattleclouds.C5451m.C5462k.fusioncharts_editor_total_free_psa     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r6 = r12.mo1219a(r6)     // Catch:{ JSONException -> 0x00ab }
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r8 = "%.2f"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00ab }
            java.lang.Float r11 = java.lang.Float.valueOf(r3)     // Catch:{ JSONException -> 0x00ab }
            r10[r0] = r11     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ JSONException -> 0x00ab }
            r7[r0] = r8     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r8 = "%.2f"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00ab }
            java.lang.Float r11 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x00ab }
            r10[r0] = r11     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r8 = java.lang.String.format(r8, r10)     // Catch:{ JSONException -> 0x00ab }
            r7[r9] = r8     // Catch:{ JSONException -> 0x00ab }
            r8 = 2
            java.lang.String r10 = "%.2f"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x00ab }
            float r4 = r4 / r3
            java.lang.Float r3 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x00ab }
            r9[r0] = r3     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r3 = java.lang.String.format(r10, r9)     // Catch:{ JSONException -> 0x00ab }
            r7[r8] = r3     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r3 = java.lang.String.format(r6, r7)     // Catch:{ JSONException -> 0x00ab }
            r2.put(r5, r3)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r3 = "year"
            org.json.JSONArray r4 = r12.f20157ag     // Catch:{ JSONException -> 0x00ab }
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x00ab }
            java.lang.String r5 = "label"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x00ab }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ab }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r3 = r12.f20155ae     // Catch:{ JSONException -> 0x00ab }
            r3.add(r2)     // Catch:{ JSONException -> 0x00ab }
            goto L_0x00c6
        L_0x00ab:
            r2 = move-exception
            java.lang.String r3 = f20154a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "ERROR: "
            r4.append(r5)
            java.lang.String r5 = r2.getLocalizedMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r3, r4, r2)
        L_0x00c6:
            int r1 = r1 + 1
            goto L_0x0009
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p169g.C5670a.m28030as():void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        android.util.Log.e(f20154a, "ERROR: Unable to parse totalPSA from user input");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001c */
    /* renamed from: at */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m28031at() {
        /*
            r10 = this;
            android.widget.Button r0 = r10.f20164f     // Catch:{ JSONException -> 0x00fe }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00fe }
            r1 = 1048576000(0x3e800000, float:0.25)
            android.widget.EditText r2 = r10.f20161c     // Catch:{ NumberFormatException -> 0x001c }
            android.text.Editable r2 = r2.getText()     // Catch:{ NumberFormatException -> 0x001c }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x001c }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x001c }
            r1 = r2
            goto L_0x0023
        L_0x001c:
            java.lang.String r2 = f20154a     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r3 = "ERROR: Unable to parse totalPSA from user input"
            android.util.Log.e(r2, r3)     // Catch:{ JSONException -> 0x00fe }
        L_0x0023:
            android.widget.SeekBar r2 = r10.f20163e     // Catch:{ JSONException -> 0x00fe }
            int r2 = r2.getProgress()     // Catch:{ JSONException -> 0x00fe }
            float r2 = (float) r2     // Catch:{ JSONException -> 0x00fe }
            float r2 = r2 * r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            r3 = 0
            r4 = 0
        L_0x0031:
            org.json.JSONArray r5 = r10.f20157ag     // Catch:{ JSONException -> 0x00fe }
            int r5 = r5.length()     // Catch:{ JSONException -> 0x00fe }
            r6 = 1
            if (r4 >= r5) goto L_0x00a3
            org.json.JSONArray r5 = r10.f20157ag     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = r5.getJSONObject(r4)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r7 = "label"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ JSONException -> 0x00fe }
            boolean r5 = r0.equals(r5)     // Catch:{ JSONException -> 0x00fe }
            if (r5 == 0) goto L_0x00a0
            org.json.JSONArray r3 = r10.f20157ag     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r5.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r7 = "label"
            org.json.JSONObject r5 = r5.put(r7, r0)     // Catch:{ JSONException -> 0x00fe }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r3 = r10.f20158ah     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r5.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r7 = "value"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00fe }
            r8.<init>()     // Catch:{ JSONException -> 0x00fe }
            r8.append(r1)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r9 = ""
            r8.append(r9)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = r5.put(r7, r8)     // Catch:{ JSONException -> 0x00fe }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r3 = r10.f20159ai     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r5.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r7 = "value"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00fe }
            r8.<init>()     // Catch:{ JSONException -> 0x00fe }
            r8.append(r2)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r9 = ""
            r8.append(r9)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r5 = r5.put(r7, r8)     // Catch:{ JSONException -> 0x00fe }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00fe }
            r3 = 1
            goto L_0x00a3
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x00a3:
            if (r3 != 0) goto L_0x00f7
            org.json.JSONArray r3 = r10.f20157ag     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r4.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r5 = "label"
            org.json.JSONObject r0 = r4.put(r5, r0)     // Catch:{ JSONException -> 0x00fe }
            r3.put(r0)     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r0 = r10.f20158ah     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r3.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r4 = "value"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00fe }
            r5.<init>()     // Catch:{ JSONException -> 0x00fe }
            r5.append(r1)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = ""
            r5.append(r1)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = r5.toString()     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r1 = r3.put(r4, r1)     // Catch:{ JSONException -> 0x00fe }
            r0.put(r1)     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r0 = r10.f20159ai     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r1.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r3 = "value"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00fe }
            r4.<init>()     // Catch:{ JSONException -> 0x00fe }
            r4.append(r2)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r2 = ""
            r4.append(r2)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r2 = r4.toString()     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r1 = r1.put(r3, r2)     // Catch:{ JSONException -> 0x00fe }
            r0.put(r1)     // Catch:{ JSONException -> 0x00fe }
        L_0x00f7:
            r10.m28032az()     // Catch:{ JSONException -> 0x00fe }
            r10.m28046m(r6)     // Catch:{ JSONException -> 0x00fe }
            goto L_0x0119
        L_0x00fe:
            r0 = move-exception
            java.lang.String r1 = f20154a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ERROR: "
            r2.append(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p169g.C5670a.m28031at():void");
    }

    /* renamed from: az */
    private void m28032az() {
        String str;
        StringBuilder sb;
        String str2;
        for (int i = 0; i < this.f20157ag.length(); i++) {
            try {
                Date parse = DateFormat.getDateFormat(mo1318s()).parse(this.f20157ag.getJSONObject(i).getString("label"));
                for (int i2 = i + 1; i2 < this.f20157ag.length(); i2++) {
                    if (DateFormat.getDateFormat(mo1318s()).parse(this.f20157ag.getJSONObject(i2).getString("label")).getTime() < parse.getTime()) {
                        m28026a(i, i2, this.f20157ag);
                        m28026a(i, i2, this.f20158ah);
                        m28026a(i, i2, this.f20159ai);
                    }
                }
            } catch (JSONException e) {
                str2 = f20154a;
                sb = new StringBuilder();
                sb.append("ERROR: ");
                str = e.getLocalizedMessage();
                r1 = e;
                sb.append(str);
                Log.e(str2, sb.toString(), r1);
            } catch (ParseException e2) {
                str2 = f20154a;
                sb = new StringBuilder();
                sb.append("ERROR: ");
                str = e2.getLocalizedMessage();
                r1 = e2;
                sb.append(str);
                Log.e(str2, sb.toString(), r1);
            }
        }
    }

    /* renamed from: c */
    private String m28035c(String str) {
        int i;
        if (str == null || str.length() != 4) {
            return str;
        }
        Calendar instance = Calendar.getInstance();
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Log.e(f20154a, "ERROR: Unable to parse old year value.", e);
            i = 2015;
        }
        instance.set(1, i);
        return DateFormat.getDateFormat(mo1318s()).format(instance.getTime());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28036c() {
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), this.f20155ae, 17367044, new String[]{"info", "year"}, new int[]{16908308, 16908309});
        this.f20165g.setAdapter(simpleAdapter);
        simpleAdapter.setViewBinder(new ViewBinder() {
            public boolean setViewValue(View view, Object obj, String str) {
                if (view.getId() == 16908308) {
                    ((TextView) view).setTextAppearance(C5670a.this.mo1318s(), 16973892);
                }
                return false;
            }
        });
    }

    /* renamed from: d */
    private void m28038d() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("yhfkdjmeol_fusioncharteditor_");
        sb2.append(this.f20160b);
        sb2.append(".chartdata.json");
        try {
            File file = new File(new URI(App.m25655h(sb2.toString())));
            if (!file.exists()) {
                C6730b.m32461a((InputStream) new BufferedInputStream(mo1318s().getAssets().open("Modules/SCCharts/fusionchartseditor/fusioncharts_editor_defaults.json")), file);
            }
        } catch (IOException e) {
            str2 = f20154a;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str = e.getLocalizedMessage();
            r0 = e;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
        } catch (URISyntaxException e2) {
            str2 = f20154a;
            sb = new StringBuilder();
            sb.append("ERROR: ");
            str = e2.getLocalizedMessage();
            r0 = e2;
            sb.append(str);
            Log.e(str2, sb.toString(), r0);
        }
    }

    /* renamed from: e */
    private void m28040e() {
        StringBuilder sb = new StringBuilder();
        sb.append("yhfkdjmeol_fusioncharteditor_");
        sb.append(this.f20160b);
        sb.append(".chartdata.json");
        try {
            this.f20156af = new JSONObject(C6613i.m31991b(App.m25649e(sb.toString())));
            JSONObject jSONObject = this.f20156af.getJSONObject("chart");
            jSONObject.put("caption", mo1320t().getString(C5462k.fusioncharts_editor_psa_report));
            jSONObject.put("subcaption", "");
            jSONObject.put("xaxisname", mo1320t().getString(C5462k.fusioncharts_editor_date));
            jSONObject.put("yaxisname", mo1320t().getString(C5462k.fusioncharts_editor_psa_ng_ml));
            JSONObject jSONObject2 = this.f20156af.getJSONArray("dataset").getJSONObject(0);
            JSONObject jSONObject3 = this.f20156af.getJSONArray("dataset").getJSONObject(1);
            jSONObject2.put("seriesname", mo1219a(C5462k.fusioncharts_editor_total_psa));
            jSONObject3.put("seriesname", mo1219a(C5462k.fusioncharts_editor_free_psa));
            this.f20157ag = this.f20156af.getJSONArray("categories").getJSONObject(0).getJSONArray("category");
            for (int i = 0; i < this.f20157ag.length(); i++) {
                this.f20157ag.getJSONObject(i).put("label", m28035c(this.f20157ag.getJSONObject(i).getString("label")));
            }
            this.f20158ah = jSONObject2.getJSONArray("data");
            this.f20159ai = jSONObject3.getJSONArray("data");
        } catch (IOException | IllegalArgumentException | JSONException e) {
            Log.e(f20154a, "Error: Parsing the config file failed:", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28041e(int i) {
        this.f20157ag = m28025a(this.f20157ag, i);
        this.f20159ai = m28025a(this.f20159ai, i);
        this.f20158ah = m28025a(this.f20158ah, i);
        JSONObject jSONObject = this.f20156af.getJSONArray("dataset").getJSONObject(0);
        JSONObject jSONObject2 = this.f20156af.getJSONArray("dataset").getJSONObject(1);
        this.f20156af.getJSONArray("categories").getJSONObject(0).put("category", this.f20157ag);
        jSONObject.put("data", this.f20158ah);
        jSONObject2.put("data", this.f20159ai);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m28046m(boolean z) {
        if (this.f20166h != null) {
            MenuItem findItem = this.f20166h.findItem(C5458g.fusioncharts_editor_menu_save);
            if (findItem != null) {
                findItem.setVisible(z);
            }
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20160b = m.getString("EDITED_PAGE_ID");
        }
        View inflate = layoutInflater.inflate(C5460i.fragment_fusion_charts_editor, viewGroup, false);
        this.f20161c = (EditText) inflate.findViewById(C5458g.fusionchartEditorEditTextPSA);
        this.f20162d = (TextView) inflate.findViewById(C5458g.fusionchartsEditorTextViewRatio);
        this.f20163e = (SeekBar) inflate.findViewById(C5458g.fusionchartEditorSeekBarFreeTotalRatio);
        this.f20164f = (Button) inflate.findViewById(C5458g.fusionchartEditroPickDateButton);
        this.f20164f.setText(DateFormat.getDateFormat(mo1318s()).format(new Date()));
        this.f20164f.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C5670a.this.f20167i == null) {
                    C5670a.this.f20167i = new C5677a();
                    C5670a.this.f20167i.mo1238a((Fragment) C5670a.this, 0);
                }
                C5670a.this.f20167i.mo1448a(C5670a.this.mo1318s().mo1469g(), "datePicker");
            }
        });
        this.f20165g = (ListView) inflate.findViewById(C5458g.fusionchartEditorItemsList);
        ((Button) inflate.findViewById(C5458g.fusionchartEditorButtonAddItem)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C6592al.m31909b(C5670a.this.f20161c.getText().toString())) {
                    C0766a aVar = new C0766a(C5670a.this.mo1318s());
                    aVar.mo3047a(C5462k.info).mo3060b(C5462k.fusioncharts_editor_please_provide_total_psa_message).mo3056a(false).mo3048a(C5462k.f19438OK, (DialogInterface.OnClickListener) null);
                    aVar.mo3068c();
                    return;
                }
                C5670a.this.m28031at();
                C5670a.this.m28030as();
                C5670a.this.m28036c();
            }
        });
        this.f20165g.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long j) {
                try {
                    String string = C5670a.this.f20157ag.getJSONObject(i).getString("label");
                    C0766a aVar = new C0766a(C5670a.this.mo1318s());
                    aVar.mo3063b((CharSequence) String.format(C5670a.this.mo1219a(C5462k.fusioncharts_editor_year_dialog), new Object[]{string})).mo3056a(true).mo3061b(C5462k.cancel, (DialogInterface.OnClickListener) null).mo3048a(17039370, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (i == -1) {
                                try {
                                    C5670a.this.m28041e(i);
                                } catch (JSONException e) {
                                    String b = C5670a.f20154a;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("ERROR: ");
                                    sb.append(e.getLocalizedMessage());
                                    Log.e(b, sb.toString(), e);
                                }
                                C5670a.this.m28030as();
                                C5670a.this.m28036c();
                                C5670a.this.m28046m(true);
                            }
                        }
                    });
                    aVar.mo3047a(C5462k.info);
                    aVar.mo3065b().show();
                    return true;
                } catch (JSONException e) {
                    String b = C5670a.f20154a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ERROR: ");
                    sb.append(e.getLocalizedMessage());
                    Log.e(b, sb.toString(), e);
                    return false;
                }
            }
        });
        this.f20163e.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                DecimalFormat decimalFormat = new DecimalFormat("0.00");
                C5670a.this.f20162d.setText(String.format(C5670a.this.mo1219a(C5462k.fusioncharts_editor_free_total_psa_ratio), new Object[]{decimalFormat.format((double) (((float) i) / 100.0f)), Integer.valueOf(i)}));
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        this.f20163e.setProgress(25);
        m28038d();
        m28040e();
        m28030as();
        m28036c();
        return inflate;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.fusioncharts_editor_menu, menu);
        this.f20166h = menu;
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.fusioncharts_editor_menu_save) {
            return super.mo1245a(menuItem);
        }
        m28029aA();
        m28046m(false);
        return true;
    }
}
