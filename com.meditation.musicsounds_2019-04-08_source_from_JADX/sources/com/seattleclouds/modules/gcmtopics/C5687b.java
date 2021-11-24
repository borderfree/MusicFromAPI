package com.seattleclouds.modules.gcmtopics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.gcmtopics.b */
public class C5687b extends C6671x {
    /* access modifiers changed from: private */

    /* renamed from: aA */
    public String f20197aA = "";

    /* renamed from: aB */
    private boolean f20198aB = false;

    /* renamed from: aC */
    private boolean f20199aC = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public HashMap<String, List<GCMTopic>> f20200ae;

    /* renamed from: af */
    private String f20201af = "";
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public String f20202ag = "announcement";
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public ArrayList<GCMTopicListItem> f20203ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public ArrayList<GCMTopicListItem> f20204ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public String[] f20205aj;
    /* access modifiers changed from: private */
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: ak */
    public HashMap<Integer, Integer> f20206ak = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: al */
    public ListView f20207al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public C5684a f20208am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public C5684a f20209an;

    /* renamed from: ao */
    private int f20210ao = 0;

    /* renamed from: ap */
    private int f20211ap = 0;

    /* renamed from: aq */
    private boolean f20212aq = false;

    /* renamed from: ar */
    private MenuItem f20213ar;

    /* renamed from: as */
    private MenuItem f20214as;

    /* renamed from: at */
    private int f20215at = 0;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public SearchView f20216au;
    /* access modifiers changed from: private */

    /* renamed from: av */
    public TextView f20217av;

    /* renamed from: aw */
    private boolean f20218aw = false;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public boolean f20219ax = false;

    /* renamed from: ay */
    private boolean f20220ay = false;

    /* renamed from: az */
    private String f20221az = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<GCMTopic> f20222i;

