package android.support.p023v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

/* renamed from: android.support.v7.app.k */
class C0780k extends C0776j {

    /* renamed from: t */
    private final UiModeManager f2270t;

    /* renamed from: android.support.v7.app.k$a */
    class C0781a extends C0777a {
        C0781a(Callback callback) {
            super(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0780k.this.mo3130p() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo3145a(callback);
        }
    }

    C0780k(Context context, Window window, C0768f fVar) {
        super(context, window, fVar);
        this.f2270t = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Callback mo3120a(Callback callback) {
        return new C0781a(callback);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo3144d(int i) {
        if (i == 0 && this.f2270t.getNightMode() == 0) {
            return -1;
        }
        return super.mo3144d(i);
    }
}
