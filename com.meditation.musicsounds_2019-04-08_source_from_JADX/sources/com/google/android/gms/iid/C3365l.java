package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.android.gms.iid.l */
public final class C3365l {

    /* renamed from: a */
    private SharedPreferences f11296a;

    /* renamed from: b */
    private Context f11297b;

    /* renamed from: c */
    private final C3372s f11298c;

    /* renamed from: d */
    private final Map<String, C3373t> f11299d;

    public C3365l(Context context) {
        this(context, new C3372s());
    }

    private C3365l(Context context, C3372s sVar) {
        this.f11299d = new C0488a();
        this.f11297b = context;
        this.f11296a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f11298c = sVar;
        File file = new File(C0452b.m2067b(this.f11297b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo11391a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    C3355b.m15203a(this.f11297b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String str = "InstanceID/Store";
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    static String m15227a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m15228b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized String mo11388a(String str) {
        return this.f11296a.getString(str, null);
    }

    /* renamed from: a */
    public final synchronized String mo11389a(String str, String str2, String str3) {
        return this.f11296a.getString(m15228b(str, str2, str3), null);
    }

    /* renamed from: a */
    public final synchronized void mo11390a(String str, String str2, String str3, String str4, String str5) {
        String b = m15228b(str, str2, str3);
        Editor edit = this.f11296a.edit();
        edit.putString(b, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* renamed from: a */
    public final boolean mo11391a() {
        return this.f11296a.getAll().isEmpty();
    }

    /* renamed from: b */
    public final synchronized void mo11392b() {
        this.f11299d.clear();
        C3372s.m15246a(this.f11297b);
        this.f11296a.edit().clear().commit();
    }

    /* renamed from: b */
    public final synchronized void mo11393b(String str) {
        Editor edit = this.f11296a.edit();
        for (String str2 : this.f11296a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: c */
    public final synchronized C3373t mo11394c(String str) {
        C3373t tVar;
        C3373t tVar2 = (C3373t) this.f11299d.get(str);
        if (tVar2 != null) {
            return tVar2;
        }
        try {
            tVar = this.f11298c.mo11400a(this.f11297b, str);
        } catch (zzp unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            C3355b.m15203a(this.f11297b, this);
            tVar = this.f11298c.mo11401b(this.f11297b, str);
        }
        this.f11299d.put(str, tVar);
        return tVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo11395d(String str) {
        synchronized (this) {
            this.f11299d.remove(str);
        }
        C3372s.m15253c(this.f11297b, str);
        mo11393b(String.valueOf(str).concat("|"));
    }
}
