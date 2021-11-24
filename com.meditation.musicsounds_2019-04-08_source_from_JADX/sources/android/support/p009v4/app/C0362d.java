package android.support.p009v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v4.app.d */
abstract class C0362d extends C0354ae {

    /* renamed from: a */
    boolean f1057a;

    C0362d() {
    }

    /* renamed from: b */
    static void m1531b(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo1440a(View view, String str, Context context, AttributeSet attributeSet);

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo1440a(view, str, context, attributeSet);
        return a == null ? super.onCreateView(view, str, context, attributeSet) : a;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View a = mo1440a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f1057a && i != -1) {
            m1531b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
