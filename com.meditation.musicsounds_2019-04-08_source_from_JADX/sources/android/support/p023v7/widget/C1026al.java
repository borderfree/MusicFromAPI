package android.support.p023v7.widget;

import android.support.p009v4.p020os.C0560c;
import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0937i.C0940a;
import android.support.p023v7.widget.RecyclerView.C0949p;
import android.support.p023v7.widget.RecyclerView.C0958w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.al */
final class C1026al implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C1026al> f3534a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1029b> f3535e = new Comparator<C1029b>() {
        /* renamed from: a */
        public int compare(C1029b bVar, C1029b bVar2) {
            int i = 1;
            if ((bVar.f3547d == null) != (bVar2.f3547d == null)) {
                if (bVar.f3547d != null) {
                    i = -1;
                }
                return i;
            } else if (bVar.f3544a != bVar2.f3544a) {
                if (bVar.f3544a) {
                    i = -1;
                }
                return i;
            } else {
                int i2 = bVar2.f3545b - bVar.f3545b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = bVar.f3546c - bVar2.f3546c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f3536b = new ArrayList<>();

    /* renamed from: c */
    long f3537c;

    /* renamed from: d */
    long f3538d;

    /* renamed from: f */
    private ArrayList<C1029b> f3539f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.al$a */
    static class C1028a implements C0940a {

        /* renamed from: a */
        int f3540a;

        /* renamed from: b */
        int f3541b;

        /* renamed from: c */
        int[] f3542c;

        /* renamed from: d */
        int f3543d;

        C1028a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5075a() {
            if (this.f3542c != null) {
                Arrays.fill(this.f3542c, -1);
            }
            this.f3543d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5076a(int i, int i2) {
            this.f3540a = i;
            this.f3541b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5077a(RecyclerView recyclerView, boolean z) {
            this.f3543d = 0;
            if (this.f3542c != null) {
                Arrays.fill(this.f3542c, -1);
            }
            C0937i iVar = recyclerView.f3041m;
            if (recyclerView.f3040l != null && iVar != null && iVar.mo4459q()) {
                if (z) {
                    if (!recyclerView.f3033e.mo5439d()) {
                        iVar.mo4077a(recyclerView.f3040l.mo342a(), (C0940a) this);
                    }
                } else if (!recyclerView.mo4287v()) {
                    iVar.mo4076a(this.f3540a, this.f3541b, recyclerView.f2984C, (C0940a) this);
                }
                if (this.f3543d > iVar.f3090x) {
                    iVar.f3090x = this.f3543d;
                    iVar.f3091y = z;
                    recyclerView.f3032d.mo4513b();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5078a(int i) {
            if (this.f3542c != null) {
                int i2 = this.f3543d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3542c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo4474b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3543d * 2;
                if (this.f3542c == null) {
                    this.f3542c = new int[4];
                    Arrays.fill(this.f3542c, -1);
                } else if (i3 >= this.f3542c.length) {
                    int[] iArr = this.f3542c;
                    this.f3542c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f3542c, 0, iArr.length);
                }
                this.f3542c[i3] = i;
                this.f3542c[i3 + 1] = i2;
                this.f3543d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }
    }

    /* renamed from: android.support.v7.widget.al$b */
    static class C1029b {

        /* renamed from: a */
        public boolean f3544a;

        /* renamed from: b */
        public int f3545b;

        /* renamed from: c */
        public int f3546c;

        /* renamed from: d */
        public RecyclerView f3547d;

        /* renamed from: e */
        public int f3548e;

        C1029b() {
        }

        /* renamed from: a */
        public void mo5079a() {
            this.f3544a = false;
            this.f3545b = 0;
            this.f3546c = 0;
            this.f3547d = null;
            this.f3548e = 0;
        }
    }

    C1026al() {
    }

    /* renamed from: a */
    private C0958w m5580a(RecyclerView recyclerView, int i, long j) {
        if (m5584a(recyclerView, i)) {
            return null;
        }
        C0949p pVar = recyclerView.f3032d;
        try {
            recyclerView.mo4236l();
            C0958w a = pVar.mo4498a(i, false, j);
            if (a != null) {
                if (!a.mo4596p() || a.mo4594n()) {
                    pVar.mo4508a(a, false);
                } else {
                    pVar.mo4509a(a.f3157a);
                }
            }
            return a;
        } finally {
            recyclerView.mo4164b(false);
        }
    }

    /* renamed from: a */
    private void m5581a() {
        C1029b bVar;
        int size = this.f3536b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f3536b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f2983B.mo5077a(recyclerView, false);
                i += recyclerView.f2983B.f3543d;
            }
        }
        this.f3539f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f3536b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1028a aVar = recyclerView2.f2983B;
                int abs = Math.abs(aVar.f3540a) + Math.abs(aVar.f3541b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f3543d * 2; i6 += 2) {
                    if (i5 >= this.f3539f.size()) {
                        bVar = new C1029b();
                        this.f3539f.add(bVar);
                    } else {
                        bVar = (C1029b) this.f3539f.get(i5);
                    }
                    int i7 = aVar.f3542c[i6 + 1];
                    bVar.f3544a = i7 <= abs;
                    bVar.f3545b = abs;
                    bVar.f3546c = i7;
                    bVar.f3547d = recyclerView2;
                    bVar.f3548e = aVar.f3542c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f3539f, f3535e);
    }

    /* renamed from: a */
    private void m5582a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3051w && recyclerView.f3034f.mo4954c() != 0) {
                recyclerView.mo4168c();
            }
            C1028a aVar = recyclerView.f2983B;
            aVar.mo5077a(recyclerView, true);
            if (aVar.f3543d != 0) {
                try {
                    C0560c.m2558a("RV Nested Prefetch");
                    recyclerView.f2984C.mo4556a(recyclerView.f3040l);
                    for (int i = 0; i < aVar.f3543d * 2; i += 2) {
                        m5580a(recyclerView, aVar.f3542c[i], j);
                    }
                } finally {
                    C0560c.m2557a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m5583a(C1029b bVar, long j) {
        C0958w a = m5580a(bVar.f3547d, bVar.f3548e, bVar.f3544a ? Long.MAX_VALUE : j);
        if (a != null && a.f3158b != null && a.mo4596p() && !a.mo4594n()) {
            m5582a((RecyclerView) a.f3158b.get(), j);
        }
    }

    /* renamed from: a */
    static boolean m5584a(RecyclerView recyclerView, int i) {
        int c = recyclerView.f3034f.mo4954c();
        for (int i2 = 0; i2 < c; i2++) {
            C0958w e = RecyclerView.m4616e(recyclerView.f3034f.mo4957d(i2));
            if (e.f3159c == i && !e.mo4594n()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5585b(long j) {
        int i = 0;
        while (i < this.f3539f.size()) {
            C1029b bVar = (C1029b) this.f3539f.get(i);
            if (bVar.f3547d != null) {
                m5583a(bVar, j);
                bVar.mo5079a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5068a(long j) {
        m5581a();
        m5585b(j);
    }

    /* renamed from: a */
    public void mo5069a(RecyclerView recyclerView) {
        this.f3536b.add(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5070a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3537c == 0) {
            this.f3537c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f2983B.mo5076a(i, i2);
    }

    /* renamed from: b */
    public void mo5071b(RecyclerView recyclerView) {
        this.f3536b.remove(recyclerView);
    }

    public void run() {
        try {
            C0560c.m2558a("RV Prefetch");
            if (!this.f3536b.isEmpty()) {
                int size = this.f3536b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3536b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5068a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3538d);
                    this.f3537c = 0;
                    C0560c.m2557a();
                }
            }
        } finally {
            this.f3537c = 0;
            C0560c.m2557a();
        }
    }
}
