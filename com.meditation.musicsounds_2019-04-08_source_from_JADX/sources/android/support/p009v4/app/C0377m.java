package android.support.p009v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.arch.lifecycle.C0038o;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p009v4.app.C0374l.C0375a;
import android.support.p009v4.app.C0374l.C0376b;
import android.support.p009v4.app.Fragment.SavedState;
import android.support.p009v4.p019g.C0490b;
import android.support.p009v4.p019g.C0493d;
import android.support.p009v4.p019g.C0494e;
import android.support.p009v4.p019g.C0504j;
import android.support.p009v4.view.C0626s;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v4.app.m */
final class C0377m extends C0374l implements Factory2 {

    /* renamed from: F */
    static final Interpolator f1095F = new DecelerateInterpolator(2.5f);

    /* renamed from: G */
    static final Interpolator f1096G = new DecelerateInterpolator(1.5f);

    /* renamed from: H */
    static final Interpolator f1097H = new AccelerateInterpolator(2.5f);

    /* renamed from: I */
    static final Interpolator f1098I = new AccelerateInterpolator(1.5f);

    /* renamed from: a */
    static boolean f1099a = false;

    /* renamed from: q */
    static Field f1100q;

    /* renamed from: A */
    Bundle f1101A = null;

    /* renamed from: B */
    SparseArray<Parcelable> f1102B = null;

    /* renamed from: C */
    ArrayList<C0392i> f1103C;

    /* renamed from: D */
    C0393n f1104D;

    /* renamed from: E */
    Runnable f1105E = new Runnable() {
        public void run() {
            C0377m.this.mo1605h();
        }
    };

    /* renamed from: J */
    private final CopyOnWriteArrayList<C0504j<C0375a, Boolean>> f1106J = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    ArrayList<C0390g> f1107b;

    /* renamed from: c */
    boolean f1108c;

    /* renamed from: d */
    int f1109d = 0;

    /* renamed from: e */
    final ArrayList<Fragment> f1110e = new ArrayList<>();

    /* renamed from: f */
    SparseArray<Fragment> f1111f;

    /* renamed from: g */
    ArrayList<C0360c> f1112g;

    /* renamed from: h */
    ArrayList<Fragment> f1113h;

    /* renamed from: i */
    ArrayList<C0360c> f1114i;

    /* renamed from: j */
    ArrayList<Integer> f1115j;

    /* renamed from: k */
    ArrayList<C0376b> f1116k;

    /* renamed from: l */
    int f1117l = 0;

    /* renamed from: m */
    C0373k f1118m;

    /* renamed from: n */
    C0371i f1119n;

    /* renamed from: o */
    Fragment f1120o;

    /* renamed from: p */
    Fragment f1121p;

    /* renamed from: r */
    boolean f1122r;

    /* renamed from: s */
    boolean f1123s;

    /* renamed from: t */
    boolean f1124t;

    /* renamed from: u */
    boolean f1125u;

    /* renamed from: v */
    String f1126v;

    /* renamed from: w */
    boolean f1127w;

    /* renamed from: x */
    ArrayList<C0360c> f1128x;

    /* renamed from: y */
    ArrayList<Boolean> f1129y;

    /* renamed from: z */
    ArrayList<Fragment> f1130z;

    /* renamed from: android.support.v4.app.m$a */
    private static class C0383a extends C0385b {

        /* renamed from: a */
        View f1144a;

        C0383a(View view, AnimationListener animationListener) {
            super(animationListener);
            this.f1144a = view;
        }

        public void onAnimationEnd(Animation animation) {
            if (C0626s.m2883z(this.f1144a) || VERSION.SDK_INT >= 24) {
                this.f1144a.post(new Runnable() {
                    public void run() {
                        C0383a.this.f1144a.setLayerType(0, null);
                    }
                });
            } else {
                this.f1144a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: android.support.v4.app.m$b */
    private static class C0385b implements AnimationListener {

        /* renamed from: a */
        private final AnimationListener f1146a;

        private C0385b(AnimationListener animationListener) {
            this.f1146a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f1146a != null) {
                this.f1146a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f1146a != null) {
                this.f1146a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f1146a != null) {
                this.f1146a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.app.m$c */
    private static class C0386c {

        /* renamed from: a */
        public final Animation f1147a;

        /* renamed from: b */
        public final Animator f1148b;

        private C0386c(Animator animator) {
            this.f1147a = null;
            this.f1148b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        private C0386c(Animation animation) {
            this.f1147a = animation;
            this.f1148b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: android.support.v4.app.m$d */
    private static class C0387d extends AnimatorListenerAdapter {

        /* renamed from: a */
        View f1149a;

        C0387d(View view) {
            this.f1149a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f1149a.setLayerType(0, null);
            animator.removeListener(this);
        }

        public void onAnimationStart(Animator animator) {
            this.f1149a.setLayerType(2, null);
        }
    }

    /* renamed from: android.support.v4.app.m$e */
    private static class C0388e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f1150a;

        /* renamed from: b */
        private final View f1151b;

        /* renamed from: c */
        private boolean f1152c;

        /* renamed from: d */
        private boolean f1153d;

        C0388e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1150a = viewGroup;
            this.f1151b = view;
            addAnimation(animation);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f1152c) {
                return !this.f1153d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1152c = true;
                C0351ab.m1466a(this.f1150a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f1152c) {
                return !this.f1153d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1152c = true;
                C0351ab.m1466a(this.f1150a, this);
            }
            return true;
        }

        public void run() {
            this.f1150a.endViewTransition(this.f1151b);
            this.f1153d = true;
        }
    }

    /* renamed from: android.support.v4.app.m$f */
    static class C0389f {

        /* renamed from: a */
        public static final int[] f1154a = {16842755, 16842960, 16842961};
    }

    /* renamed from: android.support.v4.app.m$g */
    interface C0390g {
        /* renamed from: a */
        boolean mo1420a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: android.support.v4.app.m$h */
    private class C0391h implements C0390g {

        /* renamed from: a */
        final String f1155a;

        /* renamed from: b */
        final int f1156b;

        /* renamed from: c */
        final int f1157c;

        C0391h(String str, int i, int i2) {
            this.f1155a = str;
            this.f1156b = i;
            this.f1157c = i2;
        }

        /* renamed from: a */
        public boolean mo1420a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2) {
            if (C0377m.this.f1121p != null && this.f1156b < 0 && this.f1155a == null) {
                C0374l w = C0377m.this.f1121p.mo1324w();
                if (w != null && w.mo1541c()) {
                    return false;
                }
            }
            return C0377m.this.mo1577a(arrayList, arrayList2, this.f1155a, this.f1156b, this.f1157c);
        }
    }

    /* renamed from: android.support.v4.app.m$i */
    static class C0392i implements C0339b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final boolean f1159a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C0360c f1160b;

        /* renamed from: c */
        private int f1161c;

        C0392i(C0360c cVar, boolean z) {
            this.f1159a = z;
            this.f1160b = cVar;
        }

        /* renamed from: a */
        public void mo1338a() {
            this.f1161c--;
            if (this.f1161c == 0) {
                this.f1160b.f1030a.m1661B();
            }
        }

        /* renamed from: b */
        public void mo1339b() {
            this.f1161c++;
        }

        /* renamed from: c */
        public boolean mo1648c() {
            return this.f1161c == 0;
        }

        /* renamed from: d */
        public void mo1649d() {
            boolean z = this.f1161c > 0;
            C0377m mVar = this.f1160b.f1030a;
            int size = mVar.f1110e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) mVar.f1110e.get(i);
                fragment.mo1236a((C0339b) null);
                if (z && fragment.mo1262aq()) {
                    fragment.mo1213W();
                }
            }
            this.f1160b.f1030a.m1671a(this.f1160b, this.f1159a, !z, true);
        }

        /* renamed from: e */
        public void mo1650e() {
            this.f1160b.f1030a.m1671a(this.f1160b, this.f1159a, false, false);
        }
    }

    C0377m() {
    }

    /* renamed from: A */
    private void m1660A() {
        if (mo1544f()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f1126v != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can not perform this action inside of ");
            sb.append(this.f1126v);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m1661B() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.f1103C != null && !this.f1103C.isEmpty();
            if (this.f1107b != null && this.f1107b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f1118m.mo1530h().removeCallbacks(this.f1105E);
                this.f1118m.mo1530h().post(this.f1105E);
            }
        }
    }

    /* renamed from: C */
    private void m1662C() {
        this.f1108c = false;
        this.f1129y.clear();
        this.f1128x.clear();
    }

    /* renamed from: D */
    private void m1663D() {
        if (this.f1103C != null) {
            while (!this.f1103C.isEmpty()) {
                ((C0392i) this.f1103C.remove(0)).mo1649d();
            }
        }
    }

    /* renamed from: E */
    private void m1664E() {
        int size = this.f1111f == null ? 0 : this.f1111f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f1111f.valueAt(i);
            if (fragment != null) {
                if (fragment.mo1259an() != null) {
                    int ap = fragment.mo1261ap();
                    View an = fragment.mo1259an();
                    Animation animation = an.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        an.clearAnimation();
                    }
                    fragment.mo1269b((View) null);
                    mo1566a(fragment, ap, 0, 0, false);
                } else if (fragment.mo1260ao() != null) {
                    fragment.mo1260ao().end();
                }
            }
        }
    }

    /* renamed from: F */
    private void m1665F() {
        if (this.f1111f != null) {
            for (int size = this.f1111f.size() - 1; size >= 0; size--) {
                if (this.f1111f.valueAt(size) == null) {
                    this.f1111f.delete(this.f1111f.keyAt(size));
                }
            }
        }
    }

