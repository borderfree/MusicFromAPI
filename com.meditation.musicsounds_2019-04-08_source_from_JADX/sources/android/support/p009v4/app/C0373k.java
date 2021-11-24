package android.support.p009v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.k */
public abstract class C0373k<E> extends C0371i {

    /* renamed from: a */
    private final Activity f1090a;

    /* renamed from: b */
    final Context f1091b;

    /* renamed from: c */
    final int f1092c;

    /* renamed from: d */
    final C0377m f1093d;

    /* renamed from: e */
    private final Handler f1094e;

    C0373k(Activity activity, Context context, Handler handler, int i) {
        this.f1093d = new C0377m();
        this.f1090a = activity;
        this.f1091b = context;
        this.f1094e = handler;
        this.f1092c = i;
    }

    C0373k(C0367h hVar) {
        this(hVar, hVar, hVar.f1072c, 0);
    }

    /* renamed from: a */
    public View mo1330a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo1492a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1091b.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo1493a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo1494a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo1331a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo1495a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo1496a(String str) {
        return false;
    }

    /* renamed from: b */
    public LayoutInflater mo1497b() {
        return LayoutInflater.from(this.f1091b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1498b(Fragment fragment) {
    }

    /* renamed from: c */
    public void mo1499c() {
    }

    /* renamed from: d */
    public boolean mo1500d() {
        return true;
    }

    /* renamed from: e */
    public int mo1501e() {
        return this.f1092c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Activity mo1528f() {
        return this.f1090a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Context mo1529g() {
        return this.f1091b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Handler mo1530h() {
        return this.f1094e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0377m mo1531i() {
        return this.f1093d;
    }
}
