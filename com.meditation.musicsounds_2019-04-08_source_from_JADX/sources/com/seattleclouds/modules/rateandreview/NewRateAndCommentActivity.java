package com.seattleclouds.modules.rateandreview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.slf4j.Marker;

public class NewRateAndCommentActivity extends C6348n {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f22078n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f22079o = "";
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f22080p = "";

    /* renamed from: q */
    private Bundle f22081q;

    /* renamed from: com.seattleclouds.modules.rateandreview.NewRateAndCommentActivity$a */
    private class C6233a extends AsyncTask<Void, Void, String> {
        private C6233a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            String str = "";
            try {
                str = URLEncoder.encode(NewRateAndCommentActivity.this.f22080p, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.e("NewRateAndCommentActivity", e.getMessage());
            }
            String replace = str.replace(Marker.ANY_NON_NULL_MARKER, "%20");
            int rating = (int) ((RatingBar) NewRateAndCommentActivity.this.findViewById(C5458g.new_rate_comment_ratingbar)).getRating();
            StringBuilder sb = new StringBuilder();
            sb.append("http://");
            sb.append(App.f18516r);
            sb.append("/rateit.ashx?username=");
            sb.append(App.f18523y);
            sb.append("&appid=");
            sb.append(App.f18524z);
            sb.append("&pageid=");
            sb.append(NewRateAndCommentActivity.this.f22078n);
            sb.append("&fbid=");
            sb.append(NewRateAndCommentActivity.this.f22079o);
            sb.append("&fbname=");
            sb.append(replace);
            sb.append("&rate=");
            sb.append(rating);
            sb.append("&publisherid=");
            sb.append(App.f18522x);
            String sb2 = sb.toString();
            String str2 = "null";
            try {
                return HTTPUtil.m31761a(sb2, ((EditText) NewRateAndCommentActivity.this.findViewById(C5458g.new_rate_comment_editview)).getText().toString());
            } catch (IOException e2) {
                Log.e("NewRateAndCommentActivity", e2.getMessage());
                return str2;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (str.equalsIgnoreCase("OK")) {
                NewRateAndCommentActivity.this.m30327n();
            } else {
                C6620n.m32034a((Context) NewRateAndCommentActivity.this, NewRateAndCommentActivity.this.getResources().getString(C5462k.error), str);
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            ((RatingBar) NewRateAndCommentActivity.this.findViewById(C5458g.new_rate_comment_ratingbar)).setEnabled(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m30326m() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
            C6620n.m32034a((Context) this, getResources().getString(C5462k.error), getResources().getString(C5462k.rateandreview_nointernetconnect));
        } else {
            new C6233a().execute(new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m30327n() {
        Intent intent = new Intent();
        intent.putExtra("result", "OK");
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.new_rate_comment_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f22078n = extras.getString("pageid");
            this.f22079o = extras.getString("fbid");
            this.f22080p = extras.getString("fbname");
            this.f22081q = extras.getBundle("PAGE_STYLE");
        }
        C6593am.m31914a((View) (LinearLayout) findViewById(C5458g.new_rate_comment_activity_view), this.f22081q);
        final Button button = (Button) findViewById(C5458g.new_rate_comment_btn_submit);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                button.setEnabled(false);
                NewRateAndCommentActivity.this.m30326m();
            }
        });
        RatingBar ratingBar = (RatingBar) findViewById(C5458g.new_rate_comment_ratingbar);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                Resources resources;
                int i;
                TextView textView = (TextView) NewRateAndCommentActivity.this.findViewById(C5458g.new_rate_comment_name_of_rate);
                int i2 = (int) f;
                if (i2 == 0) {
                    ((RatingBar) NewRateAndCommentActivity.this.findViewById(C5458g.new_rate_comment_ratingbar)).setRating(1.0f);
                    return;
                }
                if (i2 == 1) {
                    resources = NewRateAndCommentActivity.this.getResources();
                    i = C5462k.newrateandcomment_hateit_lb;
                } else if (i2 == 2) {
                    resources = NewRateAndCommentActivity.this.getResources();
                    i = C5462k.newrateandcomment_dontlikeit_lb;
                } else if (i2 == 3) {
                    resources = NewRateAndCommentActivity.this.getResources();
                    i = C5462k.newrateandcomment_ok_lb;
                } else if (i2 == 4) {
                    resources = NewRateAndCommentActivity.this.getResources();
                    i = C5462k.newrateandcomment_good_lb;
                } else if (i2 == 5) {
                    resources = NewRateAndCommentActivity.this.getResources();
                    i = C5462k.newrateandcomment_great_lb;
                } else {
                    return;
                }
                textView.setText(resources.getString(i));
            }
        });
        ratingBar.setRating(1.0f);
        C6593am.m31915a((TextView) findViewById(C5458g.textView1), this.f22081q);
        C6593am.m31915a((TextView) findViewById(C5458g.new_rate_comment_name_of_rate), this.f22081q);
        C6593am.m31915a((TextView) findViewById(C5458g.textView3), this.f22081q);
        EditText editText = (EditText) findViewById(C5458g.new_rate_comment_editview);
        editText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                button.setEnabled(editable.length() > 0);
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        button.setEnabled(editText.length() > 0);
    }
}
