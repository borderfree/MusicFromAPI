package com.seattleclouds;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0152d;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0394o;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.ViewPager.C0573f;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C5451m.C5463l;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.widget.SCViewPager;

public class TabsAppActivity extends C5326d {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f18587n = "TabsAppActivity";

    /* renamed from: o */
    private SCViewPager f18588o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TabLayout f18589p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public OnGlobalLayoutListener f18590q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f18591r = 0;

    /* renamed from: com.seattleclouds.TabsAppActivity$a */
    private class C5226a extends C0394o {
        public C5226a(C0374l lVar) {
            super(lVar);
        }

        /* renamed from: a */
        public Fragment mo1655a(int i) {
            TabsAppActivity tabsAppActivity = TabsAppActivity.this;
            String s = TabsAppActivity.f18587n;
            StringBuilder sb = new StringBuilder();
            sb.append("Creating fragment #");
            sb.append(i);
            tabsAppActivity.m25768a(s, sb.toString());
            FragmentInfo a = TabsAppActivity.this.mo16878a(C5326d.m26668c(i));
            return Fragment.m1271a((Context) TabsAppActivity.this, a.mo16867a(), a.mo16869b());
        }

        /* renamed from: b */
        public int mo2480b() {
            return App.f18501c.mo16942d().size();
        }

        /* renamed from: c */
        public CharSequence mo2484c(int i) {
            String a = ((C5389j) App.f18501c.mo16942d().get(i)).mo17653a();
            if (!C6592al.m31910c(a)) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(TabsAppActivity.this.getString(C5462k.tab));
            sb.append(" ");
            sb.append(i + 1);
            return sb.toString();
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m25765a(TabsAppActivity tabsAppActivity) {
        int i = tabsAppActivity.f18591r + 1;
        tabsAppActivity.f18591r = i;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25768a(String str, String str2) {
    }

    /* renamed from: c */
    public void mo16897c(boolean z) {
        this.f18588o.setScrollingEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo16842m() {
        setContentView(C5460i.activity_app_tabs);
        this.f18588o = (SCViewPager) findViewById(C5458g.view_pager);
        this.f18588o.setAdapter(new C5226a(mo1469g()));
        this.f18589p = (TabLayout) findViewById(C5458g.tabs);
        C5334b.m26765a(mo19778o(), this.f18589p);
        this.f18589p.setTabMode(0);
        this.f18589p.setTabGravity(0);
        this.f18589p.setupWithViewPager(this.f18588o);
        boolean z = false;
        for (int i = 0; i < this.f18589p.getTabCount(); i++) {
            C5389j jVar = (C5389j) App.f18501c.mo16942d().get(i);
            if (C6592al.m31910c(jVar.mo17653a())) {
                BitmapDrawable k = App.m25660k(jVar.mo17657b());
                if (k != null) {
                    C0152d tabAt = this.f18589p.getTabAt(i);
                    tabAt.mo727a((Drawable) k);
                    tabAt.mo729a((CharSequence) null);
                    z = true;
                }
            }
        }
        C5334b.m26765a(mo19778o(), this.f18589p);
        if (z) {
            this.f18588o.setCurrentItem(1);
            this.f18588o.setCurrentItem(0);
        }
        this.f18590q = new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                boolean z;
                if (TabsAppActivity.m25765a(TabsAppActivity.this) > 5 || !(TabsAppActivity.this.f18589p.getChildAt(0) instanceof LinearLayout)) {
                    C6611g.m31979a(TabsAppActivity.this.f18589p.getViewTreeObserver(), TabsAppActivity.this.f18590q);
                    TabsAppActivity.this.f18590q = null;
                    return;
                }
                LinearLayout linearLayout = (LinearLayout) TabsAppActivity.this.f18589p.getChildAt(0);
                Configuration configuration = TabsAppActivity.this.getResources().getConfiguration();
                int childCount = linearLayout.getChildCount() - 1;
                if (VERSION.SDK_INT >= 17 && configuration.getLayoutDirection() == 1) {
                    childCount = 0;
                }
                View childAt = linearLayout.getChildAt(childCount);
                int i = 0;
                while (true) {
                    if (i >= linearLayout.getChildCount()) {
                        z = false;
                        break;
                    }
                    View childAt2 = linearLayout.getChildAt(i);
                    if (childAt2 instanceof ViewGroup) {
                        View childAt3 = ((ViewGroup) childAt2).getChildAt(1);
                        if (!(childAt3 instanceof TextView)) {
                            continue;
                        } else {
                            TextView textView = (TextView) childAt3;
                            if (TabsAppActivity.this.f18591r == 1) {
                                C6611g.m31977a((Context) TabsAppActivity.this, C5463l.TabIndicatorText, textView);
                            }
                            Layout layout = textView.getLayout();
                            if (layout != null) {
                                int lineCount = layout.getLineCount();
                                if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                                    z = true;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i++;
                }
                if (childAt.getX() + ((float) childAt.getMeasuredWidth()) > ((float) C6619m.m32017b(TabsAppActivity.this)) || z) {
                    if (TabsAppActivity.this.f18589p.getTabMode() != 0) {
                        TabsAppActivity.this.f18589p.setTabMode(0);
                        C6611g.m31979a(TabsAppActivity.this.f18589p.getViewTreeObserver(), TabsAppActivity.this.f18590q);
                        TabsAppActivity.this.f18590q = null;
                    }
                } else if (TabsAppActivity.this.f18589p.getTabMode() != 1) {
                    TabsAppActivity.this.f18589p.setTabMode(1);
                }
            }
        };
        this.f18589p.getViewTreeObserver().addOnGlobalLayoutListener(this.f18590q);
        this.f18588o.mo2253a((C0573f) new C0573f() {

            /* renamed from: b */
            private boolean f18594b = true;

            /* renamed from: a */
            public void mo742a(int i) {
            }

            /* renamed from: a */
            public void mo743a(int i, float f, int i2) {
            }

            /* renamed from: b */
            public void mo744b(int i) {
                if (TabsAppActivity.this.f18590q != null && !this.f18594b) {
                    C6611g.m31979a(TabsAppActivity.this.f18589p.getViewTreeObserver(), TabsAppActivity.this.f18590q);
                    TabsAppActivity.this.f18590q = null;
                }
                this.f18594b = false;
                TabsAppActivity.this.mo17482b(C5326d.m26668c(i));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C6600as.m31946a(this);
    }

    /* renamed from: q */
    public void mo16887q() {
        this.f18589p.setVisibility(0);
    }

    /* renamed from: r */
    public void mo16888r() {
        this.f18589p.setVisibility(8);
    }
}
