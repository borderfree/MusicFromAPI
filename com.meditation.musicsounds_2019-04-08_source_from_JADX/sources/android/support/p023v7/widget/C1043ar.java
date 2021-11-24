package android.support.p023v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p023v7.view.menu.C0854g;
import android.support.p023v7.view.menu.C0855h;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ar */
public class C1043ar extends C1034ap implements C1042aq {

    /* renamed from: a */
    private static Method f3624a;

    /* renamed from: b */
    private C1042aq f3625b;

    /* renamed from: android.support.v7.widget.ar$a */
    public static class C1044a extends C1012ah {

        /* renamed from: a */
        final int f3626a;

        /* renamed from: b */
        final int f3627b;

        /* renamed from: c */
        private C1042aq f3628c;

        /* renamed from: d */
        private MenuItem f3629d;

        public C1044a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f3626a = 22;
                this.f3627b = 21;
                return;
            }
            this.f3626a = 21;
            this.f3627b = 22;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo5035a(int i, int i2, int i3, int i4, int i5) {
            return super.mo5035a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo5036a(MotionEvent motionEvent, int i) {
            return super.mo5036a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            if (this.f3628c != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0854g gVar = (C0854g) adapter;
                C0859j jVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < gVar.getCount()) {
                            jVar = gVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f3629d;
                if (menuItem != jVar) {
                    C0855h a = gVar.mo3466a();
                    if (menuItem != null) {
                        this.f3628c.mo3450a(a, menuItem);
                    }
                    this.f3629d = jVar;
                    if (jVar != null) {
                        this.f3628c.mo3451b(a, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f3626a) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f3627b) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0854g) getAdapter()).mo3466a().mo3505b(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C1042aq aqVar) {
            this.f3628c = aqVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f3624a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C1043ar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1012ah mo5133a(Context context, boolean z) {
        C1044a aVar = new C1044a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: a */
    public void mo3450a(C0855h hVar, MenuItem menuItem) {
        if (this.f3625b != null) {
            this.f3625b.mo3450a(hVar, menuItem);
        }
    }

    /* renamed from: a */
    public void mo5168a(C1042aq aqVar) {
        this.f3625b = aqVar;
    }

    /* renamed from: a */
    public void mo5169a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f3598g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void mo3451b(C0855h hVar, MenuItem menuItem) {
        if (this.f3625b != null) {
            this.f3625b.mo3451b(hVar, menuItem);
        }
    }

    /* renamed from: b */
    public void mo5170b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f3598g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo5171c(boolean z) {
        if (f3624a != null) {
            try {
                f3624a.invoke(this.f3598g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
