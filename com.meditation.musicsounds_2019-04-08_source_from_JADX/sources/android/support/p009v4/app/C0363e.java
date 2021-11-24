package android.support.p009v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: android.support.v4.app.e */
abstract class C0363e extends C0362d {

    /* renamed from: b */
    boolean f1058b;

    C0363e() {
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f1058b && i != -1) {
            m1531b(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f1057a && i != -1) {
            m1531b(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
