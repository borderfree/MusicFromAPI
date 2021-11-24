package android.support.p023v7.app;

import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

/* renamed from: android.support.v7.app.i */
class C0774i extends C0780k {

    /* renamed from: android.support.v7.app.i$a */
    class C0775a extends C0781a {
        C0775a(Callback callback) {
            super(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0794d a = C0774i.this.mo3153a(0, true);
            if (!(a == null || a.f2319j == null)) {
                menu = a.f2319j;
            }
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    C0774i(Context context, Window window, C0768f fVar) {
        super(context, window, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Callback mo3120a(Callback callback) {
        return new C0775a(callback);
    }
}
