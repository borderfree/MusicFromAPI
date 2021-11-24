package com.bumptech.glide.load.p042a;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.l */
public abstract class C1287l<T> implements C1272d<T> {

    /* renamed from: a */
    private final Uri f4521a;

    /* renamed from: b */
    private final ContentResolver f4522b;

    /* renamed from: c */
    private T f4523c;

    public C1287l(ContentResolver contentResolver, Uri uri) {
        this.f4522b = contentResolver;
        this.f4521a = uri;
    }

    /* renamed from: a */
    public final void mo5931a(Priority priority, C1273a<? super T> aVar) {
        try {
            this.f4523c = mo5927b(this.f4521a, this.f4522b);
            aVar.mo5946a(this.f4523c);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.mo5945a((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5926a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo5927b(Uri uri, ContentResolver contentResolver);

    /* renamed from: b */
    public void mo5932b() {
        if (this.f4523c != null) {
            try {
                mo5926a(this.f4523c);
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
