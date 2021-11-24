package android.support.p009v4.app;

import android.arch.lifecycle.C0023d;
import android.arch.lifecycle.C0030i;
import android.arch.lifecycle.C0031j;
import android.arch.lifecycle.C0035m;
import android.arch.lifecycle.C0036n;
import android.arch.lifecycle.C0036n.C0037a;
import android.arch.lifecycle.C0038o;
import android.os.Bundle;
import android.os.Looper;
import android.support.p009v4.app.C0415v.C0416a;
import android.support.p009v4.content.C0453c;
import android.support.p009v4.content.C0453c.C0455b;
import android.support.p009v4.p019g.C0493d;
import android.support.p009v4.p019g.C0511n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends C0415v {

    /* renamed from: a */
    static boolean f992a = false;

    /* renamed from: b */
    private final C0023d f993b;

    /* renamed from: c */
    private final LoaderViewModel f994c;

    /* renamed from: d */
    private boolean f995d;

    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    static class LoaderViewModel extends C0035m {

        /* renamed from: a */
        private static final C0037a f996a = new C0037a() {
            /* renamed from: a */
            public <T extends C0035m> T mo84a(Class<T> cls) {
                return new LoaderViewModel();
            }
        };

        /* renamed from: b */
        private C0511n<C0343a> f997b = new C0511n<>();

        LoaderViewModel() {
        }

        /* renamed from: a */
        static LoaderViewModel m1432a(C0038o oVar) {
            return (LoaderViewModel) new C0036n(oVar, f996a).mo82a(LoaderViewModel.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <D> C0343a<D> mo1358a(int i) {
            return (C0343a) this.f997b.mo2025a(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo81a() {
            super.mo81a();
            int b = this.f997b.mo2027b();
            for (int i = 0; i < b; i++) {
                ((C0343a) this.f997b.mo2035e(i)).mo1363a(true);
            }
            this.f997b.mo2030c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1359a(int i, C0343a aVar) {
            this.f997b.mo2029b(i, aVar);
        }

        /* renamed from: a */
        public void mo1360a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f997b.mo2027b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f997b.mo2027b(); i++) {
                    C0343a aVar = (C0343a) this.f997b.mo2035e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f997b.mo2034d(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo1365a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1361b() {
            int b = this.f997b.mo2027b();
            for (int i = 0; i < b; i++) {
                ((C0343a) this.f997b.mo2035e(i)).mo1367g();
            }
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$a */
    public static class C0343a<D> extends C0030i<D> implements C0455b<D> {

        /* renamed from: a */
        private final int f998a;

        /* renamed from: b */
        private final Bundle f999b;

        /* renamed from: c */
        private final C0453c<D> f1000c;

        /* renamed from: d */
        private C0023d f1001d;

        /* renamed from: e */
        private C0344b<D> f1002e;

        /* renamed from: f */
        private C0453c<D> f1003f;

        C0343a(int i, Bundle bundle, C0453c<D> cVar, C0453c<D> cVar2) {
            this.f998a = i;
            this.f999b = bundle;
            this.f1000c = cVar;
            this.f1003f = cVar2;
            this.f1000c.mo1819a(i, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0453c<D> mo1362a(C0023d dVar, C0416a<D> aVar) {
            C0344b<D> bVar = new C0344b<>(this.f1000c, aVar);
            mo46a(dVar, (C0031j<T>) bVar);
            if (this.f1002e != null) {
                mo47a((C0031j<D>) this.f1002e);
            }
            this.f1001d = dVar;
            this.f1002e = bVar;
            return this.f1000c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0453c<D> mo1363a(boolean z) {
            if (LoaderManagerImpl.f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f1000c.mo1829m();
            this.f1000c.mo1833q();
            C0344b<D> bVar = this.f1002e;
            if (bVar != null) {
                mo47a((C0031j<D>) bVar);
                if (z) {
                    bVar.mo1371b();
                }
            }
            this.f1000c.mo1820a(this);
            if ((bVar == null || bVar.mo1370a()) && !z) {
                return this.f1000c;
            }
            this.f1000c.mo1835s();
            return this.f1003f;
        }

        /* renamed from: a */
        public void mo47a(C0031j<D> jVar) {
            super.mo47a(jVar);
            this.f1001d = null;
            this.f1002e = null;
        }

        /* renamed from: a */
        public void mo1364a(C0453c<D> cVar, D d) {
            if (LoaderManagerImpl.f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo50b(d);
                return;
            }
            if (LoaderManagerImpl.f992a) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            mo48a(d);
        }

        /* renamed from: a */
        public void mo1365a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f998a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f999b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1000c);
            C0453c<D> cVar = this.f1000c;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            cVar.mo1796a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f1002e != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f1002e);
                C0344b<D> bVar = this.f1002e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("  ");
                bVar.mo1369a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo1366f().mo1822c(mo45a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo52d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo49b() {
            if (LoaderManagerImpl.f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f1000c.mo1827k();
        }

        /* renamed from: b */
        public void mo50b(D d) {
            super.mo50b(d);
            if (this.f1003f != null) {
                this.f1003f.mo1835s();
                this.f1003f = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo51c() {
            if (LoaderManagerImpl.f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f1000c.mo1831o();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C0453c<D> mo1366f() {
            return this.f1000c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo1367g() {
            C0023d dVar = this.f1001d;
            C0344b<D> bVar = this.f1002e;
            if (dVar != null && bVar != null) {
                super.mo47a((C0031j<T>) bVar);
                mo46a(dVar, (C0031j<T>) bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f998a);
            sb.append(" : ");
            C0493d.m2201a(this.f1000c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.app.LoaderManagerImpl$b */
    static class C0344b<D> implements C0031j<D> {

        /* renamed from: a */
        private final C0453c<D> f1004a;

        /* renamed from: b */
        private final C0416a<D> f1005b;

        /* renamed from: c */
        private boolean f1006c = false;

        C0344b(C0453c<D> cVar, C0416a<D> aVar) {
            this.f1004a = cVar;
            this.f1005b = aVar;
        }

        /* renamed from: a */
        public void mo70a(D d) {
            if (LoaderManagerImpl.f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f1004a);
                sb.append(": ");
                sb.append(this.f1004a.mo1822c(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.f1005b.mo1698a(this.f1004a, d);
            this.f1006c = true;
        }

        /* renamed from: a */
        public void mo1369a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f1006c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo1370a() {
            return this.f1006c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1371b() {
            if (this.f1006c) {
                if (LoaderManagerImpl.f992a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f1004a);
                    Log.v("LoaderManager", sb.toString());
                }
                this.f1005b.mo1697a(this.f1004a);
            }
        }

        public String toString() {
            return this.f1005b.toString();
        }
    }

    LoaderManagerImpl(C0023d dVar, C0038o oVar) {
        this.f993b = dVar;
        this.f994c = LoaderViewModel.m1432a(oVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C0453c<D> m1427a(int i, Bundle bundle, C0416a<D> aVar, C0453c<D> cVar) {
        try {
            this.f995d = true;
            C0453c a = aVar.mo1696a(i, bundle);
            if (a.getClass().isMemberClass()) {
                if (!Modifier.isStatic(a.getClass().getModifiers())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                    sb.append(a);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            C0343a aVar2 = new C0343a(i, bundle, a, cVar);
            if (f992a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Created new loader ");
                sb2.append(aVar2);
                Log.v("LoaderManager", sb2.toString());
            }
            this.f994c.mo1359a(i, aVar2);
            this.f995d = false;
            return aVar2.mo1362a(this.f993b, aVar);
        } catch (Throwable th) {
            this.f995d = false;
            throw th;
        }
    }

    /* renamed from: a */
    public <D> C0453c<D> mo1353a(int i, Bundle bundle, C0416a<D> aVar) {
        if (this.f995d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C0343a a = this.f994c.mo1358a(i);
            if (f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v("LoaderManager", sb.toString());
            }
            if (a == null) {
                return m1427a(i, bundle, aVar, null);
            }
            if (f992a) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a);
                Log.v("LoaderManager", sb2.toString());
            }
            return a.mo1362a(this.f993b, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1354a() {
        this.f994c.mo1361b();
    }

    /* renamed from: a */
    public void mo1355a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f994c.mo1360a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: b */
    public <D> C0453c<D> mo1356b(int i, Bundle bundle, C0416a<D> aVar) {
        if (this.f995d) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f992a) {
                StringBuilder sb = new StringBuilder();
                sb.append("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v("LoaderManager", sb.toString());
            }
            C0343a a = this.f994c.mo1358a(i);
            C0453c cVar = null;
            if (a != null) {
                cVar = a.mo1363a(false);
            }
            return m1427a(i, bundle, aVar, cVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0493d.m2201a(this.f993b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
