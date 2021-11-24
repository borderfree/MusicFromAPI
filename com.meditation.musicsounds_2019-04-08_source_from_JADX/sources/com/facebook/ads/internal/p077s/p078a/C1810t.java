package com.facebook.ads.internal.p077s.p078a;

import android.os.Handler;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: com.facebook.ads.internal.s.a.t */
public class C1810t implements OnSystemUiVisibilityChangeListener {

    /* renamed from: a */
    private final View f5902a;

    /* renamed from: b */
    private int f5903b;

    /* renamed from: c */
    private Window f5904c;

    /* renamed from: d */
    private C1813a f5905d = C1813a.DEFAULT;

    /* renamed from: e */
    private final Runnable f5906e = new Runnable() {
        public void run() {
            C1810t.this.m8945a(false);
        }
    };

    /* renamed from: com.facebook.ads.internal.s.a.t$2 */
    static /* synthetic */ class C18122 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5908a = new int[C1813a.values().length];

        static {
            try {
                f5908a[C1813a.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.s.a.t$a */
    public enum C1813a {
        DEFAULT,
        FULL_SCREEN
    }

    public C1810t(View view) {
        this.f5902a = view;
        this.f5902a.setOnSystemUiVisibilityChangeListener(this);
    }

    /* renamed from: a */
    private void m8943a(int i, boolean z) {
        int i2;
        if (this.f5904c != null) {
            LayoutParams attributes = this.f5904c.getAttributes();
            if (z) {
                i2 = i | attributes.flags;
            } else {
                i2 = (i ^ -1) & attributes.flags;
            }
            attributes.flags = i2;
            this.f5904c.setAttributes(attributes);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8945a(boolean z) {
        if (!C1813a.DEFAULT.equals(this.f5905d)) {
            int i = 3840;
            if (!z) {
                i = 3847;
            }
            Handler handler = this.f5902a.getHandler();
            if (handler != null && z) {
                handler.removeCallbacks(this.f5906e);
                handler.postDelayed(this.f5906e, 2000);
            }
            this.f5902a.setSystemUiVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo7073a() {
        this.f5904c = null;
    }

    /* renamed from: a */
    public void mo7074a(Window window) {
        this.f5904c = window;
    }

    /* renamed from: a */
    public void mo7075a(C1813a aVar) {
        this.f5905d = aVar;
        if (C18122.f5908a[this.f5905d.ordinal()] != 1) {
            m8943a(67108864, false);
            m8943a(134217728, false);
            this.f5902a.setSystemUiVisibility(0);
            return;
        }
        m8943a(67108864, true);
        m8943a(134217728, true);
        m8945a(false);
    }

    public void onSystemUiVisibilityChange(int i) {
        int i2 = this.f5903b ^ i;
        this.f5903b = i;
        if ((i2 & 2) != 0 && (i & 2) == 0) {
            m8945a(true);
        }
    }
}
