package com.bumptech.glide.load.p042a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.a.a */
public final class C1262a extends C1287l<AssetFileDescriptor> {
    public C1262a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AssetFileDescriptor mo5927b(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo5924a() {
        return AssetFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5926a(AssetFileDescriptor assetFileDescriptor) {
        assetFileDescriptor.close();
    }
}