    /* renamed from: com.seattleclouds.modules.gcmtopics.b$a */
    private class C5691a extends AsyncTask<Void, String, String> {
        private C5691a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("publisherId", App.f18522x);
            hashMap.put("username", App.f18523y);
            hashMap.put("appId", App.f18524z);
            hashMap.put("deviceId", C5687b.this.m28105as());
            hashMap.put("type", C5687b.this.f20202ag);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                sb.append(App.f18518t);
                sb.append("/gcm_get_topic_subscriptions.ashx");
                String a = HTTPUtil.m31764a(sb.toString(), (Map<String, String>) hashMap);
                if (a == null || a.length() < 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unparsable response received from server: ");
                    sb2.append(a);
                    Log.e("GCMTopicsFragment", sb2.toString());
                    return "Internal Server Error";
                } else if (a.startsWith("ERROR:")) {
                    String substring = a.substring(6);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error received from server: ");
                    sb3.append(substring);
                    Log.e("GCMTopicsFragment", sb3.toString());
                    return substring;
                } else if (!a.startsWith("OK")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unknown error received from server: ");
                    sb4.append(a);
                    Log.e("GCMTopicsFragment", sb4.toString());
                    return a;
                } else {
                    String[] strArr = new String[0];
                    if (a.length() > 2) {
                        strArr = a.substring(3).split(",");
                    }
                    HashSet hashSet = new HashSet();
                    for (String add : strArr) {
                        hashSet.add(add);
                    }
                    Iterator it = C5687b.this.f20222i.iterator();
                    while (it.hasNext()) {
                        GCMTopic gCMTopic = (GCMTopic) it.next();
                        gCMTopic.f20187d = hashSet.contains(gCMTopic.f20184a);
                    }
                    return null;
                }
            } catch (IOException e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("IO Error: ");
                sb5.append(e);
                Log.w("GCMTopicsFragment", sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append("IOException: ");
                sb6.append(e);
                return sb6.toString();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (C5687b.this.mo1318s() == null) {
                C5687b.this.m28113b(false);
                Log.w("GCMTopicsFragment", "activity is null");
                return;
            }
            if (str == null) {
                C5687b.this.m28106at();
            } else if (str.startsWith("IOException")) {
                C5687b.this.m28108av();
            } else {
                C6620n.m32028a((Context) C5687b.this.mo1318s(), C5462k.error, C5462k.common_internal_server_error);
            }
            C5687b.this.m28113b(false);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5687b.this.m28113b(true);
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.modules.gcmtopics.b$b */
    private class C5692b extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private boolean f20229b;

        private C5692b() {
            this.f20229b = false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Bundle m = C5687b.this.mo1307m();
            if (m != null) {
                ArrayList stringArrayList = m.getStringArrayList("ARG_TOPIC_IDS");
                ArrayList stringArrayList2 = m.getStringArrayList("ARG_TOPIC_TITLES");
                if (stringArrayList2 == null) {
                    stringArrayList2 = stringArrayList;
                }
                if (stringArrayList == null) {
                    C5687b.this.f20222i = App.f18501c.mo16907I();
                } else {
                    C5687b.this.f20222i = new ArrayList(stringArrayList.size());
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        C5687b.this.f20222i.add(new GCMTopic((String) stringArrayList.get(i), (String) stringArrayList2.get(i), null));
                    }
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = C5687b.this.f20222i.iterator();
            while (it.hasNext()) {
                GCMTopic gCMTopic = (GCMTopic) it.next();
                linkedHashSet.add(gCMTopic.f20186c);
                List list = (List) C5687b.this.f20200ae.get(gCMTopic.f20186c);
                if (list == null) {
                    list = new ArrayList();
                    C5687b.this.f20200ae.put(gCMTopic.f20186c, list);
                }
                list.add(gCMTopic);
            }
            C5687b.this.f20205aj = new String[linkedHashSet.size()];
            Iterator it2 = linkedHashSet.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (i2 == 0 && linkedHashSet.size() == 1 && C6592al.m31909b(str)) {
                    C5687b.this.f20205aj = null;
                }
                C5687b.this.f20206ak.put(Integer.valueOf(i2), Integer.valueOf(C5687b.this.f20203ah.size()));
                if (C5687b.this.f20205aj != null) {
                    C5687b.this.f20205aj[i2] = str;
                    C5687b.this.f20203ah.add(new GCMTopicListItem().mo18289a(0).mo18292b(i2).mo18290a((Object) str));
                }
                for (GCMTopic a : (List) C5687b.this.f20200ae.get(str)) {
                    C5687b.this.f20203ah.add(new GCMTopicListItem().mo18289a(1).mo18292b(i2).mo18290a((Object) a));
                }
                i2++;
            }
            if (C5687b.this.f20222i.size() > 0) {
                this.f20229b = C5687b.this.m28110ay();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            C5687b.this.f20219ax = C5687b.this.f20205aj != null;
            if (C5687b.this.mo1318s() != null) {
                C5687b.this.f20208am = new C5684a(C5687b.this.mo1318s(), C5687b.this.f20203ah, C5687b.this.f20205aj, C5687b.this.f20206ak);
                C5687b.this.f20209an = new C5684a(C5687b.this.mo1318s(), C5687b.this.f20204ai, null, null);
                if (C5687b.this.f20222i.size() > 0) {
                    C5687b.this.m28103a(Boolean.valueOf(this.f20229b));
                    new C5691a().execute(new Void[0]);
                } else {
                    C5687b.this.f20216au.setVisibility(8);
                    C5687b.this.m28113b(false);
                    C5687b.this.m28128m(C5687b.this.f20219ax);
                    C5687b.this.f20207al.setAdapter(C5687b.this.f20208am);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5687b.this.m28113b(true);
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.modules.gcmtopics.b$c */
    private class C5693c extends AsyncTask<Void, String, String> {
        private C5693c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            if (C5687b.this.mo1318s() == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = C5687b.this.f20222i.iterator();
            while (it.hasNext()) {
                GCMTopic gCMTopic = (GCMTopic) it.next();
                if (gCMTopic.f20187d) {
                    arrayList.add(gCMTopic.f20184a);
                }
            }
            try {
                String a = C5268b.m26273a((Context) C5687b.this.mo1318s(), C5687b.this.f20202ag, (List<String>) arrayList);
                if (a == null || a.length() < 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unparsable response received from server: ");
                    sb.append(a);
                    Log.e("GCMTopicsFragment", sb.toString());
                    return "Internal Server Error";
                } else if (a.startsWith("ERROR:")) {
                    String substring = a.substring(6);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error received from server: ");
                    sb2.append(substring);
                    Log.e("GCMTopicsFragment", sb2.toString());
                    return substring;
                } else if (a.startsWith("OK")) {
                    return null;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown error received from server: ");
                    sb3.append(a);
                    Log.e("GCMTopicsFragment", sb3.toString());
                    return a;
                }
            } catch (IOException e) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("IO Error: ");
                sb4.append(e.toString());
                Log.w("GCMTopicsFragment", sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append("IOException: ");
                sb5.append(e.toString());
                return sb5.toString();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            C5687b.this.m28113b(false);
            if (C5687b.this.mo1318s() == null) {
                Log.w("GCMTopicsFragment", "activity is null");
                return;
            }
            if (str == null) {
                Toast.makeText(C5687b.this.mo1318s(), C5462k.gcm_topics_saved, 0).show();
            } else if (str.startsWith("IOException")) {
                C5687b.this.m28108av();
            } else {
                C6620n.m32028a((Context) C5687b.this.mo1318s(), C5462k.error, C5462k.common_internal_server_error);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C5687b.this.m28113b(true);
            super.onPreExecute();
        }
    }

    /* renamed from: a */
    private void m28099a(int i, boolean z) {
        this.f20207al.setItemChecked(i + this.f20215at, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m28103a(Boolean bool) {
        if (bool == null) {
            bool = Boolean.valueOf(m28110ay());
        }
        if (bool.booleanValue()) {
            this.f20218aw = true;
            this.f20209an.mo18302a((List<GCMTopicListItem>) this.f20204ai);
            this.f20207al.setAdapter(this.f20209an);
            m28106at();
            m28128m(false);
            return;
        }
        this.f20218aw = false;
        this.f20207al.setAdapter(this.f20208am);
        m28106at();
        m28128m(this.f20219ax);
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public String m28105as() {
        return C6618l.m32012a();
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m28106at() {
        ArrayList<GCMTopicListItem> arrayList = this.f20218aw ? this.f20204ai : this.f20203ah;
        for (int i = 0; i < arrayList.size(); i++) {
            GCMTopicListItem gCMTopicListItem = (GCMTopicListItem) arrayList.get(i);
            if (gCMTopicListItem.mo18288a() == 1) {
                m28099a(i, gCMTopicListItem.mo18293c().f20187d);
            }
        }
    }

    /* renamed from: au */
    private void m28107au() {
        ArrayList<GCMTopicListItem> arrayList = this.f20218aw ? this.f20204ai : this.f20203ah;
        for (int i = 0; i < arrayList.size(); i++) {
            GCMTopicListItem gCMTopicListItem = (GCMTopicListItem) arrayList.get(i);
            if (gCMTopicListItem.mo18288a() == 1) {
                m28099a(i, false);
                gCMTopicListItem.mo18293c().f20187d = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: av */
    public void m28108av() {
        C0367h s = mo1318s();
        ConnectivityManager connectivityManager = (ConnectivityManager) s.getSystemService("connectivity");
        Toast.makeText(s, (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) ? C5462k.common_no_network : C5462k.common_network_error, 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public void m28109ax() {
        m28103a((Boolean) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: ay */
    public boolean m28110ay() {
        String trim = this.f20216au.getQuery().toString().trim();
        String trim2 = this.f20217av.getText().toString().trim();
        this.f20221az = trim;
        if (trim.isEmpty() && trim2.isEmpty()) {
            return false;
        }
        this.f20204ai.clear();
        String lowerCase = trim.toLowerCase(Locale.getDefault());
        Iterator it = this.f20222i.iterator();
        while (it.hasNext()) {
            GCMTopic gCMTopic = (GCMTopic) it.next();
            String trim3 = gCMTopic.f20186c == null ? "" : gCMTopic.f20186c.trim();
            String lowerCase2 = gCMTopic.f20185b.toLowerCase(Locale.getDefault());
            if ((trim2.isEmpty() || trim3.equalsIgnoreCase(trim2)) && (lowerCase.isEmpty() || lowerCase2.contains(lowerCase))) {
                this.f20204ai.add(new GCMTopicListItem().mo18290a((Object) gCMTopic));
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28113b(boolean z) {
        if (this.f20212aq != z) {
            this.f20212aq = z;
            mo20721d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28119e() {
        this.f20216au.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) mo1318s().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f20216au.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m28128m(boolean z) {
        this.f20207al.setFastScrollEnabled(z);
        this.f20207al.setFastScrollAlwaysVisible(z);
        this.f20207al.setPadding(this.f20210ao, this.f20207al.getPaddingTop(), z ? this.f20211ap : this.f20210ao, this.f20207al.getPaddingBottom());
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0367h s;
        float f;
        View inflate = layoutInflater.inflate(C5460i.fragment_gcm_topics, viewGroup, false);
        this.f20207al = (ListView) inflate.findViewById(16908298);
        this.f20210ao = C6619m.m32014a(mo1318s(), 14.0f);
        this.f20207al.setPadding(this.f20210ao, this.f20207al.getPaddingTop(), this.f20210ao, this.f20207al.getPaddingBottom());
        if (VERSION.SDK_INT < 22) {
            s = mo1318s();
            f = 32.0f;
        } else {
            s = mo1318s();
            f = 20.0f;
        }
        this.f20211ap = C6619m.m32014a(s, f);
        boolean z = true;
        if (!C6592al.m31909b(this.f20201af)) {
            TextView textView = new TextView(mo1318s());
            textView.setTextAppearance(mo1318s(), 16973892);
            textView.setTextSize(16.0f);
            int a = C6619m.m32014a(mo1318s(), 8.0f);
            textView.setPadding(a, a, a, a);
            textView.setText(this.f20201af);
            this.f20207al.addHeaderView(textView);
            this.f20215at = 1;
        }
        this.f20207al.setChoiceMode(2);
        this.f20216au = (SearchView) inflate.findViewById(C5458g.search_view);
        C5334b.m26753a(mo1453c().mo17546c(mo1318s()), this.f20216au);
        this.f20216au.mo4608a((CharSequence) this.f20221az, false);
        if (!this.f20220ay) {
            this.f20216au.setVisibility(8);
        }
        this.f20207al.setOnTouchListener(new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                C5687b.this.m28119e();
                return false;
            }
        });
        this.f20217av = (TextView) inflate.findViewById(C5458g.group_filter);
        TextView textView2 = this.f20217av;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20197aA);
        sb.append(" ");
        textView2.setText(sb.toString());
        final View findViewById = inflate.findViewById(C5458g.group_filter_panel);
        if (this.f20197aA.isEmpty()) {
            findViewById.setVisibility(8);
        }
        ((Button) inflate.findViewById(C5458g.group_filter_clear)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5687b.this.f20217av.setText("");
                C5687b.this.f20197aA = "";
                findViewById.setVisibility(8);
                C5687b.this.m28109ax();
            }
        });
        this.f20216au.setOnQueryTextListener(new C0973c() {
            /* renamed from: a */
            public boolean mo4687a(String str) {
                C5687b.this.m28119e();
                return false;
            }

            /* renamed from: a_ */
            public boolean mo4688a_(String str) {
                C5687b.this.m28109ax();
                return false;
            }
        });
        if (bundle == null) {
            z = false;
        }
        this.f20198aB = z;
        this.f20199aC = false;
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("ARG_NOTE");
            if (string != null) {
                this.f20201af = string;
            }
            String string2 = m.getString("ARG_TOPIC_TYPE");
            if (string2 != null) {
                this.f20202ag = string2;
            }
            String string3 = m.getString("ARG_SEARCH_QUERY");
            if (string3 != null) {
                this.f20221az = string3.trim();
            }
            String string4 = m.getString("ARG_GROUP_FILTER");
            if (string4 != null) {
                this.f20197aA = string4.trim();
            }
            this.f20220ay = m.getBoolean("ARG_SEARCH_ENABLED", false);
        }
        this.f20222i = new ArrayList<>();
        this.f20203ah = new ArrayList<>();
        this.f20204ai = new ArrayList<>();
        this.f20200ae = new HashMap<>();
        if (bundle != null) {
            this.f20222i = bundle.getParcelableArrayList("topics");
            this.f20203ah = bundle.getParcelableArrayList("items");
            this.f20204ai = bundle.getParcelableArrayList("searchItems");
            this.f20221az = bundle.getString("searchQuery");
            this.f20205aj = bundle.getStringArray("sections");
            this.f20218aw = bundle.getBoolean("showingSearchResults");
            this.f20219ax = bundle.getBoolean("sectionEnabled");
            this.f20206ak = (HashMap) bundle.getSerializable("sectionPositions");
            this.f20200ae = (HashMap) bundle.getSerializable("topicsByGroup");
            this.f20197aA = bundle.getString("groupFilter");
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        this.f20213ar.setVisible(this.f20212aq);
        boolean z = true;
        this.f20214as.setVisible(!this.f20212aq);
        if (this.f20212aq || this.f20222i.size() <= 0) {
            z = false;
        }
        this.f20214as.setEnabled(z);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.gcm_topics, menu);
        this.f20213ar = menu.findItem(C5458g.progress);
        this.f20213ar.setActionView(new ProgressBar(mo1318s(), null, 16842871));
        this.f20213ar.expandActionView();
        this.f20214as = menu.findItem(C5458g.save);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (bundle == null) {
            this.f20207al.setVisibility(8);
            view.findViewById(16908292).setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        Object item = this.f20207al.getAdapter().getItem(i);
        if (item instanceof GCMTopicListItem) {
            GCMTopicListItem gCMTopicListItem = (GCMTopicListItem) item;
            if (gCMTopicListItem.mo18288a() == 1) {
                GCMTopic c = gCMTopicListItem.mo18293c();
                c.f20187d = !c.f20187d;
            }
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z) {
            this.f20199aC = true;
        } else if (this.f20198aB || this.f20222i.size() > 0) {
            if (!this.f20199aC) {
                this.f20208am = new C5684a(mo1318s(), this.f20203ah, this.f20205aj, this.f20206ak);
                this.f20209an = new C5684a(mo1318s(), this.f20204ai, null, null);
                if (this.f20218aw) {
                    this.f20209an.mo18302a((List<GCMTopicListItem>) this.f20204ai);
                    this.f20207al.setAdapter(this.f20209an);
                    m28128m(false);
                } else {
                    this.f20207al.setAdapter(this.f20208am);
                    m28128m(this.f20219ax);
                }
            }
            if ((this.f20198aB || this.f20222i.size() <= 0) && !this.f20199aC) {
                m28106at();
                return;
            }
            m28107au();
            new C5691a().execute(new Void[0]);
        } else {
            new C5692b().execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.save) {
            return super.mo1245a(menuItem);
        }
        new C5693c().execute(new Void[0]);
        return true;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putParcelableArrayList("topics", this.f20222i);
        bundle.putString("searchQuery", this.f20221az);
        bundle.putParcelableArrayList("items", this.f20203ah);
        bundle.putParcelableArrayList("searchItems", this.f20204ai);
        bundle.putStringArray("sections", this.f20205aj);
        bundle.putSerializable("sectionPositions", this.f20206ak);
        bundle.putBoolean("showingSearchResults", this.f20218aw);
        bundle.putBoolean("sectionEnabled", this.f20219ax);
        bundle.putSerializable("topicsByGroup", this.f20200ae);
        bundle.putString("groupFilter", this.f20197aA.trim());
        super.mo1282e(bundle);
    }
}
