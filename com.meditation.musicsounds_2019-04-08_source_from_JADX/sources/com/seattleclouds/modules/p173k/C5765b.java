package com.seattleclouds.modules.p173k;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.bitmapfun.C2429g;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.p161f.C5346b;
import java.util.HashMap;

/* renamed from: com.seattleclouds.modules.k.b */
public class C5765b extends C5346b {

    /* renamed from: a */
    private static final String f20433a = "b";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5769b f20434f;

    /* renamed from: com.seattleclouds.modules.k.b$a */
    protected class C5766a extends C5366b {
        protected C5766a() {
            super();
        }

        /* renamed from: a */
        public boolean mo18444a(String str) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(lastPathSegment);
            if (aaVar != null && aaVar.mo17118b().equalsIgnoreCase("login")) {
                String[] split = str.split("\\?");
                String[] strArr = new String[0];
                if (split.length == 2) {
                    String[] split2 = split[1].split("&");
                    String[] strArr2 = new String[0];
                    HashMap hashMap = new HashMap();
                    for (String split3 : split2) {
                        String[] split4 = split3.split("=");
                        if (split4.length == 2) {
                            hashMap.put(split4[0], split4[1]);
                        } else {
                            hashMap.put(split4[0], "");
                        }
                    }
                    if (hashMap.size() > 1 && hashMap.get("userAction") != null && ((String) hashMap.get("userAction")).length() > 0) {
                        final String a = C5763a.m28384a((String) hashMap.get("loginName"), (String) hashMap.get("loginPassword"), lastPathSegment, true, C5765b.this.mo1318s());
                        if (a != null) {
                            C5763a.f20423a = (String) hashMap.get("loginName");
                            C5763a.f20424b = (String) hashMap.get("loginPassword");
                            if (!a.startsWith("http")) {
                                if (App.m25667n(a)) {
                                    a = App.m25655h(a);
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("file:///");
                                    sb.append(a);
                                    a = sb.toString();
                                }
                            }
                        } else {
                            if (C5763a.f20423a == null || C5763a.f20424b == null) {
                                C5763a.f20423a = null;
                                C5763a.f20424b = null;
                            }
                            a = null;
                        }
                        if (!(a == null || C5765b.this.f20434f == null)) {
                            new Handler().postDelayed(new Runnable() {
                                public void run() {
                                    C5765b.this.f20434f.mo18442a(a);
                                }
                            }, 500);
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!C2429g.m11308b()) {
                mo18444a(str);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("lpforgotpassword://")) {
                if (C5765b.this.f20434f != null) {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            C5765b.this.f20434f.mo18441a();
                        }
                    }, 500);
                }
                return true;
            } else if (!C2429g.m11308b() || !mo18444a(str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.k.b$b */
    public interface C5769b {
        /* renamed from: a */
        void mo18441a();

        /* renamed from: a */
        void mo18442a(String str);
    }

    /* renamed from: a */
    public void mo18443a(C5769b bVar) {
        this.f20434f = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public WebViewClient mo17564aA() {
        return new C5766a();
    }
}
