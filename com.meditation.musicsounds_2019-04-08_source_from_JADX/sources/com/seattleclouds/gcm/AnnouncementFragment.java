package com.seattleclouds.gcm;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.util.C6609e;
import com.seattleclouds.util.C6618l;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6639t;
import com.seattleclouds.util.HTTPUtil;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"SetJavaScriptEnabled"})
public class AnnouncementFragment extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WebView f19223a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ProgressBar f19224b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f19225c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f19226d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f19227e;

    /* renamed from: com.seattleclouds.gcm.AnnouncementFragment$a */
    private class C5379a extends AsyncTask<Void, String, C5381c> {
        private C5379a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C5381c doInBackground(Void... voidArr) {
            String sb;
            String str;
            StringBuilder sb2;
            String str2;
            HashMap hashMap = new HashMap();
            hashMap.put("publisherId", App.f18522x);
            hashMap.put("username", App.f18523y);
            hashMap.put("appId", App.f18524z);
            hashMap.put("deviceId", C6618l.m32012a());
            hashMap.put("type", "announcement");
            C5381c cVar = new C5381c();
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://");
                sb3.append(App.f18518t);
                sb3.append("/gcm_get_topic_subscriptions.ashx");
                sb = HTTPUtil.m31764a(sb3.toString(), (Map<String, String>) hashMap);
                if (sb == null || sb.length() < 2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unparsable response received from server: ");
                    sb4.append(sb);
                    Log.e("AnnouncementFragment", sb4.toString());
                    sb = "Internal Server Error";
                    cVar.f19231a = sb;
                    return cVar;
                }
                if (sb.startsWith("ERROR:")) {
                    sb = sb.substring(6);
                    str = "AnnouncementFragment";
                    sb2 = new StringBuilder();
                    str2 = "Error received from server: ";
                } else if (!sb.startsWith("OK")) {
                    str = "AnnouncementFragment";
                    sb2 = new StringBuilder();
                    str2 = "Unknown error received from server: ";
                } else {
                    if (sb.length() > 2) {
                        cVar.f19232b = sb.substring(3);
                    }
                    return cVar;
                }
                sb2.append(str2);
                sb2.append(sb);
                Log.e(str, sb2.toString());
                cVar.f19231a = sb;
                return cVar;
            } catch (IOException e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("IO Error: ");
                sb5.append(e);
                Log.w("AnnouncementFragment", sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append("IO Error: ");
                sb6.append(e);
                sb = sb6.toString();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C5381c cVar) {
            TextView b;
            int i;
            super.onPostExecute(cVar);
            AnnouncementFragment.this.f19227e = false;
            C0367h s = AnnouncementFragment.this.mo1318s();
            if (s != null) {
                if (cVar.f19231a == null) {
                    new C5380b().execute(new String[]{cVar.f19232b});
                } else {
                    AnnouncementFragment.this.f19224b.setVisibility(8);
                    AnnouncementFragment.this.f19225c.setVisibility(0);
                    if (!C6619m.m32026h(s)) {
                        b = AnnouncementFragment.this.f19225c;
                        i = C5462k.common_no_network;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error loading data: ");
                        sb.append(cVar.f19231a);
                        Log.w("AnnouncementFragment", sb.toString());
                        b = AnnouncementFragment.this.f19225c;
                        i = C5462k.common_internal_server_error;
                    }
                    b.setText(s.getString(i));
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            AnnouncementFragment.this.f19224b.setVisibility(0);
            AnnouncementFragment.this.f19225c.setVisibility(8);
            AnnouncementFragment.this.f19223a.setVisibility(8);
            super.onPreExecute();
        }
    }

    /* renamed from: com.seattleclouds.gcm.AnnouncementFragment$b */
    private class C5380b extends AsyncTask<String, Void, String> {
        private C5380b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str;
            String str2;
            String str3 = strArr.length > 0 ? strArr[0] : null;
            Bundle m = AnnouncementFragment.this.mo1307m();
            if (m != null) {
                if (m.getString("ARG_TOPICS") != null && !m.getString("ARG_TOPICS").equalsIgnoreCase("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(m.getString("ARG_TOPICS"));
                    str3 = sb.toString();
                }
                str = m.getString("PAGE_ID");
            } else {
                str = null;
            }
            if (C5279b.m26385c()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(App.f18522x);
                sb2.append(App.f18523y);
                sb2.append(App.f18524z);
                sb2.append(C5279b.m26389e());
                str2 = mo17641b(sb2.toString());
            } else {
                str2 = null;
            }
            AnnouncementFragment.this.f19226d = null;
            try {
                AnnouncementFragment announcementFragment = AnnouncementFragment.this;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://");
                sb3.append(App.f18516r);
                sb3.append("/getpushedmessages.ashx");
                String sb4 = sb3.toString();
                String[] strArr2 = new String[18];
                strArr2[0] = "publisherid";
                strArr2[1] = App.f18522x;
                strArr2[2] = "username";
                strArr2[3] = App.f18523y;
                strArr2[4] = "appid";
                strArr2[5] = App.f18524z;
                strArr2[6] = "templateId";
                if (str == null) {
                    str = "";
                }
                strArr2[7] = str;
                strArr2[8] = "topics";
                if (str3 == null) {
                    str3 = "";
                }
                strArr2[9] = str3;
                strArr2[10] = "pwd_hash";
                if (str2 == null) {
                    str2 = "";
                }
                strArr2[11] = str2;
                strArr2[12] = "maxwidth";
                strArr2[13] = "320";
                strArr2[14] = "limit";
                strArr2[15] = "50";
                strArr2[16] = "uniquifier";
                strArr2[17] = Long.toString(System.currentTimeMillis());
                announcementFragment.f19226d = HTTPUtil.m31764a(sb4, (Map<String, String>) C6609e.m31966a(strArr2));
                return null;
            } catch (IOException e) {
                return e.getMessage();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            TextView b;
            int i;
            super.onPostExecute(str);
            AnnouncementFragment.this.f19227e = false;
            C0367h s = AnnouncementFragment.this.mo1318s();
            if (s != null) {
                if (str == null) {
                    AnnouncementFragment.this.m26935c();
                } else {
                    AnnouncementFragment.this.f19224b.setVisibility(8);
                    AnnouncementFragment.this.f19225c.setVisibility(0);
                    if (!C6619m.m32026h(s)) {
                        b = AnnouncementFragment.this.f19225c;
                        i = C5462k.common_no_network;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error loading data: ");
                        sb.append(str);
                        Log.w("AnnouncementFragment", sb.toString());
                        b = AnnouncementFragment.this.f19225c;
                        i = C5462k.common_internal_server_error;
                    }
                    b.setText(s.getString(i));
                }
            }
        }

        /* renamed from: b */
        public String mo17641b(String str) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.reset();
                instance.update(str.getBytes());
                byte[] digest = instance.digest();
                int length = digest.length;
                StringBuilder sb = new StringBuilder(length << 1);
                for (int i = 0; i < length; i++) {
                    sb.append(Character.forDigit((digest[i] & 240) >> 4, 16));
                    sb.append(Character.forDigit(digest[i] & 15, 16));
                }
                return sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return str;
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            super.onPreExecute();
            AnnouncementFragment.this.f19224b.setVisibility(0);
            AnnouncementFragment.this.f19225c.setVisibility(8);
            AnnouncementFragment.this.f19223a.setVisibility(8);
        }
    }

    /* renamed from: com.seattleclouds.gcm.AnnouncementFragment$c */
    private class C5381c {

        /* renamed from: a */
        public String f19231a = null;

        /* renamed from: b */
        public String f19232b = null;

        C5381c() {
        }
    }

    /* renamed from: b */
    private void m26933b() {
        if (!this.f19227e) {
            this.f19227e = true;
            new C5379a().execute(new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26935c() {
        this.f19223a.loadDataWithBaseURL(App.m25655h(""), this.f19226d, null, "UTF-8", null);
        this.f19224b.setVisibility(8);
        this.f19223a.setVisibility(0);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_announcement, viewGroup, false);
        this.f19224b = (ProgressBar) inflate.findViewById(C5458g.progress_bar);
        this.f19225c = (TextView) inflate.findViewById(C5458g.info_text);
        this.f19223a = (WebView) inflate.findViewById(C5458g.web_view);
        this.f19223a.setVerticalScrollbarOverlay(true);
        this.f19223a.getSettings().setJavaScriptEnabled(true);
        this.f19223a.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str.startsWith("file://")) {
                    String lastPathSegment = Uri.parse(str).getLastPathSegment();
                    if (App.m25667n(lastPathSegment)) {
                        App.m25622a(lastPathSegment, (Fragment) AnnouncementFragment.this);
                    } else {
                        C6620n.m32034a((Context) AnnouncementFragment.this.mo1318s(), (String) null, String.format(AnnouncementFragment.this.mo1318s().getString(C5462k.common_page_not_found), new Object[]{lastPathSegment}));
                    }
                } else {
                    C6639t.m32083a((Activity) AnnouncementFragment.this.mo1318s(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
                return true;
            }
        });
        mo20294d(C5462k.announcements_title);
        if (this.f19226d != null) {
            m26935c();
        } else {
            m26933b();
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f19226d = bundle.getString("content");
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m26933b();
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putString("content", this.f19226d);
    }
}
