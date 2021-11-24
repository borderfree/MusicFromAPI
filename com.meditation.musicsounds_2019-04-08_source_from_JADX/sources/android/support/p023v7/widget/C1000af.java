package android.support.p023v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.af */
public class C1000af extends C1067bc {

    /* renamed from: i */
    private static TimeInterpolator f3418i;

    /* renamed from: a */
    ArrayList<ArrayList<C0958w>> f3419a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1010b>> f3420b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1009a>> f3421c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C0958w> f3422d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C0958w> f3423e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C0958w> f3424f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C0958w> f3425g = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0958w> f3426j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0958w> f3427k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<C1010b> f3428l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C1009a> f3429m = new ArrayList<>();

    /* renamed from: android.support.v7.widget.af$a */
    private static class C1009a {

        /* renamed from: a */
        public C0958w f3458a;

        /* renamed from: b */
        public C0958w f3459b;

        /* renamed from: c */
        public int f3460c;

        /* renamed from: d */
        public int f3461d;

        /* renamed from: e */
        public int f3462e;

        /* renamed from: f */
        public int f3463f;

        private C1009a(C0958w wVar, C0958w wVar2) {
            this.f3458a = wVar;
            this.f3459b = wVar2;
        }

        C1009a(C0958w wVar, C0958w wVar2, int i, int i2, int i3, int i4) {
            this(wVar, wVar2);
            this.f3460c = i;
            this.f3461d = i2;
            this.f3462e = i3;
            this.f3463f = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f3458a);
            sb.append(", newHolder=");
            sb.append(this.f3459b);
            sb.append(", fromX=");
            sb.append(this.f3460c);
            sb.append(", fromY=");
            sb.append(this.f3461d);
            sb.append(", toX=");
            sb.append(this.f3462e);
            sb.append(", toY=");
            sb.append(this.f3463f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.af$b */
    private static class C1010b {

        /* renamed from: a */
        public C0958w f3464a;

        /* renamed from: b */
        public int f3465b;

        /* renamed from: c */
        public int f3466c;

        /* renamed from: d */
        public int f3467d;

        /* renamed from: e */
        public int f3468e;

        C1010b(C0958w wVar, int i, int i2, int i3, int i4) {
            this.f3464a = wVar;
            this.f3465b = i;
            this.f3466c = i2;
            this.f3467d = i3;
            this.f3468e = i4;
        }
    }

    /* renamed from: a */
    private void m5499a(List<C1009a> list, C0958w wVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1009a aVar = (C1009a) list.get(size);
            if (m5500a(aVar, wVar) && aVar.f3458a == null && aVar.f3459b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m5500a(C1009a aVar, C0958w wVar) {
        boolean z = false;
        if (aVar.f3459b == wVar) {
            aVar.f3459b = null;
        } else if (aVar.f3458a != wVar) {
            return false;
        } else {
            aVar.f3458a = null;
            z = true;
        }
        wVar.f3157a.setAlpha(1.0f);
        wVar.f3157a.setTranslationX(0.0f);
        wVar.f3157a.setTranslationY(0.0f);
        mo5322a(wVar, z);
        return true;
    }

    /* renamed from: b */
    private void m5501b(C1009a aVar) {
        if (aVar.f3458a != null) {
            m5500a(aVar, aVar.f3458a);
        }
        if (aVar.f3459b != null) {
            m5500a(aVar, aVar.f3459b);
        }
    }

    /* renamed from: u */
    private void m5502u(final C0958w wVar) {
        final View view = wVar.f3157a;
        final ViewPropertyAnimator animate = view.animate();
        this.f3424f.add(wVar);
        animate.setDuration(mo4360g()).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                C1000af.this.mo5326i(wVar);
                C1000af.this.f3424f.remove(wVar);
                C1000af.this.mo5017c();
            }

            public void onAnimationStart(Animator animator) {
                C1000af.this.mo5329l(wVar);
            }
        }).start();
    }

    /* renamed from: v */
    private void m5503v(C0958w wVar) {
        if (f3418i == null) {
            f3418i = new ValueAnimator().getInterpolator();
        }
        wVar.f3157a.animate().setInterpolator(f3418i);
        mo4356d(wVar);
    }

