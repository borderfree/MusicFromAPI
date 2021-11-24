package com.bumptech.glide.load.p042a;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.m */
public class C1288m extends C1270b<InputStream> {
    public C1288m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<InputStream> mo5924a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5939a(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo5938a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
