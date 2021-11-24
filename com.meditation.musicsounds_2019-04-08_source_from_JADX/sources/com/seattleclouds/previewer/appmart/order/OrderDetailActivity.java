package com.seattleclouds.previewer.appmart.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.p023v7.app.C0751a;
import android.view.View;
import android.widget.TextView;
import com.seattleclouds.C5232ac;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.previewer.appmart.PreviewerAppMartActivity;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderDetailActivity extends C5232ac {

    /* renamed from: n */
    private String f22594n;

    /* renamed from: o */
    private String f22595o;

    /* renamed from: q */
    private void m30920q() {
        startActivity(new Intent(this, PreviewerAppMartActivity.class));
        finish();
    }

    public void onBackPressed() {
        m30920q();
        super.onBackPressed();
    }

    public void onClick(View view) {
        m30920q();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        String str;
        super.onCreate(bundle);
        setContentView(C5460i.activity_order_detail);
        TextView textView = (TextView) findViewById(C5458g.text_view_subscribe_new_order_info);
        TextView textView2 = (TextView) findViewById(C5458g.text_view_app_id_new_order_info);
        C0751a i = mo3083i();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ArrayList stringArrayList = extras.getStringArrayList("KEY_APP_ID");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getString(C5462k.new_order_details_app_id));
            sb2.append("\n\n");
            this.f22595o = sb2.toString();
            if (stringArrayList != null) {
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f22595o);
                    sb3.append("ID: ");
                    sb3.append(str2);
                    sb3.append("\n");
                    this.f22595o = sb3.toString();
                }
            }
            if (extras.containsKey("KEY_SUBSCRIPTION_ID")) {
                sb = new StringBuilder();
                sb.append(getResources().getString(C5462k.new_order_details_subscribe_id));
                sb.append("\n\n");
                str = "KEY_SUBSCRIPTION_ID";
            } else if (extras.containsKey("KEY_ABC_ID")) {
                sb = new StringBuilder();
                sb.append(getResources().getString(C5462k.new_order_details_abc_id));
                sb.append("\n\n");
                str = "KEY_ABC_ID";
            }
            sb.append(extras.getString(str));
            this.f22594n = sb.toString();
        }
        if (!(textView2 == null || textView == null)) {
            textView2.setText(this.f22595o);
            textView.setText(this.f22594n);
        }
        if (i != null) {
            i.mo2992a(true);
        }
    }
}
