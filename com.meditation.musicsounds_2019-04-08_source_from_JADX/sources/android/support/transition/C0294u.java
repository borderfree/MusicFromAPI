package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.p019g.C0495f;
import android.support.p009v4.p019g.C0510m;
import android.support.p009v4.view.C0626s;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.transition.u */
public abstract class C0294u implements Cloneable {

    /* renamed from: g */
    private static final int[] f799g = {2, 1, 3, 4};

    /* renamed from: h */
    private static final C0284l f800h = new C0284l() {
        /* renamed from: a */
        public Path mo1069a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };

    /* renamed from: z */
    private static ThreadLocal<C0488a<Animator, C0298a>> f801z = new ThreadLocal<>();

    /* renamed from: A */
    private ViewGroup f802A = null;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ArrayList<Animator> f803B = new ArrayList<>();

    /* renamed from: C */
    private int f804C = 0;

    /* renamed from: D */
    private boolean f805D = false;

    /* renamed from: E */
    private boolean f806E = false;

    /* renamed from: F */
    private ArrayList<C0300c> f807F = null;

    /* renamed from: G */
    private ArrayList<Animator> f808G = new ArrayList<>();

    /* renamed from: H */
    private C0299b f809H;

    /* renamed from: I */
    private C0488a<String, String> f810I;

    /* renamed from: J */
    private C0284l f811J = f800h;

    /* renamed from: a */
    long f812a = -1;

    /* renamed from: b */
    ArrayList<Integer> f813b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<View> f814c = new ArrayList<>();

    /* renamed from: d */
    C0306y f815d = null;

    /* renamed from: e */
    boolean f816e = false;

    /* renamed from: f */
    C0305x f817f;

    /* renamed from: i */
    private String f818i = getClass().getName();

    /* renamed from: j */
    private long f819j = -1;

    /* renamed from: k */
    private TimeInterpolator f820k = null;

    /* renamed from: l */
    private ArrayList<String> f821l = null;

    /* renamed from: m */
    private ArrayList<Class> f822m = null;

    /* renamed from: n */
    private ArrayList<Integer> f823n = null;

    /* renamed from: o */
    private ArrayList<View> f824o = null;

    /* renamed from: p */
    private ArrayList<Class> f825p = null;

    /* renamed from: q */
    private ArrayList<String> f826q = null;

    /* renamed from: r */
    private ArrayList<Integer> f827r = null;

    /* renamed from: s */
    private ArrayList<View> f828s = null;

    /* renamed from: t */
    private ArrayList<Class> f829t = null;

    /* renamed from: u */
    private C0231ab f830u = new C0231ab();

    /* renamed from: v */
    private C0231ab f831v = new C0231ab();

    /* renamed from: w */
    private int[] f832w = f799g;

    /* renamed from: x */
    private ArrayList<C0230aa> f833x;

    /* renamed from: y */
    private ArrayList<C0230aa> f834y;

    /* renamed from: android.support.transition.u$a */
    private static class C0298a {

        /* renamed from: a */
        View f838a;

        /* renamed from: b */
        String f839b;

        /* renamed from: c */
        C0230aa f840c;

        /* renamed from: d */
        C0259aw f841d;

        /* renamed from: e */
        C0294u f842e;

        C0298a(View view, String str, C0294u uVar, C0259aw awVar, C0230aa aaVar) {
            this.f838a = view;
            this.f839b = str;
            this.f840c = aaVar;
            this.f841d = awVar;
            this.f842e = uVar;
        }
    }

    /* renamed from: android.support.transition.u$b */
    public static abstract class C0299b {
    }

    /* renamed from: android.support.transition.u$c */
    public interface C0300c {
        /* renamed from: a */
        void mo971a(C0294u uVar);

        /* renamed from: b */
        void mo972b(C0294u uVar);

        /* renamed from: c */
        void mo973c(C0294u uVar);

        /* renamed from: d */
        void mo974d(C0294u uVar);
    }

