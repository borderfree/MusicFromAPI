package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0087a.C0097j;
import android.support.design.C0087a.C0098k;
import android.support.design.internal.C0102b;
import android.support.design.internal.C0103c;
import android.support.design.internal.C0116e;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.view.C0834g;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0855h.C0856a;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0871o;
import android.support.p023v7.widget.C1078bk;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class NavigationView extends C0116e {

    /* renamed from: d */
    private static final int[] f376d = {16842912};

    /* renamed from: e */
    private static final int[] f377e = {-16842910};

    /* renamed from: c */
    C0142a f378c;

    /* renamed from: f */
    private final C0102b f379f;

    /* renamed from: g */
    private final C0103c f380g;

    /* renamed from: h */
    private int f381h;

    /* renamed from: i */
    private MenuInflater f382i;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        public Bundle f384a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f384a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f384a);
        }
    }

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0142a {
        /* renamed from: a */
        boolean mo647a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f380g = new C0103c();
        C0211q.m831a(context);
        this.f379f = new C0102b(context);
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0098k.NavigationView, i, C0097j.Widget_Design_NavigationView);
        C0626s.m2843a((View) this, a.mo5357a(C0098k.NavigationView_android_background));
        if (a.mo5371g(C0098k.NavigationView_elevation)) {
            C0626s.m2837a((View) this, (float) a.mo5366e(C0098k.NavigationView_elevation, 0));
        }
        C0626s.m2855b((View) this, a.mo5359a(C0098k.NavigationView_android_fitsSystemWindows, false));
        this.f381h = a.mo5366e(C0098k.NavigationView_android_maxWidth, 0);
        ColorStateList e = a.mo5371g(C0098k.NavigationView_itemIconTint) ? a.mo5367e(C0098k.NavigationView_itemIconTint) : m555d(16842808);
        if (a.mo5371g(C0098k.NavigationView_itemTextAppearance)) {
            i2 = a.mo5370g(C0098k.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        ColorStateList colorStateList = null;
        if (a.mo5371g(C0098k.NavigationView_itemTextColor)) {
            colorStateList = a.mo5367e(C0098k.NavigationView_itemTextColor);
        }
        if (!z && colorStateList == null) {
            colorStateList = m555d(16842806);
        }
        Drawable a2 = a.mo5357a(C0098k.NavigationView_itemBackground);
        this.f379f.mo3484a((C0856a) new C0856a() {
            /* renamed from: a */
            public void mo639a(C0855h hVar) {
            }

            /* renamed from: a */
            public boolean mo640a(C0855h hVar, MenuItem menuItem) {
                return NavigationView.this.f378c != null && NavigationView.this.f378c.mo647a(menuItem);
            }
        });
        this.f380g.mo315a(1);
        this.f380g.mo316a(context, (C0855h) this.f379f);
        this.f380g.mo317a(e);
        if (z) {
            this.f380g.mo337d(i2);
        }
        this.f380g.mo331b(colorStateList);
        this.f380g.mo318a(a2);
        this.f379f.mo3486a((C0871o) this.f380g);
        addView((View) this.f380g.mo314a((ViewGroup) this));
        if (a.mo5371g(C0098k.NavigationView_menu)) {
            mo621a(a.mo5370g(C0098k.NavigationView_menu, 0));
        }
        if (a.mo5371g(C0098k.NavigationView_headerLayout)) {
            mo622b(a.mo5370g(C0098k.NavigationView_headerLayout, 0));
        }
        a.mo5358a();
    }

    /* renamed from: d */
    private ColorStateList m555d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C0817b.m3881a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0727a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{f377e, f376d, EMPTY_STATE_SET}, new int[]{a.getColorForState(f377e, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f382i == null) {
            this.f382i = new C0834g(getContext());
        }
        return this.f382i;
    }

    /* renamed from: a */
    public void mo621a(int i) {
        this.f380g.mo332b(true);
        getMenuInflater().inflate(i, this.f379f);
        this.f380g.mo332b(false);
        this.f380g.mo325a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo360a(C0591aa aaVar) {
        this.f380g.mo320a(aaVar);
    }

    /* renamed from: b */
    public View mo622b(int i) {
        return this.f380g.mo330b(i);
    }

    /* renamed from: c */
    public View mo623c(int i) {
        return this.f380g.mo335c(i);
    }

    public int getHeaderCount() {
        return this.f380g.mo336d();
    }

    public Drawable getItemBackground() {
        return this.f380g.mo340g();
    }

    public ColorStateList getItemIconTintList() {
        return this.f380g.mo338e();
    }

    public ColorStateList getItemTextColor() {
        return this.f380g.mo339f();
    }

    public Menu getMenu() {
        return this.f379f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f381h;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(MeasureSpec.getSize(i), this.f381h);
        i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        this.f379f.mo3502b(savedState.f384a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f384a = new Bundle();
        this.f379f.mo3483a(savedState.f384a);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f379f.findItem(i);
        if (findItem != null) {
            this.f380g.mo322a((C0859j) findItem);
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f380g.mo318a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0452b.m2059a(getContext(), i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f380g.mo317a(colorStateList);
    }

    public void setItemTextAppearance(int i) {
        this.f380g.mo337d(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f380g.mo331b(colorStateList);
    }

    public void setNavigationItemSelectedListener(C0142a aVar) {
        this.f378c = aVar;
    }
}
