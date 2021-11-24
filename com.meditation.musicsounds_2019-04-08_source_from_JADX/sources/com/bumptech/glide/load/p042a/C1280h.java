package com.bumptech.glide.load.p042a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: com.bumptech.glide.load.a.h */
public class C1280h extends C1270b<ParcelFileDescriptor> {
    public C1280h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo5924a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5939a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ParcelFileDescriptor mo5938a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
