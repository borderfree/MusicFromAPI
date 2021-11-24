package android.support.p023v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.m */
abstract class C0868m implements C0871o, C0877s, OnItemClickListener {

    /* renamed from: a */
    private Rect f2699a;

    C0868m() {
    }

    /* renamed from: a */
    protected static int m4193a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: a */
    protected static C0854g m4194a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0854g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0854g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m4195b(C0855h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo3432a(int i);

    /* renamed from: a */
    public void mo316a(Context context, C0855h hVar) {
    }

    /* renamed from: a */
    public void mo3673a(Rect rect) {
        this.f2699a = rect;
    }

    /* renamed from: a */
    public abstract void mo3433a(C0855h hVar);

    /* renamed from: a */
    public abstract void mo3434a(View view);

    /* renamed from: a */
    public abstract void mo3435a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public boolean mo327a(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: b */
    public int mo329b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo3436b(int i);

    /* renamed from: b */
    public abstract void mo3437b(boolean z);

    /* renamed from: b */
    public boolean mo333b(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo3438c(int i);

    /* renamed from: c */
    public abstract void mo3439c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo3444h() {
        return true;
    }

    /* renamed from: i */
    public Rect mo3674i() {
        return this.f2699a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m4194a(listAdapter).f2620b.mo3492a((MenuItem) listAdapter.getItem(i), (C0871o) this, mo3444h() ? 0 : 4);
    }
}
