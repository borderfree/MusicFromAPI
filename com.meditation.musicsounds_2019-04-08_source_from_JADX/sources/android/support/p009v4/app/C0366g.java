package android.support.p009v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.app.g */
public class C0366g extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: a */
    int f1063a = 0;

    /* renamed from: b */
    int f1064b = 0;

    /* renamed from: c */
    boolean f1065c = true;

    /* renamed from: d */
    boolean f1066d = true;

    /* renamed from: e */
    int f1067e = -1;

    /* renamed from: f */
    Dialog f1068f;

    /* renamed from: g */
    boolean f1069g;

    /* renamed from: h */
    boolean f1070h;

    /* renamed from: i */
    boolean f1071i;

    /* renamed from: a */
    public int mo1446a(C0396q qVar, String str) {
        this.f1070h = false;
        this.f1071i = true;
        qVar.mo1413a((Fragment) this, str);
        this.f1069g = false;
        this.f1067e = qVar.mo1428c();
        return this.f1067e;
    }

    /* renamed from: a */
    public void mo1447a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo1228a(Context context) {
        super.mo1228a(context);
        if (!this.f1071i) {
            this.f1070h = false;
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f1066d = this.f915I == 0;
        if (bundle != null) {
            this.f1063a = bundle.getInt("android:style", 0);
            this.f1064b = bundle.getInt("android:theme", 0);
            this.f1065c = bundle.getBoolean("android:cancelable", true);
            this.f1066d = bundle.getBoolean("android:showsDialog", this.f1066d);
            this.f1067e = bundle.getInt("android:backStackId", -1);
        }
    }

    /* renamed from: a */
    public void mo1448a(C0374l lVar, String str) {
        this.f1070h = false;
        this.f1071i = true;
        C0396q a = lVar.mo1536a();
        a.mo1413a((Fragment) this, str);
        a.mo1428c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1449a(boolean z) {
        if (!this.f1070h) {
            this.f1070h = true;
            this.f1071i = false;
            if (this.f1068f != null) {
                this.f1068f.dismiss();
            }
            this.f1069g = true;
            if (this.f1067e >= 0) {
                mo1322u().mo1537a(this.f1067e, 1);
                this.f1067e = -1;
            } else {
                C0396q a = mo1322u().mo1536a();
                a.mo1412a((Fragment) this);
                if (z) {
                    a.mo1431d();
                } else {
                    a.mo1428c();
                }
            }
        }
    }

    /* renamed from: b */
    public LayoutInflater mo1265b(Bundle bundle) {
        Context g;
        if (!this.f1066d) {
            return super.mo1265b(bundle);
        }
        this.f1068f = mo1452c(bundle);
        if (this.f1068f != null) {
            mo1447a(this.f1068f, this.f1063a);
            g = this.f1068f.getContext();
        } else {
            g = this.f909C.mo1529g();
        }
        return (LayoutInflater) g.getSystemService("layout_inflater");
    }

    /* renamed from: b */
    public void mo1450b() {
        mo1449a(false);
    }

    /* renamed from: b */
    public void mo1451b(boolean z) {
        this.f1066d = z;
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        return new Dialog(mo1318s(), mo1455e());
    }

    /* renamed from: c */
    public void mo1453c() {
        mo1449a(true);
    }

    /* renamed from: d */
    public Dialog mo1454d() {
        return this.f1068f;
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (this.f1066d) {
            View I = mo1199I();
            if (I != null) {
                if (I.getParent() == null) {
                    this.f1068f.setContentView(I);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            C0367h s = mo1318s();
            if (s != null) {
                this.f1068f.setOwnerActivity(s);
            }
            this.f1068f.setCancelable(this.f1065c);
            this.f1068f.setOnCancelListener(this);
            this.f1068f.setOnDismissListener(this);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f1068f.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    /* renamed from: e */
    public int mo1455e() {
        return this.f1064b;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (this.f1068f != null) {
            Bundle onSaveInstanceState = this.f1068f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f1063a != 0) {
            bundle.putInt("android:style", this.f1063a);
        }
        if (this.f1064b != 0) {
            bundle.putInt("android:theme", this.f1064b);
        }
        if (!this.f1065c) {
            bundle.putBoolean("android:cancelable", this.f1065c);
        }
        if (!this.f1066d) {
            bundle.putBoolean("android:showsDialog", this.f1066d);
        }
        if (this.f1067e != -1) {
            bundle.putInt("android:backStackId", this.f1067e);
        }
    }

    /* renamed from: f */
    public void mo1285f() {
        super.mo1285f();
        if (!this.f1071i && !this.f1070h) {
            this.f1070h = true;
        }
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        if (this.f1068f != null) {
            this.f1069g = false;
            this.f1068f.show();
        }
    }

    /* renamed from: h */
    public void mo1292h() {
        super.mo1292h();
        if (this.f1068f != null) {
            this.f1068f.hide();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        if (this.f1068f != null) {
            this.f1069g = true;
            this.f1068f.dismiss();
            this.f1068f = null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1069g) {
            mo1449a(true);
        }
    }
}
