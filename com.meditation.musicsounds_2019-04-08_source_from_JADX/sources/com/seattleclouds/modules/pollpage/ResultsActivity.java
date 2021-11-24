package com.seattleclouds.modules.pollpage;

import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.modules.pollpage.Pacpie.C6165Pacpie;
import com.seattleclouds.modules.pollpage.Pacpie.C6168b;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ResultsActivity extends C6348n {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f21887n = "ResultsActivity";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f21888o;

    /* renamed from: p */
    private static final String[] f21889p = {"#EF5350", "#42A5F5", "#BA68C8", "#AD1457", "#FFAB00", "#F06292", "#9575CD", "#1565C0", "#6A1B9A", "#009688", "#33691E", "#AEEA00", "#827717", "#EF6C00", "#0097A7", "#FBC02D", "#8D6E63", "#78909C"};

    /* renamed from: A */
    private C6172a f21890A;

    /* renamed from: q */
    private String f21891q = "";
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ListView f21892r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View f21893s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public TextView f21894t;

    /* renamed from: u */
    private MenuItem f21895u;

    /* renamed from: v */
    private MenuItem f21896v;

    /* renamed from: w */
    private Boolean f21897w = Boolean.valueOf(false);

    /* renamed from: x */
    private C6165Pacpie f21898x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f21899y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ArrayList<Map<String, String>> f21900z = new ArrayList<>();

    /* renamed from: com.seattleclouds.modules.pollpage.ResultsActivity$a */
    private class C6172a extends BaseAdapter {

        /* renamed from: b */
        private LayoutInflater f21904b;

        public C6172a(Context context) {
            this.f21904b = LayoutInflater.from(context);
        }

        /* renamed from: a */
        public Map<String, String> getItem(int i) {
            return (Map) ResultsActivity.this.f21900z.get(i);
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public int getCount() {
            return ResultsActivity.this.f21900z.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6174c cVar;
            Map a = getItem(i);
            if (view == null) {
                view = this.f21904b.inflate(C5460i.pollpage_results_item_view, viewGroup, false);
                cVar = new C6174c();
                cVar.f21906a = (TextView) view.findViewById(C5458g.pollpage_result_percent_alue);
                cVar.f21907b = (TextView) view.findViewById(C5458g.pollpage_result_answer_value);
                view.setTag(cVar);
            } else {
                cVar = (C6174c) view.getTag();
            }
            cVar.f21906a.setText((CharSequence) a.get("percents"));
            cVar.f21906a.setBackgroundColor(Color.parseColor((String) a.get("color")));
            cVar.f21906a.setTextColor(-1);
            cVar.f21907b.setText((CharSequence) a.get("label"));
            return view;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    /* renamed from: com.seattleclouds.modules.pollpage.ResultsActivity$b */
    private static class C6173b extends AsyncTask<String, Void, Integer> {

        /* renamed from: a */
        private WeakReference<ResultsActivity> f21905a;

        public C6173b(ResultsActivity resultsActivity) {
            this.f21905a = new WeakReference<>(resultsActivity);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            int i;
            ResultsActivity resultsActivity = (ResultsActivity) this.f21905a.get();
            if (resultsActivity == null) {
                return Integer.valueOf(0);
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("action", "results");
                hashMap.put("appId", strArr[0]);
                hashMap.put("pageId", strArr[1]);
                hashMap.put("publisherId", strArr[2]);
                String a = HTTPUtil.m31764a(ResultsActivity.f21888o, (Map<String, String>) hashMap);
                new JSONObject(a);
                resultsActivity.f21899y = a;
                return Integer.valueOf(0);
            } catch (IOException e) {
                if (C6612h.m31984a(resultsActivity)) {
                    String n = ResultsActivity.f21887n;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ERROR Unable to refresh poll results: ");
                    sb.append(e.getMessage());
                    Log.e(n, sb.toString(), e);
                    i = C5462k.common_network_error;
                } else {
                    i = C5462k.common_no_network;
                }
                return Integer.valueOf(i);
            } catch (JSONException e2) {
                String n2 = ResultsActivity.f21887n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ERROR Unable to parse JSON: ");
                sb2.append(e2.getMessage());
                Log.e(n2, sb2.toString(), e2);
                i = C5462k.common_internal_server_error;
                return Integer.valueOf(i);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            ResultsActivity resultsActivity = (ResultsActivity) this.f21905a.get();
            if (resultsActivity != null) {
                if (num.intValue() == 0) {
                    resultsActivity.f21894t.setVisibility(4);
                    resultsActivity.f21893s.setVisibility(0);
                    resultsActivity.m30073q();
                } else if (resultsActivity.f21892r.getAdapter().getCount() > 0) {
                    Toast.makeText(resultsActivity, num.intValue(), 0).show();
                } else {
                    resultsActivity.f21894t.setText(num.intValue());
                    resultsActivity.f21894t.setVisibility(0);
                    resultsActivity.f21893s.setVisibility(4);
                }
                resultsActivity.m30068c(false);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            ResultsActivity resultsActivity = (ResultsActivity) this.f21905a.get();
            if (resultsActivity != null) {
                resultsActivity.m30068c(true);
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.pollpage.ResultsActivity$c */
    private static class C6174c {

        /* renamed from: a */
        TextView f21906a;

        /* renamed from: b */
        TextView f21907b;

        private C6174c() {
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/pollpagehandler.ashx");
        f21888o = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30068c(boolean z) {
        if (this.f21897w.booleanValue() != z) {
            this.f21897w = Boolean.valueOf(z);
            invalidateOptionsMenu();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m30073q() {
        int i;
        int i2;
        try {
            this.f21900z.clear();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(this.f21899y);
            try {
                i = Integer.parseInt(jSONObject.getString("$results$"));
            } catch (NumberFormatException e) {
                String str = f21887n;
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR Unable parse Integer: ");
                sb.append(e.getMessage());
                Log.e(str, sb.toString(), e);
                i = 0;
            }
            if (i > 0) {
                Iterator keys = jSONObject.keys();
                int i3 = 0;
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    if (!str2.equals("$results$")) {
                        String str3 = str2.equals("$$other$$") ? "Other" : str2;
                        try {
                            i2 = Integer.parseInt(jSONObject.getString(str2));
                        } catch (NumberFormatException e2) {
                            String str4 = f21887n;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("ERROR Unable parse Integer: ");
                            sb2.append(e2.getMessage());
                            Log.e(str4, sb2.toString(), e2);
                            i2 = 0;
                        }
                        if (i2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            double d = (double) i2;
                            double d2 = (double) i;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            sb3.append((int) ((d / d2) * 100.0d));
                            sb3.append("%");
                            String sb4 = sb3.toString();
                            HashMap hashMap = new HashMap();
                            hashMap.put("label", str3);
                            hashMap.put("votes", String.valueOf(i2));
                            hashMap.put("percents", sb4);
                            int i4 = i3 + 1;
                            hashMap.put("color", f21889p[i3 % f21889p.length]);
                            this.f21900z.add(hashMap);
                            C6168b bVar = new C6168b();
                            bVar.f21884a = (float) i2;
                            bVar.f21885b = Color.parseColor((String) hashMap.get("color"));
                            bVar.f21886c = str3;
                            arrayList.add(bVar);
                            i3 = i4;
                        }
                    }
                }
            } else {
                C6168b bVar2 = new C6168b();
                bVar2.f21884a = 1.0f;
                bVar2.f21885b = Color.parseColor("#666666");
                arrayList.add(bVar2);
            }
            ((TextView) findViewById(C5458g.pollpage_total_totes)).setText(getString(C5462k.pollpage_total_votes, new Object[]{Integer.valueOf(i)}));
            this.f21898x = (C6165Pacpie) findViewById(C5458g.pollpage_pacpie_chart);
            this.f21898x.setValues(arrayList);
            this.f21898x.mo19364a();
            this.f21890A.notifyDataSetChanged();
        } catch (JSONException e3) {
            String str5 = f21887n;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ERROR Unable parse JSON: ");
            sb5.append(e3.getMessage());
            Log.e(str5, sb5.toString(), e3);
        }
    }

    /* renamed from: r */
    private void m30074r() {
        new C6173b(this).execute(new String[]{App.f18524z, this.f21891q, App.f18522x});
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        if (r2.f21899y.length() > 0) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            int r0 = com.seattleclouds.C5451m.C5462k.pollpage_results
            r2.setTitle(r0)
            int r0 = com.seattleclouds.C5451m.C5460i.activity_pollpage_results
            r2.setContentView(r0)
            android.content.Intent r0 = r2.getIntent()
            java.lang.String r1 = "PAGE_ID"
            java.lang.String r1 = r0.getStringExtra(r1)
            r2.f21891q = r1
            java.lang.String r1 = "STRING_RESULTS_RESPONSE"
            java.lang.String r0 = r0.getStringExtra(r1)
            r2.f21899y = r0
            int r0 = com.seattleclouds.C5451m.C5458g.pollpage_answers_listview
            android.view.View r0 = r2.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r2.f21892r = r0
            com.seattleclouds.modules.pollpage.ResultsActivity$a r0 = new com.seattleclouds.modules.pollpage.ResultsActivity$a
            r0.<init>(r2)
            r2.f21890A = r0
            android.widget.ListView r0 = r2.f21892r
            com.seattleclouds.modules.pollpage.ResultsActivity$a r1 = r2.f21890A
            r0.setAdapter(r1)
            int r0 = com.seattleclouds.C5451m.C5458g.rootView
            android.view.View r0 = r2.findViewById(r0)
            r2.f21893s = r0
            int r0 = com.seattleclouds.C5451m.C5458g.pollpage_error_message
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.f21894t = r0
            java.lang.String r0 = r2.f21899y
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r2.f21899y
            int r0 = r0.length()
            if (r0 > 0) goto L_0x006b
        L_0x0057:
            if (r3 == 0) goto L_0x0081
            java.lang.String r0 = "STATE_RESULTS_RESPONSE"
            java.lang.String r3 = r3.getString(r0)
            r2.f21899y = r3
            if (r3 == 0) goto L_0x0081
            java.lang.String r3 = r2.f21899y
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0081
        L_0x006b:
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            if (r0 == 0) goto L_0x0084
            com.seattleclouds.modules.pollpage.ResultsActivity$1 r1 = new com.seattleclouds.modules.pollpage.ResultsActivity$1
            r1.<init>(r3)
            r0.addOnGlobalLayoutListener(r1)
            goto L_0x0084
        L_0x0081:
            r2.m30074r()
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.pollpage.ResultsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(C5461j.pollpage_results_menu, menu);
        this.f21895u = menu.findItem(C5458g.pollpage_results_refresh_button);
        this.f21896v = menu.findItem(C5458g.pollpage_results_progress_activity);
        this.f21896v.setActionView(new ProgressBar(this, null, 16842871));
        this.f21896v.expandActionView();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.pollpage_results_refresh_button) {
            return super.onOptionsItemSelected(menuItem);
        }
        m30074r();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        this.f21896v.setVisible(this.f21897w.booleanValue());
        this.f21895u.setVisible(!this.f21897w.booleanValue());
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("STATE_RESULTS_RESPONSE", this.f21899y);
        super.onSaveInstanceState(bundle);
    }
}
