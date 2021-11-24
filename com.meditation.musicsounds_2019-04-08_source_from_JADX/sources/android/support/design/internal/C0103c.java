package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.C0087a.C0091d;
import android.support.design.C0087a.C0095h;
import android.support.p009v4.view.C0591aa;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0871o;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p;
import android.support.p023v7.view.menu.C0881u;
import android.support.p023v7.widget.RecyclerView.C0926a;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/* renamed from: android.support.design.internal.c */
public class C0103c implements C0871o {

    /* renamed from: a */
    LinearLayout f228a;

    /* renamed from: b */
    C0855h f229b;

    /* renamed from: c */
    C0106b f230c;

    /* renamed from: d */
    LayoutInflater f231d;

    /* renamed from: e */
    int f232e;

    /* renamed from: f */
    boolean f233f;

    /* renamed from: g */
    ColorStateList f234g;

    /* renamed from: h */
    ColorStateList f235h;

    /* renamed from: i */
    Drawable f236i;

    /* renamed from: j */
    int f237j;

    /* renamed from: k */
    final OnClickListener f238k = new OnClickListener() {
        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            C0103c.this.mo332b(true);
            C0859j itemData = navigationMenuItemView.getItemData();
            boolean a = C0103c.this.f229b.mo3492a((MenuItem) itemData, (C0871o) C0103c.this, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                C0103c.this.f230c.mo348a(itemData);
            }
            C0103c.this.mo332b(false);
            C0103c.this.mo325a(false);
        }
    };

    /* renamed from: l */
    private NavigationMenuView f239l;

    /* renamed from: m */
    private C0872a f240m;

    /* renamed from: n */
    private int f241n;

    /* renamed from: o */
    private int f242o;

    /* renamed from: android.support.design.internal.c$a */
    private static class C0105a extends C0114j {
        public C0105a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.c$b */
    private class C0106b extends C0926a<C0114j> {

        /* renamed from: b */
        private final ArrayList<C0108d> f245b = new ArrayList<>();

        /* renamed from: c */
        private C0859j f246c;

        /* renamed from: d */
        private boolean f247d;

        C0106b() {
            m297f();
        }

        /* renamed from: a */
        private void m296a(int i, int i2) {
            while (i < i2) {
                ((C0110f) this.f245b.get(i)).f250a = true;
                i++;
            }
        }

        /* renamed from: f */
        private void m297f() {
            if (!this.f247d) {
                this.f247d = true;
                this.f245b.clear();
                this.f245b.add(new C0107c());
                int size = C0103c.this.f229b.mo3527i().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0859j jVar = (C0859j) C0103c.this.f229b.mo3527i().get(i3);
                    if (jVar.isChecked()) {
                        mo348a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo3557a(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f245b.add(new C0109e(C0103c.this.f237j, 0));
                            }
                            this.f245b.add(new C0110f(jVar));
                            int size2 = this.f245b.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0859j jVar2 = (C0859j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo3557a(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo348a(jVar);
                                    }
                                    this.f245b.add(new C0110f(jVar2));
                                }
                            }
                            if (z2) {
                                m296a(size2, this.f245b.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f245b.size();
                            boolean z3 = jVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                this.f245b.add(new C0109e(C0103c.this.f237j, C0103c.this.f237j));
                            }
                            z = z3;
                        } else if (!z && jVar.getIcon() != null) {
                            m296a(i2, this.f245b.size());
                            z = true;
                        }
                        C0110f fVar = new C0110f(jVar);
                        fVar.f250a = z;
                        this.f245b.add(fVar);
                        i = groupId;
                    }
                }
                this.f247d = false;
            }
        }

        /* renamed from: a */
        public int mo342a() {
            return this.f245b.size();
        }

        /* renamed from: a */
        public long mo343a(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public C0114j mo353b(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C0111g(C0103c.this.f231d, viewGroup, C0103c.this.f238k);
                case 1:
                    return new C0113i(C0103c.this.f231d, viewGroup);
                case 2:
                    return new C0112h(C0103c.this.f231d, viewGroup);
                case 3:
                    return new C0105a(C0103c.this.f228a);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public void mo345a(Bundle bundle) {
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f247d = true;
                int size = this.f245b.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C0108d dVar = (C0108d) this.f245b.get(i2);
                    if (dVar instanceof C0110f) {
                        C0859j a = ((C0110f) dVar).mo358a();
                        if (a != null && a.getItemId() == i) {
                            mo348a(a);
                            break;
                        }
                    }
                    i2++;
                }
                this.f247d = false;
                m297f();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f245b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0108d dVar2 = (C0108d) this.f245b.get(i3);
                    if (dVar2 instanceof C0110f) {
                        C0859j a2 = ((C0110f) dVar2).mo358a();
                        if (a2 != null) {
                            View actionView = a2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo349a(C0114j jVar) {
            if (jVar instanceof C0111g) {
                ((NavigationMenuItemView) jVar.f3157a).mo272a();
            }
        }

        /* renamed from: a */
        public void mo350a(C0114j jVar, int i) {
            switch (mo352b(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.f3157a;
                    navigationMenuItemView.setIconTintList(C0103c.this.f235h);
                    if (C0103c.this.f233f) {
                        navigationMenuItemView.setTextAppearance(C0103c.this.f232e);
                    }
                    if (C0103c.this.f234g != null) {
                        navigationMenuItemView.setTextColor(C0103c.this.f234g);
                    }
                    C0626s.m2843a((View) navigationMenuItemView, C0103c.this.f236i != null ? C0103c.this.f236i.getConstantState().newDrawable() : null);
                    C0110f fVar = (C0110f) this.f245b.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.f250a);
                    navigationMenuItemView.mo273a(fVar.mo358a(), 0);
                    return;
                case 1:
                    ((TextView) jVar.f3157a).setText(((C0110f) this.f245b.get(i)).mo358a().getTitle());
                    return;
                case 2:
                    C0109e eVar = (C0109e) this.f245b.get(i);
                    jVar.f3157a.setPadding(0, eVar.mo356a(), 0, eVar.mo357b());
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void mo348a(C0859j jVar) {
            if (this.f246c != jVar && jVar.isCheckable()) {
                if (this.f246c != null) {
                    this.f246c.setChecked(false);
                }
                this.f246c = jVar;
                jVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void mo351a(boolean z) {
            this.f247d = z;
        }

        /* renamed from: b */
        public int mo352b(int i) {
            C0108d dVar = (C0108d) this.f245b.get(i);
            if (dVar instanceof C0109e) {
                return 2;
            }
            if (dVar instanceof C0107c) {
                return 3;
            }
            if (dVar instanceof C0110f) {
                return ((C0110f) dVar).mo358a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: b */
        public void mo354b() {
            m297f();
            mo4336e();
        }

        /* renamed from: c */
        public Bundle mo355c() {
            Bundle bundle = new Bundle();
            if (this.f246c != null) {
                bundle.putInt("android:menu:checked", this.f246c.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f245b.size();
            for (int i = 0; i < size; i++) {
                C0108d dVar = (C0108d) this.f245b.get(i);
                if (dVar instanceof C0110f) {
                    C0859j a = ((C0110f) dVar).mo358a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }
    }

    /* renamed from: android.support.design.internal.c$c */
    private static class C0107c implements C0108d {
        C0107c() {
        }
    }

    /* renamed from: android.support.design.internal.c$d */
    private interface C0108d {
    }

    /* renamed from: android.support.design.internal.c$e */
    private static class C0109e implements C0108d {

        /* renamed from: a */
        private final int f248a;

        /* renamed from: b */
        private final int f249b;

        public C0109e(int i, int i2) {
            this.f248a = i;
            this.f249b = i2;
        }

        /* renamed from: a */
        public int mo356a() {
            return this.f248a;
        }

        /* renamed from: b */
        public int mo357b() {
            return this.f249b;
        }
    }

    /* renamed from: android.support.design.internal.c$f */
    private static class C0110f implements C0108d {

        /* renamed from: a */
        boolean f250a;

        /* renamed from: b */
        private final C0859j f251b;

        C0110f(C0859j jVar) {
            this.f251b = jVar;
        }

        /* renamed from: a */
        public C0859j mo358a() {
            return this.f251b;
        }
    }

    /* renamed from: android.support.design.internal.c$g */
    private static class C0111g extends C0114j {
        public C0111g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C0095h.design_navigation_item, viewGroup, false));
            this.f3157a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.c$h */
    private static class C0112h extends C0114j {
        public C0112h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0095h.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$i */
    private static class C0113i extends C0114j {
        public C0113i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C0095h.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.c$j */
    private static abstract class C0114j extends C0958w {
        public C0114j(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public C0873p mo314a(ViewGroup viewGroup) {
        if (this.f239l == null) {
            this.f239l = (NavigationMenuView) this.f231d.inflate(C0095h.design_navigation_menu, viewGroup, false);
            if (this.f230c == null) {
                this.f230c = new C0106b();
            }
            this.f228a = (LinearLayout) this.f231d.inflate(C0095h.design_navigation_item_header, this.f239l, false);
            this.f239l.setAdapter(this.f230c);
        }
        return this.f239l;
    }

    /* renamed from: a */
    public void mo315a(int i) {
        this.f241n = i;
    }

    /* renamed from: a */
    public void mo316a(Context context, C0855h hVar) {
        this.f231d = LayoutInflater.from(context);
        this.f229b = hVar;
        this.f237j = context.getResources().getDimensionPixelOffset(C0091d.design_navigation_separator_vertical_padding);
    }

    /* renamed from: a */
    public void mo317a(ColorStateList colorStateList) {
        this.f235h = colorStateList;
        mo325a(false);
    }

    /* renamed from: a */
    public void mo318a(Drawable drawable) {
        this.f236i = drawable;
        mo325a(false);
    }

    /* renamed from: a */
    public void mo319a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f239l.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f230c.mo345a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f228a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public void mo320a(C0591aa aaVar) {
        int b = aaVar.mo2415b();
        if (this.f242o != b) {
            this.f242o = b;
            if (this.f228a.getChildCount() == 0) {
                this.f239l.setPadding(0, this.f242o, 0, this.f239l.getPaddingBottom());
            }
        }
        C0626s.m2853b((View) this.f228a, aaVar);
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        if (this.f240m != null) {
            this.f240m.mo3176a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo322a(C0859j jVar) {
        this.f230c.mo348a(jVar);
    }

    /* renamed from: a */
    public void mo323a(C0872a aVar) {
        this.f240m = aVar;
    }

    /* renamed from: a */
    public void mo324a(View view) {
        this.f228a.addView(view);
        this.f239l.setPadding(0, 0, 0, this.f239l.getPaddingBottom());
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        if (this.f230c != null) {
            this.f230c.mo354b();
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
        return false;
    }

    /* renamed from: b */
    public int mo329b() {
        return this.f241n;
    }

    /* renamed from: b */
    public View mo330b(int i) {
        View inflate = this.f231d.inflate(i, this.f228a, false);
        mo324a(inflate);
        return inflate;
    }

    /* renamed from: b */
    public void mo331b(ColorStateList colorStateList) {
        this.f234g = colorStateList;
        mo325a(false);
    }

    /* renamed from: b */
    public void mo332b(boolean z) {
        if (this.f230c != null) {
            this.f230c.mo351a(z);
        }
    }

    /* renamed from: b */
    public boolean mo333b(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo334c() {
        if (VERSION.SDK_INT < 11) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (this.f239l != null) {
            SparseArray sparseArray = new SparseArray();
            this.f239l.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f230c != null) {
            bundle.putBundle("android:menu:adapter", this.f230c.mo355c());
        }
        if (this.f228a != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f228a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: c */
    public View mo335c(int i) {
        return this.f228a.getChildAt(i);
    }

    /* renamed from: d */
    public int mo336d() {
        return this.f228a.getChildCount();
    }

    /* renamed from: d */
    public void mo337d(int i) {
        this.f232e = i;
        this.f233f = true;
        mo325a(false);
    }

    /* renamed from: e */
    public ColorStateList mo338e() {
        return this.f235h;
    }

    /* renamed from: f */
    public ColorStateList mo339f() {
        return this.f234g;
    }

    /* renamed from: g */
    public Drawable mo340g() {
        return this.f236i;
    }
}
