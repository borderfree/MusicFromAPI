package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.view.p021a.C0583b.C0586c;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0937i.C0940a;
import android.support.p023v7.widget.RecyclerView.C0937i.C0941b;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0952s.C0954b;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* renamed from: android.support.v7.widget.StaggeredGridLayoutManager */
public class StaggeredGridLayoutManager extends C0937i implements C0954b {

    /* renamed from: A */
    private SavedState f3251A;

    /* renamed from: B */
    private int f3252B;

    /* renamed from: C */
    private final Rect f3253C = new Rect();

    /* renamed from: D */
    private final C0979a f3254D = new C0979a();

    /* renamed from: E */
    private boolean f3255E = false;

    /* renamed from: F */
    private boolean f3256F = true;

    /* renamed from: G */
    private int[] f3257G;

    /* renamed from: H */
    private final Runnable f3258H = new Runnable() {
        public void run() {
            StaggeredGridLayoutManager.this.mo4704g();
        }
    };

    /* renamed from: a */
    C0981c[] f3259a;

    /* renamed from: b */
    C1047at f3260b;

    /* renamed from: c */
    C1047at f3261c;

    /* renamed from: d */
    boolean f3262d = false;

    /* renamed from: e */
    boolean f3263e = false;

    /* renamed from: f */
    int f3264f = -1;

    /* renamed from: g */
    int f3265g = Integer.MIN_VALUE;

    /* renamed from: h */
    LazySpanLookup f3266h = new LazySpanLookup();

    /* renamed from: i */
    private int f3267i = -1;

    /* renamed from: j */
    private int f3268j;

    /* renamed from: k */
    private int f3269k;

    /* renamed from: l */
    private final C1030am f3270l;

    /* renamed from: m */
    private BitSet f3271m;

    /* renamed from: n */
    private int f3272n = 2;

    /* renamed from: o */
    private boolean f3273o;

    /* renamed from: z */
    private boolean f3274z;

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup */
    static class LazySpanLookup {

        /* renamed from: a */
        int[] f3276a;

        /* renamed from: b */
        List<FullSpanItem> f3277b;

        /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem */
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: a */
                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            };

            /* renamed from: a */
            int f3278a;

            /* renamed from: b */
            int f3279b;

            /* renamed from: c */
            int[] f3280c;

            /* renamed from: d */
            boolean f3281d;

            FullSpanItem() {
            }

