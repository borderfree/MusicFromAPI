package com.seattleclouds.modules.photoeffect;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import com.seattleclouds.C5451m.C5458g;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.photoeffect.b */
public class C6040b extends View implements OnDoubleTapListener, OnGestureListener {

    /* renamed from: a */
    C6039a f21473a;

    /* renamed from: b */
    private ArrayList<C6039a> f21474b;

    /* renamed from: c */
    private SeekBar f21475c;

    /* renamed from: d */
    private int f21476d;

    /* renamed from: e */
    private float f21477e;

    /* renamed from: f */
    private float f21478f;

    /* renamed from: g */
    private PointF f21479g;

    /* renamed from: h */
    private GestureDetector f21480h;

    /* renamed from: i */
    private C6041c f21481i;

    /* renamed from: j */
    private Rect f21482j;

    public C6040b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21474b = new ArrayList<>();
        this.f21473a = null;
        this.f21475c = null;
        this.f21476d = -1;
        this.f21477e = 0.0f;
        this.f21478f = 0.0f;
        this.f21479g = new PointF(0.0f, 0.0f);
        this.f21482j = new Rect();
        this.f21480h = new GestureDetector(context, this);
    }

    public C6040b(Context context, View view) {
        this(context, null, 0);
        this.f21475c = (SeekBar) view.findViewById(C5458g.AlphaSeekBar);
        this.f21475c.setProgress(this.f21475c.getMax());
        this.f21480h = new GestureDetector(context, this);
    }

    public C6040b(C6041c cVar) {
        this(cVar.mo1318s(), cVar.mo19118d());
        this.f21481i = cVar;
    }

    /* renamed from: a */
    private float m29611a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: a */
    private void m29612a(Bitmap bitmap, MaskProperty maskProperty, boolean z) {
        C6039a aVar = new C6039a(bitmap, maskProperty);
        if (maskProperty.f21445h) {
            Iterator it = this.f21474b.iterator();
            while (it.hasNext()) {
                ((C6039a) it.next()).mo19085b(false);
            }
            this.f21473a = aVar;
        }
        this.f21474b.add(aVar);
        if (!z) {
            this.f21481i.mo19116a(getMasksProperties());
        }
    }

    /* renamed from: a */
    private void m29613a(PointF pointF, MotionEvent motionEvent) {
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
    }

    /* renamed from: b */
    private float m29614b(MotionEvent motionEvent) {
        return (float) Math.atan2((double) (motionEvent.getY(0) - motionEvent.getY(1)), (double) (motionEvent.getX(0) - motionEvent.getX(1)));
    }

    /* renamed from: a */
    public void mo19096a() {
        if (this.f21473a != null && this.f21473a.mo19091e()) {
            this.f21474b.remove(this.f21473a);
            invalidate();
            this.f21481i.mo19116a(getMasksProperties());
        }
        this.f21481i.mo19116a(getMasksProperties());
    }

    /* renamed from: a */
    public void mo19097a(int i) {
        if (this.f21473a != null && this.f21473a.mo19091e()) {
            this.f21473a.mo19087c(i);
            this.f21473a.mo19089d(1);
            invalidate();
            this.f21481i.mo19116a(getMasksProperties());
        }
        this.f21481i.mo19116a(getMasksProperties());
    }

    /* renamed from: a */
    public void mo19098a(Bitmap bitmap, MaskProperty maskProperty) {
        m29612a(bitmap, maskProperty, true);
    }

    /* renamed from: b */
    public void mo19099b() {
        this.f21474b.clear();
        invalidate();
        this.f21481i.mo19116a(getMasksProperties());
    }

    /* renamed from: b */
    public void mo19100b(Bitmap bitmap, MaskProperty maskProperty) {
        m29612a(bitmap, maskProperty, false);
    }

    public ArrayList<C6039a> getArrayOfChoosedImages() {
        return this.f21474b;
    }

    public Point getCenter() {
        return new Point(getWidth() / 2, getHeight() / 2);
    }

    public ArrayList<MaskProperty> getMasksProperties() {
        ArrayList<MaskProperty> arrayList = new ArrayList<>();
        Iterator it = this.f21474b.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6039a) it.next()).mo19095i());
        }
        return arrayList;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f21476d = 2;
        if (this.f21473a != null && this.f21473a.mo19091e()) {
            this.f21473a.mo19089d(2);
            this.f21473a.mo19075a(1.5f);
            invalidate();
        }
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        Iterator it = this.f21474b.iterator();
        while (it.hasNext()) {
            ((C6039a) it.next()).mo19077a(canvas);
        }
        canvas.restore();
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r9.f21473a.mo19093g() != -1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r9.f21476d = -1;
        r9.f21481i.mo19116a(getMasksProperties());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9.f21473a.mo19093g() != -1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0144, code lost:
        if (r9.f21473a.mo19093g() != -1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0197, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.ViewParent r0 = r9.getParent()
            r1 = 1
            r0.requestDisallowInterceptTouchEvent(r1)
            android.view.GestureDetector r0 = r9.f21480h
            r0.onTouchEvent(r10)
            com.seattleclouds.modules.photoeffect.c r0 = r9.f21481i
            r0.mo1453c()
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1092616192(0x41200000, float:10.0)
            r4 = 0
            r5 = -1
            switch(r0) {
                case 0: goto L_0x0148;
                case 1: goto L_0x010f;
                case 2: goto L_0x00a8;
                case 3: goto L_0x0070;
                case 4: goto L_0x0020;
                case 5: goto L_0x0050;
                case 6: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0197
        L_0x0022:
            int r10 = r9.f21476d
            if (r10 != r5) goto L_0x0028
            goto L_0x0197
        L_0x0028:
            r10 = 0
            r9.f21477e = r10
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x0034
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            r10.mo19088c(r1)
        L_0x0034:
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x0043
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            int r10 = r10.mo19093g()
            if (r10 == r5) goto L_0x0043
        L_0x0040:
            r9.invalidate()
        L_0x0043:
            r9.f21476d = r5
            com.seattleclouds.modules.photoeffect.c r10 = r9.f21481i
            java.util.ArrayList r0 = r9.getMasksProperties()
            r10.mo19116a(r0)
            goto L_0x0197
        L_0x0050:
            float r0 = r9.m29611a(r10)
            r9.f21477e = r0
            float r0 = r9.m29614b(r10)
            r9.f21478f = r0
            float r0 = r9.f21477e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            android.graphics.PointF r0 = r9.f21479g
            r9.m29613a(r0, r10)
            r9.f21476d = r1
        L_0x0069:
            java.lang.String r10 = "ad"
            android.util.Log.v(r2, r10)
            goto L_0x0197
        L_0x0070:
            int r10 = r9.f21476d
            if (r10 != r5) goto L_0x0076
            goto L_0x0197
        L_0x0076:
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x007f
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            r10.mo19088c(r1)
        L_0x007f:
            java.util.ArrayList<com.seattleclouds.modules.photoeffect.a> r10 = r9.f21474b
            java.util.Iterator r10 = r10.iterator()
        L_0x0085:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r10.next()
            com.seattleclouds.modules.photoeffect.a r0 = (com.seattleclouds.modules.photoeffect.C6039a) r0
            boolean r2 = r0.mo19090d()
            if (r2 == 0) goto L_0x0085
            r0.mo19080a(r4)
            goto L_0x0085
        L_0x009b:
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x0043
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            int r10 = r10.mo19093g()
            if (r10 == r5) goto L_0x0043
            goto L_0x0040
        L_0x00a8:
            int r0 = r9.f21476d
            if (r0 != 0) goto L_0x00d6
            com.seattleclouds.modules.photoeffect.a r0 = r9.f21473a
            if (r0 == 0) goto L_0x0197
            com.seattleclouds.modules.photoeffect.a r0 = r9.f21473a
            boolean r0 = r0.mo19090d()
            if (r0 == 0) goto L_0x0197
            com.seattleclouds.modules.photoeffect.a r0 = r9.f21473a
            r0.mo19089d(r4)
            com.seattleclouds.modules.photoeffect.a r0 = r9.f21473a
            float r2 = r10.getX()
            int r2 = (int) r2
            r0.mo19076a(r2)
            com.seattleclouds.modules.photoeffect.a r0 = r9.f21473a
            float r10 = r10.getY()
            int r10 = (int) r10
            r0.mo19084b(r10)
        L_0x00d1:
            r9.invalidate()
            goto L_0x0197
        L_0x00d6:
            int r0 = r9.f21476d
            if (r0 != r1) goto L_0x0197
            float r0 = r9.m29611a(r10)
            float r10 = r9.m29614b(r10)
            float r2 = r9.f21478f
            float r10 = r10 - r2
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0197
            float r2 = r9.f21477e
            float r0 = r0 / r2
            com.seattleclouds.modules.photoeffect.a r2 = r9.f21473a
            if (r2 == 0) goto L_0x0197
            com.seattleclouds.modules.photoeffect.a r2 = r9.f21473a
            boolean r2 = r2.mo19090d()
            if (r2 == 0) goto L_0x0197
            com.seattleclouds.modules.photoeffect.a r2 = r9.f21473a
            r2.mo19089d(r1)
            com.seattleclouds.modules.photoeffect.a r2 = r9.f21473a
            r2.mo19083b(r10)
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            r10.mo19075a(r0)
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            android.graphics.PointF r0 = r9.f21479g
            r10.mo19079a(r0)
            goto L_0x00d1
        L_0x010f:
            int r10 = r9.f21476d
            if (r10 != r5) goto L_0x0115
            goto L_0x0197
        L_0x0115:
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x011e
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            r10.mo19088c(r1)
        L_0x011e:
            java.util.ArrayList<com.seattleclouds.modules.photoeffect.a> r10 = r9.f21474b
            java.util.Iterator r10 = r10.iterator()
        L_0x0124:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r10.next()
            com.seattleclouds.modules.photoeffect.a r0 = (com.seattleclouds.modules.photoeffect.C6039a) r0
            boolean r2 = r0.mo19090d()
            if (r2 == 0) goto L_0x0124
            r0.mo19080a(r4)
            goto L_0x0124
        L_0x013a:
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            if (r10 == 0) goto L_0x0043
            com.seattleclouds.modules.photoeffect.a r10 = r9.f21473a
            int r10 = r10.mo19093g()
            if (r10 == r5) goto L_0x0043
            goto L_0x0040
        L_0x0148:
            java.util.ArrayList<com.seattleclouds.modules.photoeffect.a> r0 = r9.f21474b
            int r0 = r0.size()
            int r0 = r0 - r1
            r3 = 1
        L_0x0150:
            if (r0 < 0) goto L_0x017f
            java.util.ArrayList<com.seattleclouds.modules.photoeffect.a> r6 = r9.f21474b
            java.lang.Object r6 = r6.get(r0)
            com.seattleclouds.modules.photoeffect.a r6 = (com.seattleclouds.modules.photoeffect.C6039a) r6
            if (r3 == 0) goto L_0x0179
            float r7 = r10.getX()
            int r7 = (int) r7
            float r8 = r10.getY()
            int r8 = (int) r8
            boolean r7 = r6.mo19081a(r7, r8)
            if (r7 == 0) goto L_0x017c
            android.widget.SeekBar r3 = r9.f21475c
            int r7 = r6.mo19074a()
            r3.setProgress(r7)
            r9.f21473a = r6
            r3 = 0
            goto L_0x017c
        L_0x0179:
            r6.mo19085b(r4)
        L_0x017c:
            int r0 = r0 + -1
            goto L_0x0150
        L_0x017f:
            int r0 = r9.f21476d
            if (r0 != r5) goto L_0x0185
            r9.f21476d = r4
        L_0x0185:
            if (r3 == 0) goto L_0x0194
            android.widget.SeekBar r0 = r9.f21475c
            android.widget.SeekBar r3 = r9.f21475c
            int r3 = r3.getMax()
            r0.setProgress(r3)
            r9.f21473a = r2
        L_0x0194:
            r10.getPointerId(r4)
        L_0x0197:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6040b.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
