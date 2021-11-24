package android.support.p023v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p009v4.app.C0396q;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.app.a */
public abstract class C0751a {

    /* renamed from: android.support.v7.app.a$a */
    public static class C0752a extends MarginLayoutParams {

        /* renamed from: a */
        public int f2207a;

        public C0752a(int i, int i2) {
            super(i, i2);
            this.f2207a = 0;
            this.f2207a = 8388627;
        }

        public C0752a(int i, int i2, int i3) {
            super(i, i2);
            this.f2207a = 0;
            this.f2207a = i3;
        }

        public C0752a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2207a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.ActionBarLayout);
            this.f2207a = obtainStyledAttributes.getInt(C0736j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0752a(C0752a aVar) {
            super(aVar);
            this.f2207a = 0;
            this.f2207a = aVar.f2207a;
        }

        public C0752a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2207a = 0;
        }
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0753b {
        /* renamed from: a */
        void mo3015a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$c */
    public static abstract class C0754c {
        /* renamed from: a */
        public abstract int mo3016a();

        /* renamed from: a */
        public abstract C0754c mo3017a(C0755d dVar);

        /* renamed from: a */
        public abstract C0754c mo3018a(CharSequence charSequence);

        /* renamed from: b */
        public abstract Drawable mo3019b();

        /* renamed from: c */
        public abstract CharSequence mo3020c();

        /* renamed from: d */
        public abstract View mo3021d();

        /* renamed from: e */
        public abstract void mo3022e();

        /* renamed from: f */
        public abstract CharSequence mo3023f();
    }

    @Deprecated
    /* renamed from: android.support.v7.app.a$d */
    public interface C0755d {
        /* renamed from: a */
        void mo3024a(C0754c cVar, C0396q qVar);

        /* renamed from: b */
        void mo3025b(C0754c cVar, C0396q qVar);

        /* renamed from: c */
        void mo3026c(C0754c cVar, C0396q qVar);
    }

    /* renamed from: a */
    public abstract int mo2983a();

    /* renamed from: a */
    public C0827b mo2984a(C0828a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo2985a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo2986a(int i);

    /* renamed from: a */
    public void mo2987a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo2988a(Drawable drawable);

    @Deprecated
    /* renamed from: a */
    public abstract void mo2989a(C0754c cVar);

    /* renamed from: a */
    public abstract void mo2990a(View view, C0752a aVar);

    /* renamed from: a */
    public abstract void mo2991a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo2992a(boolean z);

    /* renamed from: a */
    public boolean mo2993a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo2994a(KeyEvent keyEvent) {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public abstract C0754c mo2995b();

    /* renamed from: b */
    public void mo2996b(int i) {
    }

    /* renamed from: b */
    public void mo2997b(Drawable drawable) {
    }

    /* renamed from: b */
    public abstract void mo2998b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo2999b(boolean z);

    /* renamed from: c */
    public abstract void mo3000c();

    /* renamed from: c */
    public void mo3001c(CharSequence charSequence) {
    }

    /* renamed from: c */
    public abstract void mo3002c(boolean z);

    /* renamed from: d */
    public abstract void mo3003d();

    /* renamed from: d */
    public void mo3004d(boolean z) {
    }

    /* renamed from: e */
    public Context mo3005e() {
        return null;
    }

    /* renamed from: e */
    public void mo3006e(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: f */
    public void mo3007f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo3008f() {
        return false;
    }

    /* renamed from: g */
    public void mo3009g(boolean z) {
    }

    /* renamed from: g */
    public boolean mo3010g() {
        return false;
    }

    /* renamed from: h */
    public void mo3011h(boolean z) {
    }

    /* renamed from: h */
    public boolean mo3012h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo3013i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3014j() {
    }
}
