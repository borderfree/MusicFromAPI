package android.support.p023v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: android.support.v7.view.menu.i */
class C0858i implements OnClickListener, OnDismissListener, OnKeyListener, C0872a {

    /* renamed from: a */
    C0852f f2651a;

    /* renamed from: b */
    private C0855h f2652b;

    /* renamed from: c */
    private C0765d f2653c;

    /* renamed from: d */
    private C0872a f2654d;

    public C0858i(C0855h hVar) {
        this.f2652b = hVar;
    }

    /* renamed from: a */
    public void mo3547a() {
        if (this.f2653c != null) {
            this.f2653c.dismiss();
        }
    }

    /* renamed from: a */
    public void mo3548a(IBinder iBinder) {
        C0855h hVar = this.f2652b;
        C0766a aVar = new C0766a(hVar.mo3519e());
        this.f2651a = new C0852f(aVar.mo3046a(), C0733g.abc_list_menu_item_layout);
        this.f2651a.mo323a((C0872a) this);
        this.f2652b.mo3486a((C0871o) this.f2651a);
        aVar.mo3053a(this.f2651a.mo3457d(), (OnClickListener) this);
        View o = hVar.mo3534o();
        if (o != null) {
            aVar.mo3052a(o);
        } else {
            aVar.mo3051a(hVar.mo3533n()).mo3054a(hVar.mo3532m());
        }
        aVar.mo3050a((OnKeyListener) this);
        this.f2653c = aVar.mo3065b();
        this.f2653c.setOnDismissListener(this);
        LayoutParams attributes = this.f2653c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f2653c.show();
    }

    /* renamed from: a */
    public void mo3176a(C0855h hVar, boolean z) {
        if (z || hVar == this.f2652b) {
            mo3547a();
        }
        if (this.f2654d != null) {
            this.f2654d.mo3176a(hVar, z);
        }
    }

    /* renamed from: a */
    public boolean mo3177a(C0855h hVar) {
        if (this.f2654d != null) {
            return this.f2654d.mo3177a(hVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f2652b.mo3491a((MenuItem) (C0859j) this.f2651a.mo3457d().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f2651a.mo321a(this.f2652b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window = this.f2653c.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window2 = this.f2653c.getWindow();
                if (window2 != null) {
                    View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f2652b.mo3505b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f2652b.performShortcut(i, keyEvent, 0);
    }
}
