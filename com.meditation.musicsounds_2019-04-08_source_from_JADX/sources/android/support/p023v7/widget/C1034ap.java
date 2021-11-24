package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0704m;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.menu.C0877s;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ap */
public class C1034ap implements C0877s {

    /* renamed from: a */
    private static Method f3581a;

    /* renamed from: b */
    private static Method f3582b;

    /* renamed from: h */
    private static Method f3583h;

    /* renamed from: A */
    private Drawable f3584A;

    /* renamed from: B */
    private OnItemClickListener f3585B;

    /* renamed from: C */
    private OnItemSelectedListener f3586C;

    /* renamed from: D */
    private final C1040d f3587D;

    /* renamed from: E */
    private final C1039c f3588E;

    /* renamed from: F */
    private final C1037a f3589F;

    /* renamed from: G */
    private Runnable f3590G;

    /* renamed from: H */
    private final Rect f3591H;

    /* renamed from: I */
    private Rect f3592I;

    /* renamed from: J */
    private boolean f3593J;

    /* renamed from: c */
    C1012ah f3594c;

    /* renamed from: d */
    int f3595d;

    /* renamed from: e */
    final C1041e f3596e;

    /* renamed from: f */
    final Handler f3597f;

    /* renamed from: g */
    PopupWindow f3598g;

    /* renamed from: i */
    private Context f3599i;

    /* renamed from: j */
    private ListAdapter f3600j;

    /* renamed from: k */
    private int f3601k;

    /* renamed from: l */
    private int f3602l;

    /* renamed from: m */
    private int f3603m;

    /* renamed from: n */
    private int f3604n;

    /* renamed from: o */
    private int f3605o;

    /* renamed from: p */
    private boolean f3606p;

    /* renamed from: q */
    private boolean f3607q;

    /* renamed from: r */
    private boolean f3608r;

    /* renamed from: s */
    private boolean f3609s;

    /* renamed from: t */
    private int f3610t;

    /* renamed from: u */
    private boolean f3611u;

    /* renamed from: v */
    private boolean f3612v;

    /* renamed from: w */
    private View f3613w;

    /* renamed from: x */
    private int f3614x;

    /* renamed from: y */
    private DataSetObserver f3615y;

    /* renamed from: z */
    private View f3616z;

    /* renamed from: android.support.v7.widget.ap$a */
    private class C1037a implements Runnable {
        C1037a() {
        }

        public void run() {
            C1034ap.this.mo5156m();
        }
    }

    /* renamed from: android.support.v7.widget.ap$b */
    private class C1038b extends DataSetObserver {
        C1038b() {
        }

        public void onChanged() {
            if (C1034ap.this.mo3442f()) {
                C1034ap.this.mo3440d();
            }
        }

        public void onInvalidated() {
            C1034ap.this.mo3441e();
        }
    }

