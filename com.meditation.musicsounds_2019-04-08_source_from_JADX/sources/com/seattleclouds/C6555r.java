package com.seattleclouds;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d.C0766a;
import com.facebook.Profile;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6578ag;
import com.seattleclouds.util.C6578ag.C6582a;
import com.seattleclouds.util.C6578ag.C6583b;
import com.seattleclouds.util.C6578ag.C6584c;

/* renamed from: com.seattleclouds.r */
public class C6555r extends C6557s implements C6583b {

    /* renamed from: a */
    private static final String f23206a = "r";
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Uri f23207c = Uri.parse("http://m.facebook.com");

    /* renamed from: b */
    private C6578ag f23208b;

    /* renamed from: b */
    private void m31659b(C6584c cVar) {
        OnClickListener onClickListener;
        String str;
        C0367h s;
        int i;
        Object[] objArr;
        String str2 = null;
        if (cVar.mo20571c() == C6584c.f23286a) {
            onClickListener = new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C6555r.this.mo1318s().startActivity(new Intent("android.intent.action.VIEW", C6555r.f23207c));
                }
            };
            str = null;
        } else {
            if (cVar.mo20571c() == C6584c.f23287b) {
                s = mo1318s();
                i = C5462k.facebook_error_transient;
                objArr = new Object[]{cVar.mo20566a()};
            } else if (cVar.mo20571c() == C6584c.f23288c) {
                s = mo1318s();
                i = C5462k.facebook_error_unknown;
                objArr = new Object[]{cVar.mo20566a()};
            } else if (cVar.mo20571c() == 100) {
                s = mo1318s();
                i = C5462k.facebook_request_exception;
                objArr = new Object[]{cVar.mo20566a()};
            } else {
                str = null;
                onClickListener = null;
            }
            str = s.getString(i, objArr);
            onClickListener = null;
        }
        String b = cVar == null ? null : cVar.mo20569b();
        if (cVar != null) {
            str2 = cVar.mo20566a();
        }
        if (str2 != null) {
            str = str2;
        }
        if (b == null) {
            b = mo1318s().getResources().getString(C5462k.facebook_error_dialog_title);
        }
        new C0766a(mo1318s()).mo3048a(C5462k.facebook_error_dialog_button_text, onClickListener).mo3054a((CharSequence) b).mo3063b((CharSequence) str).mo3068c();
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (!this.f23208b.mo20552a(i, i2, intent)) {
            super.mo1222a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f23208b = new C6578ag(this);
    }

    /* renamed from: a */
    public void mo17562a(C6582a aVar) {
    }

    /* renamed from: a */
    public void mo17563a(C6584c cVar) {
        m31659b(cVar);
    }

    /* renamed from: as */
    public C6578ag mo20280as() {
        return this.f23208b;
    }

    /* renamed from: b */
    public void mo1450b() {
        this.f23208b.mo20551a(this);
    }

    /* renamed from: c */
    public void mo1453c() {
        if (App.f18515q) {
            C6578ag agVar = this.f23208b;
            C6578ag.m31843c();
        }
    }

    /* renamed from: d */
    public Profile mo20281d() {
        return this.f23208b.mo20553b();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
    }

    /* renamed from: e */
    public boolean mo20282e() {
        return App.f18515q && this.f23208b.mo20556e();
    }
}