    /* renamed from: a */
    public void mo4347a() {
        boolean z = !this.f3426j.isEmpty();
        boolean z2 = !this.f3428l.isEmpty();
        boolean z3 = !this.f3429m.isEmpty();
        boolean z4 = !this.f3427k.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f3426j.iterator();
            while (it.hasNext()) {
                m5502u((C0958w) it.next());
            }
            this.f3426j.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3428l);
                this.f3420b.add(arrayList);
                this.f3428l.clear();
                C10011 r6 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1010b bVar = (C1010b) it.next();
                            C1000af.this.mo5015b(bVar.f3464a, bVar.f3465b, bVar.f3466c, bVar.f3467d, bVar.f3468e);
                        }
                        arrayList.clear();
                        C1000af.this.f3420b.remove(arrayList);
                    }
                };
                if (z) {
                    C0626s.m2848a(((C1010b) arrayList.get(0)).f3464a.f3157a, (Runnable) r6, mo4360g());
                } else {
                    r6.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3429m);
                this.f3421c.add(arrayList2);
                this.f3429m.clear();
                C10022 r62 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1000af.this.mo5010a((C1009a) it.next());
                        }
                        arrayList2.clear();
                        C1000af.this.f3421c.remove(arrayList2);
                    }
                };
                if (z) {
                    C0626s.m2848a(((C1009a) arrayList2.get(0)).f3458a.f3157a, (Runnable) r62, mo4360g());
                } else {
                    r62.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3427k);
                this.f3419a.add(arrayList3);
                this.f3427k.clear();
                C10033 r5 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1000af.this.mo5018c((C0958w) it.next());
                        }
                        arrayList3.clear();
                        C1000af.this.f3419a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j = 0;
                    long g = z ? mo4360g() : 0;
                    long e = z2 ? mo4357e() : 0;
                    if (z3) {
                        j = mo4362h();
                    }
                    C0626s.m2848a(((C0958w) arrayList3.get(0)).f3157a, (Runnable) r5, g + Math.max(e, j));
                } else {
                    r5.run();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5010a(final C1009a aVar) {
        C0958w wVar = aVar.f3458a;
        final View view = null;
        final View view2 = wVar == null ? null : wVar.f3157a;
        C0958w wVar2 = aVar.f3459b;
        if (wVar2 != null) {
            view = wVar2.f3157a;
        }
        if (view2 != null) {
            final ViewPropertyAnimator duration = view2.animate().setDuration(mo4362h());
            this.f3425g.add(aVar.f3458a);
            duration.translationX((float) (aVar.f3462e - aVar.f3460c));
            duration.translationY((float) (aVar.f3463f - aVar.f3461d));
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    C1000af.this.mo5322a(aVar.f3458a, true);
                    C1000af.this.f3425g.remove(aVar.f3458a);
                    C1000af.this.mo5017c();
                }

                public void onAnimationStart(Animator animator) {
                    C1000af.this.mo5323b(aVar.f3458a, true);
                }
            }).start();
        }
        if (view != null) {
            final ViewPropertyAnimator animate = view.animate();
            this.f3425g.add(aVar.f3459b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo4362h()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    C1000af.this.mo5322a(aVar.f3459b, false);
                    C1000af.this.f3425g.remove(aVar.f3459b);
                    C1000af.this.mo5017c();
                }

                public void onAnimationStart(Animator animator) {
                    C1000af.this.mo5323b(aVar.f3459b, false);
                }
            }).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5011a(List<C0958w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0958w) list.get(size)).f3157a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo5012a(C0958w wVar) {
        m5503v(wVar);
        this.f3426j.add(wVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo5013a(C0958w wVar, int i, int i2, int i3, int i4) {
        View view = wVar.f3157a;
        int translationX = i + ((int) wVar.f3157a.getTranslationX());
        int translationY = i2 + ((int) wVar.f3157a.getTranslationY());
        m5503v(wVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo5327j(wVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C1010b> arrayList = this.f3428l;
        C1010b bVar = new C1010b(wVar, translationX, translationY, i3, i4);
        arrayList.add(bVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo5014a(C0958w wVar, C0958w wVar2, int i, int i2, int i3, int i4) {
        if (wVar == wVar2) {
            return mo5013a(wVar, i, i2, i3, i4);
        }
        float translationX = wVar.f3157a.getTranslationX();
        float translationY = wVar.f3157a.getTranslationY();
        float alpha = wVar.f3157a.getAlpha();
        m5503v(wVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        wVar.f3157a.setTranslationX(translationX);
        wVar.f3157a.setTranslationY(translationY);
        wVar.f3157a.setAlpha(alpha);
        if (wVar2 != null) {
            m5503v(wVar2);
            wVar2.f3157a.setTranslationX((float) (-i5));
            wVar2.f3157a.setTranslationY((float) (-i6));
            wVar2.f3157a.setAlpha(0.0f);
        }
        ArrayList<C1009a> arrayList = this.f3429m;
        C1009a aVar = new C1009a(wVar, wVar2, i, i2, i3, i4);
        arrayList.add(aVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo4351a(C0958w wVar, List<Object> list) {
        return !list.isEmpty() || super.mo4351a(wVar, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5015b(C0958w wVar, int i, int i2, int i3, int i4) {
        final View view = wVar.f3157a;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.f3423e.add(wVar);
        ViewPropertyAnimator duration = animate.setDuration(mo4357e());
        final C0958w wVar2 = wVar;
        C10066 r0 = new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1000af.this.mo5327j(wVar2);
                C1000af.this.f3423e.remove(wVar2);
                C1000af.this.mo5017c();
            }

            public void onAnimationStart(Animator animator) {
                C1000af.this.mo5330m(wVar2);
            }
        };
        duration.setListener(r0).start();
    }

    /* renamed from: b */
    public boolean mo4352b() {
        return !this.f3427k.isEmpty() || !this.f3429m.isEmpty() || !this.f3428l.isEmpty() || !this.f3426j.isEmpty() || !this.f3423e.isEmpty() || !this.f3424f.isEmpty() || !this.f3422d.isEmpty() || !this.f3425g.isEmpty() || !this.f3420b.isEmpty() || !this.f3419a.isEmpty() || !this.f3421c.isEmpty();
    }

    /* renamed from: b */
    public boolean mo5016b(C0958w wVar) {
        m5503v(wVar);
        wVar.f3157a.setAlpha(0.0f);
        this.f3427k.add(wVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5017c() {
        if (!mo4352b()) {
            mo4364i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5018c(final C0958w wVar) {
        final View view = wVar.f3157a;
        final ViewPropertyAnimator animate = view.animate();
        this.f3422d.add(wVar);
        animate.alpha(1.0f).setDuration(mo4358f()).setListener(new AnimatorListenerAdapter() {
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                C1000af.this.mo5328k(wVar);
                C1000af.this.f3422d.remove(wVar);
                C1000af.this.mo5017c();
            }

            public void onAnimationStart(Animator animator) {
                C1000af.this.mo5331n(wVar);
            }
        }).start();
    }

    /* renamed from: d */
    public void mo4355d() {
        int size = this.f3428l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1010b bVar = (C1010b) this.f3428l.get(size);
            View view = bVar.f3464a.f3157a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo5327j(bVar.f3464a);
            this.f3428l.remove(size);
        }
        for (int size2 = this.f3426j.size() - 1; size2 >= 0; size2--) {
            mo5326i((C0958w) this.f3426j.get(size2));
            this.f3426j.remove(size2);
        }
        int size3 = this.f3427k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0958w wVar = (C0958w) this.f3427k.get(size3);
            wVar.f3157a.setAlpha(1.0f);
            mo5328k(wVar);
            this.f3427k.remove(size3);
        }
        for (int size4 = this.f3429m.size() - 1; size4 >= 0; size4--) {
            m5501b((C1009a) this.f3429m.get(size4));
        }
        this.f3429m.clear();
        if (mo4352b()) {
            for (int size5 = this.f3420b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3420b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1010b bVar2 = (C1010b) arrayList.get(size6);
                    View view2 = bVar2.f3464a.f3157a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo5327j(bVar2.f3464a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3420b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3419a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3419a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0958w wVar2 = (C0958w) arrayList2.get(size8);
                    wVar2.f3157a.setAlpha(1.0f);
                    mo5328k(wVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3419a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3421c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3421c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5501b((C1009a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3421c.remove(arrayList3);
                    }
                }
            }
            mo5011a((List<C0958w>) this.f3424f);
            mo5011a((List<C0958w>) this.f3423e);
            mo5011a((List<C0958w>) this.f3422d);
            mo5011a((List<C0958w>) this.f3425g);
            mo4364i();
        }
    }

    /* renamed from: d */
    public void mo4356d(C0958w wVar) {
        View view = wVar.f3157a;
        view.animate().cancel();
        int size = this.f3428l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1010b) this.f3428l.get(size)).f3464a == wVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo5327j(wVar);
                this.f3428l.remove(size);
            }
        }
        m5499a((List<C1009a>) this.f3429m, wVar);
        if (this.f3426j.remove(wVar)) {
            view.setAlpha(1.0f);
            mo5326i(wVar);
        }
        if (this.f3427k.remove(wVar)) {
            view.setAlpha(1.0f);
            mo5328k(wVar);
        }
        for (int size2 = this.f3421c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3421c.get(size2);
            m5499a((List<C1009a>) arrayList, wVar);
            if (arrayList.isEmpty()) {
                this.f3421c.remove(size2);
            }
        }
        for (int size3 = this.f3420b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3420b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1010b) arrayList2.get(size4)).f3464a == wVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo5327j(wVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3420b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3419a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3419a.get(size5);
            if (arrayList3.remove(wVar)) {
                view.setAlpha(1.0f);
                mo5328k(wVar);
                if (arrayList3.isEmpty()) {
                    this.f3419a.remove(size5);
                }
            }
        }
        this.f3424f.remove(wVar);
        this.f3422d.remove(wVar);
        this.f3425g.remove(wVar);
        this.f3423e.remove(wVar);
        mo5017c();
    }
}