    /* renamed from: android.support.v7.widget.ap$c */
    private class C1039c implements OnScrollListener {
        C1039c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C1034ap.this.mo5157n() && C1034ap.this.f3598g.getContentView() != null) {
                C1034ap.this.f3597f.removeCallbacks(C1034ap.this.f3596e);
                C1034ap.this.f3596e.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ap$d */
    private class C1040d implements OnTouchListener {
        C1040d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C1034ap.this.f3598g != null && C1034ap.this.f3598g.isShowing() && x >= 0 && x < C1034ap.this.f3598g.getWidth() && y >= 0 && y < C1034ap.this.f3598g.getHeight()) {
                C1034ap.this.f3597f.postDelayed(C1034ap.this.f3596e, 250);
            } else if (action == 1) {
                C1034ap.this.f3597f.removeCallbacks(C1034ap.this.f3596e);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ap$e */
    private class C1041e implements Runnable {
        C1041e() {
        }

        public void run() {
            if (C1034ap.this.f3594c != null && C0626s.m2883z(C1034ap.this.f3594c) && C1034ap.this.f3594c.getCount() > C1034ap.this.f3594c.getChildCount() && C1034ap.this.f3594c.getChildCount() <= C1034ap.this.f3595d) {
                C1034ap.this.f3598g.setInputMethodMode(2);
                C1034ap.this.mo3440d();
            }
        }
    }

    static {
        try {
            f3581a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f3582b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f3583h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C1034ap(Context context) {
        this(context, null, C0727a.listPopupWindowStyle);
    }

    public C1034ap(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C1034ap(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3601k = -2;
        this.f3602l = -2;
        this.f3605o = 1002;
        this.f3607q = true;
        this.f3610t = 0;
        this.f3611u = false;
        this.f3612v = false;
        this.f3595d = Integer.MAX_VALUE;
        this.f3614x = 0;
        this.f3596e = new C1041e();
        this.f3587D = new C1040d();
        this.f3588E = new C1039c();
        this.f3589F = new C1037a();
        this.f3591H = new Rect();
        this.f3599i = context;
        this.f3597f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.ListPopupWindow, i, i2);
        this.f3603m = obtainStyledAttributes.getDimensionPixelOffset(C0736j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f3604n = obtainStyledAttributes.getDimensionPixelOffset(C0736j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f3604n != 0) {
            this.f3606p = true;
        }
        obtainStyledAttributes.recycle();
        this.f3598g = new C1120p(context, attributeSet, i, i2);
        this.f3598g.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m5635a(View view, int i, boolean z) {
        if (f3582b != null) {
            try {
                return ((Integer) f3582b.invoke(this.f3598g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f3598g.getMaxAvailableHeight(view, i);
    }

    /* renamed from: a */
    private void mo3984a() {
        if (this.f3613w != null) {
            ViewParent parent = this.f3613w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3613w);
            }
        }
    }

    /* renamed from: b */
    private int mo3988b() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        View view;
        int i4;
        int i5;
        boolean z = true;
        if (this.f3594c == null) {
            Context context = this.f3599i;
            this.f3590G = new Runnable() {
                public void run() {
                    View i = C1034ap.this.mo5151i();
                    if (i != null && i.getWindowToken() != null) {
                        C1034ap.this.mo3440d();
                    }
                }
            };
            this.f3594c = mo5133a(context, !this.f3593J);
            if (this.f3584A != null) {
                this.f3594c.setSelector(this.f3584A);
            }
            this.f3594c.setAdapter(this.f3600j);
            this.f3594c.setOnItemClickListener(this.f3585B);
            this.f3594c.setFocusable(true);
            this.f3594c.setFocusableInTouchMode(true);
            this.f3594c.setOnItemSelectedListener(new OnItemSelectedListener() {
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        C1012ah ahVar = C1034ap.this.f3594c;
                        if (ahVar != null) {
                            ahVar.setListSelectionHidden(false);
                        }
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f3594c.setOnScrollListener(this.f3588E);
            if (this.f3586C != null) {
                this.f3594c.setOnItemSelectedListener(this.f3586C);
            }
            View view2 = this.f3594c;
            View view3 = this.f3613w;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                switch (this.f3614x) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid hint position ");
                        sb.append(this.f3614x);
                        Log.e("ListPopupWindow", sb.toString());
                        break;
                }
                if (this.f3602l >= 0) {
                    i5 = this.f3602l;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i5, i4), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f3598g.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f3598g.getContentView();
            View view4 = this.f3613w;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f3598g.getBackground();
        if (background != null) {
            background.getPadding(this.f3591H);
            i2 = this.f3591H.top + this.f3591H.bottom;
            if (!this.f3606p) {
                this.f3604n = -this.f3591H.top;
            }
        } else {
            this.f3591H.setEmpty();
            i2 = 0;
        }
        if (this.f3598g.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m5635a(mo5151i(), this.f3604n, z);
        if (this.f3611u || this.f3601k == -1) {
            return a + i2;
        }
        switch (this.f3602l) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f3599i.getResources().getDisplayMetrics().widthPixels - (this.f3591H.left + this.f3591H.right), Integer.MIN_VALUE);
                break;
            case -1:
                i3 = this.f3599i.getResources().getDisplayMetrics().widthPixels - (this.f3591H.left + this.f3591H.right);
                break;
            default:
                i3 = this.f3602l;
                break;
        }
        makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int a2 = this.f3594c.mo5035a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f3594c.getPaddingTop() + this.f3594c.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: c */
    private void mo5171c(boolean z) {
        if (f3581a != null) {
            try {
                f3581a.invoke(this.f3598g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1012ah mo5133a(Context context, boolean z) {
        return new C1012ah(context, z);
    }

    /* renamed from: a */
    public void mo5134a(int i) {
        this.f3614x = i;
    }

    /* renamed from: a */
    public void mo5135a(Rect rect) {
        this.f3592I = rect;
    }

    /* renamed from: a */
    public void mo5136a(Drawable drawable) {
        this.f3598g.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo5137a(OnItemClickListener onItemClickListener) {
        this.f3585B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo3985a(ListAdapter listAdapter) {
        if (this.f3615y == null) {
            this.f3615y = new C1038b();
        } else if (this.f3600j != null) {
            this.f3600j.unregisterDataSetObserver(this.f3615y);
        }
        this.f3600j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f3615y);
        }
        if (this.f3594c != null) {
            this.f3594c.setAdapter(this.f3600j);
        }
    }

    /* renamed from: a */
    public void mo5138a(OnDismissListener onDismissListener) {
        this.f3598g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo5139a(boolean z) {
        this.f3593J = z;
        this.f3598g.setFocusable(z);
    }

    /* renamed from: b */
    public void mo5140b(int i) {
        this.f3598g.setAnimationStyle(i);
    }

    /* renamed from: b */
    public void mo5141b(View view) {
        this.f3616z = view;
    }

    /* renamed from: b */
    public void mo5142b(boolean z) {
        this.f3609s = true;
        this.f3608r = z;
    }

    /* renamed from: c */
    public void mo5143c(int i) {
        this.f3603m = i;
    }

    /* renamed from: c */
    public boolean mo5144c() {
        return this.f3593J;
    }

    /* renamed from: d */
    public void mo3440d() {
        int b = mo3988b();
        boolean n = mo5157n();
        C0704m.m3314a(this.f3598g, this.f3605o);
        boolean z = true;
        if (!this.f3598g.isShowing()) {
            int i = this.f3602l == -1 ? -1 : this.f3602l == -2 ? mo5151i().getWidth() : this.f3602l;
            if (this.f3601k == -1) {
                b = -1;
            } else if (this.f3601k != -2) {
                b = this.f3601k;
            }
            this.f3598g.setWidth(i);
            this.f3598g.setHeight(b);
            mo5171c(true);
            this.f3598g.setOutsideTouchable(!this.f3612v && !this.f3611u);
            this.f3598g.setTouchInterceptor(this.f3587D);
            if (this.f3609s) {
                C0704m.m3316a(this.f3598g, this.f3608r);
            }
            if (f3583h != null) {
                try {
                    f3583h.invoke(this.f3598g, new Object[]{this.f3592I});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0704m.m3315a(this.f3598g, mo5151i(), this.f3603m, this.f3604n, this.f3610t);
            this.f3594c.setSelection(-1);
            if (!this.f3593J || this.f3594c.isInTouchMode()) {
                mo5156m();
            }
            if (!this.f3593J) {
                this.f3597f.post(this.f3589F);
            }
        } else if (C0626s.m2883z(mo5151i())) {
            int i2 = this.f3602l == -1 ? -1 : this.f3602l == -2 ? mo5151i().getWidth() : this.f3602l;
            if (this.f3601k == -1) {
                if (!n) {
                    b = -1;
                }
                if (n) {
                    this.f3598g.setWidth(this.f3602l == -1 ? -1 : 0);
                    this.f3598g.setHeight(0);
                } else {
                    this.f3598g.setWidth(this.f3602l == -1 ? -1 : 0);
                    this.f3598g.setHeight(-1);
                }
            } else if (this.f3601k != -2) {
                b = this.f3601k;
            }
            PopupWindow popupWindow = this.f3598g;
            if (this.f3612v || this.f3611u) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f3598g.update(mo5151i(), this.f3603m, this.f3604n, i2 < 0 ? -1 : i2, b < 0 ? -1 : b);
        }
    }

    /* renamed from: d */
    public void mo5145d(int i) {
        this.f3604n = i;
        this.f3606p = true;
    }

    /* renamed from: e */
    public void mo3441e() {
        this.f3598g.dismiss();
        mo3984a();
        this.f3598g.setContentView(null);
        this.f3594c = null;
        this.f3597f.removeCallbacks(this.f3596e);
    }

    /* renamed from: e */
    public void mo5146e(int i) {
        this.f3610t = i;
    }

    /* renamed from: f */
    public void mo5147f(int i) {
        this.f3602l = i;
    }

    /* renamed from: f */
    public boolean mo3442f() {
        return this.f3598g.isShowing();
    }

    /* renamed from: g */
    public ListView mo3443g() {
        return this.f3594c;
    }

    /* renamed from: g */
    public void mo5148g(int i) {
        Drawable background = this.f3598g.getBackground();
        if (background != null) {
            background.getPadding(this.f3591H);
            this.f3602l = this.f3591H.left + this.f3591H.right + i;
            return;
        }
        mo5147f(i);
    }

    /* renamed from: h */
    public Drawable mo5149h() {
        return this.f3598g.getBackground();
    }

    /* renamed from: h */
    public void mo5150h(int i) {
        this.f3598g.setInputMethodMode(i);
    }

    /* renamed from: i */
    public View mo5151i() {
        return this.f3616z;
    }

    /* renamed from: i */
    public void mo5152i(int i) {
        C1012ah ahVar = this.f3594c;
        if (mo3442f() && ahVar != null) {
            ahVar.setListSelectionHidden(false);
            ahVar.setSelection(i);
            if (ahVar.getChoiceMode() != 0) {
                ahVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: j */
    public int mo5153j() {
        return this.f3603m;
    }

    /* renamed from: k */
    public int mo5154k() {
        if (!this.f3606p) {
            return 0;
        }
        return this.f3604n;
    }

    /* renamed from: l */
    public int mo5155l() {
        return this.f3602l;
    }

    /* renamed from: m */
    public void mo5156m() {
        C1012ah ahVar = this.f3594c;
        if (ahVar != null) {
            ahVar.setListSelectionHidden(true);
            ahVar.requestLayout();
        }
    }

    /* renamed from: n */
    public boolean mo5157n() {
        return this.f3598g.getInputMethodMode() == 2;
    }
}
