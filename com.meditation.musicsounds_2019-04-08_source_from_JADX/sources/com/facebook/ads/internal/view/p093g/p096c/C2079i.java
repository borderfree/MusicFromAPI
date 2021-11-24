package com.facebook.ads.internal.view.p093g.p096c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2018c;
import com.facebook.ads.internal.view.p093g.p095b.C2030o;

/* renamed from: com.facebook.ads.internal.view.g.c.i */
public class C2079i extends View implements C2001b {

    /* renamed from: a */
    private final Paint f6784a;

    /* renamed from: b */
    private final Rect f6785b;

    /* renamed from: c */
    private float f6786c;

    /* renamed from: d */
    private final C2030o f6787d;

    /* renamed from: e */
    private final C2018c f6788e;

    /* renamed from: f */
    private C1994a f6789f;

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6789f = aVar;
        aVar.getEventBus().mo6906a((T[]) new C1720f[]{this.f6787d, this.f6788e});
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        aVar.getEventBus().mo6908b((T[]) new C1720f[]{this.f6788e, this.f6787d});
        this.f6789f = null;
    }

    public void draw(Canvas canvas) {
        this.f6785b.set(0, 0, (int) (((float) getWidth()) * this.f6786c), getHeight());
        canvas.drawRect(this.f6785b, this.f6784a);
        super.draw(canvas);
    }
}
