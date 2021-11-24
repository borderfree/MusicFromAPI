package android.support.p023v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.n */
public class C0869n {

    /* renamed from: a */
    private final Context f2700a;

    /* renamed from: b */
    private final C0855h f2701b;

    /* renamed from: c */
    private final boolean f2702c;

    /* renamed from: d */
    private final int f2703d;

    /* renamed from: e */
    private final int f2704e;

    /* renamed from: f */
    private View f2705f;

    /* renamed from: g */
    private int f2706g;

    /* renamed from: h */
    private boolean f2707h;

    /* renamed from: i */
    private C0872a f2708i;

    /* renamed from: j */
    private C0868m f2709j;

    /* renamed from: k */
    private OnDismissListener f2710k;

    /* renamed from: l */
    private final OnDismissListener f2711l;

    public C0869n(Context context, C0855h hVar, View view, boolean z, int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C0869n(Context context, C0855h hVar, View view, boolean z, int i, int i2) {
        this.f2706g = 8388611;
        this.f2711l = new OnDismissListener() {
            public void onDismiss() {
                C0869n.this.mo3686e();
            }
        };
        this.f2700a = context;
        this.f2701b = hVar;
        this.f2705f = view;
        this.f2702c = z;
        this.f2703d = i;
        this.f2704e = i2;
    }

    /* renamed from: a */
    private void m4211a(int i, int i2, boolean z, boolean z2) {
        C0868m b = mo3683b();
        b.mo3439c(z2);
        if (z) {
            if ((C0604d.m2741a(this.f2706g, C0626s.m2861e(this.f2705f)) & 7) == 5) {
                i += this.f2705f.getWidth();
            }
            b.mo3436b(i);
            b.mo3438c(i2);
            int i3 = (int) ((this.f2700a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo3673a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.mo3440d();
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [android.support.v7.view.menu.m] */
    /* JADX WARNING: type inference failed for: r7v0, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.t] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.e] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [android.support.v7.view.menu.t]
      assigns: [android.support.v7.view.menu.t, android.support.v7.view.menu.e]
      uses: [android.support.v7.view.menu.t, android.support.v7.view.menu.m, android.support.v7.view.menu.e]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p023v7.view.menu.C0868m m4212g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f2700a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f2700a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = android.support.p023v7.p024a.C0726a.C0730d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            android.support.v7.view.menu.e r0 = new android.support.v7.view.menu.e
            android.content.Context r2 = r14.f2700a
            android.view.View r3 = r14.f2705f
            int r4 = r14.f2703d
            int r5 = r14.f2704e
            boolean r6 = r14.f2702c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            android.support.v7.view.menu.t r0 = new android.support.v7.view.menu.t
            android.content.Context r8 = r14.f2700a
            android.support.v7.view.menu.h r9 = r14.f2701b
            android.view.View r10 = r14.f2705f
            int r11 = r14.f2703d
            int r12 = r14.f2704e
            boolean r13 = r14.f2702c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            android.support.v7.view.menu.h r1 = r14.f2701b
            r0.mo3433a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f2711l
            r0.mo3435a(r1)
            android.view.View r1 = r14.f2705f
            r0.mo3434a(r1)
            android.support.v7.view.menu.o$a r1 = r14.f2708i
            r0.mo323a(r1)
            boolean r1 = r14.f2707h
            r0.mo3437b(r1)
            int r1 = r14.f2706g
            r0.mo3432a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.view.menu.C0869n.m4212g():android.support.v7.view.menu.m");
    }

    /* renamed from: a */
    public void mo3676a() {
        if (!mo3684c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo3677a(int i) {
        this.f2706g = i;
    }

    /* renamed from: a */
    public void mo3678a(C0872a aVar) {
        this.f2708i = aVar;
        if (this.f2709j != null) {
            this.f2709j.mo323a(aVar);
        }
    }

    /* renamed from: a */
    public void mo3679a(View view) {
        this.f2705f = view;
    }

    /* renamed from: a */
    public void mo3680a(OnDismissListener onDismissListener) {
        this.f2710k = onDismissListener;
    }

    /* renamed from: a */
    public void mo3681a(boolean z) {
        this.f2707h = z;
        if (this.f2709j != null) {
            this.f2709j.mo3437b(z);
        }
    }

    /* renamed from: a */
    public boolean mo3682a(int i, int i2) {
        if (mo3687f()) {
            return true;
        }
        if (this.f2705f == null) {
            return false;
        }
        m4211a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public C0868m mo3683b() {
        if (this.f2709j == null) {
            this.f2709j = m4212g();
        }
        return this.f2709j;
    }

    /* renamed from: c */
    public boolean mo3684c() {
        if (mo3687f()) {
            return true;
        }
        if (this.f2705f == null) {
            return false;
        }
        m4211a(0, 0, false, false);
        return true;
    }

    /* renamed from: d */
    public void mo3685d() {
        if (mo3687f()) {
            this.f2709j.mo3441e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo3686e() {
        this.f2709j = null;
        if (this.f2710k != null) {
            this.f2710k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean mo3687f() {
        return this.f2709j != null && this.f2709j.mo3442f();
    }
}
