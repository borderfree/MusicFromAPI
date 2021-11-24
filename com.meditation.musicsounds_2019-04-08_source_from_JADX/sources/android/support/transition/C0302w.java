package android.support.transition;

import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.view.C0626s;
import android.support.transition.C0294u.C0300c;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.w */
public class C0302w {

    /* renamed from: a */
    private static C0294u f843a = new C0264e();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0488a<ViewGroup, ArrayList<C0294u>>>> f844b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static ArrayList<ViewGroup> f845c = new ArrayList<>();

    /* renamed from: android.support.transition.w$a */
    private static class C0303a implements OnAttachStateChangeListener, OnPreDrawListener {

        /* renamed from: a */
        C0294u f846a;

        /* renamed from: b */
        ViewGroup f847b;

        C0303a(C0294u uVar, ViewGroup viewGroup) {
            this.f846a = uVar;
            this.f847b = viewGroup;
        }

        /* renamed from: a */
        private void m1124a() {
            this.f847b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f847b.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m1124a();
            if (!C0302w.f845c.remove(this.f847b)) {
                return true;
            }
            final C0488a a = C0302w.m1119a();
            ArrayList arrayList = (ArrayList) a.get(this.f847b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f847b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f846a);
            this.f846a.mo1080a((C0300c) new C0301v() {
                /* renamed from: a */
                public void mo971a(C0294u uVar) {
                    ((ArrayList) a.get(C0303a.this.f847b)).remove(uVar);
                }
            });
            this.f846a.mo1086a(this.f847b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0294u) it.next()).mo1101e(this.f847b);
                }
            }
            this.f846a.mo1084a(this.f847b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m1124a();
            C0302w.f845c.remove(this.f847b);
            ArrayList arrayList = (ArrayList) C0302w.m1119a().get(this.f847b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0294u) it.next()).mo1101e(this.f847b);
                }
            }
            this.f846a.mo1087a(true);
        }
    }

    /* renamed from: a */
    static C0488a<ViewGroup, ArrayList<C0294u>> m1119a() {
        WeakReference weakReference = (WeakReference) f844b.get();
        if (weakReference == null || weakReference.get() == null) {
            WeakReference weakReference2 = new WeakReference(new C0488a());
            f844b.set(weakReference2);
            weakReference = weakReference2;
        }
        return (C0488a) weakReference.get();
    }

    /* renamed from: a */
    public static void m1120a(ViewGroup viewGroup, C0294u uVar) {
        if (!f845c.contains(viewGroup) && C0626s.m2880w(viewGroup)) {
            f845c.add(viewGroup);
            if (uVar == null) {
                uVar = f843a;
            }
            C0294u m = uVar.clone();
            m1123c(viewGroup, m);
            C0293t.m1059a(viewGroup, null);
            m1122b(viewGroup, m);
        }
    }

    /* renamed from: b */
    private static void m1122b(ViewGroup viewGroup, C0294u uVar) {
        if (uVar != null && viewGroup != null) {
            C0303a aVar = new C0303a(uVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m1123c(ViewGroup viewGroup, C0294u uVar) {
        ArrayList arrayList = (ArrayList) m1119a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0294u) it.next()).mo1099d(viewGroup);
            }
        }
        if (uVar != null) {
            uVar.mo1086a(viewGroup, true);
        }
        C0293t a = C0293t.m1058a(viewGroup);
        if (a != null) {
            a.mo1077a();
        }
    }
}
