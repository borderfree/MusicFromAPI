package android.support.p009v4.app;

import android.arch.lifecycle.C0038o;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p009v4.app.C0345a.C0347a;
import android.support.p009v4.app.C0345a.C0348b;
import android.support.p009v4.app.C0345a.C0349c;
import android.support.p009v4.p019g.C0511n;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.h */
public class C0367h extends C0363e implements C0347a, C0349c {

    /* renamed from: c */
    final Handler f1072c = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (C0367h.this.f1077h) {
                        C0367h.this.mo1461a(false);
                        return;
                    }
                    return;
                case 2:
                    C0367h.this.mo1464c();
                    C0367h.this.f1073d.mo1527n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: d */
    final C0372j f1073d = C0372j.m1589a((C0373k<?>) new C0369a<Object>());

    /* renamed from: e */
    C0415v f1074e;

    /* renamed from: f */
    boolean f1075f;

    /* renamed from: g */
    boolean f1076g;

    /* renamed from: h */
    boolean f1077h = true;

    /* renamed from: i */
    boolean f1078i = true;

    /* renamed from: j */
    boolean f1079j;

    /* renamed from: k */
    boolean f1080k;

    /* renamed from: l */
    int f1081l;

    /* renamed from: m */
    C0511n<String> f1082m;

    /* renamed from: n */
    private C0038o f1083n;

    /* renamed from: android.support.v4.app.h$a */
    class C0369a extends C0373k<C0367h> {
        public C0369a() {
            super(C0367h.this);
        }

        /* renamed from: a */
        public View mo1330a(int i) {
            return C0367h.this.findViewById(i);
        }

        /* renamed from: a */
        public void mo1492a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C0367h.this.mo1459a(fragment, intent, i, bundle);
        }

        /* renamed from: a */
        public void mo1493a(Fragment fragment, String[] strArr, int i) {
            C0367h.this.mo1460a(fragment, strArr, i);
        }

        /* renamed from: a */
        public void mo1494a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C0367h.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: a */
        public boolean mo1331a() {
            Window window = C0367h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: a */
        public boolean mo1495a(Fragment fragment) {
            return !C0367h.this.isFinishing();
        }

        /* renamed from: a */
        public boolean mo1496a(String str) {
            return C0345a.m1457a(C0367h.this, str);
        }

        /* renamed from: b */
        public LayoutInflater mo1497b() {
            return C0367h.this.getLayoutInflater().cloneInContext(C0367h.this);
        }

        /* renamed from: b */
        public void mo1498b(Fragment fragment) {
            C0367h.this.mo1458a(fragment);
        }

        /* renamed from: c */
        public void mo1499c() {
            C0367h.this.mo1467e();
        }

        /* renamed from: d */
        public boolean mo1500d() {
            return C0367h.this.getWindow() != null;
        }

        /* renamed from: e */
        public int mo1501e() {
            Window window = C0367h.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }
    }

    /* renamed from: android.support.v4.app.h$b */
    static final class C0370b {

        /* renamed from: a */
        Object f1086a;

        /* renamed from: b */
        C0038o f1087b;

        /* renamed from: c */
        C0393n f1088c;

        C0370b() {
        }
    }

