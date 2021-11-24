package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p019g.C0488a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.x */
final class C4971x {

    /* renamed from: a */
    private final SharedPreferences f17796a;

    /* renamed from: b */
    private final Context f17797b;

    /* renamed from: c */
    private final C4947ay f17798c;

    /* renamed from: d */
    private final Map<String, C4948az> f17799d;

    public C4971x(Context context) {
        this(context, new C4947ay());
    }

    private C4971x(Context context, C4947ay ayVar) {
        this.f17799d = new C0488a();
        this.f17797b = context;
        this.f17796a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f17798c = ayVar;
        File file = new File(C0452b.m2067b(this.f17797b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m24670c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    mo16251b();
                    FirebaseInstanceId.m24498a().mo16166i();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "FirebaseInstanceId";
                    String str2 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    static String m24668a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static String m24669b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: c */
    private final synchronized boolean m24670c() {
        return this.f17796a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized C4972y mo16246a(String str, String str2, String str3) {
        return C4972y.m24678a(this.f17796a.getString(m24669b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized String mo16247a() {
        return this.f17796a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void mo16248a(String str) {
        this.f17796a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: a */
    public final synchronized void mo16249a(String str, String str2, String str3, String str4, String str5) {
        String a = C4972y.m24680a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f17796a.edit();
            edit.putString(m24669b(str, str2, str3), a);
            edit.commit();
        }
    }

    /* renamed from: b */
    public final synchronized C4948az mo16250b(String str) {
        C4948az azVar;
        C4948az azVar2 = (C4948az) this.f17799d.get(str);
        if (azVar2 != null) {
            return azVar2;
        }
        try {
            azVar = this.f17798c.mo16211a(this.f17797b, str);
        } catch (zzaa unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.m24498a().mo16166i();
            azVar = this.f17798c.mo16212b(this.f17797b, str);
        }
        this.f17799d.put(str, azVar);
        return azVar;
    }

    /* renamed from: b */
    public final synchronized void mo16251b() {
        this.f17799d.clear();
        C4947ay.m24589a(this.f17797b);
        this.f17796a.edit().clear().commit();
    }

    /* renamed from: c */
    public final synchronized void mo16252c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f17796a.edit();
        for (String str2 : this.f17796a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
