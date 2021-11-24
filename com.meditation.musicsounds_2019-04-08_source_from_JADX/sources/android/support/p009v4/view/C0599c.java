package android.support.p009v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.c */
public final class C0599c {

    /* renamed from: a */
    private final C0600a f1746a;

    /* renamed from: android.support.v4.view.c$a */
    interface C0600a {
        /* renamed from: a */
        void mo2439a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        boolean mo2440a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.c$b */
    static class C0601b implements C0600a {

        /* renamed from: j */
        private static final int f1747j = ViewConfiguration.getLongPressTimeout();

        /* renamed from: k */
        private static final int f1748k = ViewConfiguration.getTapTimeout();

        /* renamed from: l */
        private static final int f1749l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: a */
        final OnGestureListener f1750a;

        /* renamed from: b */
        OnDoubleTapListener f1751b;

        /* renamed from: c */
        boolean f1752c;

        /* renamed from: d */
        boolean f1753d;

        /* renamed from: e */
        MotionEvent f1754e;

        /* renamed from: f */
        private int f1755f;

        /* renamed from: g */
        private int f1756g;

        /* renamed from: h */
        private int f1757h;

        /* renamed from: i */
        private int f1758i;

        /* renamed from: m */
        private final Handler f1759m;

        /* renamed from: n */
        private boolean f1760n;

        /* renamed from: o */
        private boolean f1761o;

        /* renamed from: p */
        private boolean f1762p;

        /* renamed from: q */
        private MotionEvent f1763q;

        /* renamed from: r */
        private boolean f1764r;

        /* renamed from: s */
        private float f1765s;

        /* renamed from: t */
        private float f1766t;

        /* renamed from: u */
        private float f1767u;

        /* renamed from: v */
        private float f1768v;

        /* renamed from: w */
        private boolean f1769w;

        /* renamed from: x */
        private VelocityTracker f1770x;

        /* renamed from: android.support.v4.view.c$b$a */
        private class C0602a extends Handler {
            C0602a() {
            }

            C0602a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C0601b.this.f1750a.onShowPress(C0601b.this.f1754e);
                        return;
                    case 2:
                        C0601b.this.mo2441a();
                        return;
                    case 3:
                        if (C0601b.this.f1751b == null) {
                            return;
                        }
                        if (!C0601b.this.f1752c) {
                            C0601b.this.f1751b.onSingleTapConfirmed(C0601b.this.f1754e);
                            return;
                        } else {
                            C0601b.this.f1753d = true;
                            return;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown message ");
                        sb.append(message);
                        throw new RuntimeException(sb.toString());
                }
            }
        }

