package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.internal.C2258x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.facebook.appevents.internal.e */
public class C2164e {

    /* renamed from: a */
    private static final HashMap<String, Method> f7063a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f7064b = new HashMap<>();

    /* renamed from: c */
    private static final String f7065c = C2164e.class.getCanonicalName();

    /* renamed from: a */
    public static Object m10027a(Context context, IBinder iBinder) {
        String str;
        String str2;
        try {
            Method method = (Method) f7063a.get("iap_get_interface");
            if (method == null) {
                method = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[]{IBinder.class});
                f7063a.put("iap_get_interface", method);
            }
            Object[] objArr = {iBinder};
            C2258x.m10384a(f7065c, "In-app billing service connected");
            return method.invoke(null, objArr);
        } catch (ClassNotFoundException e) {
            e = e;
            str = f7065c;
            str2 = "com.android.vending.billing.IInAppBillingService$Stub is not available, please add com.android.vending.billing.IInAppBillingService to the project.";
            Log.e(str, str2, e);
            return null;
        } catch (NoSuchMethodException e2) {
            e = e2;
            str = f7065c;
            str2 = "com.android.vending.billing.IInAppBillingService$Stub.asInterface method not found";
            Log.e(str, str2, e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            str = f7065c;
            str2 = "Illegal access to method com.android.vending.billing.IInAppBillingService$Stub.asInterface";
            Log.e(str, str2, e);
            return null;
        } catch (InvocationTargetException e4) {
            e = e4;
            str = f7065c;
            str2 = "Invocation target exception in com.android.vending.billing.IInAppBillingService$Stub.asInterface";
            Log.e(str, str2, e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m10028a(Context context, String str, Object obj, boolean z) {
        String str2;
        String str3;
        if (obj == null || str == "") {
            return "";
        }
        try {
            Method method = (Method) f7063a.get("iap_get_sku_details");
            Class cls = (Class) f7064b.get("com.android.vending.billing.IInAppBillingService");
            if (method == null || cls == null) {
                cls = context.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
                method = cls.getDeclaredMethod("getSkuDetails", new Class[]{Integer.TYPE, String.class, String.class, Bundle.class});
                f7063a.put("iap_get_sku_details", method);
                f7064b.put("com.android.vending.billing.IInAppBillingService", cls);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object cast = cls.cast(obj);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(3);
            objArr[1] = context.getPackageName();
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Bundle bundle2 = (Bundle) method.invoke(cast, objArr);
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                return stringArrayList.size() < 1 ? "" : (String) stringArrayList.get(0);
            }
        } catch (ClassNotFoundException e) {
            e = e;
            str3 = f7065c;
            str2 = "com.android.vending.billing.IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to the project, and import the IInAppBillingService.aidl file into this package";
            Log.e(str3, str2, e);
            return "";
        } catch (NoSuchMethodException e2) {
            e = e2;
            str3 = f7065c;
            str2 = "com.android.vending.billing.IInAppBillingService.getSkuDetails method is not available";
            Log.e(str3, str2, e);
            return "";
        } catch (InvocationTargetException e3) {
            e = e3;
            str3 = f7065c;
            str2 = "Invocation target exception in com.android.vending.billing.IInAppBillingService.getSkuDetails";
            Log.e(str3, str2, e);
            return "";
        } catch (IllegalAccessException e4) {
            e = e4;
            str3 = f7065c;
            str2 = "Illegal access to method com.android.vending.billing.IInAppBillingService.getSkuDetails";
            Log.e(str3, str2, e);
            return "";
        }
        return "";
    }
}
