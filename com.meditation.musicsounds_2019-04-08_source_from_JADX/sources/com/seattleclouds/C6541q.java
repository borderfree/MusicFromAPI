package com.seattleclouds;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p009v4.app.C0396q;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p194nl.siegmann.epublib.domain.TableOfContents;

@SuppressLint({"LongLogTag"})
/* renamed from: com.seattleclouds.q */
public class C6541q extends C5391l {

    /* renamed from: a */
    private List<HashMap<String, String>> f23170a = null;

    /* renamed from: ae */
    private boolean f23171ae = true;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public List<HashMap<String, String>> f23172af = null;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public C6548b f23173ag = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ProgressBar f23174b = null;

    /* renamed from: c */
    private TextView f23175c = null;

    /* renamed from: d */
    private Button f23176d = null;

    /* renamed from: e */
    private Button f23177e = null;

    /* renamed from: f */
    private FrameLayout f23178f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FragmentInfo f23179g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f23180h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f23181i = C6541q.class.getSimpleName();

    /* renamed from: com.seattleclouds.q$a */
    private interface C6547a {
        /* renamed from: a */
        void mo20263a();
    }

    /* renamed from: com.seattleclouds.q$b */
    private class C6548b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public volatile Thread f23191b = null;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public HttpURLConnection f23192c = null;

