package android.support.p023v7.view.menu;

import android.content.Context;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.view.menu.C0873p.C0874a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.b */
public abstract class C0843b implements C0871o {

    /* renamed from: a */
    protected Context f2557a;

    /* renamed from: b */
    protected Context f2558b;

    /* renamed from: c */
    protected C0855h f2559c;

    /* renamed from: d */
    protected LayoutInflater f2560d;

    /* renamed from: e */
    protected LayoutInflater f2561e;

    /* renamed from: f */
    protected C0873p f2562f;

    /* renamed from: g */
    private C0872a f2563g;

    /* renamed from: h */
    private int f2564h;

    /* renamed from: i */
    private int f2565i;

    /* renamed from: j */
    private int f2566j;

    public C0843b(Context context, int i, int i2) {
        this.f2557a = context;
        this.f2560d = LayoutInflater.from(context);
        this.f2564h = i;
        this.f2565i = i2;
    }

    /* renamed from: a */
    public C0873p mo3418a(ViewGroup viewGroup) {
        if (this.f2562f == null) {
            this.f2562f = (C0873p) this.f2560d.inflate(this.f2564h, viewGroup, false);
            this.f2562f.mo286a(this.f2559c);
            mo325a(true);
        }
        return this.f2562f;
    }

    /* renamed from: a */
    public View mo3419a(C0859j jVar, View view, ViewGroup viewGroup) {
        C0874a b = view instanceof C0874a ? (C0874a) view : mo3425b(viewGroup);
        mo3421a(jVar, b);
        return (View) b;
    }

    /* renamed from: a */
    public void mo3420a(int i) {
        this.f2566j = i;
    }

    /* renamed from: a */
    public void mo316a(Context context, C0855h hVar) {
        this.f2558b = context;
        this.f2561e = LayoutInflater.from(this.f2558b);
        this.f2559c = hVar;
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        if (this.f2563g != null) {
            this.f2563g.mo3176a(hVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo3421a(C0859j jVar, C0874a aVar);

    /* renamed from: a */
    public void mo323a(C0872a aVar) {
        this.f2563g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3422a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2562f).addView(view, i);
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f2562f;
        if (viewGroup != null) {
            int i = 0;
            if (this.f2559c != null) {
                this.f2559c.mo3529j();
                ArrayList i2 = this.f2559c.mo3527i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0859j jVar = (C0859j) i2.get(i4);
                    if (mo3423a(i3, jVar)) {
                        View childAt = viewGroup.getChildAt(i3);
                        C0859j itemData = childAt instanceof C0874a ? ((C0874a) childAt).getItemData() : null;
                        View a = mo3419a(jVar, childAt, viewGroup);
                        if (jVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo3422a(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo3424a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo326a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo3423a(int i, C0859j jVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo327a(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo328a(C0881u uVar) {
        if (this.f2563g != null) {
            return this.f2563g.mo3177a(uVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3424a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public int mo329b() {
        return this.f2566j;
    }

    /* renamed from: b */
    public C0874a mo3425b(ViewGroup viewGroup) {
        return (C0874a) this.f2560d.inflate(this.f2565i, viewGroup, false);
    }

    /* renamed from: b */
    public boolean mo333b(C0855h hVar, C0859j jVar) {
        return false;
    }

    /* renamed from: d */
    public C0872a mo3426d() {
        return this.f2563g;
    }
}
