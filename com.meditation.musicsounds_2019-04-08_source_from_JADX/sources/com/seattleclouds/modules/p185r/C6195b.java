package com.seattleclouds.modules.p185r;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import com.seattleclouds.C5451m.C5462k;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.r.b */
public class C6195b extends C0366g {

    /* renamed from: ae */
    private C6197a f21987ae;

    /* renamed from: af */
    private C6198b f21988af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public String f21989ag;

    /* renamed from: ah */
    private ArrayList<String> f21990ah;

    /* renamed from: com.seattleclouds.modules.r.b$a */
    private class C6197a extends AsyncTask<String, Void, Integer> {
        private C6197a() {
        }

        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v1, types: [java.io.File] */
        /* JADX WARNING: type inference failed for: r5v2 */
        /* JADX WARNING: type inference failed for: r5v7 */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:36|(0)|50|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|28|(1:30)|31) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a5, code lost:
            r14 = new java.io.File(com.seattleclouds.modules.p185r.C6195b.m30189a(r13.f21991a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
            if (r14.exists() == false) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b6, code lost:
            r14.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b9, code lost:
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r2 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(r14));
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r1.writeTo(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d0, code lost:
            if (isCancelled() != false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
            r14.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d5, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d7, code lost:
            r5 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d9, code lost:
            r5 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00db, code lost:
            r0 = th;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r0 = java.lang.Integer.valueOf(com.seattleclouds.C5451m.C5462k.scan_document_general_error);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
            if (r5 != 0) goto L_0x00e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ef, code lost:
            if (isCancelled() != false) goto L_0x00f1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
            r14.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f4, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f5, code lost:
            if (r5 != 0) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fb, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
            r5 = r14;
            r14 = r0;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00c9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00fa */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5 A[SYNTHETIC, Splitter:B:40:0x00e5] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7 A[SYNTHETIC, Splitter:B:48:0x00f7] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x00c9=Splitter:B:26:0x00c9, B:50:0x00fa=Splitter:B:50:0x00fa} */
        /* JADX WARNING: Unknown variable types count: 2 */
        @android.annotation.TargetApi(19)
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Integer m30200b(java.lang.String[] r14) {
            /*
                r13 = this;
                android.print.PrintAttributes$Builder r0 = new android.print.PrintAttributes$Builder
                r0.<init>()
                android.print.PrintAttributes$MediaSize r1 = android.print.PrintAttributes.MediaSize.ISO_A4
                r0.setMediaSize(r1)
                android.print.PrintAttributes$Margins r1 = new android.print.PrintAttributes$Margins
                r2 = 5
                r1.<init>(r2, r2, r2, r2)
                r0.setMinMargins(r1)
                android.print.pdf.PrintedPdfDocument r1 = new android.print.pdf.PrintedPdfDocument
                com.seattleclouds.modules.r.b r3 = com.seattleclouds.modules.p185r.C6195b.this
                android.support.v4.app.h r3 = r3.mo1318s()
                android.print.PrintAttributes r0 = r0.build()
                r1.<init>(r3, r0)
                r0 = 0
                r3 = 0
                r4 = 0
            L_0x0025:
                r5 = 0
                int r6 = r14.length     // Catch:{ all -> 0x00ff }
                if (r3 >= r6) goto L_0x00a5
                boolean r6 = r13.isCancelled()     // Catch:{ all -> 0x00ff }
                if (r6 == 0) goto L_0x0037
                r1.close()
                boolean r14 = r13.isCancelled()
                return r5
            L_0x0037:
                java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ff }
                r7 = r14[r3]     // Catch:{ all -> 0x00ff }
                r6.<init>(r7)     // Catch:{ all -> 0x00ff }
                boolean r7 = r6.exists()     // Catch:{ all -> 0x00ff }
                if (r7 != 0) goto L_0x0045
                goto L_0x00a2
            L_0x0045:
                android.graphics.pdf.PdfDocument$Page r7 = r1.startPage(r4)     // Catch:{ all -> 0x00ff }
                android.graphics.pdf.PdfDocument$PageInfo r8 = r7.getInfo()     // Catch:{ all -> 0x00ff }
                android.graphics.Rect r8 = r8.getContentRect()     // Catch:{ all -> 0x00ff }
                int r9 = r8.width()     // Catch:{ all -> 0x00ff }
                int r10 = r8.height()     // Catch:{ all -> 0x00ff }
                int r9 = java.lang.Math.min(r9, r10)     // Catch:{ all -> 0x00ff }
                java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ all -> 0x00ff }
                android.graphics.Bitmap r6 = com.seattleclouds.util.C6638s.m32077b(r6, r9)     // Catch:{ all -> 0x00ff }
                android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x00ff }
                com.seattleclouds.modules.r.b r10 = com.seattleclouds.modules.p185r.C6195b.this     // Catch:{ all -> 0x00ff }
                android.support.v4.app.h r10 = r10.mo1318s()     // Catch:{ all -> 0x00ff }
                r9.<init>(r10)     // Catch:{ all -> 0x00ff }
                android.widget.ImageView$ScaleType r10 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x00ff }
                r9.setScaleType(r10)     // Catch:{ all -> 0x00ff }
                android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x00ff }
                int r11 = r8.width()     // Catch:{ all -> 0x00ff }
                int r12 = r8.height()     // Catch:{ all -> 0x00ff }
                r10.<init>(r11, r12)     // Catch:{ all -> 0x00ff }
                r9.setLayoutParams(r10)     // Catch:{ all -> 0x00ff }
                r9.setPadding(r2, r2, r2, r2)     // Catch:{ all -> 0x00ff }
                r9.setImageBitmap(r6)     // Catch:{ all -> 0x00ff }
                int r6 = r8.width()     // Catch:{ all -> 0x00ff }
                int r8 = r8.height()     // Catch:{ all -> 0x00ff }
                r9.layout(r0, r0, r6, r8)     // Catch:{ all -> 0x00ff }
                android.graphics.Canvas r6 = r7.getCanvas()     // Catch:{ all -> 0x00ff }
                r9.draw(r6)     // Catch:{ all -> 0x00ff }
                r1.finishPage(r7)     // Catch:{ all -> 0x00ff }
                int r4 = r4 + 1
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0025
            L_0x00a5:
                java.io.File r14 = new java.io.File     // Catch:{ all -> 0x00ff }
                com.seattleclouds.modules.r.b r0 = com.seattleclouds.modules.p185r.C6195b.this     // Catch:{ all -> 0x00ff }
                java.lang.String r0 = r0.f21989ag     // Catch:{ all -> 0x00ff }
                r14.<init>(r0)     // Catch:{ all -> 0x00ff }
                boolean r0 = r14.exists()     // Catch:{ all -> 0x00fb }
                if (r0 == 0) goto L_0x00b9
                r14.delete()     // Catch:{ all -> 0x00fb }
            L_0x00b9:
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00dd }
                r0.<init>(r14)     // Catch:{ Exception -> 0x00dd }
                java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00dd }
                r2.<init>(r0)     // Catch:{ Exception -> 0x00dd }
                r1.writeTo(r2)     // Catch:{ Exception -> 0x00d9, all -> 0x00d6 }
                r2.close()     // Catch:{ IOException -> 0x00c9 }
            L_0x00c9:
                r1.close()     // Catch:{ all -> 0x00fb }
                boolean r0 = r13.isCancelled()
                if (r0 == 0) goto L_0x00d5
                r14.delete()
            L_0x00d5:
                return r5
            L_0x00d6:
                r0 = move-exception
                r5 = r2
                goto L_0x00f5
            L_0x00d9:
                r5 = r2
                goto L_0x00dd
            L_0x00db:
                r0 = move-exception
                goto L_0x00f5
            L_0x00dd:
                int r0 = com.seattleclouds.C5451m.C5462k.scan_document_general_error     // Catch:{ all -> 0x00db }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00db }
                if (r5 == 0) goto L_0x00e8
                r5.close()     // Catch:{ IOException -> 0x00e8 }
            L_0x00e8:
                r1.close()
                boolean r1 = r13.isCancelled()
                if (r1 == 0) goto L_0x00f4
                r14.delete()
            L_0x00f4:
                return r0
            L_0x00f5:
                if (r5 == 0) goto L_0x00fa
                r5.close()     // Catch:{ IOException -> 0x00fa }
            L_0x00fa:
                throw r0     // Catch:{ all -> 0x00fb }
            L_0x00fb:
                r0 = move-exception
                r5 = r14
                r14 = r0
                goto L_0x0100
            L_0x00ff:
                r14 = move-exception
            L_0x0100:
                r1.close()
                boolean r0 = r13.isCancelled()
                if (r0 == 0) goto L_0x010e
                if (r5 == 0) goto L_0x010e
                r5.delete()
            L_0x010e:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p185r.C6195b.C6197a.m30200b(java.lang.String[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0212, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0213, code lost:
            r4 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0217, code lost:
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x021a, code lost:
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x022c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x022d, code lost:
            r7 = r15;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0230, code lost:
            r7 = r15;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0233, code lost:
            r7 = r15;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0247, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0248, code lost:
            r7 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x010f, code lost:
            r3 = false;
            r7 = r15;
            r1 = null;
            r5 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x018a, code lost:
            r3 = false;
            r7 = r15;
            r1 = null;
            r9 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0190, code lost:
            r3 = false;
            r7 = r15;
            r1 = null;
            r9 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0108 */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e6 A[SYNTHETIC, Splitter:B:100:0x01e6] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x01eb A[Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01f3 A[Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x01f8 A[Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:128:? A[ExcHandler: IOException (unused java.io.IOException), PHI: r3 
          PHI: (r3v10 boolean) = (r3v11 boolean), (r3v11 boolean), (r3v3 boolean) binds: [B:118:0x0207, B:119:?, B:86:0x01cb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:86:0x01cb] */
        /* JADX WARNING: Removed duplicated region for block: B:130:? A[ExcHandler: UnknownHostException (unused java.net.UnknownHostException), PHI: r3 
          PHI: (r3v9 boolean) = (r3v11 boolean), (r3v11 boolean), (r3v3 boolean) binds: [B:118:0x0207, B:119:?, B:86:0x01cb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:86:0x01cb] */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x022c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x00c3] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0247 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0050] */
        /* JADX WARNING: Removed duplicated region for block: B:172:0x0268  */
        /* JADX WARNING: Removed duplicated region for block: B:174:0x026d A[SYNTHETIC, Splitter:B:174:0x026d] */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:189:0x028c  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0291 A[SYNTHETIC, Splitter:B:191:0x0291] */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x0298  */
        /* JADX WARNING: Removed duplicated region for block: B:203:0x02a7  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x02ac A[SYNTHETIC, Splitter:B:205:0x02ac] */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x02b3  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0105 A[SYNTHETIC, Splitter:B:33:0x0105] */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: UnknownHostException (unused java.net.UnknownHostException), SYNTHETIC, Splitter:B:19:0x00c9] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:169:0x0260=Splitter:B:169:0x0260, B:186:0x0284=Splitter:B:186:0x0284} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Integer doInBackground(java.lang.String... r16) {
            /*
                r15 = this;
                r0 = r16
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 19
                if (r1 < r2) goto L_0x0013
                boolean r1 = android.support.p009v4.p016d.C0462a.m2107a()
                if (r1 == 0) goto L_0x0013
                java.lang.Integer r0 = r15.m30200b(r16)
                return r0
            L_0x0013:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "boundary"
                r1.append(r2)
                long r2 = java.lang.System.currentTimeMillis()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "http://"
                r2.append(r3)
                java.lang.String r3 = com.seattleclouds.App.f18516r
                r2.append(r3)
                java.lang.String r3 = "/imagetopdfhandler.ashx"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r3 = 1
                r4 = 0
                r5 = 0
                java.net.URL r6 = new java.net.URL     // Catch:{ UnknownHostException -> 0x027f, IOException -> 0x025b, all -> 0x0255 }
                r6.<init>(r2)     // Catch:{ UnknownHostException -> 0x027f, IOException -> 0x025b, all -> 0x0255 }
                java.net.URLConnection r2 = r6.openConnection()     // Catch:{ UnknownHostException -> 0x027f, IOException -> 0x025b, all -> 0x0255 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ UnknownHostException -> 0x027f, IOException -> 0x025b, all -> 0x0255 }
                r6 = 4096(0x1000, float:5.74E-42)
                r2.setChunkedStreamingMode(r6)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r7 = "Connection"
                java.lang.String r8 = "close"
                r2.setRequestProperty(r7, r8)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r2.setDoOutput(r3)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r2.setDoInput(r3)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r7 = "Content-Type"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r8.<init>()     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r9 = "multipart/form-data; boundary="
                r8.append(r9)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r8.append(r1)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r8 = r8.toString()     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r2.setRequestProperty(r7, r8)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.io.OutputStream r7 = r2.getOutputStream()     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.io.PrintWriter r8 = new java.io.PrintWriter     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r10 = "UTF-8"
                r9.<init>(r7, r10)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r8.<init>(r9, r3)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r9 = "--"
                java.io.PrintWriter r9 = r8.append(r9)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.io.PrintWriter r9 = r9.append(r1)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r10 = "\r\n"
                r9.append(r10)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r9 = "Content-Disposition: form-data; name=\"zipedimages\"; filename=\"images.zip\""
                java.io.PrintWriter r9 = r8.append(r9)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r10 = "\r\n"
                r9.append(r10)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r9 = "Content-Type: application/zip"
                java.io.PrintWriter r9 = r8.append(r9)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r10 = "\r\n"
                r9.append(r10)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r9 = "Content-Transfer-Encoding: binary"
                java.io.PrintWriter r9 = r8.append(r9)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r10 = "\r\n"
                r9.append(r10)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r9 = "\r\n"
                r8.append(r9)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                r8.flush()     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.util.zip.ZipOutputStream r9 = new java.util.zip.ZipOutputStream     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                r9.<init>(r7)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                byte[] r7 = new byte[r6]     // Catch:{ UnknownHostException -> 0x0233, IOException -> 0x0230, all -> 0x022c }
                r10 = 0
            L_0x00c6:
                int r11 = r0.length     // Catch:{ UnknownHostException -> 0x0233, IOException -> 0x0230, all -> 0x022c }
                if (r10 >= r11) goto L_0x0115
                r11 = r0[r10]     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                java.util.zip.ZipEntry r12 = new java.util.zip.ZipEntry     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                r13.<init>()     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                r13.append(r10)     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                java.lang.String r14 = ".jpg"
                r13.append(r14)     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                java.lang.String r13 = r13.toString()     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                r12.<init>(r13)     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                r9.putNextEntry(r12)     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
                r12.<init>(r11)     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
            L_0x00e9:
                int r11 = r12.read(r7)     // Catch:{ all -> 0x0102 }
                if (r11 <= 0) goto L_0x00f6
                r9.write(r7, r4, r11)     // Catch:{ all -> 0x0102 }
                r9.flush()     // Catch:{ all -> 0x0102 }
                goto L_0x00e9
            L_0x00f6:
                r12.close()     // Catch:{ all -> 0x0102 }
                r9.closeEntry()     // Catch:{ all -> 0x00ff }
                int r10 = r10 + 1
                goto L_0x00c6
            L_0x00ff:
                r0 = move-exception
                r12 = r5
                goto L_0x0103
            L_0x0102:
                r0 = move-exception
            L_0x0103:
                if (r12 == 0) goto L_0x0108
                r12.close()     // Catch:{ IOException -> 0x0108, UnknownHostException -> 0x010f, all -> 0x022c }
            L_0x0108:
                throw r0     // Catch:{ UnknownHostException -> 0x010f, IOException -> 0x0109, all -> 0x022c }
            L_0x0109:
                r3 = 0
                r7 = r15
                r1 = r5
                r5 = r8
                goto L_0x0260
            L_0x010f:
                r3 = 0
                r7 = r15
                r1 = r5
                r5 = r8
                goto L_0x0284
            L_0x0115:
                r9.finish()     // Catch:{ UnknownHostException -> 0x0233, IOException -> 0x0230, all -> 0x022c }
                java.lang.String r0 = "\r\n"
                r8.append(r0)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r0 = "\r\n"
                java.io.PrintWriter r0 = r8.append(r0)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                r0.flush()     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r0 = "--"
                java.io.PrintWriter r0 = r8.append(r0)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.io.PrintWriter r0 = r0.append(r1)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r1 = "--"
                java.io.PrintWriter r0 = r0.append(r1)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                java.lang.String r1 = "\r\n"
                r0.append(r1)     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                r8.flush()     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                r8.close()     // Catch:{ UnknownHostException -> 0x0242, IOException -> 0x023d, all -> 0x0236 }
                int r0 = r2.getResponseCode()     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 != r1) goto L_0x021d
                java.lang.String r0 = r2.getContentType()     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                java.lang.String r1 = "application/json"
                boolean r1 = r0.equalsIgnoreCase(r1)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                if (r1 == 0) goto L_0x0196
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                r0.<init>()     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                java.io.InputStream r6 = r2.getInputStream()     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                r3.<init>(r6)     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                r1.<init>(r3)     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
            L_0x0168:
                java.lang.String r3 = r1.readLine()     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                if (r3 == 0) goto L_0x0172
                r0.append(r3)     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                goto L_0x0168
            L_0x0172:
                r1.close()     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                java.lang.String r1 = "ScanDocument"
                java.lang.String r0 = r0.toString()     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                android.util.Log.e(r1, r0)     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                int r0 = com.seattleclouds.C5451m.C5462k.scan_document_general_error     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ UnknownHostException -> 0x0190, IOException -> 0x018a, all -> 0x0247 }
                if (r2 == 0) goto L_0x0189
                r2.disconnect()
            L_0x0189:
                return r0
            L_0x018a:
                r3 = 0
                r7 = r15
                r1 = r5
                r9 = r1
                goto L_0x0260
            L_0x0190:
                r3 = 0
                r7 = r15
                r1 = r5
                r9 = r1
                goto L_0x0284
            L_0x0196:
                java.lang.String r1 = "application/pdf"
                boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                if (r0 == 0) goto L_0x0204
                java.io.File r1 = new java.io.File     // Catch:{ UnknownHostException -> 0x0251, IOException -> 0x024d, all -> 0x0247 }
                r7 = r15
                com.seattleclouds.modules.r.b r0 = com.seattleclouds.modules.p185r.C6195b.this     // Catch:{ UnknownHostException -> 0x0252, IOException -> 0x024e, all -> 0x022a }
                java.lang.String r0 = r0.f21989ag     // Catch:{ UnknownHostException -> 0x0252, IOException -> 0x024e, all -> 0x022a }
                r1.<init>(r0)     // Catch:{ UnknownHostException -> 0x0252, IOException -> 0x024e, all -> 0x022a }
                boolean r0 = r1.exists()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
                if (r0 == 0) goto L_0x01b3
                r1.delete()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
            L_0x01b3:
                java.io.InputStream r8 = r2.getInputStream()     // Catch:{ IOException -> 0x01ef, all -> 0x01e1 }
                java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01df, all -> 0x01dc }
                r9.<init>(r1)     // Catch:{ IOException -> 0x01df, all -> 0x01dc }
                byte[] r0 = new byte[r6]     // Catch:{ IOException -> 0x01da, all -> 0x01d8 }
            L_0x01be:
                int r6 = r8.read(r0)     // Catch:{ IOException -> 0x01da, all -> 0x01d8 }
                r10 = -1
                if (r6 == r10) goto L_0x01c9
                r9.write(r0, r4, r6)     // Catch:{ IOException -> 0x01da, all -> 0x01d8 }
                goto L_0x01be
            L_0x01c9:
                if (r8 == 0) goto L_0x01d4
                r8.close()     // Catch:{ UnknownHostException -> 0x021a, IOException -> 0x0217, all -> 0x01cf }
                goto L_0x01d4
            L_0x01cf:
                r0 = move-exception
                r9 = r5
                r4 = 1
                goto L_0x02a5
            L_0x01d4:
                r9.close()     // Catch:{ UnknownHostException -> 0x021a, IOException -> 0x0217, all -> 0x01cf }
                goto L_0x0207
            L_0x01d8:
                r0 = move-exception
                goto L_0x01e4
            L_0x01da:
                goto L_0x01f1
            L_0x01dc:
                r0 = move-exception
                r9 = r5
                goto L_0x01e4
            L_0x01df:
                r9 = r5
                goto L_0x01f1
            L_0x01e1:
                r0 = move-exception
                r8 = r5
                r9 = r8
            L_0x01e4:
                if (r8 == 0) goto L_0x01e9
                r8.close()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
            L_0x01e9:
                if (r9 == 0) goto L_0x01ee
                r9.close()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
            L_0x01ee:
                throw r0     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
            L_0x01ef:
                r8 = r5
                r9 = r8
            L_0x01f1:
                if (r8 == 0) goto L_0x01f6
                r8.close()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
            L_0x01f6:
                if (r9 == 0) goto L_0x0206
                r9.close()     // Catch:{ UnknownHostException -> 0x0201, IOException -> 0x01fe, all -> 0x01fc }
                goto L_0x0206
            L_0x01fc:
                r0 = move-exception
                goto L_0x0214
            L_0x01fe:
                r9 = r5
                goto L_0x025f
            L_0x0201:
                r9 = r5
                goto L_0x0283
            L_0x0204:
                r7 = r15
                r1 = r5
            L_0x0206:
                r3 = 0
            L_0x0207:
                r2.disconnect()     // Catch:{ UnknownHostException -> 0x021a, IOException -> 0x0217, all -> 0x0212 }
                if (r3 != 0) goto L_0x0211
                if (r1 == 0) goto L_0x0211
                r1.delete()
            L_0x0211:
                return r5
            L_0x0212:
                r0 = move-exception
                r4 = r3
            L_0x0214:
                r9 = r5
                goto L_0x02a5
            L_0x0217:
                r9 = r5
                goto L_0x0260
            L_0x021a:
                r9 = r5
                goto L_0x0284
            L_0x021d:
                r7 = r15
                int r0 = com.seattleclouds.C5451m.C5462k.scan_document_general_error     // Catch:{ UnknownHostException -> 0x0252, IOException -> 0x024e, all -> 0x022a }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ UnknownHostException -> 0x0252, IOException -> 0x024e, all -> 0x022a }
                if (r2 == 0) goto L_0x0229
                r2.disconnect()
            L_0x0229:
                return r0
            L_0x022a:
                r0 = move-exception
                goto L_0x0249
            L_0x022c:
                r0 = move-exception
                r7 = r15
                r1 = r5
                goto L_0x023a
            L_0x0230:
                r7 = r15
                r1 = r5
                goto L_0x0240
            L_0x0233:
                r7 = r15
                r1 = r5
                goto L_0x0245
            L_0x0236:
                r0 = move-exception
                r7 = r15
                r1 = r5
                r9 = r1
            L_0x023a:
                r5 = r8
                goto L_0x02a5
            L_0x023d:
                r7 = r15
                r1 = r5
                r9 = r1
            L_0x0240:
                r5 = r8
                goto L_0x025f
            L_0x0242:
                r7 = r15
                r1 = r5
                r9 = r1
            L_0x0245:
                r5 = r8
                goto L_0x0283
            L_0x0247:
                r0 = move-exception
                r7 = r15
            L_0x0249:
                r1 = r5
                r9 = r1
                goto L_0x02a5
            L_0x024d:
                r7 = r15
            L_0x024e:
                r1 = r5
                r9 = r1
                goto L_0x025f
            L_0x0251:
                r7 = r15
            L_0x0252:
                r1 = r5
                r9 = r1
                goto L_0x0283
            L_0x0255:
                r0 = move-exception
                r7 = r15
                r1 = r5
                r2 = r1
                r9 = r2
                goto L_0x02a5
            L_0x025b:
                r7 = r15
                r1 = r5
                r2 = r1
                r9 = r2
            L_0x025f:
                r3 = 0
            L_0x0260:
                int r0 = com.seattleclouds.C5451m.C5462k.scan_document_general_error     // Catch:{ all -> 0x02a3 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a3 }
                if (r5 == 0) goto L_0x026b
                r5.close()
            L_0x026b:
                if (r9 == 0) goto L_0x0272
                r9.close()     // Catch:{ IOException -> 0x0271 }
                goto L_0x0272
            L_0x0271:
            L_0x0272:
                if (r2 == 0) goto L_0x0277
                r2.disconnect()
            L_0x0277:
                if (r3 != 0) goto L_0x027e
                if (r1 == 0) goto L_0x027e
                r1.delete()
            L_0x027e:
                return r0
            L_0x027f:
                r7 = r15
                r1 = r5
                r2 = r1
                r9 = r2
            L_0x0283:
                r3 = 0
            L_0x0284:
                int r0 = com.seattleclouds.C5451m.C5462k.scan_document_no_internet     // Catch:{ all -> 0x02a3 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a3 }
                if (r5 == 0) goto L_0x028f
                r5.close()
            L_0x028f:
                if (r9 == 0) goto L_0x0296
                r9.close()     // Catch:{ IOException -> 0x0295 }
                goto L_0x0296
            L_0x0295:
            L_0x0296:
                if (r2 == 0) goto L_0x029b
                r2.disconnect()
            L_0x029b:
                if (r3 != 0) goto L_0x02a2
                if (r1 == 0) goto L_0x02a2
                r1.delete()
            L_0x02a2:
                return r0
            L_0x02a3:
                r0 = move-exception
                r4 = r3
            L_0x02a5:
                if (r5 == 0) goto L_0x02aa
                r5.close()
            L_0x02aa:
                if (r9 == 0) goto L_0x02b1
                r9.close()     // Catch:{ IOException -> 0x02b0 }
                goto L_0x02b1
            L_0x02b0:
            L_0x02b1:
                if (r2 == 0) goto L_0x02b6
                r2.disconnect()
            L_0x02b6:
                if (r4 != 0) goto L_0x02bd
                if (r1 == 0) goto L_0x02bd
                r1.delete()
            L_0x02bd:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p185r.C6195b.C6197a.doInBackground(java.lang.String[]):java.lang.Integer");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Integer num) {
            C6195b.this.m30191a(num);
        }
    }

    /* renamed from: com.seattleclouds.modules.r.b$b */
    public interface C6198b {
        /* renamed from: a */
        void mo19457a();

        /* renamed from: a */
        void mo19458a(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30191a(Integer num) {
        mo1450b();
        if (num == null) {
            this.f21988af.mo19457a();
        } else {
            this.f21988af.mo19458a(num.intValue());
        }
    }

    /* renamed from: as */
    private void m30192as() {
        if (this.f21987ae == null) {
            this.f21987ae = new C6197a();
            this.f21987ae.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (String[]) this.f21990ah.toArray(new String[this.f21990ah.size()]));
        }
    }

    /* renamed from: at */
    private void m30193at() {
        if (this.f21987ae != null) {
            this.f21987ae.cancel(true);
            this.f21987ae = null;
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        this.f21989ag = m.getString("ARG_PDF_FILE");
        this.f21990ah = m.getStringArrayList("ARG_IMAGE_PATH_LIST");
        mo1280d(true);
    }

    /* renamed from: a */
    public void mo19452a(C6198b bVar) {
        this.f21988af = bVar;
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(mo1318s());
        progressDialog.setTitle(C5462k.scan_document_in_progress);
        progressDialog.setMessage(mo1219a(C5462k.scan_document_please_wait));
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
    }

    /* renamed from: g */
    public void mo1288g() {
        super.mo1288g();
        m30192as();
    }

    /* renamed from: i */
    public void mo1296i() {
        Dialog d = mo1454d();
        if (d != null && mo1196F()) {
            d.setDismissMessage(null);
        }
        super.mo1296i();
    }

    public void onCancel(DialogInterface dialogInterface) {
        m30193at();
        super.onCancel(dialogInterface);
    }
}
