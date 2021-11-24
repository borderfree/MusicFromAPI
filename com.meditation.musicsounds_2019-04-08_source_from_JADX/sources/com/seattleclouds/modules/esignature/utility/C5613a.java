package com.seattleclouds.modules.esignature.utility;

import android.app.Activity;
import android.os.Bundle;
import com.seattleclouds.App;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.esignature.C5610h;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.esignature.utility.a */
public class C5613a {
    /* renamed from: a */
    public static Transaction m27858a(Bundle bundle) {
        Transaction transaction = new Transaction();
        transaction.mo18114a(bundle.getString("name", ""));
        transaction.mo18117b(bundle.getString("description", ""));
        transaction.mo18120c(bundle.getString("status", ""));
        if (m27861a(bundle.getString("update", "")) != null) {
            transaction.mo18115a(m27861a(bundle.getString("update", "")));
        }
        if (m27861a(bundle.getString("create", "")) != null) {
            transaction.mo18118b(m27861a(bundle.getString("create", "")));
        }
        transaction.mo18122d(bundle.getString("rId", ""));
        transaction.mo18125e(bundle.getString("pId", ""));
        transaction.mo18128g(bundle.getString("emailMessage", ""));
        return transaction;
    }

    /* renamed from: a */
    public static Transaction m27859a(JSONObject jSONObject) {
        Transaction transaction = new Transaction();
        transaction.mo18114a(jSONObject.getString("name"));
        transaction.mo18117b(jSONObject.getString("description"));
        transaction.mo18122d(jSONObject.getString("roleId"));
        transaction.mo18125e(jSONObject.getString("packageId"));
        transaction.mo18120c(jSONObject.getString("transactionStatus"));
        transaction.mo18115a(m27861a(jSONObject.getString("update")));
        transaction.mo18118b(m27861a(jSONObject.getString("created")));
        transaction.mo18113a(jSONObject.getInt("numberOfDocuments"));
        transaction.mo18128g(jSONObject.getString("emailMessage"));
        return transaction;
    }

    /* renamed from: a */
    public static String m27860a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(date);
    }

    /* renamed from: a */
    public static Date m27861a(String str) {
        return m27862a(str, "yyyy-MM-dd'T'HH:mm:ss");
    }

    /* renamed from: a */
    public static Date m27862a(String str, String str2) {
        if (str != null && !str.isEmpty() && str2 != null && !str2.isEmpty()) {
            try {
                return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m27863a(Bundle bundle, Activity activity) {
        App.m25619a(new FragmentInfo(C5610h.class.getName(), bundle), activity);
    }

    /* renamed from: a */
    public static void m27864a(Transaction transaction, Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("transaction", transaction);
        m27863a(bundle, activity);
    }
}
