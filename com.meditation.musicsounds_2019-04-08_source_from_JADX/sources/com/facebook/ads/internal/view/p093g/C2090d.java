package com.facebook.ads.internal.view.p093g;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.p093g.p094a.C2002c;
import com.facebook.ads.internal.view.p093g.p096c.C2066e;
import com.facebook.ads.internal.view.p093g.p097d.C2100c;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.g.d */
public class C2090d extends RelativeLayout {

    /* renamed from: a */
    private final C2100c f6822a;

    /* renamed from: b */
    private C2066e f6823b;

    /* renamed from: c */
    private WeakReference<C2091a> f6824c;

    /* renamed from: com.facebook.ads.internal.view.g.d$a */
    public interface C2091a {
        /* renamed from: a */
        void mo7555a();
    }

    public C2090d(Context context, C2100c cVar) {
        super(context);
        this.f6822a = cVar;
        C1808r.m8940b((View) this.f6822a);
        addView(this.f6822a.getView(), new LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo7550a(C2002c cVar) {
        addView(cVar, new LayoutParams(-1, -1));
        this.f6823b = (C2066e) cVar;
    }

    /* renamed from: b */
    public void mo7551b(C2002c cVar) {
        C1808r.m8940b(cVar);
        this.f6823b = null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.f6822a).layout(0, 0, getWidth(), getHeight());
        if (this.f6823b != null) {
            this.f6823b.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r3 > r9) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            com.facebook.ads.internal.view.g.d.c r0 = r7.f6822a
            int r0 = r0.getVideoWidth()
            com.facebook.ads.internal.view.g.d.c r1 = r7.f6822a
            int r1 = r1.getVideoHeight()
            int r2 = getDefaultSize(r0, r8)
            int r3 = getDefaultSize(r1, r9)
            if (r0 <= 0) goto L_0x006d
            if (r1 <= 0) goto L_0x006d
            r2 = 1
            int r3 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r4 = android.view.View.MeasureSpec.getMode(r9)
            int r9 = android.view.View.MeasureSpec.getSize(r9)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 != r5) goto L_0x003d
            if (r4 != r5) goto L_0x003d
            int r3 = r0 * r9
            int r4 = r8 * r1
            if (r3 >= r4) goto L_0x0038
            int r8 = r3 / r1
            goto L_0x0071
        L_0x0038:
            if (r3 <= r4) goto L_0x0071
            int r3 = r4 / r0
            goto L_0x004a
        L_0x003d:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r5) goto L_0x004c
            int r1 = r1 * r8
            int r3 = r1 / r0
            if (r4 != r6) goto L_0x004a
            if (r3 <= r9) goto L_0x004a
            goto L_0x0071
        L_0x004a:
            r9 = r3
            goto L_0x0071
        L_0x004c:
            if (r4 != r5) goto L_0x0058
            int r0 = r0 * r9
            int r0 = r0 / r1
            if (r3 != r6) goto L_0x0056
            if (r0 <= r8) goto L_0x0056
            goto L_0x0071
        L_0x0056:
            r8 = r0
            goto L_0x0071
        L_0x0058:
            if (r4 != r6) goto L_0x0060
            if (r1 <= r9) goto L_0x0060
            int r4 = r9 * r0
            int r4 = r4 / r1
            goto L_0x0062
        L_0x0060:
            r4 = r0
            r9 = r1
        L_0x0062:
            if (r3 != r6) goto L_0x006b
            if (r4 <= r8) goto L_0x006b
            int r1 = r1 * r8
            int r3 = r1 / r0
            goto L_0x004a
        L_0x006b:
            r8 = r4
            goto L_0x0071
        L_0x006d:
            r8 = 0
            r8 = r2
            r9 = r3
            r2 = 0
        L_0x0071:
            r7.setMeasuredDimension(r8, r9)
            if (r2 == 0) goto L_0x008d
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.g.d$a> r8 = r7.f6824c
            if (r8 == 0) goto L_0x008d
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.g.d$a> r8 = r7.f6824c
            java.lang.Object r8 = r8.get()
            if (r8 == 0) goto L_0x008d
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.g.d$a> r8 = r7.f6824c
            java.lang.Object r8 = r8.get()
            com.facebook.ads.internal.view.g.d$a r8 = (com.facebook.ads.internal.view.p093g.C2090d.C2091a) r8
            r8.mo7555a()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.p093g.C2090d.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(C2091a aVar) {
        this.f6824c = new WeakReference<>(aVar);
    }
}
