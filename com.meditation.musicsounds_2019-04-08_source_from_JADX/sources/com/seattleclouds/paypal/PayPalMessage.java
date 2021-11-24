package com.seattleclouds.paypal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n;
import java.util.Hashtable;

public class PayPalMessage extends C6348n {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo19777b(true);
        super.onCreate(bundle);
        setContentView(C5460i.paypal_message_activity);
        Uri data = getIntent().getData();
        Hashtable hashtable = new Hashtable();
        int indexOf = data.toString().indexOf("?");
        if (indexOf != -1) {
            for (String split : data.toString().substring(indexOf + 1).split("&")) {
                String[] split2 = split.split("=");
                hashtable.put(split2[0], split2[1]);
            }
        }
        App.f18488U = new C6354a(false, this);
        String a = App.f18488U.mo19796a(hashtable);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("message");
            if (string != null) {
                a = string;
            }
        }
        ((TextView) findViewById(C5458g.message_text)).setText(a);
        ((Button) findViewById(C5458g.close_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(PayPalMessage.this, AppStarterActivity.class);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.setAction("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                PayPalMessage.this.startActivity(intent);
                PayPalMessage.this.finish();
            }
        });
    }
}
