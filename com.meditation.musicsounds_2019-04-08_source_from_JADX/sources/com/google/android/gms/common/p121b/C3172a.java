package com.google.android.gms.common.p121b;

import android.util.Log;
import com.google.android.gms.common.internal.C3250k;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.b.a */
public class C3172a {

    /* renamed from: a */
    private final String f10947a;

    /* renamed from: b */
    private final String f10948b;

    /* renamed from: c */
    private final C3250k f10949c;

    /* renamed from: d */
    private final int f10950d;

    private C3172a(String str, String str2) {
        this.f10948b = str2;
        this.f10947a = str;
        this.f10949c = new C3250k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f10947a, i)) {
            i++;
        }
        this.f10950d = i;
    }

    public C3172a(String str, String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append(']');
            sb.append(' ');
            str2 = sb.toString();
        }
        this(str, str2);
    }

    /* renamed from: e */
    private final String m14617e(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f10948b.concat(str);
    }

    /* renamed from: a */
    public void mo11097a(String str, Object... objArr) {
        if (mo11098a(3)) {
            Log.d(this.f10947a, m14617e(str, objArr));
        }
    }

    /* renamed from: a */
    public boolean mo11098a(int i) {
        return this.f10950d <= i;
    }

    /* renamed from: b */
    public void mo11099b(String str, Object... objArr) {
        Log.i(this.f10947a, m14617e(str, objArr));
    }

    /* renamed from: c */
    public void mo11100c(String str, Object... objArr) {
        Log.w(this.f10947a, m14617e(str, objArr));
    }

    /* renamed from: d */
    public void mo11101d(String str, Object... objArr) {
        Log.e(this.f10947a, m14617e(str, objArr));
    }
}
