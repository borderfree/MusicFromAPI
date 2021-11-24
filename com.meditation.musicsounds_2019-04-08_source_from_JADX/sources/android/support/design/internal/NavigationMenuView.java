package android.support.design.internal;

import android.content.Context;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0873p;
import android.support.p023v7.widget.LinearLayoutManager;
import android.support.p023v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements C0873p {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* renamed from: a */
    public void mo286a(C0855h hVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
