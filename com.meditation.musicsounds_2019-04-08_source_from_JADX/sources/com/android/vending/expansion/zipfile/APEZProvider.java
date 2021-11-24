package com.android.vending.expansion.zipfile;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.seattleclouds.App;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Locale;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class APEZProvider extends ContentProvider {

    /* renamed from: a */
    public static final String[] f4201a = {"_id", "ZPFN", "ZFIL", "ZMOD", "ZCRC", "ZCOL", "ZUNL", "ZTYP"};

    /* renamed from: b */
    public static final int[] f4202b = {0, 1, 2, 3, 4, 5, 6, 7};

    /* renamed from: c */
    private C1167b f4203c;

    /* renamed from: d */
    private boolean f4204d;

    /* renamed from: a */
    private boolean m6304a() {
        if (this.f4204d) {
            return false;
        }
        this.f4203c = App.f18491X;
        this.f4204d = true;
        return true;
    }

    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) {
        m6304a();
        return super.applyBatch(arrayList);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(uri.toString().toLowerCase(Locale.US));
        return guessContentTypeFromName == null ? "vnd.android.cursor.item/asset" : guessContentTypeFromName;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        m6304a();
        String encodedPath = uri.getEncodedPath();
        if (encodedPath.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
            encodedPath = encodedPath.substring(1);
        }
        return this.f4203c.mo5660a(encodedPath);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        m6304a();
        AssetFileDescriptor openAssetFile = openAssetFile(uri, str);
        if (openAssetFile != null) {
            return openAssetFile.getParcelFileDescriptor();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r5 = java.lang.Long.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r3.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d2, code lost:
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            r7 = this;
            r7.m6304a()
            com.android.vending.expansion.zipfile.b r8 = r7.f4203c
            r10 = 0
            if (r8 != 0) goto L_0x000b
            com.android.vending.expansion.zipfile.b$a[] r8 = new com.android.vending.expansion.zipfile.C1167b.C1168a[r10]
            goto L_0x0011
        L_0x000b:
            com.android.vending.expansion.zipfile.b r8 = r7.f4203c
            com.android.vending.expansion.zipfile.b$a[] r8 = r8.mo5661a()
        L_0x0011:
            if (r9 != 0) goto L_0x001b
            int[] r9 = f4202b
            java.lang.String[] r11 = f4201a
            r12 = r9
            r9 = r11
            goto L_0x0092
        L_0x001b:
            int r11 = r9.length
            int[] r12 = new int[r11]
            r0 = 0
        L_0x001f:
            if (r0 >= r11) goto L_0x0092
            r1 = r9[r0]
            java.lang.String r2 = "_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002e
            r12[r0] = r10
            goto L_0x008f
        L_0x002e:
            r1 = r9[r0]
            java.lang.String r2 = "ZPFN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            r12[r0] = r1
            goto L_0x008f
        L_0x003c:
            r1 = r9[r0]
            java.lang.String r2 = "ZFIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 2
            r12[r0] = r1
            goto L_0x008f
        L_0x004a:
            r1 = r9[r0]
            java.lang.String r2 = "ZMOD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0058
            r1 = 3
            r12[r0] = r1
            goto L_0x008f
        L_0x0058:
            r1 = r9[r0]
            java.lang.String r2 = "ZCRC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0066
            r1 = 4
            r12[r0] = r1
            goto L_0x008f
        L_0x0066:
            r1 = r9[r0]
            java.lang.String r2 = "ZCOL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0074
            r1 = 5
            r12[r0] = r1
            goto L_0x008f
        L_0x0074:
            r1 = r9[r0]
            java.lang.String r2 = "ZUNL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0082
            r1 = 6
            r12[r0] = r1
            goto L_0x008f
        L_0x0082:
            r1 = r9[r0]
            java.lang.String r2 = "ZTYP"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008f
            r1 = 7
            r12[r0] = r1
        L_0x008f:
            int r0 = r0 + 1
            goto L_0x001f
        L_0x0092:
            android.database.MatrixCursor r11 = new android.database.MatrixCursor
            int r0 = r8.length
            r11.<init>(r9, r0)
            int r9 = r12.length
            int r0 = r8.length
            r1 = 0
        L_0x009b:
            if (r1 >= r0) goto L_0x00d8
            r2 = r8[r1]
            android.database.MatrixCursor$RowBuilder r3 = r11.newRow()
            r4 = 0
        L_0x00a4:
            if (r4 >= r9) goto L_0x00d5
            r5 = r12[r4]
            switch(r5) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00b9;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00d2
        L_0x00ac:
            int r5 = r2.f4212e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00cf
        L_0x00b3:
            long r5 = r2.f4216i
            goto L_0x00be
        L_0x00b6:
            long r5 = r2.f4215h
            goto L_0x00be
        L_0x00b9:
            long r5 = r2.f4214g
            goto L_0x00be
        L_0x00bc:
            long r5 = r2.f4213f
        L_0x00be:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x00cf
        L_0x00c3:
            java.lang.String r5 = r2.mo5668d()
            goto L_0x00cf
        L_0x00c8:
            java.lang.String r5 = r2.f4209b
            goto L_0x00cf
        L_0x00cb:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
        L_0x00cf:
            r3.add(r5)
        L_0x00d2:
            int r4 = r4 + 1
            goto L_0x00a4
        L_0x00d5:
            int r1 = r1 + 1
            goto L_0x009b
        L_0x00d8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vending.expansion.zipfile.APEZProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
