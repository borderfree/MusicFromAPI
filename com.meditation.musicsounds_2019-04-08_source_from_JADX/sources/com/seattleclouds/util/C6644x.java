package com.seattleclouds.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;

/* renamed from: com.seattleclouds.util.x */
public class C6644x {
    /* renamed from: a */
    public static String m32095a(String str, double d) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        if (str == null || str.length() == 0) {
            str = "USD";
        }
        String symbol = Currency.getInstance(str).getSymbol();
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(symbol);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return currencyInstance.format(d);
    }
}
