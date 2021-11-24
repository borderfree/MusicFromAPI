package com.seattleclouds.modules.p175m;

import android.graphics.Bitmap;
import android.support.p009v4.p019g.C0496g;

/* renamed from: com.seattleclouds.modules.m.a */
public class C5815a {

    /* renamed from: a */
    private static C5815a f20606a;

    /* renamed from: b */
    private C0496g<String, Bitmap> f20607b;

    private C5815a() {
        m28642b();
    }

    /* renamed from: a */
    public static C5815a m28641a() {
        if (f20606a == null) {
            f20606a = new C5815a();
        }
        return f20606a;
    }

    /* renamed from: b */
    private void m28642b() {
        this.f20607b = new C0496g<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public int mo1933b(String str, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    /* renamed from: a */
    public Bitmap mo18537a(String str) {
        return (Bitmap) this.f20607b.mo1928a(str);
    }

    /* renamed from: a */
    public void mo18538a(String str, Bitmap bitmap) {
        if (this.f20607b.mo1928a(str) == null) {
            this.f20607b.mo1929a(str, bitmap);
        }
    }
}
