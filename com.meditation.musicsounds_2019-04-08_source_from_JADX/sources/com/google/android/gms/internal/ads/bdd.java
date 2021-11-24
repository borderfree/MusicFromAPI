package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C2850R;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C3464ci
public final class bdd extends C3726m {

    /* renamed from: a */
    private final Map<String, String> f13590a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f13591b;

    /* renamed from: c */
    private String f13592c = m18189d("description");

    /* renamed from: d */
    private long f13593d = m18190e("start_ticks");

    /* renamed from: e */
    private long f13594e = m18190e("end_ticks");

    /* renamed from: f */
    private String f13595f = m18189d("summary");

    /* renamed from: g */
    private String f13596g = m18189d("location");

    public bdd(C3832py pyVar, Map<String, String> map) {
        super(pyVar, "createCalendarEvent");
        this.f13590a = map;
        this.f13591b = pyVar.mo13411d();
    }

    /* renamed from: d */
    private final String m18189d(String str) {
        return TextUtils.isEmpty((CharSequence) this.f13590a.get(str)) ? "" : (String) this.f13590a.get(str);
    }

    /* renamed from: e */
    private final long m18190e(String str) {
        String str2 = (String) this.f13590a.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo12806a() {
        if (this.f13591b == null) {
            mo13247a("Activity context is not available.");
            return;
        }
        zzbv.zzek();
        if (!C3653jh.m18905f(this.f13591b).mo12279d()) {
            mo13247a("This feature is not available on the device.");
            return;
        }
        zzbv.zzek();
        Builder e = C3653jh.m18901e(this.f13591b);
        Resources h = zzbv.zzeo().mo13056h();
        e.setTitle(h != null ? h.getString(C2850R.string.f9928s5) : "Create calendar event");
        e.setMessage(h != null ? h.getString(C2850R.string.f9929s6) : "Allow Ad to create a calendar event?");
        e.setPositiveButton(h != null ? h.getString(C2850R.string.f9926s3) : "Accept", new bde(this));
        e.setNegativeButton(h != null ? h.getString(C2850R.string.f9927s4) : "Decline", new C3428b(this));
        e.create().show();
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(14)
    /* renamed from: b */
    public final Intent mo12807b() {
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", this.f13592c);
        data.putExtra("eventLocation", this.f13596g);
        data.putExtra("description", this.f13595f);
        if (this.f13593d > -1) {
            data.putExtra("beginTime", this.f13593d);
        }
        if (this.f13594e > -1) {
            data.putExtra("endTime", this.f13594e);
        }
        data.setFlags(268435456);
        return data;
    }
}