    /* renamed from: a */
    private static boolean m1556a(C0374l lVar, State state) {
        boolean z = false;
        for (Fragment fragment : lVar.mo1543e()) {
            if (fragment != null) {
                if (fragment.mo65B_().mo41a().isAtLeast(State.STARTED)) {
                    fragment.f936ad.mo67a(state);
                    z = true;
                }
                C0374l w = fragment.mo1324w();
                if (w != null) {
                    z |= m1556a(w, state);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m1557b(Fragment fragment) {
        if (this.f1082m.mo2027b() < 65534) {
            while (this.f1082m.mo2036f(this.f1081l) >= 0) {
                this.f1081l = (this.f1081l + 1) % 65534;
            }
            int i = this.f1081l;
            this.f1082m.mo2029b(i, fragment.f942p);
            this.f1081l = (this.f1081l + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: i */
    private void mo3083i() {
        do {
        } while (m1556a(mo1469g(), State.CREATED));
    }

    /* renamed from: B_ */
    public Lifecycle mo65B_() {
        return super.mo65B_();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo1440a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1073d.mo1504a(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public final void mo1377a(int i) {
        if (!this.f1080k && i != -1) {
            m1531b(i);
        }
    }

    /* renamed from: a */
    public void mo1458a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo1459a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.f1058b = true;
        if (i == -1) {
            try {
                C0345a.m1455a(this, intent, -1, bundle);
            } finally {
                this.f1058b = false;
            }
        } else {
            m1531b(i);
            C0345a.m1455a(this, intent, ((m1557b(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f1058b = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1460a(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C0345a.m1456a(this, strArr, i);
            return;
        }
        m1531b(i);
        try {
            this.f1080k = true;
            C0345a.m1456a(this, strArr, ((m1557b(fragment) + 1) << 16) + (i & 65535));
        } finally {
            this.f1080k = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1461a(boolean z) {
        if (!this.f1078i) {
            this.f1078i = true;
            this.f1079j = z;
            this.f1072c.removeMessages(1);
            mo1468f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1462a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* renamed from: b_ */
    public C0038o mo1463b_() {
        if (getApplication() != null) {
            if (this.f1083n == null) {
                this.f1083n = new C0038o();
            }
            return this.f1083n;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1464c() {
        this.f1073d.mo1521h();
    }

    /* renamed from: d */
    public Object mo1465d() {
        return null;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String sb2 = sb.toString();
        printWriter.print(sb2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1075f);
        printWriter.print("mResumed=");
        printWriter.print(this.f1076g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1077h);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f1078i);
        if (this.f1074e != null) {
            this.f1074e.mo1355a(sb2, fileDescriptor, printWriter, strArr);
        }
        this.f1073d.mo1503a().mo1539a(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    /* renamed from: e */
    public void mo1467e() {
        invalidateOptionsMenu();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1468f() {
        this.f1073d.mo1524k();
    }

    /* renamed from: g */
    public C0374l mo1469g() {
        return this.f1073d.mo1503a();
    }

    /* renamed from: h */
    public C0415v mo1470h() {
        if (this.f1074e != null) {
            return this.f1074e;
        }
        this.f1074e = new LoaderManagerImpl(this, mo1463b_());
        return this.f1074e;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1073d.mo1512b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String str = (String) this.f1082m.mo2025a(i4);
            this.f1082m.mo2031c(i4);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f1073d.mo1502a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w("FragmentActivity", sb.toString());
            } else {
                a.mo1222a(i & 65535, i2, intent);
            }
            return;
        }
        C0348b a2 = C0345a.m1453a();
        if (a2 == null || !a2.mo1375a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        C0374l a = this.f1073d.mo1503a();
        boolean f = a.mo1544f();
        if (!f || VERSION.SDK_INT > 25) {
            if (f || !a.mo1541c()) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1073d.mo1512b();
        this.f1073d.mo1505a(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0393n nVar = null;
        this.f1073d.mo1507a((Fragment) null);
        super.onCreate(bundle);
        C0370b bVar = (C0370b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.f1083n = bVar.f1087b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0372j jVar = this.f1073d;
            if (bVar != null) {
                nVar = bVar.f1088c;
            }
            jVar.mo1506a(parcelable, nVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1081l = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1082m = new C0511n<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f1082m.mo2029b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f1082m == null) {
            this.f1082m = new C0511n<>();
            this.f1081l = 0;
        }
        this.f1073d.mo1518e();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f1073d.mo1510a(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo1461a(false);
        if (this.f1083n != null && !this.f1079j) {
            this.f1083n.mo86a();
        }
        this.f1073d.mo1525l();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1073d.mo1526m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f1073d.mo1511a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f1073d.mo1515b(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1073d.mo1508a(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f1073d.mo1512b();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f1073d.mo1513b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1076g = false;
        if (this.f1072c.hasMessages(2)) {
            this.f1072c.removeMessages(2);
            mo1464c();
        }
        this.f1073d.mo1522i();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1073d.mo1514b(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.f1072c.removeMessages(2);
        mo1464c();
        this.f1073d.mo1527n();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : mo1462a(view, menu) | this.f1073d.mo1509a(menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1073d.mo1512b();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String str = (String) this.f1082m.mo2025a(i3);
            this.f1082m.mo2031c(i3);
            if (str == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a = this.f1073d.mo1502a(str);
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity result no fragment exists for who: ");
                sb.append(str);
                Log.w("FragmentActivity", sb.toString());
            } else {
                a.mo1224a(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f1072c.sendEmptyMessage(2);
        this.f1076g = true;
        this.f1073d.mo1527n();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.f1077h) {
            mo1461a(true);
        }
        Object d = mo1465d();
        C0393n d2 = this.f1073d.mo1517d();
        if (d2 == null && this.f1083n == null && d == null) {
            return null;
        }
        C0370b bVar = new C0370b();
        bVar.f1086a = d;
        bVar.f1087b = this.f1083n;
        bVar.f1088c = d2;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo3083i();
        Parcelable c = this.f1073d.mo1516c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
        if (this.f1082m.mo2027b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1081l);
            int[] iArr = new int[this.f1082m.mo2027b()];
            String[] strArr = new String[this.f1082m.mo2027b()];
            for (int i = 0; i < this.f1082m.mo2027b(); i++) {
                iArr[i] = this.f1082m.mo2034d(i);
                strArr[i] = (String) this.f1082m.mo2035e(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f1077h = false;
        this.f1078i = false;
        this.f1072c.removeMessages(1);
        if (!this.f1075f) {
            this.f1075f = true;
            this.f1073d.mo1519f();
        }
        this.f1073d.mo1512b();
        this.f1073d.mo1527n();
        this.f1073d.mo1520g();
    }

    public void onStateNotSaved() {
        this.f1073d.mo1512b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1077h = true;
        mo3083i();
        this.f1072c.sendEmptyMessage(1);
        this.f1073d.mo1523j();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.f1058b && i != -1) {
            m1531b(i);
        }
        super.startActivityForResult(intent, i);
    }

    public /* bridge */ /* synthetic */ void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
