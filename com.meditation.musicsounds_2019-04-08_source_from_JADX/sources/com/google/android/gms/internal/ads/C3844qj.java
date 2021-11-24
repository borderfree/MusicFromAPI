package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.impl.C2850R;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.C3310o;
import java.util.Map;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qj */
public final class C3844qj extends FrameLayout implements C3832py {

    /* renamed from: a */
    private final C3832py f14735a;

    /* renamed from: b */
    private final C3795oo f14736b;

    public C3844qj(C3832py pyVar) {
        super(pyVar.getContext());
        this.f14735a = pyVar;
        this.f14736b = new C3795oo(pyVar.mo13514o(), this, this);
        addView(this.f14735a.getView());
    }

    /* renamed from: A */
    public final boolean mo13474A() {
        return this.f14735a.mo13474A();
    }

    /* renamed from: B */
    public final boolean mo13475B() {
        return this.f14735a.mo13475B();
    }

    /* renamed from: C */
    public final boolean mo13476C() {
        return this.f14735a.mo13476C();
    }

    /* renamed from: D */
    public final void mo13477D() {
        this.f14735a.mo13477D();
    }

    /* renamed from: E */
    public final void mo13478E() {
        this.f14735a.mo13478E();
    }

    /* renamed from: F */
    public final arz mo13479F() {
        return this.f14735a.mo13479F();
    }

    /* renamed from: G */
    public final void mo13480G() {
        setBackgroundColor(0);
        this.f14735a.setBackgroundColor(0);
    }

