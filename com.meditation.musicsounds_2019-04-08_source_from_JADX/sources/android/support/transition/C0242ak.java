package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.transition.ak */
class C0242ak implements C0243al {

    /* renamed from: a */
    private final ViewOverlay f712a;

    C0242ak(View view) {
        this.f712a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo980a(Drawable drawable) {
        this.f712a.add(drawable);
    }

    /* renamed from: b */
    public void mo981b(Drawable drawable) {
        this.f712a.remove(drawable);
    }
}
