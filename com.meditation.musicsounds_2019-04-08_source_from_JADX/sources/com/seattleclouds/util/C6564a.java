package com.seattleclouds.util;

import android.content.Context;
import android.database.Cursor;
import android.support.p009v4.content.C0440a;

/* renamed from: com.seattleclouds.util.a */
public abstract class C6564a extends C0440a<Cursor> {

    /* renamed from: p */
    Cursor f23234p;

    public C6564a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo1821b(Cursor cursor) {
        if (mo1826j()) {
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        Cursor cursor2 = this.f23234p;
        this.f23234p = cursor;
        if (mo1824h()) {
            super.mo1821b(cursor);
        }
        if (!(cursor2 == null || cursor2 == cursor || cursor2.isClosed())) {
            cursor2.close();
        }
    }

    /* renamed from: b */
    public void mo1795a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1828l() {
        if (this.f23234p != null) {
            mo1821b(this.f23234p);
        }
        if (mo1838u() || this.f23234p == null) {
            mo1830n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo1832p() {
        mo1829m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo1836t() {
        super.mo1836t();
        mo1832p();
        if (this.f23234p != null && !this.f23234p.isClosed()) {
            this.f23234p.close();
        }
        this.f23234p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract Cursor mo17839y();

    /* renamed from: z */
    public Cursor mo1800d() {
        Cursor y = mo17839y();
        if (y != null) {
            y.getCount();
        }
        return y;
    }
}
