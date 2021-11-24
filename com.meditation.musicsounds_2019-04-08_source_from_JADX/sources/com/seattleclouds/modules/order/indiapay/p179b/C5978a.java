package com.seattleclouds.modules.order.indiapay.p179b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.KeyEvent;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.modules.order.indiapay.b.a */
public class C5978a extends C0366g {

    /* renamed from: ae */
    private String f21195ae;

    /* renamed from: af */
    private String f21196af;

    /* renamed from: a */
    public static C5978a m29318a(String str, String str2) {
        C5978a aVar = new C5978a();
        Bundle bundle = new Bundle();
        bundle.putString("status", str);
        bundle.putString("messages", str2);
        aVar.mo1289g(bundle);
        return aVar;
    }

    /* renamed from: as */
    private void m29319as() {
        C0374l g = mo1318s().mo1469g();
        C0396q a = g.mo1536a();
        Fragment a2 = g.mo1535a("TAG_INIT_TRANSACTION");
        if (a2 != null) {
            a.mo1412a(a2);
            a.mo1428c();
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        m29319as();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        if (mo1307m() != null) {
            this.f21195ae = mo1307m().getString("status");
            this.f21196af = mo1307m().getString("messages");
        }
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3054a((CharSequence) this.f21195ae);
        aVar.mo3063b((CharSequence) this.f21196af);
        aVar.mo3048a(C5462k.f19438OK, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C5978a.this.mo1450b();
            }
        });
        aVar.mo3056a(false);
        aVar.mo3050a((OnKeyListener) new OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C5978a.this.mo1318s().finish();
                return true;
            }
        });
        C0765d b = aVar.mo3065b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }
}
