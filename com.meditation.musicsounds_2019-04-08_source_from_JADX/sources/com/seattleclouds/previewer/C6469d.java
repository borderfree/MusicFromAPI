package com.seattleclouds.previewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.bitmapfun.AsyncTask;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6595ao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.p198io.C6730b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.previewer.d */
public class C6469d extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public EditText f22980a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Spinner f22981b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C6540l> f22982c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f22983d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f22984e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public LinearLayout f22985f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f22986g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Boolean f22987h = Boolean.valueOf(false);

    /* renamed from: com.seattleclouds.previewer.d$a */
    private class C6474a extends AsyncTask<Void, Void, Void> {
        private C6474a() {
        }

        /* renamed from: a */
        private void m31348a(JSONArray jSONArray) {
            for (int i = 0; i < jSONArray.length(); i++) {
                C6469d.this.f22982c.add(new C6540l(jSONArray.getJSONObject(i)));
            }
        }

        /* renamed from: d */
        private void m31349d() {
            if (C6469d.this.f22982c.size() <= 0) {
                try {
                    m31348a(new JSONArray(C6730b.m32452a(C6452c.m31266aA(), "UTF-8")));
                } catch (IOException | JSONException unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void mo8517a(Void... voidArr) {
            m31349d();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8519a(Void voidR) {
            super.mo8519a(voidR);
            if (C6469d.this.f22980a != null) {
                C6469d.this.f22980a.setText(C6469d.this.m31332d());
            }
        }
    }

    /* renamed from: com.seattleclouds.previewer.d$b */
    private class C6475b extends C5270d<Void, String, String> {
        public C6475b(Fragment fragment) {
            super(fragment);
        }

        /* renamed from: a */
        private String m31354a(SCApiException sCApiException) {
            String message = sCApiException.getMessage();
            try {
                JSONObject details = sCApiException.getDetails();
                int i = details.getInt("code");
                String string = details.getString("message");
                String errorReason = sCApiException.getErrorReason();
                return i == 400 ? errorReason.equalsIgnoreCase("missingAppId") ? C6469d.this.mo1219a(C5462k.previewer_templates_app_id_empty_error_message) : errorReason.equalsIgnoreCase("invalidAppId") ? C6469d.this.mo1219a(C5462k.previewer_templates_invalid_app_id_error_message) : errorReason.equalsIgnoreCase("appIdAlreadyTaken") ? C6469d.this.mo1219a(C5462k.previewer_templates_app_id_already_taken_error_message) : errorReason.equalsIgnoreCase("missingTemplateId") ? C6469d.this.mo1219a(C5462k.previewer_templates_missing_template_id_error_message) : errorReason.equalsIgnoreCase("invalidTemplateId") ? C6469d.this.mo1219a(C5462k.previewer_templates_invalid_templated_id_error_message) : errorReason.equalsIgnoreCase("missingPlatform") ? C6469d.this.mo1219a(C5462k.previewer_templates_missing_platform_error_message) : errorReason.equalsIgnoreCase("invalidPlatform") ? C6469d.this.mo1219a(C5462k.previewer_templates_invalid_platform_error_message) : message : string;
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON parsing exception: ");
                sb.append(e.toString());
                Log.e("CreateAppFragment", sb.toString());
                return C6469d.this.mo1219a(C5462k.common_internal_server_error);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            try {
                C5268b.m26272a().mo17301a(App.f18523y, C6469d.this.f22980a.getText().toString(), C6469d.this.f22983d, C6540l.m31606a(C6469d.this.f22981b.getSelectedItem().toString()));
                return "ok";
            } catch (SCApiException e) {
                C6469d.this.f22986g = m31354a(e);
                StringBuilder sb = new StringBuilder();
                sb.append("Api exception");
                sb.append(e.getMessage());
                Log.d("CreateAppFragment", sb.toString(), e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C6469d.this.f22987h = Boolean.valueOf(false);
            View I = C6469d.this.mo1199I();
            if (I != null) {
                LinearLayout linearLayout = (LinearLayout) I.findViewById(C5458g.previewer_create_app_loading_linear_layout);
                if (linearLayout != null) {
                    if (C6469d.this.f22986g == null) {
                        C6469d.this.f22986g = C6469d.this.mo1219a(C5462k.previewer_templates_successufully_created_message);
                    }
                    C6469d.this.m31326b(linearLayout);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            C6469d.this.m31325b();
            C6469d.this.f22986g = null;
            C6469d.this.f22987h = Boolean.valueOf(true);
            super.onPreExecute();
        }
    }

    /* renamed from: a */
    public static boolean m31323a(char c) {
        return c >= ' ' && c < 127;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31325b() {
        this.f22985f.setAlpha(0.0f);
        this.f22985f.setVisibility(0);
        Button button = (Button) this.f22985f.findViewById(C5458g.previewer_create_app_ok_button);
        if (button != null) {
            button.setVisibility(8);
        }
        this.f22985f.animate().alpha(1.0f).setDuration(1).setListener(null);
        this.f22984e.animate().alpha(0.0f).setDuration(1).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C6469d.this.f22984e.setVisibility(8);
                C6469d.this.m31337e();
                if (C6469d.this.f22986g != null) {
                    C6469d.this.m31326b(C6469d.this.f22985f);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31326b(LinearLayout linearLayout) {
        ProgressBar progressBar = (ProgressBar) linearLayout.findViewById(C5458g.previewer_create_app_progress);
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        Button button = (Button) linearLayout.findViewById(C5458g.previewer_create_app_ok_button);
        if (button != null) {
            button.setVisibility(0);
        }
        TextView textView = (TextView) linearLayout.findViewById(C5458g.previewer_create_app_loading_text_view);
        if (textView != null) {
            textView.setText(this.f22986g);
        }
    }

    /* renamed from: c */
    public static C6469d m31328c(String str) {
        C6469d dVar = new C6469d();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_TEMPLATE_ID", str);
        dVar.mo1289g(bundle);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m31330c() {
        this.f22984e.setAlpha(0.0f);
        this.f22984e.setVisibility(0);
        this.f22984e.animate().alpha(1.0f).setDuration(1).setListener(null);
        this.f22985f.animate().alpha(0.0f).setDuration(1).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C6469d.this.f22985f.setVisibility(8);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m31332d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22983d);
        sb.append(1);
        String sb2 = sb.toString();
        int i = 1;
        while (m31339f(sb2)) {
            i++;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f22983d);
            sb3.append(i);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    /* renamed from: d */
    public static boolean m31334d(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!m31323a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m31335e(String str) {
        int i;
        if (C6592al.m31909b(str)) {
            i = C5462k.previewer_templates_app_id_empty_error_message;
        } else if (str.length() > 50) {
            i = C5462k.previewer_templates_invalid_app_id_long_error_message;
        } else if (!Pattern.compile("^\\p{Alnum}+$").matcher(str).find() || !m31334d(str)) {
            i = C5462k.previewer_templates_invalid_app_id_error_message;
        } else if (!m31339f(str)) {
            return null;
        } else {
            i = C5462k.previewer_templates_app_id_already_taken_error_message;
        }
        return mo1219a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m31337e() {
        ((TextView) this.f22985f.findViewById(C5458g.previewer_create_app_loading_text_view)).setText(C5462k.previewer_templates_app_loading_text);
        ProgressBar progressBar = (ProgressBar) this.f22985f.findViewById(C5458g.previewer_create_app_progress);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* renamed from: f */
    private boolean m31339f(String str) {
        if (!(this.f22982c == null || this.f22982c.size() == 0)) {
            for (C6540l a : this.f22982c) {
                if (a.mo20246a().equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m31341g(String str) {
        C6595ao.m31930a((Context) mo1318s(), str, true);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.fragment_previewer_create_app, viewGroup, false);
        this.f22980a = (EditText) inflate.findViewById(C5458g.previewer_application_id_edit_text);
        ((Button) inflate.findViewById(C5458g.previewer_create_application_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String a = C6469d.this.m31335e(C6469d.this.f22980a.getText().toString());
                if (a != null) {
                    C6469d.this.m31341g(a);
                } else {
                    new C6475b(C6469d.this).execute(new Void[0]);
                }
            }
        });
        this.f22981b = (Spinner) inflate.findViewById(C5458g.previewer_application_platform_spinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo1318s(), 17367048, new String[]{"Android", "Kindle", "iPhone", "iPad", "WebApp"});
        arrayAdapter.setDropDownViewResource(17367049);
        this.f22981b.setAdapter(arrayAdapter);
        this.f22984e = (LinearLayout) inflate.findViewById(C5458g.previewer_create_app_content_linear_layout);
        this.f22985f = (LinearLayout) inflate.findViewById(C5458g.previewer_create_app_loading_linear_layout);
        ((Button) this.f22985f.findViewById(C5458g.previewer_create_app_ok_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C6469d.this.f22986g.equalsIgnoreCase(C6469d.this.mo1219a(C5462k.previewer_templates_successufully_created_message))) {
                    C0367h s = C6469d.this.mo1318s();
                    s.setResult(-1);
                    s.finish();
                    return;
                }
                C6469d.this.f22986g = null;
                C6469d.this.m31330c();
            }
        });
        if (this.f22987h.booleanValue() || this.f22986g != null) {
            m31325b();
        }
        mo20287a((CharSequence) this.f22983d);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (mo1307m() != null) {
            this.f22983d = mo1307m().getString("ARG_TEMPLATE_ID");
        }
        mo1280d(true);
        new C6474a().mo8524c((Params[]) new Void[0]);
    }
}
