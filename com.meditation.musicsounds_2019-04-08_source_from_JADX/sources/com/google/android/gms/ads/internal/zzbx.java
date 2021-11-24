package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3674kb;
import com.google.android.gms.internal.ads.C3718ls;
import com.google.android.gms.internal.ads.C3832py;
import java.util.ArrayList;

public final class zzbx extends ViewSwitcher {

    /* renamed from: a */
    private final C3674kb f10280a;

    /* renamed from: b */
    private final C3718ls f10281b;

    /* renamed from: c */
    private boolean f10282c = true;

    public zzbx(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.f10280a = new C3674kb(context);
        this.f10280a.mo13178a(str);
        this.f10280a.mo13181b(str2);
        if (context instanceof Activity) {
            this.f10281b = new C3718ls((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.f10281b = new C3718ls(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.f10281b.mo13228a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10281b != null) {
            this.f10281b.mo13231c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10281b != null) {
            this.f10281b.mo13232d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f10282c) {
            this.f10280a.mo13177a(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && (childAt instanceof C3832py)) {
                arrayList.add((C3832py) childAt);
            }
        }
        super.removeAllViews();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((C3832py) obj).destroy();
        }
    }

    public final C3674kb zzfr() {
        return this.f10280a;
    }

    public final void zzfs() {
        C3643iy.m18780a("Disable position monitoring on adFrame.");
        if (this.f10281b != null) {
            this.f10281b.mo13230b();
        }
    }

    public final void zzft() {
        C3643iy.m18780a("Enable debug gesture detector on adFrame.");
        this.f10282c = true;
    }

    public final void zzfu() {
        C3643iy.m18780a("Disable debug gesture detector on adFrame.");
        this.f10282c = false;
    }
}
