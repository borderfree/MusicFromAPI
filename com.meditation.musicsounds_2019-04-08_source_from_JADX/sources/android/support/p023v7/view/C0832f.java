package android.support.p023v7.view;

import android.content.Context;
import android.support.p009v4.p012b.p013a.C0427a;
import android.support.p009v4.p012b.p013a.C0428b;
import android.support.p009v4.p019g.C0510m;
import android.support.p023v7.view.C0827b.C0828a;
import android.support.p023v7.view.menu.C0875q;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.f */
public class C0832f extends ActionMode {

    /* renamed from: a */
    final Context f2448a;

    /* renamed from: b */
    final C0827b f2449b;

    /* renamed from: android.support.v7.view.f$a */
    public static class C0833a implements C0828a {

        /* renamed from: a */
        final Callback f2450a;

        /* renamed from: b */
        final Context f2451b;

        /* renamed from: c */
        final ArrayList<C0832f> f2452c = new ArrayList<>();

        /* renamed from: d */
        final C0510m<Menu, Menu> f2453d = new C0510m<>();

        public C0833a(Context context, Callback callback) {
            this.f2451b = context;
            this.f2450a = callback;
        }

        /* renamed from: a */
        private Menu m3951a(Menu menu) {
            Menu menu2 = (Menu) this.f2453d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C0875q.m4241a(this.f2451b, (C0427a) menu);
            this.f2453d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo3178a(C0827b bVar) {
            this.f2450a.onDestroyActionMode(mo3315b(bVar));
        }

        /* renamed from: a */
        public boolean mo3179a(C0827b bVar, Menu menu) {
            return this.f2450a.onCreateActionMode(mo3315b(bVar), m3951a(menu));
        }

        /* renamed from: a */
        public boolean mo3180a(C0827b bVar, MenuItem menuItem) {
            return this.f2450a.onActionItemClicked(mo3315b(bVar), C0875q.m4242a(this.f2451b, (C0428b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo3315b(C0827b bVar) {
            int size = this.f2452c.size();
            for (int i = 0; i < size; i++) {
                C0832f fVar = (C0832f) this.f2452c.get(i);
                if (fVar != null && fVar.f2449b == bVar) {
                    return fVar;
                }
            }
            C0832f fVar2 = new C0832f(this.f2451b, bVar);
            this.f2452c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo3181b(C0827b bVar, Menu menu) {
            return this.f2450a.onPrepareActionMode(mo3315b(bVar), m3951a(menu));
        }
    }

    public C0832f(Context context, C0827b bVar) {
        this.f2448a = context;
        this.f2449b = bVar;
    }

    public void finish() {
        this.f2449b.mo3226c();
    }

    public View getCustomView() {
        return this.f2449b.mo3232i();
    }

    public Menu getMenu() {
        return C0875q.m4241a(this.f2448a, (C0427a) this.f2449b.mo3223b());
    }

    public MenuInflater getMenuInflater() {
        return this.f2449b.mo3218a();
    }

    public CharSequence getSubtitle() {
        return this.f2449b.mo3230g();
    }

    public Object getTag() {
        return this.f2449b.mo3286j();
    }

    public CharSequence getTitle() {
        return this.f2449b.mo3229f();
    }

    public boolean getTitleOptionalHint() {
        return this.f2449b.mo3287k();
    }

    public void invalidate() {
        this.f2449b.mo3227d();
    }

    public boolean isTitleOptional() {
        return this.f2449b.mo3231h();
    }

    public void setCustomView(View view) {
        this.f2449b.mo3220a(view);
    }

    public void setSubtitle(int i) {
        this.f2449b.mo3224b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2449b.mo3221a(charSequence);
    }

    public void setTag(Object obj) {
        this.f2449b.mo3285a(obj);
    }

    public void setTitle(int i) {
        this.f2449b.mo3219a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2449b.mo3225b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2449b.mo3222a(z);
    }
}
