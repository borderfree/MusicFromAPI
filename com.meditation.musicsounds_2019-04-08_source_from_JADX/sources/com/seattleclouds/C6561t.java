package com.seattleclouds;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0751a.C0752a;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6348n.C6349a;
import com.seattleclouds.modules.loginregister.C5799d;
import com.seattleclouds.util.C6592al;

/* renamed from: com.seattleclouds.t */
public class C6561t {

    /* renamed from: a */
    private static C6561t f23225a;

    /* renamed from: a */
    public static C5388i m31727a(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Fragment x = fragment.mo1325x();
        if (x == null) {
            return null;
        }
        return x instanceof C5388i ? (C5388i) x : m31727a(x);
    }

    /* renamed from: a */
    public static C6561t m31728a() {
        if (f23225a == null) {
            f23225a = new C6561t();
        }
        return f23225a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.CharSequence m31729a(android.support.p009v4.app.Fragment r3, com.seattleclouds.C5230aa r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.seattleclouds.C6557s
            if (r0 == 0) goto L_0x001c
            r0 = r3
            com.seattleclouds.s r0 = (com.seattleclouds.C6557s) r0
            boolean r1 = r0.mo20289av()
            if (r1 == 0) goto L_0x001c
            com.seattleclouds.v r0 = r0.mo20288au()
            java.lang.String r0 = r0.mo20638c()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x001d
            return r0
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0024
            java.lang.String r3 = r4.mo17130d()
            return r3
        L_0x0024:
            boolean r4 = r3 instanceof com.seattleclouds.C6563u
            if (r4 == 0) goto L_0x0036
            r4 = r3
            com.seattleclouds.u r4 = (com.seattleclouds.C6563u) r4
            java.lang.CharSequence r0 = r4.mo20290aw()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0036
            return r0
        L_0x0036:
            com.seattleclouds.i r4 = m31727a(r3)
            if (r4 != 0) goto L_0x004c
            if (r3 == 0) goto L_0x004c
            android.support.v4.app.h r4 = r3.mo1318s()
            if (r4 == 0) goto L_0x004c
            android.support.v4.app.h r3 = r3.mo1318s()
            java.lang.CharSequence r0 = r3.getTitle()
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.C6561t.m31729a(android.support.v4.app.Fragment, com.seattleclouds.aa):java.lang.CharSequence");
    }

    /* renamed from: a */
    private static void m31730a(Activity activity, C0751a aVar, Drawable drawable) {
        View inflate = activity.getLayoutInflater().inflate(C5460i.actionbar_titletext_layout, null);
        C0752a aVar2 = new C0752a(-2, -1, 17);
        ((ImageView) inflate.findViewById(C5458g.actionbar_image_view)).setImageDrawable(drawable);
        aVar.mo2990a(inflate, aVar2);
        aVar.mo3002c(true);
        aVar.mo2999b(false);
    }

    /* renamed from: a */
    private static void m31731a(Activity activity, C0751a aVar, String str) {
        View inflate = activity.getLayoutInflater().inflate(C5460i.actionbar_titletext_layout, null);
        C0752a aVar2 = new C0752a(-2, -1, 17);
        TextView textView = (TextView) inflate.findViewById(C5458g.actionbar_text_view);
        textView.setText(str);
        textView.setTextColor(((C6348n) activity).mo19778o().mo17550g(aVar.mo3005e()));
        aVar.mo2990a(inflate, aVar2);
        aVar.mo3002c(true);
        aVar.mo2999b(false);
    }

    /* renamed from: a */
    public static void m31733a(Fragment fragment, C6349a aVar) {
        if (fragment.mo1318s() instanceof C6348n) {
            ((C6348n) fragment.mo1318s()).mo19775a(aVar);
        }
    }

    /* renamed from: a */
    public static void m31734a(Fragment fragment, CharSequence charSequence) {
        m31735a(fragment, charSequence, null, null);
    }

    /* renamed from: a */
    private static void m31735a(Fragment fragment, CharSequence charSequence, String str, String str2) {
        final C6348n e = m31744e(fragment);
        if (e != null) {
            if (e instanceof C5326d) {
                C0751a i = e.mo3083i();
                if (i != null) {
                    if (str == null && str2 == null) {
                        i.mo3002c(false);
                        i.mo2999b(true);
                    } else {
                        m31738b(e, i, str, str2, (String) charSequence);
                    }
                }
                C5388i a = m31727a(fragment);
                if (a != null) {
                    if (a.mo1450b().size() == 1) {
                        charSequence = e.getTitle();
                    }
                } else {
                    return;
                }
            }
            final CharSequence charSequence2 = charSequence;
            final C0751a i2 = e.mo3083i();
            if (i2 != null) {
                Handler handler = new Handler();
                final String str3 = str;
                final String str4 = str2;
                C65621 r0 = new Runnable() {
                    public void run() {
                        if (str3 == null && str4 == null) {
                            i2.mo2991a(charSequence2);
                            i2.mo3002c(false);
                            i2.mo2999b(true);
                            return;
                        }
                        C6561t.m31738b(e, i2, str3, str4, (String) charSequence2);
                    }
                };
                handler.post(r0);
            }
        }
    }

    /* renamed from: a */
    public static void m31736a(Fragment fragment, boolean z) {
        C6348n e = m31744e(fragment);
        if (e != null) {
            C0751a i = e.mo3083i();
            if (i != null) {
                if (z) {
                    i.mo3000c();
                } else {
                    i.mo3003d();
                }
            }
        }
    }

    /* renamed from: b */
    public static Fragment m31737b(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Fragment x = fragment.mo1325x();
        if (x == null) {
            return null;
        }
        return m31746h(x);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31738b(Activity activity, C0751a aVar, String str, String str2, String str3) {
        BitmapDrawable bitmapDrawable;
        if (!C6592al.m31910c(str)) {
            bitmapDrawable = App.m25660k(str);
        } else if (C6592al.m31910c(str3)) {
            bitmapDrawable = App.m25660k(str2);
        } else {
            m31731a(activity, aVar, str3);
            return;
        }
        m31730a(activity, aVar, (Drawable) bitmapDrawable);
    }

    /* renamed from: b */
    public static void m31739b(Fragment fragment, C6349a aVar) {
        if (fragment.mo1318s() instanceof C6348n) {
            ((C6348n) fragment.mo1318s()).mo19776b(aVar);
        }
    }

    /* renamed from: b */
    public static void m31740b(Fragment fragment, boolean z) {
        if (fragment.mo1318s() instanceof TabsAppActivity) {
            TabsAppActivity tabsAppActivity = (TabsAppActivity) fragment.mo1318s();
            if (z) {
                tabsAppActivity.mo16887q();
            } else {
                tabsAppActivity.mo16888r();
            }
        } else if (fragment.mo1318s() instanceof SCTabsAppActivity) {
            SCTabsAppActivity sCTabsAppActivity = (SCTabsAppActivity) fragment.mo1318s();
            if (z) {
                sCTabsAppActivity.mo16887q();
            } else {
                sCTabsAppActivity.mo16888r();
            }
        }
    }

    /* renamed from: c */
    public static void m31741c(Fragment fragment, boolean z) {
        boolean z2 = false;
        if (z) {
            m31736a(fragment, false);
            m31740b(fragment, false);
        } else {
            C5230aa d = m31743d(fragment);
            if (d == null || d.mo17144f()) {
                z2 = true;
            }
            m31736a(fragment, z2);
            m31740b(fragment, true);
        }
        if (fragment.mo1318s() instanceof TabsAppActivity) {
            ((TabsAppActivity) fragment.mo1318s()).mo16897c(!z);
        }
    }

    /* renamed from: c */
    public static boolean m31742c(Fragment fragment) {
        if (fragment == null || fragment.mo1194D() || !fragment.mo1197G()) {
            return false;
        }
        Fragment b = m31737b(fragment);
        return b == null || (!b.mo1194D() && b.mo1197G());
    }

    /* renamed from: d */
    public static C5230aa m31743d(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Bundle m = fragment.mo1307m();
        if (m == null) {
            return null;
        }
        String string = m.getString("PAGE_ID");
        if (string == null) {
            return null;
        }
        return (C5230aa) App.f18501c.mo16902D().get(string);
    }

    /* renamed from: e */
    public static C6348n m31744e(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        C0367h s = fragment.mo1318s();
        if (s instanceof C6348n) {
            return (C6348n) s;
        }
        return null;
    }

    /* renamed from: e */
    private void m31745e(Fragment fragment, boolean z) {
        if (fragment instanceof C6563u) {
            C6563u uVar = (C6563u) fragment;
            if (m31742c(fragment)) {
                uVar.mo17454a(z);
            }
        }
    }

    /* renamed from: h */
    private static Fragment m31746h(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        Fragment x = fragment.mo1325x();
        if (x != null) {
            fragment = m31746h(x);
        }
        return fragment;
    }

    /* renamed from: a */
    public void mo20304a(Fragment fragment, Configuration configuration) {
    }

    /* renamed from: a */
    public void mo20305a(Fragment fragment, Menu menu, MenuInflater menuInflater) {
        MenuItem findItem = menu.findItem(C5458g.settings);
        if (findItem == null) {
            findItem = menu.findItem(C5458g.login_register_logout);
        }
        if (findItem != null) {
            C5388i a = m31727a(fragment);
            boolean z = a == null || a.mo1450b().size() == 1;
            findItem.setVisible(z);
            findItem.setEnabled(z);
            m31728a();
            C5230aa d = m31743d(fragment);
            if (((d != null && d.mo17019M()) || C5799d.f20548b) && C5799d.m28556b()) {
                if (!z) {
                    findItem.setEnabled(true);
                }
                if (menu != null) {
                    MenuItem findItem2 = menu.findItem(C5458g.login_registeredit_profie);
                    if (findItem2 != null) {
                        findItem2.setVisible(z);
                    }
                    MenuItem findItem3 = menu.findItem(C5458g.login_register_logout);
                    if (findItem3 != null) {
                        findItem3.setVisible(z);
                    }
                }
                C5799d.m28572n(false);
            }
        }
    }

    /* renamed from: a */
    public boolean mo20306a(Fragment fragment, Intent intent, int i) {
        Fragment b = m31737b(fragment);
        if (b == null) {
            return false;
        }
        b.startActivityForResult(intent, i);
        return true;
    }

    /* renamed from: d */
    public void mo20307d(Fragment fragment, boolean z) {
        if (z) {
            C5230aa d = m31743d(fragment);
            m31736a(fragment, d == null || d.mo17144f());
            if (d != null) {
                m31735a(fragment, m31729a(fragment, d), d.mo17136e(), App.f18501c.mo16933ac());
            } else {
                m31734a(fragment, m31729a(fragment, (C5230aa) null));
            }
        }
    }

    /* renamed from: f */
    public void mo20308f(Fragment fragment) {
        m31745e(fragment, true);
    }

    /* renamed from: g */
    public void mo20309g(Fragment fragment) {
        m31745e(fragment, false);
    }
}
