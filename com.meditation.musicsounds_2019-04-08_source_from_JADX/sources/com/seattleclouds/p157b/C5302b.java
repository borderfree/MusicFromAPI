package com.seattleclouds.p157b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.util.Log;
import com.android.vending.expansion.zipfile.C1166a;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6604av;
import com.seattleclouds.util.C6608d;
import java.io.File;
import java.io.IOException;
import org.apache.commons.p198io.C6730b;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.b.b */
public class C5302b extends AsyncTask<String, Integer, String> {

    /* renamed from: a */
    private static final String f18981a = "b";

    /* renamed from: b */
    private static final String f18982b;

    /* renamed from: c */
    private static final String f18983c;

    /* renamed from: d */
    private final Activity f18984d;

    /* renamed from: e */
    private final App f18985e;

    /* renamed from: f */
    private ProgressDialog f18986f;

    /* renamed from: g */
    private C6608d f18987g = null;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25665m());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("sync");
        f18982b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f18982b);
        sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb2.append("filelist.obj");
        f18983c = sb2.toString();
    }

    public C5302b(Activity activity) {
        this.f18984d = activity;
        this.f18985e = (App) this.f18984d.getApplication();
    }

    /* renamed from: a */
    public static void m26515a() {
        C6730b.m32467d(new File(App.m25656i()));
        C6730b.m32467d(new File(App.m25654h()));
        C6730b.m32467d(new File(f18982b));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00f6 */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea A[SYNTHETIC, Splitter:B:53:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ef A[Catch:{ IOException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0110 A[SYNTHETIC, Splitter:B:63:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0115 A[Catch:{ IOException -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011e A[SYNTHETIC, Splitter:B:70:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0123 A[Catch:{ IOException -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0118 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m26516a(java.lang.String r12, java.lang.String[] r13) {
        /*
            r11 = this;
            com.seattleclouds.App r0 = r11.f18985e
            android.content.res.AssetManager r0 = r0.getAssets()
            if (r13 != 0) goto L_0x000c
            java.lang.String[] r13 = r11.m26518b(r12)
        L_0x000c:
            java.lang.String r1 = com.seattleclouds.App.m25654h()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x001e
            r2.mkdirs()
        L_0x001e:
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r2 = 0
            r4 = 0
        L_0x0024:
            int r7 = r13.length
            if (r2 >= r7) goto L_0x0127
            java.lang.String r7 = f18981a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "copying: "
            r8.append(r9)
            r9 = r13[r2]
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r7, r8)
            r7 = r13[r2]     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            r8.append(r12)     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            java.lang.String r9 = "/"
            r8.append(r9)     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            r8.append(r7)     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            java.lang.String r8 = r8.toString()     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            java.io.InputStream r8 = r0.open(r8)     // Catch:{ FileNotFoundException -> 0x00f6, IOException -> 0x00c5 }
            java.io.File r5 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r9.<init>()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r9.append(r1)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            java.lang.String r10 = "/"
            r9.append(r10)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r9.append(r7)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            java.lang.String r9 = r9.toString()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r5.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            boolean r9 = r5.exists()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            if (r9 == 0) goto L_0x007c
            r5.delete()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            goto L_0x0093
        L_0x007c:
            java.lang.String r9 = "/"
            boolean r7 = r7.contains(r9)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            if (r7 == 0) goto L_0x0093
            java.io.File r7 = r5.getParentFile()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            if (r7 == 0) goto L_0x0093
            boolean r9 = r7.exists()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            if (r9 != 0) goto L_0x0093
            r7.mkdirs()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
        L_0x0093:
            r5.createNewFile()     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00c0, IOException -> 0x00be }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00b9, all -> 0x00b5 }
        L_0x009f:
            int r6 = r8.read(r5)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00b9, all -> 0x00b5 }
            if (r6 <= 0) goto L_0x00a9
            r7.write(r5, r3, r6)     // Catch:{ FileNotFoundException -> 0x00bc, IOException -> 0x00b9, all -> 0x00b5 }
            goto L_0x009f
        L_0x00a9:
            int r4 = r4 + 1
            if (r8 == 0) goto L_0x00b0
            r8.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b0:
            r7.close()     // Catch:{ IOException -> 0x00b3 }
        L_0x00b3:
            r6 = r7
            goto L_0x00f2
        L_0x00b5:
            r12 = move-exception
            r6 = r7
            goto L_0x011c
        L_0x00b9:
            r5 = move-exception
            r6 = r7
            goto L_0x00c8
        L_0x00bc:
            r6 = r7
            goto L_0x00c0
        L_0x00be:
            r5 = move-exception
            goto L_0x00c8
        L_0x00c0:
            r5 = r8
            goto L_0x00f6
        L_0x00c2:
            r12 = move-exception
            r8 = r5
            goto L_0x011c
        L_0x00c5:
            r7 = move-exception
            r8 = r5
            r5 = r7
        L_0x00c8:
            java.lang.String r7 = f18981a     // Catch:{ all -> 0x00f4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f4 }
            r9.<init>()     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = "copyAssetsToFilesDir: "
            r9.append(r10)     // Catch:{ all -> 0x00f4 }
            r10 = r13[r2]     // Catch:{ all -> 0x00f4 }
            r9.append(r10)     // Catch:{ all -> 0x00f4 }
            java.lang.String r10 = " "
            r9.append(r10)     // Catch:{ all -> 0x00f4 }
            r9.append(r5)     // Catch:{ all -> 0x00f4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00f4 }
            android.util.Log.e(r7, r9, r5)     // Catch:{ all -> 0x00f4 }
            if (r8 == 0) goto L_0x00ed
            r8.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00ed:
            if (r6 == 0) goto L_0x00f2
            r6.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00f2:
            r5 = r8
            goto L_0x0118
        L_0x00f4:
            r12 = move-exception
            goto L_0x011c
        L_0x00f6:
            java.lang.String r7 = f18981a     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r8.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r9 = "File not found: "
            r8.append(r9)     // Catch:{ all -> 0x00c2 }
            r9 = r13[r2]     // Catch:{ all -> 0x00c2 }
            r8.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00c2 }
            android.util.Log.e(r7, r8)     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x0113
            r5.close()     // Catch:{ IOException -> 0x0118 }
        L_0x0113:
            if (r6 == 0) goto L_0x0118
            r6.close()     // Catch:{ IOException -> 0x0118 }
        L_0x0118:
            int r2 = r2 + 1
            goto L_0x0024
        L_0x011c:
            if (r8 == 0) goto L_0x0121
            r8.close()     // Catch:{ IOException -> 0x0126 }
        L_0x0121:
            if (r6 == 0) goto L_0x0126
            r6.close()     // Catch:{ IOException -> 0x0126 }
        L_0x0126:
            throw r12
        L_0x0127:
            java.lang.String r12 = f18981a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Copied "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " out of "
            r0.append(r1)
            int r1 = r13.length
            r0.append(r1)
            java.lang.String r1 = " files..."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r12, r0)
            r12 = 2
            int[] r12 = new int[r12]
            r12[r3] = r4
            int r13 = r13.length
            r0 = 1
            r12[r0] = r13
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5302b.m26516a(java.lang.String, java.lang.String[]):int[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4 A[SYNTHETIC, Splitter:B:38:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2 A[SYNTHETIC, Splitter:B:47:0x00f2] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9 A[SYNTHETIC, Splitter:B:53:0x00f9] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x00da=Splitter:B:44:0x00da, B:35:0x00bc=Splitter:B:35:0x00bc} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] m26517b() {
        /*
            r7 = this;
            java.lang.String r0 = com.seattleclouds.App.m25654h()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0012
            r1.mkdirs()
        L_0x0012:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()
            r2 = 0
            com.seattleclouds.App r3 = r7.f18985e     // Catch:{ Exception -> 0x00fd }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "Meta-Inf/filelist.xml"
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ Exception -> 0x00fd }
            r1.setInput(r3, r2)     // Catch:{ Exception -> 0x00fd }
            int r3 = r1.getEventType()     // Catch:{ Exception -> 0x00fd }
            r4 = r2
            r5 = r4
        L_0x0031:
            r6 = 1
            if (r3 == r6) goto L_0x0070
            if (r3 == 0) goto L_0x006b
            switch(r3) {
                case 2: goto L_0x004a;
                case 3: goto L_0x003a;
                default: goto L_0x0039;
            }     // Catch:{ Exception -> 0x00fd }
        L_0x0039:
            goto L_0x006b
        L_0x003a:
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r6 = "file"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x006b
            r0.put(r4, r5)     // Catch:{ Exception -> 0x00fd }
            goto L_0x006b
        L_0x004a:
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00fd }
            java.lang.String r6 = "file"
            boolean r6 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00fd }
            if (r6 == 0) goto L_0x0065
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.getAttributeValue(r2, r3)     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "datetime"
            java.lang.String r4 = r1.getAttributeValue(r2, r4)     // Catch:{ Exception -> 0x00fd }
            r5 = r4
            r4 = r3
            goto L_0x006b
        L_0x0065:
            java.lang.String r6 = "total"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00fd }
        L_0x006b:
            int r3 = r1.next()     // Catch:{ Exception -> 0x00fd }
            goto L_0x0031
        L_0x0070:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = f18983c
            r1.<init>(r3)
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x00d8, IOException -> 0x00ba, all -> 0x00b7 }
            java.io.FileOutputStream r4 = org.apache.commons.p198io.C6730b.m32463b(r1)     // Catch:{ FileNotFoundException -> 0x00d8, IOException -> 0x00ba, all -> 0x00b7 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00d8, IOException -> 0x00ba, all -> 0x00b7 }
            r3.writeObject(r0)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x00b3 }
            r3.close()     // Catch:{ IOException -> 0x0086 }
        L_0x0086:
            java.util.Set r0 = r0.keySet()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.Arrays.sort(r0)
            java.lang.String r1 = f18981a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Initialized "
            r2.append(r3)
            int r3 = r0.length
            r2.append(r3)
            java.lang.String r3 = " files..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
            return r0
        L_0x00b3:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            goto L_0x00da
        L_0x00b7:
            r0 = move-exception
            r3 = r2
            goto L_0x00f7
        L_0x00ba:
            r0 = move-exception
            r3 = r2
        L_0x00bc:
            java.lang.String r4 = f18981a     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r5.<init>()     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "initAppResourceList: error saving file list to: "
            r5.append(r6)     // Catch:{ all -> 0x00f6 }
            r5.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.w(r4, r1, r0)     // Catch:{ all -> 0x00f6 }
            if (r3 == 0) goto L_0x00d7
            r3.close()     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            return r2
        L_0x00d8:
            r0 = move-exception
            r3 = r2
        L_0x00da:
            java.lang.String r4 = f18981a     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r5.<init>()     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = "initAppResourceList: error saving file list to: "
            r5.append(r6)     // Catch:{ all -> 0x00f6 }
            r5.append(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00f6 }
            android.util.Log.w(r4, r1, r0)     // Catch:{ all -> 0x00f6 }
            if (r3 == 0) goto L_0x00f5
            r3.close()     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
            return r2
        L_0x00f6:
            r0 = move-exception
        L_0x00f7:
            if (r3 == 0) goto L_0x00fc
            r3.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            throw r0
        L_0x00fd:
            java.lang.String r0 = f18981a
            java.lang.String r1 = "initAppResourceList: error parsing file list file: Meta-Inf/filelist.xml"
            android.util.Log.w(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5302b.m26517b():java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3 = f18981a;
        r4 = new java.lang.StringBuilder();
        r4.append("Error listing asset file names in folder ");
        r4.append(r9);
        android.util.Log.e(r3, r4.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0128, code lost:
        if (r1 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012e, code lost:
        r1 = f18981a;
        r2 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0147, code lost:
        r1 = f18981a;
        r2 = new java.lang.StringBuilder();
        r2.append("Error closing buffered reader for  ");
        r2.append(r9);
        r2.append(".filenames");
        android.util.Log.e(r1, r2.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:20:0x007c, B:30:0x00e5] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[SYNTHETIC, Splitter:B:23:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1 A[SYNTHETIC, Splitter:B:33:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0143 A[SYNTHETIC, Splitter:B:49:0x0143] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00c2=Splitter:B:28:0x00c2, B:20:0x007c=Splitter:B:20:0x007c} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String[] m26518b(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            com.seattleclouds.App r4 = r8.f18985e     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            r5.append(r9)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.lang.String r6 = "/"
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            r5.append(r9)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.lang.String r6 = ".filenames"
            r5.append(r6)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00c2, IOException -> 0x007b }
            java.lang.String r1 = f18981a     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            java.lang.String r4 = "File list file "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            r3.append(r9)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            java.lang.String r4 = ".filenames found, getting file names from it..."
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            android.util.Log.v(r1, r3)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
        L_0x0056:
            java.lang.String r1 = r2.readLine()     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            if (r1 == 0) goto L_0x0060
            r0.add(r1)     // Catch:{ FileNotFoundException -> 0x0076, IOException -> 0x0071, all -> 0x006d }
            goto L_0x0056
        L_0x0060:
            r2.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0137
        L_0x0065:
            java.lang.String r1 = f18981a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x00ad
        L_0x006d:
            r0 = move-exception
            r1 = r2
            goto L_0x0141
        L_0x0071:
            r1 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x007c
        L_0x0076:
            r1 = r2
            goto L_0x00c2
        L_0x0078:
            r0 = move-exception
            goto L_0x0141
        L_0x007b:
            r2 = move-exception
        L_0x007c:
            java.lang.String r3 = f18981a     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Error reading asset file names from  "
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = ".filenames"
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0078 }
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0137
            r1.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x0137
        L_0x00a6:
            java.lang.String r1 = f18981a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x00ad:
            java.lang.String r3 = "Error closing buffered reader for  "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = ".filenames"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r1, r9)
            goto L_0x0137
        L_0x00c2:
            java.lang.String r2 = f18981a     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r3.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "File list file "
            r3.append(r4)     // Catch:{ all -> 0x0078 }
            r3.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ all -> 0x0078 }
            r3.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = ".filenames not found, using AssetManager.list()"
            r3.append(r4)     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0078 }
            android.util.Log.v(r2, r3)     // Catch:{ all -> 0x0078 }
            com.seattleclouds.App r2 = r8.f18985e     // Catch:{ IOException -> 0x0111 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0111 }
            java.lang.String[] r2 = r2.list(r9)     // Catch:{ IOException -> 0x0111 }
            if (r1 == 0) goto L_0x0110
            r1.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x0110
        L_0x00f5:
            java.lang.String r0 = f18981a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Error closing buffered reader for  "
            r1.append(r3)
            r1.append(r9)
            java.lang.String r9 = ".filenames"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            android.util.Log.e(r0, r9)
        L_0x0110:
            return r2
        L_0x0111:
            r2 = move-exception
            java.lang.String r3 = f18981a     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r4.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "Error listing asset file names in folder "
            r4.append(r5)     // Catch:{ all -> 0x0078 }
            r4.append(r9)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0078 }
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0137
            r1.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x0137
        L_0x012e:
            java.lang.String r1 = f18981a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            goto L_0x00ad
        L_0x0137:
            r9 = 0
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.Object[] r9 = r0.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
            return r9
        L_0x0141:
            if (r1 == 0) goto L_0x0162
            r1.close()     // Catch:{ IOException -> 0x0147 }
            goto L_0x0162
        L_0x0147:
            java.lang.String r1 = f18981a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing buffered reader for  "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r9 = ".filenames"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            android.util.Log.e(r1, r9)
        L_0x0162:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p157b.C5302b.m26518b(java.lang.String):java.lang.String[]");
    }

    /* renamed from: c */
    private boolean m26519c() {
        boolean z = false;
        String[] a = C1166a.m6306a(this.f18984d, App.f18490W[0], App.f18490W[1]);
        if (a.length == 0) {
            return false;
        }
        try {
            int a2 = C6604av.m31953a(a[0], App.m25654h());
            if (a.length > 1) {
                a2 += C6604av.m31953a(a[1], App.m25654h());
            }
            if (a2 > 0) {
                z = true;
            }
            return z;
        } catch (IOException unused) {
            Log.e(f18981a, "Error extracting expansion files");
            return false;
        }
    }

    /* renamed from: d */
    private void m26520d() {
        try {
            if (this.f18986f != null && this.f18986f.isShowing()) {
                this.f18986f.dismiss();
            }
        } catch (IllegalArgumentException e) {
            Log.e(f18981a, "Exception while dismissing dialog", e);
        }
        if (this.f18987g != null) {
            this.f18987g.mo16855a(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        int i;
        try {
            i = this.f18984d.getPackageManager().getPackageInfo(this.f18984d.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w(f18981a, "Couldn't get app version code");
            i = 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f18982b);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("app-version-");
        sb.append(i);
        File file = new File(sb.toString());
        if (!file.exists()) {
            String str = f18981a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("New version (");
            sb2.append(i);
            sb2.append("). Deleting old resources...");
            Log.v(str, sb2.toString());
            C6730b.m32467d(new File(App.m25654h()));
            Log.v(f18981a, "Relocating new resources...");
            boolean c = App.f18481N ? m26519c() : false;
            String[] b = m26517b();
            int[] a = m26516a("Main", b);
            if ((!App.f18481N && (a[0] > 0 || b == null)) || (App.f18481N && c)) {
                File file2 = new File(App.m25654h(), "app.xml");
                try {
                    if (file2.exists()) {
                        C6730b.m32454a(file2, file);
                    } else {
                        C6730b.m32456a(file, (CharSequence) "no config file found");
                    }
                } catch (IOException unused2) {
                }
            }
        } else {
            Log.v(f18981a, "Already initialized resources for this version");
        }
        return "ok";
    }

    /* renamed from: a */
    public void mo17404a(C6608d dVar) {
        this.f18987g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        super.onPostExecute(str);
        m26520d();
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        super.onCancelled();
        m26520d();
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        this.f18986f = new ProgressDialog(this.f18984d);
        this.f18986f.setProgressStyle(0);
        this.f18986f.setMessage(this.f18984d.getString(C5462k.app_state_initializing));
        this.f18986f.setCancelable(false);
        this.f18986f.getWindow().clearFlags(2);
        this.f18986f.show();
        super.onPreExecute();
    }
}
