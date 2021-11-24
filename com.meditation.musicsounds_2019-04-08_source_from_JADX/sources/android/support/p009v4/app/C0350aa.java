package android.support.p009v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.support.p009v4.app.C0419y.C0420a;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: android.support.v4.app.aa */
class C0350aa {

    /* renamed from: a */
    private static final Object f1011a = new Object();

    /* renamed from: b */
    private static Field f1012b;

    /* renamed from: c */
    private static boolean f1013c;

    /* renamed from: d */
    private static final Object f1014d = new Object();

    /* renamed from: a */
    public static Bundle m1461a(Builder builder, C0420a aVar) {
        builder.addAction(aVar.mo1700a(), aVar.mo1701b(), aVar.mo1702c());
        Bundle bundle = new Bundle(aVar.mo1703d());
        if (aVar.mo1705f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1465a(aVar.mo1705f()));
        }
        if (aVar.mo1706g() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1465a(aVar.mo1706g()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1704e());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m1462a(Notification notification) {
        String str;
        String str2;
        synchronized (f1011a) {
            if (f1013c) {
                return null;
            }
            try {
                if (f1012b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1013c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1012b = declaredField;
                }
                Bundle bundle = (Bundle) f1012b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1012b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                e = e;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1013c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1013c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m1463a(C0352ac acVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", acVar.mo1382a());
        bundle.putCharSequence("label", acVar.mo1383b());
        bundle.putCharSequenceArray("choices", acVar.mo1384c());
        bundle.putBoolean("allowFreeFormInput", acVar.mo1387f());
        bundle.putBundle("extras", acVar.mo1388g());
        Set<String> d = acVar.mo1385d();
        if (d != null && !d.isEmpty()) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m1464a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static Bundle[] m1465a(C0352ac[] acVarArr) {
        if (acVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[acVarArr.length];
        for (int i = 0; i < acVarArr.length; i++) {
            bundleArr[i] = m1463a(acVarArr[i]);
        }
        return bundleArr;
    }
}
