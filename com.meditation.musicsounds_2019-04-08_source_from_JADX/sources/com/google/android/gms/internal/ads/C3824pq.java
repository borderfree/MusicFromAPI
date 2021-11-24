package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzx;
import com.google.android.gms.common.util.C3309n;

@TargetApi(11)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pq */
public final class C3824pq extends WebChromeClient {

    /* renamed from: a */
    private final C3832py f14670a;

    public C3824pq(C3832py pyVar) {
        this.f14670a = pyVar;
    }

    /* renamed from: a */
    private static Context m19402a(WebView webView) {
        if (!(webView instanceof C3832py)) {
            return webView.getContext();
        }
        C3832py pyVar = (C3832py) webView;
        Activity d = pyVar.mo13411d();
        return d != null ? d : pyVar.getContext();
    }

    /* renamed from: a */
    private final boolean m19403a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        try {
            if (!(this.f14670a == null || this.f14670a.mo13527t() == null || this.f14670a.mo13527t().mo13535a() == null)) {
                zzx a = this.f14670a.mo13527t().mo13535a();
                if (a != null && !a.zzcy()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
                    sb.append("window.");
                    sb.append(str);
                    sb.append("('");
                    sb.append(str3);
                    sb.append("')");
                    a.zzs(sb.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                create = builder.setView(linearLayout).setPositiveButton(17039370, new C3830pw(jsPromptResult, editText)).setNegativeButton(17039360, new C3829pv(jsPromptResult)).setOnCancelListener(new C3828pu(jsPromptResult)).create();
            } else {
                create = builder.setMessage(str3).setPositiveButton(17039370, new C3827pt(jsResult)).setNegativeButton(17039360, new C3826ps(jsResult)).setOnCancelListener(new C3825pr(jsResult)).create();
            }
            create.show();
        } catch (BadTokenException e) {
            C3643iy.m19175c("Fail to display Dialog.", e);
        }
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof C3832py)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            zzd p = ((C3832py) webView).mo13517p();
            if (p == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                p.close();
                return;
            }
        }
        C3643iy.m19178e(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C3831px.f14678a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C3643iy.m19174c(sb2);
                break;
            case 2:
                C3643iy.m19178e(sb2);
                break;
            case 5:
                C3643iy.m19172b(sb2);
                break;
            default:
                C3643iy.m19176d(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f14670a.mo13528u() != null) {
            webView2.setWebViewClient(this.f14670a.mo13528u());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        boolean z;
        if (callback != null) {
            zzbv.zzek();
            if (!C3653jh.m18884a(this.f14670a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbv.zzek();
                if (!C3653jh.m18884a(this.f14670a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzd p = this.f14670a.mo13517p();
        if (p == null) {
            C3643iy.m19178e("Could not get ad overlay when hiding custom view.");
        } else {
            p.zznh();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m19403a(m19402a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m19403a(m19402a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m19403a(m19402a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m19403a(m19402a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C3309n.m15077i()) {
            if (!((Boolean) ane.m16650f().mo12297a(aqm.f12637aC)).booleanValue()) {
                if (this.f14670a == null || this.f14670a.mo13527t() == null || this.f14670a.mo13527t().mo13563m() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f14670a.mo13527t().mo13563m().mo12981a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        zzd p = this.f14670a.mo13517p();
        if (p == null) {
            C3643iy.m19178e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        p.zza(view, customViewCallback);
        p.setRequestedOrientation(i);
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
