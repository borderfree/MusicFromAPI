package android.support.p023v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p009v4.p012b.p013a.C0427a;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.p012b.p013a.C0429c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.q */
public final class C0875q {
    /* renamed from: a */
    public static Menu m4241a(Context context, C0427a aVar) {
        return new C0876r(context, aVar);
    }

    /* renamed from: a */
    public static MenuItem m4242a(Context context, C0428b bVar) {
        return VERSION.SDK_INT >= 16 ? new C0866l(context, bVar) : new C0861k(context, bVar);
    }

    /* renamed from: a */
    public static SubMenu m4243a(Context context, C0429c cVar) {
        return new C0882v(context, cVar);
    }
}
