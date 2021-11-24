package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.transition.C0294u.C0300c;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.at */
public abstract class C0253at extends C0294u {

    /* renamed from: g */
    private static final String[] f728g = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: h */
    private int f729h = 3;

    /* renamed from: android.support.transition.at$a */
    private static class C0255a extends AnimatorListenerAdapter implements C0261a, C0300c {

        /* renamed from: a */
        boolean f733a = false;

        /* renamed from: b */
        private final View f734b;

        /* renamed from: c */
        private final int f735c;

        /* renamed from: d */
        private final ViewGroup f736d;

        /* renamed from: e */
        private final boolean f737e;

        /* renamed from: f */
        private boolean f738f;

        C0255a(View view, int i, boolean z) {
            this.f734b = view;
            this.f735c = i;
            this.f736d = (ViewGroup) view.getParent();
            this.f737e = z;
            m1001a(true);
        }

        /* renamed from: a */
        private void m1000a() {
            if (!this.f733a) {
                C0244am.m944a(this.f734b, this.f735c);
                if (this.f736d != null) {
                    this.f736d.invalidate();
                }
            }
            m1001a(false);
        }

        /* renamed from: a */
        private void m1001a(boolean z) {
            if (this.f737e && this.f738f != z && this.f736d != null) {
                this.f738f = z;
                C0235af.m918a(this.f736d, z);
            }
        }

        /* renamed from: a */
        public void mo971a(C0294u uVar) {
            m1000a();
            uVar.mo1092b((C0300c) this);
        }

        /* renamed from: b */
        public void mo972b(C0294u uVar) {
            m1001a(false);
        }

        /* renamed from: c */
        public void mo973c(C0294u uVar) {
            m1001a(true);
        }

        /* renamed from: d */
        public void mo974d(C0294u uVar) {
        }

        public void onAnimationCancel(Animator animator) {
            this.f733a = true;
        }

