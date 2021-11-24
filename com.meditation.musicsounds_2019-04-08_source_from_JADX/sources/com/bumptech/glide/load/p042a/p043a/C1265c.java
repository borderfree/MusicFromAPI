package com.bumptech.glide.load.p042a.p043a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import android.util.Log;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p042a.C1279g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.a.c */
public class C1265c implements C1272d<InputStream> {

    /* renamed from: a */
    private final Uri f4484a;

    /* renamed from: b */
    private final C1269e f4485b;

    /* renamed from: c */
    private InputStream f4486c;

    /* renamed from: com.bumptech.glide.load.a.a.c$a */
    static class C1266a implements C1268d {

        /* renamed from: b */
        private static final String[] f4487b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f4488a;

        C1266a(ContentResolver contentResolver) {
            this.f4488a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo5935a(Uri uri) {
            return this.f4488a.query(Thumbnails.EXTERNAL_CONTENT_URI, f4487b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: com.bumptech.glide.load.a.a.c$b */
    static class C1267b implements C1268d {

        /* renamed from: b */
        private static final String[] f4489b = {"_data"};

        /* renamed from: a */
        private final ContentResolver f4490a;

        C1267b(ContentResolver contentResolver) {
            this.f4490a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo5935a(Uri uri) {
            return this.f4490a.query(Video.Thumbnails.EXTERNAL_CONTENT_URI, f4489b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C1265c(Uri uri, C1269e eVar) {
        this.f4484a = uri;
        this.f4485b = eVar;
    }

    /* renamed from: a */
    public static C1265c m6735a(Context context, Uri uri) {
        return m6736a(context, uri, new C1266a(context.getContentResolver()));
    }

    /* renamed from: a */
    private static C1265c m6736a(Context context, Uri uri, C1268d dVar) {
        return new C1265c(uri, new C1269e(C1186c.m6450a(context).mo5746h().mo5682a(), dVar, C1186c.m6450a(context).mo5739b(), context.getContentResolver()));
    }

    /* renamed from: b */
    public static C1265c m6737b(Context context, Uri uri) {
        return m6736a(context, uri, new C1267b(context.getContentResolver()));
    }

    /* renamed from: e */
    private InputStream m6738e() {
        InputStream b = this.f4485b.mo5937b(this.f4484a);
        int a = b != null ? this.f4485b.mo5936a(this.f4484a) : -1;
        return a != -1 ? new C1279g(b, a) : b;
    }

    /* renamed from: a */
    public Class<InputStream> mo5924a() {
        return InputStream.class;
    }

    /* renamed from: a */
    public void mo5931a(Priority priority, C1273a<? super InputStream> aVar) {
        try {
            this.f4486c = m6738e();
            aVar.mo5946a(this.f4486c);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo5945a((Exception) e);
        }
    }

    /* renamed from: b */
    public void mo5932b() {
        if (this.f4486c != null) {
            try {
                this.f4486c.close();
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
