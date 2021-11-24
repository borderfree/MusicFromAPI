package android.support.p023v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p009v4.widget.C0704m;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.p */
class C1120p extends PopupWindow {

    /* renamed from: a */
    private static final boolean f3888a = (VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f3889b;

    public C1120p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6122a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m6122a(Context context, AttributeSet attributeSet, int i, int i2) {
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0736j.PopupWindow, i, i2);
        if (a.mo5371g(C0736j.PopupWindow_overlapAnchor)) {
            m6123a(a.mo5359a(C0736j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo5357a(C0736j.PopupWindow_android_popupBackground));
        a.mo5358a();
    }

    /* renamed from: a */
    private void m6123a(boolean z) {
        if (f3888a) {
            this.f3889b = z;
        } else {
            C0704m.m3316a((PopupWindow) this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f3888a && this.f3889b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f3888a && this.f3889b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f3888a && this.f3889b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
