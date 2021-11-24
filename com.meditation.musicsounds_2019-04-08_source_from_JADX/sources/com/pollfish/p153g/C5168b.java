package com.pollfish.p153g;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pollfish.p150f.C5162b;
import java.lang.reflect.Method;

/* renamed from: com.pollfish.g.b */
public class C5168b extends WebViewClient {

    /* renamed from: a */
    private Object f18448a;

    /* renamed from: b */
    private String f18449b;

    /* renamed from: c */
    private String f18450c;

    /* renamed from: d */
    private boolean f18451d = false;

    public C5168b(Object obj, String str, String str2, boolean z) {
        C5162b.m25518a("GingerbreadWebViewClient", "new GingerbreadWebViewClient");
        this.f18448a = obj;
        this.f18449b = str;
        this.f18450c = str2;
        this.f18451d = z;
    }

    /* renamed from: a */
    public String mo16805a() {
        Method[] methods;
        StringBuilder sb = new StringBuilder();
        if (this.f18451d) {
            sb.append("var ");
            sb.append(this.f18449b);
            sb.append(" = {  _gbFix: function(fxname, xargs) { var args = new Array(); for (var i = 0; i < xargs.length; i++) { args.push(xargs[i].toString()); }; var data = { name: fxname, len: args.length, args: args }; var json = JSON.stringify(data); var res = prompt('");
            sb.append(this.f18450c);
            sb.append("' + json); return JSON.parse(res)['result']; }};");
            for (Method method : this.f18448a.getClass().getMethods()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f18449b);
                sb2.append(".");
                sb2.append(method.getName());
                sb2.append(" = function() { return this._gbFix('");
                sb2.append(method.getName());
                sb2.append("', arguments); };");
                sb.append(sb2);
            }
        }
        return sb.toString();
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        StringBuilder sb = new StringBuilder();
        sb.append("onPageFinished - javascriptInterfaceBroken: ");
        sb.append(this.f18451d);
        sb.append(" url: ");
        sb.append(str);
        C5162b.m25518a("GingerbreadWebViewClient", sb.toString());
        if (this.f18451d) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("javascript: ");
            sb2.append(mo16805a());
            webView.loadUrl(sb2.toString());
            webView.loadUrl("javascript: Pollfish.helper.document.init(); Pollfish.helper.window.init();");
        }
    }
}
