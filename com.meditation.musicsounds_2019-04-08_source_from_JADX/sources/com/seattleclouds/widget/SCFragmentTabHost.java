package com.seattleclouds.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0374l;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import com.seattleclouds.C5389j;
import com.seattleclouds.C5390k;
import com.seattleclouds.util.C6619m;
import java.util.List;

public class SCFragmentTabHost extends FragmentTabHostCompat {

    /* renamed from: a */
    private Context f23425a;

    /* renamed from: b */
    private LinearLayout f23426b;

    /* renamed from: c */
    private TabWidget f23427c;

    /* renamed from: d */
    private C5390k f23428d;

    public SCFragmentTabHost(Context context) {
        super(context);
        m32165a(context);
    }

    public SCFragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32165a(context);
    }

    /* renamed from: a */
    private void m32164a(int i, C5390k kVar) {
        removeAllViews();
        this.f23426b = new LinearLayout(this.f23425a);
        this.f23426b.setOrientation(1);
        addView(this.f23426b, new LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.f23425a);
        frameLayout.setId(16908305);
        this.f23426b.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
        frameLayout.addView(new C6670b(this.f23425a), new LayoutParams(0, 0));
        FrameLayout frameLayout2 = new FrameLayout(this.f23425a);
        frameLayout2.setId(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        if (!kVar.mo17687f()) {
            layoutParams.bottomMargin = C6619m.m32014a(this.f23425a, (float) kVar.mo17680c()) * -1;
        }
        this.f23426b.addView(frameLayout2, layoutParams);
    }

    /* renamed from: a */
    private void m32165a(Context context) {
        this.f23425a = context;
        setDestroyFragmentViewOnTabChange(false);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m32166a(C5390k kVar, List<C5389j> list) {
        if (kVar.mo17687f()) {
            this.f23427c = new TabWidget(this.f23425a);
        } else {
            SCTabWidget sCTabWidget = new SCTabWidget(this.f23425a, kVar, list);
            sCTabWidget.setTabHost(this);
            this.f23427c = sCTabWidget;
        }
        int i = 0;
        if (!kVar.mo17687f() || kVar.mo17686e()) {
            this.f23427c.setStripEnabled(false);
        }
        this.f23427c.setId(16908307);
        this.f23427c.setOrientation(0);
        if (kVar.mo17686e()) {
            i = this.f23426b.getChildCount();
        }
        this.f23426b.addView(this.f23427c, i);
    }

    /* renamed from: c */
    private void m32167c() {
        TabWidget tabWidget = getTabWidget();
        for (int i = 0; i < tabWidget.getChildCount(); i++) {
            View childAt = tabWidget.getChildAt(i);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int a = C6619m.m32014a(this.f23425a, 6.0f);
                if (linearLayout.getPaddingLeft() > a || linearLayout.getPaddingRight() > a || linearLayout.getPaddingLeft() == 0 || linearLayout.getPaddingRight() == 0) {
                    linearLayout.setPadding(a, linearLayout.getPaddingTop(), a, linearLayout.getPaddingBottom());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20685a() {
        this.f23427c.setVisibility(0);
    }

    @Deprecated
    /* renamed from: a */
    public void mo20666a(Context context, C0374l lVar, int i) {
        setup();
    }

    /* renamed from: a */
    public void mo20686a(Context context, C0374l lVar, int i, C5390k kVar, List<C5389j> list) {
        this.f23428d = kVar;
        m32164a(i, kVar);
        m32166a(kVar, list);
        super.mo20666a(context, lVar, i);
    }

    /* renamed from: a */
    public void mo20667a(TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        super.mo20667a(tabSpec, cls, bundle);
        if (this.f23428d.mo17687f() && VERSION.SDK_INT >= 11 && C6619m.m32018b(this.f23425a, (float) C6619m.m32022d(this.f23425a)) < 600) {
            m32167c();
        }
    }

    /* renamed from: b */
    public void mo20687b() {
        this.f23427c.setVisibility(8);
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context, FragmentManager and NavigationItems");
    }
}
