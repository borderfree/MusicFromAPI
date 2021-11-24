package android.support.p023v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0937i.C0940a;
import android.support.p023v7.widget.RecyclerView.C0937i.C0941b;
import android.support.p023v7.widget.RecyclerView.C0942j;
import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0952s.C0954b;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.support.p023v7.widget.RecyclerView.C0958w;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C0937i implements C0954b {

    /* renamed from: a */
    private C0918c f2933a;

    /* renamed from: b */
    private boolean f2934b;

    /* renamed from: c */
    private boolean f2935c;

    /* renamed from: d */
    private boolean f2936d;

    /* renamed from: e */
    private boolean f2937e;

    /* renamed from: f */
    private boolean f2938f;

    /* renamed from: g */
    private final C0917b f2939g;

    /* renamed from: h */
    private int f2940h;

    /* renamed from: i */
    int f2941i;

    /* renamed from: j */
    C1047at f2942j;

    /* renamed from: k */
    boolean f2943k;

    /* renamed from: l */
    int f2944l;

    /* renamed from: m */
    int f2945m;

    /* renamed from: n */
    SavedState f2946n;

    /* renamed from: o */
    final C0916a f2947o;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$SavedState */
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
        int f2948a;

        /* renamed from: b */
        int f2949b;

        /* renamed from: c */
        boolean f2950c;

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2948a = parcel.readInt();
            this.f2949b = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2950c = z;
        }

        public SavedState(SavedState savedState) {
            this.f2948a = savedState.f2948a;
            this.f2949b = savedState.f2949b;
            this.f2950c = savedState.f2950c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4111a() {
            return this.f2948a >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4112b() {
            this.f2948a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2948a);
            parcel.writeInt(this.f2949b);
            parcel.writeInt(this.f2950c ? 1 : 0);
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    static class C0916a {

        /* renamed from: a */
        C1047at f2951a;

        /* renamed from: b */
        int f2952b;

        /* renamed from: c */
        int f2953c;

        /* renamed from: d */
        boolean f2954d;

        /* renamed from: e */
        boolean f2955e;

        C0916a() {
            mo4119a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4119a() {
            this.f2952b = -1;
            this.f2953c = Integer.MIN_VALUE;
            this.f2954d = false;
            this.f2955e = false;
        }

        /* renamed from: a */
        public void mo4120a(View view, int i) {
            int b = this.f2951a.mo5182b();
            if (b >= 0) {
                mo4123b(view, i);
                return;
            }
            this.f2952b = i;
            if (this.f2954d) {
                int d = (this.f2951a.mo5186d() - b) - this.f2951a.mo5183b(view);
                this.f2953c = this.f2951a.mo5186d() - d;
                if (d > 0) {
                    int e = this.f2953c - this.f2951a.mo5189e(view);
                    int c = this.f2951a.mo5184c();
                    int min = e - (c + Math.min(this.f2951a.mo5179a(view) - c, 0));
                    if (min < 0) {
                        this.f2953c += Math.min(d, -min);
                    }
                }
            } else {
                int a = this.f2951a.mo5179a(view);
                int c2 = a - this.f2951a.mo5184c();
                this.f2953c = a;
                if (c2 > 0) {
                    int d2 = (this.f2951a.mo5186d() - Math.min(0, (this.f2951a.mo5186d() - b) - this.f2951a.mo5183b(view))) - (a + this.f2951a.mo5189e(view));
                    if (d2 < 0) {
                        this.f2953c -= Math.min(c2, -d2);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4121a(View view, C0955t tVar) {
            C0942j jVar = (C0942j) view.getLayoutParams();
            return !jVar.mo4476d() && jVar.mo4478f() >= 0 && jVar.mo4478f() < tVar.mo4561e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4122b() {
            this.f2953c = this.f2954d ? this.f2951a.mo5186d() : this.f2951a.mo5184c();
        }

        /* renamed from: b */
        public void mo4123b(View view, int i) {
            this.f2953c = this.f2954d ? this.f2951a.mo5183b(view) + this.f2951a.mo5182b() : this.f2951a.mo5179a(view);
            this.f2952b = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f2952b);
            sb.append(", mCoordinate=");
            sb.append(this.f2953c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f2954d);
            sb.append(", mValid=");
            sb.append(this.f2955e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C0917b {

        /* renamed from: a */
        public int f2956a;

        /* renamed from: b */
        public boolean f2957b;

        /* renamed from: c */
        public boolean f2958c;

        /* renamed from: d */
        public boolean f2959d;

        protected C0917b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4125a() {
            this.f2956a = 0;
            this.f2957b = false;
            this.f2958c = false;
            this.f2959d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C0918c {

        /* renamed from: a */
        boolean f2960a = true;

        /* renamed from: b */
        int f2961b;

        /* renamed from: c */
        int f2962c;

        /* renamed from: d */
        int f2963d;

        /* renamed from: e */
        int f2964e;

        /* renamed from: f */
        int f2965f;

        /* renamed from: g */
        int f2966g;

        /* renamed from: h */
        int f2967h = 0;

        /* renamed from: i */
        boolean f2968i = false;

        /* renamed from: j */
        int f2969j;

        /* renamed from: k */
        List<C0958w> f2970k = null;

        /* renamed from: l */
        boolean f2971l;

        C0918c() {
        }

        /* renamed from: b */
        private View m4576b() {
            int size = this.f2970k.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0958w) this.f2970k.get(i)).f3157a;
                C0942j jVar = (C0942j) view.getLayoutParams();
                if (!jVar.mo4476d() && this.f2963d == jVar.mo4478f()) {
                    mo4128a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo4126a(C0949p pVar) {
            if (this.f2970k != null) {
                return m4576b();
            }
            View c = pVar.mo4517c(this.f2963d);
            this.f2963d += this.f2964e;
            return c;
        }

        /* renamed from: a */
        public void mo4127a() {
            mo4128a((View) null);
        }

        /* renamed from: a */
        public void mo4128a(View view) {
            View b = mo4130b(view);
            this.f2963d = b == null ? -1 : ((C0942j) b.getLayoutParams()).mo4478f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4129a(C0955t tVar) {
            return this.f2963d >= 0 && this.f2963d < tVar.mo4561e();
        }

        /* renamed from: b */
        public View mo4130b(View view) {
            int size = this.f2970k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0958w) this.f2970k.get(i2)).f3157a;
                C0942j jVar = (C0942j) view3.getLayoutParams();
                if (view3 != view && !jVar.mo4476d()) {
                    int f = (jVar.mo4478f() - this.f2963d) * this.f2964e;
                    if (f >= 0 && f < i) {
                        if (f == 0) {
                            return view3;
                        }
                        view2 = view3;
                        i = f;
                    }
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2941i = 1;
        this.f2935c = false;
        this.f2943k = false;
        this.f2936d = false;
        this.f2937e = true;
        this.f2944l = -1;
        this.f2945m = Integer.MIN_VALUE;
        this.f2946n = null;
        this.f2947o = new C0916a();
        this.f2939g = new C0917b();
        this.f2940h = 2;
        mo4083b(i);
        mo4085b(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2941i = 1;
        this.f2935c = false;
        this.f2943k = false;
        this.f2936d = false;
        this.f2937e = true;
        this.f2944l = -1;
        this.f2945m = Integer.MIN_VALUE;
        this.f2946n = null;
        this.f2947o = new C0916a();
        this.f2939g = new C0917b();
        this.f2940h = 2;
        C0941b a = m4794a(context, attributeSet, i, i2);
        mo4083b(a.f3094a);
        mo4085b(a.f3096c);
        mo4059a(a.f3097d);
    }

    /* renamed from: M */
    private void m4486M() {
        this.f2943k = (this.f2941i == 1 || !mo4103h()) ? this.f2935c : !this.f2935c;
    }

    /* renamed from: N */
    private View m4487N() {
        return mo4448i(this.f2943k ? mo4465w() - 1 : 0);
    }

    /* renamed from: O */
    private View m4488O() {
        return mo4448i(this.f2943k ? 0 : mo4465w() - 1);
    }

    /* renamed from: a */
    private int m4489a(int i, C0949p pVar, C0955t tVar, boolean z) {
        int d = this.f2942j.mo5186d() - i;
        if (d <= 0) {
            return 0;
        }
        int i2 = -mo4086c(-d, pVar, tVar);
        int i3 = i + i2;
        if (z) {
            int d2 = this.f2942j.mo5186d() - i3;
            if (d2 > 0) {
                this.f2942j.mo5181a(d2);
                return d2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private View m4490a(boolean z, boolean z2) {
        int i;
        int w;
        if (this.f2943k) {
            i = mo4465w() - 1;
            w = -1;
        } else {
            i = 0;
            w = mo4465w();
        }
        return mo4075a(i, w, z, z2);
    }

    /* renamed from: a */
    private void mo4040a(int i, int i2) {
        this.f2933a.f2962c = this.f2942j.mo5186d() - i2;
        this.f2933a.f2964e = this.f2943k ? -1 : 1;
        this.f2933a.f2963d = i;
        this.f2933a.f2965f = 1;
        this.f2933a.f2961b = i2;
        this.f2933a.f2966g = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private void m4492a(int i, int i2, boolean z, C0955t tVar) {
        int i3;
        this.f2933a.f2971l = mo4106k();
        this.f2933a.f2967h = mo4082b(tVar);
        this.f2933a.f2965f = i;
        int i4 = -1;
        if (i == 1) {
            this.f2933a.f2967h += this.f2942j.mo5192g();
            View O = m4488O();
            C0918c cVar = this.f2933a;
            if (!this.f2943k) {
                i4 = 1;
            }
            cVar.f2964e = i4;
            this.f2933a.f2963d = mo4431d(O) + this.f2933a.f2964e;
            this.f2933a.f2961b = this.f2942j.mo5183b(O);
            i3 = this.f2942j.mo5183b(O) - this.f2942j.mo5186d();
        } else {
            View N = m4487N();
            this.f2933a.f2967h += this.f2942j.mo5184c();
            C0918c cVar2 = this.f2933a;
            if (this.f2943k) {
                i4 = 1;
            }
            cVar2.f2964e = i4;
            this.f2933a.f2963d = mo4431d(N) + this.f2933a.f2964e;
            this.f2933a.f2961b = this.f2942j.mo5179a(N);
            i3 = (-this.f2942j.mo5179a(N)) + this.f2942j.mo5184c();
        }
        this.f2933a.f2962c = i2;
        if (z) {
            this.f2933a.f2962c -= i3;
        }
        this.f2933a.f2966g = i3;
    }

    /* renamed from: a */
    private void m4493a(C0916a aVar) {
        mo4040a(aVar.f2952b, aVar.f2953c);
    }

    /* renamed from: a */
    private void m4494a(C0949p pVar, int i) {
        if (i >= 0) {
            int w = mo4465w();
            if (!this.f2943k) {
                int i2 = 0;
                while (true) {
                    if (i2 >= w) {
                        break;
                    }
                    View i3 = mo4448i(i2);
                    if (this.f2942j.mo5183b(i3) > i || this.f2942j.mo5185c(i3) > i) {
                        m4495a(pVar, 0, i2);
                    } else {
                        i2++;
                    }
                }
            } else {
                int i4 = w - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View i6 = mo4448i(i5);
                    if (this.f2942j.mo5183b(i6) > i || this.f2942j.mo5185c(i6) > i) {
                        m4495a(pVar, i4, i5);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m4495a(C0949p pVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4388a(i3, pVar);
                }
            } else {
                while (i > i2) {
                    mo4388a(i, pVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m4496a(C0949p pVar, C0918c cVar) {
        if (cVar.f2960a && !cVar.f2971l) {
            if (cVar.f2965f == -1) {
                m4502b(pVar, cVar.f2966g);
            } else {
                m4494a(pVar, cVar.f2966g);
            }
        }
    }

    /* renamed from: a */
    private void m4497a(C0949p pVar, C0955t tVar, C0916a aVar) {
        if (!m4498a(tVar, aVar) && !m4504b(pVar, tVar, aVar)) {
            aVar.mo4122b();
            aVar.f2952b = this.f2936d ? tVar.mo4561e() - 1 : 0;
        }
    }

    /* renamed from: a */
    private boolean m4498a(C0955t tVar, C0916a aVar) {
        boolean z = false;
        if (!tVar.mo4557a() && this.f2944l != -1) {
            if (this.f2944l < 0 || this.f2944l >= tVar.mo4561e()) {
                this.f2944l = -1;
                this.f2945m = Integer.MIN_VALUE;
            } else {
                aVar.f2952b = this.f2944l;
                if (this.f2946n != null && this.f2946n.mo4111a()) {
                    aVar.f2954d = this.f2946n.f2950c;
                    aVar.f2953c = aVar.f2954d ? this.f2942j.mo5186d() - this.f2946n.f2949b : this.f2942j.mo5184c() + this.f2946n.f2949b;
                    return true;
                } else if (this.f2945m == Integer.MIN_VALUE) {
                    View c = mo4088c(this.f2944l);
                    if (c == null) {
                        if (mo4465w() > 0) {
                            if ((this.f2944l < mo4431d(mo4448i(0))) == this.f2943k) {
                                z = true;
                            }
                            aVar.f2954d = z;
                        }
                        aVar.mo4122b();
                    } else if (this.f2942j.mo5189e(c) > this.f2942j.mo5190f()) {
                        aVar.mo4122b();
                        return true;
                    } else if (this.f2942j.mo5179a(c) - this.f2942j.mo5184c() < 0) {
                        aVar.f2953c = this.f2942j.mo5184c();
                        aVar.f2954d = false;
                        return true;
                    } else if (this.f2942j.mo5186d() - this.f2942j.mo5183b(c) < 0) {
                        aVar.f2953c = this.f2942j.mo5186d();
                        aVar.f2954d = true;
                        return true;
                    } else {
                        aVar.f2953c = aVar.f2954d ? this.f2942j.mo5183b(c) + this.f2942j.mo5182b() : this.f2942j.mo5179a(c);
                    }
                    return true;
                } else {
                    aVar.f2954d = this.f2943k;
                    aVar.f2953c = this.f2943k ? this.f2942j.mo5186d() - this.f2945m : this.f2942j.mo5184c() + this.f2945m;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m4499b(int i, C0949p pVar, C0955t tVar, boolean z) {
        int c = i - this.f2942j.mo5184c();
        if (c <= 0) {
            return 0;
        }
        int i2 = -mo4086c(c, pVar, tVar);
        int i3 = i + i2;
        if (z) {
            int c2 = i3 - this.f2942j.mo5184c();
            if (c2 > 0) {
                this.f2942j.mo5181a(-c2);
                i2 -= c2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private View m4500b(boolean z, boolean z2) {
        int w;
        int i;
        if (this.f2943k) {
            w = 0;
            i = mo4465w();
        } else {
            w = mo4465w() - 1;
            i = -1;
        }
        return mo4075a(w, i, z, z2);
    }

    /* renamed from: b */
    private void m4501b(C0916a aVar) {
        m4508h(aVar.f2952b, aVar.f2953c);
    }

    /* renamed from: b */
    private void m4502b(C0949p pVar, int i) {
        int w = mo4465w();
        if (i >= 0) {
            int e = this.f2942j.mo5188e() - i;
            if (this.f2943k) {
                for (int i2 = 0; i2 < w; i2++) {
                    View i3 = mo4448i(i2);
                    if (this.f2942j.mo5179a(i3) < e || this.f2942j.mo5187d(i3) < e) {
                        m4495a(pVar, 0, i2);
                        return;
                    }
                }
            } else {
                int i4 = w - 1;
                int i5 = i4;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View i6 = mo4448i(i5);
                    if (this.f2942j.mo5179a(i6) < e || this.f2942j.mo5187d(i6) < e) {
                        m4495a(pVar, i4, i5);
                    } else {
                        i5--;
                    }
                }
                m4495a(pVar, i4, i5);
            }
        }
    }

    /* renamed from: b */
    private void m4503b(C0949p pVar, C0955t tVar, int i, int i2) {
        C0949p pVar2 = pVar;
        C0955t tVar2 = tVar;
        if (tVar.mo4558b() && mo4465w() != 0 && !tVar.mo4557a() && mo4064b()) {
            List<C0958w> c = pVar.mo4518c();
            int size = c.size();
            int d = mo4431d(mo4448i(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0958w wVar = (C0958w) c.get(i5);
                if (!wVar.mo4597q()) {
                    char c2 = 1;
                    if ((wVar.mo4584d() < d) != this.f2943k) {
                        c2 = 65535;
                    }
                    if (c2 == 65535) {
                        i3 += this.f2942j.mo5189e(wVar.f3157a);
                    } else {
                        i4 += this.f2942j.mo5189e(wVar.f3157a);
                    }
                }
            }
            this.f2933a.f2970k = c;
            if (i3 > 0) {
                m4508h(mo4431d(m4487N()), i);
                this.f2933a.f2967h = i3;
                this.f2933a.f2962c = 0;
                this.f2933a.mo4127a();
                mo4074a(pVar2, this.f2933a, tVar2, false);
            }
            if (i4 > 0) {
                mo4040a(mo4431d(m4488O()), i2);
                this.f2933a.f2967h = i4;
                this.f2933a.f2962c = 0;
                this.f2933a.mo4127a();
                mo4074a(pVar2, this.f2933a, tVar2, false);
            }
            this.f2933a.f2970k = null;
        }
    }

    /* renamed from: b */
    private boolean m4504b(C0949p pVar, C0955t tVar, C0916a aVar) {
        boolean z = false;
        if (mo4465w() == 0) {
            return false;
        }
        View F = mo4381F();
        if (F != null && aVar.mo4121a(F, tVar)) {
            aVar.mo4120a(F, mo4431d(F));
            return true;
        } else if (this.f2934b != this.f2936d) {
            return false;
        } else {
            View f = aVar.f2954d ? m4505f(pVar, tVar) : m4506g(pVar, tVar);
            if (f == null) {
                return false;
            }
            aVar.mo4123b(f, mo4431d(f));
            if (!tVar.mo4557a() && mo4064b()) {
                if (this.f2942j.mo5179a(f) >= this.f2942j.mo5186d() || this.f2942j.mo5183b(f) < this.f2942j.mo5184c()) {
                    z = true;
                }
                if (z) {
                    aVar.f2953c = aVar.f2954d ? this.f2942j.mo5186d() : this.f2942j.mo5184c();
                }
            }
            return true;
        }
    }

    /* renamed from: f */
    private View m4505f(C0949p pVar, C0955t tVar) {
        return this.f2943k ? m4507h(pVar, tVar) : m4510i(pVar, tVar);
    }

    /* renamed from: g */
    private View m4506g(C0949p pVar, C0955t tVar) {
        return this.f2943k ? m4510i(pVar, tVar) : m4507h(pVar, tVar);
    }

    /* renamed from: h */
    private View m4507h(C0949p pVar, C0955t tVar) {
        return mo4046a(pVar, tVar, 0, mo4465w(), tVar.mo4561e());
    }

    /* renamed from: h */
    private void m4508h(int i, int i2) {
        this.f2933a.f2962c = i2 - this.f2942j.mo5184c();
        this.f2933a.f2963d = i;
        this.f2933a.f2964e = this.f2943k ? 1 : -1;
        this.f2933a.f2965f = -1;
        this.f2933a.f2961b = i2;
        this.f2933a.f2966g = Integer.MIN_VALUE;
    }

    /* renamed from: i */
    private int m4509i(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        mo4104i();
        C1047at atVar = this.f2942j;
        View a = m4490a(!this.f2937e, true);
        return C1060ba.m5792a(tVar, atVar, a, m4500b(!this.f2937e, true), this, this.f2937e, this.f2943k);
    }

    /* renamed from: i */
    private View m4510i(C0949p pVar, C0955t tVar) {
        return mo4046a(pVar, tVar, mo4465w() - 1, -1, tVar.mo4561e());
    }

    /* renamed from: j */
    private int m4511j(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        mo4104i();
        C1047at atVar = this.f2942j;
        View a = m4490a(!this.f2937e, true);
        return C1060ba.m5791a(tVar, atVar, a, m4500b(!this.f2937e, true), this, this.f2937e);
    }

    /* renamed from: j */
    private View m4512j(C0949p pVar, C0955t tVar) {
        return this.f2943k ? m4515l(pVar, tVar) : m4516m(pVar, tVar);
    }

    /* renamed from: k */
    private int m4513k(C0955t tVar) {
        if (mo4465w() == 0) {
            return 0;
        }
        mo4104i();
        C1047at atVar = this.f2942j;
        View a = m4490a(!this.f2937e, true);
        return C1060ba.m5793b(tVar, atVar, a, m4500b(!this.f2937e, true), this, this.f2937e);
    }

    /* renamed from: k */
    private View m4514k(C0949p pVar, C0955t tVar) {
        return this.f2943k ? m4516m(pVar, tVar) : m4515l(pVar, tVar);
    }

    /* renamed from: l */
    private View m4515l(C0949p pVar, C0955t tVar) {
        return mo4089c(0, mo4465w());
    }

    /* renamed from: m */
    private View m4516m(C0949p pVar, C0955t tVar) {
        return mo4089c(mo4465w() - 1, -1);
    }

    /* renamed from: a */
    public int mo4041a(int i, C0949p pVar, C0955t tVar) {
        if (this.f2941i == 1) {
            return 0;
        }
        return mo4086c(i, pVar, tVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4074a(C0949p pVar, C0918c cVar, C0955t tVar, boolean z) {
        int i = cVar.f2962c;
        if (cVar.f2966g != Integer.MIN_VALUE) {
            if (cVar.f2962c < 0) {
                cVar.f2966g += cVar.f2962c;
            }
            m4496a(pVar, cVar);
        }
        int i2 = cVar.f2962c + cVar.f2967h;
        C0917b bVar = this.f2939g;
        while (true) {
            if ((!cVar.f2971l && i2 <= 0) || !cVar.mo4129a(tVar)) {
                break;
            }
            bVar.mo4125a();
            mo4051a(pVar, tVar, cVar, bVar);
            if (!bVar.f2957b) {
                cVar.f2961b += bVar.f2956a * cVar.f2965f;
                if (!bVar.f2958c || this.f2933a.f2970k != null || !tVar.mo4557a()) {
                    cVar.f2962c -= bVar.f2956a;
                    i2 -= bVar.f2956a;
                }
                if (cVar.f2966g != Integer.MIN_VALUE) {
                    cVar.f2966g += bVar.f2956a;
                    if (cVar.f2962c < 0) {
                        cVar.f2966g += cVar.f2962c;
                    }
                    m4496a(pVar, cVar);
                }
                if (z && bVar.f2959d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2962c;
    }

    /* renamed from: a */
    public C0942j mo4043a() {
        return new C0942j(-2, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4075a(int i, int i2, boolean z, boolean z2) {
        mo4104i();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2941i == 0 ? this.f3084r : this.f3085s).mo5387a(i, i2, i4, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4046a(C0949p pVar, C0955t tVar, int i, int i2, int i3) {
        mo4104i();
        int c = this.f2942j.mo5184c();
        int d = this.f2942j.mo5186d();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View i5 = mo4448i(i);
            int d2 = mo4431d(i5);
            if (d2 >= 0 && d2 < i3) {
                if (((C0942j) i5.getLayoutParams()).mo4476d()) {
                    if (view2 == null) {
                        view2 = i5;
                    }
                } else if (this.f2942j.mo5179a(i5) < d && this.f2942j.mo5183b(i5) >= c) {
                    return i5;
                } else {
                    if (view == null) {
                        view = i5;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    public View mo4047a(View view, int i, C0949p pVar, C0955t tVar) {
        m4486M();
        if (mo4465w() == 0) {
            return null;
        }
        int f = mo4097f(i);
        if (f == Integer.MIN_VALUE) {
            return null;
        }
        mo4104i();
        mo4104i();
        m4492a(f, (int) (((float) this.f2942j.mo5190f()) * 0.33333334f), false, tVar);
        this.f2933a.f2966g = Integer.MIN_VALUE;
        this.f2933a.f2960a = false;
        mo4074a(pVar, this.f2933a, tVar, true);
        View k = f == -1 ? m4514k(pVar, tVar) : m4512j(pVar, tVar);
        View N = f == -1 ? m4487N() : m4488O();
        if (!N.hasFocusable()) {
            return k;
        }
        if (k == null) {
            return null;
        }
        return N;
    }

    /* renamed from: a */
    public void mo4076a(int i, int i2, C0955t tVar, C0940a aVar) {
        if (this.f2941i != 0) {
            i = i2;
        }
        if (mo4465w() != 0 && i != 0) {
            mo4104i();
            m4492a(i > 0 ? 1 : -1, Math.abs(i), true, tVar);
            mo4054a(tVar, this.f2933a, aVar);
        }
    }

    /* renamed from: a */
    public void mo4077a(int i, C0940a aVar) {
        int i2;
        boolean z;
        int i3 = -1;
        if (this.f2946n == null || !this.f2946n.mo4111a()) {
            m4486M();
            z = this.f2943k;
            i2 = this.f2944l == -1 ? z ? i - 1 : 0 : this.f2944l;
        } else {
            z = this.f2946n.f2950c;
            i2 = this.f2946n.f2948a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2940h && i2 >= 0 && i2 < i; i4++) {
            aVar.mo4474b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo4078a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f2946n = (SavedState) parcelable;
            mo4458p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4050a(C0949p pVar, C0955t tVar, C0916a aVar, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4051a(C0949p pVar, C0955t tVar, C0918c cVar, C0917b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo4126a(pVar);
        if (a == null) {
            bVar.f2957b = true;
            return;
        }
        C0942j jVar = (C0942j) a.getLayoutParams();
        if (cVar.f2970k == null) {
            if (this.f2943k == (cVar.f2965f == -1)) {
                mo4420b(a);
            } else {
                mo4421b(a, 0);
            }
        } else {
            if (this.f2943k == (cVar.f2965f == -1)) {
                mo4396a(a);
            } else {
                mo4397a(a, 0);
            }
        }
        mo4398a(a, 0, 0);
        bVar.f2956a = this.f2942j.mo5189e(a);
        if (this.f2941i == 1) {
            if (mo4103h()) {
                i5 = mo4468z() - mo4379D();
                i4 = i5 - this.f2942j.mo5191f(a);
            } else {
                i4 = mo4377B();
                i5 = this.f2942j.mo5191f(a) + i4;
            }
            if (cVar.f2965f == -1) {
                i3 = cVar.f2961b - bVar.f2956a;
                i2 = i5;
                i = cVar.f2961b;
            } else {
                i = cVar.f2961b + bVar.f2956a;
                i2 = i5;
                i3 = cVar.f2961b;
            }
        } else {
            int C = mo4378C();
            int f = this.f2942j.mo5191f(a) + C;
            if (cVar.f2965f == -1) {
                i3 = C;
                i2 = cVar.f2961b;
                i = f;
                i4 = cVar.f2961b - bVar.f2956a;
            } else {
                i2 = cVar.f2961b + bVar.f2956a;
                i3 = C;
                i = f;
                i4 = cVar.f2961b;
            }
        }
        mo4399a(a, i4, i3, i2, i);
        if (jVar.mo4476d() || jVar.mo4477e()) {
            bVar.f2958c = true;
        }
        bVar.f2959d = a.hasFocusable();
    }

    /* renamed from: a */
    public void mo4053a(C0955t tVar) {
        super.mo4053a(tVar);
        this.f2946n = null;
        this.f2944l = -1;
        this.f2945m = Integer.MIN_VALUE;
        this.f2947o.mo4119a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4054a(C0955t tVar, C0918c cVar, C0940a aVar) {
        int i = cVar.f2963d;
        if (i >= 0 && i < tVar.mo4561e()) {
            aVar.mo4474b(i, Math.max(0, cVar.f2966g));
        }
    }

    /* renamed from: a */
    public void mo4079a(RecyclerView recyclerView, C0949p pVar) {
        super.mo4079a(recyclerView, pVar);
        if (this.f2938f) {
            mo4424c(pVar);
            pVar.mo4501a();
        }
    }

    /* renamed from: a */
    public void mo4080a(AccessibilityEvent accessibilityEvent) {
        super.mo4080a(accessibilityEvent);
        if (mo4465w() > 0) {
            accessibilityEvent.setFromIndex(mo4108m());
            accessibilityEvent.setToIndex(mo4110o());
        }
    }

    /* renamed from: a */
    public void mo4081a(String str) {
        if (this.f2946n == null) {
            super.mo4081a(str);
        }
    }

    /* renamed from: a */
    public void mo4059a(boolean z) {
        mo4081a((String) null);
        if (this.f2936d != z) {
            this.f2936d = z;
            mo4458p();
        }
    }

    /* renamed from: b */
    public int mo4061b(int i, C0949p pVar, C0955t tVar) {
        if (this.f2941i == 0) {
            return 0;
        }
        return mo4086c(i, pVar, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4082b(C0955t tVar) {
        if (tVar.mo4560d()) {
            return this.f2942j.mo5190f();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo4083b(int i) {
        if (i == 0 || i == 1) {
            mo4081a((String) null);
            if (i != this.f2941i || this.f2942j == null) {
                this.f2942j = C1047at.m5689a(this, i);
                this.f2947o.f2951a = this.f2942j;
                this.f2941i = i;
                mo4458p();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo4084b(int i, int i2) {
        this.f2944l = i;
        this.f2945m = i2;
        if (this.f2946n != null) {
            this.f2946n.mo4112b();
        }
        mo4458p();
    }

    /* renamed from: b */
    public void mo4085b(boolean z) {
        mo4081a((String) null);
        if (z != this.f2935c) {
            this.f2935c = z;
            mo4458p();
        }
    }

    /* renamed from: b */
    public boolean mo4064b() {
        return this.f2946n == null && this.f2934b == this.f2936d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo4086c(int i, C0949p pVar, C0955t tVar) {
        if (mo4465w() == 0 || i == 0) {
            return 0;
        }
        this.f2933a.f2960a = true;
        mo4104i();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4492a(i2, abs, true, tVar);
        int a = this.f2933a.f2966g + mo4074a(pVar, this.f2933a, tVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2942j.mo5181a(-i);
        this.f2933a.f2969j = i;
        return i;
    }

    /* renamed from: c */
    public int mo4087c(C0955t tVar) {
        return m4509i(tVar);
    }

    /* renamed from: c */
    public View mo4088c(int i) {
        int w = mo4465w();
        if (w == 0) {
            return null;
        }
        int d = i - mo4431d(mo4448i(0));
        if (d >= 0 && d < w) {
            View i2 = mo4448i(d);
            if (mo4431d(i2) == i) {
                return i2;
            }
        }
        return super.mo4088c(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo4089c(int i, int i2) {
        int i3;
        int i4;
        mo4104i();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo4448i(i);
        }
        if (this.f2942j.mo5179a(mo4448i(i)) < this.f2942j.mo5184c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2941i == 0 ? this.f3084r : this.f3085s).mo5387a(i, i2, i4, i3);
    }

    /* renamed from: c */
    public void mo4065c(C0949p pVar, C0955t tVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int a;
        int a2;
        int i6;
        int i7 = -1;
        if (!(this.f2946n == null && this.f2944l == -1) && tVar.mo4561e() == 0) {
            mo4424c(pVar);
            return;
        }
        if (this.f2946n != null && this.f2946n.mo4111a()) {
            this.f2944l = this.f2946n.f2948a;
        }
        mo4104i();
        this.f2933a.f2960a = false;
        m4486M();
        View F = mo4381F();
        if (!this.f2947o.f2955e || this.f2944l != -1 || this.f2946n != null) {
            this.f2947o.mo4119a();
            this.f2947o.f2954d = this.f2943k ^ this.f2936d;
            m4497a(pVar, tVar, this.f2947o);
            this.f2947o.f2955e = true;
        } else if (F != null && (this.f2942j.mo5179a(F) >= this.f2942j.mo5186d() || this.f2942j.mo5183b(F) <= this.f2942j.mo5184c())) {
            this.f2947o.mo4120a(F, mo4431d(F));
        }
        int b = mo4082b(tVar);
        if (this.f2933a.f2969j >= 0) {
            i = b;
            b = 0;
        } else {
            i = 0;
        }
        int c = b + this.f2942j.mo5184c();
        int g = i + this.f2942j.mo5192g();
        if (!(!tVar.mo4557a() || this.f2944l == -1 || this.f2945m == Integer.MIN_VALUE)) {
            View c2 = mo4088c(this.f2944l);
            if (c2 != null) {
                if (this.f2943k) {
                    i6 = this.f2942j.mo5186d() - this.f2942j.mo5183b(c2);
                    a2 = this.f2945m;
                } else {
                    a2 = this.f2942j.mo5179a(c2) - this.f2942j.mo5184c();
                    i6 = this.f2945m;
                }
                int i8 = i6 - a2;
                if (i8 > 0) {
                    c += i8;
                } else {
                    g -= i8;
                }
            }
        }
        if (!this.f2947o.f2954d ? !this.f2943k : this.f2943k) {
            i7 = 1;
        }
        mo4050a(pVar, tVar, this.f2947o, i7);
        mo4391a(pVar);
        this.f2933a.f2971l = mo4106k();
        this.f2933a.f2968i = tVar.mo4557a();
        if (this.f2947o.f2954d) {
            m4501b(this.f2947o);
            this.f2933a.f2967h = c;
            mo4074a(pVar, this.f2933a, tVar, false);
            i3 = this.f2933a.f2961b;
            int i9 = this.f2933a.f2963d;
            if (this.f2933a.f2962c > 0) {
                g += this.f2933a.f2962c;
            }
            m4493a(this.f2947o);
            this.f2933a.f2967h = g;
            this.f2933a.f2963d += this.f2933a.f2964e;
            mo4074a(pVar, this.f2933a, tVar, false);
            i2 = this.f2933a.f2961b;
            if (this.f2933a.f2962c > 0) {
                int i10 = this.f2933a.f2962c;
                m4508h(i9, i3);
                this.f2933a.f2967h = i10;
                mo4074a(pVar, this.f2933a, tVar, false);
                i3 = this.f2933a.f2961b;
            }
        } else {
            m4493a(this.f2947o);
            this.f2933a.f2967h = g;
            mo4074a(pVar, this.f2933a, tVar, false);
            i2 = this.f2933a.f2961b;
            int i11 = this.f2933a.f2963d;
            if (this.f2933a.f2962c > 0) {
                c += this.f2933a.f2962c;
            }
            m4501b(this.f2947o);
            this.f2933a.f2967h = c;
            this.f2933a.f2963d += this.f2933a.f2964e;
            mo4074a(pVar, this.f2933a, tVar, false);
            i3 = this.f2933a.f2961b;
            if (this.f2933a.f2962c > 0) {
                int i12 = this.f2933a.f2962c;
                mo4040a(i11, i2);
                this.f2933a.f2967h = i12;
                mo4074a(pVar, this.f2933a, tVar, false);
                i2 = this.f2933a.f2961b;
            }
        }
        if (mo4465w() > 0) {
            if (this.f2943k ^ this.f2936d) {
                int a3 = m4489a(i2, pVar, tVar, true);
                i4 = i3 + a3;
                i5 = i2 + a3;
                a = m4499b(i4, pVar, tVar, false);
            } else {
                int b2 = m4499b(i3, pVar, tVar, true);
                i4 = i3 + b2;
                i5 = i2 + b2;
                a = m4489a(i5, pVar, tVar, false);
            }
            i3 = i4 + a;
            i2 = i5 + a;
        }
        m4503b(pVar, tVar, i3, i2);
        if (!tVar.mo4557a()) {
            this.f2942j.mo5180a();
        } else {
            this.f2947o.mo4119a();
        }
        this.f2934b = this.f2936d;
    }

    /* renamed from: c */
    public boolean mo4090c() {
        return true;
    }

    /* renamed from: d */
    public int mo4091d(C0955t tVar) {
        return m4509i(tVar);
    }

    /* renamed from: d */
    public PointF mo4092d(int i) {
        if (mo4465w() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4431d(mo4448i(0))) {
            z = true;
        }
        if (z != this.f2943k) {
            i2 = -1;
        }
        return this.f2941i == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: d */
    public Parcelable mo4093d() {
        if (this.f2946n != null) {
            return new SavedState(this.f2946n);
        }
        SavedState savedState = new SavedState();
        if (mo4465w() > 0) {
            mo4104i();
            boolean z = this.f2934b ^ this.f2943k;
            savedState.f2950c = z;
            if (z) {
                View O = m4488O();
                savedState.f2949b = this.f2942j.mo5186d() - this.f2942j.mo5183b(O);
                savedState.f2948a = mo4431d(O);
            } else {
                View N = m4487N();
                savedState.f2948a = mo4431d(N);
                savedState.f2949b = this.f2942j.mo5179a(N) - this.f2942j.mo5184c();
            }
        } else {
            savedState.mo4112b();
        }
        return savedState;
    }

    /* renamed from: e */
    public int mo4094e(C0955t tVar) {
        return m4511j(tVar);
    }

    /* renamed from: e */
    public void mo4095e(int i) {
        this.f2944l = i;
        this.f2945m = Integer.MIN_VALUE;
        if (this.f2946n != null) {
            this.f2946n.mo4112b();
        }
        mo4458p();
    }

    /* renamed from: e */
    public boolean mo4096e() {
        return this.f2941i == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo4097f(int i) {
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        if (i == 17) {
            if (this.f2941i != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2941i != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2941i == 0) {
                i3 = 1;
            }
            return i3;
        } else if (i != 130) {
            switch (i) {
                case 1:
                    return (this.f2941i != 1 && mo4103h()) ? 1 : -1;
                case 2:
                    return (this.f2941i != 1 && mo4103h()) ? -1 : 1;
                default:
                    return Integer.MIN_VALUE;
            }
        } else {
            if (this.f2941i == 1) {
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: f */
    public int mo4098f(C0955t tVar) {
        return m4511j(tVar);
    }

    /* renamed from: f */
    public boolean mo4099f() {
        return this.f2941i == 1;
    }

    /* renamed from: g */
    public int mo4100g() {
        return this.f2941i;
    }

    /* renamed from: g */
    public int mo4101g(C0955t tVar) {
        return m4513k(tVar);
    }

    /* renamed from: h */
    public int mo4102h(C0955t tVar) {
        return m4513k(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo4103h() {
        return mo4463u() == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4104i() {
        if (this.f2933a == null) {
            this.f2933a = mo4105j();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C0918c mo4105j() {
        return new C0918c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo4106k() {
        return this.f2942j.mo5193h() == 0 && this.f2942j.mo5188e() == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo4107l() {
        return (mo4467y() == 1073741824 || mo4466x() == 1073741824 || !mo4387L()) ? false : true;
    }

    /* renamed from: m */
    public int mo4108m() {
        View a = mo4075a(0, mo4465w(), false, true);
        if (a == null) {
            return -1;
        }
        return mo4431d(a);
    }

    /* renamed from: n */
    public int mo4109n() {
        View a = mo4075a(0, mo4465w(), true, false);
        if (a == null) {
            return -1;
        }
        return mo4431d(a);
    }

    /* renamed from: o */
    public int mo4110o() {
        View a = mo4075a(mo4465w() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo4431d(a);
    }
}
