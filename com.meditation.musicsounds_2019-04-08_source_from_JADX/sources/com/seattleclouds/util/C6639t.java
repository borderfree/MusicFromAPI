package com.seattleclouds.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.util.t */
public class C6639t {
    /* renamed from: a */
    public static void m32080a(Activity activity) {
        if (activity != null) {
            Toast.makeText(activity, C5462k.error_activity_not_found, 0).show();
        }
    }

    /* renamed from: a */
    public static void m32081a(Activity activity, String str) {
        if (activity != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("geo:0,0?q=");
            sb.append(str);
            String sb2 = sb.toString();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(sb2));
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://maps.google.com/maps?q=");
                sb3.append(str);
                String sb4 = sb3.toString();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(sb4));
                m32083a(activity, intent2);
            }
        }
    }

    /* renamed from: a */
    public static void m32082a(Activity activity, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("sms:");
        sb.append(str);
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString()));
        intent.putExtra("sms_body", str2);
        intent.putExtra("android.intent.extra.TEXT", str2);
        m32083a(activity, intent);
    }

    /* renamed from: a */
    public static boolean m32083a(Activity activity, Intent intent) {
        if (activity == null) {
            return false;
        }
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            m32080a(activity);
            return false;
        }
    }

    /* renamed from: b */
    public static void m32084b(Activity activity, String str) {
        if (activity != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("geo:0,0?q=");
            sb.append(str);
            String sb2 = sb.toString();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(sb2));
            try {
                activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://maps.google.com/maps?q=");
                sb3.append(str);
                String sb4 = sb3.toString();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(sb4));
                m32083a(activity, intent2);
            }
        }
    }

    /* renamed from: c */
    public static void m32085c(Activity activity, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mailto:");
        sb.append(str);
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            int indexOf = str.indexOf(63);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(44);
            if (indexOf2 != -1) {
                str = str.substring(0, indexOf2);
            }
            m32086d(activity, str);
        }
    }

    /* renamed from: d */
    public static void m32086d(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setType("text/plain");
            m32083a(activity, intent);
        }
    }
}
