package android.support.p023v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0730d;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.view.menu.C0871o.C0872a;
import android.support.p023v7.widget.C1042aq;
import android.support.p023v7.widget.C1043ar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C0846e extends C0868m implements C0871o, OnKeyListener, OnDismissListener {

    /* renamed from: a */
    final Handler f2571a;

    /* renamed from: b */
    final List<C0851a> f2572b = new ArrayList();

    /* renamed from: c */
    View f2573c;

    /* renamed from: d */
    boolean f2574d;

    /* renamed from: e */
    private final Context f2575e;

    /* renamed from: f */
    private final int f2576f;

    /* renamed from: g */
    private final int f2577g;

    /* renamed from: h */
    private final int f2578h;

    /* renamed from: i */
    private final boolean f2579i;

    /* renamed from: j */
    private final List<C0855h> f2580j = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final OnGlobalLayoutListener f2581k = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C0846e.this.mo3442f() && C0846e.this.f2572b.size() > 0 && !((C0851a) C0846e.this.f2572b.get(0)).f2604a.mo5144c()) {
                View view = C0846e.this.f2573c;
                if (view == null || !view.isShown()) {
                    C0846e.this.mo3441e();
                    return;
                }
                for (C0851a aVar : C0846e.this.f2572b) {
                    aVar.f2604a.mo3440d();
                }
            }
        }
    };

    /* renamed from: l */
    private final OnAttachStateChangeListener f2582l = new OnAttachStateChangeListener() {
        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (C0846e.this.f2595y != null) {
                if (!C0846e.this.f2595y.isAlive()) {
                    C0846e.this.f2595y = view.getViewTreeObserver();
                }
                C0846e.this.f2595y.removeGlobalOnLayoutListener(C0846e.this.f2581k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: m */
    private final C1042aq f2583m = new C1042aq() {
        /* renamed from: a */
        public void mo3450a(C0855h hVar, MenuItem menuItem) {
            C0846e.this.f2571a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo3451b(final C0855h hVar, final MenuItem menuItem) {
            final C0851a aVar = null;
            C0846e.this.f2571a.removeCallbacksAndMessages(null);
            int size = C0846e.this.f2572b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == ((C0851a) C0846e.this.f2572b.get(i)).f2605b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0846e.this.f2572b.size()) {
                    aVar = (C0851a) C0846e.this.f2572b.get(i2);
                }
                C0846e.this.f2571a.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C0846e.this.f2574d = true;
                            aVar.f2605b.mo3505b(false);
                            C0846e.this.f2574d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo3491a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: n */
    private int f2584n = 0;

    /* renamed from: o */
    private int f2585o = 0;

    /* renamed from: p */
    private View f2586p;

    /* renamed from: q */
    private int f2587q;

    /* renamed from: r */
    private boolean f2588r;

    /* renamed from: s */
    private boolean f2589s;

    /* renamed from: t */
    private int f2590t;

    /* renamed from: u */
    private int f2591u;

    /* renamed from: v */
    private boolean f2592v;

    /* renamed from: w */
    private boolean f2593w;

    /* renamed from: x */
    private C0872a f2594x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ViewTreeObserver f2595y;

    /* renamed from: z */
    private OnDismissListener f2596z;

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0851a {

        /* renamed from: a */
        public final C1043ar f2604a;

        /* renamed from: b */
        public final C0855h f2605b;

        /* renamed from: c */
        public final int f2606c;

        public C0851a(C1043ar arVar, C0855h hVar, int i) {
            this.f2604a = arVar;
            this.f2605b = hVar;
            this.f2606c = i;
        }

        /* renamed from: a */
        public ListView mo3453a() {
            return this.f2604a.mo3443g();
        }
    }

    public C0846e(Context context, View view, int i, int i2, boolean z) {
        this.f2575e = context;
        this.f2586p = view;
        this.f2577g = i;
        this.f2578h = i2;
        this.f2579i = z;
        this.f2592v = false;
        this.f2587q = m4038k();
        Resources resources = context.getResources();
        this.f2576f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0730d.abc_config_prefDialogWidth));
        this.f2571a = new Handler();
    }

    /* renamed from: a */
    private MenuItem m4029a(C0855h hVar, C0855h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m4030a(C0851a aVar, C0855h hVar) {
        int i;
        C0854g gVar;
        MenuItem a = m4029a(aVar.f2605b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo3453a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C0854g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C0854g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private void m4034c(C0855h hVar) {
        View view;
        C0851a aVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f2575e);
        C0854g gVar = new C0854g(hVar, from, this.f2579i);
        if (!mo3442f() && this.f2592v) {
            gVar.mo3468a(true);
        } else if (mo3442f()) {
            gVar.mo3468a(C0868m.m4195b(hVar));
        }
        int a = m4193a(gVar, null, this.f2575e, this.f2576f);
        C1043ar j = m4037j();
        j.mo3985a((ListAdapter) gVar);
        j.mo5148g(a);
        j.mo5146e(this.f2585o);
        if (this.f2572b.size() > 0) {
            aVar = (C0851a) this.f2572b.get(this.f2572b.size() - 1);
            view = m4030a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            j.mo5171c(false);
            j.mo5169a((Object) null);
            int d = m4035d(a);
            boolean z = d == 1;
            this.f2587q = d;
            if (VERSION.SDK_INT >= 26) {
                j.mo5141b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2586p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2585o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2586p.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2585o & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                j.mo5143c(i3);
                j.mo5142b(true);
                j.mo5145d(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                j.mo5143c(i3);
                j.mo5142b(true);
                j.mo5145d(i2);
            }
            i3 = i + a;
            j.mo5143c(i3);
            j.mo5142b(true);
            j.mo5145d(i2);
        } else {
            if (this.f2588r) {
                j.mo5143c(this.f2590t);
            }
            if (this.f2589s) {
                j.mo5145d(this.f2591u);
            }
            j.mo5135a(mo3674i());
        }
        this.f2572b.add(new C0851a(j, hVar, this.f2587q));
        j.mo3440d();
        ListView g = j.mo3443g();
        g.setOnKeyListener(this);
        if (aVar == null && this.f2593w && hVar.mo3532m() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0733g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(hVar.mo3532m());
            g.addHeaderView(frameLayout, null, false);
            j.mo3440d();
        }
    }

    /* renamed from: d */
    private int m4035d(int i) {
        ListView a = ((C0851a) this.f2572b.get(this.f2572b.size() - 1)).mo3453a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2573c.getWindowVisibleDisplayFrame(rect);
        return this.f2587q == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: d */
    private int m4036d(C0855h hVar) {
        int size = this.f2572b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == ((C0851a) this.f2572b.get(i)).f2605b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C1043ar m4037j() {
        C1043ar arVar = new C1043ar(this.f2575e, null, this.f2577g, this.f2578h);
        arVar.mo5168a(this.f2583m);
        arVar.mo5137a((OnItemClickListener) this);
        arVar.mo5138a((OnDismissListener) this);
        arVar.mo5141b(this.f2586p);
        arVar.mo5146e(this.f2585o);
        arVar.mo5139a(true);
        arVar.mo5150h(2);
        return arVar;
    }

    /* renamed from: k */
    private int m4038k() {
        return C0626s.m2861e(this.f2586p) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo3432a(int i) {
        if (this.f2584n != i) {
            this.f2584n = i;
            this.f2585o = C0604d.m2741a(i, C0626s.m2861e(this.f2586p));
        }
    }

    /* renamed from: a */
    public void mo319a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo3433a(C0855h hVar) {
        hVar.mo3487a((C0871o) this, this.f2575e);
        if (mo3442f()) {
            m4034c(hVar);
        } else {
            this.f2580j.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo321a(C0855h hVar, boolean z) {
        int d = m4036d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f2572b.size()) {
                ((C0851a) this.f2572b.get(i)).f2605b.mo3505b(false);
            }
            C0851a aVar = (C0851a) this.f2572b.remove(d);
            aVar.f2605b.mo3504b((C0871o) this);
            if (this.f2574d) {
                aVar.f2604a.mo5170b(null);
                aVar.f2604a.mo5140b(0);
            }
            aVar.f2604a.mo3441e();
            int size = this.f2572b.size();
            this.f2587q = size > 0 ? ((C0851a) this.f2572b.get(size - 1)).f2606c : m4038k();
            if (size == 0) {
                mo3441e();
                if (this.f2594x != null) {
                    this.f2594x.mo3176a(hVar, true);
                }
                if (this.f2595y != null) {
                    if (this.f2595y.isAlive()) {
                        this.f2595y.removeGlobalOnLayoutListener(this.f2581k);
                    }
                    this.f2595y = null;
                }
                this.f2573c.removeOnAttachStateChangeListener(this.f2582l);
                this.f2596z.onDismiss();
            } else if (z) {
                ((C0851a) this.f2572b.get(0)).f2605b.mo3505b(false);
            }
        }
    }

    /* renamed from: a */
    public void mo323a(C0872a aVar) {
        this.f2594x = aVar;
    }

    /* renamed from: a */
    public void mo3434a(View view) {
        if (this.f2586p != view) {
            this.f2586p = view;
            this.f2585o = C0604d.m2741a(this.f2584n, C0626s.m2861e(this.f2586p));
        }
    }

    /* renamed from: a */
    public void mo3435a(OnDismissListener onDismissListener) {
        this.f2596z = onDismissListener;
    }

    /* renamed from: a */
    public void mo325a(boolean z) {
        for (C0851a a : this.f2572b) {
            m4194a(a.mo3453a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo326a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo328a(C0881u uVar) {
        for (C0851a aVar : this.f2572b) {
            if (uVar == aVar.f2605b) {
                aVar.mo3453a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo3433a((C0855h) uVar);
        if (this.f2594x != null) {
            this.f2594x.mo3177a(uVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo3436b(int i) {
        this.f2588r = true;
        this.f2590t = i;
    }

    /* renamed from: b */
    public void mo3437b(boolean z) {
        this.f2592v = z;
    }

    /* renamed from: c */
    public Parcelable mo334c() {
        return null;
    }

    /* renamed from: c */
    public void mo3438c(int i) {
        this.f2589s = true;
        this.f2591u = i;
    }

    /* renamed from: c */
    public void mo3439c(boolean z) {
        this.f2593w = z;
    }

    /* renamed from: d */
    public void mo3440d() {
        if (!mo3442f()) {
            for (C0855h c : this.f2580j) {
                m4034c(c);
            }
            this.f2580j.clear();
            this.f2573c = this.f2586p;
            if (this.f2573c != null) {
                boolean z = this.f2595y == null;
                this.f2595y = this.f2573c.getViewTreeObserver();
                if (z) {
                    this.f2595y.addOnGlobalLayoutListener(this.f2581k);
                }
                this.f2573c.addOnAttachStateChangeListener(this.f2582l);
            }
        }
    }

    /* renamed from: e */
    public void mo3441e() {
        int size = this.f2572b.size();
        if (size > 0) {
            C0851a[] aVarArr = (C0851a[]) this.f2572b.toArray(new C0851a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0851a aVar = aVarArr[i];
                if (aVar.f2604a.mo3442f()) {
                    aVar.f2604a.mo3441e();
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo3442f() {
        return this.f2572b.size() > 0 && ((C0851a) this.f2572b.get(0)).f2604a.mo3442f();
    }

    /* renamed from: g */
    public ListView mo3443g() {
        if (this.f2572b.isEmpty()) {
            return null;
        }
        return ((C0851a) this.f2572b.get(this.f2572b.size() - 1)).mo3453a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo3444h() {
        return false;
    }

    public void onDismiss() {
        C0851a aVar;
        int size = this.f2572b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0851a) this.f2572b.get(i);
            if (!aVar.f2604a.mo3442f()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f2605b.mo3505b(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3441e();
        return true;
    }
}
