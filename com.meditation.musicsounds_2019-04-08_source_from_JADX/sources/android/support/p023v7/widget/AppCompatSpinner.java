package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.view.C0625r;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
public class AppCompatSpinner extends Spinner implements C0625r {

    /* renamed from: a */
    private static final int[] f2875a = {16843505};

    /* renamed from: b */
    private final C1107g f2876b;

    /* renamed from: c */
    private final Context f2877c;

    /* renamed from: d */
    private C1023ak f2878d;

    /* renamed from: e */
    private SpinnerAdapter f2879e;

    /* renamed from: f */
    private final boolean f2880f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0906b f2881g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f2882h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Rect f2883i;

    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    private static class C0905a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f2886a;

        /* renamed from: b */
        private ListAdapter f2887b;

        public C0905a(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f2886a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2887b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof C1074bg) {
                C1074bg bgVar = (C1074bg) spinnerAdapter;
                if (bgVar.mo5347a() == null) {
                    bgVar.mo5348a(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2887b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            if (this.f2886a == null) {
                return 0;
            }
            return this.f2886a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f2886a == null) {
                return null;
            }
            return this.f2886a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            if (this.f2886a == null) {
                return null;
            }
            return this.f2886a.getItem(i);
        }

        public long getItemId(int i) {
            if (this.f2886a == null) {
                return -1;
            }
            return this.f2886a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f2886a != null && this.f2886a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f2887b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2886a != null) {
                this.f2886a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f2886a != null) {
                this.f2886a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    private class C0906b extends C1034ap {

        /* renamed from: a */
        ListAdapter f2888a;

        /* renamed from: h */
        private CharSequence f2890h;

        /* renamed from: i */
        private final Rect f2891i = new Rect();

        public C0906b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo5141b((View) AppCompatSpinner.this);
            mo5139a(true);
            mo5134a(0);
            mo5137a((OnItemClickListener) new OnItemClickListener(AppCompatSpinner.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, C0906b.this.f2888a.getItemId(i));
                    }
                    C0906b.this.mo3441e();
                }
            });
        }

        /* renamed from: a */
        public CharSequence mo3984a() {
            return this.f2890h;
        }

        /* renamed from: a */
        public void mo3985a(ListAdapter listAdapter) {
            super.mo3985a(listAdapter);
            this.f2888a = listAdapter;
        }

        /* renamed from: a */
        public void mo3986a(CharSequence charSequence) {
            this.f2890h = charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3987a(View view) {
            return C0626s.m2883z(view) && view.getGlobalVisibleRect(this.f2891i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3988b() {
            int c;
            Drawable h = mo5149h();
            int i = 0;
            if (h != null) {
                h.getPadding(AppCompatSpinner.this.f2883i);
                i = C1094bs.m6004a(AppCompatSpinner.this) ? AppCompatSpinner.this.f2883i.right : -AppCompatSpinner.this.f2883i.left;
            } else {
                Rect b = AppCompatSpinner.this.f2883i;
                AppCompatSpinner.this.f2883i.right = 0;
                b.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f2882h == -2) {
                int a = AppCompatSpinner.this.mo3949a((SpinnerAdapter) this.f2888a, mo5149h());
                int i2 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f2883i.left) - AppCompatSpinner.this.f2883i.right;
                if (a > i2) {
                    a = i2;
                }
                c = Math.max(a, (width - paddingLeft) - paddingRight);
            } else {
                c = AppCompatSpinner.this.f2882h == -1 ? (width - paddingLeft) - paddingRight : AppCompatSpinner.this.f2882h;
            }
            mo5148g(c);
            mo5143c(C1094bs.m6004a(AppCompatSpinner.this) ? i + ((width - paddingRight) - mo5155l()) : i + paddingLeft);
        }

        /* renamed from: d */
        public void mo3440d() {
            boolean f = mo3442f();
            mo3988b();
            mo5150h(2);
            super.mo3440d();
            mo3443g().setChoiceMode(1);
            mo5152i(AppCompatSpinner.this.getSelectedItemPosition());
            if (!f) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    final C09082 r1 = new OnGlobalLayoutListener() {
                        public void onGlobalLayout() {
                            if (!C0906b.this.mo3987a((View) AppCompatSpinner.this)) {
                                C0906b.this.mo3441e();
                                return;
                            }
                            C0906b.this.mo3988b();
                            C0906b.super.mo3440d();
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(r1);
                    mo5138a((OnDismissListener) new OnDismissListener() {
                        public void onDismiss() {
                            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeGlobalOnLayoutListener(r1);
                            }
                        }
                    });
                }
            }
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(Context context, int i) {
        this(context, null, C0727a.spinnerStyle, i);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r12 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r12 != null) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.f2883i = r0
            int[] r0 = android.support.p023v7.p024a.C0726a.C0736j.Spinner
            r1 = 0
            android.support.v7.widget.bk r0 = android.support.p023v7.widget.C1078bk.m5881a(r8, r9, r0, r10, r1)
            android.support.v7.widget.g r2 = new android.support.v7.widget.g
            r2.<init>(r7)
            r7.f2876b = r2
            r2 = 0
            if (r12 == 0) goto L_0x0023
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>(r8, r12)
        L_0x0020:
            r7.f2877c = r3
            goto L_0x003c
        L_0x0023:
            int r12 = android.support.p023v7.p024a.C0726a.C0736j.Spinner_popupTheme
            int r12 = r0.mo5370g(r12, r1)
            if (r12 == 0) goto L_0x0031
            android.support.v7.view.d r3 = new android.support.v7.view.d
            r3.<init>(r8, r12)
            goto L_0x0020
        L_0x0031:
            int r12 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r12 >= r3) goto L_0x0039
            r12 = r8
            goto L_0x003a
        L_0x0039:
            r12 = r2
        L_0x003a:
            r7.f2877c = r12
        L_0x003c:
            android.content.Context r12 = r7.f2877c
            r3 = 1
            if (r12 == 0) goto L_0x00ab
            r12 = -1
            if (r11 != r12) goto L_0x0073
            int[] r12 = f2875a     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r12, r10, r1)     // Catch:{ Exception -> 0x0060, all -> 0x005d }
            boolean r4 = r12.hasValue(r1)     // Catch:{ Exception -> 0x005b }
            if (r4 == 0) goto L_0x0055
            int r4 = r12.getInt(r1, r1)     // Catch:{ Exception -> 0x005b }
            r11 = r4
        L_0x0055:
            if (r12 == 0) goto L_0x0073
        L_0x0057:
            r12.recycle()
            goto L_0x0073
        L_0x005b:
            r4 = move-exception
            goto L_0x0062
        L_0x005d:
            r8 = move-exception
            r12 = r2
            goto L_0x006d
        L_0x0060:
            r4 = move-exception
            r12 = r2
        L_0x0062:
            java.lang.String r5 = "AppCompatSpinner"
            java.lang.String r6 = "Could not read android:spinnerMode"
            android.util.Log.i(r5, r6, r4)     // Catch:{ all -> 0x006c }
            if (r12 == 0) goto L_0x0073
            goto L_0x0057
        L_0x006c:
            r8 = move-exception
        L_0x006d:
            if (r12 == 0) goto L_0x0072
            r12.recycle()
        L_0x0072:
            throw r8
        L_0x0073:
            if (r11 != r3) goto L_0x00ab
            android.support.v7.widget.AppCompatSpinner$b r11 = new android.support.v7.widget.AppCompatSpinner$b
            android.content.Context r12 = r7.f2877c
            r11.<init>(r12, r9, r10)
            android.content.Context r12 = r7.f2877c
            int[] r4 = android.support.p023v7.p024a.C0726a.C0736j.Spinner
            android.support.v7.widget.bk r12 = android.support.p023v7.widget.C1078bk.m5881a(r12, r9, r4, r10, r1)
            int r1 = android.support.p023v7.p024a.C0726a.C0736j.Spinner_android_dropDownWidth
            r4 = -2
            int r1 = r12.mo5368f(r1, r4)
            r7.f2882h = r1
            int r1 = android.support.p023v7.p024a.C0726a.C0736j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r1 = r12.mo5357a(r1)
            r11.mo5136a(r1)
            int r1 = android.support.p023v7.p024a.C0726a.C0736j.Spinner_android_prompt
            java.lang.String r1 = r0.mo5365d(r1)
            r11.mo3986a(r1)
            r12.mo5358a()
            r7.f2881g = r11
            android.support.v7.widget.AppCompatSpinner$1 r12 = new android.support.v7.widget.AppCompatSpinner$1
            r12.<init>(r7, r11)
            r7.f2878d = r12
        L_0x00ab:
            int r11 = android.support.p023v7.p024a.C0726a.C0736j.Spinner_android_entries
            java.lang.CharSequence[] r11 = r0.mo5369f(r11)
            if (r11 == 0) goto L_0x00c3
            android.widget.ArrayAdapter r12 = new android.widget.ArrayAdapter
            r1 = 17367048(0x1090008, float:2.5162948E-38)
            r12.<init>(r8, r1, r11)
            int r8 = android.support.p023v7.p024a.C0726a.C0733g.support_simple_spinner_dropdown_item
            r12.setDropDownViewResource(r8)
            r7.setAdapter(r12)
        L_0x00c3:
            r0.mo5358a()
            r7.f2880f = r3
            android.widget.SpinnerAdapter r8 = r7.f2879e
            if (r8 == 0) goto L_0x00d3
            android.widget.SpinnerAdapter r8 = r7.f2879e
            r7.setAdapter(r8)
            r7.f2879e = r2
        L_0x00d3:
            android.support.v7.widget.g r8 = r7.f2876b
            r8.mo5456a(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3949a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2883i);
            i2 += this.f2883i.left + this.f2883i.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f2876b != null) {
            this.f2876b.mo5459c();
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f2881g != null) {
            return this.f2881g.mo5153j();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f2881g != null) {
            return this.f2881g.mo5154k();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f2881g != null) {
            return this.f2882h;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f2881g != null) {
            return this.f2881g.mo5149h();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f2881g != null) {
            return this.f2877c;
        }
        if (VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        return this.f2881g != null ? this.f2881g.mo3984a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f2876b != null) {
            return this.f2876b.mo5451a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f2876b != null) {
            return this.f2876b.mo5457b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2881g != null && this.f2881g.mo3442f()) {
            this.f2881g.mo3441e();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2881g != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo3949a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2878d == null || !this.f2878d.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        if (this.f2881g == null) {
            return super.performClick();
        }
        if (!this.f2881g.mo3442f()) {
            this.f2881g.mo3440d();
        }
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2880f) {
            this.f2879e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2881g != null) {
            this.f2881g.mo3985a((ListAdapter) new C0905a(spinnerAdapter, (this.f2877c == null ? getContext() : this.f2877c).getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f2876b != null) {
            this.f2876b.mo5455a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f2876b != null) {
            this.f2876b.mo5452a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f2881g != null) {
            this.f2881g.mo5143c(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f2881g != null) {
            this.f2881g.mo5145d(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f2881g != null) {
            this.f2882h = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f2881g != null) {
            this.f2881g.mo5136a(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0817b.m3884b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f2881g != null) {
            this.f2881g.mo3986a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2876b != null) {
            this.f2876b.mo5453a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f2876b != null) {
            this.f2876b.mo5454a(mode);
        }
    }
}