            FullSpanItem(Parcel parcel) {
                this.f3278a = parcel.readInt();
                this.f3279b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f3281d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f3280c = new int[readInt];
                    parcel.readIntArray(this.f3280c);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo4725a(int i) {
                if (this.f3280c == null) {
                    return 0;
                }
                return this.f3280c[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f3278a);
                sb.append(", mGapDir=");
                sb.append(this.f3279b);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f3281d);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f3280c));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3278a);
                parcel.writeInt(this.f3279b);
                parcel.writeInt(this.f3281d ? 1 : 0);
                if (this.f3280c == null || this.f3280c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.f3280c.length);
                parcel.writeIntArray(this.f3280c);
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m5256c(int i, int i2) {
            if (this.f3277b != null) {
                int i3 = i + i2;
                for (int size = this.f3277b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f3277b.get(size);
                    if (fullSpanItem.f3278a >= i) {
                        if (fullSpanItem.f3278a < i3) {
                            this.f3277b.remove(size);
                        } else {
                            fullSpanItem.f3278a -= i2;
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        private void m5257d(int i, int i2) {
            if (this.f3277b != null) {
                for (int size = this.f3277b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f3277b.get(size);
                    if (fullSpanItem.f3278a >= i) {
                        fullSpanItem.f3278a += i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m5258g(int i) {
            if (this.f3277b == null) {
                return -1;
            }
            FullSpanItem f = mo4724f(i);
            if (f != null) {
                this.f3277b.remove(f);
            }
            int size = this.f3277b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f3277b.get(i2)).f3278a >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f3277b.get(i2);
            this.f3277b.remove(i2);
            return fullSpanItem.f3278a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4713a(int i) {
            if (this.f3277b != null) {
                for (int size = this.f3277b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f3277b.get(size)).f3278a >= i) {
                        this.f3277b.remove(size);
                    }
                }
            }
            return mo4719b(i);
        }

        /* renamed from: a */
        public FullSpanItem mo4714a(int i, int i2, int i3, boolean z) {
            if (this.f3277b == null) {
                return null;
            }
            int size = this.f3277b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3277b.get(i4);
                if (fullSpanItem.f3278a >= i2) {
                    return null;
                }
                if (fullSpanItem.f3278a >= i && (i3 == 0 || fullSpanItem.f3279b == i3 || (z && fullSpanItem.f3281d))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4715a() {
            if (this.f3276a != null) {
                Arrays.fill(this.f3276a, -1);
            }
            this.f3277b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4716a(int i, int i2) {
            if (this.f3276a != null && i < this.f3276a.length) {
                int i3 = i + i2;
                mo4723e(i3);
                System.arraycopy(this.f3276a, i3, this.f3276a, i, (this.f3276a.length - i) - i2);
                Arrays.fill(this.f3276a, this.f3276a.length - i2, this.f3276a.length, -1);
                m5256c(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4717a(int i, C0981c cVar) {
            mo4723e(i);
            this.f3276a[i] = cVar.f3305e;
        }

        /* renamed from: a */
        public void mo4718a(FullSpanItem fullSpanItem) {
            if (this.f3277b == null) {
                this.f3277b = new ArrayList();
            }
            int size = this.f3277b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f3277b.get(i);
                if (fullSpanItem2.f3278a == fullSpanItem.f3278a) {
                    this.f3277b.remove(i);
                }
                if (fullSpanItem2.f3278a >= fullSpanItem.f3278a) {
                    this.f3277b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f3277b.add(fullSpanItem);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4719b(int i) {
            if (this.f3276a == null || i >= this.f3276a.length) {
                return -1;
            }
            int g = m5258g(i);
            if (g == -1) {
                Arrays.fill(this.f3276a, i, this.f3276a.length, -1);
                return this.f3276a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f3276a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4720b(int i, int i2) {
            if (this.f3276a != null && i < this.f3276a.length) {
                int i3 = i + i2;
                mo4723e(i3);
                System.arraycopy(this.f3276a, i, this.f3276a, i3, (this.f3276a.length - i) - i2);
                Arrays.fill(this.f3276a, i, i3, -1);
                m5257d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo4721c(int i) {
            if (this.f3276a == null || i >= this.f3276a.length) {
                return -1;
            }
            return this.f3276a[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4722d(int i) {
            int length = this.f3276a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4723e(int i) {
            if (this.f3276a == null) {
                this.f3276a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f3276a, -1);
            } else if (i >= this.f3276a.length) {
                int[] iArr = this.f3276a;
                this.f3276a = new int[mo4722d(i)];
                System.arraycopy(iArr, 0, this.f3276a, 0, iArr.length);
                Arrays.fill(this.f3276a, iArr.length, this.f3276a.length, -1);
            }
        }

        /* renamed from: f */
        public FullSpanItem mo4724f(int i) {
            if (this.f3277b == null) {
                return null;
            }
            for (int size = this.f3277b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f3277b.get(size);
                if (fullSpanItem.f3278a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$SavedState */
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        int f3282a;

        /* renamed from: b */
        int f3283b;

        /* renamed from: c */
        int f3284c;

        /* renamed from: d */
        int[] f3285d;

        /* renamed from: e */
        int f3286e;

        /* renamed from: f */
        int[] f3287f;

        /* renamed from: g */
        List<FullSpanItem> f3288g;

        /* renamed from: h */
        boolean f3289h;

        /* renamed from: i */
        boolean f3290i;

        /* renamed from: j */
        boolean f3291j;

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f3282a = parcel.readInt();
            this.f3283b = parcel.readInt();
            this.f3284c = parcel.readInt();
            if (this.f3284c > 0) {
                this.f3285d = new int[this.f3284c];
                parcel.readIntArray(this.f3285d);
            }
            this.f3286e = parcel.readInt();
            if (this.f3286e > 0) {
                this.f3287f = new int[this.f3286e];
                parcel.readIntArray(this.f3287f);
            }
            boolean z = false;
            this.f3289h = parcel.readInt() == 1;
            this.f3290i = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f3291j = z;
            this.f3288g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f3284c = savedState.f3284c;
            this.f3282a = savedState.f3282a;
            this.f3283b = savedState.f3283b;
            this.f3285d = savedState.f3285d;
            this.f3286e = savedState.f3286e;
            this.f3287f = savedState.f3287f;
            this.f3289h = savedState.f3289h;
            this.f3290i = savedState.f3290i;
            this.f3291j = savedState.f3291j;
            this.f3288g = savedState.f3288g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4733a() {
            this.f3285d = null;
            this.f3284c = 0;
            this.f3286e = 0;
            this.f3287f = null;
            this.f3288g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4734b() {
            this.f3285d = null;
            this.f3284c = 0;
            this.f3282a = -1;
            this.f3283b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3282a);
            parcel.writeInt(this.f3283b);
            parcel.writeInt(this.f3284c);
            if (this.f3284c > 0) {
                parcel.writeIntArray(this.f3285d);
            }
            parcel.writeInt(this.f3286e);
            if (this.f3286e > 0) {
                parcel.writeIntArray(this.f3287f);
            }
            parcel.writeInt(this.f3289h ? 1 : 0);
            parcel.writeInt(this.f3290i ? 1 : 0);
            parcel.writeInt(this.f3291j ? 1 : 0);
            parcel.writeList(this.f3288g);
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$a */
    class C0979a {

        /* renamed from: a */
        int f3292a;

        /* renamed from: b */
        int f3293b;

        /* renamed from: c */
        boolean f3294c;

        /* renamed from: d */
        boolean f3295d;

        /* renamed from: e */
        boolean f3296e;

        /* renamed from: f */
        int[] f3297f;

        C0979a() {
            mo4741a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4741a() {
            this.f3292a = -1;
            this.f3293b = Integer.MIN_VALUE;
            this.f3294c = false;
            this.f3295d = false;
            this.f3296e = false;
            if (this.f3297f != null) {
                Arrays.fill(this.f3297f, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4742a(int i) {
            this.f3293b = this.f3294c ? StaggeredGridLayoutManager.this.f3260b.mo5186d() - i : StaggeredGridLayoutManager.this.f3260b.mo5184c() + i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4743a(C0981c[] cVarArr) {
            int length = cVarArr.length;
            if (this.f3297f == null || this.f3297f.length < length) {
                this.f3297f = new int[StaggeredGridLayoutManager.this.f3259a.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3297f[i] = cVarArr[i].mo4747a(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4744b() {
            this.f3293b = this.f3294c ? StaggeredGridLayoutManager.this.f3260b.mo5186d() : StaggeredGridLayoutManager.this.f3260b.mo5184c();
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$b */
    public static class C0980b extends C0942j {

        /* renamed from: a */
        C0981c f3299a;

        /* renamed from: b */
        boolean f3300b;

        public C0980b(int i, int i2) {
            super(i, i2);
        }

        public C0980b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0980b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0980b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public boolean mo4745a() {
            return this.f3300b;
        }

        /* renamed from: b */
        public final int mo4746b() {
            if (this.f3299a == null) {
                return -1;
            }
            return this.f3299a.f3305e;
        }
    }

    /* renamed from: android.support.v7.widget.StaggeredGridLayoutManager$c */
    class C0981c {

        /* renamed from: a */
        ArrayList<View> f3301a = new ArrayList<>();

        /* renamed from: b */
        int f3302b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3303c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3304d = 0;

        /* renamed from: e */
        final int f3305e;

        C0981c(int i) {
            this.f3305e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4747a(int i) {
            if (this.f3302b != Integer.MIN_VALUE) {
                return this.f3302b;
            }
            if (this.f3301a.size() == 0) {
                return i;
            }
            mo4751a();
            return this.f3302b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4748a(int i, int i2, boolean z) {
            return mo4749a(i, i2, false, false, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4749a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int c = StaggeredGridLayoutManager.this.f3260b.mo5184c();
            int d = StaggeredGridLayoutManager.this.f3260b.mo5186d();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f3301a.get(i);
                int a = StaggeredGridLayoutManager.this.f3260b.mo5179a(view);
                int b = StaggeredGridLayoutManager.this.f3260b.mo5183b(view);
                boolean z4 = false;
                boolean z5 = !z3 ? a < d : a <= d;
                if (!z3 ? b > c : b >= c) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && a >= c && b <= d) {
                        }
                    } else if (a >= c && b <= d) {
                    }
                    return StaggeredGridLayoutManager.this.mo4431d(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo4750a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3301a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f3301a.get(size);
                    if ((StaggeredGridLayoutManager.this.f3262d && StaggeredGridLayoutManager.this.mo4431d(view2) >= i) || ((!StaggeredGridLayoutManager.this.f3262d && StaggeredGridLayoutManager.this.mo4431d(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3301a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f3301a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f3262d && StaggeredGridLayoutManager.this.mo4431d(view3) <= i) || ((!StaggeredGridLayoutManager.this.f3262d && StaggeredGridLayoutManager.this.mo4431d(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4751a() {
            View view = (View) this.f3301a.get(0);
            C0980b c = mo4757c(view);
            this.f3302b = StaggeredGridLayoutManager.this.f3260b.mo5179a(view);
            if (c.f3300b) {
                FullSpanItem f = StaggeredGridLayoutManager.this.f3266h.mo4724f(c.mo4478f());
                if (f != null && f.f3279b == -1) {
                    this.f3302b -= f.mo4725a(this.f3305e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4752a(View view) {
            C0980b c = mo4757c(view);
            c.f3299a = this;
            this.f3301a.add(0, view);
            this.f3302b = Integer.MIN_VALUE;
            if (this.f3301a.size() == 1) {
                this.f3303c = Integer.MIN_VALUE;
            }
            if (c.mo4476d() || c.mo4477e()) {
                this.f3304d += StaggeredGridLayoutManager.this.f3260b.mo5189e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4753a(boolean z, int i) {
            int b = z ? mo4755b(Integer.MIN_VALUE) : mo4747a(Integer.MIN_VALUE);
            mo4762e();
            if (b != Integer.MIN_VALUE) {
                if ((!z || b >= StaggeredGridLayoutManager.this.f3260b.mo5186d()) && (z || b <= StaggeredGridLayoutManager.this.f3260b.mo5184c())) {
                    if (i != Integer.MIN_VALUE) {
                        b += i;
                    }
                    this.f3303c = b;
                    this.f3302b = b;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4754b() {
            if (this.f3302b != Integer.MIN_VALUE) {
                return this.f3302b;
            }
            mo4751a();
            return this.f3302b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4755b(int i) {
            if (this.f3303c != Integer.MIN_VALUE) {
                return this.f3303c;
            }
            if (this.f3301a.size() == 0) {
                return i;
            }
            mo4758c();
            return this.f3303c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4756b(View view) {
            C0980b c = mo4757c(view);
            c.f3299a = this;
            this.f3301a.add(view);
            this.f3303c = Integer.MIN_VALUE;
            if (this.f3301a.size() == 1) {
                this.f3302b = Integer.MIN_VALUE;
            }
            if (c.mo4476d() || c.mo4477e()) {
                this.f3304d += StaggeredGridLayoutManager.this.f3260b.mo5189e(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C0980b mo4757c(View view) {
            return (C0980b) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4758c() {
            View view = (View) this.f3301a.get(this.f3301a.size() - 1);
            C0980b c = mo4757c(view);
            this.f3303c = StaggeredGridLayoutManager.this.f3260b.mo5183b(view);
            if (c.f3300b) {
                FullSpanItem f = StaggeredGridLayoutManager.this.f3266h.mo4724f(c.mo4478f());
                if (f != null && f.f3279b == 1) {
                    this.f3303c += f.mo4725a(this.f3305e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4759c(int i) {
            this.f3302b = i;
            this.f3303c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4760d() {
            if (this.f3303c != Integer.MIN_VALUE) {
                return this.f3303c;
            }
            mo4758c();
            return this.f3303c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4761d(int i) {
            if (this.f3302b != Integer.MIN_VALUE) {
                this.f3302b += i;
            }
            if (this.f3303c != Integer.MIN_VALUE) {
                this.f3303c += i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4762e() {
            this.f3301a.clear();
            mo4763f();
            this.f3304d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4763f() {
            this.f3302b = Integer.MIN_VALUE;
            this.f3303c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo4764g() {
            int size = this.f3301a.size();
            View view = (View) this.f3301a.remove(size - 1);
            C0980b c = mo4757c(view);
            c.f3299a = null;
            if (c.mo4476d() || c.mo4477e()) {
                this.f3304d -= StaggeredGridLayoutManager.this.f3260b.mo5189e(view);
            }
            if (size == 1) {
                this.f3302b = Integer.MIN_VALUE;
            }
            this.f3303c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4765h() {
            View view = (View) this.f3301a.remove(0);
            C0980b c = mo4757c(view);
            c.f3299a = null;
            if (this.f3301a.size() == 0) {
                this.f3303c = Integer.MIN_VALUE;
            }
            if (c.mo4476d() || c.mo4477e()) {
                this.f3304d -= StaggeredGridLayoutManager.this.f3260b.mo5189e(view);
            }
            this.f3302b = Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public int mo4766i() {
            return this.f3304d;
        }

        /* renamed from: j */
        public int mo4767j() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.f3262d) {
                i = this.f3301a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.f3301a.size();
            }
            return mo4748a(i, size, true);
        }

        /* renamed from: k */
        public int mo4768k() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.f3262d) {
                size = 0;
                i = this.f3301a.size();
            } else {
                size = this.f3301a.size() - 1;
                i = -1;
            }
            return mo4748a(size, i, true);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f3268j = i2;
        mo4694a(i);
        this.f3270l = new C1030am();
        m5159N();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0941b a = m4794a(context, attributeSet, i, i2);
        mo4699b(a.f3094a);
        mo4694a(a.f3095b);
        mo4697a(a.f3096c);
        this.f3270l = new C1030am();
        m5159N();
    }

    /* renamed from: N */
    private void m5159N() {
        this.f3260b = C1047at.m5689a(this, this.f3268j);
        this.f3261c = C1047at.m5689a(this, 1 - this.f3268j);
    }

    /* renamed from: O */
    private void m5160O() {
        this.f3263e = (this.f3268j == 1 || !mo4707j()) ? this.f3262d : !this.f3262d;
    }

    /* renamed from: P */
    private void m5161P() {
        int i;
        int i2;
        if (this.f3261c.mo5193h() != 1073741824) {
            int w = mo4465w();
            float f = 0.0f;
            for (int i3 = 0; i3 < w; i3++) {
                View i4 = mo4448i(i3);
                float e = (float) this.f3261c.mo5189e(i4);
                if (e >= f) {
                    if (((C0980b) i4.getLayoutParams()).mo4745a()) {
                        e = (e * 1.0f) / ((float) this.f3267i);
                    }
                    f = Math.max(f, e);
                }
            }
            int i5 = this.f3269k;
            int round = Math.round(f * ((float) this.f3267i));
            if (this.f3261c.mo5193h() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3261c.mo5190f());
            }
            mo4703f(round);
            if (this.f3269k != i5) {
                for (int i6 = 0; i6 < w; i6++) {
                    View i7 = mo4448i(i6);
                    C0980b bVar = (C0980b) i7.getLayoutParams();
                    if (!bVar.f3300b) {
                        if (!mo4707j() || this.f3268j != 1) {
                            i = bVar.f3299a.f3305e * this.f3269k;
                            i2 = bVar.f3299a.f3305e * i5;
                            if (this.f3268j != 1) {
                                i7.offsetTopAndBottom(i - i2);
                            }
                        } else {
                            i = (-((this.f3267i - 1) - bVar.f3299a.f3305e)) * this.f3269k;
                            i2 = (-((this.f3267i - 1) - bVar.f3299a.f3305e)) * i5;
                        }
                        i7.offsetLeftAndRight(i - i2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean, int]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 220
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m5162a(android.support.p023v7.widget.RecyclerView.C0949p r17, android.support.p023v7.widget.C1030am r18, android.support.p023v7.widget.RecyclerView.C0955t r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f3271m
            int r1 = r6.f3267i
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            android.support.v7.widget.am r0 = r6.f3270l
            boolean r0 = r0.f3557i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f3553e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0036
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0036
        L_0x0025:
            int r0 = r8.f3553e
            if (r0 != r10) goto L_0x0030
            int r0 = r8.f3555g
            int r1 = r8.f3550b
            int r0 = r0 + r1
        L_0x002e:
            r11 = r0
            goto L_0x0036
        L_0x0030:
            int r0 = r8.f3554f
            int r1 = r8.f3550b
            int r0 = r0 - r1
            goto L_0x002e
        L_0x0036:
            int r0 = r8.f3553e
            r6.m5164a(r0, r11)
            boolean r0 = r6.f3263e
            if (r0 == 0) goto L_0x0047
            android.support.v7.widget.at r0 = r6.f3260b
            int r0 = r0.mo5186d()
        L_0x0045:
            r12 = r0
            goto L_0x004e
        L_0x0047:
            android.support.v7.widget.at r0 = r6.f3260b
            int r0 = r0.mo5184c()
            goto L_0x0045
        L_0x004e:
            r0 = 0
        L_0x004f:
            boolean r1 = r18.mo5081a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ce
            android.support.v7.widget.am r1 = r6.f3270l
            boolean r1 = r1.f3557i
            if (r1 != 0) goto L_0x0064
            java.util.BitSet r1 = r6.f3271m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ce
        L_0x0064:
            android.view.View r13 = r8.mo5080a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            android.support.v7.widget.StaggeredGridLayoutManager$b r14 = (android.support.p023v7.widget.StaggeredGridLayoutManager.C0980b) r14
            int r0 = r14.mo4478f()
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f3266h
            int r1 = r1.mo4721c(r0)
            if (r1 != r2) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x0093
            boolean r1 = r14.f3300b
            if (r1 == 0) goto L_0x0089
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r1 = r6.f3259a
            r1 = r1[r9]
            goto L_0x008d
        L_0x0089:
            android.support.v7.widget.StaggeredGridLayoutManager$c r1 = r6.m5163a(r8)
        L_0x008d:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f3266h
            r4.mo4717a(r0, r1)
            goto L_0x0097
        L_0x0093:
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r4 = r6.f3259a
            r1 = r4[r1]
        L_0x0097:
            r15 = r1
            r14.f3299a = r15
            int r1 = r8.f3553e
            if (r1 != r10) goto L_0x00a2
            r6.mo4420b(r13)
            goto L_0x00a5
        L_0x00a2:
            r6.mo4421b(r13, r9)
        L_0x00a5:
            r6.m5172a(r13, r14, r9)
            int r1 = r8.f3553e
            if (r1 != r10) goto L_0x00d6
            boolean r1 = r14.f3300b
            if (r1 == 0) goto L_0x00b5
            int r1 = r6.m5191r(r12)
            goto L_0x00b9
        L_0x00b5:
            int r1 = r15.mo4755b(r12)
        L_0x00b9:
            android.support.v7.widget.at r4 = r6.f3260b
            int r4 = r4.mo5189e(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d3
            boolean r5 = r14.f3300b
            if (r5 == 0) goto L_0x00d3
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m5185n(r1)
            r5.f3279b = r2
            r5.f3278a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3266h
            r9.mo4718a(r5)
        L_0x00d3:
            r5 = r4
            r4 = r1
            goto L_0x00ff
        L_0x00d6:
            boolean r1 = r14.f3300b
            if (r1 == 0) goto L_0x00df
            int r1 = r6.m5189q(r12)
            goto L_0x00e3
        L_0x00df:
            int r1 = r15.mo4747a(r12)
        L_0x00e3:
            android.support.v7.widget.at r4 = r6.f3260b
            int r4 = r4.mo5189e(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fe
            boolean r5 = r14.f3300b
            if (r5 == 0) goto L_0x00fe
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m5186o(r1)
            r5.f3279b = r10
            r5.f3278a = r0
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f3266h
            r9.mo4718a(r5)
        L_0x00fe:
            r5 = r1
        L_0x00ff:
            boolean r1 = r14.f3300b
            if (r1 == 0) goto L_0x0128
            int r1 = r8.f3552d
            if (r1 != r2) goto L_0x0128
            if (r3 == 0) goto L_0x010c
        L_0x0109:
            r6.f3255E = r10
            goto L_0x0128
        L_0x010c:
            int r1 = r8.f3553e
            if (r1 != r10) goto L_0x0116
            boolean r1 = r16.mo4709m()
        L_0x0114:
            r1 = r1 ^ r10
            goto L_0x011b
        L_0x0116:
            boolean r1 = r16.mo4710n()
            goto L_0x0114
        L_0x011b:
            if (r1 == 0) goto L_0x0128
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f3266h
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.mo4724f(r0)
            if (r0 == 0) goto L_0x0109
            r0.f3281d = r10
            goto L_0x0109
        L_0x0128:
            r6.m5171a(r13, r14, r8)
            boolean r0 = r16.mo4707j()
            if (r0 == 0) goto L_0x015c
            int r0 = r6.f3268j
            if (r0 != r10) goto L_0x015c
            boolean r0 = r14.f3300b
            if (r0 == 0) goto L_0x0140
            android.support.v7.widget.at r0 = r6.f3261c
            int r0 = r0.mo5186d()
            goto L_0x0151
        L_0x0140:
            android.support.v7.widget.at r0 = r6.f3261c
            int r0 = r0.mo5186d()
            int r1 = r6.f3267i
            int r1 = r1 - r10
            int r2 = r15.f3305e
            int r1 = r1 - r2
            int r2 = r6.f3269k
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x0151:
            android.support.v7.widget.at r1 = r6.f3261c
            int r1 = r1.mo5189e(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017d
        L_0x015c:
            boolean r0 = r14.f3300b
            if (r0 == 0) goto L_0x0167
            android.support.v7.widget.at r0 = r6.f3261c
            int r0 = r0.mo5184c()
            goto L_0x0174
        L_0x0167:
            int r0 = r15.f3305e
            int r1 = r6.f3269k
            int r0 = r0 * r1
            android.support.v7.widget.at r1 = r6.f3261c
            int r1 = r1.mo5184c()
            int r0 = r0 + r1
        L_0x0174:
            android.support.v7.widget.at r1 = r6.f3261c
            int r1 = r1.mo5189e(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017d:
            int r0 = r6.f3268j
            if (r0 != r10) goto L_0x018b
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
        L_0x0187:
            r0.mo4399a(r1, r2, r3, r4, r5)
            goto L_0x0192
        L_0x018b:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            goto L_0x0187
        L_0x0192:
            boolean r0 = r14.f3300b
            if (r0 == 0) goto L_0x019e
            android.support.v7.widget.am r0 = r6.f3270l
            int r0 = r0.f3553e
            r6.m5164a(r0, r11)
            goto L_0x01a5
        L_0x019e:
            android.support.v7.widget.am r0 = r6.f3270l
            int r0 = r0.f3553e
            r6.m5169a(r15, r0, r11)
        L_0x01a5:
            android.support.v7.widget.am r0 = r6.f3270l
            r6.m5167a(r7, r0)
            android.support.v7.widget.am r0 = r6.f3270l
            boolean r0 = r0.f3556h
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r14.f3300b
            if (r0 == 0) goto L_0x01c0
            java.util.BitSet r0 = r6.f3271m
            r0.clear()
            goto L_0x01c9
        L_0x01c0:
            java.util.BitSet r0 = r6.f3271m
            int r1 = r15.f3305e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r0 = 1
            r9 = 0
            goto L_0x004f
        L_0x01ce:
            r3 = 0
            if (r0 != 0) goto L_0x01d6
            android.support.v7.widget.am r0 = r6.f3270l
            r6.m5167a(r7, r0)
        L_0x01d6:
            android.support.v7.widget.am r0 = r6.f3270l
            int r0 = r0.f3553e
            if (r0 != r2) goto L_0x01ee
            android.support.v7.widget.at r0 = r6.f3260b
            int r0 = r0.mo5184c()
            int r0 = r6.m5189q(r0)
            android.support.v7.widget.at r1 = r6.f3260b
            int r1 = r1.mo5184c()
            int r1 = r1 - r0
            goto L_0x0200
        L_0x01ee:
            android.support.v7.widget.at r0 = r6.f3260b
            int r0 = r0.mo5186d()
            int r0 = r6.m5191r(r0)
            android.support.v7.widget.at r1 = r6.f3260b
            int r1 = r1.mo5186d()
            int r1 = r0 - r1
        L_0x0200:
            if (r1 <= 0) goto L_0x0209
            int r0 = r8.f3550b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0209:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.m5162a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.am, android.support.v7.widget.RecyclerView$t):int");
    }

    /* renamed from: a */
    private C0981c m5163a(C1030am amVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5193t(amVar.f3553e)) {
            i2 = this.f3267i - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3267i;
            i = 1;
        }
        C0981c cVar = null;
        if (amVar.f3553e == 1) {
            int i4 = Integer.MAX_VALUE;
            int c = this.f3260b.mo5184c();
            while (i2 != i3) {
                C0981c cVar2 = this.f3259a[i2];
                int b = cVar2.mo4755b(c);
                if (b < i4) {
                    cVar = cVar2;
                    i4 = b;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int d = this.f3260b.mo5186d();
        while (i2 != i3) {
            C0981c cVar3 = this.f3259a[i2];
            int a = cVar3.mo4747a(d);
            if (a > i5) {
                cVar = cVar3;
                i5 = a;
            }
            i2 += i;
        }
        return cVar;
    }

    /* renamed from: a */
    private void m5164a(int i, int i2) {
        for (int i3 = 0; i3 < this.f3267i; i3++) {
            if (!this.f3259a[i3].f3301a.isEmpty()) {
                m5169a(this.f3259a[i3], i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m5165a(C0949p pVar, int i) {
        while (mo4465w() > 0) {
            View i2 = mo4448i(0);
            if (this.f3260b.mo5183b(i2) > i || this.f3260b.mo5185c(i2) > i) {
                break;
            }
            C0980b bVar = (C0980b) i2.getLayoutParams();
            if (bVar.f3300b) {
                int i3 = 0;
                while (i3 < this.f3267i) {
                    if (this.f3259a[i3].f3301a.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f3267i; i4++) {
                    this.f3259a[i4].mo4765h();
                }
            } else if (bVar.f3299a.f3301a.size() != 1) {
                bVar.f3299a.mo4765h();
            } else {
                return;
            }
            mo4403a(i2, pVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0154, code lost:
        if (mo4704g() != false) goto L_0x0158;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5166a(android.support.p023v7.widget.RecyclerView.C0949p r9, android.support.p023v7.widget.RecyclerView.C0955t r10, boolean r11) {
        /*
            r8 = this;
            android.support.v7.widget.StaggeredGridLayoutManager$a r0 = r8.f3254D
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3251A
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f3264f
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo4561e()
            if (r1 != 0) goto L_0x0018
            r8.mo4424c(r9)
            r0.mo4741a()
            return
        L_0x0018:
            boolean r1 = r0.f3296e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f3264f
            if (r1 != r2) goto L_0x0029
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f3251A
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo4741a()
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3251A
            if (r5 == 0) goto L_0x0037
            r8.m5168a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5160O()
            boolean r5 = r8.f3263e
            r0.f3294c = r5
        L_0x003e:
            r8.mo4696a(r10, r0)
            r0.f3296e = r4
        L_0x0043:
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3251A
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f3264f
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3294c
            boolean r6 = r8.f3273o
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo4707j()
            boolean r6 = r8.f3274z
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f3266h
            r5.mo4715a()
            r0.f3295d = r4
        L_0x0060:
            int r5 = r8.mo4465w()
            if (r5 <= 0) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3251A
            if (r5 == 0) goto L_0x0070
            android.support.v7.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f3251A
            int r5 = r5.f3284c
            if (r5 >= r4) goto L_0x00cd
        L_0x0070:
            boolean r5 = r0.f3295d
            if (r5 == 0) goto L_0x0092
            r1 = 0
        L_0x0075:
            int r5 = r8.f3267i
            if (r1 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3259a
            r5 = r5[r1]
            r5.mo4762e()
            int r5 = r0.f3293b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008f
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3259a
            r5 = r5[r1]
            int r6 = r0.f3293b
            r5.mo4759c(r6)
        L_0x008f:
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0092:
            if (r1 != 0) goto L_0x00b3
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f3254D
            int[] r1 = r1.f3297f
            if (r1 != 0) goto L_0x009b
            goto L_0x00b3
        L_0x009b:
            r1 = 0
        L_0x009c:
            int r5 = r8.f3267i
            if (r1 >= r5) goto L_0x00cd
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3259a
            r5 = r5[r1]
            r5.mo4762e()
            android.support.v7.widget.StaggeredGridLayoutManager$a r6 = r8.f3254D
            int[] r6 = r6.f3297f
            r6 = r6[r1]
            r5.mo4759c(r6)
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            int r5 = r8.f3267i
            if (r1 >= r5) goto L_0x00c6
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3259a
            r5 = r5[r1]
            boolean r6 = r8.f3263e
            int r7 = r0.f3293b
            r5.mo4753a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b4
        L_0x00c6:
            android.support.v7.widget.StaggeredGridLayoutManager$a r1 = r8.f3254D
            android.support.v7.widget.StaggeredGridLayoutManager$c[] r5 = r8.f3259a
            r1.mo4743a(r5)
        L_0x00cd:
            r8.mo4391a(r9)
            android.support.v7.widget.am r1 = r8.f3270l
            r1.f3549a = r3
            r8.f3255E = r3
            android.support.v7.widget.at r1 = r8.f3261c
            int r1 = r1.mo5190f()
            r8.mo4703f(r1)
            int r1 = r0.f3292a
            r8.m5176b(r1, r10)
            boolean r1 = r0.f3294c
            if (r1 == 0) goto L_0x0104
            r8.m5184m(r2)
            android.support.v7.widget.am r1 = r8.f3270l
            r8.m5162a(r9, r1, r10)
            r8.m5184m(r4)
        L_0x00f3:
            android.support.v7.widget.am r1 = r8.f3270l
            int r2 = r0.f3292a
            android.support.v7.widget.am r5 = r8.f3270l
            int r5 = r5.f3552d
            int r2 = r2 + r5
            r1.f3551c = r2
            android.support.v7.widget.am r1 = r8.f3270l
            r8.m5162a(r9, r1, r10)
            goto L_0x0110
        L_0x0104:
            r8.m5184m(r4)
            android.support.v7.widget.am r1 = r8.f3270l
            r8.m5162a(r9, r1, r10)
            r8.m5184m(r2)
            goto L_0x00f3
        L_0x0110:
            r8.m5161P()
            int r1 = r8.mo4465w()
            if (r1 <= 0) goto L_0x012a
            boolean r1 = r8.f3263e
            if (r1 == 0) goto L_0x0124
            r8.m5178b(r9, r10, r4)
            r8.m5180c(r9, r10, r3)
            goto L_0x012a
        L_0x0124:
            r8.m5180c(r9, r10, r4)
            r8.m5178b(r9, r10, r3)
        L_0x012a:
            if (r11 == 0) goto L_0x0157
            boolean r11 = r10.mo4557a()
            if (r11 != 0) goto L_0x0157
            int r11 = r8.f3272n
            if (r11 == 0) goto L_0x0148
            int r11 = r8.mo4465w()
            if (r11 <= 0) goto L_0x0148
            boolean r11 = r8.f3255E
            if (r11 != 0) goto L_0x0146
            android.view.View r11 = r8.mo4705h()
            if (r11 == 0) goto L_0x0148
        L_0x0146:
            r11 = 1
            goto L_0x0149
        L_0x0148:
            r11 = 0
        L_0x0149:
            if (r11 == 0) goto L_0x0157
            java.lang.Runnable r11 = r8.f3258H
            r8.mo4416a(r11)
            boolean r11 = r8.mo4704g()
            if (r11 == 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            boolean r11 = r10.mo4557a()
            if (r11 == 0) goto L_0x0163
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f3254D
            r11.mo4741a()
        L_0x0163:
            boolean r11 = r0.f3294c
            r8.f3273o = r11
            boolean r11 = r8.mo4707j()
            r8.f3274z = r11
            if (r4 == 0) goto L_0x0177
            android.support.v7.widget.StaggeredGridLayoutManager$a r11 = r8.f3254D
            r11.mo4741a()
            r8.m5166a(r9, r10, r3)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.m5166a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.RecyclerView$t, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3553e == -1) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5167a(android.support.p023v7.widget.RecyclerView.C0949p r3, android.support.p023v7.widget.C1030am r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3549a
            if (r0 == 0) goto L_0x004f
            boolean r0 = r4.f3557i
            if (r0 == 0) goto L_0x0009
            goto L_0x004f
        L_0x0009:
            int r0 = r4.f3550b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3553e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3555g
        L_0x0014:
            r2.m5177b(r3, r4)
            goto L_0x004f
        L_0x0018:
            int r4 = r4.f3554f
        L_0x001a:
            r2.m5165a(r3, r4)
            goto L_0x004f
        L_0x001e:
            int r0 = r4.f3553e
            if (r0 != r1) goto L_0x0039
            int r0 = r4.f3554f
            int r1 = r4.f3554f
            int r1 = r2.m5187p(r1)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002e
            goto L_0x0012
        L_0x002e:
            int r1 = r4.f3555g
            int r4 = r4.f3550b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0039:
            int r0 = r4.f3555g
            int r0 = r2.m5192s(r0)
            int r1 = r4.f3555g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0018
        L_0x0045:
            int r1 = r4.f3554f
            int r4 = r4.f3550b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.m5167a(android.support.v7.widget.RecyclerView$p, android.support.v7.widget.am):void");
    }

    /* renamed from: a */
    private void m5168a(C0979a aVar) {
        boolean z;
        if (this.f3251A.f3284c > 0) {
            if (this.f3251A.f3284c == this.f3267i) {
                for (int i = 0; i < this.f3267i; i++) {
                    this.f3259a[i].mo4762e();
                    int i2 = this.f3251A.f3285d[i];
                    if (i2 != Integer.MIN_VALUE) {
                        i2 += this.f3251A.f3290i ? this.f3260b.mo5186d() : this.f3260b.mo5184c();
                    }
                    this.f3259a[i].mo4759c(i2);
                }
            } else {
                this.f3251A.mo4733a();
                this.f3251A.f3282a = this.f3251A.f3283b;
            }
        }
        this.f3274z = this.f3251A.f3291j;
        mo4697a(this.f3251A.f3289h);
        m5160O();
        if (this.f3251A.f3282a != -1) {
            this.f3264f = this.f3251A.f3282a;
            z = this.f3251A.f3290i;
        } else {
            z = this.f3263e;
        }
        aVar.f3294c = z;
        if (this.f3251A.f3286e > 1) {
            this.f3266h.f3276a = this.f3251A.f3287f;
            this.f3266h.f3277b = this.f3251A.f3288g;
        }
    }

    /* renamed from: a */
    private void m5169a(C0981c cVar, int i, int i2) {
        int i3 = cVar.mo4766i();
        if (i == -1) {
            if (cVar.mo4754b() + i3 > i2) {
                return;
            }
        } else if (cVar.mo4760d() - i3 < i2) {
            return;
        }
        this.f3271m.set(cVar.f3305e, false);
    }

    /* renamed from: a */
    private void m5170a(View view, int i, int i2, boolean z) {
        mo4422b(view, this.f3253C);
        C0980b bVar = (C0980b) view.getLayoutParams();
        int b = m5174b(i, bVar.leftMargin + this.f3253C.left, bVar.rightMargin + this.f3253C.right);
        int b2 = m5174b(i2, bVar.topMargin + this.f3253C.top, bVar.bottomMargin + this.f3253C.bottom);
        if (z ? mo4413a(view, b, b2, (C0942j) bVar) : mo4423b(view, b, b2, (C0942j) bVar)) {
            view.measure(b, b2);
        }
    }

    /* renamed from: a */
    private void m5171a(View view, C0980b bVar, C1030am amVar) {
        if (amVar.f3553e == 1) {
            if (bVar.f3300b) {
                m5188p(view);
            } else {
                bVar.f3299a.mo4756b(view);
            }
        } else if (bVar.f3300b) {
            m5190q(view);
        } else {
            bVar.f3299a.mo4752a(view);
        }
    }

    /* renamed from: a */
    private void m5172a(View view, C0980b bVar, boolean z) {
        int a;
        int a2;
        if (bVar.f3300b) {
            if (this.f3268j == 1) {
                a = this.f3252B;
            } else {
                m5170a(view, m4793a(mo4468z(), mo4466x(), mo4377B() + mo4379D(), bVar.width, true), this.f3252B, z);
                return;
            }
        } else if (this.f3268j == 1) {
            a = m4793a(this.f3269k, mo4466x(), 0, bVar.width, false);
        } else {
            a = m4793a(mo4468z(), mo4466x(), mo4377B() + mo4379D(), bVar.width, true);
            a2 = m4793a(this.f3269k, mo4467y(), 0, bVar.height, false);
            m5170a(view, a, a2, z);
        }
        a2 = m4793a(mo4376A(), mo4467y(), mo4378C() + mo4380E(), bVar.height, true);
        m5170a(view, a, a2, z);
    }

    /* renamed from: a */
    private boolean m5173a(C0981c cVar) {
        if (this.f3263e) {
            if (cVar.mo4760d() < this.f3260b.mo5186d()) {
                return !cVar.mo4757c((View) cVar.f3301a.get(cVar.f3301a.size() - 1)).f3300b;
            }
        } else if (cVar.mo4754b() > this.f3260b.mo5184c()) {
            return !cVar.mo4757c((View) cVar.f3301a.get(0)).f3300b;
        }
        return false;
    }

    /* renamed from: b */
    private int m5174b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: b */
    private int m5175b(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        return C1060ba.m5792a(tVar, this.f3260b, mo4698b(!this.f3256F), mo4702d(!this.f3256F), this, this.f3256F, this.f3263e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5176b(int r5, android.support.p023v7.widget.RecyclerView.C0955t r6) {
        /*
            r4 = this;
            android.support.v7.widget.am r0 = r4.f3270l
            r1 = 0
            r0.f3550b = r1
            android.support.v7.widget.am r0 = r4.f3270l
            r0.f3551c = r5
            boolean r0 = r4.mo4462t()
            r2 = 1
            if (r0 == 0) goto L_0x0030
            int r6 = r6.mo4559c()
            r0 = -1
            if (r6 == r0) goto L_0x0030
            boolean r0 = r4.f3263e
            if (r6 >= r5) goto L_0x001d
            r5 = 1
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            if (r0 != r5) goto L_0x0029
            android.support.v7.widget.at r5 = r4.f3260b
            int r5 = r5.mo5190f()
            r6 = r5
            r5 = 0
            goto L_0x0032
        L_0x0029:
            android.support.v7.widget.at r5 = r4.f3260b
            int r5 = r5.mo5190f()
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            r6 = 0
        L_0x0032:
            boolean r0 = r4.mo4461s()
            if (r0 == 0) goto L_0x004f
            android.support.v7.widget.am r0 = r4.f3270l
            android.support.v7.widget.at r3 = r4.f3260b
            int r3 = r3.mo5184c()
            int r3 = r3 - r5
            r0.f3554f = r3
            android.support.v7.widget.am r5 = r4.f3270l
            android.support.v7.widget.at r0 = r4.f3260b
            int r0 = r0.mo5186d()
            int r0 = r0 + r6
            r5.f3555g = r0
            goto L_0x005f
        L_0x004f:
            android.support.v7.widget.am r0 = r4.f3270l
            android.support.v7.widget.at r3 = r4.f3260b
            int r3 = r3.mo5188e()
            int r3 = r3 + r6
            r0.f3555g = r3
            android.support.v7.widget.am r6 = r4.f3270l
            int r5 = -r5
            r6.f3554f = r5
        L_0x005f:
            android.support.v7.widget.am r5 = r4.f3270l
            r5.f3556h = r1
            android.support.v7.widget.am r5 = r4.f3270l
            r5.f3549a = r2
            android.support.v7.widget.am r5 = r4.f3270l
            android.support.v7.widget.at r6 = r4.f3260b
            int r6 = r6.mo5193h()
            if (r6 != 0) goto L_0x007a
            android.support.v7.widget.at r6 = r4.f3260b
            int r6 = r6.mo5188e()
            if (r6 != 0) goto L_0x007a
            r1 = 1
        L_0x007a:
            r5.f3557i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.m5176b(int, android.support.v7.widget.RecyclerView$t):void");
    }

    /* renamed from: b */
    private void m5177b(C0949p pVar, int i) {
        for (int w = mo4465w() - 1; w >= 0; w--) {
            View i2 = mo4448i(w);
            if (this.f3260b.mo5179a(i2) < i || this.f3260b.mo5187d(i2) < i) {
                break;
            }
            C0980b bVar = (C0980b) i2.getLayoutParams();
            if (bVar.f3300b) {
                int i3 = 0;
                while (i3 < this.f3267i) {
                    if (this.f3259a[i3].f3301a.size() != 1) {
                        i3++;
                    } else {
                        return;
                    }
                }
                for (int i4 = 0; i4 < this.f3267i; i4++) {
                    this.f3259a[i4].mo4764g();
                }
            } else if (bVar.f3299a.f3301a.size() != 1) {
                bVar.f3299a.mo4764g();
            } else {
                return;
            }
            mo4403a(i2, pVar);
        }
    }

    /* renamed from: b */
    private void m5178b(C0949p pVar, C0955t tVar, boolean z) {
        int r = m5191r(Integer.MIN_VALUE);
        if (r != Integer.MIN_VALUE) {
            int d = this.f3260b.mo5186d() - r;
            if (d > 0) {
                int i = d - (-mo4701c(-d, pVar, tVar));
                if (z && i > 0) {
                    this.f3260b.mo5181a(i);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5179c(int r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r0 = r5.f3263e
            if (r0 == 0) goto L_0x0009
            int r0 = r5.mo4711o()
            goto L_0x000d
        L_0x0009:
            int r0 = r5.mo4693M()
        L_0x000d:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            if (r6 >= r7) goto L_0x0016
            int r2 = r7 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r6 + 1
            r3 = r2
            r2 = r7
            goto L_0x001f
        L_0x001b:
            int r2 = r6 + r7
        L_0x001d:
            r3 = r2
            r2 = r6
        L_0x001f:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r5.f3266h
            r4.mo4719b(r2)
            if (r8 == r1) goto L_0x0036
            switch(r8) {
                case 1: goto L_0x0030;
                case 2: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0041
        L_0x002a:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3266h
            r8.mo4716a(r6, r7)
            goto L_0x0041
        L_0x0030:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3266h
            r8.mo4720b(r6, r7)
            goto L_0x0041
        L_0x0036:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r8 = r5.f3266h
            r1 = 1
            r8.mo4716a(r6, r1)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r5.f3266h
            r6.mo4720b(r7, r1)
        L_0x0041:
            if (r3 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r5.f3263e
            if (r6 == 0) goto L_0x004d
            int r6 = r5.mo4693M()
            goto L_0x0051
        L_0x004d:
            int r6 = r5.mo4711o()
        L_0x0051:
            if (r2 > r6) goto L_0x0056
            r5.mo4458p()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.m5179c(int, int, int):void");
    }

    /* renamed from: c */
    private void m5180c(C0949p pVar, C0955t tVar, boolean z) {
        int q = m5189q(Integer.MAX_VALUE);
        if (q != Integer.MAX_VALUE) {
            int c = q - this.f3260b.mo5184c();
            if (c > 0) {
                int c2 = c - mo4701c(c, pVar, tVar);
                if (z && c2 > 0) {
                    this.f3260b.mo5181a(-c2);
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m5181c(C0955t tVar, C0979a aVar) {
        aVar.f3292a = this.f3273o ? m5196w(tVar.mo4561e()) : m5195v(tVar.mo4561e());
        aVar.f3293b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: i */
    private int m5182i(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        return C1060ba.m5791a(tVar, this.f3260b, mo4698b(!this.f3256F), mo4702d(!this.f3256F), this, this.f3256F);
    }

    /* renamed from: j */
    private int m5183j(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        return C1060ba.m5793b(tVar, this.f3260b, mo4698b(!this.f3256F), mo4702d(!this.f3256F), this, this.f3256F);
    }

    /* renamed from: m */
    private void m5184m(int i) {
        this.f3270l.f3553e = i;
        C1030am amVar = this.f3270l;
        int i2 = 1;
        if (this.f3263e != (i == -1)) {
            i2 = -1;
        }
        amVar.f3552d = i2;
    }

    /* renamed from: n */
    private FullSpanItem m5185n(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f3280c = new int[this.f3267i];
        for (int i2 = 0; i2 < this.f3267i; i2++) {
            fullSpanItem.f3280c[i2] = i - this.f3259a[i2].mo4755b(i);
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private FullSpanItem m5186o(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f3280c = new int[this.f3267i];
        for (int i2 = 0; i2 < this.f3267i; i2++) {
            fullSpanItem.f3280c[i2] = this.f3259a[i2].mo4747a(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: p */
    private int m5187p(int i) {
        int a = this.f3259a[0].mo4747a(i);
        for (int i2 = 1; i2 < this.f3267i; i2++) {
            int a2 = this.f3259a[i2].mo4747a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: p */
    private void m5188p(View view) {
        for (int i = this.f3267i - 1; i >= 0; i--) {
            this.f3259a[i].mo4756b(view);
        }
    }

    /* renamed from: q */
    private int m5189q(int i) {
        int a = this.f3259a[0].mo4747a(i);
        for (int i2 = 1; i2 < this.f3267i; i2++) {
            int a2 = this.f3259a[i2].mo4747a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: q */
    private void m5190q(View view) {
        for (int i = this.f3267i - 1; i >= 0; i--) {
            this.f3259a[i].mo4752a(view);
        }
    }

    /* renamed from: r */
    private int m5191r(int i) {
        int b = this.f3259a[0].mo4755b(i);
        for (int i2 = 1; i2 < this.f3267i; i2++) {
            int b2 = this.f3259a[i2].mo4755b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: s */
    private int m5192s(int i) {
        int b = this.f3259a[0].mo4755b(i);
        for (int i2 = 1; i2 < this.f3267i; i2++) {
            int b2 = this.f3259a[i2].mo4755b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private boolean m5193t(int i) {
        boolean z = false;
        if (this.f3268j == 0) {
            if ((i == -1) != this.f3263e) {
                z = true;
            }
            return z;
        }
        if (((i == -1) == this.f3263e) == mo4707j()) {
            z = true;
        }
        return z;
    }

    /* renamed from: u */
    private int m5194u(int i) {
        int i2 = -1;
        if (mo4465w() == 0) {
            if (this.f3263e) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo4693M()) == this.f3263e) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: v */
    private int m5195v(int i) {
        int w = mo4465w();
        for (int i2 = 0; i2 < w; i2++) {
            int d = mo4431d(mo4448i(i2));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: w */
    private int m5196w(int i) {
        for (int w = mo4465w() - 1; w >= 0; w--) {
            int d = mo4431d(mo4448i(w));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    /* renamed from: x */
    private int m5197x(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.f3268j != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f3268j != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f3268j == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.f3268j != 1 && mo4707j()) ? 1 : -1;
                case 2:
                    return (this.f3268j != 1 && mo4707j()) ? -1 : 1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.f3268j == 1) {
                i3 = 1;
            }
            return i3;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public int mo4693M() {
        if (mo4465w() == 0) {
            return 0;
        }
        return mo4431d(mo4448i(0));
    }

    /* renamed from: a */
    public int mo4041a(int i, C0949p pVar, C0955t tVar) {
        return mo4701c(i, pVar, tVar);
    }

    /* renamed from: a */
    public int mo4042a(C0949p pVar, C0955t tVar) {
        return this.f3268j == 0 ? this.f3267i : super.mo4042a(pVar, tVar);
    }

    /* renamed from: a */
    public C0942j mo4043a() {
        return this.f3268j == 0 ? new C0980b(-2, -1) : new C0980b(-1, -2);
    }

    /* renamed from: a */
    public C0942j mo4044a(Context context, AttributeSet attributeSet) {
        return new C0980b(context, attributeSet);
    }

    /* renamed from: a */
    public C0942j mo4045a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0980b((MarginLayoutParams) layoutParams) : new C0980b(layoutParams);
    }

    /* renamed from: a */
    public View mo4047a(View view, int i, C0949p pVar, C0955t tVar) {
        if (mo4465w() == 0) {
            return null;
        }
        View e = mo4435e(view);
        if (e == null) {
            return null;
        }
        m5160O();
        int x = m5197x(i);
        if (x == Integer.MIN_VALUE) {
            return null;
        }
        C0980b bVar = (C0980b) e.getLayoutParams();
        boolean z = bVar.f3300b;
        C0981c cVar = bVar.f3299a;
        int o = x == 1 ? mo4711o() : mo4693M();
        m5176b(o, tVar);
        m5184m(x);
        this.f3270l.f3551c = this.f3270l.f3552d + o;
        this.f3270l.f3550b = (int) (((float) this.f3260b.mo5190f()) * 0.33333334f);
        this.f3270l.f3556h = true;
        this.f3270l.f3549a = false;
        m5162a(pVar, this.f3270l, tVar);
        this.f3273o = this.f3263e;
        if (!z) {
            View a = cVar.mo4750a(o, x);
            if (!(a == null || a == e)) {
                return a;
            }
        }
        if (m5193t(x)) {
            for (int i2 = this.f3267i - 1; i2 >= 0; i2--) {
                View a2 = this.f3259a[i2].mo4750a(o, x);
                if (a2 != null && a2 != e) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3267i; i3++) {
                View a3 = this.f3259a[i3].mo4750a(o, x);
                if (a3 != null && a3 != e) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f3262d ^ true) == (x == -1);
        if (!z) {
            View c = mo4088c(z2 ? cVar.mo4767j() : cVar.mo4768k());
            if (!(c == null || c == e)) {
                return c;
            }
        }
        if (m5193t(x)) {
            for (int i4 = this.f3267i - 1; i4 >= 0; i4--) {
                if (i4 != cVar.f3305e) {
                    View c2 = mo4088c(z2 ? this.f3259a[i4].mo4767j() : this.f3259a[i4].mo4768k());
                    if (!(c2 == null || c2 == e)) {
                        return c2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3267i; i5++) {
                View c3 = mo4088c(z2 ? this.f3259a[i5].mo4767j() : this.f3259a[i5].mo4768k());
                if (c3 != null && c3 != e) {
                    return c3;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4694a(int i) {
        mo4081a((String) null);
        if (i != this.f3267i) {
            mo4706i();
            this.f3267i = i;
            this.f3271m = new BitSet(this.f3267i);
            this.f3259a = new C0981c[this.f3267i];
            for (int i2 = 0; i2 < this.f3267i; i2++) {
                this.f3259a[i2] = new C0981c(i2);
            }
            mo4458p();
        }
    }

    /* renamed from: a */
    public void mo4076a(int i, int i2, C0955t tVar, C0940a aVar) {
        int b;
        int i3;
        if (this.f3268j != 0) {
            i = i2;
        }
        if (mo4465w() != 0 && i != 0) {
            mo4695a(i, tVar);
            if (this.f3257G == null || this.f3257G.length < this.f3267i) {
                this.f3257G = new int[this.f3267i];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f3267i; i5++) {
                if (this.f3270l.f3552d == -1) {
                    b = this.f3270l.f3554f;
                    i3 = this.f3259a[i5].mo4747a(this.f3270l.f3554f);
                } else {
                    b = this.f3259a[i5].mo4755b(this.f3270l.f3555g);
                    i3 = this.f3270l.f3555g;
                }
                int i6 = b - i3;
                if (i6 >= 0) {
                    this.f3257G[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f3257G, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f3270l.mo5081a(tVar); i7++) {
                aVar.mo4474b(this.f3270l.f3551c, this.f3257G[i7]);
                this.f3270l.f3551c += this.f3270l.f3552d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4695a(int i, C0955t tVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4711o();
            i2 = 1;
        } else {
            i3 = mo4693M();
            i2 = -1;
        }
        this.f3270l.f3549a = true;
        m5176b(i3, tVar);
        m5184m(i2);
        this.f3270l.f3551c = i3 + this.f3270l.f3552d;
        this.f3270l.f3550b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo4049a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int B = mo4377B() + mo4379D();
        int C = mo4378C() + mo4380E();
        if (this.f3268j == 1) {
            i4 = m4792a(i2, rect.height() + C, mo4384I());
            i3 = m4792a(i, (this.f3269k * this.f3267i) + B, mo4383H());
        } else {
            i3 = m4792a(i, rect.width() + B, mo4383H());
            i4 = m4792a(i2, (this.f3269k * this.f3267i) + C, mo4384I());
        }
        mo4444g(i3, i4);
    }

    /* renamed from: a */
    public void mo4078a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3251A = (SavedState) parcelable;
            mo4458p();
        }
    }

    /* renamed from: a */
    public void mo4052a(C0949p pVar, C0955t tVar, View view, C0583b bVar) {
        int i;
        int i2;
        int b;
        int i3;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0980b)) {
            super.mo4402a(view, bVar);
            return;
        }
        C0980b bVar2 = (C0980b) layoutParams;
        if (this.f3268j == 0) {
            i = bVar2.mo4746b();
            i2 = bVar2.f3300b ? this.f3267i : 1;
            b = -1;
            i3 = -1;
        } else {
            i = -1;
            i2 = -1;
            b = bVar2.mo4746b();
            i3 = bVar2.f3300b ? this.f3267i : 1;
        }
        bVar.mo2362b((Object) C0586c.m2697a(i, i2, b, i3, bVar2.f3300b, false));
    }

    /* renamed from: a */
    public void mo4053a(C0955t tVar) {
        super.mo4053a(tVar);
        this.f3264f = -1;
        this.f3265g = Integer.MIN_VALUE;
        this.f3251A = null;
        this.f3254D.mo4741a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4696a(C0955t tVar, C0979a aVar) {
        if (!mo4700b(tVar, aVar) && !m5181c(tVar, aVar)) {
            aVar.mo4744b();
            aVar.f3292a = 0;
        }
    }

    /* renamed from: a */
    public void mo4055a(RecyclerView recyclerView) {
        this.f3266h.mo4715a();
        mo4458p();
    }

    /* renamed from: a */
    public void mo4056a(RecyclerView recyclerView, int i, int i2) {
        m5179c(i, i2, 1);
    }

    /* renamed from: a */
    public void mo4057a(RecyclerView recyclerView, int i, int i2, int i3) {
        m5179c(i, i2, 8);
    }

    /* renamed from: a */
    public void mo4058a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5179c(i, i2, 4);
    }

    /* renamed from: a */
    public void mo4079a(RecyclerView recyclerView, C0949p pVar) {
        super.mo4079a(recyclerView, pVar);
        mo4416a(this.f3258H);
        for (int i = 0; i < this.f3267i; i++) {
            this.f3259a[i].mo4762e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: a */
    public void mo4080a(AccessibilityEvent accessibilityEvent) {
        super.mo4080a(accessibilityEvent);
        if (mo4465w() > 0) {
            View b = mo4698b(false);
            View d = mo4702d(false);
            if (b != null && d != null) {
                int d2 = mo4431d(b);
                int d3 = mo4431d(d);
                if (d2 < d3) {
                    accessibilityEvent.setFromIndex(d2);
                    accessibilityEvent.setToIndex(d3);
                    return;
                }
                accessibilityEvent.setFromIndex(d3);
                accessibilityEvent.setToIndex(d2);
            }
        }
    }

    /* renamed from: a */
    public void mo4081a(String str) {
        if (this.f3251A == null) {
            super.mo4081a(str);
        }
    }

    /* renamed from: a */
    public void mo4697a(boolean z) {
        mo4081a((String) null);
        if (!(this.f3251A == null || this.f3251A.f3289h == z)) {
            this.f3251A.f3289h = z;
        }
        this.f3262d = z;
        mo4458p();
    }

    /* renamed from: a */
    public boolean mo4060a(C0942j jVar) {
        return jVar instanceof C0980b;
    }

    /* renamed from: b */
    public int mo4061b(int i, C0949p pVar, C0955t tVar) {
        return mo4701c(i, pVar, tVar);
    }

    /* renamed from: b */
    public int mo4062b(C0949p pVar, C0955t tVar) {
        return this.f3268j == 1 ? this.f3267i : super.mo4062b(pVar, tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4698b(boolean z) {
        int c = this.f3260b.mo5184c();
        int d = this.f3260b.mo5186d();
        int w = mo4465w();
        View view = null;
        for (int i = 0; i < w; i++) {
            View i2 = mo4448i(i);
            int a = this.f3260b.mo5179a(i2);
            if (this.f3260b.mo5183b(i2) > c && a < d) {
                if (a >= c || !z) {
                    return i2;
                }
                if (view == null) {
                    view = i2;
                }
            }
        }
        return view;
    }

    /* renamed from: b */
    public void mo4699b(int i) {
        if (i == 0 || i == 1) {
            mo4081a((String) null);
            if (i != this.f3268j) {
                this.f3268j = i;
                C1047at atVar = this.f3260b;
                this.f3260b = this.f3261c;
                this.f3261c = atVar;
                mo4458p();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: b */
    public void mo4063b(RecyclerView recyclerView, int i, int i2) {
        m5179c(i, i2, 2);
    }

    /* renamed from: b */
    public boolean mo4064b() {
        return this.f3251A == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4700b(C0955t tVar, C0979a aVar) {
        int c;
        int a;
        boolean z = false;
        if (!tVar.mo4557a() && this.f3264f != -1) {
            if (this.f3264f < 0 || this.f3264f >= tVar.mo4561e()) {
                this.f3264f = -1;
                this.f3265g = Integer.MIN_VALUE;
            } else {
                if (this.f3251A == null || this.f3251A.f3282a == -1 || this.f3251A.f3284c < 1) {
                    View c2 = mo4088c(this.f3264f);
                    if (c2 != null) {
                        aVar.f3292a = this.f3263e ? mo4711o() : mo4693M();
                        if (this.f3265g != Integer.MIN_VALUE) {
                            if (aVar.f3294c) {
                                c = this.f3260b.mo5186d() - this.f3265g;
                                a = this.f3260b.mo5183b(c2);
                            } else {
                                c = this.f3260b.mo5184c() + this.f3265g;
                                a = this.f3260b.mo5179a(c2);
                            }
                            aVar.f3293b = c - a;
                            return true;
                        } else if (this.f3260b.mo5189e(c2) > this.f3260b.mo5190f()) {
                            aVar.f3293b = aVar.f3294c ? this.f3260b.mo5186d() : this.f3260b.mo5184c();
                            return true;
                        } else {
                            int a2 = this.f3260b.mo5179a(c2) - this.f3260b.mo5184c();
                            if (a2 < 0) {
                                aVar.f3293b = -a2;
                                return true;
                            }
                            int d = this.f3260b.mo5186d() - this.f3260b.mo5183b(c2);
                            if (d < 0) {
                                aVar.f3293b = d;
                                return true;
                            }
                            aVar.f3293b = Integer.MIN_VALUE;
                        }
                    } else {
                        aVar.f3292a = this.f3264f;
                        if (this.f3265g == Integer.MIN_VALUE) {
                            if (m5194u(aVar.f3292a) == 1) {
                                z = true;
                            }
                            aVar.f3294c = z;
                            aVar.mo4744b();
                        } else {
                            aVar.mo4742a(this.f3265g);
                        }
                        aVar.f3295d = true;
                    }
                } else {
                    aVar.f3293b = Integer.MIN_VALUE;
                    aVar.f3292a = this.f3264f;
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4701c(int i, C0949p pVar, C0955t tVar) {
        if (mo4465w() == 0 || i == 0) {
            return 0;
        }
        mo4695a(i, tVar);
        int a = m5162a(pVar, this.f3270l, tVar);
        if (this.f3270l.f3550b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f3260b.mo5181a(-i);
        this.f3273o = this.f3263e;
        this.f3270l.f3550b = 0;
        m5167a(pVar, this.f3270l);
        return i;
    }

    /* renamed from: c */
    public int mo4087c(C0955t tVar) {
        return m5175b(tVar);
    }

    /* renamed from: c */
    public void mo4065c(C0949p pVar, C0955t tVar) {
        m5166a(pVar, tVar, true);
    }

    /* renamed from: c */
    public boolean mo4090c() {
        return this.f3272n != 0;
    }

    /* renamed from: d */
    public int mo4091d(C0955t tVar) {
        return m5175b(tVar);
    }

    /* renamed from: d */
    public PointF mo4092d(int i) {
        int u = m5194u(i);
        PointF pointF = new PointF();
        if (u == 0) {
            return null;
        }
        if (this.f3268j == 0) {
            pointF.x = (float) u;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) u;
        }
        return pointF;
    }

    /* renamed from: d */
    public Parcelable mo4093d() {
        int i;
        int c;
        if (this.f3251A != null) {
            return new SavedState(this.f3251A);
        }
        SavedState savedState = new SavedState();
        savedState.f3289h = this.f3262d;
        savedState.f3290i = this.f3273o;
        savedState.f3291j = this.f3274z;
        if (this.f3266h == null || this.f3266h.f3276a == null) {
            savedState.f3286e = 0;
        } else {
            savedState.f3287f = this.f3266h.f3276a;
            savedState.f3286e = savedState.f3287f.length;
            savedState.f3288g = this.f3266h.f3277b;
        }
        if (mo4465w() > 0) {
            savedState.f3282a = this.f3273o ? mo4711o() : mo4693M();
            savedState.f3283b = mo4708k();
            savedState.f3284c = this.f3267i;
            savedState.f3285d = new int[this.f3267i];
            for (int i2 = 0; i2 < this.f3267i; i2++) {
                if (this.f3273o) {
                    i = this.f3259a[i2].mo4755b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        c = this.f3260b.mo5186d();
                    } else {
                        savedState.f3285d[i2] = i;
                    }
                } else {
                    i = this.f3259a[i2].mo4747a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        c = this.f3260b.mo5184c();
                    } else {
                        savedState.f3285d[i2] = i;
                    }
                }
                i -= c;
                savedState.f3285d[i2] = i;
            }
        } else {
            savedState.f3282a = -1;
            savedState.f3283b = -1;
            savedState.f3284c = 0;
        }
        return savedState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo4702d(boolean z) {
        int c = this.f3260b.mo5184c();
        int d = this.f3260b.mo5186d();
        View view = null;
        for (int w = mo4465w() - 1; w >= 0; w--) {
            View i = mo4448i(w);
            int a = this.f3260b.mo5179a(i);
            int b = this.f3260b.mo5183b(i);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return i;
                }
                if (view == null) {
                    view = i;
                }
            }
        }
        return view;
    }

    /* renamed from: e */
    public int mo4094e(C0955t tVar) {
        return m5182i(tVar);
    }

    /* renamed from: e */
    public void mo4095e(int i) {
        if (!(this.f3251A == null || this.f3251A.f3282a == i)) {
            this.f3251A.mo4734b();
        }
        this.f3264f = i;
        this.f3265g = Integer.MIN_VALUE;
        mo4458p();
    }

    /* renamed from: e */
    public boolean mo4096e() {
        return this.f3268j == 0;
    }

    /* renamed from: f */
    public int mo4098f(C0955t tVar) {
        return m5182i(tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4703f(int i) {
        this.f3269k = i / this.f3267i;
        this.f3252B = MeasureSpec.makeMeasureSpec(i, this.f3261c.mo5193h());
    }

    /* renamed from: f */
    public boolean mo4099f() {
        return this.f3268j == 1;
    }

    /* renamed from: g */
    public int mo4101g(C0955t tVar) {
        return m5183j(tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4704g() {
        int i;
        int i2;
        if (mo4465w() == 0 || this.f3272n == 0 || !mo4460r()) {
            return false;
        }
        if (this.f3263e) {
            i2 = mo4711o();
            i = mo4693M();
        } else {
            i2 = mo4693M();
            i = mo4711o();
        }
        if (i2 == 0 && mo4705h() != null) {
            this.f3266h.mo4715a();
        } else if (!this.f3255E) {
            return false;
        } else {
            int i3 = this.f3263e ? -1 : 1;
            int i4 = i + 1;
            FullSpanItem a = this.f3266h.mo4714a(i2, i4, i3, true);
            if (a == null) {
                this.f3255E = false;
                this.f3266h.mo4713a(i4);
                return false;
            }
            FullSpanItem a2 = this.f3266h.mo4714a(i2, a.f3278a, i3 * -1, true);
            if (a2 == null) {
                this.f3266h.mo4713a(a.f3278a);
            } else {
                this.f3266h.mo4713a(a2.f3278a + 1);
            }
        }
        mo4386K();
        mo4458p();
        return true;
    }

    /* renamed from: h */
    public int mo4102h(C0955t tVar) {
        return m5183j(tVar);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4705h() {
        /*
            r12 = this;
            int r0 = r12.mo4465w()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3267i
            r2.<init>(r3)
            int r3 = r12.f3267i
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3268j
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo4707j()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f3263e
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo4448i(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r8 = (android.support.p023v7.widget.StaggeredGridLayoutManager.C0980b) r8
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3299a
            int r9 = r9.f3305e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3299a
            boolean r9 = r12.m5173a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r8.f3299a
            int r9 = r9.f3305e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3300b
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo4448i(r9)
            boolean r10 = r12.f3263e
            if (r10 == 0) goto L_0x0077
            android.support.v7.widget.at r10 = r12.f3260b
            int r10 = r10.mo5183b(r7)
            android.support.v7.widget.at r11 = r12.f3260b
            int r11 = r11.mo5183b(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            android.support.v7.widget.at r10 = r12.f3260b
            int r10 = r10.mo5179a(r7)
            android.support.v7.widget.at r11 = r12.f3260b
            int r11 = r11.mo5179a(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.support.v7.widget.StaggeredGridLayoutManager$b r9 = (android.support.p023v7.widget.StaggeredGridLayoutManager.C0980b) r9
            android.support.v7.widget.StaggeredGridLayoutManager$c r8 = r8.f3299a
            int r8 = r8.f3305e
            android.support.v7.widget.StaggeredGridLayoutManager$c r9 = r9.f3299a
            int r9 = r9.f3305e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.StaggeredGridLayoutManager.mo4705h():android.view.View");
    }

    /* renamed from: i */
    public void mo4706i() {
        this.f3266h.mo4715a();
        mo4458p();
    }

    /* renamed from: j */
    public void mo4450j(int i) {
        super.mo4450j(i);
        for (int i2 = 0; i2 < this.f3267i; i2++) {
            this.f3259a[i2].mo4761d(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo4707j() {
        return mo4463u() == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo4708k() {
        View d = this.f3263e ? mo4702d(true) : mo4698b(true);
        if (d == null) {
            return -1;
        }
        return mo4431d(d);
    }

    /* renamed from: k */
    public void mo4452k(int i) {
        super.mo4452k(i);
        for (int i2 = 0; i2 < this.f3267i; i2++) {
            this.f3259a[i2].mo4761d(i);
        }
    }

    /* renamed from: l */
    public void mo4454l(int i) {
        if (i == 0) {
            mo4704g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo4709m() {
        int b = this.f3259a[0].mo4755b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3267i; i++) {
            if (this.f3259a[i].mo4755b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo4710n() {
        int a = this.f3259a[0].mo4747a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3267i; i++) {
            if (this.f3259a[i].mo4747a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public int mo4711o() {
        int w = mo4465w();
        if (w == 0) {
            return 0;
        }
        return mo4431d(mo4448i(w - 1));
    }
}
