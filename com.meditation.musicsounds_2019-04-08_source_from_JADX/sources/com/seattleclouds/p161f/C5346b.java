package com.seattleclouds.p161f;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Point;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.C0599c;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.C0651x;
import android.support.p009v4.view.C0652y;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n.C6349a;
import com.seattleclouds.C6555r;
import com.seattleclouds.C6557s;
import com.seattleclouds.C6561t;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.ads.AdNativeManager;
import com.seattleclouds.ads.AdNativeManager.NativeAdsAlignmentType;
import com.seattleclouds.ads.AdsManagerKeys;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.modules.feedback.C5633a;
import com.seattleclouds.modules.feedback.C5669b;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.modules.p162a.C5470a;
import com.seattleclouds.modules.p168f.C5614a;
import com.seattleclouds.modules.p173k.C5763a;
import com.seattleclouds.modules.rateandreview.C6244b;
import com.seattleclouds.util.ActivityWrapper;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6578ag.C6582a;
import com.seattleclouds.util.C6578ag.C6584c;
import com.seattleclouds.util.C6588ai;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6639t;
import com.seattleclouds.widget.SoftKeyboardDetectingLinearLayout;
import com.seattleclouds.widget.SoftKeyboardDetectingLinearLayout.C6667a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import org.apache.commons.p198io.C6730b;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.f.b */
public class C5346b extends C6555r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f19148a;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public static File f19149af;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C5230aa f19150ae;

    /* renamed from: ag */
    private View f19151ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public View f19152ah;

    /* renamed from: ai */
    private ViewGroup f19153ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public SwipeRefreshLayout f19154aj;

    /* renamed from: ak */
    private SoftKeyboardDetectingLinearLayout f19155ak;

    /* renamed from: al */
    private ViewGroup f19156al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public boolean f19157am = false;

    /* renamed from: an */
    private boolean f19158an = false;

    /* renamed from: ao */
    private boolean f19159ao = true;

    /* renamed from: ap */
    private Timer f19160ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public long f19161aq = 0;

    /* renamed from: ar */
    private boolean f19162ar = true;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public int f19163as = 5;

    /* renamed from: at */
    private C5369d f19164at;

    /* renamed from: au */
    private boolean f19165au;

    /* renamed from: av */
    private C5367c f19166av;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public C5370e f19167aw;

    /* renamed from: ax */
    private C6349a f19168ax;

    /* renamed from: b */
    protected ScrollView f19169b;

    /* renamed from: c */
    protected LinearLayout f19170c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public WebView f19171d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public ProgressBar f19172e;

    /* renamed from: f */
    private boolean f19173f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f19174g;

    /* renamed from: h */
    private String f19175h;

    /* renamed from: i */
    private String f19176i;

    @TargetApi(21)
    /* renamed from: com.seattleclouds.f.b$a */
    private static class C5365a extends WebChromeClient {

        /* renamed from: a */
        private static ValueCallback<Uri[]> f19195a;

        /* renamed from: b */
        private WeakReference<Fragment> f19196b;

        private C5365a() {
        }

        /* renamed from: a */
        private Fragment m26881a() {
            if (this.f19196b == null) {
                return null;
            }
            return (Fragment) this.f19196b.get();
        }

        /* renamed from: b */
        private boolean m26882b(Fragment fragment) {
            if (!C6569aa.m31796a()) {
                return false;
            }
            boolean a = C6569aa.m31797a(fragment.mo1316q(), "android.permission.CAMERA");
            if (!a) {
                C6569aa.m31791a(fragment, 1789, "android.permission.CAMERA", new int[]{C5462k.web_view_camera_rational, C5462k.web_view_permission_camera_required_toast});
            }
            return !a;
        }

        @TargetApi(21)
        /* renamed from: a */
        public void mo17587a(Context context, int i, int i2, Intent intent) {
            boolean z;
            if (i == 4821 && f19195a != null) {
                Uri[] uriArr = new Uri[0];
                if (i2 == -1) {
                    if (intent != null && (intent.getClipData() != null || intent.getDataString() != null)) {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            uriArr = new Uri[clipData.getItemCount()];
                            boolean z2 = true;
                            for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                                Uri uri = clipData.getItemAt(i3).getUri();
                                uriArr[i3] = uri;
                                z2 &= context.checkCallingOrSelfUriPermission(uri, 1) == 0;
                            }
                            z = z2;
                        } else {
                            String dataString = intent.getDataString();
                            if (dataString != null) {
                                Uri parse = Uri.parse(dataString);
                                uriArr = new Uri[]{parse};
                                if (context.checkCallingOrSelfUriPermission(parse, 1) != 0) {
                                    z = false;
                                }
                            }
                        }
                        if (!z || C6569aa.m31797a(context, "android.permission.READ_EXTERNAL_STORAGE")) {
                            f19195a.onReceiveValue(uriArr);
                        } else {
                            if (C6569aa.m31796a()) {
                                Fragment a = m26881a();
                                if (a != null) {
                                    C6569aa.m31791a(a, 5821, "android.permission.READ_EXTERNAL_STORAGE", new int[]{C5462k.web_view_read_external_storage_permission_rational, C5462k.web_view_read_external_storage_permission_toast});
                                }
                            } else {
                                Toast.makeText(context, C5462k.web_view_no_read_external_storage_permission, 1).show();
                            }
                            f19195a.onReceiveValue(new Uri[0]);
                        }
                        f19195a = null;
                    } else if (C5346b.f19149af.exists()) {
                        uriArr = new Uri[]{Uri.fromFile(C5346b.f19149af)};
                    }
                }
                z = true;
                if (!z) {
                }
                f19195a.onReceiveValue(uriArr);
                f19195a = null;
            }
        }

        /* renamed from: a */
        public void mo17588a(Fragment fragment) {
            if (fragment != null) {
                this.f19196b = new WeakReference<>(fragment);
            }
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            Fragment a = m26881a();
            if (a == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C5346b.f19148a);
            sb.append("ImageCapture");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            } else {
                try {
                    C6730b.m32468e(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IMG_");
            sb2.append(format);
            sb2.append(".jpeg");
            C5346b.f19149af = new File(file, sb2.toString());
            Uri a2 = C6598aq.m31937a(C5346b.f19149af);
            ArrayList arrayList = new ArrayList(Arrays.asList(fileChooserParams.getAcceptTypes()));
            arrayList.add("image/*");
            arrayList.add("video/*");
            arrayList.add("audio/*");
            if (m26882b(a)) {
                return false;
            }
            ArrayList arrayList2 = new ArrayList();
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", a2);
            for (ResolveInfo resolveInfo : a.mo1318s().getPackageManager().queryIntentActivities(intent, 0)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                intent2.setPackage(str);
                arrayList2.add(intent2);
            }
            Intent intent3 = new Intent("android.intent.action.GET_CONTENT");
            intent3.setType("*/*");
            intent3.addCategory("android.intent.category.OPENABLE");
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", fileChooserParams.getMode() == 1);
            intent3.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList.toArray(new String[arrayList.size()]));
            if (intent3.resolveActivity(a.mo1316q().getPackageManager()) != null) {
                f19195a = valueCallback;
                Intent createChooser = Intent.createChooser(intent3, a.mo1219a(C5462k.web_view_file_picker_title));
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Parcelable[arrayList2.size()]));
                a.startActivityForResult(createChooser, 4821);
                return true;
            }
            Toast.makeText(a.mo1316q(), C5462k.web_view_unable_to_open_file_picker, 1).show();
            return false;
        }
    }

    /* renamed from: com.seattleclouds.f.b$b */
    protected class C5366b extends C5343a {
        protected C5366b() {
        }

        /* renamed from: a */
        private boolean m26885a(int i) {
            return i == 1 || i == 6 || i == 7 || i == 8;
        }

        /* renamed from: a */
        private boolean m26886a(int i, String str) {
            boolean z = false;
            if (i != 0 && i != 5) {
                return false;
            }
            if (!str.equals(C5346b.this.f19174g) && System.currentTimeMillis() - C5346b.this.f19161aq < 1000) {
                z = true;
            }
            return z;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C5346b.this.m26836aM();
            C5614a a = C5614a.m27865a((Context) C5346b.this.mo1318s());
            if (a != null) {
                String[] c = a.mo18140c();
                for (int i = 0; i < c.length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("document.getElementById('rsstable').contentWindow.document.getElementById('");
                    sb.append(c[i]);
                    sb.append("').src = '");
                    sb.append(C5614a.m27866a());
                    sb.append("';");
                    C6602at.m31951a(C5346b.this.f19171d, sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("document.getElementById('");
                    sb2.append(c[i]);
                    sb2.append("').src = '");
                    sb2.append(C5614a.m27866a());
                    sb2.append("';");
                    C6602at.m31951a(C5346b.this.f19171d, sb2.toString());
                }
            }
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(lastPathSegment);
            if (aaVar != null && aaVar.mo17118b().equalsIgnoreCase("shoppingcart")) {
                App.f18489V.mo17515a(webView, lastPathSegment);
            }
            if (C5260d.m26241a().mo17273c() || !AdsManagerKeys.m26119b().mo17222c() || !App.f18501c.mo16930a("removeAds")) {
                C5346b.this.f19171d.loadUrl("javascript:(function() {if (document.querySelectorAll('[href*=removeads]').length > 0) { document.querySelectorAll('[href*=removeads]')[0].style.display='none';}})()");
            }
            if (C5346b.this.f19154aj != null) {
                C5346b.this.f19154aj.setRefreshing(false);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C5346b.this.f19171d.setBackgroundColor(-1);
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedError: failingUrl = ");
            sb.append(str2);
            sb.append(", error code = ");
            sb.append(i);
            sb.append(" [ ");
            sb.append(str);
            sb.append(" ]");
            Log.v("MyWebViewClient", sb.toString());
            super.onReceivedError(webView, i, str, str2);
        }

        @SuppressLint({"NewApi"})
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            sslErrorHandler.cancel();
            webView.stopLoading();
            String url = VERSION.SDK_INT >= 14 ? sslError.getUrl() : null;
            C0367h s = C5346b.this.mo1318s();
            String str2 = "SSL Error";
            StringBuilder sb = new StringBuilder();
            sb.append("Error: ");
            sb.append(sslError.getPrimaryError());
            sb.append("\n\nCertificate: ");
            sb.append(sslError.getCertificate().toString());
            sb.append("\n\nPage URL: ");
            sb.append(C5346b.this.f19174g);
            if (url != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n\nFile URL: ");
                sb2.append(url);
                str = sb2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            C6620n.m32034a((Context) s, str2, sb.toString());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            HitTestResult hitTestResult = webView.getHitTestResult();
            if (hitTestResult != null) {
                hitTestResult.getExtra();
            }
            int type = hitTestResult != null ? hitTestResult.getType() : 0;
            C5230aa r = App.m25675r(str);
            if (r != null && r.mo17118b().equalsIgnoreCase("login") && str.indexOf("?") != -1) {
                return false;
            }
            if (str.startsWith("logout://")) {
                C5763a.m28385a(C5346b.this.f19171d, (Fragment) C5346b.this);
                return true;
            } else if (str.startsWith("favorite://")) {
                C5614a.m27867a(C5346b.this.mo1318s(), C5346b.this.f19171d, str.substring(11).split("\\|", -1));
                return true;
            } else if (str.startsWith("appshare://")) {
                String lastPathSegment = Uri.parse(C5346b.this.f19174g).getLastPathSegment();
                String substring = str.substring(11);
                C5470a aVar = new C5470a();
                if (!substring.equalsIgnoreCase("facebook")) {
                    aVar.mo17782a(C5346b.this, substring, lastPathSegment);
                } else if (C5346b.this.mo20280as().mo20554b((C6555r) C5346b.this)) {
                    if (!C5346b.this.mo20282e()) {
                        C5346b.this.mo1450b();
                    } else {
                        aVar.mo17781a((C6557s) C5346b.this, lastPathSegment);
                    }
                }
                return true;
            } else if ((m26885a(type) || m26886a(type, str)) && str.contains("://www.youtube.com/watch") && C6639t.m32083a((Activity) C5346b.this.mo1318s(), new Intent("android.intent.action.VIEW", Uri.parse(str.replace("time_continue=", "t="))))) {
                return true;
            } else {
                if (type == 4 || type == 3 || type == 2 || str.startsWith("tel:") || str.startsWith("mailto:")) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    C6639t.m32083a((Activity) C5346b.this.mo1318s(), intent);
                    return true;
                } else if (str.startsWith("removefromcart:") && C5346b.this.f19150ae != null && C5346b.this.f19150ae.mo17118b().equalsIgnoreCase("shoppingcart")) {
                    try {
                        App.f18489V.mo17519b(str, (Context) C5346b.this.mo1318s());
                    } catch (UnsupportedEncodingException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unable to remove shopping cart item: ");
                        sb.append(str);
                        Log.e("MyWebViewClient", sb.toString(), e);
                    }
                    C5346b.this.f19171d.reload();
                    return true;
                } else if (!m26885a(type) && !m26886a(type, str)) {
                    return false;
                } else {
                    if (C5346b.this.f19150ae != null && C5346b.this.f19150ae.mo17069aO()) {
                        return App.m25629a(str, (Fragment) C5346b.this, false);
                    }
                    App.m25629a(str, (Fragment) C5346b.this, true);
                    return true;
                }
            }
        }
    }

    /* renamed from: com.seattleclouds.f.b$c */
    public static class C5367c {

        /* renamed from: a */
        private C5368a f19198a;

        /* renamed from: com.seattleclouds.f.b$c$a */
        public interface C5368a {
            /* renamed from: a */
            void mo17579a(int i, int i2);
        }

        /* renamed from: a */
        public void mo17595a(C5368a aVar) {
            this.f19198a = aVar;
        }

        @JavascriptInterface
        public void onResize(int i, int i2) {
            if (this.f19198a != null) {
                this.f19198a.mo17579a(i, i2);
            }
        }
    }

    /* renamed from: com.seattleclouds.f.b$d */
    public static class C5369d extends Fragment {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public WebView f19199a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ScrollView f19200b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public LinearLayout f19201c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public SwipeRefreshLayout f19202d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C5367c f19203e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f19204f = 0;

        /* renamed from: L */
        public void mo1202L() {
            super.mo1202L();
            C5346b.m26823a(this.f19199a);
            this.f19199a = null;
            C5346b.m26841b(this.f19201c);
            this.f19201c = null;
            C5346b.m26824a(this.f19200b);
            this.f19200b = null;
        }

        /* renamed from: a */
        public void mo1234a(Bundle bundle) {
            super.mo1234a(bundle);
            mo1280d(true);
        }
    }

    /* renamed from: com.seattleclouds.f.b$e */
    private static class C5370e extends C5365a {

        /* renamed from: a */
        private View f19205a;

        /* renamed from: b */
        private ViewGroup f19206b;

        /* renamed from: c */
        private View f19207c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f19208d;

        /* renamed from: e */
        private View f19209e;

        /* renamed from: f */
        private CustomViewCallback f19210f;

        /* renamed from: g */
        private C5371a f19211g;

        /* renamed from: com.seattleclouds.f.b$e$a */
        public interface C5371a {
            /* renamed from: a */
            void mo17582a(boolean z);
        }

        public C5370e(View view, ViewGroup viewGroup, View view2) {
            super();
            this.f19205a = view;
            this.f19206b = viewGroup;
            this.f19207c = view2;
        }

        /* renamed from: a */
        public void mo17597a(C5371a aVar) {
            this.f19211g = aVar;
        }

        public View getVideoLoadingProgressView() {
            if (this.f19207c == null) {
                return super.getVideoLoadingProgressView();
            }
            this.f19207c.setVisibility(0);
            return this.f19207c;
        }

        public void onHideCustomView() {
            if (this.f19208d) {
                this.f19208d = false;
                try {
                    this.f19206b.removeView(this.f19209e);
                } catch (NullPointerException unused) {
                }
                this.f19209e = null;
                this.f19206b.setVisibility(4);
                this.f19205a.setVisibility(0);
                this.f19210f.onCustomViewHidden();
                this.f19210f = null;
                if (this.f19211g != null) {
                    this.f19211g.mo17582a(false);
                }
            }
        }

        public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }

        public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
            this.f19208d = true;
            this.f19209e = view;
            this.f19210f = customViewCallback;
            this.f19205a.setVisibility(4);
            this.f19206b.addView(this.f19209e, new LayoutParams(-1, -1));
            this.f19206b.setVisibility(0);
            if (this.f19211g != null) {
                this.f19211g.mo17582a(true);
            }
        }
    }

    /* renamed from: com.seattleclouds.f.b$f */
    protected class C5372f implements DownloadListener {
        protected C5372f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onDownloadStart(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            /*
                r0 = this;
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "android.intent.action.VIEW"
                r2.<init>(r3)
                r3 = 268435456(0x10000000, float:2.5243549E-29)
                r2.setFlags(r3)
                java.lang.String r3 = "file:///android_asset/"
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L_0x002c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = com.seattleclouds.App.f18508j
                r3.append(r5)
                r5 = 21
                java.lang.String r1 = r1.substring(r5)
            L_0x0024:
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                goto L_0x006b
            L_0x002c:
                java.lang.String r3 = com.seattleclouds.App.f18509k
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L_0x0050
                java.lang.String r3 = com.seattleclouds.App.f18509k
                int r3 = r3.length()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = com.seattleclouds.App.f18508j
                r5.append(r6)
                java.lang.String r1 = r1.substring(r3)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                goto L_0x006b
            L_0x0050:
                java.lang.String r3 = "file:"
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L_0x006b
                java.net.URI r1 = java.net.URI.create(r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = com.seattleclouds.App.f18508j
                r3.append(r5)
                java.lang.String r1 = r1.getPath()
                goto L_0x0024
            L_0x006b:
                if (r4 == 0) goto L_0x007f
                java.lang.String r3 = r4.trim()
                int r3 = r3.length()
                if (r3 == 0) goto L_0x007f
                java.lang.String r3 = "application/octet-stream"
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L_0x0087
            L_0x007f:
                java.lang.String r4 = java.net.HttpURLConnection.guessContentTypeFromName(r1)
                if (r4 != 0) goto L_0x0087
                java.lang.String r4 = "application/octet-stream"
            L_0x0087:
                java.lang.String r3 = "audio/"
                boolean r3 = r4.startsWith(r3)
                if (r3 == 0) goto L_0x0092
                java.lang.String r4 = "audio/*"
                goto L_0x009c
            L_0x0092:
                java.lang.String r3 = "video/"
                boolean r3 = r4.startsWith(r3)
                if (r3 == 0) goto L_0x009c
                java.lang.String r4 = "video/*"
            L_0x009c:
                android.net.Uri r3 = android.net.Uri.parse(r1)
                r2.setDataAndType(r3, r4)
                com.seattleclouds.f.b r3 = com.seattleclouds.p161f.C5346b.this     // Catch:{ ActivityNotFoundException -> 0x00c4 }
                r3.mo1230a(r2)     // Catch:{ ActivityNotFoundException -> 0x00c4 }
                com.seattleclouds.f.b r1 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r1 = r1.f19150ae
                if (r1 == 0) goto L_0x00bc
                com.seattleclouds.f.b r1 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r1 = r1.f19150ae
                boolean r1 = r1.mo17069aO()
                if (r1 != 0) goto L_0x00f7
            L_0x00bc:
                com.seattleclouds.f.b r1 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.App.m25625a(r1)
                goto L_0x00f7
            L_0x00c2:
                r1 = move-exception
                goto L_0x00f8
            L_0x00c4:
                java.lang.String r2 = "WebViewDownloadListener"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
                r3.<init>()     // Catch:{ all -> 0x00c2 }
                java.lang.String r5 = "onDownloadStart: Couldn't find activity to view url "
                r3.append(r5)     // Catch:{ all -> 0x00c2 }
                r3.append(r1)     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = " of mimeType: "
                r3.append(r1)     // Catch:{ all -> 0x00c2 }
                r3.append(r4)     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00c2 }
                android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00c2 }
                com.seattleclouds.f.b r1 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r1 = r1.f19150ae
                if (r1 == 0) goto L_0x00bc
                com.seattleclouds.f.b r1 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r1 = r1.f19150ae
                boolean r1 = r1.mo17069aO()
                if (r1 != 0) goto L_0x00f7
                goto L_0x00bc
            L_0x00f7:
                return
            L_0x00f8:
                com.seattleclouds.f.b r2 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r2 = r2.f19150ae
                if (r2 == 0) goto L_0x010c
                com.seattleclouds.f.b r2 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.aa r2 = r2.f19150ae
                boolean r2 = r2.mo17069aO()
                if (r2 != 0) goto L_0x0111
            L_0x010c:
                com.seattleclouds.f.b r2 = com.seattleclouds.p161f.C5346b.this
                com.seattleclouds.App.m25625a(r2)
            L_0x0111:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p161f.C5346b.C5372f.onDownloadStart(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
        }
    }

    /* renamed from: com.seattleclouds.f.b$g */
    protected class C5373g implements OnTouchListener {

        /* renamed from: b */
        private C0599c f19214b;

        public C5373g() {
            this.f19214b = new C0599c(C5346b.this.mo1318s(), new SimpleOnGestureListener(C5346b.this) {
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    return true;
                }

                public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    return true;
                }

                public boolean onSingleTapUp(MotionEvent motionEvent) {
                    C5346b.this.f19161aq = System.currentTimeMillis();
                    return false;
                }
            });
            this.f19214b.mo2437a((OnDoubleTapListener) new OnDoubleTapListener(C5346b.this) {
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    return true;
                }

                public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                    return true;
                }

                public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    return false;
                }
            });
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.f19214b.mo2438a(motionEvent);
        }
    }

    /* renamed from: a */
    public static void m26821a(SwipeRefreshLayout swipeRefreshLayout) {
        if (swipeRefreshLayout != null) {
            ViewGroup viewGroup = (ViewGroup) swipeRefreshLayout.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(swipeRefreshLayout);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26822a(View view, int i) {
        view.setAlpha(1.0f);
        C0626s.m2868k(view).mo2553a(0.0f).mo2554a((long) i).mo2555a((C0651x) new C0652y() {
            /* renamed from: b */
            public void mo2567b(View view) {
                view.setVisibility(4);
            }
        }).mo2561c();
    }

    /* renamed from: a */
    public static void m26823a(WebView webView) {
        if (webView != null) {
            ViewGroup viewGroup = (ViewGroup) webView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
        }
    }

    /* renamed from: a */
    public static void m26824a(ScrollView scrollView) {
        if (scrollView != null) {
            ViewGroup viewGroup = (ViewGroup) scrollView.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(scrollView);
            }
        }
    }

    /* renamed from: aB */
    private void m26828aB() {
        this.f19160ap = new Timer();
        this.f19160ap.schedule(new TimerTask() {
            public void run() {
                if (C5346b.this.mo1318s() != null && !C5346b.this.mo1318s().isFinishing() && !C5346b.this.f19157am) {
                    C5346b.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            if (C5346b.this.mo1318s() != null && !C5346b.this.mo1318s().isFinishing() && !C5346b.this.f19157am) {
                                C5346b.this.f19171d.clearFocus();
                            }
                        }
                    });
                }
            }
        }, 1000, 750);
    }

    /* renamed from: aC */
    private boolean m26829aC() {
        if (this.f19160ap == null) {
            return false;
        }
        this.f19160ap.cancel();
        this.f19160ap = null;
        return true;
    }

    /* renamed from: aI */
    private int m26832aI() {
        Bundle m = mo1307m();
        Integer valueOf = (m == null || !m.containsKey("ARG_BACKGROUND_COLOR")) ? null : Integer.valueOf(m.getInt("ARG_BACKGROUND_COLOR"));
        if (valueOf == null) {
            valueOf = Integer.valueOf(mo20291ax().mo17547d(mo1318s()));
        }
        return valueOf.intValue();
    }

    /* renamed from: aJ */
    private void m26833aJ() {
        this.f19152ah.setVisibility(0);
        if (mo1197G()) {
            mo17565aD();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aK */
    public void m26834aK() {
        WebView webView;
        Runnable r1;
        long j;
        if (!m26835aL()) {
            int i = this.f19163as;
            if (i == 2) {
                webView = this.f19171d;
                r1 = new Runnable() {
                    public void run() {
                        C5346b.this.f19152ah.setVisibility(4);
                    }
                };
                j = 100;
            } else if (i == 3) {
                webView = this.f19171d;
                r1 = new Runnable() {
                    public void run() {
                        C5346b.this.f19152ah.setVisibility(4);
                    }
                };
                j = 1000;
            } else {
                if (i == 4) {
                    m26822a(this.f19152ah, 300);
                } else if (i == 5) {
                    webView = this.f19171d;
                    r1 = new Runnable() {
                        public void run() {
                            C5346b.this.m26822a(C5346b.this.f19152ah, 350);
                        }
                    };
                    j = 200;
                } else {
                    this.f19152ah.setVisibility(4);
                }
            }
            webView.postDelayed(r1, j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aL */
    public boolean m26835aL() {
        return (this.f19152ah == null || this.f19152ah.getVisibility() == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: aM */
    public void m26836aM() {
        C6602at.m31951a(this.f19171d, "window.addEventListener('resize', function() {SCWebViewJavascriptInterface.onResize(window.innerWidth, window.innerHeight);}, false);");
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: aN */
    private void m26837aN() {
        C6602at.m31950a(this.f19171d);
        if (this.f19150ae == null ? !(this.f19174g == null || !this.f19174g.startsWith("http") || !App.f18501c.mo16912N()) : this.f19150ae.mo17068aN()) {
            this.f19171d.getSettings().setSupportZoom(true);
            this.f19171d.getSettings().setBuiltInZoomControls(true);
        }
        this.f19171d.setDownloadListener(new C5372f());
        this.f19171d.setOnTouchListener(new C5373g());
        this.f19171d.setWebViewClient(mo17564aA());
        this.f19166av.mo17595a(new C5368a() {
            /* renamed from: a */
            public void mo17579a(int i, int i2) {
                C0367h s = C5346b.this.mo1318s();
                if (s != null) {
                    s.runOnUiThread(new Runnable() {
                        public void run() {
                            C5346b.this.m26834aK();
                        }
                    });
                }
            }
        });
        this.f19167aw = new C5370e(this.f19155ak, this.f19156al, mo1318s().getLayoutInflater().inflate(C5460i.view_webview_video_progress, null)) {
            public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
                callback.invoke(str, true, false);
            }
        };
        this.f19167aw.mo17597a((C5371a) new C5371a() {
            /* renamed from: a */
            public void mo17582a(boolean z) {
                C5346b.this.mo17570m(z);
            }
        });
        this.f19167aw.mo17588a(this);
        this.f19171d.setWebChromeClient(this.f19167aw);
        this.f19168ax = new C6349a() {
            /* renamed from: w_ */
            public boolean mo17583w_() {
                if (!C5346b.this.f19167aw.f19208d) {
                    return false;
                }
                C5346b.this.f19167aw.onHideCustomView();
                return true;
            }
        };
        C6561t.m31733a((Fragment) this, this.f19168ax);
    }

    /* renamed from: aO */
    private void m26838aO() {
        LinearLayout a = AdNativeManager.m26108a((Activity) mo1318s(), this.f19150ae);
        if (a != null) {
            a.setLayoutParams(new LinearLayout.LayoutParams(-1, C6619m.m32014a(mo1318s(), (float) App.f18501c.mo16932ab())));
            int i = 0;
            if (AdNativeManager.m26109a(this.f19150ae) == NativeAdsAlignmentType.NATIVE_ADS_BOTTOM) {
                i = this.f19170c.getChildCount();
            }
            this.f19170c.addView(a, i);
            AdNativeManager.m26111a((Activity) mo1318s(), a, App.f18501c.mo16932ab());
        }
    }

    /* renamed from: aP */
    private void m26839aP() {
        if (this.f19150ae != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("feedbackfields", this.f19150ae.f18675a);
            bundle.putString("pageid", this.f19150ae.mo17046a());
            bundle.putBoolean("isOnlyEnterData", true);
            bundle.putString("submitbutton", "Done");
            startActivityForResult(App.m25603a(new FragmentInfo(C5633a.class.getName(), bundle), (Context) mo1318s()), 1055);
        }
    }

    /* renamed from: aQ */
    private void m26840aQ() {
        Bitmap bitmap;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.mosaic_image_share_no_sc_card, (OnClickListener) null);
            return;
        }
        Picture capturePicture = this.f19171d.capturePicture();
        try {
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Config.RGB_565);
            capturePicture.draw(new Canvas(bitmap));
        } catch (OutOfMemoryError unused) {
            Point a = C6619m.m32015a(mo1318s());
            bitmap = Bitmap.createBitmap(a.x, a.y, Config.RGB_565);
            capturePicture.draw(new Canvas(bitmap));
        }
        if (bitmap != null) {
            File file = new File(f19148a);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(f19148a);
            sb.append("temp.jpg");
            try {
                bitmap.compress(CompressFormat.JPEG, 90, new FileOutputStream(new File(sb.toString())));
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("image/jpeg");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f19148a);
                sb2.append("temp.jpg");
                intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(sb2.toString())));
                startActivityForResult(Intent.createChooser(intent, "Share via"), 4820);
            } catch (FileNotFoundException e) {
                C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.error_option_is_not_available, (OnClickListener) null);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Photo save: ");
                sb3.append(e);
                Log.e("SCWebViewFragment", sb3.toString(), e);
            }
        } else {
            C6620n.m32029a((Context) mo1318s(), C5462k.warning, C5462k.error_option_is_not_available, (OnClickListener) null);
        }
    }

    /* renamed from: b */
    public static void m26841b(LinearLayout linearLayout) {
        if (linearLayout != null) {
            ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewGroup);
            }
        }
    }

    /* renamed from: c */
    private void mo18054c(String str) {
        this.f19171d.loadUrl(str);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f19150ae != null && this.f19150ae.mo17118b().equalsIgnoreCase("shoppingcart")) {
            this.f19171d.reload();
        }
        if (this.f19158an && this.f19159ao) {
            m26829aC();
            m26828aB();
        }
        if (this.f19167aw != null && this.f19167aw.f19208d) {
            mo17570m(true);
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f19158an) {
            this.f19159ao = m26829aC();
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f19162ar) {
            this.f19164at.f19200b = this.f19169b;
            this.f19164at.f19201c = this.f19170c;
            this.f19164at.f19202d = this.f19154aj;
            this.f19164at.f19199a = this.f19171d;
            this.f19164at.f19203e = this.f19166av;
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout;
        View view;
        int i = 0;
        this.f19151ag = layoutInflater.inflate(C5460i.webview, viewGroup, false);
        this.f19152ah = this.f19151ag.findViewById(C5458g.web_view_overlay);
        this.f19153ai = (ViewGroup) this.f19151ag.findViewById(C5458g.web_view_container);
        int aI = m26832aI();
        this.f19153ai.setBackgroundColor(aI);
        this.f19152ah.setBackgroundColor(aI);
        if (!(this.f19171d == null || this.f19171d.getParent() == null)) {
            ((ViewGroup) this.f19171d.getParent()).removeView(this.f19171d);
        }
        if (!(this.f19154aj == null || this.f19154aj.getParent() == null)) {
            ((ViewGroup) this.f19154aj.getParent()).removeView(this.f19154aj);
        }
        if (!(this.f19170c == null || this.f19170c.getParent() == null)) {
            ((ViewGroup) this.f19170c.getParent()).removeView(this.f19170c);
        }
        if (!(this.f19169b == null || this.f19169b.getParent() == null)) {
            ((ViewGroup) this.f19169b.getParent()).removeView(this.f19169b);
        }
        boolean z = true;
        if (this.f19171d == null) {
            WebView webView = this.f19162ar ? VERSION.SDK_INT == 19 ? new WebView(new ActivityWrapper(mo1318s())) : new WebView(new C6588ai(mo1318s())) : new WebView(mo1318s());
            this.f19171d = webView;
            this.f19166av = new C5367c();
            this.f19171d.addJavascriptInterface(this.f19166av, "SCWebViewJavascriptInterface");
            this.f19171d.setBackgroundColor(aI);
            this.f19165au = true;
            this.f19171d.setLayoutParams(new LayoutParams(-1, -1));
        } else {
            if (this.f19171d.getContext() instanceof MutableContextWrapper) {
                ((MutableContextWrapper) this.f19171d.getContext()).setBaseContext(mo1318s());
            } else if (this.f19171d.getContext() instanceof ActivityWrapper) {
                ((ActivityWrapper) this.f19171d.getContext()).mo20311a(mo1318s());
            }
            this.f19171d.setLayoutParams(new LayoutParams(-1, this.f19171d.getContentHeight() > C6619m.m32020c(App.m25647e()) ? -2 : -1));
        }
        this.f19171d.setScrollContainer(true);
        if (this.f19169b == null) {
            this.f19169b = new ScrollView(mo1318s());
            this.f19169b.setLayoutParams(new LayoutParams(-1, -1));
            this.f19169b.setFillViewport(true);
        }
        if (this.f19170c == null) {
            this.f19170c = new LinearLayout(mo1318s());
            this.f19170c.setLayoutParams(new LayoutParams(-1, -1));
            this.f19170c.setOrientation(1);
        } else {
            z = false;
        }
        this.f19153ai.addView(this.f19169b);
        this.f19169b.addView(this.f19170c, 0);
        if (AdNativeManager.m26109a(this.f19150ae) == NativeAdsAlignmentType.NATIVE_ADS_TOP) {
            i = this.f19170c.getChildCount();
        }
        if (this.f19150ae == null || !this.f19150ae.mo17118b().equalsIgnoreCase("mobile")) {
            linearLayout = this.f19170c;
            view = this.f19171d;
        } else {
            if (this.f19170c != null) {
                this.f19154aj = new SwipeRefreshLayout(mo1318s());
                this.f19154aj.setOnRefreshListener(new C0674b() {
                    /* renamed from: a */
                    public void mo2774a() {
                        C5346b.this.f19171d.reload();
                    }
                });
            }
            this.f19154aj.addView(this.f19171d);
            linearLayout = this.f19170c;
            view = this.f19154aj;
        }
        linearLayout.addView(view, i);
        if (z) {
            m26838aO();
        }
        if (this.f19163as != 0) {
            int i2 = mo1320t().getConfiguration().orientation;
            if (this.f19164at.f19204f != i2 && !this.f19165au) {
                m26833aJ();
            } else if (VERSION.SDK_INT >= 21) {
                mo17566aE();
            }
            this.f19164at.f19204f = i2;
        }
        this.f19171d.setContentDescription(this.f19174g);
        this.f19171d.requestFocus(130);
        this.f19172e = (ProgressBar) this.f19151ag.findViewById(C5458g.progressBar);
        this.f19155ak = (SoftKeyboardDetectingLinearLayout) this.f19151ag.findViewById(C5458g.sc_ad_container);
        this.f19155ak.setBackgroundColor(aI);
        this.f19156al = (ViewGroup) this.f19151ag.findViewById(C5458g.video_container);
        mo17568az();
        return this.f19151ag;
    }

    @SuppressLint({"SimpleDateFormat"})
    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        if (i == 1055) {
            if (i2 != 0) {
                this.f19176i = C5669b.m28021a(intent.getStringArrayListExtra("content_data_name"), intent.getStringArrayListExtra("content_data_value"));
                if (this.f19176i == null) {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 4820) {
            String A = App.f18501c.mo16899A();
            if (this.f19150ae != null && A != null && !A.equalsIgnoreCase("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(App.m25654h());
                sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                sb.append(A);
                File file = new File(sb.toString());
                if (file.exists()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(UUID.randomUUID().toString());
                    sb2.append(".png");
                    String sb3 = sb2.toString();
                    try {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(f19148a);
                        sb4.append("temp.jpg");
                        C6613i.m31988a(sb4.toString(), App.m25654h(), sb3, mo1318s());
                        String b = C6613i.m31991b(App.m25649e(A));
                        String format = new SimpleDateFormat("yyyy/MM/dd HH:mm").format(new Date());
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("<div style=\"padding:10px;border-top:solid 1px #eee;border-bottom:solid 1px #eee;\"><a href=\"");
                        sb5.append(sb3);
                        sb5.append("\"><img style=\"vertical-align:middle;width:80px;\" src=\"");
                        sb5.append(sb3);
                        sb5.append("\">&nbsp;on ");
                        sb5.append(format);
                        sb5.append("</a></div></body>");
                        String sb6 = sb5.toString();
                        int indexOf = b.indexOf("</body>");
                        if (indexOf != -1) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(b.substring(0, indexOf));
                            sb7.append(sb6);
                            sb7.append(b.substring(indexOf, b.length()));
                            b = sb7.toString();
                        }
                        C6730b.m32458a(file, b, "UTF-8");
                        return;
                    } catch (IOException e) {
                        Log.d("SCWebViewFragment", e.getMessage());
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 57053) {
            if (this.f19150ae != null && this.f19150ae.mo17041X()) {
                this.f19176i = C6244b.m30355a().mo19533a(this.f19150ae.mo17046a());
            } else {
                return;
            }
        } else if (i == 4821 && this.f19167aw != null) {
            this.f19167aw.mo17587a(mo1318s(), i, i2, intent);
            return;
        } else {
            return;
        }
        this.f19171d.loadDataWithBaseURL(App.m25655h(""), this.f19176i, null, "UTF-8", null);
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (i != 1789) {
            if (i == 5821) {
                if (!C6569aa.m31801a(strArr, iArr, "android.permission.READ_EXTERNAL_STORAGE")) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public void run() {
                            C6570a.m31804a(false, C5462k.web_view_read_external_storage_permission_denied).mo1448a(C5346b.this.mo1318s().mo1469g(), "permissionDialog");
                        }
                    }, 400);
                } else {
                    Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
                }
            }
        } else if (!C6569aa.m31801a(strArr, iArr, "android.permission.CAMERA")) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    C6570a.m31804a(false, C5462k.web_view_permission_camera_denied).mo1448a(C5346b.this.mo1318s().mo1469g(), "permissionDialog");
                }
            }, 400);
        } else {
            Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19162ar = m.getBoolean("ARG_OPTIMIZE_ORIENTATION_CHANGE", this.f19162ar);
            if (!m.getBoolean("ARG_OPTIMIZE_APPEARANCE", true)) {
                this.f19163as = 0;
            }
            this.f19174g = m.getString("ARG_URL");
            this.f19173f = m.getBoolean("ARG_IS_ROOT_FRAGMENT");
            this.f19176i = m.getString("ARG_HTML_STRING");
            this.f19175h = m.getString("baseURL");
            if (this.f19175h == null) {
                this.f19175h = App.m25655h("");
            }
            this.f19150ae = App.m25675r(this.f19174g);
        }
        if (this.f19174g == null) {
            this.f19174g = "";
        }
        if (bundle != null) {
            this.f19162ar = bundle.getBoolean("STATE_REUSE_WEBVIEW");
            this.f19163as = bundle.getInt("STATE_APPEARANCE_TYPE");
        }
        String str = "";
        for (Fragment x = mo1325x(); x != null; x = x.mo1325x()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(x.mo1304l());
            sb.append(":");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(mo1304l());
        sb2.append(":");
        sb2.append(this.f19174g);
        sb2.append(":state");
        String sb3 = sb2.toString();
        C0374l g = mo1318s().mo1469g();
        this.f19164at = (C5369d) g.mo1535a(sb3);
        if (this.f19164at == null) {
            this.f19164at = new C5369d();
            g.mo1536a().mo1413a((Fragment) this.f19164at, sb3).mo1428c();
        }
        if (this.f19162ar) {
            this.f19171d = this.f19164at.f19199a;
            this.f19154aj = this.f19164at.f19202d;
            this.f19170c = this.f19164at.f19201c;
            this.f19169b = this.f19164at.f19200b;
            this.f19166av = this.f19164at.f19203e;
        }
        if (f19148a == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(mo1318s().getExternalFilesDir(null));
            sb4.append("/SendCart/");
            f19148a = sb4.toString();
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        C5799d.m28567i(this.f19174g);
        super.mo1240a(menu, menuInflater);
        if (this.f19150ae != null) {
            if (!this.f19173f && App.f18501c.mo16938c() == 1 && this.f19150ae.mo17017L()) {
                menuInflater.inflate(C5461j.home, menu);
            }
            if (this.f19150ae.mo17183r()) {
                menuInflater.inflate(C5461j.customize, menu);
            }
            if (this.f19150ae.mo17180q()) {
                menuInflater.inflate(C5461j.send, menu);
            }
            String p = this.f19150ae.mo17175p();
            if (p != null && p.equalsIgnoreCase("yes")) {
                menuInflater.inflate(C5461j.rate, menu);
            }
        }
    }

    /* renamed from: a */
    public void mo17562a(C6582a aVar) {
        new C5470a().mo17781a((C6557s) this, Uri.parse(this.f19174g).getLastPathSegment());
    }

    /* renamed from: a */
    public void mo17563a(C6584c cVar) {
        super.mo17563a(cVar);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (VERSION.SDK_INT < 11) {
            return;
        }
        if (z) {
            this.f19171d.onResume();
        } else {
            this.f19171d.onPause();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.menu_item_home) {
            AppStarterActivity.m25701b((Activity) mo1318s());
            return true;
        } else if (itemId == C5458g.menu_item_customize) {
            m26839aP();
            return true;
        } else if (itemId == C5458g.menu_item_send) {
            m26840aQ();
            return true;
        } else if (itemId == C5458g.menu_item_rate) {
            C6244b.m30355a().mo19534a((Activity) mo1318s(), this.f19150ae);
            return true;
        } else if (itemId == 1000) {
            this.f19162ar = !this.f19162ar;
            menuItem.setChecked(this.f19162ar);
            return true;
        } else if (itemId != 2000) {
            return super.mo1245a(menuItem);
        } else {
            mo17567aF();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public WebViewClient mo17564aA() {
        return new C5366b();
    }

    /* renamed from: aD */
    public void mo17565aD() {
        if (!m26835aL()) {
            this.f19152ah.postDelayed(new Runnable() {
                public void run() {
                    if (!C5346b.this.m26835aL()) {
                        Log.w("SCWebViewFragment", "Web view still not visible after timeout => force show");
                    }
                    C5346b.this.m26834aK();
                }
            }, 3000);
        }
    }

    /* renamed from: aE */
    public void mo17566aE() {
        this.f19152ah.setVisibility(0);
        this.f19171d.postDelayed(new Runnable() {
            public void run() {
                C5346b.this.m26822a(C5346b.this.f19152ah, 300);
            }
        }, 600);
    }

    /* renamed from: aF */
    public void mo17567aF() {
        new C0766a(mo1318s()).mo3057a(new CharSequence[]{"Unoptimized", "Simple", "Delay", "Long delay", "Fade in", "Delayed fade in"}, this.f19163as, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5346b.this.f19163as = i;
                dialogInterface.dismiss();
            }
        }).mo3068c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public void mo17568az() {
        if (this.f19174g == null && this.f19176i == null) {
            Log.e("SCWebViewFragment", "No page URL or content provided. Closing...");
            App.m25635b((Fragment) this);
            return;
        }
        boolean z = false;
        if (this.f19150ae != null) {
            if (this.f19150ae.mo17183r()) {
                ArrayList a = C5669b.m28022a(mo1318s(), this.f19174g, true);
                if (a != null && a.size() == 2) {
                    this.f19176i = (String) a.get(1);
                    this.f19150ae.mo17120b((ArrayList) a.get(0));
                }
            }
            if (this.f19150ae.mo17041X()) {
                this.f19176i = C6244b.m30355a().mo19533a(this.f19150ae.mo17046a());
            }
        }
        m26837aN();
        if (this.f19165au) {
            if (this.f19176i != null) {
                mo17569d(this.f19176i);
            } else {
                mo18054c(this.f19174g);
            }
        }
        if (VERSION.SDK_INT >= 15 && VERSION.SDK_INT < 19) {
            if (mo1318s().findViewById(16908306) != null) {
                z = true;
            }
            this.f19158an = z;
        }
        if (this.f19158an) {
            this.f19155ak.setSoftKeyboardVisibilityListener(new C6667a() {
                /* renamed from: a */
                public void mo17571a(boolean z) {
                    C5346b.this.f19157am = z;
                }
            });
        }
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        super.mo1274c(z);
        if (!this.f19158an) {
            return;
        }
        if (!z) {
            m26829aC();
            m26828aB();
            return;
        }
        m26829aC();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17569d(String str) {
        this.f19171d.loadDataWithBaseURL(this.f19175h, str, null, "UTF-8", null);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putBoolean("STATE_REUSE_WEBVIEW", this.f19162ar);
        bundle.putInt("STATE_APPEARANCE_TYPE", this.f19163as);
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        super.mo1290g(z);
        if (z && this.f19171d != null && this.f19152ah != null) {
            mo17565aD();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        this.f19167aw.onHideCustomView();
        if (!this.f19162ar) {
            m26823a(this.f19171d);
            this.f19171d = null;
            m26821a(this.f19154aj);
            this.f19154aj = null;
            m26841b(this.f19170c);
            this.f19170c = null;
            m26824a(this.f19169b);
            this.f19169b = null;
        }
        C6561t.m31739b((Fragment) this, this.f19168ax);
    }

    /* renamed from: m */
    public void mo17570m(boolean z) {
        int i;
        WindowManager.LayoutParams attributes;
        int i2;
        if (z) {
            i = 1;
            C6561t.m31741c(this, true);
            attributes = mo1318s().getWindow().getAttributes();
            attributes.flags |= 1024;
            i2 = attributes.flags | 128;
        } else {
            i = 0;
            C6561t.m31741c(this, false);
            attributes = mo1318s().getWindow().getAttributes();
            attributes.flags &= -1025;
            i2 = attributes.flags & -129;
        }
        attributes.flags = i2;
        mo1318s().getWindow().setAttributes(attributes);
        mo1318s().getWindow().getDecorView().setSystemUiVisibility(i);
    }
}
