package com.seattleclouds.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0374l;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import java.util.ArrayList;

public class FragmentTabHostCompat extends TabHost implements OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C6661b> f23408a = new ArrayList<>();

    /* renamed from: b */
    private FrameLayout f23409b;

    /* renamed from: c */
    private Context f23410c;

    /* renamed from: d */
    private C0374l f23411d;

    /* renamed from: e */
    private int f23412e;

    /* renamed from: f */
    private OnTabChangeListener f23413f;

    /* renamed from: g */
    private C6661b f23414g;

    /* renamed from: h */
    private boolean f23415h;

    /* renamed from: i */
    private boolean f23416i = true;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        String f23417a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23417a = parcel.readString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.f23417a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f23417a);
        }
    }

    /* renamed from: com.seattleclouds.widget.FragmentTabHostCompat$a */
    static class C6660a implements TabContentFactory {

        /* renamed from: a */
        private final Context f23418a;

        public C6660a(Context context) {
            this.f23418a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f23418a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* renamed from: com.seattleclouds.widget.FragmentTabHostCompat$b */
    static final class C6661b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f23419a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Class<?> f23420b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Bundle f23421c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Fragment f23422d;

        C6661b(String str, Class<?> cls, Bundle bundle) {
            this.f23419a = str;
            this.f23420b = cls;
            this.f23421c = bundle;
        }
    }

    public FragmentTabHostCompat(Context context) {
        super(context, null);
        m32149a(context, (AttributeSet) null);
    }

    public FragmentTabHostCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m32149a(context, attributeSet);
    }

    /* renamed from: a */
    private C0396q m32146a(String str, C0396q qVar) {
        C6661b bVar = null;
        for (int i = 0; i < this.f23408a.size(); i++) {
            C6661b bVar2 = (C6661b) this.f23408a.get(i);
            if (bVar2.f23419a.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            if (this.f23414g != bVar) {
                if (qVar == null) {
                    qVar = this.f23411d.mo1536a();
                }
                if (!(this.f23414g == null || this.f23414g.f23422d == null)) {
                    m32150a(qVar, this.f23414g.f23422d);
                }
                if (bVar != null) {
                    if (bVar.f23422d == null) {
                        bVar.f23422d = Fragment.m1271a(this.f23410c, bVar.f23420b.getName(), bVar.f23421c);
                        qVar.mo1411a(this.f23412e, bVar.f23422d, bVar.f23419a);
                    } else {
                        m32152b(qVar, bVar.f23422d);
                    }
                }
                this.f23414g = bVar;
            }
            return qVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No tab known for tag ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void mo20685a() {
        if (this.f23409b == null) {
            this.f23409b = (FrameLayout) findViewById(this.f23412e);
            if (this.f23409b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("No tab content FrameLayout found for id ");
                sb.append(this.f23412e);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private void m32148a(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f23409b = frameLayout2;
            this.f23409b.setId(this.f23412e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    /* renamed from: a */
    private void m32149a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f23412e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: a */
    private void m32150a(C0396q qVar, Fragment fragment) {
        if (this.f23416i) {
            qVar.mo1432d(fragment);
        } else {
            qVar.mo1424b(fragment);
        }
    }

    /* renamed from: a */
    private boolean m32151a(Fragment fragment) {
        return this.f23416i ? fragment.mo1327z() : fragment.mo1194D();
    }

    /* renamed from: b */
    private void m32152b(C0396q qVar, Fragment fragment) {
        if (this.f23416i) {
            qVar.mo1433e(fragment);
        } else {
            qVar.mo1429c(fragment);
        }
    }

    /* renamed from: a */
    public void mo20666a(Context context, C0374l lVar, int i) {
        m32148a(context);
        super.setup();
        this.f23410c = context;
        this.f23411d = lVar;
        this.f23412e = i;
        mo20685a();
        this.f23409b.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    /* renamed from: a */
    public void mo20667a(TabSpec tabSpec, Class<?> cls, Bundle bundle) {
        tabSpec.setContent(new C6660a(this.f23410c));
        String tag = tabSpec.getTag();
        C6661b bVar = new C6661b(tag, cls, bundle);
        if (this.f23415h) {
            bVar.f23422d = this.f23411d.mo1535a(tag);
            if (bVar.f23422d != null && !m32151a(bVar.f23422d)) {
                C0396q a = this.f23411d.mo1536a();
                m32150a(a, bVar.f23422d);
                a.mo1428c();
            }
        }
        this.f23408a.add(bVar);
        addTab(tabSpec);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        C0396q qVar = null;
        for (int i = 0; i < this.f23408a.size(); i++) {
            C6661b bVar = (C6661b) this.f23408a.get(i);
            bVar.f23422d = this.f23411d.mo1535a(bVar.f23419a);
            if (bVar.f23422d != null && !m32151a(bVar.f23422d)) {
                if (bVar.f23419a.equals(currentTabTag)) {
                    this.f23414g = bVar;
                } else {
                    if (qVar == null) {
                        qVar = this.f23411d.mo1536a();
                    }
                    m32150a(qVar, bVar.f23422d);
                }
            }
        }
        this.f23415h = true;
        C0396q a = m32146a(currentTabTag, qVar);
        if (a != null) {
            a.mo1428c();
            this.f23411d.mo1540b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23415h = false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f23417a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23417a = getCurrentTabTag();
        return savedState;
    }

    public void onTabChanged(String str) {
        if (this.f23415h) {
            C0396q a = m32146a(str, (C0396q) null);
            if (a != null) {
                a.mo1428c();
            }
        }
        if (this.f23413f != null) {
            this.f23413f.onTabChanged(str);
        }
    }

    public void setDestroyFragmentViewOnTabChange(boolean z) {
        this.f23416i = z;
    }

    public void setOnTabChangedListener(OnTabChangeListener onTabChangeListener) {
        this.f23413f = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
