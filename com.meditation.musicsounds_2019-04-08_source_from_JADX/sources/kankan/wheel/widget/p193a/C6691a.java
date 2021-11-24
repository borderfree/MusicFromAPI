package kankan.wheel.widget.p193a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;

/* renamed from: kankan.wheel.widget.a.a */
public abstract class C6691a implements C6692b {

    /* renamed from: a */
    private List<DataSetObserver> f23529a;

    /* renamed from: a */
    public View mo20804a(View view, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: a */
    public void mo20805a(DataSetObserver dataSetObserver) {
        if (this.f23529a == null) {
            this.f23529a = new LinkedList();
        }
        this.f23529a.add(dataSetObserver);
    }

    /* renamed from: b */
    public void mo20806b(DataSetObserver dataSetObserver) {
        if (this.f23529a != null) {
            this.f23529a.remove(dataSetObserver);
        }
    }
}
