package android.support.p009v4.content;

import android.content.Context;
import android.support.p009v4.p019g.C0493d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.c */
public class C0453c<D> {

    /* renamed from: f */
    int f1365f;

    /* renamed from: g */
    C0455b<D> f1366g;

    /* renamed from: h */
    C0454a<D> f1367h;

    /* renamed from: i */
    Context f1368i;

    /* renamed from: j */
    boolean f1369j = false;

    /* renamed from: k */
    boolean f1370k = false;

    /* renamed from: l */
    boolean f1371l = true;

    /* renamed from: m */
    boolean f1372m = false;

    /* renamed from: n */
    boolean f1373n = false;

    /* renamed from: android.support.v4.content.c$a */
    public interface C0454a<D> {
        /* renamed from: a */
        void mo1842a(C0453c<D> cVar);
    }

    /* renamed from: android.support.v4.content.c$b */
    public interface C0455b<D> {
        /* renamed from: a */
        void mo1364a(C0453c<D> cVar, D d);
    }

    public C0453c(Context context) {
        this.f1368i = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1793a() {
    }

    /* renamed from: a */
    public void mo1819a(int i, C0455b<D> bVar) {
        if (this.f1366g == null) {
            this.f1366g = bVar;
            this.f1365f = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo1820a(C0455b<D> bVar) {
        if (this.f1366g == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1366g == bVar) {
            this.f1366g = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo1796a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1365f);
        printWriter.print(" mListener=");
        printWriter.println(this.f1366g);
        if (this.f1369j || this.f1372m || this.f1373n) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1369j);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1372m);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1373n);
        }
        if (this.f1370k || this.f1371l) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1370k);
            printWriter.print(" mReset=");
            printWriter.println(this.f1371l);
        }
    }

    /* renamed from: b */
    public void mo1821b(D d) {
        if (this.f1366g != null) {
            this.f1366g.mo1364a(this, d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1798b() {
        return false;
    }

    /* renamed from: c */
    public String mo1822c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0493d.m2201a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: g */
    public void mo1823g() {
        if (this.f1367h != null) {
            this.f1367h.mo1842a(this);
        }
    }

    /* renamed from: h */
    public boolean mo1824h() {
        return this.f1369j;
    }

    /* renamed from: i */
    public boolean mo1825i() {
        return this.f1370k;
    }

    /* renamed from: j */
    public boolean mo1826j() {
        return this.f1371l;
    }

    /* renamed from: k */
    public final void mo1827k() {
        this.f1369j = true;
        this.f1371l = false;
        this.f1370k = false;
        mo1828l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1828l() {
    }

    /* renamed from: m */
    public boolean mo1829m() {
        return mo1798b();
    }

    /* renamed from: n */
    public void mo1830n() {
        mo1793a();
    }

    /* renamed from: o */
    public void mo1831o() {
        this.f1369j = false;
        mo1832p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo1832p() {
    }

    /* renamed from: q */
    public void mo1833q() {
        this.f1370k = true;
        mo1834r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo1834r() {
    }

    /* renamed from: s */
    public void mo1835s() {
        mo1836t();
        this.f1371l = true;
        this.f1369j = false;
        this.f1370k = false;
        this.f1372m = false;
        this.f1373n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo1836t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0493d.m2201a(this, sb);
        sb.append(" id=");
        sb.append(this.f1365f);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo1838u() {
        boolean z = this.f1372m;
        this.f1372m = false;
        this.f1373n |= z;
        return z;
    }

    /* renamed from: v */
    public void mo1839v() {
        this.f1373n = false;
    }

    /* renamed from: w */
    public void mo1840w() {
        if (this.f1373n) {
            mo1841x();
        }
    }

    /* renamed from: x */
    public void mo1841x() {
        if (this.f1369j) {
            mo1830n();
        } else {
            this.f1372m = true;
        }
    }
}
