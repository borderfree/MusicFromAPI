package com.seattleclouds.modules.rateandreview;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import com.facebook.Profile;
import com.seattleclouds.App;
import com.seattleclouds.C5323c;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6555r;
import com.seattleclouds.util.C6578ag;
import com.seattleclouds.util.C6578ag.C6582a;
import com.seattleclouds.util.C6578ag.C6584c;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.rateandreview.a */
public class C6234a extends C6555r {

    /* renamed from: a */
    public String f22088a = "";
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public Bundle f22089ae;

    /* renamed from: af */
    private Menu f22090af;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f22091b = "";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f22092c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f22093d = null;

    /* renamed from: e */
    private C6242a f22094e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f22095f = "0";

    /* renamed from: g */
    private String f22096g = "0";

    /* renamed from: h */
    private String f22097h = "0";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public View f22098i = null;

    /* renamed from: com.seattleclouds.modules.rateandreview.a$a */
    private class C6242a extends AsyncTask<String, String, String> {
        private C6242a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                return HTTPUtil.m31767b(strArr[0]);
            } catch (IOException e) {
                Log.e("RateAndReviewActivity", e.getMessage());
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (!(C6234a.this.mo1318s() == null || str == null || !str.startsWith("OK"))) {
                C6234a.this.m30338c(str.substring(2));
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.rateandreview.a$b */
    private class C6243b extends AsyncTask<Void, Void, Bundle> {
        private C6243b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bundle doInBackground(Void... voidArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(App.f18516r);
            sb.append("/getfacebookjson.ashx?username=");
            sb.append(App.f18523y);
            sb.append("&appid=");
            sb.append(App.f18524z);
            sb.append("&pageid=");
            sb.append(C6234a.this.f22091b);
            sb.append("&fbid=");
            sb.append(C6234a.this.mo1219a(C5462k.facebook_app_id));
            sb.append("&publisherid=");
            sb.append(App.f18522x);
            try {
                String b = HTTPUtil.m31767b(sb.toString());
                try {
                    b = URLDecoder.decode(b, "UTF-8");
                } catch (Exception e) {
                    Log.d("RateAndReview", "Exception", e);
                    Log.d("RateAndReview", "Try to use Uri.decode");
                    try {
                        b = Uri.decode(b);
                    } catch (Exception unused) {
                        Log.d("RateAndReview", "Exception Uri", e);
                    }
                }
                Bundle bundle = new Bundle();
                String str = "";
                String str2 = "";
                String str3 = "";
                String str4 = "";
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    try {
                        str = jSONObject.getString("name");
                    } catch (Exception e2) {
                        String str5 = "RateAndReviewActivity";
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("jsonParse extract app name exception");
                        sb2.append(e2.getMessage());
                        Log.i(str5, sb2.toString());
                    }
                    try {
                        str2 = jSONObject.getString("description");
                    } catch (Exception e3) {
                        String str6 = "RateAndReviewActivity";
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("jsonParse extract description exception");
                        sb3.append(e3.getMessage());
                        Log.i(str6, sb3.toString());
                    }
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("media");
                        int i = 0;
                        while (i < jSONArray.length()) {
                            String string = jSONArray.getJSONObject(i).getString("src");
                            i++;
                            str4 = string;
                        }
                    } catch (Exception e4) {
                        String str7 = "RateAndReviewActivity";
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("jsonParse extract image url exception");
                        sb4.append(e4.getMessage());
                        Log.i(str7, sb4.toString());
                    }
                    try {
                        str3 = jSONObject.getJSONObject("properties").getJSONObject("Google Play").getString("href");
                    } catch (Exception e5) {
                        String str8 = "RateAndReviewActivity";
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("jsonParse extract App url exception");
                        sb5.append(e5.getMessage());
                        Log.i(str8, sb5.toString());
                    }
                } catch (JSONException e6) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("jsonParse throw new exception");
                    sb6.append(e6.getMessage());
                    Log.i("RateAndReviewActivity", sb6.toString());
                }
                bundle.putString("appName", str);
                bundle.putString("slink", str3);
                bundle.putString("description", str2);
                bundle.putString("iconUrlString", str4);
                return bundle;
            } catch (IOException e7) {
                Log.e("RateAndReviewActivity", e7.getMessage());
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bundle bundle) {
            super.onPostExecute(bundle);
            if (bundle != null) {
                C6578ag.m31838a((Activity) C6234a.this.mo1318s(), bundle);
            }
        }
    }

    /* renamed from: aA */
    private void m30332aA() {
        this.f22093d = (WebView) this.f22098i.findViewById(C5458g.rateandreview_web_view);
        C6602at.m31950a(this.f22093d);
    }

