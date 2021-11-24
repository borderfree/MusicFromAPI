package com.seattleclouds.appauth;

import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.seattleclouds.C6557s;
import com.seattleclouds.appauth.AppAuthRegisterActivity.C5273a;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6620n;

/* renamed from: com.seattleclouds.appauth.c */
public abstract class C5288c extends C6557s implements C5273a {

    /* renamed from: a */
    protected ViewGroup f18935a;

    /* renamed from: b */
    protected ProgressBar f18936b;

    /* renamed from: c */
    protected ViewGroup f18937c;

    /* renamed from: d */
    private EditText[] f18938d;

    /* renamed from: e */
    private int f18939e = -1;

    /* renamed from: aA */
    private void m26439aA() {
        EditText[] editTextArr;
        if (this.f18938d != null) {
            int i = this.f18939e;
            if (i != -1) {
                for (EditText editText : this.f18938d) {
                    if (editText.getId() == i) {
                        editText.requestFocus();
                        return;
                    }
                }
            }
            if (m26440at() == -1) {
                this.f18938d[0].requestFocus();
            }
        }
    }

    /* renamed from: at */
    private int m26440at() {
        EditText[] editTextArr;
        if (this.f18938d == null) {
            return -1;
        }
        for (EditText editText : this.f18938d) {
            if (editText.isFocused()) {
                return editText.getId();
            }
        }
        return -1;
    }

    /* renamed from: az */
    private int m26441az() {
        this.f18939e = m26440at();
        return this.f18939e;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18935a = (ViewGroup) layoutInflater.inflate(mo1450b(), viewGroup, false);
        if (this.f18935a != null) {
            mo17366a(this.f18935a, bundle);
            m26439aA();
        }
        return this.f18935a;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (bundle != null) {
            this.f18939e = bundle.getInt("saveFocusedEditId", -1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17366a(ViewGroup viewGroup, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17367a(EditText editText, char[] cArr) {
        if (editText != null) {
            Editable text = editText.getText();
            text.clear();
            if (cArr != null) {
                for (char append : cArr) {
                    text.append(append);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17346a(boolean z, boolean z2) {
        if (z && !z2) {
            m26441az();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17368a(EditText... editTextArr) {
        this.f18938d = editTextArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo17369a(EditText editText) {
        Editable text = editText.getText();
        if (text.length() == 0) {
            return true;
        }
        if (editText.getInputType() == 129) {
            return false;
        }
        return text.toString().trim().isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo17370a(EditText editText, EditText editText2) {
        Editable text = editText.getText();
        Editable text2 = editText2.getText();
        int length = text.length();
        if (length != text2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: as */
    public void mo17371as() {
        C0367h s = mo1318s();
        if (s != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) s.getSystemService("input_method");
            View currentFocus = s.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo1450b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17372b(EditText editText) {
        if (editText != null) {
            Editable text = editText.getText();
            int length = text.length();
            if (length > 0) {
                text.replace(0, length, C6592al.m31903a('*', length));
                editText.setText("");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public AppAuthRegisterActivity mo1453c() {
        return (AppAuthRegisterActivity) mo1318s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo17373c(String str) {
        if (C6592al.m31909b(str)) {
            return false;
        }
        String trim = str.trim();
        int indexOf = trim.indexOf(64);
        if (indexOf < 0) {
            return false;
        }
        String substring = trim.substring(0, indexOf);
        String substring2 = trim.substring(indexOf + 1);
        return !substring.isEmpty() && !substring2.isEmpty() && !substring2.contains("@");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17374d() {
        mo1453c().mo16887q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17375d(String str) {
        String str2;
        if (!C6592al.m31910c(str)) {
            int indexOf = str.indexOf(10);
            if (indexOf < 0) {
                str2 = null;
            } else {
                String substring = str.substring(0, indexOf);
                str2 = str.substring(indexOf + 1);
                str = substring;
            }
            C6620n.m32034a(mo1316q(), str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo17376e() {
        mo1453c().mo17342r();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putInt("saveFocusedEditId", m26441az());
    }

    /* renamed from: i */
    public void mo1296i() {
        m26441az();
        super.mo1296i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo17377m(boolean z) {
        if (this.f18936b != null) {
            if (z) {
                mo17371as();
                this.f18936b.setVisibility(0);
                this.f18937c.setVisibility(8);
            } else {
                this.f18936b.setVisibility(8);
                this.f18937c.setVisibility(0);
            }
        }
    }
}
