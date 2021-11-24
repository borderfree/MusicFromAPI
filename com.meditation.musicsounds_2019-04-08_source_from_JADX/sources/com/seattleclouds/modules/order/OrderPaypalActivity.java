package com.seattleclouds.modules.order;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C6348n;

public class OrderPaypalActivity extends C6348n {

    /* renamed from: n */
    public static String f21053n = null;

    /* renamed from: o */
    private static boolean f21054o = false;

    /* renamed from: p */
    private static String f21055p = "OrderPaypalActivity";
    /* access modifiers changed from: private */

    /* renamed from: q */
    public WebView f21056q = null;

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5460i.paypal_express_checkout_activity);
        String string = getIntent().getExtras().getString(f21053n);
        if (f21054o) {
            String str = f21055p;
            StringBuilder sb = new StringBuilder();
            sb.append("PayPal url:");
            sb.append(string);
            Log.d(str, sb.toString());
        }
        this.f21056q = (WebView) findViewById(C5458g.paypal_webview);
        this.f21056q.getSettings().setJavaScriptEnabled(true);
        this.f21056q.loadUrl(string);
        this.f21056q.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                OrderPaypalActivity.this.f21056q.loadUrl(str);
                return false;
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C5461j.order_paypal_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.order_paypal_close_page_menu_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
