package com.facebook.internal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.C2189f;
import com.facebook.C2199i;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.GraphRequest.C1609b;
import com.facebook.common.C2179a.C2180a;
import com.facebook.common.C2179a.C2183d;
import com.facebook.common.C2179a.C2184e;
import com.facebook.share.internal.C2342h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.facebook.internal.z */
public class C2265z extends Dialog {

    /* renamed from: a */
    private static final int f7275a = C2184e.com_facebook_activity_theme;

    /* renamed from: m */
    private static volatile int f7276m;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f7277b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f7278c;

    /* renamed from: d */
    private C2272c f7279d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WebView f7280e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ProgressDialog f7281f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f7282g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public FrameLayout f7283h;

    /* renamed from: i */
    private C2273d f7284i;

    /* renamed from: j */
    private boolean f7285j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f7286k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f7287l;

    /* renamed from: n */
    private LayoutParams f7288n;

    /* renamed from: com.facebook.internal.z$a */
    public static class C2270a {

        /* renamed from: a */
        private Context f7293a;

        /* renamed from: b */
        private String f7294b;

        /* renamed from: c */
        private String f7295c;

        /* renamed from: d */
        private int f7296d;

        /* renamed from: e */
        private C2272c f7297e;

        /* renamed from: f */
        private Bundle f7298f;

        /* renamed from: g */
        private AccessToken f7299g;

