package com.seattleclouds.modules.voicerecord;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.util.C6620n;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.ftp.C6738b;
import org.apache.commons.net.p200io.C6745c;

/* renamed from: com.seattleclouds.modules.voicerecord.b */
public class C6327b extends C6671x {
    /* access modifiers changed from: private */

    /* renamed from: aA */
    public final BaseAdapter f22473aA = new BaseAdapter() {
        /* renamed from: a */
        public C6326a getItem(int i) {
            return (C6326a) C6327b.this.f22476ag.get(i);
        }

        public int getCount() {
            return C6327b.this.f22476ag.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6334a aVar;
            if (view == null) {
                view = C6327b.this.f22477ah.inflate(C5460i.voicerecord_upload_list_item, viewGroup, false);
                aVar = new C6334a();
                aVar.f22510a = (TextView) view.findViewById(C5458g.label);
                aVar.f22511b = (TextView) view.findViewById(C5458g.description);
                aVar.f22512c = (ProgressBar) view.findViewById(C5458g.progressBar);
                aVar.f22512c.setMax(100);
                view.setTag(aVar);
            } else {
                aVar = (C6334a) view.getTag();
            }
            C6327b.this.mo19738a(aVar, getItem(i));
            return view;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public String f22474ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public String f22475af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public ArrayList<C6326a> f22476ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public LayoutInflater f22477ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f22478ai;

    /* renamed from: aj */
    private String f22479aj;

    /* renamed from: ak */
    private String f22480ak;

    /* renamed from: al */
    private String f22481al;

    /* renamed from: am */
    private String f22482am;

    /* renamed from: an */
    private String f22483an;

    /* renamed from: ao */
    private String f22484ao;

    /* renamed from: ap */
    private String f22485ap;

    /* renamed from: aq */
    private String f22486aq;

    /* renamed from: ar */
    private String f22487ar;

    /* renamed from: as */
    private String f22488as;

    /* renamed from: at */
    private String f22489at;

    /* renamed from: au */
    private String f22490au;

    /* renamed from: av */
    private String f22491av;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public String f22492aw;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public String f22493ax;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public String f22494ay;

    /* renamed from: az */
    private final AsyncTask<Void, Integer, Void> f22495az = new AsyncTask<Void, Integer, Void>() {

        /* renamed from: b */
        private C6738b f22501b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f22502c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f22503d;

        /* renamed from: e */
        private ProgressDialog f22504e;

        /* renamed from: a */
        private void m30781a() {
            try {
                this.f22501b.mo21115b();
            } catch (IOException unused) {
            }
        }

        /* renamed from: a */
        private void m30783a(final String str) {
            m30781a();
            Iterator it = C6327b.this.f22476ag.iterator();
            while (it.hasNext()) {
                C6326a aVar = (C6326a) it.next();
                if (aVar.f22470e != 2) {
                    aVar.f22470e = 4;
                }
            }
            final C0367h s = C6327b.this.mo1318s();
            if (s != null) {
                s.runOnUiThread(new Runnable() {
                    public void run() {
                        C6327b.this.f22473aA.notifyDataSetChanged();
                        C6620n.m32034a((Context) s, (String) null, str);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:43|(2:48|49)|50|51) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0125 */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0122 A[SYNTHETIC, Splitter:B:48:0x0122] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0129 A[Catch:{ all -> 0x0148, IOException -> 0x014f }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r9) {
            /*
                r8 = this;
                r9 = 0
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ all -> 0x0148 }
                com.seattleclouds.modules.voicerecord.b r1 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = r1.f22496i     // Catch:{ all -> 0x0148 }
                r0.mo21110a(r1)     // Catch:{ all -> 0x0148 }
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ all -> 0x0148 }
                com.seattleclouds.modules.voicerecord.b r1 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ all -> 0x0148 }
                java.lang.String r1 = r1.f22474ae     // Catch:{ all -> 0x0148 }
                com.seattleclouds.modules.voicerecord.b r2 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ all -> 0x0148 }
                java.lang.String r2 = r2.f22475af     // Catch:{ all -> 0x0148 }
                boolean r0 = r0.mo21152d(r1, r2)     // Catch:{ all -> 0x0148 }
                if (r0 != 0) goto L_0x0035
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ all -> 0x0148 }
                org.apache.commons.net.ftp.b r1 = r8.f22501b     // Catch:{ all -> 0x0148 }
                int r1 = r1.mo21137k()     // Catch:{ all -> 0x0148 }
                java.lang.String r0 = r0.m30763e(r1)     // Catch:{ all -> 0x0148 }
                r8.m30783a(r0)     // Catch:{ all -> 0x0148 }
                android.app.ProgressDialog r0 = r8.f22504e     // Catch:{ IOException -> 0x014f }
                r0.dismiss()     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x0035:
                android.app.ProgressDialog r0 = r8.f22504e     // Catch:{ IOException -> 0x014f }
                r0.dismiss()     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                r0.mo21159s()     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                java.lang.String r1 = "/"
                boolean r0 = r0.mo21155i(r1)     // Catch:{ IOException -> 0x014f }
                if (r0 != 0) goto L_0x0059
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r1 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                int r1 = r1.mo21137k()     // Catch:{ IOException -> 0x014f }
                java.lang.String r0 = r0.m30763e(r1)     // Catch:{ IOException -> 0x014f }
                r8.m30783a(r0)     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x0059:
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                java.lang.String[] r0 = r0.mo21161u()     // Catch:{ IOException -> 0x014f }
                if (r0 != 0) goto L_0x0071
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r1 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                int r1 = r1.mo21137k()     // Catch:{ IOException -> 0x014f }
                java.lang.String r0 = r0.m30763e(r1)     // Catch:{ IOException -> 0x014f }
                r8.m30783a(r0)     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x0071:
                boolean r1 = r8.isCancelled()     // Catch:{ IOException -> 0x014f }
                if (r1 == 0) goto L_0x007b
                r8.m30781a()     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x007b:
                com.seattleclouds.modules.voicerecord.b r1 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                com.seattleclouds.modules.voicerecord.b r2 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                java.util.ArrayList r2 = r2.f22476ag     // Catch:{ IOException -> 0x014f }
                r1.m30753a(r0, r2)     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r0 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                r1 = 2
                boolean r0 = r0.mo21151d(r1)     // Catch:{ IOException -> 0x014f }
                if (r0 != 0) goto L_0x009f
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                org.apache.commons.net.ftp.b r1 = r8.f22501b     // Catch:{ IOException -> 0x014f }
                int r1 = r1.mo21137k()     // Catch:{ IOException -> 0x014f }
                java.lang.String r0 = r0.m30763e(r1)     // Catch:{ IOException -> 0x014f }
                r8.m30783a(r0)     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x009f:
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ IOException -> 0x014f }
                java.util.ArrayList r0 = r0.f22476ag     // Catch:{ IOException -> 0x014f }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x014f }
            L_0x00a9:
                boolean r2 = r0.hasNext()     // Catch:{ IOException -> 0x014f }
                if (r2 == 0) goto L_0x0174
                java.lang.Object r2 = r0.next()     // Catch:{ IOException -> 0x014f }
                com.seattleclouds.modules.voicerecord.a r2 = (com.seattleclouds.modules.voicerecord.C6326a) r2     // Catch:{ IOException -> 0x014f }
                boolean r3 = r8.isCancelled()     // Catch:{ IOException -> 0x014f }
                if (r3 == 0) goto L_0x00bf
                r8.m30781a()     // Catch:{ IOException -> 0x014f }
                return r9
            L_0x00bf:
                r3 = 0
                r8.f22503d = r3     // Catch:{ IOException -> 0x014f }
                r4 = 1
                r2.f22470e = r4     // Catch:{ IOException -> 0x014f }
                java.lang.Integer[] r5 = new java.lang.Integer[r1]     // Catch:{ IOException -> 0x014f }
                int r6 = r8.f22502c     // Catch:{ IOException -> 0x014f }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x014f }
                r5[r3] = r6     // Catch:{ IOException -> 0x014f }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x014f }
                r5[r4] = r6     // Catch:{ IOException -> 0x014f }
                r8.publishProgress(r5)     // Catch:{ IOException -> 0x014f }
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0126, all -> 0x011e }
                java.lang.String r6 = r2.f22468c     // Catch:{ FileNotFoundException -> 0x0126, all -> 0x011e }
                r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0126, all -> 0x011e }
                java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0126, all -> 0x011e }
                r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0126, all -> 0x011e }
                org.apache.commons.net.ftp.b r5 = r8.f22501b     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                java.lang.String r7 = r2.f22466a     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                boolean r5 = r5.mo21147a(r7, r6)     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                if (r5 != 0) goto L_0x0116
                org.apache.commons.net.ftp.b r5 = r8.f22501b     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                int r5 = r5.mo21137k()     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                com.seattleclouds.modules.voicerecord.b r7 = com.seattleclouds.modules.voicerecord.C6327b.this     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                java.lang.String r5 = r7.m30763e(r5)     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r2.f22472g = r5     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r5 = 4
                r2.f22470e = r5     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                java.lang.Integer[] r5 = new java.lang.Integer[r1]     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                int r7 = r8.f22502c     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r5[r3] = r7     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r5[r4] = r7     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r8.publishProgress(r5)     // Catch:{ FileNotFoundException -> 0x011c, all -> 0x011a }
                r6.close()     // Catch:{ Exception -> 0x00a9 }
                goto L_0x00a9
            L_0x0116:
                r6.close()     // Catch:{ Exception -> 0x012a }
                goto L_0x012a
            L_0x011a:
                r0 = move-exception
                goto L_0x0120
            L_0x011c:
                goto L_0x0127
            L_0x011e:
                r0 = move-exception
                r6 = r9
            L_0x0120:
                if (r6 == 0) goto L_0x0125
                r6.close()     // Catch:{ Exception -> 0x0125 }
            L_0x0125:
                throw r0     // Catch:{ IOException -> 0x014f }
            L_0x0126:
                r6 = r9
            L_0x0127:
                if (r6 == 0) goto L_0x012a
                goto L_0x0116
            L_0x012a:
                r2.f22470e = r1     // Catch:{ IOException -> 0x014f }
                java.lang.Integer[] r2 = new java.lang.Integer[r1]     // Catch:{ IOException -> 0x014f }
                int r5 = r8.f22502c     // Catch:{ IOException -> 0x014f }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x014f }
                r2[r3] = r5     // Catch:{ IOException -> 0x014f }
                r3 = 100
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x014f }
                r2[r4] = r3     // Catch:{ IOException -> 0x014f }
                r8.publishProgress(r2)     // Catch:{ IOException -> 0x014f }
                int r2 = r8.f22502c     // Catch:{ IOException -> 0x014f }
                int r2 = r2 + r4
                r8.f22502c = r2     // Catch:{ IOException -> 0x014f }
                goto L_0x00a9
            L_0x0148:
                r0 = move-exception
                android.app.ProgressDialog r1 = r8.f22504e     // Catch:{ IOException -> 0x014f }
                r1.dismiss()     // Catch:{ IOException -> 0x014f }
                throw r0     // Catch:{ IOException -> 0x014f }
            L_0x014f:
                r0 = move-exception
                java.lang.String r1 = "FtpUpload"
                java.lang.String r2 = "IOException"
                android.util.Log.d(r1, r2, r0)
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this
                android.support.v4.app.h r0 = r0.mo1318s()
                boolean r0 = com.seattleclouds.util.C6619m.m32026h(r0)
                if (r0 != 0) goto L_0x016d
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this
                java.lang.String r0 = r0.f22493ax
            L_0x0169:
                r8.m30783a(r0)
                goto L_0x0174
            L_0x016d:
                com.seattleclouds.modules.voicerecord.b r0 = com.seattleclouds.modules.voicerecord.C6327b.this
                java.lang.String r0 = r0.f22494ay
                goto L_0x0169
            L_0x0174:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.voicerecord.C6327b.C63303.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            super.onPostExecute(voidR);
            C6327b.this.m30756as();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            C6326a aVar = (C6326a) C6327b.this.f22476ag.get(numArr[0].intValue());
            aVar.f22471f = numArr[1].intValue();
            C6327b.this.m30749a(numArr[0].intValue(), aVar);
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f22502c = 0;
            this.f22501b = new C6738b();
            this.f22501b.mo21145a((C6745c) new C6745c() {
                /* renamed from: a */
                public void mo19748a(long j, int i, long j2) {
                    C6326a aVar = (C6326a) C6327b.this.f22476ag.get(C63303.this.f22502c);
                    double d = (double) j;
                    double d2 = (double) aVar.f22469d;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    aVar.f22471f = (int) ((d / d2) * 100.0d);
                    if (C63303.this.f22503d != aVar.f22471f) {
                        C63303.this.f22503d = aVar.f22471f;
                        C63303.this.publishProgress(new Integer[]{Integer.valueOf(C63303.this.f22502c), Integer.valueOf(aVar.f22471f)});
                    }
                }
            });
            this.f22504e = new ProgressDialog(C6327b.this.mo1318s());
            this.f22504e.setIndeterminate(true);
            this.f22504e.setMessage(C6327b.this.f22492aw);
            this.f22504e.show();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f22496i;

    /* renamed from: com.seattleclouds.modules.voicerecord.b$a */
    static class C6334a {

        /* renamed from: a */
        TextView f22510a;

        /* renamed from: b */
        TextView f22511b;

        /* renamed from: c */
        ProgressBar f22512c;

        C6334a() {
        }
    }

    /* renamed from: a */
    private String m30747a(int i, String str) {
        String str2;
        switch (i) {
            case 0:
                str2 = this.f22487ar;
                break;
            case 1:
                str2 = this.f22488as;
                break;
            case 2:
                str2 = this.f22489at;
                break;
            case 4:
                str2 = this.f22490au;
                break;
            case 5:
                str2 = this.f22491av;
                break;
            default:
                str2 = "";
                break;
        }
        if (str == null || str.length() <= 0) {
            return str2;
        }
        if (str2.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30749a(int i, C6326a aVar) {
        ListView b = mo1450b();
        View childAt = b.getChildAt(i - b.getFirstVisiblePosition());
        if (childAt != null) {
            mo19738a((C6334a) childAt.getTag(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30753a(String[] strArr, ArrayList<C6326a> arrayList) {
        String sb;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6326a aVar = (C6326a) it.next();
            String str = aVar.f22467b;
            if (m30755a(strArr, str)) {
                int i = 2;
                String c = m30759c(str);
                String d = m30762d(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_");
                sb2.append(2);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    sb4.append(d);
                    sb4.append(sb3);
                    sb4.append(".");
                    sb4.append(c);
                    sb = sb4.toString();
                    if (!m30755a(strArr, sb)) {
                        break;
                    }
                    i++;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("_");
                    sb5.append(i);
                    sb3 = sb5.toString();
                    sb4 = new StringBuilder();
                }
                aVar.f22466a = sb;
            }
        }
    }

    /* renamed from: a */
    private static boolean m30755a(String[] strArr, String str) {
        for (String equalsIgnoreCase : strArr) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m30756as() {
        this.f22478ai = true;
        this.f22473aA.notifyDataSetChanged();
        mo20721d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m30758b(final boolean z) {
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3060b(C5462k.voicerecordlist_ftp_cancel_message);
        aVar.mo3061b(C5462k.voicerecordlist_ftp_continue, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C6327b.this.m30765e();
                if (z) {
                    App.m25625a((Fragment) C6327b.this);
                }
            }
        });
        aVar.mo3048a(C5462k.voicerecordlist_ftp_cancel, (OnClickListener) null);
        aVar.mo3068c();
    }

    /* renamed from: c */
    private static String m30759c(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }

    /* renamed from: d */
    private static String m30762d(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public String m30763e(int i) {
        switch (i) {
            case 425:
                return this.f22481al;
            case 426:
                return this.f22479aj;
            case 450:
                return this.f22480ak;
            case 530:
                return this.f22482am;
            case 550:
                return this.f22483an;
            case 552:
                return this.f22484ao;
            case 553:
                return this.f22485ap;
            default:
                return this.f22486aq;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30765e() {
        this.f22495az.cancel(true);
        Iterator it = this.f22476ag.iterator();
        while (it.hasNext()) {
            C6326a aVar = (C6326a) it.next();
            switch (aVar.f22470e) {
                case 0:
                case 1:
                    aVar.f22470e = 5;
                    break;
            }
        }
        m30756as();
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        super.mo1226a(activity);
        this.f22477ah = activity.getLayoutInflater();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1280d(true);
        Bundle m = mo1307m();
        this.f22496i = m.getString("ARGS_HOSTNAME");
        this.f22474ae = m.getString("ARGS_USERNAME");
        this.f22475af = m.getString("ARGS_PASSWORD");
        this.f22476ag = new ArrayList<>();
        Iterator it = m.getStringArrayList("ARGS_FILES").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            File file = new File(str);
            this.f22476ag.add(new C6326a(file.getName(), str, file.length()));
        }
        Resources resources = mo1318s().getResources();
        this.f22479aj = resources.getString(C5462k.voicerecordlist_ftp_error_426);
        this.f22480ak = resources.getString(C5462k.voicerecordlist_ftp_error_450);
        this.f22481al = resources.getString(C5462k.voicerecordlist_ftp_error_425);
        this.f22482am = resources.getString(C5462k.voicerecordlist_ftp_error_530);
        this.f22483an = resources.getString(C5462k.voicerecordlist_ftp_error_550);
        this.f22484ao = resources.getString(C5462k.voicerecordlist_ftp_error_552);
        this.f22485ap = resources.getString(C5462k.voicerecordlist_ftp_error_553);
        this.f22486aq = resources.getString(C5462k.voicerecordlist_ftp_error_unknown);
        this.f22487ar = resources.getString(C5462k.voicerecordlist_ftp_upload_state_idle);
        this.f22488as = resources.getString(C5462k.voicerecordlist_ftp_upload_state_uploading);
        this.f22489at = resources.getString(C5462k.voicerecordlist_ftp_upload_state_uploaded);
        this.f22490au = resources.getString(C5462k.voicerecordlist_ftp_upload_state_failed);
        this.f22491av = resources.getString(C5462k.voicerecordlist_ftp_upload_state_canceled);
        this.f22492aw = resources.getString(C5462k.voicerecordlist_ftp_connecting);
        this.f22493ax = resources.getString(C5462k.common_no_network);
        this.f22494ay = resources.getString(C5462k.common_network_error);
        mo1691a((ListAdapter) this.f22473aA);
        this.f22495az.execute(new Void[]{null});
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (!this.f22478ai) {
            menuInflater.inflate(C5461j.voicerecord_ftp_upload_menu, menu);
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        ListView b = mo1450b();
        b.setFocusableInTouchMode(true);
        b.requestFocus();
        b.setOnKeyListener(new OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (C6327b.this.f22478ai || keyEvent.getAction() != 0 || i != 4) {
                    return false;
                }
                C6327b.this.m30758b(true);
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo19738a(C6334a aVar, C6326a aVar2) {
        ProgressBar progressBar;
        aVar.f22510a.setText(aVar2.f22467b);
        aVar.f22511b.setText(m30747a(aVar2.f22470e, aVar2.f22472g));
        int i = 4;
        switch (aVar2.f22470e) {
            case 0:
            case 2:
            case 4:
            case 5:
                progressBar = aVar.f22512c;
                break;
            case 1:
                aVar.f22512c.setProgress(aVar2.f22471f);
                progressBar = aVar.f22512c;
                if (aVar2.f22471f > 0) {
                    i = 0;
                    break;
                }
                break;
            default:
                return;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.cancel) {
            return super.mo1245a(menuItem);
        }
        m30758b(false);
        return true;
    }
}
