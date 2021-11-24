package com.seattleclouds;

import android.os.Bundle;
import com.seattleclouds.p160e.C5333a;
import com.seattleclouds.p160e.C5337c;
import com.seattleclouds.p160e.C5338d;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.seattleclouds.ac */
public class C5232ac extends C6348n {

    /* renamed from: n */
    private static final String f18765n = "ac";

    /* renamed from: o */
    private static Map<String, C5333a> f18766o;

    /* renamed from: p */
    private static C5338d f18767p;

    /* renamed from: m */
    public static C5338d m26100m() {
        return f18767p;
    }

    /* renamed from: n */
    public void mo17205n() {
        if (f18767p == null) {
            try {
                f18766o = new C5337c().mo17543a(App.f18507i.open("Main/appStyles.xml"));
                C5333a aVar = (C5333a) f18766o.get("Theme.App");
                if (aVar instanceof C5338d) {
                    f18767p = (C5338d) aVar;
                }
            } catch (IOException unused) {
            }
            if (f18767p == null) {
                f18767p = new C5338d("Theme.App");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo17205n();
        mo19774a(f18767p);
        super.onCreate(bundle);
    }
}
