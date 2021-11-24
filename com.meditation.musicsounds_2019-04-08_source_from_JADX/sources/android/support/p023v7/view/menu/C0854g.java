package android.support.p023v7.view.menu;

import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.g */
public class C0854g extends BaseAdapter {

    /* renamed from: a */
    static final int f2619a = C0733g.abc_popup_menu_item_layout;

    /* renamed from: b */
    C0855h f2620b;

    /* renamed from: c */
    private int f2621c = -1;

    /* renamed from: d */
    private boolean f2622d;

    /* renamed from: e */
    private final boolean f2623e;

    /* renamed from: f */
    private final LayoutInflater f2624f;

    public C0854g(C0855h hVar, LayoutInflater layoutInflater, boolean z) {
        this.f2623e = z;
        this.f2624f = layoutInflater;
        this.f2620b = hVar;
        mo3469b();
    }

    /* renamed from: a */
    public C0855h mo3466a() {
        return this.f2620b;
    }

    /* renamed from: a */
    public C0859j getItem(int i) {
        ArrayList l = this.f2623e ? this.f2620b.mo3531l() : this.f2620b.mo3527i();
        if (this.f2621c >= 0 && i >= this.f2621c) {
            i++;
        }
        return (C0859j) l.get(i);
    }

    /* renamed from: a */
    public void mo3468a(boolean z) {
        this.f2622d = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3469b() {
        C0859j r = this.f2620b.mo3539r();
        if (r != null) {
            ArrayList l = this.f2620b.mo3531l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (((C0859j) l.get(i)) == r) {
                    this.f2621c = i;
                    return;
                }
            }
        }
        this.f2621c = -1;
    }

    public int getCount() {
        ArrayList l = this.f2623e ? this.f2620b.mo3531l() : this.f2620b.mo3527i();
        return this.f2621c < 0 ? l.size() : l.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2624f.inflate(f2619a, viewGroup, false);
        }
        C0874a aVar = (C0874a) view;
        if (this.f2622d) {
            ((ListMenuItemView) view).setForceShowIcon(true);
        }
        aVar.mo273a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo3469b();
        super.notifyDataSetChanged();
    }
}
