package com.seattleclouds.modules.rsspro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.p166e.C5577a;
import com.seattleclouds.util.C6620n;
import org.json.JSONObject;

public class RSSProFragment extends C5577a {
    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        this.f19866a = true;
        super.mo1242a(view, bundle);
        Bundle m = mo1307m();
        if (m != null) {
            final String string = m.getString("FEED_URL_IDENTIFIER");
            if (string != null) {
                final String string2 = m.getString("PAGE_ID");
                if (string2 == null) {
                    C6620n.m32028a((Context) mo1318s(), C5462k.rsspro_error_parsing_title, C5462k.rsspro_error_parsing_empty_url);
                    return;
                }
                C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(((C5230aa) App.f18501c.mo16902D().get(string2)).mo17145g());
                if (aaVar != null) {
                    aaVar.mo17003E(string2);
                }
                super.mo17779x_();
                new Thread(new Runnable() {
                    public void run() {
                        JSONObject a = C6251e.m30404a().mo19574a(string);
                        if (a != null) {
                            App.f18501c.mo16926a(string2, a);
                            RSSProFragment.this.mo18053a(string2, a);
                        } else if (RSSProFragment.this.mo1318s() != null) {
                            RSSProFragment.this.mo1318s().runOnUiThread(new Runnable() {
                                public void run() {
                                    C6620n.m32028a((Context) RSSProFragment.this.mo1318s(), C5462k.rsspro_error_parsing_title, C5462k.rsspro_error_parsing_reason);
                                }
                            });
                        }
                    }
                }).start();
            }
        }
    }
}
