package com.bumptech.glide.load.p042a;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.b */
public abstract class C1270b<T> implements C1272d<T> {

    /* renamed from: a */
    private final String f4497a;

    /* renamed from: b */
    private final AssetManager f4498b;

    /* renamed from: c */
    private T f4499c;

    public C1270b(AssetManager assetManager, String str) {
        this.f4498b = assetManager;
        this.f4497a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo5938a(AssetManager assetManager, String str);

    /* renamed from: a */
    public void mo5931a(Priority priority, C1273a<? super T> aVar) {
        try {
            this.f4499c = mo5938a(this.f4498b, this.f4497a);
            aVar.mo5946a(this.f4499c);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo5945a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5939a(T t);

    /* renamed from: b */
    public void mo5932b() {
        if (this.f4499c != null) {
            try {
                mo5939a(this.f4499c);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo5933c() {
    }

    /* renamed from: d */
    public DataSource mo5934d() {
        return DataSource.LOCAL;
    }
}
