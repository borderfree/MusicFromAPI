package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

@C3464ci
public final class aqi {

    /* renamed from: a */
    private final Collection<aqc<?>> f12598a = new ArrayList();

    /* renamed from: b */
    private final Collection<aqc<String>> f12599b = new ArrayList();

    /* renamed from: c */
    private final Collection<aqc<String>> f12600c = new ArrayList();

    /* renamed from: a */
    public final List<String> mo12291a() {
        ArrayList arrayList = new ArrayList();
        for (aqc a : this.f12599b) {
            String str = (String) ane.m16650f().mo12297a(a);
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo12292a(Editor editor, int i, JSONObject jSONObject) {
        for (aqc aqc : this.f12598a) {
            if (aqc.mo12290c() == 1) {
                aqc.mo12288a(editor, aqc.mo12286a(jSONObject));
            }
        }
    }

    /* renamed from: a */
    public final void mo12293a(aqc aqc) {
        this.f12598a.add(aqc);
    }

    /* renamed from: b */
    public final List<String> mo12294b() {
        List<String> a = mo12291a();
        for (aqc a2 : this.f12600c) {
            String str = (String) ane.m16650f().mo12297a(a2);
            if (str != null) {
                a.add(str);
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo12295b(aqc<String> aqc) {
        this.f12599b.add(aqc);
    }

    /* renamed from: c */
    public final void mo12296c(aqc<String> aqc) {
        this.f12600c.add(aqc);
    }
}
