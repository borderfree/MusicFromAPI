package kankan.wheel.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: kankan.wheel.widget.f */
public class C6697f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6700a f23533a;

    /* renamed from: b */
    private Context f23534b;

    /* renamed from: c */
    private GestureDetector f23535c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Scroller f23536d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f23537e;

    /* renamed from: f */
    private float f23538f;

    /* renamed from: g */
    private boolean f23539g;

    /* renamed from: h */
    private SimpleOnGestureListener f23540h = new SimpleOnGestureListener() {
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C6697f.this.f23537e = 0;
            C6697f.this.f23536d.fling(0, C6697f.this.f23537e, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
            C6697f.this.m32303a(0);
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return true;
        }
    };

    /* renamed from: i */
    private final int f23541i = 0;

    /* renamed from: j */
    private final int f23542j = 1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f23543k = new Handler() {
        public void handleMessage(Message message) {
            C6697f.this.f23536d.computeScrollOffset();
            int currY = C6697f.this.f23536d.getCurrY();
            int a = C6697f.this.f23537e - currY;
            C6697f.this.f23537e = currY;
            if (a != 0) {
                C6697f.this.f23533a.mo20795a(a);
            }
            if (Math.abs(currY - C6697f.this.f23536d.getFinalY()) < 1) {
                C6697f.this.f23536d.getFinalY();
                C6697f.this.f23536d.forceFinished(true);
            }
            if (!C6697f.this.f23536d.isFinished()) {
                C6697f.this.f23543k.sendEmptyMessage(message.what);
            } else if (message.what == 0) {
                C6697f.this.m32309d();
            } else {
                C6697f.this.mo20817b();
            }
        }
    };

    /* renamed from: kankan.wheel.widget.f$a */
    public interface C6700a {
        /* renamed from: a */
        void mo20794a();

        /* renamed from: a */
        void mo20795a(int i);

        /* renamed from: b */
        void mo20796b();

        /* renamed from: c */
        void mo20797c();
    }

    public C6697f(Context context, C6700a aVar) {
        this.f23535c = new GestureDetector(context, this.f23540h);
        this.f23535c.setIsLongpressEnabled(false);
        this.f23536d = new Scroller(context);
        this.f23533a = aVar;
        this.f23534b = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32303a(int i) {
        m32307c();
        this.f23543k.sendEmptyMessage(i);
    }

    /* renamed from: c */
    private void m32307c() {
        this.f23543k.removeMessages(0);
        this.f23543k.removeMessages(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m32309d() {
        this.f23533a.mo20797c();
        m32303a(1);
    }

    /* renamed from: e */
    private void m32310e() {
        if (!this.f23539g) {
            this.f23539g = true;
            this.f23533a.mo20794a();
        }
    }

    /* renamed from: a */
    public void mo20813a() {
        this.f23536d.forceFinished(true);
    }

    /* renamed from: a */
    public void mo20814a(int i, int i2) {
        this.f23536d.forceFinished(true);
        this.f23537e = 0;
        this.f23536d.startScroll(0, 0, 0, i, i2 != 0 ? i2 : 400);
        m32303a(0);
        m32310e();
    }

    /* renamed from: a */
    public void mo20815a(Interpolator interpolator) {
        this.f23536d.forceFinished(true);
        this.f23536d = new Scroller(this.f23534b, interpolator);
    }

    /* renamed from: a */
    public boolean mo20816a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23538f = motionEvent.getY();
            this.f23536d.forceFinished(true);
            m32307c();
        } else if (action == 2) {
            int y = (int) (motionEvent.getY() - this.f23538f);
            if (y != 0) {
                m32310e();
                this.f23533a.mo20795a(y);
                this.f23538f = motionEvent.getY();
            }
        }
        if (!this.f23535c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
            m32309d();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo20817b() {
        if (this.f23539g) {
            this.f23533a.mo20796b();
            this.f23539g = false;
        }
    }
}
