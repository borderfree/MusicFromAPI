package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C3310o;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.py */
public interface C3832py extends zzbo, aix, axh, ayi, C3804ox, C3854qt, C3855qu, C3859qy, C3863rb, C3865rd, C3866re {
    /* renamed from: A */
    boolean mo13474A();

    /* renamed from: B */
    boolean mo13475B();

    /* renamed from: C */
    boolean mo13476C();

    /* renamed from: D */
    void mo13477D();

    /* renamed from: E */
    void mo13478E();

    /* renamed from: F */
    arz mo13479F();

    /* renamed from: G */
    void mo13480G();

    /* renamed from: H */
    void mo13481H();

    /* renamed from: a */
    void mo13482a(int i);

    /* renamed from: a */
    void mo13483a(Context context);

    /* renamed from: a */
    void mo13484a(zzd zzd);

    /* renamed from: a */
    void mo13485a(arz arz);

    /* renamed from: a */
    void mo13407a(C3848qn qnVar);

    /* renamed from: a */
    void mo13486a(C3873rl rlVar);

    /* renamed from: a */
    void mo13487a(String str);

    /* renamed from: a */
    void mo13488a(String str, zzv<? super C3832py> zzv);

    /* renamed from: a */
    void mo13489a(String str, C3310o<zzv<? super C3832py>> oVar);

    /* renamed from: a */
    void mo13490a(String str, String str2, String str3);

    /* renamed from: b */
    C3848qn mo13409b();

    /* renamed from: b */
    void mo13491b(zzd zzd);

    /* renamed from: b */
    void mo13492b(String str, zzv<? super C3832py> zzv);

    /* renamed from: b */
    void mo13493b(boolean z);

    /* renamed from: c */
    void mo13494c(boolean z);

    /* renamed from: d */
    Activity mo13411d();

    /* renamed from: d */
    void mo13495d(boolean z);

    void destroy();

    /* renamed from: e */
    zzw mo13412e();

    /* renamed from: e */
    void mo13497e(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: h */
    aqy mo13416h();

    /* renamed from: i */
    zzang mo13417i();

    /* renamed from: l */
    void mo13507l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    void mo13511m();

    void measure(int i, int i2);

    /* renamed from: n */
    void mo13513n();

    /* renamed from: o */
    Context mo13514o();

    void onPause();

    void onResume();

    /* renamed from: p */
    zzd mo13517p();

    /* renamed from: q */
    zzd mo13518q();

    /* renamed from: r */
    C3873rl mo13519r();

    /* renamed from: s */
    String mo13520s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    C3867rf mo13527t();

    /* renamed from: u */
    WebViewClient mo13528u();

    /* renamed from: v */
    boolean mo13529v();

    /* renamed from: w */
    afm mo13530w();

    /* renamed from: x */
    boolean mo13531x();

    /* renamed from: y */
    boolean mo13532y();

    /* renamed from: z */
    void mo13533z();
}
