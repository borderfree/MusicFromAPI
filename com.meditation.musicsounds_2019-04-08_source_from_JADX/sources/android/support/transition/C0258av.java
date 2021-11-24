package android.support.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: android.support.transition.av */
class C0258av implements C0259aw {

    /* renamed from: a */
    private final WindowId f746a;

    C0258av(View view) {
        this.f746a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0258av) && ((C0258av) obj).f746a.equals(this.f746a);
    }

    public int hashCode() {
        return this.f746a.hashCode();
    }
}