    /* renamed from: H */
    public final void mo13481H() {
        TextView textView = new TextView(getContext());
        Resources h = zzbv.zzeo().mo13056h();
        textView.setText(h != null ? h.getString(C2850R.string.f9930s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: a */
    public final C3795oo mo13406a() {
        return this.f14736b;
    }

    /* renamed from: a */
    public final void mo13482a(int i) {
        this.f14735a.mo13482a(i);
    }

    /* renamed from: a */
    public final void mo13483a(Context context) {
        this.f14735a.mo13483a(context);
    }

    /* renamed from: a */
    public final void mo13578a(zzc zzc) {
        this.f14735a.mo13578a(zzc);
    }

    /* renamed from: a */
    public final void mo13484a(zzd zzd) {
        this.f14735a.mo13484a(zzd);
    }

    /* renamed from: a */
    public final void mo11994a(aiw aiw) {
        this.f14735a.mo11994a(aiw);
    }

    /* renamed from: a */
    public final void mo13485a(arz arz) {
        this.f14735a.mo13485a(arz);
    }

    /* renamed from: a */
    public final void mo13407a(C3848qn qnVar) {
        this.f14735a.mo13407a(qnVar);
    }

    /* renamed from: a */
    public final void mo13486a(C3873rl rlVar) {
        this.f14735a.mo13486a(rlVar);
    }

    /* renamed from: a */
    public final void mo13487a(String str) {
        this.f14735a.mo13487a(str);
    }

    /* renamed from: a */
    public final void mo13488a(String str, zzv<? super C3832py> zzv) {
        this.f14735a.mo13488a(str, zzv);
    }

    /* renamed from: a */
    public final void mo13489a(String str, C3310o<zzv<? super C3832py>> oVar) {
        this.f14735a.mo13489a(str, oVar);
    }

    /* renamed from: a */
    public final void mo13490a(String str, String str2, String str3) {
        this.f14735a.mo13490a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo12588a(String str, Map<String, ?> map) {
        this.f14735a.mo12588a(str, map);
    }

    /* renamed from: a */
    public final void mo12589a(String str, JSONObject jSONObject) {
        this.f14735a.mo12589a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo13408a(boolean z) {
        this.f14735a.mo13408a(z);
    }

    /* renamed from: a */
    public final void mo13579a(boolean z, int i) {
        this.f14735a.mo13579a(z, i);
    }

    /* renamed from: a */
    public final void mo13580a(boolean z, int i, String str) {
        this.f14735a.mo13580a(z, i, str);
    }

    /* renamed from: a */
    public final void mo13581a(boolean z, int i, String str, String str2) {
        this.f14735a.mo13581a(z, i, str, str2);
    }

    /* renamed from: b */
    public final C3848qn mo13409b() {
        return this.f14735a.mo13409b();
    }

    /* renamed from: b */
    public final void mo13491b(zzd zzd) {
        this.f14735a.mo13491b(zzd);
    }

    /* renamed from: b */
    public final void mo12595b(String str) {
        this.f14735a.mo12595b(str);
    }

    /* renamed from: b */
    public final void mo13492b(String str, zzv<? super C3832py> zzv) {
        this.f14735a.mo13492b(str, zzv);
    }

    /* renamed from: b */
    public final void mo12596b(String str, JSONObject jSONObject) {
        this.f14735a.mo12596b(str, jSONObject);
    }

    /* renamed from: b */
    public final void mo13493b(boolean z) {
        this.f14735a.mo13493b(z);
    }

    /* renamed from: c */
    public final aqx mo13410c() {
        return this.f14735a.mo13410c();
    }

    /* renamed from: c */
    public final void mo13494c(boolean z) {
        this.f14735a.mo13494c(z);
    }

    /* renamed from: d */
    public final Activity mo13411d() {
        return this.f14735a.mo13411d();
    }

    /* renamed from: d */
    public final void mo13495d(boolean z) {
        this.f14735a.mo13495d(z);
    }

    public final void destroy() {
        this.f14735a.destroy();
    }

    /* renamed from: e */
    public final zzw mo13412e() {
        return this.f14735a.mo13412e();
    }

    /* renamed from: e */
    public final void mo13497e(boolean z) {
        this.f14735a.mo13497e(z);
    }

    /* renamed from: f */
    public final void mo13413f() {
        this.f14735a.mo13413f();
    }

    /* renamed from: g */
    public final String mo13414g() {
        return this.f14735a.mo13414g();
    }

    public final OnClickListener getOnClickListener() {
        return this.f14735a.getOnClickListener();
    }

    public final int getRequestedOrientation() {
        return this.f14735a.getRequestedOrientation();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f14735a.getWebView();
    }

    /* renamed from: h */
    public final aqy mo13416h() {
        return this.f14735a.mo13416h();
    }

    /* renamed from: i */
    public final zzang mo13417i() {
        return this.f14735a.mo13417i();
    }

    /* renamed from: j */
    public final int mo13418j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo13419k() {
        return getMeasuredWidth();
    }

    /* renamed from: l */
    public final void mo13507l() {
        this.f14735a.mo13507l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f14735a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f14735a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f14735a.loadUrl(str);
    }

    /* renamed from: m */
    public final void mo13511m() {
        this.f14735a.mo13511m();
    }

    /* renamed from: n */
    public final void mo13513n() {
        this.f14735a.mo13513n();
    }

    /* renamed from: o */
    public final Context mo13514o() {
        return this.f14735a.mo13514o();
    }

    public final void onPause() {
        this.f14736b.mo13386b();
        this.f14735a.onPause();
    }

    public final void onResume() {
        this.f14735a.onResume();
    }

    /* renamed from: p */
    public final zzd mo13517p() {
        return this.f14735a.mo13517p();
    }

    /* renamed from: q */
    public final zzd mo13518q() {
        return this.f14735a.mo13518q();
    }

    /* renamed from: r */
    public final C3873rl mo13519r() {
        return this.f14735a.mo13519r();
    }

    /* renamed from: s */
    public final String mo13520s() {
        return this.f14735a.mo13520s();
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f14735a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f14735a.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f14735a.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f14735a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f14735a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f14735a.stopLoading();
    }

    /* renamed from: t */
    public final C3867rf mo13527t() {
        return this.f14735a.mo13527t();
    }

    /* renamed from: u */
    public final WebViewClient mo13528u() {
        return this.f14735a.mo13528u();
    }

    /* renamed from: v */
    public final boolean mo13529v() {
        return this.f14735a.mo13529v();
    }

    /* renamed from: w */
    public final afm mo13530w() {
        return this.f14735a.mo13530w();
    }

    /* renamed from: x */
    public final boolean mo13531x() {
        return this.f14735a.mo13531x();
    }

    /* renamed from: y */
    public final boolean mo13532y() {
        return this.f14735a.mo13532y();
    }

    /* renamed from: z */
    public final void mo13533z() {
        this.f14736b.mo13387c();
        this.f14735a.mo13533z();
    }

    public final void zzcl() {
        this.f14735a.zzcl();
    }

    public final void zzcm() {
        this.f14735a.zzcm();
    }
}
