package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2510r;
import com.google.android.exoplayer2.p102c.C2511s;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f9703a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2803b<? extends C2804c> f9704b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f9705c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    public interface C2802a<T extends C2804c> {
        /* renamed from: a */
        int mo9336a(T t, long j, long j2, IOException iOException);

        /* renamed from: a */
        void mo9343a(T t, long j, long j2);

        /* renamed from: a */
        void mo9344a(T t, long j, long j2, boolean z);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    private final class C2803b<T extends C2804c> extends Handler implements Runnable {

        /* renamed from: a */
        public final int f9706a;

        /* renamed from: c */
        private final T f9708c;

        /* renamed from: d */
        private final C2802a<T> f9709d;

        /* renamed from: e */
        private final long f9710e;

        /* renamed from: f */
        private IOException f9711f;

        /* renamed from: g */
        private int f9712g;

        /* renamed from: h */
        private volatile Thread f9713h;

        /* renamed from: i */
        private volatile boolean f9714i;

        public C2803b(Looper looper, T t, C2802a<T> aVar, int i, long j) {
            super(looper);
            this.f9708c = t;
            this.f9709d = aVar;
            this.f9706a = i;
            this.f9710e = j;
        }

        /* renamed from: a */
        private void m13361a() {
            this.f9711f = null;
            Loader.this.f9703a.execute(Loader.this.f9704b);
        }

        /* renamed from: b */
        private void m13362b() {
            Loader.this.f9704b = null;
        }

        /* renamed from: c */
        private long m13363c() {
            return (long) Math.min((this.f9712g - 1) * 1000, 5000);
        }

        /* renamed from: a */
        public void mo9533a(int i) {
            if (this.f9711f != null && this.f9712g > i) {
                throw this.f9711f;
            }
        }

        /* renamed from: a */
        public void mo9534a(long j) {
            C2488a.m11668b(Loader.this.f9704b == null);
            Loader.this.f9704b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m13361a();
            }
        }

        /* renamed from: a */
        public void mo9535a(boolean z) {
            this.f9714i = z;
            this.f9711f = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f9708c.mo9359a();
                if (this.f9713h != null) {
                    this.f9713h.interrupt();
                }
            }
            if (z) {
                m13362b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f9709d.mo9344a(this.f9708c, elapsedRealtime, elapsedRealtime - this.f9710e, true);
            }
        }

        public void handleMessage(Message message) {
            if (!this.f9714i) {
                if (message.what == 0) {
                    m13361a();
                } else if (message.what != 4) {
                    m13362b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f9710e;
                    if (this.f9708c.mo9361b()) {
                        this.f9709d.mo9344a(this.f9708c, elapsedRealtime, j, false);
                        return;
                    }
                    switch (message.what) {
                        case 1:
                            this.f9709d.mo9344a(this.f9708c, elapsedRealtime, j, false);
                            break;
                        case 2:
                            this.f9709d.mo9343a(this.f9708c, elapsedRealtime, j);
                            break;
                        case 3:
                            this.f9711f = (IOException) message.obj;
                            int a = this.f9709d.mo9336a(this.f9708c, elapsedRealtime, j, this.f9711f);
                            if (a != 3) {
                                if (a != 2) {
                                    int i = 1;
                                    if (a != 1) {
                                        i = 1 + this.f9712g;
                                    }
                                    this.f9712g = i;
                                    mo9534a(m13363c());
                                    break;
                                }
                            } else {
                                Loader.this.f9705c = this.f9711f;
                                break;
                            }
                            break;
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            Message obtainMessage;
            UnexpectedLoaderException unexpectedLoaderException;
            try {
                this.f9713h = Thread.currentThread();
                if (!this.f9708c.mo9361b()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("load:");
                    sb.append(this.f9708c.getClass().getSimpleName());
                    C2510r.m11793a(sb.toString());
                    this.f9708c.mo9362c();
                    C2510r.m11792a();
                }
                if (!this.f9714i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f9714i) {
                    obtainMessage = obtainMessage(3, e);
                    obtainMessage.sendToTarget();
                }
            } catch (InterruptedException unused) {
                C2488a.m11668b(this.f9708c.mo9361b());
                if (!this.f9714i) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f9714i) {
                    unexpectedLoaderException = new UnexpectedLoaderException(e2);
                    obtainMessage = obtainMessage(3, unexpectedLoaderException);
                    obtainMessage.sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f9714i) {
                    unexpectedLoaderException = new UnexpectedLoaderException(e3);
                    obtainMessage = obtainMessage(3, unexpectedLoaderException);
                    obtainMessage.sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f9714i) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C2510r.m11792a();
                throw th;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public interface C2804c {
        /* renamed from: a */
        void mo9359a();

        /* renamed from: b */
        boolean mo9361b();

        /* renamed from: c */
        void mo9362c();
    }

    public Loader(String str) {
        this.f9703a = C2511s.m11804a(str);
    }

    /* renamed from: a */
    public <T extends C2804c> long mo9527a(T t, C2802a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C2488a.m11668b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C2803b bVar = new C2803b(myLooper, t, aVar, i, elapsedRealtime);
        bVar.mo9534a(0);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public void mo9528a(int i) {
        if (this.f9705c != null) {
            throw this.f9705c;
        } else if (this.f9704b != null) {
            C2803b<? extends C2804c> bVar = this.f9704b;
            if (i == Integer.MIN_VALUE) {
                i = this.f9704b.f9706a;
            }
            bVar.mo9533a(i);
        }
    }

    /* renamed from: a */
    public void mo9529a(Runnable runnable) {
        if (this.f9704b != null) {
            this.f9704b.mo9535a(true);
        }
        if (runnable != null) {
            this.f9703a.execute(runnable);
        }
        this.f9703a.shutdown();
    }

    /* renamed from: a */
    public boolean mo9530a() {
        return this.f9704b != null;
    }

    /* renamed from: b */
    public void mo9531b() {
        this.f9704b.mo9535a(false);
    }

    /* renamed from: c */
    public void mo9532c() {
        mo9528a(Integer.MIN_VALUE);
    }
}