    /* renamed from: a */
    private int m1666a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C0490b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0360c cVar = (C0360c) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (cVar.mo1436g() && !cVar.mo1419a(arrayList, i4 + 1, i2)) {
                if (this.f1103C == null) {
                    this.f1103C = new ArrayList<>();
                }
                C0392i iVar = new C0392i(cVar, booleanValue);
                this.f1103C.add(iVar);
                cVar.mo1415a((C0339b) iVar);
                if (booleanValue) {
                    cVar.mo1435f();
                } else {
                    cVar.mo1427b(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, cVar);
                }
                m1684b(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static C0386c m1667a(Context context, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f1096G);
        alphaAnimation.setDuration(220);
        return new C0386c((Animation) alphaAnimation);
    }

    /* renamed from: a */
    static C0386c m1668a(Context context, float f, float f2, float f3, float f4) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f1095F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
        alphaAnimation.setInterpolator(f1096G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new C0386c((Animation) animationSet);
    }

    /* renamed from: a */
    private static AnimationListener m1669a(Animation animation) {
        String str;
        String str2;
        try {
            if (f1100q == null) {
                f1100q = Animation.class.getDeclaredField("mListener");
                f1100q.setAccessible(true);
            }
            return (AnimationListener) f1100q.get(animation);
        } catch (NoSuchFieldException e) {
            e = e;
            str2 = "FragmentManager";
            str = "No field with the name mListener is found in Animation class";
            Log.e(str2, str, e);
            return null;
        } catch (IllegalAccessException e2) {
            e = e2;
            str2 = "FragmentManager";
            str = "Cannot access Animation's mListener field";
            Log.e(str2, str, e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1670a(final Fragment fragment, C0386c cVar, int i) {
        final View view = fragment.f925S;
        final ViewGroup viewGroup = fragment.f924R;
        viewGroup.startViewTransition(view);
        fragment.mo1273c(i);
        if (cVar.f1147a != null) {
            C0388e eVar = new C0388e(cVar.f1147a, viewGroup, view);
            fragment.mo1269b(fragment.f925S);
            eVar.setAnimationListener(new C0385b(m1669a((Animation) eVar)) {
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        public void run() {
                            if (fragment.mo1259an() != null) {
                                fragment.mo1269b((View) null);
                                C0377m.this.mo1566a(fragment, fragment.mo1261ap(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            m1685b(view, cVar);
            fragment.f925S.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f1148b;
        fragment.mo1225a(cVar.f1148b);
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator ao = fragment.mo1260ao();
                fragment.mo1225a((Animator) null);
                if (ao != null && viewGroup.indexOfChild(view) < 0) {
                    C0377m.this.mo1566a(fragment, fragment.mo1261ap(), 0, 0, false);
                }
            }
        });
        animator.setTarget(fragment.f925S);
        m1685b(fragment.f925S, cVar);
        animator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1671a(C0360c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.mo1427b(z3);
        } else {
            cVar.mo1435f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0397r.m1845a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            mo1563a(this.f1117l, true);
        }
        if (this.f1111f != null) {
            int size = this.f1111f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f1111f.valueAt(i);
                if (fragment != null && fragment.f925S != null && fragment.f931Y && cVar.mo1430c(fragment.f915I)) {
                    if (fragment.f933aa > 0.0f) {
                        fragment.f925S.setAlpha(fragment.f933aa);
                    }
                    if (z3) {
                        fragment.f933aa = 0.0f;
                    } else {
                        fragment.f933aa = -1.0f;
                        fragment.f931Y = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1674a(C0393n nVar) {
        if (nVar != null) {
            List<Fragment> a = nVar.mo1651a();
            if (a != null) {
                for (Fragment fragment : a) {
                    fragment.f920N = true;
                }
            }
            List<C0393n> b = nVar.mo1652b();
            if (b != null) {
                for (C0393n a2 : b) {
                    m1674a(a2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1675a(C0490b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo1896b(i);
            if (!fragment.f947u) {
                View I = fragment.mo1199I();
                fragment.f933aa = I.getAlpha();
                I.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: a */
    private void m1676a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0494e("FragmentManager"));
        if (this.f1118m != null) {
            try {
                this.f1118m.mo1494a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            mo1539a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (((java.lang.Boolean) r9.get(r5)).booleanValue() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r3.mo1650e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (((java.lang.Boolean) r9.get(r5)).booleanValue() != false) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1677a(java.util.ArrayList<android.support.p009v4.app.C0360c> r8, java.util.ArrayList<java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList<android.support.v4.app.m$i> r0 = r7.f1103C
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000d
        L_0x0007:
            java.util.ArrayList<android.support.v4.app.m$i> r0 = r7.f1103C
            int r0 = r0.size()
        L_0x000d:
            r2 = r0
            r0 = 0
        L_0x000f:
            if (r0 >= r2) goto L_0x0080
            java.util.ArrayList<android.support.v4.app.m$i> r3 = r7.f1103C
            java.lang.Object r3 = r3.get(r0)
            android.support.v4.app.m$i r3 = (android.support.p009v4.app.C0377m.C0392i) r3
            r4 = -1
            if (r8 == 0) goto L_0x003c
            boolean r5 = r3.f1159a
            if (r5 != 0) goto L_0x003c
            android.support.v4.app.c r5 = r3.f1160b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x003c
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x003c
        L_0x0038:
            r3.mo1650e()
            goto L_0x007d
        L_0x003c:
            boolean r5 = r3.mo1648c()
            if (r5 != 0) goto L_0x0052
            if (r8 == 0) goto L_0x007d
            android.support.v4.app.c r5 = r3.f1160b
            int r6 = r8.size()
            boolean r5 = r5.mo1419a(r8, r1, r6)
            if (r5 == 0) goto L_0x007d
        L_0x0052:
            java.util.ArrayList<android.support.v4.app.m$i> r5 = r7.f1103C
            r5.remove(r0)
            int r0 = r0 + -1
            int r2 = r2 + -1
            if (r8 == 0) goto L_0x007a
            boolean r5 = r3.f1159a
            if (r5 != 0) goto L_0x007a
            android.support.v4.app.c r5 = r3.f1160b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x007a
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x007a
            goto L_0x0038
        L_0x007a:
            r3.mo1649d()
        L_0x007d:
            int r0 = r0 + 1
            goto L_0x000f
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.app.C0377m.m1677a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private void m1678a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0360c> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0360c) arrayList3.get(i4)).f1049t;
        if (this.f1130z == null) {
            this.f1130z = new ArrayList<>();
        } else {
            this.f1130z.clear();
        }
        this.f1130z.addAll(this.f1110e);
        Fragment y = mo1633y();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0360c cVar = (C0360c) arrayList3.get(i6);
            y = !((Boolean) arrayList4.get(i6)).booleanValue() ? cVar.mo1405a(this.f1130z, y) : cVar.mo1421b(this.f1130z, y);
            z2 = z2 || cVar.f1038i;
        }
        this.f1130z.clear();
        if (!z) {
            C0397r.m1845a(this, arrayList, arrayList2, i, i2, false);
        }
        m1687b(arrayList, arrayList2, i, i2);
        if (z) {
            C0490b bVar = new C0490b();
            m1684b(bVar);
            int a = m1666a(arrayList, arrayList2, i, i2, bVar);
            m1675a(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0397r.m1845a(this, arrayList, arrayList2, i, i3, true);
            mo1563a(this.f1117l, true);
        }
        while (i4 < i5) {
            C0360c cVar2 = (C0360c) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && cVar2.f1042m >= 0) {
                mo1589c(cVar2.f1042m);
                cVar2.f1042m = -1;
            }
            cVar2.mo1425b();
            i4++;
        }
        if (z2) {
            mo1608j();
        }
    }

    /* renamed from: a */
    static boolean m1679a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            PropertyValuesHolder[] values = ((ValueAnimator) animator).getValues();
            for (PropertyValuesHolder propertyName : values) {
                if ("alpha".equals(propertyName.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i = 0; i < childAnimations.size(); i++) {
                if (m1679a((Animator) childAnimations.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1680a(C0386c cVar) {
        if (cVar.f1147a instanceof AlphaAnimation) {
            return true;
        }
        if (!(cVar.f1147a instanceof AnimationSet)) {
            return m1679a(cVar.f1148b);
        }
        List animations = ((AnimationSet) cVar.f1147a).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m1681a(View view, C0386c cVar) {
        return view != null && cVar != null && VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && C0626s.m2874q(view) && m1680a(cVar);
    }

    /* renamed from: a */
    private boolean m1682a(String str, int i, int i2) {
        mo1605h();
        m1688c(true);
        if (this.f1121p != null && i < 0 && str == null) {
            C0374l w = this.f1121p.mo1324w();
            if (w != null && w.mo1541c()) {
                return true;
            }
        }
        boolean a = mo1577a(this.f1128x, this.f1129y, str, i, i2);
        if (a) {
            this.f1108c = true;
            try {
                m1686b(this.f1128x, this.f1129y);
            } finally {
                m1662C();
            }
        }
        mo1606i();
        m1665F();
        return a;
    }

    /* renamed from: b */
    public static int m1683b(int i, boolean z) {
        if (i == 4097) {
            return z ? 1 : 2;
        }
        if (i == 4099) {
            return z ? 5 : 6;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? 3 : 4;
    }

    /* renamed from: b */
    private void m1684b(C0490b<Fragment> bVar) {
        if (this.f1117l >= 1) {
            int min = Math.min(this.f1117l, 4);
            int size = this.f1110e.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f1110e.get(i);
                if (fragment.f937k < min) {
                    mo1566a(fragment, min, fragment.mo1254ai(), fragment.mo1255aj(), false);
                    if (fragment.f925S != null && !fragment.f917K && fragment.f931Y) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static void m1685b(View view, C0386c cVar) {
        if (view != null && cVar != null && m1681a(view, cVar)) {
            if (cVar.f1148b != null) {
                cVar.f1148b.addListener(new C0387d(view));
                return;
            }
            AnimationListener a = m1669a(cVar.f1147a);
            view.setLayerType(2, null);
            cVar.f1147a.setAnimationListener(new C0383a(view, a));
        }
    }

    /* renamed from: b */
    private void m1686b(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m1677a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C0360c) arrayList.get(i)).f1049t) {
                    if (i2 != i) {
                        m1678a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0360c) arrayList.get(i2)).f1049t) {
                            i2++;
                        }
                    }
                    m1678a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m1678a(arrayList, arrayList2, i2, size);
            }
        }
    }

    /* renamed from: b */
    private static void m1687b(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0360c cVar = (C0360c) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                cVar.mo1426b(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                cVar.mo1427b(z);
            } else {
                cVar.mo1426b(1);
                cVar.mo1435f();
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m1688c(boolean z) {
        if (this.f1108c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1118m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f1118m.mo1530h().getLooper()) {
            if (!z) {
                m1660A();
            }
            if (this.f1128x == null) {
                this.f1128x = new ArrayList<>();
                this.f1129y = new ArrayList<>();
            }
            this.f1108c = true;
            try {
                m1677a(null, null);
            } finally {
                this.f1108c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1689c(java.util.ArrayList<android.support.p009v4.app.C0360c> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList<android.support.v4.app.m$g> r0 = r4.f1107b     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.util.ArrayList<android.support.v4.app.m$g> r0 = r4.f1107b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x000f
            goto L_0x003a
        L_0x000f:
            java.util.ArrayList<android.support.v4.app.m$g> r0 = r4.f1107b     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            r2 = 0
        L_0x0016:
            if (r1 >= r0) goto L_0x0028
            java.util.ArrayList<android.support.v4.app.m$g> r3 = r4.f1107b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.support.v4.app.m$g r3 = (android.support.p009v4.app.C0377m.C0390g) r3     // Catch:{ all -> 0x003c }
            boolean r3 = r3.mo1420a(r5, r6)     // Catch:{ all -> 0x003c }
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            java.util.ArrayList<android.support.v4.app.m$g> r5 = r4.f1107b     // Catch:{ all -> 0x003c }
            r5.clear()     // Catch:{ all -> 0x003c }
            android.support.v4.app.k r5 = r4.f1118m     // Catch:{ all -> 0x003c }
            android.os.Handler r5 = r5.mo1530h()     // Catch:{ all -> 0x003c }
            java.lang.Runnable r6 = r4.f1105E     // Catch:{ all -> 0x003c }
            r5.removeCallbacks(r6)     // Catch:{ all -> 0x003c }
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r2
        L_0x003a:
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            return r1
        L_0x003c:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.app.C0377m.m1689c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    /* renamed from: d */
    public static int m1690d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m1691e(int i) {
        try {
            this.f1108c = true;
            mo1563a(i, false);
            this.f1108c = false;
            mo1605h();
        } catch (Throwable th) {
            this.f1108c = false;
            throw th;
        }
    }

    /* renamed from: q */
    private Fragment m1692q(Fragment fragment) {
        ViewGroup viewGroup = fragment.f924R;
        View view = fragment.f925S;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f1110e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f1110e.get(indexOf);
                if (fragment2.f924R == viewGroup && fragment2.f925S != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo1560a(C0360c cVar) {
        synchronized (this) {
            if (this.f1115j != null) {
                if (this.f1115j.size() > 0) {
                    int intValue = ((Integer) this.f1115j.remove(this.f1115j.size() - 1)).intValue();
                    if (f1099a) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Adding back stack index ");
                        sb.append(intValue);
                        sb.append(" with ");
                        sb.append(cVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    this.f1114i.set(intValue, cVar);
                    return intValue;
                }
            }
            if (this.f1114i == null) {
                this.f1114i = new ArrayList<>();
            }
            int size = this.f1114i.size();
            if (f1099a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Setting back stack index ");
                sb2.append(size);
                sb2.append(" to ");
                sb2.append(cVar);
                Log.v("FragmentManager", sb2.toString());
            }
            this.f1114i.add(cVar);
            return size;
        }
    }

    /* renamed from: a */
    public SavedState mo1532a(Fragment fragment) {
        if (fragment.f941o < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m1676a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (fragment.f937k <= 0) {
            return null;
        }
        Bundle o = mo1618o(fragment);
        if (o != null) {
            return new SavedState(o);
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo1533a(int i) {
        for (int size = this.f1110e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1110e.get(size);
            if (fragment != null && fragment.f914H == i) {
                return fragment;
            }
        }
        if (this.f1111f != null) {
            for (int size2 = this.f1111f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f1111f.valueAt(size2);
                if (fragment2 != null && fragment2.f914H == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public Fragment mo1534a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        Fragment fragment = (Fragment) this.f1111f.get(i);
        if (fragment == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": index ");
            sb.append(i);
            m1676a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    /* renamed from: a */
    public Fragment mo1535a(String str) {
        if (str != null) {
            for (int size = this.f1110e.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f1110e.get(size);
                if (fragment != null && str.equals(fragment.f916J)) {
                    return fragment;
                }
            }
        }
        if (!(this.f1111f == null || str == null)) {
            for (int size2 = this.f1111f.size() - 1; size2 >= 0; size2--) {
                Fragment fragment2 = (Fragment) this.f1111f.valueAt(size2);
                if (fragment2 != null && str.equals(fragment2.f916J)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0386c mo1561a(Fragment fragment, int i, boolean z, int i2) {
        int ai = fragment.mo1254ai();
        Animation a = fragment.mo1218a(i, z, ai);
        if (a != null) {
            return new C0386c(a);
        }
        Animator b = fragment.mo1264b(i, z, ai);
        if (b != null) {
            return new C0386c(b);
        }
        if (ai != 0) {
            boolean equals = "anim".equals(this.f1118m.mo1529g().getResources().getResourceTypeName(ai));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f1118m.mo1529g(), ai);
                    if (loadAnimation != null) {
                        return new C0386c(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.f1118m.mo1529g(), ai);
                    if (loadAnimator != null) {
                        return new C0386c(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f1118m.mo1529g(), ai);
                        if (loadAnimation2 != null) {
                            return new C0386c(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int b2 = m1683b(i, z);
        if (b2 < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return m1668a(this.f1118m.mo1529g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return m1668a(this.f1118m.mo1529g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return m1668a(this.f1118m.mo1529g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return m1668a(this.f1118m.mo1529g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return m1667a(this.f1118m.mo1529g(), 0.0f, 1.0f);
            case 6:
                return m1667a(this.f1118m.mo1529g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f1118m.mo1500d()) {
                    i2 = this.f1118m.mo1501e();
                }
                if (i2 == 0) {
                }
                return null;
        }
    }

    /* renamed from: a */
    public C0396q mo1536a() {
        return new C0360c(this);
    }

    /* renamed from: a */
    public void mo1537a(int i, int i2) {
        if (i >= 0) {
            mo1572a((C0390g) new C0391h(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo1562a(int i, C0360c cVar) {
        synchronized (this) {
            if (this.f1114i == null) {
                this.f1114i = new ArrayList<>();
            }
            int size = this.f1114i.size();
            if (i < size) {
                if (f1099a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Setting back stack index ");
                    sb.append(i);
                    sb.append(" to ");
                    sb.append(cVar);
                    Log.v("FragmentManager", sb.toString());
                }
                this.f1114i.set(i, cVar);
            } else {
                while (size < i) {
                    this.f1114i.add(null);
                    if (this.f1115j == null) {
                        this.f1115j = new ArrayList<>();
                    }
                    if (f1099a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding available back stack index ");
                        sb2.append(size);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.f1115j.add(Integer.valueOf(size));
                    size++;
                }
                if (f1099a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Adding back stack index ");
                    sb3.append(i);
                    sb3.append(" with ");
                    sb3.append(cVar);
                    Log.v("FragmentManager", sb3.toString());
                }
                this.f1114i.add(cVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1563a(int i, boolean z) {
        if (this.f1118m == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f1117l) {
            this.f1117l = i;
            if (this.f1111f != null) {
                int size = this.f1110e.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mo1598f((Fragment) this.f1110e.get(i2));
                }
                int size2 = this.f1111f.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Fragment fragment = (Fragment) this.f1111f.valueAt(i3);
                    if (fragment != null && ((fragment.f948v || fragment.f918L) && !fragment.f931Y)) {
                        mo1598f(fragment);
                    }
                }
                mo1600g();
                if (this.f1122r && this.f1118m != null && this.f1117l == 5) {
                    this.f1118m.mo1499c();
                    this.f1122r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1564a(Configuration configuration) {
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null) {
                fragment.mo1233a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void mo1538a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f941o < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            m1676a((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putInt(str, fragment.f941o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1565a(Parcelable parcelable, C0393n nVar) {
        List list;
        List list2;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f975a != null) {
                if (nVar != null) {
                    List a = nVar.mo1651a();
                    list2 = nVar.mo1652b();
                    list = nVar.mo1653c();
                    int size = a != null ? a.size() : 0;
                    for (int i = 0; i < size; i++) {
                        Fragment fragment = (Fragment) a.get(i);
                        if (f1099a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreAllState: re-attaching retained ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                        int i2 = 0;
                        while (i2 < fragmentManagerState.f975a.length && fragmentManagerState.f975a[i2].f981b != fragment.f941o) {
                            i2++;
                        }
                        if (i2 == fragmentManagerState.f975a.length) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not find active fragment with index ");
                            sb2.append(fragment.f941o);
                            m1676a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        FragmentState fragmentState = fragmentManagerState.f975a[i2];
                        fragmentState.f991l = fragment;
                        fragment.f939m = null;
                        fragment.f907A = 0;
                        fragment.f950x = false;
                        fragment.f947u = false;
                        fragment.f944r = null;
                        if (fragmentState.f990k != null) {
                            fragmentState.f990k.setClassLoader(this.f1118m.mo1529g().getClassLoader());
                            fragment.f939m = fragmentState.f990k.getSparseParcelableArray("android:view_state");
                            fragment.f938l = fragmentState.f990k;
                        }
                    }
                } else {
                    list2 = null;
                    list = null;
                }
                this.f1111f = new SparseArray<>(fragmentManagerState.f975a.length);
                int i3 = 0;
                while (i3 < fragmentManagerState.f975a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f975a[i3];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.mo1346a(this.f1118m, this.f1119n, this.f1120o, (list2 == null || i3 >= list2.size()) ? null : (C0393n) list2.get(i3), (list == null || i3 >= list.size()) ? null : (C0038o) list.get(i3));
                        if (f1099a) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreAllState: active #");
                            sb3.append(i3);
                            sb3.append(": ");
                            sb3.append(a2);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        this.f1111f.put(a2.f941o, a2);
                        fragmentState2.f991l = null;
                    }
                    i3++;
                }
                if (nVar != null) {
                    List a3 = nVar.mo1651a();
                    int size2 = a3 != null ? a3.size() : 0;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Fragment fragment2 = (Fragment) a3.get(i4);
                        if (fragment2.f945s >= 0) {
                            fragment2.f944r = (Fragment) this.f1111f.get(fragment2.f945s);
                            if (fragment2.f944r == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Re-attaching retained fragment ");
                                sb4.append(fragment2);
                                sb4.append(" target no longer exists: ");
                                sb4.append(fragment2.f945s);
                                Log.w("FragmentManager", sb4.toString());
                            }
                        }
                    }
                }
                this.f1110e.clear();
                if (fragmentManagerState.f976b != null) {
                    int i5 = 0;
                    while (i5 < fragmentManagerState.f976b.length) {
                        Fragment fragment3 = (Fragment) this.f1111f.get(fragmentManagerState.f976b[i5]);
                        if (fragment3 == null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("No instantiated fragment for index #");
                            sb5.append(fragmentManagerState.f976b[i5]);
                            m1676a((RuntimeException) new IllegalStateException(sb5.toString()));
                        }
                        fragment3.f947u = true;
                        if (f1099a) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("restoreAllState: added #");
                            sb6.append(i5);
                            sb6.append(": ");
                            sb6.append(fragment3);
                            Log.v("FragmentManager", sb6.toString());
                        }
                        if (!this.f1110e.contains(fragment3)) {
                            synchronized (this.f1110e) {
                                this.f1110e.add(fragment3);
                            }
                            i5++;
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f977c != null) {
                    this.f1112g = new ArrayList<>(fragmentManagerState.f977c.length);
                    for (int i6 = 0; i6 < fragmentManagerState.f977c.length; i6++) {
                        C0360c a4 = fragmentManagerState.f977c[i6].mo1184a(this);
                        if (f1099a) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i6);
                            sb7.append(" (index ");
                            sb7.append(a4.f1042m);
                            sb7.append("): ");
                            sb7.append(a4);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new C0494e("FragmentManager"));
                            a4.mo1418a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1112g.add(a4);
                        if (a4.f1042m >= 0) {
                            mo1562a(a4.f1042m, a4);
                        }
                    }
                } else {
                    this.f1112g = null;
                }
                if (fragmentManagerState.f978d >= 0) {
                    this.f1121p = (Fragment) this.f1111f.get(fragmentManagerState.f978d);
                }
                this.f1109d = fragmentManagerState.f979e;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [int] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: type inference failed for: r8v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r11v10 */
    /* JADX WARNING: type inference failed for: r11v11 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r1 = r16.mo1320t().getResourceName(r7.f915I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0214, code lost:
        r1 = "unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0246, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0328, code lost:
        if (r11 >= 4) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032c, code lost:
        if (f1099a == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x032e, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom STARTED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0344, code lost:
        r16.mo1249ad();
        mo1597e(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034a, code lost:
        if (r11 >= 3) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034e, code lost:
        if (f1099a == false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0350, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom STOPPED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0366, code lost:
        r16.mo1250ae();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0369, code lost:
        if (r11 >= 2) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x036d, code lost:
        if (f1099a == false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom ACTIVITY_CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0387, code lost:
        if (r7.f925S == null) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038f, code lost:
        if (r6.f1118m.mo1495a(r7) == false) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0393, code lost:
        if (r7.f939m != null) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0395, code lost:
        mo1617n(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0398, code lost:
        r16.mo1251af();
        mo1599f(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03a0, code lost:
        if (r7.f925S == null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a4, code lost:
        if (r7.f924R == null) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a6, code lost:
        r7.f924R.endViewTransition(r7.f925S);
        r7.f925S.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b5, code lost:
        if (r6.f1117l <= 0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b9, code lost:
        if (r6.f1125u != false) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c1, code lost:
        if (r7.f925S.getVisibility() != 0) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c7, code lost:
        if (r7.f933aa < 0.0f) goto L_0x03d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c9, code lost:
        r0 = mo1561a(r7, r18, false, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03d2, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03d3, code lost:
        r7.f933aa = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d5, code lost:
        if (r0 == null) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d7, code lost:
        m1670a(r7, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03da, code lost:
        r7.f924R.removeView(r7.f925S);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03e1, code lost:
        r7.f924R = null;
        r7.f925S = null;
        r7.f926T = null;
        r7.f950x = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e9, code lost:
        if (r11 >= 1) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ed, code lost:
        if (r6.f1125u == false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f3, code lost:
        if (r16.mo1259an() == null) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f5, code lost:
        r0 = r16.mo1259an();
        r7.mo1269b((android.view.View) null);
        r0.clearAnimation();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0404, code lost:
        if (r16.mo1260ao() == null) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0406, code lost:
        r0 = r16.mo1260ao();
        r7.mo1225a((android.animation.Animator) null);
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0414, code lost:
        if (r16.mo1259an() != null) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x041a, code lost:
        if (r16.mo1260ao() == null) goto L_0x041d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x041f, code lost:
        if (f1099a == false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0421, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("movefrom CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0439, code lost:
        if (r7.f920N != false) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x043b, code lost:
        r16.mo1252ag();
        mo1602g(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0442, code lost:
        r7.f937k = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0444, code lost:
        r16.mo1253ah();
        mo1604h(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x044a, code lost:
        if (r20 != false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x044e, code lost:
        if (r7.f920N != false) goto L_0x0454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0450, code lost:
        mo1603h(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0454, code lost:
        r7.f909C = null;
        r7.f913G = null;
        r7.f908B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x045b, code lost:
        r7.mo1273c(r11);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01af, code lost:
        mo1593d(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b2, code lost:
        if (r11 <= 1) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b6, code lost:
        if (f1099a == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b8, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("moveto ACTIVITY_CREATED: ");
        r1.append(r7);
        android.util.Log.v("FragmentManager", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d0, code lost:
        if (r7.f949w != false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d4, code lost:
        if (r7.f915I == 0) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        if (r7.f915I != -1) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01db, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Cannot create fragment ");
        r1.append(r7);
        r1.append(" for a container view with no id");
        m1676a((java.lang.RuntimeException) new java.lang.IllegalArgumentException(r1.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f9, code lost:
        r0 = (android.view.ViewGroup) r6.f1119n.mo1330a(r7.f915I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0203, code lost:
        if (r0 != null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0207, code lost:
        if (r7.f951y != false) goto L_0x0247;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v6
      assigns: []
      uses: []
      mth insns count: 452
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0464  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1566a(android.support.p009v4.app.Fragment r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r6 = r15
            r7 = r16
            boolean r0 = r7.f947u
            r8 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r7.f918L
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r0 = r17
            goto L_0x0015
        L_0x0010:
            r0 = r17
            if (r0 <= r8) goto L_0x0015
            r0 = 1
        L_0x0015:
            boolean r1 = r7.f948v
            if (r1 == 0) goto L_0x002b
            int r1 = r7.f937k
            if (r0 <= r1) goto L_0x002b
            int r0 = r7.f937k
            if (r0 != 0) goto L_0x0029
            boolean r0 = r16.mo1303k()
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002b
        L_0x0029:
            int r0 = r7.f937k
        L_0x002b:
            boolean r1 = r7.f927U
            r9 = 4
            r10 = 3
            if (r1 == 0) goto L_0x0039
            int r1 = r7.f937k
            if (r1 >= r9) goto L_0x0039
            if (r0 <= r10) goto L_0x0039
            r11 = 3
            goto L_0x003a
        L_0x0039:
            r11 = r0
        L_0x003a:
            int r0 = r7.f937k
            r12 = 2
            r13 = 0
            r14 = 0
            if (r0 > r11) goto L_0x02fa
            boolean r0 = r7.f949w
            if (r0 == 0) goto L_0x004a
            boolean r0 = r7.f950x
            if (r0 != 0) goto L_0x004a
            return
        L_0x004a:
            android.view.View r0 = r16.mo1259an()
            if (r0 != 0) goto L_0x0056
            android.animation.Animator r0 = r16.mo1260ao()
            if (r0 == 0) goto L_0x0069
        L_0x0056:
            r7.mo1269b(r13)
            r7.mo1225a(r13)
            int r2 = r16.mo1261ap()
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r1 = r16
            r0.mo1566a(r1, r2, r3, r4, r5)
        L_0x0069:
            int r0 = r7.f937k
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x01af;
                case 2: goto L_0x02ac;
                case 3: goto L_0x02b0;
                case 4: goto L_0x02d2;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x045f
        L_0x0070:
            if (r11 <= 0) goto L_0x01af
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x008c:
            android.os.Bundle r0 = r7.f938l
            if (r0 == 0) goto L_0x00e3
            android.os.Bundle r0 = r7.f938l
            android.support.v4.app.k r1 = r6.f1118m
            android.content.Context r1 = r1.mo1529g()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r0.setClassLoader(r1)
            android.os.Bundle r0 = r7.f938l
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r7.f939m = r0
            android.os.Bundle r0 = r7.f938l
            java.lang.String r1 = "android:target_state"
            android.support.v4.app.Fragment r0 = r15.mo1534a(r0, r1)
            r7.f944r = r0
            android.support.v4.app.Fragment r0 = r7.f944r
            if (r0 == 0) goto L_0x00c1
            android.os.Bundle r0 = r7.f938l
            java.lang.String r1 = "android:target_req_state"
            int r0 = r0.getInt(r1, r14)
            r7.f946t = r0
        L_0x00c1:
            java.lang.Boolean r0 = r7.f940n
            if (r0 == 0) goto L_0x00d0
            java.lang.Boolean r0 = r7.f940n
            boolean r0 = r0.booleanValue()
            r7.f928V = r0
            r7.f940n = r13
            goto L_0x00da
        L_0x00d0:
            android.os.Bundle r0 = r7.f938l
            java.lang.String r1 = "android:user_visible_hint"
            boolean r0 = r0.getBoolean(r1, r8)
            r7.f928V = r0
        L_0x00da:
            boolean r0 = r7.f928V
            if (r0 != 0) goto L_0x00e3
            r7.f927U = r8
            if (r11 <= r10) goto L_0x00e3
            r11 = 3
        L_0x00e3:
            android.support.v4.app.k r0 = r6.f1118m
            r7.f909C = r0
            android.support.v4.app.Fragment r0 = r6.f1120o
            r7.f913G = r0
            android.support.v4.app.Fragment r0 = r6.f1120o
            if (r0 == 0) goto L_0x00f4
            android.support.v4.app.Fragment r0 = r6.f1120o
            android.support.v4.app.m r0 = r0.f910D
            goto L_0x00fa
        L_0x00f4:
            android.support.v4.app.k r0 = r6.f1118m
            android.support.v4.app.m r0 = r0.mo1531i()
        L_0x00fa:
            r7.f908B = r0
            android.support.v4.app.Fragment r0 = r7.f944r
            if (r0 == 0) goto L_0x0145
            android.util.SparseArray<android.support.v4.app.Fragment> r0 = r6.f1111f
            android.support.v4.app.Fragment r1 = r7.f944r
            int r1 = r1.f941o
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r1 = r7.f944r
            if (r0 != r1) goto L_0x011f
            android.support.v4.app.Fragment r0 = r7.f944r
            int r0 = r0.f937k
            if (r0 >= r8) goto L_0x0145
            android.support.v4.app.Fragment r1 = r7.f944r
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 1
            r0 = r15
            r0.mo1566a(r1, r2, r3, r4, r5)
            goto L_0x0145
        L_0x011f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " declared target fragment "
            r1.append(r2)
            android.support.v4.app.Fragment r2 = r7.f944r
            r1.append(r2)
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0145:
            android.support.v4.app.k r0 = r6.f1118m
            android.content.Context r0 = r0.mo1529g()
            r15.mo1567a(r7, r0, r14)
            r7.f923Q = r14
            android.support.v4.app.k r0 = r6.f1118m
            android.content.Context r0 = r0.mo1529g()
            r7.mo1228a(r0)
            boolean r0 = r7.f923Q
            if (r0 == 0) goto L_0x0193
            android.support.v4.app.Fragment r0 = r7.f913G
            if (r0 != 0) goto L_0x0167
            android.support.v4.app.k r0 = r6.f1118m
            r0.mo1498b(r7)
            goto L_0x016c
        L_0x0167:
            android.support.v4.app.Fragment r0 = r7.f913G
            r0.mo1237a(r7)
        L_0x016c:
            android.support.v4.app.k r0 = r6.f1118m
            android.content.Context r0 = r0.mo1529g()
            r15.mo1580b(r7, r0, r14)
            boolean r0 = r7.f935ac
            if (r0 != 0) goto L_0x0189
            android.os.Bundle r0 = r7.f938l
            r15.mo1568a(r7, r0, r14)
            android.os.Bundle r0 = r7.f938l
            r7.mo1305l(r0)
            android.os.Bundle r0 = r7.f938l
            r15.mo1581b(r7, r0, r14)
            goto L_0x0190
        L_0x0189:
            android.os.Bundle r0 = r7.f938l
            r7.mo1299j(r0)
            r7.f937k = r8
        L_0x0190:
            r7.f920N = r14
            goto L_0x01af
        L_0x0193:
            android.support.v4.app.SuperNotCalledException r0 = new android.support.v4.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " did not call through to super.onAttach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01af:
            r15.mo1593d(r16)
            if (r11 <= r8) goto L_0x02ac
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x01ce
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x01ce:
            boolean r0 = r7.f949w
            if (r0 != 0) goto L_0x0297
            int r0 = r7.f915I
            if (r0 == 0) goto L_0x0246
            int r0 = r7.f915I
            r1 = -1
            if (r0 != r1) goto L_0x01f9
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " for a container view with no id"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r15.m1676a(r0)
        L_0x01f9:
            android.support.v4.app.i r0 = r6.f1119n
            int r1 = r7.f915I
            android.view.View r0 = r0.mo1330a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0247
            boolean r1 = r7.f951y
            if (r1 != 0) goto L_0x0247
            android.content.res.Resources r1 = r16.mo1320t()     // Catch:{ NotFoundException -> 0x0214 }
            int r2 = r7.f915I     // Catch:{ NotFoundException -> 0x0214 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0214 }
            goto L_0x0216
        L_0x0214:
            java.lang.String r1 = "unknown"
        L_0x0216:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No view found for id 0x"
            r3.append(r4)
            int r4 = r7.f915I
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r15.m1676a(r2)
            goto L_0x0247
        L_0x0246:
            r0 = r13
        L_0x0247:
            r7.f924R = r0
            android.os.Bundle r1 = r7.f938l
            android.view.LayoutInflater r1 = r7.mo1291h(r1)
            android.os.Bundle r2 = r7.f938l
            android.view.View r1 = r7.mo1266b(r1, r0, r2)
            r7.f925S = r1
            android.view.View r1 = r7.f925S
            if (r1 == 0) goto L_0x0295
            android.view.View r1 = r7.f925S
            r7.f926T = r1
            android.view.View r1 = r7.f925S
            r1.setSaveFromParentEnabled(r14)
            if (r0 == 0) goto L_0x026b
            android.view.View r1 = r7.f925S
            r0.addView(r1)
        L_0x026b:
            boolean r0 = r7.f917K
            if (r0 == 0) goto L_0x0276
            android.view.View r0 = r7.f925S
            r1 = 8
            r0.setVisibility(r1)
        L_0x0276:
            android.view.View r0 = r7.f925S
            android.os.Bundle r1 = r7.f938l
            r7.mo1242a(r0, r1)
            android.view.View r0 = r7.f925S
            android.os.Bundle r1 = r7.f938l
            r15.mo1569a(r7, r0, r1, r14)
            android.view.View r0 = r7.f925S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0291
            android.view.ViewGroup r0 = r7.f924R
            if (r0 == 0) goto L_0x0291
            goto L_0x0292
        L_0x0291:
            r8 = 0
        L_0x0292:
            r7.f931Y = r8
            goto L_0x0297
        L_0x0295:
            r7.f926T = r13
        L_0x0297:
            android.os.Bundle r0 = r7.f938l
            r7.mo1308m(r0)
            android.os.Bundle r0 = r7.f938l
            r15.mo1591c(r7, r0, r14)
            android.view.View r0 = r7.f925S
            if (r0 == 0) goto L_0x02aa
            android.os.Bundle r0 = r7.f938l
            r7.mo1286f(r0)
        L_0x02aa:
            r7.f938l = r13
        L_0x02ac:
            if (r11 <= r12) goto L_0x02b0
            r7.f937k = r10
        L_0x02b0:
            if (r11 <= r10) goto L_0x02d2
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x02cc
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02cc:
            r16.mo1215Y()
            r15.mo1582b(r7, r14)
        L_0x02d2:
            if (r11 <= r9) goto L_0x045f
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x02ee
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x02ee:
            r16.mo1216Z()
            r15.mo1592c(r7, r14)
            r7.f938l = r13
            r7.f939m = r13
            goto L_0x045f
        L_0x02fa:
            int r0 = r7.f937k
            if (r0 <= r11) goto L_0x045f
            int r0 = r7.f937k
            switch(r0) {
                case 1: goto L_0x03e9;
                case 2: goto L_0x0369;
                case 3: goto L_0x034a;
                case 4: goto L_0x0328;
                case 5: goto L_0x0305;
                default: goto L_0x0303;
            }
        L_0x0303:
            goto L_0x045f
        L_0x0305:
            r0 = 5
            if (r11 >= r0) goto L_0x0328
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x0322
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom RESUMED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0322:
            r16.mo1248ac()
            r15.mo1595d(r7, r14)
        L_0x0328:
            if (r11 >= r9) goto L_0x034a
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x0344
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STARTED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0344:
            r16.mo1249ad()
            r15.mo1597e(r7, r14)
        L_0x034a:
            if (r11 >= r10) goto L_0x0369
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x0366
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom STOPPED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0366:
            r16.mo1250ae()
        L_0x0369:
            if (r11 >= r12) goto L_0x03e9
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x0385
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom ACTIVITY_CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0385:
            android.view.View r0 = r7.f925S
            if (r0 == 0) goto L_0x0398
            android.support.v4.app.k r0 = r6.f1118m
            boolean r0 = r0.mo1495a(r7)
            if (r0 == 0) goto L_0x0398
            android.util.SparseArray<android.os.Parcelable> r0 = r7.f939m
            if (r0 != 0) goto L_0x0398
            r15.mo1617n(r16)
        L_0x0398:
            r16.mo1251af()
            r15.mo1599f(r7, r14)
            android.view.View r0 = r7.f925S
            if (r0 == 0) goto L_0x03e1
            android.view.ViewGroup r0 = r7.f924R
            if (r0 == 0) goto L_0x03e1
            android.view.ViewGroup r0 = r7.f924R
            android.view.View r1 = r7.f925S
            r0.endViewTransition(r1)
            android.view.View r0 = r7.f925S
            r0.clearAnimation()
            int r0 = r6.f1117l
            r1 = 0
            if (r0 <= 0) goto L_0x03d2
            boolean r0 = r6.f1125u
            if (r0 != 0) goto L_0x03d2
            android.view.View r0 = r7.f925S
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03d2
            float r0 = r7.f933aa
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x03d2
            r0 = r18
            r2 = r19
            android.support.v4.app.m$c r0 = r15.mo1561a(r7, r0, r14, r2)
            goto L_0x03d3
        L_0x03d2:
            r0 = r13
        L_0x03d3:
            r7.f933aa = r1
            if (r0 == 0) goto L_0x03da
            r15.m1670a(r7, r0, r11)
        L_0x03da:
            android.view.ViewGroup r0 = r7.f924R
            android.view.View r1 = r7.f925S
            r0.removeView(r1)
        L_0x03e1:
            r7.f924R = r13
            r7.f925S = r13
            r7.f926T = r13
            r7.f950x = r14
        L_0x03e9:
            if (r11 >= r8) goto L_0x045f
            boolean r0 = r6.f1125u
            if (r0 == 0) goto L_0x0410
            android.view.View r0 = r16.mo1259an()
            if (r0 == 0) goto L_0x0400
            android.view.View r0 = r16.mo1259an()
            r7.mo1269b(r13)
            r0.clearAnimation()
            goto L_0x0410
        L_0x0400:
            android.animation.Animator r0 = r16.mo1260ao()
            if (r0 == 0) goto L_0x0410
            android.animation.Animator r0 = r16.mo1260ao()
            r7.mo1225a(r13)
            r0.cancel()
        L_0x0410:
            android.view.View r0 = r16.mo1259an()
            if (r0 != 0) goto L_0x045b
            android.animation.Animator r0 = r16.mo1260ao()
            if (r0 == 0) goto L_0x041d
            goto L_0x045b
        L_0x041d:
            boolean r0 = f1099a
            if (r0 == 0) goto L_0x0437
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "movefrom CREATED: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L_0x0437:
            boolean r0 = r7.f920N
            if (r0 != 0) goto L_0x0442
            r16.mo1252ag()
            r15.mo1602g(r7, r14)
            goto L_0x0444
        L_0x0442:
            r7.f937k = r14
        L_0x0444:
            r16.mo1253ah()
            r15.mo1604h(r7, r14)
            if (r20 != 0) goto L_0x045f
            boolean r0 = r7.f920N
            if (r0 != 0) goto L_0x0454
            r15.mo1603h(r16)
            goto L_0x045f
        L_0x0454:
            r7.f909C = r13
            r7.f913G = r13
            r7.f908B = r13
            goto L_0x045f
        L_0x045b:
            r7.mo1273c(r11)
            goto L_0x0460
        L_0x045f:
            r8 = r11
        L_0x0460:
            int r0 = r7.f937k
            if (r0 == r8) goto L_0x0493
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; "
            r1.append(r2)
            java.lang.String r2 = "expected state "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f937k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            r7.f937k = r8
        L_0x0493:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.app.C0377m.mo1566a(android.support.v4.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1567a(Fragment fragment, Context context, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1567a(fragment, context, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1546a((C0374l) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1568a(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1568a(fragment, bundle, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1547a((C0374l) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1569a(Fragment fragment, View view, Bundle bundle, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1569a(fragment, view, bundle, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1548a(this, fragment, view, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo1570a(Fragment fragment, boolean z) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        mo1601g(fragment);
        if (fragment.f918L) {
            return;
        }
        if (!this.f1110e.contains(fragment)) {
            synchronized (this.f1110e) {
                this.f1110e.add(fragment);
            }
            fragment.f947u = true;
            fragment.f948v = false;
            if (fragment.f925S == null) {
                fragment.f932Z = false;
            }
            if (fragment.f921O && fragment.f922P) {
                this.f1122r = true;
            }
            if (z) {
                mo1590c(fragment);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(fragment);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: a */
    public void mo1571a(C0373k kVar, C0371i iVar, Fragment fragment) {
        if (this.f1118m == null) {
            this.f1118m = kVar;
            this.f1119n = iVar;
            this.f1120o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public void mo1572a(C0390g gVar, boolean z) {
        if (!z) {
            m1660A();
        }
        synchronized (this) {
            if (!this.f1125u) {
                if (this.f1118m != null) {
                    if (this.f1107b == null) {
                        this.f1107b = new ArrayList<>();
                    }
                    this.f1107b.add(gVar);
                    m1661B();
                    return;
                }
            }
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo1539a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (this.f1111f != null) {
            int size = this.f1111f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f1111f.valueAt(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment);
                    if (fragment != null) {
                        fragment.mo1243a(sb2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size2 = this.f1110e.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment2 = (Fragment) this.f1110e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        if (this.f1113h != null) {
            int size3 = this.f1113h.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size3; i3++) {
                    Fragment fragment3 = (Fragment) this.f1113h.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(fragment3.toString());
                }
            }
        }
        if (this.f1112g != null) {
            int size4 = this.f1112g.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0360c cVar = (C0360c) this.f1112g.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(cVar.toString());
                    cVar.mo1417a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f1114i != null) {
                int size5 = this.f1114i.size();
                if (size5 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i5 = 0; i5 < size5; i5++) {
                        C0360c cVar2 = (C0360c) this.f1114i.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(cVar2);
                    }
                }
            }
            if (this.f1115j != null && this.f1115j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f1115j.toArray()));
            }
        }
        if (this.f1107b != null) {
            int size6 = this.f1107b.size();
            if (size6 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i6 = 0; i6 < size6; i6++) {
                    C0390g gVar = (C0390g) this.f1107b.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(gVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1118m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1119n);
        if (this.f1120o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1120o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1117l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1123s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1124t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1125u);
        if (this.f1122r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1122r);
        }
        if (this.f1126v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f1126v);
        }
    }

    /* renamed from: a */
    public void mo1573a(boolean z) {
        for (int size = this.f1110e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1110e.get(size);
            if (fragment != null) {
                fragment.mo1300j(z);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1574a(Menu menu) {
        if (this.f1117l < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null && fragment.mo1275c(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo1575a(Menu menu, MenuInflater menuInflater) {
        if (this.f1117l < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null && fragment.mo1270b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f1113h != null) {
            for (int i2 = 0; i2 < this.f1113h.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f1113h.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo1204N();
                }
            }
        }
        this.f1113h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean mo1576a(MenuItem menuItem) {
        if (this.f1117l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null && fragment.mo1276c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1577a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        if (this.f1112g == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = this.f1112g.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1112g.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                i3 = this.f1112g.size() - 1;
                while (i3 >= 0) {
                    C0360c cVar = (C0360c) this.f1112g.get(i3);
                    if ((str != null && str.equals(cVar.mo1437h())) || (i >= 0 && i == cVar.f1042m)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0360c cVar2 = (C0360c) this.f1112g.get(i3);
                        if ((str == null || !str.equals(cVar2.mo1437h())) && (i < 0 || i != cVar2.f1042m)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f1112g.size() - 1) {
                return false;
            }
            for (int size2 = this.f1112g.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f1112g.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: b */
    public Fragment mo1578b(String str) {
        if (!(this.f1111f == null || str == null)) {
            for (int size = this.f1111f.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f1111f.valueAt(size);
                if (fragment != null) {
                    Fragment c_ = fragment.mo1277c_(str);
                    if (c_ != null) {
                        return c_;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo1579b(Fragment fragment) {
        if (fragment.f927U) {
            if (this.f1108c) {
                this.f1127w = true;
                return;
            }
            fragment.f927U = false;
            mo1566a(fragment, this.f1117l, 0, 0, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1580b(Fragment fragment, Context context, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1580b(fragment, context, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1550b((C0374l) this, fragment, context);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1581b(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1581b(fragment, bundle, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1551b((C0374l) this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1582b(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1582b(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1545a(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1583b(C0360c cVar) {
        if (this.f1112g == null) {
            this.f1112g = new ArrayList<>();
        }
        this.f1112g.add(cVar);
    }

    /* renamed from: b */
    public void mo1584b(C0390g gVar, boolean z) {
        if (!z || (this.f1118m != null && !this.f1125u)) {
            m1688c(z);
            if (gVar.mo1420a(this.f1128x, this.f1129y)) {
                this.f1108c = true;
                try {
                    m1686b(this.f1128x, this.f1129y);
                } finally {
                    m1662C();
                }
            }
            mo1606i();
            m1665F();
        }
    }

    /* renamed from: b */
    public void mo1585b(Menu menu) {
        if (this.f1117l >= 1) {
            for (int i = 0; i < this.f1110e.size(); i++) {
                Fragment fragment = (Fragment) this.f1110e.get(i);
                if (fragment != null) {
                    fragment.mo1279d(menu);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1586b(boolean z) {
        for (int size = this.f1110e.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f1110e.get(size);
            if (fragment != null) {
                fragment.mo1302k(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1540b() {
        boolean h = mo1605h();
        m1663D();
        return h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1587b(int i) {
        return this.f1117l >= i;
    }

    /* renamed from: b */
    public boolean mo1588b(MenuItem menuItem) {
        if (this.f1117l < 1) {
            return false;
        }
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null && fragment.mo1281d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo1589c(int i) {
        synchronized (this) {
            this.f1114i.set(i, null);
            if (this.f1115j == null) {
                this.f1115j = new ArrayList<>();
            }
            if (f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing back stack index ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            this.f1115j.add(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1590c(Fragment fragment) {
        mo1566a(fragment, this.f1117l, 0, 0, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1591c(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1591c(fragment, bundle, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1553c(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1592c(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1592c(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1549b(this, fragment);
            }
        }
    }

    /* renamed from: c */
    public boolean mo1541c() {
        m1660A();
        return m1682a((String) null, -1, 0);
    }

    /* renamed from: d */
    public int mo1542d() {
        if (this.f1112g != null) {
            return this.f1112g.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1593d(Fragment fragment) {
        if (fragment.f949w && !fragment.f952z) {
            fragment.f925S = fragment.mo1266b(fragment.mo1291h(fragment.f938l), (ViewGroup) null, fragment.f938l);
            if (fragment.f925S != null) {
                fragment.f926T = fragment.f925S;
                fragment.f925S.setSaveFromParentEnabled(false);
                if (fragment.f917K) {
                    fragment.f925S.setVisibility(8);
                }
                fragment.mo1242a(fragment.f925S, fragment.f938l);
                mo1569a(fragment, fragment.f925S, fragment.f938l, false);
                return;
            }
            fragment.f926T = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1594d(Fragment fragment, Bundle bundle, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1594d(fragment, bundle, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1555d(this, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1595d(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1595d(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1552c(this, fragment);
            }
        }
    }

    /* renamed from: e */
    public List<Fragment> mo1543e() {
        List<Fragment> list;
        if (this.f1110e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f1110e) {
            list = (List) this.f1110e.clone();
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1596e(final Fragment fragment) {
        if (fragment.f925S != null) {
            C0386c a = mo1561a(fragment, fragment.mo1255aj(), !fragment.f917K, fragment.mo1256ak());
            if (a == null || a.f1148b == null) {
                if (a != null) {
                    m1685b(fragment.f925S, a);
                    fragment.f925S.startAnimation(a.f1147a);
                    a.f1147a.start();
                }
                fragment.f925S.setVisibility((!fragment.f917K || fragment.mo1263ar()) ? 0 : 8);
                if (fragment.mo1263ar()) {
                    fragment.mo1306l(false);
                }
            } else {
                a.f1148b.setTarget(fragment.f925S);
                if (!fragment.f917K) {
                    fragment.f925S.setVisibility(0);
                } else if (fragment.mo1263ar()) {
                    fragment.mo1306l(false);
                } else {
                    final ViewGroup viewGroup = fragment.f924R;
                    final View view = fragment.f925S;
                    viewGroup.startViewTransition(view);
                    a.f1148b.addListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.f925S != null) {
                                fragment.f925S.setVisibility(8);
                            }
                        }
                    });
                }
                m1685b(fragment.f925S, a);
                a.f1148b.start();
            }
        }
        if (fragment.f947u && fragment.f921O && fragment.f922P) {
            this.f1122r = true;
        }
        fragment.f932Z = false;
        fragment.mo1274c(fragment.f917K);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1597e(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1597e(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1554d(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1598f(Fragment fragment) {
        if (fragment != null) {
            int i = this.f1117l;
            if (fragment.f948v) {
                i = fragment.mo1303k() ? Math.min(i, 1) : Math.min(i, 0);
            }
            mo1566a(fragment, i, fragment.mo1255aj(), fragment.mo1256ak(), false);
            if (fragment.f925S != null) {
                Fragment q = m1692q(fragment);
                if (q != null) {
                    View view = q.f925S;
                    ViewGroup viewGroup = fragment.f924R;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    int indexOfChild2 = viewGroup.indexOfChild(fragment.f925S);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.f925S, indexOfChild);
                    }
                }
                if (fragment.f931Y && fragment.f924R != null) {
                    if (fragment.f933aa > 0.0f) {
                        fragment.f925S.setAlpha(fragment.f933aa);
                    }
                    fragment.f933aa = 0.0f;
                    fragment.f931Y = false;
                    C0386c a = mo1561a(fragment, fragment.mo1255aj(), true, fragment.mo1256ak());
                    if (a != null) {
                        m1685b(fragment.f925S, a);
                        if (a.f1147a != null) {
                            fragment.f925S.startAnimation(a.f1147a);
                        } else {
                            a.f1148b.setTarget(fragment.f925S);
                            a.f1148b.start();
                        }
                    }
                }
            }
            if (fragment.f932Z) {
                mo1596e(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1599f(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1599f(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1556e(this, fragment);
            }
        }
    }

    /* renamed from: f */
    public boolean mo1544f() {
        return this.f1123s || this.f1124t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1600g() {
        if (this.f1111f != null) {
            for (int i = 0; i < this.f1111f.size(); i++) {
                Fragment fragment = (Fragment) this.f1111f.valueAt(i);
                if (fragment != null) {
                    mo1579b(fragment);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1601g(Fragment fragment) {
        if (fragment.f941o < 0) {
            int i = this.f1109d;
            this.f1109d = i + 1;
            fragment.mo1223a(i, this.f1120o);
            if (this.f1111f == null) {
                this.f1111f = new SparseArray<>();
            }
            this.f1111f.put(fragment.f941o, fragment);
            if (f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Allocated fragment index ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1602g(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1602g(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1557f(this, fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1603h(Fragment fragment) {
        if (fragment.f941o >= 0) {
            if (f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Freeing fragment index ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
            this.f1111f.put(fragment.f941o, null);
            fragment.mo1203M();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo1604h(Fragment fragment, boolean z) {
        if (this.f1120o != null) {
            C0374l u = this.f1120o.mo1322u();
            if (u instanceof C0377m) {
                ((C0377m) u).mo1604h(fragment, true);
            }
        }
        Iterator it = this.f1106J.iterator();
        while (it.hasNext()) {
            C0504j jVar = (C0504j) it.next();
            if (!z || ((Boolean) jVar.f1501b).booleanValue()) {
                ((C0375a) jVar.f1500a).mo1558g(this, fragment);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public boolean mo1605h() {
        m1688c(true);
        boolean z = false;
        while (m1689c(this.f1128x, this.f1129y)) {
            this.f1108c = true;
            try {
                m1686b(this.f1128x, this.f1129y);
                m1662C();
                z = true;
            } catch (Throwable th) {
                m1662C();
                throw th;
            }
        }
        mo1606i();
        m1665F();
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo1606i() {
        if (this.f1127w) {
            this.f1127w = false;
            mo1600g();
        }
    }

    /* renamed from: i */
    public void mo1607i(Fragment fragment) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f907A);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.mo1303k();
        if (!fragment.f918L || z) {
            synchronized (this.f1110e) {
                this.f1110e.remove(fragment);
            }
            if (fragment.f921O && fragment.f922P) {
                this.f1122r = true;
            }
            fragment.f947u = false;
            fragment.f948v = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo1608j() {
        if (this.f1116k != null) {
            for (int i = 0; i < this.f1116k.size(); i++) {
                ((C0376b) this.f1116k.get(i)).mo1559a();
            }
        }
    }

    /* renamed from: j */
    public void mo1609j(Fragment fragment) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f917K) {
            fragment.f917K = true;
            fragment.f932Z = true ^ fragment.f932Z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C0393n mo1610k() {
        m1674a(this.f1104D);
        return this.f1104D;
    }

    /* renamed from: k */
    public void mo1611k(Fragment fragment) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f917K) {
            fragment.f917K = false;
            fragment.f932Z = !fragment.f932Z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo1612l() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0393n nVar;
        if (this.f1111f != null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
            for (int i = 0; i < this.f1111f.size(); i++) {
                Fragment fragment = (Fragment) this.f1111f.valueAt(i);
                if (fragment != null) {
                    if (fragment.f919M) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(fragment);
                        fragment.f945s = fragment.f944r != null ? fragment.f944r.f941o : -1;
                        if (f1099a) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("retainNonConfig: keeping retained ");
                            sb.append(fragment);
                            Log.v("FragmentManager", sb.toString());
                        }
                    }
                    if (fragment.f910D != null) {
                        fragment.f910D.mo1612l();
                        nVar = fragment.f910D.f1104D;
                    } else {
                        nVar = fragment.f911E;
                    }
                    if (arrayList2 == null && nVar != null) {
                        arrayList2 = new ArrayList(this.f1111f.size());
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(nVar);
                    }
                    if (arrayList == null && fragment.f912F != null) {
                        arrayList = new ArrayList(this.f1111f.size());
                        for (int i3 = 0; i3 < i; i3++) {
                            arrayList.add(null);
                        }
                    }
                    if (arrayList != null) {
                        arrayList.add(fragment.f912F);
                    }
                }
            }
        } else {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList3 == null && arrayList2 == null && arrayList == null) {
            this.f1104D = null;
        } else {
            this.f1104D = new C0393n(arrayList3, arrayList2, arrayList);
        }
    }

    /* renamed from: l */
    public void mo1613l(Fragment fragment) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f918L) {
            fragment.f918L = true;
            if (fragment.f947u) {
                if (f1099a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f1110e) {
                    this.f1110e.remove(fragment);
                }
                if (fragment.f921O && fragment.f922P) {
                    this.f1122r = true;
                }
                fragment.f947u = false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Parcelable mo1614m() {
        int[] iArr;
        m1663D();
        m1664E();
        mo1605h();
        this.f1123s = true;
        BackStackState[] backStackStateArr = null;
        this.f1104D = null;
        if (this.f1111f == null || this.f1111f.size() <= 0) {
            return null;
        }
        int size = this.f1111f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        boolean z = false;
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f1111f.valueAt(i);
            if (fragment != null) {
                if (fragment.f941o < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failure saving state: active ");
                    sb.append(fragment);
                    sb.append(" has cleared index: ");
                    sb.append(fragment.f941o);
                    m1676a((RuntimeException) new IllegalStateException(sb.toString()));
                }
                FragmentState fragmentState = new FragmentState(fragment);
                fragmentStateArr[i] = fragmentState;
                if (fragment.f937k <= 0 || fragmentState.f990k != null) {
                    fragmentState.f990k = fragment.f938l;
                } else {
                    fragmentState.f990k = mo1618o(fragment);
                    if (fragment.f944r != null) {
                        if (fragment.f944r.f941o < 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failure saving state: ");
                            sb2.append(fragment);
                            sb2.append(" has target not in fragment manager: ");
                            sb2.append(fragment.f944r);
                            m1676a((RuntimeException) new IllegalStateException(sb2.toString()));
                        }
                        if (fragmentState.f990k == null) {
                            fragmentState.f990k = new Bundle();
                        }
                        mo1538a(fragmentState.f990k, "android:target_state", fragment.f944r);
                        if (fragment.f946t != 0) {
                            fragmentState.f990k.putInt("android:target_req_state", fragment.f946t);
                        }
                    }
                }
                if (f1099a) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Saved state of ");
                    sb3.append(fragment);
                    sb3.append(": ");
                    sb3.append(fragmentState.f990k);
                    Log.v("FragmentManager", sb3.toString());
                }
                z = true;
            }
        }
        if (!z) {
            if (f1099a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size2 = this.f1110e.size();
        if (size2 > 0) {
            iArr = new int[size2];
            for (int i2 = 0; i2 < size2; i2++) {
                iArr[i2] = ((Fragment) this.f1110e.get(i2)).f941o;
                if (iArr[i2] < 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failure saving state: active ");
                    sb4.append(this.f1110e.get(i2));
                    sb4.append(" has cleared index: ");
                    sb4.append(iArr[i2]);
                    m1676a((RuntimeException) new IllegalStateException(sb4.toString()));
                }
                if (f1099a) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("saveAllState: adding fragment #");
                    sb5.append(i2);
                    sb5.append(": ");
                    sb5.append(this.f1110e.get(i2));
                    Log.v("FragmentManager", sb5.toString());
                }
            }
        } else {
            iArr = null;
        }
        if (this.f1112g != null) {
            int size3 = this.f1112g.size();
            if (size3 > 0) {
                backStackStateArr = new BackStackState[size3];
                for (int i3 = 0; i3 < size3; i3++) {
                    backStackStateArr[i3] = new BackStackState((C0360c) this.f1112g.get(i3));
                    if (f1099a) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("saveAllState: adding back stack #");
                        sb6.append(i3);
                        sb6.append(": ");
                        sb6.append(this.f1112g.get(i3));
                        Log.v("FragmentManager", sb6.toString());
                    }
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f975a = fragmentStateArr;
        fragmentManagerState.f976b = iArr;
        fragmentManagerState.f977c = backStackStateArr;
        if (this.f1121p != null) {
            fragmentManagerState.f978d = this.f1121p.f941o;
        }
        fragmentManagerState.f979e = this.f1109d;
        mo1612l();
        return fragmentManagerState;
    }

    /* renamed from: m */
    public void mo1615m(Fragment fragment) {
        if (f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f918L) {
            fragment.f918L = false;
            if (fragment.f947u) {
                return;
            }
            if (!this.f1110e.contains(fragment)) {
                if (f1099a) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f1110e) {
                    this.f1110e.add(fragment);
                }
                fragment.f947u = true;
                if (fragment.f921O && fragment.f922P) {
                    this.f1122r = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(fragment);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* renamed from: n */
    public void mo1616n() {
        this.f1104D = null;
        this.f1123s = false;
        this.f1124t = false;
        int size = this.f1110e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null) {
                fragment.mo1246aa();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo1617n(Fragment fragment) {
        if (fragment.f926T != null) {
            if (this.f1102B == null) {
                this.f1102B = new SparseArray<>();
            } else {
                this.f1102B.clear();
            }
            fragment.f926T.saveHierarchyState(this.f1102B);
            if (this.f1102B.size() > 0) {
                fragment.f939m = this.f1102B;
                this.f1102B = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public Bundle mo1618o(Fragment fragment) {
        Bundle bundle;
        if (this.f1101A == null) {
            this.f1101A = new Bundle();
        }
        fragment.mo1309n(this.f1101A);
        mo1594d(fragment, this.f1101A, false);
        if (!this.f1101A.isEmpty()) {
            bundle = this.f1101A;
            this.f1101A = null;
        } else {
            bundle = null;
        }
        if (fragment.f925S != null) {
            mo1617n(fragment);
        }
        if (fragment.f939m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f939m);
        }
        if (!fragment.f928V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f928V);
        }
        return bundle;
    }

    /* renamed from: o */
    public void mo1619o() {
        this.f1123s = false;
        this.f1124t = false;
        m1691e(1);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        String str2 = str;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet2.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, C0389f.f1154a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str3 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!Fragment.m1274b(this.f1118m.mo1529g(), str3)) {
            return null;
        }
        if (view != null) {
            i = view.getId();
        }
        if (i == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment a = resourceId != -1 ? mo1533a(resourceId) : null;
        if (a == null && string != null) {
            a = mo1535a(string);
        }
        if (a == null && i != -1) {
            a = mo1533a(i);
        }
        if (f1099a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onCreateView: id=0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(" fname=");
            sb2.append(str3);
            sb2.append(" existing=");
            sb2.append(a);
            Log.v("FragmentManager", sb2.toString());
        }
        if (a == null) {
            Fragment a2 = this.f1119n.mo1329a(context2, str3, null);
            a2.f949w = true;
            a2.f914H = resourceId != 0 ? resourceId : i;
            a2.f915I = i;
            a2.f916J = string;
            a2.f950x = true;
            a2.f908B = this;
            a2.f909C = this.f1118m;
            a2.mo1229a(this.f1118m.mo1529g(), attributeSet2, a2.f938l);
            mo1570a(a2, true);
            fragment = a2;
        } else if (!a.f950x) {
            a.f950x = true;
            a.f909C = this.f1118m;
            if (!a.f920N) {
                a.mo1229a(this.f1118m.mo1529g(), attributeSet2, a.f938l);
            }
            fragment = a;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(attributeSet.getPositionDescription());
            sb3.append(": Duplicate id 0x");
            sb3.append(Integer.toHexString(resourceId));
            sb3.append(", tag ");
            sb3.append(string);
            sb3.append(", or parent id 0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(" with another fragment for ");
            sb3.append(str3);
            throw new IllegalArgumentException(sb3.toString());
        }
        if (this.f1117l >= 1 || !fragment.f949w) {
            mo1590c(fragment);
        } else {
            mo1566a(fragment, 1, 0, 0, false);
        }
        if (fragment.f925S != null) {
            if (resourceId != 0) {
                fragment.f925S.setId(resourceId);
            }
            if (fragment.f925S.getTag() == null) {
                fragment.f925S.setTag(string);
            }
            return fragment.f925S;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(str3);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo1622p() {
        this.f1123s = false;
        this.f1124t = false;
        m1691e(2);
    }

    /* renamed from: p */
    public void mo1623p(Fragment fragment) {
        if (fragment == null || (this.f1111f.get(fragment.f941o) == fragment && (fragment.f909C == null || fragment.mo1322u() == this))) {
            this.f1121p = fragment;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: q */
    public void mo1624q() {
        this.f1123s = false;
        this.f1124t = false;
        m1691e(4);
    }

    /* renamed from: r */
    public void mo1625r() {
        this.f1123s = false;
        this.f1124t = false;
        m1691e(5);
    }

    /* renamed from: s */
    public void mo1626s() {
        m1691e(4);
    }

    /* renamed from: t */
    public void mo1627t() {
        this.f1124t = true;
        m1691e(3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0493d.m2201a(this.f1120o != null ? this.f1120o : this.f1118m, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo1629u() {
        m1691e(2);
    }

    /* renamed from: v */
    public void mo1630v() {
        m1691e(1);
    }

    /* renamed from: w */
    public void mo1631w() {
        this.f1125u = true;
        mo1605h();
        m1691e(0);
        this.f1118m = null;
        this.f1119n = null;
        this.f1120o = null;
    }

    /* renamed from: x */
    public void mo1632x() {
        for (int i = 0; i < this.f1110e.size(); i++) {
            Fragment fragment = (Fragment) this.f1110e.get(i);
            if (fragment != null) {
                fragment.mo1247ab();
            }
        }
    }

    /* renamed from: y */
    public Fragment mo1633y() {
        return this.f1121p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public Factory2 mo1634z() {
        return this;
    }
}
