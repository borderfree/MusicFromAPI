package android.support.p009v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p009v4.p019g.C0512o;
import android.support.p009v4.p020os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.a */
public abstract class C0440a<D> extends C0453c<D> {

    /* renamed from: a */
    volatile C0441a f1342a;

    /* renamed from: b */
    volatile C0441a f1343b;

    /* renamed from: c */
    long f1344c;

    /* renamed from: d */
    long f1345d;

    /* renamed from: e */
    Handler f1346e;

    /* renamed from: o */
    private final Executor f1347o;

    /* renamed from: android.support.v4.content.a$a */
    final class C0441a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f1348a;

        /* renamed from: d */
        private final CountDownLatch f1350d = new CountDownLatch(1);

        C0441a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo1778a(Void... voidArr) {
            try {
                return C0440a.this.mo1801e();
            } catch (OperationCanceledException e) {
                if (mo1786c()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1780a(D d) {
            try {
                C0440a.this.mo1797b(this, d);
            } finally {
                this.f1350d.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo1783b(D d) {
            try {
                C0440a.this.mo1794a(this, d);
            } finally {
                this.f1350d.countDown();
            }
        }

        public void run() {
            this.f1348a = false;
            C0440a.this.mo1799c();
        }
    }

    public C0440a(Context context) {
        this(context, ModernAsyncTask.f1326c);
    }

    private C0440a(Context context, Executor executor) {
        super(context);
        this.f1345d = -10000;
        this.f1347o = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1793a() {
        super.mo1793a();
        mo1829m();
        this.f1342a = new C0441a<>();
        mo1799c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1794a(C0441a aVar, D d) {
        mo1795a(d);
        if (this.f1343b == aVar) {
            mo1840w();
            this.f1345d = SystemClock.uptimeMillis();
            this.f1343b = null;
            mo1823g();
            mo1799c();
        }
    }

    /* renamed from: a */
    public void mo1795a(D d) {
    }

    /* renamed from: a */
    public void mo1796a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1796a(str, fileDescriptor, printWriter, strArr);
        if (this.f1342a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f1342a);
            printWriter.print(" waiting=");
            printWriter.println(this.f1342a.f1348a);
        }
        if (this.f1343b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f1343b);
            printWriter.print(" waiting=");
            printWriter.println(this.f1343b.f1348a);
        }
        if (this.f1344c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0512o.m2283a(this.f1344c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0512o.m2282a(this.f1345d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1797b(C0441a aVar, D d) {
        if (this.f1342a != aVar) {
            mo1794a(aVar, d);
        } else if (mo1825i()) {
            mo1795a(d);
        } else {
            mo1839v();
            this.f1345d = SystemClock.uptimeMillis();
            this.f1342a = null;
            mo1821b(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1798b() {
        if (this.f1342a == null) {
            return false;
        }
        if (!this.f1369j) {
            this.f1372m = true;
        }
        if (this.f1343b != null) {
            if (this.f1342a.f1348a) {
                this.f1342a.f1348a = false;
                this.f1346e.removeCallbacks(this.f1342a);
            }
            this.f1342a = null;
            return false;
        } else if (this.f1342a.f1348a) {
            this.f1342a.f1348a = false;
            this.f1346e.removeCallbacks(this.f1342a);
            this.f1342a = null;
            return false;
        } else {
            boolean a = this.f1342a.mo1781a(false);
            if (a) {
                this.f1343b = this.f1342a;
                mo1802f();
            }
            this.f1342a = null;
            return a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1799c() {
        if (this.f1343b == null && this.f1342a != null) {
            if (this.f1342a.f1348a) {
                this.f1342a.f1348a = false;
                this.f1346e.removeCallbacks(this.f1342a);
            }
            if (this.f1344c <= 0 || SystemClock.uptimeMillis() >= this.f1345d + this.f1344c) {
                this.f1342a.mo1777a(this.f1347o, null);
            } else {
                this.f1342a.f1348a = true;
                this.f1346e.postAtTime(this.f1342a, this.f1345d + this.f1344c);
            }
        }
    }

    /* renamed from: d */
    public abstract D mo1800d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public D mo1801e() {
        return mo1800d();
    }

    /* renamed from: f */
    public void mo1802f() {
    }
}
