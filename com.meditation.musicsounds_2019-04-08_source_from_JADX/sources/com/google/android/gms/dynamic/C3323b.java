package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.p129d.C4166a;
import com.google.android.gms.internal.p129d.C4167b;

/* renamed from: com.google.android.gms.dynamic.b */
public interface C3323b extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.b$a */
    public static abstract class C3324a extends C4167b implements C3323b {

        /* renamed from: com.google.android.gms.dynamic.b$a$a */
        public static class C3325a extends C4166a implements C3323b {
            C3325a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C3324a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C3323b m15129a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C3323b ? (C3323b) queryLocalInterface : new C3325a(iBinder);
        }
    }
}
