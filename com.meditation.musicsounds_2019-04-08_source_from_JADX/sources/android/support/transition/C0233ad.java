package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.transition.ad */
class C0233ad implements C0234ae {

    /* renamed from: a */
    private final ViewGroupOverlay f696a;

    C0233ad(ViewGroup viewGroup) {
        this.f696a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo980a(Drawable drawable) {
        this.f696a.add(drawable);
    }

    /* renamed from: a */
    public void mo978a(View view) {
        this.f696a.add(view);
    }

    /* renamed from: b */
    public void mo981b(Drawable drawable) {
        this.f696a.remove(drawable);
    }

    /* renamed from: b */
    public void mo979b(View view) {
        this.f696a.remove(view);
    }
}
