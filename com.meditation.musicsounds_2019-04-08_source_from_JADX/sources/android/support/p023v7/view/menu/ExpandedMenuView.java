package android.support.p023v7.view.menu;

import android.content.Context;
import android.support.p023v7.view.menu.C0855h.C0857b;
import android.support.p023v7.widget.C1078bk;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0857b, C0873p, OnItemClickListener {

    /* renamed from: a */
    private static final int[] f2517a = {16842964, 16843049};

    /* renamed from: b */
    private C0855h f2518b;

    /* renamed from: c */
    private int f2519c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1078bk a = C1078bk.m5881a(context, attributeSet, f2517a, i, 0);
        if (a.mo5371g(0)) {
            setBackgroundDrawable(a.mo5357a(0));
        }
        if (a.mo5371g(1)) {
            setDivider(a.mo5357a(1));
        }
        a.mo5358a();
    }

    /* renamed from: a */
    public void mo286a(C0855h hVar) {
        this.f2518b = hVar;
    }

    /* renamed from: a */
    public boolean mo3368a(C0859j jVar) {
        return this.f2518b.mo3491a((MenuItem) jVar, 0);
    }

    public int getWindowAnimations() {
        return this.f2519c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3368a((C0859j) getAdapter().getItem(i));
    }
}