    /* renamed from: a */
    private void m1062a(Animator animator, final C0488a<Animator, C0298a> aVar) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    aVar.remove(animator);
                    C0294u.this.f803B.remove(animator);
                }

                public void onAnimationStart(Animator animator) {
                    C0294u.this.f803B.add(animator);
                }
            });
            mo1082a(animator);
        }
    }

    /* renamed from: a */
    private void m1063a(C0231ab abVar, C0231ab abVar2) {
        C0488a aVar = new C0488a((C0510m) abVar.f692a);
        C0488a aVar2 = new C0488a((C0510m) abVar2.f692a);
        for (int i : this.f832w) {
            switch (i) {
                case 1:
                    m1065a(aVar, aVar2);
                    break;
                case 2:
                    m1066a(aVar, aVar2, abVar.f695d, abVar2.f695d);
                    break;
                case 3:
                    m1068a(aVar, aVar2, abVar.f693b, abVar2.f693b);
                    break;
                case 4:
                    m1067a(aVar, aVar2, abVar.f694c, abVar2.f694c);
                    break;
            }
        }
        m1070b(aVar, aVar2);
    }

    /* renamed from: a */
    private static void m1064a(C0231ab abVar, View view, C0230aa aaVar) {
        abVar.f692a.put(view, aaVar);
        int id = view.getId();
        if (id >= 0) {
            if (abVar.f693b.indexOfKey(id) >= 0) {
                abVar.f693b.put(id, null);
            } else {
                abVar.f693b.put(id, view);
            }
        }
        String m = C0626s.m2870m(view);
        if (m != null) {
            if (abVar.f695d.containsKey(m)) {
                abVar.f695d.put(m, null);
            } else {
                abVar.f695d.put(m, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (abVar.f694c.mo1923c(itemIdAtPosition) >= 0) {
                    View view2 = (View) abVar.f694c.mo1916a(itemIdAtPosition);
                    if (view2 != null) {
                        C0626s.m2850a(view2, false);
                        abVar.f694c.mo1922b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0626s.m2850a(view, true);
                abVar.f694c.mo1922b(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m1065a(C0488a<View, C0230aa> aVar, C0488a<View, C0230aa> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo2010b(size);
            if (view != null && mo1088a(view)) {
                C0230aa aaVar = (C0230aa) aVar2.remove(view);
                if (!(aaVar == null || aaVar.f690b == null || !mo1088a(aaVar.f690b))) {
                    this.f833x.add((C0230aa) aVar.mo2015d(size));
                    this.f834y.add(aaVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1066a(C0488a<View, C0230aa> aVar, C0488a<View, C0230aa> aVar2, C0488a<String, View> aVar3, C0488a<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo2011c(i);
            if (view != null && mo1088a(view)) {
                View view2 = (View) aVar4.get(aVar3.mo2010b(i));
                if (view2 != null && mo1088a(view2)) {
                    C0230aa aaVar = (C0230aa) aVar.get(view);
                    C0230aa aaVar2 = (C0230aa) aVar2.get(view2);
                    if (!(aaVar == null || aaVar2 == null)) {
                        this.f833x.add(aaVar);
                        this.f834y.add(aaVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1067a(C0488a<View, C0230aa> aVar, C0488a<View, C0230aa> aVar2, C0495f<View> fVar, C0495f<View> fVar2) {
        int b = fVar.mo1919b();
        for (int i = 0; i < b; i++) {
            View view = (View) fVar.mo1924c(i);
            if (view != null && mo1088a(view)) {
                View view2 = (View) fVar2.mo1916a(fVar.mo1920b(i));
                if (view2 != null && mo1088a(view2)) {
                    C0230aa aaVar = (C0230aa) aVar.get(view);
                    C0230aa aaVar2 = (C0230aa) aVar2.get(view2);
                    if (!(aaVar == null || aaVar2 == null)) {
                        this.f833x.add(aaVar);
                        this.f834y.add(aaVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1068a(C0488a<View, C0230aa> aVar, C0488a<View, C0230aa> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo1088a(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo1088a(view2)) {
                    C0230aa aaVar = (C0230aa) aVar.get(view);
                    C0230aa aaVar2 = (C0230aa) aVar2.get(view2);
                    if (!(aaVar == null || aaVar2 == null)) {
                        this.f833x.add(aaVar);
                        this.f834y.add(aaVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m1069a(C0230aa aaVar, C0230aa aaVar2, String str) {
        Object obj = aaVar.f689a.get(str);
        Object obj2 = aaVar2.f689a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m1070b(C0488a<View, C0230aa> aVar, C0488a<View, C0230aa> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C0230aa aaVar = (C0230aa) aVar.mo2011c(i);
            if (mo1088a(aaVar.f690b)) {
                this.f833x.add(aaVar);
                this.f834y.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C0230aa aaVar2 = (C0230aa) aVar2.mo2011c(i2);
            if (mo1088a(aaVar2.f690b)) {
                this.f834y.add(aaVar2);
                this.f833x.add(null);
            }
        }
    }

    /* renamed from: c */
    private void m1071c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            if (this.f823n != null && this.f823n.contains(Integer.valueOf(id))) {
                return;
            }
            if (this.f824o == null || !this.f824o.contains(view)) {
                if (this.f825p != null) {
                    int size = this.f825p.size();
                    int i = 0;
                    while (i < size) {
                        if (!((Class) this.f825p.get(i)).isInstance(view)) {
                            i++;
                        } else {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C0230aa aaVar = new C0230aa();
                    aaVar.f690b = view;
                    if (z) {
                        mo1017a(aaVar);
                    } else {
                        mo1022b(aaVar);
                    }
                    aaVar.f691c.add(this);
                    mo1096c(aaVar);
                    m1064a(z ? this.f830u : this.f831v, view, aaVar);
                }
                if ((view instanceof ViewGroup) && (this.f827r == null || !this.f827r.contains(Integer.valueOf(id)))) {
                    if (this.f828s == null || !this.f828s.contains(view)) {
                        if (this.f829t != null) {
                            int size2 = this.f829t.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                if (!((Class) this.f829t.get(i2)).isInstance(view)) {
                                    i2++;
                                } else {
                                    return;
                                }
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                            m1071c(viewGroup.getChildAt(i3), z);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    private static C0488a<Animator, C0298a> mo1130o() {
        C0488a<Animator, C0298a> aVar = (C0488a) f801z.get();
        if (aVar != null) {
            return aVar;
        }
        C0488a<Animator, C0298a> aVar2 = new C0488a<>();
        f801z.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo1014a(ViewGroup viewGroup, C0230aa aaVar, C0230aa aaVar2) {
        return null;
    }

    /* renamed from: a */
    public C0230aa mo1078a(View view, boolean z) {
        if (this.f815d != null) {
            return this.f815d.mo1078a(view, z);
        }
        return (C0230aa) (z ? this.f830u : this.f831v).f692a.get(view);
    }

    /* renamed from: a */
    public C0294u mo1079a(long j) {
        this.f812a = j;
        return this;
    }

    /* renamed from: a */
    public C0294u mo1080a(C0300c cVar) {
        if (this.f807F == null) {
            this.f807F = new ArrayList<>();
        }
        this.f807F.add(cVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo1081a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        if (this.f812a != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f812a);
            sb3.append(") ");
            sb2 = sb3.toString();
        }
        if (this.f819j != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f819j);
            sb4.append(") ");
            sb2 = sb4.toString();
        }
        if (this.f820k != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f820k);
            sb5.append(") ");
            sb2 = sb5.toString();
        }
        if (this.f813b.size() <= 0 && this.f814c.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        if (this.f813b.size() > 0) {
            String str2 = sb7;
            for (int i = 0; i < this.f813b.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append(", ");
                    str2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f813b.get(i));
                str2 = sb9.toString();
            }
            sb7 = str2;
        }
        if (this.f814c.size() > 0) {
            for (int i2 = 0; i2 < this.f814c.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(", ");
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f814c.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1082a(Animator animator) {
        if (animator == null) {
            mo1107k();
            return;
        }
        if (mo1089b() >= 0) {
            animator.setDuration(mo1089b());
        }
        if (mo1094c() >= 0) {
            animator.setStartDelay(mo1094c());
        }
        if (mo1098d() != null) {
            animator.setInterpolator(mo1098d());
        }
        animator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                C0294u.this.mo1107k();
                animator.removeListener(this);
            }
        });
        animator.start();
    }

    /* renamed from: a */
    public abstract void mo1017a(C0230aa aaVar);

    /* renamed from: a */
    public void mo1083a(C0299b bVar) {
        this.f809H = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1084a(ViewGroup viewGroup) {
        this.f833x = new ArrayList<>();
        this.f834y = new ArrayList<>();
        m1063a(this.f830u, this.f831v);
        C0488a o = mo1130o();
        int size = o.size();
        C0259aw b = C0244am.m947b(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) o.mo2010b(i);
            if (animator != null) {
                C0298a aVar = (C0298a) o.get(animator);
                if (!(aVar == null || aVar.f838a == null || !b.equals(aVar.f841d))) {
                    C0230aa aaVar = aVar.f840c;
                    View view = aVar.f838a;
                    C0230aa a = mo1078a(view, true);
                    C0230aa b2 = mo1090b(view, true);
                    if (!(a == null && b2 == null) && aVar.f842e.mo1018a(aaVar, b2)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            o.remove(animator);
                        }
                    }
                }
            }
        }
        mo1085a(viewGroup, this.f830u, this.f831v, this.f833x, this.f834y);
        mo1100e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1085a(ViewGroup viewGroup, C0231ab abVar, C0231ab abVar2, ArrayList<C0230aa> arrayList, ArrayList<C0230aa> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C0230aa aaVar;
        C0230aa aaVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C0488a o = mo1130o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C0230aa aaVar3 = (C0230aa) arrayList.get(i3);
            C0230aa aaVar4 = (C0230aa) arrayList2.get(i3);
            if (aaVar3 != null && !aaVar3.f691c.contains(this)) {
                aaVar3 = null;
            }
            if (aaVar4 != null && !aaVar4.f691c.contains(this)) {
                aaVar4 = null;
            }
            if (!(aaVar3 == null && aaVar4 == null)) {
                if (aaVar3 == null || aaVar4 == null || mo1018a(aaVar3, aaVar4)) {
                    Animator a = mo1014a(viewGroup2, aaVar3, aaVar4);
                    if (a != null) {
                        if (aaVar4 != null) {
                            view = aaVar4.f690b;
                            String[] a2 = mo1019a();
                            if (view != null && a2 != null && a2.length > 0) {
                                aaVar2 = new C0230aa();
                                aaVar2.f690b = view;
                                Animator animator3 = a;
                                i2 = size;
                                C0230aa aaVar5 = (C0230aa) abVar2.f692a.get(view);
                                if (aaVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < a2.length) {
                                        int i5 = i3;
                                        C0230aa aaVar6 = aaVar5;
                                        aaVar2.f689a.put(a2[i4], aaVar5.f689a.get(a2[i4]));
                                        i4++;
                                        i3 = i5;
                                        aaVar5 = aaVar6;
                                        ArrayList<C0230aa> arrayList3 = arrayList2;
                                    }
                                }
                                i = i3;
                                int size2 = o.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C0298a aVar = (C0298a) o.get((Animator) o.mo2010b(i6));
                                    if (aVar.f840c != null && aVar.f838a == view && aVar.f839b.equals(mo1110n()) && aVar.f840c.equals(aaVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                aaVar2 = null;
                            }
                            animator = animator2;
                            aaVar = aaVar2;
                        } else {
                            Animator animator4 = a;
                            i2 = size;
                            i = i3;
                            view = aaVar3.f690b;
                            animator = animator4;
                            aaVar = null;
                        }
                        if (animator != null) {
                            if (this.f817f != null) {
                                long a3 = this.f817f.mo1118a(viewGroup2, this, aaVar3, aaVar4);
                                sparseIntArray.put(this.f808G.size(), (int) a3);
                                j = Math.min(a3, j);
                            }
                            long j2 = j;
                            C0298a aVar2 = new C0298a(view, mo1110n(), this, C0244am.m947b(viewGroup), aaVar);
                            o.put(animator, aVar2);
                            this.f808G.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator5 = (Animator) this.f808G.get(sparseIntArray.keyAt(i7));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1086a(ViewGroup viewGroup, boolean z) {
        mo1087a(z);
        if ((this.f813b.size() > 0 || this.f814c.size() > 0) && ((this.f821l == null || this.f821l.isEmpty()) && (this.f822m == null || this.f822m.isEmpty()))) {
            for (int i = 0; i < this.f813b.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f813b.get(i)).intValue());
                if (findViewById != null) {
                    C0230aa aaVar = new C0230aa();
                    aaVar.f690b = findViewById;
                    if (z) {
                        mo1017a(aaVar);
                    } else {
                        mo1022b(aaVar);
                    }
                    aaVar.f691c.add(this);
                    mo1096c(aaVar);
                    m1064a(z ? this.f830u : this.f831v, findViewById, aaVar);
                }
            }
            for (int i2 = 0; i2 < this.f814c.size(); i2++) {
                View view = (View) this.f814c.get(i2);
                C0230aa aaVar2 = new C0230aa();
                aaVar2.f690b = view;
                if (z) {
                    mo1017a(aaVar2);
                } else {
                    mo1022b(aaVar2);
                }
                aaVar2.f691c.add(this);
                mo1096c(aaVar2);
                m1064a(z ? this.f830u : this.f831v, view, aaVar2);
            }
        } else {
            m1071c(viewGroup, z);
        }
        if (!z && this.f810I != null) {
            int size = this.f810I.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(this.f830u.f695d.remove((String) this.f810I.mo2010b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList.get(i4);
                if (view2 != null) {
                    this.f830u.f695d.put((String) this.f810I.mo2011c(i4), view2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1087a(boolean z) {
        C0231ab abVar;
        if (z) {
            this.f830u.f692a.clear();
            this.f830u.f693b.clear();
            abVar = this.f830u;
        } else {
            this.f831v.f692a.clear();
            this.f831v.f693b.clear();
            abVar = this.f831v;
        }
        abVar.f694c.mo1925c();
    }

    /* renamed from: a */
    public boolean mo1018a(C0230aa aaVar, C0230aa aaVar2) {
        if (aaVar == null || aaVar2 == null) {
            return false;
        }
        String[] a = mo1019a();
        if (a != null) {
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m1069a(aaVar, aaVar2, a[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a2 : aaVar.f689a.keySet()) {
            if (m1069a(aaVar, aaVar2, a2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1088a(View view) {
        int id = view.getId();
        if (this.f823n != null && this.f823n.contains(Integer.valueOf(id))) {
            return false;
        }
        if (this.f824o != null && this.f824o.contains(view)) {
            return false;
        }
        if (this.f825p != null) {
            int size = this.f825p.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f825p.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f826q != null && C0626s.m2870m(view) != null && this.f826q.contains(C0626s.m2870m(view))) {
            return false;
        }
        if ((this.f813b.size() == 0 && this.f814c.size() == 0 && ((this.f822m == null || this.f822m.isEmpty()) && (this.f821l == null || this.f821l.isEmpty()))) || this.f813b.contains(Integer.valueOf(id)) || this.f814c.contains(view)) {
            return true;
        }
        if (this.f821l != null && this.f821l.contains(C0626s.m2870m(view))) {
            return true;
        }
        if (this.f822m != null) {
            for (int i2 = 0; i2 < this.f822m.size(); i2++) {
                if (((Class) this.f822m.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public String[] mo1019a() {
        return null;
    }

    /* renamed from: b */
    public long mo1089b() {
        return this.f812a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0230aa mo1090b(View view, boolean z) {
        if (this.f815d != null) {
            return this.f815d.mo1090b(view, z);
        }
        ArrayList<C0230aa> arrayList = z ? this.f833x : this.f834y;
        C0230aa aaVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C0230aa aaVar2 = (C0230aa) arrayList.get(i2);
            if (aaVar2 == null) {
                return null;
            }
            if (aaVar2.f690b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            aaVar = (C0230aa) (z ? this.f834y : this.f833x).get(i);
        }
        return aaVar;
    }

    /* renamed from: b */
    public C0294u mo1091b(long j) {
        this.f819j = j;
        return this;
    }

    /* renamed from: b */
    public C0294u mo1092b(C0300c cVar) {
        if (this.f807F == null) {
            return this;
        }
        this.f807F.remove(cVar);
        if (this.f807F.size() == 0) {
            this.f807F = null;
        }
        return this;
    }

    /* renamed from: b */
    public C0294u mo1093b(View view) {
        this.f814c.add(view);
        return this;
    }

    /* renamed from: b */
    public abstract void mo1022b(C0230aa aaVar);

    /* renamed from: c */
    public long mo1094c() {
        return this.f819j;
    }

    /* renamed from: c */
    public C0294u mo1095c(View view) {
        this.f814c.remove(view);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1096c(C0230aa aaVar) {
        if (this.f817f != null && !aaVar.f689a.isEmpty()) {
            String[] a = this.f817f.mo1120a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!aaVar.f689a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f817f.mo1119a(aaVar);
                }
            }
        }
    }

    /* renamed from: d */
    public TimeInterpolator mo1098d() {
        return this.f820k;
    }

    /* renamed from: d */
    public void mo1099d(View view) {
        if (!this.f806E) {
            C0488a o = mo1130o();
            int size = o.size();
            C0259aw b = C0244am.m947b(view);
            for (int i = size - 1; i >= 0; i--) {
                C0298a aVar = (C0298a) o.mo2011c(i);
                if (aVar.f838a != null && b.equals(aVar.f841d)) {
                    C0229a.m905a((Animator) o.mo2010b(i));
                }
            }
            if (this.f807F != null && this.f807F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f807F.clone();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C0300c) arrayList.get(i2)).mo972b(this);
                }
            }
            this.f805D = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1100e() {
        mo1106j();
        C0488a o = mo1130o();
        Iterator it = this.f808G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (o.containsKey(animator)) {
                mo1106j();
                m1062a(animator, o);
            }
        }
        this.f808G.clear();
        mo1107k();
    }

    /* renamed from: e */
    public void mo1101e(View view) {
        if (this.f805D) {
            if (!this.f806E) {
                C0488a o = mo1130o();
                int size = o.size();
                C0259aw b = C0244am.m947b(view);
                for (int i = size - 1; i >= 0; i--) {
                    C0298a aVar = (C0298a) o.mo2011c(i);
                    if (aVar.f838a != null && b.equals(aVar.f841d)) {
                        C0229a.m907b((Animator) o.mo2010b(i));
                    }
                }
                if (this.f807F != null && this.f807F.size() > 0) {
                    ArrayList arrayList = (ArrayList) this.f807F.clone();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C0300c) arrayList.get(i2)).mo973c(this);
                    }
                }
            }
            this.f805D = false;
        }
    }

    /* renamed from: f */
    public List<Integer> mo1102f() {
        return this.f813b;
    }

    /* renamed from: g */
    public List<View> mo1103g() {
        return this.f814c;
    }

    /* renamed from: h */
    public List<String> mo1104h() {
        return this.f821l;
    }

    /* renamed from: i */
    public List<Class> mo1105i() {
        return this.f822m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo1106j() {
        if (this.f804C == 0) {
            if (this.f807F != null && this.f807F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f807F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0300c) arrayList.get(i)).mo974d(this);
                }
            }
            this.f806E = false;
        }
        this.f804C++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo1107k() {
        this.f804C--;
        if (this.f804C == 0) {
            if (this.f807F != null && this.f807F.size() > 0) {
                ArrayList arrayList = (ArrayList) this.f807F.clone();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0300c) arrayList.get(i)).mo971a(this);
                }
            }
            for (int i2 = 0; i2 < this.f830u.f694c.mo1919b(); i2++) {
                View view = (View) this.f830u.f694c.mo1924c(i2);
                if (view != null) {
                    C0626s.m2850a(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f831v.f694c.mo1919b(); i3++) {
                View view2 = (View) this.f831v.f694c.mo1924c(i3);
                if (view2 != null) {
                    C0626s.m2850a(view2, false);
                }
            }
            this.f806E = true;
        }
    }

    /* renamed from: l */
    public C0284l mo1108l() {
        return this.f811J;
    }

    /* renamed from: m */
    public C0294u clone() {
        try {
            C0294u uVar = (C0294u) super.clone();
            uVar.f808G = new ArrayList<>();
            uVar.f830u = new C0231ab();
            uVar.f831v = new C0231ab();
            uVar.f833x = null;
            uVar.f834y = null;
            return uVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public String mo1110n() {
        return this.f818i;
    }

    public String toString() {
        return mo1081a("");
    }
}
