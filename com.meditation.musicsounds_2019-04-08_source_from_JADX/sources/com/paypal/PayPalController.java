package com.paypal;

import android.content.Intent;
import com.seattleclouds.C6557s;
import java.util.Observer;

public interface PayPalController {
    void addDeliveryAmount(boolean z, double d, double d2);

    void addObserver(Observer observer);

    void addProduct(String str, int i, double d, String str2, String str3);

    void addTaxAmount(double d);

    void clearProducts();

    void initialize(C6557s sVar, boolean z, String str, String str2, String str3, String str4);

    void makePayment(String str, String str2, String str3);

    boolean onActivityResult(int i, int i2, Intent intent);

    void setFreeShippingItemName(String str);

    void startService();

    void stopService();
}
