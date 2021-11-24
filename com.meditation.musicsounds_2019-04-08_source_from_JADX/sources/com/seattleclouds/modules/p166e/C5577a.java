package com.seattleclouds.modules.p166e;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.seattleclouds.App;
import com.seattleclouds.mbfx.C5467a;
import com.seattleclouds.mbfx.C5467a.C5468a;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.util.C6620n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.e.a */
public class C5577a extends C5346b implements C5468a {

    /* renamed from: f */
    private static final String f19865f = C5577a.class.getCanonicalName();

    /* renamed from: a */
    protected boolean f19866a = false;

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        if (!this.f19866a) {
            Bundle m = mo1307m();
            if (m != null) {
                String string = m.getString("ARG_URL");
                if (string == null) {
                    App.m25635b((Fragment) this);
                    return;
                }
                String string2 = m.getString("jsonString");
                JSONObject jSONObject = null;
                if (string2 != null) {
                    try {
                        jSONObject = new JSONObject(string2);
                    } catch (JSONException e) {
                        Log.d(f19865f, "onViewCreated: ", e);
                    }
                } else {
                    String string3 = m.getString("parentPageUrl");
                    if (string3 != null) {
                        jSONObject = App.f18501c.mo16943d(string3);
                    }
                }
                mo18053a(string, jSONObject);
            } else {
                throw new IllegalArgumentException("Arguments should not be null");
            }
        }
        super.mo1242a(view, bundle);
    }

    /* renamed from: a */
    public void mo17777a(String str) {
        if (mo1318s() != null) {
            mo18054c(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18053a(final String str, final JSONObject jSONObject) {
        new Thread(new Runnable() {
            public void run() {
                C5467a.m27256a(str, jSONObject, C5577a.this.mo1318s(), C5577a.this);
            }
        }).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public void mo17568az() {
        this.f19171d.setBackgroundColor(-1);
        super.mo17568az();
        mo17569d("");
    }

    /* renamed from: b_ */
    public void mo17778b_(int i) {
        C0367h hVar;
        Runnable runnable;
        if (mo1318s() != null) {
            switch (i) {
                case 1:
                    hVar = mo1318s();
                    runnable = new Runnable() {
                        public void run() {
                            C6620n.m32034a((Context) C5577a.this.mo1318s(), "Unable to access data.", "Please make sure you have connection to Internet.");
                        }
                    };
                    break;
                case 2:
                    break;
                case 3:
                    hVar = mo1318s();
                    runnable = new Runnable() {
                        public void run() {
                            C6620n.m32034a((Context) C5577a.this.mo1318s(), "Incorrect JSON.", "Please make sure your JSON is correct.");
                        }
                    };
                    break;
                case 4:
                    hVar = mo1318s();
                    runnable = new Runnable() {
                        public void run() {
                            C6620n.m32034a((Context) C5577a.this.mo1318s(), "Request timeout.", "Please make sure you have connection to Internet.");
                        }
                    };
                    break;
                case 5:
                    hVar = mo1318s();
                    runnable = new Runnable() {
                        public void run() {
                            C6620n.m32034a((Context) C5577a.this.mo1318s(), "Incorrect URL.", "Please make sure your URL is correct.");
                        }
                    };
                    break;
                default:
                    if (mo1318s() != null) {
                        hVar = mo1318s();
                        runnable = new Runnable() {
                            public void run() {
                                C5577a.this.f19172e.setVisibility(8);
                            }
                        };
                        break;
                    }
                    break;
            }
            hVar.runOnUiThread(runnable);
            if (mo1318s() != null) {
                mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        C5577a.this.f19172e.setVisibility(8);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18054c(final String str) {
        Bundle m = mo1307m();
        if (m != null) {
            m.putString("ARG_HTML_STRING", str);
            if (mo1318s() != null) {
                mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        C5577a.this.mo17569d(str);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Arguments should not be null");
    }

    /* renamed from: x_ */
    public void mo17779x_() {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C5577a.this.f19172e.setVisibility(0);
                }
            });
        }
    }

    /* renamed from: y_ */
    public void mo17780y_() {
        if (mo1318s() != null) {
            mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C5577a.this.f19172e.setVisibility(8);
                }
            });
        }
    }
}
