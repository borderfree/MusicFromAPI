package com.seattleclouds.util;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.seattleclouds.App;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class InternalFileContentProvider extends ContentProvider {

    /* renamed from: a */
    private AssetFileDescriptor f23233a;

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public String getType(Uri uri) {
        return "vnd.android.cursor.item/asset";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Not supported by this provider");
    }

    public boolean onCreate() {
        return true;
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        if (this.f23233a != null) {
            try {
                this.f23233a.close();
            } catch (IOException e) {
                Log.e("InternalFileContentProvider", "openAssetFile: error closing file descriptor: ", e);
            }
        }
        this.f23233a = null;
        if (App.f18510l || App.f18474G) {
            StringBuilder sb = new StringBuilder();
            sb.append("providing access to internal file: ");
            sb.append(uri.getPath());
            Log.i("InternalFileContentProvider", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("file://");
            sb2.append(uri.getPath());
            AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(new File(URI.create(sb2.toString())), 268435456), 0, -1);
            this.f23233a = assetFileDescriptor;
        } else if (App.f18481N) {
            this.f23233a = App.f18491X.mo5660a(uri.getPath().substring(1));
            if (this.f23233a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("openAssetFile: File not found in expansion file: ");
                sb3.append(uri.getPath().substring(1));
                Log.e("InternalFileContentProvider", sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("providing access to asset file: ");
            sb4.append(uri.getPath());
            Log.i("InternalFileContentProvider", sb4.toString());
            try {
                this.f23233a = getContext().getAssets().openFd(uri.getPath().substring(1));
            } catch (IOException e2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("openAssetFile: error getting file from asset: ");
                sb5.append(uri.getPath());
                Log.e("InternalFileContentProvider", sb5.toString(), e2);
            }
        }
        return this.f23233a;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        AssetFileDescriptor openAssetFile = openAssetFile(uri, str);
        if (openAssetFile != null) {
            return openAssetFile.getParcelFileDescriptor();
        }
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not supported by this provider");
    }
}
