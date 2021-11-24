package com.seattleclouds.gcm;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C5451m.C5463l;
import com.seattleclouds.C6348n;
import com.seattleclouds.util.C6619m;

public class AnnouncementActivity extends C6348n {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        if (!C6619m.m32025g(this)) {
            i = C5463l.DefaultAppTheme;
        } else {
            mo19777b(true);
            i = C5463l.DefaultAppTheme_Dialog;
        }
        setTheme(i);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("noTitle")) {
            requestWindowFeature(1);
        }
        setTitle(getString(C5462k.announcements_title));
        setContentView(C5460i.announcement_activity);
        if (mo19779p()) {
            View findViewById = findViewById(C5458g.announcement_fragment);
            LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
            layoutParams.topMargin = C6619m.m32014a(this, 16.0f);
            findViewById.setLayoutParams(layoutParams);
        }
        ((Button) findViewById(C5458g.close_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                AnnouncementActivity.this.finish();
            }
        });
    }
}
