package com.seattleclouds.location.geofencing;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p009v4.app.C0355af;
import android.support.p009v4.app.C0419y.C0424d;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.C4515b;
import com.google.android.gms.location.C4519e;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.location.geofencing.C5437a.C5448b;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6645y;
import java.util.List;
import java.util.Map;

public class ReceiveTransitionBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final CharSequence f19398a = ",";

    /* renamed from: b */
    static final String f19399b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25653g());
        sb.append(".location.action.PROCESS_UPDATES");
        f19399b = sb.toString();
    }

    /* renamed from: a */
    private String m27173a(int i) {
        Context e;
        int i2;
        if (i != 4) {
            switch (i) {
                case 1:
                    e = App.m25647e();
                    i2 = C5462k.geofence_transition_entered;
                    break;
                case 2:
                    e = App.m25647e();
                    i2 = C5462k.geofence_transition_exited;
                    break;
                default:
                    e = App.m25647e();
                    i2 = C5462k.geofence_transition_unknown;
                    break;
            }
        } else {
            e = App.m25647e();
            i2 = C5462k.geofence_transition_dwell;
        }
        return e.getString(i2);
    }

    /* renamed from: a */
    private void m27174a(C4519e eVar, int i) {
        List d = eVar.mo14983d();
        String[] strArr = new String[d.size()];
        for (int i2 = 0; i2 < d.size(); i2++) {
            strArr[i2] = ((C4515b) d.get(i2)).mo14087a();
        }
        String join = TextUtils.join(f19398a, strArr);
        String a = m27173a(i);
        Log.d(C5437a.f19402a, App.m25647e().getString(C5462k.geofence_transition_notification_title, new Object[]{a, join}));
        m27177a(strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27176a(C5450c cVar) {
        if (cVar.mo17764h().equals("message")) {
            m27178b(cVar);
            return;
        }
        String str = C5437a.f19402a;
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported geofence notification action: ");
        sb.append(cVar);
        Log.w(str, sb.toString());
    }

    /* renamed from: a */
    private void m27177a(final String[] strArr) {
        C5437a.m27186a((C5448b) new C5448b() {
            /* renamed from: a */
            public void mo17741a(int i, Map<String, C5450c> map) {
                String[] strArr;
                if (i == 0) {
                    for (String str : strArr) {
                        C5450c cVar = (C5450c) map.get(str);
                        if (cVar == null) {
                            String str2 = C5437a.f19402a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Geofence not found: ");
                            sb.append(str);
                            Log.w(str2, sb.toString());
                        } else {
                            ReceiveTransitionBroadcastReceiver.this.m27176a(cVar);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m27178b(C5450c cVar) {
        String string = App.m25651f().getString(C5462k.app_name);
        String b = cVar.mo17757b();
        if (b == null) {
            b = "";
        }
        if (b.length() > 100) {
            b = b.substring(0, 100);
        }
        C0355af a = C0355af.m1481a(App.m25647e());
        a.mo1398a(Intent.makeRestartActivityTask(new ComponentName(App.m25647e(), AppStarterActivity.class)));
        Bundle bundle = new Bundle();
        bundle.putString("ARG_TITLE", cVar.mo17757b());
        bundle.putString("ARG_MESSAGE", cVar.mo17766j());
        Intent a2 = App.m25603a(new FragmentInfo(C5449b.class.getName(), bundle), App.m25647e());
        a2.putExtra("ARG_STARTED_FROM_NOTIFICATION", true);
        a2.setData(new Builder().scheme("data").appendQueryParameter("id", cVar.mo17755a()).build());
        a.mo1398a(a2);
        C6645y.m32099a(new C0424d(App.m25647e(), "geo_fence").mo1713a(C5457f.ic_notif_geofence).mo1723a((CharSequence) string).mo1729b((CharSequence) b).mo1730b(true).mo1726b(-1).mo1717a(a.mo1394a(0, 134217728)).mo1712a(), "geo_fence");
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            if (f19399b.equals(intent.getAction())) {
                C4519e a = C4519e.m22605a(intent);
                if (!a.mo14980a()) {
                    int c = a.mo14982c();
                    C6595ao.m31929a(App.m25647e(), m27173a(c), Boolean.valueOf(false));
                    if (c == 1) {
                        m27174a(a, c);
                        return;
                    }
                    Log.e(C5437a.f19402a, App.m25647e().getString(C5462k.geofence_transition_invalid_type, new Object[]{Integer.valueOf(c), a}));
                } else if (a.mo14981b() == 1000) {
                    Context e = App.m25647e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onHandleIntent ERROR ");
                    sb.append(a.mo14981b());
                    C6595ao.m31929a(e, sb.toString(), Boolean.valueOf(false));
                    C5437a.m27185a(App.m25647e(), Boolean.valueOf(false));
                }
            }
        }
    }
}
