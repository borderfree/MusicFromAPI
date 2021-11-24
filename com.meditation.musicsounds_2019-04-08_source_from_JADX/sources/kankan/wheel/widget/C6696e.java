package kankan.wheel.widget;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedList;
import java.util.List;

/* renamed from: kankan.wheel.widget.e */
public class C6696e {

    /* renamed from: a */
    private List<View> f23530a;

    /* renamed from: b */
    private List<View> f23531b;

    /* renamed from: c */
    private WheelView f23532c;

    public C6696e(WheelView wheelView) {
        this.f23532c = wheelView;
    }

    /* renamed from: a */
    private View m32294a(List<View> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = (View) list.get(0);
        list.remove(0);
        return view;
    }

    /* renamed from: a */
    private List<View> m32295a(View view, List<View> list) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    /* renamed from: a */
    private void m32296a(View view, int i) {
        int a = this.f23532c.getViewAdapter().mo19682a();
        if ((i < 0 || i >= a) && !this.f23532c.mo20781c()) {
            this.f23531b = m32295a(view, this.f23531b);
            return;
        }
        while (i < 0) {
            i += a;
        }
        int i2 = i % a;
        this.f23530a = m32295a(view, this.f23530a);
    }

    /* renamed from: a */
    public int mo20809a(LinearLayout linearLayout, int i, C6690a aVar) {
        int i2 = 0;
        int i3 = i;
        while (i2 < linearLayout.getChildCount()) {
            if (!aVar.mo20801a(i)) {
                m32296a(linearLayout.getChildAt(i2), i);
                linearLayout.removeViewAt(i2);
                if (i2 == 0) {
                    i3++;
                }
            } else {
                i2++;
            }
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public View mo20810a() {
        return m32294a(this.f23530a);
    }

    /* renamed from: b */
    public View mo20811b() {
        return m32294a(this.f23531b);
    }

    /* renamed from: c */
    public void mo20812c() {
        if (this.f23530a != null) {
            this.f23530a.clear();
        }
        if (this.f23531b != null) {
            this.f23531b.clear();
        }
    }
}
