package com.google.android.exoplayer2.metadata;

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
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.d */
public final class C2686d extends C2431a implements Callback {

    /* renamed from: a */
    private final C2683b f9177a;

    /* renamed from: b */
    private final C2687a f9178b;

    /* renamed from: c */
    private final Handler f9179c;

    /* renamed from: d */
    private final C2668i f9180d;

    /* renamed from: e */
    private final C2685c f9181e;

    /* renamed from: f */
    private final Metadata[] f9182f;

    /* renamed from: g */
    private final long[] f9183g;

    /* renamed from: h */
    private int f9184h;

    /* renamed from: i */
    private int f9185i;

    /* renamed from: j */
    private C2682a f9186j;

    /* renamed from: k */
    private boolean f9187k;

    /* renamed from: com.google.android.exoplayer2.metadata.d$a */
    public interface C2687a {
        /* renamed from: a */
        void mo9195a(Metadata metadata);
    }

    public C2686d(C2687a aVar, Looper looper) {
        this(aVar, looper, C2683b.f9175a);
    }

    public C2686d(C2687a aVar, Looper looper, C2683b bVar) {
        super(4);
        this.f9178b = (C2687a) C2488a.m11664a(aVar);
        this.f9179c = looper == null ? null : new Handler(looper, this);
        this.f9177a = (C2683b) C2488a.m11664a(bVar);
        this.f9180d = new C2668i();
        this.f9181e = new C2685c();
        this.f9182f = new Metadata[5];
        this.f9183g = new long[5];
    }

    /* renamed from: a */
    private void m12742a(Metadata metadata) {
        if (this.f9179c != null) {
            this.f9179c.obtainMessage(0, metadata).sendToTarget();
        } else {
            m12743b(metadata);
        }
    }

    /* renamed from: b */
    private void m12743b(Metadata metadata) {
        this.f9178b.mo9195a(metadata);
    }

    /* renamed from: v */
    private void m12744v() {
        Arrays.fill(this.f9182f, null);
        this.f9184h = 0;
        this.f9185i = 0;
    }

    /* renamed from: a */
    public int mo9157a(Format format) {
        return this.f9177a.mo9192a(format) ? 3 : 0;
    }

    /* renamed from: a */
    public void mo9156a(long j, long j2) {
        if (!this.f9187k && this.f9185i < 5) {
            this.f9181e.mo8641a();
            if (mo8613a(this.f9180d, (C2438e) this.f9181e, false) == -4) {
                if (this.f9181e.mo8645c()) {
                    this.f9187k = true;
                } else if (!this.f9181e.mo8648g_()) {
                    this.f9181e.f9176d = this.f9180d.f9113a.f7755w;
                    this.f9181e.mo8660h();
                    try {
                        int i = (this.f9184h + this.f9185i) % 5;
                        this.f9182f[i] = this.f9186j.mo9191a(this.f9181e);
                        this.f9183g[i] = this.f9181e.f7789c;
                        this.f9185i++;
                    } catch (MetadataDecoderException e) {
                        throw ExoPlaybackException.createForRenderer(e, mo8639r());
                    }
                }
            }
        }
        if (this.f9185i > 0 && this.f9183g[this.f9184h] <= j) {
            m12742a(this.f9182f[this.f9184h]);
            this.f9182f[this.f9184h] = null;
            this.f9184h = (this.f9184h + 1) % 5;
            this.f9185i--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
        m12744v();
        this.f9187k = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8620a(Format[] formatArr) {
        this.f9186j = this.f9177a.mo9193b(formatArr[0]);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            m12743b((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
        m12744v();
        this.f9186j = null;
    }

    /* renamed from: t */
    public boolean mo8745t() {
        return true;
    }

    /* renamed from: u */
    public boolean mo8746u() {
        return this.f9187k;
    }
}
