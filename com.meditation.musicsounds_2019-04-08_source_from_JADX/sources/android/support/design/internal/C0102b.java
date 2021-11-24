package android.support.design.internal;

import android.content.Context;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0881u;
import android.view.SubMenu;

/* renamed from: android.support.design.internal.b */
public class C0102b extends C0855h {
    public C0102b(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0859j jVar = (C0859j) mo3481a(i, i2, i3, charSequence);
        C0115d dVar = new C0115d(mo3519e(), this, jVar);
        jVar.mo3555a((C0881u) dVar);
        return dVar;
    }
}
