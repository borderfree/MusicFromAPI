package com.seattleclouds.paypal;

import android.content.Intent;
import com.paypal.PayPalController;
import com.seattleclouds.App;
import com.seattleclouds.C6557s;
import java.util.Observer;

/* renamed from: com.seattleclouds.paypal.b */
public class C6356b {

    /* renamed from: a */
    private static final String f22568a = "b";

    /* renamed from: b */
    private static PayPalController f22569b;

    /* renamed from: c */
    private static boolean f22570c;

    /* renamed from: com.seattleclouds.paypal.b$a */
    private static class C6358a implements PayPalController {
        private C6358a() {
        }

        public void addDeliveryAmount(boolean z, double d, double d2) {
        }

        public void addObserver(Observer observer) {
        }

        public void addProduct(String str, int i, double d, String str2, String str3) {
        }

        public void addTaxAmount(double d) {
        }

        public void clearProducts() {
        }

        public void initialize(C6557s sVar, boolean z, String str, String str2, String str3, String str4) {
        }

        public void makePayment(String str, String str2, String str3) {
        }

        public boolean onActivityResult(int i, int i2, Intent intent) {
            return false;
        }

        public void setFreeShippingItemName(String str) {
        }

        public void startService() {
        }

        public void stopService() {
        }
    }

    /* renamed from: a */
    public static boolean m30879a() {
        return f22570c;
    }

    /* renamed from: b */
    public static synchronized PayPalController m30880b() {
        PayPalController payPalController;
        synchronized (C6356b.class) {
            if (f22569b == null) {
                boolean z = false;
                f22569b = (PayPalController) App.m25613a(App.m25615a("com.paypal.PayPalControllerImpl", "getInstance", (Class<?>[]) new Class[0]), (Object) null, new Object[0]);
                if (f22569b != null) {
                    z = true;
                }
                f22570c = z;
                if (f22569b == null) {
                    f22569b = new C6358a();
                }
            }
            payPalController = f22569b;
        }
        return payPalController;
    }
}
