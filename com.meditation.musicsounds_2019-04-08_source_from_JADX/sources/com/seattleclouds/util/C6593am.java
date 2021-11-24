package com.seattleclouds.util;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C6348n;
import com.seattleclouds.p160e.C5338d;

/* renamed from: com.seattleclouds.util.am */
public class C6593am {
    /* renamed from: a */
    public static void m31914a(View view, Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("backgroundColor")) {
                view.setBackgroundColor(Integer.valueOf(bundle.getInt("backgroundColor")).intValue());
            }
            String string = bundle.getString("backgroundImage");
            if (string != null && !string.trim().equals("")) {
                Drawable j = App.m25658j(string);
                if (j != null) {
                    view.setBackgroundDrawable(j);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m31915a(TextView textView, Bundle bundle) {
        if (bundle != null && bundle.containsKey("textColor")) {
            Integer valueOf = Integer.valueOf(bundle.getInt("textColor"));
            textView.setTextColor(valueOf.intValue());
            if (textView instanceof EditText) {
                ((EditText) textView).setHintTextColor(Integer.valueOf(Color.argb(127, Color.red(valueOf.intValue()), Color.green(valueOf.intValue()), Color.blue(valueOf.intValue()))).intValue());
            }
        }
    }

    /* renamed from: a */
    public static void m31916a(C6348n nVar) {
        if (nVar != null) {
            C5338d o = nVar.mo19778o();
            if (o != null) {
                String b = o.mo17534b();
                String str = null;
                char c = 65535;
                int hashCode = b.hashCode();
                if (hashCode != -1799008234) {
                    if (hashCode != -32907706) {
                        if (hashCode == -30303970 && b.equals("Theme.Base.Light")) {
                            c = 1;
                        }
                    } else if (b.equals("Theme.Base.Light.DarkBars")) {
                        c = 2;
                    }
                } else if (b.equals("Theme.Base")) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                        str = "Theme.Base.NoActionBar";
                        break;
                    case 1:
                        str = "Theme.Base.Light.NoActionBar";
                        break;
                    case 2:
                        str = "Theme.Base.Light.DarkBars.NoActionBar";
                        break;
                }
                if (str != null) {
                    C5338d dVar = new C5338d("Theme.App");
                    dVar.mo17535b(str);
                    dVar.mo17533a(o.mo17537c());
                    dVar.mo17532a(o.mo17539d());
                    nVar.mo19774a(dVar);
                }
            }
        }
    }
}
