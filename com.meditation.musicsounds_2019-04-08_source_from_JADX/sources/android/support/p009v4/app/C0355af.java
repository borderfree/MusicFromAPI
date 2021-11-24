package android.support.p009v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.content.C0452b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.af */
public final class C0355af implements Iterable<Intent> {

    /* renamed from: a */
    private static final C0358c f1027a = (VERSION.SDK_INT >= 16 ? new C0357b() : new C0358c());

    /* renamed from: b */
    private final ArrayList<Intent> f1028b = new ArrayList<>();

    /* renamed from: c */
    private final Context f1029c;

    /* renamed from: android.support.v4.app.af$a */
    public interface C0356a {
        /* renamed from: a_ */
        Intent mo1402a_();
    }

    /* renamed from: android.support.v4.app.af$b */
    static class C0357b extends C0358c {
        C0357b() {
        }

        /* renamed from: a */
        public PendingIntent mo1403a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.app.af$c */
    static class C0358c {
        C0358c() {
        }

        /* renamed from: a */
        public PendingIntent mo1403a(Context context, Intent[] intentArr, int i, int i2, Bundle bundle) {
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(context, i, intentArr, i2);
        }
    }

    private C0355af(Context context) {
        this.f1029c = context;
    }

    /* renamed from: a */
    public static C0355af m1481a(Context context) {
        return new C0355af(context);
    }

    /* renamed from: a */
    public PendingIntent mo1394a(int i, int i2) {
        return mo1395a(i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo1395a(int i, int i2, Bundle bundle) {
        if (!this.f1028b.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f1028b.toArray(new Intent[this.f1028b.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return f1027a.mo1403a(this.f1029c, intentArr, i, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: a */
    public C0355af mo1396a(Activity activity) {
        Intent a_ = activity instanceof C0356a ? ((C0356a) activity).mo1402a_() : null;
        if (a_ == null) {
            a_ = C0417w.m1922a(activity);
        }
        if (a_ != null) {
            ComponentName component = a_.getComponent();
            if (component == null) {
                component = a_.resolveActivity(this.f1029c.getPackageManager());
            }
            mo1397a(component);
            mo1398a(a_);
        }
        return this;
    }

    /* renamed from: a */
    public C0355af mo1397a(ComponentName componentName) {
        int size = this.f1028b.size();
        try {
            Context context = this.f1029c;
            while (true) {
                Intent a = C0417w.m1923a(context, componentName);
                if (a == null) {
                    return this;
                }
                this.f1028b.add(size, a);
                context = this.f1029c;
                componentName = a.getComponent();
            }
        } catch (NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public C0355af mo1398a(Intent intent) {
        this.f1028b.add(intent);
        return this;
    }

    /* renamed from: a */
    public void mo1399a() {
        mo1400a((Bundle) null);
    }

    /* renamed from: a */
    public void mo1400a(Bundle bundle) {
        if (!this.f1028b.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f1028b.toArray(new Intent[this.f1028b.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0452b.m2062a(this.f1029c, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1029c.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1028b.iterator();
    }
}
