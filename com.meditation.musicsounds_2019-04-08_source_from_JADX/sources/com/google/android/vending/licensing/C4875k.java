package com.google.android.vending.licensing;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

/* renamed from: com.google.android.vending.licensing.k */
public class C4875k {

    /* renamed from: a */
    private final SharedPreferences f17553a;

    /* renamed from: b */
    private final C4873i f17554b;

    /* renamed from: c */
    private Editor f17555c = null;

    public C4875k(SharedPreferences sharedPreferences, C4873i iVar) {
        this.f17553a = sharedPreferences;
        this.f17554b = iVar;
    }

    /* renamed from: a */
    public void mo16077a() {
        if (this.f17555c != null) {
            this.f17555c.commit();
            this.f17555c = null;
        }
    }

    /* renamed from: a */
    public void mo16078a(String str, String str2) {
        if (this.f17555c == null) {
            this.f17555c = this.f17553a.edit();
        }
        this.f17555c.putString(str, this.f17554b.mo16050a(str2, str));
    }

    /* renamed from: b */
    public String mo16079b(String str, String str2) {
        String string = this.f17553a.getString(str, null);
        if (string == null) {
            return str2;
        }
        try {
            return this.f17554b.mo16051b(string, str);
        } catch (ValidationException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Validation error while reading preference: ");
            sb.append(str);
            Log.w("PreferenceObfuscator", sb.toString());
            return str2;
        }
    }
}
