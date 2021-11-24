package android.support.p023v7.view.menu;

import android.content.Context;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.view.C0592b.C0594b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C0866l extends C0861k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C0867a extends C0862a implements VisibilityListener {

        /* renamed from: c */
        C0594b f2697c;

        public C0867a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo2424a(MenuItem menuItem) {
            return this.f2692a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo2426a(C0594b bVar) {
            this.f2697c = bVar;
            this.f2692a.setVisibilityListener(bVar != null ? this : null);
        }

        /* renamed from: b */
        public boolean mo2429b() {
            return this.f2692a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo2430c() {
            return this.f2692a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f2697c != null) {
                this.f2697c.mo2435a(z);
            }
        }
    }

    C0866l(Context context, C0428b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0862a mo3612a(ActionProvider actionProvider) {
        return new C0867a(this.f2567a, actionProvider);
    }
}
