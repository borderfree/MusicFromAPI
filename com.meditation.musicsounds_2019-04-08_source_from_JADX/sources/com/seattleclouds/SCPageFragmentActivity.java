package com.seattleclouds;

import android.os.Bundle;

public class SCPageFragmentActivity extends C6348n {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            int r0 = com.seattleclouds.C5451m.C5460i.activity_sc_page
            r4.setContentView(r0)
            if (r5 == 0) goto L_0x0024
            java.lang.String r0 = "STATE_CONNECTING_BG_PLAYER"
            boolean r5 = r5.getBoolean(r0)
            if (r5 == 0) goto L_0x0023
            com.seattleclouds.util.ah r5 = com.seattleclouds.App.f18487T
            android.support.v4.app.l r0 = r4.mo1469g()
            java.lang.String r1 = com.seattleclouds.util.C6585ah.C6587a.f23301ae
            android.support.v4.app.Fragment r0 = r0.mo1535a(r1)
            android.support.v4.app.g r0 = (android.support.p009v4.app.C0366g) r0
            r5.mo20573a(r0)
        L_0x0023:
            return
        L_0x0024:
            android.content.Intent r5 = r4.getIntent()
            android.os.Bundle r5 = r5.getExtras()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x006f
            java.lang.String r2 = "ARG_PAGE_FRAGMENT_INFO"
            android.os.Parcelable r5 = r5.getParcelable(r2)
            com.seattleclouds.FragmentInfo r5 = (com.seattleclouds.FragmentInfo) r5
            if (r5 == 0) goto L_0x006f
            java.lang.String r2 = r5.mo16867a()
            if (r2 == 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            android.os.Bundle r3 = r5.mo16869b()
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            r2 = r2 & r3
            if (r2 == 0) goto L_0x006f
            java.lang.String r1 = r5.mo16867a()
            android.os.Bundle r5 = r5.mo16869b()
            android.support.v4.app.Fragment r5 = android.support.p009v4.app.Fragment.m1271a(r4, r1, r5)
            android.support.v4.app.l r1 = r4.mo1469g()
            android.support.v4.app.q r1 = r1.mo1536a()
            int r2 = com.seattleclouds.C5451m.C5458g.sc_page_fragment
            java.lang.String r3 = "pageFragment"
            android.support.v4.app.q r5 = r1.mo1411a(r2, r5, r3)
            r5.mo1428c()
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r0 != 0) goto L_0x0079
            java.lang.String r5 = "SCPageFragmentActivity"
            java.lang.String r0 = "Root fragment info not specified or invalid"
            android.util.Log.w(r5, r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.SCPageFragmentActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("STATE_CONNECTING_BG_PLAYER", App.f18487T.mo20582g());
        super.onSaveInstanceState(bundle);
    }
}