        public C2270a(Context context, String str, Bundle bundle) {
            this.f7299g = AccessToken.m7985a();
            if (this.f7299g == null) {
                String a = C2258x.m10363a(context);
                if (a != null) {
                    this.f7294b = a;
                } else {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m10458a(context, str, bundle);
        }

        public C2270a(Context context, String str, String str2, Bundle bundle) {
            if (str == null) {
                str = C2258x.m10363a(context);
            }
            C2264y.m10423a(str, "applicationId");
            this.f7294b = str;
            m10458a(context, str2, bundle);
        }

        /* renamed from: a */
        private void m10458a(Context context, String str, Bundle bundle) {
            this.f7293a = context;
            this.f7295c = str;
            if (bundle != null) {
                this.f7298f = bundle;
            } else {
                this.f7298f = new Bundle();
            }
        }

        /* renamed from: a */
        public C2270a mo7909a(C2272c cVar) {
            this.f7297e = cVar;
            return this;
        }

        /* renamed from: a */
        public C2265z mo7910a() {
            Bundle bundle;
            String str;
            String str2;
            if (this.f7299g != null) {
                this.f7298f.putString("app_id", this.f7299g.mo6526h());
                bundle = this.f7298f;
                str = "access_token";
                str2 = this.f7299g.mo6518b();
            } else {
                bundle = this.f7298f;
                str = "app_id";
                str2 = this.f7294b;
            }
            bundle.putString(str, str2);
            return C2265z.m10435a(this.f7293a, this.f7295c, this.f7298f, this.f7296d, this.f7297e);
        }

        /* renamed from: b */
        public String mo7911b() {
            return this.f7294b;
        }

        /* renamed from: c */
        public Context mo7912c() {
            return this.f7293a;
        }

        /* renamed from: d */
        public int mo7913d() {
            return this.f7296d;
        }

        /* renamed from: e */
        public Bundle mo7914e() {
            return this.f7298f;
        }

        /* renamed from: f */
        public C2272c mo7915f() {
            return this.f7297e;
        }
    }

    /* renamed from: com.facebook.internal.z$b */
    private class C2271b extends WebViewClient {
        private C2271b() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!C2265z.this.f7286k) {
                C2265z.this.f7281f.dismiss();
            }
            C2265z.this.f7283h.setBackgroundColor(0);
            C2265z.this.f7280e.setVisibility(0);
            C2265z.this.f7282g.setVisibility(0);
            C2265z.this.f7287l = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append("Webview loading URL: ");
            sb.append(str);
            C2258x.m10384a("FacebookSDK.WebDialog", sb.toString());
            super.onPageStarted(webView, str, bitmap);
            if (!C2265z.this.f7286k) {
                C2265z.this.f7281f.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C2265z.this.mo7891a((Throwable) new FacebookDialogException(str, i, str2));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            C2265z.this.mo7891a((Throwable) new FacebookDialogException(null, -11, null));
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("Redirect URL: ");
            sb.append(str);
            C2258x.m10384a("FacebookSDK.WebDialog", sb.toString());
            if (str.startsWith(C2265z.this.f7278c)) {
                Bundle a = C2265z.this.mo7844a(str);
                String string = a.getString("error");
                if (string == null) {
                    string = a.getString("error_type");
                }
                String string2 = a.getString("error_msg");
                if (string2 == null) {
                    string2 = a.getString("error_message");
                }
                if (string2 == null) {
                    string2 = a.getString("error_description");
                }
                String string3 = a.getString("error_code");
                if (!C2258x.m10392a(string3)) {
                    try {
                        i = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                    }
                    if (!C2258x.m10392a(string) && C2258x.m10392a(string2) && i == -1) {
                        C2265z.this.mo7889a(a);
                    } else if ((string != null || (!string.equals("access_denied") && !string.equals("OAuthAccessDeniedException"))) && i != 4201) {
                        C2265z.this.mo7891a((Throwable) new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                    } else {
                        C2265z.this.cancel();
                    }
                    return true;
                }
                i = -1;
                if (!C2258x.m10392a(string)) {
                }
                if (string != null) {
                }
                C2265z.this.mo7891a((Throwable) new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
                return true;
            } else if (str.startsWith("fbconnect://cancel")) {
                C2265z.this.cancel();
                return true;
            } else if (str.contains("touch")) {
                return false;
            } else {
                try {
                    C2265z.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: com.facebook.internal.z$c */
    public interface C2272c {
        /* renamed from: a */
        void mo7841a(Bundle bundle, FacebookException facebookException);
    }

    /* renamed from: com.facebook.internal.z$d */
    private class C2273d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: b */
        private String f7302b;

        /* renamed from: c */
        private Bundle f7303c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Exception[] f7304d;

        C2273d(String str, Bundle bundle) {
            this.f7302b = str;
            this.f7303c = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String[] strArr) {
            Exception[] excArr;
            C2265z.this.f7281f.dismiss();
            for (Exception exc : this.f7304d) {
                if (exc != null) {
                    C2265z.this.mo7891a((Throwable) exc);
                    return;
                }
            }
            if (strArr == null) {
                C2265z.this.mo7891a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List asList = Arrays.asList(strArr);
            if (asList.contains(null)) {
                C2265z.this.mo7891a((Throwable) new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            C2258x.m10389a(this.f7303c, "media", (Object) new JSONArray(asList));
            String a = C2257w.m10351a();
            StringBuilder sb = new StringBuilder();
            sb.append(C2189f.m10093g());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append("dialog/");
            sb.append(this.f7302b);
            C2265z.this.f7277b = C2258x.m10358a(a, sb.toString(), this.f7303c).toString();
            C2265z.this.m10442b((C2265z.this.f7282g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            String[] stringArray = this.f7303c.getStringArray("media");
            final String[] strArr = new String[stringArray.length];
            this.f7304d = new Exception[stringArray.length];
            final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken a = AccessToken.m7985a();
            final int i = 0;
            while (i < stringArray.length) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(stringArray[i]);
                    if (C2258x.m10399b(parse)) {
                        strArr[i] = parse.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(C2342h.m10882a(a, parse, (C1609b) new C1609b() {
                            /* renamed from: a */
                            public void mo6589a(C2199i iVar) {
                                try {
                                    FacebookRequestError a = iVar.mo7795a();
                                    if (a != null) {
                                        String f = a.mo6559f();
                                        if (f == null) {
                                            f = "Error staging photo.";
                                        }
                                        throw new FacebookGraphResponseException(iVar, f);
                                    }
                                    JSONObject b = iVar.mo7796b();
                                    if (b != null) {
                                        String optString = b.optString("uri");
                                        if (optString != null) {
                                            strArr[i] = optString;
                                            countDownLatch.countDown();
                                            return;
                                        }
                                        throw new FacebookException("Error staging photo.");
                                    }
                                    throw new FacebookException("Error staging photo.");
                                } catch (Exception e) {
                                    C2273d.this.f7304d[i] = e;
                                }
                            }
                        }).mo6585j());
                    }
                    i++;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                    return null;
                }
            }
            countDownLatch.await();
            return strArr;
        }
    }

    protected C2265z(Context context, String str) {
        this(context, str, m10433a());
    }

    private C2265z(Context context, String str, int i) {
        if (i == 0) {
            i = m10433a();
        }
        super(context, i);
        this.f7278c = "fbconnect://success";
        this.f7285j = false;
        this.f7286k = false;
        this.f7287l = false;
        this.f7277b = str;
    }

    private C2265z(Context context, String str, Bundle bundle, int i, C2272c cVar) {
        if (i == 0) {
            i = m10433a();
        }
        super(context, i);
        this.f7278c = "fbconnect://success";
        this.f7285j = false;
        this.f7286k = false;
        this.f7287l = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("display", "touch");
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{C2189f.m10094h()}));
        this.f7279d = cVar;
        if (!str.equals("share") || !bundle.containsKey("media")) {
            String a = C2257w.m10351a();
            StringBuilder sb = new StringBuilder();
            sb.append(C2189f.m10093g());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append("dialog/");
            sb.append(str);
            this.f7277b = C2258x.m10358a(a, sb.toString(), bundle).toString();
            return;
        }
        this.f7284i = new C2273d(str, bundle);
    }

    /* renamed from: a */
    public static int m10433a() {
        C2264y.m10419a();
        return f7276m;
    }

    /* renamed from: a */
    private int m10434a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* renamed from: a */
    public static C2265z m10435a(Context context, String str, Bundle bundle, int i, C2272c cVar) {
        m10439a(context);
        C2265z zVar = new C2265z(context, str, bundle, i, cVar);
        return zVar;
    }

    /* renamed from: a */
    public static void m10438a(int i) {
        if (i == 0) {
            i = f7275a;
        }
        f7276m = i;
    }

    /* renamed from: a */
    protected static void m10439a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || f7276m != 0)) {
                    m10438a(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: b */
    public void m10442b(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f7280e = new WebView(getContext()) {
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f7280e.setVerticalScrollBarEnabled(false);
        this.f7280e.setHorizontalScrollBarEnabled(false);
        this.f7280e.setWebViewClient(new C2271b());
        this.f7280e.getSettings().setJavaScriptEnabled(true);
        this.f7280e.loadUrl(this.f7277b);
        this.f7280e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f7280e.setVisibility(4);
        this.f7280e.getSettings().setSavePassword(false);
        this.f7280e.getSettings().setSaveFormData(false);
        this.f7280e.setFocusable(true);
        this.f7280e.setFocusableInTouchMode(true);
        this.f7280e.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!view.hasFocus()) {
                    view.requestFocus();
                }
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f7280e);
        linearLayout.setBackgroundColor(-872415232);
        this.f7283h.addView(linearLayout);
    }

    /* renamed from: f */
    private void m10448f() {
        this.f7282g = new ImageView(getContext());
        this.f7282g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C2265z.this.cancel();
            }
        });
        this.f7282g.setImageDrawable(getContext().getResources().getDrawable(C2180a.com_facebook_close));
        this.f7282g.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo7844a(String str) {
        Uri parse = Uri.parse(str);
        Bundle b = C2258x.m10394b(parse.getQuery());
        b.putAll(C2258x.m10394b(parse.getFragment()));
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7889a(Bundle bundle) {
        if (this.f7279d != null && !this.f7285j) {
            this.f7285j = true;
            this.f7279d.mo7841a(bundle, null);
            dismiss();
        }
    }

    /* renamed from: a */
    public void mo7890a(C2272c cVar) {
        this.f7279d = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7891a(Throwable th) {
        if (this.f7279d != null && !this.f7285j) {
            this.f7285j = true;
            this.f7279d.mo7841a(null, th instanceof FacebookException ? (FacebookException) th : new FacebookException(th));
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7892b(String str) {
        this.f7278c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo7893b() {
        return this.f7285j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo7894c() {
        return this.f7287l;
    }

    public void cancel() {
        if (this.f7279d != null && !this.f7285j) {
            mo7891a((Throwable) new FacebookOperationCanceledException());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public WebView mo7895d() {
        return this.f7280e;
    }

    public void dismiss() {
        if (this.f7280e != null) {
            this.f7280e.stopLoading();
        }
        if (!this.f7286k && this.f7281f != null && this.f7281f.isShowing()) {
            this.f7281f.dismiss();
        }
        super.dismiss();
    }

    /* renamed from: e */
    public void mo7897e() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        getWindow().setLayout(Math.min(m10434a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m10434a(displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    public void onAttachedToWindow() {
        this.f7286k = false;
        if (C2258x.m10406d(getContext()) && this.f7288n != null && this.f7288n.token == null) {
            this.f7288n.token = getOwnerActivity().getWindow().getAttributes().token;
            StringBuilder sb = new StringBuilder();
            sb.append("Set token on onAttachedToWindow(): ");
            sb.append(this.f7288n.token);
            C2258x.m10384a("FacebookSDK.WebDialog", sb.toString());
        }
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7281f = new ProgressDialog(getContext());
        this.f7281f.requestWindowFeature(1);
        this.f7281f.setMessage(getContext().getString(C2183d.com_facebook_loading));
        this.f7281f.setCanceledOnTouchOutside(false);
        this.f7281f.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                C2265z.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f7283h = new FrameLayout(getContext());
        mo7897e();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        m10448f();
        if (this.f7277b != null) {
            m10442b((this.f7282g.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f7283h.addView(this.f7282g, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f7283h);
    }

    public void onDetachedFromWindow() {
        this.f7286k = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f7284i == null || this.f7284i.getStatus() != Status.PENDING) {
            mo7897e();
            return;
        }
        this.f7284i.execute(new Void[0]);
        this.f7281f.show();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f7284i != null) {
            this.f7284i.cancel(true);
            this.f7281f.dismiss();
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f7288n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }
}
