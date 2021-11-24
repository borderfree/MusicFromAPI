package android.support.p009v4.view.p021a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.c */
public class C0587c {

    /* renamed from: a */
    private final Object f1734a;

    /* renamed from: android.support.v4.view.a.c$a */
    static class C0588a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0587c f1735a;

        C0588a(C0587c cVar) {
            this.f1735a = cVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0583b a = this.f1735a.mo2402a(i);
            if (a == null) {
                return null;
            }
            return a.mo2350a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List a = this.f1735a.mo2404a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((C0583b) a.get(i2)).mo2350a());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1735a.mo2405a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.view.a.c$b */
    static class C0589b extends C0588a {
        C0589b(C0587c cVar) {
            super(cVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0583b b = this.f1735a.mo2406b(i);
            if (b == null) {
                return null;
            }
            return b.mo2350a();
        }
    }

    public C0587c() {
        Object obj = VERSION.SDK_INT >= 19 ? new C0589b(this) : VERSION.SDK_INT >= 16 ? new C0588a(this) : null;
        this.f1734a = obj;
    }

    public C0587c(Object obj) {
        this.f1734a = obj;
    }

    /* renamed from: a */
    public C0583b mo2402a(int i) {
        return null;
    }

    /* renamed from: a */
    public Object mo2403a() {
        return this.f1734a;
    }

    /* renamed from: a */
    public List<C0583b> mo2404a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean mo2405a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0583b mo2406b(int i) {
        return null;
    }
}