        public C6548b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m31649b(final int i) {
            if (this.f23191b != null && C6541q.this.mo1318s() != null) {
                C6541q.this.mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        C6541q.this.f23174b.setMax(i);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m31651c(final int i) {
            if (this.f23191b != null && C6541q.this.mo1318s() != null) {
                C6541q.this.mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        if (C6541q.this.f23174b.getMax() == 0) {
                            C6541q.this.f23174b.setProgress(0);
                        } else {
                            C6541q.this.f23174b.setSecondaryProgress(i);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo20270a() {
            this.f23191b = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo20271a(final int i) {
            if (this.f23191b != null && C6541q.this.mo1318s() != null) {
                C6541q.this.mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        ProgressBar f;
                        int i;
                        if (C6541q.this.f23174b.getMax() == 0) {
                            f = C6541q.this.f23174b;
                            i = 0;
                        } else {
                            f = C6541q.this.f23174b;
                            i = i;
                        }
                        f.setProgress(i);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo20272a(final List<HashMap<String, String>> list) {
            if (this.f23191b == null) {
                this.f23191b = new Thread(new Runnable() {

                    /* renamed from: com.seattleclouds.q$b$1$a */
                    class C6550a {

                        /* renamed from: a */
                        boolean f23195a;

                        /* renamed from: b */
                        boolean f23196b;

                        C6550a() {
                            this.f23195a = false;
                        }

                        C6550a(boolean z, boolean z2) {
                            this.f23195a = z;
                            this.f23196b = z2;
                        }
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
                        r14.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01af, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b0, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
                        r4.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bd, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01be, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01cb, code lost:
                        if (com.seattleclouds.C6541q.C6548b.m31648b(r13.f23194b) == null) goto L_0x020c;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
                        r2.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01e5, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01e6, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
                        r4.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f3, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f4, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0201, code lost:
                        if (com.seattleclouds.C6541q.C6548b.m31648b(r13.f23194b) == null) goto L_0x020c;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0203, code lost:
                        com.seattleclouds.C6541q.C6548b.m31648b(r13.f23194b).disconnect();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:134:0x020c, code lost:
                        return r0;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dc, code lost:
                        r2 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                        android.util.Log.e("HostedResourcesDownloader", " Set Last Modified Date trow new Exception:", r2);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
                        r1 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0117, code lost:
                        r2 = r14;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0119, code lost:
                        r2 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
                        r1 = e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011d, code lost:
                        r2 = r14;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0161, code lost:
                        if (com.seattleclouds.C6541q.C6548b.m31648b(r13.f23194b) == null) goto L_0x020c;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
                        r2.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0179, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017a, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
                        r4.close();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0187, code lost:
                        r14 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0188, code lost:
                        android.util.Log.e("HostedResourcesDownloader", "IOException", r14);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0195, code lost:
                        if (com.seattleclouds.C6541q.C6548b.m31648b(r13.f23194b) == null) goto L_0x020c;
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ab A[SYNTHETIC, Splitter:B:103:0x01ab] */
                    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b9 A[SYNTHETIC, Splitter:B:108:0x01b9] */
                    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1 A[SYNTHETIC, Splitter:B:122:0x01e1] */
                    /* JADX WARNING: Removed duplicated region for block: B:127:0x01ef A[SYNTHETIC, Splitter:B:127:0x01ef] */
                    /* JADX WARNING: Removed duplicated region for block: B:137:0x0210 A[SYNTHETIC, Splitter:B:137:0x0210] */
                    /* JADX WARNING: Removed duplicated region for block: B:142:0x021e A[SYNTHETIC, Splitter:B:142:0x021e] */
                    /* JADX WARNING: Removed duplicated region for block: B:148:0x0232  */
                    /* JADX WARNING: Removed duplicated region for block: B:51:0x0116 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:6:0x005b] */
                    /* JADX WARNING: Removed duplicated region for block: B:53:0x0119 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:6:0x005b] */
                    /* JADX WARNING: Removed duplicated region for block: B:54:0x011c A[ExcHandler: MalformedURLException (e java.net.MalformedURLException), Splitter:B:6:0x005b] */
                    /* JADX WARNING: Removed duplicated region for block: B:69:0x0141 A[SYNTHETIC, Splitter:B:69:0x0141] */
                    /* JADX WARNING: Removed duplicated region for block: B:74:0x014f A[SYNTHETIC, Splitter:B:74:0x014f] */
                    /* JADX WARNING: Removed duplicated region for block: B:86:0x0175 A[SYNTHETIC, Splitter:B:86:0x0175] */
                    /* JADX WARNING: Removed duplicated region for block: B:91:0x0183 A[SYNTHETIC, Splitter:B:91:0x0183] */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    private com.seattleclouds.C6541q.C6548b.C65491.C6550a m31656a(java.lang.String r14, java.io.File r15) {
                        /*
                            r13 = this;
                            com.seattleclouds.q$b$1$a r0 = new com.seattleclouds.q$b$1$a
                            r0.<init>()
                            r1 = 1
                            r2 = 0
                            r3 = 0
                            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ MalformedURLException -> 0x01d1, FileNotFoundException -> 0x0199, IOException -> 0x0165, Exception -> 0x0131, all -> 0x012d }
                            r4.<init>(r15)     // Catch:{ MalformedURLException -> 0x01d1, FileNotFoundException -> 0x0199, IOException -> 0x0165, Exception -> 0x0131, all -> 0x012d }
                            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r5.<init>(r14)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.URLConnection r6 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r14.f23192c = r6     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.HttpURLConnection r14 = r14.f23192c     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r14.setUseCaches(r3)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.HttpURLConnection r14 = r14.f23192c     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r6 = 5000(0x1388, float:7.006E-42)
                            r14.setReadTimeout(r6)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.HttpURLConnection r14 = r14.f23192c     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            int r14 = r14.getContentLength()     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r6 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.net.HttpURLConnection r6 = r6.f23192c     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            long r6 = r6.getLastModified()     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r8 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r8.m31649b(r14)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r14.mo20271a(r3)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            java.io.InputStream r5 = r5.openStream()     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r14.<init>(r5)     // Catch:{ MalformedURLException -> 0x012a, FileNotFoundException -> 0x0124, IOException -> 0x0122, Exception -> 0x0120 }
                            r2 = 32784(0x8010, float:4.594E-41)
                            byte[] r2 = new byte[r2]     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r8 = 0
                        L_0x005f:
                            int r5 = r14.read(r2)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r10 = -1
                            if (r5 == r10) goto L_0x0078
                            boolean r10 = r13.mo20274a()     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            if (r10 != 0) goto L_0x0078
                            long r10 = (long) r5     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            long r8 = r8 + r10
                            r4.write(r2, r3, r5)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            com.seattleclouds.q$b r5 = com.seattleclouds.C6541q.C6548b.this     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            int r10 = (int) r8     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r5.mo20271a(r10)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            goto L_0x005f
                        L_0x0078:
                            r4.flush()     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            boolean r2 = r13.mo20274a()     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            if (r2 == 0) goto L_0x00b3
                            r15.delete()     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            com.seattleclouds.q$b$1$a r2 = new com.seattleclouds.q$b$1$a     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r2.<init>(r3, r3)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r14.close()     // Catch:{ IOException -> 0x008d }
                            goto L_0x0095
                        L_0x008d:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r0 = "IOException"
                            android.util.Log.e(r15, r0, r14)
                        L_0x0095:
                            r4.close()     // Catch:{ IOException -> 0x0099 }
                            goto L_0x00a1
                        L_0x0099:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r0 = "IOException"
                            android.util.Log.e(r15, r0, r14)
                        L_0x00a1:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x00b2
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            r14.disconnect()
                        L_0x00b2:
                            return r2
                        L_0x00b3:
                            boolean r2 = r15.setLastModified(r6)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            if (r2 == 0) goto L_0x00e4
                            java.lang.String r2 = "HostedResourcesDownloader"
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            r5.<init>()     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            java.lang.String r8 = "updatedLastModified date '"
                            r5.append(r8)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            r5.append(r6)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            java.lang.String r6 = "' for file: "
                            r5.append(r6)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            java.lang.String r6 = r15.getName()     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            r5.append(r6)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            android.util.Log.v(r2, r5)     // Catch:{ Exception -> 0x00dc, MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116 }
                            goto L_0x00e4
                        L_0x00dc:
                            r2 = move-exception
                            java.lang.String r5 = "HostedResourcesDownloader"
                            java.lang.String r6 = " Set Last Modified Date trow new Exception:"
                            android.util.Log.e(r5, r6, r2)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                        L_0x00e4:
                            com.seattleclouds.q$b$1$a r2 = new com.seattleclouds.q$b$1$a     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r2.<init>(r1, r3)     // Catch:{ MalformedURLException -> 0x011c, FileNotFoundException -> 0x0119, IOException -> 0x0116, Exception -> 0x0113 }
                            r14.close()     // Catch:{ IOException -> 0x00ed }
                            goto L_0x00f5
                        L_0x00ed:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r0 = "IOException"
                            android.util.Log.e(r15, r0, r14)
                        L_0x00f5:
                            r4.close()     // Catch:{ IOException -> 0x00f9 }
                            goto L_0x0101
                        L_0x00f9:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r0 = "IOException"
                            android.util.Log.e(r15, r0, r14)
                        L_0x0101:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x0112
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            r14.disconnect()
                        L_0x0112:
                            return r2
                        L_0x0113:
                            r1 = move-exception
                            r2 = r14
                            goto L_0x0133
                        L_0x0116:
                            r1 = move-exception
                            r2 = r14
                            goto L_0x0167
                        L_0x0119:
                            r2 = move-exception
                            goto L_0x019d
                        L_0x011c:
                            r1 = move-exception
                            r2 = r14
                            goto L_0x01d3
                        L_0x0120:
                            r1 = move-exception
                            goto L_0x0133
                        L_0x0122:
                            r1 = move-exception
                            goto L_0x0167
                        L_0x0124:
                            r14 = move-exception
                            r12 = r2
                            r2 = r14
                            r14 = r12
                            goto L_0x019d
                        L_0x012a:
                            r1 = move-exception
                            goto L_0x01d3
                        L_0x012d:
                            r15 = move-exception
                            r4 = r2
                            goto L_0x020e
                        L_0x0131:
                            r1 = move-exception
                            r4 = r2
                        L_0x0133:
                            java.lang.String r14 = "HostedResourcesDownloader"
                            java.lang.String r5 = "Exception"
                            android.util.Log.e(r14, r5, r1)     // Catch:{ all -> 0x020d }
                            r0.f23196b = r3     // Catch:{ all -> 0x020d }
                            r15.delete()     // Catch:{ all -> 0x020d }
                            if (r2 == 0) goto L_0x014d
                            r2.close()     // Catch:{ IOException -> 0x0145 }
                            goto L_0x014d
                        L_0x0145:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x014d:
                            if (r4 == 0) goto L_0x015b
                            r4.close()     // Catch:{ IOException -> 0x0153 }
                            goto L_0x015b
                        L_0x0153:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x015b:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x020c
                            goto L_0x0203
                        L_0x0165:
                            r1 = move-exception
                            r4 = r2
                        L_0x0167:
                            java.lang.String r14 = "HostedResourcesDownloader"
                            java.lang.String r5 = "IOException"
                            android.util.Log.e(r14, r5, r1)     // Catch:{ all -> 0x020d }
                            r0.f23196b = r3     // Catch:{ all -> 0x020d }
                            r15.delete()     // Catch:{ all -> 0x020d }
                            if (r2 == 0) goto L_0x0181
                            r2.close()     // Catch:{ IOException -> 0x0179 }
                            goto L_0x0181
                        L_0x0179:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x0181:
                            if (r4 == 0) goto L_0x018f
                            r4.close()     // Catch:{ IOException -> 0x0187 }
                            goto L_0x018f
                        L_0x0187:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x018f:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x020c
                            goto L_0x0203
                        L_0x0199:
                            r14 = move-exception
                            r4 = r2
                            r2 = r14
                            r14 = r4
                        L_0x019d:
                            java.lang.String r3 = "HostedResourcesDownloader"
                            java.lang.String r5 = "FileNotFoundException"
                            android.util.Log.e(r3, r5, r2)     // Catch:{ all -> 0x01ce }
                            r0.f23196b = r1     // Catch:{ all -> 0x01ce }
                            r15.delete()     // Catch:{ all -> 0x01ce }
                            if (r14 == 0) goto L_0x01b7
                            r14.close()     // Catch:{ IOException -> 0x01af }
                            goto L_0x01b7
                        L_0x01af:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x01b7:
                            if (r4 == 0) goto L_0x01c5
                            r4.close()     // Catch:{ IOException -> 0x01bd }
                            goto L_0x01c5
                        L_0x01bd:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x01c5:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x020c
                            goto L_0x0203
                        L_0x01ce:
                            r15 = move-exception
                            r2 = r14
                            goto L_0x020e
                        L_0x01d1:
                            r1 = move-exception
                            r4 = r2
                        L_0x01d3:
                            java.lang.String r14 = "HostedResourcesDownloader"
                            java.lang.String r5 = "MalformedURLException"
                            android.util.Log.e(r14, r5, r1)     // Catch:{ all -> 0x020d }
                            r0.f23196b = r3     // Catch:{ all -> 0x020d }
                            r15.delete()     // Catch:{ all -> 0x020d }
                            if (r2 == 0) goto L_0x01ed
                            r2.close()     // Catch:{ IOException -> 0x01e5 }
                            goto L_0x01ed
                        L_0x01e5:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x01ed:
                            if (r4 == 0) goto L_0x01fb
                            r4.close()     // Catch:{ IOException -> 0x01f3 }
                            goto L_0x01fb
                        L_0x01f3:
                            r14 = move-exception
                            java.lang.String r15 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r15, r1, r14)
                        L_0x01fb:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x020c
                        L_0x0203:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            r14.disconnect()
                        L_0x020c:
                            return r0
                        L_0x020d:
                            r15 = move-exception
                        L_0x020e:
                            if (r2 == 0) goto L_0x021c
                            r2.close()     // Catch:{ IOException -> 0x0214 }
                            goto L_0x021c
                        L_0x0214:
                            r14 = move-exception
                            java.lang.String r0 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r0, r1, r14)
                        L_0x021c:
                            if (r4 == 0) goto L_0x022a
                            r4.close()     // Catch:{ IOException -> 0x0222 }
                            goto L_0x022a
                        L_0x0222:
                            r14 = move-exception
                            java.lang.String r0 = "HostedResourcesDownloader"
                            java.lang.String r1 = "IOException"
                            android.util.Log.e(r0, r1, r14)
                        L_0x022a:
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            if (r14 == 0) goto L_0x023b
                            com.seattleclouds.q$b r14 = com.seattleclouds.C6541q.C6548b.this
                            java.net.HttpURLConnection r14 = r14.f23192c
                            r14.disconnect()
                        L_0x023b:
                            throw r15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.C6541q.C6548b.C65491.m31656a(java.lang.String, java.io.File):com.seattleclouds.q$b$1$a");
                    }

                    /* renamed from: a */
                    public boolean mo20274a() {
                        return C6548b.this.f23191b == null;
                    }

                    public void run() {
                        ArrayList arrayList = new ArrayList();
                        int i = 0;
                        C6548b.this.mo20271a(0);
                        C6548b.this.m31651c(0);
                        for (HashMap hashMap : list) {
                            if (mo20274a()) {
                                break;
                            }
                            String str = (String) hashMap.get("url");
                            if (C6541q.this.f23180h) {
                                String e = C6541q.this.f23181i;
                                StringBuilder sb = new StringBuilder();
                                sb.append("toDownload=>");
                                sb.append(str);
                                Log.d(e, sb.toString());
                            }
                            if (str != null) {
                                C6548b.this.f23192c = null;
                                String str2 = (String) hashMap.get("relPath");
                                if (str2 == null) {
                                    str2 = C6541q.m31633c(str);
                                }
                                File file = new File(App.m25654h(), str2);
                                if (str2.contains(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                                    File parentFile = file.getParentFile();
                                    if (!parentFile.exists()) {
                                        parentFile.mkdirs();
                                    }
                                }
                                C6550a a = m31656a(str, file);
                                if (!a.f23195a && !a.f23196b) {
                                    arrayList.add(hashMap);
                                } else if (a.f23195a || !a.f23196b) {
                                    i++;
                                }
                                C6548b.this.m31651c(i);
                            }
                        }
                        C6548b.this.mo20273b((List<HashMap<String, String>>) arrayList);
                    }
                });
                this.f23191b.start();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo20273b(final List<HashMap<String, String>> list) {
            if (this.f23191b != null) {
                this.f23191b = null;
                if (C6541q.this.mo1318s() != null) {
                    C6541q.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            C6541q.this.m31629a(list);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31625a(View view, final C6547a aVar) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        if (aVar != null) {
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    aVar.mo20263a();
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
        }
        alphaAnimation.setDuration(200);
        view.startAnimation(alphaAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31629a(List<HashMap<String, String>> list) {
        this.f23172af = list;
        if (list.size() == 0) {
            m31634c();
        } else {
            m31638m(true);
        }
    }

    /* renamed from: b */
    private void m31631b(View view, final C6547a aVar) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setAnimationListener(new AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                aVar.mo20263a();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        alphaAnimation.setDuration(200);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: c */
    public static String m31633c(String str) {
        String a = C6592al.m31904a(str);
        try {
            return URLDecoder.decode(a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("HostedResourcesDownloader", "Exception", e);
            return a;
        }
    }

    /* renamed from: c */
    private void m31634c() {
        final View findViewById = this.f23178f.findViewById(C5458g.fragment_frame);
        m31631b(findViewById, new C6547a() {
            /* renamed from: a */
            public void mo20263a() {
                ((FrameLayout) findViewById).removeAllViews();
                C0396q a = C6541q.this.mo1323v().mo1536a();
                Fragment a2 = Fragment.m1271a((Context) C6541q.this.mo1318s(), C6541q.this.f23179g.mo16867a(), C6541q.this.f23179g.mo16869b());
                a.mo1423b(C5458g.fragment_frame, a2, "resourceDownloader");
                a.mo1428c();
                C6541q.this.m31625a(findViewById, (C6547a) null);
                C6541q.this.mo17695c(a2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m31638m(boolean z) {
        TextView textView;
        int i;
        Resources t = mo1320t();
        if (z) {
            if (this.f23177e.getParent() != null) {
                ((FrameLayout) this.f23177e.getParent()).setVisibility(0);
            }
            if (this.f23171ae) {
                LayoutParams layoutParams = (LayoutParams) this.f23176d.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.rightMargin = C6619m.m32014a(mo1318s(), 20.0f);
                    layoutParams.gravity = 21;
                    this.f23176d.setLayoutParams(layoutParams);
                }
                textView = this.f23175c;
                i = C5462k.hprd_downloading_failed_label;
            } else {
                return;
            }
        } else {
            if (this.f23177e.getParent() != null) {
                ((FrameLayout) this.f23177e.getParent()).setVisibility(8);
            }
            if (this.f23171ae) {
                LayoutParams layoutParams2 = (LayoutParams) this.f23176d.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.rightMargin = 0;
                    layoutParams2.gravity = 17;
                    this.f23176d.setLayoutParams(layoutParams2);
                }
                textView = this.f23175c;
                i = C5462k.hprd_downloading_resources_label;
            } else {
                return;
            }
        }
        textView.setText(t.getString(i));
    }

    /* renamed from: L */
    public void mo1202L() {
        if (this.f23173ag != null) {
            this.f23173ag.mo20270a();
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23178f = (FrameLayout) layoutInflater.inflate(C5460i.download_hosted_resources_fragment, viewGroup, false);
        mo1450b();
        return this.f23178f;
    }

    /* renamed from: a */
    public Animation mo1218a(int i, boolean z, int i2) {
        return super.mo1218a(i, z, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        this.f23174b = (ProgressBar) this.f23178f.findViewById(C5458g.download_progress_bar);
        this.f23175c = (TextView) this.f23178f.findViewById(C5458g.download_title);
        this.f23176d = (Button) this.f23178f.findViewById(C5458g.cancel_button);
        this.f23177e = (Button) this.f23178f.findViewById(C5458g.retry_download_button);
        if (App.f18474G) {
            Bundle m = mo1307m();
            if (m != null) {
                this.f23170a = (List) m.getSerializable("ARG_HOSTED_RESOURCES");
                this.f23179g = (FragmentInfo) m.getParcelable("ARG_PAGE_FRAGMENT_INFO");
                this.f23171ae = m.getBoolean("ARG_CAN_BE_CANCELED", true);
            }
            if (this.f23170a == null || this.f23179g == null) {
                App.m25625a((Fragment) this);
                return;
            }
            Bundle b = this.f23179g.mo16869b();
            b.setClassLoader(mo1318s().getClassLoader());
            b.putString("PAGE_TRANSITION", "FADE");
            this.f23173ag = new C6548b();
            if (this.f23171ae) {
                this.f23176d.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        C6541q.this.f23173ag.mo20270a();
                        App.m25625a((Fragment) C6541q.this);
                    }
                });
            } else {
                if (this.f23176d.getParent() != null) {
                    ((View) this.f23176d.getParent()).setVisibility(8);
                }
                LayoutParams layoutParams = (LayoutParams) this.f23177e.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.leftMargin = 0;
                    layoutParams.gravity = 17;
                    this.f23177e.setLayoutParams(layoutParams);
                }
            }
            this.f23177e.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    C6541q.this.f23173ag.mo20272a(C6541q.this.f23172af);
                    C6541q.this.m31638m(false);
                }
            });
            this.f23173ag.mo20272a(this.f23170a);
            m31638m(false);
        } else {
            this.f23176d.setVisibility(8);
            this.f23177e.setVisibility(8);
            this.f23174b.setVisibility(8);
            this.f23175c.setText(mo1320t().getString(C5462k.hprd_sync_should_be_enabled_info));
        }
    }
}
