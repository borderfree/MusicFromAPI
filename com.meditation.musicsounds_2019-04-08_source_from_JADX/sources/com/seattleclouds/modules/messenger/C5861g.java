package com.seattleclouds.modules.messenger;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p009v4.app.C0355af;
import android.support.p009v4.app.C0419y.C0424d;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.api.C5267a;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.util.C6645y;

/* renamed from: com.seattleclouds.modules.messenger.g */
public class C5861g {
    /* renamed from: a */
    public static void m28802a(Context context, Bundle bundle) {
        String string = bundle.getString("user.id");
        C5267a c = C5268b.m26272a().mo17313c();
        if (c == null || !c.mo17289a().equals(string)) {
            m28803b(context, bundle);
        }
    }

    /* renamed from: b */
    private static void m28803b(Context context, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(C5462k.app_name));
        sb.append(context.getString(C5462k.messenger_notification_title_suffix));
        String sb2 = sb.toString();
        String string = bundle.getString("text");
        if (string.length() > 50) {
            string = string.substring(0, 50);
        }
        int a = C6645y.m32096a();
        String string2 = bundle.getString("conversationId");
        App.m25618a(context);
        C5230aa aaVar = null;
        if (App.f18501c.mo16910L() != null) {
            aaVar = (C5230aa) App.f18501c.mo16902D().get(App.f18501c.mo16910L());
        }
        C0355af a2 = C0355af.m1481a(context);
        a2.mo1398a(Intent.makeRestartActivityTask(new ComponentName(context, AppStarterActivity.class)));
        Bundle bundle2 = new Bundle();
        if (aaVar != null) {
            bundle2.putInt("ARG_MAX_MESSAGE_LENGTH", aaVar.mo17061aG());
            bundle2.putString("PAGE_ID", aaVar.mo17046a());
            bundle2.putBundle("PAGE_STYLE", aaVar.mo17110as());
        }
        a2.mo1398a(App.m25603a(new FragmentInfo(C5859f.class.getName(), bundle2), context));
        Bundle bundle3 = new Bundle();
        if (aaVar != null) {
            bundle3.putInt("ARG_MAX_MESSAGE_LENGTH", aaVar.mo17061aG());
            bundle3.putString("PAGE_ID", aaVar.mo17046a());
            bundle3.putBundle("PAGE_STYLE", aaVar.mo17110as());
        }
        bundle3.putString("ARG_CONVERSATION_ID", string2);
        Intent a3 = App.m25603a(new FragmentInfo(C5845b.class.getName(), bundle3), context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append("");
        a3.setData(new Builder().scheme("data").appendQueryParameter("id", sb3.toString()).build());
        a3.putExtra("ARG_STARTED_FROM_NOTIFICATION", true);
        a2.mo1398a(a3);
        C6645y.m32098a(a, new C0424d(context, "messenger").mo1713a(C5457f.ic_notif_message).mo1723a((CharSequence) sb2).mo1729b((CharSequence) string).mo1730b(true).mo1726b(-1).mo1717a(a2.mo1394a(0, 268435456)).mo1712a(), "messenger");
    }
}
