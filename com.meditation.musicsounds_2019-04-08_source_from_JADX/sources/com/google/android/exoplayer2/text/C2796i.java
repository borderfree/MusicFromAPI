package com.google.android.exoplayer2.text;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C2431a;
import com.google.android.exoplayer2.C2668i;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2495h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.i */
public final class C2796i extends C2431a implements Callback {

    /* renamed from: a */
    private final Handler f9668a;

    /* renamed from: b */
    private final C2797a f9669b;

    /* renamed from: c */
    private final C2779f f9670c;

    /* renamed from: d */
    private final C2668i f9671d;

    /* renamed from: e */
    private boolean f9672e;

    /* renamed from: f */
    private boolean f9673f;

    /* renamed from: g */
    private int f9674g;

    /* renamed from: h */
    private Format f9675h;

    /* renamed from: i */
    private C2776e f9676i;

    /* renamed from: j */
    private C2794g f9677j;

    /* renamed from: k */
    private C2795h f9678k;

    /* renamed from: l */
    private C2795h f9679l;

    /* renamed from: m */
    private int f9680m;

    /* renamed from: com.google.android.exoplayer2.text.i$a */
    public interface C2797a {
        /* renamed from: a */
        void mo9309a(List<C2741a> list);
    }

    public C2796i(C2797a aVar, Looper looper) {
        this(aVar, looper, C2779f.f9605a);
    }

    public C2796i(C2797a aVar, Looper looper, C2779f fVar) {
        super(3);
        this.f9669b = (C2797a) C2488a.m11664a(aVar);
        this.f9668a = looper == null ? null : new Handler(looper, this);
        this.f9670c = fVar;
        this.f9671d = new C2668i();
    }

    /* renamed from: a */
    private void m13315a(List<C2741a> list) {
        if (this.f9668a != null) {
            this.f9668a.obtainMessage(0, list).sendToTarget();
        } else {
            m13316b(list);
        }
    }

    /* renamed from: b */
    private void m13316b(List<C2741a> list) {
        this.f9669b.mo9309a(list);
    }

    /* renamed from: v */
    private void m13317v() {
        this.f9677j = null;
        this.f9680m = -1;
        if (this.f9678k != null) {
            this.f9678k.mo9423e();
            this.f9678k = null;
        }
        if (this.f9679l != null) {
            this.f9679l.mo9423e();
            this.f9679l = null;
        }
    }

    /* renamed from: w */
    private void m13318w() {
        m13317v();
        this.f9676i.mo8655d();
        this.f9676i = null;
        this.f9674g = 0;
    }

    /* renamed from: x */
    private void m13319x() {
        m13318w();
        this.f9676i = this.f9670c.mo9471b(this.f9675h);
    }

    /* renamed from: y */
    private long m13320y() {
        if (this.f9680m == -1 || this.f9680m >= this.f9678k.mo9426b()) {
            return Long.MAX_VALUE;
        }
        return this.f9678k.mo9425a(this.f9680m);
    }

    /* renamed from: z */
    private void m13321z() {
        m13315a(Collections.emptyList());
    }

    /* renamed from: a */
    public int mo9157a(Format format) {
        if (this.f9670c.mo9470a(format)) {
            return 3;
        }
        return C2495h.m11694c(format.f7738f) ? 1 : 0;
    }

    /* renamed from: a */
    public void mo9156a(long j, long j2) {
        boolean z;
        if (!this.f9673f) {
            if (this.f9679l == null) {
                this.f9676i.mo9383a(j);
                try {
                    this.f9679l = (C2795h) this.f9676i.mo8653b();
                } catch (SubtitleDecoderException e) {
                    throw ExoPlaybackException.createForRenderer(e, mo8639r());
                }
            }
            if (mo8625d() == 2) {
                if (this.f9678k != null) {
                    long y = m13320y();
                    z = false;
                    while (y <= j) {
                        this.f9680m++;
                        y = m13320y();
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (this.f9679l != null) {
                    if (this.f9679l.mo8645c()) {
                        if (!z && m13320y() == Long.MAX_VALUE) {
                            if (this.f9674g == 2) {
                                m13319x();
                            } else {
                                m13317v();
                                this.f9673f = true;
                            }
                        }
                    } else if (this.f9679l.f7791a <= j) {
                        if (this.f9678k != null) {
                            this.f9678k.mo9423e();
                        }
                        this.f9678k = this.f9679l;
                        this.f9679l = null;
                        this.f9680m = this.f9678k.mo9424a(j);
                        z = true;
                    }
                }
                if (z) {
                    m13315a(this.f9678k.mo9427b(j));
                }
                if (this.f9674g != 2) {
                    while (!this.f9672e) {
                        try {
                            if (this.f9677j == null) {
                                this.f9677j = (C2794g) this.f9676i.mo8651a();
                                if (this.f9677j == null) {
                                    return;
                                }
                            }
                            if (this.f9674g == 1) {
                                this.f9677j.mo8642a_(4);
                                this.f9676i.mo8652a(this.f9677j);
                                this.f9677j = null;
                                this.f9674g = 2;
                                return;
                            }
                            int a = mo8613a(this.f9671d, (C2438e) this.f9677j, false);
                            if (a == -4) {
                                if (this.f9677j.mo8645c()) {
                                    this.f9672e = true;
                                } else {
                                    this.f9677j.f9665d = this.f9671d.f9113a.f7755w;
                                    this.f9677j.mo8660h();
                                }
                                this.f9676i.mo8652a(this.f9677j);
                                this.f9677j = null;
                            } else if (a == -3) {
                                break;
                            }
                        } catch (SubtitleDecoderException e2) {
                            throw ExoPlaybackException.createForRenderer(e2, mo8639r());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
        m13321z();
        this.f9672e = false;
        this.f9673f = false;
        if (this.f9674g != 0) {
            m13319x();
            return;
        }
        m13317v();
        this.f9676i.mo8654c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8620a(Format[] formatArr) {
        this.f9675h = formatArr[0];
        if (this.f9676i != null) {
            this.f9674g = 1;
        } else {
            this.f9676i = this.f9670c.mo9471b(this.f9675h);
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m13316b((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
        this.f9675h = null;
        m13321z();
        m13318w();
    }

    /* renamed from: t */
    public boolean mo8745t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo8746u() {
        return this.f9673f;
    }
}
