package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.n */
final class C0206n {

    /* renamed from: a */
    ValueAnimator f648a = null;

    /* renamed from: b */
    private final ArrayList<C0208a> f649b = new ArrayList<>();

    /* renamed from: c */
    private C0208a f650c = null;

    /* renamed from: d */
    private final AnimatorListener f651d = new AnimatorListenerAdapter() {
        public void onAnimationEnd(Animator animator) {
            if (C0206n.this.f648a == animator) {
                C0206n.this.f648a = null;
            }
        }
    };

    /* renamed from: android.support.design.widget.n$a */
    static class C0208a {

        /* renamed from: a */
        final int[] f653a;

        /* renamed from: b */
        final ValueAnimator f654b;

        C0208a(int[] iArr, ValueAnimator valueAnimator) {
            this.f653a = iArr;
            this.f654b = valueAnimator;
        }
    }

    C0206n() {
    }

    /* renamed from: a */
    private void m826a(C0208a aVar) {
        this.f648a = aVar.f654b;
        this.f648a.start();
    }

    /* renamed from: b */
    private void m827b() {
        if (this.f648a != null) {
            this.f648a.cancel();
            this.f648a = null;
        }
    }

    /* renamed from: a */
    public void mo942a() {
        if (this.f648a != null) {
            this.f648a.end();
            this.f648a = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo943a(int[] iArr) {
        C0208a aVar;
        int size = this.f649b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0208a) this.f649b.get(i);
            if (StateSet.stateSetMatches(aVar.f653a, iArr)) {
                break;
            }
            i++;
        }
        if (aVar != this.f650c) {
            if (this.f650c != null) {
                m827b();
            }
            this.f650c = aVar;
            if (aVar != null) {
                m826a(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo944a(int[] iArr, ValueAnimator valueAnimator) {
        C0208a aVar = new C0208a(iArr, valueAnimator);
        valueAnimator.addListener(this.f651d);
        this.f649b.add(aVar);
    }
}
