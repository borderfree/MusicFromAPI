package com.seattleclouds.modules.pollpage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.pollpage.a */
public class C6175a extends C5346b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f21908a = "a";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f21909f;

    /* renamed from: ae */
    private MenuItem f21910ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public Boolean f21911af = Boolean.valueOf(false);
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public boolean f21912ag = true;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f21913ah = false;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f21914ai = false;

    /* renamed from: aj */
    private String f21915aj = "";
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public JSONObject f21916ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public String f21917al = "";
    /* access modifiers changed from: private */

    /* renamed from: am */
    public String f21918am = "";
    /* access modifiers changed from: private */

    /* renamed from: an */
    public String f21919an = "";

    /* renamed from: ao */
    private String f21920ao = "";
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public String f21921ap = "";

    /* renamed from: g */
    private SharedPreferences f21922g;

    /* renamed from: h */
    private MenuItem f21923h;

    /* renamed from: i */
    private MenuItem f21924i;

    /* renamed from: com.seattleclouds.modules.pollpage.a$a */
    public class C6179a {
        public C6179a() {
        }

        @JavascriptInterface
        public void refreshSavedCheckedAnswer() {
            C6175a.this.m30085aJ();
        }

        @JavascriptInterface
        public void returnCurrentCheckedAnswer(String str) {
            C6175a.this.f21918am = str;
        }

        @JavascriptInterface
        public void returnPollJson(final String str) {
            C6175a.this.f19171d.post(new Runnable() {
                public void run() {
                    try {
                        C6175a.this.f21916ak = new JSONObject(str);
                        if (C6175a.this.f21916ak != null) {
                            C6175a.this.f21917al = C6175a.this.f21916ak.has("nextPage") ? C6175a.this.f21916ak.getString("nextPage") : "";
                            C6175a.this.f21912ag = C6175a.this.f21916ak.getBoolean("allowResultsPreview");
                            C6175a.this.f21913ah = C6175a.this.f21916ak.getBoolean("allowNextPageWithoutSubmit");
                            C6175a.this.mo20292ay();
                        }
                    } catch (JSONException e) {
                        String aB = C6175a.f21908a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ERROR Unable to read from JSON: ");
                        sb.append(e.getMessage());
                        Log.e(aB, sb.toString(), e);
                    }
                }
            });
        }
    }

    /* renamed from: com.seattleclouds.modules.pollpage.a$b */
    private static class C6181b extends AsyncTask<String, Void, Integer> {

        /* renamed from: a */
        private WeakReference<C6175a> f21932a;

        public C6181b(C6175a aVar) {
            this.f21932a = new WeakReference<>(aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(String... strArr) {
            int i;
            C6175a aVar = (C6175a) this.f21932a.get();
            if (aVar == null) {
                return Integer.valueOf(1);
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("action", "vote");
                hashMap.put("appId", strArr[0]);
                hashMap.put("pageId", strArr[1]);
                hashMap.put("publisherId", strArr[2]);
                hashMap.put("votingString", strArr[3]);
                hashMap.put("uniqueUUID", strArr[4]);
                if (strArr[5].equals("true")) {
                    hashMap.put("allowResultsPreview", "true");
                }
                String b = HTTPUtil.m31768b(C6175a.f21909f, hashMap);
                if (strArr[5].equals("true")) {
                    new JSONObject(b);
                    aVar.f21921ap = b;
                    return Integer.valueOf(0);
                } else if (b.equals("1")) {
                    return Integer.valueOf(0);
                } else {
                    String aB = C6175a.f21908a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("ERROR: ");
                    sb.append(b);
                    Log.e(aB, sb.toString());
                    return Integer.valueOf(1);
                }
            } catch (IOException e) {
                if (C6612h.m31984a(aVar.mo1318s())) {
                    String aB2 = C6175a.f21908a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ERROR Unable to submit voting: ");
                    sb2.append(e.getMessage());
                    Log.e(aB2, sb2.toString(), e);
                    i = C5462k.common_network_error;
                } else {
                    i = C5462k.common_no_network;
                }
                return Integer.valueOf(i);
            } catch (JSONException e2) {
                String aB3 = C6175a.f21908a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ERROR Unable to parse JSON: ");
                sb3.append(e2.getMessage());
                Log.e(aB3, sb3.toString(), e2);
                i = C5462k.common_internal_server_error;
                return Integer.valueOf(i);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            C6175a aVar = (C6175a) this.f21932a.get();
            if (aVar != null) {
                if (num.intValue() == 0) {
                    aVar.f21914ai = true;
                    aVar.mo20292ay();
                } else {
                    (num.intValue() == 1 ? Toast.makeText(aVar.mo1318s(), C5462k.common_internal_server_error, 0) : Toast.makeText(aVar.mo1318s(), num.intValue(), 0)).show();
                }
                aVar.m30102n(false);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            C6175a aVar = (C6175a) this.f21932a.get();
            if (aVar != null) {
                aVar.m30102n(true);
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/pollpagehandler.ashx");
        f21909f = sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: aI */
    public void m30084aI() {
        new C6181b(this).execute(new String[]{App.f18524z, this.f21915aj, App.f18522x, this.f21918am, this.f21920ao, String.valueOf(this.f21912ag)});
    }

    /* access modifiers changed from: private */
    /* renamed from: aJ */
    public void m30085aJ() {
        this.f19171d.post(new Runnable() {
            public void run() {
                C6602at.m31951a(C6175a.this.f19171d, "(function() {var checkedAnsers = '';var labels = document.getElementsByTagName('label');for (var i = 0; i < labels.length; i++) {var checkbox = document.getElementById(labels[i].getAttribute('for'));if (checkbox.checked) {if(checkedAnsers !='') checkedAnsers += '|$%$|';checkedAnsers += labels[i].textContent;}}HTMLOUT.returnCurrentCheckedAnswer(checkedAnsers)})()");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: aK */
    public void m30086aK() {
        final String str = this.f21918am;
        this.f19171d.post(new Runnable() {
            public void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("(function() {var labels = document.getElementsByTagName('label');var answersString = '");
                sb.append(str);
                sb.append("';var answers = answersString.split('|$%$|');for(var j=0; j<answers.length; j++) {for (var i = 0; i < labels.length; i++) {if (labels[i].textContent == answers[j]) {var checkbox = document.getElementById(labels[i].getAttribute('for'));checkbox.checked = true;document.querySelector('#votebutton').disabled=false;}}}})()");
                C6602at.m31951a(C6175a.this.f19171d, sb.toString());
            }
        });
    }

    /* renamed from: aL */
    private void m30087aL() {
        if (this.f21922g == null) {
            this.f21922g = mo1318s().getSharedPreferences("SHARED_PREFERENCE_POLL_PAGE_KEY", 0);
        }
        this.f21920ao = this.f21922g.getString("SHARED_PREFERENCE_VOTE_PAGE_UNIQUE_ID", "");
        if (this.f21920ao.length() == 0) {
            this.f21920ao = UUID.randomUUID().toString();
            Editor edit = this.f21922g.edit();
            edit.putString("SHARED_PREFERENCE_VOTE_PAGE_UNIQUE_ID", this.f21920ao);
            edit.apply();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m30102n(boolean z) {
        if (this.f21911af.booleanValue() != z) {
            this.f21911af = Boolean.valueOf(z);
            mo20292ay();
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        boolean z = false;
        if (this.f21917al.length() > 0 || this.f21919an.length() > 0) {
            this.f21924i.setVisible(true);
            MenuItem menuItem = this.f21924i;
            if (this.f21913ah || this.f21914ai) {
                z = true;
            }
            menuItem.setEnabled(z);
        } else {
            this.f21924i.setVisible(false);
        }
        this.f21910ae.setVisible(this.f21911af.booleanValue());
        this.f21923h.setVisible(this.f21912ag);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.pollpage_menu, menu);
        this.f21923h = menu.findItem(C5458g.pollpage_results_button);
        this.f21924i = menu.findItem(C5458g.pollpage_next_button);
        this.f21910ae = menu.findItem(C5458g.pollpage_progress_activity);
        this.f21910ae.setActionView(new ProgressBar(mo1318s(), null, 16842871));
        this.f21910ae.expandActionView();
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (bundle != null) {
            this.f21918am = bundle.getString("STATE_CURRENT_ANSWER");
            this.f21917al = bundle.getString("POLL_NEXT_PAGE");
            this.f21919an = bundle.getString("CURRENT_ANSWER_NEXT_PAGE");
            this.f21913ah = bundle.getBoolean("ALLOW_NEXT_PAGE_WITHOUT_SUBMIT");
            this.f21914ai = bundle.getBoolean("ANSWER_SUBMITTED");
            this.f21912ag = bundle.getBoolean("ALLOW_RESULTS_PREVIEW");
            String string = bundle.getString("POLL_INFO");
            if (!C6592al.m31909b(string)) {
                try {
                    this.f21916ak = new JSONObject(string);
                } catch (JSONException e) {
                    Log.d(f21908a, e.getMessage());
                }
            }
        }
        mo20294d(C5462k.pollpage_title);
        this.f21915aj = mo1307m().getString("PAGE_ID");
        m30087aL();
        this.f19171d.addJavascriptInterface(new C6179a(), "HTMLOUT");
        this.f19171d.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                C6602at.m31951a(webView, "(function() {var checkboxes = document.querySelectorAll('.cbox');for(var x=0; x<checkboxes.length; x++) {checkboxes[x].addEventListener('click', refreshSavedCheckedAnswer);}function refreshSavedCheckedAnswer() {HTMLOUT.refreshSavedCheckedAnswer()}var container = document.querySelector('#votecontainer');if (container) {var object = {answers: {},allowNextPageWithoutSubmit: container.getAttribute('allownextpagewithoutsubmit') || 'false',allowResultsPreview: container.getAttribute('allowresultspreview') || 'true'};var nextPage = container.getAttribute('data-nextpage');if (nextPage) {object.nextPage = nextPage;}var answers = container.querySelectorAll('label');if (answers) {for (var i = 0; i < answers.length; i++) {var answerLabel = answers[i];var nextAnswerPage = answerLabel.getAttribute('data-nextpage');if (nextAnswerPage) {object.answers[answerLabel.innerHTML] = {nextPage: nextAnswerPage};}}}HTMLOUT.returnPollJson(JSON.stringify(object))}else{HTMLOUT.returnPollJson('{}');}})()");
                C6175a.this.m30086aK();
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                String str2;
                StringBuilder sb;
                String str3;
                if (C6175a.this.f21911af.booleanValue()) {
                    return true;
                }
                try {
                    URI uri = new URI(str);
                    String scheme = uri.getScheme();
                    if (C6175a.this.f21916ak == null || scheme == null || !scheme.equals("vote")) {
                        return false;
                    }
                    C6175a.this.f21918am = uri.getSchemeSpecificPart();
                    JSONObject jSONObject = C6175a.this.f21916ak.getJSONObject("answers");
                    JSONObject jSONObject2 = jSONObject.has(C6175a.this.f21918am) ? jSONObject.getJSONObject(C6175a.this.f21918am) : null;
                    if (jSONObject2 != null) {
                        C6175a.this.f21919an = jSONObject2.getString("nextPage");
                    } else {
                        C6175a.this.f21919an = "";
                    }
                    C6175a.this.m30084aI();
                    return true;
                } catch (URISyntaxException e) {
                    str3 = C6175a.f21908a;
                    sb = new StringBuilder();
                    sb.append("ERROR Unable create URI: ");
                    str2 = e.getMessage();
                    r5 = e;
                    sb.append(str2);
                    Log.e(str3, sb.toString(), r5);
                    return false;
                } catch (JSONException e2) {
                    str3 = C6175a.f21908a;
                    sb = new StringBuilder();
                    sb.append("ERROR Unable read from JSON: ");
                    str2 = e2.getMessage();
                    r5 = e2;
                    sb.append(str2);
                    Log.e(str3, sb.toString(), r5);
                    return false;
                }
            }
        });
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() == C5458g.pollpage_results_button) {
            Intent intent = new Intent(mo1318s(), ResultsActivity.class);
            intent.putExtra("PAGE_ID", this.f21915aj);
            intent.putExtra("STRING_RESULTS_RESPONSE", this.f21921ap);
            mo1230a(intent);
            return true;
        } else if (menuItem.getItemId() != C5458g.pollpage_next_button) {
            return super.mo1245a(menuItem);
        } else {
            App.m25622a((this.f21919an == null || this.f21919an == "") ? this.f21917al : this.f21919an, (Fragment) this);
            return true;
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putString("STATE_CURRENT_ANSWER", this.f21918am);
        bundle.putString("POLL_NEXT_PAGE", this.f21917al);
        bundle.putString("CURRENT_ANSWER_NEXT_PAGE", this.f21919an);
        bundle.putBoolean("ALLOW_NEXT_PAGE_WITHOUT_SUBMIT", this.f21913ah);
        bundle.putBoolean("ANSWER_SUBMITTED", this.f21914ai);
        bundle.putBoolean("ALLOW_RESULTS_PREVIEW", this.f21912ag);
        if (this.f21916ak != null) {
            bundle.putString("POLL_INFO", this.f21916ak.toString());
        }
        super.mo1282e(bundle);
    }
}
