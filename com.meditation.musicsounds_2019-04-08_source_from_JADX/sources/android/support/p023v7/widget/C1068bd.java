package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0944l;
import android.support.p023v7.widget.RecyclerView.C0946n;
import android.support.p023v7.widget.RecyclerView.C0952s;
import android.support.p023v7.widget.RecyclerView.C0952s.C0953a;
import android.support.p023v7.widget.RecyclerView.C0952s.C0954b;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: android.support.v7.widget.bd */
public abstract class C1068bd extends C0944l {

    /* renamed from: a */
    RecyclerView f3705a;

    /* renamed from: b */
    private Scroller f3706b;

    /* renamed from: c */
    private final C0946n f3707c = new C0946n() {

        /* renamed from: a */
        boolean f3708a = false;

        /* renamed from: a */
        public void mo4485a(RecyclerView recyclerView, int i) {
            super.mo4485a(recyclerView, i);
            if (i == 0 && this.f3708a) {
                this.f3708a = false;
                C1068bd.this.mo5338a();
            }
        }

        /* renamed from: a */
        public void mo4486a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3708a = true;
            }
        }
    };

    /* renamed from: b */
    private void m5831b() {
        if (this.f3705a.getOnFlingListener() == null) {
            this.f3705a.mo4144a(this.f3707c);
            this.f3705a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: b */
    private boolean m5832b(C0937i iVar, int i, int i2) {
        if (!(iVar instanceof C0954b)) {
            return false;
        }
        C0952s c = mo5340c(iVar);
        if (c == null) {
            return false;
        }
        int a = mo5195a(iVar, i, i2);
        if (a == -1) {
            return false;
        }
        c.mo4543d(a);
        iVar.mo4395a(c);
        return true;
    }

    /* renamed from: c */
    private void m5833c() {
        this.f3705a.mo4162b(this.f3707c);
        this.f3705a.setOnFlingListener(null);
    }

    /* renamed from: a */
    public abstract int mo5195a(C0937i iVar, int i, int i2);

    /* renamed from: a */
    public abstract View mo5196a(C0937i iVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5338a() {
        if (this.f3705a != null) {
            C0937i layoutManager = this.f3705a.getLayoutManager();
            if (layoutManager != null) {
                View a = mo5196a(layoutManager);
                if (a != null) {
                    int[] a2 = mo5197a(layoutManager, a);
                    if (!(a2[0] == 0 && a2[1] == 0)) {
                        this.f3705a.mo4136a(a2[0], a2[1]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5339a(RecyclerView recyclerView) {
        if (this.f3705a != recyclerView) {
            if (this.f3705a != null) {
                m5833c();
            }
            this.f3705a = recyclerView;
            if (this.f3705a != null) {
                m5831b();
                this.f3706b = new Scroller(this.f3705a.getContext(), new DecelerateInterpolator());
                mo5338a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo4481a(int i, int i2) {
        C0937i layoutManager = this.f3705a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f3705a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3705a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5832b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public abstract int[] mo5197a(C0937i iVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C1033ao mo5198b(C0937i iVar) {
        if (!(iVar instanceof C0954b)) {
            return null;
        }
        return new C1033ao(this.f3705a.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public float mo5123a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo4540a(View view, C0955t tVar, C0953a aVar) {
                if (C1068bd.this.f3705a != null) {
                    int[] a = C1068bd.this.mo5197a(C1068bd.this.f3705a.getLayoutManager(), view);
                    int i = a[0];
                    int i2 = a[1];
                    int a2 = mo5124a(Math.max(Math.abs(i), Math.abs(i2)));
                    if (a2 > 0) {
                        aVar.mo4552a(i, i2, a2, this.f3576b);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0952s mo5340c(C0937i iVar) {
        return mo5198b(iVar);
    }
}
