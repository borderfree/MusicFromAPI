package com.seattleclouds.p161f;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.p158c.C5324a;
import com.seattleclouds.p158c.C5325b;

/* renamed from: com.seattleclouds.f.a */
public class C5343a extends WebViewClient {

    /* renamed from: a */
    private static String f19137a = "SCAuthWebViewClient";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f19138b = false;

    /* renamed from: c */
    private static boolean f19139c = false;

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        String str3 = str;
        if (f19139c) {
            String str4 = f19137a;
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedHttpAuthRequest for host ");
            sb.append(str3);
            sb.append(" with realm ");
            sb.append(str2);
            Log.d(str4, sb.toString());
        } else {
            String str5 = str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(str3);
        String sb3 = sb2.toString();
        Uri parse = Uri.parse(sb3);
        if (!App.f18501c.mo16921W() || !App.f18501c.mo16922X().contains(str3)) {
            WebView webView2 = webView;
            HttpAuthHandler httpAuthHandler2 = httpAuthHandler;
            if (f19139c) {
                Log.d(f19137a, "Skip auth...");
                String str6 = f19137a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("AuthAllowed: ");
                sb4.append(App.f18501c.mo16921W());
                Log.d(str6, sb4.toString());
                String str7 = f19137a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Allowed hosts: ");
                sb5.append(App.f18501c.mo16922X());
                Log.d(str7, sb5.toString());
            }
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        Context context = webView.getContext();
        final String host = parse.getHost();
        final C5325b bVar = new C5325b();
        C5324a a = bVar.mo17473a(sb3);
        C5324a b = bVar.mo17479b();
        if (a == null && b.mo17470d()) {
            a = b;
        }
        if (a == null) {
            if (!f19138b) {
                C0766a aVar = new C0766a(context);
                View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C5460i.dialog_webview_auth, webView, false);
                ((TextView) inflate.findViewById(C5458g.web_login_dialog_hostname)).setText(String.format(context.getResources().getString(C5462k.web_view_auth_dialog_host), new Object[]{host}));
                final EditText editText = (EditText) inflate.findViewById(C5458g.username);
                final EditText editText2 = (EditText) inflate.findViewById(C5458g.password);
                editText.setText(b.mo17465b());
                C0766a b2 = aVar.mo3062b(inflate);
                int i = C5462k.web_view_auth_dialog_login;
                final View view = inflate;
                C53452 r2 = r5;
                final WebView webView3 = webView;
                C53452 r5 = new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C5343a.f19138b = false;
                        bVar.mo17478a(((CheckBox) view.findViewById(C5458g.web_auth_dialog_save_credentials)).isChecked());
                        bVar.mo17475a(host, editText.getText().toString(), editText2.getText().toString());
                        webView3.reload();
                    }
                };
                b2.mo3048a(i, (OnClickListener) r2).mo3061b(C5462k.cancel, (OnClickListener) new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C5343a.f19138b = false;
                        dialogInterface.cancel();
                    }
                });
                aVar.mo3065b().show();
                f19138b = true;
            } else {
                WebView webView4 = webView;
            }
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            return;
        }
        httpAuthHandler.proceed(a.mo17465b(), a.mo17463a());
        if (!httpAuthHandler.useHttpAuthUsernamePassword()) {
            if (f19139c) {
                String str8 = f19137a;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("removeBasicAuthCredentialsForUrl username ");
                sb6.append(a.mo17465b());
                sb6.append(", password ");
                sb6.append(a.mo17463a());
                Log.d(str8, sb6.toString());
            }
            bVar.mo17480b(sb3);
        }
    }
}
