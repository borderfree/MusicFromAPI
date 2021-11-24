package android.support.p023v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0592b;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0734h;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0902a f2843a;

    /* renamed from: b */
    final FrameLayout f2844b;

    /* renamed from: c */
    final FrameLayout f2845c;

    /* renamed from: d */
    C0592b f2846d;

    /* renamed from: e */
    final DataSetObserver f2847e;

    /* renamed from: f */
    OnDismissListener f2848f;

    /* renamed from: g */
    boolean f2849g;

    /* renamed from: h */
    int f2850h;

    /* renamed from: i */
    private final C0903b f2851i;

    /* renamed from: j */
    private final View f2852j;

    /* renamed from: k */
    private final ImageView f2853k;

    /* renamed from: l */
    private final int f2854l;

    /* renamed from: m */
    private final OnGlobalLayoutListener f2855m;

    /* renamed from: n */
    private C1034ap f2856n;

    /* renamed from: o */
    private boolean f2857o;

    /* renamed from: p */
    private int f2858p;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f2859a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C1078bk a = C1078bk.m5880a(context, attributeSet, f2859a);
            setBackgroundDrawable(a.mo5357a(0));
            a.mo5358a();
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    private class C0902a extends BaseAdapter {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2860a;

        /* renamed from: b */
        private C1097d f2861b;

        /* renamed from: c */
        private int f2862c;

        /* renamed from: d */
        private boolean f2863d;

        /* renamed from: e */
        private boolean f2864e;

        /* renamed from: f */
        private boolean f2865f;

        /* renamed from: a */
        public int mo3901a() {
            int i = this.f2862c;
            this.f2862c = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f2862c = i;
            return i2;
        }

        /* renamed from: a */
        public void mo3902a(int i) {
            if (this.f2862c != i) {
                this.f2862c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo3903a(C1097d dVar) {
            C1097d d = this.f2860a.f2843a.mo3908d();
            if (d != null && this.f2860a.isShown()) {
                d.unregisterObserver(this.f2860a.f2847e);
            }
            this.f2861b = dVar;
            if (dVar != null && this.f2860a.isShown()) {
                dVar.registerObserver(this.f2860a.f2847e);
            }
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo3904a(boolean z) {
            if (this.f2865f != z) {
                this.f2865f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void mo3905a(boolean z, boolean z2) {
            if (this.f2863d != z || this.f2864e != z2) {
                this.f2863d = z;
                this.f2864e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo mo3906b() {
            return this.f2861b.mo5415b();
        }

        /* renamed from: c */
        public int mo3907c() {
            return this.f2861b.mo5411a();
        }

        /* renamed from: d */
        public C1097d mo3908d() {
            return this.f2861b;
        }

        /* renamed from: e */
        public boolean mo3909e() {
            return this.f2863d;
        }

        public int getCount() {
            int a = this.f2861b.mo5411a();
            if (!this.f2863d && this.f2861b.mo5415b() != null) {
                a--;
            }
            int min = Math.min(a, this.f2862c);
            return this.f2865f ? min + 1 : min;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f2863d && this.f2861b.mo5415b() != null) {
                        i++;
                    }
                    return this.f2861b.mo5413a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (!this.f2865f || i != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0732f.list_item) {
                        view = LayoutInflater.from(this.f2860a.getContext()).inflate(C0733g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f2860a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0732f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0732f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (!this.f2863d || i != 0 || !this.f2864e) {
                        view.setActivated(false);
                    } else {
                        view.setActivated(true);
                    }
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(this.f2860a.getContext()).inflate(C0733g.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        ((TextView) view.findViewById(C0732f.title)).setText(this.f2860a.getContext().getString(C0734h.abc_activity_chooser_view_see_all));
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    private class C0903b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f2866a;

        /* renamed from: a */
        private void m4402a() {
            if (this.f2866a.f2848f != null) {
                this.f2866a.f2848f.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f2866a.f2845c) {
                this.f2866a.mo3886b();
                Intent b = this.f2866a.f2843a.mo3908d().mo5414b(this.f2866a.f2843a.mo3908d().mo5412a(this.f2866a.f2843a.mo3906b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f2866a.getContext().startActivity(b);
                }
            } else if (view == this.f2866a.f2844b) {
                this.f2866a.f2849g = false;
                this.f2866a.mo3884a(this.f2866a.f2850h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m4402a();
            if (this.f2866a.f2846d != null) {
                this.f2866a.f2846d.mo2428a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0902a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f2866a.mo3886b();
                    if (!this.f2866a.f2849g) {
                        if (!this.f2866a.f2843a.mo3909e()) {
                            i++;
                        }
                        Intent b = this.f2866a.f2843a.mo3908d().mo5414b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f2866a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f2866a.f2843a.mo3908d().mo5416c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f2866a.mo3884a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f2866a.f2845c) {
                if (this.f2866a.f2843a.getCount() > 0) {
                    this.f2866a.f2849g = true;
                    this.f2866a.mo3884a(this.f2866a.f2850h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3884a(int i) {
        C0902a aVar;
        if (this.f2843a.mo3908d() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f2855m);
            boolean z = this.f2845c.getVisibility() == 0;
            int c = this.f2843a.mo3907c();
            if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
                this.f2843a.mo3904a(false);
                aVar = this.f2843a;
            } else {
                this.f2843a.mo3904a(true);
                aVar = this.f2843a;
                i--;
            }
            aVar.mo3902a(i);
            C1034ap listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.mo3442f()) {
                if (this.f2849g || !z) {
                    this.f2843a.mo3905a(true, z);
                } else {
                    this.f2843a.mo3905a(false, false);
                }
                listPopupWindow.mo5148g(Math.min(this.f2843a.mo3901a(), this.f2854l));
                listPopupWindow.mo3440d();
                if (this.f2846d != null) {
                    this.f2846d.mo2428a(true);
                }
                listPopupWindow.mo3443g().setContentDescription(getContext().getString(C0734h.abc_activitychooserview_choose_application));
                listPopupWindow.mo3443g().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: a */
    public boolean mo3885a() {
        if (mo3887c() || !this.f2857o) {
            return false;
        }
        this.f2849g = false;
        mo3884a(this.f2850h);
        return true;
    }

    /* renamed from: b */
    public boolean mo3886b() {
        if (mo3887c()) {
            getListPopupWindow().mo3441e();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2855m);
            }
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo3887c() {
        return getListPopupWindow().mo3442f();
    }

    public C1097d getDataModel() {
        return this.f2843a.mo3908d();
    }

    /* access modifiers changed from: 0000 */
    public C1034ap getListPopupWindow() {
        if (this.f2856n == null) {
            this.f2856n = new C1034ap(getContext());
            this.f2856n.mo3985a((ListAdapter) this.f2843a);
            this.f2856n.mo5141b((View) this);
            this.f2856n.mo5139a(true);
            this.f2856n.mo5137a((OnItemClickListener) this.f2851i);
            this.f2856n.mo5138a((OnDismissListener) this.f2851i);
        }
        return this.f2856n;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1097d d = this.f2843a.mo3908d();
        if (d != null) {
            d.registerObserver(this.f2847e);
        }
        this.f2857o = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1097d d = this.f2843a.mo3908d();
        if (d != null) {
            d.unregisterObserver(this.f2847e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2855m);
        }
        if (mo3887c()) {
            mo3886b();
        }
        this.f2857o = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2852j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo3887c()) {
            mo3886b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f2852j;
        if (this.f2845c.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C1097d dVar) {
        this.f2843a.mo3903a(dVar);
        if (mo3887c()) {
            mo3886b();
            mo3885a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f2858p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2853k.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2853k.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f2850h = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f2848f = onDismissListener;
    }

    public void setProvider(C0592b bVar) {
        this.f2846d = bVar;
    }
}
