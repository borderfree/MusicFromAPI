package com.seattleclouds.modules.p184q;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6602at;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6640u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.q.a */
public class C6192a extends C6557s {

    /* renamed from: a */
    private String f21976a = "QuizFragment";

    /* renamed from: b */
    private WebView f21977b;

    /* renamed from: c */
    private ArrayList<String> f21978c;

    /* renamed from: d */
    private String f21979d;

    /* renamed from: e */
    private String f21980e;

    /* renamed from: f */
    private boolean f21981f = true;

    /* renamed from: g */
    private int f21982g;

    /* renamed from: h */
    private View f21983h = null;

    /* renamed from: com.seattleclouds.modules.q.a$a */
    protected class C6193a extends WebViewClient {

        /* renamed from: b */
        private String f21985b;

        /* renamed from: c */
        private String f21986c;

        protected C6193a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19448a(String str) {
            Uri parse = Uri.parse(str);
            String str2 = parse.getQuery() != null ? parse.getQuery().toString() : "";
            int indexOf = str2.indexOf("=", 0);
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(indexOf + 1, str2.length());
                if (substring != null && !substring.equalsIgnoreCase("") && substring2 != null && !substring2.equalsIgnoreCase("")) {
                    C6640u.m32089a(substring, substring2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Save jkey/jvalue pair: ");
                    sb.append(str);
                    Log.v("QuizActivity.MyWebViewClient", sb.toString());
                }
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onReceivedError: failingUrl = ");
            sb.append(str2);
            sb.append(", error code = ");
            sb.append(i);
            sb.append(" [ ");
            sb.append(str);
            sb.append(" ]");
            Log.v("QuizActivity.MyWebViewClient", sb.toString());
            super.onReceivedError(webView, i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(lastPathSegment);
            this.f21986c = null;
            this.f21985b = str;
            if (aaVar == null) {
                return false;
            }
            mo19448a(str);
            if (App.f18501c.mo16900B() && (aaVar.mo17118b().equalsIgnoreCase("quizquestion") || aaVar.mo17118b().equalsIgnoreCase("quizresult"))) {
                String c = C6192a.this.mo1453c();
                if (c == null || (c != null && c.equalsIgnoreCase(""))) {
                    c = "Results.html";
                }
                lastPathSegment = c;
                this.f21985b = App.m25655h(lastPathSegment);
            }
            try {
                String b = C6613i.m31991b(App.m25649e(lastPathSegment));
                if (b != null) {
                    this.f21986c = C6640u.m32088a(b);
                }
            } catch (IOException unused) {
                Log.e("QuizActivity.MyWebViewClient", "Error getting rawHtml");
            }
            if (this.f21986c == null) {
                webView.loadUrl(this.f21985b);
            } else {
                webView.loadDataWithBaseURL(this.f21985b, this.f21986c, null, "UTF-8", this.f21985b);
            }
            return true;
        }
    }

    /* renamed from: d */
    private void m30176d() {
        this.f21977b = (WebView) this.f21983h.findViewById(C5458g.quiz_web_view);
        C6602at.m31950a(this.f21977b);
        this.f21977b.setWebViewClient(new C6193a());
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21983h = layoutInflater.inflate(C5460i.quizweb, viewGroup, false);
        mo1450b();
        return this.f21983h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<String> mo19446a(String str, ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (str.equalsIgnoreCase("all")) {
            return new ArrayList<>(arrayList);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(str2);
            if (aaVar != null && aaVar.mo17026Q().equals(str)) {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<String> mo19447a(ArrayList<String> arrayList, int i, String str) {
        if (!App.f18501c.mo16900B()) {
            return new ArrayList<>(arrayList);
        }
        if (str == null || (str != null && str.equalsIgnoreCase(""))) {
            str = "all";
        }
        ArrayList a = mo19446a(str, arrayList);
        if (a.size() == 0) {
            return null;
        }
        boolean z = true;
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (i > a.size()) {
            i = a.size();
        }
        if (!App.f18501c.mo16904F().containsKey(str)) {
            App.f18501c.mo16904F().put(str, new HashSet());
        }
        if (a.size() - ((HashSet) App.f18501c.mo16904F().get(str)).size() < i) {
            ((HashSet) App.f18501c.mo16904F().get(str)).clear();
        }
        while (arrayList2.size() < i && z) {
            int size = a.size();
            double random = Math.random();
            double d = (double) size;
            Double.isNaN(d);
            int i2 = (int) (random * d);
            if (!((HashSet) App.f18501c.mo16904F().get(str)).contains(new Integer(i2))) {
                ((HashSet) App.f18501c.mo16904F().get(str)).add(new Integer(i2));
                arrayList2.add(a.get(i2));
                if (i == arrayList2.size()) {
                    z = false;
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f21979d = m.getString("ARG_URL");
        }
        if (this.f21979d == null && this.f21980e == null) {
            App.m25625a((Fragment) this);
        }
        Uri parse = Uri.parse(this.f21979d);
        String str = "";
        String str2 = parse.getQuery() != null ? parse.getQuery().toString() : "";
        int i = 0;
        int indexOf = str2.indexOf("=", 0);
        if (indexOf != -1) {
            String substring = str2.substring(0, indexOf);
            String substring2 = str2.substring(indexOf + 1, str2.length());
            if (substring != null && substring.equalsIgnoreCase("quizcategory") && substring2 != null && !substring2.equalsIgnoreCase("")) {
                str = substring2;
            }
        }
        String lastPathSegment = parse.getLastPathSegment();
        if (parse.getQuery() != null) {
            lastPathSegment = lastPathSegment.replace(parse.getQuery(), "");
        }
        this.f21978c = App.f18501c.mo16903E();
        C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(lastPathSegment);
        if (aaVar != null && aaVar.mo17118b().equals("quizquestion")) {
            this.f21978c = mo19447a(App.f18501c.mo16903E(), App.f18501c.mo16901C(), str);
            int size = this.f21978c.size();
            C6640u.m32089a("numberOfQuestions", new Integer(size).toString());
            C6640u.m32089a("passedQuestions", new Integer(1).toString());
            C6640u.m32089a("correctAnswers", new Integer(0).toString());
            C6640u.m32089a("score", new Integer(0).toString());
            double d = (double) size;
            Double.isNaN(d);
            C6640u.m32089a("qscore", new Double(100.0d / d).toString());
            this.f21982g = 0;
            while (true) {
                if (i >= this.f21978c.size()) {
                    break;
                } else if (((String) this.f21978c.get(i)).equalsIgnoreCase(lastPathSegment)) {
                    this.f21982g = i;
                    break;
                } else {
                    i++;
                }
            }
            if (size > 0) {
                this.f21979d = App.m25655h((String) this.f21978c.get(this.f21982g));
                lastPathSegment = this.f21979d;
                this.f21978c.remove(this.f21982g);
            }
            try {
                String b = C6613i.m31991b(App.m25649e(Uri.parse(lastPathSegment).getLastPathSegment()));
                if (b != null) {
                    this.f21980e = C6640u.m32088a(b);
                }
            } catch (IOException unused) {
                Log.e(this.f21976a, "Error to opening file stream");
            }
        }
        m30176d();
        if (this.f21980e == null) {
            this.f21977b.loadUrl(this.f21979d);
        } else {
            this.f21977b.loadDataWithBaseURL(this.f21979d, this.f21980e, null, "UTF-8", this.f21979d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo1453c() {
        ArrayList<String> arrayList;
        String str = "";
        if (this.f21978c.size() <= 0) {
            return str;
        }
        int size = this.f21978c.size();
        double random = Math.random();
        double d = (double) size;
        Double.isNaN(d);
        int i = (int) (random * d);
        int i2 = size - 1;
        String str2 = (String) this.f21978c.get(i2);
        String copyValueOf = String.copyValueOf(((String) this.f21978c.get(i)).toCharArray());
        if (i != i2 || size <= 1 || copyValueOf.equalsIgnoreCase(str2)) {
            arrayList = this.f21978c;
        } else {
            arrayList = this.f21978c;
            i = 0;
        }
        Collections.swap(arrayList, i, i2);
        this.f21978c.remove(i2);
        return copyValueOf;
    }
}