        C0601b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f1759m = new C0602a(handler);
            } else {
                this.f1759m = new C0602a();
            }
            this.f1750a = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo2439a((OnDoubleTapListener) onGestureListener);
            }
            m2732a(context);
        }

        /* renamed from: a */
        private void m2732a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f1750a != null) {
                this.f1769w = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f1757h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f1758i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f1755f = scaledTouchSlop * scaledTouchSlop;
                this.f1756g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: a */
        private boolean m2733a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f1762p || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f1749l)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f1756g) {
                z = true;
            }
            return z;
        }

        /* renamed from: b */
        private void m2734b() {
            this.f1759m.removeMessages(1);
            this.f1759m.removeMessages(2);
            this.f1759m.removeMessages(3);
            this.f1770x.recycle();
            this.f1770x = null;
            this.f1764r = false;
            this.f1752c = false;
            this.f1761o = false;
            this.f1762p = false;
            this.f1753d = false;
            if (this.f1760n) {
                this.f1760n = false;
            }
        }

        /* renamed from: c */
        private void m2735c() {
            this.f1759m.removeMessages(1);
            this.f1759m.removeMessages(2);
            this.f1759m.removeMessages(3);
            this.f1764r = false;
            this.f1761o = false;
            this.f1762p = false;
            this.f1753d = false;
            if (this.f1760n) {
                this.f1760n = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2441a() {
            this.f1759m.removeMessages(3);
            this.f1753d = false;
            this.f1760n = true;
            this.f1750a.onLongPress(this.f1754e);
        }

        /* renamed from: a */
        public void mo2439a(OnDoubleTapListener onDoubleTapListener) {
            this.f1751b = onDoubleTapListener;
        }

        /* JADX WARNING: Removed duplicated region for block: B:93:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0221  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2440a(android.view.MotionEvent r12) {
            /*
                r11 = this;
                int r0 = r12.getAction()
                android.view.VelocityTracker r1 = r11.f1770x
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r11.f1770x = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r11.f1770x
                r1.addMovement(r12)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r1 = 1
                goto L_0x001d
            L_0x001c:
                r1 = 0
            L_0x001d:
                if (r1 == 0) goto L_0x0024
                int r4 = r12.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r4 = -1
            L_0x0025:
                int r5 = r12.getPointerCount()
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
            L_0x002d:
                if (r7 >= r5) goto L_0x003f
                if (r4 != r7) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r10 = r12.getX(r7)
                float r8 = r8 + r10
                float r10 = r12.getY(r7)
                float r9 = r9 + r10
            L_0x003c:
                int r7 = r7 + 1
                goto L_0x002d
            L_0x003f:
                if (r1 == 0) goto L_0x0044
                int r1 = r5 + -1
                goto L_0x0045
            L_0x0044:
                r1 = r5
            L_0x0045:
                float r1 = (float) r1
                float r8 = r8 / r1
                float r9 = r9 / r1
                r1 = 1000(0x3e8, float:1.401E-42)
                r4 = 2
                r7 = 3
                switch(r0) {
                    case 0: goto L_0x01bb;
                    case 1: goto L_0x0127;
                    case 2: goto L_0x00b0;
                    case 3: goto L_0x00ab;
                    case 4: goto L_0x004f;
                    case 5: goto L_0x009e;
                    case 6: goto L_0x0051;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x0250
            L_0x0051:
                r11.f1765s = r8
                r11.f1767u = r8
                r11.f1766t = r9
                r11.f1768v = r9
                android.view.VelocityTracker r0 = r11.f1770x
                int r2 = r11.f1758i
                float r2 = (float) r2
                r0.computeCurrentVelocity(r1, r2)
                int r0 = r12.getActionIndex()
                int r1 = r12.getPointerId(r0)
                android.view.VelocityTracker r2 = r11.f1770x
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r11.f1770x
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0076:
                if (r4 >= r5) goto L_0x0250
                if (r4 != r0) goto L_0x007b
                goto L_0x009b
            L_0x007b:
                int r7 = r12.getPointerId(r4)
                android.view.VelocityTracker r8 = r11.f1770x
                float r8 = r8.getXVelocity(r7)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r11.f1770x
                float r7 = r9.getYVelocity(r7)
                float r7 = r7 * r1
                float r8 = r8 + r7
                int r7 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x009b
                android.view.VelocityTracker r12 = r11.f1770x
                r12.clear()
                goto L_0x0250
            L_0x009b:
                int r4 = r4 + 1
                goto L_0x0076
            L_0x009e:
                r11.f1765s = r8
                r11.f1767u = r8
                r11.f1766t = r9
                r11.f1768v = r9
                r11.m2735c()
                goto L_0x0250
            L_0x00ab:
                r11.m2734b()
                goto L_0x0250
            L_0x00b0:
                boolean r0 = r11.f1760n
                if (r0 == 0) goto L_0x00b6
                goto L_0x0250
            L_0x00b6:
                float r0 = r11.f1765s
                float r0 = r0 - r8
                float r1 = r11.f1766t
                float r1 = r1 - r9
                boolean r5 = r11.f1764r
                if (r5 == 0) goto L_0x00c9
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f1751b
                boolean r12 = r0.onDoubleTapEvent(r12)
                r3 = r3 | r12
                goto L_0x0250
            L_0x00c9:
                boolean r5 = r11.f1761o
                if (r5 == 0) goto L_0x0107
                float r5 = r11.f1767u
                float r5 = r8 - r5
                int r5 = (int) r5
                float r6 = r11.f1768v
                float r6 = r9 - r6
                int r6 = (int) r6
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                int r6 = r11.f1755f
                if (r5 <= r6) goto L_0x00fe
                android.view.GestureDetector$OnGestureListener r6 = r11.f1750a
                android.view.MotionEvent r10 = r11.f1754e
                boolean r12 = r6.onScroll(r10, r12, r0, r1)
                r11.f1765s = r8
                r11.f1766t = r9
                r11.f1761o = r3
                android.os.Handler r0 = r11.f1759m
                r0.removeMessages(r7)
                android.os.Handler r0 = r11.f1759m
                r0.removeMessages(r2)
                android.os.Handler r0 = r11.f1759m
                r0.removeMessages(r4)
                goto L_0x00ff
            L_0x00fe:
                r12 = 0
            L_0x00ff:
                int r0 = r11.f1755f
                if (r5 <= r0) goto L_0x01b8
                r11.f1762p = r3
                goto L_0x01b8
            L_0x0107:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0119
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0250
            L_0x0119:
                android.view.GestureDetector$OnGestureListener r2 = r11.f1750a
                android.view.MotionEvent r3 = r11.f1754e
                boolean r3 = r2.onScroll(r3, r12, r0, r1)
                r11.f1765s = r8
                r11.f1766t = r9
                goto L_0x0250
            L_0x0127:
                r11.f1752c = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r12)
                boolean r5 = r11.f1764r
                if (r5 == 0) goto L_0x0139
                android.view.GestureDetector$OnDoubleTapListener r1 = r11.f1751b
                boolean r12 = r1.onDoubleTapEvent(r12)
                r12 = r12 | r3
                goto L_0x0193
            L_0x0139:
                boolean r5 = r11.f1760n
                if (r5 == 0) goto L_0x0145
                android.os.Handler r12 = r11.f1759m
                r12.removeMessages(r7)
                r11.f1760n = r3
                goto L_0x0189
            L_0x0145:
                boolean r5 = r11.f1761o
                if (r5 == 0) goto L_0x015e
                android.view.GestureDetector$OnGestureListener r1 = r11.f1750a
                boolean r1 = r1.onSingleTapUp(r12)
                boolean r5 = r11.f1753d
                if (r5 == 0) goto L_0x015c
                android.view.GestureDetector$OnDoubleTapListener r5 = r11.f1751b
                if (r5 == 0) goto L_0x015c
                android.view.GestureDetector$OnDoubleTapListener r5 = r11.f1751b
                r5.onSingleTapConfirmed(r12)
            L_0x015c:
                r12 = r1
                goto L_0x0193
            L_0x015e:
                android.view.VelocityTracker r5 = r11.f1770x
                int r6 = r12.getPointerId(r3)
                int r7 = r11.f1758i
                float r7 = (float) r7
                r5.computeCurrentVelocity(r1, r7)
                float r1 = r5.getYVelocity(r6)
                float r5 = r5.getXVelocity(r6)
                float r6 = java.lang.Math.abs(r1)
                int r7 = r11.f1757h
                float r7 = (float) r7
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 > 0) goto L_0x018b
                float r6 = java.lang.Math.abs(r5)
                int r7 = r11.f1757h
                float r7 = (float) r7
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0189
                goto L_0x018b
            L_0x0189:
                r12 = 0
                goto L_0x0193
            L_0x018b:
                android.view.GestureDetector$OnGestureListener r6 = r11.f1750a
                android.view.MotionEvent r7 = r11.f1754e
                boolean r12 = r6.onFling(r7, r12, r5, r1)
            L_0x0193:
                android.view.MotionEvent r1 = r11.f1763q
                if (r1 == 0) goto L_0x019c
                android.view.MotionEvent r1 = r11.f1763q
                r1.recycle()
            L_0x019c:
                r11.f1763q = r0
                android.view.VelocityTracker r0 = r11.f1770x
                if (r0 == 0) goto L_0x01aa
                android.view.VelocityTracker r0 = r11.f1770x
                r0.recycle()
                r0 = 0
                r11.f1770x = r0
            L_0x01aa:
                r11.f1764r = r3
                r11.f1753d = r3
                android.os.Handler r0 = r11.f1759m
                r0.removeMessages(r2)
                android.os.Handler r0 = r11.f1759m
                r0.removeMessages(r4)
            L_0x01b8:
                r3 = r12
                goto L_0x0250
            L_0x01bb:
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f1751b
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r11.f1759m
                boolean r0 = r0.hasMessages(r7)
                if (r0 == 0) goto L_0x01cc
                android.os.Handler r1 = r11.f1759m
                r1.removeMessages(r7)
            L_0x01cc:
                android.view.MotionEvent r1 = r11.f1754e
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r1 = r11.f1763q
                if (r1 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                android.view.MotionEvent r0 = r11.f1754e
                android.view.MotionEvent r1 = r11.f1763q
                boolean r0 = r11.m2733a(r0, r1, r12)
                if (r0 == 0) goto L_0x01f3
                r11.f1764r = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r11.f1751b
                android.view.MotionEvent r1 = r11.f1754e
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r11.f1751b
                boolean r1 = r1.onDoubleTapEvent(r12)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r11.f1759m
                int r1 = f1749l
                long r5 = (long) r1
                r0.sendEmptyMessageDelayed(r7, r5)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r11.f1765s = r8
                r11.f1767u = r8
                r11.f1766t = r9
                r11.f1768v = r9
                android.view.MotionEvent r1 = r11.f1754e
                if (r1 == 0) goto L_0x020d
                android.view.MotionEvent r1 = r11.f1754e
                r1.recycle()
            L_0x020d:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r12)
                r11.f1754e = r1
                r11.f1761o = r2
                r11.f1762p = r2
                r11.f1752c = r2
                r11.f1760n = r3
                r11.f1753d = r3
                boolean r1 = r11.f1769w
                if (r1 == 0) goto L_0x0239
                android.os.Handler r1 = r11.f1759m
                r1.removeMessages(r4)
                android.os.Handler r1 = r11.f1759m
                android.view.MotionEvent r3 = r11.f1754e
                long r5 = r3.getDownTime()
                int r3 = f1748k
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f1747j
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0239:
                android.os.Handler r1 = r11.f1759m
                android.view.MotionEvent r3 = r11.f1754e
                long r3 = r3.getDownTime()
                int r5 = f1748k
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r11.f1750a
                boolean r12 = r1.onDown(r12)
                r3 = r0 | r12
            L_0x0250:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.view.C0599c.C0601b.mo2440a(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: android.support.v4.view.c$c */
    static class C0603c implements C0600a {

        /* renamed from: a */
        private final GestureDetector f1772a;

        C0603c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f1772a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public void mo2439a(OnDoubleTapListener onDoubleTapListener) {
            this.f1772a.setOnDoubleTapListener(onDoubleTapListener);
        }

        /* renamed from: a */
        public boolean mo2440a(MotionEvent motionEvent) {
            return this.f1772a.onTouchEvent(motionEvent);
        }
    }

    public C0599c(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public C0599c(Context context, OnGestureListener onGestureListener, Handler handler) {
        this.f1746a = VERSION.SDK_INT > 17 ? new C0603c(context, onGestureListener, handler) : new C0601b(context, onGestureListener, handler);
    }

    /* renamed from: a */
    public void mo2437a(OnDoubleTapListener onDoubleTapListener) {
        this.f1746a.mo2439a(onDoubleTapListener);
    }

    /* renamed from: a */
    public boolean mo2438a(MotionEvent motionEvent) {
        return this.f1746a.mo2440a(motionEvent);
    }
}
