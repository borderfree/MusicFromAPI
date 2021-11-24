package com.seattleclouds.modules.esignature;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p009v4.app.C0355af;
import android.support.p009v4.app.C0419y.C0424d;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.appauth.C5279b;
import com.seattleclouds.modules.esignature.utility.C5613a;
import com.seattleclouds.util.C6645y;

/* renamed from: com.seattleclouds.modules.esignature.e */
public class C5603e {
    /* renamed from: a */
    public static void m27815a(Context context, Bundle bundle) {
        if (C5279b.m26372a() || C5279b.m26381b()) {
            m27816b(context, bundle);
        }
    }

    /* renamed from: b */
    private static void m27816b(Context context, Bundle bundle) {
        String string = bundle.getString("name");
        String string2 = context.getString(C5462k.app_name);
        if (string != null && string.length() > 50) {
            string = string.substring(0, 50);
        }
        int a = C6645y.m32096a();
        App.m25618a(context);
        C0355af a2 = C0355af.m1481a(context);
        a2.mo1398a(Intent.makeRestartActivityTask(new ComponentName(context, AppStarterActivity.class)));
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("transaction", C5613a.m27858a(bundle));
        Intent a3 = App.m25603a(new FragmentInfo(C5604f.class.getName(), bundle2), context);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("");
        a3.setData(new Builder().scheme("data").appendQueryParameter("id", sb.toString()).build());
        a3.putExtra("ARG_STARTED_FROM_NOTIFICATION", true);
        a2.mo1398a(a3);
        C6645y.m32098a(a, new C0424d(context, "other").mo1713a(C5457f.ic_notif_message).mo1723a((CharSequence) string2).mo1729b((CharSequence) string).mo1730b(true).mo1726b(-1).mo1717a(a2.mo1394a(0, 268435456)).mo1712a(), "other");
    }
}
