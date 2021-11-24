package com.seattleclouds.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.videolist.OpenPdfOptions;
import java.io.File;
import java.net.URLConnection;

/* renamed from: com.seattleclouds.util.z */
public class C6647z {
    /* renamed from: a */
    public static void m32113a(final String str, final Activity activity, OpenPdfOptions openPdfOptions) {
        if (openPdfOptions == null) {
            openPdfOptions = new OpenPdfOptions();
        }
        boolean booleanValue = openPdfOptions.mo19684a().booleanValue();
        boolean booleanValue2 = openPdfOptions.mo19685b().booleanValue();
        if (booleanValue && booleanValue2) {
            String[] strArr = {activity.getString(C5462k.pdfreader_open_pdf_in_internal_viewer), activity.getString(C5462k.pdfreader_open_pdf_in_external_viewer)};
            C0766a aVar = new C0766a(activity);
            aVar.mo3047a(C5462k.pdfreader_pick_pdf_viewer_title).mo3058a((CharSequence[]) strArr, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (i != 0 || !C6647z.m32114a(str, activity)) {
                        C6647z.m32115b(str, activity);
                    }
                }
            });
            aVar.mo3065b().show();
        } else if (!booleanValue || !m32114a(str, activity)) {
            m32115b(str, activity);
        }
    }

    /* renamed from: a */
    public static boolean m32114a(String str, Activity activity) {
        FragmentInfo p = App.m25670p(str);
        if (p == null) {
            return false;
        }
        App.m25619a(p, activity);
        return true;
    }

    /* renamed from: b */
    public static boolean m32115b(String str, Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri a = C6598aq.m31937a(new File(str));
        intent.setDataAndType(a, URLConnection.guessContentTypeFromName(a.toString()));
        intent.setFlags(1);
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("PdfUtil", "No external PDF viewer installed", e);
            Toast.makeText(activity, C5462k.pdfreader_no_external_pdf_viewer_installed, 1).show();
            return false;
        }
    }
}
