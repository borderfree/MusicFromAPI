package android.support.p009v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.p */
public abstract class C0623p {

    /* renamed from: a */
    private final DataSetObservable f1785a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f1786b;

    /* renamed from: a */
    public int mo2475a(Object obj) {
        return -1;
    }

    /* renamed from: a */
    public Parcelable mo1654a() {
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public Object mo2476a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: a */
    public Object mo1656a(ViewGroup viewGroup, int i) {
        return mo2476a((View) viewGroup, i);
    }

    /* renamed from: a */
    public void mo2477a(DataSetObserver dataSetObserver) {
        this.f1785a.registerObserver(dataSetObserver);
    }

    /* renamed from: a */
    public void mo1657a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo2478a(View view) {
    }

    @Deprecated
    /* renamed from: a */
    public void mo2479a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: a */
    public void mo1658a(ViewGroup viewGroup) {
        mo2478a((View) viewGroup);
    }

    /* renamed from: a */
    public void mo1659a(ViewGroup viewGroup, int i, Object obj) {
        mo2479a((View) viewGroup, i, obj);
    }

    /* renamed from: a */
    public abstract boolean mo1660a(View view, Object obj);

    /* renamed from: b */
    public abstract int mo2480b();

    /* renamed from: b */
    public void mo2481b(DataSetObserver dataSetObserver) {
        this.f1785a.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    /* renamed from: b */
    public void mo2482b(View view) {
    }

    @Deprecated
    /* renamed from: b */
    public void mo2483b(View view, int i, Object obj) {
    }

    /* renamed from: b */
    public void mo1662b(ViewGroup viewGroup) {
        mo2482b((View) viewGroup);
    }

    /* renamed from: b */
    public void mo1663b(ViewGroup viewGroup, int i, Object obj) {
        mo2483b((View) viewGroup, i, obj);
    }

    /* renamed from: c */
    public CharSequence mo2484c(int i) {
        return null;
    }

    /* renamed from: c */
    public void mo2485c() {
        synchronized (this) {
            if (this.f1786b != null) {
                this.f1786b.onChanged();
            }
        }
        this.f1785a.notifyChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2486c(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f1786b = dataSetObserver;
        }
    }

    /* renamed from: d */
    public float mo2487d(int i) {
        return 1.0f;
    }
}
