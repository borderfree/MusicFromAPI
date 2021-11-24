package android.support.p023v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.f */
public class C0852f implements C0871o, OnItemClickListener {

    /* renamed from: a */
    Context f2607a;

    /* renamed from: b */
    LayoutInflater f2608b;

    /* renamed from: c */
    C0855h f2609c;

    /* renamed from: d */
    ExpandedMenuView f2610d;

    /* renamed from: e */
    int f2611e;

    /* renamed from: f */
    int f2612f;

    /* renamed from: g */
    int f2613g;

    /* renamed from: h */
    C0853a f2614h;

    /* renamed from: i */
    private C0872a f2615i;

    /* renamed from: j */
    private int f2616j;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C0853a extends BaseAdapter {

        /* renamed from: b */
        private int f2618b = -1;

        public C0853a() {
            mo3460a();
        }

        /* renamed from: a */
        public C0859j getItem(int i) {
            ArrayList l = C0852f.this.f2609c.mo3531l();
            int i2 = i + C0852f.this.f2611e;
            if (this.f2618b >= 0 && i2 >= this.f2618b) {
                i2++;
            }
            return (C0859j) l.get(i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3460a() {
            C0859j r = C0852f.this.f2609c.mo3539r();
            if (r != null) {
                ArrayList l = C0852f.this.f2609c.mo3531l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((C0859j) l.get(i)) == r) {
                        this.f2618b = i;
                        return;
                    }
                }
            }
            this.f2618b = -1;
        }

        public int getCount() {
            int size = C0852f.this.f2609c.mo3531l().size() - C0852f.this.f2611e;
            return this.f2618b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0852f.this.f2608b.inflate(C0852f.this.f2613g, viewGroup, false);
            }
            ((C0874a) view).mo273a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo3460a();
            super.notifyDataSetChanged();
        }
    }

    public C0852f(int i, int i2) {
        this.f2613g = i;
        this.f2612f = i2;
    }

    public C0852f(Context context, int i) {
        this(i, 0);
        this.f2607a = context;
        this.f2608b = LayoutInflater.from(this.f2607a);
    }

    /* renamed from: a */
    public C0873p mo3454a(ViewGroup viewGroup) {
        if (this.f2610d == null) {
            this.f2610d = (ExpandedMenuView) this.f2608b.inflate(C0733g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f2614h == null) {
                this.f2614h = new C0853a();
            }
            this.f2610d.setAdapter(this.f2614h);
            this.f2610d.setOnItemClickListener(this);
        }
        return this.f2610d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r2.f2608b == null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo316a(android.content.Context r3, android.support.p023v7.view.menu.C0855h r4) {
        /*
            r2 = this;
            int r0 = r2.f2612f
            if (r0 == 0) goto L_0x0016
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f2612f
            r0.<init>(r3, r1)
            r2.f2607a = r0
        L_0x000d:
            android.content.Context r3 = r2.f2607a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f2608b = r3
            goto L_0x0021
        L_0x0016:
            android.content.Context r0 = r2.f2607a
            if (r0 == 0) goto L_0x0021
            r2.f2607a = r3
            android.view.LayoutInflater r3 = r2.f2608b
            if (r3 != 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            r2.f2609c = r4
            android.support.v7.view.menu.f$a r3 = r2.f2614h
            if (r3 == 0) goto L_0x002c
            android.support.v7.view.menu.f$a r3 = r2.f2614h
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.view.menu.C0852f.mo316a(android.content.Context, android.support.v7.view.menu.h):void");
    }

    /* renamed from: a */
    public void mo3455a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.f2610d != null) {
            this.f2610d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: a */
    public void mo319a(Parcelable parcelable) {
        mo3456b((Bundle) parcelable);
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        if (this.f2615i != null) {
            this.f2615i.mo3176a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo323a(C0872a aVar) {
        this.f2615i = aVar;
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        if (this.f2614h != null) {
            this.f2614h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo326a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo327a(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo328a(C0881u uVar) {
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        new C0858i(uVar).mo3548a((IBinder) null);
        if (this.f2615i != null) {
            this.f2615i.mo3177a(uVar);
        }
        return true;
    }

    /* renamed from: b */
    public int mo329b() {
        return this.f2616j;
    }

    /* renamed from: b */
    public void mo3456b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f2610d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: b */
    public boolean mo333b(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo334c() {
        if (this.f2610d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo3455a(bundle);
        return bundle;
    }

    /* renamed from: d */
    public ListAdapter mo3457d() {
        if (this.f2614h == null) {
            this.f2614h = new C0853a();
        }
        return this.f2614h;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f2609c.mo3492a((MenuItem) this.f2614h.getItem(i), (C0871o) this, 0);
    }
}
