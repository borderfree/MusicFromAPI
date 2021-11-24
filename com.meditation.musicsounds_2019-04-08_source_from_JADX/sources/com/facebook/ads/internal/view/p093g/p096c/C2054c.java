package com.facebook.ads.internal.view.p093g.p096c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.facebook.ads.internal.p077s.p079b.C1817b;
import com.facebook.ads.internal.p077s.p079b.C1818c;
import com.facebook.ads.internal.view.p093g.C1994a;
import com.facebook.ads.internal.view.p093g.p094a.C2001b;
import com.facebook.ads.internal.view.p093g.p095b.C2036u;
import com.facebook.ads.internal.view.p093g.p095b.C2037v;

/* renamed from: com.facebook.ads.internal.view.g.c.c */
public class C2054c extends ImageView implements C2001b {

    /* renamed from: a */
    private static final int f6732a = ((int) (Resources.getSystem().getDisplayMetrics().density * 4.0f));

    /* renamed from: b */
    private final Paint f6733b = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1994a f6734c;

    /* renamed from: d */
    private final C2036u f6735d = new C2036u() {
        /* renamed from: a */
        public void mo6765a(C2037v vVar) {
            C2054c.this.mo7509a();
        }
    };

    public C2054c(Context context) {
        super(context);
        this.f6733b.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(f6732a, f6732a, f6732a, f6732a);
        m9695c();
        setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C1994a a;
                float f;
                if (C2054c.this.f6734c != null) {
                    if (C2054c.this.m9693b()) {
                        a = C2054c.this.f6734c;
                        f = 1.0f;
                    } else {
                        a = C2054c.this.f6734c;
                        f = 0.0f;
                    }
                    a.setVolume(f);
                    C2054c.this.mo7509a();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m9693b() {
        return this.f6734c != null && this.f6734c.getVolume() == 0.0f;
    }

    /* renamed from: c */
    private void m9695c() {
        setImageBitmap(C1818c.m8953a(C1817b.SOUND_ON));
    }

    /* renamed from: d */
    private void m9696d() {
        setImageBitmap(C1818c.m8953a(C1817b.SOUND_OFF));
    }

    /* renamed from: a */
    public final void mo7509a() {
        if (this.f6734c != null) {
            if (m9693b()) {
                m9696d();
            } else {
                m9695c();
            }
        }
    }

    /* renamed from: a */
    public void mo7380a(C1994a aVar) {
        this.f6734c = aVar;
        if (this.f6734c != null) {
            this.f6734c.getEventBus().mo6907a(this.f6735d);
        }
    }

    /* renamed from: b */
    public void mo7384b(C1994a aVar) {
        if (this.f6734c != null) {
            this.f6734c.getEventBus().mo6909b(this.f6735d);
        }
        this.f6734c = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        canvas.drawCircle((float) width, (float) height, (float) Math.min(width, height), this.f6733b);
        super.onDraw(canvas);
    }
}
