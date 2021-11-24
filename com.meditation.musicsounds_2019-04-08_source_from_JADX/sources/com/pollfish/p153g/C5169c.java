package com.pollfish.p153g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputMethodManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import com.pollfish.interfaces.C5181b;
import com.pollfish.p147c.C5118g;
import com.pollfish.p150f.C5162b;
import java.util.HashMap;

@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: com.pollfish.g.c */
public class C5169c extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5181b f18452a;

    /* renamed from: b */
    private String f18453b;

    /* renamed from: c */
    private boolean f18454c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f18455d;

    /* renamed from: e */
    private String f18456e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18457f = false;

    /* renamed from: g */
    private boolean f18458g = false;

    /* renamed from: com.pollfish.g.c$a */
    public class C5172a {
        public C5172a() {
        }

        @JavascriptInterface
        public void clearCacheQueue() {
            C5169c.this.f18452a.mo16758d();
        }

        @JavascriptInterface
        public void close() {
            C5169c.this.f18452a.mo16756b();
        }

        @JavascriptInterface
        public void closeAndNoShow() {
            C5169c.this.f18452a.mo16762h();
        }

        @JavascriptInterface
        public String getDeviceInfo() {
            return C5169c.this.f18452a.mo16761g();
        }

        @JavascriptInterface
        public String getFromServer() {
            C5162b.m25518a("PollfishWebView", "JsObject getFromServer");
            return C5169c.this.f18452a.mo16759e();
        }

        @JavascriptInterface
        public void openWebsite(String str) {
            C5169c.this.f18452a.mo16753a(str);
        }

        @JavascriptInterface
        public void sendToServer(String str, String str2, String str3) {
            C5169c.this.f18452a.mo16755a(str, str2, str3);
        }

        @JavascriptInterface
        public void sentDataOfUserConsentToServer(String str, String str2) {
            C5169c.this.f18452a.mo16754a(str, str2);
        }

        @JavascriptInterface
        public void setSurveyCompleted() {
            C5169c.this.f18452a.mo16757c();
        }

        @JavascriptInterface
        public void showToastMsg(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(" showToastMsg : ");
            sb.append(str);
            C5162b.m25518a("PollfishWebView", sb.toString());
            Toast.makeText(C5169c.this.f18455d, str, 1).show();
        }

        @JavascriptInterface
        public void textFieldFocus() {
            C5169c.this.f18457f = true;
        }

        @JavascriptInterface
        public void textFieldUnFocus() {
            C5169c.this.f18457f = false;
            ((InputMethodManager) C5169c.this.f18455d.getSystemService("input_method")).hideSoftInputFromWindow(C5169c.this.getWindowToken(), 0);
        }

        @JavascriptInterface
        public void userNotEligible() {
            C5162b.m25518a("PollfishWebView", "userNotEligible()");
            C5169c.this.f18452a.mo16760f();
        }

        @JavascriptInterface
        public void webViewLoaded() {
            C5169c.this.f18452a.mo16752a();
        }
    }

    /* renamed from: com.pollfish.g.c$b */
    private class C5173b extends InputConnectionWrapper {
        public C5173b(InputConnection inputConnection) {
            super(inputConnection, false);
            StringBuilder sb = new StringBuilder();
            sb.append("MyConnection wrapped: ");
            sb.append(inputConnection);
            C5162b.m25518a("PollfishWebView", sb.toString());
        }

        public boolean commitCompletion(CompletionInfo completionInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("commitCompletion: ");
            sb.append(completionInfo);
            C5162b.m25518a("PollfishWebView", sb.toString());
            C5169c.this.loadUrl("javascript:Pollfish.mobile.interface.loseFocus(true);");
            return true;
        }

        public boolean performEditorAction(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("performEditorAction: ");
            sb.append(i);
            C5162b.m25518a("PollfishWebView", sb.toString());
            C5169c.this.loadUrl("javascript:Pollfish.mobile.interface.loseFocus(true);");
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5169c(android.content.Context r6, com.pollfish.interfaces.C5181b r7) {
        /*
            r5 = this;
            r5.<init>(r6)
            r0 = 0
            r5.f18454c = r0
            r5.f18457f = r0
            r5.f18458g = r0
            java.lang.String r1 = "PollfishWebView"
            java.lang.String r2 = "New PollfishWebView "
            com.pollfish.p150f.C5162b.m25518a(r1, r2)
            r5.f18455d = r6
            r5.setBackgroundColor(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.Context r1 = r5.f18455d
            android.content.Context r1 = r1.getApplicationContext()
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r1 = r1.getAbsolutePath()
            r6.append(r1)
            java.lang.String r1 = "/"
            r6.append(r1)
            java.lang.String r1 = "pollfish_cache"
            r6.append(r1)
            java.lang.String r1 = "/webviewcontent_temp.html"
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.f18456e = r6
            java.lang.String r6 = "PollfishWebView"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PollfishWebView cachePathHtml: "
            r1.append(r2)
            java.lang.String r2 = r5.f18456e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.pollfish.p150f.C5162b.m25518a(r6, r1)
            r6 = 0
            r1 = 1
            r5.setLayerType(r1, r6)     // Catch:{ NoSuchMethodError -> 0x0068, Exception -> 0x005f }
            goto L_0x007f
        L_0x005f:
            r6 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0070
        L_0x0068:
            r6 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0070:
            java.lang.String r4 = "setLayerType(View.LAYER_TYPE_SOFTWARE, null) e: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r6)
        L_0x007f:
            java.lang.String r6 = ""
            r5.f18453b = r6
            r5.f18452a = r7
            r5.setHorizontalScrollBarEnabled(r0)
            r5.setVerticalScrollBarEnabled(r0)
            java.lang.String r6 = "PollfishWebView"
            java.lang.String r7 = "PollfishWebView - will create webview settings"
            com.pollfish.p150f.C5162b.m25518a(r6, r7)
            android.webkit.WebSettings r6 = r5.getSettings()
            r6.setSupportZoom(r0)
            r6.setBuiltInZoomControls(r0)
            android.webkit.WebSettings$RenderPriority r7 = android.webkit.WebSettings.RenderPriority.HIGH
            r6.setRenderPriority(r7)
            r6.setJavaScriptEnabled(r1)
            r6.setAppCacheEnabled(r1)
            r6.setDomStorageEnabled(r1)
            java.lang.String r7 = "utf-8"
            r6.setDefaultTextEncodingName(r7)
            r6.setAllowUniversalAccessFromFileURLs(r1)     // Catch:{ NoSuchMethodError -> 0x00d6, Exception -> 0x00be, NoClassDefFoundError -> 0x00b3 }
            goto L_0x00ed
        L_0x00b3:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs NoClassDefFoundError:"
            goto L_0x00e0
        L_0x00be:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs exception:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.pollfish.p150f.C5162b.m25519b(r2, r7)
            goto L_0x00ed
        L_0x00d6:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowUniversalAccessFromFileURLs NoSuchMethodError:"
        L_0x00e0:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r7)
        L_0x00ed:
            r6.setAllowFileAccessFromFileURLs(r1)     // Catch:{ NoSuchMethodError -> 0x0114, Exception -> 0x00fc, NoClassDefFoundError -> 0x00f1 }
            goto L_0x012b
        L_0x00f1:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowFileAccessFromFileURLs NoClassDefFoundError:"
            goto L_0x011e
        L_0x00fc:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowFileAccessFromFileURLs exception:"
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.pollfish.p150f.C5162b.m25519b(r2, r7)
            goto L_0x012b
        L_0x0114:
            r7 = move-exception
            java.lang.String r2 = "PollfishWebView"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "setAllowFileAccessFromFileURLs NoSuchMethodError:"
        L_0x011e:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r7)
        L_0x012b:
            android.content.Context r7 = r5.f18455d
            android.content.Context r7 = r7.getApplicationContext()
            java.io.File r7 = r7.getCacheDir()
            java.lang.String r7 = r7.getAbsolutePath()
            r6.setAppCachePath(r7)
            r6.setAllowFileAccess(r1)
            java.lang.String r7 = "User-Agent"
            r6.setUserAgentString(r7)
            r6.setUseWideViewPort(r1)
            r6.setLoadWithOverviewMode(r1)
            java.lang.String r6 = "PollfishWebView"
            java.lang.String r7 = "PollfishWebView - created webview settings"
            com.pollfish.p150f.C5162b.m25518a(r6, r7)
            com.pollfish.g.c$a r6 = new com.pollfish.g.c$a
            r6.<init>()
            java.lang.String r7 = "Native"
            java.lang.String r2 = "_gbjsfix:"
            r5.mo16807a(r5, r6, r7, r2)
            r6 = 2
            r5.setOverScrollMode(r6)     // Catch:{ NoSuchMethodError -> 0x016b, Exception -> 0x0162 }
            goto L_0x0182
        L_0x0162:
            r6 = move-exception
            java.lang.String r7 = "PollfishWebView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x0173
        L_0x016b:
            r6 = move-exception
            java.lang.String r7 = "PollfishWebView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0173:
            java.lang.String r3 = "setOverScrollMode e: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.pollfish.p150f.C5162b.m25520c(r7, r6)
        L_0x0182:
            com.pollfish.g.c$1 r6 = new com.pollfish.g.c$1
            r6.<init>()
            r5.setOnLongClickListener(r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 8
            if (r6 == r7) goto L_0x0193
            r5.setLongClickable(r0)
        L_0x0193:
            r5.setHapticFeedbackEnabled(r0)
            r5.setFocusable(r1)
            r5.setFocusableInTouchMode(r1)
            com.pollfish.g.c$2 r6 = new com.pollfish.g.c$2
            r6.<init>()
            r5.setOnKeyListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p153g.C5169c.<init>(android.content.Context, com.pollfish.interfaces.b):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16807a(WebView webView, Object obj, String str, String str2) {
        boolean z = false;
        try {
            if (VERSION.RELEASE.startsWith("2.3")) {
                C5162b.m25518a("PollfishWebView", "We are on Gingerbread");
                z = true;
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exception when testing android version: ");
            sb.append(e);
            C5162b.m25519b("PollfishWebView", sb.toString());
        }
        if (!z) {
            C5162b.m25518a("PollfishWebView", "Adding JavascriptInterface");
            webView.addJavascriptInterface(obj, str);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("javascriptInterfaceBroken: ");
        sb2.append(z);
        C5162b.m25518a("PollfishWebView", sb2.toString());
        webView.setWebViewClient(new C5168b(obj, str, str2, z));
        webView.setWebChromeClient(new C5167a(obj, str2, z));
    }

    /* renamed from: a */
    public void mo16808a(String str) {
        C5162b.m25518a("PollfishWebView", "loadContent() - all assets in place");
        this.f18453b = str;
        StringBuilder sb = new StringBuilder();
        sb.append("PollfishWebView width: ");
        sb.append(getWidth());
        sb.append(" height: ");
        sb.append(getHeight());
        C5162b.m25518a("PollfishWebView", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file:///");
        sb2.append(this.f18456e);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("PollfishWebView thePathHtml: ");
        sb4.append(sb3);
        C5162b.m25518a("PollfishWebView", sb4.toString());
        loadDataWithBaseURL(sb3, this.f18453b, "text/html", "utf-8", null);
        setBackgroundColor(0);
    }

    /* renamed from: a */
    public void mo16809a(HashMap hashMap, String str) {
        C5162b.m25518a("PollfishWebView", "loadContent with urls to replace");
        this.f18453b = str;
        StringBuilder sb = new StringBuilder();
        sb.append("PollfishWebView width: ");
        sb.append(getWidth());
        sb.append(" height: ");
        sb.append(getHeight());
        C5162b.m25518a("PollfishWebView", sb.toString());
        new C5118g(this.f18453b, hashMap, this, this.f18456e).execute(new String[0]);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("dispatchKeyEvent: ");
        sb.append(String.valueOf(keyEvent.getKeyCode()));
        C5162b.m25518a("PollfishWebView", sb.toString());
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        StringBuilder sb = new StringBuilder();
        sb.append("dispatchKeyEventPreIme: ");
        sb.append(keyEvent.getAction());
        C5162b.m25518a("PollfishWebView", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("dispatchKeyEventPreIme: event.getKeyCode(): ");
        sb2.append(keyEvent.getKeyCode());
        C5162b.m25518a("PollfishWebView", sb2.toString());
        if (keyEvent.getAction() == 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("dispatchKeyEventPreIme: textBoxFocus: ");
            sb3.append(this.f18457f);
            C5162b.m25518a("PollfishWebView", sb3.toString());
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                C5162b.m25518a("PollfishWebView", "dispatchKeyEventPreIme: KeyEvent.KEYCODE_BACK");
                if (!this.f18457f) {
                    return super.dispatchKeyEventPreIme(keyEvent);
                }
                loadUrl("javascript:Pollfish.mobile.interface.loseFocus(true);");
                this.f18457f = false;
                return true;
            } else if (keyCode == 67) {
                C5162b.m25518a("PollfishWebView", "dispatchKeyEventPreIme: KeyEvent.KEYCODE_DEL");
                return super.dispatchKeyEventPreIme(keyEvent);
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    public boolean onCheckIsTextEditor() {
        C5162b.m25518a("PollfishWebView", "onCheckIsTextEditor");
        return false;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateInputConnection ei: ");
        sb.append(editorInfo);
        C5162b.m25518a("PollfishWebView", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreateInputConnection actionId: ");
        sb2.append(editorInfo.actionId);
        sb2.append(" fieldId: ");
        sb2.append(editorInfo.fieldId);
        sb2.append(" fieldName: ");
        sb2.append(editorInfo.fieldName);
        sb2.append(" imeOptions: ");
        sb2.append(editorInfo.imeOptions);
        sb2.append(editorInfo.fieldName);
        sb2.append(" inputType: ");
        sb2.append(editorInfo.inputType);
        sb2.append(" describeContents: ");
        sb2.append(editorInfo.describeContents());
        C5162b.m25518a("PollfishWebView", sb2.toString());
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onCreateInputConnection wrapped: ");
        sb3.append(onCreateInputConnection);
        C5162b.m25518a("PollfishWebView", sb3.toString());
        if (onCreateInputConnection != null) {
            return new C5173b(onCreateInputConnection);
        }
        return null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        StringBuilder sb = new StringBuilder();
        sb.append("onTouchEvent: consumed: ");
        sb.append(onTouchEvent);
        C5162b.m25518a("PollfishWebView", sb.toString());
        switch (motionEvent.getAction()) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onTouchEvent: MotionEvent.ACTION_DOWN");
                sb2.append(motionEvent.getAction());
                C5162b.m25518a("PollfishWebView", sb2.toString());
                break;
            case 1:
                break;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("onTouchEvent: MotionEvent.ACTION_UP ");
        sb3.append(motionEvent.getAction());
        C5162b.m25518a("PollfishWebView", sb3.toString());
        if (!hasFocus()) {
            C5162b.m25518a("PollfishWebView", "onTouchEvent: !hasFocus() - \trequestFocus();");
            requestFocus();
        } else {
            C5162b.m25518a("PollfishWebView", "onTouchEvent: hasFocus()");
        }
        return onTouchEvent;
    }
}
