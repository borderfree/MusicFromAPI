package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0647w;
import android.support.p009v4.widget.C0702k;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p028d.p029a.C0820a;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.ah */
class C1012ah extends ListView {

    /* renamed from: a */
    private final Rect f3471a = new Rect();

    /* renamed from: b */
    private int f3472b = 0;

    /* renamed from: c */
    private int f3473c = 0;

    /* renamed from: d */
    private int f3474d = 0;

    /* renamed from: e */
    private int f3475e = 0;

    /* renamed from: f */
    private int f3476f;

    /* renamed from: g */
    private Field f3477g;

    /* renamed from: h */
    private C1014a f3478h;

    /* renamed from: i */
    private boolean f3479i;

    /* renamed from: j */
    private boolean f3480j;

    /* renamed from: k */
    private boolean f3481k;

    /* renamed from: l */
    private C0647w f3482l;

    /* renamed from: m */
    private C0702k f3483m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1015b f3484n;

    /* renamed from: android.support.v7.widget.ah$a */
    private static class C1014a extends C0820a {

        /* renamed from: a */
        private boolean f3485a = true;

        C1014a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5048a(boolean z) {
            this.f3485a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f3485a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f3485a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f3485a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f3485a) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f3485a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ah$b */
    private class C1015b implements Runnable {
        private C1015b() {
        }

        /* renamed from: a */
        public void mo5049a() {
            C1012ah.this.f3484n = null;
            C1012ah.this.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo5050b() {
            C1012ah.this.post(this);
        }

        public void run() {
            C1012ah.this.f3484n = null;
            C1012ah.this.drawableStateChanged();
        }
    }

    C1012ah(Context context, boolean z) {
        super(context, null, C0727a.dropDownListViewStyle);
        this.f3480j = z;
        setCacheColorHint(0);
        try {
            this.f3477g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3477g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m5524a() {
        Drawable selector = getSelector();
        if (selector != null && m5532c() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: a */
    private void m5525a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m5531b(i, view);
        if (z2) {
            Rect rect = this.f3471a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0311a.m1172a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: a */
    private void m5526a(int i, View view, float f, float f2) {
        m5525a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0311a.m1172a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m5527a(Canvas canvas) {
        if (!this.f3471a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f3471a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m5528a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m5529a(View view, int i, float f, float f2) {
        this.f3481k = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f3476f != -1) {
            View childAt = getChildAt(this.f3476f - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f3476f = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m5526a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: b */
    private void m5530b() {
        this.f3481k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f3476f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f3482l != null) {
            this.f3482l.mo2560b();
            this.f3482l = null;
        }
    }

    /* renamed from: b */
    private void m5531b(int i, View view) {
        Rect rect = this.f3471a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f3472b;
        rect.top -= this.f3473c;
        rect.right += this.f3474d;
        rect.bottom += this.f3475e;
        try {
            boolean z = this.f3477g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f3477g.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private boolean m5532c() {
        return this.f3481k;
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f3478h != null) {
            this.f3478h.mo5048a(z);
        }
    }

    /* renamed from: a */
    public int mo5035a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                if (i5 >= 0 && i10 > i5 && i9 > 0 && i7 != i4) {
                    i4 = i9;
                }
                return i4;
            }
            if (i5 >= 0 && i10 >= i5) {
                i9 = i7;
            }
        }
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5036a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x000f;
                case 3: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r9 = 0
            r3 = 1
            goto L_0x0041
        L_0x000c:
            r9 = 0
            r3 = 0
            goto L_0x0041
        L_0x000f:
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x0019
            goto L_0x000c
        L_0x0019:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x002c
            r9 = 1
            goto L_0x0041
        L_0x002c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m5529a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x0009
            r7.m5528a(r3, r5)
            goto L_0x0009
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            if (r9 == 0) goto L_0x0048
        L_0x0045:
            r7.m5530b()
        L_0x0048:
            if (r3 == 0) goto L_0x0060
            android.support.v4.widget.k r9 = r7.f3483m
            if (r9 != 0) goto L_0x0055
            android.support.v4.widget.k r9 = new android.support.v4.widget.k
            r9.<init>(r7)
            r7.f3483m = r9
        L_0x0055:
            android.support.v4.widget.k r9 = r7.f3483m
            r9.mo2777a(r2)
            android.support.v4.widget.k r9 = r7.f3483m
            r9.onTouch(r7, r8)
            goto L_0x0069
        L_0x0060:
            android.support.v4.widget.k r8 = r7.f3483m
            if (r8 == 0) goto L_0x0069
            android.support.v4.widget.k r8 = r7.f3483m
            r8.mo2777a(r1)
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1012ah.mo5036a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m5527a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f3484n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m5524a();
        }
    }

    public boolean hasFocus() {
        return this.f3480j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f3480j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f3480j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f3480j && this.f3479i) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f3484n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3484n == null) {
            this.f3484n = new C1015b();
            this.f3484n.mo5050b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m5524a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f3476f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f3484n != null) {
            this.f3484n.mo5049a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f3479i = z;
    }

    public void setSelector(Drawable drawable) {
        this.f3478h = drawable != null ? new C1014a(drawable) : null;
        super.setSelector(this.f3478h);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3472b = rect.left;
        this.f3473c = rect.top;
        this.f3474d = rect.right;
        this.f3475e = rect.bottom;
    }
}
