package com.seattleclouds.util;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: com.seattleclouds.util.p */
public class C6633p extends SimpleOnGestureListener {

    /* renamed from: a */
    private int f23360a = 100;

    /* renamed from: b */
    private int f23361b = 350;

    /* renamed from: c */
    private int f23362c = 100;

    /* renamed from: d */
    private int f23363d = 2;

    /* renamed from: e */
    private boolean f23364e = true;

    /* renamed from: f */
    private boolean f23365f = false;

    /* renamed from: g */
    private Activity f23366g;

    /* renamed from: h */
    private GestureDetector f23367h;

    /* renamed from: i */
    private C6634a f23368i;

    /* renamed from: com.seattleclouds.util.p$a */
    public interface C6634a {
        /* renamed from: c */
        void mo1453c();

        /* renamed from: i */
        void mo18087i(int i);
    }

    public C6633p(Activity activity, C6634a aVar) {
        this.f23366g = activity;
        this.f23367h = new GestureDetector(activity, this);
        this.f23368i = aVar;
    }

    /* renamed from: a */
    public void mo20615a(int i) {
        this.f23363d = i;
    }

    /* renamed from: a */
    public boolean mo20616a(MotionEvent motionEvent) {
        if (!this.f23364e) {
            return false;
        }
        boolean onTouchEvent = this.f23367h.onTouchEvent(motionEvent);
        if (this.f23363d != 1) {
            if (this.f23363d == 2) {
                if (motionEvent.getAction() == -13) {
                    motionEvent.setAction(1);
                } else if (!onTouchEvent) {
                    if (this.f23365f) {
                        motionEvent.setAction(0);
                        this.f23365f = false;
                    }
                }
            }
            return onTouchEvent;
        }
        motionEvent.setAction(3);
        return onTouchEvent;
    }

    /* renamed from: b */
    public void mo20617b(int i) {
        this.f23361b = i;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f23368i.mo1453c();
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6634a aVar;
        int i;
        float abs = Math.abs(motionEvent.getX() - motionEvent2.getX());
        float abs2 = Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs > ((float) this.f23361b) || abs2 > ((float) this.f23361b)) {
            return false;
        }
        float abs3 = Math.abs(f);
        float abs4 = Math.abs(f2);
        boolean z = true;
        if (abs3 <= ((float) this.f23362c) || abs <= ((float) this.f23360a)) {
            if (abs4 <= ((float) this.f23362c) || abs2 <= ((float) this.f23360a)) {
                z = false;
                return z;
            } else if (motionEvent.getY() > motionEvent2.getY()) {
                this.f23368i.mo18087i(1);
                return z;
            } else {
                aVar = this.f23368i;
                i = 2;
            }
        } else if (motionEvent.getX() > motionEvent2.getX()) {
            aVar = this.f23368i;
            i = 3;
        } else {
            aVar = this.f23368i;
            i = 4;
        }
        aVar.mo18087i(i);
        return z;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.f23363d == 2) {
            motionEvent.setAction(-13);
            this.f23366g.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f23365f = true;
        return false;
    }
}
