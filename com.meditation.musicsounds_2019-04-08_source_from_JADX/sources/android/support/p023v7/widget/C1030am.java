package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.view.View;

/* renamed from: android.support.v7.widget.am */
class C1030am {

    /* renamed from: a */
    boolean f3549a = true;

    /* renamed from: b */
    int f3550b;

    /* renamed from: c */
    int f3551c;

    /* renamed from: d */
    int f3552d;

    /* renamed from: e */
    int f3553e;

    /* renamed from: f */
    int f3554f = 0;

    /* renamed from: g */
    int f3555g = 0;

    /* renamed from: h */
    boolean f3556h;

    /* renamed from: i */
    boolean f3557i;

    C1030am() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5080a(C0949p pVar) {
        View c = pVar.mo4517c(this.f3551c);
        this.f3551c += this.f3552d;
        return c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5081a(C0955t tVar) {
        return this.f3551c >= 0 && this.f3551c < tVar.mo4561e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.f3550b);
        sb.append(", mCurrentPosition=");
        sb.append(this.f3551c);
        sb.append(", mItemDirection=");
        sb.append(this.f3552d);
        sb.append(", mLayoutDirection=");
        sb.append(this.f3553e);
        sb.append(", mStartLine=");
        sb.append(this.f3554f);
        sb.append(", mEndLine=");
        sb.append(this.f3555g);
        sb.append('}');
        return sb.toString();
    }
}
