package android.support.p023v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p023v7.p024a.C0726a.C0730d;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0735i;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.bo */
class C1086bo {

    /* renamed from: a */
    private final Context f3788a;

    /* renamed from: b */
    private final View f3789b;

    /* renamed from: c */
    private final TextView f3790c;

    /* renamed from: d */
    private final LayoutParams f3791d = new LayoutParams();

    /* renamed from: e */
    private final Rect f3792e = new Rect();

    /* renamed from: f */
    private final int[] f3793f = new int[2];

    /* renamed from: g */
    private final int[] f3794g = new int[2];

    C1086bo(Context context) {
        this.f3788a = context;
        this.f3789b = LayoutInflater.from(this.f3788a).inflate(C0733g.abc_tooltip, null);
        this.f3790c = (TextView) this.f3789b.findViewById(C0732f.message);
        this.f3791d.setTitle(getClass().getSimpleName());
        this.f3791d.packageName = this.f3788a.getPackageName();
        this.f3791d.type = 1002;
        this.f3791d.width = -2;
        this.f3791d.height = -2;
        this.f3791d.format = -3;
        this.f3791d.windowAnimations = C0735i.Animation_AppCompat_Tooltip;
        this.f3791d.flags = 24;
    }

    /* renamed from: a */
    private static View m5960a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    private void m5961a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f3788a.getResources().getDimensionPixelOffset(C0730d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f3788a.getResources().getDimensionPixelOffset(C0730d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f3788a.getResources().getDimensionPixelOffset(z ? C0730d.tooltip_y_offset_touch : C0730d.tooltip_y_offset_non_touch);
        View a = m5960a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f3792e);
        if (this.f3792e.left < 0 && this.f3792e.top < 0) {
            Resources resources = this.f3788a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f3792e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f3794g);
        view.getLocationOnScreen(this.f3793f);
        int[] iArr = this.f3793f;
        iArr[0] = iArr[0] - this.f3794g[0];
        int[] iArr2 = this.f3793f;
        iArr2[1] = iArr2[1] - this.f3794g[1];
        layoutParams.x = (this.f3793f[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f3789b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f3789b.getMeasuredHeight();
        int i5 = ((this.f3793f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = this.f3793f[1] + i4 + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 > this.f3792e.height() : i5 >= 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5382a() {
        if (mo5384b()) {
            ((WindowManager) this.f3788a.getSystemService("window")).removeView(this.f3789b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5383a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo5384b()) {
            mo5382a();
        }
        this.f3790c.setText(charSequence);
        m5961a(view, i, i2, z, this.f3791d);
        ((WindowManager) this.f3788a.getSystemService("window")).addView(this.f3789b, this.f3791d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5384b() {
        return this.f3789b.getParent() != null;
    }
}