    /* renamed from: aB */
    private void m30333aB() {
        this.f22093d.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                C6234a.this.mo19515a(C6234a.this.f22093d, i, str);
            }

            @TargetApi(23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                if (webResourceRequest.isForMainFrame()) {
                    C6234a.this.mo19515a(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/comments.aspx?username=");
        sb.append(App.f18523y);
        sb.append("&appid=");
        sb.append(App.f18524z);
        sb.append("&pageid=");
        sb.append(this.f22091b);
        sb.append("&guid=");
        sb.append(C5323c.m26636a((Context) mo1318s()));
        this.f22093d.loadUrl(sb.toString());
    }

    /* renamed from: aC */
    private void m30334aC() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo1318s().getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            C6620n.m32034a((Context) mo1318s(), mo1320t().getString(C5462k.error), mo1320t().getString(C5462k.rateandreview_nointernetconnect));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("http://");
        sb.append(App.f18516r);
        sb.append("/getpagerate.ashx?username=");
        sb.append(App.f18523y);
        sb.append("&appid=");
        sb.append(App.f18524z);
        sb.append("&pageid=");
        sb.append(this.f22091b);
        String sb2 = sb.toString();
        this.f22094e = new C6242a();
        this.f22094e.execute(new String[]{sb2});
    }

    /* renamed from: aD */
    private void m30335aD() {
        if (mo20282e()) {
            ((LinearLayout) this.f22098i.findViewById(C5458g.rateandreview_result_layout_bottom_btn2)).setVisibility(0);
            final Profile d = mo20281d();
            if (d != null) {
                this.f22092c = d.mo6615d();
                this.f22088a = d.mo6614c();
                C0367h s = mo1318s();
                if (s != null) {
                    s.runOnUiThread(new Runnable() {
                        public void run() {
                            TextView textView = (TextView) C6234a.this.f22098i.findViewById(C5458g.rateandreview_label_statusconnect);
                            StringBuilder sb = new StringBuilder();
                            sb.append(C6234a.this.mo1320t().getString(C5462k.rateandreview_status_connas));
                            sb.append(" ");
                            sb.append(d.mo6615d());
                            textView.setText(sb.toString());
                        }
                    });
                }
            }
        } else {
            C0367h s2 = mo1318s();
            if (s2 != null) {
                s2.runOnUiThread(new Runnable() {
                    public void run() {
                        ((LinearLayout) C6234a.this.f22098i.findViewById(C5458g.rateandreview_result_layout_bottom_btn2)).setVisibility(4);
                        ((TextView) C6234a.this.f22098i.findViewById(C5458g.rateandreview_label_statusconnect)).setText(C6234a.this.mo1318s().getResources().getString(C5462k.rateandreview_status));
                    }
                });
            }
        }
        mo20292ay();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30338c(String str) {
        String[] split = str.split(":");
        if (split.length == 3) {
            this.f22095f = split[0];
            this.f22096g = split[1];
            this.f22097h = split[2];
            ((RatingBar) this.f22098i.findViewById(C5458g.rateandreview_ratingbar)).setRating(Float.parseFloat(this.f22095f));
            ((TextView) this.f22098i.findViewById(C5458g.rateandreview_label_rateinfo)).setText(String.format(mo1320t().getString(C5462k.rateandreview_inforate), new Object[]{this.f22097h, this.f22096g}));
            m30333aB();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22098i = layoutInflater.inflate(C5460i.rateandreview_activity, viewGroup, false);
        mo19516az();
        return this.f22098i;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i != 1520) {
            super.mo1222a(i, i2, intent);
        } else if (i2 != 0 && intent.getStringExtra("result").equalsIgnoreCase("OK")) {
            m30334aC();
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        MenuItem findItem = menu.findItem(C5458g.rateandreview_menu_login);
        MenuItem findItem2 = menu.findItem(C5458g.rateandreview_menu_logout);
        boolean e = mo20282e();
        findItem.setVisible(!e);
        findItem.setEnabled(!e);
        findItem2.setVisible(e);
        findItem2.setEnabled(e);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        this.f22090af = menu;
        menuInflater.inflate(C5461j.rateandreview, menu);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19515a(WebView webView, int i, String str) {
        int i2;
        if (webView != null) {
            String str2 = "";
            if (i == -14) {
                i2 = C5462k.newrateandcomment_not_found;
            } else if (i != -8) {
                if (i == -2) {
                    i2 = C5462k.newrateandcomment_unable_to_load_info;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("<html> <body style=\" text-align: center; padding:0px;margin:250px; font-size:24px \"> <h1>");
                sb.append(mo1219a(C5462k.newrateandcomment_web_page_not_available));
                sb.append("</h1> <h2> ");
                sb.append(str2);
                sb.append("</h2><div style=\"color: #696969; display: inline; font-size: .86667em; margin-top: 15px; opacity: .5 ; text-transform: uppercase\"> ");
                sb.append(str);
                sb.append("</div> </body> </html>");
                String sb2 = sb.toString();
                webView.loadUrl("about:blank");
                webView.loadDataWithBaseURL(null, sb2, "text/html", "UTF-8", null);
                webView.invalidate();
            } else {
                i2 = C5462k.newrateandcomment_timeout;
            }
            str2 = mo1219a(i2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<html> <body style=\" text-align: center; padding:0px;margin:250px; font-size:24px \"> <h1>");
            sb3.append(mo1219a(C5462k.newrateandcomment_web_page_not_available));
            sb3.append("</h1> <h2> ");
            sb3.append(str2);
            sb3.append("</h2><div style=\"color: #696969; display: inline; font-size: .86667em; margin-top: 15px; opacity: .5 ; text-transform: uppercase\"> ");
            sb3.append(str);
            sb3.append("</div> </body> </html>");
            String sb22 = sb3.toString();
            webView.loadUrl("about:blank");
            webView.loadDataWithBaseURL(null, sb22, "text/html", "UTF-8", null);
            webView.invalidate();
        }
    }

    /* renamed from: a */
    public void mo17562a(C6582a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSuccess: ");
        sb.append(aVar.toString());
        Log.d("RateAndReviewActivity", sb.toString());
        this.f22092c = aVar.mo20563f();
        this.f22088a = aVar.mo20558a();
        ((LinearLayout) this.f22098i.findViewById(C5458g.rateandreview_result_layout_bottom_btn2)).setVisibility(0);
        C0367h s = mo1318s();
        if (s != null) {
            s.runOnUiThread(new Runnable() {
                public void run() {
                    TextView textView = (TextView) C6234a.this.f22098i.findViewById(C5458g.rateandreview_label_statusconnect);
                    StringBuilder sb = new StringBuilder();
                    sb.append(C6234a.this.mo1320t().getString(C5462k.rateandreview_status_connas));
                    sb.append(" ");
                    sb.append(C6234a.this.f22092c);
                    textView.setText(sb.toString());
                }
            });
        }
        MenuItem findItem = this.f22090af.findItem(C5458g.rateandreview_menu_login);
        MenuItem findItem2 = this.f22090af.findItem(C5458g.rateandreview_menu_logout);
        findItem.setVisible(false);
        findItem.setEnabled(false);
        findItem2.setVisible(true);
        findItem2.setEnabled(true);
    }

    /* renamed from: a */
    public void mo17563a(C6584c cVar) {
        super.mo17563a(cVar);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.rateandreview_menu_login) {
            mo1450b();
            return true;
        } else if (itemId != C5458g.rateandreview_menu_logout) {
            return super.mo1245a(menuItem);
        } else {
            mo1453c();
            m30335aD();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public void mo19516az() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f22091b = m.getString("pageid");
            this.f22089ae = m.getBundle("PAGE_STYLE");
        }
        m30332aA();
        m30333aB();
        ((Button) this.f22098i.findViewById(C5458g.rateandreview_btn_ratethis)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(C6234a.this.mo1318s(), NewRateAndCommentActivity.class);
                intent.putExtra("pageid", C6234a.this.f22091b);
                intent.putExtra("fbid", C6234a.this.f22088a);
                intent.putExtra("fbname", C6234a.this.f22092c);
                intent.putExtra("PAGE_STYLE", C6234a.this.f22089ae);
                C6234a.this.startActivityForResult(intent, 1520);
            }
        });
        ((Button) this.f22098i.findViewById(C5458g.rateandreview_btn_postonfb)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                new C6243b().execute(new Void[0]);
            }
        });
        ((RatingBar) this.f22098i.findViewById(C5458g.rateandreview_ratingbar)).setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                if (z) {
                    ((RatingBar) C6234a.this.f22098i.findViewById(C5458g.rateandreview_ratingbar)).setRating(Float.parseFloat(C6234a.this.f22095f));
                }
            }
        });
        m30335aD();
        m30334aC();
        C6593am.m31914a((View) (LinearLayout) this.f22098i.findViewById(C5458g.rateandreview_result_layout_top), this.f22089ae);
        C6593am.m31914a((View) (LinearLayout) this.f22098i.findViewById(C5458g.rateandreview_result_layout_bottom), this.f22089ae);
        C6593am.m31915a((TextView) this.f22098i.findViewById(C5458g.rateandreview_label_rateinfo), this.f22089ae);
        C6593am.m31915a((TextView) this.f22098i.findViewById(C5458g.rateandreview_label_statusconnect), this.f22089ae);
    }
}
