package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.C2241s;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.facebook.e */
public class C2188e extends ContentProvider {

    /* renamed from: a */
    private static final String f7103a = "com.facebook.e";

    /* renamed from: a */
    public static String m10078a(String str, UUID uuid, String str2) {
        return String.format("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Pair<UUID, String> mo7749a(Uri uri) {
        try {
            String[] split = uri.getPath().substring(1).split(TableOfContents.DEFAULT_PATH_SEPARATOR);
            String str = split[0];
            String str2 = split[1];
            if (!"..".contentEquals(str) && !"..".contentEquals(str2)) {
                return new Pair<>(UUID.fromString(str), str2);
            }
            throw new Exception();
        } catch (Exception unused) {
            return null;
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Pair a = mo7749a(uri);
        if (a != null) {
            try {
                File a2 = C2241s.m10272a((UUID) a.first, (String) a.second);
                if (a2 != null) {
                    return ParcelFileDescriptor.open(a2, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                String str2 = f7103a;
                StringBuilder sb = new StringBuilder();
                sb.append("Got unexpected exception:");
                sb.append(e);
                Log.e(str2, sb.toString());
                throw e;
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
