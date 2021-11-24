package com.seattleclouds.modules.order.indiapay.p179b;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.widget.DatePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.seattleclouds.modules.order.indiapay.b.c */
public class C5982c extends C0366g implements OnDateSetListener {

    /* renamed from: ae */
    public static final String f21199ae = "c";

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(mo1318s(), this, instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMinDate(instance.getTimeInMillis());
        return datePickerDialog;
    }

    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        String str = "dd/MM/yyyy";
        Calendar instance = Calendar.getInstance();
        instance.set(i, i2, i3);
        try {
            String format = new SimpleDateFormat(str, Locale.getDefault()).format(instance.getTime());
            Intent intent = new Intent();
            intent.putExtra("date", format);
            mo1311o().mo1222a(mo1315p(), -1, intent);
        } catch (Exception unused) {
        }
    }
}
