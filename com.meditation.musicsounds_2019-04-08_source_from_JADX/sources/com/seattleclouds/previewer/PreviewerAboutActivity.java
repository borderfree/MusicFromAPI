package com.seattleclouds.previewer;

import android.webkit.WebView;
import com.seattleclouds.C5232ac;

public class PreviewerAboutActivity extends C5232ac {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public WebView f22571n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f22572o;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            int r6 = com.seattleclouds.C5451m.C5460i.about
            r5.setContentView(r6)
            java.lang.String r6 = "1.0"
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0021 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0021 }
            java.lang.String r2 = r0.versionName     // Catch:{ NameNotFoundException -> 0x0021 }
            int r6 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x0020 }
            r0 = r6
            r6 = r2
            goto L_0x0022
        L_0x0020:
            r6 = r2
        L_0x0021:
            r0 = 0
        L_0x0022:
            int r2 = com.seattleclouds.C5451m.C5462k.previewer_about_version
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r4[r0] = r6
            java.lang.String r6 = r5.getString(r2, r4)
            boolean r2 = com.seattleclouds.App.m25624a()
            if (r2 == 0) goto L_0x005a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = " - "
            r2.append(r6)
            java.lang.String r6 = com.seattleclouds.App.m25631b()
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.toUpperCase(r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L_0x005a:
            boolean r2 = com.seattleclouds.App.f18500b
            if (r2 == 0) goto L_0x006f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = " - DEBUG"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        L_0x006f:
            android.support.v7.app.a r2 = r5.mo3083i()
            r2.mo2998b(r6)
            int r6 = com.seattleclouds.C5451m.C5458g.aboutWebView
            android.view.View r6 = r5.findViewById(r6)
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            r5.f22571n = r6
            android.webkit.WebView r6 = r5.f22571n
            r6.setHorizontalScrollBarEnabled(r1)
            android.webkit.WebView r6 = r5.f22571n
            r6.setVerticalScrollbarOverlay(r0)
            android.webkit.WebView r6 = r5.f22571n
            r6.setPadding(r1, r1, r1, r1)
            android.webkit.WebView r6 = r5.f22571n
            android.webkit.WebSettings r6 = r6.getSettings()
            r6.setCacheMode(r3)
            android.webkit.WebView r6 = r5.f22571n
            r6.clearCache(r0)
            android.webkit.WebView r6 = r5.f22571n
            android.webkit.WebSettings r6 = r6.getSettings()
            r6.setLoadWithOverviewMode(r0)
            java.lang.Thread r6 = new java.lang.Thread
            com.seattleclouds.previewer.PreviewerAboutActivity$1 r0 = new com.seattleclouds.previewer.PreviewerAboutActivity$1
            r0.<init>()
            r6.<init>(r0)
            r6.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.previewer.PreviewerAboutActivity.onCreate(android.os.Bundle):void");
    }
}
