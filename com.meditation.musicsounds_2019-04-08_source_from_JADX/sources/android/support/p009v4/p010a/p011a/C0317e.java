package android.support.p009v4.p010a.p011a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.a.a.e */
class C0317e extends C0314d {

    /* renamed from: android.support.v4.a.a.e$a */
    private static class C0318a extends C0315a {
        C0318a(C0315a aVar, Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0317e(this, resources);
        }
    }

    C0317e(Drawable drawable) {
        super(drawable);
    }

    C0317e(C0315a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0315a mo1133b() {
        return new C0318a(this.f863b, null);
    }

    public boolean isAutoMirrored() {
        return this.f864c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.f864c.setAutoMirrored(z);
    }
}
