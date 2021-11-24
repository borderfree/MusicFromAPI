package com.seattleclouds.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.C0623p;
import android.support.p009v4.view.ViewPager;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5389j;
import com.seattleclouds.C5390k;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6619m;
import java.util.List;

public class SCTabWidget extends TabWidget {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f23429a;

    /* renamed from: b */
    private boolean f23430b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f23431c = true;

    /* renamed from: d */
    private RelativeLayout f23432d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TabHost f23433e;

    /* renamed from: f */
    private ViewPager f23434f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6666b f23435g;

    /* renamed from: h */
    private ImageView f23436h;

    /* renamed from: i */
    private C5390k f23437i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C5389j> f23438j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Typeface f23439k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f23440l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f23441m;

    /* renamed from: n */
    private int f23442n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f23443o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f23444p = 5;

    /* renamed from: q */
    private int f23445q = 5;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f23446r;

    /* renamed from: s */
    private int f23447s = Integer.MAX_VALUE;

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
        int f23450a;

        /* renamed from: b */
        int f23451b;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f23450a = parcel.readInt();
            this.f23451b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23450a);
            parcel.writeInt(this.f23451b);
        }
    }

    /* renamed from: com.seattleclouds.widget.SCTabWidget$a */
    private class C6665a implements OnClickListener {

        /* renamed from: b */
        private int f23453b;

        /* renamed from: c */
        private int f23454c;

        public C6665a(int i, int i2) {
            this.f23453b = i;
            this.f23454c = i2;
        }

        public void onClick(View view) {
            int a = SCTabWidget.this.f23443o;
            SCTabWidget.this.f23443o = SCTabWidget.this.m32174a(this.f23453b, this.f23454c);
            if (a != SCTabWidget.this.f23443o) {
                SCTabWidget.this.f23435g.mo20702a(a);
                SCTabWidget.this.f23435g.mo20702a(SCTabWidget.this.f23443o);
            }
            SCTabWidget.this.f23433e.setCurrentTab(SCTabWidget.this.f23443o);
        }
    }

    /* renamed from: com.seattleclouds.widget.SCTabWidget$b */
    private class C6666b extends C0623p {

        /* renamed from: b */
        private SparseArray<View> f23456b;

        private C6666b() {
            this.f23456b = new SparseArray<>(SCTabWidget.this.f23444p);
        }

        /* renamed from: a */
        public Object mo2476a(View view, int i) {
            LinearLayout linearLayout = new LinearLayout(SCTabWidget.this.f23429a);
            linearLayout.setOrientation(0);
            int b = SCTabWidget.this.m32173a(i);
            if (!SCTabWidget.this.f23431c) {
                View view2 = new View(SCTabWidget.this.f23429a);
                view2.setBackgroundColor(0);
                linearLayout.addView(view2, new LayoutParams(-1, -1, 1.0f));
            }
            for (int i2 = 0; i2 < b; i2++) {
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(SCTabWidget.this.f23429a).inflate(C5460i.view_sc_tab_indicator, linearLayout, false);
                relativeLayout.setId(SCTabWidget.this.getNextViewId());
                if (!SCTabWidget.this.f23431c) {
                    relativeLayout.setLayoutParams(new LayoutParams(C6619m.m32014a(SCTabWidget.this.f23429a, 85.0f), -1, 0.0f));
                }
                int a = SCTabWidget.this.m32174a(i, i2);
                this.f23456b.put(a, relativeLayout);
                TextView textView = (TextView) relativeLayout.findViewById(C5458g.tab_title);
                if (SCTabWidget.this.f23446r > 1) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams.bottomMargin += C6619m.m32014a(SCTabWidget.this.f23429a, 10.0f);
                    textView.setLayoutParams(layoutParams);
                }
                String a2 = ((C5389j) SCTabWidget.this.f23438j.get(a)).mo17653a();
                if (a2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("tab ");
                    sb.append(a + 1);
                    a2 = sb.toString();
                }
                if ((SCTabWidget.this.f23440l & 2) != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a2);
                    sb2.append(" ");
                    a2 = sb2.toString();
                }
                textView.setText(a2);
                textView.setTypeface(SCTabWidget.this.f23439k, SCTabWidget.this.f23440l);
                textView.setTextSize(SCTabWidget.this.f23441m);
                mo20702a(a);
                relativeLayout.setOnClickListener(new C6665a(i, i2));
                linearLayout.addView(relativeLayout);
            }
            if (!SCTabWidget.this.f23431c) {
                View view3 = new View(SCTabWidget.this.f23429a);
                view3.setBackgroundColor(0);
                linearLayout.addView(view3, new LayoutParams(-1, -1, 1.0f));
            }
            linearLayout.setId(SCTabWidget.this.getNextViewId());
            ((ViewPager) view).addView(linearLayout);
            return linearLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
            if (r6 == null) goto L_0x008b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20702a(int r6) {
            /*
                r5 = this;
                android.util.SparseArray<android.view.View> r0 = r5.f23456b
                java.lang.Object r0 = r0.get(r6)
                android.view.View r0 = (android.view.View) r0
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                com.seattleclouds.widget.SCTabWidget r1 = com.seattleclouds.widget.SCTabWidget.this
                java.util.List r1 = r1.f23438j
                java.lang.Object r1 = r1.get(r6)
                com.seattleclouds.j r1 = (com.seattleclouds.C5389j) r1
                if (r1 != 0) goto L_0x001a
                return
            L_0x001a:
                int r2 = com.seattleclouds.C5451m.C5458g.tab_icon
                android.view.View r2 = r0.findViewById(r2)
                android.widget.ImageView r2 = (android.widget.ImageView) r2
                int r3 = com.seattleclouds.C5451m.C5458g.tab_title
                android.view.View r3 = r0.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                com.seattleclouds.widget.SCTabWidget r4 = com.seattleclouds.widget.SCTabWidget.this
                int r4 = r4.f23443o
                if (r4 != r6) goto L_0x0070
                java.lang.String r6 = r1.mo17670i()
                android.graphics.drawable.BitmapDrawable r6 = com.seattleclouds.App.m25660k(r6)
                if (r6 != 0) goto L_0x0044
                java.lang.String r6 = r1.mo17669h()
                android.graphics.drawable.BitmapDrawable r6 = com.seattleclouds.App.m25660k(r6)
            L_0x0044:
                r0.setBackgroundDrawable(r6)
                if (r6 != 0) goto L_0x005e
                java.lang.Integer r6 = r1.mo17668g()
                if (r6 != 0) goto L_0x0057
                int r6 = r1.mo17667f()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            L_0x0057:
                int r6 = r6.intValue()
                r0.setBackgroundColor(r6)
            L_0x005e:
                int r6 = r1.mo17665e()
                r3.setTextColor(r6)
                java.lang.String r6 = r1.mo17660c()
                android.graphics.drawable.BitmapDrawable r6 = com.seattleclouds.App.m25660k(r6)
                if (r6 != 0) goto L_0x0093
                goto L_0x008b
            L_0x0070:
                java.lang.String r6 = r1.mo17669h()
                android.graphics.drawable.BitmapDrawable r6 = com.seattleclouds.App.m25660k(r6)
                r0.setBackgroundDrawable(r6)
                if (r6 != 0) goto L_0x0084
                int r6 = r1.mo17667f()
                r0.setBackgroundColor(r6)
            L_0x0084:
                int r6 = r1.mo17663d()
                r3.setTextColor(r6)
            L_0x008b:
                java.lang.String r6 = r1.mo17657b()
                android.graphics.drawable.BitmapDrawable r6 = com.seattleclouds.App.m25660k(r6)
            L_0x0093:
                r2.setImageDrawable(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.widget.SCTabWidget.C6666b.mo20702a(int):void");
        }

        /* renamed from: a */
        public void mo2479a(View view, int i, Object obj) {
            ((ViewPager) view).removeView((LinearLayout) obj);
            int b = SCTabWidget.this.m32173a(i);
            for (int i2 = 0; i2 < b; i2++) {
                this.f23456b.remove(SCTabWidget.this.m32174a(i, i2));
            }
        }

        /* renamed from: a */
        public boolean mo1660a(View view, Object obj) {
            return view == ((LinearLayout) obj);
        }

        /* renamed from: b */
        public int mo2480b() {
            return SCTabWidget.this.f23446r;
        }
    }

    public SCTabWidget(Context context, C5390k kVar, List<C5389j> list) {
        super(context);
        m32180a(context, kVar, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m32173a(int i) {
        int i2 = this.f23445q;
        if (i == this.f23446r - 1) {
            int i3 = this.f23444p % this.f23445q;
            if (i3 != 0) {
                return i3;
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m32174a(int i, int i2) {
        return (i * this.f23445q) + i2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.viewpagerindicator.a] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [com.viewpagerindicator.LinePageIndicator, com.seattleclouds.widget.SCTabWidget$2] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.viewpagerindicator.CirclePageIndicator, com.seattleclouds.widget.SCTabWidget$1] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m32178a(int r5, android.support.p009v4.view.ViewPager r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            if (r5 != 0) goto L_0x001a
            com.seattleclouds.widget.SCTabWidget$1 r5 = new com.seattleclouds.widget.SCTabWidget$1
            android.content.Context r3 = r4.f23429a
            r5.<init>(r3)
            android.content.Context r3 = r4.f23429a
            int r1 = com.seattleclouds.util.C6619m.m32014a(r3, r1)
            r5.setPadding(r2, r1, r2, r1)
            r5.setSnap(r0)
            goto L_0x0036
        L_0x001a:
            if (r5 != r0) goto L_0x0035
            com.seattleclouds.widget.SCTabWidget$2 r5 = new com.seattleclouds.widget.SCTabWidget$2
            android.content.Context r0 = r4.f23429a
            r5.<init>(r0)
            android.content.Context r0 = r4.f23429a
            int r0 = com.seattleclouds.util.C6619m.m32014a(r0, r1)
            android.content.Context r1 = r4.f23429a
            r3 = 1082130432(0x40800000, float:4.0)
            int r1 = com.seattleclouds.util.C6619m.m32014a(r1, r3)
            r5.setPadding(r2, r0, r2, r1)
            goto L_0x0036
        L_0x0035:
            r5 = 0
        L_0x0036:
            r5.setViewPager(r6)
            android.view.View r5 = (android.view.View) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.widget.SCTabWidget.m32178a(int, android.support.v4.view.ViewPager):android.view.View");
    }

    /* renamed from: a */
    private void m32179a() {
        this.f23432d.removeAllViews();
        if (this.f23437i != null) {
            this.f23432d.setBackgroundColor(this.f23437i.mo17671a());
            BitmapDrawable k = App.m25660k(this.f23437i.mo17676b());
            if (k != null) {
                this.f23436h = new ImageView(this.f23429a);
                this.f23436h.setScaleType(ScaleType.MATRIX);
                this.f23436h.setImageMatrix(new Matrix());
                this.f23436h.setImageDrawable(k);
                this.f23436h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f23432d.addView(this.f23436h);
            }
            this.f23439k = App.m25664m(this.f23437i.mo17689h());
            this.f23440l = this.f23437i.mo17690i();
            this.f23441m = this.f23437i.mo17691j();
            if (this.f23438j != null) {
                if (C6619m.m32018b(this.f23429a, (float) C6619m.m32022d(this.f23429a)) >= 500) {
                    this.f23430b = true;
                    this.f23431c = false;
                }
                this.f23445q = this.f23430b ? this.f23437i.mo17693l() : this.f23437i.mo17692k();
                this.f23444p = this.f23438j.size();
                this.f23446r = this.f23444p / this.f23445q;
                if (this.f23444p % this.f23445q != 0) {
                    this.f23446r++;
                }
                LayoutParams layoutParams = new LayoutParams(-1, C6619m.m32014a(this.f23429a, (float) getFinalWidgetHeight()), 0.0f);
                layoutParams.bottomMargin = C6619m.m32014a(this.f23429a, (float) this.f23437i.mo17680c()) * -1;
                setLayoutParams(layoutParams);
                this.f23434f = new ViewPager(this.f23429a);
                this.f23435g = new C6666b();
                this.f23434f.setAdapter(this.f23435g);
                this.f23434f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f23432d.addView(this.f23434f);
                if (this.f23446r > 1) {
                    View a = m32178a(0, this.f23434f);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(12);
                    a.setLayoutParams(layoutParams2);
                    this.f23432d.addView(a);
                }
            }
        }
    }

    /* renamed from: a */
    private void m32180a(Context context, C5390k kVar, List<C5389j> list) {
        this.f23429a = context;
        this.f23437i = kVar;
        this.f23438j = list;
        this.f23432d = new RelativeLayout(this.f23429a);
        this.f23432d.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.f23432d, 0, new LayoutParams(-1, -1));
        if (this.f23437i != null) {
            setLayoutParams(new LayoutParams(-1, C6619m.m32014a(this.f23429a, (float) this.f23437i.mo17683d()), 0.0f));
            if (this.f23438j != null) {
                m32179a();
            }
        }
    }

    private int getFinalWidgetHeight() {
        if (this.f23438j == null || this.f23437i == null) {
            return 0;
        }
        return this.f23446r > 1 ? this.f23437i.mo17683d() + 10 : this.f23437i.mo17683d();
    }

    /* access modifiers changed from: private */
    public int getNextViewId() {
        int i = this.f23447s - 1;
        this.f23447s = i;
        return i;
    }

    public void addView(View view) {
        super.addView(view);
        view.setVisibility(8);
    }

    public TabHost getTabHost() {
        return this.f23433e;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f23436h != null) {
            int intrinsicWidth = this.f23436h.getDrawable().getIntrinsicWidth();
            Matrix imageMatrix = this.f23436h.getImageMatrix();
            imageMatrix.setTranslate((float) ((int) ((((float) (getMeasuredWidth() - intrinsicWidth)) * 0.5f) + 0.5f)), 0.0f);
            this.f23436h.setImageMatrix(imageMatrix);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f23442n = savedState.f23450a;
        this.f23443o = savedState.f23451b;
        this.f23434f.setCurrentItem(this.f23442n);
        this.f23435g.mo20702a(this.f23443o);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23450a = this.f23434f.getCurrentItem();
        savedState.f23451b = this.f23443o;
        return savedState;
    }

    public void setTabHost(TabHost tabHost) {
        this.f23433e = tabHost;
    }
}