        public void onAnimationEnd(Animator animator) {
            m1000a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f733a) {
                C0244am.m944a(this.f734b, this.f735c);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f733a) {
                C0244am.m944a(this.f734b, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: android.support.transition.at$b */
    private static class C0256b {

        /* renamed from: a */
        boolean f739a;

        /* renamed from: b */
        boolean f740b;

        /* renamed from: c */
        int f741c;

        /* renamed from: d */
        int f742d;

        /* renamed from: e */
        ViewGroup f743e;

        /* renamed from: f */
        ViewGroup f744f;

        private C0256b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r0.f742d == 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r0.f743e == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        if (r0.f741c == 0) goto L_0x00a1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.transition.C0253at.C0256b m988b(android.support.transition.C0230aa r7, android.support.transition.C0230aa r8) {
        /*
            r6 = this;
            android.support.transition.at$b r0 = new android.support.transition.at$b
            r1 = 0
            r0.<init>()
            r2 = 0
            r0.f739a = r2
            r0.f740b = r2
            r3 = -1
            if (r7 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.f689a
            java.lang.String r5 = "android:visibility:visibility"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.f689a
            java.lang.String r5 = "android:visibility:visibility"
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.f741c = r4
            java.util.Map<java.lang.String, java.lang.Object> r4 = r7.f689a
            java.lang.String r5 = "android:visibility:parent"
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f743e = r4
            goto L_0x0039
        L_0x0035:
            r0.f741c = r3
            r0.f743e = r1
        L_0x0039:
            if (r8 == 0) goto L_0x0060
            java.util.Map<java.lang.String, java.lang.Object> r4 = r8.f689a
            java.lang.String r5 = "android:visibility:visibility"
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L_0x0060
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f689a
            java.lang.String r3 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f742d = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r8.f689a
            java.lang.String r3 = "android:visibility:parent"
            java.lang.Object r1 = r1.get(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0062
        L_0x0060:
            r0.f742d = r3
        L_0x0062:
            r0.f744f = r1
            r1 = 1
            if (r7 == 0) goto L_0x0090
            if (r8 == 0) goto L_0x0090
            int r7 = r0.f741c
            int r8 = r0.f742d
            if (r7 != r8) goto L_0x0076
            android.view.ViewGroup r7 = r0.f743e
            android.view.ViewGroup r8 = r0.f744f
            if (r7 != r8) goto L_0x0076
            return r0
        L_0x0076:
            int r7 = r0.f741c
            int r8 = r0.f742d
            if (r7 == r8) goto L_0x0086
            int r7 = r0.f741c
            if (r7 != 0) goto L_0x0081
            goto L_0x00a1
        L_0x0081:
            int r7 = r0.f742d
            if (r7 != 0) goto L_0x00a4
            goto L_0x0096
        L_0x0086:
            android.view.ViewGroup r7 = r0.f744f
            if (r7 != 0) goto L_0x008b
            goto L_0x00a1
        L_0x008b:
            android.view.ViewGroup r7 = r0.f743e
            if (r7 != 0) goto L_0x00a4
            goto L_0x0096
        L_0x0090:
            if (r7 != 0) goto L_0x009b
            int r7 = r0.f742d
            if (r7 != 0) goto L_0x009b
        L_0x0096:
            r0.f740b = r1
        L_0x0098:
            r0.f739a = r1
            goto L_0x00a4
        L_0x009b:
            if (r8 != 0) goto L_0x00a4
            int r7 = r0.f741c
            if (r7 != 0) goto L_0x00a4
        L_0x00a1:
            r0.f740b = r2
            goto L_0x0098
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0253at.m988b(android.support.transition.aa, android.support.transition.aa):android.support.transition.at$b");
    }

    /* renamed from: d */
    private void m989d(C0230aa aaVar) {
        aaVar.f689a.put("android:visibility:visibility", Integer.valueOf(aaVar.f690b.getVisibility()));
        aaVar.f689a.put("android:visibility:parent", aaVar.f690b.getParent());
        int[] iArr = new int[2];
        aaVar.f690b.getLocationOnScreen(iArr);
        aaVar.f689a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: a */
    public Animator mo1013a(ViewGroup viewGroup, C0230aa aaVar, int i, C0230aa aaVar2, int i2) {
        if ((this.f729h & 1) != 1 || aaVar2 == null) {
            return null;
        }
        if (aaVar == null) {
            View view = (View) aaVar2.f690b.getParent();
            if (m988b(mo1090b(view, false), mo1078a(view, false)).f739a) {
                return null;
            }
        }
        return mo1015a(viewGroup, aaVar2.f690b, aaVar, aaVar2);
    }

    /* renamed from: a */
    public Animator mo1014a(ViewGroup viewGroup, C0230aa aaVar, C0230aa aaVar2) {
        C0256b b = m988b(aaVar, aaVar2);
        if (!b.f739a || (b.f743e == null && b.f744f == null)) {
            return null;
        }
        if (b.f740b) {
            return mo1013a(viewGroup, aaVar, b.f741c, aaVar2, b.f742d);
        }
        return mo1020b(viewGroup, aaVar, b.f741c, aaVar2, b.f742d);
    }

    /* renamed from: a */
    public Animator mo1015a(ViewGroup viewGroup, View view, C0230aa aaVar, C0230aa aaVar2) {
        return null;
    }

    /* renamed from: a */
    public void mo1016a(int i) {
        if ((i & -4) == 0) {
            this.f729h = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: a */
    public void mo1017a(C0230aa aaVar) {
        m989d(aaVar);
    }

    /* renamed from: a */
    public boolean mo1018a(C0230aa aaVar, C0230aa aaVar2) {
        boolean z = false;
        if (aaVar == null && aaVar2 == null) {
            return false;
        }
        if (aaVar != null && aaVar2 != null && aaVar2.f689a.containsKey("android:visibility:visibility") != aaVar.f689a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C0256b b = m988b(aaVar, aaVar2);
        if (b.f739a && (b.f741c == 0 || b.f742d == 0)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public String[] mo1019a() {
        return f728g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        if (r6.f816e != false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo1020b(android.view.ViewGroup r7, android.support.transition.C0230aa r8, int r9, android.support.transition.C0230aa r10, int r11) {
        /*
            r6 = this;
            int r9 = r6.f729h
            r0 = 2
            r9 = r9 & r0
            r1 = 0
            if (r9 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r8 == 0) goto L_0x000d
            android.view.View r9 = r8.f690b
            goto L_0x000e
        L_0x000d:
            r9 = r1
        L_0x000e:
            if (r10 == 0) goto L_0x0013
            android.view.View r2 = r10.f690b
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r3 = 1
            if (r2 == 0) goto L_0x0026
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            r4 = 4
            if (r11 != r4) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            if (r9 != r2) goto L_0x0029
        L_0x0024:
            r9 = r1
            goto L_0x0073
        L_0x0026:
            if (r2 == 0) goto L_0x002b
            r9 = r2
        L_0x0029:
            r2 = r1
            goto L_0x0073
        L_0x002b:
            if (r9 == 0) goto L_0x0071
            android.view.ViewParent r2 = r9.getParent()
            if (r2 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0071
            android.view.ViewParent r2 = r9.getParent()
            android.view.View r2 = (android.view.View) r2
            android.support.transition.aa r4 = r6.mo1078a(r2, r3)
            android.support.transition.aa r5 = r6.mo1090b(r2, r3)
            android.support.transition.at$b r4 = r6.m988b(r4, r5)
            boolean r4 = r4.f739a
            if (r4 != 0) goto L_0x0057
            android.view.View r9 = android.support.transition.C0309z.m1165a(r7, r9, r2)
            goto L_0x0029
        L_0x0057:
            android.view.ViewParent r4 = r2.getParent()
            if (r4 != 0) goto L_0x006f
            int r2 = r2.getId()
            r4 = -1
            if (r2 == r4) goto L_0x006f
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x006f
            boolean r2 = r6.f816e
            if (r2 == 0) goto L_0x006f
            goto L_0x0029
        L_0x006f:
            r9 = r1
            goto L_0x0029
        L_0x0071:
            r9 = r1
            r2 = r9
        L_0x0073:
            r4 = 0
            if (r9 == 0) goto L_0x00bb
            if (r8 == 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.f689a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r11 = r11.get(r1)
            int[] r11 = (int[]) r11
            r1 = r11[r4]
            r11 = r11[r3]
            int[] r0 = new int[r0]
            r7.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r9.getLeft()
            int r1 = r1 - r2
            r9.offsetLeftAndRight(r1)
            r0 = r0[r3]
            int r11 = r11 - r0
            int r0 = r9.getTop()
            int r11 = r11 - r0
            r9.offsetTopAndBottom(r11)
            android.support.transition.ae r11 = android.support.transition.C0235af.m917a(r7)
            r11.mo978a(r9)
            android.animation.Animator r7 = r6.mo1021b(r7, r9, r8, r10)
            if (r7 != 0) goto L_0x00b2
            r11.mo979b(r9)
            goto L_0x00ba
        L_0x00b2:
            android.support.transition.at$1 r8 = new android.support.transition.at$1
            r8.<init>(r11, r9)
            r7.addListener(r8)
        L_0x00ba:
            return r7
        L_0x00bb:
            if (r2 == 0) goto L_0x00dd
            int r9 = r2.getVisibility()
            android.support.transition.C0244am.m944a(r2, r4)
            android.animation.Animator r7 = r6.mo1021b(r7, r2, r8, r10)
            if (r7 == 0) goto L_0x00d9
            android.support.transition.at$a r8 = new android.support.transition.at$a
            r8.<init>(r2, r11, r3)
            r7.addListener(r8)
            android.support.transition.C0229a.m906a(r7, r8)
            r6.mo1080a(r8)
            goto L_0x00dc
        L_0x00d9:
            android.support.transition.C0244am.m944a(r2, r9)
        L_0x00dc:
            return r7
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.C0253at.mo1020b(android.view.ViewGroup, android.support.transition.aa, int, android.support.transition.aa, int):android.animation.Animator");
    }

    /* renamed from: b */
    public Animator mo1021b(ViewGroup viewGroup, View view, C0230aa aaVar, C0230aa aaVar2) {
        return null;
    }

    /* renamed from: b */
    public void mo1022b(C0230aa aaVar) {
        m989d(aaVar);
    }
}
