package android.support.p023v7.widget;

import android.os.Bundle;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.p021a.C0583b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.av */
public class C1052av extends C0577a {

    /* renamed from: a */
    final RecyclerView f3637a;

    /* renamed from: c */
    final C0577a f3638c = new C1053a(this);

    /* renamed from: android.support.v7.widget.av$a */
    public static class C1053a extends C0577a {

        /* renamed from: a */
        final C1052av f3639a;

        public C1053a(C1052av avVar) {
            this.f3639a = avVar;
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            super.mo285a(view, bVar);
            if (!this.f3639a.mo5199b() && this.f3639a.f3637a.getLayoutManager() != null) {
                this.f3639a.f3637a.getLayoutManager().mo4402a(view, bVar);
            }
        }

        /* renamed from: a */
        public boolean mo2319a(View view, int i, Bundle bundle) {
            if (super.mo2319a(view, i, bundle)) {
                return true;
            }
            if (this.f3639a.mo5199b() || this.f3639a.f3637a.getLayoutManager() == null) {
                return false;
            }
            return this.f3639a.f3637a.getLayoutManager().mo4414a(view, i, bundle);
        }
    }

    public C1052av(RecyclerView recyclerView) {
        this.f3637a = recyclerView;
    }

    /* renamed from: a */
    public void mo285a(View view, C0583b bVar) {
        super.mo285a(view, bVar);
        bVar.mo2361b((CharSequence) RecyclerView.class.getName());
        if (!mo5199b() && this.f3637a.getLayoutManager() != null) {
            this.f3637a.getLayoutManager().mo4389a(bVar);
        }
    }

    /* renamed from: a */
    public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo474a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !mo5199b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo4080a(accessibilityEvent);
            }
        }
    }

    /* renamed from: a */
    public boolean mo2319a(View view, int i, Bundle bundle) {
        if (super.mo2319a(view, i, bundle)) {
            return true;
        }
        if (mo5199b() || this.f3637a.getLayoutManager() == null) {
            return false;
        }
        return this.f3637a.getLayoutManager().mo4405a(i, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5199b() {
        return this.f3637a.mo4287v();
    }

    /* renamed from: c */
    public C0577a mo5200c() {
        return this.f3638c;
    }
}
