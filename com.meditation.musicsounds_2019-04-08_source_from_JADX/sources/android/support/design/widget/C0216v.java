package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.design.widget.v */
class C0216v extends ImageButton {

    /* renamed from: a */
    private int f668a;

    public C0216v(Context context) {
        this(context, null);
    }

    public C0216v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0216v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f668a = getVisibility();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo951a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f668a = i;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int getUserSetVisibility() {
        return this.f668a;
    }

    public void setVisibility(int i) {
        mo951a(i, true);
    }
}
