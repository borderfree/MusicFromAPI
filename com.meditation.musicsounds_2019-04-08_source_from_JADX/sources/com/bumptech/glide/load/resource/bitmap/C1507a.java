package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import com.bumptech.glide.p040g.C1257i;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
public class C1507a<DataType> implements C1488f<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C1488f<DataType, Bitmap> f4958a;

    /* renamed from: b */
    private final Resources f4959b;

    public C1507a(Resources resources, C1488f<DataType, Bitmap> fVar) {
        this.f4959b = (Resources) C1257i.m6691a(resources);
        this.f4958a = (C1488f) C1257i.m6691a(fVar);
    }

    /* renamed from: a */
    public C1482s<BitmapDrawable> mo6289a(DataType datatype, int i, int i2, C1379e eVar) {
        return C1528o.m7608a(this.f4959b, this.f4958a.mo6289a(datatype, i, i2, eVar));
    }

    /* renamed from: a */
    public boolean mo6290a(DataType datatype, C1379e eVar) {
        return this.f4958a.mo6290a(datatype, eVar);
    }
}
